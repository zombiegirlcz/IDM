package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f253595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253596b;

    public b(a contactDetails, String message) {
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f253595a = contactDetails;
        this.f253596b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f253595a, bVar.f253595a) && Intrinsics.f(this.f253596b, bVar.f253596b);
    }

    public final int hashCode() {
        return this.f253596b.hashCode() + (this.f253595a.hashCode() * 31);
    }
}
