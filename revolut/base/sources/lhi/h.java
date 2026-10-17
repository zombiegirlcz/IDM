package lhi;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f195281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f195282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm0.c f195283c;
    public final lfm.c d;
    public final sri.m e;
    public final bng.b f;

    public h(xoj.a featuresInteractor, fk3.a configurationInteractor, zm0.c sessionProvider, lfm.c appDisposable, sri.m navigator, bng.b accountLockManager) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(accountLockManager, "accountLockManager");
        this.f195281a = featuresInteractor;
        this.f195282b = configurationInteractor;
        this.f195283c = sessionProvider;
        this.d = appDisposable;
        this.e = navigator;
        this.f = accountLockManager;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        mm0.o oVarD = ((cn0.g) this.f195283c).d();
        if (!(oVarD instanceof mm0.n) && !(oVarD instanceof mm0.p)) {
            return false;
        }
        efm.d0 d0VarA = this.f.a();
        le3.y yVar = new le3.y(new f(this, 0), 28);
        d0VarA.getClass();
        ufm.i iVar = new ufm.i(d0VarA, yVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.n nVarI = o70.a.i(iVar);
        f fVar = new f(this, 1);
        ufm.i iVar2 = new ufm.i(nVarI, new kye.e(new lak.l(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new a0d.g(23, fVar), new a0d.g(23, g.f195279a), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        te0.w.j0(this.d, iVar3);
        return false;
    }
}
