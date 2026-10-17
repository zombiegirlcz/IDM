package phc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236262b;

    public h(String perkId, String userId) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f236261a = perkId;
        this.f236262b = userId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f236261a, hVar.f236261a) && Intrinsics.f(this.f236262b, hVar.f236262b);
    }

    public final int hashCode() {
        return this.f236262b.hashCode() + (this.f236261a.hashCode() * 31);
    }
}
