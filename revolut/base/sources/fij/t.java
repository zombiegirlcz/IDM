package fij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135460b;

    public t(String dataPlanId, String str) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        this.f135459a = dataPlanId;
        this.f135460b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f135459a, tVar.f135459a) && Intrinsics.f(this.f135460b, tVar.f135460b);
    }

    public final int hashCode() {
        int iHashCode = this.f135459a.hashCode() * 31;
        String str = this.f135460b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
