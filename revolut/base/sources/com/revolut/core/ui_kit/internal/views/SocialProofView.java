package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.g0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.s4;
import mx0.bb;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SocialProofView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "clickable", "", "setLabelClickable", "(Z)V", "Lms0/s4;", "content", "setContent", "(Lms0/s4;)V", "color", "setTintColor", "(I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SocialProofView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f56412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f56413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OverlappedIconsView f56414c;
    public final AppCompatTextView d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialProofView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setLabelClickable(boolean clickable) {
        AppCompatTextView appCompatTextView = this.d;
        appCompatTextView.setClickable(clickable);
        appCompatTextView.setOnTouchListener(clickable ? new j01.e(new View[]{appCompatTextView}) : null);
    }

    public final void setContent(@NotNull s4 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        AppCompatTextView appCompatTextView = this.d;
        ty0.c.b(u.k(appCompatTextView).b0(), content.f208421b, appCompatTextView, null, ty0.d.f275448a, 4);
        appCompatTextView.setMaxLines(content.f208422c);
        this.f56413b = Unit.f186387a;
        setLabelClickable(content.d);
        OverlappedIconsView.setIcons$default(this.f56414c, content.f208420a, bb.SMALL, null, 0, false, 28, null);
    }

    public final void setTintColor(int color) {
        this.d.setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialProofView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialProofView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56412a = v0.a.d("create(...)");
        this.f56413b = Unit.f186387a;
        setOrientation(0);
        setGravity(8388627);
        OverlappedIconsView overlappedIconsView = new OverlappedIconsView(context, null, 6, 0);
        overlappedIconsView.setId(R$id.icon);
        overlappedIconsView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f56414c = overlappedIconsView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.label);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setTextColor(kli.a.u(R$attr.uikit_colorWhite, context));
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody3);
        appCompatTextView.setLines(1);
        this.d = appCompatTextView;
        addView(overlappedIconsView);
        addView(appCompatTextView);
        appCompatTextView.setOnClickListener(new g0(this, 21));
    }

    public /* synthetic */ SocialProofView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
