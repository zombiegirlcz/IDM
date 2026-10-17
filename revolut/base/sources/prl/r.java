package prl;

import com.revolut.trading.orders.data.network.services.TradingOrdersService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import k4l.e0;
import k4l.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nel.z;
import org.jetbrains.annotations.NotNull;
import orl.j0;
import orl.t0;
import po9.w;
import pqg.v;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOrdersService f239348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b80.c f239349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f239350c;
    public final ne0.d d;
    public final w4l.f e;
    public final w4l.f f;

    public r(TradingOrdersService ordersService, b80.c networkStateRepository, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(ordersService, "ordersService");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f239348a = ordersService;
        this.f239349b = networkStateRepository;
        this.f239350c = storage;
        this.d = memoryCache;
        final int i = 0;
        this.e = new w4l.f(new Function2(this) { // from class: prl.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f239341b;

            {
                this.f239341b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strG;
                int i2 = i;
                r rVar = this.f239341b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<t0> orderCancellable = rVar.f239348a.getOrderCancellable(params);
                        w wVar = new w(27, new v(10));
                        orderCancellable.getClass();
                        ufm.i iVar = new ufm.i(orderCancellable, wVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        p params2 = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TradingOrdersService tradingOrdersService = rVar.f239348a;
                        String str = params2.f239344a;
                        String str2 = params2.f239345b;
                        String strB = f4l.a.b(params2.f239346c);
                        q0 q0Var = params2.d;
                        if (q0Var != null) {
                            Object obj4 = mrl.h.f208162a;
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            strG = u1.g(q0Var, mrl.h.f208162a);
                        } else {
                            strG = null;
                        }
                        d0<j0> orderLimitsForPortfolio = tradingOrdersService.getOrderLimitsForPortfolio(str, str2, strB, strG, params2.e);
                        w wVar2 = new w(28, new v(11));
                        orderLimitsForPortfolio.getClass();
                        ufm.i iVar2 = new ufm.i(orderLimitsForPortfolio, wVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.n0(iVar2, rVar.f239349b);
                    default:
                        p params3 = (p) obj2;
                        e0 data = (e0) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        hx7.q.U(rVar.d, params3, data);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, null, null, 254);
        final int i2 = 1;
        final int i3 = 2;
        this.f = new w4l.f(new Function2(this) { // from class: prl.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f239341b;

            {
                this.f239341b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strG;
                int i22 = i2;
                r rVar = this.f239341b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<t0> orderCancellable = rVar.f239348a.getOrderCancellable(params);
                        w wVar = new w(27, new v(10));
                        orderCancellable.getClass();
                        ufm.i iVar = new ufm.i(orderCancellable, wVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        p params2 = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TradingOrdersService tradingOrdersService = rVar.f239348a;
                        String str = params2.f239344a;
                        String str2 = params2.f239345b;
                        String strB = f4l.a.b(params2.f239346c);
                        q0 q0Var = params2.d;
                        if (q0Var != null) {
                            Object obj4 = mrl.h.f208162a;
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            strG = u1.g(q0Var, mrl.h.f208162a);
                        } else {
                            strG = null;
                        }
                        d0<j0> orderLimitsForPortfolio = tradingOrdersService.getOrderLimitsForPortfolio(str, str2, strB, strG, params2.e);
                        w wVar2 = new w(28, new v(11));
                        orderLimitsForPortfolio.getClass();
                        ufm.i iVar2 = new ufm.i(orderLimitsForPortfolio, wVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.n0(iVar2, rVar.f239349b);
                    default:
                        p params3 = (p) obj2;
                        e0 data = (e0) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        hx7.q.U(rVar.d, params3, data);
                        return Unit.f186387a;
                }
            }
        }, new pp5.d(this, 16), new Function2(this) { // from class: prl.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f239341b;

            {
                this.f239341b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String strG;
                int i22 = i3;
                r rVar = this.f239341b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<t0> orderCancellable = rVar.f239348a.getOrderCancellable(params);
                        w wVar = new w(27, new v(10));
                        orderCancellable.getClass();
                        ufm.i iVar = new ufm.i(orderCancellable, wVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        p params2 = (p) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        TradingOrdersService tradingOrdersService = rVar.f239348a;
                        String str = params2.f239344a;
                        String str2 = params2.f239345b;
                        String strB = f4l.a.b(params2.f239346c);
                        q0 q0Var = params2.d;
                        if (q0Var != null) {
                            Object obj4 = mrl.h.f208162a;
                            Intrinsics.checkNotNullParameter(q0Var, "<this>");
                            strG = u1.g(q0Var, mrl.h.f208162a);
                        } else {
                            strG = null;
                        }
                        d0<j0> orderLimitsForPortfolio = tradingOrdersService.getOrderLimitsForPortfolio(str, str2, strB, strG, params2.e);
                        w wVar2 = new w(28, new v(11));
                        orderLimitsForPortfolio.getClass();
                        ufm.i iVar2 = new ufm.i(orderLimitsForPortfolio, wVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return te0.w.n0(iVar2, rVar.f239349b);
                    default:
                        p params3 = (p) obj2;
                        e0 data = (e0) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(data, "data");
                        hx7.q.U(rVar.d, params3, data);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static final String a(r rVar, bfl.g gVar, z zVar) {
        rVar.getClass();
        return a0.d.s("INVEST_ORDER_FLOW_LAST_INVEST_VALUE_TYPE_", f4l.a.a(gVar), "_", tbl.a.b(zVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, java.lang.String r12, bfl.g r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof prl.q
            if (r0 == 0) goto L13
            r0 = r14
            prl.q r0 = (prl.q) r0
            int r1 = r0.f239347w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239347w = r1
            goto L18
        L13:
            prl.q r0 = new prl.q
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239347w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L80
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r14)
            com.revolut.trading.orders.data.network.services.TradingOrdersService r4 = r10.f239348a
            java.lang.String r7 = f4l.a.b(r13)
            r8 = 0
            r9 = 0
            r5 = r11
            r6 = r12
            efm.d0 r11 = r4.getOrderLimitsForPortfolio(r5, r6, r7, r8, r9)
            pqg.v r12 = new pqg.v
            r14 = 13
            r12.<init>(r14)
            prl.n r14 = new prl.n
            r2 = 0
            r14.<init>(r2, r12)
            r11.getClass()
            ufm.i r12 = new ufm.i
            r2 = 1
            r12.<init>(r11, r14, r2)
            n68.w r4 = new n68.w
            r9 = 25
            r8 = r13
            r7 = r6
            r6 = r5
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            po9.w r11 = new po9.w
            r13 = 26
            r11.<init>(r13, r4)
            ufm.f r13 = new ufm.f
            r14 = 3
            r13.<init>(r12, r11, r14)
            java.lang.String r11 = "doOnSuccess(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            ufm.n r11 = te0.w.i0(r13)
            r0.f239347w = r3
            java.lang.Object r14 = nim.a.b(r11, r0)
            if (r14 != r1) goto L80
            return r1
        L80:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: prl.r.b(java.lang.String, java.lang.String, bfl.g, gim.c):java.lang.Object");
    }
}
