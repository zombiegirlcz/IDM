package vo0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import rim.d;
import ro0.e;
import ro0.h;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f290835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to0.b f290836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to0.c f290837c;
    public Drawable d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f290838g;

    public c(Context context) {
        to0.b bitmapLayoutProcessor = new to0.b();
        to0.c bitmapBlurProcessor = new to0.c();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmapLayoutProcessor, "bitmapLayoutProcessor");
        Intrinsics.checkNotNullParameter(bitmapBlurProcessor, "bitmapBlurProcessor");
        this.f290835a = context;
        this.f290836b = bitmapLayoutProcessor;
        this.f290837c = bitmapBlurProcessor;
    }

    public static ColorDrawable c(ColorDrawable colorDrawable, h hVar) {
        int color = colorDrawable.getColor();
        float[] matrix = hVar.b();
        if (matrix != null) {
            int[] iArr = io0.c.f163133a;
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            int iH = io0.c.h(color);
            float f = iH;
            float f4 = io0.c.f(color);
            float f5 = color & 255;
            float f6 = color >>> 24;
            color = io0.c.a(f.g(d.c((matrix[18] * f6) + (matrix[17] * f5) + (matrix[16] * f4) + (matrix[15] * f) + matrix[19]), 0, 255), f.g(d.c((matrix[3] * f6) + (matrix[2] * f5) + (matrix[1] * f4) + (matrix[0] * f) + matrix[4]), 0, 255), f.g(d.c((matrix[8] * f6) + (matrix[7] * f5) + (matrix[6] * f4) + (matrix[5] * f) + matrix[9]), 0, 255), f.g(d.c((matrix[13] * f6) + (matrix[12] * f5) + (matrix[11] * f4) + (matrix[10] * f) + matrix[14]), 0, 255));
        }
        Integer numA = hVar.a();
        if (numA != null) {
            int iIntValue = numA.intValue();
            int[] iArr2 = io0.c.f163133a;
            color = io0.c.b(iIntValue, color, ho0.a.SRC_OVER);
        }
        return new ColorDrawable(color);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.graphics.drawable.Drawable r11, int r12, int r13, gim.c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof vo0.b
            if (r0 == 0) goto L13
            r0 = r14
            vo0.b r0 = (vo0.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vo0.b r0 = new vo0.b
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f290833x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r13 = r0.f290832w
            int r12 = r0.v
            android.graphics.drawable.BitmapDrawable r11 = r0.u
            yhm.o.b(r14)
            r5 = r10
            goto L8e
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            yhm.o.b(r14)
            r14 = 0
            if (r12 <= 0) goto L3f
            if (r13 > 0) goto L42
        L3f:
            r5 = r10
            goto Laf
        L42:
            android.graphics.drawable.Drawable r2 = r10.d
            if (r2 != r11) goto L53
            int r2 = r10.e
            if (r2 != r12) goto L53
            int r2 = r10.f
            if (r2 != r13) goto L53
            android.graphics.drawable.Drawable r2 = r10.f290838g
            if (r2 == 0) goto L53
            goto L54
        L53:
            r2 = r14
        L54:
            if (r2 == 0) goto L57
            return r2
        L57:
            boolean r2 = r11 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L69
            java.lang.Object r0 = r10.d(r11, r12, r13)
            boolean r1 = r0 instanceof yhm.n
            if (r1 == 0) goto L64
            goto L65
        L64:
            r14 = r0
        L65:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14
            r5 = r10
            goto La4
        L69:
            boolean r2 = r11 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L91
            elm.g r14 = skm.p0.f264002b
            dp4.y0 r4 = new dp4.y0
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r6
            android.graphics.drawable.BitmapDrawable r11 = (android.graphics.drawable.BitmapDrawable) r11
            r0.u = r11
            r0.v = r7
            r0.f290832w = r8
            r0.z = r3
            java.lang.Object r14 = skm.e0.J(r14, r4, r0)
            if (r14 != r1) goto L8b
            return r1
        L8b:
            r11 = r6
            r12 = r7
            r13 = r8
        L8e:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14
            goto La4
        L91:
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            java.lang.Object r11 = r10.d(r6, r7, r8)
            boolean r12 = r11 instanceof yhm.n
            if (r12 == 0) goto L9e
            goto L9f
        L9e:
            r14 = r11
        L9f:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14
            r11 = r6
            r12 = r7
            r13 = r8
        La4:
            if (r14 != 0) goto La7
            return r14
        La7:
            r5.d = r11
            r5.e = r12
            r5.f = r13
            r5.f290838g = r14
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: vo0.c.a(android.graphics.drawable.Drawable, int, int, gim.c):java.lang.Object");
    }

    public final BitmapDrawable b(BitmapDrawable bitmapDrawable, int i, int i2, h hVar) {
        Bitmap source = DrawableKt.toBitmap$default(bitmapDrawable, 0, 0, null, 7, null);
        this.f290836b.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        if (i <= 0) {
            throw new IllegalArgumentException(a0.d.n("width must be positive, was ", i).toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(a0.d.n("height must be positive, was ", i2).toString());
        }
        float f = i;
        float fA = to0.b.a(f, 0.02f);
        float fCeil = (float) Math.ceil(i2 * fA);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f * fA), (int) fCeil, Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        float width = bitmapCreateBitmap.getWidth() / source.getWidth();
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        float height = source.getHeight() * width;
        if (height < fCeil) {
            float f4 = fCeil - height;
            int iSave = canvasE.save();
            try {
                canvasE.translate(BitmapDescriptorFactory.HUE_RED, f4);
                canvasE.drawBitmap(source, matrix, paint);
                canvasE.restoreToCount(iSave);
                iSave = canvasE.save();
                for (float f5 = 0.0f; f5 < f4; f5 += height) {
                    try {
                        canvasE.drawBitmap(source, matrix, paint);
                        canvasE.translate(BitmapDescriptorFactory.HUE_RED, height);
                    } finally {
                    }
                }
            } finally {
            }
        } else {
            canvasE.drawBitmap(source, matrix, paint);
        }
        float fA2 = to0.b.a(f, 0.02f);
        to0.c cVar = this.f290837c;
        Context context = this.f290835a;
        return new BitmapDrawable(context.getResources(), cVar.a(context, bitmapCreateBitmap, hVar, fA2));
    }

    public final Object d(Drawable drawable, int i, int i2) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            ro0.b bVar = h.Companion;
            Context context = this.f290835a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            h hVar = kli.a.q(context) ? e.f255745a : ro0.f.f255747a;
            if (drawable instanceof BitmapDrawable) {
                objA = b((BitmapDrawable) drawable, i, i2, hVar);
            } else {
                if (!(drawable instanceof ColorDrawable)) {
                    throw new IllegalArgumentException(drawable.getClass() + " is not supported");
                }
                objA = c((ColorDrawable) drawable, hVar);
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Wallpaper blur processing failed", thA, h0Var);
        }
        return objA;
    }
}
