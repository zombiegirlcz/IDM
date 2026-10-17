package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BW\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001c\u0010\u0013\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerChromeClient;", "Landroid/webkit/WebChromeClient;", "webViewProvider", "Lkotlin/Function0;", "Landroid/webkit/WebView;", "onTitleChanged", "Lkotlin/Function1;", "", "", "onProgressChanged", "", "hasCustomTitleProvider", "", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;)V", "view", "newProgress", "onReceivedTitle", "title", "onConsoleMessage", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMWebContainerChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function0<Boolean> hasCustomTitleProvider;

    @NotNull
    private final Function1<Integer, Unit> onProgressChanged;

    @NotNull
    private final Function1<String, Unit> onTitleChanged;

    @NotNull
    private final APMPMContainerPresenter presenter;

    @NotNull
    private final Function0<WebView> webViewProvider;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerChromeClient$Companion;", "", "<init>", "()V", "titleForDisplay", "", "title", "currentUrl", "isUrlLikeTitle", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isUrlLikeTitle(String title) {
            return a0.H(title, "http://", true) || a0.H(title, "https://", true) || a0.H(title, "file://", true) || a0.H(title, "about:", true) || a0.H(title, "data:", true);
        }

        public final String titleForDisplay(String title, String currentUrl) {
            String strD;
            String string = (title == null || (strD = a0.D(title, "\u200e", "", false)) == null) ? null : d0.F0(strD).toString();
            String str = string != null ? string : "";
            if (!d0.W(str)) {
                if (!str.equals(currentUrl != null ? d0.F0(currentUrl).toString() : null) && !isUrlLikeTitle(str)) {
                    return str;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public APMPMWebContainerChromeClient(@NotNull Function0<? extends WebView> webViewProvider, @NotNull Function1<? super String, Unit> onTitleChanged, @NotNull Function1<? super Integer, Unit> onProgressChanged, @NotNull Function0<Boolean> hasCustomTitleProvider, @NotNull APMPMContainerPresenter presenter) {
        Intrinsics.checkNotNullParameter(webViewProvider, "webViewProvider");
        Intrinsics.checkNotNullParameter(onTitleChanged, "onTitleChanged");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        Intrinsics.checkNotNullParameter(hasCustomTitleProvider, "hasCustomTitleProvider");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.webViewProvider = webViewProvider;
        this.onTitleChanged = onTitleChanged;
        this.onProgressChanged = onProgressChanged;
        this.hasCustomTitleProvider = hasCustomTitleProvider;
        this.presenter = presenter;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return APMPMWebContainerRuntime.INSTANCE.getJsBridge$feature_alipay_plus_nonsdk_release().handleConsoleMessage$feature_alipay_plus_nonsdk_release(consoleMessage != null ? consoleMessage.message() : null, (WebView) this.webViewProvider.invoke(), this.presenter) || super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        super.onProgressChanged(view, newProgress);
        this.onProgressChanged.invoke(Integer.valueOf(newProgress));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        if (((Boolean) this.hasCustomTitleProvider.invoke()).booleanValue()) {
            return;
        }
        this.onTitleChanged.invoke(INSTANCE.titleForDisplay(title, view != null ? view.getUrl() : null));
    }
}
