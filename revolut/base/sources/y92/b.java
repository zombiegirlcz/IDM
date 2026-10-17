package y92;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f311738c;
    public final String d;
    public final String e;

    public b(String pin, String ids, String participantCode, String applicationCode, String bankHash) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(participantCode, "participantCode");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        Intrinsics.checkNotNullParameter(bankHash, "bankHash");
        this.f311736a = pin;
        this.f311737b = ids;
        this.f311738c = participantCode;
        this.d = applicationCode;
        this.e = bankHash;
    }

    @Override // y92.a
    public final String a() {
        return this.d;
    }

    @Override // y92.a
    public final String b() {
        return this.f311738c;
    }

    @Override // y92.a
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f311736a, bVar.f311736a) && Intrinsics.f(this.f311737b, bVar.f311737b) && Intrinsics.f(this.f311738c, bVar.f311738c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    @Override // y92.a
    public final String getIds() {
        return this.f311737b;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f311736a.hashCode() * 31, 31, this.f311737b), 31, this.f311738c), 31, this.d);
    }
}
