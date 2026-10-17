package yp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f315746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f315747b;

    public l(n imageScale, int i) {
        int i2 = (i & 1) != 0 ? -1 : 0;
        Intrinsics.checkNotNullParameter(imageScale, "imageScale");
        this.f315746a = i2;
        this.f315747b = imageScale;
    }

    @Override // yp0.q
    public final n a() {
        return this.f315747b;
    }

    @Override // yp0.q
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f315746a == lVar.f315746a && this.f315747b == lVar.f315747b;
    }

    public final int hashCode() {
        return this.f315747b.hashCode() + j6.a.b(0, Integer.hashCode(this.f315746a) * 31, 31);
    }
}
