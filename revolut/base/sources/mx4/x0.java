package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dx4.j4;
import dx4.k4;
import dx4.l4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x0 {
    public static List a(l4 item, boolean z) {
        Custom.Color.Solid solid;
        Custom custom;
        ResourceImage resourceImage;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120667a;
        int i = R$string.credit_application_constructor_row_note_title;
        List listC = zhm.u.c(item.f120668b);
        k4 k4Var = item.d;
        j4 j4Var = item.e;
        Integer numValueOf = null;
        if (k4Var == null && j4Var == null) {
            custom = null;
        } else {
            boolean z3 = k4Var == k4.CROSSED;
            if (j4Var == null) {
                solid = null;
            } else {
                if (w0.f210197a[j4Var.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                solid = new Custom.Color.Solid(R$attr.uikit_colorGreyTone20);
            }
            custom = new Custom(solid, z3, false, Constants.TAG_FC_SPEED_MODE);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, listC, custom, 8);
        dx4.a1 a1Var = item.f120669c;
        if (a1Var != null) {
            int iC = a1Var.c();
            j4 j4Var2 = item.f;
            if (j4Var2 != null) {
                if (w0.f210197a[j4Var2.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone20);
            }
            resourceImage = new ResourceImage(iC, (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246);
        } else {
            resourceImage = null;
        }
        return zhm.u.c(new CellDetailsStandaloneNoteDelegate.Model(str, null, textLocalisedClause, null, resourceImage, false, new AnalyticsContext(zw4.a.a(item.f120667a)), 0, z ? R$attr.uikit_dp16 : R$attr.uikit_dp8, 1706));
    }
}
