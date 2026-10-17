package b1c;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import yhm.r;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements oim.n {
    public final /* synthetic */ int u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f11790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f11791x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        Data data = (Data) obj2;
        Data data2 = (Data) obj3;
        Data data3 = (Data) obj4;
        Continuation continuation = (Continuation) obj5;
        switch (this.u) {
            case 0:
                o oVar = new o(4, 0, continuation);
                oVar.v = data;
                oVar.f11790w = data2;
                oVar.f11791x = data3;
                return oVar.invokeSuspend(Unit.f186387a);
            case 1:
                o oVar2 = new o(4, 1, continuation);
                oVar2.v = data;
                oVar2.f11790w = data2;
                oVar2.f11791x = data3;
                return oVar2.invokeSuspend(Unit.f186387a);
            case 2:
                o oVar3 = new o(4, 2, continuation);
                oVar3.v = data;
                oVar3.f11790w = data2;
                oVar3.f11791x = data3;
                return oVar3.invokeSuspend(Unit.f186387a);
            default:
                o oVar4 = new o(4, 3, continuation);
                oVar4.v = data;
                oVar4.f11790w = data2;
                oVar4.f11791x = data3;
                return oVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = this.v;
                Data data2 = this.f11790w;
                Data data3 = this.f11791x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new r(data, data2, data3);
            case 1:
                Data data4 = this.v;
                Data data5 = this.f11790w;
                Data data6 = this.f11791x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new eh8.d(data4, data5, data6);
            case 2:
                Data data7 = this.v;
                Data data8 = this.f11790w;
                Data data9 = this.f11791x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return t1.u(data9, data8, data7);
            default:
                Data data10 = this.v;
                Data data11 = this.f11790w;
                Data data12 = this.f11791x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new r(data10, data11, data12);
        }
    }
}
