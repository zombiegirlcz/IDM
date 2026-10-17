package nt9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.group_creation.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            zs9.e eVar = bVar.o;
            RetailBackgroundKey.SplitBillGroupCreation splitBillGroupCreation = new RetailBackgroundKey.SplitBillGroupCreation(null, null, null);
            this.u = 1;
            obj2 = eVar.d(splitBillGroupCreation, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        bVar.H2(bVar.f79487w, new be3.l(4, (Image) obj2));
        return Unit.f186387a;
    }
}
