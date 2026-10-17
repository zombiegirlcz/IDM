package qzl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.revolut.uicomponent.R$styleable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v01.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends d {

    @NotNull
    public static final C1379a Companion = new C1379a();

    /* JADX INFO: renamed from: qzl.a$a, reason: collision with other inner class name */
    public static final class C1379a {
        private C1379a() {
        }
    }

    @Override // v01.d
    public final void a(Context context, v01.a textView, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        super.a(context, textView, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TypefaceTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TypefaceTextView_ttv_text, -1);
            z2l.a aVar = z2l.a.f319097a;
            if (resourceId != -1) {
                textView.setText(aVar.getString(resourceId));
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TypefaceTextView_ttv_hint, -1);
            if (resourceId2 != -1) {
                textView.setHint(aVar.getString(resourceId2));
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th10) {
            typedArrayObtainStyledAttributes.recycle();
            throw th10;
        }
    }
}
