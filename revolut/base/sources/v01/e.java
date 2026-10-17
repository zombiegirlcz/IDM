package v01;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.revolut.core_ui_custom_font.R$styleable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    @Override // v01.d
    public final void a(Context context, a textView, AttributeSet attributeSet) {
        int resourceId;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        f.a(context, textView, attributeSet);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TypefaceTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TypefaceTextView_ttv_clearFocusOnKeyboardClose)) {
                textView.setClearFocusOnKeyboardClose(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TypefaceTextView_ttv_clearFocusOnKeyboardClose, false));
            }
            if (textView.isInEditMode() && (resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TypefaceTextView_ttv_text, -1)) != -1) {
                textView.setText(context.getString(resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }
}
