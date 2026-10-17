package k5l;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements z87.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f181564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yoj.c[] f181565b;

    public b(xoj.a featuresInteractor, yoj.c... featureNames) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureNames, "featureNames");
        this.f181564a = featuresInteractor;
        this.f181565b = featureNames;
    }

    @Override // z87.d
    public final r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        r rVarB = ((cpj.b) this.f181564a).f107969a.b(false);
        yoj.f.Companion.getClass();
        r map = zi0.c.q(rVarB, yoj.f.f315685b).map(new k3k.l(new k5e.k(this, 2), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarSwitchMap = ue0.e.E(map, Boolean.FALSE).switchMap(new k3k.l(new k1.a(this, searchQuery, 26), 8));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
