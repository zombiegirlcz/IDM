package com.fourthline.orca.internal;

import com.google.common.base.Optional;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class vn {
    public final ho a(sg0 tracker, to documentScannerRepository) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(documentScannerRepository, "documentScannerRepository");
        return new ho(tracker, documentScannerRepository);
    }

    public final yw a(yw permissionErrorPopupStateBuilder, yw postProcessingErrorPopupStateBuilder, yw scannerErrorPopupStateBuilder) {
        Intrinsics.checkNotNullParameter(permissionErrorPopupStateBuilder, "permissionErrorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(postProcessingErrorPopupStateBuilder, "postProcessingErrorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(scannerErrorPopupStateBuilder, "scannerErrorPopupStateBuilder");
        return new vi(permissionErrorPopupStateBuilder, postProcessingErrorPopupStateBuilder, scannerErrorPopupStateBuilder);
    }

    public final ww a(ww permissionErrorPopupClicksHandler, ww postProcessingErrorPopupClicksHandler, ww scannerErrorPopupClicksHandler) {
        Intrinsics.checkNotNullParameter(permissionErrorPopupClicksHandler, "permissionErrorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(postProcessingErrorPopupClicksHandler, "postProcessingErrorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(scannerErrorPopupClicksHandler, "scannerErrorPopupClicksHandler");
        return new ui(permissionErrorPopupClicksHandler, postProcessingErrorPopupClicksHandler, scannerErrorPopupClicksHandler);
    }

    public final kw a(ww errorPopupClicksHandler, fq0 errorPopupPresenter, yw errorPopupStateBuilder, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupClicksHandler, "errorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final yo a(to repository, bp documentScannerStepGraphicsProvider, ap textProvider, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(documentScannerStepGraphicsProvider, "documentScannerStepGraphicsProvider");
        Intrinsics.checkNotNullParameter(textProvider, "textProvider");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new yo(repository, documentScannerStepGraphicsProvider, textProvider, lottieServiceLocator, imageServiceLocator, repository.p());
    }

    public final dp a(to repository, vo resultRepository, fe1 viewNavigator, wd1 viewCompletionHandler, yo stateProvider, u41 stepConfirmationHandler, Optional customVideoRecordingHandler, Optional featurePilotHandler, kw documentErrorHandler, ho analytics, v10 imageServiceLocator, l70 lottieServiceLocator, bq0 popupHandlerBuilder, Optional popupCanceller, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(stepConfirmationHandler, "stepConfirmationHandler");
        Intrinsics.checkNotNullParameter(customVideoRecordingHandler, "customVideoRecordingHandler");
        Intrinsics.checkNotNullParameter(featurePilotHandler, "featurePilotHandler");
        Intrinsics.checkNotNullParameter(documentErrorHandler, "documentErrorHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(popupCanceller, "popupCanceller");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        wr wrVar = new wr(coroutineScope);
        f80 f80Var = new f80(stateProvider);
        Object objOr = customVideoRecordingHandler.or(new d71());
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        qd1 qd1Var = (qd1) objOr;
        aq0 aq0VarA = popupHandlerBuilder.a(new fn(analytics, imageServiceLocator, lottieServiceLocator));
        vp0 vp0Var = (vp0) popupCanceller.orNull();
        Object objOr2 = featurePilotHandler.or(new ye());
        Intrinsics.checkNotNullExpressionValue(objOr2, "or(...)");
        return new dp(f80Var, wrVar, repository, resultRepository, stateProvider, stepConfirmationHandler, qd1Var, viewCompletionHandler, documentErrorHandler, viewNavigator, analytics, aq0VarA, vp0Var, (oo) objOr2, coroutineScope);
    }

    public final jq0 a() {
        return new jq0();
    }
}
