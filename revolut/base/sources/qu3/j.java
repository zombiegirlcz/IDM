package qu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249210a;

    public j(String actionPath) {
        Intrinsics.checkNotNullParameter(actionPath, "actionPath");
        this.f249210a = actionPath;
    }

    @Override // qu3.l
    public final String G5() {
        return this.f249210a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f249210a, ((j) obj2).f249210a);
    }

    public final int hashCode() {
        return this.f249210a.hashCode();
    }
}
