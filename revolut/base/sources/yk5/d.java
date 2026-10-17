package yk5;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f314573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f314574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f314575c;
    public final String d;
    public final dj0.d e;
    public final c f;

    public d(Instant updatedAt, String addressId, String str, String str2, dj0.d dVar, c cVar) {
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        this.f314573a = updatedAt;
        this.f314574b = addressId;
        this.f314575c = str;
        this.d = str2;
        this.e = dVar;
        this.f = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f314573a, dVar.f314573a) && Intrinsics.f(this.f314574b, dVar.f314574b) && Intrinsics.f(this.f314575c, dVar.f314575c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f314573a.hashCode() * 31, 31, this.f314574b);
        String str = this.f314575c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dj0.d dVar = this.e;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f;
        return iHashCode3 + (cVar != null ? cVar.f314572a.hashCode() : 0);
    }
}
