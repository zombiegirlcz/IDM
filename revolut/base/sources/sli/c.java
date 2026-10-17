package sli;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import pgi.h;
import pgi.k;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private c() {
    }

    public static ActivityNavigateCommand a(String url2, boolean z) {
        Intrinsics.checkNotNullParameter(url2, "url");
        k.Companion.getClass();
        return new ActivityNavigateCommand(h.f235963b, new WebViewContract$WebViewConfiguration(url2, (Clause) null, 0, false, z, true, (String) null, (Parcelable) null, (String) null, false, false, (String) null, (String) null, (String) null, false, false, 126860), r0.g(), null, 0, null, null, null, null, false, 992);
    }
}
