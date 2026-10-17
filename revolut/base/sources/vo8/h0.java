package vo8;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vch.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f290885w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(0, this.f290885w, continuation);
                h0Var.v = obj2;
                return h0Var;
            case 1:
                h0 h0Var2 = new h0(1, this.f290885w, continuation);
                h0Var2.v = obj2;
                return h0Var2;
            case 2:
                h0 h0Var3 = new h0(2, this.f290885w, continuation);
                h0Var3.v = obj2;
                return h0Var3;
            case 3:
                h0 h0Var4 = new h0(3, this.f290885w, continuation);
                h0Var4.v = obj2;
                return h0Var4;
            case 4:
                h0 h0Var5 = new h0(4, this.f290885w, continuation);
                h0Var5.v = obj2;
                return h0Var5;
            case 5:
                h0 h0Var6 = new h0(5, this.f290885w, continuation);
                h0Var6.v = obj2;
                return h0Var6;
            case 6:
                h0 h0Var7 = new h0(6, this.f290885w, continuation);
                h0Var7.v = obj2;
                return h0Var7;
            default:
                h0 h0Var8 = new h0(7, this.f290885w, continuation);
                h0Var8.v = obj2;
                return h0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = this.f290885w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new s0(data, 25));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new s0(data2, 26));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new s0(data3, 27));
                break;
            case 3:
                of8.b bVar2 = (of8.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new vh2.j(bVar2, 24));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new s0(data4, 28));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new s0(data5, 29));
                break;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new i0(data6, 0));
                break;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.C, new i0(data7, 1));
                break;
        }
        return Unit.f186387a;
    }
}
