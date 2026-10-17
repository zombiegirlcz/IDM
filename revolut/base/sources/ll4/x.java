package ll4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f196555c;

    public x(String beneficiaryName, String bank, String clabe) {
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(bank, "bank");
        Intrinsics.checkNotNullParameter(clabe, "clabe");
        this.f196553a = beneficiaryName;
        this.f196554b = bank;
        this.f196555c = clabe;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f196553a, xVar.f196553a) && Intrinsics.f(this.f196554b, xVar.f196554b) && Intrinsics.f(this.f196555c, xVar.f196555c);
    }

    public final int hashCode() {
        return this.f196555c.hashCode() + p.a.c(this.f196553a.hashCode() * 31, 31, this.f196554b);
    }
}
