package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.t4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/StatItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/t4;", "model", "", "setModel", "(Lms0/t4;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitTextView f56415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f56416b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setModel(@NotNull t4 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kli.a.b(this.f56415a, model.f208444a, ty0.f.f275450a);
        kli.a.b(this.f56416b, model.f208445b, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(1);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceHeading1);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView.setGravity(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uIKitTextView.setEllipsize(truncateAt);
        uIKitTextView.setMaxLines(1);
        this.f56415a = uIKitTextView;
        addView(uIKitTextView);
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kli.a.k(context, 4.0f);
        uIKitTextView2.setLayoutParams(layoutParams);
        jb3.l.e(uIKitTextView2, R$attr.internal_textAppearanceBody3);
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        uIKitTextView2.setGravity(1);
        uIKitTextView2.setEllipsize(truncateAt);
        uIKitTextView2.setMaxLines(1);
        this.f56416b = uIKitTextView2;
        addView(uIKitTextView2);
    }

    public /* synthetic */ StatItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
