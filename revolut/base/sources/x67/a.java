package x67;

import com.revolut.feature.giro.api.navigation.GiroCreationFlowDestination;
import com.revolut.feature.giro.api.navigation.GiroCreationFlowInputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import jf0.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import rd0.d;
import sri.m;
import t67.b;
import wp5.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v67.b f303051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f303052b;

    public a(v67.b featureChecker, m navigator) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f303051a = featureChecker;
        this.f303052b = navigator;
    }

    public static GiroCreationFlowDestination b(c cVar) {
        String str = (String) cVar.d.get("creditorId");
        if (str != null) {
            return new GiroCreationFlowDestination(new GiroCreationFlowInputData.WithCreditor(str));
        }
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Deeplink ", cVar.f173629c, " doesn't have 'creditorId' param"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "direct-debit");
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        GiroCreationFlowDestination giroCreationFlowDestinationB;
        if (Intrinsics.f(cVar.e(2), "giro") && this.f303051a.a() && Intrinsics.f(cVar.e(3), "create") && (giroCreationFlowDestinationB = b(cVar)) != null) {
            return new h(giroCreationFlowDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final d0 f(c cVar, boolean z) {
        GiroCreationFlowDestination giroCreationFlowDestinationB;
        if (!y.D(cVar, "deeplink", 2, "giro") || !this.f303051a.a()) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        FeatureCommand featureCommandF = null;
        if (Intrinsics.f(cVar.e(3), "create") && (giroCreationFlowDestinationB = b(cVar)) != null) {
            featureCommandF = u0.f(giroCreationFlowDestinationB);
        }
        if (featureCommandF == null) {
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        this.f303052b.c(featureCommandF);
        ufm.b bVarM3 = d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
        return bVarM3;
    }
}
