package vhg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import hfg.d0;
import ip0.qm0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhg.b f289478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f289479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihg.d f289480c;
    public final a d;
    public final gte.a e;

    public f(jhg.b flightCardMapper, k suggestedDatesSectionMapper, ihg.d topDestinationsSectionMapper, a recommendedAirlinesSectionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(flightCardMapper, "flightCardMapper");
        Intrinsics.checkNotNullParameter(suggestedDatesSectionMapper, "suggestedDatesSectionMapper");
        Intrinsics.checkNotNullParameter(topDestinationsSectionMapper, "topDestinationsSectionMapper");
        Intrinsics.checkNotNullParameter(recommendedAirlinesSectionMapper, "recommendedAirlinesSectionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289478a = flightCardMapper;
        this.f289479b = suggestedDatesSectionMapper;
        this.f289480c = topDestinationsSectionMapper;
        this.d = recommendedAirlinesSectionMapper;
        this.e = featureToggleInteractor;
    }

    public final ArrayList a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            d0 d0Var = (d0) obj2;
            String strN = a0.d.n("FLIGHT_CARD_ITEM_ID_", i);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_flight_search_results_click, null, null, 14);
            arrayList.add(this.f289478a.a(strN, d0Var, d0Var.f151819h, d0Var.i, textLocalisedClause, d0Var));
            i = i2;
        }
        return arrayList;
    }

    public final ArrayList b(int i, int i2) {
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            String listId = "FLIGHT_CARD_ITEM_ID_" + (i3 + i2);
            Intrinsics.checkNotNullParameter(listId, "listId");
            qm0 qm0Var = new qm0(listId);
            yp0.b.l(qm0Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(qm0Var);
        }
        return arrayList;
    }
}
