package oti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f229595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f229597c;
    public final jo3.a d;
    public final jo3.a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.a f229598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.a f229599h;
    public final Integer i;

    public /* synthetic */ a0(int i, jo3.a aVar, jo3.a aVar2, u uVar, jo3.a aVar3, jo3.a aVar4, String str, jo3.a aVar5, jo3.a aVar6, Integer num) {
        if (511 != (i & 511)) {
            qlm.j1.f(y.f229705a.getDescriptor(), i, 511);
            throw null;
        }
        this.f229595a = aVar;
        this.f229596b = aVar2;
        this.f229597c = uVar;
        this.d = aVar3;
        this.e = aVar4;
        this.f = str;
        this.f229598g = aVar5;
        this.f229599h = aVar6;
        this.i = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f229595a, a0Var.f229595a) && Intrinsics.f(this.f229596b, a0Var.f229596b) && Intrinsics.f(this.f229597c, a0Var.f229597c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f229598g, a0Var.f229598g) && Intrinsics.f(this.f229599h, a0Var.f229599h) && Intrinsics.f(this.i, a0Var.i);
    }

    public final int hashCode() {
        int iJ = v7.j(this.f229596b, this.f229595a.hashCode() * 31, 31);
        u uVar = this.f229597c;
        int iHashCode = (iJ + (uVar == null ? 0 : uVar.hashCode())) * 31;
        jo3.a aVar = this.d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar3 = this.f229598g;
        int iHashCode5 = (iHashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.f229599h;
        int iHashCode6 = (iHashCode5 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public a0(jo3.a pricePerPassenger, jo3.a finalPrice, u uVar, jo3.a aVar, jo3.a aVar2, String str, jo3.a aVar3, jo3.a aVar4, Integer num) {
        Intrinsics.checkNotNullParameter(pricePerPassenger, "pricePerPassenger");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f229595a = pricePerPassenger;
        this.f229596b = finalPrice;
        this.f229597c = uVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = str;
        this.f229598g = aVar3;
        this.f229599h = aVar4;
        this.i = num;
    }
}
