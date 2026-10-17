package k8g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f182141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f182142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f182143c;
    public final Data d;
    public final boolean e;
    public final boolean f;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data data, Data data2, Data data3, Data data4, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = kVar.f182141a;
        }
        Data accounts = data;
        if ((i & 2) != 0) {
            data2 = kVar.f182142b;
        }
        Data agents = data2;
        if ((i & 4) != 0) {
            data3 = kVar.f182143c;
        }
        Data transactions = data3;
        if ((i & 8) != 0) {
            data4 = kVar.d;
        }
        Data lifestyleBorderlessFooter = data4;
        if ((i & 16) != 0) {
            z = kVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = kVar.f;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(agents, "agents");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        return new k(accounts, agents, transactions, lifestyleBorderlessFooter, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f182141a, kVar.f182141a) && Intrinsics.f(this.f182142b, kVar.f182142b) && Intrinsics.f(this.f182143c, kVar.f182143c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && this.f == kVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(kii.e.c(this.d, kii.e.c(this.f182143c, kii.e.c(this.f182142b, this.f182141a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public k(Data accounts, Data agents, Data transactions, Data lifestyleBorderlessFooter, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(agents, "agents");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        this.f182141a = accounts;
        this.f182142b = agents;
        this.f182143c = transactions;
        this.d = lifestyleBorderlessFooter;
        this.e = z;
        this.f = z3;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true, false);
    }
}
