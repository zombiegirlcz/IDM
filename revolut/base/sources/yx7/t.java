package yx7;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.yj0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextDelegate.Model a() {
        return new TextDelegate.Model("ID_HUB_FOOTER", new TextLocalisedClause(R$string.pets_common_insurer_legal_disclaimer, null, null, 14), false, new ak0(yj0.START, new CdnImage("insurer_logo_ergo", "mobile/pet/onboarding_plan/footer", null, new ImageTransformations(null, null, null, null, null, 75, 23, 31), null, null, Constants.TAG_E4_CUSTOMER_DATA)), null, null, 0, 0, 0, 0, 2036);
    }
}
