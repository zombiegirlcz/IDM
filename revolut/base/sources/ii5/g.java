package ii5;

import cu8.r0;
import ji5.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vh5.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xoj.a f161584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f161585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f161586n;
    public final r0 o;

    public g(xoj.a featuresInteractor, i cryptoOnboardingInteractor, m navigator, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f161584l = featuresInteractor;
        this.f161585m = cryptoOnboardingInteractor;
        this.f161586n = navigator;
        this.o = kycRequiredActionTransformer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum c3(ii5.g r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof ii5.f
            if (r0 == 0) goto L16
            r0 = r5
            ii5.f r0 = (ii5.f) r0
            int r1 = r0.f161583w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f161583w = r1
            goto L1b
        L16:
            ii5.f r0 = new ii5.f
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161583w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            xoj.a r4 = r4.f161584l
            yoj.c r5 = yoj.c.CRYPTO
            efm.d0 r4 = xoj.a.c(r4, r5)
            r0.f161583w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            yoj.a r5 = (yoj.a) r5
            boolean r4 = yoj.b.k(r5)
            if (r4 == 0) goto L51
            yh5.a r4 = yh5.a.ENABLED_AND_ONBOARDED
            return r4
        L51:
            boolean r4 = yoj.b.l(r5)
            if (r4 == 0) goto L5a
            yh5.a r4 = yh5.a.ONBOARDING_REQUIRED
            return r4
        L5a:
            yh5.a r4 = yh5.a.FEATURE_UNAVAILABLE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.g.c3(ii5.g, gim.c):java.lang.Enum");
    }

    @Override // vh5.a
    public final Object Z2(boolean z, yh5.d dVar, Function1 function1, Continuation continuation) {
        Object objD3 = d3(z, new e(this, z, dVar, function1, null), continuation);
        return objD3 == fim.a.COROUTINE_SUSPENDED ? objD3 : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r9.invoke(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r9.invoke(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(boolean r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ii5.d
            if (r0 == 0) goto L13
            r0 = r10
            ii5.d r0 = (ii5.d) r0
            int r1 = r0.f161579y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161579y = r1
            goto L18
        L13:
            ii5.d r0 = new ii5.d
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f161577w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161579y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            goto L8a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r10)
            goto L7a
        L3a:
            boolean r8 = r0.u
            gim.i r9 = r0.v
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            yhm.o.b(r10)
            goto L5b
        L44:
            yhm.o.b(r10)
            if (r8 == 0) goto L7d
            r10 = r9
            gim.i r10 = (gim.i) r10
            r0.v = r10
            r0.u = r8
            r0.f161579y = r5
            cu8.r0 r10 = r7.o
            java.lang.Object r10 = ks8.m.b(r10, r0)
            if (r10 != r1) goto L5b
            goto L89
        L5b:
            ks8.j r10 = (ks8.j) r10
            boolean r2 = r10 instanceof ks8.i
            if (r2 == 0) goto L6d
            ks8.i r10 = (ks8.i) r10
            com.revolut.retail.core.navigation.FeatureCommand r8 = r10.f189312a
            sri.m r9 = r7.f161586n
            r9.c(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L6d:
            r0.v = r6
            r0.u = r8
            r0.f161579y = r4
            java.lang.Object r8 = r9.invoke(r0)
            if (r8 != r1) goto L7a
            goto L89
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7d:
            r0.v = r6
            r0.u = r8
            r0.f161579y = r3
            java.lang.Object r8 = r9.invoke(r0)
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.g.d3(boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
