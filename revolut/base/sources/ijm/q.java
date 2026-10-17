package ijm;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument;

/* JADX INFO: loaded from: classes14.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f161862a = new q();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return ((String) pair.f186385a) + " = " + ((KmAnnotationArgument) pair.f186386b);
    }
}
