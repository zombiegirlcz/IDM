package prf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends qk.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239004c;
    public final String d;

    public c(String accountId, String savingsCurrencyCode, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(savingsCurrencyCode, "savingsCurrencyCode");
        this.f239003b = accountId;
        this.f239004c = savingsCurrencyCode;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f239003b, cVar.f239003b) && Intrinsics.f(this.f239004c, cVar.f239004c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f239003b.hashCode() * 31, 31, this.f239004c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // qk.d
    public final String i() {
        return this.d;
    }
}
