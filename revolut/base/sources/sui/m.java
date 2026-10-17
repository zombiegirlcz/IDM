package sui;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b f265787w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f265787w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f265787w, continuation);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(1, this.f265787w, continuation);
                mVar2.v = obj2;
                return mVar2;
            default:
                m mVar3 = new m(2, this.f265787w, continuation);
                mVar3.v = obj2;
                return mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar = this.f265787w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new s86.k(data, 20));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new s86.k(data2, 21));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new s86.k(data3, 22));
                break;
        }
        return Unit.f186387a;
    }
}
