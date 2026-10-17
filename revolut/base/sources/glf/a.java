package glf;

import cm4.i;
import com.revolut.feature.credit.card.api.navigation.CreditCardInAppStatementDetailsDestination;
import elf.s0;
import kotlin.coroutines.Continuation;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends n implements s0 {
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof i) {
            i iVar = (i) obj2;
            A2(u0.b(u0.f(new CreditCardInAppStatementDetailsDestination(iVar.f25127a, iVar.f25128b))));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
