package fib;

import com.revolut.core.error.data.model.ServerErrorException;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public final class s {
    public static r a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof HttpException) {
            ServerErrorException serverErrorExceptionA = com.revolut.core.error.data.model.a.a((HttpException) throwable);
            int i = serverErrorExceptionA.e;
            if (i == 404) {
                return q.f135380a;
            }
            if (i == 409) {
                return n.f135377a;
            }
            if (i == 422) {
                int i2 = serverErrorExceptionA.f.f51362a;
                if (i2 == 1041) {
                    return p.f135379a;
                }
                if (i2 == 9003) {
                    return l.f135375a;
                }
                if (i2 == 9004) {
                    return m.f135376a;
                }
            }
        }
        return o.f135378a;
    }
}
