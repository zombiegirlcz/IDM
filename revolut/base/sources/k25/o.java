package k25;

import com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource;
import com.revolut.data.model.Data;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$InputData;
import e7l.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kkf.d1;
import kkf.i5;
import kkf.n4;
import kkf.t6;
import kkf.x4;
import kkf.z3;
import kkf.z4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import ks8.j;
import lk6.b0;
import m1c.s0;
import m1c.u0;
import m1c.v0;
import m1c.w0;
import mif.e0;
import n09.y;
import n09.z;
import nel.k0;
import nel.l0;
import nel.m0;
import om4.c0;
import sx2.x;
import tof.p6;
import vkm.v1;
import zh9.u0;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f180341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f180342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f180343y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f180343y = obj2;
    }

    private final Object b(Object obj2) throws Throwable {
        nmh.a aVar = (nmh.a) this.z;
        mmh.n nVar = (mmh.n) this.f180343y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            boolean zBooleanValue = ((Boolean) this.f180342x).booleanValue();
            ybl.b bVar = nVar.f207237a;
            vkm.d dVarB = rd0.e.b(((ael.k) bVar).m(new m0.a(new l0(new k0.b(0), 2)), w4l.h.f294642c, new a26.s(nVar, aVar, 26)));
            this.f180341w = null;
            this.f180342x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objCollect = dVarB.collect(new ayf.g(flowCollector, aVar, zBooleanValue, 3), this);
            if (objCollect != aVar2) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != aVar2) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar2) {
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

    private final Object c(Object obj2) throws Throwable {
        boolean z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            ArrayList arrayList = (ArrayList) this.f180343y;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (true) {
                boolean z3 = false;
                z = false;
                if (!it8.hasNext()) {
                    break;
                }
                z zVar = (z) it8.next();
                y yVar = zVar instanceof y ? (y) zVar : null;
                u09.v vVar = yVar != null ? yVar.f210971a : null;
                n09.m0 m0Var = (n09.m0) this.z;
                g09.a aVar2 = m0Var.f210959r;
                if (!m0Var.f210961t && vVar == null) {
                    z3 = true;
                }
                arrayList2.add(new lkf.v(rd0.e.b(aVar2.f139371a.d.f(new a09.g(vVar), z3)), zVar, 27));
            }
            Flow[] flowArr = (Flow[]) d0.d1(arrayList2).toArray(new Flow[0]);
            this.f180341w = null;
            this.f180342x = null;
            this.v = 1;
            vkm.q.w(flowCollector);
            Object objG = e0.g(this, new h52.c(flowArr, 21), new imh.y(3, 12, z ? 1 : 0), flowCollector, flowArr);
            fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
            Object obj3 = objG;
            if (objG != aVar3) {
                obj3 = Unit.f186387a;
            }
            if (obj3 != aVar3) {
                obj3 = Unit.f186387a;
            }
            if (obj3 == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r12 == r3) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n4d.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k25.o.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        String str = (String) this.z;
        n78.c cVar = (n78.c) this.f180343y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            w4l.k kVar = (w4l.k) this.f180342x;
            vkm.d dVarB = rd0.e.b(pd.b.r(osg.b.a(cVar.f213035a, str, Intrinsics.f(kVar, w4l.i.f294643c), 4), new a9j.n(cVar, 10, str, kVar)));
            this.f180341w = null;
            this.f180342x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
        Flow flowI;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            ks8.j jVar = (ks8.j) this.f180342x;
            if (jVar instanceof ks8.i) {
                flowI = zi0.c.i(r0.g());
            } else {
                if (!Intrinsics.f(jVar, j.a.f189313a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ndh.d dVar = (ndh.d) this.z;
                List list = (List) this.f180343y;
                if (list.isEmpty()) {
                    flowI = zi0.c.i(r0.g());
                } else {
                    ik3.c cVar = (ik3.c) dVar.f214371a;
                    g.b bVar = g.b.f123407a;
                    w4l.h hVar = w4l.h.f294642c;
                    flowI = nim.a.v(u0.m(rd0.e.b(cVar.l(bVar, hVar)), rd0.e.b(osg.b.g(dVar.f214373c, hVar, io3.l.CURRENT, null, io3.i.INTERNAL, null, null, null, 116))), new lsl.d(list, 27));
                }
            }
            this.f180341w = null;
            this.f180342x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, flowI, this) == aVar) {
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
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar2 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) this.f180343y;
            qrk.b bVar = aVar2.f103969p;
            StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = aVar2.o;
            efm.r rVarDistinctUntilChanged = bVar.b(stockFinancialsStatementsControllerContract$InputData.f103962a, stockFinancialsStatementsControllerContract$InputData.f103963b, (uqk.e) this.z).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            vkm.d dVarB = rd0.e.b(rVarDistinctUntilChanged);
            this.f180341w = null;
            this.f180342x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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

    private final Object t(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            w4l.k loadingStrategy = (w4l.k) this.f180342x;
            jul.o oVar = ((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f180343y).f81793p;
            String inviteId = (String) this.z;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(inviteId, "inviteId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            gxa.c cVar = (gxa.c) oVar.f178695b;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(inviteId, "inviteId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            vkm.d dVarB = cVar.e.b(inviteId, loadingStrategy);
            this.f180341w = null;
            this.f180342x = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
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
        RevPointsOptInSource revPointsOptInSource;
        go.g gVar;
        Flow flowV;
        v0 v0Var = (v0) this.z;
        nyb.v vVar = (nyb.v) this.f180343y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            Data data = (Data) this.f180342x;
            if (data.getLoading()) {
                flowV = new go.g(new Data(null, null, true, 3, null), 2);
            } else {
                nxb.a aVar2 = (nxb.a) data.getContent();
                int i2 = nyb.v.e;
                vVar.getClass();
                int i3 = 0;
                if (aVar2 != null && (aVar2.getCount() >= 3 || System.currentTimeMillis() - aVar2.getLastTimestamp() < kotlin.time.b.f(nyb.v.d))) {
                    gVar = new go.g(zi0.c.P(u0.a.f201459a, false, null, 3), 2);
                } else {
                    boolean z = v0Var instanceof w0;
                    if (z) {
                        nxb.b bVar = vVar.f220838b;
                        String transactionId = ((w0) v0Var).f201469a;
                        nxb.e eVar = (nxb.e) bVar;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        flowV = nim.a.v(eVar.e.b(transactionId, loadingStrategy), new nyb.q(v0Var, vVar, i3));
                    } else {
                        v0.a aVar3 = v0.a.f201465a;
                        if (!v0Var.equals(aVar3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (v0Var.equals(aVar3)) {
                            revPointsOptInSource = RevPointsOptInSource.SpendAnalytics.f84004a;
                        } else {
                            if (!z) {
                                throw new NoWhenBranchMatchedException();
                            }
                            revPointsOptInSource = RevPointsOptInSource.TransactionDetails.f84009a;
                        }
                        gVar = new go.g(zi0.c.P(new s0(v0Var, revPointsOptInSource, null), false, null, 3), 2);
                    }
                }
                flowV = gVar;
            }
            this.f180341w = null;
            this.f180342x = null;
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

    private final Object v(Object obj2) {
        BalanceWrapper balanceWrapper;
        Object next;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f180341w;
            List list = (List) ((Data) this.f180342x).getContent();
            Continuation continuation = null;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((BalanceWrapper) next).f99404a, (String) this.f180343y)) {
                        break;
                    }
                }
                balanceWrapper = (BalanceWrapper) next;
            } else {
                balanceWrapper = null;
            }
            Flow v1Var = balanceWrapper != null ? new v1(new of6.d((oh3.f) this.z, balanceWrapper, continuation, 2)) : new go.g(new Data(null, null, false, 3, null), 2);
            this.f180341w = null;
            this.f180342x = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r1.emit(r14, r13) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, oim.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.v
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r14)
            r12 = r13
            goto L60
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            java.lang.Object r1 = r13.z
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            yhm.o.b(r14)
            r12 = r13
            goto L51
        L23:
            yhm.o.b(r14)
            java.lang.Object r14 = r13.f180341w
            r1 = r14
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r14 = r13.f180343y
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            java.lang.Object r5 = r13.f180342x
            r6 = 0
            r6 = r14[r6]
            r7 = r14[r3]
            r8 = r14[r2]
            r9 = 3
            r9 = r14[r9]
            r10 = 4
            r10 = r14[r10]
            r11 = 5
            r11 = r14[r11]
            r13.f180341w = r4
            r13.f180343y = r4
            r13.z = r1
            r13.v = r3
            r12 = r13
            java.lang.Object r14 = r5.invoke(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L51
            goto L5f
        L51:
            r12.f180341w = r4
            r12.f180343y = r4
            r12.z = r4
            r12.v = r2
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k25.o.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r13.emit(r0, r16) == r10) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r17) {
        /*
            r16 = this;
            r9 = r16
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r0 = r9.v
            r11 = 2
            r1 = 1
            r12 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L1c
            if (r0 != r11) goto L14
            yhm.o.b(r17)
            goto L75
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.Object r0 = r9.z
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r17)
            r13 = r0
            r0 = r17
            goto L66
        L27:
            yhm.o.b(r17)
            java.lang.Object r0 = r9.f180341w
            r13 = r0
            kotlinx.coroutines.flow.FlowCollector r13 = (kotlinx.coroutines.flow.FlowCollector) r13
            java.lang.Object r0 = r9.f180342x
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r2 = r9.f180343y
            sx2.x r2 = (sx2.x) r2
            r3 = 0
            r3 = r0[r3]
            r4 = r0
            r0 = r2
            r2 = r4[r1]
            r5 = r3
            r3 = r4[r11]
            r6 = 3
            r6 = r4[r6]
            r7 = 4
            r7 = r4[r7]
            r8 = 5
            r8 = r4[r8]
            r14 = 6
            r14 = r4[r14]
            r15 = 7
            r4 = r4[r15]
            r9.f180341w = r12
            r9.f180342x = r12
            r9.z = r13
            r9.v = r1
            r1 = r8
            r8 = r4
            r4 = r6
            r6 = r1
            r1 = r5
            r5 = r7
            r7 = r14
            java.lang.Object r0 = r0.invoke(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r10) goto L66
            goto L74
        L66:
            r9.f180341w = r12
            r9.f180342x = r12
            r9.z = r12
            r9.v = r11
            java.lang.Object r0 = r13.emit(r0, r9)
            if (r0 != r10) goto L75
        L74:
            return r10
        L75:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k25.o.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r14.emit(r0, r17) == r11) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r17
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r0 = r10.v
            r12 = 2
            r1 = 1
            r13 = 0
            if (r0 == 0) goto L27
            if (r0 == r1) goto L1c
            if (r0 != r12) goto L14
            yhm.o.b(r18)
            goto L79
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.Object r0 = r10.z
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r18)
            r14 = r0
            r0 = r18
            goto L6a
        L27:
            yhm.o.b(r18)
            java.lang.Object r0 = r10.f180341w
            r14 = r0
            kotlinx.coroutines.flow.FlowCollector r14 = (kotlinx.coroutines.flow.FlowCollector) r14
            java.lang.Object r0 = r10.f180342x
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r2 = r10.f180343y
            kkf.t6 r2 = (kkf.t6) r2
            r3 = 0
            r3 = r0[r3]
            r4 = r0
            r0 = r2
            r2 = r4[r1]
            r5 = r3
            r3 = r4[r12]
            r6 = 3
            r6 = r4[r6]
            r7 = 4
            r7 = r4[r7]
            r8 = 5
            r8 = r4[r8]
            r9 = 6
            r9 = r4[r9]
            r15 = 7
            r15 = r4[r15]
            r16 = 8
            r4 = r4[r16]
            r10.f180341w = r13
            r10.f180342x = r13
            r10.z = r14
            r10.v = r1
            r1 = r5
            r5 = r7
            r7 = r9
            r9 = r4
            r4 = r6
            r6 = r8
            r8 = r15
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L6a
            goto L78
        L6a:
            r10.f180341w = r13
            r10.f180342x = r13
            r10.z = r13
            r10.v = r12
            java.lang.Object r0 = r14.emit(r0, r10)
            if (r0 != r11) goto L79
        L78:
            return r11
        L79:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k25.o.y(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, oim.q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                o oVar = new o((Continuation) obj4, (List) this.f180343y, (u) this.z, 0);
                oVar.f180341w = (FlowCollector) obj2;
                oVar.f180342x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o((Continuation) obj4, (kea.c) this.f180343y, (yte.n) this.z, 1);
                oVar2.f180341w = (FlowCollector) obj2;
                oVar2.f180342x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
            case 2:
                o oVar3 = new o((Continuation) obj4, (d1) this.f180343y, (Function1) this.z);
                oVar3.f180341w = (FlowCollector) obj2;
                oVar3.f180342x = obj3;
                return oVar3.invokeSuspend(Unit.f186387a);
            case 3:
                o oVar4 = new o((Continuation) obj4, (Function1) this.f180343y, (z3) this.z, 3);
                oVar4.f180341w = (FlowCollector) obj2;
                oVar4.f180342x = obj3;
                return oVar4.invokeSuspend(Unit.f186387a);
            case 4:
                o oVar5 = new o((Continuation) obj4, (n4) this.f180343y, (String) this.z, 4);
                oVar5.f180341w = (FlowCollector) obj2;
                oVar5.f180342x = obj3;
                return oVar5.invokeSuspend(Unit.f186387a);
            case 5:
                o oVar6 = new o((Continuation) obj4, (x4) this.f180343y, (dj0.d) this.z, 5);
                oVar6.f180341w = (FlowCollector) obj2;
                oVar6.f180342x = obj3;
                return oVar6.invokeSuspend(Unit.f186387a);
            case 6:
                o oVar7 = new o((Continuation) obj4, (z4) this.f180343y, (Function1) this.z, 6);
                oVar7.f180341w = (FlowCollector) obj2;
                oVar7.f180342x = obj3;
                return oVar7.invokeSuspend(Unit.f186387a);
            case 7:
                o oVar8 = new o((Continuation) obj4, (i5) this.f180343y, (p6) this.z, 7);
                oVar8.f180341w = (FlowCollector) obj2;
                oVar8.f180342x = obj3;
                return oVar8.invokeSuspend(Unit.f186387a);
            case 8:
                o oVar9 = new o((Continuation) obj4, (ksk.g) this.f180343y, (nel.n) this.z, 8);
                oVar9.f180341w = (FlowCollector) obj2;
                oVar9.f180342x = obj3;
                return oVar9.invokeSuspend(Unit.f186387a);
            case 9:
                o oVar10 = new o((Continuation) obj4, (kv5.k) this.f180343y, (DerivativesBalance) this.z, 9);
                oVar10.f180341w = (FlowCollector) obj2;
                oVar10.f180342x = obj3;
                return oVar10.invokeSuspend(Unit.f186387a);
            case 10:
                o oVar11 = new o((Continuation) obj4, (l7e.e) this.f180343y, (String) this.z, 10);
                oVar11.f180341w = (FlowCollector) obj2;
                oVar11.f180342x = obj3;
                return oVar11.invokeSuspend(Unit.f186387a);
            case 11:
                o oVar12 = new o((Continuation) obj4, (b0) this.f180343y, 11);
                oVar12.f180341w = (FlowCollector) obj2;
                oVar12.f180342x = obj3;
                return oVar12.invokeSuspend(Unit.f186387a);
            case 12:
                o oVar13 = new o((Continuation) obj4, (cnh.f) this.f180343y, (vmh.g) this.z, 12);
                oVar13.f180341w = (FlowCollector) obj2;
                oVar13.f180342x = obj3;
                return oVar13.invokeSuspend(Unit.f186387a);
            case 13:
                o oVar14 = new o((lal.a) this.f180343y, (BiometricVerificationVisionRemoteResource) this.z, (Continuation) obj4);
                oVar14.f180341w = (FlowCollector) obj2;
                oVar14.f180342x = (Throwable) obj3;
                return oVar14.invokeSuspend(Unit.f186387a);
            case 14:
                o oVar15 = new o((Continuation) obj4, (m3d.i) this.f180343y, (LinkedHashMap) this.z, 14);
                oVar15.f180341w = (FlowCollector) obj2;
                oVar15.f180342x = obj3;
                return oVar15.invokeSuspend(Unit.f186387a);
            case 15:
                o oVar16 = new o((Continuation) obj4, (m3k.d) this.f180343y, (RemittanceTransferData) this.z, 15);
                oVar16.f180341w = (FlowCollector) obj2;
                oVar16.f180342x = obj3;
                return oVar16.invokeSuspend(Unit.f186387a);
            case 16:
                o oVar17 = new o((Continuation) obj4, (mmh.n) this.f180343y, (nmh.a) this.z, 16);
                oVar17.f180341w = (FlowCollector) obj2;
                oVar17.f180342x = obj3;
                return oVar17.invokeSuspend(Unit.f186387a);
            case 17:
                o oVar18 = new o((Continuation) obj4, (ArrayList) this.f180343y, (n09.m0) this.z, 17);
                oVar18.f180341w = (FlowCollector) obj2;
                oVar18.f180342x = obj3;
                return oVar18.invokeSuspend(Unit.f186387a);
            case 18:
                o oVar19 = new o((Continuation) obj4, (com.revolut.feature.store.impl.ui.orders.see_all.a) this.f180343y, (String) this.z, 18);
                oVar19.f180341w = (FlowCollector) obj2;
                oVar19.f180342x = obj3;
                return oVar19.invokeSuspend(Unit.f186387a);
            case 19:
                o oVar20 = new o((n4d.m) this.z, (Continuation) obj4);
                oVar20.f180342x = (n4d.c) obj3;
                return oVar20.invokeSuspend(Unit.f186387a);
            case 20:
                o oVar21 = new o((Continuation) obj4, (n78.c) this.f180343y, (String) this.z, 20);
                oVar21.f180341w = (FlowCollector) obj2;
                oVar21.f180342x = obj3;
                return oVar21.invokeSuspend(Unit.f186387a);
            case 21:
                o oVar22 = new o((Continuation) obj4, (ndh.d) this.z, (List) this.f180343y);
                oVar22.f180341w = (FlowCollector) obj2;
                oVar22.f180342x = obj3;
                return oVar22.invokeSuspend(Unit.f186387a);
            case 22:
                o oVar23 = new o((Continuation) obj4, (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) this.f180343y, (uqk.e) this.z, 22);
                oVar23.f180341w = (FlowCollector) obj2;
                oVar23.f180342x = obj3;
                return oVar23.invokeSuspend(Unit.f186387a);
            case 23:
                o oVar24 = new o((Continuation) obj4, (com.revolut.feature.referrals.impl.personalized_tracking.a) this.f180343y, (String) this.z, 23);
                oVar24.f180341w = (FlowCollector) obj2;
                oVar24.f180342x = obj3;
                return oVar24.invokeSuspend(Unit.f186387a);
            case 24:
                o oVar25 = new o((Continuation) obj4, (nyb.v) this.f180343y, (v0) this.z, 24);
                oVar25.f180341w = (FlowCollector) obj2;
                oVar25.f180342x = obj3;
                return oVar25.invokeSuspend(Unit.f186387a);
            case 25:
                o oVar26 = new o((Continuation) obj4, (String) this.f180343y, (oh3.f) this.z, 25);
                oVar26.f180341w = (FlowCollector) obj2;
                oVar26.f180342x = obj3;
                return oVar26.invokeSuspend(Unit.f186387a);
            case 26:
                o oVar27 = new o((Continuation) obj4, (oim.q) this.f180342x);
                oVar27.f180341w = (FlowCollector) obj2;
                oVar27.f180343y = (Object[]) obj3;
                return oVar27.invokeSuspend(Unit.f186387a);
            case 27:
                o oVar28 = new o((Continuation) obj4, (x) this.f180343y, 27);
                oVar28.f180341w = (FlowCollector) obj2;
                oVar28.f180342x = (Object[]) obj3;
                return oVar28.invokeSuspend(Unit.f186387a);
            case 28:
                o oVar29 = new o((Continuation) obj4, (t6) this.f180343y, 28);
                oVar29.f180341w = (FlowCollector) obj2;
                oVar29.f180342x = (Object[]) obj3;
                return oVar29.invokeSuspend(Unit.f186387a);
            default:
                o oVar30 = new o((Continuation) obj4, (c0) this.f180343y, (wi0.b) this.z, 29);
                oVar30.f180341w = (FlowCollector) obj2;
                oVar30.f180342x = obj3;
                return oVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:512:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v30, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v27, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k25.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.f180343y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Continuation continuation, d1 d1Var, Function1 function1) {
        super(3, continuation);
        this.u = 2;
        this.f180343y = d1Var;
        this.z = (kotlin.jvm.internal.q) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, ndh.d dVar, List list) {
        super(3, continuation);
        this.u = 21;
        this.z = dVar;
        this.f180343y = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, oim.q qVar) {
        super(3, continuation);
        this.u = 26;
        this.f180342x = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lal.a aVar, BiometricVerificationVisionRemoteResource biometricVerificationVisionRemoteResource, Continuation continuation) {
        super(3, continuation);
        this.u = 13;
        this.f180343y = aVar;
        this.z = biometricVerificationVisionRemoteResource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n4d.m mVar, Continuation continuation) {
        super(3, continuation);
        this.u = 19;
        this.z = mVar;
    }
}
