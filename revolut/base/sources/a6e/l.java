package a6e;

import bbk.z;
import ble.c1;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6e.k f1635a;

    public l(d6e.k subaccountProductAccountsFlowFactory) {
        Intrinsics.checkNotNullParameter(subaccountProductAccountsFlowFactory, "subaccountProductAccountsFlowFactory");
        this.f1635a = subaccountProductAccountsFlowFactory;
    }

    @Override // pfe.g
    public final Flow a() {
        return new go.g(Boolean.TRUE, 2);
    }

    @Override // pfe.g
    public final boolean b() {
        return true;
    }

    @Override // pfe.g
    public final Flow c(ProductSpaceIdentifier spaceIdentifier, pie.v subSpaceIdentifier, sfe.a dataLoadingMode) {
        Flow flowA;
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        d6e.k kVar = this.f1635a;
        y91.b bVar = kVar.f111519l;
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        if ((spaceIdentifier instanceof ProductSpaceIdentifier.Favourites) || (spaceIdentifier instanceof ProductSpaceIdentifier.Linked) || (spaceIdentifier instanceof ProductSpaceIdentifier.Personal) || (spaceIdentifier instanceof ProductSpaceIdentifier.Restricted)) {
            flowA = kVar.a(spaceIdentifier, dataLoadingMode);
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Joint) {
            flowA = new c1(d6e.k.c(kVar.f111516g.f(spaceIdentifier, dataLoadingMode), new a76.c(0, bVar, y91.b.class, "personalPocketFeatureIsEnabled", "personalPocketFeatureIsEnabled()Z", 0, 4)), 3);
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Youth) {
            flowA = new c1(d6e.k.c(kVar.f111517h.f((ProductSpaceIdentifier.Youth) spaceIdentifier, dataLoadingMode), new d6e.j(0, 0, y91.b.class, bVar, "personalPocketFeatureIsEnabled", "personalPocketFeatureIsEnabled()Z")), 5);
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Teen) {
            flowA = new c1(d6e.k.c(kVar.i.f((ProductSpaceIdentifier.Teen) spaceIdentifier, dataLoadingMode), new d6e.h(0, 0, y91.b.class, bVar, "personalPocketFeatureIsEnabled", "personalPocketFeatureIsEnabled()Z")), 4);
        } else if (spaceIdentifier instanceof ProductSpaceIdentifier.Pro) {
            flowA = kVar.b(spaceIdentifier, dataLoadingMode);
        } else {
            if (!(spaceIdentifier instanceof ProductSpaceIdentifier.TotalWealth) && !(spaceIdentifier instanceof ProductSpaceIdentifier.CreditHub)) {
                throw new NoWhenBranchMatchedException();
            }
            flowA = new go.g(f0.f322471a, 2);
        }
        return nim.a.v(new z(flowA, 26), new d34.b(kVar, 9));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        ProductSpaceIdentifier.Personal personal = ProductSpaceIdentifier.Personal.f89749c;
        d6e.k kVar = this.f1635a;
        return nim.a.v(new z(new ax9.o(yh5.b.d(kVar.a(personal, dataLoadingMode), kVar.b(personal, dataLoadingMode)), 4), 26), new d34.b(kVar, 9));
    }
}
