package m88;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.accounts.impl.R$string;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f203446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7a.a f203447b;

    public b(l80.e dateProvider, m7a.a periodChooserDateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(periodChooserDateProvider, "periodChooserDateProvider");
        this.f203446a = dateProvider;
        this.f203447b = periodChooserDateProvider;
    }

    public static TextLocalisedClause a(Clause clause, Clause clause2) {
        return new TextLocalisedClause(R$string.junior_widgets_automations_allowance_subtitle_separator, v.k(clause, clause2), null, 12);
    }

    public static Pair b() {
        return new Pair(null, new TextLocalisedClause(R$string.junior_widgets_automations_allowance_subtitle_empty, null, null, 14));
    }
}
