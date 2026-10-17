package com.revolut.core.ui_kit.views.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import au0.p2;
import aw0.v1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import fp0.m;
import fp0.p;
import ihm.f;
import ix0.c2;
import ix0.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import qs0.c;
import rr0.d;
import rr0.g;
import vc.s;
import yt0.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002%&B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/FormsActionButton;", "Lcom/revolut/core/ui_kit/internal/views/box/ShadowLayout;", "Lyt0/k;", "Lsy0/a;", "Lrr0/d;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setImageInternal", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "priority", "setLoadingButtonPriority$ui_kit_components_release", "(I)V", "setLoadingButtonPriority", "", "tag", "setLoadingButtonTag", "(Ljava/lang/String;)V", "setImage", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "enabled", "setEnabled", "(Z)V", "Companion", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormsActionButton extends ShadowLayout implements k, sy0.a, d, w0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f58981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f58982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Image f58983n;
    public Clause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f58984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f58985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final UIKitTextView f58986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f58987s;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.buttons.FormsActionButton$a$a, reason: collision with other inner class name */
        public static final class C0442a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0442a f58988a = new C0442a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final LargeActionButton.ButtonStyle.DefaultFilledButton f58989b = LargeActionButton.ButtonStyle.f58725a;

            private C0442a() {
            }

            @Override // com.revolut.core.ui_kit.views.buttons.FormsActionButton.a
            public final LargeActionButton.ButtonStyle a() {
                return f58989b;
            }
        }

        /* JADX INFO: loaded from: classes20.dex */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f58990a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain f58991b = LargeActionButton.ButtonStyle.f;

            private b() {
            }

            @Override // com.revolut.core.ui_kit.views.buttons.FormsActionButton.a
            public final LargeActionButton.ButtonStyle a() {
                return f58991b;
            }
        }

        private a() {
        }

        public abstract LargeActionButton.ButtonStyle a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormsActionButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setImageInternal(Image image) {
        if (image == null) {
            yy0.f.e(u.k(this).Q(), null, this.f58985q, null, null, 12);
        } else {
            yy0.f.e(u.k(this).Q(), image, this.f58985q, null, null, 12);
        }
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.f58984p.V();
    }

    public final void d() {
        a aVar;
        LargeActionButton.ButtonStyle buttonStyleA;
        float fD = 1.0f;
        if (!isEnabled() && (aVar = this.f58982m) != null && (buttonStyleA = aVar.a()) != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fD = buttonStyleA.d(context);
        }
        this.f58985q.setAlpha(fD);
        this.f58986r.setAlpha(fD);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            com.revolut.core.ui_kit.views.buttons.FormsActionButton$a r0 = r3.f58982m
            if (r0 == 0) goto L29
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle r0 = r0.a()
            if (r0 == 0) goto L29
            android.content.Context r1 = r3.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.revolut.core.ui.models.Color r0 = r0.e(r1)
            if (r0 == 0) goto L29
            android.content.Context r1 = r3.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            int r0 = io0.a.c(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L31
            int r1 = r0.intValue()
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 == 0) goto L3c
            com.revolut.core.ui.models.Color$SolidInt r2 = new com.revolut.core.ui.models.Color$SolidInt
            r2.<init>(r1)
            r3.setShadowColor(r2)
        L3c:
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L4f
            if (r0 != 0) goto L45
            goto L4c
        L45:
            int r0 = r0.intValue()
            if (r0 != 0) goto L4c
            goto L4f
        L4c:
            r0 = 1082130432(0x40800000, float:4.0)
            goto L50
        L4f:
            r0 = 0
        L50:
            r3.setShadowElevation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.buttons.FormsActionButton.e():void");
    }

    public final void f(a style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.f(this.f58982m, style)) {
            return;
        }
        this.f58982m = style;
        LargeActionButton.ButtonStyle buttonStyleA = style.a();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hp0.a aVarA = c.a(buttonStyleA, context, 0, v1.DARK, getCornersRadius()).a();
        setBackground(aVarA != null ? aVarA.b() : null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(buttonStyleA.getV(), context2);
        this.f58985q.setImageTintList(ColorStateList.valueOf(iS));
        this.f58986r.setTextColor(iS);
        setProgressTintColor(iS);
        d();
        e();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    public final void i(boolean z) {
        Clause textLocalisedClause;
        LargeActionButton.ButtonStyle buttonStyleA;
        a aVar = this.f58982m;
        int v = (aVar == null || (buttonStyleA = aVar.a()) == null) ? R$attr.uikit_colorForeground : buttonStyleA.getV();
        Image image = this.f58983n;
        if (image == null || (textLocalisedClause = image.getF59810c()) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.common_accessibility_label_image_attachment_down, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        yy0.f.e(u.k(this).Q(), z ? new AnimatedResourceImage(R$drawable.uikit_icn_24_arrow_bounce_anim, 4, clause, Integer.valueOf(v)) : new ResourceImage(R$drawable.uikit_icn_24_arrow_bounce_anim, (Integer) null, (Integer) null, Integer.valueOf(v), (List) null, (ImageTransformations) null, clause, 86), this.f58985q, null, null, 12);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58981l.a(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 52.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iK, 1073741824);
        if (this.o == null) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iK, 1073741824), iMakeMeasureSpec);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        d();
        e();
    }

    public final void setImage(Image image) {
        if (Intrinsics.f(this.f58983n, image)) {
            return;
        }
        this.f58983n = image;
        setImageInternal(image);
    }

    public final void setLabel(Clause clause) {
        if (Intrinsics.f(this.o, clause)) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setMinimumWidth(kli.a.k(context, 52.0f));
        this.o = clause;
        ty0.c.b(u.k(this).b0(), clause, this.f58986r, null, null, 12);
        this.f58986r.setVisibility(clause != null ? 0 : 8);
        requestLayout();
    }

    public final void setLoadingButtonPriority$ui_kit_components_release(int priority) {
        this.f58984p.f256622n = priority;
    }

    public final void setLoadingButtonTag(@NotNull String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        setTag(tag2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormsActionButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormsActionButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        a aVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58981l = new c2(this);
        this.f58984p = s.b(this, true);
        m mVar = p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        p pVarA = m.a(this, gVar);
        this.f58987s = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_forms_action_button_layout, this);
        setProgressSize(kli.a.k(context, 24.0f));
        setProgressTintAttr(R$attr.uikit_colorWhite);
        View viewFindViewById = findViewById(R$id.formsActionButton_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f58985q = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.formsActionButton_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f58986r = (UIKitTextView) viewFindViewById2;
        setCornersRadius(26.0f);
        setClickable(true);
        setFocusable(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FormsActionButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.FormsActionButton_uikit_FormsActionButton, -1);
        if (i2 != 0) {
            aVar = i2 != 1 ? null : a.b.f58990a;
        } else {
            aVar = a.C0442a.f58988a;
        }
        if (aVar != null) {
            f(aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 8));
    }

    public /* synthetic */ FormsActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
