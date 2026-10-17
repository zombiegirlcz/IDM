package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import aw0.j3;
import aw0.k3;
import aw0.o9;
import aw0.t1;
import aw0.v1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import com.revolut.core.ui_kit.internal.drawables.LockableBoundsDrawableWrapper;
import com.revolut.core.ui_kit.internal.drawables.RevolutAnimatableDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ix0.c2;
import ix0.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.a4;
import mx0.u8;
import mx0.v8;
import mx0.w8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 t2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0004uvwxB'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0019\u0010,\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0004\b,\u00100J\u0017\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00152\u0006\u0010=\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010<J\u0017\u0010C\u001a\u00020\u00152\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010G\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010FJ/\u0010N\u001a\u00020\u00152\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000fH\u0000¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\bO\u0010<J\u0017\u0010S\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020?H\u0000¢\u0006\u0004\bR\u0010BJ\u0017\u0010U\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020?H\u0000¢\u0006\u0004\bT\u0010BJ\u0019\u0010W\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[R$\u0010c\u001a\u0004\u0018\u00010\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010i\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR$\u0010o\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\u000f8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006y"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton;", "Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "Lur0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lyt0/k;", "Lsy0/a;", "Lrr0/d;", "Lzz0/d;", "Ljr0/i;", "Lms0/a4;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$AccessibilityDelegate;", "delegate", "", "setAccessibilityDelegate", "(Landroid/view/View$AccessibilityDelegate;)V", "Landroid/view/View$OnTouchListener;", "l", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "", "tag", "setLoadingButtonTag", "(Ljava/lang/String;)V", "id", "setCustomE2ETestId", "Law0/k3;", "strategy", "setLoadingStrategy", "(Law0/k3;)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "txt", "(Ljava/lang/CharSequence;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "img", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "badgeContent", "setBadge", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "", "enabled", "setEnabled", "(Z)V", "pressed", "setPressed", "", "radius", "setBackgroundCornerRadius$ui_kit_components_release", "(F)V", "setBackgroundCornerRadius", "priority", "setLoadingButtonPriority$ui_kit_components_release", "(I)V", "setLoadingButtonPriority", "left", "top", "right", "bottom", "setBackgroundDrawableBounds$ui_kit_components_release", "(IIII)V", "setBackgroundDrawableBounds", "setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release", "setBackgroundDrawableLockedBoundsEnabled", "alpha", "setTextAlpha$ui_kit_components_release", "setTextAlpha", "setImageAlpha$ui_kit_components_release", "setImageAlpha", "Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/revolut/core/ui_kit/internal/drawables/RevolutAnimatableDrawable;", "getOrInitLoadingProgressDrawable", "()Lcom/revolut/core/ui_kit/internal/drawables/RevolutAnimatableDrawable;", "Landroid/os/Parcelable;", "m", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lzz0/h;", "n", "Lzz0/h;", "getInteractionTracker", "()Lzz0/h;", "interactionTracker", "value", "F", "I", "getButtonHeightPx$ui_kit_components_release", "()I", "buttonHeightPx", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "Companion", "ButtonStyle", "CenterIcon", "mx0/v8", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LargeActionButton extends ShadowLayout implements ur0.a, TrackableItem, yt0.k, sy0.a, rr0.d, zz0.d, jr0.i, a4, w0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final rr0.g A;
    public RevolutAnimatableDrawable B;
    public v1 C;
    public int D;
    public float E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final int buttonHeightPx;
    public v8 G;
    public k3 H;
    public boolean I;
    public final fp0.p J;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f58714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final zz0.h interactionTracker;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Clause f58717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Image f58718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NewBadgeContent f58719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ButtonStyle f58720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f58721t;
    public final TextView u;
    public final ImageView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public NewBadgeView f58722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ShimmerFrameLayout f58723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ViewGroup f58724y;
    public final ViewGroup z;

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$CenterIcon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CenterIcon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CenterIcon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f58749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f58750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f58751c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CenterIcon(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CenterIcon[i];
            }
        }

        public CenterIcon(int i, int i2, int i3) {
            this.f58749a = i;
            this.f58750b = i2;
            this.f58751c = i3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF58749a() {
            return this.f58749a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CenterIcon)) {
                return false;
            }
            CenterIcon centerIcon = (CenterIcon) obj2;
            return this.f58749a == centerIcon.f58749a && this.f58750b == centerIcon.f58750b && this.f58751c == centerIcon.f58751c;
        }

        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public final int getF58751c() {
            return this.f58751c;
        }

        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public final int getF58750b() {
            return this.f58750b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f58751c) + j6.a.b(this.f58750b, Integer.hashCode(this.f58749a) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f58749a);
            dest.writeInt(this.f58750b);
            dest.writeInt(this.f58751c);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.LargeActionButton$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intrinsics.h(view);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeActionButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RevolutAnimatableDrawable getOrInitLoadingProgressDrawable() {
        RevolutAnimatableDrawable revolutAnimatableDrawable = this.B;
        if (revolutAnimatableDrawable != null) {
            return revolutAnimatableDrawable;
        }
        RevolutAnimatableDrawable revolutAnimatableDrawable2 = new RevolutAnimatableDrawable(AnimatedVectorDrawableCompat.create(getContext(), R$drawable.uikit_icn_48_loading_anim));
        this.B = revolutAnimatableDrawable2;
        return revolutAnimatableDrawable2;
    }

    public static void s(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    @Override // com.revolut.core.ui_kit.views.ProgressSwitcher, rr0.d
    public final void L(boolean z) {
        this.I = z;
        f();
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.A.V();
    }

    @Override // ms0.a4
    public final void a(int i, int i2, Path outPath) {
        Intrinsics.checkNotNullParameter(outPath, "outPath");
        float width = getWidth() + i;
        float height = getHeight() + i2;
        float f = this.E;
        outPath.addRoundRect(i, i2, width, height, f, f, Path.Direction.CW);
    }

    public final void d() {
        Drawable background = getBackground();
        while (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        GradientDrawable gradientDrawable = null;
        if (background instanceof StateListDrawable) {
            Drawable current = ((StateListDrawable) background).getCurrent();
            Intrinsics.checkNotNullExpressionValue(current, "getCurrent(...)");
            if (current instanceof GradientDrawable) {
                gradientDrawable = (GradientDrawable) current;
            } else if (current instanceof RippleDrawable) {
                Drawable drawableFindDrawableByLayerId = ((RippleDrawable) current).findDrawableByLayerId(R$id.rippleContent);
                if (drawableFindDrawableByLayerId instanceof GradientDrawable) {
                    gradientDrawable = (GradientDrawable) drawableFindDrawableByLayerId;
                }
            } else if (current instanceof LayerDrawable) {
                Drawable drawable = ((LayerDrawable) current).getDrawable(0);
                if (drawable instanceof GradientDrawable) {
                    gradientDrawable = (GradientDrawable) drawable;
                }
            }
        }
        if (gradientDrawable != null) {
            float cornerRadius = gradientDrawable.getCornerRadius();
            float f = this.E;
            if (cornerRadius == f) {
                return;
            }
            gradientDrawable.setCornerRadius(f);
        }
    }

    public final void e() {
        NewBadgeView newBadgeView = this.f58722w;
        if (newBadgeView == null) {
            return;
        }
        newBadgeView.setVisibility((this.f58720s.getF58748t() == null && this.f58719r != null) ? 0 : 8);
        if (newBadgeView.getVisibility() == 0) {
            boolean z = this.f58720s instanceof ButtonStyle.FlatButton;
            if (!z) {
                ViewParent parent = newBadgeView.getParent();
                ViewGroup viewGroup = this.f58724y;
                if (!Intrinsics.f(parent, viewGroup)) {
                    s(newBadgeView);
                    viewGroup.addView(newBadgeView, new FrameLayout.LayoutParams(-2, -2, 5));
                    return;
                }
            }
            if (z) {
                ViewParent parent2 = newBadgeView.getParent();
                ViewGroup viewGroup2 = this.z;
                if (Intrinsics.f(parent2, viewGroup2)) {
                    return;
                }
                s(newBadgeView);
                viewGroup2.addView(newBadgeView, new LinearLayout.LayoutParams(-2, -2));
            }
        }
    }

    public final void f() {
        boolean z = this.I;
        ImageView imageView = this.v;
        if (!z) {
            RevolutAnimatableDrawable revolutAnimatableDrawable = this.B;
            if (revolutAnimatableDrawable != null) {
                revolutAnimatableDrawable.stop();
            }
            setProgressVisible(false);
            ty0.c.b(or0.u.k(this).b0(), this.f58717p, this.u, null, null, 12);
            q();
            imageView.setImageDrawable(null);
            imageView.setTag(null);
            t();
            k();
            return;
        }
        k3 k3Var = this.H;
        if (!(k3Var instanceof j3)) {
            if (k3Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            setProgressVisible(true);
            return;
        }
        setProgressVisible(false);
        RevolutAnimatableDrawable orInitLoadingProgressDrawable = getOrInitLoadingProgressDrawable();
        imageView.setImageDrawable(orInitLoadingProgressDrawable);
        imageView.setVisibility(0);
        ty0.c.b(or0.u.k(this).b0(), ((j3) k3Var).a(), this.u, null, null, 12);
        this.u.setVisibility(0);
        orInitLoadingProgressDrawable.start();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF52514l() {
        return this.analyticsContext;
    }

    /* JADX INFO: renamed from: getButtonHeightPx$ui_kit_components_release, reason: from getter */
    public final int getButtonHeightPx() {
        return this.buttonHeightPx;
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        jr0.g.Companion.getClass();
        return jr0.f.a(this);
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // zz0.d
    @NotNull
    public zz0.h getInteractionTracker() {
        return this.interactionTracker;
    }

    public final void i(ButtonStyle buttonStyle) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        qs0.a aVarA = qs0.c.a(buttonStyle, context, this.D, this.C, getCornersRadius());
        int iB = aVarA.b();
        hp0.a aVarA2 = aVarA.a();
        setBackground(aVarA2 != null ? aVarA2.b() : null);
        setProgressTintColor(iB);
        CenterIcon f58748t = buttonStyle.getF58748t();
        ImageView imageView = this.v;
        TextView textView = this.u;
        if (f58748t != null) {
            textView.setTextColor(0);
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(iB, PorterDuff.Mode.SRC_IN);
            textView.setTextColor(iB);
        }
    }

    public final void j() {
        float fD;
        if (isEnabled()) {
            fD = 1.0f;
        } else {
            ButtonStyle buttonStyle = this.f58720s;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fD = buttonStyle.d(context);
        }
        setImageAlpha$ui_kit_components_release(fD);
        setTextAlpha$ui_kit_components_release(fD);
    }

    public final void k() {
        this.v.setVisibility((this.f58720s.getF58748t() == null && this.f58718q == null) ? 8 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle r2 = r4.f58720s
            android.content.Context r3 = r4.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            com.revolut.core.ui.models.Color r2 = r2.e(r3)
            int r0 = io0.a.c(r0, r2)
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L3c
            if (r0 == 0) goto L3c
            android.content.Context r0 = r4.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = kli.a.q(r0)
            if (r0 == 0) goto L30
            goto L3c
        L30:
            boolean r0 = r4.isPressed()
            if (r0 == 0) goto L39
            r0 = 1077936128(0x40400000, float:3.0)
            goto L3d
        L39:
            r0 = 1082130432(0x40800000, float:4.0)
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r4.setShadowElevation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.LargeActionButton.m():void");
    }

    public final void n(ButtonStyle buttonStyle) {
        RoundedBackgroundDrawable roundedBackgroundDrawable;
        boolean zF = Intrinsics.f(buttonStyle, ButtonStyle.f58737s);
        ViewGroup viewGroup = this.z;
        if (!zF) {
            if (viewGroup.getVisibility() == 0) {
                return;
            }
            viewGroup.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout = this.f58723x;
            if (shimmerFrameLayout != null) {
                s(shimmerFrameLayout);
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
        ShimmerFrameLayout shimmerFrameLayout2 = this.f58723x;
        int i = 4;
        if (shimmerFrameLayout2 == null) {
            shimmerFrameLayout2 = new ShimmerFrameLayout(getContext());
            this.f58723x = shimmerFrameLayout2;
            shimmerFrameLayout2.setId(R$id.internal_largeActionButton_shimmerView);
            shimmerFrameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            shimmerFrameLayout2.setOnTouchListener(new u8());
            AppCompatTextView appCompatTextView = new AppCompatTextView(shimmerFrameLayout2.getContext());
            appCompatTextView.setWidth(-1);
            appCompatTextView.setHeight(this.buttonHeightPx);
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            appCompatTextView.setBackground(new RoundedBackgroundDrawable(context, kli.a.s(R$attr.uikit_colorShimmer, context2), i));
            shimmerFrameLayout2.addView(appCompatTextView);
        }
        View childAt = shimmerFrameLayout2.getChildAt(0);
        v8 v8Var = this.G;
        int i2 = v8Var == null ? -1 : w8.f210076a[v8Var.ordinal()];
        if (i2 == -1 || i2 == 1) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            roundedBackgroundDrawable = new RoundedBackgroundDrawable(context3, kli.a.s(R$attr.uikit_colorShimmer, context4), i);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RoundedBackgroundDrawable.Companion aVar = RoundedBackgroundDrawable.INSTANCE;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorGreyTone8, context6);
            aVar.getClass();
            roundedBackgroundDrawable = RoundedBackgroundDrawable.Companion.c(iS, context5);
        }
        childAt.setBackground(roundedBackgroundDrawable);
        v8 v8Var2 = this.G;
        int i3 = v8Var2 == null ? -1 : w8.f210076a[v8Var2.ordinal()];
        if (i3 == -1) {
            shimmerFrameLayout2.f();
            shimmerFrameLayout2.a();
            Unit unit = Unit.f186387a;
        } else if (i3 == 1) {
            ifk.b.r(shimmerFrameLayout2);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ifk.b.q(shimmerFrameLayout2, null, 3);
        }
        if (shimmerFrameLayout2.getParent() == null) {
            this.f58724y.addView(shimmerFrameLayout2);
        }
    }

    public final void o(ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.f(this.f58720s, style) && this.f58721t) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iC = io0.a.c(context, style.e(context2));
        if (iC != 0) {
            setShadowColor(new Color.SolidInt(iC));
        }
        this.f58720s = style;
        this.f58721t = true;
        this.J.c((!(style instanceof ButtonStyle.FlatButton) || style.equals(ButtonStyle.f58737s)) ? new gp0.g(0) : gp0.b.f145198a);
        if (!style.equals(ButtonStyle.f58737s)) {
            i(style);
            t();
            j();
            m();
            p();
            q();
            k();
            e();
            d();
        }
        n(style);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58714l.a(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f58721t) {
            o(this.f58720s);
        }
        super.onMeasure(i, i2);
    }

    public final void p() {
        or0.u.n(this.u, (this.f58720s instanceof ButtonStyle.FlatButton) && isEnabled() && isClickable());
    }

    public final void q() {
        this.u.setVisibility((this.f58720s.getF58748t() == null && this.f58717p != null) ? 0 : 8);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        ShimmerFrameLayout shimmerFrameLayout;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.C = colorScheme;
        this.D = i;
        ButtonStyle buttonStyle = this.f58720s;
        if (buttonStyle.getF58740t()) {
            i(buttonStyle);
        }
        if (buttonStyle.equals(ButtonStyle.f58737s) && this.G == v8.COLORED && (shimmerFrameLayout = this.f58723x) != null) {
            ifk.b.q(shimmerFrameLayout, colorScheme, 1);
        }
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate delegate) {
        getInteractionTracker().f326479b = delegate;
        if (delegate == null) {
            super.setAccessibilityDelegate(null);
        } else {
            super.setAccessibilityDelegate(getInteractionTracker());
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        super.setBackground(background != null ? new LockableBoundsDrawableWrapper(background) : null);
    }

    public final void setBackgroundCornerRadius$ui_kit_components_release(float radius) {
        if (this.E == radius) {
            return;
        }
        this.E = radius;
        d();
    }

    public final void setBackgroundDrawableBounds$ui_kit_components_release(int left, int top, int right, int bottom) {
        Object background = getBackground();
        dr0.s sVar = background instanceof dr0.s ? (dr0.s) background : null;
        if (sVar != null) {
            ((LockableBoundsDrawableWrapper) sVar).c(left, top, right, bottom, true);
        }
    }

    public final void setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(boolean enabled) {
        Object background = getBackground();
        dr0.s sVar = background instanceof dr0.s ? (dr0.s) background : null;
        if (sVar != null) {
            ((LockableBoundsDrawableWrapper) sVar).f55994a = enabled;
        }
    }

    public final void setBadge(NewBadgeContent badgeContent) {
        if (Intrinsics.f(badgeContent, this.f58719r)) {
            return;
        }
        this.f58719r = badgeContent;
        if (badgeContent != null) {
            NewBadgeView newBadgeView = this.f58722w;
            if (newBadgeView == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                newBadgeView = new NewBadgeView(context, null, 6, 0);
                this.f58722w = newBadgeView;
                newBadgeView.setId(R$id.largeButton_badge);
                newBadgeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            newBadgeView.setContent(badgeContent);
        }
        e();
    }

    public final void setCustomE2ETestId(String id10) {
        hx7.b.v(this, id10);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        p();
        j();
        m();
        d();
        this.u.setEnabled(enabled);
    }

    public final void setIcon(Image img2) {
        if (Intrinsics.f(img2, this.f58718q)) {
            return;
        }
        this.f58718q = img2;
        if (this.I) {
            return;
        }
        t();
        k();
    }

    public final void setImageAlpha$ui_kit_components_release(float alpha) {
        this.v.setAlpha(alpha);
    }

    public final void setLoadingButtonPriority$ui_kit_components_release(int priority) {
        this.A.f256622n = priority;
    }

    public final void setLoadingButtonTag(String tag2) {
        setTag(tag2);
    }

    public final void setLoadingStrategy(k3 strategy) {
        if (Intrinsics.f(strategy, this.H)) {
            return;
        }
        this.H = strategy;
        this.A.i = strategy == null;
        f();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        if (l2 == null) {
            super.setOnClickListener(null);
        } else {
            super.setOnClickListener(new bx0.b(this, l2, 6));
            p();
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener l2) {
        getInteractionTracker().f326478a = l2;
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        if (pressed == isPressed()) {
            return;
        }
        super.setPressed(pressed);
        j();
        m();
    }

    public final void setText(Clause clause) {
        if (Intrinsics.f(clause, this.f58717p)) {
            return;
        }
        this.f58717p = clause;
        if (this.I) {
            return;
        }
        ty0.c.b(or0.u.k(this).b0(), clause, this.u, null, null, 12);
        q();
    }

    public final void setTextAlpha$ui_kit_components_release(float alpha) {
        this.u.setAlpha(alpha);
    }

    public final void t() {
        int f58750b;
        int f58751c;
        int i;
        Image image;
        int iV;
        CenterIcon f58748t = this.f58720s.getF58748t();
        if (f58748t == null) {
            Image image2 = this.f58718q;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iV = (int) kli.a.v(R$attr.uikit_large_button_icon_size, context);
            image = image2;
            i = iV;
        } else {
            Float f = null;
            LayeredImage layeredImage = new LayeredImage(zhm.u.c(new LayeredImage.Layer.Drawable(f58748t.getF58749a(), (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126)), f, f, 14);
            if (f58748t.getF58750b() > 0) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                f58750b = kli.a.k(context2, f58748t.getF58750b());
            } else {
                f58750b = f58748t.getF58750b();
            }
            if (f58748t.getF58751c() > 0) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                f58751c = kli.a.k(context3, f58748t.getF58751c());
            } else {
                f58751c = f58748t.getF58751c();
            }
            i = f58751c;
            image = layeredImage;
            iV = f58750b;
        }
        ImageView imageView = this.v;
        if (!Intrinsics.f(imageView.getTag(), image)) {
            yy0.f.e(or0.u.k(this).Q(), image, this.v, null, null, 12);
            imageView.setTag(image);
        }
        or0.u.A(imageView, i, iV);
        imageView.setAdjustViewBounds(true);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\t\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "a", "FlatButton", "ContextualFilledButton", "ContextualSolidButton", "DefaultFilledButton", "StaticCustomButton", "BlackOrWhiteButton", "FilledButton", "LegacyResourceButton", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualSolidButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FilledButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FlatButton;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ButtonStyle implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultFilledButton f58725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DefaultFilledButton f58726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DefaultFilledButton f58727c;
        public static final DefaultFilledButton d;
        public static final BlackOrWhiteButton.Plain e;
        public static final BlackOrWhiteButton.Plain f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final BlackOrWhiteButton.WithCenterIcon f58728g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final StaticCustomButton f58729h;
        public static final BlackOrWhiteButton.WithCenterIcon i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final ContextualFilledButton.WithCenterIcon f58730j;
        public static final ContextualFilledButton.WithCenterIcon k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final DefaultFilledButton f58731l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final ContextualFilledButton.Plain f58732m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final ContextualSolidButton f58733n;
        public static final FlatButton o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final FlatButton f58734p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final DefaultFilledButton f58735q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final DefaultFilledButton f58736r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final FlatButton f58737s;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "<init>", "()V", "Plain", "WithCenterIcon", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton$Plain;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton$WithCenterIcon;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class ContextualFilledButton extends ButtonStyle {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final boolean f58740t;

            /* JADX INFO: loaded from: classes20.dex */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton$Plain;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Plain extends ContextualFilledButton {
                public static final Plain u = new Plain(0);

                @NotNull
                public static final Parcelable.Creator<Plain> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Plain.u;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Plain[i];
                    }
                }

                private Plain() {
                    super(0);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            /* JADX INFO: loaded from: classes20.dex */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton$WithCenterIcon;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualFilledButton;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithCenterIcon extends ContextualFilledButton {

                @NotNull
                public static final Parcelable.Creator<WithCenterIcon> CREATOR = new a();
                public final CenterIcon u;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithCenterIcon(CenterIcon.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithCenterIcon[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WithCenterIcon(CenterIcon centerIcon) {
                    super(0);
                    Intrinsics.checkNotNullParameter(centerIcon, "centerIcon");
                    this.u = centerIcon;
                }

                @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
                /* JADX INFO: renamed from: a, reason: from getter */
                public final CenterIcon getF58748t() {
                    return this.u;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof WithCenterIcon) && Intrinsics.f(this.u, ((WithCenterIcon) obj2).u);
                }

                public final int hashCode() {
                    return this.u.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.u.writeToParcel(dest, i);
                }
            }

            public /* synthetic */ ContextualFilledButton(int i) {
                this();
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF58740t() {
                return this.f58740t;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return 0.5f;
            }

            private ContextualFilledButton() {
                this.f58740t = true;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$ContextualSolidButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ContextualSolidButton extends ButtonStyle {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final ContextualSolidButton f58741t = new ContextualSolidButton();

            @NotNull
            public static final Parcelable.Creator<ContextualSolidButton> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ContextualSolidButton.f58741t;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContextualSolidButton[i];
                }
            }

            private ContextualSolidButton() {
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: b */
            public final boolean getF58740t() {
                return true;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return 0.5f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FilledButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class FilledButton extends ButtonStyle {
            public abstract hp0.a j(Context context);
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FlatButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FlatButton extends ButtonStyle {

            @NotNull
            public static final Parcelable.Creator<FlatButton> CREATOR = new a();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final int f58746t;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FlatButton(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FlatButton[i];
                }
            }

            public FlatButton(int i) {
                this.f58746t = i;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: b */
            public final boolean getF58740t() {
                return true;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getV() {
                return this.f58746t;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return 0.4f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FlatButton) && this.f58746t == ((FlatButton) obj2).f58746t;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f58746t);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f58746t);
            }
        }

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$LegacyResourceButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FilledButton;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LegacyResourceButton extends FilledButton {

            @NotNull
            public static final Parcelable.Creator<LegacyResourceButton> CREATOR = new a();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final int f58747t;
            public final int u;
            public final int v;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LegacyResourceButton(parcel.readInt(), parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LegacyResourceButton[i];
                }
            }

            public LegacyResourceButton(int i, int i2, int i3) {
                this.f58747t = i;
                this.u = i2;
                this.v = i3;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getV() {
                return this.v;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return 0.7f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LegacyResourceButton)) {
                    return false;
                }
                LegacyResourceButton legacyResourceButton = (LegacyResourceButton) obj2;
                return this.f58747t == legacyResourceButton.f58747t && this.u == legacyResourceButton.u && this.v == legacyResourceButton.v;
            }

            public final int hashCode() {
                return Integer.hashCode(this.v) + j6.a.b(this.u, Integer.hashCode(this.f58747t) * 31, 31);
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.FilledButton
            public final hp0.a j(Context context) {
                Context context2;
                Intrinsics.checkNotNullParameter(context, "context");
                Drawable drawable = context.getDrawable(this.f58747t);
                if (drawable == null) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
                    Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                    context2 = context;
                    drawable = new UIKitRippleDrawable(context2, colorStateListValueOf, (Drawable) null, (Drawable) null, (Integer) null);
                } else {
                    context2 = context;
                }
                return dr0.l.k(new hp0.b(drawable, false), context2.getDrawable(this.u), null, 60);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f58747t);
                dest.writeInt(this.u);
                dest.writeInt(this.v);
            }
        }

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$StaticCustomButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FilledButton;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StaticCustomButton extends FilledButton {

            @NotNull
            public static final Parcelable.Creator<StaticCustomButton> CREATOR = new a();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final CenterIcon f58748t;
            public final int u;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new StaticCustomButton(CenterIcon.CREATOR.createFromParcel(parcel), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StaticCustomButton[i];
                }
            }

            public StaticCustomButton(CenterIcon centerIcon, int i) {
                Intrinsics.checkNotNullParameter(centerIcon, "centerIcon");
                this.f58748t = centerIcon;
                this.u = i;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: a, reason: from getter */
            public final CenterIcon getF58748t() {
                return this.f58748t;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return 1.0f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof StaticCustomButton)) {
                    return false;
                }
                StaticCustomButton staticCustomButton = (StaticCustomButton) obj2;
                return Intrinsics.f(this.f58748t, staticCustomButton.f58748t) && this.u == staticCustomButton.u;
            }

            public final int hashCode() {
                return Integer.hashCode(this.u) + (this.f58748t.hashCode() * 31);
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.FilledButton
            public final hp0.a j(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                Drawable drawable = context.getDrawable(this.u);
                if (drawable == null) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
                    Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                    drawable = new UIKitRippleDrawable(context, colorStateListValueOf, (Drawable) null, (Drawable) null, (Integer) null);
                }
                return new hp0.b(drawable, true);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f58748t.writeToParcel(dest, i);
                dest.writeInt(this.u);
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        static {
            Color.Solid solid = null;
            f58725a = new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0, 0, BitmapDescriptorFactory.HUE_RED, new Color.Solid(R$attr.uikit_colorAccentNeutral_60), solid, 46);
            f58726b = new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral), R$attr.uikit_colorDisabledBackground_20, R$attr.uikit_colorAccentNeutral, 0.5f, solid, new Color.Solid(R$attr.uikit_colorGroupedBackground), 16);
            int i2 = R$attr.uikit_colorBlack;
            f58727c = new DefaultFilledButton(new Color.Solid(i2), R$attr.uikit_colorBlack_60, R$attr.uikit_colorWhite, 0.8f, new Color.Solid(i2), null, 32);
            d = new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorWhite), R$attr.uikit_colorWhite_60, R$attr.uikit_colorBlack, 0.4f, new Color.Solid(R$attr.uikit_colorGrey20), null, 32);
            e = new BlackOrWhiteButton.Plain(true, (int) (1 == true ? 1 : 0));
            f = new BlackOrWhiteButton.Plain(false, (int) (1 == true ? 1 : 0));
            f58728g = new BlackOrWhiteButton.WithCenterIcon(new CenterIcon(com.revolut.core.ui_kit.R$drawable.internal_add_to_googlepay_button_content, -2, 22));
            f58729h = new StaticCustomButton(new CenterIcon(com.revolut.core.ui_kit.R$drawable.internal_add_to_google_wallet_button_content, -2, 30), com.revolut.core.ui_kit.R$drawable.internal_add_to_google_wallet_button_background);
            i = new BlackOrWhiteButton.WithCenterIcon(new CenterIcon(com.revolut.core.ui_kit.R$drawable.internal_googlepay_button_content, -2, 22));
            f58730j = new ContextualFilledButton.WithCenterIcon(new CenterIcon(R$drawable.uikit_icn_24_logo_google, 24, 24));
            k = new ContextualFilledButton.WithCenterIcon(new CenterIcon(R$drawable.uikit_icn_24_logo_uae_pass, 24, 24));
            f58731l = new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorInputError), R$attr.uikit_colorDisabledBackground_60, R$attr.uikit_colorStatusDanger, 0.6f, new Color.Solid(R$attr.uikit_colorTransparent), null, 32);
            f58732m = ContextualFilledButton.Plain.u;
            f58733n = ContextualSolidButton.f58741t;
            o = new FlatButton(R$attr.uikit_colorAccentNeutral);
            f58734p = new FlatButton(R$attr.uikit_colorWhite);
            Color.Solid solid2 = null;
            int i3 = 0;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            Color.Solid solid3 = null;
            new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorPerformancePositive), i3, R$attr.uikit_colorOnAccent, f4, solid3, solid2, 58);
            f58735q = new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorPerformanceNegative), R$attr.uikit_colorDisabledBackground_70, R$attr.uikit_colorOnAccent, 0.5f, null, null, 48);
            f58736r = new DefaultFilledButton(new Color.Solid(R$attr.uikit_colorStatusDanger), i3, 0, f4, solid3, solid2, 62);
            f58737s = new FlatButton(0);
        }

        private ButtonStyle() {
        }

        /* JADX INFO: renamed from: a */
        public CenterIcon getF58748t() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        public boolean getF58740t() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public int getV() {
            return R$attr.uikit_colorTransparent;
        }

        public abstract float d(Context context);

        public Color e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Color.Solid(R$attr.uikit_colorTransparent);
        }

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FilledButton;", "<init>", "()V", "Plain", "WithCenterIcon", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton$Plain;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton$WithCenterIcon;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class BlackOrWhiteButton extends FilledButton {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton$Plain;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Plain extends BlackOrWhiteButton {

                @NotNull
                public static final Parcelable.Creator<Plain> CREATOR = new a();

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final boolean f58738t;
                public final boolean u;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Plain(parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Plain[i];
                    }
                }

                public Plain() {
                    this(false, 3);
                }

                @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.BlackOrWhiteButton
                /* JADX INFO: renamed from: J, reason: from getter */
                public final boolean getU() {
                    return this.f58738t;
                }

                public final ButtonStyle W() {
                    return new Plain(false, this.u);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Plain)) {
                        return false;
                    }
                    Plain plain = (Plain) obj2;
                    return this.f58738t == plain.f58738t && this.u == plain.u;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.u) + (Boolean.hashCode(this.f58738t) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f58738t ? 1 : 0);
                    dest.writeInt(this.u ? 1 : 0);
                }

                @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.BlackOrWhiteButton
                /* JADX INFO: renamed from: z, reason: from getter */
                public final boolean getV() {
                    return this.u;
                }

                public Plain(boolean z, boolean z3) {
                    this.f58738t = z;
                    this.u = z3;
                }

                public /* synthetic */ Plain(boolean z, int i) {
                    this(true, (i & 2) != 0 ? true : z);
                }
            }

            private BlackOrWhiteButton() {
            }

            /* JADX INFO: renamed from: J */
            public abstract boolean getU();

            public final boolean T(Context context) {
                boolean v = getV();
                boolean zQ = kli.a.q(context);
                return v ? zQ : !zQ;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: c */
            public final int getV() {
                return getV() ? R$attr.uikit_colorBackground : R$attr.uikit_colorForeground;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (T(context)) {
                    DefaultFilledButton defaultFilledButton = ButtonStyle.d;
                    defaultFilledButton.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return defaultFilledButton.f58743w;
                }
                DefaultFilledButton defaultFilledButton2 = ButtonStyle.f58727c;
                defaultFilledButton2.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return defaultFilledButton2.f58743w;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final Color e(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (!getU()) {
                    return new Color.Solid(R$attr.uikit_colorTransparent);
                }
                if (T(context)) {
                    DefaultFilledButton defaultFilledButton = ButtonStyle.d;
                    defaultFilledButton.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    return defaultFilledButton.f58744x;
                }
                DefaultFilledButton defaultFilledButton2 = ButtonStyle.f58727c;
                defaultFilledButton2.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return defaultFilledButton2.f58744x;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.FilledButton
            public final hp0.a j(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return T(context) ? ButtonStyle.d.j(context) : ButtonStyle.f58727c.j(context);
            }

            /* JADX INFO: renamed from: z */
            public abstract boolean getV();

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton$WithCenterIcon;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$BlackOrWhiteButton;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithCenterIcon extends BlackOrWhiteButton {

                @NotNull
                public static final Parcelable.Creator<WithCenterIcon> CREATOR = new a();

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final CenterIcon f58739t;
                public final boolean u;
                public final boolean v;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithCenterIcon(CenterIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithCenterIcon[i];
                    }
                }

                public WithCenterIcon(CenterIcon centerIcon, boolean z, boolean z3) {
                    Intrinsics.checkNotNullParameter(centerIcon, "centerIcon");
                    this.f58739t = centerIcon;
                    this.u = z;
                    this.v = z3;
                }

                @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.BlackOrWhiteButton
                /* JADX INFO: renamed from: J, reason: from getter */
                public final boolean getU() {
                    return this.u;
                }

                @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
                /* JADX INFO: renamed from: a, reason: from getter */
                public final CenterIcon getF58748t() {
                    return this.f58739t;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof WithCenterIcon)) {
                        return false;
                    }
                    WithCenterIcon withCenterIcon = (WithCenterIcon) obj2;
                    return Intrinsics.f(this.f58739t, withCenterIcon.f58739t) && this.u == withCenterIcon.u && this.v == withCenterIcon.v;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.v) + j6.a.c(this.f58739t.hashCode() * 31, 31, this.u);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.f58739t.writeToParcel(dest, i);
                    dest.writeInt(this.u ? 1 : 0);
                    dest.writeInt(this.v ? 1 : 0);
                }

                @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.BlackOrWhiteButton
                /* JADX INFO: renamed from: z, reason: from getter */
                public final boolean getV() {
                    return this.v;
                }

                public /* synthetic */ WithCenterIcon(CenterIcon centerIcon) {
                    this(centerIcon, true, true);
                }
            }
        }

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$DefaultFilledButton;", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle$FilledButton;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DefaultFilledButton extends FilledButton {

            @NotNull
            public static final Parcelable.Creator<DefaultFilledButton> CREATOR = new a();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final Color f58742t;
            public final int u;
            public final int v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final float f58743w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final Color f58744x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final Color f58745y;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DefaultFilledButton((Color) parcel.readParcelable(DefaultFilledButton.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readFloat(), (Color) parcel.readParcelable(DefaultFilledButton.class.getClassLoader()), (Color) parcel.readParcelable(DefaultFilledButton.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DefaultFilledButton[i];
                }
            }

            public DefaultFilledButton(Color bgColor, int i, int i2, float f, Color shadowColor, Color color) {
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                Intrinsics.checkNotNullParameter(shadowColor, "shadowColor");
                this.f58742t = bgColor;
                this.u = i;
                this.v = i2;
                this.f58743w = f;
                this.f58744x = shadowColor;
                this.f58745y = color;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getV() {
                return this.v;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final float d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return this.f58743w;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle
            public final Color e(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return this.f58744x;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DefaultFilledButton)) {
                    return false;
                }
                DefaultFilledButton defaultFilledButton = (DefaultFilledButton) obj2;
                return Intrinsics.f(this.f58742t, defaultFilledButton.f58742t) && this.u == defaultFilledButton.u && this.v == defaultFilledButton.v && Float.compare(this.f58743w, defaultFilledButton.f58743w) == 0 && Intrinsics.f(this.f58744x, defaultFilledButton.f58744x) && Intrinsics.f(this.f58745y, defaultFilledButton.f58745y);
            }

            public final int hashCode() {
                int iD = ehe.n.d(this.f58744x, m72.b.b(this.f58743w, j6.a.b(this.v, j6.a.b(this.u, this.f58742t.hashCode() * 31, 31), 31), 31), 31);
                Color color = this.f58745y;
                return iD + (color == null ? 0 : color.hashCode());
            }

            @Override // com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.FilledButton
            public final hp0.a j(Context context) {
                Color color;
                Intrinsics.checkNotNullParameter(context, "context");
                int iC = io0.a.c(context, this.f58742t);
                if (((iC >> 24) & 255) < 255 && (color = this.f58745y) != null) {
                    int[] iArr = io0.c.f163133a;
                    iC = io0.c.b(iC, io0.a.c(context, color), ho0.a.SRC_OVER);
                }
                int[] iArr2 = io0.c.f163133a;
                int iB = io0.c.b(kli.a.s(this.u, context), iC, ho0.a.SRC_OVER);
                LargeActionButton.INSTANCE.getClass();
                float fV = kli.a.v(R$attr.uikit_large_button_corner_radius, context);
                return dr0.l.k(dr0.l.f(context, new fp0.d(new Color.Solid(this.v), new Color.SolidInt(iC), false), dr0.l.h(context, fV, new Color.SolidInt(iC), 0, null), Integer.valueOf(R$id.rippleContent), null, 16), dr0.l.h(context, fV, new Color.SolidInt(iB), 0, null), null, 60);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f58742t, i);
                dest.writeInt(this.u);
                dest.writeInt(this.v);
                dest.writeFloat(this.f58743w);
                dest.writeParcelable(this.f58744x, i);
                dest.writeParcelable(this.f58745y, i);
            }

            public final ButtonStyle z() {
                Color.Solid shadowColor = new Color.Solid(R$attr.uikit_colorTransparent);
                Color bgColor = this.f58742t;
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                Intrinsics.checkNotNullParameter(shadowColor, "shadowColor");
                return new DefaultFilledButton(bgColor, this.u, this.v, this.f58743w, shadowColor, this.f58745y);
            }

            public /* synthetic */ DefaultFilledButton(Color color, int i, int i2, float f, Color.Solid solid, Color.Solid solid2, int i3) {
                this(color, (i3 & 2) != 0 ? R$attr.uikit_colorDisabledBackground_80 : i, (i3 & 4) != 0 ? R$attr.uikit_colorOnAccentNeutral : i2, (i3 & 8) != 0 ? 0.7f : f, (i3 & 16) != 0 ? color : solid, (i3 & 32) != 0 ? null : solid2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeActionButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeActionButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        gp0.i gVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58714l = new c2(this);
        this.interactionTracker = new zz0.h();
        this.o = v0.a.d("create(...)");
        ButtonStyle.DefaultFilledButton defaultFilledButton = ButtonStyle.f58725a;
        this.f58720s = defaultFilledButton;
        this.A = vc.s.b(this, true);
        v1.Companion.getClass();
        this.C = t1.a(context);
        this.G = v8.REGULAR;
        fp0.m mVar = fp0.p.Companion;
        int i2 = 0;
        gp0.g gVar2 = new gp0.g(i2);
        mVar.getClass();
        fp0.p pVarA = fp0.m.a(this, gVar2);
        this.J = pVarA;
        View.inflate(context, R$layout.internal_large_button_layout, this);
        View viewFindViewById = findViewById(R$id.largeButton_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f58724y = viewGroup;
        View viewFindViewById2 = viewGroup.findViewById(R$id.largeButton_innerContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.z = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R$id.largeButton_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.u = textView;
        View viewFindViewById4 = viewGroup2.findViewById(R$id.largeButton_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.v = (ImageView) viewFindViewById4;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.buttonHeightPx = (int) kli.a.v(R$attr.uikit_large_button_height, context2);
        viewGroup2.getLayoutParams().height = this.buttonHeightPx;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iV = (int) kli.a.v(R$attr.uikit_large_button_horizontal_padding, context3);
        viewGroup2.setPaddingRelative(iV, 0, iV, 0);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.LargeActionButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.LargeActionButton_uikit_LargeActionButtonStyle, -1);
        ButtonStyle buttonStyleZ = defaultFilledButton;
        if (i3 != -1) {
            switch (i3) {
                case 0:
                    break;
                case 1:
                    buttonStyleZ = ButtonStyle.f58726b;
                    break;
                case 2:
                    buttonStyleZ = ButtonStyle.f58727c;
                    break;
                case 3:
                    buttonStyleZ = ButtonStyle.o;
                    break;
                case 4:
                    buttonStyleZ = ButtonStyle.d;
                    break;
                case 5:
                    buttonStyleZ = ButtonStyle.e;
                    break;
                case 6:
                    buttonStyleZ = ButtonStyle.f;
                    break;
                case 7:
                    buttonStyleZ = ButtonStyle.i;
                    break;
                case 8:
                    buttonStyleZ = defaultFilledButton.z();
                    break;
                case 9:
                    buttonStyleZ = ButtonStyle.f58727c.z();
                    break;
                case 10:
                    buttonStyleZ = ButtonStyle.d.z();
                    break;
                case 11:
                    buttonStyleZ = ButtonStyle.e.W();
                    break;
                case 12:
                    buttonStyleZ = ButtonStyle.f.W();
                    break;
                case 13:
                    buttonStyleZ = ButtonStyle.f58728g;
                    break;
                case 14:
                    buttonStyleZ = ButtonStyle.f58732m;
                    break;
                case 15:
                    buttonStyleZ = ButtonStyle.f58729h;
                    break;
                default:
                    buttonStyleZ = null;
                    break;
            }
            if (buttonStyleZ != null) {
                this.f58720s = buttonStyleZ;
            }
        }
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.LargeActionButton_android_text);
        if (string != null) {
            setText(new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LargeActionButton_android_enabled, true);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(z);
        setClickable(true);
        setFocusable(true);
        setCornersRadius(kli.a.v(R$attr.uikit_large_button_corner_radius, context));
        this.E = kli.a.k(context, getCornersRadius());
        textView.setEnabled(isEnabled());
        setAutoClipOutline(false);
        super.setAccessibilityDelegate(getInteractionTracker());
        super.setOnTouchListener(getInteractionTracker());
        ButtonStyle buttonStyle = this.f58720s;
        if ((buttonStyle instanceof ButtonStyle.FlatButton) && !buttonStyle.equals(ButtonStyle.f58737s)) {
            gVar = gp0.b.f145198a;
        } else {
            gVar = new gp0.g(i2);
        }
        pVarA.c(gVar);
        fp0.p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new b());
        setProgressSize(kli.a.k(context, 24.0f));
    }

    @yhm.d
    public final void setText(CharSequence txt) {
        setText(txt != null ? new CharSequenceClause(txt) : null);
    }

    public /* synthetic */ LargeActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
