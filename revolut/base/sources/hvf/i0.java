package hvf;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i0 implements e4m.e {
    public static Retrofit a(h0 h0Var, ik0.b factory, Converter.Factory converterFactory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
        vc.s.k(retrofitA);
        return retrofitA;
    }
}
