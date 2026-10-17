package mnl;

import jkl.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f207517a;

    public c(a3 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f207517a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f207517a == ((c) obj2).f207517a;
    }

    public final int hashCode() {
        return this.f207517a.hashCode();
    }
}
