package go2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.DropdownFormField$Choice;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.credit.core.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f145075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f145076c;

    public /* synthetic */ a(String str, x7a.d dVar, Set set, int i) {
        this.f145074a = i;
        this.f145075b = str;
        this.f145076c = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object content, Object obj2, Object obj3) {
        switch (this.f145074a) {
            case 0:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List list = content instanceof List ? (List) content : null;
                if (list == null) {
                    return f0.f322471a;
                }
                ArrayList<DropdownFormField$Choice> arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (d0.J(((DropdownFormField$Choice) obj4).f63909b, this.f145075b, true)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (DropdownFormField$Choice dropdownFormField$Choice : arrayList) {
                    String str = dropdownFormField$Choice.f63908a;
                    arrayList2.add(new SelectableDelegate.Model(j6.a.q("ID_DROPDOWN_ITEM_", str), new RowDelegate.Model(j6.a.q("ID_DROPDOWN_ITEM_INNER_", str), null, new TextClause(dropdownFormField$Choice.f63909b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), this.f145076c.contains(str) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, null, null, false, 32744));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            default:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                List list2 = content instanceof List ? (List) content : null;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                if (list2.isEmpty()) {
                    if (this.f145075b.length() != 0) {
                        List list3 = (List) w54.b.i().getContent();
                        return list3 == null ? f0.f322471a : list3;
                    }
                    List listC = u.c(new RowDelegate.Model("LIST_ID_INITIAL_STATE", new RowDelegate.Model.MainImage.Image56((Image) com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D009", null, null, null, 30), (CircleBadgeModel) null, false, 14), new TextLocalisedClause(R$string.birth_place_city_search_hint_result, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    List list4 = (List) new Data(listC, null, false, 6, null).getContent();
                    return list4 == null ? f0.f322471a : list4;
                }
                List<BirthCity> list5 = list2;
                ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                for (BirthCity birthCity : list5) {
                    arrayList3.add(new RowDelegate.Model(birthCity.b(), null, new TextClause(birthCity.b(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, null, null, null, 0, null, false, null, this.f145076c.contains(birthCity.b()), null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862714));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return arrayList3;
        }
    }
}
