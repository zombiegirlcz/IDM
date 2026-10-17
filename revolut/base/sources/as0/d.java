package as0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import au0.m1;
import az0.l1;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.ProgressAnimation;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.views.AmountInputView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import iv0.o;
import iv0.q;
import kotlin.jvm.internal.Intrinsics;
import mx0.f0;
import uw0.i;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8743c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f8741a = i;
        this.f8742b = obj2;
        this.f8743c = obj3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        int i = this.f8741a;
        Object obj2 = this.f8743c;
        Object obj3 = this.f8742b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(v, "v");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                v.removeOnAttachStateChangeListener(this);
                ((gp0.f) obj3).a(v, (Drawable) obj2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(v, "view");
                v.removeOnAttachStateChangeListener(this);
                ((o) obj3).g((i) obj2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v, "view");
                ((q) obj3).b((View) obj2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(v, "v");
                break;
            case 5:
                kt0.d dVar = (kt0.d) obj3;
                Intrinsics.checkNotNullParameter(v, "v");
                lji.c cVar = (lji.c) obj2;
                ImageView imageView = cVar.d;
                com.revolut.kompot.navigable.a aVar = cVar.f195673a;
                imageView.setVisibility(aVar.D2().getVisibility() == 0 ? 0 : 8);
                imageView.setAlpha(aVar.D2().getAlpha());
                v.removeCallbacks(dVar);
                dVar.run();
                ViewParent parent = v.getParent();
                Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.addView(imageView, viewGroup.indexOfChild(aVar.D2()), new ViewGroup.LayoutParams(-1, -1));
                break;
            case 6:
                Intrinsics.checkNotNullParameter(v, "view");
                ProgressStyle progressStyle = (ProgressStyle) obj2;
                ProgressAnimation progressAnimation = progressStyle.i;
                int i2 = progressStyle.f56332a;
                CircleProgressBar.Companion companion = CircleProgressBar.INSTANCE;
                ((CircleProgressBar) obj3).g(progressAnimation, i2);
                break;
            case 7:
                AmountInputView amountInputView = (AmountInputView) obj2;
                Intrinsics.checkNotNullParameter(v, "v");
                View view = (View) obj3;
                if (view.hasWindowFocus()) {
                    kli.c.d(view, 0L);
                } else {
                    AmountInputView.a aVar2 = AmountInputView.Companion;
                    f0 f0Var = new f0(view, amountInputView);
                    amountInputView.f58345x = f0Var;
                    view.getViewTreeObserver().addOnWindowFocusChangeListener(f0Var);
                }
                view.removeOnAttachStateChangeListener(this);
                amountInputView.f58346y = null;
                break;
            default:
                Intrinsics.checkNotNullParameter(v, "v");
                ((ky4.f) obj3).invoke();
                ((l1) obj2).invoke();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        switch (this.f8741a) {
            case 0:
                Intrinsics.checkNotNullParameter(v, "v");
                f fVar = (f) this.f8742b;
                ValueAnimator valueAnimator = fVar.f8750c;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                fVar.a();
                ((ScreenContentRecyclerView) this.f8743c).removeOnAttachStateChangeListener(this);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(v, "view");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(v, "view");
                ((q) this.f8742b).c((View) this.f8743c);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(v, "v");
                v.removeOnAttachStateChangeListener(this);
                ((r10.f) this.f8742b).B((View) this.f8743c);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(v, "v");
                v.post((kt0.d) this.f8742b);
                lji.c cVar = (lji.c) this.f8743c;
                m1 m1Var = cVar.f195676g;
                if (m1Var != null) {
                    m1Var.cancel();
                }
                cVar.f195676g = null;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(v, "view");
                ((CircleProgressBar) this.f8742b).b();
                break;
            case 7:
                Intrinsics.checkNotNullParameter(v, "v");
                break;
            default:
                Intrinsics.checkNotNullParameter(v, "v");
                break;
        }
    }

    public d(lji.c cVar) {
        this.f8741a = 5;
        this.f8743c = cVar;
        this.f8742b = new kt0.d(cVar, 6);
    }
}
