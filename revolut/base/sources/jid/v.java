package jid;

import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f174456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w39.b f174457b;

    public v(y80.a permissionProvider, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f174456a = permissionProvider;
        this.f174457b = locationInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:13:0x002e, B:40:0x00cd, B:37:0x00a1), top: B:45:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.v.a(gim.c):java.lang.Object");
    }

    public final pfm.z b() {
        rfm.m mVar = new rfm.m(((z39.b) this.f174457b).f319221b.c(), new jeg.h(new jhi.a(25), 9), 1);
        od0.i.Companion.getClass();
        f0 f0VarP = mVar.p(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        return ue0.e.I(f0VarP, h0.f322473a, new jhi.a(26));
    }
}
