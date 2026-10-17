package ht0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import androidx.collection.LruCache;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f155160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f155161c;
    public final Paint d;
    public final Paint e;
    public final RadialGradient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LruCache f155162g;

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f155159a = kli.a.k(context, 4.0f);
        this.f155160b = kli.a.k(context, 6.0f);
        this.f155161c = kli.a.k(context, 12.0f);
        int iS = kli.a.s(R$attr.uikit_colorWhite, context);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.d = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.e = paint2;
        this.f = new RadialGradient(kli.a.l(context, 2.5f), kli.a.l(context, -3.0f), kli.a.l(context, 7.8f), iS, io0.a.d(BitmapDescriptorFactory.HUE_RED, iS), Shader.TileMode.CLAMP);
        this.f155162g = new LruCache(3);
    }

    public final void a(int i) {
        int i2;
        Integer numValueOf = Integer.valueOf(i);
        LruCache lruCache = this.f155162g;
        Shader composeShader = (Shader) lruCache.get(numValueOf);
        if (composeShader == null) {
            i2 = i;
            composeShader = new ComposeShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, i2, i, Shader.TileMode.CLAMP), this.f, PorterDuff.Mode.SRC_OVER);
            lruCache.put(Integer.valueOf(i2), composeShader);
        } else {
            i2 = i;
        }
        this.e.setShader(composeShader);
        this.d.setColor(i2);
    }

    public final void b(Canvas canvas, float f, float f4, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a(i);
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f155159a, this.e);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void c(Canvas canvas, float f, float f4, float f5, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a(i);
        float f6 = this.f155161c;
        float f32 = this.f155160b;
        float fA = j6.a.a(1, f5, f6 - f32, f32);
        Paint paint = this.d;
        paint.setAlpha((int) (f5 * 0.6f * 255));
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fA, paint);
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f155159a, this.e);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
