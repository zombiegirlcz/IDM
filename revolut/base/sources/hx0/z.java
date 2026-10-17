package hx0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewOutlineProvider;
import au0.q4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f156349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewOutlineProvider f156350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f156351c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f156352g;

    public z(View view, ViewOutlineProvider viewOutlineProvider, boolean z, int i, View view2, x xVar, m0 m0Var) {
        this.f156349a = view;
        this.f156350b = viewOutlineProvider;
        this.f156351c = z;
        this.d = i;
        this.e = view2;
        this.f = xVar;
        this.f156352g = m0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f156349a;
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setOutlineProvider(this.f156350b);
        view.setClipToOutline(this.f156351c);
        view.setLayerType(this.d, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.e;
        view.setLayerType(2, null);
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        x xVar = this.f;
        view.setScaleX(xVar.f156346a);
        view.setScaleY(xVar.f156346a);
        view.setOutlineProvider(new q4(this.f156352g, 2));
        view.setClipToOutline(true);
    }
}
