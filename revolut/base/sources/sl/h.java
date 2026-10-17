package sl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends kotlin.jvm.internal.u implements Function1 {
    public static final h f = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return Boolean.valueOf((throwable instanceof HttpException) && j.f264038g.contains(Integer.valueOf(((HttpException) throwable).code())));
    }
}
