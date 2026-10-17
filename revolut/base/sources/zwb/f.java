package zwb;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        PlainTextDelegate.Model model;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f325948b;
        String str2 = domainState.f325947a.f83654b;
        if (str2 != null) {
            model = new PlainTextDelegate.Model("SECTION_PROVIDER_T_AND_C_TEXT_ID", (Clause) null, (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        return new d(str, v.l(model));
    }
}
