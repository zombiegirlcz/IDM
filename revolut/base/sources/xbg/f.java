package xbg;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<BedOption> list = domainState.f304077b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (BedOption bedOption : list) {
            arrayList.add(new SingleChoiceDelegate.Model(j6.a.q("BED_OPTION_ITEM_ID", bedOption.f98087a), new TextClause(bedOption.f98089c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), Intrinsics.f(domainState.f304076a.f98087a, bedOption.f98087a), null, bedOption, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp16, 0, 0, 0, 30);
        return new cii.b(null, arrayList, new lw0.a(new TextLocalisedClause(R$string.hotels_property_room_selection_bed_options_title, null, null, 14), new TextLocalisedClause(R$string.hotels_property_room_selection_bed_options_subtitle, null, null, 14), null, null, false, 28));
    }
}
