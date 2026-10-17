package ybb;

import bcb.e;
import ccb.k;
import ccb.y;
import com.revolut.core.model.account.AccountId;
import go.g;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.v1;
import wf0.f0;

/* JADX INFO: loaded from: classes6.dex */
public interface d {
    vkm.d a(xi0.b bVar, AccountId accountId);

    default Flow b(e moneyBox, k moneyFlowType, xi0.b sourcePocketCurrency) {
        Intrinsics.checkNotNullParameter(moneyBox, "moneyBox");
        Intrinsics.checkNotNullParameter(moneyFlowType, "moneyFlowType");
        Intrinsics.checkNotNullParameter(sourcePocketCurrency, "sourcePocketCurrency");
        return new wc7.e(q.Q(d(moneyBox.a()), new f0((Continuation) null, this, sourcePocketCurrency, 11)), 8, this, moneyFlowType);
    }

    default Flow c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new g(Boolean.TRUE, 2);
    }

    v1 d(String str);

    c4i.a e();

    Object f(String str, y yVar);

    vkm.d g(String str);

    Flow h(String str);

    List i(bcb.g gVar);
}
