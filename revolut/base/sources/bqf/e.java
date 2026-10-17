package bqf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements yof.a {
    public final y b() {
        return new y(f0.f322471a, new t(new TextLocalisedClause(R$string.transfer_trust_widget_title, null, null, 14), new TextLocalisedClause(R$string.transfer_trust_widget_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28), null, null, null, null, 1020);
    }

    public final RowDelegate.Model c(iy9.b setting, int i, Image image) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(image, "image");
        iy9.a aVar = setting.f169640a;
        if (aVar != iy9.a.TWO_FA_REQUIRED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new RowDelegate.Model(aVar.a(), new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_recipient_settings_two_fa_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, new vf(setting.f169641b, true), false, null, false, null, null, null, null, null, null, setting, null, 0, 0, 0, 0, 532675544);
    }
}
