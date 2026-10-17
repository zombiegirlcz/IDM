package a0e;

import a83.j0;
import ael.d0;
import ahe.a1;
import ahe.w0;
import akf.i0;
import akf.p0;
import akl.e0;
import androidx.room.coroutines.FlowUtil;
import as1.a0;
import b9.w2;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.impl.network.services.AcquiringOrdersService;
import com.revolut.feature.freelancer.impl.network.services.AcquiringPaymentsService;
import com.revolut.feature.payees.impl.ui.OwnerType;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.payees.impl.ui.payees_select.PayeesSelectScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import fmc.z;
import g2e.c0;
import java.time.LocalDate;
import java.util.List;
import kl.t1;
import klf.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import om4.y3;
import tof.a3;
import tof.s1;
import vge.t2;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f349y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f349y = obj2;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f347w;
            Pair pair = (Pair) this.f348x;
            Flow flowD = ((a0) this.f349y).v.d((io3.d) pair.f186385a, (Double) pair.f186386b);
            this.f347w = null;
            this.f348x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowD, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        Flow v1Var;
        atk.l lVar = (atk.l) this.f349y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f347w;
            Continuation continuation = null;
            if (((Boolean) this.f348x).booleanValue()) {
                d0 d0Var = lVar.f9092m;
                String ref2 = lVar.f9091l.f9086a;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(ref2, "ref");
                vdl.o oVar = (vdl.o) d0Var.f3605b;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(ref2, "ref");
                v1Var = new q0(nim.a.v(rd0.e.b(oVar.f288020p.f(ref2, false)), new arf.h(25)), new ap7.k(lVar, continuation, 11), 1);
            } else {
                v1Var = new v1(new e0(lVar, continuation, 9));
            }
            this.f347w = null;
            this.f348x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, v1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        od0.h hVar;
        String str = (String) this.f348x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            od0.h hVar2 = od0.i.Companion;
            AcquiringOrdersService acquiringOrdersService = ((au6.v) this.f349y).f9634a;
            this.f348x = null;
            this.f347w = hVar2;
            this.v = 1;
            Object order = acquiringOrdersService.getOrder(str, this);
            if (order == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj2 = order;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (od0.h) this.f347w;
            yhm.o.b(obj2);
        }
        nr6.b bVarB = bu6.a.b((jt6.e) obj2);
        hVar.getClass();
        return od0.h.a(bVarB);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                m mVar = new m((Continuation) obj4, (q) this.f349y, 0);
                mVar.f347w = (FlowCollector) obj2;
                mVar.f348x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m((Continuation) obj4, (a15.m) this.f349y, 1);
                mVar2.f347w = (FlowCollector) obj2;
                mVar2.f348x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            case 2:
                m mVar3 = new m((Continuation) obj4, (mp.p) this.f349y, 2);
                mVar3.f347w = (FlowCollector) obj2;
                mVar3.f348x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
            case 3:
                m mVar4 = new m((Continuation) obj4, (hd.r) this.f349y, 3);
                mVar4.f347w = (FlowCollector) obj2;
                mVar4.f348x = obj3;
                return mVar4.invokeSuspend(Unit.f186387a);
            case 4:
                m mVar5 = new m((Continuation) obj4, (a32.a0) this.f349y, 4);
                mVar5.f347w = (FlowCollector) obj2;
                mVar5.f348x = obj3;
                return mVar5.invokeSuspend(Unit.f186387a);
            case 5:
                m mVar6 = new m((Continuation) obj4, (a3e.t) this.f349y, 5);
                mVar6.f347w = (FlowCollector) obj2;
                mVar6.f348x = obj3;
                return mVar6.invokeSuspend(Unit.f186387a);
            case 6:
                m mVar7 = new m((Continuation) obj4, (a5e.l) this.f349y, 6);
                mVar7.f347w = (FlowCollector) obj2;
                mVar7.f348x = obj3;
                return mVar7.invokeSuspend(Unit.f186387a);
            case 7:
                m mVar8 = new m((Continuation) obj4, (a5i.p) this.f349y, 7);
                mVar8.f347w = (FlowCollector) obj2;
                mVar8.f348x = obj3;
                return mVar8.invokeSuspend(Unit.f186387a);
            case 8:
                m mVar9 = new m((Continuation) obj4, (a6e.d) this.f349y, 8);
                mVar9.f347w = (FlowCollector) obj2;
                mVar9.f348x = obj3;
                return mVar9.invokeSuspend(Unit.f186387a);
            case 9:
                m mVar10 = new m((Continuation) obj4, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) this.f349y, 9);
                mVar10.f347w = (FlowCollector) obj2;
                mVar10.f348x = obj3;
                return mVar10.invokeSuspend(Unit.f186387a);
            case 10:
                m mVar11 = new m(this.f349y, (Continuation) obj4, 10);
                mVar11.f347w = (FlowCollector) obj2;
                mVar11.f348x = (Throwable) obj3;
                return mVar11.invokeSuspend(Unit.f186387a);
            case 11:
                m mVar12 = new m((Continuation) obj4, (abf.o) this.f349y, 11);
                mVar12.f347w = (FlowCollector) obj2;
                mVar12.f348x = obj3;
                return mVar12.invokeSuspend(Unit.f186387a);
            case 12:
                m mVar13 = new m((Continuation) obj4, (w0) this.f349y, 12);
                mVar13.f347w = (FlowCollector) obj2;
                mVar13.f348x = obj3;
                return mVar13.invokeSuspend(Unit.f186387a);
            case 13:
                m mVar14 = new m((Continuation) obj4, (a1) this.f349y, 13);
                mVar14.f347w = (FlowCollector) obj2;
                mVar14.f348x = obj3;
                return mVar14.invokeSuspend(Unit.f186387a);
            case 14:
                m mVar15 = new m((Continuation) obj4, (ahg.n) this.f349y, 14);
                mVar15.f347w = (FlowCollector) obj2;
                mVar15.f348x = obj3;
                return mVar15.invokeSuspend(Unit.f186387a);
            case 15:
                m mVar16 = new m((Continuation) obj4, (aj6.x) this.f349y, 15);
                mVar16.f347w = (FlowCollector) obj2;
                mVar16.f348x = obj3;
                return mVar16.invokeSuspend(Unit.f186387a);
            case 16:
                m mVar17 = new m((Continuation) obj4, (ajh.l) this.f349y, 16);
                mVar17.f347w = (FlowCollector) obj2;
                mVar17.f348x = obj3;
                return mVar17.invokeSuspend(Unit.f186387a);
            case 17:
                m mVar18 = new m((Continuation) obj4, (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.f349y, 17);
                mVar18.f347w = (FlowCollector) obj2;
                mVar18.f348x = obj3;
                return mVar18.invokeSuspend(Unit.f186387a);
            case 18:
                m mVar19 = new m((Continuation) obj4, (i0) this.f349y, 18);
                mVar19.f347w = (FlowCollector) obj2;
                mVar19.f348x = obj3;
                return mVar19.invokeSuspend(Unit.f186387a);
            case 19:
                m mVar20 = new m((Continuation) obj4, (p0) this.f349y, 19);
                mVar20.f347w = (FlowCollector) obj2;
                mVar20.f348x = obj3;
                return mVar20.invokeSuspend(Unit.f186387a);
            case 20:
                m mVar21 = new m((Continuation) obj4, (akg.o) this.f349y, 20);
                mVar21.f347w = (FlowCollector) obj2;
                mVar21.f348x = obj3;
                return mVar21.invokeSuspend(Unit.f186387a);
            case 21:
                m mVar22 = new m((Continuation) obj4, (ald.h) this.f349y, 21);
                mVar22.f347w = (FlowCollector) obj2;
                mVar22.f348x = obj3;
                return mVar22.invokeSuspend(Unit.f186387a);
            case 22:
                m mVar23 = new m((Continuation) obj4, (alf.c) this.f349y, 22);
                mVar23.f347w = (FlowCollector) obj2;
                mVar23.f348x = obj3;
                return mVar23.invokeSuspend(Unit.f186387a);
            case 23:
                m mVar24 = new m((Continuation) obj4, (amh.x) this.f349y, 23);
                mVar24.f347w = (FlowCollector) obj2;
                mVar24.f348x = obj3;
                return mVar24.invokeSuspend(Unit.f186387a);
            case 24:
                m mVar25 = new m((Continuation) obj4, (com.revolut.feature.payees.impl.ui.payees_select.b) this.f349y, 24);
                mVar25.f347w = (FlowCollector) obj2;
                mVar25.f348x = obj3;
                return mVar25.invokeSuspend(Unit.f186387a);
            case 25:
                m mVar26 = new m((Continuation) obj4, (aqh.v) this.f349y, 25);
                mVar26.f347w = (FlowCollector) obj2;
                mVar26.f348x = obj3;
                return mVar26.invokeSuspend(Unit.f186387a);
            case 26:
                m mVar27 = new m((Continuation) obj4, (a0) this.f349y, 26);
                mVar27.f347w = (FlowCollector) obj2;
                mVar27.f348x = obj3;
                return mVar27.invokeSuspend(Unit.f186387a);
            case 27:
                m mVar28 = new m((Continuation) obj4, (atk.l) this.f349y, 27);
                mVar28.f347w = (FlowCollector) obj2;
                mVar28.f348x = obj3;
                return mVar28.invokeSuspend(Unit.f186387a);
            case 28:
                String str = ((AcquiringOrder$Id) obj3).f73342a;
                m mVar29 = new m((au6.v) this.f349y, (Continuation) obj4, 28);
                mVar29.f348x = str;
                return mVar29.invokeSuspend(Unit.f186387a);
            default:
                String str2 = ((AcquiringPayment$Id) obj3).f73363a;
                m mVar30 = new m((au6.d0) this.f349y, (Continuation) obj4, 29);
                mVar30.f348x = str2;
                return mVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        Continuation continuation;
        Flow eVar;
        vkm.d dVarB;
        Flow gVar2;
        Flow j0Var;
        Flow gVar3;
        Flow flowU;
        int i;
        Continuation continuation2;
        Flow flowU2;
        String strSubstring;
        od0.h hVar;
        Object payment;
        int i2 = this.u;
        int i3 = 19;
        int i5 = 8;
        int i6 = 3;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i21 = 0;
        Continuation continuation3 = null;
        Object obj3 = this.f349y;
        int i22 = 1;
        switch (i2) {
            case 0:
                w2 w2Var = ((q) obj3).f354m;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f347w;
                    b bVar = (b) this.f348x;
                    if (bVar == null) {
                        continuation = null;
                        eVar = new go.g(null, 2);
                    } else {
                        wxd.f configuration = bVar.f338b;
                        String str = bVar.f337a;
                        w2Var.getClass();
                        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-product$0");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        if (w2.E(configuration) == null) {
                            gVar = new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2);
                        } else {
                            kdh.b bVar2 = (kdh.b) w2Var.f13499b;
                            lyd.k.Companion.getClass();
                            lyd.i iVarM0 = bVar2.m0(str, lyd.j.a(configuration));
                            gVar = iVarM0 == null ? new go.g(new Data(null, new IllegalStateException("Custom content provider is not registered for ".concat(str)), false, 5, null), 2) : iVarM0.c();
                        }
                        w2Var.getClass();
                        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-product$0");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        kdh.b bVar3 = (kdh.b) w2Var.f13499b;
                        lyd.k.Companion.getClass();
                        lyd.i iVarM02 = bVar3.m0(str, lyd.j.a(configuration));
                        continuation = null;
                        eVar = new t38.e(gVar, 24, iVarM02 == null ? new go.g(new Data(null, new IllegalStateException("Custom content provider is not registered for ".concat(str)), false, 5, null), 2) : iVarM02.b(), new o(bVar, continuation, i21));
                    }
                    this.f347w = continuation;
                    this.f348x = continuation;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, eVar, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f347w;
                    LocalDate date = (LocalDate) this.f348x;
                    r05.f fVar = ((a15.m) obj3).o;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(date, "date");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    l05.g gVar4 = fVar.f250704a;
                    gVar4.getClass();
                    Intrinsics.checkNotNullParameter(date, "date");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB2 = gVar4.e.b(date, loadingStrategy);
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                mp.p pVar = (mp.p) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f347w;
                    xi0.b bVar4 = (xi0.b) this.f348x;
                    f16.b bVar5 = (f16.b) pVar.f207709b;
                    Intrinsics.h(bVar4);
                    Flow flowH = xam.a.h(new a26.q(pVar, bVar4, (Continuation) null, i21), vkm.q.q(nim.a.v(f16.b.a(bVar5, bVar4), a26.o.f685a)));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowH, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                hd.r rVar = (hd.r) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f347w;
                    xi0.b fiatCurrency = (xi0.b) this.f348x;
                    f16.b bVar6 = (f16.b) rVar.f151364a;
                    Intrinsics.h(fiatCurrency);
                    f16.a aVar5 = f16.b.Companion;
                    Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
                    Flow flowH2 = xam.a.h(new a26.q(rVar, fiatCurrency, (Continuation) null, 1), qe0.o.a(((l16.e) bVar6).f191479g, fiatCurrency, 5L, null, false, null, 28));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowH2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                a32.a0 a0Var = (a32.a0) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f347w;
                    z22.a transferData = (z22.a) this.f348x;
                    a32.f fVar2 = a0Var.f1008p;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(transferData, "transferData");
                    Continuation continuation4 = null;
                    vkm.y yVar = new vkm.y(new a32.u(a0Var, continuation4, 1), vkm.q.Q(new t38.e(((q12.f) fVar2.d).b(new ApmQuoteDirection.Outgoing(fVar2.f1022a.f62316b), transferData), 24, ((yt9.g) fVar2.e).g(transferData.f318942a, transferData.d), new a32.c(3, 0, null)), new a32.b(continuation4, fVar2, transferData, i21)));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, yVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                a3e.t tVar = (a3e.t) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f347w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f348x;
                    f3e.h hVar2 = ((a3e.c) ((j2) tVar.u.f22677a).getValue()).f1104b;
                    f3e.f fVar3 = hVar2 instanceof f3e.f ? (f3e.f) hVar2 : null;
                    f3e.c cVar = fVar3 != null ? fVar3.f131968a : null;
                    t1 t1Var = tVar.o;
                    co3.a aVar8 = cVar != null ? new co3.a(cVar.f131961a, cVar.f131962b) : null;
                    t1Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    c0 c0Var = (c0) ((g2e.w) t1Var.f185240b);
                    c0Var.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB3 = c0Var.f.b(new g2e.v(c0Var.d.z(), aVar8), loadingStrategy2);
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, dVarB3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f347w;
                    vkm.d dVarB4 = rd0.e.b(((ael.k) ((a5e.l) obj3).f1375n).n((List) this.f348x, loadingStrategy));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, dVarB4, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f347w;
                    a5i.c cVar2 = ((a5i.p) obj3).o;
                    akg.n nVarV = nim.a.v(rd0.e.b(cVar2.f1412b.a(cVar2.f1411a.f97177a.f97056a.f104721c.f306286a, true)), new a08.e(1, cVar2, a5i.c.class, "toBondPriceDetails", "toBondPriceDetails(Lcom/revolut/shared/feature/wealth/models/details/BaseInstrumentDetails;)Lcom/revolut/feature_market_data_impl/ui/breakdown/kompot/screens/transaction_price_description/TransactionPriceDescriptionScreenContract$BondPriceDetails;", 0, 5));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, nVarV, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f347w;
                    Flow bVar7 = Intrinsics.f(((Data) this.f348x).getContent(), Boolean.TRUE) ? new a6e.b(rd0.e.n(rd0.e.b(((ypg.p) ((a6e.d) obj3).f1621b).f(loadingStrategy, pcd.g.f234858b)), h0.f322473a), i21) : new go.g(Boolean.FALSE, 2);
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, bVar7, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f347w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f348x;
                    com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c cVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) obj3;
                    c6b.f fVar4 = cVar3.f82559p;
                    CobrandedCardsAdditionalValueScreenContract$InputData cobrandedCardsAdditionalValueScreenContract$InputData = cVar3.o;
                    if (cobrandedCardsAdditionalValueScreenContract$InputData instanceof CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan) {
                        CobrandedCardsPlan cobrandedCardsPlan = ((CobrandedCardsAdditionalValueScreenContract$InputData.WithPlan) cobrandedCardsAdditionalValueScreenContract$InputData).f82551a;
                        String id10 = cobrandedCardsPlan.f82304a;
                        String tier = cobrandedCardsPlan.f82305b;
                        fVar4.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        y5b.u uVar = fVar4.f21759a;
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        dVarB = uVar.f311065b.b(new Pair(id10, tier), loadingStrategy3);
                    } else {
                        if (!(cobrandedCardsAdditionalValueScreenContract$InputData instanceof CobrandedCardsAdditionalValueScreenContract$InputData.CurrentPlan)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar4.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        y5b.u uVar2 = fVar4.f21759a;
                        uVar2.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                        dVarB = uVar2.f311066c.b(Unit.f186387a, loadingStrategy3);
                    }
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, dVarB, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                FlowCollector flowCollector11 = (FlowCollector) this.f347w;
                Throwable th10 = (Throwable) this.f348x;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    if (th10 instanceof WidgetNotAvailableException) {
                        throw th10;
                    }
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (((a95.b) obj3).invoke(flowCollector11, th10, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f347w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f348x;
                    abf.o oVar = (abf.o) obj3;
                    o9f.c cVar4 = oVar.f2960p;
                    String accountId = oVar.o.f91639a;
                    cVar4.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    h9f.e eVar2 = cVar4.f223260a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    akg.n nVarV2 = nim.a.v(eVar2.f150245b.b(new c9f.g(accountId, u8f.d.OUT), loadingStrategy4), new h8b.l(i3));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, nVarV2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f347w;
                    v1 v1Var = new v1(new a1a.c((w0) obj3, (sfe.a) this.f348x, (Continuation) null, 6));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, v1Var, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                a1 a1Var = (a1) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f347w;
                    Data data = (Data) this.f348x;
                    List list = (List) data.getContent();
                    Flow gVar5 = list == null ? new go.g(data, 2) : vkm.q.Q(((t2) a1Var.f4974a).d(), new a67.c((Continuation) null, list, a1Var, data, 2));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, gVar5, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f347w;
                    ahg.n nVar = (ahg.n) obj3;
                    akg.n nVarA = vfg.e.a(nVar.f5124p, nVar.o.f94280a);
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, nVarA, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                aj6.x xVar = (aj6.x) obj3;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f347w;
                    Continuation continuation5 = null;
                    vkm.y yVarE = rd0.e.e(vkm.q.H(new a1a.c(xVar, continuation5, i5), yh5.b.d(rd0.e.b(xVar.f5431p.d(null, null, true, true)), mo3.a.g(xVar.f5435t.a(w4l.j.f294644c), null, null, 3))), h0.f322473a, new aj6.u(i6, i21, continuation5));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, yVarE, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                ajh.l lVar = (ajh.l) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f347w;
                    akg.n nVarI = u0.i(tzg.m.c(lVar.f5579p, (w4l.k) this.f348x, null, 2), ybl.l.d(lVar.f5580q), ((ael.h0) lVar.f5581r).d());
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, nVarI, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a aVar20 = (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f347w;
                    Flow flowE = boh.f.e(aVar20.f83192q.c(aVar20.o.f83189a, loadingStrategy), new a26.p(aVar20, 2));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, flowE, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                i0 i0Var = (i0) obj3;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f347w;
                    do3.n nVar2 = (do3.n) this.f348x;
                    al4.e eVar3 = i0Var.o;
                    wi0.b countryCode = do3.q.y(nVar2);
                    om4.c0 c0Var2 = (om4.c0) eVar3;
                    c0Var2.getClass();
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV3 = nim.a.v(vkm.q.q(vkm.q.Q(((y3) c0Var2.f226539c).h(), new k25.o(null, c0Var2, countryCode, 29))), new a26.p(i0Var, i6));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, nVarV3, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f347w;
                    Pair pair = (Pair) this.f348x;
                    a3 a3Var = (a3) pair.f186385a;
                    p0 p0Var = (p0) obj3;
                    if (((Boolean) pair.f186386b).booleanValue()) {
                        gVar2 = new go.g(f0.f322471a, 2);
                    } else {
                        ibd.i iVar = a3Var.C;
                        if (iVar == null || (id = iVar.getId()) == null) {
                            s1 s1Var = a3Var.f272623x1;
                            if (s1Var != null) {
                                String id11 = s1Var.f273038a;
                                gVar2 = new a3i.i(p0Var.f5878n.b(id11), p0Var, 11);
                            } else {
                                gVar2 = new go.g(f0.f322471a, 2);
                            }
                        } else {
                            gVar2 = new a3i.i(p0Var.f5878n.b(id11), p0Var, 11);
                        }
                    }
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, gVar2, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                akg.o oVar2 = (akg.o) obj3;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f347w;
                    mk0.a aVar25 = oVar2.f;
                    akg.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter("APP_STYLE", "id");
                    Flow flowF = aVar25.f(new tk0.f("APP_STYLE"));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector21);
                    Object objCollect = flowF.collect(new a3i.h(flowCollector21, oVar2, 15), this);
                    if (objCollect != aVar24) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar24) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                ald.h hVar3 = (ald.h) obj3;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f347w;
                    if (((al0.a) this.f348x) == al0.a.ONLINE) {
                        okd.b bVar8 = hVar3.f6227b;
                        j0Var = new j0(new a3i.i(com.google.crypto.tink.shaded.protobuf.t1.e(FlowUtil.createFlow(bVar8.f225989a, false, new String[]{"slot_actions"}, new ok7.c(bVar8, 1)), ald.d.f6221a), hVar3, 17), 3);
                    } else {
                        j0Var = vkm.i.f290039a;
                    }
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, j0Var, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f347w;
                    Pair pair2 = (Pair) this.f348x;
                    a3 a3Var2 = (a3) pair2.f186385a;
                    j1 j1Var = (j1) pair2.f186386b;
                    String inviteId = a3Var2.K0;
                    if (inviteId == null || j1Var.c()) {
                        gVar3 = new go.g(new Data(null, null, false, 6, null), 2);
                    } else {
                        wwa.b bVar9 = ((alf.c) obj3).f6262c;
                        pwa.n referralCampaignV4Type = pwa.n.SALARY;
                        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
                        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        uwa.q qVar = (uwa.q) bVar9.f300637a;
                        qVar.getClass();
                        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
                        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        gVar3 = qVar.f283598p.b(new uwa.k(inviteId, referralCampaignV4Type), loadingStrategy);
                    }
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, gVar3, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f347w;
                    do3.n nVar3 = (do3.n) this.f348x;
                    amh.x xVar2 = (amh.x) obj3;
                    Intrinsics.h(nVar3);
                    Object dVar = te0.w.V(nVar3) ? new ylh.d(y0.b(ylh.w.MONTH)) : new ylh.c(ylh.w.MONTH);
                    StatementProduct statementProduct = xVar2.o.f6398a;
                    wkm.l lVarQ = vkm.q.Q(!(statementProduct instanceof StatementProduct.Stocks) ? new go.g(zi0.c.P(nVar3.f116408a, false, null, 3), 2) : boh.f.e(((ael.q0) xVar2.u).o(((StatementProduct.Stocks) statementProduct).f95313a, w4l.h.f294642c), new amh.j(xVar2, nVar3, i21)), new a32.b((Continuation) null, xVar2, dVar, 5));
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector24);
                    Object objCollect2 = lVarQ.collect(new a3i.h(flowCollector24, nVar3, i3), this);
                    if (objCollect2 != aVar28) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar28) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                com.revolut.feature.payees.impl.ui.payees_select.b bVar10 = (com.revolut.feature.payees.impl.ui.payees_select.b) obj3;
                PayeesSelectScreenContract$InputData payeesSelectScreenContract$InputData = bVar10.o;
                im9.i iVar2 = bVar10.f79032p;
                cli.y yVar2 = bVar10.f79036t;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f347w;
                    PayeesFlowType payeesFlowType = payeesSelectScreenContract$InputData.f79024a;
                    if (payeesFlowType instanceof PayeesFlowType.Blocked) {
                        OwnerType ownerType = ((PayeesFlowType.Blocked) payeesFlowType).f78995a;
                        if (ownerType instanceof OwnerType.CurrentUser) {
                            String str2 = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6594b;
                            iVar2.getClass();
                            flowU = nim.a.u(new im9.d(iVar2, continuation3, i22), u0.m(nim.a.v(rd0.e.b(((u3a.n) iVar2.f162328a).d(str2, zhm.u.c(d3a.a.REVOLUT), jq9.a.NONE)), new im3.e(i22)), ((hy9.c) iVar2.f162330c).a()));
                        } else {
                            if (!(ownerType instanceof OwnerType.Junior)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String str3 = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6594b;
                            if (str3 != null) {
                                int length = str3.length();
                                while (true) {
                                    if (i21 >= length) {
                                        strSubstring = "";
                                    } else if (str3.charAt(i21) == '@') {
                                        i21++;
                                    } else {
                                        strSubstring = str3.substring(i21);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                    }
                                }
                            } else {
                                strSubstring = null;
                            }
                            z zVar = bVar10.f79034r;
                            String juniorId = ((OwnerType.Junior) ownerType).f78993a;
                            zVar.getClass();
                            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                            flowU = nim.a.v(nim.a.v(((ou5.b) zVar.f136369b).t(juniorId, loadingStrategy), new ijg.c(zVar, strSubstring, 9)), new amf.i(i5));
                        }
                    } else {
                        if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str4 = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6594b;
                        im9.c filter = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6593a;
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(filter, "filter");
                        flowU = nim.a.u(new im9.f(filter, iVar2, null, i21), u0.m(im9.i.d(iVar2, str4, null, 2), ((hy9.c) iVar2.f162330c).a()));
                    }
                    PayeesFlowType payeesFlowType2 = payeesSelectScreenContract$InputData.f79024a;
                    if (payeesFlowType2 instanceof PayeesFlowType.Blocked) {
                        OwnerType ownerType2 = ((PayeesFlowType.Blocked) payeesFlowType2).f78995a;
                        if (ownerType2 instanceof OwnerType.CurrentUser) {
                            String str5 = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6594b;
                            xx9.p pVar2 = iVar2.f162329b;
                            if (str5 == null) {
                                str5 = "";
                            }
                            flowU2 = nim.a.u(new im9.d(iVar2, null, 2), u0.m(rd0.e.b(xx9.p.b(pVar2, str5)), ((hy9.c) iVar2.f162330c).a()));
                        } else {
                            if (!(ownerType2 instanceof OwnerType.Junior)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            flowU2 = zi0.c.i(f0.f322471a);
                        }
                        i = 1;
                        continuation2 = null;
                    } else {
                        if (!(payeesFlowType2 instanceof PayeesFlowType.RequireAuthentication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str6 = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6594b;
                        im9.c filter2 = ((an9.n) ((j2) yVar2.f22677a).getValue()).f6593a;
                        iVar2.getClass();
                        Intrinsics.checkNotNullParameter(filter2, "filter");
                        xx9.p pVar3 = iVar2.f162329b;
                        if (str6 == null) {
                            str6 = "";
                        }
                        i = 1;
                        continuation2 = null;
                        flowU2 = nim.a.u(new im9.f(filter2, iVar2, continuation2, i), u0.m(rd0.e.b(xx9.p.b(pVar3, str6)), ((hy9.c) iVar2.f162330c).a()));
                    }
                    t38.e eVarM = u0.m(flowU, flowU2);
                    this.f347w = continuation2;
                    this.f348x = continuation2;
                    this.v = i;
                    if (vkm.q.u(flowCollector25, eVarM, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                aqh.v vVar = (aqh.v) obj3;
                cli.y yVar3 = vVar.f8461s;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f347w;
                    jhi.b bVarE = mo3.a.e(nim.a.y(nim.a.v(fkg.a.v(vVar.f8459q, ((aqh.i) ((j2) yVar3.f22677a).getValue()).f8437b, (List) this.f348x, ((aqh.i) ((j2) yVar3.f22677a).getValue()).d, ((aqh.i) ((j2) yVar3.f22677a).getValue()).e, 0, 48), aqh.r.f8454a), aqh.s.f8455a), aqh.t.f8456a, aqh.u.f8457a);
                    this.f347w = null;
                    this.f348x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, bVarE, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                return b(obj2);
            case 27:
                return c(obj2);
            case 28:
                return n(obj2);
            default:
                String str7 = (String) this.f348x;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    hVar = od0.i.Companion;
                    AcquiringPaymentsService acquiringPaymentsService = ((au6.d0) obj3).f9509a;
                    this.f348x = null;
                    this.f347w = hVar;
                    this.v = 1;
                    payment = acquiringPaymentsService.getPayment(str7, this);
                    if (payment == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od0.h hVar4 = (od0.h) this.f347w;
                    yhm.o.b(obj2);
                    hVar = hVar4;
                    payment = obj2;
                }
                pr6.e eVarB = bu6.b.b((lt6.b) payment);
                hVar.getClass();
                return od0.h.a(eVarB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f349y = obj2;
    }
}
