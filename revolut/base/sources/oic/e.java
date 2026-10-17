package oic;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.impl.R$string;
import ggc.d0;
import ggc.l;
import ggc.u;
import ip0.ut;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.t0;
import ofa.n;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f225602a = yhm.j.b(new n(19));

    public static final class a {
        private a() {
        }
    }

    public final List a(l lVar) {
        d0 d0Var = lVar.f143641b;
        u uVar = lVar.f;
        d0 d0Var2 = d0.CASHBACK;
        Lazy lazy = this.f225602a;
        if (d0Var == d0Var2) {
            String str = lVar.f143644h.f143672a;
            if (str == null) {
                m70.a.c(t0.f186434a);
                str = "";
            }
            List listC = zhm.u.c((ListSubheaderDelegate.Model) lazy.getValue());
            List listK = v.k(new ut("FIRST_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_visit, zhm.u.c(str), null, 12), 1, false, null, null, 1016), new ut("SECOND_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_pay, null, null, 14), 2, false, null, null, 1016), new ut("THIRD_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_receive, null, null, 14), 3, false, null, null, 1016));
            yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            return zhm.d0.E0(listK, listC);
        }
        d0 d0Var3 = d0.MERCHANT_REWARD;
        if (d0Var == d0Var3 && uVar.f143670b != null) {
            List listC2 = zhm.u.c((ListSubheaderDelegate.Model) lazy.getValue());
            List listK2 = v.k(new ut("FIRST_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_apply, null, null, 14), 1, false, null, null, 1016), new ut("SECOND_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_use_card, null, null, 14), 2, false, null, null, 1016), new ut("THIRD_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_receive, null, null, 14), 3, false, null, null, 1016));
            yp0.b.k(listK2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            return zhm.d0.E0(listK2, listC2);
        }
        if (d0Var != d0Var3 || uVar.f143670b != null) {
            return f0.f322471a;
        }
        List listC3 = zhm.u.c((ListSubheaderDelegate.Model) lazy.getValue());
        List listK3 = v.k(new ut("FIRST_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_click, null, null, 14), 1, false, null, null, 1016), new ut("SECOND_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_use_card, null, null, 14), 2, false, null, null, 1016), new ut("THIRD_ACTION_LIST_ID", new TextLocalisedClause(R$string.perks_details_sheet_rule_sentence_receive, null, null, 14), 3, false, null, null, 1016));
        yp0.b.k(listK3, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return zhm.d0.E0(listK3, listC3);
    }

    public final List b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new ut(a0.d.n("GENERIC_ACTION_LIST_ID", i2), new TextClause((String) obj2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i2, false, null, null, 1016));
            i = i2;
        }
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        List listC = zhm.u.c((ListSubheaderDelegate.Model) this.f225602a.getValue());
        yp0.b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return zhm.d0.E0(arrayList, listC);
    }
}
