package rz0;

import c8.k;
import i8.t;
import i8.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import qz0.f;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258461a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f258462b;

    public b(ru0.d okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f258462b = okHttpClient;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, k options) {
        switch (this.f258461a) {
            case 0:
                d base64ImageUrl = (d) obj2;
                Intrinsics.checkNotNullParameter(base64ImageUrl, "base64ImageUrl");
                Intrinsics.checkNotNullParameter(options, "options");
                return new t(base64ImageUrl, new c((OkHttpClient) this.f258462b.invoke(), base64ImageUrl));
            default:
                f redirectUrl = (f) obj2;
                Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
                Intrinsics.checkNotNullParameter(options, "options");
                return new t(redirectUrl, new c(redirectUrl, (OkHttpClient) this.f258462b.invoke()));
        }
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        switch (this.f258461a) {
            case 0:
                d base64ImageUrl = (d) obj2;
                Intrinsics.checkNotNullParameter(base64ImageUrl, "base64ImageUrl");
                break;
            default:
                f glideUrl = (f) obj2;
                Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
                break;
        }
        return true;
    }

    public b(Function0 okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f258462b = okHttpClient;
    }
}
