package q6c;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f242554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f242555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f242556c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f242557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f242558h;

    public o(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d subtotal, dj0.d orderTotal, dj0.d dVar4, dj0.d dVar5, dj0.d totalCharge) {
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(orderTotal, "orderTotal");
        Intrinsics.checkNotNullParameter(totalCharge, "totalCharge");
        this.f242554a = dVar;
        this.f242555b = dVar2;
        this.f242556c = dVar3;
        this.d = subtotal;
        this.e = orderTotal;
        this.f = dVar4;
        this.f242557g = dVar5;
        this.f242558h = totalCharge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f242554a, oVar.f242554a) && Intrinsics.f(this.f242555b, oVar.f242555b) && Intrinsics.f(this.f242556c, oVar.f242556c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f242557g, oVar.f242557g) && Intrinsics.f(this.f242558h, oVar.f242558h);
    }

    public final int hashCode() {
        dj0.d dVar = this.f242554a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f242555b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f242556c;
        int iC = v7.c(v7.c((iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31, 31, this.d), 31, this.e);
        dj0.d dVar4 = this.f;
        int iHashCode3 = (iC + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.f242557g;
        return this.f242558h.hashCode() + ((iHashCode3 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31);
    }
}
