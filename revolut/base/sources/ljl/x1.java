package ljl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x1 implements e4m.e {
    public static Retrofit a(ik0.b retrofitFactory, Converter.Factory converterFactory, OkHttpClient okHttpClient, yil.b ssoConfiguration, List coreCallAdapters) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(ssoConfiguration, "ssoConfiguration");
        Intrinsics.checkNotNullParameter(coreCallAdapters, "coreCallAdapters");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, okHttpClient, ssoConfiguration.getHostUrl(), converterFactory, coreCallAdapters, 8);
        vc.s.k(retrofitA);
        return retrofitA;
    }
}
