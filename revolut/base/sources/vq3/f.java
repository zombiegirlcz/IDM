package vq3;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f implements e4m.e {
    public static Retrofit a(e eVar, ik0.b factory, OkHttpClient okHttpClient, Converter.Factory gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Retrofit retrofitA = ik0.b.a(factory, okHttpClient, null, gsonConverterFactory, null, 26);
        s.k(retrofitA);
        return retrofitA;
    }
}
