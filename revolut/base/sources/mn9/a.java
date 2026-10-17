package mn9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207489c;

    public a(String title, String str, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f207487a = title;
        this.f207488b = str;
        this.f207489c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207487a, aVar.f207487a) && Intrinsics.f(this.f207488b, aVar.f207488b) && this.f207489c == aVar.f207489c;
    }

    public final int hashCode() {
        int iHashCode = this.f207487a.hashCode() * 31;
        String str = this.f207488b;
        return Integer.hashCode(this.f207489c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
