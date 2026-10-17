package bob;

import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import nhe.p;
import yfe.h;
import yfe.n0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends yfe.c {
    @Override // yfe.c
    public final Object b3(h.c cVar, p pVar) {
        String str = ((n0) cVar).e;
        A2(new SavingsAccountCreationFlow$Destination(str != null ? new SavingsAccountCreationFlow$Filter.ProductId(str) : SavingsAccountCreationFlow$Filter.All.f83128a, null, 14));
        return Boolean.TRUE;
    }
}
