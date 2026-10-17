package klf;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreenContract$InputData;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$FilterQuery;
import com.revolut.feature.rev_points.models.EarnOptionsBottomSheetParams;
import com.revolut.feature.rev_points.models.TermsInfo;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.fc;
import tof.i7;
import tof.q4;
import tof.t3;

/* JADX INFO: loaded from: classes8.dex */
public final class a3 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f185441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f185443y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.revolut.core.backend_flow.impl.ui.form_screen.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = 25;
        this.f185443y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a3 a3Var = new a3((Continuation) obj4, (b3) this.f185443y, 0);
                a3Var.f185441w = (FlowCollector) obj2;
                a3Var.f185442x = obj3;
                return a3Var.invokeSuspend(Unit.f186387a);
            case 1:
                a3 a3Var2 = new a3((Continuation) obj4, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f185443y, 1);
                a3Var2.f185441w = (FlowCollector) obj2;
                a3Var2.f185442x = obj3;
                return a3Var2.invokeSuspend(Unit.f186387a);
            case 2:
                a3 a3Var3 = new a3((Continuation) obj4, (kpb.l) this.f185443y, 2);
                a3Var3.f185441w = (FlowCollector) obj2;
                a3Var3.f185442x = obj3;
                return a3Var3.invokeSuspend(Unit.f186387a);
            case 3:
                a3 a3Var4 = new a3((Continuation) obj4, (kqd.e) this.f185443y, 3);
                a3Var4.f185441w = (FlowCollector) obj2;
                a3Var4.f185442x = obj3;
                return a3Var4.invokeSuspend(Unit.f186387a);
            case 4:
                a3 a3Var5 = new a3((Continuation) obj4, (kqh.u) this.f185443y, 4);
                a3Var5.f185441w = (FlowCollector) obj2;
                a3Var5.f185442x = obj3;
                return a3Var5.invokeSuspend(Unit.f186387a);
            case 5:
                a3 a3Var6 = new a3((Continuation) obj4, (ku2.h) this.f185443y, 5);
                a3Var6.f185441w = (FlowCollector) obj2;
                a3Var6.f185442x = obj3;
                return a3Var6.invokeSuspend(Unit.f186387a);
            case 6:
                a3 a3Var7 = new a3((Continuation) obj4, (ku8.h) this.f185443y, 6);
                a3Var7.f185441w = (FlowCollector) obj2;
                a3Var7.f185442x = obj3;
                return a3Var7.invokeSuspend(Unit.f186387a);
            case 7:
                a3 a3Var8 = new a3((Continuation) obj4, (kui.h) this.f185443y, 7);
                a3Var8.f185441w = (FlowCollector) obj2;
                a3Var8.f185442x = obj3;
                return a3Var8.invokeSuspend(Unit.f186387a);
            case 8:
                a3 a3Var9 = new a3((Continuation) obj4, (jul.o) this.f185443y, 8);
                a3Var9.f185441w = (FlowCollector) obj2;
                a3Var9.f185442x = obj3;
                return a3Var9.invokeSuspend(Unit.f186387a);
            case 9:
                a3 a3Var10 = new a3((Continuation) obj4, (h30.q) this.f185443y, 9);
                a3Var10.f185441w = (FlowCollector) obj2;
                a3Var10.f185442x = obj3;
                return a3Var10.invokeSuspend(Unit.f186387a);
            case 10:
                a3 a3Var11 = new a3((Continuation) obj4, (kv5.k) this.f185443y, 10);
                a3Var11.f185441w = (FlowCollector) obj2;
                a3Var11.f185442x = obj3;
                return a3Var11.invokeSuspend(Unit.f186387a);
            case 11:
                a3 a3Var12 = new a3((Continuation) obj4, (kvl.a0) this.f185443y, 11);
                a3Var12.f185441w = (FlowCollector) obj2;
                a3Var12.f185442x = obj3;
                return a3Var12.invokeSuspend(Unit.f186387a);
            case 12:
                a3 a3Var13 = new a3((Continuation) obj4, (kw4.z) this.f185443y, 12);
                a3Var13.f185441w = (FlowCollector) obj2;
                a3Var13.f185442x = obj3;
                return a3Var13.invokeSuspend(Unit.f186387a);
            case 13:
                a3 a3Var14 = new a3((Continuation) obj4, (kx2.a) this.f185443y, 13);
                a3Var14.f185441w = (FlowCollector) obj2;
                a3Var14.f185442x = obj3;
                return a3Var14.invokeSuspend(Unit.f186387a);
            case 14:
                a3 a3Var15 = new a3((Continuation) obj4, (kzb.h) this.f185443y, 14);
                a3Var15.f185441w = (FlowCollector) obj2;
                a3Var15.f185442x = obj3;
                return a3Var15.invokeSuspend(Unit.f186387a);
            case 15:
                a3 a3Var16 = new a3((Continuation) obj4, (l0c.u) this.f185443y, 15);
                a3Var16.f185441w = (FlowCollector) obj2;
                a3Var16.f185442x = obj3;
                return a3Var16.invokeSuspend(Unit.f186387a);
            case 16:
                a3 a3Var17 = new a3((Continuation) obj4, (l26.f) this.f185443y, 16);
                a3Var17.f185441w = (FlowCollector) obj2;
                a3Var17.f185442x = obj3;
                return a3Var17.invokeSuspend(Unit.f186387a);
            case 17:
                a3 a3Var18 = new a3((Continuation) obj4, (l2d.n) this.f185443y, 17);
                a3Var18.f185441w = (FlowCollector) obj2;
                a3Var18.f185442x = obj3;
                return a3Var18.invokeSuspend(Unit.f186387a);
            case 18:
                a3 a3Var19 = new a3((Continuation) obj4, (l43.m) this.f185443y, 18);
                a3Var19.f185441w = (FlowCollector) obj2;
                a3Var19.f185442x = obj3;
                return a3Var19.invokeSuspend(Unit.f186387a);
            case 19:
                a3 a3Var20 = new a3((Continuation) obj4, (com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) this.f185443y, 19);
                a3Var20.f185441w = (FlowCollector) obj2;
                a3Var20.f185442x = obj3;
                return a3Var20.invokeSuspend(Unit.f186387a);
            case 20:
                a3 a3Var21 = new a3((Continuation) obj4, (l72.d) this.f185443y, 20);
                a3Var21.f185441w = (FlowCollector) obj2;
                a3Var21.f185442x = obj3;
                return a3Var21.invokeSuspend(Unit.f186387a);
            case 21:
                a3 a3Var22 = new a3((Continuation) obj4, (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b) this.f185443y, 21);
                a3Var22.f185441w = (FlowCollector) obj2;
                a3Var22.f185442x = obj3;
                return a3Var22.invokeSuspend(Unit.f186387a);
            case 22:
                a3 a3Var23 = new a3((Continuation) obj4, (l7j.z) this.f185443y, 22);
                a3Var23.f185441w = (FlowCollector) obj2;
                a3Var23.f185442x = obj3;
                return a3Var23.invokeSuspend(Unit.f186387a);
            case 23:
                a3 a3Var24 = new a3((Continuation) obj4, (com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.c) this.f185443y, 23);
                a3Var24.f185441w = (FlowCollector) obj2;
                a3Var24.f185442x = obj3;
                return a3Var24.invokeSuspend(Unit.f186387a);
            case 24:
                a3 a3Var25 = new a3((Continuation) obj4, (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) this.f185443y, 24);
                a3Var25.f185441w = (FlowCollector) obj2;
                a3Var25.f185442x = obj3;
                return a3Var25.invokeSuspend(Unit.f186387a);
            case 25:
                a3 a3Var26 = new a3((com.revolut.core.backend_flow.impl.ui.form_screen.a) this.f185443y, (Continuation) obj4);
                a3Var26.f185441w = (String) obj2;
                a3Var26.f185442x = (xl2.h0) obj3;
                return a3Var26.invokeSuspend(Unit.f186387a);
            case 26:
                a3 a3Var27 = new a3((Continuation) obj4, (lde.f) this.f185443y, 26);
                a3Var27.f185441w = (FlowCollector) obj2;
                a3Var27.f185442x = obj3;
                return a3Var27.invokeSuspend(Unit.f186387a);
            case 27:
                a3 a3Var28 = new a3((Continuation) obj4, (lde.m) this.f185443y, 27);
                a3Var28.f185441w = (FlowCollector) obj2;
                a3Var28.f185442x = obj3;
                return a3Var28.invokeSuspend(Unit.f186387a);
            case 28:
                a3 a3Var29 = new a3((Continuation) obj4, (ldg.f) this.f185443y, 28);
                a3Var29.f185441w = (FlowCollector) obj2;
                a3Var29.f185442x = obj3;
                return a3Var29.invokeSuspend(Unit.f186387a);
            default:
                a3 a3Var30 = new a3((Continuation) obj4, (ldk.y) this.f185443y, 29);
                a3Var30.f185441w = (FlowCollector) obj2;
                a3Var30.f185442x = obj3;
                return a3Var30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        q4 q4Var;
        efm.r rVarJust;
        Flow flowE;
        efm.d0 d0VarM;
        Flow gVar2;
        Flow gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f185441w;
                    t3 t3Var = (t3) this.f185442x;
                    b3 b3Var = (b3) this.f185443y;
                    if (t3Var == null || (q4Var = t3Var.f273081w) == null) {
                        gVar = new go.g(new Data(null, null, false, 7, null), 2);
                    } else {
                        mjf.l0 l0Var = b3Var.f185452c;
                        String warrantId = q4Var.f273008a;
                        String subjectId = q4Var.f273009b;
                        String confiscationId = q4Var.f273010c;
                        String transactionId = t3Var.f273057b;
                        xif.z zVar = l0Var.f206019a;
                        Intrinsics.checkNotNullParameter(warrantId, "id");
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        if (subjectId != null) {
                            zVar.getClass();
                            Intrinsics.checkNotNullParameter(warrantId, "warrantId");
                            Intrinsics.checkNotNullParameter(subjectId, "subjectId");
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            rVarJust = zVar.d.f(new xif.x(transactionId, warrantId, subjectId), false);
                        } else if (confiscationId != null) {
                            zVar.getClass();
                            Intrinsics.checkNotNullParameter(warrantId, "warrantId");
                            Intrinsics.checkNotNullParameter(confiscationId, "confiscationId");
                            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                            rVarJust = zVar.e.f(new xif.w(transactionId, warrantId, confiscationId), false);
                        } else {
                            rVarJust = efm.r.just(new Data(null, new IllegalArgumentException("either subjectId or confiscationId should be not null"), false, 5, null));
                            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                        }
                        gVar = rd0.e.b(rVarJust);
                    }
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f185441w;
                    w4l.k loadingStrategy = (w4l.k) this.f185442x;
                    wik.m mVar = ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f185443y).o;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    kjk.o oVar = (kjk.o) mVar.f297924b;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = ((x4l.c) oVar.e.getValue()).b(Unit.f186387a, loadingStrategy);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f185441w;
                    kpb.l lVar = (kpb.l) this.f185443y;
                    vkm.d dVarB2 = ijb.a.b(lVar.f188221p, lVar.o.f83380a);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f185441w;
                    vkm.y yVarD = rd0.e.d(mo3.a.g(nim.a.v(((s6e.z) ((kqd.e) this.f185443y).f188373a).u((String) this.f185442x), kqd.b.f188370a), null, kqd.c.f188371a, 1), zhm.h0.f322473a);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector4);
                    Object objCollect = yVarD.collect(new klj.e(flowCollector4, 8), this);
                    if (objCollect != aVar4) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar4) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f185441w;
                    kl.t1 t1Var = ((kqh.u) this.f185443y).f188424p;
                    akg.n nVarV = nim.a.v(((aoh.a) t1Var.f185240b).a(), new ml3.y(t1Var, 29));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, nVarV, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                ku2.h hVar = (ku2.h) this.f185443y;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f185441w;
                    vkm.v1 v1Var = ((Boolean) this.f185442x).booleanValue() ? new vkm.v1(new ku2.g(hVar, null)) : new vkm.v1(new knd.h0(hVar, (Continuation) null, 13));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, v1Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                ku8.h hVar2 = (ku8.h) this.f185443y;
                ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = hVar2.o;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f185441w;
                    w4l.k kVar = (w4l.k) this.f185442x;
                    ot8.a aVar8 = hVar2.f189735p;
                    my8.r rVar = chooseDocumentScreenContract$InputData.f77592b;
                    vkm.d dVarA = aVar8.a(rVar, zi0.c.B(rVar) ? chooseDocumentScreenContract$InputData.d : null, chooseDocumentScreenContract$InputData.e, chooseDocumentScreenContract$InputData.f, Intrinsics.f(kVar, w4l.i.f294643c));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, dVarA, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                kui.h hVar3 = (kui.h) this.f185443y;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f185441w;
                    j23.b bVarD = yh5.b.d(((mti.g) hVar3.f189825p).b(hVar3.o.f98847a, (w4l.k) this.f185442x), ((mti.p) hVar3.f189826q).a());
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, bVarD, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f185441w;
                    vkm.d dVarB3 = rd0.e.b(gt5.a.a((mu5.f) ((jul.o) this.f185443y).f178695b, (xi0.b) this.f185442x, false, 6));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, dVarB3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                h30.q qVar = (h30.q) this.f185443y;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f185441w;
                    Flow flowE2 = boh.f.e(rd0.e.b(gt5.a.a((mu5.f) qVar.f148941b, null, false, 7)), new kv5.e(qVar, (xi0.b) this.f185442x, 1));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, flowE2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f185441w;
                    Data data = (Data) this.f185442x;
                    kv5.k kVar2 = (kv5.k) this.f185443y;
                    DerivativesBalance derivativesBalance = (DerivativesBalance) data.getContent();
                    Flow gVar4 = derivativesBalance == null ? new go.g(new Data(null, null, false, 7, null), 2) : vkm.q.Q(kVar2.f, new k25.o(null, kVar2, derivativesBalance, 9));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, gVar4, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f185441w;
                    Optional optional = (Optional) this.f185442x;
                    Flow flowE3 = optional == null ? rd0.e.e(nim.a.A(nim.a.v(rd0.e.b(((kvl.a0) this.f185443y).f190157n.K(AccountId.Personal.f51414a)), new kvg.j(3)), new kvg.j(4)), zhm.h0.f322473a, new l1(3, 9, null)) : zi0.c.i(optional);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, flowE3, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                kw4.z zVar2 = (kw4.z) this.f185443y;
                CreditCardTopupScreenContract$InputData creditCardTopupScreenContract$InputData = zVar2.f190259y;
                al4.n nVar = zVar2.u;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f185441w;
                    xi0.b bVar = (xi0.b) this.f185442x;
                    String str = creditCardTopupScreenContract$InputData.f69781a;
                    w4l.i iVar = w4l.i.f294643c;
                    akg.n nVarH = ((om4.x2) nVar).h(str, iVar);
                    vkm.d dVarC = ((om4.x2) nVar).C(creditCardTopupScreenContract$InputData.f69781a, ll4.w.MAIN_POCKET, iVar);
                    akg.n nVarV2 = nim.a.v(rd0.e.b(osg.b.g(zVar2.f190257w, iVar, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, null, 116)), new i5f.g(12, bVar));
                    kvl.o oVar2 = new kvl.o(rd0.e.b(zVar2.f190254r.d), 2);
                    efm.d0 d0VarF = zVar2.f190258x.f(false);
                    kw4.w function = kw4.w.f;
                    Intrinsics.checkNotNullParameter(function, "function");
                    efm.r rVarX = new ufm.i(d0VarF, new p96.a(24), 1).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    jhi.k kVarU = nim.a.u(new kw4.p(null, zVar2), zh9.u0.m(zh9.u0.i(nVarH, dVarC, nVarV2), zh9.u0.m(oVar2, new kvl.o(rd0.e.b(rVarX), 3))));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, kVarU, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f185441w;
                    Continuation continuation = null;
                    if (((bla.c) this.f185442x) == bla.c.ENABLED) {
                        flowE = new go.g(Boolean.FALSE, 2);
                    } else {
                        kx2.a aVar16 = (kx2.a) this.f185443y;
                        flowE = mo3.a.e(nim.a.u(new ie6.q(2, 16, continuation), boh.f.e(vkm.q.s(nim.a.v(aVar16.f190376c.j(w4l.h.f294642c), new kvg.j(26)), new kvg.j(27), vkm.q.f290100b), new kv7.g(aVar16, 10))), new ku1.f0(22), new ku1.f0(23));
                    }
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, flowE, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f185441w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f185442x;
                    kzb.h hVar4 = (kzb.h) this.f185443y;
                    nyb.k kVar3 = hVar4.f191089p;
                    EarnOptionsBottomSheetParams params = hVar4.o.f83487a;
                    kVar3.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    jxb.l lVar2 = (jxb.l) kVar3.f220804a;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB4 = rd0.e.b(lVar2.f179132n.e(params, loadingStrategy2));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, dVarB4, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f185441w;
                    l0c.u uVar = (l0c.u) this.f185443y;
                    TermsInfo termsInfo = uVar.o.f83849a.f84099a;
                    pre.c cVar = uVar.f191226p;
                    if (termsInfo instanceof TermsInfo.Id) {
                        d0VarM = cVar.i(((TermsInfo.Id) termsInfo).f84097a, null);
                    } else if (termsInfo instanceof TermsInfo.Scope) {
                        d0VarM = cVar.f(((TermsInfo.Scope) termsInfo).f84098a, null);
                    } else {
                        if (!(termsInfo instanceof TermsInfo.Full)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        od0.h hVar5 = od0.i.Companion;
                        Terms terms = ((TermsInfo.Full) termsInfo).f84096a;
                        hVar5.getClass();
                        d0VarM = efm.d0.m(od0.h.a(terms));
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                    }
                    kxj.e eVar = new kxj.e(new l0c.s(termsInfo, 1), 10);
                    d0VarM.getClass();
                    efm.r rVarStartWith = new ufm.i(d0VarM, eVar, 1).x().startWith(new Data(null, null, true, 3, null));
                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                    Flow flowE4 = boh.f.e(rd0.e.b(rVarStartWith), new l0c.s(uVar, 0));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, flowE4, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f185441w;
                    String str2 = (String) this.f185442x;
                    l26.f fVar = (l26.f) this.f185443y;
                    t38.e eVarZ2 = fVar.f191673s.Z2(fVar.o.f71679a, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, eVarZ2, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f185441w;
                    Data data2 = (Data) this.f185442x;
                    l2d.n nVar2 = (l2d.n) this.f185443y;
                    List list = (List) data2.getContent();
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        gVar2 = new go.g(data2, 2);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : list) {
                            FavouritesAssetTypeKey favouritesAssetTypeKey = ((AlertItem) obj3).getF86877b().d;
                            Object arrayList = linkedHashMap.get(favouritesAssetTypeKey);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(favouritesAssetTypeKey, arrayList);
                            }
                            ((List) arrayList).add(obj3);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            FavouritesAssetTypeKey favouritesAssetTypeKey2 = (FavouritesAssetTypeKey) entry.getKey();
                            List list3 = (List) entry.getValue();
                            u3d.b bVar2 = (u3d.b) nVar2.f191788b.get(favouritesAssetTypeKey2);
                            if (bVar2 == null) {
                                throw new IllegalStateException(j6.a.q("Interactor not found for typeKey=", favouritesAssetTypeKey2.f86866a));
                            }
                            List list4 = list3;
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                            Iterator it8 = list4.iterator();
                            while (it8.hasNext()) {
                                arrayList3.add(((AlertItem) it8.next()).getF86877b().f86863a);
                            }
                            efm.r map = bVar2.i(arrayList3).filter(new l2d.b(new l2d.a(1), 4)).map(new l2d.b(new l2d.c(favouritesAssetTypeKey2, 0), 5));
                            if (map != null) {
                                arrayList2.add(map);
                            }
                        }
                        efm.r map2 = te0.w.w(arrayList2).map(new l2d.b(new l2d.a(0), 0));
                        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                        efm.r map3 = map2.map(new l2d.b(new b8d.u(data2, nVar2, list), 3));
                        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                        gVar2 = rd0.e.b(map3);
                    }
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, gVar2, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f185441w;
                    if (((Boolean) this.f185442x).booleanValue()) {
                        ptc.a aVar22 = ((l43.m) this.f185443y).f192057p;
                        qtc.k feature = qtc.k.CARD_PAYMENTS;
                        wtc.a1 a1Var = (wtc.a1) aVar22;
                        a1Var.getClass();
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        cuc.z zVar3 = (cuc.z) a1Var.f299851a;
                        zVar3.getClass();
                        Intrinsics.checkNotNullParameter(feature, "feature");
                        gVar3 = zVar3.d.b(feature, w4l.i.f294643c);
                    } else {
                        gVar3 = new go.g(new Data(null, null, false, 7, null), 2);
                    }
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, gVar3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f185441w;
                    w4l.k kVar4 = (w4l.k) this.f185442x;
                    com.revolut.feature.travel.flights.impl.ui.screen.checkin.a aVar24 = (com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) this.f185443y;
                    akg.n nVarA = aVar24.o.a(((l5g.e) ((vkm.j2) aVar24.f93291q.f22677a).getValue()).f192258a, kVar4);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, nVarA, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f185441w;
                    MultibancoRegistrationStatus multibancoRegistrationStatus = (MultibancoRegistrationStatus) this.f185442x;
                    MultibancoRegistrationStatus.Registered registered = multibancoRegistrationStatus instanceof MultibancoRegistrationStatus.Registered ? (MultibancoRegistrationStatus.Registered) multibancoRegistrationStatus : null;
                    String revolutCardId = registered != null ? registered.getRevolutCardId() : null;
                    Flow flowB = revolutCardId != null ? rd0.e.b(((ha3.x) ((l72.d) this.f185443y).f192507c).v(revolutCardId)) : new go.g(new Data(null, new IllegalStateException("User not registered with MB"), false, 5, null), 2);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, flowB, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f185441w;
                    com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b bVar3 = (com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b) this.f185443y;
                    t1j.b bVar4 = bVar3.f91360p;
                    String str3 = bVar3.o.f91354a;
                    kgm.i iVar2 = (kgm.i) bVar4.f267380b;
                    w4l.h loadingStrategy3 = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    vkm.d dVarB5 = ((x4l.c) iVar2.f184024c).b(new p5f.f(str3), loadingStrategy3);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, dVarB5, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f185441w;
                    vkm.d dVarU = o7.b.u(((l7j.z) this.f185443y).v, (OrderQuoteParams) this.f185442x);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, dVarU, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f185441w;
                    l92.g gVar5 = ((com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.c) this.f185443y).o;
                    vkm.y yVarE = rd0.e.e(new ax9.o(yh5.b.d(gVar5.f193028a.f132818b.b(Unit.f186387a, w4l.i.f294643c), rd0.e.b(whf.b.a(gVar5.f193029b, te0.w.h(l92.g.a()), null, 4, null, 10))), 8), zhm.h0.f322473a, new im2.b(3, 6, null));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, yVarE, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f185441w;
                    String value = (String) this.f185442x;
                    tga.k kVar5 = ((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) this.f185443y).v;
                    if (value != null) {
                        Intrinsics.checkNotNullParameter(value, "value");
                    } else {
                        value = null;
                    }
                    Flow flowD = kVar5.d(new mga.b0(value, null));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, flowD, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                String str4 = (String) this.f185441w;
                xl2.h0 h0Var = (xl2.h0) this.f185442x;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                dd0.c cVar2 = ((com.revolut.core.backend_flow.impl.ui.form_screen.a) this.f185443y).f51287y;
                this.f185441w = null;
                this.f185442x = null;
                this.v = 1;
                Object objA = cVar2.a(str4, h0Var, this);
                return objA == aVar30 ? aVar30 : objA;
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f185441w;
                    int iIntValue = ((Number) this.f185442x).intValue();
                    lde.f fVar2 = (lde.f) this.f185443y;
                    fVar2.getClass();
                    vkm.d dVarB6 = rd0.e.b(nim.a.w(le.u1.d(g9e.a.d(fVar2.f194075a, null, null, 63), fVar2.f194077c.b(new OrdersWidgetContract$Config(wd9.d.FX, OrdersWidgetContract$Config.Style.HeaderBoxed.f78611a, 3, OrdersWidgetContract$FilterQuery.EMPTY.f78614a))), new abf.n(fVar2, iIntValue, 18)));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB6, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = (FlowCollector) this.f185441w;
                    lde.l lVar3 = (lde.l) this.f185442x;
                    lde.m mVar2 = (lde.m) this.f185443y;
                    mVar2.getClass();
                    List list5 = lVar3.f194085a;
                    vkm.d dVarB7 = rd0.e.b(nim.a.w(whf.b.a(mVar2.f194086a, te0.w.h(fc.a(cde.a.a(i7.Companion), list5 != null ? fde.a.a(list5) : null)), new kx7.o0(5), 4, null, 8), new laj.b(mVar2, 11)));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, dVarB7, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) this.f185441w;
                    ldg.f fVar3 = (ldg.f) this.f185443y;
                    vkm.d dVarB8 = rd0.e.b(fVar3.f194102p.c(fVar3.o.f93975a));
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, dVarB8, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = (FlowCollector) this.f185441w;
                    gdk.c cVar3 = (gdk.c) ((ldk.y) this.f185443y).o;
                    cVar3.getClass();
                    w4l.h loadingStrategy4 = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    bdk.c cVar4 = cVar3.f143189a;
                    cVar4.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vkm.d dVarB9 = cVar4.d.b(Unit.f186387a, loadingStrategy4);
                    this.f185441w = null;
                    this.f185442x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector29, dVarB9, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f185443y = obj2;
    }
}
