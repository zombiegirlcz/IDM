package mae;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import hha.w0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static LayeredImage a(fva.j jVar) {
        int i;
        w0 w0Var = null;
        String str = jVar != null ? jVar.d : null;
        Float fValueOf = Float.valueOf(24.0f);
        if (str != null) {
            w0[] w0VarArrValues = w0.values();
            int length = w0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                w0 w0Var2 = w0VarArrValues[i2];
                if (a0.z(w0Var2.name(), str, true)) {
                    w0Var = w0Var2;
                    break;
                }
                i2++;
            }
        }
        int i3 = w0Var == null ? -1 : b.f203998a[w0Var.ordinal()];
        if (i3 == 1) {
            i = R$attr.uikit_colorPlanPlus;
        } else if (i3 == 2) {
            i = R$attr.uikit_colorPlanPremiumDark;
        } else if (i3 == 3) {
            i = R$attr.uikit_colorPlanMetalDark;
        } else {
            if (i3 != 4) {
                return LayeredImage.INSTANCE.d(R$drawable.uikit_icn_24_logo_revolut, R$attr.uikit_colorWhite, R$attr.uikit_colorGroupedBackground, Integer.valueOf(R$attr.uikit_colorBlack), 7.0f, 1.0f, fValueOf);
            }
            i = R$attr.uikit_colorPlanUltraDark;
        }
        return LayeredImage.INSTANCE.d(R$drawable.uikit_icn_24_premium, i, R$attr.uikit_colorGroupedBackground, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, BitmapDescriptorFactory.HUE_RED, fValueOf);
    }
}
