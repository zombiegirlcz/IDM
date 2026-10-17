package h0c;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import m1c.h1;
import m1c.i1;
import m1c.j1;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    static j1 a(a aVar, i1 productId, boolean z, h1 h1Var, int i, int i2, int i3, Integer num, int i5) {
        boolean z3 = true;
        if ((i5 & 64) != 0 && (h1Var == null || !h1Var.f201377c)) {
            z3 = false;
        }
        if ((i5 & 128) != 0) {
            num = null;
        }
        ((b) aVar).getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (!z) {
            return null;
        }
        if (num != null && !z3) {
            i3 = num.intValue();
        }
        return new j1(productId, LayeredImage.INSTANCE.i(i, R$attr.uikit_colorForeground, R$attr.uikit_colorAccentNeutral_10), new TextLocalisedClause(i2, null, null, 14), new TextLocalisedClause(i3, null, null, 14), z3);
    }
}
