package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class y7 {
    public final y11 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new y11(tracker);
    }

    public final l21 a(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new g50(lottieServiceLocator.a(k70.f30152g), lottieServiceLocator.a(k70.e), lottieServiceLocator.a(k70.f), lottieServiceLocator.a(k70.d), imageServiceLocator);
    }

    public final kw a(ww errorPopupClicksHandler, fq0 errorPopupPresenter, yw errorPopupStateBuilder, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupClicksHandler, "errorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final m21 a(i21 repository, fe1 viewNavigator, wd1 viewCompletionHandler, l21 uiStateProvider, kw selfieErrorHandler, y11 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(uiStateProvider, "uiStateProvider");
        Intrinsics.checkNotNullParameter(selfieErrorHandler, "selfieErrorHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new m21(new f80(uiStateProvider), new wr(coroutineScope), uiStateProvider, !repository.c().getInternalConfig().getStrategies().contains(x7.f34906a.a()), viewNavigator, viewCompletionHandler, repository, selfieErrorHandler, new d61(), analytics, coroutineScope);
    }
}
