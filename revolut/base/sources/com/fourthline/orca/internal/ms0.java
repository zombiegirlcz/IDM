package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;
import com.fourthline.orca.qes.internal.error.QesOrcaErrorHandler;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ms0 {
    public final kw a(kw workerErrorHandler, kw qesErrorHandler, kw qesAgreementsErrorHandler) {
        Intrinsics.checkNotNullParameter(workerErrorHandler, "workerErrorHandler");
        Intrinsics.checkNotNullParameter(qesErrorHandler, "qesErrorHandler");
        Intrinsics.checkNotNullParameter(qesAgreementsErrorHandler, "qesAgreementsErrorHandler");
        return new QesOrcaErrorHandler(workerErrorHandler, qesErrorHandler, qesAgreementsErrorHandler);
    }

    public final yr0 b(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new yr0(imageServiceLocator);
    }

    public final QesErrorPopupStateBuilder c(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new QesErrorPopupStateBuilder(imageServiceLocator);
    }

    public final ww0 d(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new ww0(imageServiceLocator);
    }

    public final WorkerErrorPopupStateBuilder e(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new WorkerErrorPopupStateBuilder(imageServiceLocator);
    }

    public final kw a(WorkerErrorPopupClicksHandler workerErrorPopupClicksHandler, fq0 errorPopupPresenter, WorkerErrorPopupStateBuilder workerErrorPopupStateBuilder, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(workerErrorPopupClicksHandler, "workerErrorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(workerErrorPopupStateBuilder, "workerErrorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(errorPopupPresenter, workerErrorPopupStateBuilder, workerErrorPopupClicksHandler, analytics, coroutineScope);
    }

    public final vw0 b(fh0 orcaDestroyer) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        return new vw0(orcaDestroyer);
    }

    public final kw a(QesErrorPopupClicksHandler errorPopupClicksHandler, fq0 errorPopupPresenter, QesErrorPopupStateBuilder errorPopupStateBuilder, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupClicksHandler, "errorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final QesErrorPopupClicksHandler a(fh0 orcaDestroyer) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        return new QesErrorPopupClicksHandler(orcaDestroyer);
    }

    public final WorkerErrorPopupClicksHandler a(fh0 orcaDestroyer, kt0 qesFlowDataBundle) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(qesFlowDataBundle, "qesFlowDataBundle");
        return new WorkerErrorPopupClicksHandler(orcaDestroyer, qesFlowDataBundle);
    }

    public final kw a(xr0 errorPopupClicksHandler, yr0 errorPopupStateBuilder, fq0 errorPopupPresenter, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupClicksHandler, "errorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final xr0 a() {
        return new xr0();
    }

    public final kw a(vw0 errorPopupClicksHandler, ww0 errorPopupStateBuilder, fq0 errorPopupPresenter, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupClicksHandler, "errorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final kw a(ww errorPopupClicksHandler, f21 errorPopupStateBuilder, fq0 popupPresenter, uw analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(errorPopupClicksHandler, "errorPopupClicksHandler");
        Intrinsics.checkNotNullParameter(errorPopupStateBuilder, "errorPopupStateBuilder");
        Intrinsics.checkNotNullParameter(popupPresenter, "popupPresenter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return lw.a(popupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final ww a(fe1 viewNavigator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        return new hz0(viewNavigator);
    }

    public final f21 a(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new f21(imageServiceLocator);
    }
}
