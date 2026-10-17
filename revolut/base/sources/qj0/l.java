package qj0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
public abstract class l implements e4m.e {
    public static Retrofit a(ik0.b factory, OkHttpClient okHttp) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(okHttp, "okHttp");
        Retrofit retrofitA = ik0.b.a(factory, okHttp, null, null, null, 30);
        s.k(retrofitA);
        return retrofitA;
    }
}
