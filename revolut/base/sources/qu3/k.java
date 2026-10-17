package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249211a;

    public k(String actionPath) {
        Intrinsics.checkNotNullParameter(actionPath, "actionPath");
        this.f249211a = actionPath;
    }

    @Override // qu3.l
    public final String G5() {
        return this.f249211a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f249211a, ((k) obj2).f249211a);
    }

    public final int hashCode() {
        return this.f249211a.hashCode();
    }
}
