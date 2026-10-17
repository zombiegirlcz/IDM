package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import b8.c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.b;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class OkHttpGlideModule {
    public final void a(Context context, b bVar, Registry registry) {
        if (c.f13073b == null) {
            synchronized (c.class) {
                try {
                    if (c.f13073b == null) {
                        c.f13073b = new OkHttpClient();
                    }
                } finally {
                }
            }
        }
        registry.k(new c(c.f13073b));
    }
}
