package zdc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C1778a Companion = new C1778a();

    /* JADX INFO: renamed from: zdc.a$a, reason: collision with other inner class name */
    public static final class C1778a {
        private C1778a() {
        }
    }

    public static Image a(String str, String name) throws IOException {
        String upperCase;
        Intrinsics.checkNotNullParameter(name, "name");
        if (str != null) {
            return new UrlImage(str, null, Integer.valueOf(R$drawable.uikit_icn_24_image), null, 0L, null, null, null, null, LayeredImage.Companion.p(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_image, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, BitmapDescriptorFactory.HUE_RED, 40.0f), false, new ImageTransformations(null, new RoundedRectTransformation(8.0f), null, gz0.b.CenterCrop, null, 40, 40, 21), null, null, false, false, 506874);
        }
        m70.a.t(t0.f186434a);
        List listN0 = d0.n0(name, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            Character chQ0 = f0.Q0((String) it8.next());
            if (chQ0 != null) {
                String strValueOf = String.valueOf(chQ0.charValue());
                Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
                upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            if (upperCase != null) {
                arrayList.add(upperCase);
            }
        }
        return new TextImage(zhm.d0.k0(zhm.d0.V0(arrayList, 2), "", null, null, 0, null, 62), new Color.Solid(R$attr.uikit_colorOnAccent), new Color.Solid(R$attr.uikit_colorAccentNeutral_10), null, 16, 40, ez0.g.INITIALS_SQUARE, null, 136);
    }

    public static NewBadgeContent.WithNumber b(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                num = null;
            }
            if (num != null) {
                return new NewBadgeContent.WithNumber(new NumberClause(num.intValue(), (NumberClause.Format.Compact) null, (Custom) null, 6));
            }
        }
        return null;
    }
}
