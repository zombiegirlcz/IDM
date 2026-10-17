package qei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245179b;

    public n(String bookingId, String amendmentId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(amendmentId, "amendmentId");
        this.f245178a = bookingId;
        this.f245179b = amendmentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f245178a, nVar.f245178a) && Intrinsics.f(this.f245179b, nVar.f245179b);
    }

    public final int hashCode() {
        return this.f245179b.hashCode() + (this.f245178a.hashCode() * 31);
    }
}
