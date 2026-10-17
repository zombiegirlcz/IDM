package dok;

import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final PercentageClause a(jha.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new PercentageClause(cVar.f174189b, (PercentageClause.Format) null, (Style) null, 6);
    }

    public static final PercentageClause b(jha.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new PercentageClause(cVar.f174188a, (PercentageClause.Format) null, (Style) null, 6);
    }
}
