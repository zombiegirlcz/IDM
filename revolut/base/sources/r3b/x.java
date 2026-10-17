package r3b;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f251271a = new x();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return new h((List) pair.f186386b, (y49.f) pair.f186385a);
    }
}
