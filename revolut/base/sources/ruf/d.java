package ruf;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.models.transit.TransitTicketType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private d() {
    }

    public static LayeredImage a(TransitTicketType type) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        bxf.h hVar = type.f92733c;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i2 = c.f257545a[hVar.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_all_time;
        } else if (i2 == 2) {
            i = R$drawable.uikit_icn_24_calendar_week;
        } else if (i2 == 3) {
            i = R$drawable.uikit_icn_24_people;
        } else if (i2 == 4) {
            i = R$drawable.uikit_icn_24_voucher;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_thin_right;
        }
        return LayeredImage.INSTANCE.i(i, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10);
    }
}
