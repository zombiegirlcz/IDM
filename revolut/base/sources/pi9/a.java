package pi9;

import com.revolut.core.ui_kit.models.TimeClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final TimeClause a(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        long jP = ebm.a.P(localDate);
        TimeClause.Format.INSTANCE.getClass();
        return new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12);
    }
}
