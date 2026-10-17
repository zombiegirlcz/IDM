package yr0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseShot;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.sound.Sound;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends BaseShot {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f316087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.c f316088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.f f316089c;
    public final lz0.g d;
    public final TextView e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f316090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f316091h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f316092j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Sound f316093l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ViewGroup parent, View content, vfg.p contentViewCallback) {
        super(parent, content, contentViewCallback);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(contentViewCallback, "contentViewCallback");
        Object systemService = parent.getContext().getSystemService("accessibility");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f316087a = (AccessibilityManager) systemService;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f316088b = jh.d.f(context).b0();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f316089c = jh.d.f(context2).Q();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.d = jh.d.f(context3).c0();
        this.e = (TextView) this.view.findViewById(R$id.shot_message);
        this.f = (ImageView) this.view.findViewById(R$id.shot_image);
        this.f316090g = (ImageView) this.view.findViewById(R$id.shot_animated_icon);
        TextView action = (TextView) this.view.findViewById(R$id.shot_action);
        this.f316091h = action;
        View delimiter = this.view.findViewById(R$id.shot_delimiter);
        this.i = delimiter;
        View viewFindViewById = this.view.findViewById(R$id.shot_background);
        this.f316092j = viewFindViewById;
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.view;
        snackbarBaseLayout.setBackgroundColor(ContextCompat.getColor(snackbarBaseLayout.getContext(), R.color.transparent));
        this.view.setPadding(0, 0, 0, 0);
        this.view.setOnTouchListener(null);
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel().withCornerSize(kli.a.k(r1, 28.0f)));
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        materialShapeDrawable.setElevation(kli.a.k(r1, 10.0f));
        materialShapeDrawable.setShadowCompatibilityMode(2);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorPopoverBackground, context4)));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        materialShapeDrawable.setShadowColor(kli.a.s(com.revolut.core.ui_kit.R$attr.internal_colorPopupShadow, context5));
        viewFindViewById.setBackground(materialShapeDrawable);
        Intrinsics.checkNotNullExpressionValue(delimiter, "delimiter");
        delimiter.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(action, "action");
        ViewGroup.LayoutParams layoutParams = action.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        marginLayoutParams.setMarginStart(kli.a.k(context6, 12.0f));
        action.setLayoutParams(marginLayoutParams);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int getDuration() {
        int duration = super.getDuration();
        if (duration != -2) {
            int i = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.f316087a;
            if (i >= 29) {
                return accessibilityManager.getRecommendedTimeoutMillis(duration, (this.k ? 4 : 0) | 3);
            }
            if (!this.k || !accessibilityManager.isTouchExplorationEnabled()) {
                return duration;
            }
        }
        return -2;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void show() {
        super.show();
        Sound sound = this.f316093l;
        if (sound != null) {
            ((com.revolut.core.ui_kit_core.displayers.sound.a) this.d).a(sound);
        }
    }
}
