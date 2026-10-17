package gk9;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.r0;
import zh9.u0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f144367a;

    public r(uj9.a commonSectionItemFactory, b payLaterPlanItemMapper) {
        Intrinsics.checkNotNullParameter(commonSectionItemFactory, "commonSectionItemFactory");
        Intrinsics.checkNotNullParameter(payLaterPlanItemMapper, "payLaterPlanItemMapper");
        this.f144367a = payLaterPlanItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listC;
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g gVar = (g) domainState.f144356a.getContent();
        if (gVar == null) {
            if (domainState.f144356a.getLoading()) {
                return new j(null, new TextLocalisedClause(R$string.credit_pay_later_account_purchases, null, null, 14), uj9.a.b(1, "plans_loading"));
            }
            return new j(null, new TextLocalisedClause(R$string.credit_pay_later_account_purchases, null, null, 14), uj9.a.a("id_plans_error"));
        }
        List list = gVar.f144355b;
        zh9.i iVar2 = gVar.f144354a;
        List listP0 = d0.P0(list, new q());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listP0) {
            ZonedDateTime zonedDateTimeAtZone = ((r0) obj2).f322330h.atZone(ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
            Intrinsics.checkNotNullParameter(zonedDateTimeAtZone, "<this>");
            Intrinsics.checkNotNullParameter(zonedDateTimeAtZone, "<this>");
            ZonedDateTime zonedDateTimeWithDayOfMonth = zonedDateTimeAtZone.withDayOfMonth(1);
            Intrinsics.checkNotNullExpressionValue(zonedDateTimeWithDayOfMonth, "withDayOfMonth(...)");
            ZonedDateTime zonedDateTimeWith = zonedDateTimeWithDayOfMonth.with((TemporalAdjuster) LocalTime.MIN);
            Intrinsics.checkNotNullExpressionValue(zonedDateTimeWith, "with(...)");
            s sVar = new s(zonedDateTimeWith);
            Object arrayList = linkedHashMap.get(sVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(sVar, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        if (linkedHashMap.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_EMPTY_STATE", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_plans_empty_active_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_plans_empty_active_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D187", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model);
        } else {
            Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
            ArrayList arrayList2 = new ArrayList(w.t(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                s sVar2 = (s) entry.getKey();
                List list2 = (List) entry.getValue();
                List list3 = list2;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(this.f144367a.d(iVar2, (r0) it8.next()));
                }
                ZonedDateTime zonedDateTime = sVar2.f144368a;
                Intrinsics.checkNotNullParameter(list2, "<this>");
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i = 0;
                for (Object obj3 : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i == 0 ? ((r0) obj3).f322331j : pyd.c.O(dVarO, ((r0) obj3).f322331j);
                    i = i2;
                }
                arrayList2.add(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(a0.d.g(zonedDateTime.getMonth().getValue(), Math.abs(zonedDateTime.getYear()), "id_section_", "_"), (Image) null, (Clause) new TimeClause(pu7.a.I(zonedDateTime), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), (Image) null, (Clause) sx4.f.b(3, null, null, dVarO), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126));
            }
            listC = w.u(arrayList2);
        }
        return new j(new CompositeClause(v.k(new TextLocalisedClause(R$string.credit_pay_later_account_purchase_list_to_repay, null, null, 14), new TextClause(String.valueOf(u0.n(list).size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12), new TextLocalisedClause(R$string.credit_pay_later_account_purchases, null, null, 14), listC);
    }
}
