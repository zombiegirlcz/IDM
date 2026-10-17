package mg2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f205141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f205142b;

    public d(Data upiData, Long l2) {
        Intrinsics.checkNotNullParameter(upiData, "upiData");
        this.f205141a = upiData;
        this.f205142b = l2;
    }

    public static d a(d dVar, Data upiData, Long l2, int i) {
        if ((i & 1) != 0) {
            upiData = dVar.f205141a;
        }
        if ((i & 2) != 0) {
            l2 = dVar.f205142b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(upiData, "upiData");
        return new d(upiData, l2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f205141a, dVar.f205141a) && Intrinsics.f(this.f205142b, dVar.f205142b);
    }

    public final int hashCode() {
        int iHashCode = this.f205141a.hashCode() * 31;
        Long l2 = this.f205142b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
