package iy6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f169622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ry6.b f169623b;

    public b(e dateProvider, ry6.b recurringSettingsItemMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(recurringSettingsItemMapper, "recurringSettingsItemMapper");
        this.f169622a = dateProvider;
        this.f169623b = recurringSettingsItemMapper;
    }

    public static Clause a(long j2) {
        return j2 == 0 ? new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_option_upon_receipt, null, null, 14) : new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_schedule_recurring_picker_offset_days_after_sending, Long.valueOf(j2), (List) null, (Style) null, 28);
    }
}
