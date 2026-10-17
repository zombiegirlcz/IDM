package qc3;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.R$string;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f244549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub3.e f244550b;

    public m(f inputData, ub3.e itemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f244549a = inputData;
        this.f244550b = itemMapper;
    }

    public final aim.e a(List list) {
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model("ITEM_ID_SUBHEADER_LOCATIONS", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_cash_report_issue_store_list_store_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f244550b.a((CashTopUpLocationInfo) it8.next()));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        SingleChoiceDelegate.Model model = new SingleChoiceDelegate.Model("ITEM_ID_FIND_ON_THE_MAP", new TextLocalisedClause(R$string.topup_cash_report_issue_store_list_action_find_on_the_map, null, null, 14), false, null, null, 2024);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return u.a(eVarB);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Object next;
        AbstractList abstractListA;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f244541a;
        if (list == null) {
            abstractListA = iii.c.c(5);
        } else {
            String str = this.f244549a.f244542a;
            List list2 = list;
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((CashTopUpLocationInfo) next).f, str)) {
                    break;
                }
            }
            CashTopUpLocationInfo cashTopUpLocationInfo = (CashTopUpLocationInfo) next;
            if (cashTopUpLocationInfo == null) {
                abstractListA = a(list);
            } else {
                ArrayList arrayListA0 = d0.A0(list2, cashTopUpLocationInfo);
                aim.e eVarB = u.b();
                eVarB.add(new ListSubheaderDelegate.Model("ITEM_ID_SUBHEADER_SELECTED_LOCATION", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_cash_report_issue_store_list_selected_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                RowDelegate.Model modelA = this.f244550b.a(cashTopUpLocationInfo);
                yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelA);
                eVarB.addAll(a(arrayListA0));
                abstractListA = u.a(eVarB);
            }
        }
        return new j(abstractListA);
    }
}
