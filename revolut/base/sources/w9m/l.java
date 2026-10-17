package w9m;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes23.dex */
public final class l extends u implements Function1 {
    public static final l f = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b it8 = (b) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Float.valueOf(Float.MAX_VALUE);
    }
}
