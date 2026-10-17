package ss4;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f265300w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265300w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f265300w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f265300w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            default:
                v vVar3 = new v(this.f265300w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        y yVar = this.f265300w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f265309t, new r(i.a(yVar.I2(), null, data, null, 23), 1));
                return Unit.f186387a;
            case 1:
                k kVar = (k) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xi0.b bVar = kVar.f265281a;
                return nim.a.v(rd0.e.b(nim.a.w(osg.b.g(yVar.f265305p, w4l.j.f294644c, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, null, AccountId.Personal.f51414a, 36), new ou5.a(21, bVar))), new sdi.k(yVar, kVar, 22));
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.f265309t, new s86.k(data2, 18));
                return Unit.f186387a;
        }
    }
}
