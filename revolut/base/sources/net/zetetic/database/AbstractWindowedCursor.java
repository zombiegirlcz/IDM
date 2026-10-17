package net.zetetic.database;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.StaleDataException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractWindowedCursor extends AbstractCursor {
    public CursorWindow k;

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        CursorWindow cursorWindow = this.k;
        int i2 = this.f214661a;
        if (charArrayBuffer == null) {
            cursorWindow.getClass();
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
        char[] charArray = cursorWindow.m(i2, i).toCharArray();
        charArrayBuffer.data = charArray;
        charArrayBuffer.sizeCopied = charArray.length;
    }

    @Override // net.zetetic.database.AbstractCursor
    public final void d() {
        super.d();
        CursorWindow cursorWindow = this.k;
        if (cursorWindow != null) {
            cursorWindow.g();
            this.k = null;
        }
    }

    public final void g() {
        if (-1 == this.f214661a || getCount() == this.f214661a) {
            throw new CursorIndexOutOfBoundsException(this.f214661a, getCount());
        }
        if (this.k == null) {
            throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
        }
    }

    @Override // net.zetetic.database.AbstractCursor, android.database.Cursor
    public final byte[] getBlob(int i) {
        g();
        return this.k.i(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        g();
        return this.k.j(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        g();
        return (float) this.k.j(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        g();
        return (int) this.k.k(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        g();
        return this.k.k(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        g();
        return (short) this.k.k(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        g();
        return this.k.m(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.k.n(this.f214661a, i);
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.k.n(this.f214661a, i) == 0;
    }
}
