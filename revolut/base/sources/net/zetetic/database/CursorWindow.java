package net.zetetic.database;

import net.zetetic.database.sqlcipher.SQLiteClosable;

/* JADX INFO: loaded from: classes14.dex */
public class CursorWindow extends SQLiteClosable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f214668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f214669c;
    public final String d;

    public CursorWindow(String str) {
        this(str, 16384);
    }

    private static native boolean nativeAllocRow(long j2);

    private static native void nativeClear(long j2);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j2);

    private static native void nativeFreeLastRow(long j2);

    private static native byte[] nativeGetBlob(long j2, int i, int i2);

    private static native double nativeGetDouble(long j2, int i, int i2);

    private static native long nativeGetLong(long j2, int i, int i2);

    private static native String nativeGetName(long j2);

    private static native int nativeGetNumRows(long j2);

    private static native String nativeGetString(long j2, int i, int i2);

    private static native int nativeGetType(long j2, int i, int i2);

    private static native boolean nativePutBlob(long j2, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j2, double d, int i, int i2);

    private static native boolean nativePutLong(long j2, long j3, int i, int i2);

    private static native boolean nativePutNull(long j2, int i, int i2);

    private static native boolean nativePutString(long j2, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j2, int i);

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void f() {
        long j2 = this.f214668b;
        if (j2 != 0) {
            nativeDispose(j2);
            this.f214668b = 0L;
        }
    }

    public final void finalize() throws Throwable {
        try {
            long j2 = this.f214668b;
            if (j2 != 0) {
                nativeDispose(j2);
                this.f214668b = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h() {
        this.f214669c = 0;
        nativeClear(this.f214668b);
    }

    public final byte[] i(int i, int i2) {
        return nativeGetBlob(this.f214668b, i - this.f214669c, i2);
    }

    public final double j(int i, int i2) {
        return nativeGetDouble(this.f214668b, i - this.f214669c, i2);
    }

    public final long k(int i, int i2) {
        return nativeGetLong(this.f214668b, i - this.f214669c, i2);
    }

    public final int l() {
        return nativeGetNumRows(this.f214668b);
    }

    public final String m(int i, int i2) {
        return nativeGetString(this.f214668b, i - this.f214669c, i2);
    }

    public final int n(int i, int i2) {
        return nativeGetType(this.f214668b, i - this.f214669c, i2);
    }

    public final String toString() {
        return this.d + " {" + Long.toHexString(this.f214668b) + "}";
    }

    public CursorWindow(String str, int i) {
        this.f214669c = 0;
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.d = str;
        long jNativeCreate = nativeCreate(str, i);
        this.f214668b = jNativeCreate;
        if (jNativeCreate != 0) {
            return;
        }
        throw new CursorWindowAllocationException("Cursor window allocation of " + (i / 1024) + " kb failed. ");
    }
}
