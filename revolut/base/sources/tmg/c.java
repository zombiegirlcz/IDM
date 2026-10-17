package tmg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(int i, Image image, Integer num) {
        List listC = u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(i, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, new ComplexImage.Regular(image), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 32704));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return listC;
    }

    public static List b(Throwable th10) {
        if (!tj0.a.a(th10)) {
            return a(com.revolut.feature.user.checklist.impl.R$string.adoption_journey_error_v2_title, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null);
        }
        return a(R$string.common_offline_state_title, new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6), Integer.valueOf(R$string.common_offline_state_description));
    }
}
