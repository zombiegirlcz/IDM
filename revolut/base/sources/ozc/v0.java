package ozc;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements t0 {
    public static Integer c(gzc.t tVar) {
        int i = u0.f231339a[tVar.ordinal()];
        if (i == 2) {
            return Integer.valueOf(R$attr.uikit_colorGreyTone50);
        }
        if (i == 3) {
            return Integer.valueOf(R$attr.uikit_colorRed);
        }
        if (i != 4) {
            return null;
        }
        return Integer.valueOf(R$attr.uikit_colorAccent);
    }

    public final LayeredImage a(gzc.t reviewStateType) {
        Pair pair;
        Intrinsics.checkNotNullParameter(reviewStateType, "reviewStateType");
        int i = u0.f231339a[reviewStateType.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_status_clock_arrows), Integer.valueOf(R$attr.uikit_colorGreyTone50));
        } else if (i == 2) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_sand_watch), Integer.valueOf(R$attr.uikit_colorGreyTone50));
        } else if (i == 3) {
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_exclamation_mark_sign), Integer.valueOf(R$attr.uikit_colorRed));
        } else {
            if (i != 4) {
                return null;
            }
            pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_16_check), Integer.valueOf(R$attr.uikit_colorGreen));
        }
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, ((Number) pair.f186385a).intValue(), ((Number) pair.f186386b).intValue(), R$attr.uikit_colorWhite, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 104);
    }

    public final TextClause b(gzc.s reviewState) {
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        String str = reviewState.f148037b;
        Integer numC = c(reviewState.f148036a);
        return new TextClause(str, (Style) (numC != null ? new Custom(Integer.valueOf(numC.intValue()), false, null, false, null, 254) : null), (Integer) null, false, (o9) null, (List) null, 124);
    }
}
