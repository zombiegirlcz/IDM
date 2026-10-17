package u1j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.retail.feature.balance.picker.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static b a(a domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listA = domainState.a();
        if (listA == null || listA.size() < 2) {
            return null;
        }
        List<CountryProfile> list = listA;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CountryProfile countryProfile : list) {
            arrayList.add(new q(countryProfile.f92231a, new t(new TextLocalisedClause(R$string.move_money_source_picker_chip_profile, u.c(new TextClause(countryProfile.f92232b.f297794a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), 50));
        }
        CountryProfile countryProfileC = domainState.c();
        return new b(countryProfileC != null ? countryProfileC.f92231a : null, arrayList);
    }
}
