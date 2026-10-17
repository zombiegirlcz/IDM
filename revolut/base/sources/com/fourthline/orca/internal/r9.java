package com.fourthline.orca.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
public abstract class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f32647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f32649c;
    private static final Method d;

    static {
        try {
            f32647a = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();
            f32648b = ((Integer) Canvas.class.getField("ALL_SAVE_FLAG").get(null)).intValue();
            Class cls = Integer.TYPE;
            f32649c = Canvas.class.getMethod("save", cls);
            d = Canvas.class.getMethod("saveLayer", RectF.class, Paint.class, cls);
        } catch (Throwable th10) {
            throw a(th10);
        }
    }

    public static void a(Canvas canvas, int i) {
        try {
            f32649c.invoke(canvas, Integer.valueOf(i));
        } catch (Throwable th10) {
            throw a(th10);
        }
    }

    private static Throwable b(Throwable th10) throws Throwable {
        throw th10;
    }

    private static RuntimeException a(Throwable th10) {
        if (th10 != null) {
            return (RuntimeException) b(th10);
        }
        throw new NullPointerException("t");
    }

    public static void a(Canvas canvas, RectF rectF, Paint paint, int i) {
        try {
            d.invoke(canvas, rectF, paint, Integer.valueOf(i));
        } catch (Throwable th10) {
            throw a(th10);
        }
    }
}
