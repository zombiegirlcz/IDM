package b8d;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import d7j.o0;
import d7j.p0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8d.c f13171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9d.c f13172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8d.d f13173c;
    public final lde.n d;

    public k0(d8d.c articleNeedMoreHelpMapper, p9d.c doneButtonProvider, d8d.d helpFeedbackMapper, lde.n sharedHelpWidgetsInteractor) {
        Intrinsics.checkNotNullParameter(articleNeedMoreHelpMapper, "articleNeedMoreHelpMapper");
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(helpFeedbackMapper, "helpFeedbackMapper");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f13171a = articleNeedMoreHelpMapper;
        this.f13172b = doneButtonProvider;
        this.f13173c = helpFeedbackMapper;
        this.d = sharedHelpWidgetsInteractor;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        m domainState = (m) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = (TextClause) iii.c.f(domainState.f13176a, new b73.h(17), new b6d.a(12), new b0c.a(3));
        boolean loading = domainState.f13176a.getLoading();
        aim.e eVarB = zhm.u.b();
        Data data = domainState.f13177b;
        eVarB.addAll((List) iii.c.f(data, new b4b.z(this, 24), new b6d.a(13), new b1c.p(this, domainState.d, 3)));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        d8d.c cVar = this.f13171a;
        eVarB.addAll((List) iii.c.f(data, new p0(cVar, 23), new o0(7), new cab.m(cVar, domainState, 18)));
        return new t(textClause, loading, zhm.u.a(eVarB), ((p9d.d) this.f13172b).a(domainState.f13179g));
    }
}
