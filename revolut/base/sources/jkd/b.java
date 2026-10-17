package jkd;

import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface b {
    default r X1() {
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }
}
