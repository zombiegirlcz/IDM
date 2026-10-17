package mek;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pod_nominees.impl.edit.d f204721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f204722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f204723y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.retail.feature.pod_nominees.impl.edit.d dVar, g gVar, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204721w = dVar;
        this.f204722x = gVar;
        this.f204723y = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f204721w, this.f204722x, this.f204723y, continuation, 0);
            default:
                return new s(this.f204721w, this.f204722x, this.f204723y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pod_nominees.impl.edit.d dVar = this.f204721w;
                    lek.b bVar = dVar.f102604m;
                    g gVar = this.f204722x;
                    String str = gVar.f204704h;
                    String str2 = gVar.f204700a;
                    String str3 = gVar.f204701b;
                    LocalDate localDate = gVar.e;
                    if (localDate == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String strF3 = com.revolut.retail.feature.pod_nominees.impl.edit.d.f3(dVar, gVar);
                    Address address = this.f204723y.f60940a;
                    this.v = 1;
                    bek.g gVar2 = ((lek.m) bVar).f194586a;
                    gVar2.getClass();
                    bek.f fVar = new bek.f(str2, str3, localDate, strF3, address, gVar2, str, null, 0);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, fVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pod_nominees.impl.edit.d dVar2 = this.f204721w;
                    boolean z = dVar2.f102603l.f102591c;
                    AddressFlowContract$OutputData addressFlowContract$OutputData = this.f204723y;
                    g gVar3 = this.f204722x;
                    if (z) {
                        lek.b bVar2 = dVar2.f102604m;
                        String str4 = gVar3.f204700a;
                        String str5 = gVar3.f204701b;
                        LocalDate localDate2 = gVar3.e;
                        if (localDate2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String strF32 = com.revolut.retail.feature.pod_nominees.impl.edit.d.f3(dVar2, gVar3);
                        Address address2 = addressFlowContract$OutputData.f60940a;
                        this.v = 1;
                        Object objC = ((lek.m) bVar2).c(str4, str5, localDate2, strF32, address2, this);
                        if (objC != aVar) {
                            objC = Unit.f186387a;
                        }
                        if (objC == aVar) {
                            return aVar;
                        }
                    } else {
                        s sVar = new s(dVar2, gVar3, addressFlowContract$OutputData, null, 0);
                        this.v = 2;
                        if (do3.q.u(dVar2, sVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
