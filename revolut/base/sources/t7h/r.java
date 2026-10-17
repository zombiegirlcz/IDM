package t7h;

import ip0.v7;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new t73.h(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f268711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f268712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f268713c;
    public final i d;
    public final f e;

    public /* synthetic */ r(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, i iVar, f fVar) {
        if (15 != (i & 15)) {
            j1.f(p.f268710a.getDescriptor(), i, 15);
            throw null;
        }
        this.f268711a = aVar;
        this.f268712b = aVar2;
        this.f268713c = aVar3;
        this.d = iVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f268711a, rVar.f268711a) && Intrinsics.f(this.f268712b, rVar.f268712b) && Intrinsics.f(this.f268713c, rVar.f268713c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e;
    }

    public final int hashCode() {
        int iJ = v7.j(this.f268713c, v7.j(this.f268712b, this.f268711a.hashCode() * 31, 31), 31);
        i iVar = this.d;
        int iHashCode = (iJ + (iVar == null ? 0 : iVar.hashCode())) * 31;
        f fVar = this.e;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public r(jo3.a buyingPower, jo3.a borrowingLimit, jo3.a equity, i iVar, f fVar) {
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        Intrinsics.checkNotNullParameter(borrowingLimit, "borrowingLimit");
        Intrinsics.checkNotNullParameter(equity, "equity");
        this.f268711a = buyingPower;
        this.f268712b = borrowingLimit;
        this.f268713c = equity;
        this.d = iVar;
        this.e = fVar;
    }
}
