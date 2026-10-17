package ull;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f281051c;

    public b(String accountsIdCurrent, List accounts, List selectedAccounts) {
        Intrinsics.checkNotNullParameter(accountsIdCurrent, "accountsIdCurrent");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        this.f281049a = accountsIdCurrent;
        this.f281050b = accounts;
        this.f281051c = selectedAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f281049a, bVar.f281049a) && Intrinsics.f(this.f281050b, bVar.f281050b) && Intrinsics.f(this.f281051c, bVar.f281051c);
    }

    public final int hashCode() {
        return this.f281051c.hashCode() + p.a.d(this.f281049a.hashCode() * 31, 31, this.f281050b);
    }
}
