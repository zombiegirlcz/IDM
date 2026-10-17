package i56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158777b;

    public i(String groupId, String legId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f158776a = groupId;
        this.f158777b = legId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f158776a, iVar.f158776a) && Intrinsics.f(this.f158777b, iVar.f158777b);
    }

    public final int hashCode() {
        return this.f158777b.hashCode() + (this.f158776a.hashCode() * 31);
    }
}
