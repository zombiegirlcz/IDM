package d4f;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import java.time.Instant;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import skm.p0;
import vy5.d0;
import wf0.f0;
import wim.z;
import y3f.v;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements y2f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4f.a f111300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.f f111301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f111302c;
    public final ybl.k d;
    public final gte.a e;

    public p(f4f.a tradingTransactionsRepository, zjh.f tradeInitiatorDisplayNameResolver, q tradingTransactionsLoader, ybl.k tradingAccountsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingTransactionsRepository, "tradingTransactionsRepository");
        Intrinsics.checkNotNullParameter(tradeInitiatorDisplayNameResolver, "tradeInitiatorDisplayNameResolver");
        Intrinsics.checkNotNullParameter(tradingTransactionsLoader, "tradingTransactionsLoader");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f111300a = tradingTransactionsRepository;
        this.f111301b = tradeInitiatorDisplayNameResolver;
        this.f111302c = tradingTransactionsLoader;
        this.d = tradingAccountsInteractor;
        this.e = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (((t3f.o) r5.f111302c).f(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof d4f.i
            if (r0 == 0) goto L13
            r0 = r6
            d4f.i r0 = (d4f.i) r0
            int r1 = r0.f111289w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111289w = r1
            goto L18
        L13:
            d4f.i r0 = new d4f.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111289w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L51
        L36:
            yhm.o.b(r6)
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$InvestTransactionsFullHistory r6 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c
            gte.a r2 = r5.e
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 != 0) goto L48
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L48:
            r0.f111289w = r4
            java.lang.Object r6 = r5.g(r0)
            if (r6 != r1) goto L51
            goto L65
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L69
            r0.f111289w = r3
            d4f.q r6 = r5.f111302c
            t3f.o r6 = (t3f.o) r6
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L69:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d4f.p.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter.TradingTransactionsFilterImpl r18, java.lang.String r19, long r20, int r22, gim.c r23) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof d4f.j
            if (r2 == 0) goto L17
            r2 = r1
            d4f.j r2 = (d4f.j) r2
            int r3 = r2.f111292y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f111292y = r3
            goto L1c
        L17:
            d4f.j r2 = new d4f.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f111290w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f111292y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            yhm.o.b(r1)
            goto L7f
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            int r4 = r2.v
            long r6 = r2.u
            yhm.o.b(r1)
            goto L6e
        L3e:
            yhm.o.b(r1)
            r12 = r20
            r2.u = r12
            r14 = r22
            r2.v = r14
            r2.f111292y = r6
            f4f.a r1 = r0.f111300a
            r9 = r1
            y3f.v r9 = (y3f.v) r9
            r9.getClass()
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            y3f.p r8 = new y3f.p
            r15 = 0
            r16 = 0
            r10 = r18
            r11 = r19
            r8.<init>(r9, r10, r11, r12, r14, r15, r16)
            java.lang.Object r1 = skm.e0.J(r1, r8, r2)
            if (r1 != r3) goto L6a
            goto L7e
        L6a:
            r6 = r20
            r4 = r22
        L6e:
            java.util.List r1 = (java.util.List) r1
            r2.u = r6
            r2.v = r4
            r2.f111292y = r5
            zjh.f r4 = r0.f111301b
            java.io.Serializable r1 = r4.F(r1, r2)
            if (r1 != r3) goto L7f
        L7e:
            return r3
        L7f:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4f.p.e(com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter$TradingTransactionsFilterImpl, java.lang.String, long, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter.TradingTransactionsFilterImpl r18, java.lang.String r19, long r20, int r22, gim.c r23) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof d4f.k
            if (r2 == 0) goto L17
            r2 = r1
            d4f.k r2 = (d4f.k) r2
            int r3 = r2.f111295y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f111295y = r3
            goto L1c
        L17:
            d4f.k r2 = new d4f.k
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f111293w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f111295y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            yhm.o.b(r1)
            goto L7f
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            int r4 = r2.v
            long r6 = r2.u
            yhm.o.b(r1)
            goto L6e
        L3e:
            yhm.o.b(r1)
            r12 = r20
            r2.u = r12
            r14 = r22
            r2.v = r14
            r2.f111295y = r6
            f4f.a r1 = r0.f111300a
            r9 = r1
            y3f.v r9 = (y3f.v) r9
            r9.getClass()
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            y3f.p r8 = new y3f.p
            r15 = 0
            r16 = 1
            r10 = r18
            r11 = r19
            r8.<init>(r9, r10, r11, r12, r14, r15, r16)
            java.lang.Object r1 = skm.e0.J(r1, r8, r2)
            if (r1 != r3) goto L6a
            goto L7e
        L6a:
            r6 = r20
            r4 = r22
        L6e:
            java.util.List r1 = (java.util.List) r1
            r2.u = r6
            r2.v = r4
            r2.f111295y = r5
            zjh.f r4 = r0.f111301b
            java.io.Serializable r1 = r4.F(r1, r2)
            if (r1 != r3) goto L7f
        L7e:
            return r3
        L7f:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4f.p.f(com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter$TradingTransactionsFilterImpl, java.lang.String, long, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof d4f.l
            if (r0 == 0) goto L13
            r0 = r8
            d4f.l r0 = (d4f.l) r0
            int r1 = r0.f111296w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111296w = r1
            goto L18
        L13:
            d4f.l r0 = new d4f.l
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111296w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L49
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            ybl.k r8 = r7.d
            r2 = 0
            akg.n r8 = ybl.k.f(r8, r2, r3)
            d4f.m r4 = new d4f.m
            r5 = 2
            r6 = 0
            r4.<init>(r5, r6, r2)
            r0.f111296w = r3
            java.lang.Object r8 = vkm.q.y(r8, r4, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r8 = r8.getContent()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d4f.p.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (((t3f.o) r5.f111302c).h(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof d4f.n
            if (r0 == 0) goto L13
            r0 = r6
            d4f.n r0 = (d4f.n) r0
            int r1 = r0.f111297w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111297w = r1
            goto L18
        L13:
            d4f.n r0 = new d4f.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111297w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L51
        L36:
            yhm.o.b(r6)
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$InvestTransactionsFullHistory r6 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c
            gte.a r2 = r5.e
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 != 0) goto L48
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L48:
            r0.f111297w = r4
            java.lang.Object r6 = r5.g(r0)
            if (r6 != r1) goto L51
            goto L65
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L69
            r0.f111297w = r3
            d4f.q r6 = r5.f111302c
            t3f.o r6 = (t3f.o) r6
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L69:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d4f.p.h(gim.c):java.lang.Object");
    }

    public final jhi.k i(z2f.c params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        v vVar = (v) this.f111300a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.u(new o(this, null, 3), vVar.f310733j.b(params, loadingStrategy));
    }

    public final jhi.k j(z2f.g params, w4l.k loadingStrategy) {
        Flow flowB;
        Flow gVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        v vVar = (v) this.f111300a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        gte.a aVar = vVar.f310731g;
        FeatureWealthApi$Toggles.InvestTransactionsFullHistory investTransactionsFullHistory = FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c;
        Continuation continuation = null;
        if (((jte.d) aVar).c(investTransactionsFullHistory)) {
            j3f.f fVar = vVar.e;
            TradingTransactionsFilter.TradingTransactionsFilterImpl filter = com.revolut.shared.feature.wealth.models.transaction.a.a(params.a());
            Instant instantB = params.b();
            Long lValueOf = instantB != null ? Long.valueOf(instantB.toEpochMilli()) : null;
            Instant instantD = params.d();
            Long lValueOf2 = instantD != null ? Long.valueOf(instantD.toEpochMilli()) : null;
            int iC = params.c();
            fVar.getClass();
            Intrinsics.checkNotNullParameter(filter, "filter");
            d0 d0Var = new d0(fVar.h(j3f.f.c(filter, lValueOf, lValueOf2, iC)), 28);
            if (!(params instanceof z2f.f)) {
                flowB = vVar.a(d0Var, y2f.b.HISTORY_ONLY);
            } else if (loadingStrategy.equals(w4l.i.f294643c)) {
                flowB = vVar.a(d0Var, y2f.b.WAIT_FOR_INCREMENTAL_UPDATE);
            } else {
                t3f.o oVar = (t3f.o) vVar.f310732h;
                if (((jte.d) oVar.e).c(investTransactionsFullHistory)) {
                    a44.c cVar = new a44.c(ue0.e.R(oVar.d.f319260a, "TRADING_TRANSACTIONS_SYNC_STATE", z.d(o0.b(e4f.c.class))), 12);
                    p0 p0Var = p0.f264001a;
                    gVar = vkm.q.q(new qij.s(vkm.q.C(cVar, elm.f.f127540b), 17));
                } else {
                    gVar = new go.g(Boolean.TRUE, 2);
                }
                flowB = vkm.q.Q(vkm.q.P(gVar, 1), new f0(continuation, vVar, d0Var, 10));
            }
        } else {
            flowB = vVar.i.b(params, loadingStrategy);
        }
        return nim.a.u(new cuc.c(this, continuation, 16), flowB);
    }
}
