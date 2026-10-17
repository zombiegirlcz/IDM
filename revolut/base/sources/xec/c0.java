package xec;

import androidx.room.RxRoom;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.add.new_product.impl.repository.AddNewProductTrackingService;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.apm.bills.bpay.impl.data.network.bills.BPayBillService;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import com.revolut.sso.api.models.UserInfoFromApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import mjf.k0;
import nif.m4;
import nif.y0;
import rfm.y;
import tof.va;
import vkm.j2;
import xkf.q1;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f304574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f304575x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304574w = obj2;
        this.f304575x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0((com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f304574w, (AddressFlowContract$OutputData) this.f304575x, continuation, 0);
            case 1:
                return new c0((com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f304574w, (String) this.f304575x, continuation, 1);
            case 2:
                return new c0((xf1.i) this.f304574w, (xf1.f) this.f304575x, continuation, 2);
            case 3:
                c0 c0Var = new c0((usc.a) this.f304575x, continuation, 3);
                c0Var.f304574w = obj2;
                return c0Var;
            case 4:
                return new c0((xg6.j) this.f304574w, (va) this.f304575x, continuation, 4);
            case 5:
                return new c0((xg6.l) this.f304574w, (va) this.f304575x, continuation, 5);
            case 6:
                return new c0((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f304574w, (List) this.f304575x, continuation, 6);
            case 7:
                return new c0((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f304574w, (Watchlist) this.f304575x, continuation, 7);
            case 8:
                return new c0((xh8.b) this.f304574w, (String) this.f304575x, continuation, 8);
            case 9:
                return new c0((com.revolut.retail.feature.esim.impl.ui.screens.help.b) this.f304574w, (String) this.f304575x, continuation, 9);
            case 10:
                return new c0((xi4.a) this.f304574w, (yi4.f) this.f304575x, continuation, 10);
            case 11:
                return new c0((xif.b) this.f304574w, (io3.d) this.f304575x, continuation, 11);
            case 12:
                return new c0((pcd.s) this.f304574w, (xif.b) this.f304575x, continuation, 12);
            case 13:
                c0 c0Var2 = new c0((xif.o) this.f304575x, continuation, 13);
                c0Var2.f304574w = obj2;
                return c0Var2;
            case 14:
                return new c0((xif.o) this.f304574w, (ArrayList) this.f304575x, continuation, 14);
            case 15:
                return new c0((xif.o) this.f304574w, (Set) this.f304575x, continuation, 15);
            case 16:
                return new c0((List) this.f304574w, (xif.s) this.f304575x, continuation, 16);
            case 17:
                return new c0((xij.c) this.f304574w, (String) this.f304575x, continuation, 17);
            case 18:
                return new c0((xjc.g) this.f304574w, (String) this.f304575x, continuation, 18);
            case 19:
                c0 c0Var3 = new c0((xjl.u) this.f304575x, continuation, 19);
                c0Var3.f304574w = obj2;
                return c0Var3;
            case 20:
                return new c0((com.revolut.feature.alipay.impl.ui.qr.scanner.a) this.f304574w, (String) this.f304575x, continuation, 20);
            case 21:
                return new c0((xk7.g) this.f304574w, (File) this.f304575x, continuation, 21);
            case 22:
                return new c0((xka.z) this.f304574w, (String) this.f304575x, continuation, 22);
            case 23:
                c0 c0Var4 = new c0((xka.z) this.f304575x, continuation, 23);
                c0Var4.f304574w = obj2;
                return c0Var4;
            case 24:
                return new c0((q1) this.f304574w, (String) this.f304575x, continuation, 24);
            case 25:
                return new c0((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) this.f304574w, this.f304575x, continuation, 25);
            case 26:
                return new c0((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) this.f304574w, (EsimPhoneNumberPortingDynamicFormRequest) this.f304575x, continuation, 26);
            case 27:
                return new c0((xmc.f0) this.f304574w, (String) this.f304575x, continuation, 27);
            case 28:
                return new c0((xn1.e) this.f304574w, (no1.c) this.f304575x, continuation, 28);
            default:
                c0 c0Var5 = new c0((com.revolut.feature.user_declarations.shared.flows.income.screen.b) this.f304575x, continuation, 29);
                c0Var5.f304574w = obj2;
                return c0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c0) create((wif.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objB;
        Object objI;
        Object objB2;
        Object objA;
        Object objI2;
        Object objQ;
        int i = this.u;
        Priority.STANDARD standard = Priority.STANDARD.f60263b;
        int i2 = 4;
        int i3 = 2;
        ik1.d dVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object obj3 = this.f304575x;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f304574w;
                    b0 b0Var = new b0(bVar, (AddressFlowContract$OutputData) obj3, null);
                    this.v = 1;
                    if (bVar.p2(this, b0Var) == aVar) {
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
                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar2 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f304574w;
                    i0 i0Var = new i0(bVar2, (String) obj3, null);
                    this.v = 1;
                    if (bVar2.p2(this, i0Var) == aVar2) {
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
                xf1.f fVar = (xf1.f) obj3;
                ne0.j jVar = fVar.f304769b;
                xf1.i iVar = (xf1.i) this.f304574w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                try {
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    if (!Intrinsics.f(iVar, jVar.get("RECOMMENDED_PRODUCTS"))) {
                        AddNewProductTrackingService addNewProductTrackingService = fVar.f304768a;
                        this.v = 1;
                        if (addNewProductTrackingService.trackRecommendedProducts(iVar, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                jVar.f("RECOMMENDED_PRODUCTS", iVar);
                return Unit.f186387a;
            case 3:
                FlowCollector flowCollector = (FlowCollector) this.f304574w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = ((on2.b) ((usc.a) obj3).f282889b).a();
                    this.f304574w = flowCollector;
                    this.v = 1;
                    objB = nim.a.b(iVarA, this);
                    if (objB == aVar4) {
                        return aVar4;
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
                    objB = obj2;
                }
                Data dataP = zi0.c.P((kn2.a) objB, false, null, 3);
                this.f304574w = null;
                this.v = 2;
                if (flowCollector.emit(dataP, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.domain.interactors.transactions.a aVar6 = ((xg6.j) this.f304574w).f305584c;
                    this.v = 1;
                    if (((mjf.b0) aVar6).f((va) obj3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.domain.interactors.transactions.a aVar8 = ((xg6.l) this.f304574w).f305590c;
                    this.v = 1;
                    if (((mjf.b0) aVar8).f((va) obj3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar9 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f304574w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    Set set = aVar9.o.f86920a.f86890b;
                    this.v = 1;
                    if (aVar9.f86924p.i((List) obj3, set, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar9.C2(new xgd.n(true));
                return Unit.f186387a;
            case 7:
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
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar12 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f304574w;
                xb4.g gVar = new xb4.g(aVar12, (Watchlist) obj3, objArr == true ? 1 : 0, i3);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar12.k, "watchlistRemoval", gVar, this);
                return objB3 == aVar11 ? aVar11 : objB3;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xh8.b bVar3 = (xh8.b) this.f304574w;
                this.v = 1;
                Object objB4 = u68.b.b(bVar3.f305833b, (String) obj3, null, null, this, 6);
                return objB4 == aVar13 ? aVar13 : objB4;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar15 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.retail.feature.esim.impl.ui.screens.help.b) this.f304574w).f100982q, (String) obj3, aVar15, null, this, 4);
                return objX1 == aVar14 ? aVar14 : objX1;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    xi4.a aVar17 = (xi4.a) this.f304574w;
                    xb4.g gVar2 = new xb4.g(aVar17, (yi4.f) obj3, objArr2 == true ? 1 : 0, i2);
                    this.v = 1;
                    if (aVar17.p2(this, gVar2) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                tif.d dVar2 = ((xif.b) this.f304574w).f306349a;
                io3.d dVar3 = (io3.d) obj3;
                final String pocketId = dVar3.f163145a;
                final long j2 = dVar3.i;
                final tif.q qVar = (tif.q) dVar2;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                rfm.w wVarE = qVar.e.e(standard, new Function0() { // from class: tif.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mif.o oVar = qVar.f271519c;
                        oVar.getClass();
                        String pocketId2 = pocketId;
                        Intrinsics.checkNotNullParameter(pocketId2, "pocketId");
                        rfm.d dVar4 = new rfm.d(new g31.a(oVar, pocketId2, j2, 2), 1);
                        Intrinsics.checkNotNullExpressionValue(dVar4, "defer(...)");
                        mhd.c cVar = new mhd.c(new m98.k(oVar, 26), 6);
                        dfm.c cVar2 = mfm.f.d;
                        y yVar = new y(new y(dVar4, cVar2, cVar, cVar2, mfm.f.f205043c), cVar2, cVar2, cVar2, new mif.m(oVar, 1));
                        Intrinsics.checkNotNullExpressionValue(yVar, "doOnComplete(...)");
                        return yVar;
                    }
                });
                this.v = 1;
                Object objI3 = nim.a.i(wVarE, this);
                return objI3 == aVar18 ? aVar18 : objI3;
            case 12:
                pcd.s sVar = (pcd.s) this.f304574w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    final String pocketId2 = sVar.f234885h.getPocketId();
                    if (pocketId2 == null) {
                        return null;
                    }
                    tif.d dVar4 = ((xif.b) obj3).f306349a;
                    final long j3 = sVar.f234885h.f234861c;
                    final tif.q qVar2 = (tif.q) dVar4;
                    qVar2.getClass();
                    Intrinsics.checkNotNullParameter(pocketId2, "pocketId");
                    rfm.w wVarE2 = qVar2.e.e(standard, new Function0() { // from class: tif.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mif.o oVar = qVar2.f271519c;
                            oVar.getClass();
                            String pocketId22 = pocketId2;
                            Intrinsics.checkNotNullParameter(pocketId22, "pocketId");
                            rfm.d dVar42 = new rfm.d(new g31.a(oVar, pocketId22, j3, 2), 1);
                            Intrinsics.checkNotNullExpressionValue(dVar42, "defer(...)");
                            mhd.c cVar = new mhd.c(new m98.k(oVar, 26), 6);
                            dfm.c cVar2 = mfm.f.d;
                            y yVar = new y(new y(dVar42, cVar2, cVar, cVar2, mfm.f.f205043c), cVar2, cVar2, cVar2, new mif.m(oVar, 1));
                            Intrinsics.checkNotNullExpressionValue(yVar, "doOnComplete(...)");
                            return yVar;
                        }
                    });
                    this.v = 1;
                    objI = nim.a.i(wVarE2, this);
                    if (objI == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI = obj2;
                }
                return (Long) objI;
            case 13:
                xif.o oVar = (xif.o) obj3;
                wif.b bVar4 = (wif.b) this.f304574w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    String str = bVar4.f297890a;
                    mif.j jVar2 = oVar.e;
                    efm.d0 d0VarCreateSingle = RxRoom.createSingle(jVar2.f205804a, true, false, new mif.i(jVar2, str, i5));
                    this.f304574w = null;
                    this.v = 1;
                    objB2 = nim.a.b(d0VarCreateSingle, this);
                    if (objB2 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                List entityList = (List) objB2;
                Intrinsics.h(entityList);
                Intrinsics.checkNotNullParameter(entityList, "entityList");
                return ue0.e.M(rif.a.e(entityList));
            case 14:
                ArrayList arrayList = (ArrayList) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    mjf.q qVar3 = ((xif.o) this.f304574w).f306371g;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((y0) it8.next()).f216073a.k);
                    }
                    Set setI1 = zhm.d0.i1(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        m4 m4Var = ((y0) it9.next()).f216073a.f215803d0;
                        String str2 = m4Var != null ? m4Var.f215941a : null;
                        if (str2 != null) {
                            arrayList3.add(str2);
                        }
                    }
                    Set setI12 = zhm.d0.i1(arrayList3);
                    this.v = 1;
                    if (qVar3.c(setI1, setI12, this) == aVar21) {
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
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    mhf.j jVar3 = (mhf.j) ((xif.o) this.f304574w).f306372h.get();
                    this.v = 1;
                    if (((k0) jVar3).g((Set) obj3, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                List list = (List) this.f304574w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    List list2 = list;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((tof.h) obj4).f272775b == tof.g.INCLUDED) {
                            arrayList4.add(obj4);
                        }
                    }
                    ArrayList included = new ArrayList(zhm.w.t(arrayList4, 10));
                    Iterator it10 = arrayList4.iterator();
                    while (it10.hasNext()) {
                        included.add(d8l.d.I((tof.h) it10.next()));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (((tof.h) obj5).f272775b != tof.g.INCLUDED) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList excluded = new ArrayList(zhm.w.t(arrayList5, 10));
                    Iterator it11 = arrayList5.iterator();
                    while (it11.hasNext()) {
                        excluded.add(d8l.d.I((tof.h) it11.next()));
                    }
                    tif.q qVar4 = (tif.q) ((xif.s) obj3).e;
                    qVar4.getClass();
                    Intrinsics.checkNotNullParameter(excluded, "excluded");
                    Intrinsics.checkNotNullParameter(included, "included");
                    mif.b bVar5 = qVar4.d;
                    bVar5.getClass();
                    Intrinsics.checkNotNullParameter(excluded, "excluded");
                    Intrinsics.checkNotNullParameter(included, "included");
                    pfm.h hVar = new pfm.h(new ly2.d(included, 7, bVar5, excluded), i3);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    this.v = 1;
                    if (nim.a.a(hVar, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xij.c cVar = (xij.c) this.f304574w;
                xb4.g gVar3 = new xb4.g(cVar, (String) obj3, objArr3 == true ? 1 : 0, 5);
                this.v = 1;
                Object objP2 = cVar.p2(this, gVar3);
                return objP2 == aVar24 ? aVar24 : objP2;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xjc.g gVar4 = (xjc.g) this.f304574w;
                xb4.g gVar5 = new xb4.g(gVar4, (String) obj3, objArr4 == true ? 1 : 0, 6);
                this.v = 1;
                Object objP22 = gVar4.p2(this, gVar5);
                return objP22 == aVar25 ? aVar25 : objP22;
            case 19:
                xjl.u uVar = (xjl.u) obj3;
                FlowCollector flowCollector2 = (FlowCollector) this.f304574w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    rqk.m mVar = uVar.d;
                    this.f304574w = flowCollector2;
                    this.v = 1;
                    objA = mVar.a(false, this);
                    if (objA == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i107 != 1) {
                        if (i107 != 2 && i107 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                String str3 = ((UserInfoFromApp) objA).f105997b;
                if (str3 == null) {
                    Data data = new Data(null, new IllegalStateException("registered identity id cannot be null"), false, 5, null);
                    this.f304574w = null;
                    this.v = 2;
                    if (flowCollector2.emit(data, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    vkm.d dVarB = uVar.f.b(new RegisteredIdentityId(str3), w4l.i.f294643c);
                    this.f304574w = null;
                    this.v = 3;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar26) {
                        return aVar26;
                    }
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.alipay.impl.ui.qr.scanner.a aVar27 = (com.revolut.feature.alipay.impl.ui.qr.scanner.a) this.f304574w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                try {
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e4) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var2);
                }
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    String str4 = (String) obj3;
                    k18.c cVar2 = aVar27.o;
                    this.v = 1;
                    objI2 = cVar2.I(str4, this);
                    if (objI2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i108 != 1) {
                        if (i108 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                dVar = (ik1.d) objI2;
                ik1.b bVar6 = ik1.b.f161868a;
                if (dVar == null) {
                    dVar = bVar6;
                }
                if (dVar instanceof ik1.a) {
                    aVar27.C2(new xk1.e(((ik1.a) dVar).f161867a));
                } else if (dVar instanceof ik1.c) {
                    this.v = 2;
                    if (com.revolut.feature.alipay.impl.ui.qr.scanner.a.I2(aVar27, (ik1.c) dVar, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (!dVar.equals(bVar6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar27.J2();
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    xk7.g gVar6 = (xk7.g) this.f304574w;
                    f9i.c cVar3 = new f9i.c(new f9i.d((File) obj3));
                    this.v = 1;
                    if (gVar6.G1(cVar3, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xka.z zVar = (xka.z) this.f304574w;
                xka.w wVar = new xka.w(zVar, (String) obj3, objArr5 == true ? 1 : 0, i5);
                this.v = 1;
                Object objB5 = pu7.a.B(zVar.k, "HANDLE_ACTION_TASK_NAME", wVar, this);
                return objB5 == aVar30 ? aVar30 : objB5;
            case 23:
                xka.z zVar2 = (xka.z) obj3;
                Data data2 = (Data) this.f304574w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    zVar2.H2(zVar2.f306659w, new x16.h(data2, 29));
                    if (data2.getContent() != null) {
                        kka.a aVar32 = zVar2.f306654p;
                        ProductArticleParams productArticleParams = zVar2.o.f81288a;
                        this.f304574w = null;
                        this.v = 1;
                        kka.h hVar2 = (kka.h) aVar32;
                        hVar2.getClass();
                        Object objA2 = hVar2.f184564b.a(kka.h.b(productArticleParams), this);
                        if (objA2 != aVar31) {
                            objA2 = Unit.f186387a;
                        }
                        if (objA2 == aVar31) {
                            return aVar31;
                        }
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q1 q1Var = (q1) this.f304574w;
                xb4.g gVar7 = new xb4.g(q1Var, (String) obj3, objArr6 == true ? 1 : 0, 8);
                this.v = 1;
                Object objY2 = q1Var.Y2(this, gVar7);
                return objY2 == aVar33 ? aVar33 : objY2;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar7 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) this.f304574w;
                xkj.q qVar5 = new xkj.q(bVar7, obj3, null);
                this.v = 1;
                Object objP23 = bVar7.p2(this, qVar5);
                return objP23 == aVar34 ? aVar34 : objP23;
            case 26:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b bVar8 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) this.f304574w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    vkj.l lVar = new vkj.l(bVar8, i2);
                    bVar8.f101281r.getClass();
                    nii.c0 c0VarA = skj.a.a();
                    xkj.r rVar = new xkj.r(bVar8, (EsimPhoneNumberPortingDynamicFormRequest) obj3, objArr7 == true ? 1 : 0, i5);
                    this.v = 1;
                    objQ = n14.k.Q(bVar8, c0VarA, null, lVar, rVar, this, 2);
                    if (objQ == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objQ = obj2;
                }
                nii.e eVar = (nii.e) objQ;
                if (eVar instanceof nii.d) {
                    pfj.b bVar9 = (pfj.b) ((nii.d) eVar).f216133a;
                    bVar8.C2(new xkj.i(bVar9.f235603c, bVar9.f235601a.f100488a));
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xmc.f0 f0Var = (xmc.f0) this.f304574w;
                xmc.e0 e0Var = new xmc.e0(f0Var, (String) obj3, objArr8 == true ? 1 : 0, i5);
                this.v = 1;
                Object objB6 = pu7.a.B(f0Var.k, "openPdf", e0Var, this);
                return objB6 == aVar36 ? aVar36 : objB6;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                BPayBillService bPayBillService = ((xn1.e) this.f304574w).f307305a;
                no1.c cVar4 = (no1.c) obj3;
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                List<no1.b> list3 = cVar4.f217899a;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                for (no1.b bVar10 : list3) {
                    Intrinsics.checkNotNullParameter(bVar10, "<this>");
                    arrayList6.add(new sn1.a(bVar10.f217897a.name(), bVar10.f217898b));
                }
                un1.a aVar38 = new un1.a(arrayList6);
                this.v = 1;
                Object objSearchBill = bPayBillService.searchBill(aVar38, this);
                return objSearchBill == aVar37 ? aVar37 : objSearchBill;
            default:
                FlowCollector flowCollector3 = (FlowCollector) this.f304574w;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    Data dataCopy$default = Data.copy$default(((xng.h) ((j2) ((com.revolut.feature.user_declarations.shared.flows.income.screen.b) obj3).f94636t.f22677a).getValue()).f, null, null, true, 3, null);
                    this.f304574w = null;
                    this.v = 1;
                    if (flowCollector3.emit(dataCopy$default, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f304575x = obj2;
    }
}
