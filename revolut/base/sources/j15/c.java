package j15;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.help.api.navigation.CreditHelpKompotBridgeFeatureConfig;
import com.revolut.feature.credit.help.api.navigation.FinancialDifficultiesNavigationDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import ft3.d1;
import ft3.q0;
import gim.i;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ux4.k;
import yhm.o;
import yp3.f;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f170118w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f170118w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f170118w, continuation);
        cVar.u = ((Boolean) obj2).booleanValue();
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((c) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureConfig creditHelpKompotBridgeFeatureConfig;
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = this.v;
        if (z) {
            r2 r2Var = r2.FINANCIAL_DIFFICULTIES;
            ft3.e eVar = q0.Companion;
            d1 d1VarJ = n14.k.J(kVar.f283872b);
            String str = kVar.f283871a;
            eVar.getClass();
            creditHelpKompotBridgeFeatureConfig = new CreditApplicationFeatureConfig.StartApplication(r2Var, ft3.e.a(d1VarJ, str), null, f.SHOW_ALL, null, null, 16314);
        } else {
            FinancialDifficultiesNavigationDestination destination = new FinancialDifficultiesNavigationDestination(kVar);
            Intrinsics.checkNotNullParameter(destination, "destination");
            creditHelpKompotBridgeFeatureConfig = new CreditHelpKompotBridgeFeatureConfig(null, destination, false, null, 0, 60);
        }
        this.f170118w.A2(u0.c(creditHelpKompotBridgeFeatureConfig));
        return Unit.f186387a;
    }
}
