package gnl;

import gkl.l1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f145040a;

    public l(l1 option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f145040a = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f145040a, ((l) obj2).f145040a);
    }

    public final int hashCode() {
        return this.f145040a.hashCode();
    }
}
