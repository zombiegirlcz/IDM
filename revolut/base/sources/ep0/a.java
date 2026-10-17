package ep0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.RSRuntimeException;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import androidx.collection.SparseArrayCompat;
import com.revolut.core.ui_kit_resources.R$attr;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f128010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f128011c;
    public int d;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128009a = context;
    }

    public final Drawable a(Paint paint, CharSequence charSequence, int i, int i2) throws Throwable {
        Context context;
        int i3;
        Context context2;
        int i5;
        Bitmap bitmap;
        int i6;
        int i21 = i2 - i;
        float textSize = paint.getTextSize();
        if (this.f128011c == textSize && this.d == i21) {
            WeakReference weakReference = this.f128010b;
            Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
        }
        TextPaint textPaint = bp0.a.f17490a;
        Context context3 = this.f128009a;
        Intrinsics.checkNotNullParameter(context3, "context");
        int i22 = (int) textSize;
        int i32 = bp0.a.f17492c;
        if (i21 <= i32) {
            i32 = i21;
        }
        SparseArrayCompat sparseArrayCompat = bp0.a.f17491b;
        Object sparseArrayCompat2 = sparseArrayCompat.get(i22);
        int i33 = 0;
        if (sparseArrayCompat2 == null) {
            sparseArrayCompat2 = new SparseArrayCompat(0, 1, null);
            sparseArrayCompat.put(i22, sparseArrayCompat2);
        }
        SparseArrayCompat sparseArrayCompat3 = (SparseArrayCompat) sparseArrayCompat2;
        WeakReference weakReference2 = (WeakReference) sparseArrayCompat3.get(i32);
        Bitmap bitmap2 = weakReference2 != null ? (Bitmap) weakReference2.get() : null;
        if (bitmap2 == null) {
            float fZ = kli.a.z(i22, context3);
            float f = bp0.a.d;
            if (fZ > f) {
                fZ = f;
            }
            String strU0 = f0.U0(i32, fZ >= 20.0f ? "$$1$$81$$" : "$$88$$88");
            int i43 = fZ >= 20.0f ? 16 : 8;
            TextPaint textPaint2 = bp0.a.f17490a;
            textPaint2.setAlpha(rim.d.c(255 * bp0.a.f));
            jb3.l.d(textPaint2, context3, R$attr.internal_textAppearanceEmphasis1);
            textPaint2.setTextSize(fZ);
            int iC = rim.d.c(textPaint2.measureText(strU0));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC + i43, (i43 / 2) + (textPaint2.getFontMetricsInt().descent - textPaint2.getFontMetricsInt().ascent), Bitmap.Config.ARGB_8888);
            ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap).drawText(strU0, (r10 - iC) / 2.0f, (r11 - textPaint2.getFontMetricsInt().descent) - ((r11 - r15) / 2.0f), textPaint2);
            int i59 = bp0.a.e;
            int i66 = 0;
            while (i66 < i59) {
                try {
                    cp5.c.e(context3, bitmapCreateBitmap, i43);
                    i3 = i59;
                    context2 = context3;
                    i5 = i66;
                    bitmap = bitmapCreateBitmap;
                } catch (RSRuntimeException unused) {
                    int width = bitmapCreateBitmap.getWidth();
                    int height = bitmapCreateBitmap.getHeight();
                    int i74 = width * height;
                    int[] iArr = new int[i74];
                    Bitmap bitmap3 = bitmapCreateBitmap;
                    bitmap3.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i92 = width - 1;
                    int i96 = height - 1;
                    int i99 = i43 + i43;
                    int i100 = i99 + 1;
                    int i101 = i33;
                    int[] iArr2 = new int[i74];
                    i3 = i59;
                    int[] iArr3 = new int[i74];
                    int[] iArr4 = new int[i74];
                    int[] iArr5 = new int[Math.max(width, height)];
                    int i102 = (i99 + 2) >> 1;
                    int i103 = i102 * i102;
                    int i104 = i103 * 256;
                    context2 = context3;
                    int[] iArr6 = new int[i104];
                    for (int i105 = i101; i105 < i104; i105++) {
                        iArr6[i105] = i105 / i103;
                    }
                    int[] iArr7 = new int[2];
                    iArr7[1] = 3;
                    iArr7[i101] = i100;
                    int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr7);
                    int i106 = i43 + 1;
                    int i107 = i101;
                    int i108 = i107;
                    int i109 = i108;
                    while (i107 < height) {
                        int[][] iArr9 = iArr8;
                        int i110 = -i43;
                        int i111 = i101;
                        int i112 = i111;
                        int i113 = i112;
                        int i114 = i113;
                        int i115 = i114;
                        int i116 = i115;
                        int i117 = i116;
                        int i118 = i117;
                        int i119 = i118;
                        while (i110 <= i43) {
                            int i120 = i106;
                            int i121 = i66;
                            int i122 = i101;
                            int i123 = iArr[Math.min(i92, Math.max(i110, i122)) + i108];
                            int[] iArr10 = iArr9[i110 + i43];
                            iArr10[i122] = (i123 & 16711680) >> 16;
                            iArr10[1] = (i123 & 65280) >> 8;
                            iArr10[2] = i123 & 255;
                            int iAbs = i120 - Math.abs(i110);
                            int i124 = iArr10[i122];
                            i111 = (i124 * iAbs) + i111;
                            int i125 = iArr10[1];
                            i112 = (i125 * iAbs) + i112;
                            int i126 = iArr10[2];
                            i113 = (iAbs * i126) + i113;
                            if (i110 > 0) {
                                i117 += i124;
                                i118 += i125;
                                i119 += i126;
                            } else {
                                i114 += i124;
                                i115 += i125;
                                i116 += i126;
                            }
                            i110++;
                            i106 = i120;
                            i66 = i121;
                            i101 = 0;
                        }
                        int i127 = i106;
                        int i128 = i66;
                        int i129 = i43;
                        int i130 = 0;
                        while (i130 < width) {
                            iArr2[i108] = iArr6[i111];
                            iArr3[i108] = iArr6[i112];
                            iArr4[i108] = iArr6[i113];
                            int i131 = i111 - i114;
                            int i132 = i112 - i115;
                            int i133 = i113 - i116;
                            int[] iArr11 = iArr9[((i129 - i43) + i100) % i100];
                            int i134 = i114 - iArr11[0];
                            int i135 = i115 - iArr11[1];
                            int i136 = i116 - iArr11[2];
                            if (i107 == 0) {
                                i6 = i130;
                                iArr5[i6] = Math.min(i130 + i43 + 1, i92);
                            } else {
                                i6 = i130;
                            }
                            int i137 = iArr[i109 + iArr5[i6]];
                            int i138 = (i137 & 16711680) >> 16;
                            iArr11[0] = i138;
                            int i139 = (i137 & 65280) >> 8;
                            iArr11[1] = i139;
                            int i140 = i137 & 255;
                            iArr11[2] = i140;
                            int i141 = i117 + i138;
                            int i142 = i118 + i139;
                            int i143 = i119 + i140;
                            i111 = i131 + i141;
                            i112 = i132 + i142;
                            i113 = i133 + i143;
                            int i144 = (i129 + 1) % i100;
                            int[] iArr12 = iArr9[i144 % i100];
                            int i145 = iArr12[0];
                            i114 = i134 + i145;
                            int i146 = iArr12[1];
                            i115 = i135 + i146;
                            int i147 = iArr12[2];
                            i116 = i136 + i147;
                            i117 = i141 - i145;
                            i118 = i142 - i146;
                            i119 = i143 - i147;
                            i108++;
                            i129 = i144;
                            i130 = i6 + 1;
                        }
                        i109 += width;
                        i107++;
                        iArr8 = iArr9;
                        i106 = i127;
                        i66 = i128;
                        i101 = 0;
                    }
                    int[][] iArr13 = iArr8;
                    int i148 = i106;
                    i5 = i66;
                    int i149 = 0;
                    while (i149 < width) {
                        int i150 = -i43;
                        int i151 = i150 * width;
                        int i152 = 0;
                        int i153 = 0;
                        int i154 = 0;
                        int i155 = 0;
                        int i156 = 0;
                        int i157 = 0;
                        int i158 = 0;
                        int i159 = 0;
                        int i160 = 0;
                        while (i150 <= i43) {
                            int iMax = Math.max(0, i151) + i149;
                            int[] iArr14 = iArr13[i150 + i43];
                            iArr14[0] = iArr2[iMax];
                            iArr14[1] = iArr3[iMax];
                            iArr14[2] = iArr4[iMax];
                            int iAbs2 = i148 - Math.abs(i150);
                            i152 = (iArr2[iMax] * iAbs2) + i152;
                            i153 = (iArr3[iMax] * iAbs2) + i153;
                            i154 = (iArr4[iMax] * iAbs2) + i154;
                            if (i150 > 0) {
                                i158 += iArr14[0];
                                i159 += iArr14[1];
                                i160 += iArr14[2];
                            } else {
                                i155 += iArr14[0];
                                i156 += iArr14[1];
                                i157 += iArr14[2];
                            }
                            if (i150 < i96) {
                                i151 += width;
                            }
                            i150++;
                        }
                        int i161 = i149;
                        int i162 = i43;
                        int i163 = 0;
                        while (i163 < height) {
                            iArr[i161] = (iArr[i161] & (-16777216)) | (iArr6[i152] << 16) | (iArr6[i153] << 8) | iArr6[i154];
                            int i164 = i152 - i155;
                            int i165 = i153 - i156;
                            int i166 = i154 - i157;
                            int[] iArr15 = iArr13[((i162 - i43) + i100) % i100];
                            int i167 = i155 - iArr15[0];
                            int i168 = i156 - iArr15[1];
                            int i169 = i157 - iArr15[2];
                            int i170 = i149;
                            if (i149 == 0) {
                                iArr5[i163] = Math.min(i163 + i148, i96) * width;
                            }
                            int i171 = i170 + iArr5[i163];
                            int i172 = iArr2[i171];
                            iArr15[0] = i172;
                            int i173 = iArr3[i171];
                            iArr15[1] = i173;
                            int i174 = iArr4[i171];
                            iArr15[2] = i174;
                            int i175 = i158 + i172;
                            int i176 = i159 + i173;
                            int i177 = i160 + i174;
                            i152 = i164 + i175;
                            i153 = i165 + i176;
                            i154 = i166 + i177;
                            i162 = (i162 + 1) % i100;
                            int[] iArr16 = iArr13[i162];
                            int i178 = iArr16[0];
                            i155 = i167 + i178;
                            int i179 = iArr16[1];
                            i156 = i168 + i179;
                            int i180 = iArr16[2];
                            i157 = i169 + i180;
                            i158 = i175 - i178;
                            i159 = i176 - i179;
                            i160 = i177 - i180;
                            i161 += width;
                            i163++;
                            i149 = i170;
                        }
                        i149++;
                    }
                    bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
                    bitmap = bitmap3;
                }
                Intrinsics.h(bitmap);
                i66 = i5 + 1;
                bitmapCreateBitmap = bitmap;
                i59 = i3;
                context3 = context2;
                i33 = 0;
            }
            context = context3;
            Bitmap bitmap4 = bitmapCreateBitmap;
            sparseArrayCompat3.put(i32, new WeakReference(bitmap4));
            bitmap2 = bitmap4;
        } else {
            context = context3;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap2);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        bitmapDrawable.setBounds(0, 0, rim.d.c(paint.measureText(charSequence, i, i2)), fontMetricsInt.bottom - fontMetricsInt.top);
        this.f128010b = new WeakReference(bitmapDrawable);
        this.f128011c = textSize;
        this.d = i21;
        return bitmapDrawable;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i5, int i6, Paint paint) throws Throwable {
        ForegroundColorSpan foregroundColorSpan;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Drawable drawableA = a(paint, text, i, i2);
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        ForegroundColorSpan[] foregroundColorSpanArr = spanned != null ? (ForegroundColorSpan[]) spanned.getSpans(i, i2, ForegroundColorSpan.class) : null;
        drawableA.setTint((foregroundColorSpanArr == null || (foregroundColorSpan = (ForegroundColorSpan) kotlin.collections.d.f0(foregroundColorSpanArr)) == null) ? paint.getColor() : foregroundColorSpan.getForegroundColor());
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float fHeight = (i5 - (drawableA.getBounds().height() / 2.0f)) - (((fontMetricsInt.descent - fontMetricsInt.ascent) / 2.0f) - fontMetricsInt.descent);
        int iSave = canvas.save();
        canvas.translate(f, fHeight);
        try {
            drawableA.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Rect bounds = a(paint, text, i, i2).getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return bounds.right;
    }
}
