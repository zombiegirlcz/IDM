package rbh;

import android.content.Intent;
import c1g.c0;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.crypto.spare.change.impl.data.service.CryptoSpareChangeService;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreen;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreen;
import et6.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import om4.r0;
import org.jmrtd.lds.LDSFile;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.z1;
import zh9.u0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f253074w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253074w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((m) this.f253074w, continuation, 0);
            case 1:
                return new k((rc1.b) this.f253074w, continuation, 1);
            case 2:
                return new k((re2.i) this.f253074w, continuation, 2);
            case 3:
                return new k((rg3.o) this.f253074w, continuation, 3);
            case 4:
                return new k((com.revolut.feature.apm.wero.impl.ui.wrapper.b) this.f253074w, continuation, 4);
            case 5:
                return new k((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) this.f253074w, continuation, 5);
            case 6:
                return new k((com.revolut.feature.credit.application.plugins.impl.ui.workflow.a) this.f253074w, continuation, 6);
            case 7:
                return new k((rl5.c) this.f253074w, continuation, 7);
            case 8:
                return new k((rld.m) this.f253074w, continuation, 8);
            case 9:
                return new k((com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) this.f253074w, continuation, 9);
            case 10:
                return new k((rmb.q) this.f253074w, continuation, 10);
            case 11:
                return new k((com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a) this.f253074w, continuation, 11);
            case 12:
                return new k((rnl.g) this.f253074w, continuation, 12);
            case 13:
                return new k((ro8.j) this.f253074w, continuation, 13);
            case 14:
                return new k((rpl.h) this.f253074w, continuation, 14);
            case 15:
                return new k((rqc.h) this.f253074w, continuation, 15);
            case 16:
                return new k((rqk.e) this.f253074w, continuation, 16);
            case 17:
                return new k((rrj.o) this.f253074w, continuation, 17);
            case 18:
                return new k((rsk.j) this.f253074w, continuation, 18);
            case 19:
                return new k((InvestAccountSelectorScreen) this.f253074w, continuation, 19);
            case 20:
                return new k((rv7.j) this.f253074w, continuation, 20);
            case 21:
                return new k((rvc.n) this.f253074w, continuation, 21);
            case 22:
                return new k((com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) this.f253074w, continuation, 22);
            case 23:
                return new k((ConsentRequestScreen) this.f253074w, continuation, 23);
            case 24:
                return new k((s2f.d) this.f253074w, continuation, 24);
            case 25:
                return new k((s2g.w) this.f253074w, continuation, 25);
            case 26:
                return new k((com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) this.f253074w, continuation, 26);
            case 27:
                return new k((s36.h) this.f253074w, continuation, 27);
            case 28:
                return new k((s44.p) this.f253074w, continuation, 28);
            default:
                return new k((com.revolut.feature.credit.loan.impl.ui.autopay.flow.a) this.f253074w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objD;
        Object objP2;
        Object objRemoveCryptoSpareChange;
        Object objPutIfAbsent;
        Object objA;
        Object objB;
        Object objB2;
        Object objX;
        int i = this.u;
        int i2 = 28;
        int i3 = 7;
        int i5 = 14;
        int i6 = 0;
        int i21 = 27;
        int i22 = 13;
        Continuation continuation = null;
        Object obj3 = this.f253074w;
        int i32 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m mVar = (m) obj3;
                p40.v vVar = new p40.v(mVar, continuation, i21);
                this.v = 1;
                Object objY2 = mVar.Y2(this, vVar);
                return objY2 == aVar ? aVar : objY2;
            case 1:
                rc1.b bVar = (rc1.b) obj3;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    cfc.b bVar2 = bVar.u;
                    this.v = 1;
                    objD = ((l0) bVar2.f23674b).d(this);
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                boolean zBooleanValue = ((Boolean) objD).booleanValue();
                yji.l.j2(bVar, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_order_promotion_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_order_promotion_subtitle, null, null, 14), new UrlImage("https://assets.revolut.com/published-assets-v2/b2502054-b2e4-4202-810d-8dc3bb889a79/3aaef9f4-c531-4ba1-ba7b-c908c301f85f.png", (String) null, (UrlImageDrawable) new UrlImageDrawable.ImagePlaceholder(new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorAccent), null)), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) (zBooleanValue ? new TextLocalisedClause(R$string.merchant_card_reader_flow_shop_hardware_title, null, null, 14) : new TextLocalisedClause(R$string.merchant_card_reader_order_promotion_action_title, null, null, 14)), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.d, false, (String) null, 54), null, null, null, null, null, null, 65360)), null, new l3d.f(zBooleanValue, bVar, 23), 1);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    re2.i iVar = (re2.i) obj3;
                    p40.v vVar2 = new p40.v(iVar, continuation, i2);
                    this.v = 1;
                    if (u0.b0(iVar.X(), "CONTINUE_BUTTON_LOADING_TAG", vVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    rg3.o oVar = (rg3.o) obj3;
                    this.v = 1;
                    rd3.m mVar2 = new rd3.m(i2);
                    oVar.getClass();
                    qg7.p pVar = new qg7.p(oVar, mVar2, continuation, i22);
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, pVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.wero.impl.ui.wrapper.b bVar3 = (com.revolut.feature.apm.wero.impl.ui.wrapper.b) obj3;
                    com.revolut.feature.apm.wero.impl.ui.wrapper.a aVar6 = new com.revolut.feature.apm.wero.impl.ui.wrapper.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar6) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a aVar7 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    rik.e eVar = new rik.e(aVar7, continuation, i6);
                    this.v = 1;
                    objP2 = aVar7.p2(this, eVar);
                    if (objP2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                StudentFlowContract$Step studentFlowContract$Step = (StudentFlowContract$Step) objP2;
                if (studentFlowContract$Step == null) {
                    aVar7.J2();
                    return Unit.f186387a;
                }
                oki.h.t2(aVar7, aVar7.f103270q, studentFlowContract$Step, false, null, false, 12);
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.workflow.a aVar10 = (com.revolut.feature.credit.application.plugins.impl.ui.workflow.a) obj3;
                rj4.d dVar = new rj4.d(aVar10, continuation, i32);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar10.k, "finish workflow", dVar, this);
                return objB3 == aVar9 ? aVar9 : objB3;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    CryptoSpareChangeService cryptoSpareChangeService = ((rl5.c) obj3).f254918a;
                    this.v = 1;
                    objRemoveCryptoSpareChange = cryptoSpareChangeService.removeCryptoSpareChange(this);
                    if (objRemoveCryptoSpareChange == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objRemoveCryptoSpareChange = obj2;
                }
                Response response = (Response) objRemoveCryptoSpareChange;
                int iCode = response.code();
                if (iCode == 204 || iCode == 404) {
                    return il5.a.f162084a;
                }
                throw new HttpException(response);
            case 8:
                rld.m mVar3 = (rld.m) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    rld.a aVar13 = mVar3.f255029t;
                    String str = ((rld.h) ((j2) mVar3.v.f22677a).getValue()).f255019b;
                    this.v = 1;
                    ConcurrentHashMap concurrentHashMap = aVar13.f255014a;
                    Object objB4 = concurrentHashMap.get(str);
                    if (objB4 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objB4 = e0.b()))) != null) {
                        objB4 = objPutIfAbsent;
                    }
                    Object objY = ((skm.r) ((skm.q) objB4)).y(this);
                    if (objY != aVar12) {
                        objY = Unit.f186387a;
                    }
                    if (objY == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                mVar3.C2(aii.q.f5292a);
                return Unit.f186387a;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a aVar15 = (com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) obj3;
                    rik.e eVar2 = new rik.e(aVar15, continuation, 4);
                    this.v = 1;
                    if (aVar15.p2(this, eVar2) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    ijb.a aVar17 = ((rmb.q) obj3).o;
                    this.v = 1;
                    if (ijb.a.e(aVar17, null, this, 3) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    dfj.u uVar = ((com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a) obj3).o;
                    this.v = 1;
                    Object objE = uVar.d.e(this);
                    if (objE != aVar18) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    rnl.g gVar = (rnl.g) obj3;
                    jmc.e eVar3 = new jmc.e(gVar, continuation, i22);
                    this.v = 1;
                    if (u0.b0(gVar.X(), "CONFIRM_BUTTON_TAG", eVar3, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                ro8.j jVar = (ro8.j) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    ro8.i iVar2 = new ro8.i(jVar, continuation, i32);
                    this.v = 1;
                    if (pu7.a.B(jVar.k, "SIGN_OUT_ACTIVE_DEVICES_TASK_ID", iVar2, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                jVar.C2(ro8.f.f255939a);
                return Unit.f186387a;
            case 14:
                rpl.h hVar = (rpl.h) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    rpl.k kVar = hVar.o;
                    String str2 = ((rpl.c) ((j2) hVar.f256424p.f22677a).getValue()).f256420a;
                    this.v = 1;
                    objA = kVar.a(str2, this);
                    if (objA == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                hVar.C2(new rpl.d((Intent) objA));
                return Unit.f186387a;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rqc.h hVar2 = (rqc.h) obj3;
                rik.e eVar4 = new rik.e(hVar2, continuation, i3);
                this.v = 1;
                Object objB5 = pu7.a.B(hVar2.k, "cancelSalarySwitchRequest", eVar4, this);
                return objB5 == aVar22 ? aVar22 : objB5;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarA = ((rqk.e) obj3).f256577a.a(false);
                    this.v = 1;
                    if (nim.a.a(bVarA, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((rrj.o) obj3).z;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                rsk.j jVar2 = (rsk.j) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((ael.k) jVar2.f257116p).e(jVar2.f257113l.f257102a);
                    this.v = 1;
                    objB = nim.a.b(iVarE, this);
                    if (objB == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                nel.n nVar = (nel.n) objB;
                if (io3.h.i(nVar.f214597c)) {
                    yji.n.l2(jVar2, vkm.q.Q(jVar2.f257117q.a(), new rsk.g(continuation, jVar2, nVar, i32)), null, null, 7);
                    return Unit.f186387a;
                }
                hx7.e.n(new IllegalArgumentException(j6.a.q("Call Date widget was called with not Bond instrument. Instrument ref: ", nVar.f214596b)));
                return Unit.f186387a;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    rtl.p pVar2 = (rtl.p) ((InvestAccountSelectorScreen) obj3).O.getValue();
                    this.v = 1;
                    rtl.u uVar2 = (rtl.u) pVar2;
                    uVar2.getClass();
                    if (pu7.a.B(uVar2.k, "post_back", new jmc.e(uVar2, continuation, i5), this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    rv7.j jVar3 = (rv7.j) obj3;
                    mu7.c cVar = jVar3.f257731r;
                    String str3 = jVar3.o.f76126a;
                    this.v = 1;
                    if (cVar.b(this, str3, false) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    rvc.n nVar2 = (rvc.n) obj3;
                    rik.e eVar5 = new rik.e(nVar2, continuation, 9);
                    this.v = 1;
                    if (nVar2.p2(this, eVar5) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar30 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) obj3;
                    rze.o oVar2 = new rze.o(aVar30, null);
                    this.v = 1;
                    if (aVar30.p2(this, oVar2) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    s0l.h hVar3 = (s0l.h) ((ConsentRequestScreen) obj3).c0.getValue();
                    this.v = 1;
                    s0l.s sVar = (s0l.s) hVar3;
                    zm3.a aVar31 = ((s0l.e) sVar.t2()).f258977b;
                    String str4 = aVar31 instanceof zm3.i ? ((zm3.i) aVar31).e.f323345a : aVar31 instanceof zm3.f ? ((zm3.f) aVar31).f323345a : null;
                    if (str4 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("selected partner is null");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        objB2 = Unit.f186387a;
                    } else {
                        objB2 = pu7.a.B(sVar.k, "onLargeButtonClick", new s0l.r(sVar, str4, null), this);
                        if (objB2 != obj4) {
                            objB2 = Unit.f186387a;
                        }
                    }
                    if (objB2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    s2f.d dVar2 = (s2f.d) obj3;
                    rik.e eVar6 = new rik.e(dVar2, continuation, i22);
                    this.v = 1;
                    if (u0.b0(dVar2.X(), "UNLINK_ACCOUNT_CONFIRMATION_BUTTON_TAG", eVar6, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                s2g.w wVar = (s2g.w) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    c0 c0Var = wVar.f259331q;
                    hyf.c cVar2 = new hyf.c(wVar.f259335w.a().f210451a, wVar.f259330p.d, ((s2g.j) wVar.t2()).d.f240825b, ((s2g.j) wVar.t2()).f259313c.f240824b);
                    s2g.q qVar = new s2g.q(wVar, 2);
                    rtl.y yVar = new rtl.y(wVar, 18);
                    ihm.f fVar = wVar.f259337y;
                    this.v = 1;
                    if (c0Var.a(cVar2, qVar, yVar, fVar, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar35 = (com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) obj3;
                    s2k.d dVar3 = new s2k.d(aVar35, null);
                    this.v = 1;
                    if (aVar35.p2(this, dVar3) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    rul.e eVar7 = ((s36.h) obj3).f259431a;
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jhi.b bVarG = mo3.a.g(vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) eVar7.f257630b)), new r0(continuation, eVar7, loadingStrategy, i21)), null, new s20.c(8), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it8 = ((Iterable) objX).iterator();
                while (it8.hasNext()) {
                    t36.a aVar37 = ((t36.c) it8.next()).f267660b;
                    String str5 = aVar37 != null ? aVar37.f267656a : null;
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                }
                return d0.i1(arrayList);
            case 28:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    s44.p pVar3 = (s44.p) obj3;
                    s44.o oVar3 = new s44.o(pVar3, null);
                    this.v = 1;
                    if (pVar3.p2(this, oVar3) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar40 = (com.revolut.feature.credit.loan.impl.ui.autopay.flow.a) obj3;
                s55.c cVar3 = new s55.c(aVar40, continuation, i32);
                this.v = 1;
                Object objB6 = pu7.a.B(aVar40.k, "confirm autopay method", cVar3, this);
                return objB6 == aVar39 ? aVar39 : objB6;
        }
    }
}
