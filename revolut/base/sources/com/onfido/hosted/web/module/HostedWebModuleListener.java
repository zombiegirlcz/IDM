package com.onfido.hosted.web.module;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.hosted.web.module.model.HostedWebModuleCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleListener;", "", "viewModel", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel;", "(Lcom/onfido/hosted/web/module/HostedWebModuleViewModel;)V", "analyticsSend", "", "message", "", "bootstrapError", "captureModuleError", "captureModuleFinish", "captureModuleUnsupported", "navigationBack", "navigationCloseExternalLink", "navigationExit", "navigationExternalLink", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleListener {

    @NotNull
    private final HostedWebModuleViewModel viewModel;

    public HostedWebModuleListener(@NotNull HostedWebModuleViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @JavascriptInterface
    @Keep
    public final void analyticsSend(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'analyticsSend': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.ANALYTICS_SEND, message);
    }

    @JavascriptInterface
    @Keep
    public final void bootstrapError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'bootstrapError': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.BOOTSTRAP_ERROR, message);
    }

    @JavascriptInterface
    @Keep
    public final void captureModuleError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'captureModuleError': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.CAPTURE_MODULE_ERROR, message);
    }

    @JavascriptInterface
    @Keep
    public final void captureModuleFinish(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'captureModuleFinish': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.CAPTURE_MODULE_FINISH, message);
    }

    @JavascriptInterface
    @Keep
    public final void captureModuleUnsupported(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'captureModuleUnsupported': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.CAPTURE_MODULE_UNSUPPORTED, message);
    }

    @JavascriptInterface
    @Keep
    public final void navigationBack(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'navigationBack': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.NAVIGATION_BACK, message);
    }

    @JavascriptInterface
    @Keep
    public final void navigationCloseExternalLink(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'navigationCloseExternalLink': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.NAVIGATION_CLOSE_EXTERNAL_LINK, message);
    }

    @JavascriptInterface
    @Keep
    public final void navigationExit(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'navigationExit': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.NAVIGATION_EXIT, message);
    }

    @JavascriptInterface
    @Keep
    public final void navigationExternalLink(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.INSTANCE.i(j6.a.q("Received data for 'navigationExternalLink': ", message), new Object[0]);
        this.viewModel.processCallback(HostedWebModuleCallbacks.NAVIGATION_EXTERNAL_LINK, message);
    }
}
