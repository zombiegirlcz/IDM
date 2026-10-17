package gq0;

import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackableItem f145505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final py0.d f145506b;

    public n(TrackableItem component, py0.d dVar) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f145505a = component;
        this.f145506b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f145505a, nVar.f145505a) && Intrinsics.f(this.f145506b, nVar.f145506b);
    }

    public final int hashCode() {
        int iHashCode = this.f145505a.hashCode() * 31;
        py0.d dVar = this.f145506b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
