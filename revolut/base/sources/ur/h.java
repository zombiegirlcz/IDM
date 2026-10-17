package ur;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282226b;

    public h(String str, String str2) {
        this.f282225a = str;
        this.f282226b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f282225a, hVar.f282225a) && Intrinsics.f(this.f282226b, hVar.f282226b);
    }

    public final int hashCode() {
        String str = this.f282225a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f282226b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
