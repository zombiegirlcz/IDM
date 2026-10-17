package fsf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import org.jetbrains.annotations.NotNull;
import rtf.c;
import yy0.i;
import yy0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f137670a;

    static RowDelegate.Model a(b bVar, c cVar) {
        ttf.b bVar2;
        ((ftf.c) bVar).getClass();
        Intrinsics.checkNotNullParameter("TRANSFER_REASONS_DECLARATION_ROW_ID", "listId");
        TransferReasonsValues transferReasonsValuesK = d.k(cVar);
        if (transferReasonsValuesK == null || (bVar2 = transferReasonsValuesK.f92444a) == null) {
            return null;
        }
        int i = ftf.b.f138014a[bVar2.ordinal()];
        if (i == 1 || i == 2) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transfer_reasons_review_transfer_foreign_currency_declaration, null, null, 14);
            of ofVar = of.SMALL;
            i iVar = l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            return new RowDelegate.Model("TRANSFER_REASONS_DECLARATION_ROW_ID", null, textLocalisedClause, ofVar, 0, null, null, null, 0, new tf(i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869872);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "TransferReasonsCommonUiMapper", "Unsupported catalogue " + bVar2, null, null, 16);
        return null;
    }
}
