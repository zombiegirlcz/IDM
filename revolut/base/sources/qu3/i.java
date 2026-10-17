package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249209a;

    public i(String actionPath) {
        Intrinsics.checkNotNullParameter(actionPath, "actionPath");
        this.f249209a = actionPath;
    }

    @Override // qu3.l
    public final String G5() {
        return this.f249209a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f249209a, ((i) obj2).f249209a);
    }

    public final int hashCode() {
        return this.f249209a.hashCode();
    }
}
