package o87;

import cli.j;
import com.revolut.data.model.Data;
import h87.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j87.f f222948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f222949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f222950c;
    public final i d;
    public final Data e;

    public b(j87.f globe, i iVar, i iVar2, i iVar3, Data wealthDisclaimersDomainState) {
        Intrinsics.checkNotNullParameter(globe, "globe");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        this.f222948a = globe;
        this.f222949b = iVar;
        this.f222950c = iVar2;
        this.d = iVar3;
        this.e = wealthDisclaimersDomainState;
    }

    public static b a(b bVar, j87.f fVar, i iVar, i iVar2, i iVar3, Data data, int i) {
        if ((i & 1) != 0) {
            fVar = bVar.f222948a;
        }
        j87.f globe = fVar;
        if ((i & 2) != 0) {
            iVar = bVar.f222949b;
        }
        i iVar4 = iVar;
        if ((i & 4) != 0) {
            iVar2 = bVar.f222950c;
        }
        i iVar5 = iVar2;
        if ((i & 8) != 0) {
            iVar3 = bVar.d;
        }
        i iVar6 = iVar3;
        if ((i & 16) != 0) {
            data = bVar.e;
        }
        Data wealthDisclaimersDomainState = data;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(globe, "globe");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDomainState, "wealthDisclaimersDomainState");
        return new b(globe, iVar4, iVar5, iVar6, wealthDisclaimersDomainState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f222948a, bVar.f222948a) && Intrinsics.f(this.f222949b, bVar.f222949b) && Intrinsics.f(this.f222950c, bVar.f222950c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f222948a.hashCode() * 31;
        i iVar = this.f222949b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        i iVar2 = this.f222950c;
        int iHashCode3 = (iHashCode2 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        i iVar3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (iVar3 != null ? iVar3.hashCode() : 0)) * 31);
    }
}
