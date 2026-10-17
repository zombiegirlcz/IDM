package y92;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f311740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f311741c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f311742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f311743h;

    public c(String pin, String ids, String participantCode, String applicationCode, String bankHash, String str, String userPhoneNumber, String userPhonePrefix) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(participantCode, "participantCode");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        Intrinsics.checkNotNullParameter(bankHash, "bankHash");
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        Intrinsics.checkNotNullParameter(userPhonePrefix, "userPhonePrefix");
        this.f311739a = pin;
        this.f311740b = ids;
        this.f311741c = participantCode;
        this.d = applicationCode;
        this.e = bankHash;
        this.f = str;
        this.f311742g = userPhoneNumber;
        this.f311743h = userPhonePrefix;
    }

    @Override // y92.a
    public final String a() {
        return this.d;
    }

    @Override // y92.a
    public final String b() {
        return this.f311741c;
    }

    @Override // y92.a
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f311739a, cVar.f311739a) && Intrinsics.f(this.f311740b, cVar.f311740b) && Intrinsics.f(this.f311741c, cVar.f311741c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f311742g, cVar.f311742g) && Intrinsics.f(this.f311743h, cVar.f311743h);
    }

    @Override // y92.a
    public final String getIds() {
        return this.f311740b;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f311739a.hashCode() * 31, 31, this.f311740b), 31, this.f311741c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f311743h.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f311742g);
    }
}
