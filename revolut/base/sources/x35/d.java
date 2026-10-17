package x35;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302652c;
    public final dj0.d d;
    public final c e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f302653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String id10, dj0.d balance, c type, h iban, String beneficiaryName) {
        super(iban, beneficiaryName);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(iban, "iban");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        this.f302652c = id10;
        this.d = balance;
        this.e = type;
        this.f = iban;
        this.f302653g = beneficiaryName;
    }

    @Override // x35.e
    public final String a() {
        return this.f302653g;
    }

    @Override // x35.e
    public final h b() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302652c, dVar.f302652c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f302653g, dVar.f302653g);
    }

    public final int hashCode() {
        return this.f302653g.hashCode() + p.a.c((this.e.hashCode() + v7.c(this.f302652c.hashCode() * 31, 31, this.d)) * 31, 31, this.f.f302658a);
    }
}
