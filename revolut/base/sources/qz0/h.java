package qz0;

import kotlin.Lazy;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f250326a = yhm.j.b(new qu1.d(24));

    private h() {
    }

    public static OkHttpClient a() {
        return (OkHttpClient) f250326a.getValue();
    }
}
