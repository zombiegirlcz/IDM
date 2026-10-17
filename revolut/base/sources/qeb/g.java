package qeb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245107a;

    public g(String reservationId) {
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        this.f245107a = reservationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f245107a, ((g) obj2).f245107a);
    }

    public final int hashCode() {
        return this.f245107a.hashCode();
    }
}
