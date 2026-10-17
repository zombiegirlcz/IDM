package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f154892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f154893b;

    public h0(c cVar, j0 initialOfferLayout) {
        Intrinsics.checkNotNullParameter(initialOfferLayout, "initialOfferLayout");
        this.f154892a = cVar;
        this.f154893b = initialOfferLayout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f154892a, h0Var.f154892a) && this.f154893b == h0Var.f154893b;
    }

    public final int hashCode() {
        c cVar = this.f154892a;
        return this.f154893b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
