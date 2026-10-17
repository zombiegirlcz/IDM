package dz4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121237c;
    public final String d;

    public a(String id10, String accountNumber, String str, String debtorName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(debtorName, "debtorName");
        this.f121235a = id10;
        this.f121236b = accountNumber;
        this.f121237c = str;
        this.d = debtorName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121235a, aVar.f121235a) && Intrinsics.f(this.f121236b, aVar.f121236b) && Intrinsics.f(this.f121237c, aVar.f121237c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f121235a.hashCode() * 31, 31, this.f121236b);
        String str = this.f121237c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
