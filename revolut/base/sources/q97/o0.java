package q97;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.giro.api.navigation.GiroDestination;
import com.revolut.feature.masav.api.navigation.MasavDirectDebitsDestination;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v67.b f243754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t59.a f243755b;

    public o0(t97.c productCellProvider, v67.b giroFeatureChecker, t59.a masavFeatureChecker) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(giroFeatureChecker, "giroFeatureChecker");
        Intrinsics.checkNotNullParameter(masavFeatureChecker, "masavFeatureChecker");
        this.f243754a = giroFeatureChecker;
        this.f243755b = masavFeatureChecker;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        t97.d[] elements = {t97.d.DIRECT_DEBITS, t97.d.GIRO_DIRECT_DEBITS, t97.d.MASAV_DIRECT_DEBITS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.T(kotlin.collections.d.y0(elements), id10);
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarFromCallable = efm.r.fromCallable(new nc0.a(this, 18));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Object dVar;
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.DIRECT_DEBITS) {
            dVar = new o97.l(zh9.u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, rhf.h.UPCOMING, rhf.g.SEARCH, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65151))));
        } else if (bVar == t97.d.GIRO_DIRECT_DEBITS) {
            dVar = new o97.d(GiroDestination.f74531a);
        } else {
            if (bVar != t97.d.MASAV_DIRECT_DEBITS) {
                throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
            }
            dVar = new o97.d(MasavDirectDebitsDestination.f78091a);
        }
        ufm.b bVarM = efm.d0.m(dVar);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
