package lp5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {
    @Override // lp5.a
    public final boolean validate(String destinationTag) {
        Intrinsics.checkNotNullParameter(destinationTag, "destinationTag");
        if (destinationTag.length() == 0) {
            return true;
        }
        Long lN = z.n(destinationTag);
        if (lN != null) {
            long jLongValue = lN.longValue();
            if (0 <= jLongValue && jLongValue < 4294967296L) {
                return true;
            }
        }
        return false;
    }
}
