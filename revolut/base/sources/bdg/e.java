package bdg;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerContract$InputData;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import ip0.a10;
import ip0.c10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vim.f;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsChildAgePickerContract$InputData f14602a;

    public e(TravelHotelsChildAgePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f14602a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.hotels_stays_search_guests_child_age_title, u.c(Integer.valueOf(this.f14602a.f93965a + 1)), null, 12), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.hotels_common_action_select, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        List listC = u.c(new c10(new TextLocalisedClause(R$string.hotels_stays_search_guests_child_age_none, null, null, 14), null));
        IntRange intRange = new IntRange(0, 17, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            arrayList.add(new c10(new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_guests_child_age_years_old, Integer.valueOf(iNextInt), u.c(Integer.valueOf(iNextInt)), (Style) null, 24), new Child(Integer.valueOf(iNextInt))));
        }
        ArrayList arrayListE0 = d0.E0(arrayList, listC);
        Integer num = domainState.f14598a;
        return new cii.b(eVar, u.c(new a10("AGE_PICKER_ITEM_ID", arrayListE0, num != null ? num.intValue() + 1 : 0)), aVar);
    }
}
