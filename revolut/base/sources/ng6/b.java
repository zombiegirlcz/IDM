package ng6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215120b;

    public b(String consentId, String pocketId) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f215119a = consentId;
        this.f215120b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f215119a, bVar.f215119a) && Intrinsics.f(this.f215120b, bVar.f215120b);
    }

    public final int hashCode() {
        return this.f215120b.hashCode() + (this.f215119a.hashCode() * 31);
    }
}
