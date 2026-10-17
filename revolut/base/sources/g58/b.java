package g58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d58.f f140686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140687b;

    public b(d58.f invitation, String str) {
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        this.f140686a = invitation;
        this.f140687b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f140686a, bVar.f140686a) && Intrinsics.f(this.f140687b, bVar.f140687b);
    }

    public final int hashCode() {
        int iHashCode = this.f140686a.hashCode() * 31;
        String str = this.f140687b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
