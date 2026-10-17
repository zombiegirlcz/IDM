package vx8;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebPortalLoadingView f292847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebPortalLoadingView f292848b;

    public a(WebPortalLoadingView webPortalLoadingView, WebPortalLoadingView webPortalLoadingView2) {
        this.f292847a = webPortalLoadingView;
        this.f292848b = webPortalLoadingView2;
    }

    public static a a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        WebPortalLoadingView webPortalLoadingView = (WebPortalLoadingView) view;
        return new a(webPortalLoadingView, webPortalLoadingView);
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f292847a;
    }
}
