package n7i;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.u f213113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213114b;

    public h(ParcelableDestination parcelableDestination, boolean z) {
        this.f213113a = parcelableDestination;
        this.f213114b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f213113a, hVar.f213113a) && this.f213114b == hVar.f213114b;
    }

    public final int hashCode() {
        aii.u uVar = this.f213113a;
        return Boolean.hashCode(this.f213114b) + ((uVar == null ? 0 : uVar.hashCode()) * 31);
    }
}
