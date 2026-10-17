package com.revolut.feature.tab.accounts.impl.ui.tab;

import aii.n;
import android.os.Parcelable;
import ash.e;
import aw0.m6;
import aw0.n6;
import c84.y;
import cie.d1;
import cie.e0;
import cie.e1;
import cie.f0;
import cie.g1;
import cie.k1;
import cie.l0;
import cie.n0;
import cie.o0;
import cie.o1;
import cie.p1;
import cie.q0;
import cie.s0;
import cie.t0;
import cie.u;
import cie.u0;
import cie.y0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.backend_driven_limits.api.BackendDrivenLimitsApi$Toggles;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import efm.r;
import gie.j;
import gie.t;
import gld.a0;
import grl.k9;
import ik3.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import lkd.k;
import n1g.p;
import n38.c0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import r10.q;
import rfe.l;
import skm.a2;
import skm.p0;
import te0.w;
import utk.f;
import vge.t2;
import vge.t3;
import vge.z2;
import vkm.j2;
import wa7.m;
import wli.x;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends h implements e0, k {

    @NotNull
    public static final n0 Companion = new n0();
    public final m A;
    public final za7.b B;
    public final zq.a C;
    public final mkd.d D;
    public final e E;
    public final yii.c F;
    public final ntb.c G;
    public final u H;
    public final wn.a I;
    public final gte.a J;
    public final fhe.a K;
    public final sjf.e L;
    public final iie.a M;
    public final uc7.a N;
    public final f0 O;
    public final f4h.a P;
    public final j Q;
    public final t R;
    public final f S;
    public final j40.a T;
    public final p1 U;
    public final kbb.c V;
    public final whe.c W;
    public final q X;
    public final x48.k Y;
    public final gie.a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final hl2.a f89699a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final uge.e f89700b0;
    public final l c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d4m.a f89701d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c70.a f89702e0;
    public final gie.f f0;
    public final qge.b g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final boolean f89703h0;
    public final cli.h i0;
    public final Lazy j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Lazy f89704k0;
    public boolean l0;
    public final AtomicBoolean m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f89705n0;
    public final o1 o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public a2 f89706o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TabAccountsScreenContract$InputData f89707p;
    public final com.revolut.kompot.navigable.vc.modal.a p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i49.b f89708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f89709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z2 f89710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vge.d f89711t;
    public final oge.f u;
    public final the.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w8i.b f89712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f89713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wif.a f89714y;
    public final sb7.b z;

    public d(o1 mapper, TabAccountsScreenContract$InputData inputData, i49.b pendingActionsModelExtension, ang.f userInteractor, z2 productAccountsInteractor, vge.d accountInteractor, oge.f accountNotificationExtension, the.a productEventDispatcher, w8i.b newsManager, x deeplinkHandler, wif.a userFeaturesChecker, sb7.b homeNPSWidgetExtension, m hiddenAccountsInteractor, za7.b hiddenAccountsDialogProvider, zq.a slotManagerScreenProvider, mkd.d slotManagerFeedControllerModelExtension, e widgetsControllerModelExtension, yii.c persistentModelStateStorage, ntb.c mainScreenTabEventReceiver, u multiAccountUiUtils, wn.a adsTrackingControllerModelExtension, gte.a featureToggleInteractor, fhe.a discoverItemsMapper, sjf.e transactionsPerformanceTracker, iie.a footerControllerModelExtension, uc7.a homeFeedWidgetsEventObserver, f0 scrollToTopDispatcher, f4h.a slotChecklistEventHandlerManager, j slotManagerChecklistsControllerModelExtension, t slotManagerPromptsControllerModelExtension, f profileNotificationInteractor, j40.a assistantModelExtension, p1 tabAccountsShotDialogActionModelFactory, kbb.c headerUiParamsProvider, whe.c accountsControllerPerformanceTracker, q userRegisteredIdentitiesInteractor, x48.k jointMcyDeeplinkNavigationResolver, gie.a planOnboardingControllerModelExtension, hl2.a restrictionsInteractor, uge.e addNewProductDestinationFactory, l showSwitchingButtonPolicy, d4m.a totalWealthInteractor, c70.a clipboard, gie.f tabAccountsNudgeControllerModelExtension, qge.b accountsNudgeSessionTracker) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pendingActionsModelExtension, "pendingActionsModelExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productAccountsInteractor, "productAccountsInteractor");
        Intrinsics.checkNotNullParameter(accountInteractor, "accountInteractor");
        Intrinsics.checkNotNullParameter(accountNotificationExtension, "accountNotificationExtension");
        Intrinsics.checkNotNullParameter(productEventDispatcher, "productEventDispatcher");
        Intrinsics.checkNotNullParameter(newsManager, "newsManager");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(homeNPSWidgetExtension, "homeNPSWidgetExtension");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsDialogProvider, "hiddenAccountsDialogProvider");
        Intrinsics.checkNotNullParameter(slotManagerScreenProvider, "slotManagerScreenProvider");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(widgetsControllerModelExtension, "widgetsControllerModelExtension");
        Intrinsics.checkNotNullParameter(persistentModelStateStorage, "persistentModelStateStorage");
        Intrinsics.checkNotNullParameter(mainScreenTabEventReceiver, "mainScreenTabEventReceiver");
        Intrinsics.checkNotNullParameter(multiAccountUiUtils, "multiAccountUiUtils");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(discoverItemsMapper, "discoverItemsMapper");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(footerControllerModelExtension, "footerControllerModelExtension");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventObserver, "homeFeedWidgetsEventObserver");
        Intrinsics.checkNotNullParameter(scrollToTopDispatcher, "scrollToTopDispatcher");
        Intrinsics.checkNotNullParameter(slotChecklistEventHandlerManager, "slotChecklistEventHandlerManager");
        Intrinsics.checkNotNullParameter(slotManagerChecklistsControllerModelExtension, "slotManagerChecklistsControllerModelExtension");
        Intrinsics.checkNotNullParameter(slotManagerPromptsControllerModelExtension, "slotManagerPromptsControllerModelExtension");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(tabAccountsShotDialogActionModelFactory, "tabAccountsShotDialogActionModelFactory");
        Intrinsics.checkNotNullParameter(headerUiParamsProvider, "headerUiParamsProvider");
        Intrinsics.checkNotNullParameter(accountsControllerPerformanceTracker, "accountsControllerPerformanceTracker");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(jointMcyDeeplinkNavigationResolver, "jointMcyDeeplinkNavigationResolver");
        Intrinsics.checkNotNullParameter(planOnboardingControllerModelExtension, "planOnboardingControllerModelExtension");
        Intrinsics.checkNotNullParameter(restrictionsInteractor, "restrictionsInteractor");
        Intrinsics.checkNotNullParameter(addNewProductDestinationFactory, "addNewProductDestinationFactory");
        Intrinsics.checkNotNullParameter(showSwitchingButtonPolicy, "showSwitchingButtonPolicy");
        Intrinsics.checkNotNullParameter(totalWealthInteractor, "totalWealthInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(tabAccountsNudgeControllerModelExtension, "tabAccountsNudgeControllerModelExtension");
        Intrinsics.checkNotNullParameter(accountsNudgeSessionTracker, "accountsNudgeSessionTracker");
        this.o = mapper;
        this.f89707p = inputData;
        this.f89708q = pendingActionsModelExtension;
        this.f89709r = userInteractor;
        this.f89710s = productAccountsInteractor;
        this.f89711t = accountInteractor;
        this.u = accountNotificationExtension;
        this.v = productEventDispatcher;
        this.f89712w = newsManager;
        this.f89713x = deeplinkHandler;
        this.f89714y = userFeaturesChecker;
        this.z = homeNPSWidgetExtension;
        this.A = hiddenAccountsInteractor;
        this.B = hiddenAccountsDialogProvider;
        this.C = slotManagerScreenProvider;
        this.D = slotManagerFeedControllerModelExtension;
        this.E = widgetsControllerModelExtension;
        this.F = persistentModelStateStorage;
        this.G = mainScreenTabEventReceiver;
        this.H = multiAccountUiUtils;
        this.I = adsTrackingControllerModelExtension;
        this.J = featureToggleInteractor;
        this.K = discoverItemsMapper;
        this.L = transactionsPerformanceTracker;
        this.M = footerControllerModelExtension;
        this.N = homeFeedWidgetsEventObserver;
        this.O = scrollToTopDispatcher;
        this.P = slotChecklistEventHandlerManager;
        this.Q = slotManagerChecklistsControllerModelExtension;
        this.R = slotManagerPromptsControllerModelExtension;
        this.S = profileNotificationInteractor;
        this.T = assistantModelExtension;
        this.U = tabAccountsShotDialogActionModelFactory;
        this.V = headerUiParamsProvider;
        this.W = accountsControllerPerformanceTracker;
        this.X = userRegisteredIdentitiesInteractor;
        this.Y = jointMcyDeeplinkNavigationResolver;
        this.Z = planOnboardingControllerModelExtension;
        this.f89699a0 = restrictionsInteractor;
        this.f89700b0 = addNewProductDestinationFactory;
        this.c0 = showSwitchingButtonPolicy;
        this.f89701d0 = totalWealthInteractor;
        this.f89702e0 = clipboard;
        this.f0 = tabAccountsNudgeControllerModelExtension;
        this.g0 = accountsNudgeSessionTracker;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = inputData.f89676a;
        this.f89703h0 = productAccountDescriptor$Value == null;
        final int i = 0;
        TabAccountsScreenContract$State tabAccountsScreenContract$State = new TabAccountsScreenContract$State(null, null, productAccountDescriptor$Value, null, false, 4193279);
        String keyValue = inputData.f89678c.H5();
        Intrinsics.checkNotNullParameter(keyValue, "keyValue");
        this.i0 = mra.d.d(this, keyValue, tabAccountsScreenContract$State, mapper, false, new Function2(this) { // from class: cie.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24502b;

            {
                this.f24502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24502b;
                switch (i2) {
                    case 0:
                        TabAccountsScreenContract$State initialState = (TabAccountsScreenContract$State) obj2;
                        TabAccountsScreenContract$State restoredState = (TabAccountsScreenContract$State) obj3;
                        Intrinsics.checkNotNullParameter(initialState, "initialState");
                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                        ProductAccountDescriptor$Value productAccountDescriptor$ValueE = initialState.k;
                        if (productAccountDescriptor$ValueE == null) {
                            productAccountDescriptor$ValueE = ((t2) ((t3) dVar.f89710s).f289017b).e();
                        }
                        boolean z = (productAccountDescriptor$ValueE instanceof ProductAccountDescriptor$Value.Main) && com.revolut.feature.tab.accounts.impl.ui.tab.d.L2((List) restoredState.f89686c.getContent(), productAccountDescriptor$ValueE) != null;
                        boolean z3 = z && Intrinsics.f(productAccountDescriptor$ValueE, restoredState.k);
                        if (!z) {
                            return initialState;
                        }
                        sjf.e eVar = dVar.L;
                        TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario = TransactionsPerformanceTracker$Scenario.HOME_UI;
                        Boolean bool = Boolean.TRUE;
                        eVar.a(transactionsPerformanceTracker$Scenario, "stateRestored", bool);
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.a("screenStateRestored", false, bool);
                        return TabAccountsScreenContract$State.a(restoredState, null, null, null, null, null, null, z3 ? restoredState.f89687g : initialState.f89687g, null, null, null, (ProductAccountDescriptor$Value.Main) productAccountDescriptor$ValueE, false, null, false, null, null, null, null, null, false, false, dVar.K2((List) restoredState.f89686c.getContent(), productAccountDescriptor$ValueE), 2096063);
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabAccountsScreenContract$ModalStep step = (TabAccountsScreenContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof TabAccountsScreenContract$ModalStep.BackgroundModification) {
                            TabAccountsScreenContract$ModalStep.BackgroundModification backgroundModification = (TabAccountsScreenContract$ModalStep.BackgroundModification) step;
                            ThemedBackgroundKey themedBackgroundKey = backgroundModification.f89679a;
                            em2.b.Companion.getClass();
                            return dVar.e1(new cm2.h(themedBackgroundKey, em2.a.a(), backgroundModification.f89680b));
                        }
                        if (!(step instanceof TabAccountsScreenContract$ModalStep.SlotChecklist)) {
                            if (step instanceof TabAccountsScreenContract$ModalStep.ShotAction) {
                                return dVar.e1(((TabAccountsScreenContract$ModalStep.ShotAction) step).f89681a);
                            }
                            if (!(step instanceof TabAccountsScreenContract$ModalStep.UnhideAccount)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar.B.getClass();
                            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_title, null, null, 14), new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_subtitle, null, null, 14), null, null, false, 28);
                            m6 m6Var = n6.Companion;
                            aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_action_unhide, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                            k9 k9Var = k9.SecurityHub;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                            c7e.i block = new c7e.i(dVar, step, 18);
                            Intrinsics.checkNotNullParameter(block, "block");
                            actionsBottomSheetController.H = block;
                            return actionsBottomSheetController;
                        }
                        f4h.a aVar2 = dVar.P;
                        SlotChecklistPayload payload = ((TabAccountsScreenContract$ModalStep.SlotChecklist) step).f89682a;
                        k9 value = k9.Accounts;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        mp.p eventHandler = (mp.p) aVar2.f132229b;
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                        SlotChecklistController slotChecklistController = new SlotChecklistController(new SlotChecklistControllerContract$InputData(payload, analyticsProduct), eventHandler);
                        ce9.a block2 = new ce9.a(dVar, 10);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        slotChecklistController.H = block2;
                        return slotChecklistController;
                }
            }
        });
        this.j0 = yhm.j.b(new l0(this, 1));
        this.f89704k0 = yhm.j.b(new l0(this, 2));
        this.m0 = new AtomicBoolean(false);
        final int i2 = 1;
        this.p0 = hx7.e.a(this, new Function2(this) { // from class: cie.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24502b;

            {
                this.f24502b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24502b;
                switch (i22) {
                    case 0:
                        TabAccountsScreenContract$State initialState = (TabAccountsScreenContract$State) obj2;
                        TabAccountsScreenContract$State restoredState = (TabAccountsScreenContract$State) obj3;
                        Intrinsics.checkNotNullParameter(initialState, "initialState");
                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                        ProductAccountDescriptor$Value productAccountDescriptor$ValueE = initialState.k;
                        if (productAccountDescriptor$ValueE == null) {
                            productAccountDescriptor$ValueE = ((t2) ((t3) dVar.f89710s).f289017b).e();
                        }
                        boolean z = (productAccountDescriptor$ValueE instanceof ProductAccountDescriptor$Value.Main) && com.revolut.feature.tab.accounts.impl.ui.tab.d.L2((List) restoredState.f89686c.getContent(), productAccountDescriptor$ValueE) != null;
                        boolean z3 = z && Intrinsics.f(productAccountDescriptor$ValueE, restoredState.k);
                        if (!z) {
                            return initialState;
                        }
                        sjf.e eVar = dVar.L;
                        TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario = TransactionsPerformanceTracker$Scenario.HOME_UI;
                        Boolean bool = Boolean.TRUE;
                        eVar.a(transactionsPerformanceTracker$Scenario, "stateRestored", bool);
                        AtomicReference atomicReference = eoi.r.f127969a;
                        eoi.r.a("screenStateRestored", false, bool);
                        return TabAccountsScreenContract$State.a(restoredState, null, null, null, null, null, null, z3 ? restoredState.f89687g : initialState.f89687g, null, null, null, (ProductAccountDescriptor$Value.Main) productAccountDescriptor$ValueE, false, null, false, null, null, null, null, null, false, false, dVar.K2((List) restoredState.f89686c.getContent(), productAccountDescriptor$ValueE), 2096063);
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TabAccountsScreenContract$ModalStep step = (TabAccountsScreenContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof TabAccountsScreenContract$ModalStep.BackgroundModification) {
                            TabAccountsScreenContract$ModalStep.BackgroundModification backgroundModification = (TabAccountsScreenContract$ModalStep.BackgroundModification) step;
                            ThemedBackgroundKey themedBackgroundKey = backgroundModification.f89679a;
                            em2.b.Companion.getClass();
                            return dVar.e1(new cm2.h(themedBackgroundKey, em2.a.a(), backgroundModification.f89680b));
                        }
                        if (!(step instanceof TabAccountsScreenContract$ModalStep.SlotChecklist)) {
                            if (step instanceof TabAccountsScreenContract$ModalStep.ShotAction) {
                                return dVar.e1(((TabAccountsScreenContract$ModalStep.ShotAction) step).f89681a);
                            }
                            if (!(step instanceof TabAccountsScreenContract$ModalStep.UnhideAccount)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar.B.getClass();
                            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_title, null, null, 14), new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_subtitle, null, null, 14), null, null, false, 28);
                            m6 m6Var = n6.Companion;
                            aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_action_unhide, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.account_switcher_hidden_accounts_dialog_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                            k9 k9Var = k9.SecurityHub;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                            c7e.i block = new c7e.i(dVar, step, 18);
                            Intrinsics.checkNotNullParameter(block, "block");
                            actionsBottomSheetController.H = block;
                            return actionsBottomSheetController;
                        }
                        f4h.a aVar2 = dVar.P;
                        SlotChecklistPayload payload = ((TabAccountsScreenContract$ModalStep.SlotChecklist) step).f89682a;
                        k9 value = k9.Accounts;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        mp.p eventHandler = (mp.p) aVar2.f132229b;
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
                        SlotChecklistController slotChecklistController = new SlotChecklistController(new SlotChecklistControllerContract$InputData(payload, analyticsProduct), eventHandler);
                        ce9.a block2 = new ce9.a(dVar, 10);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        slotChecklistController.H = block2;
                        return slotChecklistController;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.tab.accounts.impl.ui.tab.d r5, nie.c r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof cie.r0
            if (r0 == 0) goto L13
            r0 = r7
            cie.r0 r0 = (cie.r0) r0
            int r1 = r0.f24518x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24518x = r1
            goto L18
        L13:
            cie.r0 r0 = new cie.r0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24518x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            nie.c r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2a
            goto L60
        L2a:
            r5 = move-exception
            goto L68
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main
            if (r7 == 0) goto L3f
            r7 = r6
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r7
            goto L40
        L3f:
            r7 = r4
        L40:
            if (r7 != 0) goto L43
            return r4
        L43:
            vge.d r5 = r5.f89711t     // Catch: java.lang.Exception -> L2a
            r0.u = r6     // Catch: java.lang.Exception -> L2a
            r0.f24518x = r3     // Catch: java.lang.Exception -> L2a
            vge.x r5 = (vge.x) r5     // Catch: java.lang.Exception -> L2a
            r5.getClass()     // Catch: java.lang.Exception -> L2a
            c8g.a.c(r7)     // Catch: java.lang.Exception -> L2a
            com.revolut.feature.tab.accounts.models.ProductId r2 = r7.f89727a     // Catch: java.lang.Exception -> L2a
            pfe.b r5 = r5.h(r2)     // Catch: java.lang.Exception -> L2a
            com.revolut.feature.tab.accounts.models.ProductAccountId r7 = r7.f89728b     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = r5.i(r7, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L60
            return r1
        L60:
            boolean r5 = r7 instanceof sfe.z     // Catch: java.lang.Exception -> L2a
            if (r5 != 0) goto L65
            r7 = r4
        L65:
            sfe.z r7 = (sfe.z) r7     // Catch: java.lang.Exception -> L2a
            return r7
        L68:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r6
            com.revolut.feature.tab.accounts.models.ProductId r1 = r6.f89727a
            java.lang.String r1 = r1.getId()
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r6.f89728b
            java.lang.String r6 = r6.f89729a
            java.lang.String r2 = "Failed to load widget context for productId="
            java.lang.String r3 = ", accountId="
            java.lang.String r6 = a0.d.s(r2, r1, r3, r6)
            rd0.d.a(r0, r4, r6, r5, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.ui.tab.d.I2(com.revolut.feature.tab.accounts.impl.ui.tab.d, nie.c, gim.c):java.lang.Object");
    }

    public static AccountContent L2(List list, ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        Object next;
        Object obj2 = null;
        if (list == null || productAccountDescriptor$Value == null) {
            return null;
        }
        List list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            AccountContent accountContent = (AccountContent) next;
            if (accountContent.f89474a == productAccountDescriptor$Value.getF89727a() && Intrinsics.f(accountContent.f89475b.getF89504c(), productAccountDescriptor$Value.getF89728b())) {
                break;
            }
        }
        AccountContent accountContent2 = (AccountContent) next;
        if (accountContent2 != null) {
            return accountContent2;
        }
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            AccountContent accountContent3 = (AccountContent) next2;
            if (accountContent3.f89474a == productAccountDescriptor$Value.getF89727a() && Intrinsics.f(accountContent3.f89475b.getF89504c().f89729a, productAccountDescriptor$Value.getF89728b().f89729a)) {
                obj2 = next2;
                break;
            }
        }
        return (AccountContent) obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.ui.tab.d.I1():void");
    }

    public final Flow J2(Flow flow) {
        return this.l0 ? vkm.q.C(flow, p0.f264002b) : flow;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.p0;
    }

    public final String K2(List list, ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        if (productAccountDescriptor$Value == null || list == null) {
            return null;
        }
        List<AccountContent> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        for (AccountContent accountContent : list2) {
            if (accountContent.f89474a == productAccountDescriptor$Value.getF89727a() && Intrinsics.f(accountContent.f89475b.getF89504c().f89729a, productAccountDescriptor$Value.getF89728b().f89729a)) {
                ProductId f89727a = productAccountDescriptor$Value.getF89727a();
                ProductAccountId f89728b = productAccountDescriptor$Value.getF89728b();
                this.H.getClass();
                return u.a(f89728b, f89727a);
            }
        }
        return null;
    }

    public final Flow M2() {
        return (Flow) this.j0.getValue();
    }

    public final boolean N2(String str) {
        Continuation continuation = null;
        if (d0.J(str, "theme-customisation", false)) {
            l2(new d1(this, false, null, null), new yi5.b(26));
            return true;
        }
        if (this.Q.Z2(str)) {
            return true;
        }
        if (!d0.J(str, "invitation-mcy", false)) {
            return false;
        }
        n2(new y(this, str, continuation, 17), new whi.b(6));
        return true;
    }

    public final void O2(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ProductAccountDescriptor$Value productAccountDescriptor$Value = ((TabAccountsScreenContract$State) ((j2) this.i0.f22677a).getValue()).k;
        if (productAccountDescriptor$Value == null) {
            return;
        }
        n2(new q0(this, productAccountDescriptor$Value, model, null, 1), new whi.b(6));
    }

    @Override // yji.l
    public final void P1() {
        this.f89705n0 = false;
        this.l0 = true;
    }

    public final boolean P2() {
        cli.h hVar = this.i0;
        List<koi.j> list = (List) ((TabAccountsScreenContract$State) ((j2) hVar.f22677a).getValue()).f89688h.getContent();
        if (list != null) {
            int i = 0;
            for (koi.j jVar : list) {
                int i2 = i + 1;
                if (jVar instanceof hg) {
                    hg hgVar = (hg) jVar;
                    List<i> list2 = hgVar.f54247b;
                    int i3 = 0;
                    for (i iVar : list2) {
                        int i5 = i3 + 1;
                        if (iVar instanceof ActionWidgetDelegate.Model) {
                            ActionWidgetDelegate.Model model = (ActionWidgetDelegate.Model) iVar;
                            if (model.f51596l instanceof c0) {
                                ArrayList arrayListF1 = zhm.d0.f1(list2);
                                arrayListF1.set(i3, ActionWidgetDelegate.Model.e(model, null, new AnimationRequest(false), null, 4193279));
                                ArrayList arrayListF12 = zhm.d0.f1(list);
                                arrayListF12.set(i, hg.a(hgVar, arrayListF1, null, 4194301));
                                H2(hVar, new a83.c0(13, arrayListF12));
                                return true;
                            }
                        }
                        i3 = i5;
                    }
                }
                i = i2;
            }
        }
        return false;
    }

    public final void Q2() {
        this.Z.b3();
        gtb.a event = gtb.a.TAB_RESELECTED_WHEN_SCREEN_ALREADY_SCROLLED_UP;
        ntb.c cVar = this.G;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        yji.l.b1(this, new njj.l(new p(cVar.f219012a, event, 22), 1), null, new y0(3, this, continuation), 3);
        x8i.i iVar = (x8i.i) this.f89712w;
        a61.a aVar = iVar.f303414a;
        r map = w.l(((q71.a) aVar.f1531b).b(), (ihm.b) aVar.f1532c).map(new a31.e(new a5g.h(5), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFlatMap = w.l(map, ((g) ((ik3.c) iVar.d).f161878a).f161888g.c()).flatMap(new x8i.g(0, new x8i.f(iVar, 1)));
        zhm.f0 f0Var = zhm.f0.f322471a;
        r rVarDebounce = rVarFlatMap.startWith(f0Var).debounce(50L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        r rVarDistinctUntilChanged = w.m(rVarDebounce, iVar.a(nd0.c.FINCRIME), iVar.a(nd0.c.NEWS)).map(new x0i.i(new x8i.f(iVar, 0), 29)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        yji.l.b1(this, J2(rd0.e.b(ue0.e.E(rVarDistinctUntilChanged, f0Var))), null, new t0(9, this, continuation), 3);
        yji.l.b1(this, J2(vkm.q.Q(mo3.a.g(M2(), null, null, 3), new e1(0, this, continuation))), null, new t0(10, this, continuation), 3);
        gld.f0 f0Var2 = (gld.f0) this.D;
        yji.l.b1(this, J2(f0Var2.f144638l.h()), null, new t0(11, this, continuation), 3);
        a0 a0Var = f0Var2.f144638l;
        yji.l.b1(this, J2(vkm.q.Q(a0Var.o, new gld.c(continuation, a0Var, 3))), null, new t0(12, this, continuation), 3);
        yji.l.b1(this, J2(xam.a.h(new c34.d(new Ref$BooleanRef(), new awd.b(this, continuation, 18), (Continuation) null), M2())), null, new t0(13, this, continuation), 3);
        yji.l.b1(this, J2(vkm.q.Q(M2(), new a67.c((Continuation) null, new Ref$BooleanRef(), new t0(16, this, continuation)))), null, new t0(17, this, continuation), 3);
        yji.l.b1(this, J2(this.S.d()), null, new a2g.q(this, continuation, 7), 3);
        yji.l.b1(this, J2(mo3.a.g(M2(), null, null, 3)), null, new y(this, continuation, 20), 3);
        j jVar = this.Q;
        yji.l.b1(this, jVar.b3(), null, new g1(this, null), 3);
        Lazy lazy = this.f89704k0;
        jVar.d3((Flow) lazy.getValue(), this.l0);
        yji.l.b1(this, J2(this.N.f279000a), null, new u0(this, null), 3);
        yji.l.b1(this, J2(this.T.Z2()), null, new t0(6, this, continuation), 3);
        yji.l.b1(this, J2(vkm.q.Q(vkm.q.q(new ba4.x(mo3.a.g(M2(), null, null, 3), this, 23)), new a67.c((Continuation) null, new Ref$BooleanRef(), new t0(7, this, continuation)))), null, new t0(8, this, continuation), 3);
        this.f0.Z2((Flow) lazy.getValue(), this.l0);
    }

    public final boolean R2() throws Throwable {
        cli.h hVar = this.i0;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = ((TabAccountsScreenContract$State) ((j2) hVar.f22677a).getValue()).k;
        List accounts = (List) ((TabAccountsScreenContract$State) ((j2) hVar.f22677a).getValue()).f89686c.getContent();
        if (accounts == null) {
            accounts = zhm.f0.f322471a;
        }
        if (accounts.isEmpty()) {
            return false;
        }
        vge.x xVar = (vge.x) this.f89711t;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        ProductAccountDescriptor$Value productAccountDescriptor$ValueA = xVar.f289058p.a(accounts);
        if (productAccountDescriptor$ValueA == null) {
            hx7.e.n(new IllegalStateException(j6.a.q("Default account should always be there: ", zhm.d0.k0(accounts, null, "[", "]", 0, new vga.g(9), 25))));
        }
        if (productAccountDescriptor$ValueA == null || productAccountDescriptor$ValueA.equals(productAccountDescriptor$Value)) {
            return false;
        }
        ((t3) this.f89710s).t(productAccountDescriptor$ValueA, tge.b.SWITCHED);
        return true;
    }

    public final void S2(Function1 function1) {
        H2(this.i0, new c7e.i(function1, this, 19));
    }

    @Override // yji.l
    public final void T1(long j2) {
        int i = 1;
        this.f89705n0 = true;
        AtomicReference atomicReference = eoi.r.f127969a;
        int i2 = 0;
        eoi.r.e("screenModelOnShownStarted", false);
        int i3 = 6;
        Continuation continuation = null;
        if (((jte.d) this.J).c(BackendDrivenLimitsApi$Toggles.FincrimeLimitationsApplied.f63191c)) {
            n2(new s0(i, this, continuation), new whi.b(i3));
        }
        int i5 = 3;
        Flow q0Var = new vkm.q0(xam.a.h(new c34.d(new Ref$BooleanRef(), new k1(this, continuation, i2), (Continuation) null), vkm.q.Q(mo3.a.g(M2(), null, null, 3), new e1(i, this, continuation))), new t0(15, this, continuation), 1);
        boolean z = this.f89703h0;
        if (z) {
            q0Var = vkm.q.C(q0Var, p0.f264003c);
        }
        yji.l.b1(this, q0Var, null, null, 7);
        yji.l.b1(this, this.M.Z2(), null, new t0(i5, this, continuation), 3);
        Flow q0Var2 = new vkm.q0(vkm.q.Q(mo3.a.g(M2(), null, null, 3), new a67.c((Continuation) null, new Ref$BooleanRef(), new t0(4, this, continuation))), new t0(5, this, continuation), 1);
        if (z) {
            q0Var2 = vkm.q.C(q0Var2, p0.f264003c);
        }
        yji.l.b1(this, q0Var2, null, null, 7);
        n2(new s0(i5, this, continuation), new whi.b(i3));
        if (!this.l0) {
            Q2();
        }
        this.L.c(TransactionsPerformanceTracker$Scenario.HOME_UI, "onShownFinished");
        eoi.r.e("screenModelOnShownFinished", false);
    }

    @Override // lkd.k
    public final Object Y(SlotContext slotContext, lkd.j jVar, lkd.d dVar, Continuation continuation) {
        return Boolean.valueOf(dVar instanceof lkd.a ? N2(((lkd.a) dVar).f196355a) : false);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.i0;
    }

    @Override // yji.l
    public final n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof sfe.c)) {
            return super.o2(event);
        }
        H2(this.i0, new ce9.a((sfe.c) event, 11));
        return o0.f24508a;
    }
}
