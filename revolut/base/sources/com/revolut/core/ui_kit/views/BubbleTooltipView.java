package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.o2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/revolut/core/ui_kit/views/BubbleTooltipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "visible", "setBottomArrowVisible", "(Z)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Landroid/widget/TextView;", "g", "Le8/q;", "getText", "()Landroid/widget/TextView;", "text", "Landroid/widget/ImageView;", "h", "getIcon", "()Landroid/widget/ImageView;", "icon", "i", "getItemContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "itemContainer", "Landroid/view/View;", "j", "getBottomArrow", "()Landroid/view/View;", "bottomArrow", "mx0/o2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BubbleTooltipView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58365b;
    public o2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q text;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q itemContainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final e8.q bottomArrow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleTooltipView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getBottomArrow() {
        return this.bottomArrow.f();
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.f();
    }

    private final ConstraintLayout getItemContainer() {
        return (ConstraintLayout) this.itemContainer.f();
    }

    private final TextView getText() {
        return (TextView) this.text.f();
    }

    public final void f0(o2 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f = style;
        if (style == null) {
            this.f = o2.WHITE;
        }
        ConstraintLayout itemContainer = getItemContainer();
        o2 o2Var = this.f;
        if (o2Var == null) {
            Intrinsics.r("style");
            throw null;
        }
        itemContainer.setBackgroundResource(o2Var.b());
        View bottomArrow = getBottomArrow();
        o2 o2Var2 = this.f;
        if (o2Var2 == null) {
            Intrinsics.r("style");
            throw null;
        }
        bottomArrow.setBackgroundResource(o2Var2.a());
        TextView text = getText();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        o2 o2Var3 = this.f;
        if (o2Var3 != null) {
            text.setTextColor(kli.a.s(o2Var3.c(), context));
        } else {
            Intrinsics.r("style");
            throw null;
        }
    }

    public final void setBottomArrowVisible(boolean visible) {
        getBottomArrow().setVisibility(visible ? 0 : 8);
    }

    public final void setIcon(Image image) {
        if (image == null) {
            getIcon().setImageDrawable(null);
            getIcon().setVisibility(8);
        } else {
            yy0.f.e(or0.u.k(this).Q(), image, getIcon(), null, null, 12);
            getIcon().setVisibility(0);
        }
    }

    public final void setText(Clause clause) {
        getText().setVisibility(clause != null ? 0 : 8);
        ty0.c.b(or0.u.k(this).b0(), clause, getText(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleTooltipView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleTooltipView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58365b = v0.a.d("create(...)");
        this.text = kli.a.J(R$id.bubbleTooltipView_text, this);
        this.icon = kli.a.J(R$id.bubbleTooltipView_icon, this);
        this.itemContainer = kli.a.J(R$id.bubbleTooltipView_itemContainer, this);
        this.bottomArrow = kli.a.J(R$id.bubbleTooltipView_bottomArrow, this);
        View.inflate(context, R$layout.internal_view_bubble_tooltip, this);
        setOnClickListener(new g0(this, 24));
    }

    public /* synthetic */ BubbleTooltipView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
