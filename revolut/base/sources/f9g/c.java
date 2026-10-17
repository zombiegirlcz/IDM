package f9g;

import efm.d0;
import f2i.o;
import i9g.v;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.b f132940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nei.c f132941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sri.m f132942c;
    public final p8g.c d;

    public c(p8g.b travelHotelsDropoffSearchInteractor, nei.c travelHotelsDropoffSearchNaviCommandProvider, sri.m navigator, p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsDropoffSearchInteractor, "travelHotelsDropoffSearchInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsDropoffSearchNaviCommandProvider, "travelHotelsDropoffSearchNaviCommandProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f132940a = travelHotelsDropoffSearchInteractor;
        this.f132941b = travelHotelsDropoffSearchNaviCommandProvider;
        this.f132942c = navigator;
        this.d = travelHotelsFeatureInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "hotels");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9g.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarFirstOrError = ((v) this.d).d().firstOrError();
        o oVar = new o(new f0d.l(this, deeplink, 14), 24);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, oVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
