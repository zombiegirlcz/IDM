package gm6;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.camera.core.Camera;
import com.revolut.data.model.Data;
import com.revolut.feature.card_personalisation.generation.impl.network.CustomisationImageGenerationService;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import dx4.d1;
import dx4.e1;
import e60.l;
import e60.m;
import ft3.h1;
import ghk.t;
import go7.s;
import grc.k;
import gs.r;
import gtd.p;
import gu1.o;
import h3j.f0;
import ix6.a0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jtd.u;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import mll.c0;
import nx4.f1;
import nx4.m0;
import nx4.o0;
import skm.e0;
import skm.p0;
import vkm.j2;
import y04.a;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f144781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f144782x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144781w = obj2;
        this.f144782x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d) this.f144781w, (CrossBorderLinkAccountFlowContract$Step) this.f144782x, continuation, 0);
            case 1:
                return new j((gn9.d) this.f144781w, (String) this.f144782x, continuation, 1);
            case 2:
                return new j((s) this.f144781w, (rr7.b) this.f144782x, continuation, 2);
            case 3:
                j jVar = new j((com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) this.f144782x, continuation, 3);
                jVar.f144781w = obj2;
                return jVar;
            case 4:
                return new j((gq9.f) this.f144781w, (l) this.f144782x, continuation, 4);
            case 5:
                return new j((gq9.f) this.f144781w, (File) this.f144782x, continuation, 5);
            case 6:
                j jVar2 = new j((gqh.e) this.f144782x, continuation, 6);
                jVar2.f144781w = obj2;
                return jVar2;
            case 7:
                return new j((k) this.f144781w, (bqc.a) this.f144782x, continuation, 7);
            case 8:
                return new j((yja.b) this.f144781w, (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.f144782x, continuation, 8);
            case 9:
                return new j((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.f144781w, (String) this.f144782x, continuation, 9);
            case 10:
                j jVar3 = new j((r) this.f144782x, continuation, 10);
                jVar3.f144781w = obj2;
                return jVar3;
            case 11:
                return new j(this.f144781w, (p) this.f144782x, continuation, 11);
            case 12:
                j jVar4 = new j((gti.h) this.f144782x, continuation, 12);
                jVar4.f144781w = obj2;
                return jVar4;
            case 13:
                return new j((o) this.f144781w, (c02.j) this.f144782x, continuation, 13);
            case 14:
                return new j((com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c) this.f144781w, (k71.i) this.f144782x, continuation, 14);
            case 15:
                return new j((com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f144781w, (String) this.f144782x, continuation, 15);
            case 16:
                return new j((guj.d) this.f144781w, (String) this.f144782x, continuation, 16);
            case 17:
                return new j((gvf.b) this.f144781w, (jf0.c) this.f144782x, continuation, 17);
            case 18:
                return new j((gvj.b) this.f144781w, (puj.g) this.f144782x, continuation, 18);
            case 19:
                return new j((gw.e) this.f144781w, (Camera) this.f144782x, continuation, 19);
            case 20:
                return new j((com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a) this.f144781w, (a0) this.f144782x, continuation, 20);
            case 21:
                return new j((com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a) this.f144781w, (TradingOnboardingBackendFlowContract$Configuration) this.f144782x, continuation, 21);
            case 22:
                return new j((h25.e) this.f144781w, (String) this.f144782x, continuation, 22);
            case 23:
                j jVar5 = new j((com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) this.f144782x, continuation, 23);
                jVar5.f144781w = obj2;
                return jVar5;
            case 24:
                return new j((r10.a) this.f144781w, (h1) this.f144782x, continuation, 24);
            case 25:
                j jVar6 = new j((com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) this.f144782x, continuation, 25);
                jVar6.f144781w = obj2;
                return jVar6;
            case 26:
                return new j((h43.s) this.f144781w, (ufm.i) this.f144782x, continuation, 26);
            case 27:
                return new j((h44.a) this.f144781w, (String) this.f144782x, continuation, 27);
            case 28:
                return new j((h53.c) this.f144781w, (String) this.f144782x, continuation, 28);
            default:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f144781w, (l84.e) this.f144782x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object orderInitiationDetails;
        Object objJ;
        Object objA;
        Object objP;
        Object downPaymentSourceConfig;
        oy3.a aVar;
        oy3.b bVar;
        Object objW;
        Object objSkipSecurityDeposit;
        Object objGenerateImages;
        int i = this.u;
        int i2 = 9;
        int i3 = 15;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f144782x;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d dVar = (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d) this.f144781w;
                    com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.a aVar3 = new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.a(dVar, (CrossBorderLinkAccountFlowContract$Step) obj3, null);
                    this.v = 1;
                    if (dVar.p2(this, aVar3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    orderInitiationDetails = ((gn9.d) this.f144781w).f144936a.getOrderInitiationDetails((String) obj3, this);
                    if (orderInitiationDetails != aVar4) {
                    }
                    return aVar4;
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                orderInitiationDetails = obj2;
                fn9.d dVar2 = (fn9.d) orderInitiationDetails;
                Intrinsics.checkNotNullParameter(dVar2, "<this>");
                String title = dVar2.getTitle();
                fn9.c logoImage = dVar2.getBranding().getLogoImage();
                String url2 = logoImage != null ? logoImage.getUrl() : null;
                fn9.b campaign = dVar2.getCampaign();
                aVar4 = new mn9.a(title, url2, campaign != null ? campaign.getCashback() : 0);
                return aVar4;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    s sVar = (s) this.f144781w;
                    f9i.c cVar = ((rr7.b) obj3).f256733a;
                    this.v = 1;
                    if (sVar.G1(cVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.f144781w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r10.a aVar7 = ((com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a) obj3).f71291r;
                whf.p pVar = (whf.p) data.getContent();
                List list = pVar != null ? pVar.f297646a : null;
                this.f144781w = null;
                this.v = 1;
                Object objW2 = aVar7.W(list, this);
                return objW2 == aVar6 ? aVar6 : objW2;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    gq9.f fVar = (gq9.f) this.f144781w;
                    File fileB = ((m) ((l) obj3)).b();
                    this.v = 1;
                    if (gq9.f.b3(fVar, fileB, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gq9.f fVar2 = (gq9.f) this.f144781w;
                gq9.e eVar = new gq9.e(fVar2, (File) obj3, null);
                this.v = 1;
                Object objB = pu7.a.B(fVar2.e, "scanBillUpload", eVar, this);
                return objB == aVar9 ? aVar9 : objB;
            case 6:
                String str = (String) this.f144781w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    if (str != null) {
                        gqh.e eVar2 = (gqh.e) obj3;
                        gi2.i iVar = new gi2.i(eVar2, str, null, i2);
                        this.f144781w = null;
                        this.v = 1;
                        if (u0.b0(eVar2.X(), "CREATE_SCREEN_BUTTON_TAG", iVar, this) == aVar10) {
                            return aVar10;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                int i66 = 1;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                aqc.k kVar = ((k) this.f144781w).f145976r;
                bqc.a aVar12 = (bqc.a) obj3;
                this.v = 1;
                mqc.f fVar3 = ((aqc.h) kVar).d;
                if (aVar12 instanceof bqc.f) {
                    String str2 = ((bqc.f) aVar12).f17805a;
                    mqc.k kVar2 = (mqc.k) fVar3;
                    kVar2.getClass();
                    mpd.p pVar2 = new mpd.p(kVar2, str2, null, i66);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, pVar2, this);
                } else {
                    if (!(aVar12 instanceof bqc.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str3 = ((bqc.b) aVar12).f17802a;
                    mqc.k kVar3 = (mqc.k) fVar3;
                    kVar3.getClass();
                    c0 c0Var = new c0(kVar3, str3, (Continuation) null, 6);
                    p0 p0Var2 = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, c0Var, this);
                }
                return objJ == aVar11 ? aVar11 : objJ;
            case 8:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    if (((yja.b) this.f144781w) == yja.b.NEXT_CLICK) {
                        dtd.a aVar14 = dVar3.f87924w;
                        this.v = 1;
                        Object objE = ((dtd.d) aVar14).e.e(new tk0.b("CUSTOM_ASSETS_SMART_ESTIMATION_AGREED"), Boolean.TRUE, this);
                        if (objE != aVar13) {
                            objE = Unit.f186387a;
                        }
                        if (objE == aVar13) {
                            return aVar13;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i74 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                dVar3.H2(dVar3.f87925x, new gqa.a(i3));
                return Unit.f186387a;
            case 9:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar16 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.f144781w).v, (String) obj3, aVar16, null, this, 4);
                return objX1 == aVar15 ? aVar15 : objX1;
            case 10:
                gs.j jVar = (gs.j) this.f144781w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = ((r) obj3).f146268p;
                    this.f144781w = null;
                    this.v = 1;
                    j2Var.setValue(jVar);
                    if (Unit.f186387a == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                gtd.r rVar = ((p) obj3).o;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    Object obj4 = this.f144781w;
                    if (obj4 instanceof u) {
                        this.v = 1;
                        if (rVar.a((u) obj4, this) == aVar18) {
                            return aVar18;
                        }
                    } else if (obj4 instanceof gtd.a) {
                        String tripId = ((gtd.a) obj4).f146574a;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(tripId, "tripId");
                        rVar.f146598a.c(u0.f(new AnalyticsFeatureConfig.Trips.Destination(tripId, null)));
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                gti.h hVar = (gti.h) obj3;
                ProducerScope producerScope = (ProducerScope) this.f144781w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    gti.g gVar = new gti.g(hVar, producerScope, new Handler(Looper.getMainLooper()), 0);
                    hVar.f146619a.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, gVar);
                    gti.e eVarA = gti.h.a(hVar);
                    if (eVarA != null) {
                        producerScope.mo3647trySendJP2dKIU(eVarA);
                    }
                    t tVar = new t(hVar, gVar, 21);
                    this.f144781w = null;
                    this.v = 1;
                    if (com.bumptech.glide.d.d(producerScope, tVar, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    o oVar = (o) this.f144781w;
                    gi2.i iVar2 = new gi2.i(oVar, (c02.j) obj3, null, 11);
                    this.v = 1;
                    if (oVar.Y2(this, iVar2) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c cVar2 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c) this.f144781w;
                    guf.o oVar2 = new guf.o(cVar2, (k71.i) obj3, null);
                    this.v = 1;
                    if (cVar2.p2(this, oVar2) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar2 = (com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f144781w;
                gi2.i iVar3 = new gi2.i(bVar2, (String) obj3, null, 12);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "resolve_private_markets_consent", iVar3, this);
                return objB2 == aVar22 ? aVar22 : objB2;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar24 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX12 = lg0.b.x1(((guj.d) this.f144781w).f146963q, (String) obj3, aVar24, null, this, 4);
                return objX12 == aVar23 ? aVar23 : objX12;
            case 17:
                gvf.b bVar3 = (gvf.b) this.f144781w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    puf.a aVar26 = bVar3.f147153a;
                    FeatureCommand featureCommand = new FeatureCommand(u0.d(new TransportFlowDestination(Intrinsics.f(((jf0.c) obj3).e(2), "tickets") ? new TransportStartType.Hub.Ticket(0) : TransportStartType.Hub.Transit.f92499a)));
                    this.v = 1;
                    objA = ((ovf.b) aVar26).a(featureCommand, this);
                    if (objA == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                bVar3.f147155c.c((NaviCommand) objA);
                return Boolean.TRUE;
            case 18:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    gvj.b bVar4 = (gvj.b) this.f144781w;
                    gi2.i iVar4 = new gi2.i(bVar4, (puj.g) obj3, null, 13);
                    this.v = 1;
                    if (u0.b0(bVar4.X(), "confirm_edit_dates_button", iVar4, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                Camera camera = (Camera) obj3;
                gw.e eVar3 = (gw.e) this.f144781w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                hw.a.a(camera, true);
                this.v = 1;
                Serializable serializableA = gw.e.a(eVar3, camera, this);
                return serializableA == aVar28 ? aVar28 : serializableA;
            case 20:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a aVar30 = (com.revolut.feature.freelancer.impl.ui.invoice.create.flow.a) this.f144781w;
                g84.u uVar = new g84.u(aVar30, (a0) obj3, null, i2);
                this.v = 1;
                Object objP2 = aVar30.p2(this, uVar);
                return objP2 == aVar29 ? aVar29 : objP2;
            case 21:
                TradingOnboardingBackendFlowContract$Configuration tradingOnboardingBackendFlowContract$Configuration = (TradingOnboardingBackendFlowContract$Configuration) obj3;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b0 b0Var = ((com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a) this.f144781w).f104230a;
                String f104227a = tradingOnboardingBackendFlowContract$Configuration.getF104227a();
                OnboardingPart f104225b = tradingOnboardingBackendFlowContract$Configuration.getF104225b();
                this.v = 1;
                hyk.a aVar32 = (hyk.a) b0Var.f185144b;
                List listC = zhm.u.c("investStockNationalityScreen");
                aVar32.getClass();
                g0a.e eVar4 = new g0a.e(25, aVar32, f104227a, f104225b, listC, null);
                p0 p0Var3 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, eVar4, this);
                return objJ2 == aVar31 ? aVar31 : objJ2;
            case 22:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objX13 = lg0.b.x1(((h25.e) this.f144781w).f148705l, (String) obj3, null, null, this, 6);
                return objX13 == aVar33 ? aVar33 : objX13;
            case 23:
                com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar34 = (com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) obj3;
                Pair pair = (Pair) this.f144781w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    j1j.d dVar4 = (j1j.d) pair.f186385a;
                    xi0.b bVar5 = (xi0.b) pair.f186386b;
                    fn2.c cVar3 = aVar34.v;
                    this.f144781w = null;
                    this.v = 1;
                    objP = cVar3.p(dVar4, bVar5, this);
                    if (objP == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                aVar34.H2(aVar34.E, new gwe.d((h2j.j) objP, 20));
                return Unit.f186387a;
            case 24:
                r10.a aVar36 = (r10.a) this.f144781w;
                Object eVar5 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = (CreditPluginsService) aVar36.f250811a;
                    String str4 = ((h1) obj3).f137835a;
                    this.v = 1;
                    downPaymentSourceConfig = creditPluginsService.getDownPaymentSourceConfig(str4, this);
                    if (downPaymentSourceConfig != eVar5) {
                    }
                    return eVar5;
                }
                if (i112 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                downPaymentSourceConfig = obj2;
                y04.a dto = (y04.a) downPaymentSourceConfig;
                Intrinsics.checkNotNullParameter(dto, "dto");
                a.c cVarB = dto.getSources();
                fx4.h hVarA = f1.a(cVarB.getHeader());
                ArrayList arrayListZ = d0.Z(cVarB.getItems());
                ArrayList arrayList = new ArrayList();
                Iterator it8 = arrayListZ.iterator();
                while (it8.hasNext()) {
                    e1 e1VarP = o0.p((m0) it8.next(), arrayListZ);
                    if (e1VarP != null) {
                        arrayList.add(e1VarP);
                    }
                }
                oy3.d dVar5 = new oy3.d(hVarA, arrayList, nx4.r.a(cVarB.getActionFooter()));
                a.C1726a c1726aA = dto.getDetails();
                if (c1726aA != null) {
                    String strG = c1726aA.getTitle();
                    String strD = c1726aA.getDescriptionTemplate();
                    String strC = c1726aA.getDescriptionAmountExceededTemplate();
                    dj0.d dVarO = mo3.a.o(c1726aA.getDepositAmount());
                    String strF = c1726aA.getSourcesTitle();
                    List listE = c1726aA.getSources();
                    ArrayList arrayList2 = new ArrayList(w.t(listE, 10));
                    Iterator it9 = listE.iterator();
                    while (it9.hasNext()) {
                        a.b bVar6 = (a.b) it9.next();
                        String strA = bVar6.getId();
                        String strD2 = bVar6.getTitle();
                        d1 d1VarD = o0.d(bVar6.getImage());
                        String strC2 = bVar6.getProgressColor();
                        oy3.b[] bVarArrValues = oy3.b.values();
                        a.C1726a c1726a = c1726aA;
                        int length = bVarArrValues.length;
                        Iterator it10 = it9;
                        int i113 = 0;
                        while (true) {
                            if (i113 < length) {
                                bVar = bVarArrValues[i113];
                                int i114 = length;
                                int i115 = i113;
                                if (!kotlin.text.a0.z(bVar.name(), strC2, true)) {
                                    i113 = i115 + 1;
                                    length = i114;
                                }
                            } else {
                                bVar = null;
                            }
                        }
                        if (bVar == null) {
                            bVar = oy3.b.TERRACOTTA;
                        }
                        arrayList2.add(new oy3.c(strA, strD2, d1VarD, bVar));
                        c1726aA = c1726a;
                        it9 = it10;
                    }
                    aVar = new oy3.a(strG, strD, strC, dVarO, strF, arrayList2, c1726aA.getButtonTitle());
                } else {
                    aVar = null;
                }
                eVar5 = new oy3.e(dVar5, aVar);
                return eVar5;
            case 25:
                Data data2 = (Data) this.f144781w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    f0 f0Var = ((com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) obj3).o;
                    whf.p pVar3 = (whf.p) data2.getContent();
                    List list2 = pVar3 != null ? pVar3.f297646a : null;
                    this.f144781w = data2;
                    this.v = 1;
                    objW = f0Var.e.W(list2, this);
                    if (objW == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objW = obj2;
                }
                return new Pair(data2, (b6k.e) objW);
            case 26:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                h43.s sVar2 = (h43.s) this.f144781w;
                g84.u uVar2 = new g84.u(sVar2, (ufm.i) obj3, objArr == true ? 1 : 0, i3);
                this.v = 1;
                Object objB3 = pu7.a.B(sVar2.k, "termsNavigation", uVar2, this);
                return objB3 == aVar38 ? aVar38 : objB3;
            case 27:
                h44.a aVar39 = (h44.a) this.f144781w;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objSkipSecurityDeposit = aVar39.f149313b.skipSecurityDeposit((String) obj3, this);
                    if (objSkipSecurityDeposit == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objSkipSecurityDeposit = obj2;
                }
                return aVar39.f149312a.p((tt3.a) objSkipSecurityDeposit);
            case 28:
                h53.c cVar4 = (h53.c) this.f144781w;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    CustomisationImageGenerationService customisationImageGenerationService = cVar4.f149446a;
                    g53.c cVar5 = new g53.c((String) obj3);
                    String strB = cVar4.f149448c.b("CUSTOMISATION_IMAGE_GENERATION");
                    this.v = 1;
                    objGenerateImages = customisationImageGenerationService.generateImages(cVar5, strB, this);
                    if (objGenerateImages == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objGenerateImages = obj2;
                }
                return ((g53.d) objGenerateImages).getId();
            default:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.application.d) this.f144781w;
                gi2.i iVar5 = new gi2.i(dVar6, (l84.e) obj3, objArr2 == true ? 1 : 0, 16);
                this.v = 1;
                Object objP22 = dVar6.p2(this, iVar5);
                return objP22 == aVar42 ? aVar42 : objP22;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144782x = obj2;
    }
}
