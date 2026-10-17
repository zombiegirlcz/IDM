package aa4;

import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import gim.i;
import grl.k9;
import hw3.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import p24.p;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a f2762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f2762w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f2762w, continuation, 0);
            default:
                return new f(this.f2762w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objB;
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a aVar = this.f2762w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    x xVar = aVar.f67572p;
                    this.v = 1;
                    p pVar = xVar.f156094a;
                    pVar.getClass();
                    omg.e eVar = new omg.e(pVar, continuation, 19);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, eVar, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            o.b(obj2);
                            return Unit.f186387a;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        objB = obj2;
                        wi0.b bVar = (wi0.b) objB;
                        Intrinsics.h(bVar);
                        r kycDocumentScope = r.CREDIT_ONBOARDING;
                        String userCountry = bVar.f297794a;
                        Intrinsics.checkNotNullParameter(kycDocumentScope, "kycDocumentScope");
                        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
                        gt8.a aVar3 = gt8.a.VERIFY_IDENTITY_IN_PROGRESS;
                        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                        k9 k9Var = frl.a.f;
                        companion.getClass();
                        AnalyticsProduct.Companion.a(k9Var);
                        aVar.K2(new FeatureCommand(new KycFeatureConfig.StartKyc(null, null, true, null, null, true, new AnalyticsProduct.Retail(k9Var), kycDocumentScope, aVar3, null, null, null, null, false, null, 129142)));
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                int i5 = e.f2761a[((tu3.a) objJ).ordinal()];
                if (i5 == 1) {
                    this.v = 2;
                    if (t.N2(aVar, null, this, 3) == aVar2) {
                        return aVar2;
                    }
                    return Unit.f186387a;
                }
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                d0 d0VarF = aVar.f67573q.f(false);
                d dVar = d.f;
                ufm.i iVar = new ufm.i(d0VarF, new a0.b(9), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                this.v = 3;
                objB = nim.a.b(iVar, this);
                if (objB == aVar2) {
                    return aVar2;
                }
                wi0.b bVar2 = (wi0.b) objB;
                Intrinsics.h(bVar2);
                r kycDocumentScope2 = r.CREDIT_ONBOARDING;
                String userCountry2 = bVar2.f297794a;
                Intrinsics.checkNotNullParameter(kycDocumentScope2, "kycDocumentScope");
                Intrinsics.checkNotNullParameter(userCountry2, "userCountry");
                gt8.a aVar32 = gt8.a.VERIFY_IDENTITY_IN_PROGRESS;
                AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                k9 k9Var2 = frl.a.f;
                companion2.getClass();
                AnalyticsProduct.Companion.a(k9Var2);
                aVar.K2(new FeatureCommand(new KycFeatureConfig.StartKyc(null, null, true, null, null, true, new AnalyticsProduct.Retail(k9Var2), kycDocumentScope2, aVar32, null, null, null, null, false, null, 129142)));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar = new f(aVar, continuation, i2);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar.k, "verify kyc submission", fVar, this);
                return objB2 == aVar4 ? aVar4 : objB2;
        }
    }
}
