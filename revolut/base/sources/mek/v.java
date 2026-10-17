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
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pod_nominees.impl.edit.d f204728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f204729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f204730y;
    public final /* synthetic */ AddressFlowContract$OutputData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.retail.feature.pod_nominees.impl.edit.d dVar, String str, g gVar, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204728w = dVar;
        this.f204729x = str;
        this.f204730y = gVar;
        this.z = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f204728w, this.f204729x, this.f204730y, this.z, continuation, 0);
            default:
                return new v(this.f204728w, this.f204729x, this.f204730y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        AddressFlowContract$OutputData addressFlowContract$OutputData = this.z;
        g gVar = this.f204730y;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pod_nominees.impl.edit.d dVar = this.f204728w;
                    lek.b bVar = dVar.f102604m;
                    String str = gVar.f204700a;
                    String str2 = gVar.f204701b;
                    LocalDate localDate = gVar.e;
                    if (localDate == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String strF3 = com.revolut.retail.feature.pod_nominees.impl.edit.d.f3(dVar, gVar);
                    Address address = addressFlowContract$OutputData.f60940a;
                    this.v = 1;
                    bek.g gVar2 = ((lek.m) bVar).f194586a;
                    gVar2.getClass();
                    bek.f fVar = new bek.f(str, str2, localDate, strF3, address, gVar2, this.f204729x, null, 1);
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
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pod_nominees.impl.edit.d dVar2 = this.f204728w;
                    if (dVar2.f102603l.f102591c) {
                        lek.b bVar2 = dVar2.f102604m;
                        String str3 = gVar.f204700a;
                        String str4 = gVar.f204701b;
                        LocalDate localDate2 = gVar.e;
                        if (localDate2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String strF32 = com.revolut.retail.feature.pod_nominees.impl.edit.d.f3(dVar2, gVar);
                        Address address2 = addressFlowContract$OutputData.f60940a;
                        this.v = 1;
                        Object objF = ((lek.m) bVar2).f(this.f204729x, str3, str4, localDate2, strF32, address2, this);
                        if (objF != aVar) {
                            objF = Unit.f186387a;
                        }
                        if (objF == aVar) {
                            return aVar;
                        }
                    } else {
                        v vVar = new v(dVar2, this.f204729x, this.f204730y, this.z, null, 0);
                        this.v = 2;
                        if (do3.q.u(dVar2, vVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
