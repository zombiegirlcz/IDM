package syb;

import kotlin.jvm.internal.Intrinsics;
import lk0.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends com.revolut.feature.rev_points.impl.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f266646b;

    public b(String selectedTransactionId, h hVar) {
        Intrinsics.checkNotNullParameter(selectedTransactionId, "selectedTransactionId");
        this.f266645a = selectedTransactionId;
        this.f266646b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f266645a, bVar.f266645a) && Intrinsics.f(this.f266646b, bVar.f266646b);
    }

    public final int hashCode() {
        int iHashCode = this.f266645a.hashCode() * 31;
        h hVar = this.f266646b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
