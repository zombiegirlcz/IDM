package us7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f282832c;
    public final b d;

    public c(String str, String title, String str2, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f282830a = str;
        this.f282831b = title;
        this.f282832c = str2;
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
        return Intrinsics.f(this.f282830a, cVar.f282830a) && Intrinsics.f(this.f282831b, cVar.f282831b) && Intrinsics.f(this.f282832c, cVar.f282832c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        String str = this.f282830a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f282831b);
        String str2 = this.f282832c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
