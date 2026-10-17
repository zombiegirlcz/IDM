package com.revolut.feature.pockets.impl.details_v2.pocket_details;

import aii.n;
import ang.f;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.data.model.Data;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig$Close$Destination;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.api.navigation.PocketsListDestination;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$ModalStep;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.statements.api.navigation.AccountConfirmationSelectionDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.IntentCommand;
import efm.r;
import ekg.g;
import ghk.a0;
import gld.f0;
import hea.b0;
import hea.i0;
import hea.n0;
import hea.o;
import hea.p;
import hea.s;
import hea.t;
import hea.u;
import hea.x;
import hea.z;
import io3.i;
import ip0.tm0;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import kda.a;
import kda.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import lkd.k;
import mkd.d;
import mre.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q06.l;
import r10.v;
import sda.e;
import til.m;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.z1;
import w4l.j;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements p, k {

    @NotNull
    public static final s Companion = new s();
    public final n0 A;
    public final d B;
    public final l C;
    public final qh3.a D;
    public final l61.a E;
    public final e F;
    public final b G;
    public final s70.a H;
    public final f I;
    public final wda.b J;
    public final m K;
    public final i4b.f L;
    public final y91.b M;
    public final g N;
    public final c O;
    public final v P;
    public final on2.b Q;
    public final kea.b R;
    public final rea.e S;
    public final z1 T;
    public final y U;
    public final com.revolut.kompot.navigable.vc.modal.a V;
    public final PocketDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gea.a f80858p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rea.m f80859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uea.f f80860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zxd.c f80861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vyd.a f80862t;
    public final j60.a u;
    public final com.revolut.feature.pockets.impl.details_v2.pocket_actions.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ij0.c f80863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n8b.a f80864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c70.a f80865y;
    public final r70.c z;

    public a(PocketDetailsScreenContract$InputData inputData, gea.a pocketActionDialogModelFactory, rea.m pocketDetailsInteractor, uea.f pocketDetailsRepository, zxd.c statementsInteractor, vyd.a statementGenerationDialogFactory, j60.a bottomDialog, com.revolut.feature.pockets.impl.details_v2.pocket_actions.b pocketDetailsActionsContextResolver, ij0.c revolutHostChecker, n8b.a countryInteractor, c70.a clipboard, r70.c hapticEngine, n0 mapper, d slotManagerFeedControllerModelExtension, l deeplinkRouter, qh3.a createCheckoutExtension, l61.a userCompanyInteractor, e pocketDetailsInitialActionMapper, b accountClosureModelExtension, s70.a intentProvider, f userInteractor, wda.b accountDetailsCommonMapper, m workflowFlowDestinationProvider, i4b.f legalEntityContextProvider, y91.b accountsProductFeatureChecker, g uiPersonalisationInteractor, c termsNavigationFactory, v teenPocketResolver, on2.b bankAccountSwitchingFeatureChecker, kea.b accountBalanceLimitExtension, rea.e hideAccountDetailsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pocketActionDialogModelFactory, "pocketActionDialogModelFactory");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementGenerationDialogFactory, "statementGenerationDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(pocketDetailsActionsContextResolver, "pocketDetailsActionsContextResolver");
        Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(createCheckoutExtension, "createCheckoutExtension");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInitialActionMapper, "pocketDetailsInitialActionMapper");
        Intrinsics.checkNotNullParameter(accountClosureModelExtension, "accountClosureModelExtension");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsCommonMapper, "accountDetailsCommonMapper");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(teenPocketResolver, "teenPocketResolver");
        Intrinsics.checkNotNullParameter(bankAccountSwitchingFeatureChecker, "bankAccountSwitchingFeatureChecker");
        Intrinsics.checkNotNullParameter(accountBalanceLimitExtension, "accountBalanceLimitExtension");
        Intrinsics.checkNotNullParameter(hideAccountDetailsInteractor, "hideAccountDetailsInteractor");
        this.o = inputData;
        this.f80858p = pocketActionDialogModelFactory;
        this.f80859q = pocketDetailsInteractor;
        this.f80860r = pocketDetailsRepository;
        this.f80861s = statementsInteractor;
        this.f80862t = statementGenerationDialogFactory;
        this.u = bottomDialog;
        this.v = pocketDetailsActionsContextResolver;
        this.f80863w = revolutHostChecker;
        this.f80864x = countryInteractor;
        this.f80865y = clipboard;
        this.z = hapticEngine;
        this.A = mapper;
        this.B = slotManagerFeedControllerModelExtension;
        this.C = deeplinkRouter;
        this.D = createCheckoutExtension;
        this.E = userCompanyInteractor;
        this.F = pocketDetailsInitialActionMapper;
        this.G = accountClosureModelExtension;
        this.H = intentProvider;
        this.I = userInteractor;
        this.J = accountDetailsCommonMapper;
        this.K = workflowFlowDestinationProvider;
        this.L = legalEntityContextProvider;
        this.M = accountsProductFeatureChecker;
        this.N = uiPersonalisationInteractor;
        this.O = termsNavigationFactory;
        this.P = teenPocketResolver;
        this.Q = bankAccountSwitchingFeatureChecker;
        this.R = accountBalanceLimitExtension;
        this.S = hideAccountDetailsInteractor;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.T = z1VarB;
        this.U = mra.d.b(this, new o(inputData.f80845a, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, inputData.e, inputData.f, new Data(null, null, true, 3, null), hea.c.f151625a, false, null, null, false), mapper, null, false, 12);
        this.V = hx7.e.a(this, new h1c.c(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        ang.b bVar = (ang.b) this.E;
        Continuation continuation = null;
        int i = 3;
        r map = m70.a.g(hng.g.b(bVar.f7765a), null, null, 3).distinctUntilChanged().map(new hae.k(new he4.r(5), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Unit unit = Unit.f186387a;
        int i2 = 1;
        int i3 = 2;
        int i5 = 0;
        yji.l.a1(this, q.Q(q.J(this.T, q.t(rd0.e.b(ue0.e.E(map, unit)), 1)), new u(i, this, continuation)), null, null, null, 7);
        mkd.a aVar = new mkd.a(new SlotContext(akd.s.ACCOUNT_DETAILS));
        f0 f0Var = (f0) this.B;
        f0Var.c3(aVar);
        f0Var.f144638l.f144617b.d = this;
        PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = this.o;
        boolean zF = Intrinsics.f(pocketDetailsScreenContract$InputData.f80850j, PocketDetailsInitialAction.ShowCountryPicker.f80778a);
        y yVar = this.U;
        if (zF) {
            yji.l.a1(this, q.P(q.q(new t0(yVar.B(new he4.r(3)), 1)), 1), null, null, new z(i, this, continuation), 3);
        }
        Flow flowB = yVar.B(new h0() { // from class: hea.d0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((o) obj2).f151646a;
            }
        });
        int i6 = 15;
        yji.l.a1(this, q.Q(q.q(new t0(new a0(flowB, this, i6), 1)), new u(i3, this, continuation)), null, null, new z(i3, this, continuation), 3);
        io3.d dVar = pocketDetailsScreenContract$InputData.f80845a;
        io3.l lVar = dVar.e;
        if ((lVar == io3.l.CURRENT || lVar == io3.l.MERCHANT) && dVar.f163149h == i.INTERNAL) {
            yji.l.a1(this, q.Q(q.q(rd0.e.b(m70.a.g(hng.g.b(bVar.f7765a), null, new hb6.g(i6), 1))), new u(i2, this, continuation)), null, null, new z(i2, this, continuation), 3);
        }
        l2(new hea.y(i5, this, continuation), new yi5.b(26));
        uea.f fVar = this.f80860r;
        fVar.getClass();
        j loadingStrategy = j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.e(mo3.a.g(zi0.c.w(fVar.f279329h.b(unit, loadingStrategy)), null, null, 3), zhm.h0.f322473a, new g23.j(i, 24, continuation)), null, null, new b0(i2, this, continuation), 3);
        l2(new hea.y(i2, this, continuation), new yi5.b(26));
        yji.l.a1(this, this.S.a(), null, null, new b0(i5, this, continuation), 3);
    }

    public final io3.d I2() {
        return ((o) ((j2) this.U.f22677a).getValue()).f151646a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J2(String str) {
        String strH;
        int iHashCode = str.hashCode();
        j60.a aVar = this.u;
        PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = this.o;
        switch (iHashCode) {
            case -2093206470:
                if (str.equals("statementsAction")) {
                    n2(new i0(1, this, null == true ? 1 : 0), new whi.b(6));
                    return;
                }
                return;
            case -1925481207:
                if (str.equals("activateAction")) {
                    n2(new x(this, I2(), pocketDetailsScreenContract$InputData.f80846b, null == true ? 1 : 0, 0), new whi.b(6));
                    return;
                }
                return;
            case -1429827838:
                if (str.equals("accountConfirmation")) {
                    io3.d dVarI2 = I2();
                    x91.a aVarB = this.M.b();
                    int i = aVarB == null ? -1 : t.f151664c[aVarB.ordinal()];
                    if (i == -1) {
                        j7a.g.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = j7a.a.f171876b;
                        String id10 = dVarI2.f163146b;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        C1(u0.b(new ActivityNavigateCommand(explicitActivityDestination, new PdfNativeSaveContract$Configuration(new PdfNativeSaveContract$ProfileConfirmationPayload.Account(id10, dVarI2.e), "PROFILE_CONFIRMATION_FLOW"), null, 505, 0, null, null, null, null, false, 1012)));
                        return;
                    }
                    if (i == 1) {
                        C1(new AccountConfirmationSelectionDestination(pocketDetailsScreenContract$InputData.f80846b, dVarI2.e));
                        return;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yji.l.b1(this, byd.g.a(byd.g.b(rd0.e.b(zxd.c.b(this.f80861s, null, dVarI2.f163146b, dVarI2.e, 5)), X(), this.f80862t)), null, new z(4, this, null == true ? 1 : 0), 3);
                        return;
                    }
                }
                return;
            case -1273536103:
                if (str.equals("LIST_ID_SHARE_BTN")) {
                    o domainState = (o) ((j2) this.U.f22677a).getValue();
                    n0 n0Var = this.A;
                    n0Var.getClass();
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    dda.f fVarA = u0.a(domainState);
                    dda.d dVar = fVarA instanceof dda.d ? (dda.d) fVarA : null;
                    if (dVar == null) {
                        r6.b.D("Actual Account details should be present once details share requested");
                        strH = null;
                    } else {
                        strH = n0Var.f151645c.h(dVar, domainState.f151646a.f163147c);
                    }
                    if (strH != null) {
                        C1(new BridgeDestination(new IntentCommand(((s70.b) this.H).f("", strH, null), null)));
                        return;
                    }
                    return;
                }
                return;
            case -906264498:
                if (str.equals("seeAll")) {
                    n2(new i0(0, this, null == true ? 1 : 0), new whi.b(6));
                    return;
                }
                return;
            case -885490325:
                if (str.equals("ACTION_ID_CLOSE_ACCOUNT")) {
                    n2(new hea.y(4, this, null == true ? 1 : 0), new whi.b(6));
                    return;
                }
                return;
            case -481512420:
                if (str.equals("ribActionId")) {
                    n2(new h54.o(this, I2(), null == true ? 1 : 0, 23), new whi.b(6));
                    return;
                }
                return;
            case 160965119:
                if (str.equals("ID_GOT_IT_BTN")) {
                    j60.a.v(aVar, false, null, 3);
                    return;
                }
                return;
            case 499585994:
                if (str.equals("deactivateAction")) {
                    io3.d pocket = I2();
                    this.f80858p.getClass();
                    Intrinsics.checkNotNullParameter(pocket, "pocket");
                    long j2 = pocket.i;
                    String str2 = pocket.f163147c;
                    aVar.x(j2 == 0 ? new rp0.y(zhm.u.c(new um0("hide_pocket_options", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_yes, null, null, 14), false, null, null, 56), (Object) pocket, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new rp0.t(new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_hide_title, zhm.u.c(str2), null, 12), new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_hide_description, null, null, 14), null, 28), null, null, null, null, 1020) : new rp0.y(zhm.u.c(new um0("LIST_ID_DEACTIVATE_OPTIONS_BTN", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_yes, null, null, 14), false, null, null, 56), (Object) pocket, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new rp0.t(new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_deactivate_title, zhm.u.c(str2), null, 12), new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_deactivate_description, null, null, 14), null, 28), null, null, null, null, 1020));
                    return;
                }
                return;
            case 582103909:
                if (str.equals("LIST_OF_POCKETS_BANNER_ID")) {
                    PocketListType pocketListTypeM2 = M2(pocketDetailsScreenContract$InputData.f80845a);
                    if (pocketListTypeM2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C1(new PocketsListDestination(pocketListTypeM2));
                    return;
                }
                return;
            case 690160855:
                if (str.equals("helpAction")) {
                    C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
                    return;
                }
                return;
            case 1606409697:
                if (str.equals("accountCloseAction")) {
                    AccountId accountId = pocketDetailsScreenContract$InputData.f80846b;
                    AccountId.Joint joint = (AccountId.Joint) (accountId instanceof AccountId.Joint ? accountId : null);
                    if (joint == null) {
                        return;
                    }
                    C1(new JointAccountsFeatureConfig$Close$Destination(joint, JointAccountCloseReason.UserIntention.f76466a));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.V;
    }

    public final void K2(Object obj2, String id10) throws Throwable {
        Intrinsics.checkNotNullParameter(id10, "id");
        boolean zH = kotlin.text.a0.H(id10, "ID_CLAUSE_ITEM", false);
        j60.a aVar = this.u;
        Continuation continuation = null;
        if (zH) {
            j60.a.v(aVar, false, null, 3);
        }
        if (id10.equals("FSCS_FOOTER_CLICK_ID")) {
            l2(new hea.y(2, this, continuation), new yi5.b(26));
            return;
        }
        if (obj2 instanceof wda.e) {
            wda.d dVar = ((wda.e) obj2).f296478b;
            this.f80858p.getClass();
            aVar.x(gea.a.b(dVar));
            return;
        }
        if (obj2 instanceof wda.c) {
            n2(new h54.o(this, ((wda.c) obj2).f296473b, continuation, 22), new whi.b(6));
            return;
        }
        if (!(obj2 instanceof wda.g)) {
            hx7.e.n(new IllegalArgumentException(a0.d.m(obj2, "Unsupported highlight object ")));
            return;
        }
        wda.g gVar = (wda.g) obj2;
        String str = gVar.f296482b;
        ArrayList<wda.f> arrayList = gVar.f296483c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (wda.f fVar : arrayList) {
            arrayList2.add(new PocketDetailsScreenContract$ModalStep.PopupListDialog.PopupListItem(fVar.f296479a, fVar.f296480b));
        }
        h.v2(this.V, new PocketDetailsScreenContract$ModalStep.PopupListDialog(str, arrayList2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void L2(dda.k kVar) {
        y yVar = this.U;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        wi0.b selected = ((o) j2Var.getValue()).f151650h;
        if (selected == null) {
            selected = kVar.f113182b;
        }
        xi0.b currency = z92.f.l(((o) j2Var2.getValue()).f151646a);
        PocketListType pocketListTypeM2 = M2(((o) j2Var2.getValue()).f151646a);
        PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = this.o;
        if (pocketListTypeM2 == null) {
            hx7.e.n(new IllegalArgumentException("PocketType " + pocketDetailsScreenContract$InputData.f80845a.e + " is not supported for currency selection"));
            pocketListTypeM2 = PocketListType.Main.f80780a;
        }
        o oVar = (o) j2Var2.getValue();
        if (pocketDetailsScreenContract$InputData.f80848g && !((o8b.c) this.f80864x).g() && M2(oVar.f151646a) != null) {
            h.v2(this.V, new PocketDetailsScreenContract$ModalStep.PocketList(pocketListTypeM2, currency, selected), ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (kVar.f113183c.size() > 1) {
            ArrayList<wi0.b> all2 = kVar.f113183c;
            n0 n0Var = this.A;
            n0Var.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(selected, "selected");
            Intrinsics.checkNotNullParameter(all2, "all");
            rp0.t tVar = new rp0.t(new TextLocalisedClause(com.revolut.feature.pockets.impl.R$string.revolut_accounts_country_selection_title, zhm.u.c(new CurrencyClause(currency, null, null, 6)), null, 12), null, null, 30);
            rp0.l lVar = rp0.l.WINDOW;
            ArrayList arrayList = new ArrayList(w.t(all2, 10));
            for (wi0.b bVar : all2) {
                boolean zF = Intrinsics.f(bVar, selected);
                arrayList.add(new RowDelegate.Model(j6.a.q("COUNTRY_ITEM_ID_", bVar.f297794a), new RowDelegate.Model.MainImage.Image40(new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14), zF ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), new CountryClause(bVar, null), null, 0, null, null, null, 0, null, false, null, zF, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532668408));
            }
            List listP0 = d0.P0(arrayList, new fad.i(n0Var, 17));
            yp0.b.k(listP0, 0, 0, 0, 0, 31);
            this.u.x(new rp0.y(listP0, tVar, lVar, null, null, null, 1016));
        }
    }

    public final PocketListType M2(io3.d dVar) {
        int i = t.f151662a[dVar.e.ordinal()];
        if (i == 1) {
            AccountId accountId = this.o.f80846b;
            AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
            return joint != null ? new PocketListType.Joint(joint) : PocketListType.Main.f80780a;
        }
        if (i == 2) {
            return PocketListType.Pro.f80781a;
        }
        if (i != 3) {
            return null;
        }
        return PocketListType.RevXFiat.f80782a;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, ((f0) this.B).f144638l.h(), null, new z(5, this, null), 3);
    }

    @Override // lkd.k
    public final Object Y(SlotContext slotContext, lkd.j jVar, lkd.d dVar, Continuation continuation) {
        if (slotContext.f87254a != akd.s.ACCOUNT_DETAILS) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (dVar instanceof lkd.a) {
            String deeplink = ((lkd.a) dVar).f196355a;
            if (kotlin.text.d0.J(deeplink, "account", false)) {
                e eVar = this.F;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                jf0.c cVarD = ((s06.c) eVar.f261843a).d(deeplink);
                PocketDetailsInitialAction.ShowCountryPicker showCountryPickerA = cVarD != null ? eVar.a(cVarD) : null;
                if (Intrinsics.f(showCountryPickerA, PocketDetailsInitialAction.ShowCountryPicker.f80778a)) {
                    dda.k kVar = ((o) ((j2) this.U.f22677a).getValue()).f151649g;
                    if (kVar != null) {
                        L2(kVar);
                    }
                    z = true;
                } else if (showCountryPickerA != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (!(dVar instanceof lkd.b) && !(dVar instanceof lkd.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.valueOf(z);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.U;
    }

    @Override // yji.l
    public final n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof a.C1045a) {
            this.T.k(Unit.f186387a);
            return null;
        }
        if (!(event instanceof kea.a)) {
            return super.o2(event);
        }
        H2(this.U, new ax9.j(event, 2));
        return null;
    }
}
