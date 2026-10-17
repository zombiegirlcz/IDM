package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import e8.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u000b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000f\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010\u0011\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/TileHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "label", "", "setTopLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "title", "setTitle", "subtitle", "setSubtitle", "maxLine", "setTopLabelMaxLines", "(I)V", "Landroid/widget/TextView;", "a", "Le8/q;", "getLabel", "()Landroid/widget/TextView;", "b", "getTitle", "c", "getSubtitle", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TileHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q subtitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getLabel() {
        return (TextView) this.label.f();
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle.f();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    public final void setSubtitle(Clause subtitle) {
        u.c(getSubtitle(), subtitle);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), subtitle, getSubtitle(), null, null, 12);
    }

    public final void setTitle(Clause title) {
        u.c(getTitle(), title);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), title, getTitle(), null, null, 12);
    }

    public final void setTopLabel(@NotNull Clause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        u.c(getLabel(), label);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c.b(jh.d.f(context).b0(), label, getLabel(), null, null, 12);
    }

    public final void setTopLabelMaxLines(int maxLine) {
        getLabel().setMaxLines(maxLine);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TileHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.label = kli.a.J(R$id.tileHeader_label, this);
        this.title = kli.a.J(R$id.tileHeader_title, this);
        this.subtitle = kli.a.J(R$id.tileHeader_subtitle, this);
        setOrientation(1);
        View.inflate(context, R$layout.internal_tile_header_view, this);
    }

    public /* synthetic */ TileHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
