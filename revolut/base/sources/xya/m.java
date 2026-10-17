package xya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f309689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f309690b;

    public m(l invitesList, boolean z) {
        Intrinsics.checkNotNullParameter(invitesList, "invitesList");
        this.f309689a = invitesList;
        this.f309690b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f309689a, mVar.f309689a) && this.f309690b == mVar.f309690b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309690b) + (this.f309689a.hashCode() * 31);
    }
}
