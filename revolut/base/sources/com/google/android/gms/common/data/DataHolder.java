package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private static final Builder f37977zaf = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    Bundle f37978zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    int[] f37979zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    int f37980zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    boolean f37981zae;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] f37982zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] f37983zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int f37984zai;

    /* JADX INFO: renamed from: zaj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle f37985zaj;
    private boolean zak;

    @KeepForSdk
    public static class Builder {
        private final String[] zaa;

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private final ArrayList f37986zab = new ArrayList();

        /* JADX INFO: renamed from: zac, reason: collision with root package name */
        private final HashMap f37987zac = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap map) {
            Asserts.checkNotNull(map);
            this.f37986zab.add(map);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i, @NonNull Bundle bundle) {
            return new DataHolder(this, i, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i) {
        return new DataHolder(f37977zaf, i, (Bundle) null);
    }

    private final void zae(String str, int i) {
        Bundle bundle = this.f37978zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f37980zad) {
            throw new CursorIndexOutOfBoundsException(i, this.f37980zad);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        if (r5 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0134, code lost:
    
        r0 = "Couldn't populate window data for row " + r4 + " - allocating new window.";
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r13.zaa.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016e, code lost:
    
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder r13, int r14) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.zaf(com.google.android.gms.common.data.DataHolder$Builder, int):android.database.CursorWindow[]");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.f37981zae) {
                    this.f37981zae = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f37983zah;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.f37983zah.length > 0 && !isClosed()) {
                close();
                String str = "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")";
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getLong(i, this.f37978zab.getInt(str)) == 1;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getBlob(i, this.f37978zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.f37980zad;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getInt(i, this.f37978zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getLong(i, this.f37978zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.f37985zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.f37984zai;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getString(i, this.f37978zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.f37980zad);
        while (true) {
            int[] iArr = this.f37979zac;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.f37978zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].isNull(i, this.f37978zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f37981zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        String[] strArr = this.f37982zag;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f37983zah, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getDouble(i, this.f37978zab.getInt(str));
    }

    public final float zab(@NonNull String str, int i, int i2) {
        zae(str, i);
        return this.f37983zah[i2].getFloat(i, this.f37978zab.getInt(str));
    }

    public final void zac(@NonNull String str, int i, int i2, @NonNull CharArrayBuffer charArrayBuffer) {
        zae(str, i);
        this.f37983zah[i2].copyStringToBuffer(i, this.f37978zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.f37978zab = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f37982zag;
            if (i2 >= strArr.length) {
                break;
            }
            this.f37978zab.putInt(strArr[i2], i2);
            i2++;
        }
        this.f37979zac = new int[this.f37983zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f37983zah;
            if (i >= cursorWindowArr.length) {
                this.f37980zad = numRows;
                return;
            }
            this.f37979zac[i] = numRows;
            numRows += this.f37983zah[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f37981zae = false;
        this.zak = true;
        this.zaa = i;
        this.f37982zag = strArr;
        this.f37983zah = cursorWindowArr;
        this.f37984zai = i2;
        this.f37985zaj = bundle;
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.f37981zae = false;
        this.zak = true;
        this.zaa = 1;
        this.f37982zag = (String[]) Preconditions.checkNotNull(strArr);
        this.f37983zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.f37984zai = i;
        this.f37985zaj = bundle;
        zad();
    }

    /* JADX WARN: Finally extract failed */
    public DataHolder(@NonNull Cursor cursor, int i, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count) {
                if (!cursorWrapper.moveToPosition(startPosition)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i, bundle);
        } catch (Throwable th10) {
            cursorWrapper.close();
            throw th10;
        }
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i, (Bundle) null);
    }
}
