package yud;

import akb.s;
import akg.n;
import cxe.u;
import ft4.w;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.e0;
import skm.p0;
import w4l.k;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn2.c f317013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f317014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv5.c f317015c;
    public final yvd.c d;
    public final awd.c e;
    public final wsg.b f;

    public g(fn2.c stakingFeatureAvailabilityInteractor, ppk.f ratesInteractor, xv5.c cryptoBaseCurrencyInteractor, yvd.c stakingPocketsRepository, awd.c stakingProductsRepository, wsg.b walletsInteractor) {
        Intrinsics.checkNotNullParameter(stakingFeatureAvailabilityInteractor, "stakingFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoBaseCurrencyInteractor, "cryptoBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(stakingPocketsRepository, "stakingPocketsRepository");
        Intrinsics.checkNotNullParameter(stakingProductsRepository, "stakingProductsRepository");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        this.f317013a = stakingFeatureAvailabilityInteractor;
        this.f317014b = ratesInteractor;
        this.f317015c = cryptoBaseCurrencyInteractor;
        this.d = stakingPocketsRepository;
        this.e = stakingProductsRepository;
        this.f = walletsInteractor;
    }

    public final Flow a(String pocketId, xi0.b baseCurrency, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yvd.c cVar = this.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(cVar.i.b(pocketId, loadingStrategy), new b(this, baseCurrency, 0));
    }

    public final u b(xi0.b currency, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.y(boh.f.e(d(currency, loadingStrategy), new yrk.e(this, 6, currency, loadingStrategy)), new ysk.a(15));
    }

    public final Flow c(xi0.b currency, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(boh.f.e(d(currency, loadingStrategy), new a(this, loadingStrategy, 1)), new b(this, currency, 1));
    }

    public final n d(xi0.b currency, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(e(loadingStrategy), new vgc.b(18, currency));
    }

    public final Flow e(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(nim.a.v(rd0.e.b(((cpj.b) ((xoj.a) this.f317013a.f136517b)).k(yoj.c.STAKING, yoj.d.DISABLED)), new w(14)), new a(this, loadingStrategy, 0));
    }

    public final Object f(gim.c cVar) throws Throwable {
        awd.c cVar2 = this.e;
        cVar2.getClass();
        s sVar = new s(cVar2, null, 27);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, sVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r12.f(true, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dj0.d r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof yud.e
            if (r0 == 0) goto L13
            r0 = r15
            yud.e r0 = (yud.e) r0
            int r1 = r0.f317010w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317010w = r1
            goto L18
        L13:
            yud.e r0 = new yud.e
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317010w
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r15)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2e
            goto L73
        L2b:
            r0 = move-exception
            r12 = r0
            goto L76
        L2e:
            r0 = move-exception
            r12 = r0
            goto L82
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            yhm.o.b(r15)
            goto L68
        L3d:
            yhm.o.b(r15)
            zvd.a r8 = new zvd.a
            long r5 = r12.f115082a
            xi0.b r12 = r12.f115083b
            r8.<init>(r5, r13, r12)
            r0.f317010w = r4
            yvd.c r6 = r11.d
            r6.getClass()
            y65.l r5 = new y65.l
            r10 = 15
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L63
            goto L65
        L63:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L65:
            if (r12 != r1) goto L68
            goto L72
        L68:
            wsg.b r12 = r11.f     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2e
            r0.f317010w = r3     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2e
            java.lang.Object r12 = r12.f(r4, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2e
            if (r12 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2e
            goto L7f
        L76:
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r9, r12, r13)
        L7f:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L82:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yud.g.g(dj0.d, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r10.f(true, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(dj0.d r9, java.lang.String r10, java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof yud.f
            if (r0 == 0) goto L13
            r0 = r12
            yud.f r0 = (yud.f) r0
            int r1 = r0.f317012x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317012x = r1
            goto L18
        L13:
            yud.f r0 = new yud.f
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317012x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            dj0.d r9 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            goto L74
        L2d:
            r10 = move-exception
            goto L77
        L2f:
            r9 = move-exception
            goto L81
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            dj0.d r9 = r0.u
            yhm.o.b(r12)
            goto L67
        L3f:
            yhm.o.b(r12)
            zvd.c r12 = new zvd.c
            long r6 = r9.f115082a
            r12.<init>(r6, r11, r10)
            r0.u = r9
            r0.f317012x = r4
            yvd.c r10 = r8.d
            r10.getClass()
            yv1.k r11 = new yv1.k
            r11.<init>(r10, r12, r5, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r11, r0)
            if (r10 != r1) goto L62
            goto L64
        L62:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L64:
            if (r10 != r1) goto L67
            goto L73
        L67:
            wsg.b r10 = r8.f     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            r0.u = r9     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            r0.f317012x = r3     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            java.lang.Object r10 = r10.f(r4, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            if (r10 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L2f
            return r9
        L77:
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r12 = rd0.c.ERROR
            rd0.d.a(r12, r5, r5, r10, r11)
            return r9
        L81:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yud.g.h(dj0.d, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
