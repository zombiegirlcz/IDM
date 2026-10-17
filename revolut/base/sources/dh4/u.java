package dh4;

import dx4.e1;
import dx4.r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f114765a = new u();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e1 it8 = (e1) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8 instanceof r0);
    }
}
