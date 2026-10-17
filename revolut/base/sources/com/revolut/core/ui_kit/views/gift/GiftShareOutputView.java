package com.revolut.core.ui_kit.views.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import rr0.h;
import ty0.c;
import yy0.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010&R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010.R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010&R\u001b\u0010=\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001f\u001a\u0004\b<\u0010&¨\u0006>"}, d2 = {"Lcom/revolut/core/ui_kit/views/gift/GiftShareOutputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setCover", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)V", "setSenderAvatar", "setButton", "Lcom/revolut/core/ui_kit/models/Clause;", "name", "setSenderName", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "clause", "setMessage", "color", "setCoverColor", "(I)V", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "b", "Le8/q;", "getButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "button", "Landroid/widget/ImageView;", "f", "getCoverImage", "()Landroid/widget/ImageView;", "coverImage", "g", "getSenderAvatar", "senderAvatar", "Landroid/widget/TextView;", "h", "getSenderNameText", "()Landroid/widget/TextView;", "senderNameText", "i", "getMessageText", "messageText", "Landroid/view/View;", "j", "getBackgroundView", "()Landroid/view/View;", "backgroundView", "k", "getIcon", "icon", "l", "getLogo", "logo", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiftShareOutputView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q button;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q coverImage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q senderAvatar;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q senderNameText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q messageText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q backgroundView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q icon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q logo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftShareOutputView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getBackgroundView() {
        return this.backgroundView.f();
    }

    private final SmallActionButton getButton() {
        return (SmallActionButton) this.button.f();
    }

    private final ImageView getCoverImage() {
        return (ImageView) this.coverImage.f();
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.f();
    }

    private final ImageView getLogo() {
        return (ImageView) this.logo.f();
    }

    private final TextView getMessageText() {
        return (TextView) this.messageText.f();
    }

    private final ImageView getSenderAvatar() {
        return (ImageView) this.senderAvatar.f();
    }

    private final TextView getSenderNameText() {
        return (TextView) this.senderNameText.f();
    }

    public final void setButton(Image image) {
        getButton().setVisibility(image != null ? 0 : 8);
        getButton().setIcon(image);
    }

    public final void setCover(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        f.e(u.k(this).Q(), image, getCoverImage(), null, null, 12);
    }

    public final void setCoverColor(int color) {
        getBackgroundView().setBackgroundColor(color);
        getCoverImage().setBackgroundColor(color);
        int i = R$attr.uikit_colorBlack;
        int i2 = R$attr.uikit_colorWhite;
        if (h.b(color) < 0.5d) {
            i = i2;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = a.s(i, context);
        getSenderNameText().setTextColor(iS);
        getMessageText().setTextColor(iS);
        e.q(getIcon(), Integer.valueOf(iS));
        e.q(getLogo(), Integer.valueOf(iS));
    }

    public final void setMessage(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        c.b(u.k(this).b0(), clause, getMessageText(), null, null, 12);
    }

    public final void setSenderAvatar(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        f.e(u.k(this).Q(), image, getSenderAvatar(), null, null, 12);
    }

    public final void setSenderName(@NotNull Clause name) {
        Intrinsics.checkNotNullParameter(name, "name");
        c.b(u.k(this).b0(), name, getSenderNameText(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftShareOutputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setCover(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        getCoverImage().setImageBitmap(bitmap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftShareOutputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.button = a.J(R$id.giftShareOutput_button, this);
        this.coverImage = a.J(R$id.giftShareOutput_coverImage, this);
        this.senderAvatar = a.J(R$id.giftShareOutput_senderAvatar, this);
        this.senderNameText = a.J(R$id.giftShareOutput_senderNameText, this);
        this.messageText = a.J(R$id.giftShareOutput_messageText, this);
        this.backgroundView = a.J(R$id.giftShareOutput_backgroundView, this);
        this.icon = a.J(R$id.giftShareOutput_icon, this);
        this.logo = a.J(R$id.giftShareOutput_logo, this);
        View.inflate(context, R$layout.internal_view_gift_share_output, this);
    }

    public /* synthetic */ GiftShareOutputView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
