package a35;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import tof.i1;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements pfe.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1066a;

    public m(ImmutableMap creditTransactionFilterProvider) {
        Intrinsics.checkNotNullParameter(creditTransactionFilterProvider, "creditTransactionFilterProvider");
        this.f1066a = creditTransactionFilterProvider;
    }

    public static CreditAccountType d(ProductAccountId productAccountId) {
        ProductAccountId.Payload payload = productAccountId.f89730b;
        CreditAccountType creditAccountType = payload instanceof CreditAccountType ? (CreditAccountType) payload : null;
        if (creditAccountType != null) {
            return creditAccountType;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Couldn't find CreditAccountType for ", productAccountId.f89729a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }

    @Override // pfe.f
    public final Object a(Set set, gim.c cVar) {
        return y0.b(i1.f272794a);
    }

    @Override // pfe.f
    public final Object b(Set set, gim.c cVar) {
        return e0.G(new a1a.c(set, this, (Continuation) null, 1), cVar);
    }

    @Override // pfe.f
    public final boolean c(ProductAccountId account) {
        Intrinsics.checkNotNullParameter(account, "account");
        CreditAccountType creditAccountTypeD = d(account);
        if (creditAccountTypeD == null) {
            return false;
        }
        pfe.f fVar = (pfe.f) this.f1066a.get(creditAccountTypeD.getClass());
        return Intrinsics.f(fVar != null ? Boolean.valueOf(fVar.c(account)) : null, Boolean.TRUE);
    }
}
