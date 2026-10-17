package vi9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements yh9.h {
    public static CellDetailsActionDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, dj0.d dVar, bi9.c cVar) {
        return new CellDetailsActionDelegate.Model(str, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, dVar), false, false, null, cVar, 0, 0, 32224);
    }
}
