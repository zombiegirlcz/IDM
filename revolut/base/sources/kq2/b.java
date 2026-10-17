package kq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188297b;

    public b(String groupId, String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f188296a = groupId;
        this.f188297b = str;
    }

    public static b a(b bVar, String str) {
        String groupId = bVar.f188296a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return new b(groupId, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f188296a, bVar.f188296a) && Intrinsics.f(this.f188297b, bVar.f188297b);
    }

    public final int hashCode() {
        int iHashCode = this.f188296a.hashCode() * 31;
        String str = this.f188297b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
