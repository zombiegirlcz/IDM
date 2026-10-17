package uq2;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d implements e4m.e {
    public static Retrofit a(Retrofit retrofit, Converter.Factory converterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitBuild = retrofit.newBuilder().addConverterFactory(converterFactory).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        return retrofitBuild;
    }
}
