package jqa;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y implements e4m.e {
    public static Retrofit a(ek.a converterFactory, ik0.b factory) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
        vc.s.k(retrofitA);
        return retrofitA;
    }
}
