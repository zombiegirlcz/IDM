package ey8;

import android.webkit.WebView;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreen;
import kotlin.Unit;
import tx.f;
import ty8.d;
import ty8.p;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends WebView.VisualStateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130591b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f130590a = i;
        this.f130591b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j2) {
        switch (this.f130590a) {
            case 0:
                if (j2 == 1234) {
                    ((WebPortalLoadingView) this.f130591b).f77907n.k(Unit.f186387a);
                }
                break;
            default:
                if (j2 == 1337) {
                    ((p) ((d) ((TrustdockScreen) this.f130591b).R.getValue())).x2(new f(21));
                }
                break;
        }
    }
}
