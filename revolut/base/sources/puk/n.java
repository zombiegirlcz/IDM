package puk;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pnh.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f239946w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239946w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f239946w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f239946w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f239946w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            case 3:
                n nVar4 = new n(this.f239946w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
            case 4:
                n nVar5 = new n(this.f239946w, continuation, 4);
                nVar5.v = obj2;
                return nVar5;
            default:
                n nVar6 = new n(this.f239946w, continuation, 5);
                nVar6.v = obj2;
                return nVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((n2h.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s sVar = this.f239946w;
        switch (i) {
            case 0:
                n2h.f fVar = (n2h.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.z, new avk.u(fVar, 5));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.z, new d0(data, 22));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.z, new d0(data2, 23));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.z, new d0(data3, 24));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sVar.H2(sVar.z, new d0(data4, 25));
                break;
            default:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.i iVar = (od0.i) rVar.f314201a;
                final boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
                final boolean zBooleanValue2 = ((Boolean) rVar.f314203c).booleanValue();
                lbf.p pVar = (lbf.p) iVar.f224257a;
                final boolean z = pVar != null && pVar.a();
                lbf.p pVar2 = (lbf.p) iVar.f224257a;
                final boolean zJ = pd.b.j(pVar2 != null ? Boolean.valueOf(t1.c(lbf.k.ORDER_BOOK, pVar2.f193684a)) : null);
                final s sVar2 = this.f239946w;
                sVar2.H2(sVar2.z, new Function1() { // from class: puk.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        f fVar2 = (f) obj3;
                        s sVar3 = sVar2;
                        boolean z3 = z;
                        boolean z4 = zJ;
                        boolean z6 = zBooleanValue;
                        boolean z11 = zBooleanValue2;
                        return f.a(fVar2, null, sVar3.I2(z3, z4, z6, z11), null, null, null, null, z3, z11, null, 317);
                    }
                });
                break;
        }
        return Unit.f186387a;
    }
}
