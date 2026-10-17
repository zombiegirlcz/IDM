package jb1;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f172568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, x xVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f172568w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f172568w, continuation);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(1, this.f172568w, continuation);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(2, this.f172568w, continuation);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(3, this.f172568w, continuation);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(4, this.f172568w, continuation);
                sVar5.v = obj2;
                return sVar5;
            default:
                s sVar6 = new s(5, this.f172568w, continuation);
                sVar6.v = obj2;
                return sVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f172568w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new j45.m(data, 15));
                xVar.A2();
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new j45.m(data2, 16));
                xVar.A2();
                return Unit.f186387a;
            case 2:
                n1 n1Var = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x.y2(xVar, n1Var);
                return Unit.f186387a;
            case 3:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x.y2(xVar, n1Var2);
                return Unit.f186387a;
            case 4:
                n1 n1Var3 = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x.y2(xVar, n1Var3);
                return Unit.f186387a;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.x2(new j45.m(data3, 17));
                j jVar = (j) data3.getContent();
                if (jVar != null) {
                    dj0.d dVar = jVar.f172556c;
                    PaymentMethod paymentMethod = ((g) xVar.t2()).d;
                    h hVar = null;
                    if (paymentMethod != null) {
                        if (!(paymentMethod instanceof PaymentMethod.Wallet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dj0.d dVar2 = ((PaymentMethod.Wallet) paymentMethod).f60581c;
                        if (Intrinsics.f(dVar2.f115083b, dVar.f115083b)) {
                            hVar = dVar2.compareTo(dVar) >= 0 ? h.SUFFICIENT : h.INSUFFICIENT;
                        }
                    }
                    xVar.x2(new j87.m(hVar, 9));
                }
                return Unit.f186387a;
        }
    }
}
