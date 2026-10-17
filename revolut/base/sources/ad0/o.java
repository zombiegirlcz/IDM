package ad0;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import ip0.ji;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mx0.b6;
import org.jetbrains.annotations.NotNull;
import zc0.m3;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ji a(String str, String str2, List list, Set set) {
        String strQ = j6.a.q("FILTERS_ID_", str2);
        List<FiltersInputItem.Option> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (FiltersInputItem.Option option : list2) {
            arrayList.add(new b6(com.google.android.gms.internal.mlkit_vision_face.a.o(str2, "_", option.f63465a), null, new TextClause(option.f63466b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, set.contains(option.f63465a), new m3(str, option), 42));
        }
        return new ji(R$attr.uikit_dp8, 56, strQ, arrayList);
    }

    public static List b(FiltersInputItem filtersInputItem) {
        List list;
        Intrinsics.checkNotNullParameter(filtersInputItem, "filtersInputItem");
        List list2 = filtersInputItem.d;
        Set set = filtersInputItem.f;
        List list3 = filtersInputItem.e;
        String str = filtersInputItem.f63459a;
        if (list2 == null || (list = (List) ue0.e.M(list2)) == null) {
            return zhm.u.c(a(str, str, list3, set));
        }
        List<FiltersInputItem.Group> list4 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        for (FiltersInputItem.Group group : list4) {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(j6.a.q("TITLE_ID_", group.f63462a), (Image) null, (Clause) new TextClause(group.f63463b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
            String str2 = group.f63462a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (group.f63464c.contains(((FiltersInputItem.Option) obj2).f63465a)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.add(zhm.v.k(model, a(str, str2, arrayList2, set)));
        }
        return zhm.w.u(arrayList);
    }
}
