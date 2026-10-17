package com.revolut.core.ui_kit.internal.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.g0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.b5;
import ms0.c5;
import ms0.d5;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0019\u001dB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/TinyActionButton;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "l", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "Lcom/revolut/core/ui_kit/models/UIKitClause;", "clause", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lms0/c5;", "theme", "setTheme", "(Lms0/c5;)V", "Lms0/b5;", "state", "setState", "(Lms0/b5;)V", "d", "I", "getHeightPx", "()I", "heightPx", "Landroid/os/Parcelable;", "g", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lcom/revolut/core/ui_kit/internal/drawables/RoundedBackgroundDrawable;", "Lkotlin/Lazy;", "getDrawable", "()Lcom/revolut/core/ui_kit/internal/drawables/RoundedBackgroundDrawable;", "drawable", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TinyActionButton extends ShimmerFrameLayout implements TrackableItem {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f56451n = 0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int heightPx;
    public final AppCompatTextView e;
    public final AppCompatImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f56453h;
    public c5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b5 f56454j;
    public Image k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Lazy drawable;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Clause f56456m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TinyActionButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RoundedBackgroundDrawable getDrawable() {
        return (RoundedBackgroundDrawable) this.drawable.getValue();
    }

    public final void g() {
        Image animatedResourceImage;
        int i = d5.f208230b[this.f56454j.ordinal()];
        int i2 = 0;
        if (i == 1) {
            animatedResourceImage = this.k;
        } else if (i == 2) {
            animatedResourceImage = new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 8, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            animatedResourceImage = this.k;
            i2 = 4;
        }
        Image image = animatedResourceImage;
        AppCompatImageView appCompatImageView = this.f;
        appCompatImageView.setVisibility(i2);
        yy0.f.e(u.k(this).Q(), image, appCompatImageView, null, null, 12);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    public final int getHeightPx() {
        return this.heightPx;
    }

    public final void i() {
        int iS;
        int iS2;
        ValueAnimator valueAnimator;
        if (this.f56454j == b5.LOADING && ((valueAnimator = this.f26153b.e) == null || !valueAnimator.isStarted())) {
            RoundedBackgroundDrawable drawable = getDrawable();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable.e(kli.a.s(R$attr.uikit_colorShimmer, context));
            if (this.f26154c) {
                return;
            }
            this.f26154c = true;
            e();
            return;
        }
        a();
        int i = d5.f208229a[this.i.ordinal()];
        if (i == 1) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorOnAccent, context2);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorAccent, context3);
        } else if (i == 2) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorBlack, context4);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorWhite, context5);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            iS = kli.a.s(R$attr.uikit_colorWhite, context6);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            iS2 = kli.a.s(R$attr.uikit_colorBlack, context7);
        }
        this.e.setTextColor(iS);
        getDrawable().e(iS2);
        this.f.setImageTintList(ColorStateList.valueOf(iS));
    }

    public final void j() {
        int i = d5.f208230b[this.f56454j.ordinal()];
        int i2 = 8;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f56456m != null) {
                    i2 = 4;
                }
            }
        } else if (this.f56456m != null) {
            i2 = 0;
        }
        this.e.setVisibility(i2);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setIcon(Image image) {
        this.k = image;
        g();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        if (!isClickable()) {
            setClickable(true);
        }
        if (!hasOnClickListeners()) {
            super.setOnClickListener(new g0(this, 22));
        }
        this.f56453h = l2;
    }

    public final void setState(@NotNull b5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f56454j = state;
        g();
        j();
        i();
    }

    public final void setText(Clause clause) {
        this.f56456m = clause;
        ty0.c.b(u.k(this).b0(), this.f56456m, this.e, null, null, 12);
        j();
    }

    public final void setTheme(@NotNull c5 theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.i = theme;
        i();
        g();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TinyActionButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyActionButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 32.0f);
        this.heightPx = iK;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        int iK2 = kli.a.k(context, 4.0f);
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceEmphasis2);
        appCompatTextView.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, iK);
        layoutParams.setMarginStart(iK2);
        layoutParams.setMarginEnd(iK2);
        layoutParams.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams);
        this.e = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int iK3 = kli.a.k(context, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iK3, iK3);
        layoutParams2.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams2);
        this.f = appCompatImageView;
        this.i = c5.ACCENT;
        this.f56454j = b5.NORMAL;
        this.drawable = yhm.j.b(new lu0.a(context, 7));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.addView(appCompatImageView);
        linearLayout.addView(appCompatTextView);
        addView(linearLayout);
        int iK4 = kli.a.k(context, 8.0f);
        setPadding(iK4, iK4, iK4, iK4);
        setBackground(getDrawable());
        i();
    }

    public /* synthetic */ TinyActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
