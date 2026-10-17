package oq8;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements e4m.e {
    public static Retrofit a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
        s.k(retrofitA);
        return retrofitA;
    }
}
