package com.revolut.core.ui_kit.internal.views.swipeablecards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import e8.q;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ty0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardContentHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setSmallTitleStart", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setSmallTitleEnd", "setBigTitle", "Landroid/widget/TextView;", "b", "Le8/q;", "getSmallTitleStart", "()Landroid/widget/TextView;", "smallTitleStart", "f", "getSmallTitleEnd", "smallTitleEnd", "g", "getBigTitle", "bigTitle", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardContentHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q smallTitleStart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q smallTitleEnd;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q bigTitle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardContentHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getBigTitle() {
        return (TextView) this.bigTitle.f();
    }

    private final TextView getSmallTitleEnd() {
        return (TextView) this.smallTitleEnd.f();
    }

    private final TextView getSmallTitleStart() {
        return (TextView) this.smallTitleStart.f();
    }

    public final void setBigTitle(Clause clause) {
        a.b(getBigTitle(), clause, f.f275450a);
    }

    public final void setSmallTitleEnd(Clause clause) {
        a.b(getSmallTitleEnd(), clause, f.f275450a);
    }

    public final void setSmallTitleStart(Clause clause) {
        a.b(getSmallTitleStart(), clause, f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardContentHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableCardContentHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.smallTitleStart = a.J(R$id.swipeableCardContentHeader_smallTitleStart, this);
        this.smallTitleEnd = a.J(R$id.swipeableCardContentHeader_smallTitleEnd, this);
        this.bigTitle = a.J(R$id.swipeableCardContentHeader_bigTitle, this);
        View.inflate(context, R$layout.internal_view_swipeable_card_content_header, this);
    }

    public /* synthetic */ SwipeableCardContentHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
