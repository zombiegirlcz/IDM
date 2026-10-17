package ae6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vil.f;
import vkm.q;
import vkm.z1;
import yd6.d;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d, hpa.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe6.a f3482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q06.d f3483c;
    public final z1 d;
    public final eo0.a e;

    public c(f appConsentInteractor, fe6.a extensionAuthInteractor, q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(appConsentInteractor, "appConsentInteractor");
        Intrinsics.checkNotNullParameter(extensionAuthInteractor, "extensionAuthInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f3481a = appConsentInteractor;
        this.f3482b = extensionAuthInteractor;
        this.f3483c = deeplinkParser;
        this.d = q.b(0, 6, null);
        this.e = eo0.a.f127858a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(ae6.c r7, gim.c r8) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ae6.b
            if (r0 == 0) goto L16
            r0 = r8
            ae6.b r0 = (ae6.b) r0
            int r1 = r0.f3480y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3480y = r1
            goto L1b
        L16:
            ae6.b r0 = new ae6.b
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f3478w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3480y
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            goto L8e
        L2e:
            r7 = move-exception
            goto L9a
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            int r2 = r0.v
            int r3 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            goto L56
        L40:
            yhm.o.b(r8)
            vil.f r8 = r7.f3481a     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r2 = 0
            r0.u = r2     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r0.v = r2     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r0.f3480y = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            xjl.b r8 = (xjl.b) r8     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            if (r8 != r1) goto L55
            goto L8d
        L55:
            r3 = r2
        L56:
            vil.e r8 = (vil.e) r8     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            boolean r6 = r8 instanceof vil.c     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            if (r6 == 0) goto L66
            yd6.b r7 = new yd6.b     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            vil.c r8 = (vil.c) r8     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            com.revolut.sso.api.models.ConsentChallenge$App r8 = r8.f289611a     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r7.<init>(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            return r7
        L66:
            boolean r6 = r8 instanceof vil.a     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            if (r6 != 0) goto L75
            boolean r8 = r8 instanceof vil.d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            if (r8 == 0) goto L6f
            goto L75
        L6f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r7.<init>()     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            throw r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
        L75:
            fe6.a r7 = r7.f3482b     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            pfm.z r7 = r7.b()     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            pfm.z r7 = ue0.e.F(r7, r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r0.u = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r0.v = r2     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            r0.f3480y = r4     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            java.lang.Object r8 = nim.a.b(r7, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            if (r8 != r1) goto L8e
        L8d:
            return r1
        L8e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            boolean r7 = r8.booleanValue()     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            if (r7 == 0) goto L99
            yd6.a r7 = yd6.a.f312639a     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> La4
            return r7
        L99:
            return r5
        L9a:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r5, r5, r7, r8)
            return r5
        La4:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ae6.c.d(ae6.c, gim.c):java.lang.Object");
    }

    @Override // eo0.b
    public final Object a(Continuation continuation) {
        Unit unit = Unit.f186387a;
        this.d.k(unit);
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // hpa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(ipa.j r6) {
        /*
            r5 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r6 = ipa.k.e(r6)
            r0 = 0
            if (r6 != 0) goto Ld
            goto L5e
        Ld:
            q06.d r1 = r5.f3483c
            s06.c r1 = (s06.c) r1
            boolean r2 = r1.c(r6)
            if (r2 != 0) goto L18
            goto L5e
        L18:
            jf0.c r6 = r1.d(r6)
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L25
            java.lang.String r3 = r6.e(r2)
            goto L26
        L25:
            r3 = r1
        L26:
            java.lang.String r4 = "challenges"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 != 0) goto L3f
            if (r6 == 0) goto L34
            java.lang.String r1 = r6.e(r2)
        L34:
            java.lang.String r6 = "access-consent"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 == 0) goto L3d
            goto L3f
        L3d:
            r6 = r0
            goto L40
        L3f:
            r6 = r2
        L40:
            vkm.z1 r1 = r5.d
            if (r6 == 0) goto L49
            kotlin.Unit r3 = kotlin.Unit.f186387a
            r1.k(r3)
        L49:
            if (r6 == 0) goto L5e
            kotlinx.coroutines.flow.StateFlow r6 = r1.l()
            wkm.y r6 = (wkm.y) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 <= 0) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ae6.c.b(ipa.j):boolean");
    }

    @Override // eo0.b
    public final eo0.a c() {
        return this.e;
    }
}
