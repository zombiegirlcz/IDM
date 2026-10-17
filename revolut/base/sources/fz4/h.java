package fz4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139094b;

    public h(String accountNumber, String sortCode) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        this.f139093a = accountNumber;
        this.f139094b = sortCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f139093a, hVar.f139093a) && Intrinsics.f(this.f139094b, hVar.f139094b);
    }

    public final int hashCode() {
        return this.f139094b.hashCode() + (this.f139093a.hashCode() * 31);
    }
}
