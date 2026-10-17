package jj9;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f174795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f174795w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f174795w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f174795w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((ai9.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f174795w;
        switch (i) {
            case 0:
                ai9.c cVar = (ai9.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mVar.x2(new k(cVar, 0));
                break;
            default:
                vf0.k kVar = (vf0.k) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mVar.x2(new fmk.j((Data) kVar.f288454a, (Data) kVar.d, (Data) kVar.f288455b, (Data) kVar.f288456c, (Data) kVar.e, 1));
                break;
        }
        return Unit.f186387a;
    }
}
