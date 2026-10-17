package kk9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vj9.b f184527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184528c;

    public e(String requestId, vj9.b parcel, String facilityId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f184526a = requestId;
        this.f184527b = parcel;
        this.f184528c = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f184526a, eVar.f184526a) && Intrinsics.f(this.f184527b, eVar.f184527b) && Intrinsics.f(this.f184528c, eVar.f184528c);
    }

    public final int hashCode() {
        return this.f184528c.hashCode() + ((this.f184527b.hashCode() + (this.f184526a.hashCode() * 31)) * 31);
    }
}
