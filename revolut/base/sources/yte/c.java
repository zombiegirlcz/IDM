package yte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316706b;

    public c(String accountNumber, String accountHolder) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountHolder, "accountHolder");
        this.f316705a = accountNumber;
        this.f316706b = accountHolder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f316705a, cVar.f316705a) && Intrinsics.f(this.f316706b, cVar.f316706b);
    }

    public final int hashCode() {
        return this.f316706b.hashCode() + (this.f316705a.hashCode() * 31);
    }
}
