package ph4;

import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import wli.x;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d f236209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f236210x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f236209w = dVar;
        this.f236210x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f236210x, this.f236209w, continuation);
            default:
                return new h(this.f236209w, this.f236210x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                boolean zH = a0.H(this.f236210x, "revolut://", false);
                com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar = this.f236209w;
                if (!zH) {
                    return dVar.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(this.f236210x, null, 0, false, true, true, 65438))));
                }
                x xVar = dVar.f68317t;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, this.f236210x, null, null, this, 6);
                return objX1 == aVar ? aVar : objX1;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar2 = this.f236209w;
                ol8.e eVar = new ol8.e(dVar2, this.f236210x, null, 22);
                this.v = 1;
                Object objB = pu7.a.B(dVar2.k, "handleDeeplink", eVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f236210x = str;
        this.f236209w = dVar;
    }
}
