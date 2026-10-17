package com.revolut.core.ui_kit.internal.views.fullscreenheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import e8.q;
import ihm.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import ny0.h;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ot0.a;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/fullscreenheader/InternalFullscreenHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lot0/a;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Landroid/widget/TextView;", "b", "Le8/q;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "Landroid/view/View;", "f", "getIconClose", "()Landroid/view/View;", "iconClose", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalFullscreenHeaderView extends ConstraintLayout implements a, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q titleView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q iconClose;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f57102g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalFullscreenHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getIconClose() {
        return this.iconClose.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.f();
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    @Override // ot0.a
    public void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        c.b(u.k(this).b0(), title, getTitleView(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalFullscreenHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFullscreenHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleView = kli.a.J(R$id.fullscreenVideoPlayerHeader_title, this);
        this.iconClose = kli.a.J(R$id.fullscreenVideoPlayerHeader_iconClose, this);
        this.f57102g = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_fullscreen_header, this);
        getIconClose().setOnClickListener(new c9(this, 7));
    }

    public /* synthetic */ InternalFullscreenHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
