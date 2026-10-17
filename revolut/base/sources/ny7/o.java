package ny7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f220700a = new o();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qv0.p it8 = (qv0.p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8.getK() instanceof zw7.z);
    }
}
