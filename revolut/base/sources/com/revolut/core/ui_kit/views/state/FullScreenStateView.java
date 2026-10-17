package com.revolut.core.ui_kit.views.state;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import au0.b2;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import ihm.f;
import ix0.c2;
import ix0.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ty0.c;
import v0.a;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u000e\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010&R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/revolut/core/ui_kit/views/state/FullScreenStateView;", "Landroidx/core/widget/NestedScrollView;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "(Ljava/lang/String;)V", "subTitle", "setSubtitle", "buttonText", "setButtonText", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Lyy0/f;", "imageDisplayer", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lyy0/f;)V", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "b", "Le8/q;", "getBottomButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "bottomButton", "Landroid/widget/TextView;", "c", "getStateTitle", "()Landroid/widget/TextView;", "stateTitle", "d", "getStateSubtitle", "stateSubtitle", "Landroid/widget/ImageView;", "e", "getStateImage", "()Landroid/widget/ImageView;", "stateImage", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class FullScreenStateView extends NestedScrollView implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f59711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q bottomButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q stateTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q stateSubtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q stateImage;
    public final c2 f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenStateView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LargeActionButton getBottomButton() {
        return (LargeActionButton) this.bottomButton.f();
    }

    private final ImageView getStateImage() {
        return (ImageView) this.stateImage.f();
    }

    private final TextView getStateSubtitle() {
        return (TextView) this.stateSubtitle.f();
    }

    private final TextView getStateTitle() {
        return (TextView) this.stateTitle.f();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    public final void setButtonText(Clause buttonText) {
        getBottomButton().setText(buttonText);
        getBottomButton().setVisibility(buttonText == null ? 8 : 0);
    }

    @d
    public final void setImage(@NotNull Image image, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        yy0.f.e(imageDisplayer, image, getStateImage(), null, null, 12);
    }

    public final void setSubtitle(Clause subTitle) {
        c.b(u.k(this).b0(), subTitle, getStateSubtitle(), null, null, 12);
        u.c(getStateSubtitle(), subTitle);
    }

    public final void setTitle(Clause title) {
        c.b(u.k(this).b0(), title, getStateTitle(), null, null, 12);
        u.c(getStateTitle(), title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenStateView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(u.k(this).Q(), image, getStateImage(), null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenStateView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59711a = a.d("create(...)");
        this.bottomButton = kli.a.J(R$id.bottomButton, this);
        this.stateTitle = kli.a.J(R$id.stateTitle, this);
        this.stateSubtitle = kli.a.J(R$id.stateSubtitle, this);
        this.stateImage = kli.a.J(R$id.stateImage, this);
        this.f = new c2(this);
        View.inflate(context, R$layout.internal_view_state_full_screen, this);
        setFillViewport(true);
        getBottomButton().setOnClickListener(new b2(this, 26));
    }

    @d
    public final void setButtonText(String buttonText) {
        setSubtitle(buttonText != null ? new TextClause(buttonText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    @d
    public final void setSubtitle(String subTitle) {
        setSubtitle(subTitle != null ? new TextClause(subTitle, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    @d
    public final void setTitle(String title) {
        setTitle(title != null ? new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    public /* synthetic */ FullScreenStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
