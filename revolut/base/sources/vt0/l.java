package vt0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.lightprompt.LightPromptViewModel;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f291896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f291897b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getCloseButton() {
        return this.f291897b.f();
    }

    private final FullScreenStateView getFullScreenState() {
        return (FullScreenStateView) this.f291896a.f();
    }

    public final ihm.f a() {
        return getFullScreenState().getSmallActionButton().f56386h;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        u.z(getCloseButton(), 0, insets2.top, 0, 0, false, 29);
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, Insets.NONE).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        WindowInsets windowInsets = windowInsetsCompatBuild.toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    public final void setCloseButtonClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getCloseButton().setOnClickListener(listener);
    }

    public final void setModel(@NotNull LightPromptViewModel.Error model) {
        Intrinsics.checkNotNullParameter(model, "model");
        getFullScreenState().setAnalyticsContext(model.d);
        getFullScreenState().getSmallActionButton().setAnalyticsContext(model.d);
        FullScreenStateView fullScreenState = getFullScreenState();
        FullScreenStateView.setImage$default(fullScreenState, model.f58092a, null, 2, null);
        fullScreenState.setTitleText(model.f58093b);
        fullScreenState.getSmallActionButton().setVisibility(0);
        fullScreenState.getSmallActionButton().setText(model.f58094c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f291896a = kli.a.J(R$id.lightPromptFullScreenError_fullScreenState, this);
        this.f291897b = kli.a.J(R$id.lightPromptFullScreenError_closeButton, this);
        View.inflate(context, R$layout.internal_view_light_prompt_full_screen_error, this);
        setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
        ViewUtils.requestApplyInsetsWhenAttached(this);
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
