package ukl;

import jkl.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f280795a;

    public d(a3 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f280795a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f280795a == ((d) obj2).f280795a;
    }

    public final int hashCode() {
        return this.f280795a.hashCode();
    }
}
