package androidx.fragment.app;

import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f7421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f7422c;

    public /* synthetic */ c(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.f7420a = i;
        this.f7421b = operation;
        this.f7422c = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7420a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(this.f7421b, this.f7422c);
                break;
            default:
                DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(this.f7421b, this.f7422c);
                break;
        }
    }
}
