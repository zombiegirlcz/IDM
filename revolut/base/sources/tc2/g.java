package tc2;

import com.revolut.feature.apm.qvik.api.navigation.QvikNavigation$StartType;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.qvik.impl.ui.pay.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ QvikNavigation$StartType.Pay.Deeplink f269574w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.apm.qvik.impl.ui.pay.a aVar, QvikNavigation$StartType.Pay.Deeplink deeplink, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f269574w = deeplink;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f269574w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            QvikNavigation$StartType.Pay.Deeplink deeplink = this.f269574w;
            com.revolut.feature.apm.qvik.impl.ui.pay.a aVar2 = this.v;
            f fVar = new f(aVar2, deeplink, null);
            this.u = 1;
            if (aVar2.p2(this, fVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
