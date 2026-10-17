package nc0;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qc0.h1;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f214111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f214112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f214113c;
    public final Set d;
    public final List e;
    public final Set f;

    public e(h1 params, long j2, boolean z, Set selected, List preselectedTransactions, Set transactions) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(preselectedTransactions, "preselectedTransactions");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f214111a = params;
        this.f214112b = j2;
        this.f214113c = z;
        this.d = selected;
        this.e = preselectedTransactions;
        this.f = transactions;
    }

    public static e a(e eVar, long j2, boolean z, Set selected, List preselectedTransactions, LinkedHashSet linkedHashSet, int i) {
        long j3 = j2;
        h1 params = eVar.f214111a;
        if ((i & 2) != 0) {
            j3 = eVar.f214112b;
        }
        if ((i & 4) != 0) {
            z = eVar.f214113c;
        }
        if ((i & 8) != 0) {
            selected = eVar.d;
        }
        if ((i & 16) != 0) {
            preselectedTransactions = eVar.e;
        }
        Set set = linkedHashSet;
        if ((i & 32) != 0) {
            set = eVar.f;
        }
        Set transactions = set;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(preselectedTransactions, "preselectedTransactions");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List list = preselectedTransactions;
        return new e(params, j3, z, selected, list, transactions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f214111a, eVar.f214111a) && this.f214112b == eVar.f214112b && this.f214113c == eVar.f214113c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.f(j6.a.c(a0.d.c(this.f214111a.hashCode() * 31, 31, this.f214112b), 31, this.f214113c), 31, this.d), 31, this.e);
    }
}
