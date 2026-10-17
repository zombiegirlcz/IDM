package nvb;

import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nuc.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((yja.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar = this.v;
        ExclusiveStoreInputData exclusiveStoreInputData = aVar.o;
        yja.b bVar = (yja.b) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = i.f219581a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                aVar.K2(((ExclusiveStoreInputData.Onboarding) exclusiveStoreInputData).f83574a);
            } else if (i == 3) {
                aVar.K2(((ExclusiveStoreInputData.Onboarding) exclusiveStoreInputData).f83574a);
                aVar.H2(aVar.f83595t, new n(13));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.B2();
            }
        }
        return Unit.f186387a;
    }
}
