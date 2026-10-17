package d2g;

import com.revolut.data.model.Data;
import czc.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Continuation continuation) {
        super(2, continuation);
        this.v = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lyf.e eVar;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object content = data.getContent();
        y yVar = this.v;
        if (content == null || (eVar = (lyf.e) data.getContent()) == null || eVar.f200822h) {
            yVar.H2(yVar.f110830s, new b0(data, 4));
        } else {
            String str = yVar.o.f93062a;
            lyf.e eVar2 = (lyf.e) data.getContent();
            yVar.C2(new p(str, eVar2 != null ? eVar2.f200820c : null, true));
        }
        return Unit.f186387a;
    }
}
