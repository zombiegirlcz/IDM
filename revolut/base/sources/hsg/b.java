package hsg;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements dli.b {
    public final y70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rqi.c f155042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f155043q;

    public b(n stateMapper, y70.a appInstalledChecker, rqi.c googlePlayNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        Intrinsics.checkNotNullParameter(googlePlayNaviCommandFactory, "googlePlayNaviCommandFactory");
        this.o = appInstalledChecker;
        this.f155042p = googlePlayNaviCommandFactory;
        this.f155043q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f155043q;
    }
}
