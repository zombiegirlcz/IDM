package t36;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f267669b;

    public h(String groupId, String legId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f267668a = groupId;
        this.f267669b = legId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f267668a, hVar.f267668a) && Intrinsics.f(this.f267669b, hVar.f267669b);
    }

    public final int hashCode() {
        return this.f267669b.hashCode() + (this.f267668a.hashCode() * 31);
    }
}
