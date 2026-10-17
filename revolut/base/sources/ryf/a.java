package ryf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258368b;

    public a(String id10, String privacyPolicyUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(privacyPolicyUrl, "privacyPolicyUrl");
        this.f258367a = id10;
        this.f258368b = privacyPolicyUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f258367a, aVar.f258367a) && Intrinsics.f(this.f258368b, aVar.f258368b);
    }

    public final int hashCode() {
        return this.f258368b.hashCode() + (this.f258367a.hashCode() * 31);
    }
}
