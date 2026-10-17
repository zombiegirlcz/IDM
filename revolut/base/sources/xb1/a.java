package xb1;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.external_accounts.impl.data.open_banking.OpenBankingService;
import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.inbound.BrazilInboundOpenBankingService;
import com.revolut.feature.external_accounts.impl.repository.network.ConsentService;
import com.revolut.feature.external_accounts.impl.repository.network.EarlyCreditService;
import com.revolut.feature.external_accounts.impl.repository.network.InstitutionAccountsService;
import com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService;
import com.revolut.feature.external_accounts.impl.repository.network.MandateService;
import com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.CryptoCommodityDetailsDatabase;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Retrofit;
import ulm.b1;
import xf6.k3;
import xf6.n3;
import xf6.p3;
import xf6.s3;
import xf6.w3;
import xf6.y3;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a implements e4m.e {
    public static xe0.e A(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        y3.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "plaid_storage", mapper, 0, null, 56);
    }

    public static zd8.a B(zd8.g gVar) {
        zd8.a aVar = (zd8.a) gVar.b();
        vc.s.k(aVar);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.d C(j60.a bottomDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        yji.d dVar = (yji.d) bottomDialogControllerExtension;
        vc.s.k(dVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yji.n D(sb7.b extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        return nVar;
    }

    public static a0b.g a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, ecm.q qVar) {
        return new a0b.g(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, 9);
    }

    public static ava.d b(sse.a aVar, a31.a aVar2, a31.a aVar3) {
        return new ava.d(aVar, aVar2, aVar3, 5);
    }

    public static vxc.k c(sse.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        return new vxc.k(aVar, aVar2, aVar3, aVar4);
    }

    public static w80.b d(qd0.b languageProvider) {
        xbb.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    public static j60.c e(com.revolut.kompot.navigable.a controller, j60.e dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        return new j60.c(controller, new rp0.m(), dialogHostFinder);
    }

    public static BrazilInboundOpenBankingService f(ik0.b retrofitFactory, Json baseJson) {
        xf6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, p.a.g(b1.Companion, "application/json", baseJson), null, 27).create(BrazilInboundOpenBankingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BrazilInboundOpenBankingService brazilInboundOpenBankingService = (BrazilInboundOpenBankingService) objCreate;
        vc.s.k(brazilInboundOpenBankingService);
        return brazilInboundOpenBankingService;
    }

    public static xe0.e g(je0.d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        xf6.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, dbSessionProvider, "brazil_pix_mandate_creation_storage", mapper, 0, null, 56);
    }

    public static wcj.a h(CryptoCommodityDetailsDatabase db8) {
        xcj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        wcj.a aVarG = db8.g();
        vc.s.k(aVarG);
        return aVarG;
    }

    public static cc7.h i(xb7.b factory, j60.a bottomDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Object obj2 = factory.f304017a.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new cc7.h(bottomDialogControllerExtension, (cc7.m) obj2, factory.f304018b, factory.f304019c);
    }

    public static wcj.b j(CryptoCommodityDetailsDatabase db8) {
        xcj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(db8, "db");
        wcj.b bVarH = db8.h();
        vc.s.k(bVarH);
        return bVarH;
    }

    public static CryptoCommodityDetailsDatabase k(Context context, yk0.a databaseSessionProvider, de0.a databaseEncryptionMigratorFactory) {
        xcj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        CryptoCommodityDetailsDatabase.Companion companion = CryptoCommodityDetailsDatabase.INSTANCE;
        companion.getClass();
        CryptoCommodityDetailsDatabase cryptoCommodityDetailsDatabase = (CryptoCommodityDetailsDatabase) companion.a(context, databaseSessionProvider, new Migration[]{ycj.a.f312624c, ycj.b.f312625c, ycj.c.f312626c, ycj.d.f312627c, ycj.e.f312628c, ycj.f.f312629c, ycj.g.f312630c, ycj.h.f312631c}, databaseEncryptionMigratorFactory);
        vc.s.k(cryptoCommodityDetailsDatabase);
        return cryptoCommodityDetailsDatabase;
    }

    public static LinkExternalInstitutionsService l(Retrofit retrofit) {
        p3.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(LinkExternalInstitutionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        LinkExternalInstitutionsService linkExternalInstitutionsService = (LinkExternalInstitutionsService) objCreate;
        vc.s.k(linkExternalInstitutionsService);
        return linkExternalInstitutionsService;
    }

    public static csh.d m(qw7.c domainApi) {
        xc7.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(domainApi, "domainApi");
        csh.d dVar = (csh.d) domainApi.f249800n.get();
        vc.s.k(dVar);
        return dVar;
    }

    public static xe0.e n(je0.d mapper, xe0.f storageFactory, yk0.a dbSessionProvider) {
        p3.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, dbSessionProvider, "linked_accounts_consent_storage", mapper, 0, null, 56);
    }

    public static zbb.i o(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        return new zbb.i(configurationInteractor);
    }

    public static ccb.j p(xbb.d provider) {
        xbb.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider.a();
    }

    public static acb.j q(l4i.a amountConverter, o7.b orderQuoteInteractor) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        return new acb.j(amountConverter, orderQuoteInteractor);
    }

    public static sri.m r(Context context) {
        n3.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static sri.m s(Context context) {
        s3.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return sri.o.c(context, null, null, 14);
    }

    public static OpenBankingService t(Retrofit retrofit) {
        n3.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(OpenBankingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        OpenBankingService openBankingService = (OpenBankingService) objCreate;
        vc.s.k(openBankingService);
        return openBankingService;
    }

    public static she.g u(Context context) {
        w3.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        zfe.g.Companion.getClass();
        return zfe.f.a(context);
    }

    public static ConsentService v(Retrofit retrofit) {
        xf6.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ConsentService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ConsentService consentService = (ConsentService) objCreate;
        vc.s.k(consentService);
        return consentService;
    }

    public static EarlyCreditService w(Retrofit retrofit) {
        k3.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(EarlyCreditService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        EarlyCreditService earlyCreditService = (EarlyCreditService) objCreate;
        vc.s.k(earlyCreditService);
        return earlyCreditService;
    }

    public static InstitutionAccountsService x(Retrofit retrofit) {
        p3.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(InstitutionAccountsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InstitutionAccountsService institutionAccountsService = (InstitutionAccountsService) objCreate;
        vc.s.k(institutionAccountsService);
        return institutionAccountsService;
    }

    public static MandateService y(Retrofit retrofit) {
        s3.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(MandateService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        MandateService mandateService = (MandateService) objCreate;
        vc.s.k(mandateService);
        return mandateService;
    }

    public static xe0.e z(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        s3.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "mandates_storage", mapper, 0, null, 56);
    }
}
