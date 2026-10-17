package jv;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f178705a;

    public j(r rVar) {
        this.f178705a = rVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (h.f178704a[event.ordinal()] == 1) {
            r rVar = this.f178705a;
            e0.C(LifecycleOwnerKt.getLifecycleScope(rVar.f178719c), null, null, new i(rVar, null), 3);
        }
    }
}
