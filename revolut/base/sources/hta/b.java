package hta;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import hs4.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mfm.f;
import rfm.j;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ysa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f155337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ai5.b f155338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f155339c;

    public b(m navigator, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f155337a = navigator;
        this.f155338b = cryptoNavigationInterceptor;
        this.f155339c = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "competition") && !d0.W(cVar.e(3));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        efm.d0 d0VarB = this.f155338b.b(cVar.f173629c);
        hp5.b bVar = new hp5.b(new a(cVar), 21);
        d0VarB.getClass();
        j jVar = new j(d0VarB, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        rfm.m mVar = new rfm.m(jVar, new hp5.b(new hqk.a(16), 22), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return nim.a.i(mVar, continuation);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        efm.d0 d0VarB = this.f155338b.b(deeplink.f173629c);
        hp5.b bVar = new hp5.b(new a(deeplink), 21);
        d0VarB.getClass();
        j jVar = new j(d0VarB, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        hp5.b bVar2 = new hp5.b(new l(this, 14), 19);
        dfm.c cVar = f.d;
        return new rfm.m(new rfm.y(jVar, cVar, bVar2, cVar, f.f205043c), new hp5.b(new hqk.a(15), 20), 1).e(Boolean.TRUE).o();
    }
}
