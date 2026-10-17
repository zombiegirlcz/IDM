package uh0;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.b f280050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.c f280051b;

    public b(vc.b installManager, vc.c state) {
        Intrinsics.checkNotNullParameter(installManager, "installManager");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f280050a = installManager;
        this.f280051b = state;
    }

    public final void a(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f280050a.d(this.f280051b, activity, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f280050a, bVar.f280050a) && Intrinsics.f(this.f280051b, bVar.f280051b);
    }

    public final int hashCode() {
        return this.f280051b.hashCode() + (this.f280050a.hashCode() * 31);
    }
}
