package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f227843c;
    public final r d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi0.b f227844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227845h;
    public final zm3.l i;

    public m(String memberId, String groupId, r inviterId, r contactId, String firstName, String lastName, wi0.b bVar, boolean z, zm3.l lVar) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(inviterId, "inviterId");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f227841a = memberId;
        this.f227842b = groupId;
        this.f227843c = inviterId;
        this.d = contactId;
        this.e = firstName;
        this.f = lastName;
        this.f227844g = bVar;
        this.f227845h = z;
        this.i = lVar;
    }

    @Override // oq9.o
    public final String a() {
        return this.f227842b;
    }

    @Override // oq9.o
    public final String b() {
        return this.f227841a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f227841a, mVar.f227841a) && Intrinsics.f(this.f227842b, mVar.f227842b) && Intrinsics.f(this.f227843c, mVar.f227843c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f227844g, mVar.f227844g) && this.f227845h == mVar.f227845h && Intrinsics.f(this.i, mVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.d.hashCode() + ((this.f227843c.hashCode() + p.a.c(this.f227841a.hashCode() * 31, 31, this.f227842b)) * 31)) * 31, 31, this.e), 31, this.f);
        wi0.b bVar = this.f227844g;
        int iC2 = j6.a.c((iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f227845h);
        zm3.l lVar = this.i;
        return iC2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
