package fij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135462b;

    public u(String mobilePlanId, String str) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f135461a = mobilePlanId;
        this.f135462b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f135461a, uVar.f135461a) && Intrinsics.f(this.f135462b, uVar.f135462b);
    }

    public final int hashCode() {
        int iHashCode = this.f135461a.hashCode() * 31;
        String str = this.f135462b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
