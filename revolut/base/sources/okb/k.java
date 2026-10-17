package okb;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import my8.r;
import rp0.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        p0.a aVar = (p0.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = aVar.f256150a;
        boolean z = obj3 instanceof h;
        m mVar = this.v;
        if (z) {
            ((r60.d) mVar.f225959l).Q();
        } else if (obj3 instanceof i) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137504q;
            companion.getClass();
            AnalyticsProduct.Companion.a(k9Var);
            gt8.a aVar3 = gt8.a.VERIFY_IDENTITY_IN_PROGRESS;
            mVar.A2(u0.b(new FeatureCommand(new KycFeatureConfig.StartKyc(null, null, true, null, null, true, new AnalyticsProduct.Retail(k9Var), r.DEFAULT, aVar3, null, null, null, null, false, null, 129142))));
        }
        return Unit.f186387a;
    }
}
