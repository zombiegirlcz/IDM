package uw4;

import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import om4.g3;
import om4.h3;
import sri.m;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f283553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f283554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f283555c;
    public final j d;
    public final g3 e;
    public final x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f283556g;

    public h(h3 creditCardMsiInteractor, i creditCardMsiWidgetMapper, a0 widgetsUiInteractor, j creditCardMsiWidgetVisibilityProvider, g3 creditCardMsiAdsUrlDecoratorInteractor, x deeplinkHandler, m navigator) {
        Intrinsics.checkNotNullParameter(creditCardMsiInteractor, "creditCardMsiInteractor");
        Intrinsics.checkNotNullParameter(creditCardMsiWidgetMapper, "creditCardMsiWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardMsiWidgetVisibilityProvider, "creditCardMsiWidgetVisibilityProvider");
        Intrinsics.checkNotNullParameter(creditCardMsiAdsUrlDecoratorInteractor, "creditCardMsiAdsUrlDecoratorInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f283553a = creditCardMsiInteractor;
        this.f283554b = creditCardMsiWidgetMapper;
        this.f283555c = widgetsUiInteractor;
        this.d = creditCardMsiWidgetVisibilityProvider;
        this.e = creditCardMsiAdsUrlDecoratorInteractor;
        this.f = deeplinkHandler;
        this.f283556g = navigator;
    }
}
