package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.g0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u00199B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010#\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010'R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/R$\u00108\u001a\u0004\u0018\u0001018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/revolut/core/ui_kit/views/DialogHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/views/DialogHeaderView$b;", "item", "setMenuItem", "(Lcom/revolut/core/ui_kit/views/DialogHeaderView$b;)V", "Lcom/revolut/core/ui_kit/views/DialogHeaderView$a;", "asset", "setHeaderAsset", "(Lcom/revolut/core/ui_kit/views/DialogHeaderView$a;)V", "Landroid/widget/TextView;", "b", "Le8/q;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "f", "getMenuTextView", "menuTextView", "g", "getMenuButtonTextView", "menuButtonTextView", "Landroid/widget/ImageView;", "h", "getMenuIcon", "()Landroid/widget/ImageView;", "menuIcon", "i", "getImageView", "imageView", "Landroid/view/ViewStub;", "j", "getTimerViewStub", "()Landroid/view/ViewStub;", "timerViewStub", "Landroid/os/Parcelable;", "k", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class DialogHeaderView extends ConstraintLayout implements TrackableItem {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q titleView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q menuTextView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuButtonTextView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q imageView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final e8.q timerViewStub;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f58514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f58515m;

    public static abstract class a {
        private a() {
        }
    }

    public static abstract class b {
        private b() {
        }

        public abstract String a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.f();
    }

    private final TextView getMenuButtonTextView() {
        return (TextView) this.menuButtonTextView.f();
    }

    private final ImageView getMenuIcon() {
        return (ImageView) this.menuIcon.f();
    }

    private final TextView getMenuTextView() {
        return (TextView) this.menuTextView.f();
    }

    private final ViewStub getTimerViewStub() {
        return (ViewStub) this.timerViewStub.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.f();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getK() {
        return this.analyticsContext;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    @yhm.d
    public final void setHeaderAsset(a asset) {
        if (!(asset instanceof f)) {
            if (asset != null) {
                throw new NoWhenBranchMatchedException();
            }
            zi0.c.g(getImageView(), null);
            return;
        }
        Image image = ((f) asset).f59058a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 64.0f);
        rd0.e.r(getImageView(), new yp0.p(0));
        ImageView imageView = getImageView();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = iK;
        marginLayoutParams.height = iK;
        imageView.setLayoutParams(marginLayoutParams);
        zi0.c.g(getImageView(), image);
    }

    @yhm.d
    public final void setMenuItem(b item) {
        int iK;
        if (Intrinsics.f(item, this.f58515m)) {
            return;
        }
        this.f58515m = item;
        if (item instanceof h) {
            ty0.c.b(or0.u.k(this).b0(), ((h) item).f59067b, getMenuTextView(), null, null, 12);
            getMenuTextView().setVisibility(0);
            getMenuIcon().setVisibility(8);
            getMenuButtonTextView().setVisibility(8);
        } else if (item instanceof g) {
            yy0.f.e(or0.u.k(this).Q(), ((g) item).f59060b, getMenuIcon(), null, null, 12);
            getMenuTextView().setVisibility(8);
            getMenuIcon().setVisibility(0);
            getMenuButtonTextView().setVisibility(8);
        } else {
            getMenuTextView().setVisibility(8);
            getMenuIcon().setVisibility(8);
            getMenuButtonTextView().setVisibility(8);
        }
        if (this.f58515m != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 96.0f);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 16.0f);
        }
        TextView titleView = getTitleView();
        ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(iK);
        layoutParams2.setMarginEnd(iK);
        titleView.setLayoutParams(layoutParams2);
    }

    @yhm.d
    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ty0.c.b(or0.u.k(this).b0(), title, getTitleView(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleView = kli.a.J(R$id.dialogHeader_titleView, this);
        this.menuTextView = kli.a.J(R$id.dialogHeader_menuTextView, this);
        this.menuButtonTextView = kli.a.J(R$id.dialogHeader_menuButtonTextView, this);
        this.menuIcon = kli.a.J(R$id.dialogHeader_menuIcon, this);
        this.imageView = kli.a.J(R$id.dialogHeader_image, this);
        this.timerViewStub = kli.a.J(R$id.dialogHeader_timerStub, this);
        this.f58514l = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        LayoutInflater.from(context).inflate(R$layout.internal_view_dialog_header, (ViewGroup) this, true);
        g0 g0Var = new g0(this, 27);
        or0.u.u(getMenuTextView(), this, g0Var);
        or0.u.t(getMenuIcon(), this, g0Var);
        or0.u.u(getMenuButtonTextView(), this, g0Var);
        setPaddingRelative(getPaddingStart(), kli.a.k(context, 8.0f), getPaddingEnd(), getPaddingBottom());
    }

    public /* synthetic */ DialogHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
