package i84;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.r6;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mx4.x;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f159444a;

    public l(x contentListItemMapper) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        this.f159444a = contentListItemMapper;
    }

    public static TextLocalisedClause a(int i, String str) {
        return new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        nu3.g gVar = domainState.f159435a;
        IntRange intRange = new IntRange(1, gVar.d, 1);
        TextLocalisedClause textLocalisedClauseA = a(R$string.credit_application_credit_card_offer_due_date_title, gVar.f219205a);
        TextLocalisedClause textLocalisedClauseA2 = a(R$string.credit_application_credit_card_offer_due_date_description, gVar.f219206b);
        TextLocalisedClause textLocalisedClauseA3 = a(R$string.credit_application_credit_card_offer_due_date_primary_button, gVar.f219208g);
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(String.valueOf(it8.nextInt()));
        }
        int iF0 = d0.f0(intRange, Integer.valueOf(gVar.f219207c));
        List list = gVar.e;
        List listC = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(String.valueOf(((Number) it9.next()).intValue()));
            }
            listC = u.c(new r6(d0.i1(arrayList2)));
        }
        if (listC == null) {
            listC = f0.f322471a;
        }
        s6 s6Var = new s6("due-date-picker-id", iF0, arrayList, null, listC, 1984);
        yp0.b.l(s6Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(s6Var);
        List list3 = gVar.f;
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            a0.x(this.f159444a.b((e1) it10.next(), new ax4.b(0)), arrayList3);
        }
        eVarB.addAll(arrayList3);
        Unit unit = Unit.f186387a;
        return new g(u.a(eVarB), textLocalisedClauseA, textLocalisedClauseA2, textLocalisedClauseA3);
    }
}
