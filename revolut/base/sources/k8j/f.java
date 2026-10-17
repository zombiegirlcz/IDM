package k8j;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.mainscreen.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextLocalisedClause f182171b = new TextLocalisedClause(R$string.crypto_details_section_stats_not_available, null, null, 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3h.a f182172a;

    public f(x3h.a labelFormatter) {
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.f182172a = labelFormatter;
    }

    public static MoneyClause a(dj0.d dVar, boolean z) {
        return new MoneyClause(dVar, new MoneyClause.Format.Shorts(z, 45), null, o9.NON_SENSITIVE, 4);
    }
}
