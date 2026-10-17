package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import au0.n4;
import au0.p2;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.LockedStateDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.models.FilterClause;
import com.revolut.core.ui_kit.views.FilterListIdTagValue;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.p;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.a4;
import ms0.s0;
import mx0.a6;
import mx0.b6;
import mx0.c6;
import mx0.y5;
import mx0.z5;
import or0.u;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001=B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0016J\u0019\u0010\"\u001a\u00020\u00142\b\b\u0001\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+R\"\u00101\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0016R$\u00109\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010/¨\u0006>"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/FilterButton;", "Lcom/revolut/core/ui_kit/views/ProgressSwitcher;", "Lur0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lyt0/k;", "Lsy0/a;", "Lrr0/d;", "Lg01/a;", "Lix0/w0;", "Lms0/a4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Lmx0/c6;", "item", "setModel", "(Lmx0/c6;)V", "", "tag", "setLoadingButtonTag", "(Ljava/lang/String;)V", "show", "setVisibilityOnScroll", "padding", "setContentPadding", "(I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setEndIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setBackgroundInternal", "(Landroid/graphics/drawable/Drawable;)V", "v", "Z", "g", "()Z", "setVisibilityAnimationsOnScrollEnabled", "isVisibilityAnimationsOnScrollEnabled", "Landroid/os/Parcelable;", "w", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "getInsetsAdjustable", "insetsAdjustable", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FilterButton extends ProgressSwitcher implements ur0.a, TrackableItem, yt0.k, sy0.a, rr0.d, g01.a, w0, a4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f56176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f56177h;
    public s0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f56178j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewGroup f56179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f56180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CustomContentDescriptionClause f56181n;
    public Image o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Image f56182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v1 f56183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f56184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DecelerateInterpolator f56185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f56186t;
    public final rr0.g u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isVisibilityAnimationsOnScrollEnabled;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.FilterButton$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setBackgroundInternal(Drawable drawable) {
        if (drawable == null) {
            setBackground(drawable);
        } else {
            setBackground(drawable);
        }
    }

    private final void setContentPadding(int padding) {
        this.f56179l.setPadding(padding, 0, padding, 0);
    }

    private final void setEndIcon(Image image) {
        ImageView imageView = this.f56180m;
        if (image == null) {
            imageView.setVisibility(8);
            yy0.f.e(u.k(this).Q(), null, this.f56180m, null, null, 12);
            this.o = null;
        } else {
            imageView.setVisibility(0);
            yy0.f.e(u.k(this).Q(), image, this.f56180m, null, null, 12);
            this.o = image;
        }
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.u.V();
    }

    @Override // ms0.a4
    public final void a(int i, int i2, Path outPath) {
        Intrinsics.checkNotNullParameter(outPath, "outPath");
    }

    public final void d() {
        float fD;
        s0 s0Var = this.i;
        if (s0Var == null) {
            return;
        }
        if (isEnabled()) {
            fD = 1.0f;
        } else {
            LargeActionButton.ButtonStyle buttonStyleA = s0Var.a();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fD = buttonStyleA.d(context);
        }
        this.f56178j.setAlpha(fD);
        this.k.setAlpha(fD);
        this.f56180m.setAlpha(fD);
    }

    @Override // g01.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsVisibilityAnimationsOnScrollEnabled() {
        return this.isVisibilityAnimationsOnScrollEnabled;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF53923g() {
        return this.analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ix0.w0, ix0.v0
    public boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable() || ((Boolean) jo0.g.f176836t.getValue()).booleanValue();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f56176g.b(insets, getFitsSystemWindows()));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f56183q = colorScheme;
        this.f56184r = i;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled == isEnabled()) {
            return;
        }
        super.setEnabled(enabled);
        d();
    }

    public final void setLoadingButtonTag(String tag2) {
        setTag(tag2);
    }

    public final void setModel(@NotNull c6 item) {
        int i;
        Image imageA;
        Image image;
        CustomContentDescriptionClause customContentDescriptionClause;
        int i2;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z = item instanceof b6;
        FilterClause.Filter.WithoutEmoji withoutEmoji = FilterClause.Filter.WithoutEmoji.f57778a;
        float f = 16.0f;
        if (z) {
            y5 y5Var = c6.Companion;
            b6 b6Var = (b6) item;
            Clause label = b6Var.f;
            y5Var.getClass();
            Intrinsics.checkNotNullParameter(label, "label");
            CustomContentDescriptionClause customContentDescriptionClause2 = new CustomContentDescriptionClause(label, new FilterClause(label, zhm.u.c(withoutEmoji)));
            imageA = b6Var.e;
            image = b6Var.f209602g;
            customContentDescriptionClause = customContentDescriptionClause2;
            i2 = imageA == null ? 8 : 0;
            i = 0;
        } else {
            i = 4;
            if (item instanceof a6) {
                y5 y5Var2 = c6.Companion;
                Clause label2 = ((a6) item).e;
                y5Var2.getClass();
                Intrinsics.checkNotNullParameter(label2, "label");
                customContentDescriptionClause = new CustomContentDescriptionClause(label2, new FilterClause(label2, zhm.u.c(withoutEmoji)));
                i2 = 8;
                imageA = null;
                image = null;
            } else {
                if (!(item instanceof z5)) {
                    throw new NoWhenBranchMatchedException();
                }
                ColorImage.INSTANCE.getClass();
                imageA = ColorImage.Companion.a();
                f = 12.0f;
                image = null;
                customContentDescriptionClause = null;
                i2 = 4;
                i = 8;
            }
        }
        this.f56181n = customContentDescriptionClause;
        TextView textView = this.f56178j;
        textView.setVisibility(i);
        ty0.c.b(u.k(this).b0(), customContentDescriptionClause, this.f56178j, null, null, 12);
        ImageView imageView = this.k;
        if (imageA == null) {
            imageView.setVisibility(8);
            this.f56182p = null;
        } else {
            imageView.setVisibility(i2);
            Image image2 = imageA;
            yy0.f.e(u.k(this).Q(), image2, this.k, null, null, 12);
            this.f56182p = image2;
        }
        setEndIcon(image);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setContentPadding(kli.a.k(context, f));
        s0 style = item.f() ? s0.ACCENT : s0.REGULAR;
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.i != style) {
            this.i = style;
            if (style != null) {
                LargeActionButton.ButtonStyle buttonStyleA = style.a();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int i3 = this.f56184r;
                v1 v1Var = this.f56183q;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                qs0.a aVarA = qs0.c.a(buttonStyleA, context2, i3, v1Var, kli.a.v(R$attr.uikit_small_action_corner_radius, context3));
                this.f56179l.setVisibility(0);
                hp0.a aVar = aVarA.f248739a;
                Drawable drawableB = aVar != null ? aVar.b() : null;
                if (!isEnabled() && (drawableB instanceof StateListDrawable)) {
                    drawableB = new LockedStateDrawable((StateListDrawable) drawableB, new int[]{-16842910});
                }
                setBackgroundInternal(drawableB);
                int i5 = aVarA.f248740b;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(i5, mode);
                this.f56180m.setColorFilter(i5, mode);
                setProgressTintColor(i5);
                textView.setTextColor(i5);
            }
            d();
        }
        setEnabled(item.e());
        int i6 = R$id.filters_view_list_id_tag;
        String listId = item.getF53916a();
        Intrinsics.checkNotNullParameter(listId, "listId");
        setTag(i6, new FilterListIdTagValue(listId));
    }

    public void setVisibilityAnimationsOnScrollEnabled(boolean z) {
        this.isVisibilityAnimationsOnScrollEnabled = z;
    }

    @Override // g01.a
    public void setVisibilityOnScroll(boolean show) {
        float f;
        if (show == this.f56186t) {
            return;
        }
        animate().cancel();
        this.f56186t = show;
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
        animate().translationY(f).setInterpolator(this.f56185s).setDuration(300L).withEndAction(new n4(show, this, 3)).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56176g = new c2(this);
        this.f56177h = v0.a.d("create(...)");
        fp0.m mVar = p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        p pVarA = fp0.m.a(this, gVar);
        this.f56183q = v1.DARK;
        this.f56185s = new DecelerateInterpolator();
        this.f56186t = true;
        this.u = s.b(this, true);
        this.isVisibilityAnimationsOnScrollEnabled = true;
        View.inflate(context, R$layout.internal_view_filter_button, this);
        View viewFindViewById = findViewById(R$id.filterButton_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f56179l = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.filterButton_actionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f56178j = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.filterButton_actionIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.k = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.filterButton_endIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f56180m = (ImageView) viewFindViewById4;
        setProgressSize(kli.a.k(context, 16.0f));
        setClipToPadding(false);
        setFocusable(true);
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 3));
    }

    public /* synthetic */ FilterButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
