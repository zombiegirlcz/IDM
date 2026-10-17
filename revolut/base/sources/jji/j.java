package jji;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectFloatMap;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import au0.x5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends lki.b {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f174968g;

    public j(String mainElementId) {
        Intrinsics.checkNotNullParameter(mainElementId, "mainElementId");
        this.f174968g = mainElementId;
    }

    @Override // lki.b
    public final Animator a(View view, View to6, boolean z) {
        ViewGroup viewGroup;
        View viewG;
        if (to6 == null || z || !to6.isHardwareAccelerated()) {
            return (AnimatorSet) new k(lki.u.END_TO_START).a(view, to6, z);
        }
        Intrinsics.checkNotNullParameter(to6, "to");
        String mainElementId = this.f174968g;
        Intrinsics.checkNotNullParameter(mainElementId, "mainElementId");
        AnimatorSet animatorSet = null;
        if ((to6 instanceof ViewGroup) && (viewG = kotlin.jvm.internal.s.g((viewGroup = (ViewGroup) to6), mainElementId)) != null) {
            ViewParent parent = viewG.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null) {
                List listJ = nkm.y.J(nkm.y.n(ViewGroupKt.getChildren(recyclerView), new ccb.b(viewG, 4)));
                List listJ2 = nkm.y.J(nkm.y.n(ViewGroupKt.getChildren(viewGroup), new hx0.r(recyclerView, 0)));
                ArrayList arrayListE0 = d0.E0(listJ2, listJ);
                ArrayList arrayListE02 = d0.E0(arrayListE0, zhm.u.c(viewG));
                float translationY = viewG.getTranslationY();
                MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(arrayListE0.size());
                int size = arrayListE0.size();
                for (int i = 0; i < size; i++) {
                    View view2 = (View) arrayListE0.get(i);
                    mutableObjectFloatMap.set(view2, view2.getAlpha());
                }
                to6.getLocationOnScreen(new int[2]);
                viewG.getLocationOnScreen(new int[2]);
                float height = ((((to6.getHeight() - viewG.getHeight()) / 2.0f) + r7[1]) - r14[1]) + translationY;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewG, (Property<View, Float>) View.TRANSLATION_Y, height, translationY);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
                objectAnimatorOfFloat.setDuration(1000L);
                objectAnimatorOfFloat.setStartDelay(0L);
                objectAnimatorOfFloat.setInterpolator(jq0.r.f177392a);
                objectAnimatorOfFloat.addListener(new hx0.s(ref$BooleanRef, viewG, translationY, arrayListE0, arrayListE02, mutableObjectFloatMap, ref$BooleanRef, viewG, translationY, arrayListE0, arrayListE02, mutableObjectFloatMap));
                AnimatorSet animatorSet2 = new AnimatorSet();
                List listC = zhm.u.c(objectAnimatorOfFloat);
                ArrayList arrayList = new ArrayList(listJ.size());
                int size2 = listJ.size();
                int i2 = 0;
                while (i2 < size2) {
                    int i3 = size2;
                    View view3 = (View) listJ.get(i2);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, mutableObjectFloatMap.get(view3));
                    Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
                    objectAnimatorOfFloat2.setDuration(500L);
                    objectAnimatorOfFloat2.setStartDelay(500L);
                    objectAnimatorOfFloat2.setInterpolator(jq0.r.f177392a);
                    arrayList.add(objectAnimatorOfFloat2);
                    i2++;
                    size2 = i3;
                }
                ArrayList arrayListE03 = d0.E0(arrayList, listC);
                ArrayList arrayList2 = new ArrayList(listJ2.size());
                int size3 = listJ2.size();
                int i5 = 0;
                while (i5 < size3) {
                    View view4 = (View) listJ2.get(i5);
                    int i6 = size3;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED, mutableObjectFloatMap.get(view4));
                    Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat3, "ofFloat(...)");
                    objectAnimatorOfFloat3.setDuration(300L);
                    objectAnimatorOfFloat3.setStartDelay(700L);
                    objectAnimatorOfFloat3.setInterpolator(jq0.r.f177392a);
                    arrayList2.add(objectAnimatorOfFloat3);
                    i5++;
                    listJ2 = listJ2;
                    size3 = i6;
                }
                animatorSet2.playTogether(d0.E0(arrayList2, arrayListE03));
                animatorSet2.addListener(new hx0.t(arrayListE02, viewG, height, arrayListE0));
                animatorSet = animatorSet2;
            }
        }
        return animatorSet == null ? (AnimatorSet) new k(lki.u.END_TO_START).a(view, to6, z) : animatorSet;
    }

    @Override // lki.b
    public final void c(View view, lki.a animation) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animation, "animation");
        OneShotPreDrawListener.add(view, new x5(view, animation, 21));
    }
}
