package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7419b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f7418a = i;
        this.f7419b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7418a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4((Ref$ObjectRef) this.f7419b);
                break;
            case 1:
                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14((ArrayList) this.f7419b);
                break;
            case 2:
                DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1.invoke$lambda$4((DefaultSpecialEffectsController.TransitionEffect) this.f7419b);
                break;
            default:
                ((FragmentManager) this.f7419b).lambda$cancelBackStackTransition$4();
                break;
        }
    }
}
