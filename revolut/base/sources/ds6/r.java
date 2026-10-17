package ds6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    private r() {
    }

    public static boolean a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        s[] elements = {s.FILING_PERIOD_STARTED, s.IN_PROGRESS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(sVar);
    }
}
