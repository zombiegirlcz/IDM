package t7h;

import ip0.v7;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] f = {yhm.j.c(yhm.k.PUBLICATION, new t73.h(11)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f268701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f268702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f268703c;
    public final jo3.a d;
    public final jo3.a e;

    public /* synthetic */ i(int i, k kVar, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4) {
        if (6 != (i & 6)) {
            j1.f(g.f268700a.getDescriptor(), i, 6);
            throw null;
        }
        this.f268701a = (i & 1) == 0 ? k.UNKNOWN : kVar;
        this.f268702b = aVar;
        this.f268703c = aVar2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = aVar4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f268701a == iVar.f268701a && Intrinsics.f(this.f268702b, iVar.f268702b) && Intrinsics.f(this.f268703c, iVar.f268703c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iJ = v7.j(this.f268703c, v7.j(this.f268702b, this.f268701a.hashCode() * 31, 31), 31);
        jo3.a aVar = this.d;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.e;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public i(k status, jo3.a borrowedFunds, jo3.a requiredMinimum, jo3.a aVar, jo3.a aVar2) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(borrowedFunds, "borrowedFunds");
        Intrinsics.checkNotNullParameter(requiredMinimum, "requiredMinimum");
        this.f268701a = status;
        this.f268702b = borrowedFunds;
        this.f268703c = requiredMinimum;
        this.d = aVar;
        this.e = aVar2;
    }
}
