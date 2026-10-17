package osf;

import b9k.k;
import bsf.i;
import com.revolut.kompot.navigable.vc.ViewController;
import fim.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.l;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final asf.a f229336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zof.f f229337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f229338n;
    public final csf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final isf.e f229339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f229340q;

    public g(asf.a transferReasonsFeatureChecker, zof.f transferFeatureScreensProvider, k61.a transferInteractor, csf.b transferReasonsInteractor, isf.e reasonsRequestFactory, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(transferReasonsFeatureChecker, "transferReasonsFeatureChecker");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferReasonsInteractor, "transferReasonsInteractor");
        Intrinsics.checkNotNullParameter(reasonsRequestFactory, "reasonsRequestFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f229336l = transferReasonsFeatureChecker;
        this.f229337m = transferFeatureScreensProvider;
        this.f229338n = transferInteractor;
        this.o = transferReasonsInteractor;
        this.f229339p = reasonsRequestFactory;
        this.f229340q = userInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        if (r1 == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(osf.g r17, bsf.e r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: osf.g.c3(osf.g, bsf.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[PHI: r11
      0x00ba: PHI (r11v1 bsf.e) = (r11v0 bsf.e), (r11v3 bsf.e) binds: [B:23:0x005f, B:32:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bsf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(bsf.e r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof osf.e
            if (r0 == 0) goto L13
            r0 = r12
            osf.e r0 = (osf.e) r0
            int r1 = r0.f229332y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229332y = r1
            goto L18
        L13:
            osf.e r0 = new osf.e
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f229330w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229332y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r12)
            return r12
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            yhm.o.b(r12)
            return r12
        L3a:
            com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest r11 = r0.v
            bsf.e r2 = r0.u
            yhm.o.b(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L81
        L46:
            yhm.o.b(r12)
            asf.a r12 = r10.f229336l
            hsf.a r12 = (hsf.a) r12
            gte.a r12 = r12.f155038a
            com.revolut.feature.transfer_reasons.api.TransferReasonsToggles$CoFxDeclarations r2 = com.revolut.feature.transfer_reasons.api.TransferReasonsToggles$CoFxDeclarations.f92312c
            jte.d r12 = (jte.d) r12
            boolean r2 = r12.c(r2)
            if (r2 != 0) goto L61
            com.revolut.feature.transfer.core.api.TransferCoreApi$Toggles$IsraelRemittance r2 = com.revolut.feature.transfer.core.api.TransferCoreApi$Toggles.IsraelRemittance.f92114c
            boolean r12 = r12.c(r2)
            if (r12 == 0) goto Lba
        L61:
            isf.e r12 = r10.f229339p
            r12.getClass()
            com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest r12 = isf.e.a(r11)
            r0.u = r11
            r0.v = r12
            r0.f229332y = r5
            osf.b r2 = new osf.b
            r5 = 1
            r2.<init>(r10, r12, r6, r5)
            nki.a r5 = r10.e
            java.lang.String r7 = "GET_FX_REASONS_TASK_ID"
            java.lang.Object r2 = pu7.a.B(r5, r7, r2, r0)
            if (r2 != r1) goto L81
            goto Lc6
        L81:
            com.revolut.feature.transfer_reasons.models.reason.TransferReasons r2 = (com.revolut.feature.transfer_reasons.models.reason.TransferReasons) r2
            if (r2 == 0) goto L88
            java.util.List r5 = r2.f92439b
            goto L89
        L88:
            r5 = r6
        L89:
            boolean r5 = ue0.e.n(r5)
            if (r5 != 0) goto Lba
            r0.u = r6
            r0.v = r6
            r0.f229332y = r4
            com.revolut.feature.transfer_reasons.api.navigation.c r3 = new com.revolut.feature.transfer_reasons.api.navigation.c
            com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData$OpenForResult r4 = new com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData$OpenForResult
            dj0.d r5 = new dj0.d
            long r6 = r11.d()
            xi0.b r8 = r11.b()
            r5.<init>(r6, r8)
            com.revolut.feature.transfer.core.models.FundingSource r11 = r11.a()
            java.lang.String r11 = r11.f92240a
            r4.<init>(r5, r11, r2, r12)
            r3.<init>(r4)
            java.lang.Object r11 = r10.e3(r3, r0)
            if (r11 != r1) goto Lb9
            goto Lc6
        Lb9:
            return r11
        Lba:
            r0.u = r6
            r0.v = r6
            r0.f229332y = r3
            java.lang.Object r11 = r10.d3(r11, r0)
            if (r11 != r1) goto Lc7
        Lc6:
            return r1
        Lc7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: osf.g.Z2(bsf.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bsf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(bsf.e r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: osf.g.b3(bsf.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r2 == r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(bsf.e r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: osf.g.d3(bsf.e, gim.c):java.lang.Object");
    }

    public final Object e3(aii.e eVar, gim.c frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        ViewController viewControllerO2 = o2(eVar);
        o8c.e block = new o8c.e(lVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        viewControllerO2.l2(new k(lVar, 2));
        n.P2(this, viewControllerO2, null, null, 3);
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }
}
