package hj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152626c;
    public final String d;
    public final a e;

    public b(String key, String title, String str, String str2, a aVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f152624a = key;
        this.f152625b = title;
        this.f152626c = str;
        this.d = str2;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f152624a, bVar.f152624a) && Intrinsics.f(this.f152625b, bVar.f152625b) && Intrinsics.f(this.f152626c, bVar.f152626c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f152624a.hashCode() * 31, 31, this.f152625b);
        String str = this.f152626c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.e;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
