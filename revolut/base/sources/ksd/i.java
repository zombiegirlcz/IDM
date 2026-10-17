package ksd;

import amd.i0;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.subaccount.api.SubaccountApi$Toggles;
import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f189435a;

    public i(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f189435a = featureToggleInteractor;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
    public final ArrayList a(lsd.c cVar) {
        Clause clause;
        List list;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause;
        List<m71.a> list2 = cVar.f199673b;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (m71.a aVar : list2) {
            Subaccount subaccount = (Subaccount) aVar.f203279b;
            dj0.d dVar = aVar.f203278a;
            TextClause textClause = new TextClause(subaccount.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Float fValueOf = Float.valueOf(20.0f);
            if (subaccount instanceof Subaccount.Group) {
                List list3 = ((Subaccount.Group) subaccount).f88953a.k;
                if (list3 == null || list3.size() <= 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.analytics_net_worth_subaccount_group_add_member, null, null, 14);
                    clause = textLocalisedClause;
                } else {
                    List listK = v.k(new TextClause(String.valueOf(list3.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_people, (Integer) null, fValueOf, fValueOf, 18));
                    m70.a.t(t0.f186434a);
                    compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    clause = compositeClause;
                }
            } else {
                if (subaccount instanceof Subaccount.Pro) {
                    textLocalisedClause = new TextLocalisedClause(R$string.analytics_net_worth_pro_pocket_title, null, null, 14);
                } else if (subaccount instanceof Subaccount.ProTax) {
                    textLocalisedClause = new TextLocalisedClause(R$string.analytics_net_worth_pro_tax_pocket_title, null, null, 14);
                } else if (subaccount instanceof Subaccount.Joint) {
                    textLocalisedClause = new TextLocalisedClause(R$string.subaccounts_list_item_personal_joint_subtitle, null, null, 14);
                } else {
                    if (subaccount instanceof Subaccount.Personal) {
                        List list4 = ((Subaccount.Personal) subaccount).f88956a.f234888m;
                        if (((jte.d) this.f189435a).c(SubaccountApi$Toggles.BillAccounts.f88944c) && (list = list4) != null && !list.isEmpty()) {
                            List listK2 = v.k(new TextClause(String.valueOf(list4.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_receipt, (Integer) null, fValueOf, fValueOf, 18));
                            m70.a.t(t0.f186434a);
                            compositeClause = new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                            clause = compositeClause;
                        }
                    } else if (!(subaccount instanceof Subaccount.Teen) && !(subaccount instanceof Subaccount.Junior)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clause = null;
                }
                clause = textLocalisedClause;
            }
            arrayList.add(new m71.a(dVar, new amd.f(textClause, clause, new MoneyClause(subaccount.getBalance(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, (Image) r0.h(subaccount.getF88959a().f234881a, cVar.f199672a), null, new i0(subaccount), 168)));
        }
        return arrayList;
    }
}
