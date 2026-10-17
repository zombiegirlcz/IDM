package g2d;

import kotlin.jvm.internal.Intrinsics;
import z0h.t1;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements lgd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f139963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139964b;

    public e(t1 wealthDisclaimersData, boolean z) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
        this.f139963a = wealthDisclaimersData;
        this.f139964b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f139963a, eVar.f139963a) && this.f139964b == eVar.f139964b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139964b) + (this.f139963a.hashCode() * 31);
    }
}
