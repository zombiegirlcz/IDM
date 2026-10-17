package zpl;

import akl.k;
import akl.l;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends n implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gu2.e f324330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f324331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f324332n;
    public final fi0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jn0.d f324333p;

    public g(gu2.e captchaViewControllerExtension, k challengesRepository, l claimRepository, fi0.b keyguardManager, jn0.d signatureInteractor) {
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(challengesRepository, "challengesRepository");
        Intrinsics.checkNotNullParameter(claimRepository, "claimRepository");
        Intrinsics.checkNotNullParameter(keyguardManager, "keyguardManager");
        Intrinsics.checkNotNullParameter(signatureInteractor, "signatureInteractor");
        this.f324330l = captchaViewControllerExtension;
        this.f324331m = challengesRepository;
        this.f324332n = claimRepository;
        this.o = keyguardManager;
        this.f324333p = signatureInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(zpl.g r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.security.PublicKey r16, gim.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zpl.g.Z2(zpl.g, java.lang.String, java.lang.String, java.lang.String, java.security.PublicKey, gim.c):java.lang.Object");
    }

    public static final Object b3(g gVar, String str, String str2, String str3, a5k.n nVar) throws Throwable {
        gVar.getClass();
        f fVar = new f(gVar, str3, str, str2, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, fVar, nVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public static final Object c3(g gVar, String str, String str2, i iVar) throws Throwable {
        gVar.getClass();
        c cVar = new c(gVar, str, str2, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
