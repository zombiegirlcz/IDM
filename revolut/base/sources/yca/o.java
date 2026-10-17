package yca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes5.dex */
public final class o {
    public static RowDelegate.Model a(String str, int i, int i2, PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous cpfOrBrazilianLocalPhoneAmbiguous) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i2, R$attr.uikit_colorAccent, R$attr.uikit_colorGrey50_10), null, null, false, null, false, 62), new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, cpfOrBrazilianLocalPhoneAmbiguous, null, 0, 0, 0, 0, 532676600);
    }

    public static y b(PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous ambiguousKey) {
        Intrinsics.checkNotNullParameter(ambiguousKey, "ambiguousKey");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.pix_new_recipient_clash_title, null, null, 14), null, null, 30);
        List listK = zhm.v.k(a("CPF_TYPE_ID", R$string.pix_key_document, R$drawable.uikit_icn_24_national_id, ambiguousKey), a("PHONE_TYPE_ID", R$string.pix_key_phone, R$drawable.uikit_icn_24_smartphone, ambiguousKey));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new y(listK, tVar, rp0.l.WINDOW, null, null, null, 1016);
    }
}
