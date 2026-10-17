package zl1;

import com.revolut.feature.apm.core.api.product.ApmAani;
import cul.l1;
import ix6.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1.b f323165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1.a f323166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz1.m f323167c;

    public l(vw1.b aliasRepository, fx1.a apmOnboardingRepository, iz1.m settingsRepository) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        this.f323165a = aliasRepository;
        this.f323166b = apmOnboardingRepository;
        this.f323167c = settingsRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(zl1.l r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof zl1.k
            if (r0 == 0) goto L16
            r0 = r6
            zl1.k r0 = (zl1.k) r0
            int r1 = r0.f323164w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f323164w = r1
            goto L1b
        L16:
            zl1.k r0 = new zl1.k
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323164w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            iz1.m r5 = r5.f323167c
            com.revolut.feature.apm.core.api.product.ApmAani r6 = com.revolut.feature.apm.core.api.product.ApmAani.f61807c
            r6.getClass()
            r0.f323164w = r3
            ikf.g r6 = new ikf.g
            r2 = 28
            java.lang.String r3 = "AANI"
            r6.<init>(r5, r3, r4, r2)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            o02.f r6 = (o02.f) r6
            java.util.List r5 = r6.f221102a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r5.next()
            r0 = r6
            o02.e r0 = (o02.e) r0
            o02.d r0 = r0.f221100a
            o02.d r1 = o02.d.DEFAULT_RECEIVER
            if (r0 != r1) goto L5d
            goto L72
        L71:
            r6 = r4
        L72:
            o02.e r6 = (o02.e) r6
            if (r6 == 0) goto L84
            o02.c r5 = r6.f221101b
            boolean r6 = r5 instanceof o02.b
            if (r6 == 0) goto L7f
            o02.b r5 = (o02.b) r5
            goto L80
        L7f:
            r5 = r4
        L80:
            if (r5 == 0) goto L84
            java.lang.String r4 = r5.f221099a
        L84:
            java.lang.String r5 = "REVOLUT"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zl1.l.a(zl1.l, gim.c):java.lang.Object");
    }

    public final Object b(boolean z, l1 l1Var) throws Throwable {
        ApmAani.f61807c.getClass();
        l0 l0Var = new l0(this.f323167c, "AANI", new o02.f(u.c(new o02.e(o02.d.DEFAULT_RECEIVER, new o02.b(z ? "REVOLUT" : "EXTERNAL")))), (Continuation) null, 2);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, l0Var, l1Var);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
