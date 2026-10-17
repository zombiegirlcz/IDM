package xkl;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import bjl.p0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vfg.p;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Activity f306884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f306885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f306886n;
    public final gu2.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final akl.l f306887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f306888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jn0.d f306889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wl0.e f306890s;

    public i(Activity activity, l biometricPromptProviderFactory, p bioSignatureEligibilityChecker, gu2.e captchaViewControllerExtension, akl.l claimRepository, p0 dependenciesProvider, jn0.d signatureInteractor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(biometricPromptProviderFactory, "biometricPromptProviderFactory");
        Intrinsics.checkNotNullParameter(bioSignatureEligibilityChecker, "bioSignatureEligibilityChecker");
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(claimRepository, "claimRepository");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(signatureInteractor, "signatureInteractor");
        this.f306884l = activity;
        this.f306885m = biometricPromptProviderFactory;
        this.f306886n = bioSignatureEligibilityChecker;
        this.o = captchaViewControllerExtension;
        this.f306887p = claimRepository;
        this.f306888q = dependenciesProvider;
        this.f306889r = signatureInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(xkl.i r17, java.lang.String r18, java.lang.String r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkl.i.Z2(xkl.i, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public static final Object b3(i iVar, String str, wc2.b bVar) throws Throwable {
        iVar.getClass();
        h hVar = new h(iVar, str, null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, hVar, bVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // yji.n
    public final void F2() {
        wl0.e eVar = this.f306890s;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // yji.n
    public final void H2() {
        wl0.e eVar = this.f306890s;
        if (eVar != null) {
            Activity activity = this.f306884l;
            Intrinsics.i(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            eVar.c((FragmentActivity) activity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r1 == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.String r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r1 = r15 instanceof xkl.b
            if (r1 == 0) goto L13
            r1 = r15
            xkl.b r1 = (xkl.b) r1
            int r2 = r1.f306867y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.f306867y = r2
            goto L18
        L13:
            xkl.b r1 = new xkl.b
            r1.<init>(r11, r15)
        L18:
            java.lang.Object r0 = r1.f306865w
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f306867y
            r10 = 2
            r8 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r8) goto L35
            if (r2 != r10) goto L2d
            yhm.o.b(r0)
            r1 = r0
            r0 = r6
            goto L83
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            java.lang.String r2 = r1.v
            java.lang.String r4 = r1.u
            yhm.o.b(r0)
            r7 = r4
            r4 = r2
            r2 = r0
            r0 = r6
            goto L63
        L41:
            yhm.o.b(r0)
            xkl.d r2 = new xkl.d
            r7 = 2
            r3 = r11
            r5 = r12
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r6
            skm.p0 r3 = skm.p0.f264001a
            tkm.e r3 = zkm.o.f323119a
            tkm.e r3 = r3.e
            r1.u = r13
            r1.v = r14
            r1.f306867y = r8
            java.lang.Object r2 = skm.e0.J(r3, r2, r1)
            if (r2 != r9) goto L61
            goto L82
        L61:
            r7 = r13
            r4 = r14
        L63:
            r6 = r2
            java.security.Signature r6 = (java.security.Signature) r6
            if (r6 != 0) goto L69
            goto L87
        L69:
            tx0.z4 r2 = new tx0.z4
            r8 = 0
            r3 = 9
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            r1.u = r0
            r1.v = r0
            r1.f306867y = r10
            java.lang.Object r1 = skm.e0.J(r3, r2, r1)
            if (r1 != r9) goto L83
        L82:
            return r9
        L83:
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L88
        L87:
            return r0
        L88:
            com.revolut.sso.api.models.BioSignatureEvidence r0 = new com.revolut.sso.api.models.BioSignatureEvidence
            r2 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            java.lang.String r2 = "encodeToString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xkl.i.c3(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Object d3(String str, String str2, gim.c cVar) throws Throwable {
        d dVar = new d(this, str, str2, null, 3);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, dVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
