package po9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237933b;

    public s(String groupId, String legId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f237932a = groupId;
        this.f237933b = legId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f237932a, sVar.f237932a) && Intrinsics.f(this.f237933b, sVar.f237933b);
    }

    public final int hashCode() {
        return this.f237933b.hashCode() + (this.f237932a.hashCode() * 31);
    }
}
