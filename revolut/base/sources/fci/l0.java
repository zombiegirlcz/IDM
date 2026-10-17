package fci;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 {

    @NotNull
    private static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f133790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f133791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f133792c;
    public Object d;
    public androidx.view.j e;

    public l0(ScreenContentRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f133790a = recyclerView;
        this.f133791b = new Handler(Looper.getMainLooper());
        this.f133792c = new ArrayList();
        this.d = zhm.f0.f322471a;
    }

    public static SpringAnimation b(View view, DynamicAnimation.ViewProperty viewProperty, float f) {
        SpringAnimation springAnimation = new SpringAnimation(view, viewProperty, 1.0f);
        springAnimation.setStartValue(f);
        SpringForce springForce = new SpringForce(1.0f);
        springForce.setStiffness(400.0f);
        springForce.setDampingRatio(0.75f);
        springAnimation.setSpring(springForce);
        return springAnimation;
    }

    public final void a() {
        androidx.view.j jVar = this.e;
        if (jVar != null) {
            this.f133791b.removeCallbacks(jVar);
        }
        this.e = null;
        ArrayList arrayList = this.f133792c;
        List listD1 = zhm.d0.d1(arrayList);
        arrayList.clear();
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            ((SpringAnimation) it8.next()).cancel();
        }
    }

    public final void c() {
        a();
        for (View view : (Iterable) this.d) {
            view.animate().cancel();
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        this.d = zhm.f0.f322471a;
    }

    public final void d(int i, ArrayList arrayList) {
        if (i >= arrayList.size()) {
            return;
        }
        View view = (View) arrayList.get(i);
        DynamicAnimation.ViewProperty SCALE_X = DynamicAnimation.SCALE_X;
        Intrinsics.checkNotNullExpressionValue(SCALE_X, "SCALE_X");
        SpringAnimation springAnimationB = b(view, SCALE_X, 0.7f);
        DynamicAnimation.ViewProperty SCALE_Y = DynamicAnimation.SCALE_Y;
        Intrinsics.checkNotNullExpressionValue(SCALE_Y, "SCALE_Y");
        SpringAnimation springAnimationB2 = b(view, SCALE_Y, 0.7f);
        DynamicAnimation.ViewProperty ALPHA = DynamicAnimation.ALPHA;
        Intrinsics.checkNotNullExpressionValue(ALPHA, "ALPHA");
        for (final SpringAnimation springAnimation : zhm.v.k(springAnimationB, springAnimationB2, b(view, ALPHA, BitmapDescriptorFactory.HUE_RED))) {
            this.f133792c.add(springAnimation);
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: fci.h0
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f4) {
                    this.f133780a.f133792c.remove(springAnimation);
                }
            });
            springAnimation.start();
        }
        if (i + 1 < arrayList.size()) {
            androidx.view.j jVar = new androidx.view.j(this, arrayList, i, 2);
            this.f133791b.postDelayed(jVar, 200L);
            this.e = jVar;
        }
    }
}
