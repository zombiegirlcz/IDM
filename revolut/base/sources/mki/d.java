package mki;

import aii.o;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.kompot.common.ActionBreadcrumb;
import efm.r;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nyb.q;
import om4.x2;
import r38.l;
import tjh.h0;
import vf0.n;
import vge.r0;
import vge.t0;
import w2a.s;
import wdb.w;
import wf0.a0;
import wf0.k0;
import zhm.d0;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function3 {
    public Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f206464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f206465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f206466y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, Function2 function2, aii.a aVar, ActionBreadcrumb actionBreadcrumb, Continuation continuation) {
        super(3, continuation);
        this.u = 0;
        this.f206465x = oVar;
        this.f206466y = function2;
        this.z = aVar;
        this.A = actionBreadcrumb;
    }

    private final Object b(Object obj2) {
        Flow flowV;
        t0 t0Var = (t0) this.A;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f206464w;
            xi0.b bVar = (xi0.b) this.f206465x;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f206466y;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!Intrinsics.f((xi0.b) entry.getValue(), bVar)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                xi0.b bVar2 = (xi0.b) entry2.getValue();
                Intrinsics.h(bVar);
                linkedHashMap3.put(key, new Pair(bVar2, bVar));
            }
            if (linkedHashMap3.isEmpty()) {
                Intrinsics.h(bVar);
                flowV = zi0.c.i(new r0(bVar, zhm.r0.g(), zhm.r0.g()));
            } else {
                r rVarB = ((sfe.a) this.z) == sfe.a.CACHE_ONLY ? t0Var.f289006b.b(d0.d1(d0.i1(linkedHashMap3.values())), false) : t0Var.f289006b.d(d0.d1(d0.i1(linkedHashMap3.values())), age.c.f4818a);
                f0 f0Var = f0.f322471a;
                t0Var.getClass();
                r map = rVarB.map(new n(new sx4.b(f0Var, 9), 25));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                flowV = nim.a.v(rd0.e.b(map), new q(bVar, linkedHashMap3, 24));
            }
            this.f206464w = null;
            this.f206465x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowV, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (skm.k0.b(200, r10) == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (vkm.q.u(r7, r11, r10) != r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f206466y
            w2a.s r0 = (w2a.s) r0
            q9i.d r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2c
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r11)
            goto Lb0
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            java.lang.Object r3 = r10.A
            w2a.h r3 = (w2a.h) r3
            java.lang.Object r7 = r10.z
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            yhm.o.b(r11)
            goto L60
        L2c:
            yhm.o.b(r11)
            java.lang.Object r11 = r10.f206464w
            r7 = r11
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r11 = r10.f206465x
            r3 = r11
            w2a.i r3 = (w2a.i) r3
            boolean r11 = r3 instanceof w2a.g
            if (r11 == 0) goto L46
            w2a.g r3 = (w2a.g) r3
            java.lang.String r11 = r3.f293989a
            efm.r r11 = r1.a(r11)
            goto L9b
        L46:
            boolean r11 = r3 instanceof w2a.h
            if (r11 == 0) goto Lb3
            r10.f206464w = r6
            r10.f206465x = r6
            r10.z = r7
            r11 = r3
            w2a.h r11 = (w2a.h) r11
            r10.A = r11
            r10.v = r5
            r8 = 200(0xc8, double:9.9E-322)
            java.lang.Object r11 = skm.k0.b(r8, r10)
            if (r11 != r2) goto L60
            goto Laf
        L60:
            w2a.h r3 = (w2a.h) r3
            java.lang.String r11 = r3.f293990a
            boolean r11 = kotlin.text.d0.W(r11)
            if (r11 == 0) goto L7f
            cli.y r11 = r0.f294007r
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            w2a.j r11 = (w2a.j) r11
            i9i.e r11 = r11.d
            java.lang.String r11 = r11.f159882a
            efm.r r11 = r1.a(r11)
            goto L9b
        L7f:
            java.lang.String r11 = r3.f293990a
            r1.getClass()
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            n9i.f r1 = r1.f243910a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            w4l.f r0 = r1.e
            n9i.d r1 = r1.f213657a
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r11)
            efm.r r11 = r0.f(r3, r5)
        L9b:
            vkm.d r11 = rd0.e.b(r11)
            r10.f206464w = r6
            r10.f206465x = r6
            r10.z = r6
            r10.A = r6
            r10.v = r4
            java.lang.Object r11 = vkm.q.u(r7, r11, r10)
            if (r11 != r2) goto Lb0
        Laf:
            return r2
        Lb0:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lb3:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mki.d.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        BigDecimal bigDecimal;
        Object obj3;
        com.revolut.feature.retail.cfd.impl.screens.margin.a aVar = (com.revolut.feature.retail.cfd.impl.screens.margin.a) this.f206466y;
        w3b.e eVar = aVar.f82231r;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f206464w;
            CfdOpenPositionsDelegate$OpenPositions cfdOpenPositionsDelegate$OpenPositions = (CfdOpenPositionsDelegate$OpenPositions) this.f206465x;
            t2b.f fVar = aVar.f82233t;
            f8l.e eVarB = u2b.c.b(eVar.f.getF82228b());
            String str = eVar.f294260c;
            nel.n nVar = (nel.n) this.z;
            bfl.g gVar = ((w3b.f) this.A).f294261a;
            BigDecimal bigDecimal2 = cfdOpenPositionsDelegate$OpenPositions.f82237a;
            BigDecimal bigDecimal3 = cfdOpenPositionsDelegate$OpenPositions.f82238b;
            BigDecimal bigDecimal4 = eVar.d;
            CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType = eVar.f;
            BigDecimal bigDecimal5 = null;
            if (cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.equals(CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Market.f82225a)) {
                obj3 = null;
            } else {
                if (cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType instanceof CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Limit) {
                    bigDecimal = ((CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Limit) eVar.f).f82223a.f126703a;
                } else {
                    if (!(cfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType instanceof CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Stop)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimal = ((CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Stop) eVar.f).f82227a.f126703a;
                }
                bigDecimal5 = bigDecimal;
                obj3 = null;
            }
            Flow flowA = fVar.a(eVarB, str, nVar, gVar, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5);
            this.f206464w = obj3;
            this.f206465x = obj3;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowA, this) == aVar2) {
                return aVar2;
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
            FlowCollector flowCollector = (FlowCollector) this.f206464w;
            Flow flowJ = ((Boolean) this.f206465x).booleanValue() ? ((w57.b) this.f206466y).j((String) this.z, (String) this.A) : org.bouncycastle.jcajce.provider.digest.a.s(3, null);
            this.f206464w = null;
            this.f206465x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowJ, this) == aVar) {
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
        Flow gVar;
        w wVar = (w) this.f206466y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f206464w;
            Data data = (Data) this.f206465x;
            if (w.a(wVar, data)) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "RestaurantsPocketInteractor", "Selected pocket is no longer available; loading the default pocket", null, null, 16);
                gVar = wVar.c((Reservation.Guarantee.Order) this.z, (dj0.d) this.A);
            } else {
                gVar = new go.g(data, 2);
            }
            this.f206464w = null;
            this.f206465x = null;
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
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                d dVar = new d((o) this.f206465x, (Function2) this.f206466y, (aii.a) this.z, (ActionBreadcrumb) this.A, (Continuation) obj4);
                dVar.f206464w = (Throwable) obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                d dVar2 = new d((Continuation) obj4, (nj8.n) this.f206466y, (String) this.z, (w4l.k) this.A, 1);
                dVar2.f206464w = flowCollector;
                dVar2.f206465x = obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
            case 2:
                d dVar3 = new d((Continuation) obj4, (nn8.g) this.f206466y, (String) this.z);
                dVar3.f206464w = flowCollector;
                dVar3.f206465x = obj3;
                return dVar3.invokeSuspend(Unit.f186387a);
            case 3:
                d dVar4 = new d((Continuation) obj4, (x2) this.f206466y, (String) this.z, (w4l.k) this.A, 3);
                dVar4.f206464w = flowCollector;
                dVar4.f206465x = obj3;
                return dVar4.invokeSuspend(Unit.f186387a);
            case 4:
                d dVar5 = new d((Continuation) obj4, (Data) this.f206466y, (x2) this.z, (String) this.A, 4);
                dVar5.f206464w = flowCollector;
                dVar5.f206465x = obj3;
                return dVar5.invokeSuspend(Unit.f186387a);
            case 5:
                d dVar6 = new d((Continuation) obj4, (pc7.d) this.f206466y, (String) this.z, (String) this.A, 5);
                dVar6.f206464w = flowCollector;
                dVar6.f206465x = obj3;
                return dVar6.invokeSuspend(Unit.f186387a);
            case 6:
                d dVar7 = new d((String) this.f206466y, (String) this.z, (Continuation) obj4, (qej.e) this.A);
                dVar7.f206465x = flowCollector;
                dVar7.f206464w = (Throwable) obj3;
                return dVar7.invokeSuspend(Unit.f186387a);
            case 7:
                d dVar8 = new d((Continuation) obj4, (l) this.f206466y, (w4l.k) this.z, (Set) this.A, 7);
                dVar8.f206464w = flowCollector;
                dVar8.f206465x = obj3;
                return dVar8.invokeSuspend(Unit.f186387a);
            case 8:
                d dVar9 = new d((Continuation) obj4, (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) this.f206466y, 8);
                dVar9.f206464w = flowCollector;
                dVar9.f206465x = obj3;
                return dVar9.invokeSuspend(Unit.f186387a);
            case 9:
                d dVar10 = new d((Continuation) obj4, (String) this.f206466y, (rbh.r) this.z, (xi0.b) this.A, 9);
                dVar10.f206464w = flowCollector;
                dVar10.f206465x = obj3;
                return dVar10.invokeSuspend(Unit.f186387a);
            case 10:
                d dVar11 = new d((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.invoice.list.a) this.f206466y, 10);
                dVar11.f206464w = flowCollector;
                dVar11.f206465x = obj3;
                return dVar11.invokeSuspend(Unit.f186387a);
            case 11:
                d dVar12 = new d((Continuation) obj4, (spb.k) this.f206466y, (String) this.z, (dsh.e) this.A, 11);
                dVar12.f206464w = flowCollector;
                dVar12.f206465x = obj3;
                return dVar12.invokeSuspend(Unit.f186387a);
            case 12:
                d dVar13 = new d((Continuation) obj4, (t28.e) this.f206466y, (dsh.e) this.z, (String) this.A, 12);
                dVar13.f206464w = flowCollector;
                dVar13.f206465x = obj3;
                return dVar13.invokeSuspend(Unit.f186387a);
            case 13:
                d dVar14 = new d((Continuation) obj4, (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.f206466y, (LinkedHashMap) this.z, (List) this.A, 13);
                dVar14.f206464w = flowCollector;
                dVar14.f206465x = obj3;
                return dVar14.invokeSuspend(Unit.f186387a);
            case 14:
                d dVar15 = new d((Continuation) obj4, (tdc.r) this.f206466y, (dj0.d) this.z, (q6c.h) this.A, 14);
                dVar15.f206464w = flowCollector;
                dVar15.f206465x = obj3;
                return dVar15.invokeSuspend(Unit.f186387a);
            case 15:
                d dVar16 = new d((Continuation) obj4, (tdj.c) this.f206466y, (xi0.b) this.z, (xi0.b) this.A, 15);
                dVar16.f206464w = flowCollector;
                dVar16.f206465x = obj3;
                return dVar16.invokeSuspend(Unit.f186387a);
            case 16:
                d dVar17 = new d((Continuation) obj4, (h0) this.f206466y, (String) this.z, (Flow) this.A, 16);
                dVar17.f206464w = flowCollector;
                dVar17.f206465x = obj3;
                return dVar17.invokeSuspend(Unit.f186387a);
            case 17:
                d dVar18 = new d((Continuation) obj4, (u57.b) this.f206466y, (String) this.z, (String) this.A, 17);
                dVar18.f206464w = flowCollector;
                dVar18.f206465x = obj3;
                return dVar18.invokeSuspend(Unit.f186387a);
            case 18:
                d dVar19 = new d((Continuation) obj4, (ubd.i) this.f206466y, (lcd.q) this.z, (w4l.k) this.A, 18);
                dVar19.f206464w = flowCollector;
                dVar19.f206465x = obj3;
                return dVar19.invokeSuspend(Unit.f186387a);
            case 19:
                d dVar20 = new d((Continuation) obj4, (ubd.i) this.f206466y, (String) this.z, (w4l.k) this.A, 19);
                dVar20.f206464w = flowCollector;
                dVar20.f206465x = obj3;
                return dVar20.invokeSuspend(Unit.f186387a);
            case 20:
                d dVar21 = new d((Continuation) obj4, this.f206466y, 20);
                dVar21.f206464w = flowCollector;
                dVar21.f206465x = obj3;
                return dVar21.invokeSuspend(Unit.f186387a);
            case 21:
                d dVar22 = new d((Continuation) obj4, (Function3) this.f206466y, (Function0) this.z, (Function1) this.A, 21);
                dVar22.f206464w = flowCollector;
                dVar22.f206465x = obj3;
                return dVar22.invokeSuspend(Unit.f186387a);
            case 22:
                d dVar23 = new d((Continuation) obj4, (uh7.c) this.f206466y, (String) this.z, (dsh.e) this.A, 22);
                dVar23.f206464w = flowCollector;
                dVar23.f206465x = obj3;
                return dVar23.invokeSuspend(Unit.f186387a);
            case 23:
                d dVar24 = new d((Continuation) obj4, (uh7.j) this.f206466y, (dsh.e) this.z, (String) this.A, 23);
                dVar24.f206464w = flowCollector;
                dVar24.f206465x = obj3;
                return dVar24.invokeSuspend(Unit.f186387a);
            case 24:
                d dVar25 = new d((Continuation) obj4, (LinkedHashMap) this.f206466y, (sfe.a) this.z, (t0) this.A, 24);
                dVar25.f206464w = flowCollector;
                dVar25.f206465x = obj3;
                return dVar25.invokeSuspend(Unit.f186387a);
            case 25:
                d dVar26 = new d((Continuation) obj4, (s) this.f206466y, 25);
                dVar26.f206464w = flowCollector;
                dVar26.f206465x = obj3;
                return dVar26.invokeSuspend(Unit.f186387a);
            case 26:
                d dVar27 = new d((Continuation) obj4, (com.revolut.feature.retail.cfd.impl.screens.margin.a) this.f206466y, (nel.n) this.z, (w3b.f) this.A, 26);
                dVar27.f206464w = flowCollector;
                dVar27.f206465x = obj3;
                return dVar27.invokeSuspend(Unit.f186387a);
            case 27:
                d dVar28 = new d((Continuation) obj4, (w57.b) this.f206466y, (String) this.z, (String) this.A, 27);
                dVar28.f206464w = flowCollector;
                dVar28.f206465x = obj3;
                return dVar28.invokeSuspend(Unit.f186387a);
            case 28:
                d dVar29 = new d((Continuation) obj4, (w) this.f206466y, (Reservation.Guarantee.Order) this.z, (dj0.d) this.A, 28);
                dVar29.f206464w = flowCollector;
                dVar29.f206465x = obj3;
                return dVar29.invokeSuspend(Unit.f186387a);
            default:
                d dVar30 = new d((Continuation) obj4, (a0) this.f206466y, (String) this.z, (k0) this.A, 29);
                dVar30.f206464w = flowCollector;
                dVar30.f206465x = obj3;
                return dVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:474:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v133 */
    /* JADX WARN: Type inference failed for: r3v134 */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v136 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88, types: [com.revolut.data.model.Data] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v135 */
    /* JADX WARN: Type inference failed for: r4v136 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v139 */
    /* JADX WARN: Type inference failed for: r4v140 */
    /* JADX WARN: Type inference failed for: r4v141 */
    /* JADX WARN: Type inference failed for: r4v142 */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mki.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, Continuation continuation, qej.e eVar) {
        super(3, continuation);
        this.u = 6;
        this.f206466y = str;
        this.z = str2;
        this.A = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f206466y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Continuation continuation, Object obj2, Object obj3, Object obj4, int i) {
        super(3, continuation);
        this.u = i;
        this.f206466y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, nn8.g gVar, String str) {
        super(3, continuation);
        this.u = 2;
        this.f206466y = gVar;
        this.z = str;
    }
}
