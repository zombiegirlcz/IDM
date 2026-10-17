package wl5;

import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreen;
import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            sl5.f fVar = sVar.f298429q;
            this.u = 1;
            obj2 = fVar.c(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        yvh.b bVar = (yvh.b) obj2;
        if (bVar == null || !bVar.f317177b) {
            sVar.n2(new o(sVar, null, 3), new whi.b(6));
            return Unit.f186387a;
        }
        xl5.b bVar2 = sVar.f298432t;
        bVar2.getClass();
        bVar2.f306937b = xl5.a.HIDDEN;
        j60.a.v(bVar2.f306936a, false, null, 3);
        return yji.l.g2(sVar, new ChangeSpareChangeScreen(new ChangeSpareChangeScreenContract$InputData(bVar.d)), null, new wg2.g(sVar, bVar, 17), 1);
    }
}
