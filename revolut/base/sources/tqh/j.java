package tqh;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import au0.z3;
import com.revolut.data.model.Data;
import com.revolut.data.network.services.ExternalCardsService;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.attrs.AttributesScreen;
import efm.d0;
import ft3.h1;
import gu7.x;
import h93.f0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import mx0.c9;
import nii.y0;
import o29.u;
import qf1.t;
import skm.e0;
import skm.p0;
import ts6.s;
import ts6.s0;
import tt7.p;
import tv4.o;
import vkm.q;
import vkm.v1;
import vkm.z1;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f273592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f273593x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f273592w = obj2;
        this.f273593x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((vkm.d) this.f273592w, (l) this.f273593x, continuation, 0);
            case 1:
                return new j((vkm.d) this.f273592w, (m) this.f273593x, continuation, 1);
            case 2:
                return new j((s0) this.f273592w, (tr6.a) this.f273593x, continuation, 2);
            case 3:
                return new j((s0) this.f273593x, continuation, 3);
            case 4:
                return new j((s0) this.f273592w, (FeatureConfig) this.f273593x, continuation, 4);
            case 5:
                return new j((s0) this.f273592w, (TabAccountsInitialPayload) this.f273593x, continuation, 5);
            case 6:
                j jVar = new j((TicketDetails) this.f273593x, continuation, 6);
                jVar.f273592w = obj2;
                return jVar;
            case 7:
                j jVar2 = new j((tse.i) this.f273593x, continuation, 7);
                jVar2.f273592w = obj2;
                return jVar2;
            case 8:
                return new j((com.revolut.feature.insurance_credit.impl.ui.screen.details.b) this.f273592w, (xs7.b) this.f273593x, continuation, 8);
            case 9:
                return new j((tu2.h) this.f273592w, (f0) this.f273593x, continuation, 9);
            case 10:
                j jVar3 = new j((AttributesScreen) this.f273593x, continuation, 10);
                jVar3.f273592w = obj2;
                return jVar3;
            case 11:
                return new j((o) this.f273592w, (ssi.k) this.f273593x, continuation, 11);
            case 12:
                return new j((tv7.j) this.f273592w, (x) this.f273593x, continuation, 12);
            case 13:
                return new j((com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) this.f273592w, (String) this.f273593x, continuation, 13);
            case 14:
                return new j((tvh.g) this.f273593x, continuation, 14);
            case 15:
                return new j((com.revolut.feature.insurance_home.impl.ui.screen.home.a) this.f273592w, (String) this.f273593x, continuation, 15);
            case 16:
                j jVar4 = new j((com.revolut.feature.kyc.impl.ondemand.a) this.f273593x, continuation, 16);
                jVar4.f273592w = obj2;
                return jVar4;
            case 17:
                return new j((tw9.i) this.f273592w, (Activity) this.f273593x, continuation, 17);
            case 18:
                return new j((com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) this.f273592w, (ShopsCampaignOffer) this.f273593x, continuation, 18);
            case 19:
                return new j((ty4.o) this.f273592w, this.f273593x, continuation, 19);
            case 20:
                j jVar5 = new j((fti.b) this.f273593x, continuation, 20);
                jVar5.f273592w = obj2;
                return jVar5;
            case 21:
                j jVar6 = new j((View) this.f273593x, continuation, 21);
                jVar6.f273592w = obj2;
                return jVar6;
            case 22:
                return new j((tzb.i) this.f273592w, this.f273593x, continuation, 22);
            case 23:
                j jVar7 = new j((tzl.l) this.f273593x, continuation, 23);
                jVar7.f273592w = obj2;
                return jVar7;
            case 24:
                return new j((u13.g) this.f273592w, (String) this.f273593x, continuation, 24);
            case 25:
                return new j((u1m.o) this.f273592w, (Context) this.f273593x, continuation, 25);
            case 26:
                return new j((u21.k) this.f273592w, (String) this.f273593x, continuation, 26);
            case 27:
                return new j((u24.a) this.f273592w, (String) this.f273593x, continuation, 27);
            case 28:
                return new j((u24.a) this.f273592w, (h1) this.f273593x, continuation, 28);
            default:
                j jVar8 = new j((u29.m) this.f273593x, continuation, 29);
                jVar8.f273592w = obj2;
                return jVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Ref$ObjectRef ref$ObjectRef;
        Object objC;
        Object objC2;
        Object objD;
        Object objB;
        Object objX;
        String str;
        Object objP2;
        Object objH;
        Object deliveryAddresses;
        Object objCreateGooglePayCard;
        Object comboCards;
        Object objSkipComboCardOrdering;
        int i = this.u;
        final int i2 = 0;
        final int i3 = 2;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        Object obj3 = this.f273593x;
        final int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((vkm.d) this.f273592w).collect((l) obj3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((vkm.d) this.f273592w).collect((m) obj3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((s0) this.f273592w).i.a((tr6.a) obj3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                s0 s0Var = (s0) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    Ref$ObjectRef ref$ObjectRefW = p.a.w(obj2);
                    hr6.l lVar = s0Var.f;
                    s sVar = new s(ref$ObjectRefW, null, 0);
                    s sVar2 = new s(ref$ObjectRefW, null, 1);
                    this.f273592w = ref$ObjectRefW;
                    this.v = 1;
                    if (((ct6.m) lVar).c(sVar, sVar2, this) == aVar4) {
                        return aVar4;
                    }
                    ref$ObjectRef = ref$ObjectRefW;
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objC = obj2;
                        return new BridgeDestination((NaviCommand) objC);
                    }
                    ref$ObjectRef = (Ref$ObjectRef) this.f273592w;
                    yhm.o.b(obj2);
                }
                FeatureConfig featureConfig = (FeatureConfig) ref$ObjectRef.f186409a;
                this.f273592w = null;
                this.v = 2;
                objC = s0Var.c(featureConfig, this);
                if (objC == aVar4) {
                    return aVar4;
                }
                return new BridgeDestination((NaviCommand) objC);
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objC2 = ((s0) this.f273592w).c((FeatureConfig) obj3, this);
                    if (objC2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC2 = obj2;
                }
                return new BridgeDestination((NaviCommand) objC2);
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objD = ((s0) this.f273592w).d(null, (TabAccountsInitialPayload) obj3, this);
                    if (objD == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                return new BridgeDestination((NaviCommand) objD);
            case 6:
                FlowCollector flowCollector = (FlowCollector) this.f273592w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    Data data = new Data((TicketDetails) obj3, null, true, 2, null);
                    this.f273592w = null;
                    this.v = 1;
                    if (flowCollector.emit(data, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                String str2 = (String) this.f273592w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((tse.i) obj3).f274113s;
                    this.f273592w = null;
                    this.v = 1;
                    if (z1Var.emit(str2, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.insurance_credit.impl.ui.screen.details.b bVar = (com.revolut.feature.insurance_credit.impl.ui.screen.details.b) this.f273592w;
                p pVar = new p(bVar, (xs7.b) obj3, z ? 1 : 0, i5);
                this.v = 1;
                Object objP22 = bVar.p2(this, pVar);
                return objP22 == aVar9 ? aVar9 : objP22;
            case 9:
                f0 card = (f0) obj3;
                tu2.h hVar = (tu2.h) this.f273592w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarM = ((ha3.x) hVar.f274525q).m(card.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarM, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                pu2.d dVar = hVar.f274527s;
                su2.b reasonType = hVar.f274524p.f64389b;
                ((pu2.e) dVar).getClass();
                Intrinsics.checkNotNullParameter(reasonType, "reasonType");
                Intrinsics.checkNotNullParameter(card, "card");
                int i96 = pu2.f.f239806a[reasonType.ordinal()];
                if (i96 != 1 && i96 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                y0 y0VarA = pu2.e.a(card);
                yji.l.a1(hVar, hVar.X1(y0VarA), null, null, new qqj.g((Object) card, (Object) hVar, (Continuation) (z3 ? 1 : 0), 27), 3);
                return Unit.f186387a;
            case 10:
                ty0.a aVar11 = (ty0.a) this.f273592w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    tuk.i iVar = (tuk.i) ((AttributesScreen) obj3).c0.getValue();
                    Intrinsics.h(aVar11);
                    this.f273592w = null;
                    this.v = 1;
                    tuk.n nVar = (tuk.n) iVar;
                    nVar.getClass();
                    Object objB2 = pu7.a.B(nVar.k, "onClauseClick", new tuk.l(aVar11, nVar, null), this);
                    Object obj4 = objB2;
                    if (objB2 != aVar12) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((o) this.f273592w).f274711r.Z2((ssi.k) obj3, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    tv7.j jVar = (tv7.j) this.f273592w;
                    sb4.i iVar2 = new sb4.i(jVar, (x) obj3, z4 ? 1 : 0, 29);
                    this.v = 1;
                    if (u0.b0(jVar.X(), "GET_HELP_LOADING_BUTTON_TAG", iVar2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar16 = (com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) this.f273592w;
                tvc.k kVar = new tvc.k(aVar16, (String) obj3, z6 ? 1 : 0, i5);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar16.k, "securityDelaySecondaryButtonClick", kVar, this);
                return objB3 == aVar15 ? aVar15 : objB3;
            case 14:
                tvh.g gVar = (tvh.g) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                try {
                } catch (Exception e) {
                    gVar.x2(new d22.f(15, e));
                }
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    kq.h hVar2 = gVar.f274775q;
                    int i104 = gVar.f274776r;
                    this.v = 1;
                    objB = hVar2.b(i104, this);
                    if (objB == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.f273592w;
                        yhm.o.b(obj2);
                        objX = obj2;
                        gVar.x2(new tkm.d((Pair) objX, str, 25));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                String str3 = (String) ((Map) objB).get("pocketId");
                vvh.l lVar2 = gVar.f274774p;
                this.f273592w = str3;
                this.v = 2;
                lVar2.getClass();
                objX = q.x(mo3.a.g(new v1(new l10.m(lVar2, false, (Continuation) null)), null, new vv7.l(i5), 1), this);
                if (objX == aVar17) {
                    return aVar17;
                }
                str = str3;
                gVar.x2(new tkm.d((Pair) objX, str, 25));
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar19 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.feature.insurance_home.impl.ui.screen.home.a) this.f273592w).f76219q, (String) obj3, aVar19, null, this, 4);
                return objX1 == aVar18 ? aVar18 : objX1;
            case 16:
                com.revolut.feature.kyc.impl.ondemand.a aVar20 = (com.revolut.feature.kyc.impl.ondemand.a) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) this.f273592w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    su4.n nVar2 = new su4.n(aVar20, z11 ? 1 : 0, 17);
                    this.f273592w = coroutineScope;
                    this.v = 1;
                    objP2 = aVar20.p2(this, nVar2);
                    if (objP2 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                if (((Boolean) objP2).booleanValue()) {
                    p0 p0Var = p0.f264001a;
                    return e0.C(coroutineScope, zkm.o.f323119a, null, new tk5.c(aVar20, z12 ? 1 : 0, 22), 2);
                }
                aVar20.J2(TransitionAnimation.SLIDE_END_TO_START.f98395a);
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    tw9.i iVar3 = (tw9.i) this.f273592w;
                    tw9.h hVar3 = new tw9.h(iVar3, (Activity) obj3, z29 ? 1 : 0, i2);
                    this.v = 1;
                    if (iVar3.p2(this, hVar3) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a.J2((com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) this.f273592w, (ShopsCampaignOffer) obj3, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ty4.o oVar = (ty4.o) this.f273592w;
                tw9.h hVar4 = new tw9.h(oVar, obj3, z31 ? 1 : 0, i5);
                this.v = 1;
                Object objB4 = pu7.a.B(oVar.k, "account selection deeplink", hVar4, this);
                return objB4 == aVar24 ? aVar24 : objB4;
            case 20:
                FlowCollector flowCollector2 = (FlowCollector) this.f273592w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    boolean zK = yoj.b.k(((cpj.b) ((c1g.m) ((hyf.a) ((fti.b) obj3).f138027b)).f20497a).g(yoj.c.TRAVEL_EXPERIENCES, yoj.d.DISABLED));
                    t tVar = new t(qf1.f.TRAVEL_EXPERIENCES.getId());
                    if (!zK) {
                        tVar = null;
                    }
                    this.f273592w = null;
                    this.v = 1;
                    if (flowCollector2.emit(tVar, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                View view = (View) obj3;
                ProducerScope producerScope = (ProducerScope) this.f273592w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    view.setOnClickListener(new c9(producerScope, 23));
                    z3 z3Var = new z3(view, 18);
                    this.f273592w = null;
                    this.v = 1;
                    if (com.bumptech.glide.d.d(producerScope, z3Var, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarC = ((s06.j) ((tzb.i) this.f273592w).o).c(((fub.b) obj3).f138164a, false, lg0.a.IGNORE);
                this.v = 1;
                Object objB5 = nim.a.b(d0VarC, this);
                return objB5 == aVar27 ? aVar27 : objB5;
            case 23:
                Object obj5 = this.f273592w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    tzl.l lVar3 = (tzl.l) obj3;
                    this.f273592w = null;
                    this.v = 1;
                    Data dataF = lVar3.f();
                    if ((dataF != null ? dataF.getError() : null) != null) {
                        objH = lVar3.m(obj5, this);
                        if (objH != aVar28) {
                            objH = Unit.f186387a;
                        }
                    } else {
                        objH = lVar3.h(obj5, this);
                        if (objH != aVar28) {
                            objH = Unit.f186387a;
                        }
                    }
                    if (objH == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    deliveryAddresses = ((u13.g) this.f273592w).f276343a.getDeliveryAddresses((String) obj3, this);
                    if (deliveryAddresses != arrayList) {
                    }
                    return arrayList;
                }
                if (i114 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                deliveryAddresses = obj2;
                Iterable iterable = (Iterable) deliveryAddresses;
                arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(oo3.a.a((no3.b) it8.next()));
                }
                return arrayList;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((u1m.o) this.f273592w).j((Context) obj3, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    u21.k kVar2 = (u21.k) this.f273592w;
                    ExternalCardsService externalCardsService = kVar2.f276535a;
                    tl0.a aVar31 = kVar2.e;
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = ((String) obj3).getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    oue.d dVar2 = new oue.d(new String(aVar31.b(bytes), charset));
                    this.v = 1;
                    objCreateGooglePayCard = externalCardsService.createGooglePayCard(dVar2, this);
                    if (objCreateGooglePayCard == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCreateGooglePayCard = obj2;
                }
                return ((oue.b) objCreateGooglePayCard).getExternalCardId();
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    comboCards = ((u24.a) this.f273592w).f276545b.getComboCards((String) obj3, this);
                    if (comboCards == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    comboCards = obj2;
                }
                return ((h04.a) comboCards).getComboCards();
            case 28:
                u24.a aVar33 = (u24.a) this.f273592w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar33.f276545b;
                    String str4 = ((h1) obj3).f137835a;
                    this.v = 1;
                    objSkipComboCardOrdering = creditPluginsService.skipComboCardOrdering(str4, this);
                    if (objSkipComboCardOrdering == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objSkipComboCardOrdering = obj2;
                }
                return aVar33.f276544a.p((tt3.a) objSkipComboCardOrdering);
            default:
                final String str5 = (String) this.f273592w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    o29.n nVar3 = ((u29.m) obj3).f276574a;
                    this.f273592w = null;
                    this.v = 1;
                    final u uVar = (u) nVar3;
                    uVar.getClass();
                    final int i120 = 3;
                    pfm.a aVarE = efm.b.p(new pfm.h(new kfm.a() { // from class: o29.o
                        @Override // kfm.a
                        public final void run() {
                            switch (i120) {
                                case 0:
                                    ue0.c cVar = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar.I0(t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", str5));
                                    break;
                                case 1:
                                    ue0.c cVar2 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar2.I0(t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", str5));
                                    break;
                                case 2:
                                    ue0.c cVar3 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar3.I0(t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", str5));
                                    break;
                                default:
                                    ue0.c cVar4 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar4.I0(t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", str5));
                                    break;
                            }
                        }
                    }, i3), new pfm.h(new kfm.a() { // from class: o29.o
                        @Override // kfm.a
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ue0.c cVar = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar.I0(t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", str5));
                                    break;
                                case 1:
                                    ue0.c cVar2 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar2.I0(t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", str5));
                                    break;
                                case 2:
                                    ue0.c cVar3 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar3.I0(t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", str5));
                                    break;
                                default:
                                    ue0.c cVar4 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar4.I0(t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", str5));
                                    break;
                            }
                        }
                    }, i3), new pfm.h(new kfm.a() { // from class: o29.o
                        @Override // kfm.a
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    ue0.c cVar = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar.I0(t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", str5));
                                    break;
                                case 1:
                                    ue0.c cVar2 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar2.I0(t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", str5));
                                    break;
                                case 2:
                                    ue0.c cVar3 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar3.I0(t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", str5));
                                    break;
                                default:
                                    ue0.c cVar4 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar4.I0(t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", str5));
                                    break;
                            }
                        }
                    }, i3), new pfm.h(new kfm.a() { // from class: o29.o
                        @Override // kfm.a
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    ue0.c cVar = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar.I0(t.a("CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", str5));
                                    break;
                                case 1:
                                    ue0.c cVar2 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar2.I0(t.a("CACHE_KEY_HOME_HEADER_STORAGE_KEY", str5));
                                    break;
                                case 2:
                                    ue0.c cVar3 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar3.I0(t.a("CACHE_KEY_HOME_S4U_STORAGE_KEY", str5));
                                    break;
                                default:
                                    ue0.c cVar4 = uVar.f221586c;
                                    u.Companion.getClass();
                                    cVar4.I0(t.a("CACHE_KEY_HOME_FEED_STORAGE_KEY", str5));
                                    break;
                            }
                        }
                    }, i3)).e(new pfm.h(new m1i.t(uVar, str5, 14), i5));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    Object objA = nim.a.a(aVarE, this);
                    Object obj6 = objA;
                    if (objA != aVar35) {
                        obj6 = Unit.f186387a;
                    }
                    if (obj6 == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f273593x = obj2;
    }
}
