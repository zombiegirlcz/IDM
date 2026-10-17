package ss7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265353c;
    public final b d;

    public c(String title, String str, String str2, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f265351a = title;
        this.f265352b = str;
        this.f265353c = str2;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265351a, cVar.f265351a) && Intrinsics.f(this.f265352b, cVar.f265352b) && Intrinsics.f(this.f265353c, cVar.f265353c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f265351a.hashCode() * 31;
        String str = this.f265352b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f265353c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.d;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
