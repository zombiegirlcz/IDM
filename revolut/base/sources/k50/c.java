package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends aii.m implements aii.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181036c;
    public final String d;

    public c(String tipId, String str, String str2) {
        Intrinsics.checkNotNullParameter(tipId, "tipId");
        this.f181035b = tipId;
        this.f181036c = str;
        this.d = str2;
    }

    @Override // aii.f
    public final bki.a a() {
        return new b(this.f181035b, this.f181036c, this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f181035b, cVar.f181035b) && Intrinsics.f(this.f181036c, cVar.f181036c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f181035b.hashCode() * 31;
        String str = this.f181036c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
