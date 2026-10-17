package mh4;

import dx4.e1;
import dx4.w1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f205382a = new b0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e1 it8 = (e1) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8 instanceof w1);
    }
}
