package ona;

import android.net.Uri;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.licenses.api.LicensesDestination;
import com.revolut.feature.profile.impl.ui.profile.screens.about_us.AboutUsScreen;
import com.revolut.feature.support.api.navigation.LegacyHelpCentreFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import e7l.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Uri uriY2;
        Uri uriY22;
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        d dVar = (d) this.receiver;
        KProperty[] kPropertyArr = AboutUsScreen.f81433b0;
        i iVar = (i) dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        switch (str.hashCode()) {
            case -1895149498:
                if (str.equals("ID_BLOG")) {
                    iVar.C1(new BridgeDestination(new FeatureCommand(LegacyHelpCentreFeatureConfig.Blog.f89357a)));
                }
                break;
            case -1016685731:
                if (str.equals("ID_ABOUT_TWITTER") && (uriY2 = iVar.y2(R$string.social_twitter_url)) != null) {
                    iVar.C1(new BridgeDestination(new BrowserCommand(uriY2)));
                }
                break;
            case -1012357364:
                if (str.equals("ID_REPORT_FEEDBACK")) {
                    Object obj4 = model.u;
                    if (obj4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (!(obj4 instanceof q)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    iVar.n2(new oh4.i(iVar, obj4, (Continuation) null, 23), new whi.b(6));
                }
                break;
            case 1252014245:
                if (str.equals("ID_OPEN_SOURCE_LICENSES")) {
                    iVar.C1(LicensesDestination.f78039b);
                }
                break;
            case 1608007256:
                if (str.equals("ID_ABOUT_RATE_APP")) {
                    iVar.n2(new omg.e(iVar, null, 2), new whi.b(6));
                }
                break;
            case 1681573628:
                if (str.equals("ID_ABOUT_FACEBOOK") && (uriY22 = iVar.y2(R$string.social_facebook_url)) != null) {
                    iVar.C1(new BridgeDestination(new BrowserCommand(uriY22)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
