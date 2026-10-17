package whk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import umk.n;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f297687a;

    public g(a discountedProvider, n planOfferPromptStateMapper) {
        Intrinsics.checkNotNullParameter(discountedProvider, "discountedProvider");
        Intrinsics.checkNotNullParameter(planOfferPromptStateMapper, "planOfferPromptStateMapper");
        this.f297687a = planOfferPromptStateMapper;
    }

    public static boolean a(Period period) {
        return period != null && period.getYears() > 0 && period.getMonths() == 0;
    }
}
