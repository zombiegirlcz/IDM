package k6e;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f181701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181702b;

    public f(p recurringPayment, String accountId) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f181701a = recurringPayment;
        this.f181702b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f181701a, fVar.f181701a) && Intrinsics.f(this.f181702b, fVar.f181702b);
    }

    public final int hashCode() {
        return this.f181702b.hashCode() + (this.f181701a.hashCode() * 31);
    }
}
