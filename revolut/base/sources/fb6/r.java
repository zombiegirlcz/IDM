package fb6;

import com.revolut.data.model.Data;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a f133460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133460w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f133460w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f133460w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(this.f133460w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
            case 3:
                r rVar4 = new r(this.f133460w, continuation, 3);
                rVar4.v = obj2;
                return rVar4;
            default:
                r rVar5 = new r(this.f133460w, continuation, 4);
                rVar5.v = obj2;
                return rVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        boolean z = true;
        char c2 = 1;
        com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar = this.f133460w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f72003t, new f9a.i(data, c2 == true ? 1 : 0));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f72003t, new f9a.i(data2, 2));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f72003t, new f9a.i(data3, 3));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (pyd.c.E(data4) && !data4.getLoading()) {
                    Throwable error = data4.getError();
                    if (error != null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                    }
                    aVar.C2(e.f133448a);
                }
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    aVar.l2(new af3.f(aVar, z, continuation, 14), new yi5.b(26));
                } else if (n1Var instanceof m1) {
                    aVar.s1();
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
