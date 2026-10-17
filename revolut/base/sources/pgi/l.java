package pgi;

import android.net.Uri;
import android.os.Parcelable;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes10.dex */
public interface l {
    NaviCommand a(Uri uri2, Uri uri3, String str);

    efm.r b(WebViewContract$WebViewConfiguration webViewContract$WebViewConfiguration);

    void c(Parcelable parcelable);

    efm.b d(Parcelable parcelable);

    void e(Parcelable parcelable, String str);
}
