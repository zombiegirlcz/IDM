package c21;

import a31.x;
import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.database.AppRoomDatabase;
import com.revolut.data.database.models.endcriteria.typeconverter.RecurringPaymentEndCriteriaConverter;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentBillDetailsEmbeddedEntityTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentFundsSourceEmbeddedEntityTypeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentMethodConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.RecurringPaymentSchemeConverter;
import com.revolut.data.database.models.recurringpayments.typeconverter.WalletAutomationEmbeddedEntityTypeConverter;
import com.revolut.data.database.models.splitbill.SplitBillDao;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao;
import com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl;
import com.revolut.data.network.services.AutoTopUpService;
import com.revolut.data.network.services.BeneficiaryService;
import com.revolut.data.network.services.CreditRecurringPaymentService;
import com.revolut.data.network.services.DeviceService;
import com.revolut.data.network.services.ExternalInstitutionsService;
import com.revolut.data.network.services.NewsService;
import com.revolut.data.network.services.PeerToPeerTransferService;
import com.revolut.data.network.services.PrivacySettingsService;
import com.revolut.data.network.services.RecurringPaymentService;
import com.revolut.data.network.services.SplitBillService;
import com.revolut.data.network.services.StatementTemplateService;
import com.revolut.data.network.services.ThreeDSService;
import com.revolut.data.network.services.TransactionCategoriesService;
import com.revolut.data.network.services.TransferService;
import com.revolut.data.network.services.UserService;
import com.revolut.data.network.services.exchange.ExchangeRatesService;
import com.revolut.data.network.services.wallet.AccountsService;
import com.revolut.data.otp.DebugOtpService;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.shared.feature.recurring_payments.data.services.StandingOrdersService;
import com.youTransactor.uCube.rpc.Constants;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import nd.p;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;
import w21.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20558b;

    public a(b bVar, int i) {
        this.f20557a = bVar;
        this.f20558b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f20557a;
        int i = this.f20558b;
        switch (i) {
            case 0:
                AccountsService accountsService = (AccountsService) bVar.u.get();
                TransferService transferService = (TransferService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", TransferService.class, "create(...)");
                s.k(transferService);
                ne0.d dVar = new ne0.d();
                ne0.d dVar2 = new ne0.d();
                ue0.c cVar = (ue0.c) bVar.v.get();
                wj0.a aVarI = ((nj0.d) bVar.f20563c).i();
                s.j(aVarI);
                gte.a aVarB = bVar.f20566g.b();
                s.j(aVarB);
                return new i31.l(accountsService, transferService, dVar, dVar2, cVar, aVarI, aVarB);
            case 1:
                m mVar = bVar.f20559a;
                AccountsService accountsService2 = (AccountsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", AccountsService.class, "create(...)");
                s.k(accountsService2);
                return accountsService2;
            case 2:
                e21.b bVar2 = bVar.f20561b;
                ik0.b factory = ((nj0.d) bVar.f20563c).m();
                s.j(factory);
                o gson = (o) bVar.f20580s.get();
                Intrinsics.checkNotNullParameter(gson, "gson");
                GsonConverterFactory converterFactory = GsonConverterFactory.create(gson);
                Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
                s.k(converterFactory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
                s.k(retrofitA);
                return retrofitA;
            case 3:
                g.Companion.getClass();
                o oVarA = GsonHolder.a();
                s.k(oVarA);
                return oVarA;
            case 4:
                k kVar = bVar.d;
                ee0.a aVar = bVar.e;
                je0.d mapper = aVar.b();
                s.j(mapper);
                yk0.a databaseSecurityProvider = bVar.f.b();
                s.j(databaseSecurityProvider);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSecurityProvider, "transfers", mapper, 0, null, 56);
            case 5:
                PeerToPeerTransferService peerToPeerTransferServiceV = l.v(bVar.f20559a, (Retrofit) bVar.f20587x.get());
                gte.a aVarB2 = bVar.f20566g.b();
                s.j(aVarB2);
                return new i31.c(peerToPeerTransferServiceV, aVarB2);
            case 6:
                e21.c cVar2 = bVar.f20567h;
                ik0.b bVarM = ((nj0.d) bVar.f20563c).m();
                s.j(bVarM);
                e21.c cVar3 = bVar.f20567h;
                return e21.d.a(cVar2, bVarM, e21.e.a(cVar3, dw3.l.o(cVar3, (o) bVar.f20580s.get())));
            case 7:
                return bjf.f.h(new u11.a(bVar.i, (AppRoomDatabase) bVar.z.get()), (l21.c) bVar.A.get(), (ue0.c) bVar.B.get(), (ue0.c) bVar.C.get(), (ue0.c) bVar.D.get(), (ue0.c) bVar.E.get(), (ue0.c) bVar.F.get(), (ue0.c) bVar.G.get(), (ue0.c) bVar.H.get(), (ue0.c) bVar.I.get(), (ue0.c) bVar.J.get(), (ue0.c) bVar.K.get(), (ue0.c) bVar.L.get(), (ue0.c) bVar.v.get(), (ue0.c) bVar.M.get(), (ue0.c) bVar.N.get(), new ne0.d());
            case 8:
                Context context = bVar.i;
                yk0.a aVarB3 = bVar.f.b();
                s.j(aVarB3);
                de0.a aVarA = ((cl0.a) bVar.f20569j).a();
                s.j(aVarA);
                return bjf.f.e(new u11.b(context, aVarB3, aVarA, ImmutableSet.of((WalletAutomationEmbeddedEntityTypeConverter) new RecurringPaymentSchemeConverter(fe0.d.a()), (WalletAutomationEmbeddedEntityTypeConverter) new RecurringPaymentMethodConverter(fe0.d.a()), (WalletAutomationEmbeddedEntityTypeConverter) new RecurringPaymentEndCriteriaConverter(fe0.d.a()), (WalletAutomationEmbeddedEntityTypeConverter) new RecurringPaymentFundsSourceEmbeddedEntityTypeConverter(fe0.d.a()), (WalletAutomationEmbeddedEntityTypeConverter) new RecurringPaymentBillDetailsEmbeddedEntityTypeConverter(), new WalletAutomationEmbeddedEntityTypeConverter(fe0.d.a()), (WalletAutomationEmbeddedEntityTypeConverter[]) new ce0.h[0])));
            case 9:
                j jVar = bVar.k;
                Context context2 = bVar.i;
                je0.d dVarB = bVar.e.b();
                s.j(dVarB);
                yk0.a aVarB4 = bVar.f.b();
                s.j(aVarB4);
                return bjf.f.k(jVar, context2, dVarB, aVarB4);
            case 10:
                j jVar2 = bVar.k;
                Context context3 = bVar.i;
                je0.d dVarB2 = bVar.e.b();
                s.j(dVarB2);
                yk0.a aVarB5 = bVar.f.b();
                s.j(aVarB5);
                return bjf.f.m(jVar2, context3, dVarB2, aVarB5);
            case 11:
                k kVar2 = bVar.d;
                ee0.a aVar2 = bVar.e;
                je0.d dVarB3 = aVar2.b();
                s.j(dVarB3);
                yk0.a aVarB6 = bVar.f.b();
                s.j(aVarB6);
                xe0.f fVarF = aVar2.f();
                s.j(fVarF);
                return bjf.f.d(kVar2, dVarB3, aVarB6, fVarF);
            case 12:
                je0.d dVarB4 = bVar.e.b();
                s.j(dVarB4);
                yk0.a aVarB7 = bVar.f.b();
                s.j(aVarB7);
                xe0.f fVarF2 = bVar.e.f();
                s.j(fVarF2);
                return f0k.d.x(dVarB4, fVarF2, aVarB7);
            case 13:
                k kVar3 = bVar.d;
                ee0.a aVar3 = bVar.e;
                je0.d mapper2 = aVar3.b();
                s.j(mapper2);
                yk0.a databaseSessionProvider = bVar.f.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory2 = aVar3.f();
                s.j(storageFactory2);
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider, "subscriptions", mapper2, 0, null, 56);
            case 14:
                k kVar4 = bVar.d;
                ee0.a aVar4 = bVar.e;
                je0.d dVarB5 = aVar4.b();
                s.j(dVarB5);
                yk0.a aVarB8 = bVar.f.b();
                s.j(aVarB8);
                xe0.f fVarF3 = aVar4.f();
                s.j(fVarF3);
                return l.D(kVar4, dVarB5, aVarB8, fVarF3);
            case 15:
                k kVar5 = bVar.d;
                ee0.a aVar5 = bVar.e;
                je0.d dVarB6 = aVar5.b();
                s.j(dVarB6);
                yk0.a aVarB9 = bVar.f.b();
                s.j(aVarB9);
                xe0.f fVarF4 = aVar5.f();
                s.j(fVarF4);
                return l.A(kVar5, dVarB6, aVarB9, fVarF4);
            case 16:
                k kVar6 = bVar.d;
                ee0.a aVar6 = bVar.e;
                je0.d dVarB7 = aVar6.b();
                s.j(dVarB7);
                yk0.a aVarB10 = bVar.f.b();
                s.j(aVarB10);
                xe0.f fVarF5 = aVar6.f();
                s.j(fVarF5);
                return bjf.f.n(kVar6, dVarB7, aVarB10, fVarF5);
            case 17:
                k kVar7 = bVar.d;
                ee0.a aVar7 = bVar.e;
                je0.d mapper3 = aVar7.b();
                s.j(mapper3);
                yk0.a databaseSessionProvider2 = bVar.f.b();
                s.j(databaseSessionProvider2);
                xe0.f storageFactory3 = aVar7.f();
                s.j(storageFactory3);
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return xe0.f.f(storageFactory3, databaseSessionProvider2, "account_details", mapper3, 0, null, 56);
            case 18:
                k kVar8 = bVar.d;
                ee0.a aVar8 = bVar.e;
                je0.d dVarB8 = aVar8.b();
                s.j(dVarB8);
                yk0.a aVarB11 = bVar.f.b();
                s.j(aVarB11);
                n21.a aVar9 = new n21.a(new p21.b());
                xe0.f fVarF6 = aVar8.f();
                s.j(fVarF6);
                return bjf.f.o(kVar8, dVarB8, aVarB11, aVar9, fVarF6);
            case 19:
                k kVar9 = bVar.d;
                ee0.a aVar10 = bVar.e;
                je0.d dVarB9 = aVar10.b();
                s.j(dVarB9);
                yk0.a aVarB12 = bVar.f.b();
                s.j(aVarB12);
                xe0.f fVarF7 = aVar10.f();
                s.j(fVarF7);
                return bjf.f.f(kVar9, dVarB9, aVarB12, fVarF7);
            case 20:
                k kVar10 = bVar.d;
                ee0.a aVar11 = bVar.e;
                je0.d dVarB10 = aVar11.b();
                s.j(dVarB10);
                yk0.a aVarB13 = bVar.f.b();
                s.j(aVarB13);
                xe0.f fVarF8 = aVar11.f();
                s.j(fVarF8);
                return bjf.f.g(kVar10, dVarB10, aVarB13, fVarF8);
            case 21:
                k kVar11 = bVar.d;
                ee0.a aVar12 = bVar.e;
                je0.d mapper4 = aVar12.b();
                s.j(mapper4);
                yk0.a databaseSecurityProvider2 = bVar.f.b();
                s.j(databaseSecurityProvider2);
                xe0.f storageFactory4 = aVar12.f();
                s.j(storageFactory4);
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider2, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                return xe0.f.f(storageFactory4, databaseSecurityProvider2, "beneficiaries", mapper4, 0, null, 56);
            case 22:
                k kVar12 = bVar.d;
                ee0.a aVar13 = bVar.e;
                je0.d dVarB11 = aVar13.b();
                s.j(dVarB11);
                yk0.a aVarB14 = bVar.f.b();
                s.j(aVarB14);
                xe0.f fVarF9 = aVar13.f();
                s.j(fVarF9);
                return l.w(kVar12, dVarB11, aVarB14, fVarF9);
            case 23:
                e21.b bVar3 = bVar.f20561b;
                ik0.b factory2 = ((nj0.d) bVar.f20563c).m();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Retrofit retrofitA2 = ik0.b.a(factory2, null, null, null, null, 23);
                s.k(retrofitA2);
                return retrofitA2;
            case 24:
                e21.b bVar4 = bVar.f20561b;
                ik0.b factory3 = ((nj0.d) bVar.f20563c).m();
                s.j(factory3);
                OkHttpClient okHttp = (OkHttpClient) bVar.Q.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(okHttp, "okHttp");
                Retrofit retrofitA3 = ik0.b.a(factory3, okHttp, null, null, null, 30);
                s.k(retrofitA3);
                return retrofitA3;
            case 25:
                e21.a aVar14 = bVar.f20571l;
                xj0.i okHttpClientFactory = ((nj0.d) bVar.f20563c).l();
                s.j(okHttpClientFactory);
                Intrinsics.checkNotNullParameter(okHttpClientFactory, "okHttpClientFactory");
                return xj0.i.a(okHttpClientFactory, 60L, false, true, null, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
            case 26:
                e21.b bVar5 = bVar.f20561b;
                ik0.b factory4 = ((nj0.d) bVar.f20563c).m();
                s.j(factory4);
                OkHttpClient okHttp2 = (OkHttpClient) bVar.R.get();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(okHttp2, "okHttp");
                Retrofit retrofitA4 = ik0.b.a(factory4, okHttp2, null, null, null, 30);
                s.k(retrofitA4);
                return retrofitA4;
            case 27:
                e21.a aVar15 = bVar.f20571l;
                xj0.i okHttpClientFactory2 = ((nj0.d) bVar.f20563c).l();
                s.j(okHttpClientFactory2);
                Intrinsics.checkNotNullParameter(okHttpClientFactory2, "okHttpClientFactory");
                return xj0.i.a(okHttpClientFactory2, 60L, false, false, null, null, null, 254);
            case 28:
                e21.a aVar16 = bVar.f20571l;
                xj0.i iVarL = ((nj0.d) bVar.f20563c).l();
                s.j(iVarL);
                return dw3.l.p(aVar16, iVarL);
            case 29:
                g.Companion.getClass();
                return new ifm.b();
            case 30:
                TransactionCategoriesService transactionCategoriesService = (TransactionCategoriesService) bVar.V.get();
                AppRoomDatabase database = (AppRoomDatabase) bVar.z.get();
                Intrinsics.checkNotNullParameter(database, "database");
                TransactionCustomCategoryDao transactionCustomCategoryDaoM = database.m();
                s.k(transactionCustomCategoryDaoM);
                b80.c cVarP = bVar.f20573n.p();
                s.j(cVarP);
                return new g31.h(transactionCategoriesService, transactionCustomCategoryDaoM, cVarP);
            case 31:
                m mVar2 = bVar.f20559a;
                TransactionCategoriesService transactionCategoriesService2 = (TransactionCategoriesService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", TransactionCategoriesService.class, "create(...)");
                s.k(transactionCategoriesService2);
                return transactionCategoriesService2;
            case 32:
                return new r21.h((BeneficiaryService) bVar.X.get(), new v11.b((AppRoomDatabase) bVar.z.get(), (ue0.c) bVar.M.get()), new ne0.d(), (ue0.c) bVar.M.get());
            case 33:
                m mVar3 = bVar.f20559a;
                BeneficiaryService beneficiaryService = (BeneficiaryService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", BeneficiaryService.class, "create(...)");
                s.k(beneficiaryService);
                return beneficiaryService;
            case 34:
                e4m.e eVar = bVar.u;
                usg.b bVar6 = bVar.f20576p;
                AccountsService accountsService3 = (AccountsService) eVar.get();
                ue0.c cVar4 = (ue0.c) bVar.I.get();
                ne0.d dVar3 = new ne0.d();
                go3.b bVarA = bVar6.a();
                s.j(bVarA);
                go3.b bVarA2 = bVar6.a();
                s.j(bVarA2);
                dfm.c cVar5 = new dfm.c(bVarA2);
                qsg.b bVarB = bVar6.b();
                s.j(bVarB);
                return new j31.g(accountsService3, cVar4, dVar3, bVarA, cVar5, bVarB);
            case 35:
                return new p(bVar.f20577q.i());
            case 36:
                return new y21.c((UserService) bVar.f20560a0.get(), new ne0.d(), (l21.c) bVar.A.get());
            case 37:
                return l.C(bVar.f20559a, (Retrofit) bVar.f20582t.get());
            case 38:
                return new k21.c((DebugOtpService) bVar.c0.get());
            case 39:
                return jr9.h.t((Retrofit) bVar.S.get());
            case 40:
                ExternalInstitutionsService externalInstitutionsService = (ExternalInstitutionsService) bVar.f20565e0.get();
                ExternalInstitutionsDao externalInstitutionsDaoJ = bjf.f.j(bVar.f20572m, (AppRoomDatabase) bVar.z.get());
                ue0.c cVar6 = (ue0.c) bVar.J.get();
                go3.b bVarA3 = bVar.f20576p.a();
                s.j(bVarA3);
                return new w21.o(externalInstitutionsService, externalInstitutionsDaoJ, cVar6, bVarA3, new p21.b(), new q(), new ne0.d());
            case 41:
                return l.n(bVar.f20559a, (Retrofit) bVar.f20582t.get());
            case 42:
                return new b31.a((PrivacySettingsService) bVar.g0.get());
            case 43:
                m mVar4 = bVar.f20559a;
                PrivacySettingsService privacySettingsService = (PrivacySettingsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", PrivacySettingsService.class, "create(...)");
                s.k(privacySettingsService);
                return privacySettingsService;
            case 44:
                return new z21.a((UserService) bVar.f20560a0.get());
            case 45:
                ExchangeRatesService exchangeRatesService = (ExchangeRatesService) bVar.j0.get();
                zm0.c cVarJ = bVar.f.j();
                s.j(cVarJ);
                b80.c cVarP2 = bVar.f20573n.p();
                s.j(cVarP2);
                return new t21.a(exchangeRatesService, cVarJ, cVarP2);
            case 46:
                return l.m(bVar.f20559a, (Retrofit) bVar.f20582t.get());
            case 47:
                SplitBillService splitBillService = (SplitBillService) bVar.l0.get();
                AppRoomDatabase database2 = (AppRoomDatabase) bVar.z.get();
                Intrinsics.checkNotNullParameter(database2, "database");
                SplitBillDao splitBillDaoK = database2.k();
                s.k(splitBillDaoK);
                ne0.d dVar4 = new ne0.d();
                ue0.c cVar7 = (ue0.c) bVar.N.get();
                ze0.a aVarA2 = bVar.e.a();
                s.j(aVarA2);
                return new SplitBillRepositoryImpl(splitBillService, splitBillDaoK, dVar4, cVar7, aVarA2);
            case 48:
                m mVar5 = bVar.f20559a;
                SplitBillService splitBillService2 = (SplitBillService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", SplitBillService.class, "create(...)");
                s.k(splitBillService2);
                return splitBillService2;
            case 49:
                return new g31.c((ue0.c) bVar.C.get());
            case 50:
                m mVar6 = bVar.f20559a;
                ThreeDSService threeDSService = (ThreeDSService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", ThreeDSService.class, "create(...)");
                s.k(threeDSService);
                return threeDSService;
            case 51:
                RecurringPaymentService recurringPaymentService = (RecurringPaymentService) bVar.p0.get();
                StandingOrdersService standingOrdersService = (StandingOrdersService) bVar.q0.get();
                CreditRecurringPaymentService creditRecurringPaymentService = (CreditRecurringPaymentService) bVar.f20579r0.get();
                u0a.a aVar17 = new u0a.a((AppRoomDatabase) bVar.z.get());
                ne0.d dVar5 = new ne0.d();
                cl3.a aVarD = bVar.f20578r.d();
                s.j(aVarD);
                a31.a aVar18 = new a31.a(aVarD);
                gte.a aVarB15 = bVar.f20566g.b();
                s.j(aVarB15);
                return new x(recurringPaymentService, standingOrdersService, creditRecurringPaymentService, aVar17, dVar5, aVar18, aVarB15, (ue0.c) bVar.E.get());
            case 52:
                m mVar7 = bVar.f20559a;
                RecurringPaymentService recurringPaymentService2 = (RecurringPaymentService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", RecurringPaymentService.class, "create(...)");
                s.k(recurringPaymentService2);
                return recurringPaymentService2;
            case 53:
                return l.x(bVar.f20559a, (Retrofit) bVar.f20582t.get());
            case 54:
                m mVar8 = bVar.f20559a;
                CreditRecurringPaymentService creditRecurringPaymentService2 = (CreditRecurringPaymentService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", CreditRecurringPaymentService.class, "create(...)");
                s.k(creditRecurringPaymentService2);
                return creditRecurringPaymentService2;
            case 55:
                return new g31.i();
            case 56:
                StatementTemplateService statementTemplateServiceW = f0k.d.w(((nj0.d) bVar.f20563c).f());
                StatementTemplatesInfoDao statementTemplatesInfoDaoU = bjf.f.u(bVar.f20572m, (AppRoomDatabase) bVar.z.get());
                ue0.c cVar8 = (ue0.c) bVar.D.get();
                ne0.d dVar6 = new ne0.d();
                l80.e eVarH = bVar.f20573n.h();
                s.j(eVarH);
                return new c31.e(statementTemplateServiceW, statementTemplatesInfoDaoU, cVar8, dVar6, eVarH);
            case 57:
                AutoTopUpService autoTopUpService = (AutoTopUpService) bVar.f20584v0.get();
                ne0.d dVar7 = new ne0.d();
                ue0.c cVar9 = (ue0.c) bVar.G.get();
                go3.b bVarA4 = bVar.f20576p.a();
                s.j(bVarA4);
                return new e31.d(autoTopUpService, dVar7, cVar9, bVarA4);
            case 58:
                return l.f(bVar.f20559a, (Retrofit) bVar.f20582t.get());
            case 59:
                return new v21.f((NewsService) bVar.f20588x0.get(), new ne0.d(), (ue0.c) bVar.H.get());
            case 60:
                return l.s(bVar.f20559a, (Retrofit) bVar.f20582t.get());
            case 61:
                return new v21.c((NewsService) bVar.f20588x0.get(), new ne0.d(), (ue0.c) bVar.H.get());
            case 62:
                return new s21.a((DeviceService) bVar.A0.get());
            case 63:
                m mVar9 = bVar.f20559a;
                DeviceService deviceService = (DeviceService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f20582t.get(), "retrofit", DeviceService.class, "create(...)");
                s.k(deviceService);
                return deviceService;
            default:
                throw new AssertionError(i);
        }
    }
}
