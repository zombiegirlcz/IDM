package tc2;

import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanDetails;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import tnb.g0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.qvik.impl.ui.pay.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ QvikNavigation$StartType.Pay.Deeplink f269573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.apm.qvik.impl.ui.pay.a aVar, QvikNavigation$StartType.Pay.Deeplink deeplink, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f269573w = deeplink;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f269573w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.qvik.impl.ui.pay.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            g0 g0Var = aVar2.f62822q;
            String str = this.f269573w.f62778a;
            this.u = 1;
            d3i.g gVar = new d3i.g((o7.b) g0Var.f272384b, str, null, 15);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, gVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.I2((QvikQrScanDetails) obj2);
        return Unit.f186387a;
    }
}
