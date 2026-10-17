package y19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310334b;

    public c(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f310333a = title;
        this.f310334b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f310333a, cVar.f310333a) && Intrinsics.f(this.f310334b, cVar.f310334b);
    }

    public final int hashCode() {
        int iHashCode = this.f310333a.hashCode() * 31;
        String str = this.f310334b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
