package nwc;

import aw0.p0;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreen;
import com.revolut.feature.card_management.impl.cardlimit.screens.overview.CardLimitOverviewScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreen;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreen;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreen;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreen;
import com.revolut.feature.statements.impl.documents_hub.domain.DocumentsHubMappingException;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import dx4.a1;
import ip0.r40;
import iyd.j0;
import iyd.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationException;
import l29.a;
import m1c.p1;
import m9d.w0;
import n29.e0;
import n29.k0;
import n29.v;
import njj.n0;
import nxa.t0;
import nya.b0;
import o29.y;
import o29.z;
import vkm.j2;
import vu3.s;
import vu3.t;
import w19.g;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f219819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f219819w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f((WealthProtectionScreen) this.f219819w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f((TransportLocationChooserScreen) this.f219819w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f((nwf.l) this.f219819w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                return new f((nx1.h) this.v, (String) this.f219819w, continuation, 3);
            case 4:
                f fVar4 = new f((PersonalizedTrackingController) this.f219819w, continuation, 4);
                fVar4.v = obj2;
                return fVar4;
            case 5:
                f fVar5 = new f((DirectDebitAccountConfirmationScreen) this.f219819w, continuation, 5);
                fVar5.v = obj2;
                return fVar5;
            case 6:
                f fVar6 = new f((nyd.k) this.f219819w, continuation, 6);
                fVar6.v = ((gyd.d) obj2).f147844a;
                return fVar6;
            case 7:
                f fVar7 = new f((nyd.k) this.f219819w, continuation, 7);
                fVar7.v = obj2;
                return fVar7;
            case 8:
                f fVar8 = new f((CardLimitOverviewScreen) this.f219819w, continuation, 8);
                fVar8.v = obj2;
                return fVar8;
            case 9:
                f fVar9 = new f((com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) this.f219819w, continuation, 9);
                fVar9.v = obj2;
                return fVar9;
            case 10:
                f fVar10 = new f((o07.d) this.f219819w, continuation, 10);
                fVar10.v = obj2;
                return fVar10;
            case 11:
                f fVar11 = new f((o0b.e) this.f219819w, continuation, 11);
                fVar11.v = obj2;
                return fVar11;
            case 12:
                f fVar12 = new f((FreelancerSaleDetailsScreen) this.f219819w, continuation, 12);
                fVar12.v = obj2;
                return fVar12;
            case 13:
                f fVar13 = new f((o24.e) this.f219819w, continuation, 13);
                fVar13.v = obj2;
                return fVar13;
            case 14:
                f fVar14 = new f((aah.g) this.f219819w, continuation, 14);
                fVar14.v = obj2;
                return fVar14;
            case 15:
                f fVar15 = new f((com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f219819w, continuation, 15);
                fVar15.v = obj2;
                return fVar15;
            case 16:
                f fVar16 = new f((o29.d) this.f219819w, continuation, 16);
                fVar16.v = obj2;
                return fVar16;
            case 17:
                f fVar17 = new f((z) this.f219819w, continuation, 17);
                fVar17.v = obj2;
                return fVar17;
            case 18:
                f fVar18 = new f((o2g.e) this.f219819w, continuation, 18);
                fVar18.v = obj2;
                return fVar18;
            case 19:
                return new f((o36.d) this.v, (wd6.e) this.f219819w, continuation, 19);
            case 20:
                f fVar19 = new f((o42.k) this.f219819w, continuation, 20);
                fVar19.v = obj2;
                return fVar19;
            case 21:
                f fVar20 = new f((CreditAddressSearchScreen) this.f219819w, continuation, 21);
                fVar20.v = obj2;
                return fVar20;
            case 22:
                f fVar21 = new f((o44.m) this.f219819w, continuation, 22);
                fVar21.v = obj2;
                return fVar21;
            case 23:
                f fVar22 = new f((o4b.b) this.f219819w, continuation, 23);
                fVar22.v = obj2;
                return fVar22;
            case 24:
                f fVar23 = new f((o5g.i) this.f219819w, continuation, 24);
                fVar23.v = obj2;
                return fVar23;
            case 25:
                f fVar24 = new f((g7f.b) this.f219819w, continuation, 25);
                fVar24.v = obj2;
                return fVar24;
            case 26:
                f fVar25 = new f((o6f.m) this.f219819w, continuation, 26);
                fVar25.v = obj2;
                return fVar25;
            case 27:
                f fVar26 = new f((k7i.i) this.f219819w, continuation, 27);
                fVar26.v = obj2;
                return fVar26;
            case 28:
                f fVar27 = new f((CobrandedCardsPlanHubRewardSelectionScreen) this.f219819w, continuation, 28);
                fVar27.v = obj2;
                return fVar27;
            default:
                f fVar28 = new f((o7b.h) this.f219819w, continuation, 29);
                fVar28.v = obj2;
                return fVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create(new gyd.d(((gyd.d) obj2).f147844a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((nyd.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((nz2.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((jz2.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((o0b.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((r40) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((o24.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((p0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [z19.d] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Throwable th10;
        Throwable th11;
        s sVar;
        ArrayList arrayList;
        h24.n nVar;
        vu3.q qVar;
        ArrayList arrayList2;
        String str;
        s sVar2;
        ArrayList arrayList3;
        vu3.q qVar2;
        vu3.g gVar;
        vu3.i iVar;
        vu3.q qVar3;
        vu3.j jVar;
        h24.n nVar2;
        a1 a1Var;
        a1 a1Var2;
        Iterator it8;
        z19.h fVar;
        int i = this.u;
        int i2 = 17;
        int i3 = 8;
        int i5 = 12;
        int i6 = 10;
        Object obj3 = null;
        Object obj4 = this.f219819w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarD3 = ((WealthProtectionScreen) obj4).R2();
                Intrinsics.h(itemId);
                p pVar = (p) lVarD3;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "WEALTH_PROTECTION_FAQ_MENU_ITEM_ID")) {
                    pVar.C2(i.f219825a);
                }
                return Unit.f186387a;
            case 1:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nwf.h hVar = (nwf.h) ((TransportLocationChooserScreen) obj4).Y.getValue();
                Intrinsics.h(str2);
                String query = d0.F0(str2).toString();
                nwf.l lVar = (nwf.l) hVar;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lVar.x2(new nj8.b(query, i2));
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((nwf.l) obj4).x2(new nsl.g(data, i5));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(((nx1.h) this.v).f220063a.I0((String) obj4));
            case 4:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nxa.p pVarE3 = ((PersonalizedTrackingController) obj4).R2();
                Intrinsics.h(clickData);
                com.revolut.feature.referrals.impl.personalized_tracking.a aVar6 = (com.revolut.feature.referrals.impl.personalized_tracking.a) pVarE3;
                cli.y yVar = aVar6.f81799x;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Clause clause = clickData.f275447c;
                String str3 = clickData.f275445a;
                if (clause instanceof HtmlClause) {
                    aVar6.l2(new n0(aVar6, clickData, null, 28), new yi5.b(26));
                } else if (Intrinsics.f(str3, "TERMS_CLICK_ITEM_ID")) {
                    t0 t0Var = (t0) ((nxa.l) ((j2) yVar.f22677a).getValue()).f220502b.getContent();
                    if (t0Var != null) {
                        th11 = null;
                        if (aVar6.C1(new ExternalDestination.Browser(t0Var.d, null)) == null) {
                        }
                    } else {
                        th11 = null;
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PersonalizedTrackingControllerModel", "Content is null when Terms clicked", th11, h0Var);
                    Unit unit = Unit.f186387a;
                } else if (Intrinsics.f(str3, "RISK_CLICK_ITEM_ID")) {
                    t0 t0Var2 = (t0) ((nxa.l) ((j2) yVar.f22677a).getValue()).f220502b.getContent();
                    if (t0Var2 != null) {
                        th10 = null;
                        if (aVar6.C1(new ExternalDestination.Browser(t0Var2.e, null)) == null) {
                        }
                    } else {
                        th10 = null;
                    }
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PersonalizedTrackingControllerModel", "Content is null when Risk clicked", th10, h0Var2);
                    Unit unit2 = Unit.f186387a;
                }
                return Unit.f186387a;
            case 5:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ny4.k kVar = (ny4.k) ((DirectDebitAccountConfirmationScreen) obj4).Y.getValue();
                String deeplink = aVar7.f275445a;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                kVar.n2(new n0(kVar, deeplink, null, 29), new whi.b(6));
                return Unit.f186387a;
            case 6:
                String str4 = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nyd.k kVar2 = (nyd.k) obj4;
                String strB = nyd.k.b(kVar2, str4);
                ue0.c cVar = kVar2.f220861c;
                try {
                    j0 j0Var = (j0) cVar.T2(strB, wim.z.d(o0.b(j0.class)));
                    if (j0Var != null) {
                        return mra.d.b0(j0Var);
                    }
                } catch (DocumentsHubMappingException unused) {
                    cVar.I0(strB);
                } catch (SerializationException unused2) {
                    cVar.I0(strB);
                }
                return null;
            case 7:
                nyd.f fVar2 = (nyd.f) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String strE = nyd.k.e(fVar2);
                ue0.c cVar2 = ((nyd.k) obj4).f220861c;
                try {
                    m0 m0Var = (m0) cVar2.T2(strE, wim.z.d(o0.b(m0.class)));
                    if (m0Var != null) {
                        return mra.d.d0(m0Var);
                    }
                } catch (DocumentsHubMappingException unused3) {
                    cVar2.I0(strE);
                } catch (SerializationException unused4) {
                    cVar2.I0(strE);
                }
                return null;
            case 8:
                nz2.o event = (nz2.o) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar12 = (com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) ((nz2.j) ((CardLimitOverviewScreen) obj4).M.getValue());
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof nz2.l) {
                    aVar12.I2();
                } else if (event instanceof nz2.m) {
                    aVar12.B2();
                } else {
                    if (!(event instanceof nz2.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jz2.a aVar13 = ((nz2.h) ((j2) aVar12.f64833s.f22677a).getValue()).f220940a;
                    if (aVar13 != null ? aVar13.e : false) {
                        oki.h.v2(aVar12.f64834t, CardLimitOverviewScreenContract$ModalStep.RemoveLimit.f64829a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        aVar12.I2();
                    }
                }
                return Unit.f186387a;
            case 9:
                jz2.a aVar14 = (jz2.a) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar16 = (com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) obj4;
                aVar16.H2(aVar16.f64833s, new b0(aVar14, 10));
                return Unit.f186387a;
            case 10:
                Pair pair = (Pair) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o07.d) obj4).x2(new w0((Data) pair.f186385a, (Data) pair.f186386b, 4));
                return Unit.f186387a;
            case 11:
                o0b.a aVar18 = (o0b.a) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(c1b.g.class, ((o0b.e) obj4).f221195c, aVar18.f221190h);
            case 12:
                r40 r40Var = (r40) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o17.m mVarE3 = ((FreelancerSaleDetailsScreen) obj4).d();
                Object obj5 = r40Var.f166116s;
                com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar21 = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) mVarE3;
                aVar21.getClass();
                if (obj5 instanceof xr6.o) {
                    xr6.o oVar = (xr6.o) obj5;
                    if (oVar instanceof xr6.m) {
                        aVar21.C1(new FreelancerBizFeatureConfig.SaleDetails(new FreelancerBizFeatureConfig.SaleDetails.Sale.C0487SaleDetails(((xr6.m) obj5).f308265a)));
                    } else {
                        if (!(oVar instanceof xr6.n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar21.C1(u0.c(new TransactionsFeatureConfig.Details(new k71.g(((xr6.n) obj5).f308266a), null, null, null, 126)));
                    }
                }
                return Unit.f186387a;
            case 13:
                o24.a aVar22 = (o24.a) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h24.n nVar3 = (h24.n) ((o24.e) obj4).f221485c.T2(o24.e.a(aVar22), wim.z.d(o0.b(h24.n.class)));
                if (nVar3 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(nVar3, "<this>");
                String disclaimer = nVar3.getDisclaimer();
                List<h24.r> widgetSections = nVar3.getWidgetSections();
                ArrayList arrayList4 = new ArrayList(w.t(widgetSections, 10));
                for (h24.r rVar : widgetSections) {
                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                    arrayList4.add(new t(rVar.getIcon(), rVar.getTitle(), rVar.getSubtitle()));
                }
                h24.q headerSection = nVar3.getHeaderSection();
                if (headerSection != null) {
                    Intrinsics.checkNotNullParameter(headerSection, "<this>");
                    String action = headerSection.getAction();
                    String title = headerSection.getTitle();
                    String subtitle = headerSection.getSubtitle();
                    List<h24.m> introSteps = headerSection.getIntroSteps();
                    ArrayList arrayList5 = new ArrayList(w.t(introSteps, 10));
                    for (h24.m mVar : introSteps) {
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        arrayList5.add(new vu3.o(mVar.getTitle(), mVar.getSubtitle(), mVar.getVideo()));
                    }
                    sVar = new s(title, subtitle, action, arrayList5);
                } else {
                    sVar = null;
                }
                List actionsSection = nVar3.getActionsSection();
                if (actionsSection != null) {
                    List<h24.a> list = actionsSection;
                    ArrayList arrayList6 = new ArrayList(w.t(list, 10));
                    for (h24.a aVar24 : list) {
                        Intrinsics.checkNotNullParameter(aVar24, "<this>");
                        arrayList6.add(new vu3.a(aVar24.getTitle(), aVar24.getDeeplink()));
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = null;
                }
                h24.o eligibilityCriteriaSection = nVar3.getEligibilityCriteriaSection();
                if (eligibilityCriteriaSection != null) {
                    Intrinsics.checkNotNullParameter(eligibilityCriteriaSection, "<this>");
                    String title2 = eligibilityCriteriaSection.getTitle();
                    List<h24.p> items = eligibilityCriteriaSection.getItems();
                    ArrayList arrayList7 = new ArrayList(w.t(items, 10));
                    for (h24.p pVar2 : items) {
                        Intrinsics.checkNotNullParameter(pVar2, "<this>");
                        String icon = pVar2.getIcon();
                        if (icon != null) {
                            a1[] a1VarArrValues = a1.values();
                            int length = a1VarArrValues.length;
                            int i21 = 0;
                            while (true) {
                                if (i21 < length) {
                                    a1Var2 = a1VarArrValues[i21];
                                    nVar2 = nVar3;
                                    if (!a0.z(a1Var2.name(), icon, true)) {
                                        i21++;
                                        nVar3 = nVar2;
                                    }
                                } else {
                                    nVar2 = nVar3;
                                    a1Var2 = null;
                                }
                            }
                            a1Var = a1Var2;
                        } else {
                            nVar2 = nVar3;
                            a1Var = null;
                        }
                        arrayList7.add(new vu3.r(a1Var, pVar2.getText()));
                        nVar3 = nVar2;
                    }
                    nVar = nVar3;
                    qVar = new vu3.q(title2, arrayList7);
                } else {
                    nVar = nVar3;
                    qVar = null;
                }
                h24.f cardCollectionSection = nVar.getCardCollectionSection();
                if (cardCollectionSection != null) {
                    Intrinsics.checkNotNullParameter(cardCollectionSection, "<this>");
                    String id10 = cardCollectionSection.getId();
                    String initialSelectedTabId = cardCollectionSection.getInitialSelectedTabId();
                    List tabs = cardCollectionSection.getTabs();
                    ArrayList arrayList8 = new ArrayList(w.t(tabs, 10));
                    Iterator it9 = tabs.iterator();
                    while (it9.hasNext()) {
                        h24.g gVar2 = (h24.g) it9.next();
                        Intrinsics.checkNotNullParameter(gVar2, "<this>");
                        String id11 = gVar2.getId();
                        String label = gVar2.getLabel();
                        h24.h card = gVar2.getCard();
                        Intrinsics.checkNotNullParameter(card, "<this>");
                        String id12 = card.getId();
                        h24.l media = card.getMedia();
                        Intrinsics.checkNotNullParameter(media, "<this>");
                        vu3.m mVar2 = vu3.n.Companion;
                        String type = media.getType();
                        mVar2.getClass();
                        Iterator it10 = it9;
                        vu3.n nVarA = vu3.m.a(type);
                        String url2 = media.getUrl();
                        List badges = media.getBadges();
                        ArrayList arrayList9 = arrayList4;
                        String str5 = disclaimer;
                        s sVar3 = sVar;
                        ArrayList arrayList10 = new ArrayList(w.t(badges, 10));
                        Iterator it11 = badges.iterator();
                        while (it11.hasNext()) {
                            h24.e eVar = (h24.e) it11.next();
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            Iterator it12 = it11;
                            String id13 = eVar.getId();
                            String text = eVar.getText();
                            ArrayList arrayList11 = arrayList;
                            h24.j icon2 = eVar.getIcon();
                            if (icon2 != null) {
                                Intrinsics.checkNotNullParameter(icon2, "<this>");
                                qVar3 = qVar;
                                jVar = new vu3.j(icon2.getUrl());
                            } else {
                                qVar3 = qVar;
                                jVar = null;
                            }
                            arrayList10.add(new vu3.f(id13, text, jVar));
                            it11 = it12;
                            arrayList = arrayList11;
                            qVar = qVar3;
                        }
                        ArrayList arrayList12 = arrayList;
                        vu3.q qVar4 = qVar;
                        vu3.l lVar2 = new vu3.l(nVarA, url2, arrayList10);
                        String title3 = card.getTitle();
                        String subtitle2 = card.getSubtitle();
                        h24.d subtitleAction = card.getSubtitleAction();
                        vu3.e eVarZ = subtitleAction != null ? oc.c.z(subtitleAction) : null;
                        List<h24.k> items2 = card.getItems();
                        ArrayList arrayList13 = new ArrayList(w.t(items2, 10));
                        for (h24.k kVar3 : items2) {
                            Intrinsics.checkNotNullParameter(kVar3, "<this>");
                            String id14 = kVar3.getId();
                            String text2 = kVar3.getText();
                            h24.j icon3 = kVar3.getIcon();
                            Intrinsics.checkNotNullParameter(icon3, "<this>");
                            arrayList13.add(new vu3.k(id14, text2, new vu3.j(icon3.getUrl())));
                        }
                        h24.i footer = card.getFooter();
                        if (footer != null) {
                            Intrinsics.checkNotNullParameter(footer, "<this>");
                            iVar = new vu3.i(footer.getTitle(), footer.getSubtitle(), oc.c.z(footer.getAction()));
                        } else {
                            iVar = null;
                        }
                        arrayList8.add(new vu3.h(id11, label, new vu3.b(id12, lVar2, title3, subtitle2, eVarZ, arrayList13, iVar)));
                        it9 = it10;
                        arrayList4 = arrayList9;
                        disclaimer = str5;
                        sVar = sVar3;
                        arrayList = arrayList12;
                        qVar = qVar4;
                    }
                    arrayList2 = arrayList4;
                    str = disclaimer;
                    sVar2 = sVar;
                    arrayList3 = arrayList;
                    qVar2 = qVar;
                    gVar = new vu3.g(id10, initialSelectedTabId, arrayList8);
                } else {
                    arrayList2 = arrayList4;
                    str = disclaimer;
                    sVar2 = sVar;
                    arrayList3 = arrayList;
                    qVar2 = qVar;
                    gVar = null;
                }
                return new vu3.p(arrayList2, str, sVar2, arrayList3, qVar2, gVar);
            case 14:
                o26.a aVar25 = (o26.a) ((aah.g) obj4).e;
                p0 p0Var = (p0) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str6 = p0Var.f10454a;
                switch (str6.hashCode()) {
                    case -1939588063:
                        if (str6.equals("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_RECEIVE")) {
                            aVar25.c3();
                        }
                        break;
                    case -384262460:
                        if (str6.equals("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_BUY")) {
                            aVar25.b3();
                        }
                        break;
                    case 973256372:
                        if (str6.equals("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_SELL")) {
                            aVar25.d3();
                        }
                        break;
                    case 973256426:
                        if (str6.equals("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_SEND")) {
                            aVar25.getClass();
                        }
                        break;
                }
                return Unit.f186387a;
            case 15:
                Data data2 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) obj4;
                bVar.H2(bVar.z, new nsl.g(data2, 16));
                return Unit.f186387a;
            case 16:
                String str7 = (String) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l29.a aVar29 = (l29.a) ((o29.d) obj4).f221553c.T2(a0.d.n("STORAGE_KEY_ONBOARDING_INFO", str7.hashCode()), o29.d.e);
                if (aVar29 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar29, "<this>");
                a.C1088a info = aVar29.getInfo();
                if (info == null) {
                    return g.b.f293810b;
                }
                String title4 = info.getTitle();
                String subtitle3 = info.getSubtitle();
                List<a.C1088a.C1089a> items3 = info.getItems();
                ArrayList arrayList14 = new ArrayList(w.t(items3, 10));
                for (a.C1088a.C1089a c1089a : items3) {
                    arrayList14.add(new w19.e(c1089a.getId(), c1089a.getTitle(), qvb.b.b(c1089a.getSubtitle()), c1089a.getIcon()));
                }
                String cta2 = info.getCta();
                p1 disclaimer2 = info.getDisclaimer();
                return new w19.h(new w19.f(title4, subtitle3, arrayList14, cta2, disclaimer2 != null ? qvb.b.b(disclaimer2) : null));
            case 17:
                y yVar2 = (y) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) obj4;
                k0 k0Var = (k0) j6.a.k(k0.class, zVar.f221595c, ((o29.w) zVar.d).a(yVar2));
                if (k0Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(k0Var, "<this>");
                List list2 = k0Var.f211477a;
                ArrayList arrayList15 = new ArrayList(w.t(list2, 10));
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    n29.y yVar3 = (n29.y) it13.next();
                    Intrinsics.checkNotNullParameter(yVar3, "<this>");
                    z19.l lVarC = e29.a.c(yVar3.f211496a);
                    n29.s sVar4 = yVar3.f211497b;
                    Intrinsics.checkNotNullParameter(sVar4, "<this>");
                    if (sVar4 instanceof n29.r) {
                        n29.r rVar2 = (n29.r) sVar4;
                        String str8 = rVar2.f211489a;
                        String str9 = rVar2.f211490b;
                        String str10 = rVar2.f211491c;
                        n29.h hVar2 = rVar2.d;
                        ?? B = hVar2 != null ? e29.a.b(hVar2) : obj3;
                        v vVar = rVar2.e;
                        fVar = new z19.g(str8, str9, str10, B, vVar != null ? new z19.i(vVar.f211493a, vVar.f211494b) : null);
                        it8 = it13;
                    } else if (sVar4 instanceof n29.l) {
                        n29.l lVar3 = (n29.l) sVar4;
                        String str11 = lVar3.f211479a;
                        String str12 = lVar3.f211480b;
                        String str13 = lVar3.f211481c;
                        n29.h hVar3 = lVar3.d;
                        z19.d dVarB = hVar3 != null ? e29.a.b(hVar3) : null;
                        v vVar2 = lVar3.e;
                        z19.i iVar2 = vVar2 != null ? new z19.i(vVar2.f211493a, vVar2.f211494b) : null;
                        List list3 = lVar3.f;
                        ArrayList arrayList16 = new ArrayList(w.t(list3, i6));
                        Iterator it14 = list3.iterator();
                        while (it14.hasNext()) {
                            n29.b0 b0Var = (n29.b0) it14.next();
                            arrayList16.add(new z19.j(b0Var.f211458a, b0Var.f211459b, b0Var.f211460c, b0Var.d));
                            it13 = it13;
                            it14 = it14;
                            str11 = str11;
                        }
                        it8 = it13;
                        fVar = new z19.e(str11, str12, str13, dVarB, iVar2, arrayList16);
                    } else {
                        it8 = it13;
                        if (!(sVar4 instanceof n29.o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n29.o oVar2 = (n29.o) sVar4;
                        String str14 = oVar2.f211484a;
                        String str15 = oVar2.f211485b;
                        String str16 = oVar2.f211486c;
                        n29.h hVar4 = oVar2.d;
                        z19.d dVarB2 = hVar4 != null ? e29.a.b(hVar4) : null;
                        v vVar3 = oVar2.e;
                        z19.i iVar3 = vVar3 != null ? new z19.i(vVar3.f211493a, vVar3.f211494b) : null;
                        List<e0> list4 = oVar2.f;
                        ArrayList arrayList17 = new ArrayList(w.t(list4, 10));
                        for (e0 e0Var : list4) {
                            arrayList17.add(new z19.k(e0Var.f211465a, e0Var.f211466b));
                        }
                        fVar = new z19.f(str14, str15, str16, dVarB2, iVar3, arrayList17, oVar2.f211487g);
                    }
                    n29.h0 h0Var3 = yVar3.f211498c;
                    arrayList15.add(new z19.a(lVarC, fVar, h0Var3 != null ? new z19.m(h0Var3.f211470a, h0Var3.f211471b, h0Var3.f211472c) : null));
                    it13 = it8;
                    i6 = 10;
                    obj3 = null;
                }
                return new z19.n(arrayList15);
            case 18:
                Data data3 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o2g.e eVar2 = (o2g.e) obj4;
                eVar2.H2(eVar2.f221622q, new nsl.g(data3, i2));
                return Unit.f186387a;
            case 19:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str17 = (String) j6.a.k(String.class, ((o36.d) this.v).f221703a, j6.a.q("defi_exchange_secondary_", ((wd6.e) obj4).name()));
                if (str17 == null) {
                    return null;
                }
                xi0.b.Companion.getClass();
                return xi0.a.a(str17);
            case 20:
                Data data4 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o42.k kVar4 = (o42.k) obj4;
                kVar4.H2(kVar4.f221987q, new nsl.g(data4, 18));
                return Unit.f186387a;
            case 21:
                String postcode = (String) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o44.m mVarH3 = ((CreditAddressSearchScreen) obj4).T2();
                Intrinsics.h(postcode);
                mVarH3.getClass();
                Intrinsics.checkNotNullParameter(postcode, "postcode");
                mVarH3.x2(new o23.l(postcode, i3));
                return Unit.f186387a;
            case 22:
                Data data5 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o44.m) obj4).x2(new nsl.g(data5, 19));
                return Unit.f186387a;
            case 23:
                Data data6 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o4b.b bVar2 = (o4b.b) obj4;
                bVar2.H2(bVar2.f222188p, new nsl.g(data6, 20));
                return Unit.f186387a;
            case 24:
                Data data7 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o5g.i iVar4 = (o5g.i) obj4;
                iVar4.H2(iVar4.f222435q, new nsl.g(data7, 23));
                return Unit.f186387a;
            case 25:
                g6 model = (g6) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o6f.b bVar3 = (o6f.b) ((g7f.b) obj4).f141197h;
                Intrinsics.h(model);
                o6f.m mVar3 = (o6f.m) bVar3;
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Iterator it15 = pdh.c.a().iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next = it15.next();
                        if (Intrinsics.f(((pdh.c) next).name(), model.f54199a)) {
                            obj3 = next;
                        }
                    }
                }
                pdh.c cVar3 = (pdh.c) obj3;
                if (cVar3 != null) {
                    mVar3.X2(mVar3.f222593q, new doc.r(cVar3, 2));
                }
                return Unit.f186387a;
            case 26:
                Data data8 = (Data) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o6f.m mVar4 = (o6f.m) obj4;
                mVar4.X2(mVar4.f222593q, new nsl.g(data8, 24));
                return Unit.f186387a;
            case 27:
                List list5 = (List) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                te8.v vVar4 = (te8.v) ((k7i.i) obj4).f182070c;
                List list6 = list5;
                ArrayList arrayList18 = new ArrayList(w.t(list6, 10));
                Iterator it16 = list6.iterator();
                while (it16.hasNext()) {
                    arrayList18.add(((psg.a) it16.next()).f239485b);
                }
                return nim.a.v(vVar4.a(arrayList18, w4l.h.f294642c, null), new o69.b(i3));
            case 28:
                String rewardId = (String) this.v;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o7b.h hVar5 = (o7b.h) ((CobrandedCardsPlanHubRewardSelectionScreen) obj4).R.getValue();
                hVar5.getClass();
                Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                hVar5.H2(hVar5.f222746r, new o23.l(rewardId, i5));
                return Unit.f186387a;
            default:
                Data data9 = (Data) this.v;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o7b.h hVar6 = (o7b.h) obj4;
                hVar6.H2(hVar6.f222746r, new nsl.g(data9, 25));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219819w = obj2;
    }
}
