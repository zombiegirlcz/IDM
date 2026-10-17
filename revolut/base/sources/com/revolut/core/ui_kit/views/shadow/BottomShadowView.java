package com.revolut.core.ui_kit.views.shadow;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/views/shadow/BottomShadowView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomShadowView extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomShadowView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomShadowView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomShadowView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ShadowLayout shadowLayout = new ShadowLayout(context2, null, 6, 0);
        Context context3 = shadowLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        shadowLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, a.k(context3, 24.0f)));
        Context context4 = shadowLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        u.z(shadowLayout, 0, -a.k(context4, 24.0f), 0, 0, false, 29);
        shadowLayout.setShadowColor(new Color.Solid(R$attr.uikit_colorGreyTone20));
        shadowLayout.setCornersRadius(8.0f);
        shadowLayout.setShadowElevation(4.0f);
        addView(shadowLayout);
    }

    public /* synthetic */ BottomShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
