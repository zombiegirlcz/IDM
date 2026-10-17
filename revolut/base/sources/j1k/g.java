package j1k;

import aw0.ka;
import com.revolut.core.ui_kit.models.TimeClause;
import ieg.z;
import ip0.ry;
import ip0.sy;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9h.a f170632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1k.b f170633b;

    public g(o9h.a footerDelegateMapper, a1k.b marketNewsItemsMapper) {
        Intrinsics.checkNotNullParameter(footerDelegateMapper, "footerDelegateMapper");
        Intrinsics.checkNotNullParameter(marketNewsItemsMapper, "marketNewsItemsMapper");
        this.f170632a = footerDelegateMapper;
        this.f170633b = marketNewsItemsMapper;
    }

    public static ArrayList b() {
        IntRange intRangeO = kotlin.ranges.f.o(0, 10);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new sy(a0.d.n("NEWS_ARTICLE_LOADING_DELEGATE_ID_", it8.nextInt()), ry.DEFAULT, 60));
        }
        return arrayList;
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(new TimeClause(domainState.f170623a.getMillis(), new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12), (List) iii.c.g(domainState.f170624b, new j1.e(this, 5), new j0g.b(5), new z(this, domainState, 15)));
    }
}
