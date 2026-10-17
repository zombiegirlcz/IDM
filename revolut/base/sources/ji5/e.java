package ji5;

import com.revolut.retail.core.navigation.DummyCommand;
import cu8.r0;
import efm.d0;
import efm.r;
import jec.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xh5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f174356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f174357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f174358c;

    public e(xoj.a featuresInteractor, i cryptoOnboardingInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f174356a = featuresInteractor;
        this.f174357b = cryptoOnboardingInteractor;
        this.f174358c = kycRequiredActionTransformer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ji5.e r5, zg4.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ji5.b
            if (r0 == 0) goto L13
            r0 = r7
            ji5.b r0 = (ji5.b) r0
            int r1 = r0.f174351x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174351x = r1
            goto L18
        L13:
            ji5.b r0 = new ji5.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174351x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            zg4.b r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            cu8.r0 r5 = r5.f174358c
            r0.u = r6
            r0.f174351x = r4
            java.lang.Object r7 = ks8.m.b(r5, r0)
            if (r7 != r1) goto L48
            goto L5e
        L48:
            ks8.j r7 = (ks8.j) r7
            boolean r5 = r7 instanceof ks8.i
            if (r5 == 0) goto L53
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r5 = r7.f189312a
            return r5
        L53:
            r5 = 0
            r0.u = r5
            r0.f174351x = r3
            java.lang.Object r5 = r6.invoke(r0)
            if (r5 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ji5.e.b(ji5.e, zg4.b, gim.c):java.lang.Object");
    }

    public final d0 c() {
        d0 d0VarFirstOrError = zi0.c.q(f(), yh5.a.FEATURE_UNAVAILABLE).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final d0 d(ec5.c onboardingProcess) {
        Intrinsics.checkNotNullParameter(onboardingProcess, "onboardingProcess");
        ec5.h hVar = onboardingProcess.d;
        int i = hVar == null ? -1 : a.f174349a[hVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return w.o0(kotlin.coroutines.g.f186406a, new p(this, onboardingProcess, null, 8));
            }
            throw new NoWhenBranchMatchedException();
        }
        ufm.b bVarM = d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ji5.d
            if (r0 == 0) goto L13
            r0 = r7
            ji5.d r0 = (ji5.d) r0
            int r1 = r0.f174355w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174355w = r1
            goto L18
        L13:
            ji5.d r0 = new ji5.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174355w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            goto L4c
        L36:
            r7 = move-exception
            goto L51
        L38:
            r7 = move-exception
            goto L97
        L3a:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            efm.d0 r7 = r6.c()     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            r0.f174355w = r4     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            java.lang.Object r7 = nim.a.b(r7, r0)     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            if (r7 != r1) goto L4c
            goto L95
        L4c:
            yh5.a r7 = (yh5.a) r7     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L36 java.util.concurrent.CancellationException -> L38
            goto L57
        L51:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L57:
            boolean r2 = r7 instanceof yhm.n
            if (r2 == 0) goto L5c
            r7 = 0
        L5c:
            yh5.a r7 = (yh5.a) r7
            if (r7 != 0) goto L63
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L63:
            yh5.a r2 = yh5.a.ENABLED_AND_ONBOARDED
            if (r7 == r2) goto L6a
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L6a:
            ji5.i r7 = r6.f174357b
            r2 = 0
            akg.n r7 = r7.a(r2)
            jhi.a r2 = new jhi.a
            r4 = 16
            r2.<init>(r4)
            akg.n r7 = nim.a.v(r7, r2)
            jfb.v0 r2 = new jfb.v0
            r4 = 7
            r2.<init>(r4)
            jfb.v0 r4 = new jfb.v0
            r5 = 8
            r4.<init>(r5)
            jhi.b r7 = mo3.a.e(r7, r2, r4)
            r0.f174355w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L96
        L95:
            return r1
        L96:
            return r7
        L97:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ji5.e.e(gim.c):java.lang.Object");
    }

    public final r f() {
        return nim.a.w(((cpj.b) this.f174356a).k(yoj.c.CRYPTO, yoj.d.DISABLED), new jhi.a(14));
    }
}
