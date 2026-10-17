package ta;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f269065b;

    public c(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f269064a = title;
        this.f269065b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f269064a, cVar.f269064a) && Intrinsics.f(this.f269065b, cVar.f269065b);
    }

    public final int hashCode() {
        int iHashCode = this.f269064a.hashCode() * 31;
        String str = this.f269065b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j6.a.s("ConsentItem(title=", this.f269064a, ", subtitle=", this.f269065b, ")");
    }
}
