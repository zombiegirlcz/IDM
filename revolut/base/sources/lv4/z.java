package lv4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f200315w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f200315w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f200315w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(this.f200315w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
            default:
                z zVar3 = new z(this.f200315w, continuation, 2);
                zVar3.v = obj2;
                return zVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b0 b0Var = this.f200315w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f200290w, new lnk.m(data, 10));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f200290w, new lnk.m(data2, 11));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.f200290w, new lnk.m(data3, 12));
                break;
        }
        return Unit.f186387a;
    }
}
