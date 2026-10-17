package l0i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191252b;

    public a(String str, String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        this.f191251a = str;
        this.f191252b = registeredIdentityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f191251a, aVar.f191251a) && Intrinsics.f(this.f191252b, aVar.f191252b);
    }

    public final int hashCode() {
        String str = this.f191251a;
        return this.f191252b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
