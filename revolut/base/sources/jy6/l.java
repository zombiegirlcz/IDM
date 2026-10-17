package jy6;

import ard.c0;
import au6.w2;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.delegates.x8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.revolut_shop.data.service.IppShopService;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.revolut.feature_fourthline_impl.R;
import d3c.i0;
import dp4.b1;
import ghk.a0;
import grl.r2;
import hy1.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jel.e2;
import k25.u;
import k50.n4;
import k50.o4;
import k50.p4;
import k50.r4;
import k50.w4;
import k6a.s;
import k79.r;
import ke7.v;
import kkf.d3;
import kkf.h2;
import kkf.i1;
import kkf.i5;
import kkf.m1;
import kkf.n3;
import kkf.p3;
import kkf.q4;
import kkf.u4;
import kkf.v2;
import kkf.x2;
import kkf.x4;
import kkf.z3;
import klf.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import mif.e0;
import oqk.g0;
import tof.a3;
import tof.ba;
import tof.c1;
import tof.f4;
import tof.fc;
import tof.i7;
import tof.j5;
import tof.p6;
import tof.r9;
import tof.t3;
import vkm.q;
import vkm.v1;
import vkm.y;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f179344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f179345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f179346y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(k3c.p pVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f179346y = pVar;
    }

    private final Object b(Object obj2) {
        Flow gVar;
        Flow flowI;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f179344w;
            Pair pair = (Pair) this.f179345x;
            a3 a3Var = (a3) pair.f186385a;
            t3 t3Var = (t3) pair.f186386b;
            f4 f4Var = t3Var != null ? t3Var.d : null;
            if ((f4Var != null ? f4Var.f : null) != c1.KARMA || k71.k.T0(a3Var)) {
                gVar = new go.g(f0.f322471a, 2);
            } else {
                kkf.a3 a3Var2 = (kkf.a3) this.f179346y;
                a3Var2.getClass();
                String str = f4Var.f272746a;
                if (str != null) {
                    flowI = rd0.e.b(nim.a.w(((y45.f) a3Var2.f184593c).m(str, w4l.h.f294642c), new k65.d(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 16)));
                } else {
                    od0.i.Companion.getClass();
                    flowI = zi0.c.i(od0.i.f224256b);
                }
                gVar = new c0(yh5.b.e(flowI, rd0.e.b(ue0.e.p(hng.g.b(((ang.b) a3Var2.f184592b).f7765a), h0.f322473a)), a3Var2.f184591a.j()), a3Var2, a3Var, f4Var, 12);
            }
            this.f179344w = null;
            this.f179345x = null;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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
        Flow gVar;
        Flow flowI;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f179344w;
            Pair pair = (Pair) this.f179345x;
            a3 a3Var = (a3) pair.f186385a;
            t3 t3Var = (t3) pair.f186386b;
            f4 f4Var = t3Var != null ? t3Var.d : null;
            if ((f4Var != null ? f4Var.f : null) == c1.KARMA && k71.k.T0(a3Var)) {
                d3 d3Var = (d3) this.f179346y;
                d3Var.getClass();
                String str = f4Var.f272746a;
                if (str != null) {
                    flowI = rd0.e.b(nim.a.w(d3Var.f184639b.b(str, w4l.h.f294642c), new v(d3Var, 14)));
                } else {
                    od0.i.Companion.getClass();
                    flowI = zi0.c.i(od0.i.f224256b);
                }
                gVar = new b0(flowI, d3Var, a3Var, 13);
            } else {
                gVar = new go.g(f0.f322471a, 2);
            }
            this.f179344w = null;
            this.f179345x = null;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f179344w;
            n35.b bVar = (n35.b) this.f179345x;
            p3 p3Var = (p3) this.f179346y;
            p3Var.getClass();
            Flow fVar = (bVar.f211870a == null && bVar.f211871b == null) ? new kh4.f((Flow) p3Var.f184881a.e.getValue(), p3Var, 20) : new go.g(f0.f322471a, 2);
            this.f179344w = null;
            this.f179345x = null;
            this.v = 1;
            if (q.u(flowCollector, fVar, this) == aVar) {
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

    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f179344w;
            Flow flowZ2 = z3.Z2((z3) this.f179346y, (String) this.f179345x);
            this.f179344w = null;
            this.f179345x = null;
            this.v = 1;
            if (q.u(flowCollector, flowZ2, this) == aVar) {
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

    private final Object p(Object obj2) {
        ibd.i iVar;
        String id10;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f179344w;
            Pair pair = (Pair) this.f179345x;
            a3 a3Var = (a3) pair.f186385a;
            j1 j1Var = (j1) pair.f186386b;
            q4 q4Var = (q4) this.f179346y;
            q4Var.getClass();
            Flow gVar = (j1Var.c() || (iVar = a3Var.C) == null || (id10 = iVar.getId()) == null) ? new go.g(f0.f322471a, 2) : new kh4.f(rd0.e.b(((yua.q) q4Var.f184908c).o(id10)), q4Var, 23);
            this.f179344w = null;
            this.f179345x = null;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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

    private final Object s(Object obj2) {
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f179344w;
            dj0.d dVar = (dj0.d) this.f179345x;
            x4 x4Var = (x4) this.f179346y;
            Continuation continuation = null;
            if (dVar != null) {
                gVar = q.Q(new iyg.b0(x4Var.f185015p.e(r2.TRANSACTION_DETAILS), 29), new k25.o(continuation, x4Var, dVar, 5));
            } else {
                u4.Companion.getClass();
                gVar = new go.g(u4.f184965c, 2);
            }
            this.f179344w = null;
            this.f179345x = null;
            this.v = 1;
            if (q.u(flowCollector, gVar, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                l lVar = new l((Continuation) obj4, (m) this.f179346y, 0);
                lVar.f179344w = (FlowCollector) obj2;
                lVar.f179345x = obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l((Continuation) obj4, (jz6.o) this.f179346y, 1);
                lVar2.f179344w = (FlowCollector) obj2;
                lVar2.f179345x = obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            case 2:
                l lVar3 = new l((Continuation) obj4, (com.revolut.feature.statements.impl.ui.savings.a) this.f179346y, 2);
                lVar3.f179344w = (FlowCollector) obj2;
                lVar3.f179345x = obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
            case 3:
                l lVar4 = new l((Continuation) obj4, (u) this.f179346y, 3);
                lVar4.f179344w = (FlowCollector) obj2;
                lVar4.f179345x = obj3;
                return lVar4.invokeSuspend(Unit.f186387a);
            case 4:
                l lVar5 = new l((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) this.f179346y, 4);
                lVar5.f179344w = (FlowCollector) obj2;
                lVar5.f179345x = obj3;
                return lVar5.invokeSuspend(Unit.f186387a);
            case 5:
                l lVar6 = new l((k3c.p) this.f179346y, (Continuation) obj4, 5);
                lVar6.f179345x = (k3c.f) obj3;
                return lVar6.invokeSuspend(Unit.f186387a);
            case 6:
                l lVar7 = new l((k3c.p) this.f179346y, (Continuation) obj4, 6);
                lVar7.f179345x = (String) obj3;
                return lVar7.invokeSuspend(Unit.f186387a);
            case 7:
                l lVar8 = new l((Continuation) obj4, (k49.b) this.f179346y, 7);
                lVar8.f179344w = (FlowCollector) obj2;
                lVar8.f179345x = (Object[]) obj3;
                return lVar8.invokeSuspend(Unit.f186387a);
            case 8:
                l lVar9 = new l((Continuation) obj4, (k50.x4) this.f179346y, 8);
                lVar9.f179344w = (FlowCollector) obj2;
                lVar9.f179345x = obj3;
                return lVar9.invokeSuspend(Unit.f186387a);
            case 9:
                l lVar10 = new l((Continuation) obj4, (k5e.m) this.f179346y, 9);
                lVar10.f179344w = (FlowCollector) obj2;
                lVar10.f179345x = obj3;
                return lVar10.invokeSuspend(Unit.f186387a);
            case 10:
                l lVar11 = new l((Continuation) obj4, (s) this.f179346y, 10);
                lVar11.f179344w = (FlowCollector) obj2;
                lVar11.f179345x = obj3;
                return lVar11.invokeSuspend(Unit.f186387a);
            case 11:
                l lVar12 = new l((Continuation) obj4, (r) this.f179346y, 11);
                lVar12.f179344w = (FlowCollector) obj2;
                lVar12.f179345x = obj3;
                return lVar12.invokeSuspend(Unit.f186387a);
            case 12:
                l lVar13 = new l((Continuation) obj4, (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) this.f179346y, 12);
                lVar13.f179344w = (FlowCollector) obj2;
                lVar13.f179345x = obj3;
                return lVar13.invokeSuspend(Unit.f186387a);
            case 13:
                l lVar14 = new l((Continuation) obj4, (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) this.f179346y, 13);
                lVar14.f179344w = (FlowCollector) obj2;
                lVar14.f179345x = obj3;
                return lVar14.invokeSuspend(Unit.f186387a);
            case 14:
                l lVar15 = new l((Continuation) obj4, (kkf.i) this.f179346y, 14);
                lVar15.f179344w = (FlowCollector) obj2;
                lVar15.f179345x = obj3;
                return lVar15.invokeSuspend(Unit.f186387a);
            case 15:
                l lVar16 = new l((Continuation) obj4, (kkf.q) this.f179346y, 15);
                lVar16.f179344w = (FlowCollector) obj2;
                lVar16.f179345x = obj3;
                return lVar16.invokeSuspend(Unit.f186387a);
            case 16:
                l lVar17 = new l((Continuation) obj4, (i1) this.f179346y, 16);
                lVar17.f179344w = (FlowCollector) obj2;
                lVar17.f179345x = obj3;
                return lVar17.invokeSuspend(Unit.f186387a);
            case 17:
                l lVar18 = new l((Continuation) obj4, (m1) this.f179346y, 17);
                lVar18.f179344w = (FlowCollector) obj2;
                lVar18.f179345x = obj3;
                return lVar18.invokeSuspend(Unit.f186387a);
            case 18:
                l lVar19 = new l((Continuation) obj4, (e84.e) this.f179346y, 18);
                lVar19.f179344w = (FlowCollector) obj2;
                lVar19.f179345x = obj3;
                return lVar19.invokeSuspend(Unit.f186387a);
            case 19:
                l lVar20 = new l((Continuation) obj4, (h2) this.f179346y, 19);
                lVar20.f179344w = (FlowCollector) obj2;
                lVar20.f179345x = obj3;
                return lVar20.invokeSuspend(Unit.f186387a);
            case 20:
                l lVar21 = new l((Continuation) obj4, (v2) this.f179346y, 20);
                lVar21.f179344w = (FlowCollector) obj2;
                lVar21.f179345x = obj3;
                return lVar21.invokeSuspend(Unit.f186387a);
            case 21:
                l lVar22 = new l((Continuation) obj4, (x2) this.f179346y, 21);
                lVar22.f179344w = (FlowCollector) obj2;
                lVar22.f179345x = obj3;
                return lVar22.invokeSuspend(Unit.f186387a);
            case 22:
                l lVar23 = new l((Continuation) obj4, (kkf.a3) this.f179346y, 22);
                lVar23.f179344w = (FlowCollector) obj2;
                lVar23.f179345x = obj3;
                return lVar23.invokeSuspend(Unit.f186387a);
            case 23:
                l lVar24 = new l((Continuation) obj4, (d3) this.f179346y, 23);
                lVar24.f179344w = (FlowCollector) obj2;
                lVar24.f179345x = obj3;
                return lVar24.invokeSuspend(Unit.f186387a);
            case 24:
                l lVar25 = new l((Continuation) obj4, (n3) this.f179346y, 24);
                lVar25.f179344w = (FlowCollector) obj2;
                lVar25.f179345x = obj3;
                return lVar25.invokeSuspend(Unit.f186387a);
            case 25:
                l lVar26 = new l((Continuation) obj4, (p3) this.f179346y, 25);
                lVar26.f179344w = (FlowCollector) obj2;
                lVar26.f179345x = obj3;
                return lVar26.invokeSuspend(Unit.f186387a);
            case 26:
                l lVar27 = new l((Continuation) obj4, (z3) this.f179346y, 26);
                lVar27.f179344w = (FlowCollector) obj2;
                lVar27.f179345x = obj3;
                return lVar27.invokeSuspend(Unit.f186387a);
            case 27:
                l lVar28 = new l((Continuation) obj4, (q4) this.f179346y, 27);
                lVar28.f179344w = (FlowCollector) obj2;
                lVar28.f179345x = obj3;
                return lVar28.invokeSuspend(Unit.f186387a);
            case 28:
                l lVar29 = new l((Continuation) obj4, (x4) this.f179346y, 28);
                lVar29.f179344w = (FlowCollector) obj2;
                lVar29.f179345x = obj3;
                return lVar29.invokeSuspend(Unit.f186387a);
            default:
                l lVar30 = new l((Continuation) obj4, (i5) this.f179346y, 29);
                lVar30.f179344w = (FlowCollector) obj2;
                lVar30.f179345x = obj3;
                return lVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowB;
        StatementProductType statementProductType;
        i0 i0Var;
        Object orders;
        Object products;
        od0.h hVar;
        Object next;
        Flow gVar;
        Flow flowI2;
        Flow gVar2;
        go.g gVar3;
        go.g gVar4;
        List list;
        Double d;
        Flow gVar5;
        int i = this.u;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i2 = 4;
        int i3 = 8;
        int i5 = 17;
        int i6 = 19;
        int i21 = 3;
        int i22 = 2;
        Object obj3 = this.f179346y;
        i0 i0Var2 = 0;
        int i32 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f179344w;
                    akg.n nVarA = ((m) obj3).o.a();
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f179344w;
                    String str = (String) this.f179345x;
                    if (str.length() == 0) {
                        flowB = new go.g(new OnboardingInputDataValidator$ValidationState.Empty(str), 2);
                    } else {
                        sz6.a aVar3 = ((jz6.o) obj3).o;
                        String description = d0.F0(str).toString();
                        com.revolut.feature.freelancer.impl.ui.onboarding.validation.a aVar4 = (com.revolut.feature.freelancer.impl.ui.onboarding.validation.a) aVar3;
                        aVar4.getClass();
                        Intrinsics.checkNotNullParameter(description, "description");
                        flowB = rd0.e.b(aVar4.a(description, new vr6.d(description, null, null, 6)));
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f179344w;
                    Set set = (Set) this.f179345x;
                    com.revolut.feature.statements.impl.ui.savings.a aVar6 = (com.revolut.feature.statements.impl.ui.savings.a) obj3;
                    i0e.e eVar = aVar6.u;
                    List list2 = aVar6.o.f88373b;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        int i66 = k0e.k.f180035b[((pcd.b) it8.next()).ordinal()];
                        if (i66 == 1 || i66 == 2 || i66 == 3 || i66 == 4) {
                            statementProductType = StatementProductType.SAVINGS;
                        } else {
                            if (i66 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            statementProductType = StatementProductType.JOINT_SAVINGS;
                        }
                        arrayList.add(statementProductType);
                    }
                    a0 a0VarG = i0e.e.G(eVar, zhm.d0.i1(arrayList), new i0e.a(StatementPeriodType.MONTH, null), set, 8);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, a0VarG, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f179344w;
                    vkm.d dVarB = rd0.e.b(((g0) ((u) obj3).f180357p).d((Data) this.f179345x, false));
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector4, dVarB, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f179344w;
                    com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b bVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) obj3;
                    ds6.j taxType = bVar.f74306p.f74301a;
                    zjh.f fVar = bVar.f74307q;
                    vkm.d dVarX = fVar.x(taxType, loadingStrategy);
                    Intrinsics.checkNotNullParameter(taxType, "taxType");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    w2 w2Var = (w2) fVar.f322835b;
                    w2Var.getClass();
                    Intrinsics.checkNotNullParameter(taxType, "taxType");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV = nim.a.v(u0.i(dVarX, nim.a.A(w2Var.e.b(taxType, loadingStrategy), new k37.s(i32)), bVar.f74308r.j(loadingStrategy)), new k37.s(i22));
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector5, nVarV, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                k3c.f fVar2 = (k3c.f) this.f179345x;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    i0Var = fVar2.f180663a;
                    IppShopService ippShopService = ((k3c.p) obj3).f180680a;
                    Long l2 = i0Var.f111033a;
                    this.f179345x = null;
                    this.f179344w = i0Var;
                    this.v = 1;
                    orders = ippShopService.getOrders(30, l2, this);
                    if (orders == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0Var = (i0) this.f179344w;
                    yhm.o.b(obj2);
                    orders = obj2;
                }
                List list3 = (List) orders;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(mif.a.G((j3c.m) it9.next()));
                }
                d3c.h hVar2 = (d3c.h) zhm.d0.o0(arrayList2);
                if (hVar2 != null) {
                    i0Var.getClass();
                    i0Var2 = new i0(new Long(hVar2.d));
                }
                return new d3c.h0(i0Var, i0Var2, arrayList2);
            case 6:
                String str2 = (String) this.f179345x;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    od0.h hVar3 = od0.i.Companion;
                    IppShopService ippShopService2 = ((k3c.p) obj3).f180680a;
                    this.f179345x = str2;
                    this.f179344w = hVar3;
                    this.v = 1;
                    products = ippShopService2.getProducts(null, str2, this);
                    if (products == aVar10) {
                        return aVar10;
                    }
                    hVar = hVar3;
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = (od0.h) this.f179344w;
                    yhm.o.b(obj2);
                    products = obj2;
                }
                Iterator it10 = ((Iterable) products).iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (Intrinsics.f(((j3c.r) next).getProductType(), str2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                j3c.r rVar = (j3c.r) next;
                d3c.p pVarF = rVar != null ? e0.F(rVar) : null;
                hVar.getClass();
                return od0.h.a(pVarF);
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f179344w;
                    ArrayList arrayListU = w.u(kotlin.collections.d.v0((List[]) ((Object[]) this.f179345x)));
                    Object objA = arrayListU.isEmpty() ? f0.f322471a : k49.b.a(arrayListU);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (flowCollector6.emit(objA, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                k50.x4 x4Var = (k50.x4) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f179344w;
                    r4 r4Var = (r4) this.f179345x;
                    if (r4Var instanceof n4) {
                        k50.u4 u4Var = k50.x4.Companion;
                        x4Var.getClass();
                        gVar = new v1(new c7i.d0((n4) r4Var, x4Var, i0Var2, i22));
                    } else if (r4Var instanceof p4) {
                        k50.u4 u4Var2 = k50.x4.Companion;
                        x4Var.getClass();
                        gVar = new v1(new b1((p4) r4Var, x4Var, i0Var2, i32));
                    } else if (r4Var instanceof k50.q4) {
                        k50.u4 u4Var3 = k50.x4.Companion;
                        x4Var.getClass();
                        gVar = new v1(new w4(x4Var, (k50.q4) r4Var, null));
                    } else {
                        if (!(r4Var instanceof o4)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar = new go.g(null, 2);
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector7, gVar, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f179344w;
                    Pair pair = (Pair) this.f179345x;
                    e2 e2Var = (e2) pair.f186385a;
                    List list4 = (List) pair.f186386b;
                    k5e.m mVar = (k5e.m) obj3;
                    if (e2Var == null || list4.isEmpty()) {
                        flowI2 = k5e.m.I2();
                    } else {
                        List<jel.v2> list5 = list4;
                        ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                        for (jel.v2 v2Var : list5) {
                            arrayList3.add(nim.a.v(mVar.f181495r.b(v2Var.f173579a, loadingStrategy), new k5e.k(v2Var, i32)));
                        }
                        j23.b bVarK = u0.k(arrayList3);
                        ybl.b bVar2 = mVar.f181494q;
                        ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(((jel.v2) it11.next()).f173579a);
                        }
                        flowI2 = nim.a.v(u0.m(bVarK, rd0.e.b(((ael.k) bVar2).n(arrayList4, loadingStrategy))), new k1.a(mVar, e2Var, 25));
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector8, flowI2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                s sVar = (s) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f179344w;
                    vkm.d dVarB2 = rd0.e.b(((d73.l) ((l63.a) sVar.f181670p.f222642b)).a(null, b93.d.ALL));
                    h0 h0Var = h0.f322473a;
                    j23.b bVarD = yh5.b.d(nim.a.v(rd0.e.d(dVarB2, h0Var), new d27.d0(24)), nim.a.v(rd0.e.b(ue0.e.p(sVar.f181671q.b(false), h0Var)), k6a.p.f181665a));
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector9, bVarD, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                r rVar2 = (r) obj3;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f179344w;
                    s69.j jVar = (s69.j) this.f179345x;
                    Flow flowM = jVar != null ? jVar.f260172a == null ? q.m(new k0g.b(rVar2, jVar, (Continuation) i0Var2, i5)) : new ie7.h(q.q(rVar2.o.b(jVar)), jVar, 27) : vkm.i.f290039a;
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector10, flowM, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f179344w;
                    wkm.l lVarZ2 = ((gah.e) ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) obj3).u).Z2((List) this.f179345x);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector11, lVarZ2, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f179344w;
                    y yVarJ = ((com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) obj3).f89599w.j((md6.c) this.f179345x);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector12, yVarJ, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f179344w;
                    Flow gVar6 = ((j1) this.f179345x).c() ? new go.g(null, 2) : ((kkf.i) obj3).f184732n.a();
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector13, gVar6, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                kkf.q qVar = (kkf.q) obj3;
                klf.o oVar = qVar.f184894l;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f179344w;
                    Flow eVar2 = !((j1) this.f179345x).c() ? new t38.e(new kh4.f((SharedFlow) oVar.d.getValue(), qVar, i2), 24, q.Q(q.q(new iyg.b0((SharedFlow) oVar.d.getValue(), 21)), new a67.c((Continuation) i0Var2, qVar, 27)), new dqd.w(i21, i21, i0Var2)) : new go.g(f0.f322471a, 2);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector14, eVar2, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f179344w;
                    tof.d dVar = (tof.d) this.f179345x;
                    i1 i1Var = (i1) obj3;
                    wac.a aVar21 = i1Var.f184738n;
                    if (dVar == null || ((jte.d) aVar21.f295861c).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails.f84599c)) {
                        gVar2 = new go.g(f0.f322471a, 2);
                    } else {
                        String flightBookingOrderId = dVar.f272675a;
                        Intrinsics.checkNotNullParameter(flightBookingOrderId, "flightBookingOrderId");
                        w4l.i loadingStrategy2 = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                        qac.b bVar3 = aVar21.f295859a;
                        bVar3.getClass();
                        Intrinsics.checkNotNullParameter(flightBookingOrderId, "flightBookingOrderId");
                        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                        gVar2 = new kh4.f(q.Q(nim.a.v(u0.m(nim.a.v(bVar3.f244019c.a(flightBookingOrderId, loadingStrategy2), qac.a.f), rd0.e.b(zi0.c.G(nim.a.w(aVar21.f295860b.b(), new w6h.f(i5)), Boolean.FALSE))), new w6h.f(18)), new bwb.k(i21, i3, i0Var2)), i1Var, 11);
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector15, gVar2, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f179344w;
                    a3 a3Var = (a3) this.f179345x;
                    m1 m1Var = (m1) obj3;
                    if (!a3Var.N && a3Var.O) {
                        j5 j5Var = a3Var.f272605o1;
                        co3.a aVar23 = j5Var != null ? j5Var.f272859r : null;
                        String str3 = j5Var != null ? j5Var.i : null;
                        if (aVar23 == null || str3 == null) {
                            String str4 = str3;
                            if (str4 != null) {
                                CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("ID_ADDRESS", new TextLocalisedClause(R.string.common_word_address, null, null, 14), null, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
                                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                                gVar3 = new go.g(zhm.u.c(model), 2);
                            } else {
                                gVar3 = new go.g(f0.f322471a, 2);
                            }
                        } else {
                            double d5 = aVar23.f25486a;
                            double d6 = aVar23.f25487b;
                            w8 w8Var = new w8("ID_MAP_GEO_LOCATION", new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new x8(d5, d6), null, null, null, cp5.c.j(m1Var.f184820m) ? new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, new Pair(new rnf.a(d5, d6), str3), 0, 0, 62836);
                            yp0.b.l(w8Var, 0, 0, 0, 0, null, false, 63);
                            gVar3 = new go.g(zhm.u.c(w8Var), 2);
                        }
                    } else {
                        gVar3 = new go.g(f0.f322471a, 2);
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector16, gVar3, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                e84.e eVar3 = (e84.e) obj3;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f179344w;
                    Flow fVar3 = ((Boolean) this.f179345x).booleanValue() ? new kh4.f(rd0.e.b(((c61.a) eVar3.e).a()), eVar3, 13) : new go.g(null, 2);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector17, fVar3, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f179344w;
                    a3 a3Var2 = (a3) this.f179345x;
                    com.revolut.domain.interactors.transactions.a aVar26 = ((h2) obj3).f184717n;
                    i7.c cVar = i7.Companion;
                    i7[] i7VarArr = {new r9(a3Var2.f272581b), fc.b(new ba(a3Var2.f272579a))};
                    cVar.getClass();
                    y yVarE = rd0.e.e(mo3.a.g(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar26, i7.c.a(i7VarArr), null, 1, null, null, 26)), null, new kd8.f(28), 1), h0.f322473a, new i23.c(i21, i6, i0Var2));
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    q.w(flowCollector18);
                    Object objCollect = yVarE.collect(new kbb.n(flowCollector18, 26), this);
                    if (objCollect != aVar25) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar25) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f179344w;
                    String orderId = ((a3) this.f179345x).f272592g1;
                    if (orderId != null) {
                        ((v2) obj3).f184978m.getClass();
                        Intrinsics.checkNotNullParameter(orderId, "orderId");
                        gVar4 = new go.g(f0.f322471a, 2);
                    } else {
                        gVar4 = new go.g(f0.f322471a, 2);
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector19, gVar4, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                x2 x2Var = (x2) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f179344w;
                    Pair pair2 = (Pair) this.f179345x;
                    a3 a3Var3 = (a3) pair2.f186385a;
                    t3 t3Var = (t3) pair2.f186386b;
                    f4 f4Var = t3Var != null ? t3Var.d : null;
                    boolean zT = zhm.d0.T(zhm.v.k(c1.LENDING_WORKS, c1.UNKNOWN), f4Var != null ? f4Var.f : null);
                    boolean z = (f4Var != null ? f4Var.f : null) == c1.KARMA;
                    if (zT) {
                        List listK = zhm.v.k(x2Var.f185009b.c(a3Var3), new CellDetailsDelegate.Model("ID_EXTRAS_LOAN_RATE", new t0((Clause) new TextLocalisedClause(R$string.credit_transaction_detail_apr, null, null, 14), (Image) null, 0, false, 28), new TextClause(a0.d.v(new Object[]{Double.valueOf((f4Var == null || (d = f4Var.f272747b) == null) ? 0.0d : d.doubleValue())}, 1, "%.3f%%", "format(...)"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                        list = listK;
                    } else if (z) {
                        list = f0.f322471a;
                    } else {
                        List listC = zhm.u.c(x2Var.f185009b.c(a3Var3));
                        yp0.b.k(listC, 0, 0, 0, 0, 31);
                        list = listC;
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    q.w(flowCollector20);
                    Object objEmit = flowCollector20.emit(list, this);
                    Object obj4 = objEmit;
                    if (objEmit != aVar28) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar28) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                return b(obj2);
            case 23:
                return c(obj2);
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f179344w;
                    n35.b bVar4 = (n35.b) this.f179345x;
                    n3 n3Var = (n3) obj3;
                    n3Var.getClass();
                    Flow fVar4 = (bVar4.f211870a == null && bVar4.f211871b == null) ? new kh4.f((Flow) n3Var.f184840a.e.getValue(), n3Var, i6) : new go.g(f0.f322471a, 2);
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector21, fVar4, this) == aVar29) {
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
                return n(obj2);
            case 26:
                return o(obj2);
            case 27:
                return p(obj2);
            case 28:
                return s(obj2);
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f179344w;
                    a3 a3Var4 = (a3) this.f179345x;
                    i5 i5Var = (i5) obj3;
                    i5Var.getClass();
                    p6 p6Var = a3Var4.A.f272780b;
                    if (k71.k.h1(a3Var4)) {
                        String str5 = p6Var != null ? p6Var.f272991a : null;
                        if (str5 == null || d0.W(str5)) {
                            boolean zO = i5Var.f184750q.O();
                            CellDetailsNoteDelegate.Model model2 = new CellDetailsNoteDelegate.Model("ID_REV_PAY_AUTH_LINKED_ON_INFO", new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_state_linked_on, null, null, 14), new yy0.h(new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_state_linked_on_info, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, null, false, null, new TimeClause(a3Var4.f272593h.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), com.revolut.core.ui_kit.delegates.r2.f54655a, null, null, 0, 130288);
                            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                            CellDetailsActionDelegate.Model model3 = new CellDetailsActionDelegate.Model("ID_REV_PAY_AUTH_PAYMENT_FROM", new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_state_payment_from, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_revolut, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_rev_pay_auth_source, null, null, 14), null, false, zO, aw0.u0.LARGE, null, null, 0, 0, 0, 0, 4193892);
                            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                            gVar5 = new go.g(zhm.v.k(model2, model3), 2);
                        } else {
                            gVar5 = new c0(q.Q(i5Var.f184748n.a(), new k25.o(i0Var2, i5Var, p6Var, 7)), i5Var, a3Var4, p6Var, 13);
                        }
                    } else {
                        gVar5 = new go.g(f0.f322471a, 2);
                    }
                    this.f179344w = null;
                    this.f179345x = null;
                    this.v = 1;
                    if (q.u(flowCollector22, gVar5, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f179346y = obj2;
    }
}
