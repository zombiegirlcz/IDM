package eh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.c f125778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125780c;

    public f(k71.c groupId, String str, String str2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f125778a = groupId;
        this.f125779b = str;
        this.f125780c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f125778a, fVar.f125778a) && Intrinsics.f(this.f125779b, fVar.f125779b) && Intrinsics.f(this.f125780c, fVar.f125780c);
    }

    public final int hashCode() {
        int iHashCode = this.f125778a.f181775b.hashCode() * 31;
        String str = this.f125779b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f125780c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
