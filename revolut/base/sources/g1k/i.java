package g1k;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.store.impl.data.network.StoreService;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.kompot.navigable.TransitionAnimation;
import ft3.h1;
import g37.z;
import g48.b0;
import g48.r0;
import g4k.a0;
import g4k.y;
import g8i.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import skm.h0;
import skm.p0;
import vkm.j2;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f139697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139698x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f139697w = bVar;
        this.f139698x = linkedHashSet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i((com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) this.f139697w, continuation, 0);
                iVar.f139698x = obj2;
                return iVar;
            case 1:
                return new i((com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) this.f139697w, (LinkedHashSet) this.f139698x, continuation);
            case 2:
                return new i((g2e.r) this.f139698x, (Set) this.f139697w, continuation, 2);
            case 3:
                return new i((g34.a) this.f139698x, (h1) this.f139697w, continuation, 3);
            case 4:
                return new i((g3e.r) this.f139698x, (String) this.f139697w, continuation, 4);
            case 5:
                return new i((g42.f) this.f139698x, (ApmOnboardingStatusTerms) this.f139697w, continuation, 5);
            case 6:
                return new i((g42.f) this.f139698x, (Terms) this.f139697w, continuation, 6);
            case 7:
                i iVar2 = new i((g42.f) this.f139697w, continuation, 7);
                iVar2.f139698x = obj2;
                return iVar2;
            case 8:
                return new i((r0) this.f139698x, (b0) this.f139697w, continuation, 8);
            case 9:
                return new i((a0) this.f139698x, (String) this.f139697w, continuation, 9);
            case 10:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f139698x, (PluginPayload) this.f139697w, continuation, 10);
            case 11:
                return new i((g6i.i) this.f139698x, (ty0.a) this.f139697w, continuation, 11);
            case 12:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.f139698x, (List) this.f139697w, continuation, 12);
            case 13:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.f139698x, (v44.j) this.f139697w, continuation, 13);
            case 14:
                return new i((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f139698x, (CobrandedCardsPlanHubPlan) this.f139697w, continuation, 14);
            case 15:
                return new i((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f139698x, (String) this.f139697w, continuation, 15);
            case 16:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f139698x, (pf4.n) this.f139697w, continuation, 16);
            case 17:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f139698x, (CreditCardOfferFlowContract$Step.Loading) this.f139697w, continuation, 17);
            case 18:
                return new i((com.revolut.feature.subaccount.impl.ui.edit.invite.flow.a) this.f139698x, (s7e.d) this.f139697w, continuation, 18);
            case 19:
                return new i((e0) this.f139698x, (ty0.a) this.f139697w, continuation, 19);
            case 20:
                return new i((h0) this.f139698x, (g99.h) this.f139697w, continuation, 20);
            case 21:
                i iVar3 = new i((f2i.x) this.f139697w, continuation, 21);
                iVar3.f139698x = obj2;
                return iVar3;
            case 22:
                i iVar4 = new i((g9j.t) this.f139697w, continuation, 22);
                iVar4.f139698x = obj2;
                return iVar4;
            case 23:
                return new i((ga2.g) this.f139698x, (ResolveAlias) this.f139697w, continuation, 23);
            case 24:
                return new i((com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x, (AddressFlowContract$OutputData) this.f139697w, continuation, 24);
            case 25:
                return new i((ha9.e) this.f139698x, (com.revolut.feature.onboarding.impl.onboarding.v) this.f139697w, continuation, 25);
            case 26:
                return new i((com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x, (SubmitCitizenshipFlowOutput) this.f139697w, continuation, 26);
            case 27:
                return new i((com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x, (ma9.f) this.f139697w, continuation, 27);
            case 28:
                return new i((com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x, (g3a.b) this.f139697w, continuation, 28);
            default:
                return new i((com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x, (pa9.c) this.f139697w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objActivateRewards;
        Object documentsUploadConfiguration;
        Object objB;
        Object objB2;
        n38.e0 e0Var;
        Object next;
        Object objQ;
        Object next2;
        Object objCollect;
        int i = this.u;
        int i2 = 0;
        int i3 = 16;
        int i5 = 2;
        Object obj3 = null;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        boolean z74 = false;
        boolean z83 = false;
        boolean z89 = false;
        Object obj4 = this.f139697w;
        int i6 = 1;
        switch (i) {
            case 0:
                List list = (List) this.f139698x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b bVar = ((com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) obj4).f101861p;
                ArrayList arrayListU = zhm.w.u(list);
                this.f139698x = null;
                this.v = 1;
                bVar.getClass();
                Object objJ = skm.e0.J(p0.f264002b, new ft.d(arrayListU, z ? 1 : 0, 17), this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    l lVar = ((com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) obj4).o;
                    LinkedHashSet linkedHashSet = (LinkedHashSet) this.f139698x;
                    this.v = 1;
                    if (lVar.l(linkedHashSet, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    StoreService storeService = ((g2e.r) this.f139698x).f140021a;
                    f2e.c cVar = new f2e.c((Set) obj4);
                    this.v = 1;
                    objActivateRewards = storeService.activateRewards(cVar, this);
                    if (objActivateRewards == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objActivateRewards = obj2;
                }
                f2e.d dVar = (f2e.d) objActivateRewards;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                return new t1e.a(d0.i1(dVar.f131559a));
            case 3:
                g34.a aVar4 = (g34.a) this.f139698x;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar4.f140189c;
                    String str = ((h1) obj4).f137835a;
                    this.v = 1;
                    documentsUploadConfiguration = creditPluginsService.getDocumentsUploadConfiguration(str, this);
                    if (documentsUploadConfiguration == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    documentsUploadConfiguration = obj2;
                }
                return aVar4.f140188b.a((x04.g) documentsUploadConfiguration);
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar7 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((g3e.r) this.f139698x).f140286r, (String) obj4, aVar7, null, this, 4);
                return objX1 == aVar6 ? aVar6 : objX1;
            case 5:
                g42.f fVar = (g42.f) this.f139698x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarH = pre.c.h(fVar.o, null, ((ApmOnboardingStatusTerms) obj4).f61979c, 5);
                    this.v = 1;
                    objB = nim.a.b(d0VarH, this);
                    if (objB == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                fVar.H2(fVar.f140329q, new fvk.q((List) objB, 6));
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = pre.c.b(((g42.f) this.f139698x).o, ((Terms) obj4).f90355a);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.f139698x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    g42.f fVar2 = (g42.f) obj4;
                    z zVar = new z(fVar2, coroutineScope, z3 ? 1 : 0, i6);
                    this.f139698x = null;
                    this.v = 1;
                    if (u0.b0(fVar2.X(), "SIGN_TERMS_BUTTON_LOADING_TAG", zVar, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                r0 r0Var = (r0) this.f139698x;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarF = r0Var.f140404a.f(false);
                    this.v = 1;
                    objB2 = nim.a.b(d0VarF, this);
                    if (objB2 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        if (i92 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objQ = obj2;
                        od0.i.Companion.getClass();
                        return od0.h.a((n38.d0) objQ);
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                do3.n nVar = (do3.n) objB2;
                b0 b0Var = (b0) obj4;
                List list2 = b0Var.f140351a;
                String str2 = b0Var.f140352b;
                Intrinsics.h(nVar);
                this.v = 2;
                if (list2.isEmpty()) {
                    objQ = null;
                } else {
                    if (str2 != null) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next2 = it8.next();
                                if (Intrinsics.f(((n38.e0) next2).f211945a, str2)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        e0Var = (n38.e0) next2;
                    } else {
                        e0Var = null;
                    }
                    List list3 = list2;
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (((n38.e0) next).d == n38.t.ACCEPTED) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    n38.e0 e0Var2 = (n38.e0) next;
                    Iterator it10 = list3.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            Object next3 = it10.next();
                            if (((n38.e0) next3).d == n38.t.PENDING) {
                                obj3 = next3;
                            }
                        }
                    }
                    n38.e0 e0Var3 = (n38.e0) obj3;
                    if (e0Var == null) {
                        e0Var = e0Var2 == null ? e0Var3 : e0Var2;
                    }
                    objQ = r0Var.q(e0Var, nVar.i, this);
                }
                if (objQ == aVar11) {
                    return aVar11;
                }
                od0.i.Companion.getClass();
                return od0.h.a((n38.d0) objQ);
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a0 a0Var = (a0) this.f139698x;
                y yVar = new y(a0Var, (String) obj4, null);
                this.v = 1;
                Object objY2 = a0Var.Y2(this, yVar);
                return objY2 == aVar12 ? aVar12 : objY2;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar14 = (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f139698x;
                g64.g gVar = new g64.g(aVar14, (PluginPayload) obj4, z4 ? 1 : 0, i6);
                this.v = 1;
                g64.d dVar2 = com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a.Companion;
                Object objB3 = pu7.a.B(aVar14.k, "reload facilities and fetch configs", gVar, this);
                return objB3 == aVar13 ? aVar13 : objB3;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g6i.i iVar = (g6i.i) this.f139698x;
                z zVar2 = new z((ty0.a) obj4, iVar, z6 ? 1 : 0, 4);
                this.v = 1;
                Object objY22 = iVar.Y2(this, zVar2);
                return objY22 == aVar15 ? aVar15 : objY22;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar17 = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.f139698x;
                g74.d dVar3 = new g74.d(aVar17, (List) obj4, z11 ? 1 : 0, i6);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar17.k, "accept consents", dVar3, this);
                return objB4 == aVar16 ? aVar16 : objB4;
            case 13:
                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar18 = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.f139698x;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    lx4.a aVar20 = aVar18.f67300q;
                    String str3 = ((v44.h) ((v44.j) obj4)).f285948a;
                    this.v = 1;
                    Object objEmit = ((MutableStateFlow) aVar20.f200526a.getValue()).emit(a1.l((Set) ((MutableStateFlow) aVar20.f200526a.getValue()).getValue(), y0.b(str3)), this);
                    if (objEmit != aVar19) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.t2(aVar18, aVar18.f67303t, ConsentsFlowContract$Step.Documents.f67298a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                return Unit.f186387a;
            case 14:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f139698x;
                g7b.s sVar = new g7b.s(eVar, (CobrandedCardsPlanHubPlan) obj4, null);
                this.v = 1;
                Object objP2 = eVar.p2(this, sVar);
                return objP2 == aVar21 ? aVar21 : objP2;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar2 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f139698x;
                z zVar3 = new z(eVar2, (String) obj4, z12 ? 1 : 0, 10);
                this.v = 1;
                Object objP22 = eVar2.p2(this, zVar3);
                return objP22 == aVar22 ? aVar22 : objP22;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f139698x;
                g84.r rVar = new g84.r(iVar2, (pf4.n) obj4, z29 ? 1 : 0, i5);
                this.v = 1;
                Object objB5 = pu7.a.B(iVar2.k, "handleCreditOfferResult", rVar, this);
                return objB5 == aVar23 ? aVar23 : objB5;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i iVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.i) this.f139698x;
                    com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.e eVar3 = new com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.e(iVar3, (CreditCardOfferFlowContract$Step.Loading) obj4, null);
                    this.v = 1;
                    if (iVar3.p2(this, eVar3) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.subaccount.impl.ui.edit.invite.flow.a aVar26 = (com.revolut.feature.subaccount.impl.ui.edit.invite.flow.a) this.f139698x;
                    z zVar4 = new z(aVar26, (s7e.d) obj4, z31 ? 1 : 0, 11);
                    this.v = 1;
                    if (aVar26.p2(this, zVar4) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var4 = (e0) this.f139698x;
                z zVar5 = new z(e0Var4, (ty0.a) obj4, z41 ? 1 : 0, 12);
                this.v = 1;
                Object objP23 = e0Var4.p2(this, zVar5);
                return objP23 == aVar27 ? aVar27 : objP23;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    h0 h0Var = (h0) this.f139698x;
                    this.v = 1;
                    if (h0Var.y(this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i109 != 1) {
                        if (i109 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                g99.h hVar = (g99.h) obj4;
                this.v = 2;
                g99.k kVar = hVar.f141517h;
                if (kVar instanceof g99.j) {
                    StatefulAnimatedBackground statefulAnimatedBackground = hVar.d;
                    statefulAnimatedBackground.b(g99.l.INTRO.a(), po0.b0.ONCE);
                    statefulAnimatedBackground.b(g99.l.LOOP.a(), po0.b0.INFINITE);
                    objCollect = Unit.f186387a;
                } else {
                    if (!(kVar instanceof g99.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objCollect = t1.d(vkm.q.q(((g99.i) kVar).f141519a), 300L).collect(new g99.d(hVar, i2), this);
                    if (objCollect != aVar28) {
                        objCollect = Unit.f186387a;
                    }
                }
                if (objCollect == aVar28) {
                    return aVar28;
                }
                return Unit.f186387a;
            case 21:
                od0.i iVar4 = (od0.i) this.f139698x;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    if (!iVar4.d()) {
                        this.f139698x = null;
                        this.v = 1;
                        if (((f2i.x) obj4).invoke(this) == aVar29) {
                            return aVar29;
                        }
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                StakingProduct stakingProduct = (StakingProduct) this.f139698x;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    s8j.c cVar2 = ((g9j.t) obj4).f141938r;
                    this.f139698x = null;
                    this.v = 1;
                    cVar2.getClass();
                    s56.i iVar5 = new s56.i(cVar2, stakingProduct, z49 ? 1 : 0, i3);
                    p0 p0Var = p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, iVar5, this);
                    Object obj5 = objJ2;
                    if (objJ2 != aVar30) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    ga2.g gVar2 = (ga2.g) this.f139698x;
                    z zVar6 = new z(gVar2, (ResolveAlias) obj4, z54 ? 1 : 0, 13);
                    this.v = 1;
                    if (gVar2.Y2(this, zVar6) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                AddressFlowContract$OutputData addressFlowContract$OutputData = (AddressFlowContract$OutputData) obj4;
                com.revolut.feature.onboarding.impl.onboarding.v vVar = (com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x;
                qki.d dVar4 = vVar.P;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    vVar.H2(dVar4, new g48.j((OnboardingFlowContract$State) ((j2) dVar4.f22677a).getValue(), addressFlowContract$OutputData, 27));
                    fwj.p pVar = vVar.A;
                    Address address = addressFlowContract$OutputData.f60941b;
                    if (address == null) {
                        address = addressFlowContract$OutputData.f60940a;
                    }
                    o0j.d dVar5 = new o0j.d(addressFlowContract$OutputData.f60942c, address);
                    this.v = 1;
                    if (pVar.h(dVar5, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(vVar, null, this, 3) == aVar32) {
                    return aVar32;
                }
                return Unit.f186387a;
            case 25:
                com.revolut.feature.onboarding.impl.onboarding.v vVar2 = (com.revolut.feature.onboarding.impl.onboarding.v) obj4;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    ha9.e eVar4 = (ha9.e) this.f139698x;
                    if (eVar4 instanceof ha9.d) {
                        z zVar7 = new z(vVar2, eVar4, z74 ? 1 : 0, 15);
                        this.v = 1;
                        if (vVar2.p2(this, zVar7) == aVar33) {
                            return aVar33;
                        }
                    } else {
                        if (!Intrinsics.f(eVar4, ha9.c.f150476a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vVar2.B2();
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.onboarding.v vVar3 = (com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x;
                    ga9.p pVar2 = new ga9.p((SubmitCitizenshipFlowOutput) obj4, vVar3, null);
                    this.v = 1;
                    if (vVar3.p2(this, pVar2) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.onboarding.v vVar4 = (com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x;
                    z zVar8 = new z((ma9.f) obj4, vVar4, z83 ? 1 : 0, i3);
                    this.v = 1;
                    if (vVar4.p2(this, zVar8) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.onboarding.v vVar5 = (com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x;
                    String str4 = ((g3a.a) ((g3a.b) obj4)).f140244a;
                    ga9.q qVar = new ga9.q(vVar5, null);
                    this.v = 1;
                    if (u0.b0(vVar5.X(), str4, qVar, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.onboarding.impl.onboarding.v vVar6 = (com.revolut.feature.onboarding.impl.onboarding.v) this.f139698x;
                ga9.r rVar2 = new ga9.r(vVar6, (pa9.c) obj4, z89 ? 1 : 0, i6);
                this.v = 1;
                Object objP24 = vVar6.p2(this, rVar2);
                return objP24 == aVar37 ? aVar37 : objP24;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139698x = obj2;
        this.f139697w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139697w = obj2;
    }
}
