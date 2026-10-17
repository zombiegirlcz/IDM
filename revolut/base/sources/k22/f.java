package k22;

import cli.g;
import cli.k;
import cli.y;
import cli.z;
import cu8.r0;
import ji1.m;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements z {
    public final d12.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f180305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f180306q;

    public f(d12.b extension, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = extension;
        this.f180305p = kycRequiredActionTransformer;
        this.f180306q = mra.d.b(this, k.f25028a, new a54.b(16), null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r5.J2(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(k22.f r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof k22.d
            if (r0 == 0) goto L13
            r0 = r6
            k22.d r0 = (k22.d) r0
            int r1 = r0.f180303w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180303w = r1
            goto L18
        L13:
            k22.d r0 = new k22.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180303w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            cu8.r0 r6 = r5.f180305p
            r0.f180303w = r4
            java.lang.Object r6 = ks8.m.b(r6, r0)
            if (r6 != r1) goto L44
            goto L67
        L44:
            ks8.j r6 = (ks8.j) r6
            boolean r2 = r6 instanceof ks8.i
            if (r2 == 0) goto L5b
            r5.B2()
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.C1(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5b:
            boolean r6 = r6 instanceof ks8.j.a
            if (r6 == 0) goto L6b
            r0.f180303w = r3
            java.lang.Object r5 = r5.J2(r0)
            if (r5 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L6b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k22.f.I2(k22.f, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 24), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof k22.e
            if (r0 == 0) goto L14
            r0 = r8
            k22.e r0 = (k22.e) r0
            int r1 = r0.f180304w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f180304w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            k22.e r0 = new k22.e
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f180304w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r8)
            goto L59
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            dx6.m r3 = new dx6.m
            r8 = 5
            d12.b r1 = r7.o
            r3.<init>(r1, r8)
            ack.n r4 = new ack.n
            r8 = 29
            r4.<init>(r8)
            iyi.j r5 = new iyi.j
            r8 = 0
            r1 = 15
            r5.<init>(r7, r8, r1)
            r6.f180304w = r2
            tji.f r1 = r7.X()
            r2 = 0
            java.lang.Object r8 = n14.k.P(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L59
            return r0
        L59:
            nii.e r8 = (nii.e) r8
            r7.s1()
            boolean r0 = r8 instanceof nii.c
            if (r0 == 0) goto L66
            r7.B2()
            goto L73
        L66:
            boolean r0 = r8 instanceof nii.d
            if (r0 == 0) goto L76
            nii.d r8 = (nii.d) r8
            java.lang.Object r8 = r8.f216133a
            aii.r r8 = (aii.r) r8
            r7.C2(r8)
        L73:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L76:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k22.f.J2(gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final g getState() {
        return this.f180306q;
    }
}
