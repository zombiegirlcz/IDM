package wo0;

import android.view.WindowInsets;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserView f298860b;

    public /* synthetic */ d(InAppBrowserView inAppBrowserView, int i) {
        this.f298859a = i;
        this.f298860b = inAppBrowserView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f298859a;
        InAppBrowserView inAppBrowserView = this.f298860b;
        switch (i) {
            case 0:
                int i2 = InAppBrowserView.f51517l;
                inAppBrowserView.getWebView$ui_kit_components_release().reload();
                return Unit.f186387a;
            default:
                return InAppBrowserView.a(inAppBrowserView, (WindowInsets) obj2);
        }
    }
}
