package gac;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.management.impl.R$string;
import dec.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    public d(dec.g paymentMethodIconMapper, r pocketInfoMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodIconMapper, "paymentMethodIconMapper");
        Intrinsics.checkNotNullParameter(pocketInfoMapper, "pocketInfoMapper");
    }

    public static List a(Clause clause, Image image, boolean z) {
        RowDelegate.Model.MainImage image40;
        RowDelegate.Model.MainImage.Image24 image24 = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_management_home_payment_method_title, null, null, 14);
        if (image == null) {
            image40 = image24;
        } else if (z) {
            boolean z3 = false;
            image24 = new RowDelegate.Model.MainImage.Image24(image, z3, z3, 6);
            image40 = image24;
        } else {
            image40 = new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 60);
        }
        return u.c(new RowDelegate.Model("ID_PAYMENT_METHOD_ITEM", image40, textLocalisedClause, null, 0, clause, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
    }
}
