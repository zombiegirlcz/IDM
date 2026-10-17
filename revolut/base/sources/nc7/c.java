package nc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qtd.b f214158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc7.a f214159b;

    public c(qtd.b travelModeWidgetHandler, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(travelModeWidgetHandler, "travelModeWidgetHandler");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f214158a = travelModeWidgetHandler;
        this.f214159b = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Personal.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        return pd.b.n(p0.f264003c, new b(event, this, widgetContext2, null));
    }
}
