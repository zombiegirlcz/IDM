package e93;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123884c;
    public final c93.j d;

    public n(List area, String color, String backgroundUrl, c93.j pricing) {
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f123882a = area;
        this.f123883b = color;
        this.f123884c = backgroundUrl;
        this.d = pricing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f123882a, nVar.f123882a) && Intrinsics.f(this.f123883b, nVar.f123883b) && Intrinsics.f(this.f123884c, nVar.f123884c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f123882a.hashCode() * 31, 31, this.f123883b), 31, this.f123884c);
    }
}
