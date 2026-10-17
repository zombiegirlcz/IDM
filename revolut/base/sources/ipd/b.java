package ipd;

import aw0.ka;
import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    static {
        new TimeClause.Format.Month(0);
        new TimeClause.Format.MonthAndYear((ka) null, 3);
        new TimeClause.Format.Year(0);
    }

    public b(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }
}
