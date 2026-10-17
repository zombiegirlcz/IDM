package bte;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f18564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f18565c;

    public b(c appTipsShownCountBinding, Set customBindings) {
        Intrinsics.checkNotNullParameter(appTipsShownCountBinding, "appTipsShownCountBinding");
        Intrinsics.checkNotNullParameter(customBindings, "customBindings");
        this.f18563a = appTipsShownCountBinding;
        this.f18564b = customBindings;
        this.f18565c = new AtomicBoolean(false);
    }

    @Override // bte.a
    public final void start() {
        if (this.f18565c.getAndSet(true)) {
            return;
        }
        Iterator it8 = a1.l(y0.b(this.f18563a), this.f18564b).iterator();
        while (it8.hasNext()) {
            ((a) it8.next()).start();
        }
    }
}
