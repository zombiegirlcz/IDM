package nuc;

import cli.y;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import tof.i7;
import tof.q7;
import tof.tb;
import tof.u9;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HiddenTransactionsScreen f219282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HiddenTransactionsScreen hiddenTransactionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219282w = hiddenTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f219282w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f219282w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        int i = this.u;
        HiddenTransactionsScreen hiddenTransactionsScreen = this.f219282w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = hiddenTransactionsScreen.R2();
                Intrinsics.h(query);
                com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) lVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                String string = d0.F0(query).toString();
                ihm.b bVar = aVar2.f85587s;
                i7 i7Var = (i7) bVar.f();
                y yVar = aVar2.f85588t;
                k kVar = ((h) ((j2) yVar.f22677a).getValue()).e;
                if (Intrinsics.f(kVar, i.f219286a)) {
                    z = true;
                } else if (Intrinsics.f(kVar, j.f219287a)) {
                    z = false;
                } else {
                    if (kVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((h) ((j2) yVar.f22677a).getValue()).f219285c;
                }
                i7 u9Var = z ? new u9(false) : new u9(true);
                if (!d0.W(string)) {
                    u9Var = new q7(v.k(u9Var, new tb(string)));
                }
                if (!Intrinsics.f(i7Var, u9Var)) {
                    bVar.onNext(u9Var);
                }
                aVar2.H2(yVar, new nj8.b(string, 15));
                return Unit.f186387a;
            default:
                String itemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = hiddenTransactionsScreen.R2();
                Intrinsics.h(itemId);
                com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar4 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) lVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("MULTI_SELECT_MENU_ITEM_ID")) {
                    aVar4.H2(aVar4.f85588t, new nrb.c(28));
                    aVar4.f85587s.onNext(new u9(false));
                }
                return Unit.f186387a;
        }
    }
}
