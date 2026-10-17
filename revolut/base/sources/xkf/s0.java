package xkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f306769a;

    public s0(t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f306769a = localization;
    }

    public static CellDetailsDelegate.Model a() {
        return new CellDetailsDelegate.Model("ID_EXTRAS_RECURRING_LABEL", new TextLocalisedClause(R$string.recurring_detail_transfer_type_label, null, null, 14), new TextLocalisedClause(R$string.recurring_detail_transfer_type_dd_value, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static CellDetailsDelegate.Model c(long j2) {
        return new CellDetailsDelegate.Model("ID_EXTRAS_SCHEDULED_ON", new TextLocalisedClause(R$string.recurring_details_scheduled_on_title, null, null, 14), new TimeClause(j2, new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final CellDetailsDelegate.Model b(ibd.i iVar) {
        return new CellDetailsDelegate.Model("ID_EXTRAS_RECURRING_FREQUENCY", new TextLocalisedClause(R$string.recurring_detail_frequency_title, null, null, 14), new TextClause(xjf.b.a(iVar, this.f306769a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
