package s7g;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f260697j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f260698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7g.l f260699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z7g.f f260700c;
    public final jo3.a d;
    public final jo3.a e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f260701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z7g.o f260702h;
    public final z7g.d0 i;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f260697j = new Lazy[]{null, null, null, null, null, yhm.j.c(kVar, new s77.x(13)), yhm.j.c(kVar, new s77.x(14)), null, null};
    }

    public /* synthetic */ d1(int i, jo3.a aVar, z7g.l lVar, z7g.f fVar, jo3.a aVar2, jo3.a aVar3, List list, List list2, z7g.o oVar, z7g.d0 d0Var) {
        if (55 != (i & 55)) {
            qlm.j1.f(b1.f260686a.getDescriptor(), i, 55);
            throw null;
        }
        this.f260698a = aVar;
        this.f260699b = lVar;
        this.f260700c = fVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar2;
        }
        this.e = aVar3;
        this.f = list;
        if ((i & 64) == 0) {
            this.f260701g = null;
        } else {
            this.f260701g = list2;
        }
        if ((i & 128) == 0) {
            this.f260702h = null;
        } else {
            this.f260702h = oVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f260698a, d1Var.f260698a) && Intrinsics.f(this.f260699b, d1Var.f260699b) && Intrinsics.f(this.f260700c, d1Var.f260700c) && Intrinsics.f(this.d, d1Var.d) && Intrinsics.f(this.e, d1Var.e) && Intrinsics.f(this.f, d1Var.f) && Intrinsics.f(this.f260701g, d1Var.f260701g) && Intrinsics.f(this.f260702h, d1Var.f260702h) && Intrinsics.f(this.i, d1Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f260700c.hashCode() + ((this.f260699b.hashCode() + (this.f260698a.hashCode() * 31)) * 31)) * 31;
        jo3.a aVar = this.d;
        int iD = p.a.d(v7.j(this.e, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f);
        List list = this.f260701g;
        int iHashCode2 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        z7g.o oVar = this.f260702h;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        z7g.d0 d0Var = this.i;
        return iHashCode3 + (d0Var != null ? d0Var.hashCode() : 0);
    }
}
