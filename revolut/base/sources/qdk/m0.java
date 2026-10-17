package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xck.h f244974a;

    public m0(xck.h action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f244974a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f244974a, ((m0) obj2).f244974a);
    }

    public final int hashCode() {
        return this.f244974a.hashCode();
    }
}
