package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.internal.views.k;
import com.revolut.core.ui_kit_resources.R$attr;
import kl.c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.a5;
import ms0.x4;
import ms0.y4;
import ms0.z4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0004\u0010\u0011\n\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/TimerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/z4;", "data", "", "setup", "(Lms0/z4;)V", "Companion", "ms0/y4", "ms0/x4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimerView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CircleProgressBar f56445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UIKitTextView f56446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56447c;
    public float d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f56449h;
    public x4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f56450j;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.TimerView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String a(int i) {
        int i2 = a5.f208178b[this.i.ordinal()];
        if (i2 == 1) {
            return a0.d.v(new Object[]{Integer.valueOf(i)}, 1, "%d", "format(...)");
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return a0.d.v(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2, "%d:%02d", "format(...)");
    }

    public final UIKitTextView b() {
        UIKitTextView uIKitTextView = this.f56446b;
        if (uIKitTextView != null) {
            return uIKitTextView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, 6, 0);
        this.f56446b = uIKitTextView2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        uIKitTextView2.setLayoutParams(layoutParams);
        addView(uIKitTextView2);
        return uIKitTextView2;
    }

    public final CircleProgressBar c() {
        CircleProgressBar circleProgressBar = this.f56445a;
        if (circleProgressBar != null) {
            return circleProgressBar;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CircleProgressBar circleProgressBar2 = new CircleProgressBar(context, null, 6, 0);
        this.f56445a = circleProgressBar2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 50.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, kli.a.k(context3, 50.0f));
        layoutParams.gravity = 17;
        circleProgressBar2.setLayoutParams(layoutParams);
        int i = this.f56447c;
        int i2 = R$attr.uikit_colorAccent;
        int i3 = R$attr.uikit_colorGreyTone10;
        float f = this.f56449h;
        circleProgressBar2.a(new ProgressStyle(0, i, i2, i2, i3, f, f, null, ViewUtils.EDGE_TO_EDGE_FLAGS));
        addView(circleProgressBar2);
        return circleProgressBar2;
    }

    public final void d(int i) {
        CircleProgressBar circleProgressBarC = c();
        k.a aVar = k.Companion;
        int i2 = this.f56447c;
        aVar.getClass();
        int i3 = (i2 <= 0 || i >= i2 / 4) ? R$attr.uikit_colorAccent : R$attr.uikit_colorOrange;
        if (i3 != this.f56448g) {
            this.f56448g = i3;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            circleProgressBarC.setStartColor(kli.a.s(this.f56448g, context));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            circleProgressBarC.setEndColor(kli.a.s(this.f56448g, context2));
        }
        circleProgressBarC.setProgress(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56450j.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f56450j;
        kVar.f57224h = false;
        Choreographer.getInstance().removeFrameCallback(kVar.k);
    }

    public final void setup(@NotNull z4 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        c();
        y4 y4Var = data.f208506c;
        UIKitTextView uIKitTextViewB = b();
        CircleProgressBar circleProgressBarC = c();
        int i = a5.f208177a[y4Var.ordinal()];
        if (i == 1) {
            this.d = 94.0f;
            this.e = R$attr.internal_textAppearanceHeading3;
            this.f56449h = 4.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.d = 50.0f;
            this.e = R$attr.internal_textAppearanceEmphasis1;
            this.f56449h = 2.0f;
        }
        int i2 = this.e;
        if (i2 != this.f) {
            jb3.l.e(uIKitTextViewB, i2);
            this.f = this.e;
        }
        ViewGroup.LayoutParams layoutParams = circleProgressBarC.getLayoutParams();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, this.d);
        layoutParams.width = iK;
        layoutParams.height = iK;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        circleProgressBarC.setBarThickness(kli.a.k(r0, this.f56449h));
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        circleProgressBarC.setBgThickness(kli.a.k(r0, this.f56449h));
        invalidate();
        this.i = data.d;
        this.f56450j.b(data.f208504a, data.f208505b, data.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56447c = 100;
        this.d = 94.0f;
        this.e = R$attr.internal_textAppearanceHeading3;
        this.f = -1;
        this.f56448g = R$attr.uikit_colorAccent;
        this.f56449h = 4.0f;
        this.i = x4.MINUTES;
        k kVar = new k();
        kVar.f57226l = new c0(this, 18);
        this.f56450j = kVar;
    }

    public /* synthetic */ TimerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
