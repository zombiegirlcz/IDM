package jvb;

import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductDestination;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductStatusDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.k;
import ip0.yc0;
import java.util.HashMap;
import jf0.c;
import jt2.d;
import ju0.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nyb.b;
import rfm.f0;
import rfm.h;
import rfm.u;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements evb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f178802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f178803b;

    public a(m navigator, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f178802a = navigator;
        this.f178803b = revPointsAvailabilityInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "exclusive-store");
    }

    public final k b(c cVar) {
        FeatureCommand featureCommand;
        boolean zF = ((b) this.f178803b).f();
        h hVar = h.f253943a;
        if (!zF) {
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        if (!Intrinsics.f(strE, "products") || d0.W(cVar.e(3))) {
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        String strE2 = cVar.e(3);
        if (Intrinsics.f(cVar.e(4), "status")) {
            featureCommand = new FeatureCommand(new KompotOverlayFeatureConfig(new RevPointsExclusiveStoreProductStatusDestination(strE2), yhi.b.BOTTOM_DIALOG, (Integer) null, 12));
        } else {
            String str = (String) map.get("productArticleId");
            String str2 = (String) map.get("productName");
            String str3 = (String) map.get("storyName");
            featureCommand = (str == null || d0.W(str)) ? (str2 == null || d0.W(str2) || str3 == null || d0.W(str3)) ? new FeatureCommand(new KompotOverlayFeatureConfig(new RevPointsExclusiveStoreProductDestination(new ExclusiveStoreInputData.Checkout(strE2)), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)) : new FeatureCommand(new KompotOverlayFeatureConfig(new RevPointsExclusiveStoreProductDestination(new ExclusiveStoreInputData.Onboarding(strE2, new ExclusiveStoreInputData.ArticleReference.ReferenceKey(str2, str3))), yhi.b.SOLID, (Integer) null, 8)) : new FeatureCommand(new KompotOverlayFeatureConfig(new RevPointsExclusiveStoreProductDestination(new ExclusiveStoreInputData.Onboarding(strE2, new ExclusiveStoreInputData.ArticleReference.ReferenceId(str))), yhi.b.SOLID, (Integer) null, 8));
        }
        u uVarG = k.g(featureCommand);
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        rfm.m mVar = new rfm.m(b(cVar), new f(8, new d(16)), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return nim.a.i(mVar, continuation);
    }

    @Override // jf0.d
    public final efm.d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        k kVarB = b(deeplink);
        f fVar = new f(6, new yc0(1, this.f178802a, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 17));
        dfm.c cVar = mfm.f.d;
        f0 f0VarO = new rfm.m(new rfm.y(kVarB, cVar, fVar, cVar, mfm.f.f205043c), new f(7, new d(15)), 1).e(Boolean.FALSE).o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        return f0VarO;
    }
}
