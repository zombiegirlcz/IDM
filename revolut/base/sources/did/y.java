package did;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y implements e4m.e {
    public static Retrofit a(xj0.i okHttpClientFactory, ik0.b retrofitFactory, kid.c advertisingServiceHeaderInterceptor, kg.o gson) {
        w.Companion.getClass();
        Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(advertisingServiceHeaderInterceptor, "advertisingServiceHeaderInterceptor");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(ik0.b.a(retrofitFactory, xj0.i.a(okHttpClientFactory, null, false, false, zhm.u.c(advertisingServiceHeaderInterceptor), null, null, Constants.TAG_BLE_FIRMWARE_VERSION), null, null, null, 30).newBuilder(), gson, "build(...)");
    }
}
