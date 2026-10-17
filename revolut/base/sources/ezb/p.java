package ezb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.R$string;
import ip0.xc;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gzb.c f130934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gzb.e f130935b;

    public p(gzb.c activeTabMapper, gzb.e completedTabMapper) {
        Intrinsics.checkNotNullParameter(activeTabMapper, "activeTabMapper");
        Intrinsics.checkNotNullParameter(completedTabMapper, "completedTabMapper");
        this.f130934a = activeTabMapper;
        this.f130935b = completedTabMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data challengesBreakdownData = domainState.f130924b;
        EnumEntries<i> enumEntriesA = i.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (i iVar : enumEntriesA) {
            String strName = iVar.name();
            int i = o.f130933a[iVar.ordinal()];
            if (i == 1) {
                Intrinsics.checkNotNullParameter(challengesBreakdownData, "challengesBreakdownData");
                gzb.c cVar = this.f130934a;
                list = (List) iii.c.f(challengesBreakdownData, new gvi.p(cVar, 23), new gug.c(12), new gna.i(cVar, 12));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(challengesBreakdownData, "challengesBreakdownData");
                gzb.e eVar = this.f130935b;
                list = (List) iii.c.f(challengesBreakdownData, new gvi.p(eVar, 24), new gug.c(13), new gzb.d(eVar, 0));
            }
            arrayList.add(new xc(strName, list, 0, null, null, 0, 0, 0, 1020));
        }
        return new j(arrayList, v.k(new q("ACTIVE", new t(new TextLocalisedClause(R$string.rev_points_challenge_v3_home_tab_active, null, null, 14)), 58), new q("COMPLETED", new t(new TextLocalisedClause(R$string.rev_points_challenge_v3_home_tab_completed, null, null, 14)), 58)), domainState.f130923a);
    }
}
