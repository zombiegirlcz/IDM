package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.CardPersonalisationToolbarDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.a2;
import com.revolut.core.ui_kit.delegates.v3;
import com.revolut.core.ui_kit.delegates.y3;
import com.revolut.core.ui_kit.internal.views.ThicknessSliderView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.core.ui_kit_resources.R$font;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.a3;
import mx0.m5;
import mx0.s2;
import mx0.t2;
import mx0.v2;
import mx0.w2;
import mx0.x2;
import mx0.y2;
import mx0.z2;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 o2\u00020\u0001:\u0005pq/rsB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b&\u0010'J%\u0010,\u001a\u00020\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020.¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\b\b\u0001\u00106\u001a\u00020\u0006¢\u0006\u0004\b7\u0010#J\u001d\u00108\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020.H\u0002¢\u0006\u0004\b8\u00105J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010:J\u001b\u0010=\u001a\u00020\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b?\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\bM\u0010NR\u001b\u0010U\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010R\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010R\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010R\u001a\u0004\bl\u0010m¨\u0006t"}, d2 = {"Lcom/revolut/core/ui_kit/views/CardPersonalisationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "label", "", "setMovingHintLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setPinToAdjustHintLabel", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setCardImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "enabled", "setActionToolsEnabled", "(Z)V", "setFontsToolsEnabled", "Lcom/revolut/core/ui_kit/views/CardPersonalisationView$b;", "configuration", "setToolsConfiguration", "(Lcom/revolut/core/ui_kit/views/CardPersonalisationView$b;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;", "lottieImage", "setCustomisationLottieAnimation", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;)V", "color", "setDrawingColor", "(I)V", "Lefm/d0;", "Landroid/graphics/Bitmap;", "getDrawingAreaBitmap", "()Lefm/d0;", "Lkoi/j;", "icons", "Lcom/revolut/core/ui_kit/delegates/TextDelegate$Model;", "hint", "setItems", "(Lkoi/j;Lcom/revolut/core/ui_kit/delegates/TextDelegate$Model;)V", "", "Lmx0/v2;", "getSupportedFonts", "()Ljava/util/List;", "Landroid/graphics/PointF;", "points", "setDrawingShapePoints", "(Ljava/util/List;)V", "strokeColor", "setStrokeColor", "setDrawingShapePointsAndCalculateAnimation", "getUndoIcon", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "selectedId", "setTools", "(Ljava/lang/String;)V", "setFontIcons", "Lcom/revolut/core/ui_kit/delegates/CardPersonalisationToolbarDelegate;", "w", "Lkotlin/Lazy;", "getCardPersonalisationToolbarDelegate", "()Lcom/revolut/core/ui_kit/delegates/CardPersonalisationToolbarDelegate;", "cardPersonalisationToolbarDelegate", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate;", "x", "getCircleActionButtonsBarDelegate", "()Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate;", "circleActionButtonsBarDelegate", "Lcom/revolut/core/ui_kit/delegates/TextDelegate;", "y", "getHintDelegate", "()Lcom/revolut/core/ui_kit/delegates/TextDelegate;", "hintDelegate", "Landroid/widget/FrameLayout;", "E", "Le8/q;", "getImageContainer", "()Landroid/widget/FrameLayout;", "imageContainer", "Lcom/revolut/core/ui_kit/internal/views/ThicknessSliderView;", "F", "getThicknessSlider", "()Lcom/revolut/core/ui_kit/internal/views/ThicknessSliderView;", "thicknessSlider", "Lcom/revolut/core/ui_kit/views/CardPersonalisationDrawingView;", "G", "getDrawingView", "()Lcom/revolut/core/ui_kit/views/CardPersonalisationDrawingView;", "drawingView", "Landroid/widget/ImageView;", "H", "getCardImage", "()Landroid/widget/ImageView;", "cardImage", "Landroidx/recyclerview/widget/RecyclerView;", "I", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/airbnb/lottie/LottieAnimationView;", "J", "getCustomisationAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "customisationAnimationView", "Companion", "b", "mx0/x2", "mx0/w2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public boolean A;
    public boolean B;
    public boolean C;
    public String D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final e8.q imageContainer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final e8.q thicknessSlider;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final e8.q drawingView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final e8.q cardImage;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final e8.q recyclerView;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final e8.q customisationAnimationView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f58383b;
    public w2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w2 f58384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LottieImage f58385h;
    public b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Clause f58386j;
    public Clause k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ifm.b f58387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f58388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f58389n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f58390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f58391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f58392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f58393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f58394t;
    public final ihm.f u;
    public final ihm.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f58395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f58396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f58397y;
    public final z4l.j z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.CardPersonalisationView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f58398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f58399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f58400c;
        public final boolean d;
        public final boolean e;
        public final x2 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f58401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f58402h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f58403j;

        public b() {
            this(false, null, 1023);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f58398a == bVar.f58398a && this.f58399b == bVar.f58399b && this.f58400c == bVar.f58400c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.f58401g == bVar.f58401g && this.f58402h == bVar.f58402h && this.i == bVar.i && this.f58403j == bVar.f58403j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f58403j) + j6.a.b(this.i, j6.a.b(this.f58402h, j6.a.b(this.f58401g, (this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f58398a) * 31, 31, this.f58399b), 31, this.f58400c), 31, this.d), 31, this.e)) * 31, 31), 31), 31);
        }

        public b(boolean z, x2 iconsOrder, int i) {
            z = (i & 1) != 0 ? false : z;
            boolean z3 = (i & 2) != 0;
            boolean z4 = (i & 4) != 0;
            boolean z6 = (i & 16) != 0;
            iconsOrder = (i & 32) != 0 ? x2.DEFAULT : iconsOrder;
            int i2 = R$attr.uikit_colorDeepGrey_10;
            int i3 = R$attr.uikit_colorDeepGrey;
            int i5 = R$attr.uikit_colorBackground;
            Intrinsics.checkNotNullParameter(iconsOrder, "iconsOrder");
            this.f58398a = z;
            this.f58399b = z3;
            this.f58400c = z4;
            this.d = true;
            this.e = z6;
            this.f = iconsOrder;
            this.f58401g = i2;
            this.f58402h = i3;
            this.i = i3;
            this.f58403j = i5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPersonalisationView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(CardPersonalisationView cardPersonalisationView, List list) {
        cardPersonalisationView.setDrawingShapePointsAndCalculateAnimation(list);
    }

    public static void g0(CardPersonalisationView cardPersonalisationView) {
        w2 w2Var = cardPersonalisationView.f;
        if (w2Var != null) {
            cardPersonalisationView.getImageContainer().startAnimation(w2Var);
        }
    }

    private final ImageView getCardImage() {
        return (ImageView) this.cardImage.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CardPersonalisationToolbarDelegate getCardPersonalisationToolbarDelegate() {
        return (CardPersonalisationToolbarDelegate) this.f58395w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final CircleActionButtonsBarDelegate getCircleActionButtonsBarDelegate() {
        return (CircleActionButtonsBarDelegate) this.f58396x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView getCustomisationAnimationView() {
        return (LottieAnimationView) this.customisationAnimationView.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardPersonalisationDrawingView getDrawingView() {
        return (CardPersonalisationDrawingView) this.drawingView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextDelegate getHintDelegate() {
        return (TextDelegate) this.f58397y.getValue();
    }

    private final FrameLayout getImageContainer() {
        return (FrameLayout) this.imageContainer.f();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.f();
    }

    private final ThicknessSliderView getThicknessSlider() {
        return (ThicknessSliderView) this.thicknessSlider.f();
    }

    private final Image getUndoIcon() {
        return new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, Integer.valueOf(this.i.i), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.canvas_tool_draw_undo_accessibility_label, null, null, 14), LDSFile.EF_DG4_TAG);
    }

    public static Unit h0(CardPersonalisationView cardPersonalisationView, Boolean bool) {
        if (bool.booleanValue()) {
            if (cardPersonalisationView.getDrawingView().getDrawingEnabled()) {
                cardPersonalisationView.getDrawingView().setShowThicknessDot(true);
            }
        } else if (cardPersonalisationView.getDrawingView().getDrawingEnabled()) {
            cardPersonalisationView.getDrawingView().setShowThicknessDot(false);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit i0(CardPersonalisationView cardPersonalisationView, Boolean bool) {
        cardPersonalisationView.f58391q.onNext(bool);
        yj0 yj0Var = null;
        Object[] objArr = 0;
        if (bool.booleanValue()) {
            Clause clause = cardPersonalisationView.f58386j;
            if (clause != null) {
                setItems$default(cardPersonalisationView, null, new TextDelegate.Model("MOVING_HINT_LIST_ID", clause, false, new ak0(yj0Var, objArr == true ? 1 : 0, 3), null, null, R$attr.uikit_dp32, 0, 0, 0, 1908), 1, null);
            }
        } else {
            cardPersonalisationView.setTools(null);
        }
        return Unit.f186387a;
    }

    public static Unit j0(CardPersonalisationView cardPersonalisationView, Float f) {
        if (cardPersonalisationView.getDrawingView().getDrawingEnabled()) {
            CardPersonalisationDrawingView drawingView = cardPersonalisationView.getDrawingView();
            Intrinsics.h(f);
            drawingView.setLineSize(f.floatValue());
        }
        return Unit.f186387a;
    }

    public static Unit l0(CardPersonalisationView cardPersonalisationView) {
        cardPersonalisationView.getDrawingView().e();
        return Unit.f186387a;
    }

    public static Unit m0(CardPersonalisationView cardPersonalisationView, Integer num) {
        cardPersonalisationView.u.onNext(num);
        if (num.intValue() == 0 && cardPersonalisationView.A) {
            cardPersonalisationView.A = false;
            cardPersonalisationView.setTools(cardPersonalisationView.D);
        } else if (num.intValue() > 0 && !cardPersonalisationView.A) {
            cardPersonalisationView.A = true;
            cardPersonalisationView.setTools(cardPersonalisationView.D);
        }
        return Unit.f186387a;
    }

    public static Unit n0(CardPersonalisationView cardPersonalisationView) {
        cardPersonalisationView.getDrawingView().e();
        return Unit.f186387a;
    }

    public static void o0(CardPersonalisationView cardPersonalisationView) {
        if (cardPersonalisationView.getDrawingView().getDrawingEnabled()) {
            cardPersonalisationView.K0();
        }
        w2 w2Var = cardPersonalisationView.f58384g;
        if (w2Var != null) {
            cardPersonalisationView.getImageContainer().startAnimation(w2Var);
        }
    }

    private final void setDrawingShapePointsAndCalculateAnimation(List<? extends PointF> points) {
        float f;
        float f4 = getContext().getResources().getDisplayMetrics().heightPixels * 0.35f;
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        RectF rectF = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float measuredWidth = getImageContainer().getMeasuredWidth() / 2025.0f;
        float measuredHeight = getImageContainer().getMeasuredHeight() / 1275.0f;
        for (PointF pointF : points) {
            float f5 = pointF.x * measuredWidth;
            pointF.x = f5;
            pointF.y *= measuredHeight;
            rectF.left = Math.min(rectF.left, f5);
            rectF.right = Math.max(rectF.right, pointF.x);
            rectF.top = Math.min(rectF.top, pointF.y);
            rectF.bottom = Math.max(rectF.bottom, pointF.y);
        }
        float left = getImageContainer().getLeft();
        float top = getImageContainer().getTop();
        rectF.offset(left, top);
        float measuredWidth2 = (getMeasuredWidth() * (getImageContainer().getMeasuredWidth() / rectF.width())) - this.f58383b;
        float measuredWidth3 = (measuredWidth2 / getImageContainer().getMeasuredWidth()) * getImageContainer().getMeasuredHeight();
        if (measuredWidth3 > f4) {
            measuredWidth2 *= f4 / measuredWidth3;
            f = f4;
        } else {
            f = measuredWidth3;
        }
        float f6 = measuredWidth2;
        float measuredWidth4 = getImageContainer().getMeasuredWidth();
        float measuredHeight2 = getImageContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getImageContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 10.0f);
        float measuredWidth5 = f6 > ((float) i) ? ((getImageContainer().getMeasuredWidth() / 2.0f) + getImageContainer().getLeft()) - rectF.centerX() : 0.0f;
        float f32 = f6 / measuredWidth4;
        float f35 = f / measuredHeight2;
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF.width() * f32, rectF.height() * f35);
        float f36 = (rectF.left - left) * f32;
        float f37 = (rectF.top - top) * f35;
        ViewGroup.LayoutParams layoutParams2 = getCustomisationAnimationView().getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.width = (int) rectF2.width();
        layoutParams3.height = (int) rectF2.height();
        or0.u.z(getCustomisationAnimationView(), (int) f36, (int) f37, 0, 0, false, 28);
        FrameLayout imageContainer = getImageContainer();
        float measuredWidth6 = imageContainer.getMeasuredWidth();
        float measuredHeight3 = imageContainer.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams4 = imageContainer.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        float f41 = f;
        this.f = new w2(imageContainer, f6, f41, measuredWidth6, measuredHeight3, measuredWidth5, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0, iK, false);
        this.f58384g = new w2(getImageContainer(), measuredWidth4, measuredHeight2, f6, f41, measuredWidth5, i2, iK, true);
        w2 w2Var = this.f;
        if (w2Var != null) {
            w2Var.setAnimationListener(new z2(this, 0));
        }
        w2 w2Var2 = this.f58384g;
        if (w2Var2 != null) {
            w2Var2.setAnimationListener(new a3(this));
        }
        getDrawingView().setDrawingShapePoints(points);
    }

    private final void setFontIcons(String selectedId) {
        setItems$default(this, new a2("TEXT_ICON_SELECTOR_LIST_ID", zhm.v.k(z0(R$drawable.uikit_icn_24_yellowtail, new TextLocalisedClause(R$string.canvas_tool_text_font_accessibility_label, null, null, 14), "YELLOW_TAIL_FONT_LIST_ID", selectedId), z0(R$drawable.uikit_icn_24_roboto_condensed, new TextLocalisedClause(R$string.canvas_tool_text_font_accessibility_label, null, null, 14), "ROBOTO_CONDENSED_FONT_LIST_ID", selectedId), z0(R$drawable.uikit_icn_24_cormorant_garamond, new TextLocalisedClause(R$string.canvas_tool_text_font_accessibility_label, null, null, 14), "CORMORANT_GARAMOND_FONT_LIST_ID", selectedId), z0(R$drawable.uikit_icn_24_parisienne, new TextLocalisedClause(R$string.canvas_tool_text_font_accessibility_label, null, null, 14), "PARISIENNE_FONT_LIST_ID", selectedId), z0(R$drawable.uikit_icn_24_roboto_regular, new TextLocalisedClause(R$string.canvas_tool_text_font_accessibility_label, null, null, 14), "ROBOTO_REGULAR_FONT_LIST_ID", selectedId)), null), null, 2, null);
    }

    public static /* synthetic */ void setItems$default(CardPersonalisationView cardPersonalisationView, koi.j jVar, TextDelegate.Model model, int i, Object obj2) {
        if ((i & 1) != 0) {
            jVar = null;
        }
        if ((i & 2) != 0) {
            model = null;
        }
        cardPersonalisationView.setItems(jVar, model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final void setTools(String selectedId) {
        List listL;
        koi.j a2Var;
        Clause clause;
        List listL2;
        this.D = selectedId;
        TextDelegate.Model model = 0;
        model = 0;
        model = 0;
        if (this.B) {
            CircleActionButtonsBarDelegate.CircleActionButton circleActionButtonX0 = this.i.f58400c ? x0(R$drawable.uikit_icn_24_drawing, new TextLocalisedClause(R$string.canvas_tool_draw_accessibility_label, null, null, 14), "DRAWING_ICON_LIST_ID", selectedId) : null;
            CircleActionButtonsBarDelegate.CircleActionButton circleActionButtonX02 = this.i.d ? x0(R$drawable.uikit_icn_20_keyboard_sticker, new TextLocalisedClause(R$string.canvas_tool_emoji_title, null, null, 14), "EMOJI_ICON_LIST_ID", selectedId) : null;
            CircleActionButtonsBarDelegate.CircleActionButton circleActionButtonX03 = this.i.f58399b ? x0(R$drawable.uikit_icn_24_roboto_regular, new TextLocalisedClause(R$string.canvas_tool_text_accessibility_label, null, null, 14), "TEXT_ICON_LIST_ID", selectedId) : null;
            CircleActionButtonsBarDelegate.CircleActionButton circleActionButtonX04 = this.i.e ? x0(R$drawable.uikit_icn_24_image, new TextLocalisedClause(R$string.canvas_tool_upload_image_accessibility_label, null, null, 14), "IMAGE_ICON_LIST_ID", selectedId) : null;
            CircleActionButtonsBarDelegate.CircleActionButton circleActionButtonX05 = this.i.f58398a ? x0(R$drawable.uikit_icn_24_generate, new TextLocalisedClause(R$string.canvas_tool_generate_accessibility_label, null, null, 14), "GENERATE_ICON_LIST_ID", selectedId) : null;
            int i = y2.f210120a[this.i.f.ordinal()];
            if (i == 1) {
                CircleActionButtonsBarDelegate.CircleActionButton[] elements = {circleActionButtonX05, circleActionButtonX0, circleActionButtonX02, circleActionButtonX03, circleActionButtonX04};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL2 = kotlin.collections.d.L(elements);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                CircleActionButtonsBarDelegate.CircleActionButton[] elements2 = {circleActionButtonX03, circleActionButtonX04, circleActionButtonX0, circleActionButtonX02, circleActionButtonX05};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                listL2 = kotlin.collections.d.L(elements2);
            }
            List list = listL2;
            int i2 = R$attr.uikit_dp32;
            a2Var = new y3(list, "TOOLS_ICON_SELECTOR_LIST_ID", i2, i2, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2);
        } else {
            IconSelectorDelegate.SelectableIconModel selectableIconModelZ0 = this.i.f58400c ? z0(R$drawable.uikit_icn_24_drawing, new TextLocalisedClause(R$string.canvas_tool_draw_accessibility_label, null, null, 14), "DRAWING_ICON_LIST_ID", selectedId) : null;
            IconSelectorDelegate.SelectableIconModel selectableIconModelZ02 = this.i.d ? z0(R$drawable.uikit_icn_20_keyboard_sticker, new TextLocalisedClause(R$string.canvas_tool_emoji_title, null, null, 14), "EMOJI_ICON_LIST_ID", selectedId) : null;
            IconSelectorDelegate.SelectableIconModel selectableIconModelZ03 = this.i.f58399b ? z0(R$drawable.uikit_icn_24_roboto_regular, new TextLocalisedClause(R$string.canvas_tool_text_accessibility_label, null, null, 14), "TEXT_ICON_LIST_ID", selectedId) : null;
            IconSelectorDelegate.SelectableIconModel selectableIconModelZ04 = this.i.e ? z0(R$drawable.uikit_icn_24_image, new TextLocalisedClause(R$string.canvas_tool_upload_image_accessibility_label, null, null, 14), "IMAGE_ICON_LIST_ID", selectedId) : null;
            IconSelectorDelegate.SelectableIconModel selectableIconModelZ05 = this.i.f58398a ? z0(R$drawable.uikit_icn_24_generate, new TextLocalisedClause(R$string.canvas_tool_generate_accessibility_label, null, null, 14), "GENERATE_ICON_LIST_ID", selectedId) : null;
            int i3 = y2.f210120a[this.i.f.ordinal()];
            if (i3 == 1) {
                IconSelectorDelegate.SelectableIconModel[] elements3 = {selectableIconModelZ05, selectableIconModelZ0, selectableIconModelZ02, selectableIconModelZ03, selectableIconModelZ04};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                listL = kotlin.collections.d.L(elements3);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                IconSelectorDelegate.SelectableIconModel[] elements4 = {selectableIconModelZ03, selectableIconModelZ04, selectableIconModelZ0, selectableIconModelZ02};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                listL = kotlin.collections.d.L(elements4);
            }
            Image undoIcon = getUndoIcon();
            if (!this.A) {
                undoIcon = null;
            }
            a2Var = new a2("TOOLS_ICON_SELECTOR_LIST_ID", listL, undoIcon);
        }
        if (getDrawingView().getSpritesCount() > 0 && getDrawingView().getEditingEnabled() && (clause = this.k) != null) {
            model = new TextDelegate.Model("TEXT_HINT_LIST_ID", clause, false, new ak0(model, model, 3), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908);
        }
        setItems(a2Var, model);
    }

    public static CircleActionButtonsBarDelegate.CircleActionButton x0(int i, TextLocalisedClause textLocalisedClause, String str, String str2) {
        return new CircleActionButtonsBarDelegate.CircleActionButton(str, (Clause) textLocalisedClause, (Image) new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), str.equals(str2) ? CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.SemiAccentButton.f52096a : CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral.f52095a, (v3) null, (String) null, false, (Object) null, 496);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void A0(String str) {
        switch (str.hashCode()) {
            case -993936119:
                if (str.equals("ROBOTO_REGULAR_FONT_LIST_ID")) {
                    setFontIcons("ROBOTO_REGULAR_FONT_LIST_ID");
                    i.setFont$default(getDrawingView(), y0("ROBOTO_REGULAR_FONT_LIST_ID"), false, 2, null);
                }
                break;
            case -88110072:
                if (str.equals("CORMORANT_GARAMOND_FONT_LIST_ID")) {
                    setFontIcons("CORMORANT_GARAMOND_FONT_LIST_ID");
                    i.setFont$default(getDrawingView(), y0("CORMORANT_GARAMOND_FONT_LIST_ID"), false, 2, null);
                }
                break;
            case 156865824:
                if (str.equals("GENERATE_ICON_LIST_ID")) {
                    K0();
                    setTools("GENERATE_ICON_LIST_ID");
                }
                break;
            case 270860599:
                if (str.equals("DRAWING_ICON_LIST_ID")) {
                    if (!Intrinsics.f(this.D, "DRAWING_ICON_LIST_ID")) {
                        setTools("DRAWING_ICON_LIST_ID");
                        getDrawingView().setDrawingEnabled(true);
                        getThicknessSlider().setupRange(this.f58389n, this.f58388m, getDrawingView().getLineSize());
                        getThicknessSlider().setVisibility(0);
                    } else {
                        K0();
                        setTools(null);
                    }
                }
                break;
            case 768291550:
                if (str.equals("ROBOTO_CONDENSED_FONT_LIST_ID")) {
                    setFontIcons("ROBOTO_CONDENSED_FONT_LIST_ID");
                    getDrawingView().setFont(y0("ROBOTO_CONDENSED_FONT_LIST_ID"), true);
                }
                break;
            case 972208655:
                if (str.equals("EMOJI_ICON_LIST_ID")) {
                    K0();
                    setTools("EMOJI_ICON_LIST_ID");
                }
                break;
            case 1109043304:
                if (str.equals("TEXT_ICON_LIST_ID")) {
                    K0();
                    m5 font = y0("YELLOW_TAIL_FONT_LIST_ID");
                    if (!getDrawingView().getTextEditingEnabled()) {
                        CardPersonalisationDrawingView drawingView = getDrawingView();
                        if (!drawingView.o) {
                            fr0.n nVar = new fr0.n(drawingView.f59080s, drawingView.getCenterX(), drawingView.getCenterY(), drawingView.k, drawingView.f59081t);
                            Intrinsics.checkNotNullParameter(font, "font");
                            nVar.f137367s.setTypeface(font.f209834a);
                            nVar.f137371y = font;
                            nVar.o = false;
                            nVar.o();
                            drawingView.f59070c.add(nVar);
                            m70.a.c(t0.f186434a);
                            drawingView.d("");
                            AppCompatEditText appCompatEditText = drawingView.f59084y;
                            if (appCompatEditText != null) {
                                kli.c.d(appCompatEditText, 0L);
                            }
                        }
                    }
                }
                break;
            case 1243303341:
                if (str.equals("PARISIENNE_FONT_LIST_ID")) {
                    setFontIcons("PARISIENNE_FONT_LIST_ID");
                    i.setFont$default(getDrawingView(), y0("PARISIENNE_FONT_LIST_ID"), false, 2, null);
                }
                break;
            case 1828638960:
                if (str.equals("YELLOW_TAIL_FONT_LIST_ID")) {
                    setFontIcons("YELLOW_TAIL_FONT_LIST_ID");
                    i.setFont$default(getDrawingView(), y0("YELLOW_TAIL_FONT_LIST_ID"), false, 2, null);
                }
                break;
        }
        this.f58394t.onNext(str);
    }

    public final efm.r B0() {
        return getHintDelegate().d;
    }

    public final ihm.f C0() {
        return getDrawingView().C;
    }

    public final ihm.f D0() {
        return getDrawingView().B;
    }

    public final ihm.f E0() {
        return getDrawingView().f59069b;
    }

    public final void F0() {
        if (getDrawingView().getTextEditingEnabled()) {
            getDrawingView().b();
            setTools(null);
        }
    }

    public final void G0() {
        String str;
        fr0.i iVar;
        m5 font = getDrawingView().getFont();
        if (font == null || (str = font.f209835b) == null) {
            str = "YELLOW_TAIL_FONT_LIST_ID";
        }
        this.v.onNext(str);
        if (this.C) {
            setFontIcons(str);
        } else {
            setItems$default(this, null, null, 2, null);
        }
        CardPersonalisationDrawingView drawingView = getDrawingView();
        if (drawingView.o || (iVar = (fr0.i) d0.o0(drawingView.f59070c)) == null || !(iVar instanceof fr0.n)) {
            return;
        }
        fr0.n nVar = (fr0.n) iVar;
        nVar.z = true;
        drawingView.d(nVar.F);
        drawingView.invalidate();
    }

    public final void H0() {
        if (getDrawingView().getDrawingEnabled()) {
            K0();
            setTools(null);
        } else if (getDrawingView().getTextEditingEnabled()) {
            F0();
            this.f58392r.onNext(Unit.f186387a);
        }
    }

    public final void I0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        i.setFont$default(getDrawingView(), y0(listId), false, 2, null);
    }

    public final void K0() {
        getDrawingView().setDrawingEnabled(false);
        getThicknessSlider().setVisibility(8);
    }

    @NotNull
    public final efm.d0<Bitmap> getDrawingAreaBitmap() {
        CardPersonalisationDrawingView drawingView = getDrawingView();
        drawingView.getClass();
        ufm.c cVar = new ufm.c(new h4d.d(drawingView, 28), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    @NotNull
    public final List<v2> getSupportedFonts() {
        return zhm.v.k(new v2("YELLOW_TAIL_FONT_LIST_ID", R$string.font_name_yellowtail, R$drawable.uikit_icn_24_yellowtail, R$string.canvas_tool_text_font_accessibility_label), new v2("ROBOTO_CONDENSED_FONT_LIST_ID", R$string.font_name_roboto_condensed, R$drawable.uikit_icn_24_roboto_condensed, R$string.canvas_tool_text_font_accessibility_label), new v2("CORMORANT_GARAMOND_FONT_LIST_ID", R$string.font_name_cormorant_garamond, R$drawable.uikit_icn_24_cormorant_garamond, R$string.canvas_tool_text_font_accessibility_label), new v2("PARISIENNE_FONT_LIST_ID", R$string.font_name_parisienne, R$drawable.uikit_icn_24_parisienne, R$string.canvas_tool_text_font_accessibility_label), new v2("ROBOTO_REGULAR_FONT_LIST_ID", R$string.font_name_roboto, R$drawable.uikit_icn_24_roboto_regular, R$string.canvas_tool_text_font_accessibility_label));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ifm.c cVarSubscribe = getThicknessSlider().f56440p.subscribe(new s2(new t2(this, 4), 1));
        ifm.b bVar = this.f58387l;
        bVar.a(cVarSubscribe);
        bVar.a(getThicknessSlider().f56441q.subscribe(new s2(new t2(this, 0), 2)));
        bVar.a(getDrawingView().A.distinctUntilChanged().subscribe(new s2(new t2(this, 1), 3)));
        bVar.a(getDrawingView().f59068a.distinctUntilChanged().subscribe(new s2(new t2(this, 2), 4)));
        bVar.a(getCardPersonalisationToolbarDelegate().f51779c.d.subscribe(new s2(new t2(this, 3), 5)));
        bVar.a(getCircleActionButtonsBarDelegate().f52087c.f121375b.subscribe(new s2(new t2(this, 5), 6)));
        bVar.a(getCardPersonalisationToolbarDelegate().d.subscribe(new s2(new t2(this, 6), 7)));
        bVar.a(getCardPersonalisationToolbarDelegate().e.subscribe(new s2(new t2(this, 7), 0)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f58387l.d();
        super.onDetachedFromWindow();
    }

    public final void r0(int i) {
        CardPersonalisationDrawingView drawingView = getDrawingView();
        drawingView.setDrawingEnabled(false);
        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(drawingView.getResources(), i, drawingView.getContext().getTheme());
        if (vectorDrawableCompatCreate != null) {
            vectorDrawableCompatCreate.setColorFilter(new PorterDuffColorFilter(drawingView.f59081t, PorterDuff.Mode.SRC_IN));
            drawingView.f59070c.add(new fr0.b(vectorDrawableCompatCreate, drawingView.getCenterX(), drawingView.getCenterY()));
            drawingView.g();
            drawingView.invalidate();
        }
        setTools(null);
    }

    public final void s0(Bitmap bitmap, Float f) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        CardPersonalisationDrawingView drawingView = getDrawingView();
        drawingView.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        drawingView.setDrawingEnabled(false);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(drawingView.f59081t, PorterDuff.Mode.SRC_IN));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        fr0.a aVar = new fr0.a(bitmapCreateBitmap, drawingView.getCenterX(), drawingView.getCenterY());
        aVar.c(f.floatValue(), drawingView.getCenterX(), drawingView.getCenterY());
        drawingView.f59070c.add(aVar);
        drawingView.g();
        drawingView.invalidate();
        setTools(null);
    }

    public final void setActionToolsEnabled(boolean enabled) {
        this.B = enabled;
    }

    public final void setCardImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(or0.u.k(this).Q(), image, getCardImage(), null, null, 12);
    }

    public final void setCustomisationLottieAnimation(@NotNull LottieImage lottieImage) {
        Intrinsics.checkNotNullParameter(lottieImage, "lottieImage");
        this.f58385h = lottieImage;
    }

    public final void setDrawingColor(int color) {
        getDrawingView().setCurrentColor(color);
    }

    public final void setDrawingShapePoints(@NotNull List<? extends PointF> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (points.isEmpty()) {
            throw new IllegalArgumentException("points can not be empty");
        }
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getDrawingView().getMeasuredWidth() == 0 || getDrawingView().getMeasuredHeight() == 0) {
            post(new k0.b(this, points, 15));
        } else {
            setDrawingShapePointsAndCalculateAnimation(points);
        }
    }

    public final void setFontsToolsEnabled(boolean enabled) {
        this.C = enabled;
    }

    public final void setItems(koi.j icons, TextDelegate.Model hint) {
        ArrayList arrayList = new ArrayList();
        ihm.f fVar = this.f58393s;
        if (icons != null) {
            od0.h hVar = od0.i.Companion;
            String f58244a = icons.getF55721a();
            hVar.getClass();
            fVar.onNext(od0.h.a(f58244a));
            arrayList.add(icons);
        } else {
            od0.i.Companion.getClass();
            fVar.onNext(od0.i.f224256b);
        }
        if (hint != null) {
            arrayList.add(hint);
        }
        z4l.j jVar = this.z;
        if (jVar != null) {
            jVar.c(arrayList);
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    public final void setMovingHintLabel(@NotNull Clause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f58386j = label;
    }

    public final void setPinToAdjustHintLabel(@NotNull Clause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.k = label;
    }

    public final void setStrokeColor(int strokeColor) {
        getDrawingView().setStrokeColor(strokeColor);
    }

    public final void setToolsConfiguration(@NotNull b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.i = configuration;
    }

    public final void t0() {
        CardPersonalisationDrawingView drawingView = getDrawingView();
        drawingView.f59071g = false;
        drawingView.f59070c.clear();
        drawingView.d.clear();
        drawingView.e.clear();
        drawingView.g();
        drawingView.invalidate();
        K0();
        setTools(null);
    }

    public final void u0() {
        setTools(null);
    }

    public final void v0() {
        getDrawingView().setPositionGuidingEnabled(true);
    }

    public final void w0() {
        getDrawingView().setRotationGuidingEnabled(true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final m5 y0(String str) {
        Typeface font;
        switch (str.hashCode()) {
            case -993936119:
                font = !str.equals("ROBOTO_REGULAR_FONT_LIST_ID") ? null : ResourcesCompat.getFont(getContext(), R$font.inter_variable);
                break;
            case -88110072:
                font = !str.equals("CORMORANT_GARAMOND_FONT_LIST_ID") ? null : ResourcesCompat.getFont(getContext(), com.revolut.core.ui_kit.R$font.cormorant_garamond_regular);
                break;
            case 768291550:
                font = !str.equals("ROBOTO_CONDENSED_FONT_LIST_ID") ? null : ResourcesCompat.getFont(getContext(), com.revolut.core.ui_kit.R$font.roboto_condensed_bold);
                break;
            case 1243303341:
                font = !str.equals("PARISIENNE_FONT_LIST_ID") ? null : ResourcesCompat.getFont(getContext(), com.revolut.core.ui_kit.R$font.parisienne_regular);
                break;
            case 1828638960:
                font = !str.equals("YELLOW_TAIL_FONT_LIST_ID") ? null : ResourcesCompat.getFont(getContext(), com.revolut.core.ui_kit.R$font.yellowtail_regular);
                break;
            default:
                font = null;
                break;
        }
        Typeface typeface = font == null ? Typeface.DEFAULT_BOLD : font;
        Intrinsics.h(typeface);
        if (font == null) {
            str = null;
        }
        return new m5(typeface, str);
    }

    public final IconSelectorDelegate.SelectableIconModel z0(int i, TextLocalisedClause textLocalisedClause, String str, String str2) {
        boolean zEquals = str.equals(str2);
        int i2 = R$drawable.uikit_icn_40_oval_background;
        b bVar = this.i;
        LayeredImage.Layer.Drawable drawable = new LayeredImage.Layer.Drawable(i2, Integer.valueOf(zEquals ? bVar.f58402h : bVar.f58401g), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124);
        b bVar2 = this.i;
        return new IconSelectorDelegate.SelectableIconModel(str, new LayeredImage(zhm.v.k(drawable, new LayeredImage.Layer.Drawable(i, Integer.valueOf(zEquals ? bVar2.f58403j : bVar2.i), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), zEquals, null, textLocalisedClause, false, null, R$attr.uikit_windowBackground, false, null, null, 3944);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPersonalisationView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPersonalisationView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58383b = kli.a.k(context, 84.0f);
        this.i = new b(false, null, 1023);
        this.f58387l = new ifm.b();
        float fK = kli.a.k(context, 6.0f);
        this.f58388m = fK;
        float fK2 = kli.a.k(context, 2.0f);
        this.f58389n = fK2;
        float fK3 = kli.a.k(context, 4.0f);
        float fK4 = kli.a.k(context, 48.0f);
        this.o = v0.a.d("create(...)");
        this.f58390p = v0.a.d("create(...)");
        this.f58391q = v0.a.d("create(...)");
        this.f58392r = v0.a.d("create(...)");
        this.f58393s = v0.a.d("create(...)");
        this.f58394t = v0.a.d("create(...)");
        this.u = v0.a.d("create(...)");
        this.v = v0.a.d("create(...)");
        this.f58395w = te0.w.y0(new mw1.a(2));
        this.f58396x = te0.w.y0(new mw1.a(3));
        this.f58397y = te0.w.y0(new mw1.a(4));
        this.C = true;
        this.imageContainer = kli.a.J(R$id.internalViewCardPersonalization_imageContainer, this);
        this.thicknessSlider = kli.a.J(R$id.internalViewCardPersonalization_thicknessSlider, this);
        this.drawingView = kli.a.J(R$id.internalViewCardPersonalization_drawingView, this);
        this.cardImage = kli.a.J(R$id.internalViewCardPersonalization_cardImage, this);
        this.recyclerView = kli.a.J(R$id.internalViewCardPersonalization_recyclerView, this);
        this.customisationAnimationView = kli.a.J(R$id.internalViewCardPersonalization_customisationAnimationView, this);
        View.inflate(context, R$layout.internal_view_card_personalisation, this);
        getThicknessSlider().setupRange(fK2, fK, fK3);
        getDrawingView().setCurrentColor(-1);
        getDrawingView().setLineSize(fK3);
        getDrawingView().setTextSize(fK4);
        this.z = new z4l.j(7, zhm.v.k(getCardPersonalisationToolbarDelegate(), getCircleActionButtonsBarDelegate(), getHintDelegate()), false);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = getRecyclerView();
        z4l.j jVar = this.z;
        if (jVar != null) {
            recyclerView.setAdapter(jVar);
            getCustomisationAnimationView().addAnimatorListener(new aq0.k(this, 8));
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    public /* synthetic */ CardPersonalisationView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
