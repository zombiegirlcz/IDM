package lz1;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public abstract class h implements e4m.e {
    public static Retrofit a(g gVar, ik0.b factory, Converter.Factory converterFactory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
        s.k(retrofitA);
        return retrofitA;
    }
}
