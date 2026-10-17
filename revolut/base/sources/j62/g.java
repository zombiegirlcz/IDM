package j62;

import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import com.revolut.feature.apm.iris.impl.data.models.IrisQrScanDetails;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.iris.impl.ui.pay.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IrisNavigation$StartType.Pay.Deeplink f171667w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.apm.iris.impl.ui.pay.b bVar, IrisNavigation$StartType.Pay.Deeplink deeplink, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f171667w = deeplink;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f171667w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.iris.impl.ui.pay.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k62.b bVar2 = bVar.f62518q;
            String str = this.f171667w.f62487a;
            this.u = 1;
            obj2 = bVar2.a(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        com.revolut.feature.apm.iris.impl.ui.pay.b.I2(bVar, (IrisQrScanDetails.ConfirmPayment) obj2);
        return Unit.f186387a;
    }
}
