package mpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f207810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207811b;

    public c(wi0.b addedCountryCode, String str) {
        Intrinsics.checkNotNullParameter(addedCountryCode, "addedCountryCode");
        this.f207810a = addedCountryCode;
        this.f207811b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f207810a, cVar.f207810a) && Intrinsics.f(this.f207811b, cVar.f207811b);
    }

    public final int hashCode() {
        int iHashCode = this.f207810a.f297794a.hashCode() * 31;
        String str = this.f207811b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
