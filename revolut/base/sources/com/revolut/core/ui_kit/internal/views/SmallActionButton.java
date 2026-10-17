package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import au0.n4;
import aw0.v1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.drawables.LockedStateDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import fp0.p;
import ip0.g0;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.a4;
import ms0.e4;
import ms0.f4;
import ms0.h4;
import ms0.i4;
import ms0.j4;
import ms0.k4;
import ms0.l4;
import ms0.v4;
import or0.u;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0003\u008c\u0001\u0018B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u00152\b\b\u0001\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0013¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010)\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b+\u0010*J/\u00100\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J/\u00104\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00101J\u0015\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00152\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u0013¢\u0006\u0004\b>\u0010\u0017J\u0019\u0010A\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00152\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00152\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00152\u0006\u0010K\u001a\u00020\u0013H\u0016¢\u0006\u0004\bL\u0010\u0017J\u0019\u0010N\u001a\u00020\u00152\b\u0010M\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bN\u0010FR\"\u0010T\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010 R\u001b\u0010Z\u001a\u00020U8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bb\u0010cR\u001b\u0010g\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010W\u001a\u0004\bf\u0010^R\"\u0010m\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u0017R\u001a\u0010s\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR$\u0010{\u001a\u0004\u0018\u00010t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR3\u0010\u0084\u0001\u001a\u0004\u0018\u00010|2\b\u0010}\u001a\u0004\u0018\u00010|8\u0006@FX\u0087\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010k¨\u0006\u008d\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "Lcom/revolut/core/ui_kit/views/ProgressSwitcher;", "Lur0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lyt0/k;", "Lsy0/a;", "Lrr0/d;", "Lg01/a;", "Lix0/w0;", "Lms0/a4;", "Ljr0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Lms0/e4;", "state", "setState", "(Lms0/e4;)V", "clickable", "setClickable", "padding", "setContentPadding", "(I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "invisible", "setTextInvisible", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setEndIcon", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "start", "end", "setPaddingRelative", "Lms0/n;", "mode", "setBadgeMode", "(Lms0/n;)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "content", "setBadgeContent", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "isEnabled", "setIconsColorFilterEnabled", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "tag", "setLoadingButtonTag", "(Ljava/lang/String;)V", "show", "setVisibilityOnScroll", "drawable", "setBackgroundInternal", "p", "I", "getForcedHeight$ui_kit_components_release", "()I", "setForcedHeight$ui_kit_components_release", "forcedHeight", "Landroid/widget/TextView;", "q", "Le8/q;", "getActionText$ui_kit_components_release", "()Landroid/widget/TextView;", "actionText", "Landroid/widget/ImageView;", "r", "getActionIcon$ui_kit_components_release", "()Landroid/widget/ImageView;", "actionIcon", "Landroid/view/ViewGroup;", "s", "getContainer$ui_kit_components_release", "()Landroid/view/ViewGroup;", "container", "t", "getEndIcon", "endIcon", "J", "Z", "g", "()Z", "setVisibilityAnimationsOnScrollEnabled", "isVisibilityAnimationsOnScrollEnabled", "Lfp0/p;", "M", "Lfp0/p;", "getClickHandler$ui_kit_components_release", "()Lfp0/p;", "clickHandler", "Landroid/os/Parcelable;", "N", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "", "value", "O", "Ljava/lang/Float;", "getMaxButtonWidth", "()Ljava/lang/Float;", "setMaxButtonWidth", "(Ljava/lang/Float;)V", "maxButtonWidth", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "getInsetsAdjustable", "insetsAdjustable", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallActionButton extends ProgressSwitcher implements ur0.a, TrackableItem, yt0.k, sy0.a, rr0.d, g01.a, w0, a4, jr0.i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public ms0.n A;
    public int B;
    public int C;
    public v1 D;
    public int E;
    public Integer F;
    public final DecelerateInterpolator G;
    public boolean H;
    public final rr0.g I;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isVisibilityAnimationsOnScrollEnabled;
    public Drawable K;
    public final boolean L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final p clickHandler;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public Float maxButtonWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f56385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f56386h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h4 f56387j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f56388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f56389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f56390n;
    public e4 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int forcedHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q actionText;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q actionIcon;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q container;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q endIcon;
    public NewBadgeView u;
    public ShimmerFrameLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Clause f56396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Image f56397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Image f56398y;
    public NewBadgeContent z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.SmallActionButton$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intrinsics.h(view);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallActionButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getEndIcon() {
        return (ImageView) this.endIcon.f();
    }

    private final void setBackgroundInternal(Drawable drawable) {
        Drawable drawable2 = this.K;
        this.K = drawable;
        if (drawable == null) {
            super.setBackground(drawable);
            return;
        }
        ms0.n nVar = this.A;
        if (!(nVar instanceof ms0.m) || !((ms0.m) nVar).f208334a) {
            super.setBackground(drawable);
            return;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable});
        int i = this.B;
        int i2 = this.C;
        layerDrawable.setLayerInset(0, i, i2, i, i2);
        super.setBackground(layerDrawable);
        if (drawable2 == drawable) {
            layerDrawable.setDrawable(0, drawable);
        }
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.I.V();
    }

    @Override // ms0.a4
    public final void a(int i, int i2, Path outPath) {
        Intrinsics.checkNotNullParameter(outPath, "outPath");
        if (this.f56387j == h4.SHIMMER) {
            float height = getHeight() / 2.0f;
            outPath.addRoundRect(i, i2, getWidth() + i, getHeight() + i2, height, height, Path.Direction.CW);
        }
    }

    public final void d(ms0.n nVar, NewBadgeView newBadgeView) {
        Pair pair;
        if (nVar instanceof ms0.l) {
            newBadgeView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            newBadgeView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        if (!(nVar instanceof ms0.m)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((ms0.m) nVar).f208334a) {
            newBadgeView.setTranslationX(getLayoutDirection() == 1 ? -this.B : this.B);
            newBadgeView.setTranslationY(-this.C);
            return;
        }
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fK = kli.a.k(context, 1.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fK2 = kli.a.k(context2, 3.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float fK3 = kli.a.k(context3, 5.0f);
        NewBadgeContent newBadgeContent = this.z;
        if (newBadgeContent instanceof NewBadgeContent.Dot) {
            pair = new Pair(Float.valueOf(((newBadgeView.getWidth() - fK3) / 2.0f) + fK), Float.valueOf(((newBadgeView.getHeight() - fK3) / 2.0f) + fK2));
        } else if ((newBadgeContent instanceof NewBadgeContent.WithNumber) || (newBadgeContent instanceof NewBadgeContent.WithClause)) {
            pair = new Pair(Float.valueOf(fK), Float.valueOf(fK2));
        } else {
            if (newBadgeContent != null) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(fValueOf, fValueOf);
        }
        float fFloatValue = ((Number) pair.f186385a).floatValue();
        float fFloatValue2 = ((Number) pair.f186386b).floatValue();
        if (getLayoutDirection() == 1) {
            fFloatValue = -fFloatValue;
        }
        newBadgeView.setTranslationX(fFloatValue);
        newBadgeView.setTranslationY(-fFloatValue2);
    }

    public final void e() {
        float fD;
        h4 h4Var = this.f56387j;
        if (h4Var == null) {
            return;
        }
        if (this.o.a()) {
            fD = 1.0f;
        } else {
            LargeActionButton.ButtonStyle buttonStyleA = h4Var.a();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fD = buttonStyleA.d(context);
        }
        getActionText$ui_kit_components_release().setAlpha(fD);
        getActionIcon$ui_kit_components_release().setAlpha(fD);
        getEndIcon().setAlpha(fD);
    }

    public final void f(ms0.n nVar, NewBadgeContent newBadgeContent) {
        int i = this.B;
        int i2 = this.C;
        int iK = 0;
        if (nVar instanceof ms0.l) {
            this.B = 0;
            this.C = 0;
        } else {
            if (!(nVar instanceof ms0.m)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((ms0.m) nVar).f208334a) {
                if (newBadgeContent instanceof NewBadgeContent.Dot) {
                    int i3 = f4.f208251a[((NewBadgeContent.Dot) newBadgeContent).f57887b.ordinal()];
                    if (i3 == 1) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        int iK2 = kli.a.k(context, 8.0f);
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        iK = (iK2 - kli.a.k(context2, 5.0f)) / 2;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        int iK3 = kli.a.k(context3, 24.0f);
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        iK = (iK3 - kli.a.k(context4, 8.0f)) / 2;
                    }
                }
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                this.B = kli.a.k(context5, 1.0f) + iK;
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                this.C = kli.a.k(context6, 3.0f) + iK;
            } else {
                this.B = 0;
                this.C = 0;
            }
        }
        if (isPaddingRelative()) {
            int paddingTop = getPaddingTop() - i2;
            int paddingEnd = getPaddingEnd() - i;
            int paddingStart = getPaddingStart() - i;
            int paddingBottom = getPaddingBottom() - i2;
            int i5 = this.B;
            int i6 = this.C;
            super.setPaddingRelative(paddingStart + i5, paddingTop + i6, paddingEnd + i5, paddingBottom + i6);
            return;
        }
        int paddingTop2 = getPaddingTop() - i2;
        int paddingRight = getPaddingRight() - i;
        int paddingLeft = getPaddingLeft() - i;
        int paddingBottom2 = getPaddingBottom() - i2;
        int i21 = this.B;
        int i22 = this.C;
        super.setPadding(paddingLeft + i21, paddingTop2 + i22, paddingRight + i21, paddingBottom2 + i22);
    }

    @Override // g01.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsVisibilityAnimationsOnScrollEnabled() {
        return this.isVisibilityAnimationsOnScrollEnabled;
    }

    @NotNull
    public final ImageView getActionIcon$ui_kit_components_release() {
        return (ImageView) this.actionIcon.f();
    }

    @NotNull
    public final TextView getActionText$ui_kit_components_release() {
        return (TextView) this.actionText.f();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF51688h() {
        return this.analyticsContext;
    }

    @NotNull
    /* JADX INFO: renamed from: getClickHandler$ui_kit_components_release, reason: from getter */
    public final p getClickHandler() {
        return this.clickHandler;
    }

    @NotNull
    public final ViewGroup getContainer$ui_kit_components_release() {
        return (ViewGroup) this.container.f();
    }

    /* JADX INFO: renamed from: getForcedHeight$ui_kit_components_release, reason: from getter */
    public final int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        jr0.g.Companion.getClass();
        return jr0.f.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ix0.w0, ix0.v0
    public boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable() || ((Boolean) jo0.g.f176836t.getValue()).booleanValue();
    }

    public final Float getMaxButtonWidth() {
        return this.maxButtonWidth;
    }

    public final void i(h4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.f56387j == style) {
            return;
        }
        this.f56387j = style;
        this.clickHandler.c((!((style != null ? style.a() : null) instanceof LargeActionButton.ButtonStyle.FlatButton) || this.f56387j == h4.SHIMMER) ? new gp0.g(0) : gp0.b.f145198a);
        setClickable(style != h4.SHIMMER ? v4.b(this.o) : false);
        o();
        e();
        j();
    }

    public final void j() {
        TextView actionText$ui_kit_components_release = getActionText$ui_kit_components_release();
        h4 h4Var = this.f56387j;
        u.n(actionText$ui_kit_components_release, ((h4Var != null ? h4Var.a() : null) instanceof LargeActionButton.ButtonStyle.FlatButton) && isClickable() && isEnabled());
    }

    public final void k(l4 widthMode) {
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = -2;
        if (!(widthMode instanceof k4)) {
            if (widthMode instanceof i4) {
                setMaxButtonWidth(null);
            } else {
                if (!(widthMode instanceof j4)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = -1;
            }
        }
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public final void m(View view) {
        py0.d bVar;
        Clause clause = this.f56396w;
        if (clause != null) {
            bVar = new py0.c(clause);
        } else {
            Image image = this.f56397x;
            if (image != null) {
                bVar = new py0.b(image);
            } else {
                Image image2 = this.f56398y;
                bVar = image2 != null ? new py0.b(image2) : null;
            }
        }
        u.k(this).n0().a(view, this, bVar);
    }

    public final void n() {
        Context context;
        float f;
        if (this.k && !this.f56388l && this.f56389m) {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f = 12.0f;
        } else {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f = 16.0f;
        }
        int iK = kli.a.k(context, f);
        if (getContainer$ui_kit_components_release().getPaddingStart() != iK) {
            setContentPadding(iK);
        }
    }

    public final void o() {
        h4 h4Var = this.f56387j;
        if (h4Var == null) {
            return;
        }
        LargeActionButton.ButtonStyle buttonStyleA = h4Var.a();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = this.E;
        v1 v1Var = this.D;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        qs0.a aVarA = qs0.c.a(buttonStyleA, context, i, v1Var, kli.a.v(R$attr.uikit_small_action_corner_radius, context2));
        if (h4Var != h4.SHIMMER) {
            View view = this.v;
            if (view != null) {
                removeView(view);
            }
            setImportantForAccessibility(0);
            getContainer$ui_kit_components_release().setVisibility(0);
            NewBadgeView newBadgeView = this.u;
            if (newBadgeView != null) {
                newBadgeView.setVisibility(this.z == null ? 8 : 0);
            }
            hp0.a aVar = aVarA.f248739a;
            Drawable drawableB = aVar != null ? aVar.b() : null;
            if (!this.o.a() && (drawableB instanceof StateListDrawable)) {
                drawableB = new LockedStateDrawable((StateListDrawable) drawableB, new int[]{-16842910});
            }
            setBackgroundInternal(drawableB);
            int i2 = aVarA.f248740b;
            if (this.f56390n) {
                ImageView actionIcon$ui_kit_components_release = getActionIcon$ui_kit_components_release();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                actionIcon$ui_kit_components_release.setColorFilter(i2, mode);
                getEndIcon().setColorFilter(i2, mode);
            } else {
                getActionIcon$ui_kit_components_release().clearColorFilter();
                getEndIcon().clearColorFilter();
            }
            setProgressTintColor(i2);
            getActionText$ui_kit_components_release().setTextColor(i2);
            return;
        }
        int i3 = 4;
        getContainer$ui_kit_components_release().setVisibility(4);
        NewBadgeView newBadgeView2 = this.u;
        if (newBadgeView2 != null) {
            newBadgeView2.setVisibility(4);
        }
        setImportantForAccessibility(2);
        ShimmerFrameLayout shimmerFrameLayout = this.v;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = new ShimmerFrameLayout(getContext());
            this.v = shimmerFrameLayout;
            shimmerFrameLayout.setId(R$id.internal_smallActionButton_shimmerView);
            Context context3 = shimmerFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kli.a.w(R$attr.uikit_small_action_height, context3));
            layoutParams.gravity = 17;
            shimmerFrameLayout.setLayoutParams(layoutParams);
            shimmerFrameLayout.setOnTouchListener(new com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.b(2));
            Context context4 = shimmerFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Context context5 = shimmerFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            shimmerFrameLayout.setBackground(new RoundedBackgroundDrawable(context4, kli.a.s(R$attr.uikit_colorShimmer, context5), i3));
        }
        ifk.b.r(shimmerFrameLayout);
        if (shimmerFrameLayout.getParent() == null) {
            addView(shimmerFrameLayout);
        }
        setBackgroundInternal(null);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f56385g.b(insets, getFitsSystemWindows()));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        NewBadgeView newBadgeView = this.u;
        if (newBadgeView == null) {
            return;
        }
        d(this.A, newBadgeView);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((this.B * 2) + View.MeasureSpec.getSize(i), View.MeasureSpec.getMode(i));
        int i3 = this.forcedHeight;
        if (i3 == -1) {
            super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((this.C * 2) + View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2)));
            return;
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((this.C * 2) + i3, 1073741824);
        Integer num = this.F;
        if (num == null) {
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
            return;
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iIntValue = num.intValue() == Integer.MAX_VALUE ? num.intValue() : num.intValue() + (this.B * 2);
        if (getMeasuredWidth() >= iIntValue) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), iMakeMeasureSpec2);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("STATE_KEY_STYLE", -1);
        if (i != -1) {
            this.f56387j = h4.values()[i];
        }
        this.f56388l = bundle.getBoolean("STATE_KEY_HIDDEN_ICON");
        this.f56389m = bundle.getBoolean("STATE_KEY_HIDDEN_END_ICON");
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        h4 h4Var = this.f56387j;
        if (h4Var != null) {
            bundle.putInt("STATE_KEY_STYLE", h4Var.ordinal());
        }
        bundle.putBoolean("STATE_KEY_HIDDEN_ICON", this.f56388l);
        bundle.putBoolean("STATE_KEY_HIDDEN_END_ICON", this.f56389m);
        return bundle;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f56387j == h4.SHIMMER) {
            return false;
        }
        return super.performClick();
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.D = colorScheme;
        this.E = i;
        if (this.f56387j == h4.CONTEXTUAL) {
            o();
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        if (this.L) {
            setBackgroundInternal(background);
        } else {
            super.setBackground(background);
        }
    }

    public final void setBadgeContent(NewBadgeContent content) {
        if (Intrinsics.f(this.z, content)) {
            return;
        }
        this.z = content;
        if (content == null) {
            NewBadgeView newBadgeView = this.u;
            if (newBadgeView != null) {
                newBadgeView.setVisibility(8);
                return;
            }
            return;
        }
        NewBadgeView newBadgeView2 = this.u;
        int i = 0;
        if (newBadgeView2 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            newBadgeView2 = new NewBadgeView(context, null, 6, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            this.u = newBadgeView2;
            newBadgeView2.setId(R$id.uikit_smallButton_badge);
            addView(newBadgeView2, layoutParams);
            f(this.A, content);
            d(this.A, newBadgeView2);
        }
        newBadgeView2.setVisibility(0);
        newBadgeView2.setContent(content);
    }

    public final void setBadgeMode(@NotNull ms0.n mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Intrinsics.f(this.A, mode)) {
            return;
        }
        this.A = mode;
        f(mode, this.z);
        setBackgroundInternal(this.K);
        NewBadgeView newBadgeView = this.u;
        if (newBadgeView == null) {
            return;
        }
        d(this.A, newBadgeView);
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        if (clickable == isClickable()) {
            return;
        }
        super.setClickable(clickable);
        j();
    }

    public final void setContentPadding(int padding) {
        getContainer$ui_kit_components_release().setPadding(padding, 0, padding, 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled == isEnabled()) {
            return;
        }
        super.setEnabled(enabled);
        setState(enabled ? e4.EnabledClickable : e4.DisabledNonClickable);
        e();
        j();
    }

    public final void setEndIcon(Image image) {
        if (image == null) {
            getEndIcon().setVisibility(8);
            this.f56389m = true;
            yy0.f.e(u.k(this).Q(), null, getEndIcon(), null, null, 12);
            this.f56397x = null;
        } else {
            getEndIcon().setVisibility(0);
            this.f56389m = false;
            yy0.f.e(u.k(this).Q(), image, getEndIcon(), null, null, 12);
            this.f56397x = image;
        }
        n();
    }

    public final void setForcedHeight$ui_kit_components_release(int i) {
        this.forcedHeight = i;
    }

    public final void setIcon(Image image) {
        if (image == null) {
            getActionIcon$ui_kit_components_release().setVisibility(8);
            this.f56388l = true;
            this.f56398y = null;
        } else {
            getActionIcon$ui_kit_components_release().setVisibility(0);
            this.f56388l = false;
            yy0.f.e(u.k(this).Q(), image, getActionIcon$ui_kit_components_release(), null, null, 12);
            this.f56398y = image;
        }
        n();
    }

    public final void setIconsColorFilterEnabled(boolean isEnabled) {
        this.f56390n = isEnabled;
        o();
    }

    public final void setLoadingButtonTag(String tag2) {
        setTag(tag2);
    }

    public final void setMaxButtonWidth(Float f) {
        int iK;
        if (f != null) {
            float fFloatValue = f.floatValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, fFloatValue);
        } else {
            iK = Integer.MAX_VALUE;
        }
        this.F = Integer.valueOf(iK);
        this.maxButtonWidth = f;
        requestLayout();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        if (l2 == null) {
            super.setOnClickListener(null);
        } else {
            super.setOnClickListener(new kp0.l(this, l2, 6));
        }
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        int i = this.B;
        int i2 = this.C;
        super.setPadding(left + i, top + i2, right + i, bottom + i2);
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end2, int bottom) {
        int i = this.B;
        int i2 = this.C;
        super.setPaddingRelative(start + i, top + i2, end2 + i, bottom + i2);
    }

    public final void setState(@NotNull e4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.o == state) {
            return;
        }
        this.o = state;
        setClickable(this.f56387j == h4.SHIMMER ? false : v4.b(state));
        o();
        e();
    }

    public final void setText(Clause clause) {
        this.f56396w = clause;
        this.k = clause == null;
        getActionText$ui_kit_components_release().setVisibility(clause == null ? 8 : 0);
        ty0.c.b(u.k(this).b0(), clause, getActionText$ui_kit_components_release(), null, null, 12);
        n();
    }

    public final void setTextInvisible(boolean invisible) {
        getActionText$ui_kit_components_release().setVisibility(invisible ? 4 : 0);
    }

    public void setVisibilityAnimationsOnScrollEnabled(boolean z) {
        this.isVisibilityAnimationsOnScrollEnabled = z;
    }

    @Override // g01.a
    public void setVisibilityOnScroll(boolean show) {
        float f;
        if (show == this.H) {
            return;
        }
        animate().cancel();
        this.H = show;
        if (show) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            float height = getHeight();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            f = height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r2.bottomMargin : 0);
        }
        if (show) {
            setVisibility(0);
        }
        animate().translationY(f).setInterpolator(this.G).setDuration(300L).withEndAction(new n4(show, this, 4)).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmallActionButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallActionButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        h4 h4Var;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56385g = new c2(this);
        this.f56386h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.k = true;
        this.f56388l = true;
        this.f56389m = true;
        this.f56390n = true;
        this.o = e4.EnabledClickable;
        this.actionText = kli.a.J(R$id.actionText, this);
        this.actionIcon = kli.a.J(R$id.actionIcon, this);
        this.container = kli.a.J(R$id.smallActionButton_container, this);
        this.endIcon = kli.a.J(R$id.smallActionButton_endIcon, this);
        this.A = ms0.l.f208314a;
        this.D = v1.DARK;
        this.G = new DecelerateInterpolator();
        this.H = true;
        this.I = s.b(this, true);
        this.isVisibilityAnimationsOnScrollEnabled = true;
        fp0.m mVar = p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        p pVarA = fp0.m.a(this, gVar);
        this.clickHandler = pVarA;
        View.inflate(context, R$layout.internal_view_small_action_button, this);
        this.forcedHeight = kli.a.w(R$attr.uikit_small_action_height, context);
        int iK = kli.a.k(context, 16.0f);
        setProgressSize(iK);
        setContentPadding(iK);
        setClipToPadding(false);
        setClipChildren(false);
        setFocusable(true);
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new b());
        getEndIcon().setOnClickListener(new g0(this, 20));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SmallActionButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.SmallActionButton_uikit_SmallActionButtonStyle, -1);
        if (i2 == 0) {
            h4Var = h4.ACCENT;
        } else if (i2 == 1) {
            h4Var = h4.NEGATIVE;
        } else if (i2 != 2) {
            h4Var = i2 != 3 ? null : h4.SEMIBLACK;
        } else {
            h4Var = h4.SEMIACCENT;
        }
        if (h4Var != null) {
            i(h4Var);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (getBackground() != null && this.K == null) {
            setBackgroundInternal(getBackground());
        }
        this.L = true;
    }

    public /* synthetic */ SmallActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
