package pyj;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import pth.l;
import pyc.p;
import pyc.r;
import rfm.j;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements iyj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f240840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f240841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f240842c;

    public a(m navigator, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f240840a = navigator;
        this.f240841b = featuresInteractor;
        this.f240842c = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "feature") && Intrinsics.f(cVar.e(2), "learn");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        j jVar = new j(((cpj.b) this.f240841b).e(yoj.c.LEARN, yoj.d.DISABLED), new r(21, new l(this, 19)), 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return nim.a.i(ue0.e.x(jVar), continuation);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(((cpj.b) this.f240841b).e(yoj.c.LEARN, yoj.d.DISABLED), new r(19, new p(this)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.b bVarM = d0.m(DummyCommand.f98635a);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        pfm.a aVar = new pfm.a(ue0.e.C(iVar, bVarM), new r(20, new l3d.f(z, this, 22)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        z zVarD = aVar.D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
