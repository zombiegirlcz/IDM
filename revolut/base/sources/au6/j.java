package au6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lr6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ lr6.i u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lr6.i iVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = iVar;
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i.a aVar2 = i.a.f199407a;
        lr6.i iVar = this.u;
        boolean zEquals = iVar.equals(aVar2);
        k kVar = this.v;
        if (zEquals) {
            return Boolean.valueOf(kVar.f9543a.I0("STORAGE_KEY_SELECTED_ACCOUNT_ID"));
        }
        if (!(iVar instanceof lr6.j)) {
            throw new NoWhenBranchMatchedException();
        }
        z9h.n.l(String.class, kVar.f9543a, "STORAGE_KEY_SELECTED_ACCOUNT_ID", ((lr6.j) iVar).f199408a);
        return Unit.f186387a;
    }
}
