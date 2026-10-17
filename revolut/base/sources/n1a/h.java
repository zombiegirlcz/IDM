package n1a;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.groups.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m1a.q;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f211304a;

    public h(q avatarsMapper) {
        Intrinsics.checkNotNullParameter(avatarsMapper, "avatarsMapper");
        this.f211304a = avatarsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.split_bill_itemize_see_all_title, null, null, 14);
        List list = domainState.f211300a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            SplitLineItem splitLineItem = (SplitLineItem) obj2;
            String strN = a0.d.n("view_itemized_line_", i);
            TextClause textClause = new TextClause(splitLineItem.f79212a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            long j2 = splitLineItem.f79213b;
            xi0.a aVar = xi0.b.Companion;
            String str = splitLineItem.f79214c;
            aVar.getClass();
            arrayList.add(new RowDelegate.Model(strN, null, textClause, null, 0, new MoneyClause(new dj0.d(j2, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, null, false, null, false, null, null, null, this.f211304a.a(splitLineItem.d), null, null, null, null, 0, 0, 0, 0, 536344538));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new e(textLocalisedClause, arrayList);
    }
}
