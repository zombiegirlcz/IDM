package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.c0;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\b\b\u0001\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R.\u0010B\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/revolut/core/ui_kit/views/FooterActionButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setButtonText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setButtonImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "description", "setDescription", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "style", "setButtonStyle", "(Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;)V", "", "enabled", "setButtonEnabled", "(Z)V", "setSecondaryButtonEnabled", "clickable", "setButtonClickable", "", "tag", "setLoadingButtonTag", "(Ljava/lang/String;)V", "colorAttr", "setBackgroundColorAttr", "(I)V", "Landroid/graphics/Paint;", "f", "Lkotlin/Lazy;", "getGradientPaint", "()Landroid/graphics/Paint;", "gradientPaint", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "g", "Le8/q;", "getButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "button", "Landroidx/appcompat/widget/AppCompatTextView;", "h", "getDescriptionTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "descriptionTextView", "Landroid/os/Parcelable;", "value", "j", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class FooterActionButtonView extends ConstraintLayout implements TrackableItem, w0 {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f58597b;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q button;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q descriptionTextView;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FooterActionButtonView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LargeActionButton getButton() {
        return (LargeActionButton) this.button.f();
    }

    private final AppCompatTextView getDescriptionTextView() {
        return (AppCompatTextView) this.descriptionTextView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Paint getGradientPaint() {
        return (Paint) this.f.getValue();
    }

    public final efm.r f0() {
        return getButton().o;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58597b.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), getGradientPaint());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        Paint gradientPaint = getGradientPaint();
        float height = getHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorTransparent, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS2 = kli.a.s(R$attr.uikit_windowBackground, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gradientPaint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, height, new int[]{iS, iS2, kli.a.s(R$attr.uikit_windowBackground, context3)}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
        super.onLayout(z, i, i2, i3, i5);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        getButton().setAnalyticsContext(parcelable);
        this.analyticsContext = parcelable;
    }

    public final void setBackgroundColorAttr(int colorAttr) {
        Paint gradientPaint = getGradientPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientPaint.setColor(kli.a.s(colorAttr, context));
    }

    public final void setButtonClickable(boolean clickable) {
        getButton().setClickable(clickable);
    }

    public final void setButtonEnabled(boolean enabled) {
        getButton().setEnabled(enabled);
    }

    public final void setButtonImage(Image image) {
        getButton().setIcon(image);
    }

    public final void setButtonStyle(@NotNull LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getButton().o(style);
    }

    public final void setButtonText(Clause clause) {
        getButton().setText(clause);
    }

    public final void setDescription(Clause description) {
        kli.a.e(getDescriptionTextView(), description, new mqi.a(this, 29), ty0.d.f275448a, 0, 8);
    }

    public final void setLoadingButtonTag(String tag2) {
        getButton().setLoadingButtonTag(tag2);
    }

    public final void setSecondaryButtonEnabled(boolean enabled) {
        getButton().setEnabled(enabled);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FooterActionButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterActionButtonView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58597b = new c2(this);
        this.f = yhm.j.c(yhm.k.NONE, new mw1.a(5));
        this.button = kli.a.J(R$id.footerAction_button, this);
        this.descriptionTextView = kli.a.J(R$id.footerAction_description, this);
        this.i = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_footer_action_button, this);
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 24.0f);
        setPaddingRelative(iK, iK2, iK, iK2);
        setWillNotDraw(false);
        setClipToPadding(false);
        setClipChildren(false);
        getDescriptionTextView().setMovementMethod(c0.f169220a);
    }

    public /* synthetic */ FooterActionButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
