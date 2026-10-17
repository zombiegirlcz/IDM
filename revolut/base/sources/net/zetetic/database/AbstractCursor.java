package net.zetetic.database;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractCursor implements Cursor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f214662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentResolver f214663c;
    public Uri d;
    public SelfContentObserver f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f214664g;
    public final Object e = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DataSetObservable f214665h = new DataSetObservable();
    public final ContentObservable i = new ContentObservable();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bundle f214666j = Bundle.EMPTY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f214661a = -1;

    public static class SelfContentObserver extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f214667a;

        public SelfContentObserver(AbstractCursor abstractCursor) {
            super(null);
            this.f214667a = new WeakReference(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            AbstractCursor abstractCursor = (AbstractCursor) this.f214667a.get();
            if (abstractCursor != null) {
                synchronized (abstractCursor.e) {
                    abstractCursor.i.dispatchChange(false, null);
                }
            }
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f214662b = true;
        this.i.unregisterAll();
        d();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    public void d() {
        SelfContentObserver selfContentObserver = this.f;
        if (selfContentObserver != null) {
            this.f214663c.unregisterContentObserver(selfContentObserver);
            this.f214664g = false;
        }
        this.f214665h.notifyInvalidated();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        d();
    }

    public abstract void f(int i);

    public void finalize() {
        SelfContentObserver selfContentObserver = this.f;
        if (selfContentObserver != null && this.f214664g) {
            this.f214663c.unregisterContentObserver(selfContentObserver);
        }
        try {
            if (this.f214662b) {
                return;
            }
            close();
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            Logger.a("Cursor", "requesting column name with table name -- ".concat(str), new Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException(a.p("column '", str, "' does not exist"));
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return getColumnNames()[i];
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.f214666j;
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        Uri uri2;
        synchronized (this.e) {
            uri2 = this.d;
        }
        return uri2;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f214661a;
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.f214661a == getCount();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.f214661a == -1;
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.f214662b;
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f214661a == 0 && getCount() != 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.f214661a == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.f214661a + i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.f214661a + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.f214661a = count;
            return false;
        }
        if (i < 0) {
            this.f214661a = -1;
            return false;
        }
        if (i == this.f214661a) {
            return true;
        }
        f(i);
        this.f214661a = i;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.f214661a - 1);
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.i.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f214665h.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        SelfContentObserver selfContentObserver = this.f;
        if (selfContentObserver != null && !this.f214664g) {
            this.f214663c.registerContentObserver(this.d, true, selfContentObserver);
            this.f214664g = true;
        }
        this.f214665h.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f214666j = bundle;
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri2) {
        synchronized (this.e) {
            try {
                this.d = uri2;
                this.f214663c = contentResolver;
                SelfContentObserver selfContentObserver = this.f;
                if (selfContentObserver != null) {
                    contentResolver.unregisterContentObserver(selfContentObserver);
                }
                SelfContentObserver selfContentObserver2 = new SelfContentObserver(this);
                this.f = selfContentObserver2;
                this.f214663c.registerContentObserver(this.d, true, selfContentObserver2);
                this.f214664g = true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        if (this.f214662b) {
            return;
        }
        this.i.unregisterObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f214665h.unregisterObserver(dataSetObserver);
    }
}
