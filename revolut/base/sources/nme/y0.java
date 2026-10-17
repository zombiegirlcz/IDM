package nme;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f217321a = new y0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v19.a it8 = (v19.a) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8 == v19.a.V3);
    }
}
