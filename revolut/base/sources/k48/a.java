package k48;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import n38.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static RowDelegate.Model a(z zVar) {
        TextClause textClause = new TextClause(zVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = zVar.f211973g;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        boolean z = false;
        return new RowDelegate.Model("PARTNER_INFO_LIST_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }
}
