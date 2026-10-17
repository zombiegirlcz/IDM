package b70;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static boolean a(int i, b capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return (i & capability.mask) == capability.mask;
    }
}
