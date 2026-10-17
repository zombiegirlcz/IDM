package sx2;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.l0 f266280a;

    public d0(h93.l0 l0Var) {
        this.f266280a = l0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && this.f266280a == ((d0) obj2).f266280a;
    }

    public final int hashCode() {
        h93.l0 l0Var = this.f266280a;
        if (l0Var == null) {
            return 0;
        }
        return l0Var.hashCode();
    }
}
