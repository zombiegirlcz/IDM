package ahe;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext;
import com.revolut.feature.spending_analytics.api.widget.SpendingWidgetContext;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import vkm.c2;
import vkm.d2;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.i implements Function3 {
    public Object A;
    public Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f5059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f5060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f5061y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
        this.f5060x = obj4;
        this.B = obj5;
    }

    private final Object A(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f5059w;
            Flow flowJ = ((Boolean) this.f5061y).booleanValue() ? ((x57.d) this.z).j((String) this.A, (String) this.f5060x, (dsh.e) this.B) : org.bouncycastle.jcajce.provider.digest.a.s(3, null);
            this.f5059w = null;
            this.f5061y = null;
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

    private final Object B(Object obj2) {
        Flow gVar;
        StatementProduct statementProduct = (StatementProduct) this.A;
        ylh.t tVar = (ylh.t) this.z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f5059w;
            j2 j2Var = tVar.f314735t;
            Flow flowE = boh.f.e(new go.g((Data) this.f5060x, 2), new xnd.c(tVar, statementProduct, 3));
            if (statementProduct instanceof d0h.a) {
                gVar = nim.a.v(nim.a.v(((ael.y) tVar.f314730n).e(((d0h.a) statementProduct).getF95314a(), w4l.h.f294642c), new yed.g0(statementProduct, 18)), new yed.g0(tVar, 19));
            } else {
                gVar = new go.g(new Data(null, null, false, 7, null), 2);
            }
            v0b.b bVarH = ta6.a.h(j2Var, flowE, gVar, new ylh.s(tVar, (ylh.e) this.B, statementProduct, null));
            this.f5059w = null;
            this.f5061y = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, bVarH, this) == aVar) {
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

    private final Object b(Object obj2) {
        Flow hVar;
        Object objC;
        Object objPutIfAbsent;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f5059w;
            List list = (List) this.f5061y;
            ((ish.z) this.z).d.put(((WidgetContext) this.A).getContextKey(), Boolean.valueOf(list.size() >= 20));
            List<dsh.p> list2 = list;
            ArrayList flows = new ArrayList(zhm.w.t(list2, 10));
            for (dsh.p pVar : list2) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5060x;
                Object objM = linkedHashMap.get(pVar);
                if (objM == null) {
                    ish.z zVar = (ish.z) this.z;
                    WidgetContext widgetContext = (WidgetContext) this.A;
                    CoroutineScope coroutineScope = (CoroutineScope) this.B;
                    if (zVar.f168299a.g(widgetContext, pVar.f117337b)) {
                        fd0.d dVar = zVar.b(widgetContext).f168266a;
                        synchronized (dVar) {
                            objC = dVar.c(widgetContext);
                            if (objC == null) {
                                objC = new ConcurrentHashMap();
                                dVar.d(widgetContext, objC);
                            }
                        }
                        ConcurrentMap concurrentMap = (ConcurrentMap) objC;
                        String str = pVar.f117336a;
                        Object objC2 = concurrentMap.get(str);
                        if (objC2 == null && (objPutIfAbsent = concurrentMap.putIfAbsent(str, (objC2 = vkm.q.c(Unit.f186387a)))) != null) {
                            objC2 = objPutIfAbsent;
                        }
                        objM = vkm.q.M(vkm.q.q(vkm.q.Q((MutableStateFlow) objC2, new y0(12, zVar, widgetContext, pVar, coroutineScope, (Continuation) null))), coroutineScope, c2.a(d2.Companion, 1000L, 2), 1);
                    } else {
                        objM = new go.g(new Data(null, null, false, 6, null), 2);
                    }
                    linkedHashMap.put(pVar, objM);
                }
                flows.add((Flow) objM);
            }
            Continuation continuation = null;
            if (flows.isEmpty()) {
                ash.c.Companion.getClass();
                hVar = new go.g(new ash.c(zhm.f0.f322471a, ash.b.LOADING_FINISHED), 2);
            } else {
                Intrinsics.checkNotNullParameter(flows, "flows");
                hVar = new ie7.h(new v1(new dmf.c(flows, continuation, 1)), (ish.z) this.z, 3);
            }
            this.f5059w = null;
            this.f5061y = null;
            this.v = 1;
            if (vkm.q.u(flowCollector, hVar, this) == aVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        if (r15 == r0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0159, code lost:
    
        if (vkm.q.u(r4, r2, r20) == r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2) {
        Flow gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f5059w;
            if (((Boolean) this.f5061y).booleanValue()) {
                dp4.c1 c1Var = ((om4.k0) this.z).f226612a;
                String facilityId = (String) this.A;
                w4l.k loadingStrategy = (w4l.k) this.B;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                gVar = c1Var.f.b(new cp4.q(facilityId), loadingStrategy);
            } else {
                gVar = new go.g((Data) this.f5060x, 2);
            }
            this.f5059w = null;
            this.f5061y = null;
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

    private final Object p(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f5059w;
            Flow flowJ = ((Boolean) this.f5061y).booleanValue() ? ((os5.d) this.z).j((String) this.A, (String) this.f5060x, (dsh.e) this.B, false) : org.bouncycastle.jcajce.provider.digest.a.s(3, null);
            this.f5059w = null;
            this.f5061y = null;
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

    private final Object s(Object obj2) {
        int i;
        Data data;
        Data data2;
        Flow gVar;
        zhm.f0 f0Var;
        zhm.f0 f0Var2;
        String str;
        i9g.b0 b0Var = ((pdg.i0) this.z).f235190p;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.v;
        if (i2 == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.f5059w;
            Data data3 = (Data) this.f5061y;
            HotelsProperty hotelsProperty = (HotelsProperty) data3.getContent();
            if (hotelsProperty == null || (str = hotelsProperty.f97981a) == null) {
                i = 1;
                zhm.f0 f0Var3 = zhm.f0.f322471a;
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        f0Var2 = f0Var3;
                    } else {
                        f0Var2 = null;
                    }
                    data = new Data(f0Var2, data3.getError(), data3.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                try {
                    Object content2 = data3.getContent();
                    if (content2 != null) {
                        f0Var = zhm.f0.f322471a;
                    } else {
                        f0Var = null;
                    }
                    data2 = new Data(f0Var, data3.getError(), data3.getLoading());
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data3.getLoading());
                }
                gVar = new go.g(new pdg.b0(data3, data, data2, f0Var3), 2);
            } else {
                go.g gVar2 = new go.g(data3, 2);
                p73.d dVar = new p73.d(rd0.e.b(b0Var.b(new bgi.a(str, 0))), 4);
                efm.r rVarC = b0Var.c(str);
                zhm.h0 h0Var = zhm.h0.f322473a;
                i = 1;
                gVar = new j23.b(new Flow[]{gVar2, dVar, rd0.e.b(ue0.e.p(rVarC, h0Var)), rd0.e.b(ue0.e.p(b0Var.d(new cgi.c(str, (LocalDate) this.f5060x, (LocalDate) this.B, hx7.a.F((List) this.A))), h0Var))}, 12);
            }
            this.f5059w = null;
            this.f5061y = null;
            this.v = i;
            if (vkm.q.u(flowCollector, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (vkm.q.u(r10, r3, r9) == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r10) throws px1.d {
        /*
            r9 = this;
            java.lang.Object r0 = r9.A
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r9.z
            r2 = r0
            px1.i r2 = (px1.i) r2
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r7 = 2
            r3 = 1
            r5 = 0
            if (r1 == 0) goto L30
            if (r1 == r3) goto L24
            if (r1 != r7) goto L1c
            yhm.o.b(r10)
            goto L95
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            java.lang.Object r1 = r9.B
            nx1.y r1 = (nx1.y) r1
            java.lang.Object r2 = r9.f5060x
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            yhm.o.b(r10)
            goto L7d
        L30:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.f5059w
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            java.lang.Object r1 = r9.f5061y
            nx1.z r1 = (nx1.z) r1
            boolean r6 = r1 instanceof nx1.w
            if (r6 == 0) goto L5c
            nx1.w r1 = (nx1.w) r1
            java.lang.String r3 = r1.f220090a
            mp6.j r1 = new mp6.j
            r6 = 16
            r1.<init>(r2, r3, r4, r5, r6)
            vkm.v1 r2 = new vkm.v1
            r2.<init>(r1)
            nx1.r r1 = new nx1.r
            r3 = 4
            r4 = 1
            r1.<init>(r3, r4, r5)
            vkm.y r3 = new vkm.y
            r3.<init>(r2, r1)
            goto L84
        L5c:
            boolean r6 = r1 instanceof nx1.x
            if (r6 != 0) goto L9e
            boolean r6 = r1 instanceof nx1.y
            if (r6 == 0) goto L98
            if (r4 == 0) goto L7e
            r6 = r1
            nx1.y r6 = (nx1.y) r6
            nx1.e r8 = r6.f220092a
            r9.f5059w = r5
            r9.f5061y = r5
            r9.f5060x = r10
            r9.B = r6
            r9.v = r3
            java.lang.Object r2 = px1.i.d(r2, r4, r8, r9)
            if (r2 != r0) goto L7c
            goto L94
        L7c:
            r2 = r10
        L7d:
            r10 = r2
        L7e:
            go.g r3 = new go.g
            r2 = 2
            r3.<init>(r1, r2)
        L84:
            r9.f5059w = r5
            r9.f5061y = r5
            r9.f5060x = r5
            r9.B = r5
            r9.v = r7
            java.lang.Object r10 = vkm.q.u(r10, r3, r9)
            if (r10 != r0) goto L95
        L94:
            return r0
        L95:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L98:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L9e:
            px1.d r10 = new px1.d
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r11 == r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0156, code lost:
    
        if (vkm.q.u(r10, r1, r19) != r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0158, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        if (vkm.q.u(r7, r10, r9) == r2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.z
            r6d.g r0 = (r6d.g) r0
            et6.t0 r1 = r0.f251668p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L30
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r10)
            goto Lb5
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r3 = r9.B
            et6.t0 r3 = (et6.t0) r3
            java.lang.Object r5 = r9.f5060x
            go.g r5 = (go.g) r5
            java.lang.Object r7 = r9.A
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            yhm.o.b(r10)
            goto L61
        L30:
            yhm.o.b(r10)
            java.lang.Object r10 = r9.f5059w
            r7 = r10
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r10 = r9.f5061y
            w4l.k r10 = (w4l.k) r10
            r1.getClass()
            od0.h r10 = od0.i.Companion
            r10.getClass()
            od0.i r10 = od0.i.f224256b
            go.g r10 = zi0.c.i(r10)
            r9.f5059w = r6
            r9.f5061y = r6
            r9.A = r7
            r9.f5060x = r10
            r9.B = r1
            r9.v = r5
            r1.getClass()
            java.lang.String r3 = ""
            if (r3 != r2) goto L5e
            goto Lb4
        L5e:
            r5 = r10
            r10 = r3
            r3 = r1
        L61:
            java.lang.String r10 = (java.lang.String) r10
            r3.getClass()
            java.lang.String r8 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            gr6.i r10 = r3.f129330c
            et6.a1 r10 = (et6.a1) r10
            vkm.d r10 = r10.b()
            et6.w r3 = new et6.w
            r8 = 3
            r3.<init>(r8)
            akg.n r10 = nim.a.v(r10, r3)
            vkm.d r3 = r1.a()
            akg.n r1 = et6.t0.b(r1)
            akg.n r10 = zh9.u0.i(r5, r10, r3)
            t38.e r10 = zh9.u0.m(r10, r1)
            qkg.a r1 = new qkg.a
            r3 = 5
            r1.<init>(r4, r3, r6)
            jhi.k r10 = nim.a.u(r1, r10)
            n8i.b1 r1 = new n8i.b1
            r3 = 25
            r1.<init>(r0, r3)
            akg.n r10 = nim.a.v(r10, r1)
            r9.f5059w = r6
            r9.f5061y = r6
            r9.A = r6
            r9.f5060x = r6
            r9.B = r6
            r9.v = r4
            java.lang.Object r10 = vkm.q.u(r7, r10, r9)
            if (r10 != r2) goto Lb5
        Lb4:
            return r2
        Lb5:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.w(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r7.emit(r15, r14) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r7.d(r14) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[PHI: r1 r5 r6 r7
      0x00a0: PHI (r1v3 kotlin.jvm.internal.n0) = (r1v5 kotlin.jvm.internal.n0), (r1v7 kotlin.jvm.internal.n0), (r1v7 kotlin.jvm.internal.n0) binds: [B:28:0x009e, B:15:0x0069, B:21:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r5v2 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v4 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:28:0x009e, B:15:0x0069, B:21:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r6v4 ukm.i0) = (r6v6 ukm.i0), (r6v7 ukm.i0), (r6v7 ukm.i0) binds: [B:28:0x009e, B:15:0x0069, B:21:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r7v3 kotlinx.coroutines.flow.FlowCollector) = 
      (r7v5 kotlinx.coroutines.flow.FlowCollector)
      (r7v6 kotlinx.coroutines.flow.FlowCollector)
      (r7v6 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:28:0x009e, B:15:0x0069, B:21:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e0 -> B:7:0x001c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gim.i, kotlin.jvm.functions.Function3] */
    private final Object y(Object obj2) {
        String str;
        wvg.y0 y0Var;
        wvg.a1 a1Var = (wvg.a1) this.z;
        Pair pair = (Pair) this.A;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = pair.f186385a;
            String str2 = (String) pair.f186386b;
            if (obj3 != null) {
                ?? r3 = (gim.i) this.f5060x;
                wvg.y0 y0Var2 = (wvg.y0) this.B;
                this.z = a1Var;
                this.A = null;
                this.f5059w = str2;
                this.f5061y = y0Var2;
                this.v = 1;
                if (r3.invoke(a1Var, obj3, this) == aVar) {
                    return aVar;
                }
                str = str2;
                y0Var = y0Var2;
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y0Var = (wvg.y0) this.f5061y;
        str = (String) this.f5059w;
        yhm.o.b(obj2);
        if (str != null) {
            z9h.n.l(String.class, y0Var.f300501a, a1Var.getKey(), str);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                int i = 0;
                y0 y0Var = new y0(i, (ArrayList) this.z, (List) this.A, (Data) this.f5060x, (a1) this.B, (Continuation) obj4);
                y0Var.f5059w = (FlowCollector) obj2;
                y0Var.f5061y = (Object[]) obj3;
                return y0Var.invokeSuspend(Unit.f186387a);
            case 1:
                y0 y0Var2 = new y0((Continuation) obj4, (Data) this.f5060x, (aw4.b) this.z, (String) this.A, (w4l.k) this.B, 1);
                y0Var2.f5059w = (FlowCollector) obj2;
                y0Var2.f5061y = obj3;
                return y0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                y0 y0Var3 = new y0((Continuation) obj4, (com.revolut.feature_move_money.impl.amount.c) this.z, 2);
                y0Var3.f5059w = (FlowCollector) obj2;
                y0Var3.f5061y = obj3;
                return y0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                int i2 = 3;
                y0 y0Var4 = new y0(i2, (bpd.g) this.z, (xnd.l) this.A, (AnalyticsAccountsSelection.Savings) this.f5060x, (xnd.h) this.B, (Continuation) obj4);
                y0Var4.f5059w = (FlowCollector) obj2;
                y0Var4.f5061y = obj3;
                return y0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                y0 y0Var5 = new y0((Continuation) obj4, (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.z, 4);
                y0Var5.f5059w = (FlowCollector) obj2;
                y0Var5.f5061y = obj3;
                return y0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                int i3 = 5;
                y0 y0Var6 = new y0(i3, (cpd.g) this.z, (xnd.l) this.A, (zod.c) this.f5060x, (xnd.h) this.B, (Continuation) obj4);
                y0Var6.f5059w = (FlowCollector) obj2;
                y0Var6.f5061y = obj3;
                return y0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                y0 y0Var7 = new y0((Continuation) obj4, (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.z, 6);
                y0Var7.f5059w = (FlowCollector) obj2;
                y0Var7.f5061y = obj3;
                return y0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                int i5 = 7;
                y0 y0Var8 = new y0(i5, (f78.a) this.z, (String) this.A, (String) this.f5060x, (io3.d) this.B, (Continuation) obj4);
                y0Var8.f5059w = (FlowCollector) obj2;
                y0Var8.f5061y = (Object[]) obj3;
                return y0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                y0 y0Var9 = new y0((Continuation) obj4, (ff4.b0) this.z, (CreditApplicationPluginFlowContract$Configuration) this.A, 8);
                y0Var9.f5059w = (FlowCollector) obj2;
                y0Var9.f5061y = obj3;
                return y0Var9.invokeSuspend(Unit.f186387a);
            case 9:
                int i6 = 9;
                y0 y0Var10 = new y0(i6, (g4k.p) this.z, (BankTransferData) this.A, (f5j.a) this.f5060x, (TransferFlowType) this.B, (Continuation) obj4);
                y0Var10.f5059w = (FlowCollector) obj2;
                y0Var10.f5061y = obj3;
                return y0Var10.invokeSuspend(Unit.f186387a);
            case 10:
                int i21 = 10;
                y0 y0Var11 = new y0(i21, (i0e.q) this.z, (akg.n) this.A, (Set) this.f5060x, (io3.h) this.B, (Continuation) obj4);
                y0Var11.f5059w = (FlowCollector) obj2;
                y0Var11.f5061y = obj3;
                return y0Var11.invokeSuspend(Unit.f186387a);
            case 11:
                int i22 = 11;
                y0 y0Var12 = new y0(i22, (j28.e) this.z, (InvestWidgetContext) this.A, (String) this.f5060x, (dsh.e) this.B, (Continuation) obj4);
                y0Var12.f5059w = (FlowCollector) obj2;
                y0Var12.f5061y = obj3;
                return y0Var12.invokeSuspend(Unit.f186387a);
            case 12:
                int i32 = 12;
                y0 y0Var13 = new y0(i32, (ish.z) this.z, (WidgetContext) this.A, (dsh.p) this.f5060x, (CoroutineScope) this.B, (Continuation) obj4);
                y0Var13.f5059w = (FlowCollector) obj2;
                y0Var13.f5061y = obj3;
                return y0Var13.invokeSuspend(Unit.f186387a);
            case 13:
                int i33 = 13;
                y0 y0Var14 = new y0(i33, (ish.z) this.z, (WidgetContext) this.A, (LinkedHashMap) this.f5060x, (CoroutineScope) this.B, (Continuation) obj4);
                y0Var14.f5059w = (FlowCollector) obj2;
                y0Var14.f5061y = obj3;
                return y0Var14.invokeSuspend(Unit.f186387a);
            case 14:
                y0 y0Var15 = new y0((Continuation) obj4, (knd.j0) this.z, (Set) this.A, 14);
                y0Var15.f5059w = (FlowCollector) obj2;
                y0Var15.f5061y = obj3;
                return y0Var15.invokeSuspend(Unit.f186387a);
            case 15:
                int i43 = 15;
                y0 y0Var16 = new y0(i43, (mc7.d) this.z, (String) this.A, (String) this.f5060x, (SpendingWidgetContext) this.B, (Continuation) obj4);
                y0Var16.f5059w = (FlowCollector) obj2;
                y0Var16.f5061y = obj3;
                return y0Var16.invokeSuspend(Unit.f186387a);
            case 16:
                int i59 = 16;
                y0 y0Var17 = new y0(i59, (mc7.g) this.z, (String) this.A, (String) this.f5060x, (CashflowWidgetContext) this.B, (Continuation) obj4);
                y0Var17.f5059w = (FlowCollector) obj2;
                y0Var17.f5061y = obj3;
                return y0Var17.invokeSuspend(Unit.f186387a);
            case 17:
                y0 y0Var18 = new y0((Continuation) obj4, (n1g.r) this.z, 17);
                y0Var18.f5059w = (FlowCollector) obj2;
                y0Var18.f5061y = obj3;
                return y0Var18.invokeSuspend(Unit.f186387a);
            case 18:
                y0 y0Var19 = new y0((Continuation) obj4, (Data) this.f5060x, (om4.k0) this.z, (String) this.A, (w4l.k) this.B, 18);
                y0Var19.f5059w = (FlowCollector) obj2;
                y0Var19.f5061y = obj3;
                return y0Var19.invokeSuspend(Unit.f186387a);
            case 19:
                int i66 = 19;
                y0 y0Var20 = new y0(i66, (os5.d) this.z, (String) this.A, (String) this.f5060x, (dsh.e) this.B, (Continuation) obj4);
                y0Var20.f5059w = (FlowCollector) obj2;
                y0Var20.f5061y = obj3;
                return y0Var20.invokeSuspend(Unit.f186387a);
            case 20:
                y0 y0Var21 = new y0((Continuation) obj4, (pdg.i0) this.z, (LocalDate) this.f5060x, (LocalDate) this.B, (List) this.A);
                y0Var21.f5059w = (FlowCollector) obj2;
                y0Var21.f5061y = obj3;
                return y0Var21.invokeSuspend(Unit.f186387a);
            case 21:
                y0 y0Var22 = new y0((Continuation) obj4, (px1.i) this.z, (List) this.A, 21);
                y0Var22.f5059w = (FlowCollector) obj2;
                y0Var22.f5061y = obj3;
                return y0Var22.invokeSuspend(Unit.f186387a);
            case 22:
                y0 y0Var23 = new y0((Continuation) obj4, (qoc.r) this.z, 22);
                y0Var23.f5059w = (FlowCollector) obj2;
                y0Var23.f5061y = obj3;
                return y0Var23.invokeSuspend(Unit.f186387a);
            case 23:
                y0 y0Var24 = new y0((Continuation) obj4, (r6d.g) this.z, 23);
                y0Var24.f5059w = (FlowCollector) obj2;
                y0Var24.f5061y = obj3;
                return y0Var24.invokeSuspend(Unit.f186387a);
            case 24:
                int i74 = 24;
                y0 y0Var25 = new y0(i74, (s3d.d) this.z, (String) this.A, (dsh.e) this.f5060x, (String) this.B, (Continuation) obj4);
                y0Var25.f5059w = (FlowCollector) obj2;
                y0Var25.f5061y = obj3;
                return y0Var25.invokeSuspend(Unit.f186387a);
            case 25:
                Function1 function1 = (Function1) this.f5060x;
                y0 y0Var26 = new y0((Flow) this.B, (Continuation) obj4, function1);
                y0Var26.z = (CoroutineScope) obj2;
                y0Var26.A = (FlowCollector) obj3;
                return y0Var26.invokeSuspend(Unit.f186387a);
            case 26:
                y0 y0Var27 = new y0((Function3) this.f5060x, (wvg.y0) this.B, (Continuation) obj4);
                y0Var27.z = (wvg.a1) obj2;
                y0Var27.A = (Pair) obj3;
                return y0Var27.invokeSuspend(Unit.f186387a);
            case 27:
                int i92 = 27;
                y0 y0Var28 = new y0(i92, (x57.d) this.z, (String) this.A, (String) this.f5060x, (dsh.e) this.B, (Continuation) obj4);
                y0Var28.f5059w = (FlowCollector) obj2;
                y0Var28.f5061y = obj3;
                return y0Var28.invokeSuspend(Unit.f186387a);
            case 28:
                y0 y0Var29 = new y0((Continuation) obj4, (ylh.t) this.z, (Data) this.f5060x, (StatementProduct) this.A, (ylh.e) this.B);
                y0Var29.f5059w = (FlowCollector) obj2;
                y0Var29.f5061y = obj3;
                return y0Var29.invokeSuspend(Unit.f186387a);
            default:
                int i96 = 29;
                y0 y0Var30 = new y0(i96, (zc7.i) this.z, (String) this.A, (String) this.f5060x, (Integer) this.B, (Continuation) obj4);
                y0Var30.f5059w = (FlowCollector) obj2;
                y0Var30.f5061y = obj3;
                return y0Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:488:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Continuation continuation, Data data, Object obj2, String str, w4l.k kVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f5060x = data;
        this.z = obj2;
        this.A = str;
        this.B = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Continuation continuation, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Continuation continuation, pdg.i0 i0Var, LocalDate localDate, LocalDate localDate2, List list) {
        super(3, continuation);
        this.u = 20;
        this.z = i0Var;
        this.f5060x = localDate;
        this.B = localDate2;
        this.A = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Continuation continuation, ylh.t tVar, Data data, StatementProduct statementProduct, ylh.e eVar) {
        super(3, continuation);
        this.u = 28;
        this.z = tVar;
        this.f5060x = data;
        this.A = statementProduct;
        this.B = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(Function3 function3, wvg.y0 y0Var, Continuation continuation) {
        super(3, continuation);
        this.u = 26;
        this.f5060x = (gim.i) function3;
        this.B = y0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Flow flow, Continuation continuation, Function1 function1) {
        super(3, continuation);
        this.u = 25;
        this.f5060x = function1;
        this.B = flow;
    }
}
