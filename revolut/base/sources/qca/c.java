package qca;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.PixNewContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qc0.e1;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixNewContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PixNewContactScreen pixNewContactScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixNewContactScreen pixNewContactScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) pixNewContactScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) pixNewContactScreen.R2();
                ApmDescriptor apmDescriptor = ((g) ((j2) qVar.v.f22677a).getValue()).f244672b;
                if (apmDescriptor != null) {
                    qVar.l2(new e1(qVar, apmDescriptor, null, 1), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
