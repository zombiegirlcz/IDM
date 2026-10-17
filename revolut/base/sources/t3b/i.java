package t3b;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements f {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f267728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5b.d f267729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c5b.b f267730c;
    public final ljh.c d;

    public i(k instrumentBalanceToRowMapper, k5b.d sorter, d2b.a holdingMapper, c5b.b cfdSwipeActionsMapper, ljh.c wealthActionsAccountWidgetMapper) {
        Intrinsics.checkNotNullParameter(instrumentBalanceToRowMapper, "instrumentBalanceToRowMapper");
        Intrinsics.checkNotNullParameter(sorter, "sorter");
        Intrinsics.checkNotNullParameter(holdingMapper, "holdingMapper");
        Intrinsics.checkNotNullParameter(cfdSwipeActionsMapper, "cfdSwipeActionsMapper");
        Intrinsics.checkNotNullParameter(wealthActionsAccountWidgetMapper, "wealthActionsAccountWidgetMapper");
        this.f267728a = instrumentBalanceToRowMapper;
        this.f267729b = sorter;
        this.f267730c = cfdSwipeActionsMapper;
        this.d = wealthActionsAccountWidgetMapper;
    }

    public static List b(List list, ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof qv0.i) {
                arrayList.add(obj2);
            }
        }
        List list2 = (List) ue0.e.M(arrayList);
        return list2 != null ? pw5.a.f(model, list2) : f0.f322471a;
    }

    public final qv0.l a(kel.b holding, dj0.d dVar, List list, WealthAccount wealthAccount) {
        kel.a aVar = holding.f183148a;
        String str = aVar.f183145a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(aVar.e, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
        Intrinsics.checkNotNullParameter(holding, "holding");
        xi0.a aVar2 = xi0.b.Companion;
        kel.a aVar3 = holding.f183148a;
        String str2 = aVar3.e;
        aVar2.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str2), CurrencyClause.Format.DisplayName.f57755a, null, 4);
        Intrinsics.checkNotNullParameter(holding, "holding");
        String str3 = aVar3.e;
        aVar2.getClass();
        return this.d.b(new RowDelegate.Model(str, image40, currencyClause, null, 0, new CurrencyClause(xi0.a.a(str3), CurrencyClause.Format.Ticker.f57756a, null, 4), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, new r3b.j(holding), null, 0, 0, 0, 0, 532675544), list, wealthAccount);
    }
}
