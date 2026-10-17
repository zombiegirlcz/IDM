package wze;

import com.revolut.data.network.models.topup.mapper.TopUpContextMapperKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f301415a;

    public b(tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f301415a = base64Wrapper;
    }

    public final xze.b a(ute.a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.a().f115083b.f306286a;
        long j2 = params.a().f115082a;
        String strB = params.b();
        String strD = params.d();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strD.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new xze.b(str, strB, new String(this.f301415a.b(bytes), charset), j2, params.c(), params.e().name(), TopUpContextMapperKt.toWalletId(params.f()), TopUpContextMapperKt.toDto(params.f()));
    }
}
