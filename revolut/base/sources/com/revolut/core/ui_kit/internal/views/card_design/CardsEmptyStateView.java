package com.revolut.core.ui_kit.internal.views.card_design;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.animation.PathInterpolatorCompat;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import cs0.a;
import java.util.ArrayList;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ss0.c;
import ss0.e;
import vim.f;
import z9h.n;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001f\u0011 !B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/card_design/CardsEmptyStateView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "", "setShimmerVisibility", "(Z)V", "Lcom/revolut/core/ui_kit/internal/views/card_design/CardsEmptyStateView$b;", "value", "b", "Lcom/revolut/core/ui_kit/internal/views/card_design/CardsEmptyStateView$b;", "getParams", "()Lcom/revolut/core/ui_kit/internal/views/card_design/CardsEmptyStateView$b;", "setParams", "(Lcom/revolut/core/ui_kit/internal/views/card_design/CardsEmptyStateView$b;)V", "params", "", "c", "F", "setAnimationProgress", "(F)V", "animationProgress", "Companion", "ss0/b", "ss0/e", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardsEmptyStateView extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f56582m = v.k(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(0.1f), Float.valueOf(0.15f), Float.valueOf(0.25f));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f56583n = v.k(400L, 580L, 800L, 940L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public b params;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float animationProgress;
    public final Interpolator d;
    public final AnimatorSet e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f56587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f56588h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cs0.a f56589j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f56590l;

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f56591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f56592b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f56591a, bVar.f56591a) && Intrinsics.f(this.f56592b, bVar.f56592b);
        }

        public final int hashCode() {
            return this.f56592b.hashCode() + (this.f56591a.hashCode() * 31);
        }

        public b(int i) {
            this(f0.f322471a, c.e);
        }

        public b(List cardDesigns, e size) {
            Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f56591a = cardDesigns;
            this.f56592b = size;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardsEmptyStateView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(CardsEmptyStateView cardsEmptyStateView, ValueAnimator valueAnimator) {
        cardsEmptyStateView.setAnimationProgress(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static void b(CardsEmptyStateView cardsEmptyStateView, ValueAnimator valueAnimator) {
        cardsEmptyStateView.setAnimationProgress(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void c(CardsEmptyStateView cardsEmptyStateView) {
        cardsEmptyStateView.setShimmerVisibility(true);
        int i = 0;
        for (Object obj2 : cardsEmptyStateView.k) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            cardsEmptyStateView.f56590l.postDelayed(new o6.a((ss0.b) obj2, 27), ((Number) f56583n.get(i)).longValue());
            i = i2;
        }
    }

    public static ValueAnimator e(CardsEmptyStateView cardsEmptyStateView, float f, int i) {
        long j2 = (i & 1) != 0 ? 0L : 1500L;
        if ((i & 2) != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        cardsEmptyStateView.getClass();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(cardsEmptyStateView.d);
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ss0.a(cardsEmptyStateView, 1));
        valueAnimatorOfFloat.addListener(new l5(cardsEmptyStateView, 22));
        return valueAnimatorOfFloat;
    }

    private final void setAnimationProgress(float f) {
        this.animationProgress = f;
        h();
    }

    private final void setShimmerVisibility(boolean visible) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ss0.b) arrayList.get(i)).f265255c.setAlpha(visible ? 255 : 0);
        }
    }

    public final ValueAnimator d(float f, long j2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new ss0.a(this, 0));
        return valueAnimatorOfFloat;
    }

    public final void f() {
        setShimmerVisibility(false);
        AnimatorSet animatorSet = this.e;
        if (!animatorSet.isRunning()) {
            setAnimationProgress(BitmapDescriptorFactory.HUE_RED);
            return;
        }
        animatorSet.cancel();
        this.f56590l.removeCallbacksAndMessages(null);
        d(this.animationProgress, 0L).start();
    }

    public final void g() {
        AnimatorSet animatorSet = this.e;
        if (!animatorSet.isRunning()) {
            setShimmerVisibility(false);
            setAnimationProgress(1.0f);
        } else {
            animatorSet.cancel();
            this.f56590l.removeCallbacksAndMessages(null);
            e(this, this.animationProgress, 1).start();
        }
    }

    @NotNull
    public final b getParams() {
        return this.params;
    }

    public final void h() {
        float fFloatValue = -((this.f56588h - this.f) / 2);
        f it8 = v.i(this.params.f56591a).iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            List list = f56582m;
            float fFloatValue2 = 1.0f - (((Number) list.get(iNextInt)).floatValue() * this.animationProgress);
            ss0.b bVar = (ss0.b) this.k.get(iNextInt);
            ImageView imageView = bVar.f265253a;
            if (this.f56584a) {
                imageView.setPivotX(imageView.getWidth());
                imageView.setTranslationX((-fFloatValue) * this.animationProgress);
            } else {
                imageView.setPivotX(BitmapDescriptorFactory.HUE_RED);
                imageView.setTranslationX(this.animationProgress * fFloatValue);
            }
            imageView.setPivotY(imageView.getHeight() / 2);
            imageView.setScaleY(fFloatValue2);
            imageView.setScaleX(fFloatValue2);
            bVar.f265254b.setAlpha(iNextInt >= 1 ? (int) (this.animationProgress * 255) : 0);
            fFloatValue += ((1.0f - ((Number) list.get(iNextInt)).floatValue()) * this.f) - this.f56587g;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.cancel();
        this.f56590l.removeCallbacksAndMessages(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float paddingStart;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i);
        e eVar = this.params.f56592b;
        if (eVar.d) {
            paddingStart = ((size - getPaddingStart()) - getPaddingEnd()) * this.params.f56592b.f265257b;
        } else {
            paddingStart = eVar.f265257b * size;
        }
        int i3 = (int) (paddingStart / this.params.f56592b.f265256a);
        if (i3 <= size2) {
            size2 = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        if (this.i) {
            this.f = size2 * 1.54f;
            b bVar = this.params;
            this.f56587g = bVar.f56592b.a(bVar.f56591a.size()) * ((int) paddingStart);
            float size3 = (this.params.f56591a.size() - 1) * this.f56587g;
            f it8 = v.i(this.params.f56591a).iterator();
            double dDoubleValue = 0.0d;
            while (it8.f289625c) {
                dDoubleValue += (1.0d - ((Number) f56582m.get(it8.nextInt())).doubleValue()) * ((double) this.f);
            }
            this.f56588h = (float) (dDoubleValue - ((double) size3));
            this.i = false;
        }
    }

    public final void setParams(@NotNull b value) {
        ArrayList arrayList;
        int i;
        Object obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f56591a.size() > value.f56592b.f265258c) {
            e eVar = this.params.f56592b;
            throw new IllegalStateException("CardsEmptyStateView with " + eVar + " size cannot display more than " + eVar.f265258c + " card designs");
        }
        this.params = value;
        List list = value.f56591a;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.k;
            if (i3 >= size) {
                break;
            }
            Image image = (Image) list.get(i3);
            yy0.f fVarQ = u.k(this).Q();
            if (i3 < 0 || i3 >= arrayList.size()) {
                ImageView imageView = new ImageView(getContext());
                addView(imageView, i2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                imageView.setAdjustViewBounds(true);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iS = kli.a.s(R$attr.uikit_colorTransparent, context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                float fK = kli.a.k(context2, 4.0f);
                boolean z = this.f56584a;
                GradientDrawable.Orientation orientation = z ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT;
                i = i2;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{iS, kli.a.s(R$attr.uikit_colorWhite_30, context3)});
                GradientDrawable.Orientation orientation2 = z ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT;
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GradientDrawable gradientDrawable2 = new GradientDrawable(orientation2, new int[]{kli.a.s(R$attr.uikit_colorBlack_50, context4), iS});
                gradientDrawable.setCornerRadius(fK);
                gradientDrawable2.setCornerRadius(fK);
                LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable2, gradientDrawable});
                RevolutShimmerDrawable revolutShimmerDrawable = new RevolutShimmerDrawable();
                revolutShimmerDrawable.a(this.f56589j);
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[i] = layerDrawable;
                drawableArr[1] = revolutShimmerDrawable;
                imageView.setForeground(new LayerDrawable(drawableArr));
                ss0.b bVar = new ss0.b(imageView, layerDrawable, revolutShimmerDrawable);
                arrayList.add(bVar);
                obj2 = bVar;
            } else {
                obj2 = arrayList.get(i3);
                i = i2;
            }
            yy0.f.e(fVarQ, image, ((ss0.b) obj2).f265253a, null, null, 12);
            i3++;
            i2 = i;
        }
        int i5 = i2;
        int size2 = arrayList.size();
        int i6 = i5;
        while (i6 < size2) {
            ((ss0.b) arrayList.get(i6)).f265253a.setVisibility(this.params.f56591a.size() > i6 ? i5 : 8);
            i6++;
        }
        addOnLayoutChangeListener(new cli.u(this, 16));
        this.i = true;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardsEmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsEmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56584a = d.k(context);
        this.params = new b(0);
        this.animationProgress = 1.0f;
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.84f, BitmapDescriptorFactory.HUE_RED, 0.16f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        this.d = interpolatorCreate;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(e(this, BitmapDescriptorFactory.HUE_RED, 3), d(1.0f, CapturePresenter.PASSPORT_OVERLAY_DELAY_MS), e(this, BitmapDescriptorFactory.HUE_RED, 2));
        this.e = animatorSet;
        this.i = true;
        a.d dVar = cs0.a.Companion;
        a.c cVar = new a.c();
        cs0.a aVar = cVar.f108423a;
        aVar.e = 0;
        cVar.g(0.4f);
        cVar.j();
        cVar.k(cs0.b.MASKED);
        aVar.f108416m = false;
        aVar.f108417n = 0;
        aVar.f108421s = kli.a.l(context, 4.0f);
        this.f56589j = cVar.a();
        this.k = new ArrayList();
        this.f56590l = new Handler(Looper.getMainLooper());
        setClipToPadding(false);
    }

    public /* synthetic */ CardsEmptyStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
