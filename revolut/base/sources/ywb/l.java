package ywb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yui.v;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f317409w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317409w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f317409w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f317409w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f317409w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f317409w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.f317410p, new v(str, 3));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.f317410p, new yvk.n(data, 2));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mVar.H2(mVar.f317410p, new yvk.n(data2, 3));
                break;
        }
        return Unit.f186387a;
    }
}
