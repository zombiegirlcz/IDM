package p0c;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.h f231501b;

    public d(String selectedTransactionId, lk0.h hVar) {
        Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
        this.f231500a = selectedTransactionId;
        this.f231501b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f231500a, dVar.f231500a) && Intrinsics.f(this.f231501b, dVar.f231501b);
    }

    public final int hashCode() {
        int iHashCode = this.f231500a.hashCode() * 31;
        lk0.h hVar = this.f231501b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
