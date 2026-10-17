package a32;

import bn2.e0;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import e0f.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k4l.q0;
import k4l.r0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f1013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1015y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f1015y = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r12 == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.v
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r12)
            r10 = r11
            goto L61
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object r1 = r11.z
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            yhm.o.b(r12)
            r10 = r11
            goto L46
        L23:
            yhm.o.b(r12)
            kotlinx.coroutines.flow.FlowCollector r1 = r11.f1013w
            java.lang.Object r12 = r11.f1014x
            r6 = r12
            zb7.c r6 = (zb7.c) r6
            java.lang.Object r12 = r11.f1015y
            r5 = r12
            cc7.h r5 = (cc7.h) r5
            r11.f1013w = r4
            r11.f1014x = r4
            r11.z = r1
            r11.v = r3
            zhm.h0 r7 = zhm.h0.f322473a
            r8 = 0
            r9 = 0
            r10 = r11
            java.lang.Object r12 = r5.e3(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L46
            goto L60
        L46:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            r10.f1013w = r4
            r10.f1014x = r4
            r10.z = r4
            r10.v = r2
            vkm.q.w(r1)
            java.lang.Object r1 = r1.emit(r12, r11)
            if (r1 != r0) goto L5a
            goto L5b
        L5a:
            r1 = r12
        L5b:
            if (r1 != r0) goto L5e
            r12 = r1
        L5e:
            if (r12 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.b.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f1015y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f1013w;
            sfm.b bVar = new sfm.b(aVar.u.E(aVar.o.f80813b), new zjh.c(new a26.s(aVar, (io3.d) this.z, 12)), 2);
            Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
            jhi.k kVarU = nim.a.u(new cea.v(aVar, null, 0), rd0.e.b(bVar));
            this.f1013w = null;
            this.f1014x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, kVarU, this) == aVar2) {
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

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f1013w;
            Pair pair = (Pair) this.f1014x;
            bfl.g tradeSide = (bfl.g) pair.f186385a;
            r0 orderType = (r0) pair.f186386b;
            com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f1015y;
            vrl.c cVar = eVar.f106925q;
            UUID tradingAccountId = eVar.p0;
            String securityRef = eVar.f106923o0;
            q0 timeInForce = (q0) this.z;
            String idempotencyKey = ((cul.v) ((j2) eVar.m0.f22677a).getValue()).f109177c;
            vrl.e eVar2 = (vrl.e) cVar;
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            Intrinsics.checkNotNullParameter(securityRef, "securityRef");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Flow flowH = xam.a.h(new sxg.h(1, eVar2, securityRef, tradeSide, timeInForce, idempotencyKey, orderType, null), vkm.q.q(nim.a.v(eVar2.e(tradingAccountId, loadingStrategy), new vq0.g(14))));
            this.f1013w = null;
            this.f1014x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowH, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (vkm.q.u(r8, r2, r7) != r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1015y
            d3d.g r0 = (d3d.g) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r8)
            goto L77
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r0 = r7.z
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r8)
            goto L44
        L25:
            yhm.o.b(r8)
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f1013w
            java.lang.Object r2 = r7.f1014x
            java.util.List r2 = (java.util.List) r2
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L4e
            r7.f1013w = r5
            r7.f1014x = r5
            r7.z = r8
            r7.v = r4
            java.lang.Object r0 = d3d.g.b(r0, r7)
            if (r0 != r1) goto L43
            goto L76
        L43:
            r0 = r8
        L44:
            zhm.f0 r8 = zhm.f0.f322471a
            go.g r2 = new go.g
            r4 = 2
            r2.<init>(r8, r4)
            r8 = r0
            goto L68
        L4e:
            java.lang.Object r6 = zhm.d0.b0(r2)
            z3d.c r6 = (z3d.c) r6
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = zhm.d0.V(r2, r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4 = 2147483646(0x7ffffffe, float:NaN)
            java.util.List r2 = zhm.d0.V0(r2, r4)
            r4 = 0
            ard.c0 r2 = d3d.g.a(r0, r6, r2, r4)
        L68:
            r7.f1013w = r5
            r7.f1014x = r5
            r7.z = r5
            r7.v = r3
            java.lang.Object r8 = vkm.q.u(r8, r2, r7)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.b.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2) {
        Flow gVar;
        List list = (List) this.f1015y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f1013w;
            List list2 = (List) this.f1014x;
            if (list2.isEmpty() || list.isEmpty()) {
                gVar = new go.g(f0.f322471a, 2);
            } else {
                z3d.c cVar = (z3d.c) d0.b0(list2);
                d3d.g gVar2 = (d3d.g) this.z;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!Intrinsics.f(((SharedConverterItem) obj3).f86893b, cVar.f319249b.f115083b)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(ifk.b.J((SharedConverterItem) it8.next()));
                }
                gVar = d3d.g.a(gVar2, cVar, arrayList2, true);
            }
            this.f1013w = null;
            this.f1014x = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (vkm.q.u(r1, r8, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r8)
            goto L7d
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            java.lang.Object r1 = r7.z
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            yhm.o.b(r8)
            goto L64
        L21:
            yhm.o.b(r8)
            kotlinx.coroutines.flow.FlowCollector r1 = r7.f1013w
            java.lang.Object r8 = r7.f1014x
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r5 = r8.f186385a
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.f186386b
            wd6.i r8 = (wd6.i) r8
            if (r5 == 0) goto L68
            int[] r6 = d7j.t0.f112056b
            int r8 = r8.ordinal()
            r8 = r6[r8]
            if (r8 == r3) goto L51
            if (r8 == r2) goto L4a
            r3 = 3
            if (r8 != r3) goto L44
            goto L4a
        L44:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L4a:
            go.g r8 = new go.g
            r3 = 2
            r8.<init>(r4, r3)
            goto L66
        L51:
            java.lang.Object r8 = r7.f1015y
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r8 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) r8
            r7.f1013w = r4
            r7.f1014x = r4
            r7.z = r1
            r7.v = r3
            java.lang.Object r8 = com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.L2(r8, r5, r7)
            if (r8 != r0) goto L64
            goto L7c
        L64:
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
        L66:
            if (r8 != 0) goto L6e
        L68:
            go.g r8 = new go.g
            r3 = 2
            r8.<init>(r4, r3)
        L6e:
            r7.f1013w = r4
            r7.f1014x = r4
            r7.z = r4
            r7.v = r2
            java.lang.Object r8 = vkm.q.u(r1, r8, r7)
            if (r8 != r0) goto L7d
        L7c:
            return r0
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.b.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f1013w;
            vkm.y yVarC = ((djc.b0) this.f1015y).f115292r.c((RentAndBillsLinkedPayments) this.f1014x, (w4l.k) this.z);
            this.f1013w = null;
            this.f1014x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, yVarC, this) == aVar) {
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

    private final Object u(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f1013w;
            boolean zBooleanValue = ((Boolean) this.f1014x).booleanValue();
            vkm.d dVarF = ((hve.o) ((r1) this.f1015y).f121679a).f((yte.n) this.z, zBooleanValue, w4l.h.f294642c, null);
            this.f1013w = null;
            this.f1014x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarF, this) == aVar) {
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

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.f1013w;
            jhi.k kVarI = ((d4f.p) ((e4b.q) this.f1015y).o).i(new z2f.c((String) this.z), w4l.i.f294643c);
            this.f1013w = null;
            this.f1014x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, kVarI, this) == aVar) {
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
                b bVar = new b((Continuation) obj4, (f) this.f1015y, (z22.a) this.z, 0);
                bVar.f1013w = flowCollector;
                bVar.f1014x = obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b((Continuation) obj4, (a5h.f) this.f1015y, (nel.n) this.z, 1);
                bVar2.f1013w = flowCollector;
                bVar2.f1014x = obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                b bVar3 = new b((Continuation) obj4, (a89.a) this.f1015y, (ProductAccountId) this.z, 2);
                bVar3.f1013w = flowCollector;
                bVar3.f1014x = obj3;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 3:
                b bVar4 = new b((Continuation) obj4, (kc8.a) this.f1015y, (ag8.e) this.z, 3);
                bVar4.f1013w = flowCollector;
                bVar4.f1014x = obj3;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar5 = new b((Continuation) obj4, (Function1) this.f1015y, (vga.g) this.z, 4);
                bVar5.f1013w = flowCollector;
                bVar5.f1014x = obj3;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar6 = new b((Continuation) obj4, (amh.x) this.f1015y, (ylh.e) this.z, 5);
                bVar6.f1013w = flowCollector;
                bVar6.f1014x = obj3;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar7 = new b((Continuation) obj4, (com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) this.f1015y, (BiometricVerificationNfcFlowContract$AuthData.ICAO) this.z, 6);
                bVar7.f1013w = flowCollector;
                bVar7.f1014x = obj3;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar8 = new b((Continuation) obj4, (b0a.k) this.f1015y, (zm3.a) this.z, 7);
                bVar8.f1013w = flowCollector;
                bVar8.f1014x = obj3;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar9 = new b((Continuation) obj4, (bd7.c) this.f1015y, (String) this.z, 8);
                bVar9.f1013w = flowCollector;
                bVar9.f1014x = obj3;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar10 = new b((Continuation) obj4, (Set) this.f1015y, (bn2.p) this.z, 9);
                bVar10.f1013w = flowCollector;
                bVar10.f1014x = obj3;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar11 = new b((Continuation) obj4, (bn2.p) this.f1015y, (BackgroundKey) this.z, 10);
                bVar11.f1013w = flowCollector;
                bVar11.f1014x = obj3;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar12 = new b((Continuation) obj4, (bn2.u) this.f1015y, (List) this.z, 11);
                bVar12.f1013w = flowCollector;
                bVar12.f1014x = obj3;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar13 = new b((Continuation) obj4, (e0) this.f1015y, (List) this.z, 12);
                bVar13.f1013w = flowCollector;
                bVar13.f1014x = obj3;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar14 = new b((Continuation) obj4, (BackgroundKey) this.f1015y, (e0) this.z, 13);
                bVar14.f1013w = flowCollector;
                bVar14.f1014x = obj3;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar15 = new b((Continuation) obj4, (List) this.f1015y, (bnh.n) this.z, 14);
                bVar15.f1013w = flowCollector;
                bVar15.f1014x = obj3;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar16 = new b((Continuation) obj4, (r10.r) this.f1015y, (String) this.z, 15);
                bVar16.f1013w = flowCollector;
                bVar16.f1014x = obj3;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar17 = new b((Continuation) obj4, (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a) this.f1015y, (ManualTransferData) this.z, 16);
                bVar17.f1013w = flowCollector;
                bVar17.f1014x = obj3;
                return bVar17.invokeSuspend(Unit.f186387a);
            case 17:
                b bVar18 = new b((Function1) this.f1015y, (tji.f) this.z, this.f1013w, (Continuation) obj4);
                bVar18.f1014x = (Throwable) obj3;
                return bVar18.invokeSuspend(Unit.f186387a);
            case 18:
                b bVar19 = new b((Continuation) obj4, (c6b.i) this.f1015y, (w4l.k) this.z, 18);
                bVar19.f1013w = flowCollector;
                bVar19.f1014x = obj3;
                return bVar19.invokeSuspend(Unit.f186387a);
            case 19:
                b bVar20 = new b((Continuation) obj4, (sak.a) this.f1015y, (cbk.o) this.z, 19);
                bVar20.f1013w = flowCollector;
                bVar20.f1014x = obj3;
                return bVar20.invokeSuspend(Unit.f186387a);
            case 20:
                b bVar21 = new b((Continuation) obj4, (cc7.h) this.f1015y, 20);
                bVar21.f1013w = flowCollector;
                bVar21.f1014x = obj3;
                return bVar21.invokeSuspend(Unit.f186387a);
            case 21:
                b bVar22 = new b((Continuation) obj4, (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) this.f1015y, (io3.d) this.z, 21);
                bVar22.f1013w = flowCollector;
                bVar22.f1014x = obj3;
                return bVar22.invokeSuspend(Unit.f186387a);
            case 22:
                b bVar23 = new b((Continuation) obj4, (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f1015y, (q0) this.z, 22);
                bVar23.f1013w = flowCollector;
                bVar23.f1014x = obj3;
                return bVar23.invokeSuspend(Unit.f186387a);
            case 23:
                b bVar24 = new b((Continuation) obj4, (d3d.g) this.f1015y, 23);
                bVar24.f1013w = flowCollector;
                bVar24.f1014x = obj3;
                return bVar24.invokeSuspend(Unit.f186387a);
            case 24:
                b bVar25 = new b((Continuation) obj4, (List) this.f1015y, (d3d.g) this.z, 24);
                bVar25.f1013w = flowCollector;
                bVar25.f1014x = obj3;
                return bVar25.invokeSuspend(Unit.f186387a);
            case 25:
                b bVar26 = new b((Continuation) obj4, (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f1015y, 25);
                bVar26.f1013w = flowCollector;
                bVar26.f1014x = obj3;
                return bVar26.invokeSuspend(Unit.f186387a);
            case 26:
                b bVar27 = new b((Continuation) obj4, (djc.b0) this.f1015y, (w4l.k) this.z, 26);
                bVar27.f1013w = flowCollector;
                bVar27.f1014x = obj3;
                return bVar27.invokeSuspend(Unit.f186387a);
            case 27:
                b bVar28 = new b((Continuation) obj4, (r1) this.f1015y, (yte.n) this.z, 27);
                bVar28.f1013w = flowCollector;
                bVar28.f1014x = obj3;
                return bVar28.invokeSuspend(Unit.f186387a);
            case 28:
                b bVar29 = new b((Continuation) obj4, (e4b.q) this.f1015y, (String) this.z, 28);
                bVar29.f1013w = flowCollector;
                bVar29.f1014x = obj3;
                return bVar29.invokeSuspend(Unit.f186387a);
            default:
                b bVar30 = new b((Continuation) obj4, (eg0.h) this.f1015y, (String) this.z, 29);
                bVar30.f1013w = flowCollector;
                bVar30.f1014x = obj3;
                return bVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x048f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.f1015y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, tji.f fVar, FlowCollector flowCollector, Continuation continuation) {
        super(3, continuation);
        this.u = 17;
        this.f1015y = function1;
        this.z = fVar;
        this.f1013w = flowCollector;
    }
}
