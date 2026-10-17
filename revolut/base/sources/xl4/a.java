package xl4;

import aii.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306935a;

    public a(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f306935a = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f306935a, ((a) obj2).f306935a);
    }

    public final int hashCode() {
        return this.f306935a.hashCode();
    }
}
