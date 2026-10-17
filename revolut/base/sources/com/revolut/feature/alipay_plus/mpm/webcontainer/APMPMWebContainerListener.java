package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerListener;", "", "onContainerDestroyed", "", "params", "Landroid/os/Bundle;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface APMPMWebContainerListener {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onContainerDestroyed(@NotNull APMPMWebContainerListener aPMPMWebContainerListener, @NotNull Bundle params) {
            Intrinsics.checkNotNullParameter(params, "params");
            APMPMWebContainerListener.super.onContainerDestroyed(params);
        }
    }

    default void onContainerDestroyed(@NotNull Bundle params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }
}
