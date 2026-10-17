package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "", "loadUrl", "", "url", "", "closeWebView", "getContext", "Landroid/content/Context;", "params", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerParams;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface APMPMContainerPresenter {
    void closeWebView();

    @NotNull
    Context getContext();

    void loadUrl(@NotNull String url2);

    @NotNull
    APMPMWebContainerParams params();
}
