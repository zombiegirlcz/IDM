package h02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148187c;
    public final String d;
    public final String e;
    public final String f;

    public d(String pin, String ids, String participantCode, String applicationCode, String bankHash, String codAct) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(participantCode, "participantCode");
        Intrinsics.checkNotNullParameter(applicationCode, "applicationCode");
        Intrinsics.checkNotNullParameter(bankHash, "bankHash");
        Intrinsics.checkNotNullParameter(codAct, "codAct");
        this.f148185a = pin;
        this.f148186b = ids;
        this.f148187c = participantCode;
        this.d = applicationCode;
        this.e = bankHash;
        this.f = codAct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f148185a, dVar.f148185a) && Intrinsics.f(this.f148186b, dVar.f148186b) && Intrinsics.f(this.f148187c, dVar.f148187c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f148185a.hashCode() * 31, 31, this.f148186b), 31, this.f148187c), 31, this.d), 31, this.e);
    }
}
