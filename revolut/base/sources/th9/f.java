package th9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.c f271334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271336c;

    public f(k71.c groupId, String str, String str2) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f271334a = groupId;
        this.f271335b = str;
        this.f271336c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f271334a, fVar.f271334a) && Intrinsics.f(this.f271335b, fVar.f271335b) && Intrinsics.f(this.f271336c, fVar.f271336c);
    }

    public final int hashCode() {
        int iHashCode = this.f271334a.f181775b.hashCode() * 31;
        String str = this.f271335b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f271336c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
