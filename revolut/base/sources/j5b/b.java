package j5b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final List a(i5b.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i = a.f171616a[item.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return u.c(new CellDetailsDelegate.Model("CFD_CLOSE_ACCOUNT_ID", new TextLocalisedClause(R$string.wealth_margin_cfd_close_account, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), true, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, i5b.a.CLOSE_ACCOUNT, null, 0, 134184916));
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z = false;
        return u.c(new RowDelegate.Model("CFD_ASSESSMENT_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextLocalisedClause(R$string.wealth_margin_cfds_settings_cfd_assessment_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_margin_cfds_settings_cfd_assessment_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, i5b.a.CFD_ASSESSMENT, null, 0, 0, 0, 0, 532676568));
    }
}
