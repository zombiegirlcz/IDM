package q7c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements k6c.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bdc.b f242822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cge.h f242823b;

    public l(bdc.b collapsedPocketRepository, cge.h productAccountsInfoProvider) {
        Intrinsics.checkNotNullParameter(collapsedPocketRepository, "collapsedPocketRepository");
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        this.f242822a = collapsedPocketRepository;
        this.f242823b = productAccountsInfoProvider;
    }

    public final void a(LinkedHashSet pocketGroups) {
        vcc.a aVar;
        Intrinsics.checkNotNullParameter(pocketGroups, "pocketGroups");
        Intrinsics.checkNotNullParameter(pocketGroups, "pocketGroups");
        ArrayList arrayList = new ArrayList(zhm.w.t(pocketGroups, 10));
        Iterator it8 = pocketGroups.iterator();
        while (it8.hasNext()) {
            u6c.s sVar = (u6c.s) it8.next();
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            if (sVar instanceof u6c.q) {
                aVar = new vcc.a(null, null, true, false);
            } else {
                if (!(sVar instanceof com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l lVar = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.l) sVar;
                aVar = new vcc.a(lVar.f84407a.name(), lVar.f84408b.name(), false, lVar.f84409c);
            }
            arrayList.add(aVar);
        }
        this.f242822a.f14544a.G(arrayList, "REVOLUT_PAY_COLLAPSED_POCKET_GROUPS_KEY", bdc.b.f14543b);
    }
}
