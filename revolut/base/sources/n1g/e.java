package n1g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f211325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f211326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f211327c;
    public final boolean d;
    public final boolean e;

    public e(Data booking, Data transactions, Data allTransactions, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(booking, "booking");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(allTransactions, "allTransactions");
        this.f211325a = booking;
        this.f211326b = transactions;
        this.f211327c = allTransactions;
        this.d = z;
        this.e = z3;
    }

    public static e a(e eVar, Data data, Data data2, Data data3, boolean z, int i) {
        if ((i & 1) != 0) {
            data = eVar.f211325a;
        }
        Data booking = data;
        if ((i & 2) != 0) {
            data2 = eVar.f211326b;
        }
        Data transactions = data2;
        if ((i & 4) != 0) {
            data3 = eVar.f211327c;
        }
        Data allTransactions = data3;
        boolean z3 = (i & 8) != 0 ? eVar.d : true;
        if ((i & 16) != 0) {
            z = eVar.e;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(booking, "booking");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(allTransactions, "allTransactions");
        return new e(booking, transactions, allTransactions, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f211325a, eVar.f211325a) && Intrinsics.f(this.f211326b, eVar.f211326b) && Intrinsics.f(this.f211327c, eVar.f211327c) && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(kii.e.c(this.f211327c, kii.e.c(this.f211326b, this.f211325a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
