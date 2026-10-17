package f33;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f131889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c93.j f131890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f131891c;
    public final d93.b d;
    public final d93.d e;
    public final hha.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f131893h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f131894j;

    public j(Address address, c93.j jVar, AccountId accountId, d93.b bVar, d93.d deliveryMethods, hha.d dVar, boolean z, boolean z3, dj0.d totalCost, boolean z4) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
        Intrinsics.checkNotNullParameter(totalCost, "totalCost");
        this.f131889a = address;
        this.f131890b = jVar;
        this.f131891c = accountId;
        this.d = bVar;
        this.e = deliveryMethods;
        this.f = dVar;
        this.f131892g = z;
        this.f131893h = z3;
        this.i = totalCost;
        this.f131894j = z4;
    }

    public static j a(j jVar, d93.b bVar, d93.d dVar, hha.d dVar2, boolean z, boolean z3, dj0.d dVar3, boolean z4, int i) {
        Address address = jVar.f131889a;
        c93.j jVar2 = jVar.f131890b;
        AccountId accountId = jVar.f131891c;
        if ((i & 8) != 0) {
            bVar = jVar.d;
        }
        d93.b bVar2 = bVar;
        if ((i & 16) != 0) {
            dVar = jVar.e;
        }
        d93.d deliveryMethods = dVar;
        if ((i & 32) != 0) {
            dVar2 = jVar.f;
        }
        hha.d dVar4 = dVar2;
        boolean z6 = (i & 64) != 0 ? jVar.f131892g : z;
        boolean z11 = (i & 128) != 0 ? jVar.f131893h : z3;
        dj0.d totalCost = (i & 256) != 0 ? jVar.i : dVar3;
        boolean z12 = (i & 512) != 0 ? jVar.f131894j : z4;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
        Intrinsics.checkNotNullParameter(totalCost, "totalCost");
        return new j(address, jVar2, accountId, bVar2, deliveryMethods, dVar4, z6, z11, totalCost, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f131889a, jVar.f131889a) && Intrinsics.f(this.f131890b, jVar.f131890b) && Intrinsics.f(this.f131891c, jVar.f131891c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f131892g == jVar.f131892g && this.f131893h == jVar.f131893h && Intrinsics.f(this.i, jVar.i) && this.f131894j == jVar.f131894j;
    }

    public final int hashCode() {
        int iHashCode = this.f131889a.hashCode() * 31;
        c93.j jVar = this.f131890b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        AccountId accountId = this.f131891c;
        int iHashCode3 = (iHashCode2 + (accountId == null ? 0 : accountId.hashCode())) * 31;
        d93.b bVar = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        hha.d dVar = this.f;
        return Boolean.hashCode(this.f131894j) + v7.c(j6.a.c(j6.a.c((iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f131892g), 31, this.f131893h), 31, this.i);
    }
}
