package qqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f248542a;

    public j(krf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        Intrinsics.checkNotNullParameter("SELECT_REASON_BUTTON_TAG", "buttonTag");
        this.f248542a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f248542a, ((j) obj2).f248542a);
    }

    public final int hashCode() {
        return (this.f248542a.hashCode() * 31) + 710274373;
    }
}
