package yv1;

import a41.v0;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.revolut.chat.data.network.OkHttpChatWsApiV2$WsConnectionLostException;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.search.RevPointsGiftcardsSearchScreen;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import com.revolut.feature.staking.impl.service.pocket.StakingPocketService;
import do3.q;
import ft3.h1;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import org.json.JSONException;
import org.json.JSONObject;
import puk.s;
import qua.p;
import skm.h2;
import skm.k0;
import v30.e1;
import vkm.j2;
import yg5.r;
import z0f.f0;
import z0k.o;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f317092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f317093x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317092w = obj2;
        this.f317093x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((l) this.f317092w, (Alias) this.f317093x, continuation, 0);
            case 1:
                return new k((yvd.c) this.f317092w, (zvd.c) this.f317093x, continuation, 1);
            case 2:
                return new k((com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) this.f317092w, (List) this.f317093x, continuation, 2);
            case 3:
                return new k((View) this.f317092w, (RevPointsGiftcardsSearchScreen) this.f317093x, continuation, 3);
            case 4:
                return new k((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) this.f317092w, (dw5.b) this.f317093x, continuation, 4);
            case 5:
                return new k((yxh.e) this.f317092w, (yxh.d) this.f317093x, continuation, 5);
            case 6:
                return new k((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f317092w, (String) this.f317093x, continuation, 6);
            case 7:
                k kVar = new k((com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f317093x, continuation, 7);
                kVar.f317092w = obj2;
                return kVar;
            case 8:
                return new k((com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) this.f317092w, (CreditForbearanceAgreementsContract$Step) this.f317093x, continuation, 8);
            case 9:
                return new k((com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) this.f317093x, continuation, 9);
            case 10:
                k kVar2 = new k((yzh.d) this.f317093x, continuation, 10);
                kVar2.f317092w = obj2;
                return kVar2;
            case 11:
                return new k((ys.i) this.f317092w, (z0c.i) this.f317093x, continuation, 11);
            case 12:
                k kVar3 = new k((f0) this.f317093x, continuation, 12);
                kVar3.f317092w = obj2;
                return kVar3;
            case 13:
                return new k((o) this.f317092w, (rzj.j) this.f317093x, continuation, 13);
            case 14:
                return new k((o) this.f317092w, (rzj.f) this.f317093x, continuation, 14);
            case 15:
                return new k((e1) this.f317092w, (ProducerScope) this.f317093x, continuation, 15);
            case 16:
                return new k((z24.a) this.f317092w, (String) this.f317093x, continuation, 16);
            case 17:
                return new k((z24.a) this.f317092w, (h1) this.f317093x, continuation, 17);
            case 18:
                return new k((z31.c) this.f317092w, (v0) this.f317093x, continuation, 18);
            case 19:
                k kVar4 = new k((com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.f317093x, continuation, 19);
                kVar4.f317092w = obj2;
                return kVar4;
            case 20:
                return new k((z34.b) this.f317092w, (h1) this.f317093x, continuation, 20);
            case 21:
                return new k((com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f317092w, (ux4.d) this.f317093x, continuation, 21);
            case 22:
                return new k((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f317092w, (yof.b) this.f317093x, continuation, 22);
            case 23:
                return new k((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f317092w, (String) this.f317093x, continuation, 23);
            case 24:
                return new k((z9j.e) this.f317092w, (String) this.f317093x, continuation, 24);
            case 25:
                return new k((z9m.k) this.f317093x, continuation, 25);
            case 26:
                return new k((z9m.k) this.f317092w, (JSONObject) this.f317093x, continuation, 26);
            case 27:
                return new k((com.revolut.feature.credit.application.plugins.impl.ui.esign.a) this.f317092w, (ab4.n) this.f317093x, continuation, 27);
            case 28:
                return new k((com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) this.f317092w, (DeliveryCarrier) this.f317093x, continuation, 28);
            default:
                return new k((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) this.f317092w, (vim.d) this.f317093x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
    public final Object invokeSuspend(Object obj2) throws JSONException {
        com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a aVar;
        Map mapG;
        int i = this.u;
        boolean z = false;
        int i2 = 22;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object obj3 = this.f317093x;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    l lVar = (l) this.f317092w;
                    r rVar = new r(lVar, (Alias) obj3, objArr == true ? 1 : 0, 13);
                    this.v = 1;
                    if (q.t(lVar, rVar, this) == aVar2) {
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
                yvd.c cVar = (yvd.c) this.f317092w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    StakingPocketService stakingPocketService = cVar.f;
                    zvd.c unstakeRequest = (zvd.c) obj3;
                    String str = unstakeRequest.f325664c;
                    Intrinsics.checkNotNullParameter(unstakeRequest, "unstakeRequest");
                    Intrinsics.checkNotNullParameter(unstakeRequest, "unstakeRequest");
                    mwd.c cVar2 = new mwd.c(unstakeRequest.f325662a, unstakeRequest.f325663b);
                    this.v = 1;
                    if (stakingPocketService.unstake(str, cVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar3 = cVar.f317167h;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar3.d(unit, true, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar5 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) this.f317092w;
                yvk.m mVar = new yvk.m(aVar5, (List) obj3, objArr2 == true ? 1 : 0, i3);
                this.v = 1;
                Object objB = pu7.a.B(aVar5.k, "update display asset stats items", mVar, this);
                return objB == aVar4 ? aVar4 : objB;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    kli.c.c((View) this.f317092w, false);
                    this.v = 1;
                    if (k0.b(500L, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((ywb.m) ((RevPointsGiftcardsSearchScreen) obj3).e3()).B2();
                return Unit.f186387a;
            case 4:
                my5.d dVar = ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b) this.f317092w).f71589p;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarB = dVar.b(((dw5.b) obj3).f120335a);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                efm.b bVarA = dVar.a();
                this.v = 2;
                if (nim.a.a(bVarA, this) == aVar7) {
                    return aVar7;
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                yxh.e eVar = (yxh.e) this.f317092w;
                r rVar2 = new r(eVar, (yxh.d) obj3, objArr3 == true ? 1 : 0, 15);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar.e, "cancel", rVar2, this);
                return objB2 == aVar8 ? aVar8 : objB2;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar4 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) this.f317092w;
                    r rVar3 = new r(cVar4, (String) obj3, objArr4 == true ? 1 : 0, 16);
                    this.v = 1;
                    if (cVar4.p2(this, rVar3) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.f317092w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c cVar5 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.details.c) obj3;
                r rVar4 = new r(cVar5, coroutineScope, objArr5 == true ? 1 : 0, 17);
                this.f317092w = null;
                this.v = 1;
                Object objB3 = pu7.a.B(cVar5.k, "create_or_update_template", rVar4, this);
                return objB3 == aVar10 ? aVar10 : objB3;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c cVar6 = (com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) this.f317092w;
                com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.a aVar12 = new com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.a(cVar6, (CreditForbearanceAgreementsContract$Step) obj3, null);
                this.v = 1;
                Object objP2 = cVar6.p2(this, aVar12);
                return objP2 == aVar11 ? aVar11 : objP2;
            case 9:
                com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a aVar13 = (com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    lzb.c cVar7 = aVar13.f83840q;
                    this.f317092w = aVar13;
                    this.v = 1;
                    obj2 = cVar7.Z2(this);
                    if (obj2 == aVar14) {
                        return aVar14;
                    }
                    aVar = aVar13;
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a aVar15 = (com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) this.f317092w;
                    yhm.o.b(obj2);
                    aVar = aVar15;
                }
                return yji.l.a1(aVar, (Flow) obj2, null, null, new yl6.b(aVar13, objArr6 == true ? 1 : 0, 21), 3);
            case 10:
                p pVar = (p) this.f317092w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    if (pVar != null) {
                        pfm.a aVarK0 = ((yzh.d) obj3).f318112p.k0(AccountId.Personal.f51414a);
                        this.f317092w = null;
                        this.v = 1;
                        if (nim.a.a(aVarK0, this) == aVar16) {
                            return aVar16;
                        }
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ys.i iVar = (ys.i) this.f317092w;
                Integer num = new Integer(((z0c.d) ((j2) ((z0c.i) obj3).f318210p.f22677a).getValue()).f318203b);
                this.v = 1;
                Object objInvoke = iVar.invoke(num, this);
                return objInvoke == aVar17 ? aVar17 : objInvoke;
            case 12:
                List list = (List) this.f317092w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.f317092w = null;
                    this.v = 1;
                    if (f0.I2((f0) obj3, list, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                rzj.j jVar = (rzj.j) obj3;
                o oVar = (o) this.f317092w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    puk.d dVar2 = oVar.f318637p;
                    this.v = 1;
                    s sVar = (s) dVar2;
                    sVar.getClass();
                    if (jVar instanceof rzj.h) {
                        if (Intrinsics.f(((rzj.h) jVar).f258695a.f105112b, sVar.o.f103875a)) {
                            sVar.H2(sVar.z, new pui.a(6));
                            z = true;
                        }
                    } else if (!(jVar instanceof rzj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = Boolean.valueOf(z);
                    if (obj2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Unit.f186387a;
                }
                mcg.j jVar2 = new mcg.j(oVar, jVar, objArr7 == true ? 1 : 0, 24);
                this.v = 2;
                if (pu7.a.B(oVar.k, "navigate-to-instrument", jVar2, this) == aVar19) {
                    return aVar19;
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o oVar2 = (o) this.f317092w;
                mcg.j jVar3 = new mcg.j(oVar2, (rzj.f) obj3, objArr8 == true ? 1 : 0, 25);
                this.v = 1;
                Object objB4 = pu7.a.B(oVar2.k, "navigate-to-news-article", jVar3, this);
                return objB4 == aVar20 ? aVar20 : objB4;
            case 15:
                ProducerScope producerScope = (ProducerScope) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    long idleTimeoutMillis = ((e1) this.f317092w).getIdleTimeoutMillis();
                    this.v = 1;
                    if (k0.b(idleTimeoutMillis, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                OkHttpChatWsApiV2$WsConnectionLostException okHttpChatWsApiV2$WsConnectionLostException = new OkHttpChatWsApiV2$WsConnectionLostException(0);
                com.bumptech.glide.c.E(producerScope, new r20.e(okHttpChatWsApiV2$WsConnectionLostException));
                producerScope.close(okHttpChatWsApiV2$WsConnectionLostException);
                return Unit.f186387a;
            case 16:
                z24.a aVar22 = (z24.a) this.f317092w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = aVar22.f318957b.getAddonPluginConfig((String) obj3, this);
                    if (obj2 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cp5.c.E((n04.a) obj2, aVar22.f318958c);
            case 17:
                z24.a aVar24 = (z24.a) this.f317092w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar24.f318957b;
                    String str2 = ((h1) obj3).f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService.rejectAddon(str2, this);
                    if (obj2 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return aVar24.f318956a.p((tt3.a) obj2);
            case 18:
                v0 v0Var = (v0) obj3;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                try {
                    if (i105 == 0) {
                        yhm.o.b(obj2);
                        z31.c.Companion.getClass();
                        long j2 = z31.c.b;
                        y65.l lVar2 = new y65.l((z31.c) this.f317092w, v0Var, objArr9 == true ? 1 : 0, 27);
                        this.v = 1;
                        obj2 = h2.c(j2, lVar2, this);
                        if (obj2 == aVar26) {
                            return aVar26;
                        }
                    } else {
                        if (i105 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return (Map) obj2;
                } catch (TimeoutCancellationException unused) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "RevolutDeviceFingerprintProvider", p.a.p("Timeout reached getting ", v0Var.getName(), " data"), null, h0Var);
                    mapG = r0.g();
                    return mapG;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "RevolutDeviceFingerprintProvider", a0.d.s("Ridge ", v0Var.getName(), " data collection failed with ", e2.getClass().getName()), null, h0Var2);
                    mapG = r0.g();
                    return mapG;
                }
            case 19:
                Data data = (Data) this.f317092w;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    z32.h hVar = ((com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) obj3).o;
                    whf.p pVar2 = (whf.p) data.getContent();
                    List list2 = pVar2 != null ? pVar2.f297646a : null;
                    this.f317092w = data;
                    this.v = 1;
                    obj2 = hVar.f319130b.W(list2, this);
                    if (obj2 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new Pair(data, (b6k.e) obj2);
            case 20:
                z34.b bVar = (z34.b) this.f317092w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = bVar.f319159b;
                    String str3 = ((h1) obj3).f137835a;
                    this.v = 1;
                    obj2 = creditPluginsService2.confirmPersonalDetails(str3, this);
                    if (obj2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return bVar.f319158a.p((tt3.a) obj2);
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar30 = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f317092w;
                    r rVar5 = new r(aVar30, (ux4.d) obj3, objArr10 == true ? 1 : 0, 19);
                    this.v = 1;
                    if (aVar30.p2(this, rVar5) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
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
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar2 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f317092w;
                r rVar6 = new r((yof.b) obj3, bVar2, objArr11 == true ? 1 : 0, 20);
                this.v = 1;
                Object objP22 = bVar2.p2(this, rVar6);
                return objP22 == aVar31 ? aVar31 : objP22;
            case 23:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar3 = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f317092w;
                    mcg.j jVar4 = new mcg.j(bVar3, (String) obj3, objArr12 == true ? 1 : 0, 26);
                    this.v = 1;
                    if (bVar3.p2(this, jVar4) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z9j.e eVar2 = (z9j.e) this.f317092w;
                String str4 = (String) obj3;
                r rVar7 = new r(eVar2, str4, objArr13 == true ? 1 : 0, i2);
                this.v = 1;
                Object objB5 = pu7.a.B(eVar2.k, str4, rVar7, this);
                return objB5 == aVar33 ? aVar33 : objB5;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.f317092w;
                    yhm.o.b(obj2);
                    return viewPropertyAnimator;
                }
                yhm.o.b(obj2);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((z9m.k) obj3).a().f22697c.animate();
                viewPropertyAnimatorAnimate.setDuration(250L);
                viewPropertyAnimatorAnimate.setInterpolator(new AccelerateDecelerateInterpolator());
                viewPropertyAnimatorAnimate.translationX(r14.getWidth());
                this.f317092w = viewPropertyAnimatorAnimate;
                this.v = 1;
                eim.c cVar8 = new eim.c(fim.h.b(this));
                viewPropertyAnimatorAnimate.setListener(new z9m.h(viewPropertyAnimatorAnimate, cVar8));
                viewPropertyAnimatorAnimate.start();
                Object objB6 = cVar8.b();
                if (objB6 == aVar34) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                return objB6 == aVar34 ? aVar34 : viewPropertyAnimatorAnimate;
            case 26:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    dam.s sVar2 = ((z9m.k) this.f317092w).f320536a;
                    dam.m mVar2 = dam.m.NATIVE_NAVIGATE_FINISHED;
                    Object objPut = new JSONObject().put("id", ((JSONObject) obj3).getString("id")).put("type", mVar2.f112581a).put("payload", new JSONObject());
                    this.v = 1;
                    if (sVar2.i(mVar2, objPut, this) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.esign.a aVar36 = (com.revolut.feature.credit.application.plugins.impl.ui.esign.a) this.f317092w;
                za4.d dVar3 = new za4.d(aVar36, (ab4.n) obj3, objArr14 == true ? 1 : 0, i3);
                this.v = 1;
                Object objB7 = pu7.a.B(aVar36.k, "sign e-signature", dVar3, this);
                return objB7 == aVar35 ? aVar35 : objB7;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b bVar4 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) this.f317092w;
                r rVar8 = new r(bVar4, (DeliveryCarrier) obj3, objArr15 == true ? 1 : 0, 23);
                this.v = 1;
                Object objB8 = pu7.a.B(bVar4.k, "add_shipment_tracking", rVar8, this);
                return objB8 == aVar37 ? aVar37 : objB8;
            default:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar38 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) this.f317092w;
                vim.d dVar4 = (vim.d) obj3;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    i9g.h hVar2 = aVar38.f93811r;
                    qei.g params = new qei.g(aVar38.o.f93799a, (LocalDate) dVar4.getStart(), (LocalDate) dVar4.b());
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    fag.o oVar3 = hVar2.f159796a;
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jhi.b bVarG = mo3.a.g(new q87.q(nim.a.v(oVar3.f133354c.b(params, loadingStrategy), new i6j.p(i2)), i2), null, null, 3);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i116 != 1) {
                        if (i116 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a.I2(aVar38, dVar4, (qei.e) obj2, this) == aVar39) {
                    return aVar39;
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317093x = obj2;
    }
}
