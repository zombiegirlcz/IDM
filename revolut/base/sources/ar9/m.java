package ar9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8564c;
    public final String d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f8565g;

    public m(String id10, String billId, String groupId, String ownerId, long j2, String currencyCode, jo3.b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(billId, "billId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f8562a = id10;
        this.f8563b = billId;
        this.f8564c = groupId;
        this.d = ownerId;
        this.e = j2;
        this.f = currencyCode;
        this.f8565g = bVar;
    }

    public final long a() {
        return this.e;
    }

    public final String b() {
        return this.f8563b;
    }

    public final String c() {
        return this.f;
    }

    public final jo3.b d() {
        return this.f8565g;
    }

    public final String e() {
        return this.f8564c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f8562a, mVar.f8562a) && Intrinsics.f(this.f8563b, mVar.f8563b) && Intrinsics.f(this.f8564c, mVar.f8564c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f8565g, mVar.f8565g);
    }

    public final String f() {
        return this.f8562a;
    }

    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(p.a.c(p.a.c(this.f8562a.hashCode() * 31, 31, this.f8563b), 31, this.f8564c), 31, this.d), 31, this.e), 31, this.f);
        jo3.b bVar = this.f8565g;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
