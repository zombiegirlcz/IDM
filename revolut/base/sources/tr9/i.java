package tr9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import do3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oq9.j;
import oq9.o;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements nq9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.c f273772a;

    public i(nq9.c membersMapper) {
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        this.f273772a = membersMapper;
    }

    public final ArrayList a(List splits, o billOwner, n user, boolean z) {
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(splits, "splits");
        Intrinsics.checkNotNullParameter(billOwner, "billOwner");
        Intrinsics.checkNotNullParameter(user, "user");
        List list = splits;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            j split = (j) it9.next();
            Intrinsics.checkNotNullParameter(split, "split");
            Intrinsics.checkNotNullParameter(billOwner, "billOwner");
            Intrinsics.checkNotNullParameter(user, "user");
            String str = split.f227830a;
            dj0.d dVar = split.e;
            o oVar = split.d;
            String str2 = "ID_SPLIT_" + str;
            Intrinsics.checkNotNullParameter(split, "split");
            Intrinsics.checkNotNullParameter(user, "user");
            nq9.c cVar = this.f273772a;
            RowDelegate.Model.MainImage mainImageI = ((e) cVar).i(oVar, user, null);
            Intrinsics.checkNotNullParameter(split, "split");
            Intrinsics.checkNotNullParameter(user, "user");
            e eVar = (e) cVar;
            Clause clauseC = eVar.c(oVar, user);
            Intrinsics.checkNotNullParameter(split, "split");
            Intrinsics.checkNotNullParameter(billOwner, "billOwner");
            Intrinsics.checkNotNullParameter(user, "user");
            if (oVar.equals(billOwner)) {
                it8 = it9;
                textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            } else {
                it8 = it9;
                if (oi0.d.G(oVar, user) && oi0.d.G(billOwner, user)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                } else if (oi0.d.G(oVar, user) && oi0.d.F(billOwner, user)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_owe, u.c(eVar.k(billOwner)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
                } else if (oi0.d.F(oVar, user) && oi0.d.G(billOwner, user)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_owes_you, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10);
                } else {
                    if (!oi0.d.F(oVar, user) || !oi0.d.F(billOwner, user)) {
                        throw new IllegalStateException("Can't map member to member's split item: " + oVar);
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_owes, u.c(eVar.k(billOwner)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
                }
            }
            TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
            Intrinsics.checkNotNullParameter(split, "split");
            Intrinsics.checkNotNullParameter(billOwner, "billOwner");
            Intrinsics.checkNotNullParameter(user, "user");
            RowDelegate.Model.c.b bVar = (oi0.d.G(billOwner, user) && z) ? new RowDelegate.Model.c.b(new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_edit, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8)), null, null, null, 14), null, null, false, 126) : new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            Intrinsics.checkNotNullParameter(billOwner, "billOwner");
            Intrinsics.checkNotNullParameter(user, "user");
            arrayList.add(new RowDelegate.Model(str2, mainImageI, clauseC, null, 0, textLocalisedClause2, null, null, 0, bVar, oi0.d.G(billOwner, user), null, false, null, null, null, null, null, null, split, null, 0, 0, 0, 0, 532673496));
            it9 = it8;
        }
        return arrayList;
    }
}
