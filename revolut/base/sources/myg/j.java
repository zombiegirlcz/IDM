package myg;

import aw0.w6;
import aw0.x6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static x6 a(float f, boolean z, boolean z3) {
        return new x6(u.c(new w6(z3 ? R$attr.uikit_colorGreyTone50_20 : z ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative, z3 ? R$attr.uikit_colorTransparent : z ? R$attr.uikit_colorPerformancePositive_30 : R$attr.uikit_colorPerformanceNegative_30, R$attr.uikit_colorTransparent, BitmapDescriptorFactory.HUE_RED, f, false, 64)));
    }
}
