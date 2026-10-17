package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249208a;

    public h(String actionPath) {
        Intrinsics.checkNotNullParameter(actionPath, "actionPath");
        this.f249208a = actionPath;
    }

    @Override // qu3.l
    public final String G5() {
        return this.f249208a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f249208a, ((h) obj2).f249208a);
    }

    public final int hashCode() {
        return this.f249208a.hashCode();
    }
}
