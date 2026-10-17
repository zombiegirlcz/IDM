package udj;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f279245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final asi.d f279246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fwj.p f279247c;

    public p(onh.b postActivationStatusProvider, asi.d sessionInteractor, fwj.p userOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(postActivationStatusProvider, "postActivationStatusProvider");
        Intrinsics.checkNotNullParameter(sessionInteractor, "sessionInteractor");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        this.f279245a = postActivationStatusProvider;
        this.f279246b = sessionInteractor;
        this.f279247c = userOnboardingInteractor;
    }

    public static boolean a(String str) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = Boolean.valueOf(Intrinsics.f(Uri.parse(str).getAuthority(), "action"));
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Object obj2 = Boolean.FALSE;
        if (objA instanceof yhm.n) {
            objA = obj2;
        }
        return ((Boolean) objA).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r10 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zli.b r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: udj.p.b(zli.b, gim.c):java.lang.Object");
    }

    public final boolean c(zli.b deeplink) {
        asi.c cVarA;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (vc.o.n(deeplink)) {
            return true;
        }
        return (vc.o.l(deeplink) || a(deeplink.f323278a) || (cVarA = this.f279246b.a()) == asi.c.ABSENT || cVarA == asi.c.SCOPED) ? false : true;
    }
}
