package yp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f315749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f315750b;

    public /* synthetic */ o(n nVar) {
        this(nVar, 0);
    }

    @Override // yp0.q
    public final n a() {
        return this.f315749a;
    }

    @Override // yp0.q
    public final int b() {
        return this.f315750b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f315749a == oVar.f315749a && this.f315750b == oVar.f315750b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f315750b) + (this.f315749a.hashCode() * 31);
    }

    public o(n imageScale, int i) {
        Intrinsics.checkNotNullParameter(imageScale, "imageScale");
        this.f315749a = imageScale;
        this.f315750b = i;
    }
}
