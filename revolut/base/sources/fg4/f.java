package fg4;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("CUSTOMER_IDENTIFICATION_DISCLOSURE_ID", (UrlImage) null, new TextLocalisedClause(R$string.personal_details_customer_identification_secondary_title, null, null, 14), new HtmlLocalisedClause(R$string.personal_details_customer_identification_description, (List) null, (Integer) null, (Object) null, 30), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new d(new TextLocalisedClause(R$string.personal_details_customer_identification_primary_title, null, null, 14), u.c(model));
    }
}
