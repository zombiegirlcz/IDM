package vli;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import tof.q6;
import v3e.t;
import wp5.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f290472a;

    public l(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f290472a = navigator;
    }

    public static TransactionListDestination b() {
        return new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, rhf.h.UPCOMING, rhf.g.HOME, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65151));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "price-actions");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(b(), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        FeatureCommand featureCommandF = u0.f(b());
        if (z && deeplink.l()) {
            featureCommandF = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, featureCommandF, 2)));
        }
        z zVarD = new pfm.h(new t(this, featureCommandF, 11), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return ue0.e.I(zVarD, h0.f322473a, new vjk.b(17));
    }
}
