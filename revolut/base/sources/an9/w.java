package an9;

import com.revolut.feature.payees.impl.ui.OwnerType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payees.impl.ui.payees_select.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OwnerType.Junior f6605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.payees.impl.ui.payees_select.b bVar, OwnerType.Junior junior, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f6605w = junior;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, this.f6605w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            OwnerType.Junior junior = this.f6605w;
            com.revolut.feature.payees.impl.ui.payees_select.b bVar = this.v;
            com.revolut.feature.payees.impl.ui.payees_select.a aVar2 = new com.revolut.feature.payees.impl.ui.payees_select.a(bVar, junior, null);
            this.u = 1;
            if (u0.b0(bVar.X(), "PAYEES_SELECTION_CTA_LOADING_TAG", aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
