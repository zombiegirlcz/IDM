package tfh;

import c1l.e;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import elm.f;
import java.util.Map;
import jf0.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import skm.p0;
import sri.m;
import tcg.q;
import te0.w;
import wp5.y;
import ybl.i;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f270316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f270317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f270318c;
    public final e d;

    public c(m navigator, i productGroupAvailabilityInteractor, Map productsProviders, e tradingOnboardingStartCommandProvider, nlh.b wealthTradeCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        this.f270316a = navigator;
        this.f270317b = productGroupAvailabilityInteractor;
        this.f270318c = productsProviders;
        this.d = tradingOnboardingStartCommandProvider;
    }

    public static FeatureCommand b() {
        return jbb.a.a(ibb.c.f160141b, null, null, null, 14);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "private-markets");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        boolean zL = cVar.l();
        p0 p0Var = p0.f264001a;
        ufm.i iVar = new ufm.i(w.o0(f.f127540b, new b(cVar, this, zL, null)), new q(22, new a(this, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return nim.a.b(iVar, continuation);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p0 p0Var = p0.f264001a;
        ufm.i iVar = new ufm.i(new ufm.f(w.o0(f.f127540b, new b(deeplink, this, z, null)), new q(20, new td1.f(this, 13)), 3), new q(21, new a(0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
