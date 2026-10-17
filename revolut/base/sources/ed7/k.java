package ed7;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f124934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f124935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn2.c f124936c;
    public final gkc.b d;
    public final a0 e;
    public final xn.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ash.d f124937g;

    public k(k39.b navigationCommandsDispatcher, x deeplinkHandler, fn2.c shopsActivationInteractor, gkc.b rewardsWidgetInteractor, a0 widgetsUiInteractor, xn.c adsUrlDecoratorInteractor, ash.d widgetsCommonEventDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(shopsActivationInteractor, "shopsActivationInteractor");
        Intrinsics.checkNotNullParameter(rewardsWidgetInteractor, "rewardsWidgetInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(adsUrlDecoratorInteractor, "adsUrlDecoratorInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f124934a = navigationCommandsDispatcher;
        this.f124935b = deeplinkHandler;
        this.f124936c = shopsActivationInteractor;
        this.d = rewardsWidgetInteractor;
        this.e = widgetsUiInteractor;
        this.f = adsUrlDecoratorInteractor;
        this.f124937g = widgetsCommonEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Personal.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    @Override // csh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.b w(com.revolut.feature.widgets.api.dependencies.WidgetContext r12, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a r13) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ed7.k.w(com.revolut.feature.widgets.api.dependencies.WidgetContext, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$a):efm.b");
    }
}
