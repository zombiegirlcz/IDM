package ahf;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 implements cli.n {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.h f5077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd9.g f5078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final chf.i f5079c;
    public final jla.h d;
    public final v67.b e;
    public final xgf.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledPaymentsInputData f5080g;

    public e0(a9e.h subscriptionsItemMapper, yd9.g fxOrdersMapper, chf.i scheduledIncomeSorterMapper, jla.h productCatalogueInteractor, v67.b giroFeatureChecker, xgf.b autoTopUpPaymentMapper, ScheduledPaymentsInputData inputData) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(fxOrdersMapper, "fxOrdersMapper");
        Intrinsics.checkNotNullParameter(scheduledIncomeSorterMapper, "scheduledIncomeSorterMapper");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(giroFeatureChecker, "giroFeatureChecker");
        Intrinsics.checkNotNullParameter(autoTopUpPaymentMapper, "autoTopUpPaymentMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f5077a = subscriptionsItemMapper;
        this.f5078b = fxOrdersMapper;
        this.f5079c = scheduledIncomeSorterMapper;
        this.d = productCatalogueInteractor;
        this.e = giroFeatureChecker;
        this.f = autoTopUpPaymentMapper;
        this.f5080g = inputData;
    }

    public static void b(e0 e0Var, aim.e eVar, xi0.b bVar, List list, List list2, Map map, k71.q qVar, String str, List list3, Clause clause, ArrayList arrayList, ArrayList arrayList2, int i) {
        List listM = ((mae.o) e0Var.f5077a).m(list3, new a9e.f(str, bVar, clause, eVar.isEmpty(), list, false, (i & 4096) == 0), list2, (i & 1024) != 0 ? f0.f322471a : arrayList, (i & 2048) != 0 ? f0.f322471a : arrayList2, map, qVar);
        if (listM != null) {
            eVar.addAll(listM);
        }
    }

    public final List a() {
        InputDisclosureDelegate.Model model = new InputDisclosureDelegate.Model("BLOCKED_LIST_ID", (this.d.d("BILLS_AND_TAXES.payto", null) == bla.c.ENABLED || this.e.a()) ? new TextLocalisedClause(R$string.transactions_upcoming_section_actions_blocked_and_cancelled_payments, null, null, 14) : new TextLocalisedClause(R$string.transactions_upcoming_section_actions_blocked_payments, null, null, 14), null, null, null, 1020);
        yp0.b.l(model, R$attr.uikit_dp16, R$attr.uikit_dp48, 0, 0, null, false, 60);
        return zhm.u.c(model);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f5082a, new agh.h(17), new ah1.p(4), new a15.n(domainState, this, 15));
        RecurringPaymentAccount recurringPaymentAccount = this.f5080g.f91971a;
        if ((recurringPaymentAccount instanceof RecurringPaymentAccount.Joint) || (recurringPaymentAccount instanceof RecurringPaymentAccount.Pro) || (recurringPaymentAccount instanceof RecurringPaymentAccount.Personal)) {
            listC = zhm.u.c(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "ACTION_ADD_NEW_ID", new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_action_new, null, null, 14)));
        } else {
            if (!(recurringPaymentAccount instanceof RecurringPaymentAccount.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = f0.f322471a;
        }
        return new n(list, listC);
    }
}
