package ef7;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.Duration;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f125287c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.c f125288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f125289b;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f125287c = kotlin.time.c.g(1, pkm.e.DAYS);
    }

    public d(zjh.c offerCardDetailsMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(offerCardDetailsMapper, "offerCardDetailsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f125288a = offerCardDetailsMapper;
        this.f125289b = dateProvider;
    }

    public final long a(Instant instant) {
        Duration durationBetween = Duration.between(((f) this.f125289b).b(), instant);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return kotlin.time.b.l(kotlin.time.c.h(durationBetween.getSeconds(), pkm.e.SECONDS), kotlin.time.c.g(durationBetween.getNano(), pkm.e.NANOSECONDS));
    }

    public final CircleIconBadge b(re7.f fVar) {
        if (fVar instanceof re7.d) {
            return new InactiveCircleBadge(dw0.a.Locked);
        }
        if (fVar instanceof re7.e) {
            return kotlin.time.b.c(a(((re7.e) fVar).f253534a), f125287c) < 0 ? new WarningCircleBadge(dw0.a.Unlocked) : new AccentCircleBadge(dw0.a.Unlocked);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause c(re7.f fVar, int i, int i2) {
        if (fVar instanceof re7.d) {
            return new TextLocalisedClause(i, null, null, 14);
        }
        if (!(fVar instanceof re7.e)) {
            throw new NoWhenBranchMatchedException();
        }
        Instant instant = ((re7.e) fVar).f253534a;
        long jA = a(instant);
        long jN = kotlin.time.b.n(jA, pkm.e.DAYS);
        int iE = kotlin.time.b.e(jA);
        int iH = kotlin.time.b.h(jA);
        int iJ = kotlin.time.b.j(jA);
        kotlin.time.b.i(jA);
        return new TextLocalisedClause(i2, u.c(new PeriodClause(jN > 0 ? new PeriodClause.PeriodComponents(0, 0, (int) jN, 0, 0, 0, 59) : iE > 0 ? new PeriodClause.PeriodComponents(0, 0, 0, iE, 0, 0, 55) : iH > 0 ? new PeriodClause.PeriodComponents(0, 0, 0, 0, iH, 0, 47) : iJ > 0 ? new PeriodClause.PeriodComponents(0, 0, 0, 0, 0, iJ, 31) : new PeriodClause.PeriodComponents(0, 0, (int) jN, 0, 0, 0, 59), null)), kotlin.time.b.c(a(instant), f125287c) < 0 ? new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254) : null, 8);
    }
}
