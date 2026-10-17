package gyi;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesUserCapabilities;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.d1;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f147865w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147865w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f147865w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f147865w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            default:
                a0 a0Var3 = new a0(this.f147865w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f147865w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.f147882y, new ghg.r(data, 26));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) pair.f186385a;
                Data data3 = (Data) pair.f186386b;
                d1 d1Var = (d1) data2.getContent();
                AirportLoungesUserCapabilities airportLoungesUserCapabilities = (AirportLoungesUserCapabilities) data3.getContent();
                d0Var.H2(d0Var.f147882y, new g48.h(airportLoungesUserCapabilities != null ? airportLoungesUserCapabilities.f98933c : false, d1Var, data3, 4));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0Var.H2(d0Var.f147882y, new gvi.s(data4, d0Var, 5));
                break;
        }
        return Unit.f186387a;
    }
}
