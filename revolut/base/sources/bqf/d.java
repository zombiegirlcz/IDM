package bqf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f17824c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ay9.a f17825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f17826b;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.k;
        aVar.getClass();
        wi0.b bVar2 = wi0.b.f297771r;
        aVar.getClass();
        wi0.b bVar3 = wi0.b.f297776t;
        aVar.getClass();
        wi0.b bVar4 = wi0.b.U;
        aVar.getClass();
        wi0.b bVar5 = wi0.b.V;
        aVar.getClass();
        wi0.b bVar6 = wi0.b.W;
        aVar.getClass();
        wi0.b bVar7 = wi0.b.Y;
        aVar.getClass();
        wi0.b bVar8 = wi0.b.f297740e0;
        aVar.getClass();
        wi0.b bVar9 = wi0.b.f297750h0;
        aVar.getClass();
        wi0.b bVar10 = wi0.b.f297753k0;
        aVar.getClass();
        wi0.b bVar11 = wi0.b.f297760n0;
        aVar.getClass();
        wi0.b bVar12 = wi0.b.y0;
        aVar.getClass();
        wi0.b bVar13 = wi0.b.G0;
        aVar.getClass();
        wi0.b bVar14 = wi0.b.I0;
        aVar.getClass();
        wi0.b bVar15 = wi0.b.L0;
        aVar.getClass();
        wi0.b bVar16 = wi0.b.S0;
        aVar.getClass();
        wi0.b bVar17 = wi0.b.T0;
        aVar.getClass();
        wi0.b bVar18 = wi0.b.f297764o1;
        aVar.getClass();
        wi0.b bVar19 = wi0.b.f297781v1;
        aVar.getClass();
        wi0.b bVar20 = wi0.b.f297788x1;
        aVar.getClass();
        wi0.b bVar21 = wi0.b.f297791y1;
        aVar.getClass();
        wi0.b bVar22 = wi0.b.V1;
        aVar.getClass();
        wi0.b bVar23 = wi0.b.h2;
        aVar.getClass();
        wi0.b bVar24 = wi0.b.i2;
        aVar.getClass();
        wi0.b bVar25 = wi0.b.t2;
        aVar.getClass();
        wi0.b bVar26 = wi0.b.y2;
        aVar.getClass();
        wi0.b bVar27 = wi0.b.D2;
        aVar.getClass();
        wi0.b bVar28 = wi0.b.I2;
        aVar.getClass();
        wi0.b bVar29 = wi0.b.L2;
        aVar.getClass();
        wi0.b bVar30 = wi0.b.N2;
        aVar.getClass();
        wi0.b bVar31 = wi0.b.c2;
        aVar.getClass();
        wi0.b bVar32 = wi0.b.p2;
        aVar.getClass();
        wi0.b bVar33 = wi0.b.f297728a3;
        aVar.getClass();
        wi0.b bVar34 = wi0.b.f297772r0;
        aVar.getClass();
        wi0.b bVar35 = wi0.b.f297787x0;
        aVar.getClass();
        wi0.b bVar36 = wi0.b.L1;
        aVar.getClass();
        wi0.b bVar37 = wi0.b.T1;
        aVar.getClass();
        wi0.b bVar38 = wi0.b.C2;
        aVar.getClass();
        wi0.b[] elements = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33, bVar34, bVar35, bVar36, bVar37, bVar38, wi0.b.D3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f17824c = kotlin.collections.d.y0(elements);
    }

    public d(ay9.a settingsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f17825a = settingsInteractor;
        this.f17826b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, iy9.d r8, com.revolut.feature.transfer.models.transfer.TransferTrustData r9, gim.i r10) {
        /*
            r6 = this;
            boolean r0 = r9.f92306c
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r9 = r9.f92305b
            com.revolut.feature.transfer.models.transfer.RecipientTrustState$Trusted r1 = com.revolut.feature.transfer.models.transfer.RecipientTrustState.Trusted.f92301a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r9, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            if (r0 != 0) goto L38
        L10:
            r2 = r3
            goto L38
        L12:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState$Untrusted r1 = com.revolut.feature.transfer.models.transfer.RecipientTrustState.Untrusted.f92303a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r9, r1)
            if (r1 == 0) goto L1c
            r2 = r0
            goto L38
        L1c:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState$Unknown r1 = com.revolut.feature.transfer.models.transfer.RecipientTrustState.Unknown.f92302a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r9, r1)
            if (r1 == 0) goto L25
            goto L10
        L25:
            if (r9 != 0) goto L71
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to apply recipient trust while state is null"
            r9.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            r5 = 0
            rd0.d.a(r4, r5, r5, r9, r1)
        L38:
            if (r2 != 0) goto L3d
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L3d:
            com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting r9 = new com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting
            iy9.c r1 = iy9.c.TWO_FA_REQUIRED
            com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary r2 = new com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$Setting$Value$Binary
            r0 = r0 ^ r3
            r2.<init>(r0)
            r9.<init>(r1, r2)
            ay9.a r9 = r6.f17825a
            hy9.c r9 = (hy9.c) r9
            ay9.b r9 = r9.f156768a
            com.revolut.feature.payments.recipients.settings.models.a r0 = new com.revolut.feature.payments.recipients.settings.models.a
            r0.<init>(r7, r8, r1, r2)
            by9.j r9 = (by9.j) r9
            pfm.r r7 = r9.b(r0)
            java.lang.Object r7 = nim.a.a(r7, r10)
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L64
            goto L66
        L64:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L66:
            if (r7 != r8) goto L69
            goto L6b
        L69:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L6b:
            if (r7 != r8) goto L6e
            return r7
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L71:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bqf.d.a(java.lang.String, iy9.d, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.i):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, iy9.d r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bqf.d.b(java.lang.String, iy9.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bqf.c
            if (r0 == 0) goto L13
            r0 = r5
            bqf.c r0 = (bqf.c) r0
            int r1 = r0.f17823x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17823x = r1
            goto L18
        L13:
            bqf.c r0 = new bqf.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f17823x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bqf.d r0 = r0.u
            yhm.o.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ang.f r5 = r4.f17826b
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.u = r4
            r0.f17823x = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            do3.n r5 = (do3.n) r5
            r0.getClass()
            java.lang.String r0 = "user"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Set r0 = bqf.d.f17824c
            wi0.b r5 = do3.q.y(r5)
            boolean r5 = r0.contains(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bqf.d.c(gim.c):java.lang.Object");
    }
}
