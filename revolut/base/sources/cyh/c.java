package cyh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f110095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f110096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f110097c;
    public final boolean d;
    public final boolean e;

    public c(Data recurringPayment, Data isUserFromUs, Data transactionState, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(isUserFromUs, "isUserFromUs");
        Intrinsics.checkNotNullParameter(transactionState, "transactionState");
        this.f110095a = recurringPayment;
        this.f110096b = isUserFromUs;
        this.f110097c = transactionState;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f110095a, cVar.f110095a) && Intrinsics.f(this.f110096b, cVar.f110096b) && Intrinsics.f(this.f110097c, cVar.f110097c) && this.d == cVar.d && this.e == cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(kii.e.c(this.f110097c, kii.e.c(this.f110096b, this.f110095a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
