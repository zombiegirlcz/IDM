package nz7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f220983a = new m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qv0.p it8 = (qv0.p) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8.getO() instanceof d0);
    }
}
