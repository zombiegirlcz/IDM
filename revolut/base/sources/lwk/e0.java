package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements iwk.g {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f200466a;

    public e0(o7.d labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f200466a = labelFormatter;
    }

    @Override // iwk.g
    public final List a(afl.a0 stats) {
        x3h.a aVar = (x3h.a) this.f200466a.f222642b;
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.z zVar = stats.f4572c;
        Integer num = zVar.f4664a;
        Integer num2 = zVar.f4665b;
        CellDetailsDelegate.Model[] elements = {num != null ? new CellDetailsDelegate.Model("STATS_VOLUME_DAY", new TextLocalisedClause(R$string.wealth_details_section_stats_volume, null, null, 14), aVar.d(num.intValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null, num2 != null ? new CellDetailsDelegate.Model("STATS_VOLUME_AVG_3M", new TextLocalisedClause(R$string.wealth_details_section_stats_average_volume, null, null, 14), aVar.d(num2.intValue()), 0, null, null, null, null, null, false, 0, 0, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        iwk.g.d(listL);
        return listL;
    }
}
