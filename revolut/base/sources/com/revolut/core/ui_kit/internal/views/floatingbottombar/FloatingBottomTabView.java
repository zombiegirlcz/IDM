package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ip0.v7;
import jq0.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mt0.y;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FloatingBottomTabView extends ConstraintLayout {

    @NotNull
    public static final a Companion = new a();
    public static final int o = R$attr.uikit_colorForeground;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f57035p = R$attr.uikit_colorGreyTone50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57036b;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f57038h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f57039j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppCompatImageView f57040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public UIKitRippleDrawable f57041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DisplayedItemModel f57042n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomTabView$DisplayedItemModel;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/internal/views/floatingbottombar/k", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayedItemModel implements TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f57043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f57044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceImage f57045c;
        public final boolean d;
        public final y e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final k f57046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f57047h;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView$DisplayedItemModel$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public DisplayedItemModel(String id10, TextLocalisedClause contentDescription, ResourceImage icon, boolean z, y variant, boolean z3, k type, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f57043a = id10;
            this.f57044b = contentDescription;
            this.f57045c = icon;
            this.d = z;
            this.e = variant;
            this.f = z3;
            this.f57046g = type;
            this.f57047h = parcelable;
        }

        public static DisplayedItemModel a(DisplayedItemModel displayedItemModel, boolean z, boolean z3, int i) {
            String id10 = displayedItemModel.f57043a;
            TextLocalisedClause contentDescription = displayedItemModel.f57044b;
            ResourceImage icon = displayedItemModel.f57045c;
            if ((i & 8) != 0) {
                z = displayedItemModel.d;
            }
            boolean z4 = z;
            y variant = displayedItemModel.e;
            if ((i & 32) != 0) {
                z3 = displayedItemModel.f;
            }
            k type = displayedItemModel.f57046g;
            Parcelable parcelable = displayedItemModel.f57047h;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(type, "type");
            return new DisplayedItemModel(id10, contentDescription, icon, z4, variant, z3, type, parcelable);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DisplayedItemModel)) {
                return false;
            }
            DisplayedItemModel displayedItemModel = (DisplayedItemModel) obj2;
            return Intrinsics.f(this.f57043a, displayedItemModel.f57043a) && this.f57044b.equals(displayedItemModel.f57044b) && this.f57045c.equals(displayedItemModel.f57045c) && this.d == displayedItemModel.d && this.e == displayedItemModel.e && this.f == displayedItemModel.f && this.f57046g == displayedItemModel.f57046g && Intrinsics.f(this.f57047h, displayedItemModel.f57047h);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getO() {
            return this.f57047h;
        }

        public final int hashCode() {
            int iHashCode = (this.f57046g.hashCode() + j6.a.c((this.e.hashCode() + j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f57045c, t61.a.a(this.f57043a.hashCode() * 31, 31, this.f57044b), 31), 31, this.d)) * 31, 31, this.f)) * 31;
            Parcelable parcelable = this.f57047h;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f57047h = parcelable;
        }
    }

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingBottomTabView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static boolean i0(DisplayedItemModel displayedItemModel) {
        return (displayedItemModel != null ? displayedItemModel.f57046g : null) == k.CONTENT_AND_EXPAND;
    }

    public static boolean j0(DisplayedItemModel displayedItemModel) {
        return (displayedItemModel != null ? displayedItemModel.f57046g : null) == k.EXPAND;
    }

    public final void f0(boolean z) {
        float f = z ? 1.1f : 1.0f;
        this.f57038h.animate().scaleX(f).scaleY(f).setDuration(z ? 120L : 300L).setInterpolator(r.f177393b).start();
    }

    public final void g0(boolean z) {
        int iK;
        int i;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new hs0.d(0));
        transitionSet.addTransition(new hs0.a());
        transitionSet.setDuration(200L);
        TransitionManager.beginDelayedTransition(this, transitionSet);
        if (z) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 16.0f);
            i = -1;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 24.0f);
            i = 0;
        }
        this.f57038h.setVisibility(z ? 0 : 8);
        AppCompatImageView appCompatImageView = this.f57040l;
        if (appCompatImageView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.startToStart = i;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iK;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iK;
            appCompatImageView.setLayoutParams(layoutParams2);
        }
        AppCompatImageView appCompatImageView2 = this.f57040l;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(h0(z)));
        }
    }

    public final DisplayedItemModel getDisplayedItem() {
        return this.f57042n;
    }

    public final int getMinContentWidth() {
        DisplayedItemModel displayedItemModel = this.f57042n;
        return (displayedItemModel == null || !displayedItemModel.d) ? this.f57036b : (this.f57037g * 2) + this.f;
    }

    public final int h0(boolean z) {
        if (z) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return io0.a.d(0.6f, kli.a.s(o, context));
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return kli.a.s(f57035p, context2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        UIKitRippleDrawable uIKitRippleDrawable = this.f57041m;
        if (uIKitRippleDrawable != null) {
            uIKitRippleDrawable.setRadius(i / 2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setTabContent(@NotNull DisplayedItemModel item) {
        k kVar;
        int iK;
        int iH0;
        int i;
        int i2;
        boolean z;
        int iK2;
        int iK3;
        int iK4;
        int i3;
        int i5;
        DisplayedItemModel displayedItemModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(this.f57042n, item)) {
            return;
        }
        int i6 = 0;
        boolean z3 = (j0(this.f57042n) && i0(item)) || (i0(this.f57042n) && j0(item));
        if (isAttachedToWindow() && isLaidOut() && (displayedItemModel = this.f57042n) != null && displayedItemModel.d != item.d && !z3) {
            TransitionManager.endTransitions(this);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            transitionSet.setDuration(200L);
            transitionSet.addTransition(new ChangeBounds());
            transitionSet.addTransition(new hs0.d(0.8f, 0.8f));
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        if (j0(this.f57042n) && i0(item)) {
            g0(true);
        } else if (i0(this.f57042n) && j0(item)) {
            g0(false);
        }
        boolean z4 = (i0(this.f57042n) && j0(item)) ? false : true;
        RippleDrawable rippleDrawable = null;
        if (z4) {
            DisplayedItemModel displayedItemModel2 = this.f57042n;
            if (!Intrinsics.f(displayedItemModel2 != null ? displayedItemModel2.f57045c : null, item.f57045c)) {
                yy0.f.e(u.k(this).Q(), item.f57045c, this.f57038h, null, null, 12);
            }
        }
        DisplayedItemModel displayedItemModel3 = this.f57042n;
        TextLocalisedClause textLocalisedClause = displayedItemModel3 != null ? displayedItemModel3.f57044b : null;
        TextLocalisedClause textLocalisedClause2 = item.f57044b;
        TextLocalisedClause textLocalisedClause3 = item.f57044b;
        k kVar2 = item.f57046g;
        if (Intrinsics.f(textLocalisedClause, textLocalisedClause2)) {
            kVar = kVar2;
        } else {
            if (z4) {
                ty0.c.b(u.k(this).b0(), textLocalisedClause3, this.i, null, null, 12);
            }
            ty0.c cVarB0 = u.k(this).b0();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kVar = kVar2;
            setContentDescription(ty0.c.a(cVarB0, textLocalisedClause3, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        }
        this.k.setVisibility(item.f ? 0 : 8);
        int[] iArr = m.f57087a;
        int i21 = iArr[kVar.ordinal()];
        if (i21 == 1 || i21 == 2) {
            if (this.f57040l == null) {
                int i22 = iArr[kVar.ordinal()];
                if (i22 == 1) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iK = kli.a.k(context2, 24.0f);
                    iH0 = h0(false);
                    i = 0;
                } else {
                    if (i22 != 2 && i22 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    iK = kli.a.k(context3, 16.0f);
                    iH0 = h0(true);
                    i = -1;
                }
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                appCompatImageView.setId(R$id.uikit_floatingBottomBarItemExpandIcon);
                appCompatImageView.setImageResource(R$drawable.uikit_icn_24_vertical_expand);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(iH0));
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iK, iK);
                layoutParams.topToTop = 0;
                layoutParams.bottomToBottom = 0;
                layoutParams.startToStart = i;
                layoutParams.endToEnd = 0;
                addView(appCompatImageView, layoutParams);
                this.f57040l = appCompatImageView;
            }
        } else if (i21 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AppCompatImageView appCompatImageView2 = this.f57040l;
        if (appCompatImageView2 != null) {
            int i32 = iArr[kVar.ordinal()];
            if (i32 == 1 || i32 == 2) {
                i5 = 0;
            } else {
                if (i32 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 8;
            }
            appCompatImageView2.setVisibility(i5);
        }
        int i33 = iArr[kVar.ordinal()];
        if (i33 == 1) {
            i2 = 8;
        } else {
            if (i33 != 2 && i33 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
        }
        ImageView imageView = this.f57038h;
        imageView.setVisibility(i2);
        int i43 = iArr[kVar.ordinal()];
        if (i43 == 1) {
            z = false;
        } else {
            if (i43 != 2 && i43 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = item.d;
        }
        int i59 = z ? 0 : 8;
        AppCompatTextView appCompatTextView = this.i;
        appCompatTextView.setVisibility(i59);
        y yVar = item.e;
        DisplayedItemModel displayedItemModel4 = this.f57042n;
        if ((displayedItemModel4 != null ? displayedItemModel4.e : null) != yVar) {
            int[] iArr2 = m.f57088b;
            int i66 = iArr2[yVar.ordinal()];
            if (i66 == 1) {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                UIKitRippleDrawable uIKitRippleDrawableE = dr0.l.e(context4, new Color.Solid(R$attr.uikit_colorSelectableItemBackground), null, null, 28);
                uIKitRippleDrawableE.setRadius(getWidth() / 2);
                this.f57041m = uIKitRippleDrawableE;
                rippleDrawable = uIKitRippleDrawableE;
            } else {
                if (i66 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f57041m = null;
                if (!((Boolean) jo0.g.u.getValue()).booleanValue()) {
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    int iK5 = kli.a.k(context5, 4.0f);
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R.attr.colorControlHighlight, context6));
                    GradientDrawable gradientDrawableK = v7.k(0);
                    Context context7 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                    gradientDrawableK.setCornerRadius(kli.a.l(context7, 300.0f));
                    Context context8 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                    gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorForeground, context8));
                    Unit unit = Unit.f186387a;
                    rippleDrawable = new RippleDrawable(colorStateListValueOf, null, new InsetDrawable((Drawable) gradientDrawableK, 0, iK5, 0, iK5));
                }
            }
            this.f57039j.setBackground(rippleDrawable);
            int i74 = iArr2[yVar.ordinal()];
            if (i74 == 1) {
                Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                iK2 = kli.a.k(context9, 8.0f);
                Context context10 = getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                iK3 = kli.a.k(context10, 8.0f);
                Context context11 = getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                iK4 = kli.a.k(context11, 8.0f);
                i3 = this.f57037g;
            } else {
                if (i74 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context12 = getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                iK2 = kli.a.k(context12, 10.0f);
                Context context13 = getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                int iK6 = kli.a.k(context13, 10.0f);
                Context context14 = getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                int iK7 = kli.a.k(context14, 6.0f);
                Context context15 = getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                iK4 = kli.a.k(context15, 11.0f);
                i3 = 0;
                i6 = iK7;
                iK3 = iK6;
            }
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = iK2;
            layoutParams3.goneBottomMargin = iK3;
            imageView.setLayoutParams(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = appCompatTextView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams.leftMargin = i6;
            marginLayoutParams.rightMargin = i6;
            marginLayoutParams.bottomMargin = iK4;
            appCompatTextView.setLayoutParams(marginLayoutParams);
            setPaddingRelative(i3, getPaddingTop(), i3, getPaddingBottom());
        }
        setTag(item.f57043a);
        this.f57042n = item;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingBottomTabView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingBottomTabView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 56.0f);
        this.f57036b = iK;
        int iK2 = kli.a.k(context, 64.0f);
        this.f = iK2;
        this.f57037g = kli.a.k(context, 2.0f);
        View.inflate(context, R$layout.internal_view_floating_bottom_tab_with_badge, this);
        View viewFindViewById = findViewById(R$id.floatingBottomTab_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f57038h = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.floatingBottomTab_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById2;
        this.i = appCompatTextView;
        View viewFindViewById3 = findViewById(R$id.bottomBar_rippleBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f57039j = viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.floatingBottomTab_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.k = (ImageView) viewFindViewById4;
        setMinWidth(iK);
        appCompatTextView.setMinWidth(iK2);
    }

    public /* synthetic */ FloatingBottomTabView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
