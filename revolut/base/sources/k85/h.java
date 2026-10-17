package k85;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class h {
    public static CompositeClause a(dj0.d dVar, dj0.d dVar2, boolean z) {
        Custom custom = dVar == null ? null : new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
        aim.e eVarB = u.b();
        n14.e.b(eVarB, dVar != null ? sx4.f.b(3, null, null, dVar) : null);
        eVarB.add(sx4.f.b(1, custom, null, dVar2));
        if (z) {
            int i = R$attr.uikit_colorGreyTone50;
            int i2 = R$drawable.uikit_icn_16_info_outline;
            ImageClauseTint.Color color = new ImageClauseTint.Color(i);
            Float fValueOf = Float.valueOf(12.0f);
            eVarB.add(new ImageClause(i2, color, fValueOf, fValueOf, 16));
        }
        return new CompositeClause(u.a(eVarB), sx4.g.e(3), null, null, 12);
    }
}
