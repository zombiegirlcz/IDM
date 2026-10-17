package ba8;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13984a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(!it8.isEmpty());
    }
}
