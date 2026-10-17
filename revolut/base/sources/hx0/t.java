package hx0;

import android.animation.Animator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f156340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f156341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f156342c;
    public final /* synthetic */ ArrayList d;

    public t(ArrayList arrayList, View view, float f, ArrayList arrayList2) {
        this.f156340a = arrayList;
        this.f156341b = view;
        this.f156342c = f;
        this.d = arrayList2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = this.f156340a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setHasTransientState(true);
        }
        this.f156341b.setTranslationY(this.f156342c);
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((View) arrayList2.get(i2)).setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
