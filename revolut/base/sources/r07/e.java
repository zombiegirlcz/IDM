package r07;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.j f250709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250710b;

    public e(ds6.j taxType, String str) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f250709a = taxType;
        this.f250710b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f250709a == eVar.f250709a && Intrinsics.f(this.f250710b, eVar.f250710b);
    }

    public final int hashCode() {
        int iHashCode = this.f250709a.hashCode() * 31;
        String str = this.f250710b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
