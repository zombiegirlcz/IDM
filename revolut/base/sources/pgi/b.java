package pgi;

import android.webkit.DownloadListener;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qh4.b0;
import yc4.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f235954b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f235953a = i;
        this.f235954b = obj2;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String url2, String str, String str2, String str3, long j2) {
        int i = this.f235953a;
        Object obj2 = this.f235954b;
        switch (i) {
            case 0:
                WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
                i iVar = (i) ((WebViewActivity) obj2).f218652a0;
                if (iVar != null) {
                    Intrinsics.h(url2);
                    Intrinsics.h(str3);
                    iVar.y(url2, str3);
                }
                break;
            case 1:
                KProperty[] kPropertyArr = RolleeScreen.T;
                b0 b0VarR2 = ((RolleeScreen) obj2).R2();
                Intrinsics.h(url2);
                b0VarR2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                b0VarR2.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(url2, null, 0, false, true, true, 65438))));
                break;
            default:
                KProperty[] kPropertyArr2 = KontomatikSignInController.U;
                v vVarE3 = ((KontomatikSignInController) obj2).e3();
                Intrinsics.h(url2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) vVarE3).I2(new yc4.n(url2));
                break;
        }
    }
}
