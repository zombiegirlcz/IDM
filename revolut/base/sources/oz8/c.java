package oz8;

import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements e {
    public static Retrofit a(ik0.b retrofitFactory, v09.a learnNetworkConfiguration, Converter.Factory converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(learnNetworkConfiguration, "learnNetworkConfiguration");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, learnNetworkConfiguration.getHostUrl(), converterFactory, null, 25);
        s.k(retrofitA);
        return retrofitA;
    }
}
