package r8;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f252289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao.h f252290b;

    public k(ao.h hVar, Lifecycle lifecycle) {
        this.f252290b = hVar;
        this.f252289a = lifecycle;
    }

    @Override // r8.j
    public final void onDestroy() {
        ((HashMap) this.f252290b.f7847b).remove(this.f252289a);
    }

    @Override // r8.j
    public final void onStart() {
    }

    @Override // r8.j
    public final void onStop() {
    }
}
