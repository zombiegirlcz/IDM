package yjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        List accounts = (List) obj2;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        od0.h hVar = od0.i.Companion;
        Iterator it8 = accounts.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if ((next instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) && ((WealthAccount) next).Q2()) {
                break;
            }
        }
        hVar.getClass();
        return od0.h.a(next);
    }
}
