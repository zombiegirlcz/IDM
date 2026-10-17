package tz0;

import b8.c;
import com.bumptech.glide.Registry;
import ih0.b;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private a() {
    }

    public static void a(Registry registry, OkHttpClient okHttpClient, b remoteConfig) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        if (((ii0.b) remoteConfig).b("EID_GLIDE_OKHTTP_LOADER_ENABLED")) {
            registry.k(new c(okHttpClient));
        }
    }
}
