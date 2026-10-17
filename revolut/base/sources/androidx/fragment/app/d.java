package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import androidx.fragment.app.SpecialEffectsController;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7425c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f7423a = i;
        this.f7424b = obj2;
        this.f7425c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7423a) {
            case 0:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1.invoke$lambda$2((DefaultSpecialEffectsController.TransitionEffect) this.f7424b, (ViewGroup) this.f7425c);
                break;
            default:
                DefaultSpecialEffectsController.collectEffects$lambda$2((DefaultSpecialEffectsController) this.f7424b, (SpecialEffectsController.Operation) this.f7425c);
                break;
        }
    }
}
