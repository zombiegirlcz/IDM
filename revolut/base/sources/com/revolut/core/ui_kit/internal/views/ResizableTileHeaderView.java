package com.revolut.core.ui_kit.internal.views;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ResizableTileHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "label", "", "setTopLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "maxLines", "setTopLabelMaxLines", "(I)V", "title", "setTitle", "subtitle", "setRightSubtitle", "setBottomSubtitle", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setRightImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResizableTileHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f56366b;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f56367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f56368h;
    public final ImageView i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResizableTileHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBottomSubtitle(Clause subtitle) {
        u.c(this.f56368h, subtitle);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), subtitle, this.f56368h, null, null, 12);
    }

    public final void setRightImage(Image image) {
        zi0.c.g(this.i, image);
    }

    public final void setRightSubtitle(Clause subtitle) {
        u.c(this.f56367g, subtitle);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), subtitle, this.f56367g, null, null, 12);
    }

    public final void setTitle(Clause title) {
        u.c(this.f, title);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), title, this.f, null, null, 12);
    }

    public final void setTopLabel(Clause label) {
        u.c(this.f56366b, label);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), label, this.f56366b, null, null, 12);
    }

    public final void setTopLabelMaxLines(int maxLines) {
        this.f56366b.setMaxLines(maxLines);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResizableTileHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResizableTileHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_resizable_tile_header_view, this);
        View viewFindViewById = findViewById(R$id.resizableTileHeader_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f56366b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.resizableTileHeader_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.resizableTileHeader_rightSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f56367g = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.resizableTileHeader_bottomSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f56368h = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.resizableTileHeader_rightImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (ImageView) viewFindViewById5;
    }

    public /* synthetic */ ResizableTileHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
