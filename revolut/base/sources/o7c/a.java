package o7c;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$DeferredPayment;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ne0.o;
import rfm.f0;
import tof.q6;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements z5c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f222747a;

    public a(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f222747a = navigator;
    }

    public static CompositeCommand b(jf0.c cVar) {
        String strE = cVar.e(2);
        FeatureCommand featureCommandF = u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, rhf.h.UPCOMING, rhf.g.HOME, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65151)));
        FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)));
        return com.revolut.retail.core.navigation.a.c(com.revolut.retail.core.navigation.a.c(featureCommand, featureCommandF), new FeatureCommand(new RevolutPayFeatureConfig$DeferredPayment(strE)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "revpay-upcoming-transaction") && !d0.W(cVar.e(2));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(b(cVar)), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c cVar, boolean z) {
        if (!y.D(cVar, "deeplink", 1, "revpay-upcoming-transaction") || d0.W(cVar.e(2))) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        f0 f0VarF = new pfm.h(new o(this, cVar, 13), 2).f(efm.d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}
