package gid;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.p0;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.Instant;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import wid.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f144124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f144125b = 0;

    static {
        c.Companion.getClass();
        f144124a = c.f297882b.toMillis();
    }

    public static final TimeClause a(ZonedDateTime zonedDateTime, Instant now) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        long jI = pu7.a.I(zonedDateTime) - now.toEpochMilli();
        long j2 = jI < 0 ? 0L : jI;
        p0 p0Var = j2 <= f144124a ? p0.SECONDS : p0.MINUTES;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorTerracotta), false, null, false, null, 254);
        if (p0Var != p0.SECONDS) {
            custom = null;
        }
        return new TimeClause(j2, new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(p0Var)), custom, null, 8);
    }
}
