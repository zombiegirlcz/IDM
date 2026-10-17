package g08;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static koi.j a(d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        RowDelegate.Model model = new RowDelegate.Model("PET_DETAILS_CTA_LIST_ID", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_animals, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, new TextLocalisedClause(R$string.pets_pet_profile_details_button_title, null, null, 14), null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, RowDelegate.Model.b.c.f53268a, null, null, null, pet, null, 0, 0, 0, 0, 1056925676);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
