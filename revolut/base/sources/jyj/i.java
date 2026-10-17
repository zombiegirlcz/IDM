package jyj;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements c {

    @NotNull
    public static final h Companion = new h();
    public static final int i = Color.parseColor("#75808A");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f179449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f179450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f179451c;
    public final TextPaint d;
    public final TextPaint e;
    public final TextPaint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f179452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f179453h;

    public i(j typefaceProvider) {
        Intrinsics.checkNotNullParameter(typefaceProvider, "typefaceProvider");
        this.f179449a = typefaceProvider;
        this.f179450b = yhm.j.b(new jj2.a(this, 18));
        this.f179451c = b(56.0f, -1);
        this.d = b(240.0f, -1);
        this.e = b(56.0f, -1);
        this.f = b(32.0f, i);
        this.f179452g = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f179453h = new Rect(492, 472, 588, 568);
    }

    public static void a(Canvas canvas, float f, float f4, String str, TextPaint textPaint, int i2) {
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i2).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build().draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final TextPaint b(float f, int i2) {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(i2);
        textPaint.setTypeface((Typeface) this.f179450b.getValue());
        textPaint.setTextSize(f);
        return textPaint;
    }
}
