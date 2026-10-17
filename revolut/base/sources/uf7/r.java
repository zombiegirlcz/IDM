package uf7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279617a;

    public r(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f279617a = actionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f279617a, ((r) obj2).f279617a);
    }

    public final int hashCode() {
        return this.f279617a.hashCode();
    }
}
