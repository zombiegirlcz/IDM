package x0m;

import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import z0m.j;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(new d());
            d.f301662a = c.COMPLETE;
        } catch (NoClassDefFoundError unused) {
            b bVar = d.Companion;
            d.f301662a = c.NONE;
            Intrinsics.checkNotNullExpressionValue("d", "TAG");
            j.b("d", "Class 'ProcessLifecycleOwner' not found. The tracker can't track lifecycle events.", new Object[0]);
        }
    }
}
