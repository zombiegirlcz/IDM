package ow1;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f230269w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Continuation continuation, q qVar) {
        super(2, continuation);
        this.u = i;
        this.f230269w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(0, continuation, this.f230269w);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(1, continuation, this.f230269w);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((BrebQrRequestScreenContract$InputData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f230269w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f230272r, new oph.k(data, 24));
                break;
            default:
                BrebQrRequestScreenContract$InputData brebQrRequestScreenContract$InputData = (BrebQrRequestScreenContract$InputData) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.H2(qVar.f230272r, new oqk.c(brebQrRequestScreenContract$InputData, 23));
                break;
        }
        return Unit.f186387a;
    }
}
