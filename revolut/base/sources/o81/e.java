package o81;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public abstract class e implements e4m.e {
    public static Retrofit a(d dVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
        s.k(retrofitA);
        return retrofitA;
    }
}
