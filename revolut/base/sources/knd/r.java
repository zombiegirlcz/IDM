package knd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f186125a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        he3.h it8 = (he3.h) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return k71.k.b(it8.f151559a).f115082a > 0 ? "INCOME" : "SPENDING";
    }
}
