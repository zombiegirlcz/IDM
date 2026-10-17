package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardHeaderView;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import mx0.v9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002'(B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/revolut/core/ui_kit/views/SwipeableCardsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lz4l/j;", "adapter", "", "setAdapter", "(Lz4l/j;)V", "Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardHeaderView;", "f", "Le8/q;", "getHeader", "()Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardHeaderView;", "header", "Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardViewPager;", "g", "getViewPager", "()Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardViewPager;", "viewPager", "", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "value", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "currentItem", "Companion", "mx0/dc", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardsView extends ConstraintLayout implements ny0.h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f58878b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q header;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q viewPager;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f58880h;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.SwipeableCardsView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SwipeableCardHeaderView getHeader() {
        return (SwipeableCardHeaderView) this.header.f();
    }

    private final SwipeableCardViewPager getViewPager() {
        return (SwipeableCardViewPager) this.viewPager.f();
    }

    public final efm.r f0() {
        return getHeader().f57601b;
    }

    public final ihm.f g0() {
        return getViewPager().e;
    }

    public final int getCurrentItem() {
        return getViewPager().getCurrentItem();
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewCompat.requestApplyInsets(this);
        super.onAttachedToWindow();
        te0.w.j0(this.f58878b, getViewPager().d.f283129b.subscribe(new bc(new v9(1, getHeader(), SwipeableCardHeaderView.class, "setProgress", "setProgress(F)V", 0, 3), 0)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f58878b.d();
        super.onDetachedFromWindow();
    }

    public final void setAdapter(@NotNull z4l.j adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        getViewPager().setAdapter(adapter);
    }

    public final void setCurrentItem(int i) {
        getViewPager().setCurrentItem(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableCardsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58878b = new ifm.b();
        this.header = kli.a.J(R$id.swipeableCards_header, this);
        this.viewPager = kli.a.J(R$id.swipeableCards_viewPager, this);
        this.f58880h = kli.a.k(context, 50.0f);
        View.inflate(context, R$layout.internal_view_swipeable_cards, this);
        setClipToPadding(false);
        setClipChildren(false);
        int iK = kli.a.k(context, 16.0f);
        setPadding(iK, 0, iK, kli.a.k(context, 50.0f));
        setBackgroundColor(context.getColor(R$color.internal_color_swipeable_cards_layout_background));
        ViewCompat.setOnApplyWindowInsetsListener(this, new bc(this, 1));
    }

    public /* synthetic */ SwipeableCardsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
