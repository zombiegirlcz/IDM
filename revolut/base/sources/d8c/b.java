package d8c;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import xo9.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f112208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f112208w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f112208w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.v;
            Intrinsics.i(hVar, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.qr.RevolutPayQrHandlerImpl.RevolutPayQrParsingResult");
            d0 d0VarA = ((b7c.c) this.f112208w.f112211c).a(((a) hVar).f112207a, true);
            this.u = 1;
            obj2 = nim.a.b(d0VarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        KompotDestination kompotDestination = (KompotDestination) obj2;
        FeatureCommand featureCommandF = gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
        Intrinsics.h(kompotDestination);
        return com.revolut.retail.core.navigation.a.c(featureCommandF, u0.f(kompotDestination));
    }
}
