package g98;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jc8.a f141497b;

    public b(String juniorId, jc8.a cardRequest) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(cardRequest, "cardRequest");
        this.f141496a = juniorId;
        this.f141497b = cardRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f141496a, bVar.f141496a) && Intrinsics.f(this.f141497b, bVar.f141497b);
    }

    public final int hashCode() {
        return this.f141497b.hashCode() + (this.f141496a.hashCode() * 31);
    }
}
