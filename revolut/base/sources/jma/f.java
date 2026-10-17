package jma;

import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f176498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u79.a f176499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sri.m f176500c;

    public f(x deeplinkHandler, u79.a offboardingInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(offboardingInteractor, "offboardingInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f176498a = deeplinkHandler;
        this.f176499b = offboardingInteractor;
        this.f176500c = navigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jma.e
            if (r0 == 0) goto L14
            r0 = r9
            jma.e r0 = (jma.e) r0
            int r1 = r0.f176497x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f176497x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            jma.e r0 = new jma.e
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f176497x
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            boolean r8 = r5.u
            yhm.o.b(r9)
            goto L5b
        L3b:
            yhm.o.b(r9)
            r5.u = r8
            r5.f176497x = r3
            u79.a r9 = r7.f176499b
            q79.d r9 = r9.f277717a
            r9.getClass()
            q03.m r1 = new q03.m
            r6 = 18
            r1.<init>(r9, r4, r4, r6)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r1, r5)
            if (r9 != r0) goto L5b
            goto La1
        L5b:
            s8l.d r9 = (s8l.d) r9
            s8l.c r1 = r9.f261072b
            if (r1 == 0) goto L64
            java.lang.String r1 = r1.f261070b
            goto L65
        L64:
            r1 = r4
        L65:
            if (r1 == 0) goto L84
            int r6 = r1.length()
            if (r6 != 0) goto L6e
            goto L84
        L6e:
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig$SelfTermination r2 = new com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig$SelfTermination
            s8l.c r9 = r9.f261072b
            if (r9 == 0) goto L78
            java.lang.String r4 = r9.f261069a
        L78:
            r2.<init>(r1, r4, r8)
            r0.<init>(r2)
            sri.m r8 = r7.f176500c
            r8.c(r0)
            goto La4
        L84:
            java.lang.String r1 = r9.f261071a
            int r1 = r1.length()
            if (r1 <= 0) goto La3
            java.lang.String r9 = r9.f261071a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            r5.u = r8
            r5.f176497x = r2
            wli.x r1 = r7.f176498a
            r3 = 0
            r6 = 2
            r2 = r9
            java.lang.Object r8 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto La2
        La1:
            return r0
        La2:
            return r8
        La3:
            r3 = 0
        La4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jma.f.a(boolean, gim.c):java.lang.Object");
    }
}
