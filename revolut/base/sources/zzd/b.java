package zzd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static List a(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(listId, new TextLocalisedClause(R$string.documents_hub_empty_state_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_documents_pair, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }
}
