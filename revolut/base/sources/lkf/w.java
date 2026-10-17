package lkf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f196413a;

    public w(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f196413a = commonDataSource;
    }

    public static CompositeClause a(Clause clause, Integer num) {
        Float fValueOf = Float.valueOf(16.0f);
        Clause[] elements = {num != null ? new ImageClause(num.intValue(), ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16) : null, clause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
