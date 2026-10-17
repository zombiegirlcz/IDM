package qce;

import aw0.o9;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsActivity;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends pri.c implements j {

    @NotNull
    public static final t Companion = new t();
    public final vz1.g A;
    public final v8i.c B;
    public ofm.h C;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f244743h;
    public final f9b.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tpi.j f244744j;
    public final cqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3l.b f244745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sri.m f244746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z8e.a f244747n;
    public final f01.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t70.b f244748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final opi.d f244749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f244750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f244751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ogm.i f244752t;
    public final kpg.a u;
    public final mr2.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f244753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final oce.h f244754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final msb.a f244755y;
    public final ob2.h z;

    public o0(p presentationModel, f9b.f errorView, tpi.j progressView, cqi.h promptView, k3l.b statusDialogView, sri.m navigator, z8e.a appNavigationProvider, f01.c uiKitResources, t70.b currenciesLocalization, opi.d bottomDialogView, i bottomDialogItemsProvider, l statusDialogConfigurationProvider, ogm.i troubleshooterDestinationDelegate, kpg.a productAccountsNavigationProvider, mr2.b blockedMerchantDialogFactory, g promptDialogConfigurationProvider, oce.h unblockMerchantDialogProvider, msb.a twoFaView, ob2.h payToDialogProvider, vz1.g apmPaymentsAuthorisationsRepository, v8i.c moveMoneyRecurringPaymentMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appNavigationProvider, "appNavigationProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(bottomDialogItemsProvider, "bottomDialogItemsProvider");
        Intrinsics.checkNotNullParameter(statusDialogConfigurationProvider, "statusDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(troubleshooterDestinationDelegate, "troubleshooterDestinationDelegate");
        Intrinsics.checkNotNullParameter(productAccountsNavigationProvider, "productAccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(blockedMerchantDialogFactory, "blockedMerchantDialogFactory");
        Intrinsics.checkNotNullParameter(promptDialogConfigurationProvider, "promptDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(unblockMerchantDialogProvider, "unblockMerchantDialogProvider");
        Intrinsics.checkNotNullParameter(twoFaView, "twoFaView");
        Intrinsics.checkNotNullParameter(payToDialogProvider, "payToDialogProvider");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(moveMoneyRecurringPaymentMapper, "moveMoneyRecurringPaymentMapper");
        this.f244743h = presentationModel;
        this.i = errorView;
        this.f244744j = progressView;
        this.k = promptView;
        this.f244745l = statusDialogView;
        this.f244746m = navigator;
        this.f244747n = appNavigationProvider;
        this.o = uiKitResources;
        this.f244748p = currenciesLocalization;
        this.f244749q = bottomDialogView;
        this.f244750r = bottomDialogItemsProvider;
        this.f244751s = statusDialogConfigurationProvider;
        this.f244752t = troubleshooterDestinationDelegate;
        this.u = productAccountsNavigationProvider;
        this.v = blockedMerchantDialogFactory;
        this.f244753w = promptDialogConfigurationProvider;
        this.f244754x = unblockMerchantDialogProvider;
        this.f244755y = twoFaView;
        this.z = payToDialogProvider;
        this.A = apmPaymentsAuthorisationsRepository;
        this.B = moveMoneyRecurringPaymentMapper;
    }

    public final void N() {
        pfm.a aVarA = ((sce.f) this.f244743h).a();
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(aVarA, new o9h.d(12, new qc0.r0(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new nw8.d(7, function1K), new ozc.z(18, v.f244773a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    public final void O() {
        rp0.y yVarC;
        rp0.y yVar;
        qua.p subscription = ((sce.f) this.f244743h).f();
        ibd.e eVar = subscription.f249314a;
        boolean zB = eVar.f160152c.b();
        i iVar = this.f244750r;
        if (zB || qua.u.x(subscription)) {
            yVarC = ((f) iVar).c(subscription);
        } else if (eVar.f160152c.e()) {
            yVarC = ((f) iVar).d(subscription);
        } else {
            if (ofm.q.w(subscription)) {
                f fVar = (f) iVar;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_allowance_delete_confirmation_title, null, null, 14);
                int i = R$string.junior_allowance_delete_confirmation_description;
                MoneyClause moneyClauseB = f.b(subscription);
                vua.a aVar = subscription.f249330s;
                Object[] elements = {moneyClauseB, aVar != null ? aVar.f292280b : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                yVar = new rp0.y(f.a(fVar, "BUTTON_DELETE_SCHEDULED_PAYMENT_LIST_ID", new TextLocalisedClause(R$string.junior_allowance_delete_confirmation_cta_primary, null, null, 14), new TextLocalisedClause(R$string.junior_allowance_delete_confirmation_cta_secondary, null, null, 14), null, false, 24), new rp0.t(textLocalisedClause, new TextLocalisedClause(i, kotlin.collections.d.L(elements), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
            } else if (ofm.q.H(subscription)) {
                f fVar2 = (f) iVar;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                yVarC = new rp0.y(f.a(fVar2, "BUTTON_DELETE_SCHEDULED_PAYMENT_LIST_ID", new TextLocalisedClause(R$string.recurring_dialog_action_delete, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), null, false, 24), new rp0.t(new TextLocalisedClause(R$string.scheduled_payment_bottom_sheet_delete_title, zhm.u.c(mae.h.b(subscription, fVar2.f244729a, fVar2.f244730b)), null, 12), new TextLocalisedClause(R$string.scheduled_payment_bottom_sheet_delete_subtitle, zhm.u.c(f.b(subscription)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
            } else {
                f fVar3 = (f) iVar;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                yVar = new rp0.y(f.a(fVar3, "BUTTON_DELETE_RECURRING_PAYMENT_LIST_ID", new TextLocalisedClause(R$string.recurring_dialog_action_delete, null, null, 14), new TextLocalisedClause(R$string.recurring_dialog_action_cancel, null, null, 14), null, false, 24), new rp0.t(new TextLocalisedClause(R$string.scheduled_payment_bottom_sheet_delete_title, zhm.u.c(mae.h.b(subscription, fVar3.f244729a, fVar3.f244730b)), null, 12), new TextLocalisedClause(R$string.scheduled_payment_bottom_sheet_delete_subtitle, zhm.u.c(f.b(subscription)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, 28), null, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3836);
            }
            yVarC = yVar;
        }
        ((opi.b) this.f244749q).Z(yVarC);
    }

    public final pfm.a P(q0 subscriptionLoanStatus) {
        sce.f fVar = (sce.f) this.f244743h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(subscriptionLoanStatus, "subscriptionLoanStatus");
        pfm.a aVarE = ((tm.g) fVar.f261739a.o.getValue()).a(new mm.g(new p0((qua.p) ((sce.g) fVar.e).w0().get(), subscriptionLoanStatus))).e(new pfm.h(new r(this, 1), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final void Q() {
        efm.b bVarFlatMapCompletable = o70.a.f(rd0.e.c(new njj.l(this.z.a(((sce.f) this.f244743h).f().f249314a.f160150a), 18), kotlin.coroutines.g.f186406a)).flatMapCompletable(new qc7.d(14, new q(this, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K = K();
        o9h.d dVar = new o9h.d(12, new qc0.r0(new BreadcrumbException(), 26));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new nw8.d(7, function1K), new ozc.z(18, j0.f244735a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    public final void R() {
        qua.p recurrentPayment = ((sce.f) this.f244743h).f();
        ogm.i iVar = this.f244752t;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(recurrentPayment, "recurrentPayment");
        rfm.m mVar = new rfm.m(ofm.q.L(kotlin.coroutines.g.f186406a, new sbb.w(iVar, recurrentPayment, null, 4)), new qc7.d(15, new qc7.c(9)), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        efm.k kVarV = mo3.a.v(hx7.a.M(o70.a.h(mVar), this.i), this.f244744j);
        Intrinsics.checkNotNullExpressionValue(kVarV, "withProgress(...)");
        pvc.e eVar = new pvc.e(1, this.f244746m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 28);
        Function1 function1K = K();
        Function0 function0J = J();
        rfm.m mVar2 = new rfm.m(kVarV, new o9h.d(12, new qc0.r0(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(mVar2, "onErrorResumeNext(...)");
        rfm.b bVar = new rfm.b(new nw8.d(7, eVar), new nw8.d(7, function1K), new ozc.z(18, function0J));
        mVar2.i(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        te0.w.j0(this.f239031a, bVar);
    }

    public final void S(fva.e eVar) {
        Integer numValueOf;
        qua.p subscription = ((sce.f) this.f244743h).f();
        EnumEntries enumEntriesA = fva.e.a();
        ArrayList<fva.e> availableFrequencies = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            switch (u.f244772c[((fva.e) obj2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    availableFrequencies.add(obj2);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        f fVar = (f) this.f244750r;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(availableFrequencies, "availableFrequencies");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        rp0.l lVar = rp0.l.WINDOW;
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.subscriptions_change_frequency_title, null, null, 14), new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.subscriptions_change_frequency_description, null, null, 14), new TextLocalisedClause(R$string.subscriptions_change_frequency_caption_merchant, zhm.u.c(mae.h.a(subscription, fVar.f244729a, fVar.f244730b)), null, 12)), new TextClause(m70.a.o(kotlin.jvm.internal.t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, 28);
        ArrayList arrayList = new ArrayList();
        for (fva.e eVar2 : availableFrequencies) {
            switch (e.f244728b[eVar2.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_weekly);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_every_two_weeks);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_monthly);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_quarterly);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_every_six_months);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(R$string.subscriptions_change_frequency_options_yearly);
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    numValueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            SingleChoiceDelegate.Model model = numValueOf != null ? new SingleChoiceDelegate.Model(eVar2.name(), new TextLocalisedClause(numValueOf.intValue(), null, null, 14), eVar2 == eVar, null, eVar2, 1992) : null;
            if (model != null) {
                arrayList.add(model);
            }
        }
        yp0.b.k(arrayList, R$attr.uikit_dp0, 0, 0, 0, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_change_frequency_save_button, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        boolean z = eVar != null;
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        ((opi.b) this.f244749q).Z(new rp0.y(zhm.d0.F0(new LargeActionButtonDelegate.Model("BUTTON_EDIT_FREQUENCY_LIST_ID", defaultFilledButton, null, textLocalisedClause, z, null, null, i, i, i2, i2, DefaultFrameSampler.DESIRED_FRAME_WIDTH), arrayList), tVar, lVar, 0, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3800));
    }

    public final pfm.a T(efm.b bVar) {
        return ue0.e.v(hx7.a.L(bVar, this.i, true, null, 24));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        o view = (o) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        SubscriptionDetailsActivity subscriptionDetailsActivity = (SubscriptionDetailsActivity) view;
        efm.r rVarDoOnNext = ((LargeActionButtonDelegate) subscriptionDetailsActivity.Q0.getValue()).d.f121375b.doOnNext(new qc7.d(5, new q(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        qfm.r0 r0VarD = te0.w.D(rVarDoOnNext, new q(this, 2));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new o9h.d(12, new qc0.r0(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new nw8.d(7, function1K), new ozc.z(18, z.f244777a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        qfm.r0 r0VarD2 = te0.w.D(((SingleChoiceDelegate) subscriptionDetailsActivity.R0.getValue()).p(), new e0(1, 0, o0.class, this, "handleSingleChoiceDelegateClick", "handleSingleChoiceDelegateClick(Lcom/revolut/core/ui_kit/delegates/SingleChoiceDelegate$Model;)Lio/reactivex/Completable;"));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new o9h.d(12, new qc0.r0(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(7, function1K2), new ozc.z(18, a0.f244715a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        qfm.r0 r0VarD3 = te0.w.D(((InputChecklistDelegate) subscriptionDetailsActivity.S0.getValue()).f52518c, new f0(1, 0, o0.class, this, "handleInputChecklistDelegateClick", "handleInputChecklistDelegateClick(Lcom/revolut/core/ui_kit/delegates/InputChecklistDelegate$Model;)Lio/reactivex/Completable;"));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new o9h.d(12, new qc0.r0(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new nw8.d(7, function1K3), new ozc.z(18, b0.f244719a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        ?? r06 = subscriptionDetailsActivity.T0;
        efm.b bVarFlatMapCompletable = ((TwinHorizontalButtonDelegate) r06.getValue()).d.f121375b.doOnNext(new qc7.d(6, new q(this, 3))).flatMapCompletable(new qc7.d(7, new q(this, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K4 = K();
        o9h.d dVar = new o9h.d(12, new qc0.r0(new BreadcrumbException(), 15));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar5 = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new nw8.d(7, function1K4), new ozc.z(18, c0.f244720a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.r rVarDoOnNext2 = ((TwinHorizontalButtonDelegate) r06.getValue()).f53572c.f121375b.doOnNext(new qc7.d(8, new q(this, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
        Function1 function1K5 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarDoOnNext2.onErrorResumeNext(new o9h.d(12, new qc0.r0(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(7, d0.f244726a), new nw8.d(7, function1K5), new ozc.z(18, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        cqi.j jVar = subscriptionDetailsActivity.f89235t0;
        if (jVar == null) {
            Intrinsics.r("promptViewActivityDelegate");
            throw null;
        }
        efm.b bVarFlatMapCompletable2 = jVar.i.d().map(new qc7.d(9, new qc7.c(8))).flatMapCompletable(new qc7.d(16, new q(this, 10)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K6 = K();
        o9h.d dVar2 = new o9h.d(12, new qc0.r0(new BreadcrumbException(), 9));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar6 = new pfm.a(bVarFlatMapCompletable2, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new nw8.d(7, function1K6), new ozc.z(18, w.f244774a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        cqi.j jVar2 = subscriptionDetailsActivity.f89235t0;
        if (jVar2 == null) {
            Intrinsics.r("promptViewActivityDelegate");
            throw null;
        }
        efm.b bVarFlatMapCompletable3 = jVar2.i.f().map(new qc7.d(23, new qc7.c(10))).flatMapCompletable(new qc7.d(24, new q(this, 17)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        Function1 function1K7 = K();
        o9h.d dVar3 = new o9h.d(12, new qc0.r0(new BreadcrumbException(), 10));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar7 = new pfm.a(bVarFlatMapCompletable3, dVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new nw8.d(7, function1K7), new ozc.z(18, x.f244775a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        k3l.c cVar = subscriptionDetailsActivity.u0;
        if (cVar == null) {
            Intrinsics.r("statusViewActivityDelegate");
            throw null;
        }
        efm.r rVarFilter = ((k3l.d) cVar).f180813j.filter(new qc7.d(25, new qc7.c(11)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        q qVar = new q(this, 1);
        Function1 function1K8 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarFilter.onErrorResumeNext(new o9h.d(12, new qc0.r0(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nw8.d(7, qVar), new nw8.d(7, function1K8), new ozc.z(18, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarA = msb.a.a(this.f244755y);
        Function1 function1K9 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarA.onErrorResumeNext(new o9h.d(12, new qc0.r0(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nw8.d(7, y.f244776a), new nw8.d(7, function1K9), new ozc.z(18, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
