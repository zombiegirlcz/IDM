package androidx.webkit;

import android.os.Build;
import android.webkit.WebSettings;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebSettingsNoOpAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

/* JADX INFO: loaded from: classes16.dex */
public abstract class WebSettingsCompat {
    private static WebSettingsAdapter getAdapter(WebSettings webSettings) {
        try {
            return WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new WebSettingsNoOpAdapter();
            }
            throw e;
        }
    }

    @Deprecated
    public static void setForceDark(WebSettings webSettings, int i) {
        ApiFeature.Q q5 = WebViewFeatureInternal.FORCE_DARK;
        if (q5.isSupportedByFramework()) {
            ApiHelperForQ.setForceDark(webSettings, i);
        } else {
            if (!q5.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getAdapter(webSettings).setForceDark(i);
        }
    }

    @Deprecated
    public static void setForceDarkStrategy(WebSettings webSettings, int i) {
        if (!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getAdapter(webSettings).setForceDarkStrategy(i);
    }
}
