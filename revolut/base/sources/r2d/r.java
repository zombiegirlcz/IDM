package r2d;

import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f251120h;
    public final xoj.a i;

    public r(s mapper, u router, p presentationModel, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f251120h = router;
        this.i = featuresInteractor;
    }

    public final pfm.a N(AlertsWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        pfm.a aVar = new pfm.a(((cpj.b) this.i).f(yoj.c.FAVOURITES, yoj.d.DISABLED), new r25.c(8, new q(this, widgetContext, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        if (aVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "view");
        super.h(null);
        throw null;
    }
}
