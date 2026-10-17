package x35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302650c;
    public final String d;
    public final String e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f302651g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String logoUrl, String bankName, String mandateReference, h iban, String beneficiaryName) {
        super(iban, beneficiaryName);
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(mandateReference, "mandateReference");
        Intrinsics.checkNotNullParameter(iban, "iban");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        this.f302650c = logoUrl;
        this.d = bankName;
        this.e = mandateReference;
        this.f = iban;
        this.f302651g = beneficiaryName;
    }

    @Override // x35.e
    public final String a() {
        return this.f302651g;
    }

    @Override // x35.e
    public final h b() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f302650c, bVar.f302650c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f302651g, bVar.f302651g);
    }

    public final int hashCode() {
        return this.f302651g.hashCode() + p.a.c(p.a.c(p.a.c(this.f302650c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f.f302658a);
    }
}
