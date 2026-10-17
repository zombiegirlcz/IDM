package fo3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f136799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f136800c;

    public a(String pocketId, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f136798a = pocketId;
        this.f136799b = l2;
        this.f136800c = l3;
    }

    public final Long a() {
        return this.f136799b;
    }

    public final Long b() {
        return this.f136800c;
    }

    public final String c() {
        return this.f136798a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136798a, aVar.f136798a) && Intrinsics.f(this.f136799b, aVar.f136799b) && Intrinsics.f(this.f136800c, aVar.f136800c);
    }

    public final int hashCode() {
        int iHashCode = this.f136798a.hashCode() * 31;
        Long l2 = this.f136799b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f136800c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
