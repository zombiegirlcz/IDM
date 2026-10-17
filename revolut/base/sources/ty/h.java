package ty;

import aw0.o9;
import com.revolut.camerakit.revolut.ui.R$drawable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275444a = v.k(a(R$drawable.camera_kit_sign_language_digit_zero, "0"), a(R$drawable.camera_kit_sign_language_digit_one, "1"), a(R$drawable.camera_kit_sign_language_digit_two, "2"), a(R$drawable.camera_kit_sign_language_digit_three, "3"), a(R$drawable.camera_kit_sign_language_digit_four, "4"), a(R$drawable.camera_kit_sign_language_digit_five, "5"));

    public static RowDelegate.Model a(int i, String str) {
        return new RowDelegate.Model("SIGN_LANGUAGE_DIGIT_".concat(str), new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.o(LayeredImage.INSTANCE, i, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral)), null, null, false, null, false, 62), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }
}
