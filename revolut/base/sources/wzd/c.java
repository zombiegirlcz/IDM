package wzd;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.revolut.feature_fourthline_impl.R;
import e0e.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mw0.g;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public c(i periodSelectorBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(periodSelectorBottomSheetProvider, "periodSelectorBottomSheetProvider");
    }

    public static mw0.a a(StatementsFormat selectedFormat) {
        g gVar;
        g gVar2;
        Intrinsics.checkNotNullParameter(selectedFormat, "selectedFormat");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.statements_pdf, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int[] iArr = b.f301414a;
        int i = iArr[selectedFormat.ordinal()];
        if (i == 1) {
            gVar = g.Selected;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = g.Unselected;
        }
        PopupMenuItem.Cell cellA = com.revolut.core.ui_kit.models.popup.a.a("ID_MENU_PDF", textLocalisedClause, resourceImage, null, null, null, gVar, SyslogConstants.LOG_CLOCK);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.statement_format_csv, null, null, 14);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_excel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i2 = iArr[selectedFormat.ordinal()];
        if (i2 == 1) {
            gVar2 = g.Unselected;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gVar2 = g.Selected;
        }
        return zi0.c.d(v.k(cellA, com.revolut.core.ui_kit.models.popup.a.a("ID_MENU_CSV", textLocalisedClause2, resourceImage2, null, null, null, gVar2, SyslogConstants.LOG_CLOCK)));
    }
}
