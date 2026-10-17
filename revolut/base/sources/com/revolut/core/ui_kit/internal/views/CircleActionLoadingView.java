package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import aw0.v1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CircleActionLoadingView;", "Landroid/widget/FrameLayout;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleActionLoadingView extends FrameLayout implements ur0.a {
    public static final int d = R$attr.uikit_colorGreyTone8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShimmerFrameLayout f56116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f56117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f56118c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleActionLoadingView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        ifk.b.q(this.f56116a, colorScheme, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleActionLoadingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleActionLoadingView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_circle_action_loading, this);
        View viewFindViewById = findViewById(R$id.actionCircleLoading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f56117b = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.actionCircleLoading_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f56118c = viewFindViewById2;
        int iS = kli.a.s(d, context);
        RoundedBackgroundDrawable.INSTANCE.getClass();
        viewFindViewById.setBackground(RoundedBackgroundDrawable.Companion.c(iS, context));
        viewFindViewById2.setBackground(RoundedBackgroundDrawable.Companion.c(iS, context));
        View viewFindViewById3 = findViewById(R$id.actionCircleLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewFindViewById3;
        this.f56116a = shimmerFrameLayout;
        ifk.b.q(shimmerFrameLayout, null, 3);
        if (jo0.m.f176851h) {
            return;
        }
        shimmerFrameLayout.a();
    }

    public /* synthetic */ CircleActionLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
