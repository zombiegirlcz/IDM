package yj8;

import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_profile.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import y5g.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, ue0.e.J(new PlainTextDelegate.Model("GENDER_HINT_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.junior_profile_gender_hint, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422), (List) iii.c.f(domainState.f314435a, new yi5.b(20), new yd8.a(17), new l(this, 6))), null);
    }
}
