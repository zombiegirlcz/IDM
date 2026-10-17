package u17;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static ActionsView.Item a(String str, String str2) {
        TextClause textClause = (str == null || str2 == null) ? str != null ? new TextClause(str.concat(" - Max"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : str2 != null ? new TextClause("0 - ".concat(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null : new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(str, " - ", str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (textClause != null) {
            return new ActionsView.Item("AMOUNT_FILTER_CHIP", mx0.d.SEMIBLACK, false, null, null, textClause, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
        }
        return null;
    }
}
