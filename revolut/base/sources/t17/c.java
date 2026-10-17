package t17;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rx0.i f267199a;

    public c(rx0.i inputFilter) {
        Intrinsics.checkNotNullParameter(inputFilter, "inputFilter");
        this.f267199a = inputFilter;
    }

    public static ListSubheaderDelegate.Model a(String headerId, boolean z) {
        Intrinsics.checkNotNullParameter(headerId, "headerId");
        return new ListSubheaderDelegate.Model(headerId, (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_sales_filters_amount_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.freelancer_common_action_reset, null, null, 14) : null), z, (Object) Boolean.valueOf(z), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
    }

    public final List b(String minimumAmountItemId, String str, String maximumAmountItemId, String str2) {
        Intrinsics.checkNotNullParameter(minimumAmountItemId, "minimumAmountItemId");
        Intrinsics.checkNotNullParameter(maximumAmountItemId, "maximumAmountItemId");
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_amount_placeholder_min, null, null, 14);
        rx0.i iVar = this.f267199a;
        InputTextDelegate.Model model = new InputTextDelegate.Model(minimumAmountItemId, textClause, textLocalisedClause, null, false, null, null, null, null, null, null, false, null, null, false, false, 8194, 0, null, false, false, null, false, u.c(iVar), false, false, false, null, null, 0, -1075838984, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, R$attr.uikit_dp4, null, false, 55);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model(maximumAmountItemId, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.freelancer_sales_filters_amount_placeholder_max, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 8194, 0, null, false, false, null, false, u.c(iVar), false, false, false, null, null, 0, -1075838984, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, R$attr.uikit_dp4, 0, null, false, 59);
        return v.k(model, model2);
    }
}
