package lo;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f197310a;

    public b(d dVar) {
        this.f197310a = dVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d dVar = this.f197310a;
        a2 a2Var = dVar.f197316j;
        if (a2Var == null || !a2Var.d()) {
            dVar.f197317l.set(0);
            CoroutineScope coroutineScopeC = dVar.i.c();
            p0 p0Var = p0.f264001a;
            dVar.f197316j = e0.C(coroutineScopeC, elm.f.f127540b, null, new c(dVar, (Continuation) null, 0), 2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        d dVar = this.f197310a;
        a2 a2Var = dVar.f197316j;
        if (a2Var != null) {
            a2Var.f(null);
        }
        dVar.f197316j = null;
    }
}
