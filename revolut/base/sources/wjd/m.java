package wjd;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a f298052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298052w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f298052w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f298052w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((hjl.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar = this.f298052w;
        switch (i) {
            case 0:
                hjl.d dVar = (hjl.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = dVar.f152831a;
                if (data.getContent() != null || data.getLoading()) {
                    aVar.H2(aVar.u, new wgd.k(data, 3));
                }
                break;
            default:
                a aVar3 = (a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = aVar3.f298036a;
                if (data2.getContent() != null || data2.getLoading()) {
                    aVar.H2(aVar.u, new wgd.k(data2, 4));
                }
                break;
        }
        return Unit.f186387a;
    }
}
