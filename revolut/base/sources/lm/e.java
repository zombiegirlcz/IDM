package lm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.revolut.RevolutApplication;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import voi.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements yk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196835a;

    public /* synthetic */ e(i iVar, int i) {
        this.f196835a = i;
    }

    @Override // yk0.c
    public final Object get() {
        b60.a aVar;
        switch (this.f196835a) {
            case 0:
                RevolutApplication.Companion aVar2 = RevolutApplication.INSTANCE;
                phm.a aVar3 = (phm.a) j6.a.j(hf0.b.d, w9i.a.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w9i.a.class, " is not found"));
                }
                w9i.a aVar4 = (w9i.a) aVar.b();
                Context context = aVar4.f295734a;
                w9i.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                n80.e packageManager2 = new n80.e(packageManager);
                pn0.c signatureProvider = aVar4.f295735b.a();
                s.j(signatureProvider);
                com.revolut.analytics.tracking.v3.d diagnosticEventsTracker = aVar4.f295736c.f();
                s.j(diagnosticEventsTracker);
                fn0.a securityGuardianInteractor = new fn0.a();
                Intrinsics.checkNotNullParameter(packageManager2, "packageManager");
                Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
                Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
                Intrinsics.checkNotNullParameter(securityGuardianInteractor, "securityGuardianInteractor");
                gpk.c cVar = new gpk.c();
                cVar.f145463a = packageManager2;
                cVar.f145464b = signatureProvider;
                cVar.f145465c = diagnosticEventsTracker;
                return cVar;
            case 1:
                RevolutApplication.Companion aVar5 = RevolutApplication.INSTANCE;
                return ((g8b.a) ((ip.a) hf0.b.d.g()).b().It.get()).d();
            case 2:
                RevolutApplication.Companion aVar6 = RevolutApplication.INSTANCE;
                return i.c();
            case 3:
                i.a aVar7 = i.Companion;
                return ((ip.a) hf0.b.d.g()).b().E5().a();
            case 4:
                i.a aVar8 = i.Companion;
                return ((j51.a) ((asi.b) ((ip.a) hf0.b.d.g()).b().K.get())).b();
            case 5:
                i.a aVar9 = i.Companion;
                phm.a aVar10 = (phm.a) j6.a.j(hf0.b.d, jjl.a.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return ((jjl.a) aVar.b()).a();
                }
                throw new IllegalStateException(a0.d.q("Api ", jjl.a.class, " is not found"));
            default:
                i.a aVar11 = i.Companion;
                phm.a aVar12 = (phm.a) j6.a.j(hf0.b.d, qqk.b.class);
                aVar = aVar12 != null ? (b60.a) aVar12.get() : null;
                if (aVar != null) {
                    return ((qqk.b) aVar.b()).a();
                }
                throw new IllegalStateException(a0.d.q("Api ", qqk.b.class, " is not found"));
        }
    }
}
