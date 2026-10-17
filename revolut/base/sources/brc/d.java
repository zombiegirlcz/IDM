package brc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static eii.l a(TextLocalisedClause textLocalisedClause, cqc.c cVar) {
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new eii.l((Clause) textLocalisedClause, (Clause) null, (RowDelegate.Model.MainImage) null, true, false, (RowDelegate.Model.c) new tf(yy0.i.a(resourceImage)), (Object) cVar, 168);
    }
}
