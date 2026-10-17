package g6j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f140966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f140967b;

    public h(double d, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f140966a = d;
        this.f140967b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Double.compare(this.f140966a, hVar.f140966a) == 0 && Intrinsics.f(this.f140967b, hVar.f140967b);
    }

    public final int hashCode() {
        return this.f140967b.hashCode() + (Double.hashCode(this.f140966a) * 31);
    }
}
