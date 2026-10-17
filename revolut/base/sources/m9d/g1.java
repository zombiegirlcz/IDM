package m9d;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.chat.navigation.InboxDestination;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementIncidentItem;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.limits.api.navigation.LimitsFeatureConfig;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kkf.z7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.a3;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class g1 extends jki.g implements d0 {
    public final wf0.m0 A;
    public final mde.e B;
    public final HelpFlowContract$InputData C;
    public final o7d.b D;
    public final kge.d E;
    public final lde.j F;
    public final lde.n G;
    public final mse.a H;
    public final use.d I;
    public final jid.z J;
    public final x8d.a K;
    public final lde.m L;
    public final l9d.e M;
    public final NewTicketContext N;
    public final z O;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lde.a f203698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s7d.e f203699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ie.a f203700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final md0.b f203701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e8d.a f203702t;
    public final j30.c u;
    public final n30.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n30.x f203703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wli.x f203704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k18.c f203705y;
    public final wf0.u0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(jki.p stateMapper, lde.a backgroundsProvider, s7d.e callRequestItemsDelegate, ie.a cardsTroubleshooterInteractor, md0.b chaosManagementInteractor, e8d.a chatButtonItemProvider, j30.c chatFeatureToggles, n30.n chatInteractor, n30.x chatPricingPlanInteractor, wli.x deeplinkHandler, k18.c faqProvider, wf0.u0 helpCenterRepository, wf0.m0 helpCenterInteractor, mde.e helpDestinationProvider, HelpFlowContract$InputData inputData, o7d.b localSettingsRepository, kge.d sharedHelpBannerInteractor, lde.j sharedHelpQuickActionsInteractor, lde.n sharedHelpWidgetsInteractor, mse.a ticketsWidgetControllerExtension, use.d ticketsInteractor, jid.z titlesProvider, x8d.a topLevelFaqExtension, lde.m transactionItemsDelegate, l9d.e troubleshooterWidgetInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(backgroundsProvider, "backgroundsProvider");
        Intrinsics.checkNotNullParameter(callRequestItemsDelegate, "callRequestItemsDelegate");
        Intrinsics.checkNotNullParameter(cardsTroubleshooterInteractor, "cardsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(chaosManagementInteractor, "chaosManagementInteractor");
        Intrinsics.checkNotNullParameter(chatButtonItemProvider, "chatButtonItemProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatPricingPlanInteractor, "chatPricingPlanInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(helpCenterRepository, "helpCenterRepository");
        Intrinsics.checkNotNullParameter(helpCenterInteractor, "helpCenterInteractor");
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(localSettingsRepository, "localSettingsRepository");
        Intrinsics.checkNotNullParameter(sharedHelpBannerInteractor, "sharedHelpBannerInteractor");
        Intrinsics.checkNotNullParameter(sharedHelpQuickActionsInteractor, "sharedHelpQuickActionsInteractor");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(ticketsWidgetControllerExtension, "ticketsWidgetControllerExtension");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(titlesProvider, "titlesProvider");
        Intrinsics.checkNotNullParameter(topLevelFaqExtension, "topLevelFaqExtension");
        Intrinsics.checkNotNullParameter(transactionItemsDelegate, "transactionItemsDelegate");
        Intrinsics.checkNotNullParameter(troubleshooterWidgetInteractor, "troubleshooterWidgetInteractor");
        this.f203698p = backgroundsProvider;
        this.f203699q = callRequestItemsDelegate;
        this.f203700r = cardsTroubleshooterInteractor;
        this.f203701s = chaosManagementInteractor;
        this.f203702t = chatButtonItemProvider;
        this.u = chatFeatureToggles;
        this.v = chatInteractor;
        this.f203703w = chatPricingPlanInteractor;
        this.f203704x = deeplinkHandler;
        this.f203705y = faqProvider;
        this.z = helpCenterRepository;
        this.A = helpCenterInteractor;
        this.B = helpDestinationProvider;
        this.C = inputData;
        this.D = localSettingsRepository;
        this.E = sharedHelpBannerInteractor;
        this.F = sharedHelpQuickActionsInteractor;
        this.G = sharedHelpWidgetsInteractor;
        this.H = ticketsWidgetControllerExtension;
        this.I = ticketsInteractor;
        this.J = titlesProvider;
        this.K = topLevelFaqExtension;
        this.L = transactionItemsDelegate;
        this.M = troubleshooterWidgetInteractor;
        this.N = inputData.f86374c;
        this.O = new z(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true, true, new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false);
    }

    public static final void y2(g1 g1Var, Throwable th10) {
        g1Var.getClass();
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, null, null, th10, h0Var);
        g1Var.X1(new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new TextLocalisedClause(R$string.common_action_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(m9d.g1 r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9d.g1.z2(m9d.g1, gim.c):java.lang.Object");
    }

    public final void A2(String str) {
        if (this.f203704x.y1(str)) {
            n2(new o0(this, str, null, 1), new whi.b(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof m9d.s0
            if (r0 == 0) goto L13
            r0 = r8
            m9d.s0 r0 = (m9d.s0) r0
            int r1 = r0.f203739w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203739w = r1
            goto L18
        L13:
            m9d.s0 r0 = new m9d.s0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203739w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            kotlinx.coroutines.flow.Flow r8 = r7.q2()
            m84.c r2 = new m84.c
            r4 = 2
            r5 = 1
            r6 = 0
            r2.<init>(r4, r5, r6)
            r0.f203739w = r3
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            m9d.z r8 = (m9d.z) r8
            com.revolut.chat.domain.model.ChatMode r8 = r8.o
            com.revolut.chat.domain.model.ChatMode$SingleFeed r0 = com.revolut.chat.domain.model.ChatMode.SingleFeed.f51045a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m9d.g1.B2(gim.c):java.lang.Object");
    }

    public final void C2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        boolean zF = Intrinsics.f(itemId, "SEARCH_ITEM_ID");
        int i = 6;
        int i2 = 0;
        HelpFlowContract$InputData helpFlowContract$InputData = this.C;
        Continuation continuation = null;
        if (zF || Intrinsics.f(itemId, "SEARCH_MENU_ID")) {
            SharedFaqDestination.StartPoint.Search search = new SharedFaqDestination.StartPoint.Search(null);
            SharedFaqDestination.PassthroughData passthroughData = new SharedFaqDestination.PassthroughData(helpFlowContract$InputData.f86374c, false, false, 6);
            TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
            C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) search, passthroughData, false, 8));
            return;
        }
        if (Intrinsics.f(itemId, "ARCHIVED_REQUESTS_ITEM_ID")) {
            D2();
            return;
        }
        this.L.getClass();
        if (obj2 instanceof a3) {
            n2(new p0(this, obj2, null), new whi.b(i));
            return;
        }
        this.f203699q.getClass();
        if ((obj2 instanceof r40.l) || (obj2 instanceof r40.k)) {
            l2(new r0(this, obj2, null), new yi5.b(26));
            return;
        }
        if (Intrinsics.f(itemId, "ACTION_REQUESTS_HEADER_ITEM_ID")) {
            D2();
            return;
        }
        if (Intrinsics.f(itemId, "FREQUENTLY_ASKED_QUESTIONS_ITEM_ID")) {
            C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.TopLevelFaq((List) ((z) t2()).f203757j.getContent()), (SharedFaqDestination.PassthroughData) null, false, 14));
            return;
        }
        if (obj2 instanceof FaqNodeBase) {
            this.K.e3((FaqNodeBase) obj2, helpFlowContract$InputData.f86374c);
            return;
        }
        int i3 = 4;
        if (Intrinsics.f(itemId, "FAQ_LOADING_ERROR_ITEM_ID")) {
            n2(new c1(this, continuation, i3), new whi.b(i));
            return;
        }
        if (Intrinsics.f(itemId, "ACTION_REQUESTS_ALL_ITEM_ID")) {
            D2();
            return;
        }
        if (Intrinsics.f(itemId, "SUGGESTED_ARTICLE_ITEM_ID")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(kotlin.text.d0.v0(str, "faq?key=", str), 6), new SharedFaqDestination.PassthroughData(helpFlowContract$InputData.f86374c, false, false, 6), false, 12));
            return;
        }
        int i5 = 2;
        if (Intrinsics.f(itemId, "QUICK_HELP_SEE_MORE")) {
            x2(new k0(this, i5));
            return;
        }
        int i6 = 3;
        if (Intrinsics.f(itemId, "ACTIVE_REQUESTS_SEE_MORE")) {
            x2(new k0(this, i6));
            return;
        }
        if (obj2 instanceof cj0.a) {
            String deeplink = ((cj0.a) obj2).f24568b;
            this.F.getClass();
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/help-with-card")) {
                n2(new c1(this, continuation, i5), new whi.b(i));
                return;
            }
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/view-card-pin")) {
                n2(new c1(this, continuation, i6), new whi.b(i));
                return;
            }
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            String lowerCase = deeplink.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.f(lowerCase, "revolut://app/account-limits/atm")) {
                if (C1(new BridgeDestination(gc0.c.f(new LimitsFeatureConfig.LimitPrompt(com.revolut.retail.feature.limits.api.navigation.a.ATM)))) == null) {
                    A2(deeplink);
                    Unit unit = Unit.f186387a;
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/cancel-transfer")) {
                n2(new o0(this, deeplink, continuation, i5), new whi.b(i));
                return;
            }
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (Intrinsics.f(deeplink, "revolut://app/help/quick-action/dispute-transaction")) {
                n2(new o0(this, deeplink, continuation, i6), new whi.b(i));
                return;
            } else {
                A2(deeplink);
                return;
            }
        }
        this.f203702t.getClass();
        if (Intrinsics.f(itemId, "CHAT_BUTTON_ITEM_ID") || Intrinsics.f(itemId, "LIST_ID_NEW_CHAT") || Intrinsics.f(itemId, "SINGLE_FEED_ENTRY_POINT_ID")) {
            n2(new c1(this, continuation, i2), new lrk.h(1, this, g1.class, "handleChatWithUsClickError", "handleChatWithUsClickError(Ljava/lang/Throwable;)Z", 0, 16));
            return;
        }
        if (Intrinsics.f(itemId, "INBOX_BANNER_ITEM_ID")) {
            C1(InboxDestination.f51112b);
            return;
        }
        if (this.f203700r.f(itemId)) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
            C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardTroubleshooter((String) obj2, null, false), new SharedFaqDestination.PassthroughData(helpFlowContract$InputData.f86374c, false, false, 6), false, 12));
            return;
        }
        if (obj2 instanceof ChaosManagementIncidentItem.Banner.ActionButton) {
            String strE0 = kotlin.text.d0.e0(itemId, "INCIDENT_ITEM_ID.");
            com.revolut.core.chaosmanagement.domain.model.a aVar = ((ChaosManagementIncidentItem.Banner.ActionButton) obj2).f51351c;
            int i21 = aVar == null ? -1 : m0.f203725a[aVar.ordinal()];
            if (i21 != -1) {
                if (i21 == 1) {
                    n2(new o0(this, strE0, continuation, i2), new whi.b(i));
                    return;
                } else if (i21 == 2) {
                    n2(new o0(this, strE0, continuation, i3), new whi.b(i));
                    return;
                } else {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            return;
        }
        if (this.H.Z2(obj2, itemId)) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported item: " + itemId + ", " + obj2);
        od0.a aVar2 = od0.a.f224253a;
        if (od0.a.f()) {
            throw illegalStateException;
        }
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void D2() {
        C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 13), true));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, (j2) ((tse.i) this.H).f274111q.f22677a, null, null, new t0(this, null, 7), 3);
        yji.l.a1(this, rd0.e.b(this.f203703w.a()), null, null, new t0(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        vkm.d dVarB = rd0.e.b(((md0.e) this.f203701s).a());
        int i = 3;
        Continuation continuation = null;
        im2.b bVar = new im2.b(i, 15, continuation);
        zhm.h0 h0Var = zhm.h0.f322473a;
        vkm.y yVarE = rd0.e.e(dVarB, h0Var, bVar);
        kge.d dVar = this.E;
        sfm.b bVar2 = new sfm.b(((cpj.b) ((xoj.a) dVar.f183975c)).f(yoj.c.KYC_VERIFICATION, yoj.d.ENABLED), new lak.i(new laj.b(dVar, 10), 16), 2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
        yji.l.b1(this, new t38.e(yVarE, 24, rd0.e.e(rd0.e.b(bVar2), h0Var, new im2.b(i, 16, continuation)), new v0(this, continuation, 2)), null, null, 7);
        n2(new c1(this, continuation, 1), new whi.b(6));
        lde.n nVar = this.G;
        nVar.getClass();
        yji.l.b1(this, wf0.m0.a(this.A), null, new t0(this, null, 5), 3);
        x4l.c cVar = this.z.f;
        Unit unit = Unit.f186387a;
        yji.l.b1(this, cVar.c(unit, false), null, new t0(this, null, 6), 3);
        yji.l.b1(this, this.f203705y.w(false), null, new t0(this, null, 1), 3);
        Flow flowQ = vkm.q.q(nim.a.A(boh.f.e(new v1(new p0(this, null)), new k0(this, 1)), new l0(3)));
        qse.i iVar = this.I.f282891a;
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarFilter = iVar.f.e(unit, loadingStrategy).filter(new qsa.a(9, new qsa.p(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filterEmptyData(...)");
        yji.l.b1(this, nim.a.v(zh9.u0.m(flowQ, vkm.q.q(nim.a.A(nim.a.v(nim.a.v(rd0.e.b(rVarFilter), new urd.y(12)), new l0(1)), new l0(2)))), new k0(this, 0)), null, new t0(this, null, 4), 3);
        j30.c cVar2 = this.u;
        cVar2.getClass();
        x2(new l0(0));
        akg.n nVarV = nim.a.v(zi0.c.w(this.f203698p.f194073a.g(RetailBackgroundKey.HelpCentre.f63828a)), new lbh.a(12));
        jid.z zVar = this.J;
        yji.l.b1(this, new t38.e(nVarV, 24, new z7(rd0.e.b(((ang.f) zVar.f174462c).k(false)), zVar, 23), new v0(this, continuation, 1)), null, null, 7);
        yji.l.b1(this, nim.a.u(new ie6.q(2, 21, continuation), rd0.e.b(nVar.f194090b.q())), null, new t0(this, null, 3), 3);
        Boolean bool = (Boolean) this.D.f222769a.T2("inbox_dismissed", Boolean.TYPE);
        x2(new lph.c(bool != null ? bool.booleanValue() : false, 4));
        if (((rf3.d) cVar2).b() == j30.b.PARTIALLY_ENABLED) {
            yji.l.b1(this, this.v.i(w4l.j.f294644c), null, new t0(this, null, 2), 3);
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.O;
    }
}
