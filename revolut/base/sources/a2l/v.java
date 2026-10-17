package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f931b;

    public v(String label, w wVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f930a = label;
        this.f931b = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f930a, vVar.f930a) && this.f931b == vVar.f931b;
    }

    public final int hashCode() {
        int iHashCode = this.f930a.hashCode() * 31;
        w wVar = this.f931b;
        return iHashCode + (wVar == null ? 0 : wVar.hashCode());
    }
}
