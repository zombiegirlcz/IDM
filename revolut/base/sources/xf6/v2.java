package xf6;

import android.content.Context;
import com.revolut.feature.external_accounts.impl.data.open_banking.payment_fees.OutboundPaymentBreakdownService;
import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.OpenBankingBrazilService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f305122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f305123c;

    public /* synthetic */ v2(w2 w2Var, int i, int i2) {
        this.f305121a = i2;
        this.f305122b = w2Var;
        this.f305123c = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f305121a) {
            case 0:
                w2 w2Var = this.f305122b;
                int i = this.f305123c;
                switch (i) {
                    case 0:
                        return new vf6.b();
                    case 1:
                        return new wf6.v((sri.m) w2Var.L.get());
                    case 2:
                        Context context = w2Var.f305134a;
                        u3.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return sri.o.c(context, null, null, 14);
                    case 3:
                        return new wf6.x((sri.m) w2Var.L.get());
                    case 4:
                        return new wf6.c((sri.m) w2Var.L.get());
                    case 5:
                        je0.d mapper = w2Var.f305136b.b();
                        vc.s.j(mapper);
                        yk0.a dbSessionProvider = w2Var.f305138c.b();
                        vc.s.j(dbSessionProvider);
                        xe0.f storageFactory = w2Var.f305136b.f();
                        vc.s.j(storageFactory);
                        u3.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, dbSessionProvider, "open_banking_brazil_consents_storage", mapper, 0, null, 56);
                    case 6:
                        je0.d dVarB = w2Var.f305136b.b();
                        vc.s.j(dVarB);
                        yk0.a aVarB = w2Var.f305138c.b();
                        vc.s.j(aVarB);
                        xe0.f fVarF = w2Var.f305136b.f();
                        vc.s.j(fVarF);
                        return xb1.a.g(dVarB, fVarF, aVarB);
                    case 7:
                        return new ng6.a((kf6.b) w2Var.S.get());
                    case 8:
                        OutboundPaymentBreakdownService outboundPaymentBreakdownService = (OutboundPaymentBreakdownService) w2Var.R.get();
                        kf6.a aVar = new kf6.a();
                        CoroutineScope coroutineScopeA = w2Var.f305146q.a();
                        vc.s.j(coroutineScopeA);
                        return new kf6.b(outboundPaymentBreakdownService, aVar, coroutineScopeA);
                    case 9:
                        Retrofit retrofit = ((nj0.d) w2Var.d).f();
                        u3.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(OutboundPaymentBreakdownService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        OutboundPaymentBreakdownService outboundPaymentBreakdownService2 = (OutboundPaymentBreakdownService) objCreate;
                        vc.s.k(outboundPaymentBreakdownService2);
                        return outboundPaymentBreakdownService2;
                    case 10:
                        oe6.m mVarF = ((t) w2Var.f305139g).f();
                        vc.s.j(mVarF);
                        return new xg6.b(mVarF);
                    case 11:
                        return new com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b((lf6.a) w2Var.X.get(), w2Var.f305144n.b(), w2Var.f.b());
                    case 12:
                        return new lf6.j((ne0.j) w2Var.V.get(), (OpenBankingBrazilService) w2Var.W.get(), (ue0.c) w2Var.P.get());
                    case 13:
                        return new ne0.d();
                    case 14:
                        Retrofit retrofit3 = ((nj0.d) w2Var.d).f();
                        u3.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate2 = retrofit3.create(OpenBankingBrazilService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        OpenBankingBrazilService openBankingBrazilService = (OpenBankingBrazilService) objCreate2;
                        vc.s.k(openBankingBrazilService);
                        return openBankingBrazilService;
                    case 15:
                        return new qg6.a((of6.b) w2Var.Z.get());
                    case 16:
                        ik0.b bVarM = ((nj0.d) w2Var.d).m();
                        vc.s.j(bVarM);
                        return new of6.b(xb1.a.f(bVarM, fe0.d.a()), (ne0.j) w2Var.V.get());
                    case 17:
                        whf.b bVarA = w2Var.I.a();
                        vc.s.j(bVarA);
                        return new xg6.z(bVarA);
                    default:
                        throw new AssertionError(i);
                }
            default:
                int i2 = this.f305123c;
                if (i2 == 0) {
                    w2 w2Var2 = this.f305122b;
                    return new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d((com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a) w2Var2.Y.get(), (qg6.a) w2Var2.f305135a0.get(), new mj6.l());
                }
                if (i2 == 1) {
                    return new wj6.m();
                }
                if (i2 == 2) {
                    return new hk6.k();
                }
                throw new AssertionError(i2);
        }
    }
}
