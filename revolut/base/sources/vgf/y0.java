package vgf;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vh f289145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a3 f289147y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(vh vhVar, com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Continuation continuation, a3 a3Var) {
        super(1, continuation);
        this.f289145w = vhVar;
        this.f289146x = aVar;
        this.f289147y = a3Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y0(this.f289145w, this.f289146x, continuation, this.f289147y);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String actionId;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        a3 a3Var = this.f289147y;
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = this.f289146x;
        if (i == 0) {
            yhm.o.b(obj2);
            String str = this.f289145w.f54883a.f53505a;
            ujf.h hVar = aVar2.f91940x;
            this.u = str;
            this.v = 1;
            Object objD = hVar.d(a3Var, str, this);
            if (objD == aVar) {
                return aVar;
            }
            actionId = str;
            obj2 = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionId = this.u;
            yhm.o.b(obj2);
        }
        String str2 = a3Var.f272579a;
        if (!((jte.d) aVar2.D).c(TransactionListApi$Toggles$UnifiedTransactionList.f91964c)) {
            uhf.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            if (uhf.c.valueOf(actionId) == uhf.c.UNHIDE && ((qgf.h) ((j2) ((com.revolut.feature.transaction_list.impl.ui.list.flow.a) aVar2.v).u.f22677a).getValue()).f245801c) {
                aVar2.H2(aVar2.J, new pud.b((Object) aVar2, (Object) str2, false, 22));
            }
        }
        return obj2;
    }
}
