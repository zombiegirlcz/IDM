package vh2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f289272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.c f289273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.m f289274c;
    public final b d;
    public final e e;
    public final a12.l f;

    public d(wi0.b userCountry, a12.c contactsInfo, a12.m transactionsInfo, b disputesInfo, e requestLinksInfo, a12.l lVar) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        Intrinsics.checkNotNullParameter(transactionsInfo, "transactionsInfo");
        Intrinsics.checkNotNullParameter(disputesInfo, "disputesInfo");
        Intrinsics.checkNotNullParameter(requestLinksInfo, "requestLinksInfo");
        this.f289272a = userCountry;
        this.f289273b = contactsInfo;
        this.f289274c = transactionsInfo;
        this.d = disputesInfo;
        this.e = requestLinksInfo;
        this.f = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f289272a, dVar.f289272a) && Intrinsics.f(this.f289273b, dVar.f289273b) && Intrinsics.f(this.f289274c, dVar.f289274c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d((this.d.hashCode() + ((this.f289274c.hashCode() + p.a.d(this.f289272a.f297794a.hashCode() * 31, 31, this.f289273b.f468a)) * 31)) * 31, 31, this.e.f289275a);
        a12.l lVar = this.f;
        return iD + (lVar == null ? 0 : lVar.hashCode());
    }
}
