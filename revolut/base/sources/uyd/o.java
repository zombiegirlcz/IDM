package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284233b;

    public o(String groupId, String pocketId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f284232a = groupId;
        this.f284233b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f284232a, oVar.f284232a) && Intrinsics.f(this.f284233b, oVar.f284233b);
    }

    public final int hashCode() {
        return this.f284233b.hashCode() + (this.f284232a.hashCode() * 31);
    }
}
