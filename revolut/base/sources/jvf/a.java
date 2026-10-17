package jvf;

import com.revolut.core.ui_kit.models.PeriodClause;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final PeriodClause a(long j2) {
        Duration durationOfSeconds = Duration.ofSeconds(j2);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        Intrinsics.checkNotNullParameter(durationOfSeconds, "<this>");
        Intrinsics.checkNotNullParameter(durationOfSeconds, "<this>");
        long j3 = 60;
        int minutes = (int) (durationOfSeconds.toMinutes() % j3);
        Intrinsics.checkNotNullParameter(durationOfSeconds, "<this>");
        return new PeriodClause(new PeriodClause.PeriodComponents(0, 0, 0, 0, minutes, (int) (durationOfSeconds.getSeconds() % j3), 15), null);
    }
}
