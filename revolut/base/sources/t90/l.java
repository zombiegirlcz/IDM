package t90;

import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {
    public static SelectionStyle a(Integer num, String style) throws Throwable {
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.f(style, "SINGLE_SELECTION")) {
            return SelectionStyle.SingleSelection.f63626a;
        }
        if (Intrinsics.f(style, "MULTI_SELECTION")) {
            return new SelectionStyle.MultiSelection(num != null ? num.intValue() : Integer.MAX_VALUE);
        }
        hx7.e.n(new IllegalStateException(j6.a.q("Unable to parse SelectionStyle style = ", style)));
        return new SelectionStyle.MultiSelection(num != null ? num.intValue() : Integer.MAX_VALUE);
    }

    public static Integer b(SelectionStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (style instanceof SelectionStyle.SingleSelection) {
            return 1;
        }
        if (!(style instanceof SelectionStyle.MultiSelection)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = ((SelectionStyle.MultiSelection) style).f63625a;
        Integer numValueOf = Integer.valueOf(i);
        if (i < Integer.MAX_VALUE) {
            return numValueOf;
        }
        return null;
    }
}
