package sx2;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.client.api.models.HintMessage;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinkQrDestination;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import ks8.j;
import nii.u1;
import nii.y0;
import sgm.e3;
import t73.t1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f266327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f266328x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266327w = obj2;
        this.f266328x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r((com.revolut.feature.card_design.impl.card_design.carousel.e) this.f266327w, (hx2.k) this.f266328x, continuation, 0);
            case 1:
                r rVar = new r((com.revolut.camerakit.revolut.ui.flow.steps.camera.a) this.f266328x, continuation, 1);
                rVar.f266327w = obj2;
                return rVar;
            case 2:
                return new r((nyb.n0) this.f266327w, (ihm.f) this.f266328x, continuation, 2);
            case 3:
                r rVar2 = new r((ManualConsentScreen) this.f266328x, continuation, 3);
                rVar2.f266327w = obj2;
                return rVar2;
            case 4:
                r rVar3 = new r((com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) this.f266328x, continuation, 4);
                rVar3.f266327w = obj2;
                return rVar3;
            case 5:
                return new r((com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) this.f266327w, (FeedFilter) this.f266328x, continuation, 5);
            case 6:
                return new r((t20.n) this.f266328x, continuation, 6);
            case 7:
                return new r((t30.f) this.f266327w, (SlotContext) this.f266328x, continuation, 7);
            case 8:
                return new r((t30.f) this.f266327w, (ChatEntryPoint) this.f266328x, continuation, 8);
            case 9:
                return new r((t38.p) this.f266327w, (n38.d0) this.f266328x, continuation, 9);
            case 10:
                return new r((com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f266327w, (yof.b) this.f266328x, continuation, 10);
            case 11:
                return new r((com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f266327w, (h1j.d) this.f266328x, continuation, 11);
            case 12:
                return new r((t4a.c) this.f266327w, this.f266328x, continuation, 12);
            case 13:
                return new r((t50.u) this.f266327w, (z30.e) this.f266328x, continuation, 13);
            case 14:
                return new r((t5d.c) this.f266327w, (vh) this.f266328x, continuation, 14);
            case 15:
                return new r((com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.a) this.f266327w, (String) this.f266328x, continuation, 15);
            case 16:
                return new r((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f266327w, (CheckoutOrder) this.f266328x, continuation, 16);
            case 17:
                return new r((com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f266327w, (m73.a) this.f266328x, continuation, 17);
            case 18:
                r rVar4 = new r((com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b) this.f266328x, continuation, 18);
                rVar4.f266327w = obj2;
                return rVar4;
            case 19:
                return new r((com.revolut.feature.subaccount.impl.ui.create.flow.main.c) this.f266327w, (hr6.b) this.f266328x, continuation, 19);
            case 20:
                return new r((vkm.d) this.f266327w, (t8g.c) this.f266328x, continuation, 20);
            case 21:
                return new r((t9e.w) this.f266327w, (qua.p) this.f266328x, continuation, 21);
            case 22:
                return new r((k7i.i) this.f266327w, (s0h.a) this.f266328x, continuation, 22);
            case 23:
                return new r((com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) this.f266327w, (ba6.l) this.f266328x, continuation, 23);
            case 24:
                return new r((com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a) this.f266327w, (tch.y) this.f266328x, continuation, 24);
            case 25:
                r rVar5 = new r((fti.b) this.f266328x, continuation, 25);
                rVar5.f266327w = obj2;
                return rVar5;
            case 26:
                r rVar6 = new r((tf1.c0) this.f266328x, continuation, 26);
                rVar6.f266327w = obj2;
                return rVar6;
            case 27:
                return new r((tf9.f) this.f266327w, (String) this.f266328x, continuation, 27);
            case 28:
                return new r((tfk.a) this.f266327w, (String) this.f266328x, continuation, 28);
            default:
                r rVar7 = new r((UpgradeEntryPointItemContract$ItemType) this.f266328x, continuation, 29);
                rVar7.f266327w = obj2;
                return rVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((py.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((r) create((io3.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((r) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((r) create((tf1.r0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objB;
        Object objA;
        String str;
        Object objJ;
        Object objB2;
        Object objA2;
        List list;
        Object featureCommand;
        Object objB3;
        Object objE;
        Object objB4;
        Object objA3;
        Object value;
        Object value2;
        Object objB5;
        Object value3;
        tf9.g gVar;
        LinkedHashMap linkedHashMapP3;
        Object iVar;
        int i = this.u;
        int i2 = 5;
        int i3 = 6;
        int i5 = 0;
        int i6 = 4;
        int i21 = 2;
        String str2 = 0;
        str2 = 0;
        Object obj3 = this.f266328x;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = ((com.revolut.feature.card_design.impl.card_design.carousel.e) this.f266327w).L;
                    h93.l0 l0Var = ((hx2.i) ((hx2.k) obj3)).f156367a;
                    this.v = 1;
                    j2Var.setValue(l0Var);
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar2 = (com.revolut.camerakit.revolut.ui.flow.steps.camera.a) obj3;
                py.c cVar = (py.c) this.f266327w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    if (cVar instanceof py.a) {
                        HintMessage hintMessage = ((py.a) cVar).f240637a;
                        if (hintMessage != null) {
                            ((jv.r) aVar2.f50803p).i(hintMessage);
                        }
                        this.f266327w = null;
                        this.v = 1;
                        if (com.revolut.camerakit.revolut.ui.flow.steps.camera.a.I2(aVar2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (!(cVar instanceof py.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cli.y yVar = aVar2.z;
                        sy.e eVar = (sy.e) ((j2) yVar.f22677a).getValue();
                        if (eVar instanceof sy.d) {
                            aVar2.H2(yVar, new sx8.a((sy.d) eVar, i2));
                        }
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarA = ((nyb.n0) this.f266327w).a((ihm.f) obj3);
                    this.v = 1;
                    if (nim.a.a(bVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                ty0.a aVar5 = (ty0.a) this.f266327w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    t0l.j jVar = (t0l.j) ((ManualConsentScreen) obj3).Y.getValue();
                    Intrinsics.h(aVar5);
                    this.f266327w = null;
                    this.v = 1;
                    jVar.getClass();
                    if (Intrinsics.f(aVar5.d, "MANUAL_SPOUSE_SELECTION_LINK_ID")) {
                        jVar.n2(new t0l.h(jVar, str2, i5), new whi.b(i3));
                    }
                    if (Unit.f186387a == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                List list2 = (List) this.f266327w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                t18.w wVar = ((com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) obj3).f76434q;
                this.f266327w = null;
                this.v = 1;
                wVar.getClass();
                Object objA4 = list2.size() <= 1 ? wVar.a(list2) : skm.e0.J(skm.p0.f264002b, new sy6.j(wVar, list2, str2, 8), this);
                return objA4 == aVar7 ? aVar7 : objA4;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) this.f266327w).f76433p.l((FeedFilter) obj3, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                t20.n nVar = (t20.n) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError = ((cn0.g) nVar.f267402b.f253687a).g().filter(new rea.j(new rd3.m(23), i6)).firstOrError();
                    rea.j jVar2 = new rea.j(new rd3.m(24), i2);
                    d0VarFirstOrError.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarFirstOrError, jVar2, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    this.v = 1;
                    objB = nim.a.b(iVar2, this);
                    if (objB == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i92 != 1) {
                        if (i92 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.f266327w;
                        yhm.o.b(obj2);
                        objA = obj2;
                        return new t20.c((String) objA, new t20.a(t20.b.FRESH, str));
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                p10.f fVar = (p10.f) objB;
                String str3 = fVar.f231602a;
                String str4 = fVar.f231603b;
                v30.x xVarJ = nVar.j();
                String chatToken = xVarJ.getChatToken();
                if (chatToken != null && Intrinsics.f(xVarJ.getRevolutTokenHash(), nVar.e.b(str4))) {
                    str2 = chatToken;
                }
                String strQ = j6.a.q("***", kotlin.text.f0.V0(4, str4));
                if (str2 != 0) {
                    return new t20.c(str2, new t20.a(t20.b.CACHE, strQ));
                }
                this.f266327w = strQ;
                this.v = 2;
                objA = t20.n.a(nVar, str4, str3, this);
                if (objA == aVar9) {
                    return aVar9;
                }
                str = strQ;
                return new t20.c((String) objA, new t20.a(t20.b.FRESH, str));
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                SlotContext slotContext = (SlotContext) obj3;
                skd.i iVar3 = (skd.i) ((zjd.a) ((t30.f) this.f266327w).f267607b.get());
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(slotContext, "slotContext");
                akg.n nVarV = nim.a.v(iVar3.f263835a.c(slotContext, true), new sk2.f(7));
                qkg.a aVar11 = new qkg.a(i21, 25, str2);
                this.v = 1;
                Object objY = vkm.q.y(nVarV, aVar11, this);
                return objY == aVar10 ? aVar10 : objY;
            case 8:
                ChatEntryPoint chatEntryPoint = (ChatEntryPoint) obj3;
                t30.f fVar2 = (t30.f) this.f266327w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    b30.e eVar2 = fVar2.f267606a;
                    this.v = 3;
                    b30.c cVar2 = new b30.c(eVar2, str2, i5);
                    skm.p0 p0Var = skm.p0.f264001a;
                    objJ = skm.e0.J(elm.f.f127540b, cVar2, this);
                    if (objJ == aVar12) {
                        return aVar12;
                    }
                }
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    if (((jte.d) ((rf3.d) fVar2.f267608c).f253679a).c(ChatApi$Toggles.AirCmsSuggestions.f50961c)) {
                        this.v = 1;
                        objA2 = t30.f.a(fVar2, chatEntryPoint, this);
                        if (objA2 == aVar12) {
                            return aVar12;
                        }
                        list = (List) objA2;
                    } else {
                        this.v = 2;
                        objB2 = t30.f.b(fVar2, chatEntryPoint, this);
                        if (objB2 == aVar12) {
                            return aVar12;
                        }
                        list = (List) objB2;
                    }
                } else if (i99 == 1) {
                    yhm.o.b(obj2);
                    objA2 = obj2;
                    list = (List) objA2;
                } else {
                    if (i99 != 2) {
                        if (i99 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objJ = obj2;
                        return (List) objJ;
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                    list = (List) objB2;
                }
                return list;
            case 9:
                n38.d0 d0Var = (n38.d0) obj3;
                t38.p pVar = (t38.p) this.f266327w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    g48.r0 r0Var = pVar.f267699n;
                    String str5 = d0Var.f211937a;
                    this.v = 1;
                    if (r0Var.t(str5, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                boolean z = d0Var.f;
                pVar.getClass();
                pVar.L2(new y0("REJECT_SUCCESS_DIALOG_ID", new nii.j0((Clause) (z ? new TextLocalisedClause(R$string.joint_home_invitation_outgoing_pending_cancel_status_title, null, null, 14) : new TextLocalisedClause(R$string.joint_home_invitation_incoming_pending_decline_status_title, null, null, 14)), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4));
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar3 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f266327w;
                    mcg.j jVar3 = new mcg.j((yof.b) obj3, cVar3, str2, 11);
                    this.v = 1;
                    if (cVar3.p2(this, jVar3) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar4 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f266327w;
                    sb4.i iVar4 = new sb4.i(cVar4, (h1j.d) obj3, str2, 13);
                    this.v = 1;
                    if (cVar4.p2(this, iVar4) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                t4a.c cVar5 = (t4a.c) this.f266327w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    i3a.b bVar = cVar5.f267953l;
                    this.v = 1;
                    bVar.getClass();
                    int i104 = i3a.a.f158163a[((l4a.a) obj3).ordinal()];
                    if (i104 == 1) {
                        featureCommand = new FeatureCommand(new PaymentLinksFeatureConfig.CreatePaymentLink(hrf.f.OUTGOING));
                    } else if (i104 == 2) {
                        featureCommand = zh9.u0.f(PaymentLinkQrDestination.f102166a);
                    } else if (i104 == 3) {
                        featureCommand = zh9.u0.f(new FreelancerBizFeatureConfig.NewSale(cs6.c.PAYMENT_LINK, null));
                    } else {
                        if (i104 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        featureCommand = hr6.l.b(bVar.f158164a, null, this, 3);
                    }
                    if (featureCommand == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    featureCommand = obj2;
                }
                return cVar5.A2(new BridgeDestination((NaviCommand) featureCommand));
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                t50.u uVar = (t50.u) this.f266327w;
                t50.q qVar = new t50.q(uVar, (z30.e) obj3, null);
                this.v = 1;
                Object objB6 = pu7.a.B(uVar.k, "rate_chat_experience", qVar, this);
                return objB6 == aVar17 ? aVar17 : objB6;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    t5d.e eVar3 = ((t5d.c) this.f266327w).f268054n;
                    this.v = 1;
                    eVar3.getClass();
                    Object obj4 = ((vh) obj3).f54883a.f;
                    o5d.e eVar4 = obj4 instanceof o5d.e ? (o5d.e) obj4 : null;
                    if (eVar4 == null) {
                        objB3 = Unit.f186387a;
                    } else {
                        p5d.b bVar2 = eVar4.f222426b;
                        p5d.d dVar = (p5d.d) eVar3.f268055a.get(bVar2.f233096b);
                        if (dVar == null || (objB3 = dVar.b3(bVar2, eVar4.f222425a, this)) != aVar18) {
                            objB3 = Unit.f186387a;
                        }
                    }
                    if (objB3 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.a aVar20 = (com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.a) this.f266327w;
                    sb4.i iVar5 = new sb4.i(aVar20, (String) obj3, str2, 15);
                    this.v = 1;
                    if (aVar20.p2(this, iVar5) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f266327w;
                    t1 t1Var = new t1(gVar2, (CheckoutOrder) obj3, null);
                    this.v = 1;
                    if (gVar2.p2(this, t1Var) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                m73.a aVar22 = (m73.a) obj3;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f266327w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    gVar3.H2(gVar3.f65434h0, new t5e.m(aVar22, i3));
                    d73.u uVar2 = gVar3.X;
                    String str6 = aVar22.f203299a.f150110a;
                    this.v = 1;
                    uVar2.getClass();
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, new d73.r(uVar2, str6, str2, i21), this);
                    Object obj5 = objJ2;
                    if (objJ2 != aVar23) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                io3.d dVar2 = (io3.d) this.f266327w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    h6i.o oVar = ((com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b) obj3).f70509n;
                    String str7 = dVar2.f163145a;
                    k1j.a aVar25 = k1j.a.POCKETS;
                    this.f266327w = null;
                    this.v = 1;
                    objE = oVar.e(this, str7, aVar25);
                    if (objE == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objE = obj2;
                }
                return zi0.c.i(objE);
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar6 = (com.revolut.feature.subaccount.impl.ui.create.flow.main.c) this.f266327w;
                t7e.g gVar4 = new t7e.g(cVar6, (hr6.b) obj3, null);
                this.v = 1;
                Object objP2 = cVar6.p2(this, gVar4);
                return objP2 == aVar26 ? aVar26 : objP2;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((vkm.d) this.f266327w).collect((t8g.c) obj3, this) == aVar27) {
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
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                t9e.w wVar2 = (t9e.w) this.f266327w;
                t9e.r rVar = new t9e.r(wVar2, (qua.p) obj3, str2, i21);
                this.v = 1;
                Object objB7 = pu7.a.B(wVar2.k, "block_subscription", rVar, this);
                return objB7 == aVar28 ? aVar28 : objB7;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objJ3 = ((e3) ((k7i.i) this.f266327w).f182069b).j((s0h.a) obj3, this);
                return objJ3 == aVar29 ? aVar29 : objJ3;
            case 23:
                com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar7 = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) this.f266327w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    cu8.r0 r0Var2 = cVar7.z;
                    this.v = 1;
                    objB4 = ks8.m.b(r0Var2, this);
                    if (objB4 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB4 = obj2;
                }
                ks8.j jVar4 = (ks8.j) objB4;
                if (jVar4 instanceof ks8.i) {
                    return cVar7.C1(new BridgeDestination(((ks8.i) jVar4).f189312a));
                }
                if (!(jVar4 instanceof j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar7.C2(new tb6.n(((ba6.l) obj3).f13938a));
                return Unit.f186387a;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar32 = (com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a) this.f266327w;
                tch.g0 g0Var = new tch.g0(aVar32, (tch.y) obj3, str2, i22);
                this.v = 1;
                Object objB8 = pu7.a.B(aVar32.k, "delete recurring order", g0Var, this);
                return objB8 == aVar31 ? aVar31 : objB8;
            case 25:
                FlowCollector flowCollector = (FlowCollector) this.f266327w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    qf1.t tVar = ((efj.c) ((cej.a) ((fti.b) obj3).f138027b)).a() ? new qf1.t(qf1.f.ESIM.getId()) : null;
                    this.f266327w = null;
                    this.v = 1;
                    if (flowCollector.emit(tVar, this) == aVar33) {
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
                tf1.r0 r0Var3 = (tf1.r0) this.f266327w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    os2.g gVar5 = ((tf1.c0) obj3).f270151c;
                    this.f266327w = null;
                    this.v = 1;
                    if (r0Var3 instanceof tf1.n0) {
                        tf1.n0 n0Var = (tf1.n0) r0Var3;
                        ArrayList arrayList = n0Var.f270187a;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((qf1.l) ((Pair) it8.next()).f186385a).name());
                        }
                        List list3 = n0Var.f270188b;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(((qf1.l) it9.next()).name());
                        }
                        objA3 = ((xf1.f) gVar5.f229224b).a(new xf1.i(arrayList2, arrayList3), this);
                        if (objA3 != fim.a.COROUTINE_SUSPENDED) {
                            objA3 = Unit.f186387a;
                        }
                    } else {
                        objA3 = Unit.f186387a;
                    }
                    if (objA3 == aVar34) {
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
                tf9.f fVar3 = (tf9.f) this.f266327w;
                j2 j2Var2 = fVar3.f270277q;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                try {
                    if (i119 == 0) {
                        yhm.o.b(obj2);
                        String str8 = (String) obj3;
                        do {
                            value2 = j2Var2.getValue();
                        } while (!j2Var2.h(value2, tf9.g.a((tf9.g) value2, null, null, null, str8, 15)));
                        wo1.b bVar3 = fVar3.f270275n;
                        xo1.g gVar6 = xo1.g.NZ_BILLS;
                        Biller biller = ((tf9.g) j2Var2.getValue()).f270278a;
                        String str9 = biller != null ? biller.f61145a : null;
                        if (str9 == null) {
                            str9 = "";
                        }
                        xo1.d dVar3 = new xo1.d(gVar6, str9, null, 26);
                        this.v = 1;
                        objB5 = ((vp1.c) bVar3).b(dVar3, this);
                        if (objB5 == aVar35) {
                            return aVar35;
                        }
                    } else {
                        if (i119 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objB5 = obj2;
                    }
                    List list4 = (List) objB5;
                    String str10 = (String) obj3;
                    do {
                        value3 = j2Var2.getValue();
                        gVar = (tf9.g) value3;
                        String str11 = (String) gVar.f270280c.get(str10);
                        linkedHashMapP3 = tf9.f.p3(list4);
                        if (str11 != null) {
                            Map mapC = zhm.q0.c(new Pair(str10, str11));
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMapP3.entrySet()) {
                                if (!Intrinsics.f((String) entry.getKey(), str10)) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            linkedHashMapP3 = zhm.r0.p(mapC, linkedHashMap);
                        }
                    } while (!j2Var2.h(value3, tf9.g.a(gVar, null, list4, linkedHashMapP3, null, 3)));
                    return Unit.f186387a;
                } catch (Exception e2) {
                    do {
                        value = j2Var2.getValue();
                    } while (!j2Var2.h(value, tf9.g.a((tf9.g) value, null, null, null, null, 15)));
                    throw e2;
                }
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    dha.c cVar8 = ((tfk.a) this.f266327w).f270327b;
                    this.v = 1;
                    pfk.p0 p0Var3 = (pfk.p0) cVar8;
                    p0Var3.getClass();
                    pfk.l0 l0Var2 = new pfk.l0(p0Var3, (String) obj3, str2, i22);
                    skm.p0 p0Var4 = skm.p0.f264001a;
                    Object objJ4 = skm.e0.J(elm.f.f127540b, l0Var2, this);
                    Object obj6 = objJ4;
                    if (objJ4 != aVar36) {
                        obj6 = Unit.f186387a;
                    }
                    if (obj6 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f266327w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    UpgradeEntryPointItemContract$ItemType upgradeEntryPointItemContract$ItemType = (UpgradeEntryPointItemContract$ItemType) obj3;
                    Intrinsics.checkNotNullParameter(upgradeEntryPointItemContract$ItemType, "<this>");
                    if (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Exchange) {
                        iVar = mga.p.f205213a;
                    } else if (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Fees.Commodity) {
                        iVar = new mga.i(null);
                    } else {
                        if ((upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity) || (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Commodity)) {
                            throw new IllegalStateException("Contextual banners for commodities are not yet supported");
                        }
                        if ((upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Fees.Crypto) || (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Crypto) || (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering) || (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering)) {
                            throw new IllegalStateException("Contextual banners for crypto are not yet supported");
                        }
                        if ((upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Fees.Stocks) || (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Stocks) || (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.Stocks)) {
                            throw new IllegalStateException("Contextual banners for stocks are not yet supported");
                        }
                        if (!(upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Atm)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iVar = mga.e.f205204a;
                    }
                    this.f266327w = null;
                    this.v = 1;
                    if (flowCollector2.emit(iVar, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266328x = obj2;
    }
}
