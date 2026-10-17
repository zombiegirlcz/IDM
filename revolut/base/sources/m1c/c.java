package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201345b;

    public c(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f201344a = title;
        this.f201345b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f201344a, cVar.f201344a) && Intrinsics.f(this.f201345b, cVar.f201345b);
    }

    public final int hashCode() {
        int iHashCode = this.f201344a.hashCode() * 31;
        String str = this.f201345b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
