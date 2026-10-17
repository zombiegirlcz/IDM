package nn3;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nme.j0;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.contacts_chooser.impl.ui.a f217465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.contacts_chooser.impl.ui.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217465w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f217465w, continuation, 0);
                yVar.v = obj2;
                return yVar;
            default:
                y yVar2 = new y(this.f217465w, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.contacts_chooser.impl.ui.a aVar = this.f217465w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new j0(data, 8));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new njf.e(list, 3));
                break;
        }
        return Unit.f186387a;
    }
}
