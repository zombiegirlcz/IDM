package ssb;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e implements e4m.e {
    public static Retrofit a(ek.a converterFactory, ik0.b retrofitFactory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
        s.k(retrofitA);
        return retrofitA;
    }
}
