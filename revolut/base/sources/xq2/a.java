package xq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f308051c;
    public final f d;

    public a(String str, String str2, g type, f source) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f308049a = str;
        this.f308050b = str2;
        this.f308051c = type;
        this.d = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f308049a, aVar.f308049a) && Intrinsics.f(this.f308050b, aVar.f308050b) && this.f308051c == aVar.f308051c && this.d == aVar.d;
    }

    public final int hashCode() {
        String str = this.f308049a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f308050b;
        return this.d.hashCode() + ((this.f308051c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
