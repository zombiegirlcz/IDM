package sx4;

import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final TimeClause a(long j2, TimeClause.Format format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return new TimeClause(j2, format, null, null, 12);
    }

    public static TimeClause b(long j2) {
        TimeClause.Format.INSTANCE.getClass();
        return a(j2, TimeClause.Format.f57959a);
    }
}
