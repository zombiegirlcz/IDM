package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7417c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f7415a = i;
        this.f7416b = obj2;
        this.f7417c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7415a) {
            case 0:
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0((ViewGroup) this.f7416b, (View) this.f7417c, (DefaultSpecialEffectsController.AnimationEffect) this.d);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12((SpecialEffectsController.Operation) this.f7416b, (SpecialEffectsController.Operation) this.f7417c, (DefaultSpecialEffectsController.TransitionEffect) this.d);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13((FragmentTransitionImpl) this.f7416b, (View) this.f7417c, (Rect) this.d);
                break;
        }
    }
}
