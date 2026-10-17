package ep0;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Custom.Color.Gradient f128044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128045c;

    public o(Context context, Custom.Color.Gradient gradient, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f128043a = context;
        this.f128044b = gradient;
        this.f128045c = text;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            float fMeasureText = textPaint.measureText(this.f128045c);
            int i = R$attr.uikit_colorBackground;
            Context context = this.f128043a;
            textPaint.setColor(io0.a.d(1.0f, kli.a.s(i, context)));
            Custom.Color.Gradient gradient = this.f128044b;
            double d = gradient.f57764c;
            float textSize = textPaint.getTextSize();
            double d5 = 360;
            double d6 = ((d % d5) + d5) % d5;
            float radians = (float) Math.toRadians(d6);
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(fMeasureText, d10)) + ((float) Math.pow(textSize, d10)));
            float fAcos = (float) Math.acos(fMeasureText / fSqrt);
            float f = 2;
            float fAbs = Math.abs(((float) Math.cos(((d6 <= 90.0d || d6 >= 180.0d) && (d6 <= 270.0d || d6 >= 360.0d)) ? radians - fAcos : (3.1415927f - radians) - fAcos)) * fSqrt) / f;
            double d15 = radians;
            float fCos = ((float) Math.cos(d15)) * fAbs;
            float fSin = fAbs * ((float) Math.sin(d15));
            Float fValueOf = Float.valueOf(fCos);
            Float fValueOf2 = Float.valueOf(fSin);
            float fFloatValue = fValueOf.floatValue();
            float fFloatValue2 = fValueOf2.floatValue();
            float f4 = fMeasureText / f;
            float textSize2 = textPaint.getTextSize() / f;
            textPaint.setShader(new LinearGradient(f4 - fFloatValue, textSize2 + fFloatValue2, f4 + fFloatValue, textSize2 - fFloatValue2, kli.a.s(gradient.f57762a, context), kli.a.s(gradient.f57763b, context), Shader.TileMode.MIRROR));
        }
    }
}
