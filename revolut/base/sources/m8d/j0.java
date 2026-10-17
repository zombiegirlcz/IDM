package m8d;

import aj0.k0;
import aj0.l0;
import aj0.m0;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f203507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp6.b f203508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8d.b f203509c;
    public final o8d.d d;
    public final o8d.f e;
    public final o8d.h f;

    public j0(p9d.c doneButtonProvider, bp6.b helpFeedbackMapper, o8d.b pigeonInformationalContentMapper, o8d.d pigeonInstructionalContentMapper, o8d.f pigeonLoadingContentMapper, o8d.h pigeonNeedMoreHelpStateMapper) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(helpFeedbackMapper, "helpFeedbackMapper");
        Intrinsics.checkNotNullParameter(pigeonInformationalContentMapper, "pigeonInformationalContentMapper");
        Intrinsics.checkNotNullParameter(pigeonInstructionalContentMapper, "pigeonInstructionalContentMapper");
        Intrinsics.checkNotNullParameter(pigeonLoadingContentMapper, "pigeonLoadingContentMapper");
        Intrinsics.checkNotNullParameter(pigeonNeedMoreHelpStateMapper, "pigeonNeedMoreHelpStateMapper");
        this.f203507a = doneButtonProvider;
        this.f203508b = helpFeedbackMapper;
        this.f203509c = pigeonInformationalContentMapper;
        this.d = pigeonInstructionalContentMapper;
        this.e = pigeonLoadingContentMapper;
        this.f = pigeonNeedMoreHelpStateMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        m domainState = (m) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        x xVar = (x) iii.c.f(domainState.f203513b, new m62.l(14), new m56.g(18), new ldj.g(15));
        Data data = domainState.f203514c;
        m0 m0Var = (m0) data.getContent();
        l lVar = null;
        l0 l0Var = m0Var != null ? m0Var.d : null;
        if (l0Var instanceof k0) {
            aj0.g gVar = ((k0) l0Var).f5362b;
            if (gVar != null) {
                lVar = new l(new TextClause(gVar.f5351a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), l7d.a.b(domainState.f203512a));
            }
        } else if (!(l0Var instanceof aj0.e0) && !(l0Var instanceof aj0.l) && l0Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new y(xVar, lVar, ((p9d.d) this.f203507a).a(domainState.f), (List) iii.c.f(data, new m11.h(this, 28), new m56.g(17), new i0(this, domainState, 0)));
    }
}
