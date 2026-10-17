package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.WindowHelperKt;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a&\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0000¨\u0006\n"}, d2 = {"removeAccessibilityAction", "", "Landroid/view/View;", "setOvalMargin", "width", "", "height", "marginTop", "toSize", "Landroid/util/Size;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionsKt {
    public static final void removeAccessibilityAction(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.ViewExtensionsKt.removeAccessibilityAction.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                info.setClickable(false);
            }
        });
    }

    public static final void setOvalMargin(@NotNull View view, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            OvalRect ovalRect = OvalRect.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            OnfidoRectF onfidoRectF = ovalRect.get(i, i2, WindowHelperKt.getWindowSizeClass(context));
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ((int) onfidoRectF.getTop()) + ((int) onfidoRectF.height()) + i3, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public static /* synthetic */ void setOvalMargin$default(View view, int i, int i2, int i3, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            i3 = view.getContext().getResources().getDimensionPixelSize(R.dimen.onfido_avc_padding_oval_and_text);
        }
        setOvalMargin(view, i, i2, i3);
    }

    @NotNull
    public static final Size toSize(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new Size(view.getWidth(), view.getHeight());
    }
}
