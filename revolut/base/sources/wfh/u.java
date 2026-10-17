package wfh;

import jel.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f297147a = new u();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jel.c it8 = (jel.c) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        if (it8 instanceof b0) {
            return (b0) it8;
        }
        return null;
    }
}
