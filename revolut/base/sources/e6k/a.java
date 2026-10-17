package e6k;

import kotlin.jvm.internal.Intrinsics;
import qua.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f123014c;

    public a(String str, String str2, v vVar) {
        this.f123012a = str;
        this.f123013b = str2;
        this.f123014c = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f123012a, aVar.f123012a) && Intrinsics.f(this.f123013b, aVar.f123013b) && this.f123014c == aVar.f123014c;
    }

    public final int hashCode() {
        String str = this.f123012a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123013b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        v vVar = this.f123014c;
        return iHashCode2 + (vVar != null ? vVar.hashCode() : 0);
    }
}
