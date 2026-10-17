package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f227838c;
    public final r d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi0.b f227839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227840h;
    public final zm3.l i;

    public l(String memberId, String groupId, r inviterId, r contactId, String firstName, String lastName, wi0.b bVar, boolean z, zm3.l lVar) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(inviterId, "inviterId");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f227836a = memberId;
        this.f227837b = groupId;
        this.f227838c = inviterId;
        this.d = contactId;
        this.e = firstName;
        this.f = lastName;
        this.f227839g = bVar;
        this.f227840h = z;
        this.i = lVar;
    }

    @Override // oq9.o
    public final String a() {
        return this.f227837b;
    }

    @Override // oq9.o
    public final String b() {
        return this.f227836a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f227836a, lVar.f227836a) && Intrinsics.f(this.f227837b, lVar.f227837b) && Intrinsics.f(this.f227838c, lVar.f227838c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f227839g, lVar.f227839g) && this.f227840h == lVar.f227840h && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.d.hashCode() + ((this.f227838c.hashCode() + p.a.c(this.f227836a.hashCode() * 31, 31, this.f227837b)) * 31)) * 31, 31, this.e), 31, this.f);
        wi0.b bVar = this.f227839g;
        int iC2 = j6.a.c((iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f227840h);
        zm3.l lVar = this.i;
        return iC2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
