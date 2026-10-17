package qo0;

import android.content.Context;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f247966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f247967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to0.b f247968c;
    public final to0.c d;
    public final Paint e;
    public final Paint f;

    public c(Context context, a config) {
        to0.b bitmapLayoutProcessor = new to0.b();
        to0.c bitmapBlurProcessor = new to0.c();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bitmapLayoutProcessor, "bitmapLayoutProcessor");
        Intrinsics.checkNotNullParameter(bitmapBlurProcessor, "bitmapBlurProcessor");
        this.f247966a = context;
        this.f247967b = config;
        this.f247968c = bitmapLayoutProcessor;
        this.d = bitmapBlurProcessor;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        float f = 255;
        paint.setAlpha(rim.d.c(0.6f * f));
        this.e = paint;
        Paint paint2 = new Paint();
        paint2.setAlpha(rim.d.c(0.2f * f));
        this.f = paint2;
    }
}
