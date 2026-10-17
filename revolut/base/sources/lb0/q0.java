package lb0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd0.d f193549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc0.y f193550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc0.f f193551c;

    public q0(bd0.d searchDetector, yc0.y navBarItemsMapper, yc0.f iconMapper) {
        Intrinsics.checkNotNullParameter(searchDetector, "searchDetector");
        Intrinsics.checkNotNullParameter(navBarItemsMapper, "navBarItemsMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f193549a = searchDetector;
        this.f193550b = navBarItemsMapper;
        this.f193551c = iconMapper;
    }

    @Override // lb0.p0
    public final Clause b(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        HtmlClause htmlClauseK = uj3.b.k(screen);
        SecondaryDescription secondaryDescription = screen.f63473l;
        Clause[] elements = {htmlClauseK, (secondaryDescription == null || kotlin.text.d0.W(secondaryDescription.f63601b)) ? null : new TextClause(secondaryDescription.f63601b, (Style) new Click(28, (Integer) null, (Object) secondaryDescription, "SECONDARY_DESCRIPTION_LABEL", false), (Integer) null, false, (o9) null, (List) null, 124)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List list = (List) ue0.e.M(kotlin.collections.d.L(elements));
        if (list != null) {
            return yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list);
        }
        return null;
    }

    @Override // lb0.p0
    public final Clause e(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return uj3.b.n(screen);
    }

    @Override // lb0.p0
    public final LinkItem g(FormScreen screen, String listId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Object obj2 = screen.f63468b.get(this.f193550b.b(listId));
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.LinkItem");
        return (LinkItem) obj2;
    }

    @Override // lb0.p0
    public final sa0.c h(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new sa0.c(uj3.b.n(screen), b(screen), this.f193549a.a(screen), this.f193551c.a(screen), this.f193550b.c(screen));
    }
}
