package ht0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import b9.w2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ji;
import com.revolut.core.ui_kit.delegates.ki;
import com.revolut.core.ui_kit.delegates.oi;
import com.revolut.core.ui_kit.internal.views.TinyActionButton;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends FrameLayout {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f155167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f155168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f155169c;
    public final TinyActionButton d;
    public final TinyActionButton e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f155170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f155171h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hw0.q f155172j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Paint getDottedLine() {
        return (Paint) this.f155168b.getValue();
    }

    private final int getHeightPx() {
        return ((Number) this.f155169c.getValue()).intValue();
    }

    private final int getMoveThreshold() {
        return ((Number) this.f155167a.getValue()).intValue();
    }

    public static /* synthetic */ void setCollidedAndAnimate$default(p pVar, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z3 = true;
        }
        pVar.setCollidedAndAnimate(z, z3);
    }

    public final void a(float f, float f4) {
        n nVar = this.f155171h;
        if (nVar != null) {
            w2 w2Var = (w2) nVar;
            Intrinsics.checkNotNullParameter(this, "view");
            t tVarG = getDraggableLimitType() == hw0.q.LOWEST ? w2Var.G() : w2Var.F();
            TrendView trendView = (TrendView) w2Var.f13499b;
            float f5 = trendView.e - trendView.f;
            float fA = trendView.a();
            float f6 = (f4 - f) - tVarG.f155181g;
            tVarG.d = kotlin.ranges.f.f(tVarG.d + ((f6 / fA) * (-1) * f5), tVarG.f, tVarG.e);
            ihm.b bVar = tVarG.f155180c;
            Unit unit = Unit.f186387a;
            bVar.onNext(unit);
            tVarG.f155181g += f6;
            w2Var.k0();
            ((ihm.f) w2Var.f13501g).onNext(unit);
        }
    }

    public final void b(MotionEvent motionEvent) {
        hw0.m mVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f = motionEvent.getRawY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f155170g) {
                    a(this.f, motionEvent.getRawY());
                    return;
                }
                if (Math.abs(motionEvent.getRawY() - this.f) >= getMoveThreshold()) {
                    this.f155170g = true;
                    n nVar = this.f155171h;
                    if (nVar != null) {
                        Intrinsics.checkNotNullParameter(this, "view");
                        TrendView trendView = (TrendView) ((w2) nVar).f13500c;
                        hw0.q limitType = getDraggableLimitType();
                        Intrinsics.checkNotNullParameter(limitType, "limitType");
                        hw0.m mVar2 = trendView.draggableLimitsListener;
                        if (mVar2 != null) {
                            oi oiVar = (oi) mVar2;
                            Intrinsics.checkNotNullParameter(limitType, "limitType");
                            oiVar.f54563a.e.onNext(new ji(oiVar.f54564b, limitType));
                        }
                    }
                    a(this.f, motionEvent.getRawY());
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f155170g) {
            this.e.setPressed(false);
            n nVar2 = this.f155171h;
            if (nVar2 != null) {
                w2 w2Var = (w2) nVar2;
                Intrinsics.checkNotNullParameter(this, "view");
                t tVarG = getDraggableLimitType() == hw0.q.LOWEST ? w2Var.G() : w2Var.F();
                tVarG.f155181g = BitmapDescriptorFactory.HUE_RED;
                TrendView trendView2 = (TrendView) w2Var.f13500c;
                hw0.q limitType2 = getDraggableLimitType();
                float f = tVarG.d;
                Intrinsics.checkNotNullParameter(limitType2, "limitType");
                List mDataLists = trendView2.f155121b;
                Intrinsics.checkNotNullExpressionValue(mDataLists, "mDataLists");
                if (((hw0.k) zhm.d0.o0(mDataLists)) != null && (mVar = trendView2.draggableLimitsListener) != null) {
                    oi oiVar2 = (oi) mVar;
                    Intrinsics.checkNotNullParameter(limitType2, "limitType");
                    oiVar2.f54563a.e.onNext(new ki(oiVar2.f54564b, limitType2, f));
                }
            }
        }
        this.f155170g = false;
    }

    public final float getDottedLineY() {
        int i = o.f155166a[this.f155172j.ordinal()];
        TinyActionButton tinyActionButton = this.d;
        if (i == 1) {
            return getHeightPx() - (tinyActionButton.getHeightPx() / 2.0f);
        }
        if (i == 2) {
            return tinyActionButton.getHeightPx() / 2.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final hw0.q getDraggableLimitType() {
        return this.f155172j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.animate().cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float dottedLineY = getDottedLineY();
        canvas.drawLine(BitmapDescriptorFactory.HUE_RED, dottedLineY, getWidth(), dottedLineY, getDottedLine());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b(event);
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getHeightPx(), 1073741824));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b(event);
        return event.getAction() == 0;
    }

    public final void setCollidedAndAnimate(boolean z, boolean z3) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        long j2 = !z3 ? 0L : 100L;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 24.0f);
        int i = o.f155166a[this.f155172j.ordinal()];
        TinyActionButton tinyActionButton = this.d;
        if (i == 1) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = tinyActionButton.animate();
            if (z) {
                fL = 0.0f;
            }
            viewPropertyAnimatorAnimate.y(fL).setDuration(j2).start();
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = tinyActionButton.animate();
        if (!z) {
            fL = 0.0f;
        }
        viewPropertyAnimatorAnimate2.y(fL).setDuration(j2).start();
    }

    public final void setDottedLineColor(int i) {
        getDottedLine().setColor(i);
    }

    public final void setDraggableLimitType(@NotNull hw0.q value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f155172j == value) {
            return;
        }
        this.f155172j = value;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 24.0f);
        this.e.setTag(this.f155172j);
        int i = o.f155166a[this.f155172j.ordinal()];
        float f = BitmapDescriptorFactory.HUE_RED;
        TinyActionButton tinyActionButton = this.d;
        if (i == 1) {
            or0.u.y(this.e, 0, 0, 0, 0, 13);
            if (this.i) {
                f = -iK;
            }
            tinyActionButton.setY(f);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        or0.u.y(this.e, 0, iK, 0, 0, 13);
        if (!this.i) {
            f = -iK;
        }
        tinyActionButton.setY(f);
    }

    public final void setIcons(Image image, Image image2) {
        this.e.setIcon(image);
        this.d.setIcon(image2);
    }

    public final void setLabelClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public final void setLabelText(Clause clause) {
        this.e.setText(clause);
    }

    public final void setListener(n nVar) {
        this.f155171h = nVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f155167a = yhm.j.b(new b0.b(context, 15));
        this.f155168b = yhm.j.b(new b0.b(context, 16));
        this.f155169c = yhm.j.b(new b0.b(context, 17));
        AttributeSet attributeSet2 = null;
        int i2 = 6;
        int i3 = 0;
        TinyActionButton tinyActionButton = new TinyActionButton(context, attributeSet2, i2, i3);
        this.d = tinyActionButton;
        TinyActionButton tinyActionButton2 = new TinyActionButton(context, attributeSet2, i2, i3);
        this.e = tinyActionButton2;
        this.f155172j = hw0.q.HIGHEST;
        setWillNotDraw(false);
        int iK = kli.a.k(context, 32.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
        layoutParams.gravity = 85;
        tinyActionButton.setLayoutParams(layoutParams);
        tinyActionButton.setClickable(true);
        tinyActionButton2.setLayoutParams(new FrameLayout.LayoutParams(-2, iK));
        addView(tinyActionButton);
        addView(tinyActionButton2);
        tinyActionButton2.setTag(this.f155172j);
    }

    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
