package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323547a;

    public b0(String dataPlanId) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        this.f323547a = dataPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f323547a, ((b0) obj2).f323547a);
    }

    public final int hashCode() {
        return this.f323547a.hashCode();
    }
}
