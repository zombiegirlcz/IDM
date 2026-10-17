package nkm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public class u extends t {
    public static h i(Sequence sequence, Class klass) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return y.n(sequence, new a35.o(klass, 2));
    }
}
