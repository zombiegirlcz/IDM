package zhm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public class b0 extends a0 {
    public static final int J(int i, List list) {
        if (i >= 0 && i <= v.j(list)) {
            return v.j(list) - i;
        }
        StringBuilder sbW = a0.d.w(i, "Element index ", " must be in range [");
        sbW.append(new IntRange(0, v.j(list), 1));
        sbW.append("].");
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    public static final int K(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbW = a0.d.w(i, "Position index ", " must be in range [");
        sbW.append(new IntRange(0, list.size(), 1));
        sbW.append("].");
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    public static kotlin.text.m L(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new kotlin.text.m(list);
    }

    public static v0 M(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new v0(list);
    }
}
