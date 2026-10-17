package l7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements csh.f {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f192571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f192572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c70.a f192573c;

    public h(uc7.a homeFeedWidgetsEventDispatcher, a0 widgetsUiInteractor, c70.a clipboard, k widgetNaviProvider) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(widgetNaviProvider, "widgetNaviProvider");
        this.f192571a = homeFeedWidgetsEventDispatcher;
        this.f192572b = widgetsUiInteractor;
        this.f192573c = clipboard;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.PersonalPocket.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.PersonalPocket widgetContext2 = (HomeFeedWidgetContext.PersonalPocket) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            return pd.b.n(p0.f264003c, new g(event, this, null));
        }
        if (event instanceof p2) {
            return new pfm.h(new hc7.a(event, this, 29), 2);
        }
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new a09.a0(this, 29, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
