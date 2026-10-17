package jxa;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mjf.b0;
import tof.cc;
import tof.q6;
import tof.y6;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f179103a;

    public l(com.revolut.domain.interactors.transactions.a transactionsInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                this.f179103a = transactionsInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
                this.f179103a = transactionsInteractor;
                break;
        }
    }

    public Object a(q6[] q6VarArr, gim.i iVar) {
        Object objA;
        if (q6VarArr.length == 0) {
            objA = Unit.f186387a;
        } else {
            objA = nim.a.a(((b0) this.f179103a).g((q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length)), iVar);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
        }
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public vkm.d b(String inviteId) {
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        return rd0.e.b(nim.a.w(com.revolut.domain.interactors.transactions.a.d(this.f179103a, new cc(u.c(y6.REWARD)), null, null, null, null, 30), new jb8.a(inviteId, this)));
    }

    public Flow c(q6... transactionScopes) {
        Intrinsics.checkNotNullParameter(transactionScopes, "transactionScopes");
        if (transactionScopes.length == 0) {
            return new go.g(Boolean.TRUE, 2);
        }
        return rd0.e.b(((b0) this.f179103a).m((q6[]) Arrays.copyOf(transactionScopes, transactionScopes.length)));
    }
}
