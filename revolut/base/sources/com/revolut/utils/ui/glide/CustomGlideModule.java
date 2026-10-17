package com.revolut.utils.ui.glide;

import a0.d;
import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import b9.m2;
import com.bumptech.glide.Registry;
import com.bumptech.glide.b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import okhttp3.OkHttpClient;
import qz0.f;
import s8.a;
import sz0.c;
import th0.l;
import xz0.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/utils/ui/glide/CustomGlideModule;", "Ls8/a;", "<init>", "()V", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomGlideModule extends a {
    public static e H(Context context) {
        phm.a aVar = (phm.a) j6.a.i(context, e.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (e) aVar2.b();
        }
        throw new IllegalStateException(d.q("Api ", e.class, " is not found"));
    }

    public static c21.e I(Context context) {
        phm.a aVar = (phm.a) j6.a.i(context, c21.e.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (c21.e) aVar2.b();
        }
        throw new IllegalStateException(d.q("Api ", c21.e.class, " is not found"));
    }

    public static h51.a J(Context context) {
        phm.a aVar = (phm.a) j6.a.i(context, h51.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (h51.a) aVar2.b();
        }
        throw new IllegalStateException(d.q("Api ", h51.a.class, " is not found"));
    }

    @Override // com.bumptech.glide.c
    public final void y(Context context, b glide, Registry registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        registry.h(j.class, InputStream.class, new c(new a01.c(this, context, 1), new a01.c(this, context, 2), new a01.c(this, context, 3), (byte) 0));
        registry.h(sz0.b.class, InputStream.class, new c(new a01.c(context, 4), new a01.c(this, context, 5), new a01.c(this, context, 6)));
        registry.h(f.class, InputStream.class, new uz0.a(new a01.c(this, context, 7)));
        registry.j(m2.class, PictureDrawable.class, new vz0.b());
        registry.d("legacy_append", InputStream.class, m2.class, new vz0.a());
        registry.h(rz0.d.class, ByteBuffer.class, new rz0.a(0));
        tz0.a.a(registry, (OkHttpClient) ((c21.b) I(context)).T.get(), ((th0.a) l.Companion.c()).f());
    }
}
