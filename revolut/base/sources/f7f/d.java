package f7f;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final alc.d f132604a;

    public d(alc.d selectedAction) {
        Intrinsics.checkNotNullParameter(selectedAction, "selectedAction");
        this.f132604a = selectedAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f132604a == ((d) obj2).f132604a;
    }

    public final int hashCode() {
        return this.f132604a.hashCode();
    }
}
