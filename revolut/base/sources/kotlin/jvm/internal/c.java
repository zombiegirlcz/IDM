package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends zhm.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f186412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f186413b;

    public c(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f186412a = array;
    }

    @Override // zhm.i0
    public final float a() {
        try {
            float[] fArr = this.f186412a;
            int i = this.f186413b;
            this.f186413b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f186413b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f186413b < this.f186412a.length;
    }
}
