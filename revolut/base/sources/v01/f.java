package v01;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.core.content.res.ResourcesCompat;
import com.revolut.core.ui_kit_resources.R$font;
import com.revolut.core_ui_custom_font.R$styleable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private f() {
    }

    public static final void a(Context context, a textView, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (attributeSet == null || textView.isInEditMode()) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TypefaceTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TypefaceTextView_ttv_typeface, -1);
            Intrinsics.checkNotNullParameter(context, "context");
            Typeface typefaceB = b(context, i != 1 ? i != 2 ? "R_Regular" : "R_Medium" : "R_Bold");
            typedArrayObtainStyledAttributes.recycle();
            textView.setTypeface(typefaceB);
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }

    public static final Typeface b(Context context, String typefaceAssetPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(typefaceAssetPath, "typefaceAssetPath");
        return c(context, typefaceAssetPath, null);
    }

    public static final Typeface c(Context context, String str, Float f) {
        Typeface font;
        if (Intrinsics.f(str, "R_Bold")) {
            font = ResourcesCompat.getFont(context, f == null ? R$font.internal_inter_vf_w700_opsz24 : f.floatValue() < 22.0f ? R$font.internal_inter_vf_w700_opsz20 : f.floatValue() < 28.0f ? R$font.internal_inter_vf_w700_opsz24 : R$font.internal_inter_vf_w700_opsz32);
        } else if (Intrinsics.f(str, "R_Medium")) {
            font = ResourcesCompat.getFont(context, f == null ? R$font.internal_inter_vf_w500_opsz18 : f.floatValue() < 13.0f ? R$font.internal_inter_vf_w500_opsz12 : f.floatValue() < 15.0f ? R$font.internal_inter_vf_w500_opsz14 : f.floatValue() < 17.0f ? R$font.internal_inter_vf_w500_opsz16 : f.floatValue() < 25.0f ? R$font.internal_inter_vf_w500_opsz18 : R$font.internal_inter_vf_w500_opsz32);
        } else {
            font = ResourcesCompat.getFont(context, f == null ? R$font.internal_inter_vf_w400_opsz14 : f.floatValue() < 13.0f ? R$font.internal_inter_vf_w400_opsz12 : f.floatValue() < 15.0f ? R$font.internal_inter_vf_w400_opsz14 : R$font.internal_inter_vf_w400_opsz16);
        }
        if (font != null) {
            return font;
        }
        throw new IllegalStateException(j6.a.q("Can't load typeface for: ", str));
    }
}
