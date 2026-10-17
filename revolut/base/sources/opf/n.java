package opf;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ood.o0;
import op0.o3;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ogm.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f227625w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ogm.i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f227625w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f227625w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        efm.d0 d0VarFirstOrError = ue0.e.p(com.revolut.domain.interactors.transactions.a.c((com.revolut.domain.interactors.transactions.a) this.v.f225222b, this.f227625w, new TransactionContext(new Priority.HIGH("Payments - Chat Send Button - Message bubble animation"), null, 2), false, 2), h0.f322473a).skipWhile(new o3(17, new o0(12))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        this.u = 1;
        Object objB = nim.a.b(d0VarFirstOrError, this);
        return objB == aVar ? aVar : objB;
    }
}
