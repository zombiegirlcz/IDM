package mm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f207122c;
    public final String d;

    public q(String id10, Long l2, String rawValue, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f207120a = id10;
        this.f207121b = rawValue;
        this.f207122c = l2;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f207120a, qVar.f207120a) && Intrinsics.f(this.f207121b, qVar.f207121b) && Intrinsics.f(this.f207122c, qVar.f207122c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f207120a.hashCode() * 31, 31, this.f207121b);
        Long l2 = this.f207122c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
