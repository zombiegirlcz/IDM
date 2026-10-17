package ael;

import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 implements ybl.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdl.y0 f3647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4f.s f3648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.c f3649c;
    public final ybl.b d;
    public final CoroutineScope e;
    public final vbl.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f3650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f3651h;
    public final Set i;

    public q0(vdl.y0 repository, d4f.s wealthFeaturesInteractor, zjh.c registeredIdentityInteractor, ybl.b instrumentTickerInteractor, CoroutineScope coroutineScope, vbl.b wealthFeatureToggleProvider, Map productsProviders) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(wealthFeaturesInteractor, "wealthFeaturesInteractor");
        Intrinsics.checkNotNullParameter(registeredIdentityInteractor, "registeredIdentityInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(wealthFeatureToggleProvider, "wealthFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        this.f3647a = repository;
        this.f3648b = wealthFeaturesInteractor;
        this.f3649c = registeredIdentityInteractor;
        this.d = instrumentTickerInteractor;
        this.e = coroutineScope;
        this.f = wealthFeatureToggleProvider;
        this.f3650g = productsProviders;
        ybl.p[] elements = {ybl.p.TRADING, ybl.p.ROBO, ybl.p.SAVINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f3651h = kotlin.collections.d.y0(elements);
        ybl.a aVar = (ybl.a) productsProviders.get(cfl.p.PRIVATE_BANK);
        Continuation continuation = null;
        Set setB = aVar != null ? aVar.b() : null;
        this.i = setB == null ? zhm.h0.f322473a : setB;
        skm.e0.C(coroutineScope, null, skm.d0.UNDISPATCHED, new a01.e(this, continuation, 20), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r0 == r2) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType r14, java.lang.String r15, java.lang.String r16, gim.c r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof ael.o0
            if (r1 == 0) goto L15
            r1 = r0
            ael.o0 r1 = (ael.o0) r1
            int r2 = r1.f3644x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f3644x = r2
            goto L1a
        L15:
            ael.o0 r1 = new ael.o0
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f3644x
            vdl.y0 r5 = r13.f3647a
            r11 = 2
            r12 = 1
            if (r3 == 0) goto L3f
            if (r3 == r12) goto L3b
            if (r3 != r11) goto L33
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r14 = r1.u
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L30
            goto L75
        L30:
            r0 = move-exception
            r15 = r0
            goto L7a
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            yhm.o.b(r0)
            goto L5e
        L3f:
            yhm.o.b(r0)
            r1.f3644x = r12
            r5.getClass()
            sxe.g r4 = new sxe.g
            r9 = 0
            r10 = 19
            r6 = r14
            r8 = r15
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r14, r4, r1)
            if (r0 != r2) goto L5e
            goto L74
        L5e:
            r14 = r0
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r14 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r14
            yhm.m$a r15 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L30
            r1.u = r14     // Catch: java.lang.Throwable -> L30
            r1.f3644x = r11     // Catch: java.lang.Throwable -> L30
            x4l.c r15 = r5.f288070b     // Catch: java.lang.Throwable -> L30
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L30
            java.lang.Object r15 = r15.d(r0, r12, r1)     // Catch: java.lang.Throwable -> L30
            if (r15 != r2) goto L72
            r0 = r15
        L72:
            if (r0 != r2) goto L75
        L74:
            return r2
        L75:
            kotlin.Unit r15 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L30
            yhm.m$a r15 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L30
            return r14
        L7a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.o.a(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.q0.m(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final akg.n n(Set accountTypes, w4l.k loadingStrategy, cfl.n accountHolderTypeFilter) {
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(ybl.k.k(this, loadingStrategy, null, accountHolderTypeFilter, 2), new a83.d0(2, accountTypes));
    }

    public final akg.n o(String portfolioId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(ybl.k.k(this, loadingStrategy, null, cfl.k.f23744a, 2), new a31.g(18, portfolioId, this));
    }

    public final Flow p(w4l.k kVar, cfl.i iVar, cfl.n nVar) {
        Flow flowV;
        Flow flowA = this.f3648b.a(this.f3651h);
        if (Intrinsics.f(iVar, cfl.f.f23741a)) {
            od0.i.Companion.getClass();
            flowV = zi0.c.i(od0.i.f224256b);
        } else if (iVar instanceof cfl.h) {
            od0.h hVar = od0.i.Companion;
            String str = ((cfl.h) iVar).f23743a;
            hVar.getClass();
            flowV = zi0.c.i(od0.h.a(str));
        } else {
            if (!Intrinsics.f(iVar, cfl.g.f23742a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = 22;
            flowV = nim.a.v(nim.a.v(((ang.f) this.f3649c.f322830b).j(w4l.h.f294642c), new d27.d0(i)), new aed.a(i));
        }
        return boh.f.e(zh9.u0.m(flowA, flowV), new a31.m(this, 12, kVar, nVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r(false, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r11, com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ael.p0
            if (r0 == 0) goto L13
            r0 = r13
            ael.p0 r0 = (ael.p0) r0
            int r1 = r0.f3646w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3646w = r1
            goto L18
        L13:
            ael.p0 r0 = new ael.p0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3646w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L64
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            goto L5a
        L36:
            yhm.o.b(r13)
            r0.f3646w = r4
            vdl.y0 r5 = r10.f3647a
            r5.getClass()
            uvf.b r4 = new uvf.b
            r9 = 18
            r8 = 0
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L57:
            if (r11 != r1) goto L5a
            goto L63
        L5a:
            r0.f3646w = r3
            r11 = 0
            java.lang.Object r11 = r10.r(r11, r0)
            if (r11 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.q0.q(java.lang.String, com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode, gim.c):java.lang.Object");
    }

    public final Object r(boolean z, gim.c cVar) {
        x4l.c cVar2 = this.f3647a.f288070b;
        Unit unit = Unit.f186387a;
        Object objD = cVar2.d(unit, z, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = unit;
        }
        return objD == aVar ? objD : unit;
    }
}
