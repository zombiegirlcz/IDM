package znf;

import go.g;
import k71.k;
import k71.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import rd0.e;
import tof.a3;
import tof.cc;
import tof.gb;
import tof.i7;
import vkm.q;
import z6k.l;
import zhm.d0;
import zhm.h0;
import znc.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f323814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhf.a f323815b;

    public c(com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f323814a = transactionsInteractor;
        this.f323815b = unitedWalletInteractor;
    }

    public final Flow a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (!(k.a0(transaction) instanceof n)) {
            i.Companion.getClass();
            return new g(i.f224256b, 2);
        }
        String str = transaction.f272581b;
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new cc(d0.d1(k.f181789a)), new gb(str)};
        cVar.getClass();
        Continuation continuation = null;
        return e.e(q.Q(mo3.a.g(e.b(com.revolut.domain.interactors.transactions.a.d(this.f323814a, i7.c.a(i7VarArr), null, null, null, null, 30)), null, new j(16), 1), new z6e.g(continuation, this, 20)), h0.f322473a, new l(3, 10, continuation));
    }
}
