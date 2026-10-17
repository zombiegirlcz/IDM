package fyh;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myh.j f139000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f139001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eyh.a f139002c;

    public d(myh.j selectedTab, dj0.d amount, eyh.a tpslDomainStateData) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(tpslDomainStateData, "tpslDomainStateData");
        this.f139000a = selectedTab;
        this.f139001b = amount;
        this.f139002c = tpslDomainStateData;
    }

    public static d a(d dVar, myh.j selectedTab, eyh.a tpslDomainStateData, int i) {
        if ((i & 1) != 0) {
            selectedTab = dVar.f139000a;
        }
        dj0.d amount = dVar.f139001b;
        if ((i & 4) != 0) {
            tpslDomainStateData = dVar.f139002c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(tpslDomainStateData, "tpslDomainStateData");
        return new d(selectedTab, amount, tpslDomainStateData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f139000a == dVar.f139000a && Intrinsics.f(this.f139001b, dVar.f139001b) && Intrinsics.f(this.f139002c, dVar.f139002c);
    }

    public final int hashCode() {
        return this.f139002c.hashCode() + v7.c(this.f139000a.hashCode() * 31, 31, this.f139001b);
    }
}
