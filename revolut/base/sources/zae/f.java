package zae;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.splitbill.api.navigation.RecurringPaymentSplitManageNavigation$Destination;
import com.revolut.feature.payments.splitbill.api.navigation.RecurringPaymentSplitNavigation$Destination;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import com.revolut.feature.pix.api.model.PixQrCodeReferences;
import com.revolut.feature.pix.api.navigation.PixCommonModal;
import com.revolut.feature.pix.api.navigation.PixModalNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixModalNavigation$InputData;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.subscriptions.api.block_future_payments.BlockFuturePaymentsFlowDestination;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelFeatureConfig;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature_move_money.api.navigation.MoveMoneyBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import dce.k0;
import dej.c4;
import efm.d0;
import ip0.dg;
import ip0.f6;
import ip0.t5;
import ip0.tm0;
import ip0.um0;
import ip0.x10;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.LocalDate;
import ozc.z;
import qc0.r0;
import qce.l0;
import qce.m0;
import qce.n0;
import qce.o0;
import rp0.t;
import rp0.y;
import te0.w;
import tof.a3;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f320662b;

    public /* synthetic */ f(o oVar, int i) {
        this.f320661a = i;
        this.f320662b = oVar;
    }

    private final Object a(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "ID_NEXT_PAYMENT")) {
            o0 o0Var = (o0) this.f320662b.f320672j;
            opi.d dVar = o0Var.f244749q;
            qce.i iVar = o0Var.f244750r;
            qua.p subscription = ((sce.f) o0Var.f244743h).f();
            qce.f fVar = (qce.f) iVar;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            LocalDate localDate = subscription.f249314a.f;
            Pair pair = localDate != null ? new Pair(new TextLocalisedClause(R$string.recurring_payment_next_payment_info_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_next_payment_info_text, v.k(mae.h.b(subscription, fVar.f244729a, fVar.f244730b), new TimeClause(jli.b.b(localDate), new TimeClause.Format.DayAndMonth(0), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8)) : new Pair(new TextLocalisedClause(R$string.recurring_payment_details_estimated_next_payment, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_next_payment_unknown_info, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
            t tVar = new t((TextLocalisedClause) pair.f186385a, (TextLocalisedClause) pair.f186386b, null, 28);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            int i = R$attr.uikit_dp16;
            ((opi.b) dVar).Z(new y(u.c(new LargeActionButtonDelegate.Model("BUTTON_UNDERSTOOD_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, R$attr.uikit_dp0, R$attr.uikit_dp24, i, i, 496)), tVar, null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836));
        }
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "ID_SPLIT_WITH_SUBHEADER")) {
            o oVar = this.f320662b;
            qua.p pVar = (qua.p) w.O(((sce.g) ((bce.g) oVar.i).f14440b).w0());
            if (pVar != null) {
                oVar.k.c(u0.f(new RecurringPaymentSplitManageNavigation$Destination(pVar)));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Manage Split; Subscription is not found");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zae.f.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object d(Object obj2) {
        x10 clickData = (x10) obj2;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f167082b.f58316a;
        int iHashCode = str.hashCode();
        final o oVar = this.f320662b;
        switch (iHashCode) {
            case -686142071:
                if (str.equals("ID_UNBLOCK_NZ_DIRECT_DEBIT_WIDGET")) {
                    final int i = 1;
                    pfm.h hVar = new pfm.h(new kfm.a() { // from class: zae.g
                        @Override // kfm.a
                        public final void run() {
                            switch (i) {
                                case 0:
                                    o0 o0Var = (o0) oVar.f320672j;
                                    qce.i iVar = o0Var.f244750r;
                                    qua.p subscription = ((sce.f) o0Var.f244743h).f();
                                    qce.f fVar = (qce.f) iVar;
                                    fVar.getClass();
                                    Intrinsics.checkNotNullParameter(subscription, "subscription");
                                    efm.b bVarFlatMapCompletable = o70.a.f(fVar.f244731c.c(subscription, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY")).flatMapCompletable(new qc7.d(21, new qce.q(o0Var, 13)));
                                    Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                                    Function1 function1K = o0Var.K();
                                    o9h.d dVar = new o9h.d(12, new m0(new BreadcrumbException(), 1));
                                    bVarFlatMapCompletable.getClass();
                                    pfm.a aVar = new pfm.a(bVarFlatMapCompletable, dVar, 2);
                                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                                    ofm.h hVarW = aVar.w(new nw8.d(7, function1K), new z(18, n0.f244742a));
                                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                    w.j0(o0Var.f239031a, hVarW);
                                    o0Var.C = hVarW;
                                    break;
                                case 1:
                                    o0 o0Var2 = (o0) oVar.f320672j;
                                    opi.d dVar2 = o0Var2.f244749q;
                                    opi.b bVar = (opi.b) dVar2;
                                    bVar.Z(((qce.f) o0Var2.f244750r).f(((sce.f) o0Var2.f244743h).f(), false));
                                    break;
                                default:
                                    ((o0) oVar.f320672j).N();
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                break;
            case 105355698:
                if (str.equals("LIST_ID_UNBLOCK_WIDGET")) {
                    pfm.h hVar2 = new pfm.h(new xza.a(oVar, clickData, 14), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    return hVar2;
                }
                break;
            case 337388343:
                if (str.equals("ID_UNBLOCK_SUBSCRIPTION_WIDGET")) {
                    final int i2 = 0;
                    pfm.h hVar3 = new pfm.h(new kfm.a() { // from class: zae.g
                        @Override // kfm.a
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    o0 o0Var = (o0) oVar.f320672j;
                                    qce.i iVar = o0Var.f244750r;
                                    qua.p subscription = ((sce.f) o0Var.f244743h).f();
                                    qce.f fVar = (qce.f) iVar;
                                    fVar.getClass();
                                    Intrinsics.checkNotNullParameter(subscription, "subscription");
                                    efm.b bVarFlatMapCompletable = o70.a.f(fVar.f244731c.c(subscription, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY")).flatMapCompletable(new qc7.d(21, new qce.q(o0Var, 13)));
                                    Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                                    Function1 function1K = o0Var.K();
                                    o9h.d dVar = new o9h.d(12, new m0(new BreadcrumbException(), 1));
                                    bVarFlatMapCompletable.getClass();
                                    pfm.a aVar = new pfm.a(bVarFlatMapCompletable, dVar, 2);
                                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                                    ofm.h hVarW = aVar.w(new nw8.d(7, function1K), new z(18, n0.f244742a));
                                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                    w.j0(o0Var.f239031a, hVarW);
                                    o0Var.C = hVarW;
                                    break;
                                case 1:
                                    o0 o0Var2 = (o0) oVar.f320672j;
                                    opi.d dVar2 = o0Var2.f244749q;
                                    opi.b bVar = (opi.b) dVar2;
                                    bVar.Z(((qce.f) o0Var2.f244750r).f(((sce.f) o0Var2.f244743h).f(), false));
                                    break;
                                default:
                                    ((o0) oVar.f320672j).N();
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                    return hVar3;
                }
                break;
            case 1477675998:
                if (str.equals("ID_ACTIVATE_ACTION")) {
                    final int i3 = 2;
                    pfm.h hVar4 = new pfm.h(new kfm.a() { // from class: zae.g
                        @Override // kfm.a
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    o0 o0Var = (o0) oVar.f320672j;
                                    qce.i iVar = o0Var.f244750r;
                                    qua.p subscription = ((sce.f) o0Var.f244743h).f();
                                    qce.f fVar = (qce.f) iVar;
                                    fVar.getClass();
                                    Intrinsics.checkNotNullParameter(subscription, "subscription");
                                    efm.b bVarFlatMapCompletable = o70.a.f(fVar.f244731c.c(subscription, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY")).flatMapCompletable(new qc7.d(21, new qce.q(o0Var, 13)));
                                    Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                                    Function1 function1K = o0Var.K();
                                    o9h.d dVar = new o9h.d(12, new m0(new BreadcrumbException(), 1));
                                    bVarFlatMapCompletable.getClass();
                                    pfm.a aVar = new pfm.a(bVarFlatMapCompletable, dVar, 2);
                                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                                    ofm.h hVarW = aVar.w(new nw8.d(7, function1K), new z(18, n0.f244742a));
                                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                                    w.j0(o0Var.f239031a, hVarW);
                                    o0Var.C = hVarW;
                                    break;
                                case 1:
                                    o0 o0Var2 = (o0) oVar.f320672j;
                                    opi.d dVar2 = o0Var2.f244749q;
                                    opi.b bVar = (opi.b) dVar2;
                                    bVar.Z(((qce.f) o0Var2.f244750r).f(((sce.f) o0Var2.f244743h).f(), false));
                                    break;
                                default:
                                    ((o0) oVar.f320672j).N();
                                    break;
                            }
                        }
                    }, 2);
                    Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                    return hVar4;
                }
                break;
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    private final Object e(Object obj2) {
        hce.c content = (hce.c) obj2;
        Intrinsics.checkNotNullParameter(content, "content");
        ufm.b bVarJ = w.j(content);
        o oVar = this.f320662b;
        sfm.b bVar = new sfm.b(new ufm.i(bVarJ, new zab.b(20, new zab.s(1, oVar, o.class, "getContentProvider", "getContentProvider(Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionDetailsScreenContent;)Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/content_provider/SubscriptionContentItemsProvider;", 0, 5)), 1), new zab.b(21, new k0(content, 5)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        ufm.b bVarM = d0.m(content);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        efm.r map = new sfm.b(new ufm.i(bVarM, new zab.b(22, new zab.s(1, oVar, o.class, "getContentProvider", "getContentProvider(Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/models/SubscriptionDetailsScreenContent;)Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/content_provider/SubscriptionContentItemsProvider;", 0, 6)), 1), new zab.b(23, new k0(content, 6)), 2).map(new zab.b(24, new z8h.b(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return w.l(bVar, map);
    }

    private final Object g(Object obj2) {
        ty0.a it8 = (ty0.a) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return lg0.b.s1(this.f320662b.o, it8.f275445a, null, null, 6);
    }

    private final Object h(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51871a, "ID_EDITABLE_COMMENT")) {
            Object obj3 = model.f51877l;
            qua.p pVar = obj3 instanceof qua.p ? (qua.p) obj3 : null;
            if (pVar != null) {
                this.f320662b.k.c(new FeatureCommand(new SubscriptionLabelFeatureConfig(pVar)));
            }
        }
        return Unit.f186387a;
    }

    private final Object i(Object obj2) {
        String str;
        t5 model = (t5) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f166447a, "ID_TRANSACTION_IDENTIFIER")) {
            Object obj3 = model.e;
            PixQrCodeReferences pixQrCodeReferences = obj3 instanceof PixQrCodeReferences ? (PixQrCodeReferences) obj3 : null;
            if (pixQrCodeReferences != null && (str = pixQrCodeReferences.f80471a) != null) {
                this.f320662b.f320676p.c(null, str, false, new z8k.i(28));
            }
        }
        return Unit.f186387a;
    }

    private final Object j(Object obj2) {
        sri.m mVar = this.f320662b.k;
        f6 model = (f6) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f164196a;
        Object obj3 = model.f;
        if (str.equals("ID_CREDITOR_NAME")) {
            Address address = obj3 instanceof Address ? (Address) obj3 : null;
            if (address != null) {
                mVar.c(gc0.c.f(new KompotOverlayFeatureConfig(new PixModalNavigation$Destination(new PixModalNavigation$InputData(new PixCommonModal.ShowAddress(address))), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
            }
        } else if (str.equals("ID_ADDITIONAL_INFORMATION")) {
            List list = obj3 instanceof List ? (List) obj3 : null;
            if (list != null) {
                mVar.c(gc0.c.f(new KompotOverlayFeatureConfig(new PixModalNavigation$Destination(new PixModalNavigation$InputData(new PixCommonModal.ShowAdditionalInformation(list))), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
            }
        }
        return Unit.f186387a;
    }

    private final Object k(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51781a, "ID_PAYMENT_SOURCE")) {
            ((o0) this.f320662b.f320672j).Q();
        }
        return Unit.f186387a;
    }

    private final Object l(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "ID_PAYMENT_SOURCE")) {
            ((o0) this.f320662b.f320672j).Q();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List, rp0.x] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object payload) {
        ?? r56;
        int i;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        y yVarC;
        Action editScheduledPayment;
        Set set;
        String str;
        Map map;
        rfm.m mVar;
        TextLocalisedClause textLocalisedClause3;
        JuniorBankingProfile juniorBankingProfile;
        int i2 = this.f320661a;
        o oVar = this.f320662b;
        switch (i2) {
            case 0:
                dg it8 = (dg) payload;
                Intrinsics.checkNotNullParameter(it8, "it");
                return oVar.R();
            case 1:
                Unit it9 = (Unit) payload;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, oVar.k);
                return Unit.f186387a;
            case 2:
                LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) payload;
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f52613a, "ID_ALL_TRANSACTIONS")) {
                    o0 o0Var = (o0) oVar.f320672j;
                    o0Var.f244746m.c(((rae.d) o0Var.f244747n).k(((sce.f) o0Var.f244743h).f(), o0Var.o, o0Var.f244748p, oVar.f320675n.f89241c));
                }
                return Unit.f186387a;
            case 3:
                ip0.y clickData = (ip0.y) payload;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ActionsView.Item item = clickData.f167226b;
                bce.a aVar = oVar.i;
                sri.m mVar2 = oVar.k;
                qce.j jVar = oVar.f320672j;
                String str2 = item.f58316a;
                switch (str2.hashCode()) {
                    case -1862746249:
                        if (str2.equals("ID_CANCEL_ACTION")) {
                            o0 o0Var2 = (o0) jVar;
                            ((opi.b) o0Var2.f244749q).Z(((qce.f) o0Var2.f244750r).d(((sce.f) o0Var2.f244743h).f()));
                        }
                        break;
                    case -1725601437:
                        if (str2.equals("ID_PAUSE_ACTION")) {
                            o0 o0Var3 = (o0) jVar;
                            pfm.a aVarB = ((sce.f) o0Var3.f244743h).b();
                            Function1 function1K = o0Var3.K();
                            pfm.a aVar2 = new pfm.a(aVarB, new o9h.d(12, new m0(new BreadcrumbException(), 0)), 2);
                            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                            ofm.h hVarW = aVar2.w(new nw8.d(7, function1K), new z(18, l0.f244737a));
                            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                            w.j0(o0Var3.f239031a, hVarW);
                        }
                        break;
                    case -1056060699:
                        if (str2.equals("ID_MANAGE_MOBILE_PLAN_ACTION")) {
                            mVar2.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new EsimFeatureConfig.HomeDestination((c4) null, (TransitionAnimation) null, 7), false, (Integer) null, 0, 61)));
                        }
                        break;
                    case -915114084:
                        if (str2.equals("ID_CANCEL_SPLIT_ACTION")) {
                            Object obj2 = item.f58324n;
                            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit");
                            RecurringSplit split = (RecurringSplit) obj2;
                            RecurringSplitSource recurringSplitSource = split.f79921b;
                            o0 o0Var4 = (o0) jVar;
                            o0Var4.getClass();
                            Intrinsics.checkNotNullParameter(split, "recurringSplit");
                            opi.d dVar = o0Var4.f244749q;
                            qce.f fVar = (qce.f) o0Var4.f244750r;
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(split, "split");
                            a2a.g gVar = recurringSplitSource.f79929a;
                            int[] iArr = qce.e.f244727a;
                            int i3 = iArr[gVar.ordinal()];
                            if (i3 == 1) {
                                r56 = 0;
                                i = 14;
                                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_subscription_cancel_dialog_title, null, null, 14);
                            } else if (i3 == 2) {
                                r56 = 0;
                                i = 14;
                                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_direct_debit_cancel_dialog_title, null, null, 14);
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r56 = 0;
                                i = 14;
                                textLocalisedClause = new TextLocalisedClause(R$string.recurring_payments_split_external_transfer_cancel_dialog_title, null, null, 14);
                            }
                            int i5 = iArr[recurringSplitSource.f79929a.ordinal()];
                            if (i5 == 1) {
                                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_subscription_cancel_dialog_subtitle, r56, r56, i);
                            } else if (i5 == 2) {
                                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_direct_debit_cancel_dialog_subtitle, r56, r56, i);
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payments_split_external_transfer_cancel_dialog_subtitle, r56, r56, i);
                            }
                            ((opi.b) dVar).Z(new y(qce.f.a(fVar, "BUTTON_CANCEL_SPLIT_LIST_ID", new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_confirm_button_title, r56, r56, i), new TextLocalisedClause(R$string.recurring_payments_split_cancel_dialog_no_button_title, r56, r56, i), split, false, 16), new t(textLocalisedClause, textLocalisedClause2, r56, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836));
                        }
                        break;
                    case -210422291:
                        if (str2.equals("ID_CANCEL_NZ_DIRECT_DEBIT_ACTION")) {
                            o0 o0Var5 = (o0) jVar;
                            ((opi.b) o0Var5.f244749q).Z(((qce.f) o0Var5.f244750r).e(((sce.f) o0Var5.f244743h).f(), false));
                        }
                        break;
                    case -91810985:
                        if (str2.equals("ID_COBRAND")) {
                            o0 o0Var6 = (o0) jVar;
                            o0Var6.getClass();
                            o0Var6.f244746m.c(new FeatureCommand(CobrandedCardsFeatureConfig.PlanHub.f82502g));
                        }
                        break;
                    case 36997693:
                        if (str2.equals("ID_DEACTIVATE_ACTION")) {
                            o0 o0Var7 = (o0) jVar;
                            qce.i iVar = o0Var7.f244750r;
                            qua.p subscription = ((sce.f) o0Var7.f244743h).f();
                            if (subscription.f249314a.f160152c.b() || qua.u.x(subscription)) {
                                yVarC = ((qce.f) iVar).c(subscription);
                            } else {
                                qce.f fVar2 = (qce.f) iVar;
                                fVar2.getClass();
                                Intrinsics.checkNotNullParameter(subscription, "subscription");
                                int i6 = R$string.recurring_dialog_deactivate_title;
                                String str3 = subscription.k;
                                yVarC = new y(qce.f.a(fVar2, "BUTTON_DEACTIVATE_SUBSCRIPTION_LIST_ID", new TextLocalisedClause(R$string.recurring_dialog_action_deactivate, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), null, false, 24), new t(new TextLocalisedClause(i6, u.c(str3 != null ? str3 : ""), null, 12), new TextLocalisedClause(R$string.recurring_dialog_deactivate_text, u.c(qce.f.b(subscription)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
                            }
                            ((opi.b) o0Var7.f244749q).Z(yVarC);
                        }
                        break;
                    case 347578599:
                        if (str2.equals("ID_EDIT_ACTION")) {
                            o0 o0Var8 = (o0) jVar;
                            vz1.g gVar2 = o0Var8.A;
                            f9b.f fVar3 = o0Var8.i;
                            z8e.a aVar3 = o0Var8.f244747n;
                            tpi.j jVar2 = o0Var8.f244744j;
                            sri.m mVar3 = o0Var8.f244746m;
                            ifm.b bVar = o0Var8.f239031a;
                            sce.f fVar4 = (sce.f) o0Var8.f244743h;
                            qua.p subscription2 = fVar4.f();
                            co9.b bVar2 = fVar4.f261742g;
                            String str4 = subscription2.f249318c;
                            ibd.e eVar = subscription2.f249314a;
                            ibd.h hVar = eVar.f160152c;
                            String str5 = eVar.f160150a;
                            int i21 = qce.u.f244770a[hVar.ordinal()];
                            efm.k kVarW = rfm.h.f253943a;
                            switch (i21) {
                                case 1:
                                    String str6 = str4;
                                    ((rae.d) aVar3).getClass();
                                    Intrinsics.checkNotNullParameter(subscription2, "subscription");
                                    if (str6 == null) {
                                        m70.a.c(t0.f186434a);
                                        str6 = "";
                                    }
                                    mVar3.c(new FeatureCommand(new DonationsKompotFeatureConfig.RecurringDonation(str6)));
                                    break;
                                case 2:
                                    sfm.b bVar3 = new sfm.b(fVar4.g(), new qc7.d(19, new qce.s(o0Var8, subscription2, 1)), 1);
                                    Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
                                    efm.r rVarT = mo3.a.t(hx7.a.N(o70.a.f(bVar3), fVar3, false, true), jVar2);
                                    Intrinsics.h(rVarT);
                                    pvc.e eVar2 = new pvc.e(1, o0Var8.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 21);
                                    Function1 function1K2 = o0Var8.K();
                                    Function0 function0J = o0Var8.J();
                                    efm.r rVarOnErrorResumeNext = rVarT.onErrorResumeNext(new o9h.d(12, new r0(new BreadcrumbException(), 16)));
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                                    ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(7, eVar2), new nw8.d(7, function1K2), new z(18, function0J));
                                    w.j0(bVar, cVarSubscribe);
                                    Intrinsics.h(cVarSubscribe);
                                    break;
                                case 3:
                                    vua.a aVar4 = subscription2.f249330s;
                                    if (aVar4 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    String str7 = aVar4.f;
                                    if (str7 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    rfm.m mVar4 = new rfm.m(fVar4.h(str7), new qc7.d(20, new qce.s(o0Var8, subscription2, 2)), 1);
                                    Intrinsics.checkNotNullExpressionValue(mVar4, "map(...)");
                                    efm.k kVarV = mo3.a.v(hx7.a.M(o70.a.h(mVar4), fVar3), jVar2);
                                    Intrinsics.checkNotNullExpressionValue(kVarV, "withProgress(...)");
                                    pvc.e eVar3 = new pvc.e(1, o0Var8.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 23);
                                    Function1 function1K3 = o0Var8.K();
                                    Function0 function0J2 = o0Var8.J();
                                    rfm.m mVar5 = new rfm.m(kVarV, new o9h.d(12, new r0(new BreadcrumbException(), 19)), 2);
                                    Intrinsics.checkNotNullExpressionValue(mVar5, "onErrorResumeNext(...)");
                                    rfm.b bVar4 = new rfm.b(new nw8.d(7, eVar3), new nw8.d(7, function1K3), new z(18, function0J2));
                                    mVar5.i(bVar4);
                                    Intrinsics.checkNotNullExpressionValue(bVar4, "subscribe(...)");
                                    w.j0(bVar, bVar4);
                                    break;
                                    break;
                                case 4:
                                    mVar3.c(((rae.d) aVar3).h(subscription2));
                                    break;
                                case 5:
                                    d0 d0VarW = mo3.a.w(hx7.a.O(o70.a.i(((rae.d) aVar3).m(subscription2)), fVar3, true, null, 24), jVar2);
                                    pvc.e eVar4 = new pvc.e(1, o0Var8.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 25);
                                    Function1 function1K4 = o0Var8.K();
                                    ufm.i iVar2 = new ufm.i(d0VarW, new o9h.d(12, new r0(new BreadcrumbException(), 22)), 2);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                                    ofm.i iVar3 = new ofm.i(new nw8.d(7, eVar4), new nw8.d(7, function1K4), 0);
                                    iVar2.q(iVar3);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
                                    w.j0(bVar, iVar3);
                                    break;
                                case 6:
                                    mVar3.c(((rae.d) aVar3).g(subscription2));
                                    break;
                                case 7:
                                    if (str4 == null) {
                                        throw new IllegalArgumentException("Expected facilityId");
                                    }
                                    mVar3.c(new FeatureCommand(new CreditCardKompotFeatureConfig.AutoPaySettings(str4, null)));
                                    break;
                                    break;
                                case 8:
                                    mVar3.c(((rae.d) aVar3).j(subscription2));
                                    break;
                                case 9:
                                    o0Var8.B.getClass();
                                    MoveMoneyRecurringPayment moveMoneyRecurringPaymentA = v8i.c.a(subscription2);
                                    if (qua.u.v(subscription2)) {
                                        editScheduledPayment = new Action.EditScheduledAutomation(moveMoneyRecurringPaymentA);
                                        set = null;
                                    } else {
                                        set = null;
                                        editScheduledPayment = new Action.EditScheduledPayment(moveMoneyRecurringPaymentA, null);
                                    }
                                    mVar3.c(new FeatureCommand(new MoveMoneyBridgeFeatureConfig(new MoveMoneyInputData(editScheduledPayment, set, 6))));
                                    break;
                                case 10:
                                case 11:
                                case 12:
                                    qua.h hVar2 = fVar4.f().C;
                                    if (hVar2 == null || (str = hVar2.f249297a) == null) {
                                        Intrinsics.checkNotNullExpressionValue(kVarW, "empty(...)");
                                    } else {
                                        kVarW = m70.a.g(rd0.e.c(bVar2.d(str), kotlin.coroutines.g.f186406a), null, new sa5.a(9), 1).firstOrError().w();
                                        Intrinsics.checkNotNullExpressionValue(kVarW, "getPaymentCounterpartyFromId(...)");
                                    }
                                    rfm.m mVar6 = new rfm.m(kVarW, new qc7.d(18, new qce.s(o0Var8, subscription2, 0)), 1);
                                    Intrinsics.checkNotNullExpressionValue(mVar6, "map(...)");
                                    efm.k kVarV2 = mo3.a.v(hx7.a.M(o70.a.h(mVar6), fVar3), jVar2);
                                    Intrinsics.checkNotNullExpressionValue(kVarV2, "withProgress(...)");
                                    pvc.e eVar5 = new pvc.e(1, o0Var8.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 22);
                                    Function1 function1K5 = o0Var8.K();
                                    Function0 function0J3 = o0Var8.J();
                                    rfm.m mVar7 = new rfm.m(kVarV2, new o9h.d(12, new r0(new BreadcrumbException(), 17)), 2);
                                    Intrinsics.checkNotNullExpressionValue(mVar7, "onErrorResumeNext(...)");
                                    rfm.b bVar5 = new rfm.b(new nw8.d(7, eVar5), new nw8.d(7, function1K5), new z(18, function0J3));
                                    mVar7.i(bVar5);
                                    Intrinsics.checkNotNullExpressionValue(bVar5, "subscribe(...)");
                                    w.j0(bVar, bVar5);
                                    break;
                                case 13:
                                    qua.p pVarF = fVar4.f();
                                    rua.d dVar2 = pVarF.D;
                                    if (dVar2 == null || (map = dVar2.f257509b) == null) {
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't fetch recipient because receiverUpiInfo account is null");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                        Intrinsics.checkNotNullExpressionValue(kVarW, "empty(...)");
                                    } else {
                                        String str8 = pVarF.f249318c;
                                        if (str8 == null) {
                                            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Can't fetch recipient because receiver is null");
                                            h0 h0Var2 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                                            Intrinsics.checkNotNullExpressionValue(kVarW, "empty(...)");
                                        } else {
                                            if (map.containsKey("UPI_ID")) {
                                                mVar = new rfm.m(m70.a.g(rd0.e.c(bVar2.d(str8), kotlin.coroutines.g.f186406a), null, new sa5.a(9), 1).firstOrError().w(), new sc7.g(new sa6.y(19), 8), 1);
                                            } else if (map.containsKey("ACCOUNT_NUMBER")) {
                                                mVar = new rfm.m(fVar4.e(str8), new sc7.g(new sa6.y(20), 9), 1);
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(kVarW, "empty(...)");
                                            }
                                            kVarW = mVar;
                                        }
                                    }
                                    rfm.m mVar8 = new rfm.m(kVarW, new qc7.d(17, new e8e.t(subscription2, 3)), 1);
                                    Intrinsics.checkNotNullExpressionValue(mVar8, "map(...)");
                                    efm.k kVarV3 = mo3.a.v(hx7.a.M(o70.a.h(mVar8), fVar3), jVar2);
                                    Intrinsics.checkNotNullExpressionValue(kVarV3, "withProgress(...)");
                                    pvc.e eVar6 = new pvc.e(1, o0Var8.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 24);
                                    Function1 function1K6 = o0Var8.K();
                                    Function0 function0J4 = o0Var8.J();
                                    rfm.m mVar9 = new rfm.m(kVarV3, new o9h.d(12, new r0(new BreadcrumbException(), 21)), 2);
                                    Intrinsics.checkNotNullExpressionValue(mVar9, "onErrorResumeNext(...)");
                                    rfm.b bVar6 = new rfm.b(new nw8.d(7, eVar6), new nw8.d(7, function1K6), new z(18, function0J4));
                                    mVar9.i(bVar6);
                                    Intrinsics.checkNotNullExpressionValue(bVar6, "subscribe(...)");
                                    w.j0(bVar, bVar6);
                                    break;
                                case 14:
                                    efm.r rVarG = m70.a.g(rd0.e.c(gVar2.b(str5), kotlin.coroutines.g.f186406a), null, null, 3);
                                    qce.q qVar = new qce.q(o0Var8, 16);
                                    Function1 function1K7 = o0Var8.K();
                                    Function0 function0J5 = o0Var8.J();
                                    efm.r rVarOnErrorResumeNext2 = rVarG.onErrorResumeNext(new o9h.d(12, new r0(new BreadcrumbException(), 18)));
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
                                    ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nw8.d(7, qVar), new nw8.d(7, function1K7), new z(18, function0J5));
                                    w.j0(bVar, cVarSubscribe2);
                                    Intrinsics.h(cVarSubscribe2);
                                    break;
                                case 15:
                                    efm.r rVarG2 = m70.a.g(rd0.e.c(gVar2.b(str5), kotlin.coroutines.g.f186406a), null, null, 3);
                                    qce.q qVar2 = new qce.q(o0Var8, 15);
                                    Function1 function1K8 = o0Var8.K();
                                    Function0 function0J6 = o0Var8.J();
                                    efm.r rVarOnErrorResumeNext3 = rVarG2.onErrorResumeNext(new o9h.d(12, new r0(new BreadcrumbException(), 20)));
                                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
                                    ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nw8.d(7, qVar2), new nw8.d(7, function1K8), new z(18, function0J6));
                                    w.j0(bVar, cVarSubscribe3);
                                    Intrinsics.h(cVarSubscribe3);
                                    break;
                                default:
                                    throw new IllegalStateException(("Subscription type does not support editing: " + eVar.f160152c).toString());
                            }
                        }
                        break;
                    case 560421023:
                        if (str2.equals("ID_MANAGE_PLAN")) {
                            o0 o0Var9 = (o0) jVar;
                            o0Var9.getClass();
                            o0Var9.f244746m.c(new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanSettings(null)));
                        }
                        break;
                    case 904273702:
                        if (str2.equals("ID_DELETE_ACTION")) {
                            ((o0) jVar).O();
                        }
                        break;
                    case 1256505900:
                        if (str2.equals("ID_MANAGE_ACTION")) {
                            o0 o0Var10 = (o0) jVar;
                            String str9 = ((sce.f) o0Var10.f244743h).f().f249318c;
                            if (str9 == null) {
                                throw new IllegalArgumentException("Expected facilityId");
                            }
                            o0Var10.f244746m.c(new FeatureCommand(new CreditCardKompotFeatureConfig.Details(str9)));
                        }
                        break;
                    case 1477675998:
                        if (str2.equals("ID_ACTIVATE_ACTION")) {
                            ((o0) jVar).N();
                        }
                        break;
                    case 1755400642:
                        if (str2.equals("ID_BLOCK_FUTURE_PAYMENTS_ACTION")) {
                            qua.p pVar = (qua.p) w.O(((sce.g) ((bce.g) aVar).f14440b).w0());
                            if (pVar == null) {
                                IllegalStateException illegalStateException = new IllegalStateException("Block Subscription; Subscription is not found");
                                h0 h0Var3 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var3);
                            } else {
                                mVar2.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new BlockFuturePaymentsFlowDestination(pVar.f249314a.f160150a, false), false, (Integer) null, 0, 61)));
                            }
                        }
                        break;
                    case 1942219141:
                        if (str2.equals("ID_SPLIT_BILL_ACTION")) {
                            qua.p pVar2 = (qua.p) w.O(((sce.g) ((bce.g) aVar).f14440b).w0());
                            if (pVar2 == null) {
                                IllegalStateException illegalStateException2 = new IllegalStateException("Split Subscription; Subscription is not found");
                                h0 h0Var4 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var4);
                            } else {
                                mVar2.c(u0.f(new RecurringPaymentSplitNavigation$Destination(pVar2, null)));
                            }
                        }
                        break;
                }
                return Unit.f186387a;
            case 4:
                qce.j jVar3 = oVar.f320672j;
                Intrinsics.checkNotNullParameter(payload, "payload");
                if (Intrinsics.f(payload, "ID_BANK_DETAILS")) {
                    o0 o0Var11 = (o0) jVar3;
                    rfm.m mVar10 = new rfm.m(((sce.f) o0Var11.f244743h).g(), new qc7.d(10, new qce.q(o0Var11, 6)), 1);
                    Intrinsics.checkNotNullExpressionValue(mVar10, "map(...)");
                    efm.k kVarV4 = mo3.a.v(hx7.a.M(o70.a.h(mVar10), o0Var11.i), o0Var11.f244744j);
                    Intrinsics.checkNotNullExpressionValue(kVarV4, "withProgress(...)");
                    pvc.e eVar7 = new pvc.e(1, o0Var11.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 26);
                    Function1 function1K9 = o0Var11.K();
                    Function0 function0J7 = o0Var11.J();
                    rfm.m mVar11 = new rfm.m(kVarV4, new o9h.d(12, new r0(new BreadcrumbException(), 24)), 2);
                    Intrinsics.checkNotNullExpressionValue(mVar11, "onErrorResumeNext(...)");
                    rfm.b bVar7 = new rfm.b(new nw8.d(7, eVar7), new nw8.d(7, function1K9), new z(18, function0J7));
                    mVar11.i(bVar7);
                    Intrinsics.checkNotNullExpressionValue(bVar7, "subscribe(...)");
                    w.j0(o0Var11.f239031a, bVar7);
                } else if (Intrinsics.f(payload, "ID_CONTACT_DETAILS")) {
                    o0 o0Var12 = (o0) jVar3;
                    sce.f fVar5 = (sce.f) o0Var12.f244743h;
                    vua.a aVar5 = fVar5.f().f249330s;
                    if (aVar5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str10 = aVar5.f;
                    if (str10 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    efm.k kVarV5 = mo3.a.v(hx7.a.M(o70.a.h(fVar5.h(str10)), o0Var12.i), o0Var12.f244744j);
                    Intrinsics.checkNotNullExpressionValue(kVarV5, "withProgress(...)");
                    pvc.e eVar8 = new pvc.e(1, o0Var12, o0.class, "openContactDetails", "openContactDetails(Lcom/revolut/feature/contacts/models/RevolutContact;)V", 0, 27);
                    Function1 function1K10 = o0Var12.K();
                    Function0 function0J8 = o0Var12.J();
                    rfm.m mVar12 = new rfm.m(kVarV5, new o9h.d(12, new r0(new BreadcrumbException(), 25)), 2);
                    Intrinsics.checkNotNullExpressionValue(mVar12, "onErrorResumeNext(...)");
                    rfm.b bVar8 = new rfm.b(new nw8.d(7, eVar8), new nw8.d(7, function1K10), new z(18, function0J8));
                    mVar12.i(bVar8);
                    Intrinsics.checkNotNullExpressionValue(bVar8, "subscribe(...)");
                    w.j0(o0Var12.f239031a, bVar8);
                } else if (Intrinsics.f(payload, "ID_SAVINGS_VAULTS")) {
                    o0 o0Var13 = (o0) jVar3;
                    efm.k kVarI = ((sce.f) o0Var13.f244743h).i();
                    qce.q qVar3 = new qce.q(o0Var13, 7);
                    Function1 function1K11 = o0Var13.K();
                    Function0 function0J9 = o0Var13.J();
                    rfm.m mVar13 = new rfm.m(kVarI, new o9h.d(12, new r0(new BreadcrumbException(), 29)), 2);
                    Intrinsics.checkNotNullExpressionValue(mVar13, "onErrorResumeNext(...)");
                    rfm.b bVar9 = new rfm.b(new nw8.d(7, qVar3), new nw8.d(7, function1K11), new z(18, function0J9));
                    mVar13.i(bVar9);
                    Intrinsics.checkNotNullExpressionValue(bVar9, "subscribe(...)");
                    w.j0(o0Var13.f239031a, bVar9);
                } else if (Intrinsics.f(payload, "ID_BILL_ACCOUNTS")) {
                    o0 o0Var14 = (o0) jVar3;
                    String str11 = ((sce.f) o0Var14.f244743h).f().f249318c;
                    if (str11 != null) {
                        o0Var14.f244746m.c(((rae.d) o0Var14.f244747n).e(str11));
                    }
                } else if (payload instanceof zm3.l) {
                    zm3.l contact = (zm3.l) payload;
                    o0 o0Var15 = (o0) jVar3;
                    o0Var15.getClass();
                    Intrinsics.checkNotNullParameter(contact, "contact");
                    o0Var15.f244746m.c(((rae.d) o0Var15.f244747n).c(contact));
                }
                return Unit.f186387a;
            case 5:
                ty0.a clickData2 = (ty0.a) payload;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (Intrinsics.f(clickData2.f275445a, "ID_ADDITIONAL_INFORMATION")) {
                    o0 o0Var16 = (o0) oVar.f320672j;
                    ob2.h hVar3 = o0Var16.z;
                    String id10 = ((sce.f) o0Var16.f244743h).f().f249314a.f160150a;
                    hVar3.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    efm.b bVarFlatMapCompletable = o70.a.f(rd0.e.c(new njj.l(new n1g.p(new ob2.d(new n33.r0(mo3.a.g(hVar3.f223866a.b(id10), null, new ob2.a(0), 1), 11), 0), hVar3, 28), 17), kotlin.coroutines.g.f186406a)).flatMapCompletable(new qc7.d(11, new qce.q(o0Var16, 8)));
                    Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                    Function1 function1K12 = o0Var16.K();
                    o9h.d dVar3 = new o9h.d(12, new r0(new BreadcrumbException(), 23));
                    bVarFlatMapCompletable.getClass();
                    pfm.a aVar6 = new pfm.a(bVarFlatMapCompletable, dVar3, 2);
                    Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
                    ofm.h hVarW2 = aVar6.w(new nw8.d(7, function1K12), new z(18, qce.h0.f244733a));
                    Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                    w.j0(o0Var16.f239031a, hVarW2);
                }
                return Unit.f186387a;
            case 6:
                qce.j jVar4 = oVar.f320672j;
                CellDetailsChevronDelegate.Model model2 = (CellDetailsChevronDelegate.Model) payload;
                Intrinsics.checkNotNullParameter(model2, "model");
                String str12 = model2.f51822a;
                int iHashCode = str12.hashCode();
                if (iHashCode != -1807605422) {
                    if (iHashCode != -960116391) {
                        if (iHashCode == 904273702 && str12.equals("ID_DELETE_ACTION")) {
                            ((o0) jVar4).O();
                        }
                    } else if (str12.equals("ID_UNMARK_SUBSCRIPTION_PAYMENT")) {
                        Object obj3 = model2.e;
                        Object subscriptionOwner = (!(obj3 instanceof ibe.a) || (juniorBankingProfile = ((ibe.a) obj3).f) == null) ? qce.n.f244741a : new qce.m(juniorBankingProfile.f77099b);
                        o0 o0Var17 = (o0) jVar4;
                        o0Var17.getClass();
                        Intrinsics.checkNotNullParameter(subscriptionOwner, "subscriptionOwner");
                        opi.d dVar4 = o0Var17.f244749q;
                        qce.i iVar4 = o0Var17.f244750r;
                        qua.p subscription3 = ((sce.f) o0Var17.f244743h).f();
                        ((qce.f) iVar4).getClass();
                        Intrinsics.checkNotNullParameter(subscription3, "subscription");
                        Intrinsics.checkNotNullParameter(subscriptionOwner, "subscriptionOwner");
                        if (subscriptionOwner instanceof qce.n) {
                            textLocalisedClause3 = new TextLocalisedClause(R$string.subscriptions_remove_dialog_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                        } else {
                            if (!(subscriptionOwner instanceof qce.m)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause3 = new TextLocalisedClause(R$string.subscriptions_junior_remove_dialog_subtitle, u.c(((qce.m) subscriptionOwner).f244738a), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
                        }
                        ((opi.b) dVar4).Z(new y(u.c(new um0("BUTTON_DISABLE_SUBSCRIPTION_LIST_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.subscriptions_remove_dialog_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.subscriptions_remove_dialog_confirm, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, R$attr.uikit_dp24, 0, 0, 888)), new t(new TextLocalisedClause(R$string.subscriptions_remove_dialog_title, null, null, 14), textLocalisedClause3, null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836));
                    }
                } else if (str12.equals("ID_GO_TO_ISSUES_LIST")) {
                    ((o0) jVar4).R();
                }
                return Unit.f186387a;
            case 7:
                RowDelegate.Model model3 = (RowDelegate.Model) payload;
                Intrinsics.checkNotNullParameter(model3, "model");
                Object obj4 = model3.u;
                if (obj4 instanceof a3) {
                    a3 transaction = (a3) obj4;
                    o0 o0Var18 = (o0) oVar.f320672j;
                    o0Var18.getClass();
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    z8e.a aVar7 = o0Var18.f244747n;
                    k71.i transactionDescriptor = ofm.q.P(transaction);
                    ((rae.d) aVar7).getClass();
                    Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
                    o0Var18.f244746m.c(new FeatureCommand(new TransactionsFeatureConfig.Details(transactionDescriptor, null, null, null, 122)));
                } else if (obj4 instanceof qua.p) {
                    oVar.k.c(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((qua.p) obj4).f249314a.f160150a, false, null, 6)));
                }
                return Unit.f186387a;
            case 8:
                return b(payload);
            case 9:
                return c(payload);
            case 10:
                return a(payload);
            case 11:
                return e(payload);
            case 12:
                Pair pair = (Pair) payload;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new pfm.n(new tif.e((od0.i) pair.f186386b, 13, oVar, (List) pair.f186385a), 1);
            case 13:
                return d(payload);
            case 14:
                return g(payload);
            case 15:
                return h(payload);
            case 16:
                return i(payload);
            case 17:
                return j(payload);
            case 18:
                return k(payload);
            case 19:
                return l(payload);
            default:
                com.revolut.core.ui_kit.delegates.t clickData3 = (com.revolut.core.ui_kit.delegates.t) payload;
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                if (Intrinsics.f(clickData3.f54722b.f51590a, "ID_CONFIRM_FREQUENCY") && Intrinsics.f(clickData3.f54721a, ActionWidgetDelegate.a.c.f51609a)) {
                    o0 o0Var19 = (o0) oVar.f320672j;
                    o0Var19.f244746m.c(new FeatureCommand(new KompotOverlayFeatureConfig(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.EditSubscriptionFrequency(((sce.f) o0Var19.f244743h).f())), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
                }
                return Unit.f186387a;
        }
    }
}
