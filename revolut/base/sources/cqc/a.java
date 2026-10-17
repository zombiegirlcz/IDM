package cqc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f108072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f108073c;
    public final long d;
    public final Long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f108074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f108075h;
    public final String i;

    public a(String id10, d state, c disputeReason, long j2, Long l2, String str, b bVar, Long l3, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(disputeReason, "disputeReason");
        this.f108071a = id10;
        this.f108072b = state;
        this.f108073c = disputeReason;
        this.d = j2;
        this.e = l2;
        this.f = str;
        this.f108074g = bVar;
        this.f108075h = l3;
        this.i = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f108071a, aVar.f108071a) && this.f108072b == aVar.f108072b && this.f108073c == aVar.f108073c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f108074g == aVar.f108074g && Intrinsics.f(this.f108075h, aVar.f108075h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f108073c.hashCode() + ((this.f108072b.hashCode() + (this.f108071a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Long l2 = this.e;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f108074g;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l3 = this.f108075h;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
