package bp0;

import com.revolut.core.ui_kit.models.FilterClause;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    public static CharSequence a(CharSequence original, List filters) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Iterator it8 = filters.iterator();
        while (it8.hasNext()) {
            if (!Intrinsics.f((FilterClause.Filter) it8.next(), FilterClause.Filter.WithoutEmoji.f57778a)) {
                throw new NoWhenBranchMatchedException();
            }
            original = d0.F0(new Regex("\\u200D|\\uFE0F").replace(new Regex("[^\\p{L}\\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\s]").replace(original, ""), "")).toString();
        }
        return original;
    }
}
