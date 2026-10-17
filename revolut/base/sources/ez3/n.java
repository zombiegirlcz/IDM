package ez3;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f130908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f130909b;

    public n(l selectSolicitor, HashMap actions) {
        Intrinsics.checkNotNullParameter(selectSolicitor, "selectSolicitor");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f130908a = selectSolicitor;
        this.f130909b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f130908a, nVar.f130908a) && Intrinsics.f(this.f130909b, nVar.f130909b);
    }

    public final int hashCode() {
        return this.f130909b.hashCode() + (this.f130908a.hashCode() * 31);
    }
}
