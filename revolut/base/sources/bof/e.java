package bof;

import be7.s;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LinkedTransactionScreen f17407w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LinkedTransactionScreen linkedTransactionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17407w = linkedTransactionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f17407w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f17407w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LinkedTransactionScreen linkedTransactionScreen = this.f17407w;
        switch (i) {
            case 0:
                um0 um0Var = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(um0Var.f166695a, "ID_ISSUE_ABOUT_THIS_TRANSACTION")) {
                    ((q) linkedTransactionScreen.d()).K2();
                    j60.a.v((j60.a) ((mlf.b) linkedTransactionScreen.O.getValue()).f.get(), false, null, 3);
                }
                break;
            default:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(um0Var2.f166695a, "ID_ISSUE_ABOUT_THIS_TRANSACTION")) {
                    q qVar = (q) linkedTransactionScreen.d();
                    qVar.getClass();
                    qVar.n2(new s(qVar, (Continuation) null, 17), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
