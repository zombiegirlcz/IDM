package tg6;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271101c;
    public final String d;

    public b(d money, String pocketId, String financialInstitutionCode, String str) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(financialInstitutionCode, "financialInstitutionCode");
        this.f271099a = money;
        this.f271100b = pocketId;
        this.f271101c = financialInstitutionCode;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f271099a, bVar.f271099a) && Intrinsics.f(this.f271100b, bVar.f271100b) && Intrinsics.f(this.f271101c, bVar.f271101c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f271099a.hashCode() * 31, 31, this.f271100b), 31, this.f271101c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
