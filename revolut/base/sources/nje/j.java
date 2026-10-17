package nje;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f216465a = new j();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yh5.a it8 = (yh5.a) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(yh5.b.x(it8));
    }
}
