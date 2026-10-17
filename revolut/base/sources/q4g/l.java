package q4g;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import com.revolut.feature.travel.flights.models.domain.common.Segment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l {
    public static final Image a(Segment segment, Integer num) {
        Intrinsics.checkNotNullParameter(segment, "<this>");
        Carrier carrier = segment.f93499b;
        String code = carrier.f93487a;
        String str = carrier.f93489c;
        Intrinsics.checkNotNullParameter(code, "code");
        Carrier carrier2 = segment.f93500c;
        String str2 = null;
        a aVar = carrier2 != null ? new a(carrier2.f93487a, carrier2.f93489c) : null;
        if (aVar != null) {
            String str3 = aVar.f242139b;
            String str4 = aVar.f242138a;
            if (!d0.W(str4)) {
                if (!str4.equals(code)) {
                    return new PairedImage(b(num, str), b(num, str3), R$attr.uikit_colorWidgetBackground, null);
                }
                if (str3 != null && !d0.W(str3)) {
                    str2 = str3;
                }
                if (str2 != null) {
                    str = str2;
                }
                return b(num, str);
            }
        }
        return b(num, str);
    }

    public static final Image b(Integer num, String str) {
        String str2 = (str == null || d0.W(str)) ? null : str;
        return str2 != null ? new UrlImage(str2, null, null, num, 0L, null, null, null, null, new GlyphImage(R$drawable.uikit_icn_24_travel, null, null, 6), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506870) : new GlyphImage(R$drawable.uikit_icn_24_travel, null, null, 6);
    }
}
