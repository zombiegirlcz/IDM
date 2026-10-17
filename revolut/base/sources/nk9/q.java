package nk9;

import android.os.Parcelable;
import aw0.ka;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import zh9.y;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.l f216773a;

    public q(uj9.a commonSectionItemFactory, vi9.l payLaterInstalmentItemMapper) {
        Intrinsics.checkNotNullParameter(commonSectionItemFactory, "commonSectionItemFactory");
        Intrinsics.checkNotNullParameter(payLaterInstalmentItemMapper, "payLaterInstalmentItemMapper");
        this.f216773a = payLaterInstalmentItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f fVar = (f) domainState.f216760a.getContent();
        if (fVar == null) {
            if (domainState.f216760a.getLoading()) {
                return new i(uj9.a.b(3, "repayments_loading"), new TextLocalisedClause(R$string.credit_pay_later_account_upcoming_repayments, null, null, 14), null, f0.f322471a);
            }
            return new i(uj9.a.a("id_repayments_error"), new TextLocalisedClause(R$string.credit_pay_later_account_upcoming_repayments, null, null, 14), null, f0.f322471a);
        }
        List list = fVar.f216759a;
        List listU = d8l.d.u(d8l.d.j(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listU) {
            DateTime dateTimeN = czi.c.n(((y) obj2).f322366b);
            Intrinsics.checkNotNullParameter(dateTimeN, "<this>");
            DateTime dateTimeWithTimeAtStartOfDay = dateTimeN.withDayOfMonth(1).withTimeAtStartOfDay();
            Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
            r rVar = new r(dateTimeWithTimeAtStartOfDay);
            Object arrayList = linkedHashMap.get(rVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(rVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList2 = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            r rVar2 = (r) entry.getKey();
            List list2 = (List) entry.getValue();
            List<y> list3 = list2;
            ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
            for (y yVar : list3) {
                czi.c.F(yVar.f322366b);
                arrayList3.add(yh9.b.a(this.f216773a, yVar));
            }
            DateTime dateTime = rVar2.f216774a;
            arrayList2.add(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(a0.d.g(dateTime.getMonthOfYear(), dateTime.getYear(), "id_section_", "_"), (Image) null, (Clause) new TimeClause(dateTime.getMillis(), new TimeClause.Format.MonthAndYear((ka) null, 3), null, ZoneOffset.UTC, 4), (Image) null, (Clause) (list2.size() == 1 ? null : new MoneyClause(d8l.d.L(list2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126));
        }
        ArrayList arrayListU = w.u(arrayList2);
        boolean zIsEmpty = arrayListU.isEmpty();
        List listC = arrayListU;
        if (zIsEmpty) {
            listC = null;
        }
        if (listC == null) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("empty_state", new TextLocalisedClause(R$string.pay_later_repayments_empty_upcoming_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D188", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), false, null, null, false, 0, 0, 32708);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        }
        return new i(listC, new TextLocalisedClause(R$string.credit_pay_later_account_upcoming_repayments, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_repayments_amount_dot_total_to_repay, u.c(pi9.b.a(d8l.d.L(d8l.d.j(list)), null, 3)), null, 12), f0.f322471a);
    }
}
