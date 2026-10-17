package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ActionStatusView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/a;", "content", "", "setContent", "(Lms0/a;)V", "color", "setTintColor", "(I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionStatusView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f56089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f56090b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionStatusView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setContent(@NotNull ms0.a content) {
        Intrinsics.checkNotNullParameter(content, "content");
        aw0.k kVar = (aw0.k) content;
        Image image = kVar.f10383b;
        AppCompatImageView appCompatImageView = this.f56089a;
        if (image != null) {
            appCompatImageView.setVisibility(0);
            yy0.f.e(u.k(this).Q(), image, appCompatImageView, null, null, 12);
        } else {
            appCompatImageView.setVisibility(8);
        }
        ty0.c.b(u.k(this).b0(), kVar.f10382a, this.f56090b, null, null, 12);
    }

    public final void setTintColor(int color) {
        this.f56090b.setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionStatusView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionStatusView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(8388627);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 8.0f);
        appCompatImageView.setId(R$id.icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, iK);
        layoutParams.setMarginEnd(iK2);
        appCompatImageView.setLayoutParams(layoutParams);
        this.f56089a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.label);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setTextColor(kli.a.u(R$attr.uikit_colorWhite_80, context));
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceEmphasis1);
        appCompatTextView.setLines(1);
        this.f56090b = appCompatTextView;
        addView(appCompatImageView);
        addView(appCompatTextView);
    }

    public /* synthetic */ ActionStatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
