package r57;

import ct6.w;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zt6.b f251533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o57.a f251534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f251535c;

    public b(w freelancerWidgetsClauseFactory, o57.a freelancerWidgetsProvider, zt6.b freelancerControllerProvider) {
        Intrinsics.checkNotNullParameter(freelancerControllerProvider, "freelancerControllerProvider");
        Intrinsics.checkNotNullParameter(freelancerWidgetsProvider, "freelancerWidgetsProvider");
        Intrinsics.checkNotNullParameter(freelancerWidgetsClauseFactory, "freelancerWidgetsClauseFactory");
        this.f251533a = freelancerControllerProvider;
        this.f251534b = freelancerWidgetsProvider;
        this.f251535c = freelancerWidgetsClauseFactory;
    }

    public static t57.b a(a0 widgetsUiInteractor, String widgetType, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        return new t57.b(widgetsUiInteractor, widgetType, homeFeedWidgetsEventDispatcher);
    }
}
