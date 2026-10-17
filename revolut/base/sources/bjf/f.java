package bjf;

import android.content.Context;
import android.content.pm.PackageManager;
import blb.i;
import c21.g;
import c21.j;
import c21.k;
import com.revolut.data.database.AppRoomDatabase;
import com.revolut.data.database.models.openbanking.ConsentsDao;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao;
import com.revolut.feature.referrals.code.data.impl.service.ReferralCodeService;
import com.revolut.feature.transactions.impl.data.network.CryptoExchangeTransactionsService;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import dmc.f0;
import dmc.g0;
import dmc.h0;
import dmc.r;
import ecm.q;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mif.h;
import retrofit2.Retrofit;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f implements e4m.e {
    public static dw3.e A(dw3.f fVar) {
        dw3.e eVar = (dw3.e) fVar.b();
        s.k(eVar);
        return eVar;
    }

    public static dmc.b B(f0 f0Var) {
        dmc.b bVar = (dmc.b) f0Var.b();
        s.k(bVar);
        return bVar;
    }

    public static dmc.c C(g0 g0Var) {
        dmc.c cVar = (dmc.c) g0Var.b();
        s.k(cVar);
        return cVar;
    }

    public static r D(h0 h0Var) {
        r rVar = (r) h0Var.b();
        s.k(rVar);
        return rVar;
    }

    public static i a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, q qVar) {
        return new i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, qVar);
    }

    public static bnb.b b(xs6.a aVar, a31.a aVar2) {
        return new bnb.b(aVar2, aVar);
    }

    public static bt6.f0 c(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6, r5a.b bVar, r5a.b bVar2, a31.a aVar7, a31.a aVar8, a31.a aVar9, a31.a aVar10, a31.a aVar11, a31.a aVar12, a31.a aVar13, a31.a aVar14, a31.a aVar15) {
        return new bt6.f0(qVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, bVar, bVar2, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15);
    }

    public static xe0.e d(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "transactions_accounts_notification", mapper, 0, null, 56);
    }

    public static AppRoomDatabase e(u11.b factory) {
        c21.i.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        AppRoomDatabase.Companion companion = AppRoomDatabase.INSTANCE;
        Context context = factory.f276327a;
        yk0.a databaseSessionProvider = factory.f276328b;
        de0.a databaseEncryptionMigratorFactory = factory.f276329c;
        Set typeConverters = factory.d;
        companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        AppRoomDatabase appRoomDatabase = (AppRoomDatabase) ce0.a.b(new r5.c(context, databaseSessionProvider, databaseEncryptionMigratorFactory, typeConverters, 2));
        s.k(appRoomDatabase);
        return appRoomDatabase;
    }

    public static xe0.e f(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "au_open_banking", mapper, 0, null, 56);
    }

    public static xe0.e g(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "charity", mapper, 0, null, 56);
    }

    public static Set h(u11.a appRoomDatabaseClearable, l21.c globalStorage, ue0.c moneyRequestsStorage, ue0.c accountNotificationStorage, ue0.c statementTemplateStorage, ue0.c subscriptionsStorage, ue0.c widgetsStorage, ue0.c topupStorage, ue0.c newsStorage, ue0.c accountDetailsStorage, ue0.c openBankingStorage, ue0.c auOpenBankingStorage, ue0.c donationsStorage, ue0.c transfersStorage, ue0.c beneficiaryStorage, ue0.c splitBillStorage, ne0.d memoryCache) {
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(appRoomDatabaseClearable, "appRoomDatabaseClearable");
        Intrinsics.checkNotNullParameter(globalStorage, "globalStorage");
        Intrinsics.checkNotNullParameter(moneyRequestsStorage, "moneyRequestsStorage");
        Intrinsics.checkNotNullParameter(accountNotificationStorage, "accountNotificationStorage");
        Intrinsics.checkNotNullParameter(statementTemplateStorage, "statementTemplateStorage");
        Intrinsics.checkNotNullParameter(subscriptionsStorage, "subscriptionsStorage");
        Intrinsics.checkNotNullParameter(widgetsStorage, "widgetsStorage");
        Intrinsics.checkNotNullParameter(topupStorage, "topupStorage");
        Intrinsics.checkNotNullParameter(newsStorage, "newsStorage");
        Intrinsics.checkNotNullParameter(accountDetailsStorage, "accountDetailsStorage");
        Intrinsics.checkNotNullParameter(openBankingStorage, "openBankingStorage");
        Intrinsics.checkNotNullParameter(auOpenBankingStorage, "auOpenBankingStorage");
        Intrinsics.checkNotNullParameter(donationsStorage, "donationsStorage");
        Intrinsics.checkNotNullParameter(transfersStorage, "transfersStorage");
        Intrinsics.checkNotNullParameter(beneficiaryStorage, "beneficiaryStorage");
        Intrinsics.checkNotNullParameter(splitBillStorage, "splitBillStorage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        od0.e[] elements = {appRoomDatabaseClearable, globalStorage, moneyRequestsStorage, accountNotificationStorage, statementTemplateStorage, subscriptionsStorage, memoryCache, widgetsStorage, topupStorage, newsStorage, accountDetailsStorage, openBankingStorage, auOpenBankingStorage, donationsStorage, transfersStorage, beneficiaryStorage, splitBillStorage};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }

    public static ConsentsDao i(c21.d dVar, AppRoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        ConsentsDao consentsDaoH = database.h();
        s.k(consentsDaoH);
        return consentsDaoH;
    }

    public static ExternalInstitutionsDao j(c21.d dVar, AppRoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        ExternalInstitutionsDao externalInstitutionsDaoI = database.i();
        s.k(externalInstitutionsDaoI);
        return externalInstitutionsDaoI;
    }

    public static l21.c k(j jVar, Context context, je0.d jsonMapper, yk0.a databaseSessionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonMapper, "jsonMapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return new l21.c(context, "global", jsonMapper, 3, v.k(new m21.a(), new m21.b()), databaseSessionProvider);
    }

    public static blh.g0 l(pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        return new blh.g0(termsInteractor, 15);
    }

    public static l21.c m(j jVar, Context context, je0.d jsonMapper, yk0.a databaseSessionProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonMapper, "jsonMapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        return new l21.c(context, "money_requests", jsonMapper, 1, zhm.f0.f322471a, databaseSessionProvider);
    }

    public static xe0.e n(k kVar, je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "news", mapper, 0, null, 56);
    }

    public static xe0.e o(k kVar, je0.d mapper, yk0.a databaseSessionProvider, n21.a migration1to2, xe0.f storageFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(migration1to2, "migration1to2");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "open_banking", mapper, 2, u.c(migration1to2), 32);
    }

    public static n80.e p(Context context) {
        bn0.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return new n80.e(packageManager);
    }

    public static xe0.e q(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        bwa.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "REFERRAL_CODE_FILE", mapper, 0, null, 56);
    }

    public static CryptoExchangeTransactionsService r(Retrofit retrofit) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(CryptoExchangeTransactionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CryptoExchangeTransactionsService cryptoExchangeTransactionsService = (CryptoExchangeTransactionsService) objCreate;
        s.k(cryptoExchangeTransactionsService);
        return cryptoExchangeTransactionsService;
    }

    public static h s(TransactionsDatabase database) {
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        h hVarI = database.i();
        s.k(hVarI);
        return hVarI;
    }

    public static ReferralCodeService t(Retrofit retrofit) {
        bwa.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(ReferralCodeService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ReferralCodeService referralCodeService = (ReferralCodeService) objCreate;
        s.k(referralCodeService);
        return referralCodeService;
    }

    public static StatementTemplatesInfoDao u(c21.d dVar, AppRoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        StatementTemplatesInfoDao statementTemplatesInfoDaoL = database.l();
        s.k(statementTemplatesInfoDaoL);
        return statementTemplatesInfoDaoL;
    }

    public static xe0.e v(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        bq.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "app_update", mapper, 0, null, 56);
    }

    public static w4l.f w(p0k.a provider) {
        c0k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = ((i0k.g) provider).f157423g;
        s.k(fVar);
        return fVar;
    }

    public static w4l.f x(p0k.a provider) {
        c0k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = ((i0k.g) provider).e;
        s.k(fVar);
        return fVar;
    }

    public static w4l.f y(p0k.a provider) {
        c0k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = ((i0k.g) provider).f157424h;
        s.k(fVar);
        return fVar;
    }

    public static w4l.f z(p0k.a provider) {
        c0k.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        w4l.f fVar = ((i0k.g) provider).f;
        s.k(fVar);
        return fVar;
    }
}
