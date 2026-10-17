package bp5;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements io5.b {
    public final Image b(CryptoAddress cryptoAddress) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        int i = a.f17558a[cryptoAddress.f71062g.ordinal()];
        return i != 1 ? i != 2 ? (Image) c.f17561c.getValue() : (Image) c.f17560b.getValue() : (Image) c.f17559a.getValue();
    }

    public final QuickActionWidgetDelegate.Model c(String listId, CryptoAddress cryptoAddress, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        ko5.a aVarE = CryptoAddress.e(cryptoAddress, 0, 3);
        return new QuickActionWidgetDelegate.Model(listId, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, aVarE.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), b(cryptoAddress), i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null, new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new d3(new e3(R$drawable.uikit_icn_24_arrow_up, true), (e3) null, 6), null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
