package cv3;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class t {
    private t() {
    }

    public static u a() {
        return new u(r0.g());
    }

    public static u b(Object parameterValue, String parameterKey) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(parameterValue, "parameterValue");
        return new u(q0.c(new Pair(parameterKey, parameterValue)));
    }
}
