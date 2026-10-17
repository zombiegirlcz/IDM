package com.revolut.core.ui_kit.internal.views.quiz;

import a31.o;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$style;
import e8.q;
import efm.r;
import ifm.b;
import ihm.f;
import jo0.m;
import k65.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ksb.a;
import ksk.h;
import ku0.c;
import ku0.i;
import ku0.j;
import ku0.k;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fR\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u001b\u0010&\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u001fR\u0014\u0010(\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0014\u0010*\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001f¨\u0006."}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/quiz/QuizView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/ValueAnimator;", "getForegroundCardTranslateAnimator", "()Landroid/animation/ValueAnimator;", "getForegroundCardAlphaAnimator", "getBackgroundScaleXAnimator", "getBackgroundScaleYAnimator", "getBackgroundCardTranslateAnimator", "getBackgroundCardAlphaAnimator", "getLastCardAlphaAnimator", "Lcom/revolut/core/ui_kit/internal/views/quiz/QuizCardView;", "a", "Le8/q;", "getBgLastCard", "()Lcom/revolut/core/ui_kit/internal/views/quiz/QuizCardView;", "bgLastCard", "b", "getBgCard", "bgCard", "Lcom/revolut/core/ui_kit/internal/views/quiz/QuizCardContentView;", "c", "getBgCardContentView", "()Lcom/revolut/core/ui_kit/internal/views/quiz/QuizCardContentView;", "bgCardContentView", "d", "getFgCard", "fgCard", "e", "getFgCardContentView", "fgCardContentView", "getBackgroundCard", "backgroundCard", "getCurrentCardContentView", "currentCardContentView", "getBackgroundCardContentView", "backgroundCardContentView", "ku0/g", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QuizView extends FrameLayout {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q bgLastCard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q bgCard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q bgCardContentView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q fgCard;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q fgCardContentView;
    public final QuizCardView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f57471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f57472h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0m.b f57473j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(QuizView quizView) {
        b(quizView.f);
        b(quizView.getBackgroundCard());
        b(quizView.getBgLastCard());
        return Unit.f186387a;
    }

    public static void b(QuizCardView quizCardView) {
        quizCardView.setPivotX(quizCardView.getWidth() / 2);
        quizCardView.setPivotY(quizCardView.getHeight());
    }

    private final QuizCardView getBackgroundCard() {
        return Intrinsics.f(this.f, getFgCard()) ? getBgCard() : getFgCard();
    }

    private final ValueAnimator getBackgroundCardAlphaAnimator() {
        QuizCardView backgroundCard = getBackgroundCard();
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(backgroundCard, (Property<QuizCardView, Float>) View.ALPHA, cVar.d.f189578a.floatValue(), cVar.d.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final QuizCardContentView getBackgroundCardContentView() {
        return Intrinsics.f(this.f, getFgCard()) ? getBgCardContentView() : getFgCardContentView();
    }

    private final ValueAnimator getBackgroundCardTranslateAnimator() {
        QuizCardView backgroundCard = getBackgroundCard();
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(backgroundCard, (Property<QuizCardView, Float>) View.TRANSLATION_Y, cVar.e.f189578a.floatValue(), cVar.e.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final ValueAnimator getBackgroundScaleXAnimator() {
        QuizCardView backgroundCard = getBackgroundCard();
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(backgroundCard, (Property<QuizCardView, Float>) View.SCALE_X, cVar.f.f189578a.floatValue(), cVar.f.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final ValueAnimator getBackgroundScaleYAnimator() {
        QuizCardView backgroundCard = getBackgroundCard();
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(backgroundCard, (Property<QuizCardView, Float>) View.SCALE_Y, cVar.f189583g.f189578a.floatValue(), cVar.f189583g.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final QuizCardView getBgCard() {
        return (QuizCardView) this.bgCard.f();
    }

    private final QuizCardContentView getBgCardContentView() {
        return (QuizCardContentView) this.bgCardContentView.f();
    }

    private final QuizCardView getBgLastCard() {
        return (QuizCardView) this.bgLastCard.f();
    }

    private final QuizCardContentView getCurrentCardContentView() {
        return Intrinsics.f(this.f, getFgCard()) ? getFgCardContentView() : getBgCardContentView();
    }

    private final QuizCardView getFgCard() {
        return (QuizCardView) this.fgCard.f();
    }

    private final QuizCardContentView getFgCardContentView() {
        return (QuizCardContentView) this.fgCardContentView.f();
    }

    private final ValueAnimator getForegroundCardAlphaAnimator() {
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f, (Property<QuizCardView, Float>) View.ALPHA, cVar.f189582c.f189578a.floatValue(), cVar.f189582c.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final ValueAnimator getForegroundCardTranslateAnimator() {
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f, (Property<QuizCardView, Float>) View.TRANSLATION_X, cVar.f189581b.f189578a.floatValue(), cVar.f189581b.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private final ValueAnimator getLastCardAlphaAnimator() {
        QuizCardView bgLastCard = getBgLastCard();
        c cVar = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bgLastCard, (Property<QuizCardView, Float>) View.ALPHA, cVar.i.f189578a.floatValue(), cVar.i.f189579b.floatValue());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        this.f57473j.init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        QuizCardContentView currentCardContentView = getCurrentCardContentView();
        r rVarHide = currentCardContentView.f57465c.f189585a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        ifm.c cVarSubscribe = rVarHide.subscribe(new a(new ku0.f(this, 0), 5), new o(24, i.f189590a));
        b bVar = this.f57471g;
        w.j0(bVar, cVarSubscribe);
        r rVarHide2 = currentCardContentView.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        w.j0(bVar, rVarHide2.subscribe(new a(new ku0.f(this, 1), 6), new o(25, j.f189591a)));
        w.j0(bVar, w.a0(currentCardContentView.f57464b.f52518c, new h(8)).subscribe(new a(new d(1, this.f57472h, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 26), 7), new o(26, k.f189592a)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Handler handler = getCurrentCardContentView().getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = getBackgroundCardContentView().getHandler();
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        this.f57471g.d();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuizView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizView(@NotNull Context context, AttributeSet attributeSet, int i) {
        Display defaultDisplay;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgLastCard = kli.a.J(R$id.quiz_bgLastCard, this);
        this.bgCard = kli.a.J(R$id.quiz_bgCard, this);
        this.bgCardContentView = kli.a.J(R$id.quiz_bgCardContent, this);
        this.fgCard = kli.a.J(R$id.quiz_fgCard, this);
        this.fgCardContentView = kli.a.J(R$id.quiz_fgCardContent, this);
        this.f57471g = new b();
        this.f57472h = v0.a.d("create(...)");
        c.Companion.getClass();
        Float fValueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(context, "context");
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = context.getDisplay();
        } else {
            Object systemService = context.getSystemService("window");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        }
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        ku0.b bVar = new ku0.b(fValueOf2, Float.valueOf(-point.x));
        ku0.b bVar2 = new ku0.b(fValueOf, fValueOf2);
        ku0.b bVar3 = new ku0.b(fValueOf2, fValueOf);
        int i2 = R$dimen.internal_quiz_card_scale_x;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i2, typedValue, true);
        ku0.b bVar4 = new ku0.b(Float.valueOf(typedValue.getFloat()), fValueOf);
        int i3 = R$dimen.internal_quiz_card_scale_y;
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(i3, typedValue2, true);
        this.i = new c(decelerateInterpolator, bVar, bVar2, bVar3, new ku0.b(fValueOf2, Float.valueOf(context.getResources().getDimensionPixelSize(R$dimen.internal_quiz_card_y_translate))), bVar4, new ku0.b(Float.valueOf(typedValue2.getFloat()), fValueOf), new ku0.b(Integer.valueOf(kli.a.s(R$attr.uikit_colorElevatedGroupedBackground_50, context)), Integer.valueOf(kli.a.s(R$attr.uikit_colorElevatedGroupedBackground, context))), new ku0.b(fValueOf, fValueOf2));
        this.f57473j = new e0m.b(new kob.a(this, 4));
        if (((Boolean) m.f176849c.f314188a).booleanValue()) {
            context.getTheme().applyStyle(R$style.UiKitThemeOverlay_TextAppearanceMarketing_New, true);
        }
        View.inflate(context, R$layout.internal_view_quiz, this);
        this.f = getFgCard();
    }

    public /* synthetic */ QuizView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
