package sr0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.revolut.core.ui_kit.R$styleable;
import ix0.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265101a;

    public a(@NotNull Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InsetsAdjustableContainer);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f265101a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.InsetsAdjustableContainer_fitNavigationBar, this.f265101a);
        typedArrayObtainStyledAttributes.recycle();
    }
}
