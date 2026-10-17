package egh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a f125654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f125655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f125656c;

    public l(com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a aVar, aw0.i iVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125654a = aVar;
        this.f125655b = iVar;
        this.f125656c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f125656c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f125654a, lVar.f125654a) && Intrinsics.f(this.f125655b, lVar.f125655b) && Intrinsics.f(this.f125656c, lVar.f125656c);
    }

    public final int hashCode() {
        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a aVar = this.f125654a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        aw0.i iVar = this.f125655b;
        return this.f125656c.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
