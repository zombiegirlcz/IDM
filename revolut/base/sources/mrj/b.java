package mrj;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f208151a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map it8 = (Map) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (List) d0.c0(it8.values());
    }
}
