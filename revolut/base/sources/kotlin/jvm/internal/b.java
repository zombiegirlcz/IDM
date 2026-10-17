package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends zhm.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f186410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f186411b;

    public b(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f186410a = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f186411b < this.f186410a.length;
    }

    @Override // zhm.r
    public final byte nextByte() {
        try {
            byte[] bArr = this.f186410a;
            int i = this.f186411b;
            this.f186411b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f186411b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
