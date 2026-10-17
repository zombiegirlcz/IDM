package bk4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16256b;

    public e(String accountNumber, String sortCode) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        this.f16255a = accountNumber;
        this.f16256b = sortCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f16255a, eVar.f16255a) && Intrinsics.f(this.f16256b, eVar.f16256b);
    }

    public final int hashCode() {
        return this.f16256b.hashCode() + (this.f16255a.hashCode() * 31);
    }
}
