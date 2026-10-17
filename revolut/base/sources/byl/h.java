package byl;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import au0.b2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ht0.b0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f19867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f19868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f19869c;
    public final b0 d;
    public k e;
    public AnimatorSet f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f19870g;

    public h(ControllerContainerConstraintLayout root, ScreenContentRecyclerView recyclerView, b0 onDeckClicked, b0 onAnimationStarted) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter("ITEM_NOTE_INPUT_ID", "noteInputId");
        Intrinsics.checkNotNullParameter(onDeckClicked, "onDeckClicked");
        Intrinsics.checkNotNullParameter(onAnimationStarted, "onAnimationStarted");
        this.f19867a = root;
        this.f19868b = recyclerView;
        this.f19869c = onDeckClicked;
        this.d = onAnimationStarted;
        Intrinsics.checkNotNullExpressionValue(root.getContext(), "getContext(...)");
        this.f19870g = kli.a.k(r3, 8.0f);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [byl.d] */
    /* JADX WARN: Type inference failed for: r2v6, types: [byl.d] */
    public static final void a(final h hVar, k kVar, View view) {
        FastOutSlowInInterpolator fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(kVar, (Property<k, Float>) property, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setInterpolator(fastOutSlowInInterpolator);
        Unit unit = Unit.f186387a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat2.setInterpolator(fastOutSlowInInterpolator);
        Property property2 = View.TRANSLATION_X;
        float f = -hVar.f19870g;
        final int i = 0;
        final int i2 = 1;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, BitmapDescriptorFactory.HUE_RED, f);
        objectAnimatorOfFloat3.setInterpolator(fastOutSlowInInterpolator);
        float f4 = kVar.d;
        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(2.0f);
        FastOutSlowInInterpolator fastOutSlowInInterpolator2 = new FastOutSlowInInterpolator();
        ArrayList<Pair> arrayList = kVar.f19879g;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (Pair pair : arrayList) {
            ImageView imageView = (ImageView) pair.f186385a;
            j jVar = (j) pair.f186386b;
            float f5 = f4;
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator objectAnimator = objectAnimatorOfFloat2;
            ObjectAnimator objectAnimator2 = objectAnimatorOfFloat3;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, BitmapDescriptorFactory.HUE_RED, 1.0f);
            objectAnimatorOfFloat4.setInterpolator(overshootInterpolator);
            Unit unit2 = Unit.f186387a;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, BitmapDescriptorFactory.HUE_RED, 1.0f);
            objectAnimatorOfFloat5.setInterpolator(overshootInterpolator);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 30.0f, jVar.f19874a);
            objectAnimatorOfFloat6.setInterpolator(fastOutSlowInInterpolator2);
            Property property3 = View.TRANSLATION_Y;
            float f6 = jVar.f19875b;
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, f6 + f5, f6);
            objectAnimatorOfFloat7.setInterpolator(fastOutSlowInInterpolator2);
            animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
            arrayList2.add(animatorSet2);
            f4 = f5;
            objectAnimatorOfFloat2 = objectAnimator;
            objectAnimatorOfFloat = objectAnimatorOfFloat;
            objectAnimatorOfFloat3 = objectAnimator2;
        }
        float f32 = f4;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList2);
        animatorSet3.setDuration(500L);
        Unit unit3 = Unit.f186387a;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, animatorSet3);
        animatorSet.setDuration(500L);
        FastOutSlowInInterpolator fastOutSlowInInterpolator3 = new FastOutSlowInInterpolator();
        AnimatorSet animatorSet4 = new AnimatorSet();
        Property property4 = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(kVar, (Property<k, Float>) property4, 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat8.setInterpolator(fastOutSlowInInterpolator3);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat9.setInterpolator(fastOutSlowInInterpolator3);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat10.setInterpolator(fastOutSlowInInterpolator3);
        FastOutSlowInInterpolator fastOutSlowInInterpolator4 = new FastOutSlowInInterpolator();
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        for (Pair pair2 : arrayList) {
            ImageView imageView2 = (ImageView) pair2.f186385a;
            j jVar2 = (j) pair2.f186386b;
            AnimatorSet animatorSet5 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_X, 1.0f, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat11.setInterpolator(fastOutSlowInInterpolator4);
            Unit unit4 = Unit.f186387a;
            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat12.setInterpolator(fastOutSlowInInterpolator4);
            ObjectAnimator objectAnimator3 = objectAnimatorOfFloat8;
            ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.ROTATION, jVar2.f19874a, 30.0f);
            objectAnimatorOfFloat13.setInterpolator(fastOutSlowInInterpolator4);
            Property property5 = View.TRANSLATION_Y;
            float f35 = jVar2.f19875b;
            ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, f35, f35 + f32);
            objectAnimatorOfFloat14.setInterpolator(fastOutSlowInInterpolator4);
            animatorSet5.playTogether(objectAnimatorOfFloat11, objectAnimatorOfFloat12, objectAnimatorOfFloat13, objectAnimatorOfFloat14);
            arrayList3.add(animatorSet5);
            objectAnimatorOfFloat8 = objectAnimator3;
        }
        ObjectAnimator objectAnimator4 = objectAnimatorOfFloat8;
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(arrayList3);
        animatorSet6.setDuration(500L);
        Unit unit5 = Unit.f186387a;
        animatorSet4.playTogether(objectAnimator4, objectAnimatorOfFloat9, objectAnimatorOfFloat10, animatorSet6);
        animatorSet4.setDuration(500L);
        cp5.c.b(animatorSet4, null, new Function0(hVar) { // from class: byl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19860b;

            {
                this.f19860b = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        h hVar2 = this.f19860b;
                        k kVar2 = hVar2.e;
                        if (kVar2 != null) {
                            hVar2.f19867a.removeView(kVar2);
                        }
                        hVar2.e = null;
                        break;
                    default:
                        h hVar3 = this.f19860b;
                        k kVar3 = hVar3.e;
                        if (kVar3 != null) {
                            hVar3.f19867a.removeView(kVar3);
                        }
                        hVar3.e = null;
                        break;
                }
                return Unit.f186387a;
            }
        }, null, 5);
        AnimatorSet animatorSet7 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(3500L);
        animatorSet7.playSequentially(animatorSet, valueAnimatorOfFloat, animatorSet4);
        cp5.c.b(animatorSet7, null, null, new Function0(hVar) { // from class: byl.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19860b;

            {
                this.f19860b = hVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        h hVar2 = this.f19860b;
                        k kVar2 = hVar2.e;
                        if (kVar2 != null) {
                            hVar2.f19867a.removeView(kVar2);
                        }
                        hVar2.e = null;
                        break;
                    default:
                        h hVar3 = this.f19860b;
                        k kVar3 = hVar3.e;
                        if (kVar3 != null) {
                            hVar3.f19867a.removeView(kVar3);
                        }
                        hVar3.e = null;
                        break;
                }
                return Unit.f186387a;
            }
        }, 3);
        cp5.c.b(animatorSet7, hVar.d, null, null, 6);
        animatorSet7.start();
        hVar.f = animatorSet7;
    }

    public static final View b(h hVar) {
        koi.j jVar;
        ScreenContentRecyclerView screenContentRecyclerView = hVar.f19868b;
        int childCount = screenContentRecyclerView.getChildCount();
        int i = 0;
        while (true) {
            String f57029a = null;
            if (i >= childCount) {
                return null;
            }
            View childAt = screenContentRecyclerView.getChildAt(i);
            RecyclerView.ViewHolder childViewHolder = screenContentRecyclerView.getChildViewHolder(childAt);
            koi.b bVar = childViewHolder instanceof koi.b ? (koi.b) childViewHolder : null;
            if (bVar != null && (jVar = bVar.e) != null) {
                f57029a = jVar.getF52324a();
            }
            if (Intrinsics.f(f57029a, "ITEM_NOTE_INPUT_ID")) {
                return childAt;
            }
            i++;
        }
    }

    public static final void c(h hVar, UrlImage urlImage, UrlImage urlImage2, UrlImage urlImage3, View view) {
        ScreenContentRecyclerView screenContentRecyclerView = hVar.f19868b;
        ViewGroup viewGroup = hVar.f19867a;
        View viewFindViewById = view.findViewById(R$id.inputText_secondaryIconView);
        if (viewFindViewById == null) {
            return;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k kVar = new k(context, null, 6, 0);
        kVar.setModel(new l(urlImage, urlImage2, urlImage3));
        kVar.setAlpha(BitmapDescriptorFactory.HUE_RED);
        kVar.setOnClickListener(new b2(hVar, 2));
        int iIndexOfChild = viewGroup.indexOfChild(screenContentRecyclerView);
        viewGroup.addView(kVar, iIndexOfChild == -1 ? viewGroup.getChildCount() : iIndexOfChild + 1, new ConstraintLayout.LayoutParams(-2, -2));
        hVar.e = kVar;
        if (!kVar.isLaidOut() || kVar.isLayoutRequested()) {
            kVar.addOnLayoutChangeListener(new f(hVar, kVar, viewFindViewById, view, 0));
        } else if (hVar.e == kVar && screenContentRecyclerView.isAttachedToWindow()) {
            d(hVar, kVar, viewFindViewById, view);
            a(hVar, kVar, viewFindViewById);
        }
    }

    public static final void d(h hVar, View view, View view2, View view3) {
        view2.getLocationInWindow(new int[2]);
        view3.getLocationInWindow(new int[2]);
        hVar.f19867a.getLocationInWindow(new int[2]);
        view.setX(((view2.getWidth() / 2.0f) + (r1[0] - r2[0])) - (view.getMeasuredWidth() / 2.0f));
        view.setY((view3.getHeight() + (r0[1] - r2[1])) - view.getMeasuredHeight());
    }
}
