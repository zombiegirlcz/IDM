package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class nc extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f209863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f209864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mc f209865c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nc(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }

    public final void setActionModel(@NotNull mc model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f209865c, model)) {
            return;
        }
        mc mcVar = this.f209865c;
        this.f209865c = model;
        if (!(model instanceof lc)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = mcVar instanceof lc;
        AppCompatImageView appCompatImageView = this.f209863a;
        if (!z || !Intrinsics.f(((lc) mcVar).f209808c, ((lc) model).f209808c)) {
            yy0.f.e(or0.u.k(this).Q(), ((lc) model).f209808c, appCompatImageView, null, null, 12);
        }
        appCompatImageView.setVisibility(0);
        setOnClickListener(new kp0.l(this, (lc) model, 10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nc(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209864b = v0.a.d("create(...)");
        int iK = kli.a.k(context, 16.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.tabsActionView_icon);
        this.f209863a = appCompatImageView;
        addView(appCompatImageView, new FrameLayout.LayoutParams(iK, iK, 17));
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, kli.a.s(R$attr.uikit_colorSegmentedBackground, context), 4);
        roundedBackgroundDrawable.f(kli.a.w(R$attr.uikit_fixed_tab_layout_corner_radius, context));
        setBackground(roundedBackgroundDrawable);
    }

    public /* synthetic */ nc(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
