package rhf;

import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.transactions.api.navigation.StandardPagerInput;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsPagerInput;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import tof.a3;
import tof.i7;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionDetailsPagerInput f254443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f254445c;
    public final Set d;

    public e(TransactionDetailsPagerInput input, String searchQuery, d entryPoint, int i) {
        if ((i & 2) != 0) {
            m70.a.c(t0.f186434a);
            searchQuery = "";
        }
        entryPoint = (i & 4) != 0 ? d.OTHER : entryPoint;
        h0 additionalConfig = h0.f322473a;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
        this.f254443a = input;
        this.f254444b = searchQuery;
        this.f254445c = entryPoint;
        this.d = additionalConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f254443a, eVar.f254443a) && Intrinsics.f(this.f254444b, eVar.f254444b) && this.f254445c == eVar.f254445c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f254445c.hashCode() + p.a.c(this.f254443a.hashCode() * 31, 31, this.f254444b)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(a3 a3Var, i7 i7Var, TransactionContext transactionContext, String str, int i) {
        if ((i & 8) != 0) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        this(a3Var, i7Var, transactionContext, str, d.OTHER);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(a3 selectedTransaction, i7 i7Var, TransactionContext transactionContext, String searchQuery, d entryPoint) {
        this(new StandardPagerInput(selectedTransaction, i7Var, transactionContext), searchQuery, entryPoint, 8);
        Intrinsics.checkNotNullParameter(selectedTransaction, "selectedTransaction");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
    }
}
