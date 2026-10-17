package d7f;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vel.l;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f111959a = new j();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (l) d0.d0(it8);
    }
}
