package yc0;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.HtmlPromptScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f312430a;

    public o(g analyticsMapper) {
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        this.f312430a = analyticsMapper;
    }

    public final rp0.y a(HtmlPromptScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        rp0.t tVar = new rp0.t(new TextClause(screen.f63479b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30);
        rp0.l lVar = rp0.l.WINDOW;
        List listC = zhm.u.c(new kj("HTML_PROMPT_CONTENT_ID", new lj(screen.f63480c.f63477a, "utf-8"), null, Constants.TAG_FC_SPEED_MODE));
        g gVar = this.f312430a;
        return new rp0.y(listC, tVar, lVar, null, null, null, null, gVar.f312422a.getO(), new AnalyticsContext(gVar.a(screen)), null, 2296);
    }
}
