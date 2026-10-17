package qfg;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f245326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f245327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f245328c;

    public g(double d, jo3.b fee2, i display) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f245326a = d;
        this.f245327b = fee2;
        this.f245328c = display;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Double.compare(this.f245326a, gVar.f245326a) == 0 && Intrinsics.f(this.f245327b, gVar.f245327b) && Intrinsics.f(this.f245328c, gVar.f245328c);
    }

    public final int hashCode() {
        return this.f245328c.hashCode() + y.e(this.f245327b, Double.hashCode(this.f245326a) * 31, 31);
    }
}
