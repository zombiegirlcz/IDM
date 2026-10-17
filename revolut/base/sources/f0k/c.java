package f0k;

import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements e {
    public static Retrofit a(ek.a converterFactory, ik0.b retrofitFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
        s.k(retrofitA);
        return retrofitA;
    }
}
