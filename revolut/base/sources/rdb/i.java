package rdb;

import com.revolut.feature.retail.restaurants.impl.data.network.ReservationsService;
import d9.e1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import qdb.l;
import qdb.m;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f253403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f253404x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f253404x = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(this.f253404x, continuation, 0);
                iVar.f253403w = str;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(this.f253404x, continuation, 1);
                iVar2.f253403w = str;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f253403w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ReservationsService reservationsService = this.f253404x.f253406a;
                    this.f253403w = null;
                    this.v = 1;
                    obj2 = reservationsService.getReservation(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return l.a((qdb.k) obj2);
            default:
                String str2 = this.f253403w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ReservationsService reservationsService2 = this.f253404x.f253406a;
                    this.f253403w = null;
                    this.v = 1;
                    obj2 = reservationsService2.getReservationPage(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return e1.X((m) obj2);
        }
    }
}
