package xka;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.product_article.api.ProductArticleApi$Toggles;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import xec.c0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends oki.h implements t {

    @NotNull
    private static final v Companion = new v();
    public final ProductArticleDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kka.a f306654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wli.x f306655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f80.a f306656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gdb.b f306657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f306658t;
    public final zja.b u;
    public final Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f306659w;

    public z(b0 stateMapper, ProductArticleDetailsControllerContract$InputData inputData, kka.a productArticleInteractor, wli.x deeplinkHandler, f80.a uriHelper, gdb.b complianceFeatureDisclaimerInteractor, b analyticsContextProvider, zja.b productArticleToggles) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(complianceFeatureDisclaimerInteractor, "complianceFeatureDisclaimerInteractor");
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(productArticleToggles, "productArticleToggles");
        this.o = inputData;
        this.f306654p = productArticleInteractor;
        this.f306655q = deeplinkHandler;
        this.f306656r = uriHelper;
        this.f306657s = complianceFeatureDisclaimerInteractor;
        this.f306658t = analyticsContextProvider;
        this.u = productArticleToggles;
        this.v = te0.w.y0(new xge.h(this, 1));
        this.f306659w = mra.d.b(this, new r(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void I2(p action) {
        aka.a aVar;
        CryptoFcaRisksDestination cryptoFcaRisksDestinationD;
        Intrinsics.checkNotNullParameter(action, "action");
        cka.a aVar2 = 0;
        aVar2 = 0;
        if (action instanceof j) {
            l2(new c0(this, ((j) action).f306638a, aVar2, 22), new yi5.b(26));
            return;
        }
        boolean zF = Intrinsics.f(action, i.f306637a);
        cli.y yVar = this.f306659w;
        if (zF) {
            r rVar = (r) ((j2) yVar.f22677a).getValue();
            boolean z = rVar.f306646a.getContent() == null && rVar.f306646a.getError() != null;
            if (this.o.e) {
                C2(z ? s.NOT_FOUND : s.CLOSE_CLICK);
                return;
            } else {
                l2(new mt8.b(this, z, aVar2, 16), new yi5.b(26));
                return;
            }
        }
        if (Intrinsics.f(action, n.f306642a)) {
            l2(new x(this, aVar2, 1), new yi5.b(26));
            return;
        }
        if (Intrinsics.f(action, l.f306640a)) {
            l2(new x(this, aVar2, 0), new yi5.b(26));
            return;
        }
        if (!(action instanceof m)) {
            if (!(action instanceof o)) {
                if (!(action instanceof k)) {
                    throw new NoWhenBranchMatchedException();
                }
                J2(((k) action).f306639a);
                return;
            } else {
                ty0.a aVar3 = ((o) action).f306643a;
                if (((Boolean) this.v.getValue()).booleanValue()) {
                    C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.f306656r).f(aVar3.f275445a), 0, null, 494));
                    return;
                }
                return;
            }
        }
        ty0.a clickData = ((m) action).f306641a;
        q qVar = (q) ((r) ((j2) yVar.f22677a).getValue()).f306646a.getContent();
        if (qVar == null || (aVar = qVar.f306644a) == null) {
            return;
        }
        if (aVar instanceof aka.l) {
            if (((jte.d) ((gdb.c) this.u).f143125a).c(ProductArticleApi$Toggles.PADisclaimers.f81262c) && !((aka.l) aVar).i.isEmpty()) {
                J2(clickData);
                return;
            }
        }
        List complianceFeatures = aVar.p();
        gdb.b bVar = this.f306657s;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(complianceFeatures, "complianceFeatures");
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (complianceFeatures.contains("CRYPTO") && (cryptoFcaRisksDestinationD = ((gi5.d) bVar.f143124a).d(clickData)) != null) {
            aVar2 = new cka.a(u0.f(cryptoFcaRisksDestinationD));
        }
        if (aVar2 != 0) {
            C1(u0.b(aVar2.f24799a));
        }
    }

    public final void J2(ty0.a aVar) {
        C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) this.f306656r).f(aVar.f275445a), 0, null, 494));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void T1(long j2) {
        Flow flowE;
        boolean zBooleanValue = ((Boolean) this.v.getValue()).booleanValue();
        ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = this.o;
        kka.a aVar = this.f306654p;
        if (zBooleanValue) {
            ProductArticleParams params = productArticleDetailsControllerContract$InputData.f81288a;
            kka.h hVar = (kka.h) aVar;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowE = a.a.k(boh.f.e(nim.a.v(hVar.f(params.f81274a), new ke7.v(params, 12)), new kka.b(hVar, 0)), new xe7.a(this, 12));
        } else {
            ProductArticleParams params2 = productArticleDetailsControllerContract$InputData.f81288a;
            kka.h hVar2 = (kka.h) aVar;
            hVar2.getClass();
            Intrinsics.checkNotNullParameter(params2, "params");
            w4l.i loadingStrategy2 = w4l.i.f294643c;
            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
            flowE = boh.f.e(nim.a.v(hVar2.f(params2.f81274a), new ke7.v(params2, 12)), new kka.b(hVar2, 1));
        }
        Continuation continuation = null;
        yji.l.b1(this, nim.a.u(new xge.f(this, continuation, 3), flowE), null, new c0(this, continuation, 23), 3);
        n2(new x(this, continuation, 2), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f306659w;
    }
}
