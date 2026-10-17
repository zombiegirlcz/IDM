package lo;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.memory.MemoryConsumptionMonitoringException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.postal_check.impl.articles.PostalCheckArticles;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.topup_screen.api.model.CheckoutCustomAmountLimit;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinitions;
import com.revolut.retail.feature.payments.payment_links.api.model.TransferLinkLimits;
import com.revolut.retail.feature.payments.payment_links.impl.data.TransferLinkService;
import e24.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ks0.n;
import lhk.a0;
import lo1.p;
import lt7.m;
import m1i.d1;
import m1i.i1;
import m44.t;
import m44.u;
import m8c.q;
import ma9.k;
import my8.s;
import nii.c0;
import nii.y0;
import o55.r;
import p35.p0;
import skm.e0;
import skm.k0;
import vkm.z1;
import yhm.o;
import yji.l;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f197311w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f197311w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((d) this.f197311w, continuation, 0);
            case 1:
                return new c((p) this.f197311w, continuation, 1);
            case 2:
                return new c((lr.a) this.f197311w, continuation, 2);
            case 3:
                return new c((com.revolut.feature.apm.bills.postal_check.impl.ui.b) this.f197311w, continuation, 3);
            case 4:
                return new c((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) this.f197311w, continuation, 4);
            case 5:
                return new c((com.revolut.feature.payments.groups.impl.ui_chat.flow.b) this.f197311w, continuation, 5);
            case 6:
                return new c((lsl.f) this.f197311w, continuation, 6);
            case 7:
                return new c((m) this.f197311w, continuation, 7);
            case 8:
                return new c((lw6.e) this.f197311w, continuation, 8);
            case 9:
                return new c((lw8.h) this.f197311w, continuation, 9);
            case 10:
                return new c((com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b) this.f197311w, continuation, 10);
            case 11:
                return new c((com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) this.f197311w, continuation, 11);
            case 12:
                return new c((lxl.f) this.f197311w, this.v, continuation);
            case 13:
                return new c((ly5.j) this.f197311w, continuation, 13);
            case 14:
                return new c((com.revolut.crypto.challenge.impl.ui.screen.progress.a) this.f197311w, continuation, 14);
            case 15:
                return new c((i1) this.f197311w, continuation, 15);
            case 16:
                return new c((m24.a) this.f197311w, continuation, 16);
            case 17:
                return new c((m28.f) this.f197311w, continuation, 17);
            case 18:
                return new c((u) this.f197311w, continuation, 18);
            case 19:
                return new c((com.revolut.feature.joint.impl.ui.withdraw.b) this.f197311w, continuation, 19);
            case 20:
                return new c((com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a) this.f197311w, continuation, 20);
            case 21:
                return new c((m73.e) this.f197311w, continuation, 21);
            case 22:
                return new c((m75.j) this.f197311w, continuation, 22);
            case 23:
                return new c((n) this.f197311w, continuation, 23);
            case 24:
                return new c((q) this.f197311w, continuation, 24);
            case 25:
                return new c((m8e.m) this.f197311w, continuation, 25);
            case 26:
                return new c((m98.p) this.f197311w, continuation, 26);
            case 27:
                return new c((ma4.b) this.f197311w, continuation, 27);
            case 28:
                return new c((k) this.f197311w, continuation, 28);
            default:
                return new c((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.f197311w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objE;
        Object objX;
        Object next;
        Object objA;
        Object objI2;
        Object recommendedValuators;
        Object limits;
        int i = this.u;
        int i2 = 5;
        int i3 = 13;
        int i5 = 14;
        int i6 = 23;
        CustomAssetCategoryDefinition customAssetCategoryDefinition = null;
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
        Object obj3 = this.f197311w;
        int i21 = 1;
        switch (i) {
            case 0:
                d dVar = (d) obj3;
                AtomicInteger atomicInteger = dVar.f197317l;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0 && i22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                while (e0.x(getContext()) && atomicInteger.get() < 10) {
                    try {
                        g gVarA = dVar.f197313c.a();
                        dVar.d.getClass();
                        String strA = j.a(gVarA);
                        dVar.e.b("memory_status", strA);
                        dVar.j3(gVarA, strA);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable cause) {
                        atomicInteger.incrementAndGet();
                        Intrinsics.checkNotNullParameter(cause, "cause");
                        MemoryConsumptionMonitoringException memoryConsumptionMonitoringException = new MemoryConsumptionMonitoringException("Failed to monitor memory consumption", cause);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "MemoryConsumptionTracker", null, memoryConsumptionMonitoringException, h0Var);
                    }
                    this.v = 1;
                    if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar) {
                        return aVar;
                    }
                    break;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    p pVar = (p) obj3;
                    l40.j jVar = new l40.j(pVar, objArr == true ? 1 : 0, 11);
                    this.v = 1;
                    if (u0.c0(pVar, "GOTO_BUTTON_TAG", jVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    zq.c cVarH = ((lr.a) obj3).f199335a.h();
                    this.v = 1;
                    objB = cVarH.b(this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                ar.b bVar = (ar.b) d0.d0((List) objB);
                if (bVar != null) {
                    return bVar.f8476a;
                }
                return null;
            case 3:
                com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar2 = (com.revolut.feature.apm.bills.postal_check.impl.ui.b) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    objE = ((kka.h) bVar2.f61523p).e(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PostalCheckArticles.ONBOARDING)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, this);
                    if (objE == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objE = obj2;
                }
                if (((Boolean) objE).booleanValue()) {
                    oki.h.t2(bVar2, bVar2.u, PostalCheckFlowContract$Step.ProductArticle.f61518a, false, null, false, 12);
                } else {
                    bVar2.M2();
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.a) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                try {
                    if (i59 == 0) {
                        o.b(obj2);
                        jhi.b bVarG = mo3.a.g(aVar5.f87936p.g(w4l.h.f294642c), null, new lnk.o(i2), 1);
                        this.v = 1;
                        objX = vkm.q.x(bVarG, this);
                        if (objX == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i59 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        objX = obj2;
                    }
                    Iterator it8 = ((CustomAssetFieldDefinitions) objX).f99230a.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (((CustomAssetCategoryDefinition) next).f99224a == vzi.b.PROPERTY) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    customAssetCategoryDefinition = (CustomAssetCategoryDefinition) next;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e4) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var2);
                }
                aVar5.H2(aVar5.f87937q, new lk4.g(customAssetCategoryDefinition, i6));
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.flow.b bVar3 = (com.revolut.feature.payments.groups.impl.ui_chat.flow.b) obj3;
                    com.revolut.feature.payments.groups.impl.ui_chat.flow.a aVar8 = new com.revolut.feature.payments.groups.impl.ui_chat.flow.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar8) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                lsl.f fVar = (lsl.f) obj3;
                l40.j jVar2 = new l40.j(fVar, objArr2 == true ? 1 : 0, i3);
                this.v = 1;
                Object objB2 = pu7.a.B(fVar.e, "on_show_commodity_details_screen", jVar2, this);
                return objB2 == aVar9 ? aVar9 : objB2;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    m mVar = (m) obj3;
                    ys7.h hVar = mVar.f199835p;
                    String str = mVar.o.f75821a;
                    this.v = 1;
                    if (hVar.b(str, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    z1 z1Var = ((lw6.e) obj3).f200415p;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                lw8.h hVar2 = (lw8.h) obj3;
                IncodeScreenContract$InputData incodeScreenContract$InputData = hVar2.o;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    lw8.e eVar = hVar2.f200434p;
                    ly8.c cVar = new ly8.c(incodeScreenContract$InputData.f77815a, d0.i1(incodeScreenContract$InputData.f77817c), incodeScreenContract$InputData.f77816b, incodeScreenContract$InputData.d, incodeScreenContract$InputData.e, incodeScreenContract$InputData.f);
                    this.v = 1;
                    objA = eVar.a(cVar, this);
                    if (objA == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                hVar2.C2(new ly8.b((s) objA));
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b bVar4 = (com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b) obj3;
                    com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.a aVar14 = new com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.a(bVar4, null);
                    this.v = 1;
                    if (bVar4.p2(this, aVar14) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a aVar15 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.a) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    CheckoutCustomAmountLimit checkoutCustomAmountLimit = aVar15.f90771q.f90764b;
                    if (checkoutCustomAmountLimit instanceof CheckoutCustomAmountLimit.Custom) {
                        objI2 = ((CheckoutCustomAmountLimit.Custom) checkoutCustomAmountLimit).f90526a;
                    } else {
                        if (!(checkoutCustomAmountLimit instanceof CheckoutCustomAmountLimit.Wallet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CheckoutCustomAmountLimit.Wallet wallet = (CheckoutCustomAmountLimit.Wallet) checkoutCustomAmountLimit;
                        objI2 = aVar15.I2(wallet.f90527a, wallet.f90528b, this);
                    }
                    if (objI2 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objI2 = obj2;
                }
                l.a1(aVar15, vkm.q.q(aVar15.f90772r.B(new lv9.c(17))), null, null, new a0(aVar15, (dj0.d) objI2, objArr3 == true ? 1 : 0, 8), 3);
                return Unit.f186387a;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                InputStream inputStreamOpenRawResource = ((lxl.f) obj3).f200600a.getResources().openRawResource(this.v);
                try {
                    Intrinsics.h(inputStreamOpenRawResource);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(zi0.c.H(inputStreamOpenRawResource));
                    byteBufferWrap.rewind();
                    com.bumptech.glide.d.e(inputStreamOpenRawResource, null);
                    return byteBufferWrap;
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        com.bumptech.glide.d.e(inputStreamOpenRawResource, th10);
                        throw th11;
                    }
                }
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ly5.j jVar3 = (ly5.j) obj3;
                l40.j jVar4 = new l40.j(jVar3, objArr4 == true ? 1 : 0, 16);
                this.v = 1;
                Object objB3 = pu7.a.B(jVar3.k, "reload", jVar4, this);
                return objB3 == aVar18 ? aVar18 : objB3;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    com.revolut.crypto.challenge.impl.ui.screen.progress.a aVar20 = (com.revolut.crypto.challenge.impl.ui.screen.progress.a) obj3;
                    l40.j jVar5 = new l40.j(aVar20, objArr5 == true ? 1 : 0, 18);
                    this.v = 1;
                    if (aVar20.p2(this, jVar5) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    i1 i1Var = (i1) obj3;
                    d1 d1Var = new d1(i1Var, objArr6 == true ? 1 : 0, i21);
                    this.v = 1;
                    if (i1.Q(i1Var, d1Var, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = ((m24.a) obj3).f201696a;
                    this.v = 1;
                    recommendedValuators = creditPluginsService.getRecommendedValuators(this);
                    if (recommendedValuators != arrayList) {
                    }
                    return arrayList;
                }
                if (i105 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                recommendedValuators = obj2;
                Iterable<e24.a> iterable = (Iterable) recommendedValuators;
                arrayList = new ArrayList(w.t(iterable, 10));
                for (e24.a aVar22 : iterable) {
                    Intrinsics.checkNotNullParameter(aVar22, "<this>");
                    String strE = aVar22.getName();
                    String strA2 = aVar22.getAddress();
                    String strF = aVar22.getPhoneNumber();
                    a.b bVarG2 = aVar22.getWebsite();
                    iy3.a aVar23 = new iy3.a(bVarG2.getName(), bVarG2.getLink());
                    String strC = aVar22.getEmail();
                    String strB = aVar22.getCity();
                    a.C0717a c0717aD = aVar22.getLocation();
                    arrayList.add(new iy3.b(strE, strA2, strF, aVar23, strC, strB, new co3.a(c0717aD.getLatitude(), c0717aD.getLongitude())));
                }
                return arrayList;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                sih.b bVar5 = sih.b.COMMODITIES;
                this.v = 1;
                WealthTradeRedesignDestination wealthTradeRedesignDestinationA = nlh.b.a(bVar5);
                return wealthTradeRedesignDestinationA == aVar24 ? aVar24 : wealthTradeRedesignDestinationA;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                u uVar = (u) obj3;
                t tVar = new t(uVar, objArr7 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB4 = pu7.a.B(uVar.k, "CONFIRM_ADDRESS_SINGLE_TASK_ID", tVar, this);
                return objB4 == aVar25 ? aVar25 : objB4;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.joint.impl.ui.withdraw.b bVar6 = (com.revolut.feature.joint.impl.ui.withdraw.b) obj3;
                l40.j jVar6 = new l40.j(bVar6, objArr8 == true ? 1 : 0, 19);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar6.k, "Transfer task", jVar6, this);
                return objB5 == aVar26 ? aVar26 : objB5;
            case 20:
                com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a aVar27 = (com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    l.a1(aVar27, aVar27.X1(new y0(null, new c0(new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_status_progress_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_sepa_direct_debit_external_account_status_progress_description, null, null, 14), null, false, null, false, false, null, 2044), false, 5)), null, null, null, 7);
                    pfm.a aVarQ = ((y45.f) aVar27.f70385p).q(aVar27.o.f70381a.f70144a.f70108a, p35.u0.WALLET, p0.ACTIVE, null);
                    this.v = 1;
                    if (nim.a.a(aVarQ, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar27.C2(m65.c.f203012a);
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    m73.e eVar2 = (m73.e) obj3;
                    l40.j jVar7 = new l40.j(eVar2, objArr9 == true ? 1 : 0, 21);
                    this.v = 1;
                    if (eVar2.p2(this, jVar7) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    m75.j jVar8 = (m75.j) obj3;
                    y45.i iVar = jVar8.o;
                    String loanId = jVar8.f203329s;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    o55.q qVar = (o55.q) iVar.f310803a;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    w4l.j loadingStrategy = w4l.j.f294644c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    efm.d0 d0VarFirstOrError = m70.a.g(qVar.i.e(new r(loanId), loadingStrategy), null, new y13.a(i5), 1).firstOrError();
                    y25.c cVar2 = new y25.c(new y1.a(iVar, i3), 9);
                    d0VarFirstOrError.getClass();
                    pfm.a aVar31 = new pfm.a(d0VarFirstOrError, cVar2, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar31, "flatMapCompletable(...)");
                    pfm.a aVarV = ue0.e.v(aVar31);
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    TransferLinkService transferLinkService = (TransferLinkService) ((n) obj3).f189085b;
                    this.v = 1;
                    limits = transferLinkService.getLimits(this);
                    if (limits == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    limits = obj2;
                }
                n7k.c cVar3 = (n7k.c) limits;
                return new TransferLinkLimits(mo3.a.o(cVar3.f213172a), mo3.a.o(cVar3.f213173b), cVar3.f213174c);
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                q qVar2 = (q) obj3;
                l40.j jVar9 = new l40.j(qVar2, objArr10 == true ? 1 : 0, 22);
                this.v = 1;
                Object objB6 = pu7.a.B(qVar2.k, "topUp", jVar9, this);
                return objB6 == aVar33 ? aVar33 : objB6;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m8e.m mVar2 = (m8e.m) obj3;
                m8e.l lVar = new m8e.l(mVar2, objArr11 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB7 = pu7.a.B(mVar2.k, "TOGGLE_JOINT_DATA_SHARING", lVar, this);
                return objB7 == aVar34 ? aVar34 : objB7;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m98.p pVar2 = (m98.p) obj3;
                m98.o oVar = new m98.o(pVar2, objArr12 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB0 = u0.b0(pVar2.X(), "REJECT_BUTTON_TAG", oVar, this);
                return objB0 == aVar35 ? aVar35 : objB0;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    ma4.b bVar7 = (ma4.b) obj3;
                    ow3.e eVar3 = bVar7.f203941m;
                    String str2 = ((CreditApplicationPluginFlowContract$Configuration) bVar7.o.n0().get()).f66892b;
                    this.v = 1;
                    if (eVar3.d(str2, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    k kVar = (k) obj3;
                    l40.j jVar10 = new l40.j(kVar, objArr13 == true ? 1 : 0, i6);
                    this.v = 1;
                    if (kVar.p2(this, jVar10) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b.J2((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) obj3, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lxl.f fVar, int i, Continuation continuation) {
        super(2, continuation);
        this.u = 12;
        this.f197311w = fVar;
        this.v = i;
    }
}
