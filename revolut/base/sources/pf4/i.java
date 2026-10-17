package pf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235441a;

    public i(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f235441a = actionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f235441a, ((i) obj2).f235441a);
    }

    public final int hashCode() {
        return this.f235441a.hashCode();
    }
}
