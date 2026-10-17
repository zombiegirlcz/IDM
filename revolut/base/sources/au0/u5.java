package au0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.drawables.CrossfadeDrawable;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u5 extends FrameLayout implements q5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9391g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrossfadeDrawable f9393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t5 f9394c;
    public a d;
    public ValueAnimator e;
    public final FloatingBottomBarView.a f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f9395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f9396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f9397c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this((View) null, (Integer) (0 == true ? 1 : 0), 7);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f9395a, aVar.f9395a) && Intrinsics.f(this.f9396b, aVar.f9396b) && Intrinsics.f(this.f9397c, aVar.f9397c);
        }

        public final int hashCode() {
            View view = this.f9395a;
            int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
            Integer num = this.f9396b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f9397c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public /* synthetic */ a(View view, Integer num, int i) {
            this((i & 1) != 0 ? null : view, (i & 2) != 0 ? null : num, (Integer) null);
        }

        public a(View view, Integer num, Integer num2) {
            this.f9395a = view;
            this.f9396b = num;
            this.f9397c = num2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9392a = kli.a.s(R$attr.uikit_colorBackground, context);
        this.f9393b = new CrossfadeDrawable(300L);
        this.f = new FloatingBottomBarView.a();
    }

    public static void c(u5 u5Var, t5 t5Var, a aVar, int i) {
        View view;
        t5 t5Var2;
        View view2;
        if ((i & 1) != 0) {
            t5Var = u5Var.f9394c;
        }
        if ((i & 2) != 0) {
            aVar = u5Var.d;
        }
        FloatingBottomBarView.a aVar2 = u5Var.f;
        if (Intrinsics.f(u5Var.f9394c, t5Var) && Intrinsics.f(u5Var.d, aVar)) {
            return;
        }
        int i2 = 1;
        int i3 = (u5Var.f9394c == null && u5Var.d == null) ? 0 : 1;
        a aVar3 = u5Var.d;
        boolean z = aVar3 != null && aVar == null;
        if (aVar != null) {
            View view3 = aVar.f9395a;
            if (!Intrinsics.f(aVar3, aVar)) {
                a aVar4 = u5Var.d;
                View view4 = aVar4 != null ? aVar4.f9395a : null;
                if (!Intrinsics.f(view4, view3)) {
                    u5Var.removeView(view4);
                }
                if (view3 != null) {
                    if (!Intrinsics.f(view3.getParent(), u5Var)) {
                        u5Var.addView(view3, new FrameLayout.LayoutParams(-1, -1));
                    }
                    view3.setVisibility(0);
                    Integer num = aVar.f9396b;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Integer num2 = aVar.f9397c;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        }
                        aVar2.a(iIntValue);
                    }
                }
            }
        } else if (t5Var != null) {
            Drawable drawable = t5Var.f9375a;
            if (aVar3 != null && (view2 = aVar3.f9395a) != null) {
                view2.setVisibility(8);
            }
            if (z || (t5Var2 = u5Var.f9394c) == null || t5Var2.f9376b != t5Var.f9376b || t5Var2.f9375a != drawable) {
                ValueAnimator valueAnimator = u5Var.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean z3 = !z && u5Var.getVisibility() == 0 && u5Var.isAttachedToWindow() && u5Var.getBackground() != null;
                int i5 = t5Var.f9377c;
                u5Var.a(drawable, z3);
                if (z3) {
                    t5 t5Var3 = u5Var.f9394c;
                    int i6 = t5Var3 != null ? t5Var3.f9377c : u5Var.f9392a;
                    if (i6 == i5) {
                        aVar2.a(i5);
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                        u5Var.e = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.addUpdateListener(new r5(u5Var, i6, i5, i));
                        valueAnimatorOfFloat.addListener(new l5(u5Var, i2));
                        valueAnimatorOfFloat.start();
                    }
                } else {
                    aVar2.a(i5);
                }
            }
        } else {
            if (aVar3 != null && (view = aVar3.f9395a) != null) {
                view.setVisibility(8);
            }
            i2 = 0;
        }
        if (i3 != i2) {
            if (i2 != 0) {
                aVar2.f58592b = false;
                FloatingBottomBarView floatingBottomBarViewK = jb3.l.k(js0.f.Companion, u5Var);
                if (floatingBottomBarViewK != null) {
                    FloatingBottomBarView.Companion bVar = FloatingBottomBarView.INSTANCE;
                    floatingBottomBarViewK.z(aVar2, false);
                }
            } else {
                aVar2.b();
            }
        }
        u5Var.f9394c = t5Var;
        u5Var.d = aVar;
        u5Var.setVisibility(i2 == 0 ? 8 : 0);
    }

    public final void a(Drawable drawable, boolean z) {
        CrossfadeDrawable crossfadeDrawable = this.f9393b;
        if (crossfadeDrawable.f55944b == drawable) {
            return;
        }
        crossfadeDrawable.b(drawable, z);
        if (getBackground() != crossfadeDrawable) {
            setBackground(crossfadeDrawable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int b(int i) {
        if (((Boolean) jo0.g.f176828j.getValue()).booleanValue()) {
            return i;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ro0.g0.b(context, ro0.e0.BOTTOM_BAR)) {
            return i;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "<this>");
        if (!jh.d.g(context2) || kli.a.q(context2)) {
            return i;
        }
        Color.INSTANCE.getClass();
        float[] fArr = Color.f51457a;
        android.graphics.Color.colorToHSV(i, fArr);
        fArr[1] = Math.min(fArr[1], 0.03f);
        return android.graphics.Color.HSVToColor(fArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9393b.a();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // au0.q5
    public void setBottomLayer(@NotNull Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        c(this, new t5(drawable, i, b(i)), null, 2);
    }

    @Override // au0.q5
    public void setTopLayer(@NotNull View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        c(this, null, new a(view, num, num != null ? Integer.valueOf(b(num.intValue())) : null), 1);
    }
}
