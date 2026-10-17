package kc7;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import efm.r;
import k9h.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements o1d.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f182667a;

    public c(xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f182667a = featuresInteractor;
    }

    @Override // o1d.a
    public final Flow a() {
        yoj.c cVar = yoj.c.FAVOURITES;
        cpj.b bVar = (cpj.b) this.f182667a;
        r map = w.l(bVar.l(cVar), bVar.l(yoj.c.FAVOURITES_HOME_ALERTS_WIDGET)).distinctUntilChanged().map(new k64.a(26, new d(22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return e.b(map);
    }

    @Override // o1d.a
    public final AlertsWidgetContext b() {
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey[] elements = {y1d.a.f310359c, y1d.a.d, y1d.a.f310358b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new AlertsWidgetContext(kotlin.collections.d.y0(elements), null, null, null, u.c(mgd.d.ACTIVE), null, 7918);
    }
}
