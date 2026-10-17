package cwi;

import android.content.Context;
import com.revolut.feature.credit.tiles.impl.network.services.CreditTilesService;
import com.revolut.feature.defi.accounts.api.DeFiAccountsApi$Toggles$CryptoDeFiAccount;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.website.FreelancerWebsiteScreenContract$InputData;
import g9g.p1;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p8a.q1;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class u implements e4m.e {
    public static c3h.a A(f4h.a factory) {
        d3h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return (f4h.d) factory.f132229b;
    }

    public static p8a.c B(q1 q1Var) {
        p8a.c cVar = (p8a.c) q1Var.b();
        vc.s.k(cVar);
        return cVar;
    }

    public static g9g.d C(p1 p1Var) {
        g9g.d dVar = (g9g.d) p1Var.b();
        vc.s.k(dVar);
        return dVar;
    }

    public static r93.k a(l93.f revolutCardsInteractor, u89.a promptsRouter, q89.e onboardingInteractor, li0.b tapAndPayClient, uq8.a juniorTransferCommandFactory, wsg.n walletInteractor, hj8.a juniorProfileInteractor) {
        da3.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(promptsRouter, "promptsRouter");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        return new r93.k(revolutCardsInteractor, promptsRouter, onboardingInteractor, tapAndPayClient, juniorTransferCommandFactory, walletInteractor, juniorProfileInteractor);
    }

    public static r93.c b(com.google.firebase.messaging.t actionDelegateFactory, l93.f revolutCardsInteractor, li0.b tapAndPayClient, q89.e onboardingInteractor, sh3.a checkoutInteractor, u89.a promptsRouter, uq8.a juniorTransferCommandFactory) {
        da3.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(promptsRouter, "promptsRouter");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        return new r93.c(actionDelegateFactory, revolutCardsInteractor, tapAndPayClient, onboardingInteractor, checkoutInteractor, promptsRouter, juniorTransferCommandFactory);
    }

    public static b6b.f c(a1j.a aVar, a31.a aVar2) {
        return new b6b.f(aVar, aVar2, 1);
    }

    public static bo9.d d(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        return new bo9.d(qVar, aVar, aVar2, aVar3, aVar4, aVar5, 1);
    }

    public static xe0.e e(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_lounge_passes_checkout", mapper, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
    }

    public static xe0.e f(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "airport_lounge_passes", mapper, 4, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5)), 32);
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_lounges_pass_activity", mapper, 2, zhm.u.c(new exa.a(1, 2, 5)), 32);
    }

    public static xe0.e h(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_lounges_product_article", mapper, 0, null, 56);
    }

    public static xe0.e i(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_lounges", mapper, 0, null, 56);
    }

    public static xe0.e j(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_lounges_unlimited_pass_welcome", mapper, 0, null, 56);
    }

    public static xe0.e k(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_saved_lounges", mapper, 0, null, 56);
    }

    public static j60.c l(com.revolut.kompot.navigable.a controller, rp0.m dialogDisplayer, he2.b dialogHostFinder) {
        d64.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, dialogDisplayer, dialogHostFinder);
    }

    public static x4l.c m(d9f.a aVar, c9f.b dodProvider) {
        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
        Continuation continuation = null;
        return new x4l.c(new b6a.d(dodProvider, continuation, 18), new c69.v(dodProvider, 14), new bwd.a(dodProvider, 29), new c1i.f(dodProvider, continuation, 21), new bwb.n(dodProvider, continuation, 5));
    }

    public static dy6.e n(et6.p1 freelancerInvoiceInteractor, InvoicePaymentMethodsScreenContract$InputData inputData) {
        cy6.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (Intrinsics.f(inputData, InvoicePaymentMethodsScreenContract$InputData.DefaultInvoicePaymentMethods.f73891a)) {
            return new dy6.b(freelancerInvoiceInteractor);
        }
        if (inputData instanceof InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods) {
            return new dy6.g(freelancerInvoiceInteractor, (InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods) inputData);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CreditTilesService o(db5.b bVar, Retrofit retrofit) {
        CreditTilesService creditTilesService = (CreditTilesService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofit, "retrofit", CreditTilesService.class, "create(...)");
        vc.s.k(creditTilesService);
        return creditTilesService;
    }

    public static Set p(d16.b bVar, phm.a mapperProvider, gte.a featureToggleInteractor) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(mapperProvider, "mapperProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Set setB = ((jte.d) featureToggleInteractor).c(DeFiAccountsApi$Toggles$CryptoDeFiAccount.f71633c) ? zhm.y0.b(mapperProvider.get()) : zhm.h0.f322473a;
        vc.s.k(setB);
        return setB;
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "airport_lounges_disclaimer", mapper, 0, null, 56);
    }

    public static Retrofit r(db5.b bVar, Retrofit retrofit, kg.o oVar) {
        return j6.a.B(p.a.x(retrofit, "retrofit", oVar, "gson"), oVar, "build(...)");
    }

    public static yy0.f s(Context context) {
        da3.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        yy0.f fVarQ = jh.d.f(context).Q();
        vc.s.k(fVarQ);
        return fVarQ;
    }

    public static le0.a t(le0.b factory) {
        db5.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(null);
    }

    public static xe0.e u(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "scheme_airport_lounges", mapper, 0, null, 56);
    }

    public static x4l.c v(d9f.a aVar, c9f.f dodProvider) {
        Intrinsics.checkNotNullParameter(dodProvider, "dodProvider");
        Continuation continuation = null;
        return new x4l.c(new b6a.d(dodProvider, continuation, 19), new c69.v(dodProvider, 15), new c9f.c(dodProvider, 0), new c1i.f(dodProvider, continuation, 22), new bwb.n(dodProvider, continuation, 6));
    }

    public static c90.c w(Context context) {
        da3.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new c90.c(context);
    }

    public static xe0.e x(je0.d mapper, xe0.f fVar, yk0.a databaseSessionProvider) {
        t.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return xe0.f.f(fVar, databaseSessionProvider, "airport_lounges_user_capabilities", mapper, 5, zhm.v.k(v0.a.c(fVar, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5)), 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n y(FreelancerWebsiteScreenContract$InputData inputData, e17.c extension) {
        d17.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        extension.y1(inputData);
        return (yji.n) extension;
    }

    public static p8a.b z(p8a.a aVar) {
        p8a.b bVar = (p8a.b) aVar.b();
        vc.s.k(bVar);
        return bVar;
    }
}
