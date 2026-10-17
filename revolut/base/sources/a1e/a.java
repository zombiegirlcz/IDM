package a1e;

import afj.a1;
import afj.b2;
import afj.f1;
import afj.l2;
import afj.m0;
import afj.n1;
import afj.n2;
import afj.o0;
import afj.t1;
import afj.u0;
import afj.v;
import afj.v1;
import afj.w;
import afj.w0;
import android.content.Context;
import androidx.room.migration.Migration;
import b6d.r;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.legacy.login.impl.network.AuthService;
import com.revolut.feature.shared.autoinvest.impl.database.AutoInvestDatabase;
import com.revolut.feature.shared.autoinvest.impl.network.AutoInvestService;
import com.revolut.feature.shared.autoinvest.impl.network.PortfolioAutoInvestService;
import com.revolut.feature.stock_lending.impl.database.StockLendingDatabase;
import com.revolut.feature.stock_lending.impl.network.StockLendingService;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown.EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData;
import dfj.c0;
import dfj.g3;
import dfj.k3;
import dfj.s3;
import dfj.v2;
import java.util.Collection;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import sri.o;
import vc.s;
import zab.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f588c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f586a = i2;
        this.f588c = obj2;
        this.f587b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object eVar;
        Object rVar;
        Object hVar;
        Object jVar;
        switch (this.f586a) {
            case 0:
                b bVar = (b) this.f588c;
                ee0.a aVar = bVar.d;
                an0.c cVar = bVar.e;
                Context context = bVar.f;
                int i = this.f587b;
                switch (i) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        je0.d mapper = aVar.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = cVar.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = aVar.f();
                        s.j(storageFactory);
                        n.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "stock_lending_storage", mapper, 0, null, 56);
                    case 2:
                        yk0.a databaseSessionProvider2 = cVar.b();
                        s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) bVar.f592g).a();
                        s.j(databaseEncryptionMigratorFactory);
                        i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        StockLendingDatabase stockLendingDatabase = (StockLendingDatabase) StockLendingDatabase.INSTANCE.a(context, databaseSessionProvider2, new Migration[0], databaseEncryptionMigratorFactory);
                        s.k(stockLendingDatabase);
                        return stockLendingDatabase;
                    case 3:
                        k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return o.c(context, null, null, 14);
                    case 4:
                        b80.c cVarP = bVar.i.p();
                        s.j(cVarP);
                        return new f1e.d(cVarP, (StockLendingService) bVar.f599q.get(), (w0e.a) bVar.f600r.get(), (ne0.j) bVar.f596m.get(), (ue0.c) bVar.f597n.get());
                    case 5:
                        StockLendingService stockLendingService = (StockLendingService) a0.d.f((nj0.d) bVar.f594j, "retrofit", StockLendingService.class, "create(...)");
                        s.k(stockLendingService);
                        return stockLendingService;
                    case 6:
                        StockLendingDatabase db8 = (StockLendingDatabase) bVar.o.get();
                        i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        w0e.a aVarG = db8.g();
                        s.k(aVarG);
                        return aVarG;
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                g gVar = (g) this.f588c;
                int i2 = this.f587b;
                if (i2 == 0) {
                    return new k1e.g((p) gVar.f620b.get(), gVar.f619a);
                }
                if (i2 == 1) {
                    return new k1e.h();
                }
                throw new AssertionError(i2);
            case 2:
                a51.b bVar2 = (a51.b) this.f588c;
                int i3 = this.f587b;
                if (i3 == 0) {
                    eVar = new a51.e(bVar2.f1309a);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new AssertionError(i3);
                        }
                        a51.a aVar2 = (a51.a) ((a51.e) bVar2.f1310b.get()).b();
                        s.k(aVar2);
                        return aVar2;
                    }
                    eVar = new a51.d(bVar2.f1311c, 0);
                }
                return eVar;
            case 3:
                a6d.e eVar2 = (a6d.e) this.f588c;
                an0.c cVar2 = eVar2.d;
                ee0.a aVar3 = eVar2.f;
                nj0.a aVar4 = eVar2.f1606a;
                int i5 = this.f587b;
                switch (i5) {
                    case 0:
                        rVar = new r((e6d.r) eVar2.f1614n.get(), new dl2.a(eVar2.f1609g.f135898a.e(), 0), new zjh.f((PortfolioAutoInvestService) eVar2.o.get()));
                        break;
                    case 1:
                        rVar = new e6d.r((AutoInvestService) eVar2.i.get(), (u5d.c) eVar2.k.get(), (ne0.j) eVar2.f1612l.get(), (ue0.c) eVar2.f1613m.get());
                        break;
                    case 2:
                        AutoInvestService autoInvestService = (AutoInvestService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) eVar2.f1610h.get(), "retrofit", AutoInvestService.class, "create(...)");
                        s.k(autoInvestService);
                        return autoInvestService;
                    case 3:
                        ik0.b retrofitFactory = ((nj0.d) aVar4).m();
                        s.j(retrofitFactory);
                        zvh.a autoInvestNetworkConfiguration = eVar2.f1607b;
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(autoInvestNetworkConfiguration, "autoInvestNetworkConfiguration");
                        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, autoInvestNetworkConfiguration.getHostUrl(), null, null, 29);
                        s.k(retrofitA);
                        return retrofitA;
                    case 4:
                        rVar = new u5d.c((AutoInvestDatabase) eVar2.f1611j.get());
                        break;
                    case 5:
                        Context context2 = eVar2.f1608c;
                        yk0.a databaseSessionProvider3 = cVar2.b();
                        s.j(databaseSessionProvider3);
                        de0.a databaseEncryptionMigratorFactory2 = ((cl0.a) eVar2.e).a();
                        s.j(databaseEncryptionMigratorFactory2);
                        a6d.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory2, "databaseEncryptionMigratorFactory");
                        AutoInvestDatabase.Companion aVar5 = AutoInvestDatabase.INSTANCE;
                        aVar5.getClass();
                        AutoInvestDatabase autoInvestDatabase = (AutoInvestDatabase) aVar5.a(context2, databaseSessionProvider3, AutoInvestDatabase.f, databaseEncryptionMigratorFactory2);
                        s.k(autoInvestDatabase);
                        return autoInvestDatabase;
                    case 6:
                        a6d.d.Companion.getClass();
                        return new ne0.d();
                    case 7:
                        je0.d mapper2 = aVar3.b();
                        s.j(mapper2);
                        yk0.a databaseSessionProvider4 = cVar2.b();
                        s.j(databaseSessionProvider4);
                        xe0.f storageFactory2 = aVar3.f();
                        s.j(storageFactory2);
                        a6d.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider4, "auto_invest_storage", mapper2, 1, null, 48);
                    case 8:
                        PortfolioAutoInvestService portfolioAutoInvestService = (PortfolioAutoInvestService) a0.d.f((nj0.d) aVar4, "retrofit", PortfolioAutoInvestService.class, "create(...)");
                        s.k(portfolioAutoInvestService);
                        return portfolioAutoInvestService;
                    default:
                        throw new AssertionError(i5);
                }
                return rVar;
            case 4:
                abb.a aVar6 = (abb.a) this.f588c;
                int i6 = this.f587b;
                switch (i6) {
                    case 0:
                        hri.b bVar3 = aVar6.f2893a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar4 = aVar6.f2893a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        aVar6.getClass();
                        hVar = new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        break;
                    case 5:
                        return new ln.c();
                    case 6:
                        return new ym.d();
                    case 7:
                        return new mm.d();
                    case 8:
                        return new sm.e();
                    case 9:
                        return new om.c();
                    case 10:
                        Retrofit retrofit = ((nj0.d) aVar6.f).f();
                        abb.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(AuthService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        AuthService authService = (AuthService) objCreate;
                        s.k(authService);
                        return authService;
                    case 11:
                        zab.h hVar2 = (zab.h) aVar6.f2907w.get();
                        xk3.a aVar7 = (xk3.a) aVar6.i.e.get();
                        s.j(aVar7);
                        ifm.b bVar5 = (ifm.b) aVar6.f2899l.get();
                        ing.b bVarA = aVar6.f2897h.a();
                        s.j(bVarA);
                        hVar = new zab.d(hVar2, aVar7, bVar5, bVarA);
                        break;
                    case 12:
                        return new u();
                    default:
                        throw new AssertionError(i6);
                }
                return hVar;
            case 5:
                int i21 = this.f587b;
                if (i21 == 0) {
                    return new zjj.b((cli.n) ((v) this.f588c).f4489a.get());
                }
                if (i21 == 1) {
                    return new zjj.c();
                }
                throw new AssertionError(i21);
            case 6:
                w wVar = (w) this.f588c;
                int i22 = this.f587b;
                if (i22 == 0) {
                    return new ckj.f((cli.n) wVar.f4501b.get());
                }
                if (i22 == 1) {
                    return new ckj.g(wVar.f4500a);
                }
                throw new AssertionError(i22);
            case 7:
                m0 m0Var = (m0) this.f588c;
                EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData esimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData = m0Var.f4339a;
                int i32 = this.f587b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new mlj.l(esimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData, new olj.a());
                    }
                    throw new AssertionError(i32);
                }
                cli.n nVar = (cli.n) m0Var.f4340b.get();
                nd.k kVar = new nd.k(new olj.a());
                olj.a aVar8 = new olj.a();
                olj.a phoneNumberPortingUserInputMasker = new olj.a();
                Intrinsics.checkNotNullParameter(phoneNumberPortingUserInputMasker, "phoneNumberPortingUserInputMasker");
                return new mlj.j(nVar, esimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData, kVar, aVar8, new nd.l());
            case 8:
                o0 o0Var = (o0) this.f588c;
                int i33 = this.f587b;
                if (i33 == 0) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b((cli.n) o0Var.f4371c.get(), o0Var.f4369a);
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData = o0Var.f4369a;
                z80.b bVarS = o0Var.f4370b.f4150p.s();
                s.j(bVarS);
                return new bof.r(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData, new rlj.a(bVarS, new ynj.e()), new rlj.f(), new rlj.b(), new rlj.c(), new rlj.d(), new ugc.a(afj.b.b()));
            case 9:
                u0 u0Var = (u0) this.f588c;
                EsimSetupOptionsScreenContract$InputData esimSetupOptionsScreenContract$InputData = u0Var.f4464a;
                int i43 = this.f587b;
                if (i43 == 0) {
                    return new ohj.h((cli.n) u0Var.f4466c.get(), esimSetupOptionsScreenContract$InputData);
                }
                if (i43 != 1) {
                    throw new AssertionError(i43);
                }
                qhj.g gVar2 = new qhj.g();
                z80.b bVarS2 = u0Var.f4465b.f4150p.s();
                s.j(bVarS2);
                qhj.e eVar3 = new qhj.e(bVarS2, 0);
                ynj.e commonUiBuilder = new ynj.e();
                Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
                return new ohj.j(esimSetupOptionsScreenContract$InputData, gVar2, eVar3, new qhj.d(), new qhj.b(), new vnj.a());
            case 10:
                w0 w0Var = (w0) this.f588c;
                afj.b bVar6 = w0Var.f4504b;
                int i59 = this.f587b;
                if (i59 == 0) {
                    jVar = new vmj.j(w0Var.f4503a, new g3((s3) bVar6.f4140k0.get(), (v2) bVar6.R.get(), (c0) bVar6.f4124b1.get(), new ynj.o(bVar6.f4150p.d())), new k3(new ynj.s((yy0.f) w0Var.d.get(), bVar6.o.f()), new ynj.k(bVar6.f4153r), bVar6.C.a()), new ymj.a(), (cli.n) w0Var.f.get());
                } else {
                    if (i59 == 1) {
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) w0Var.f4505c.get();
                        wmj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        yy0.f fVarQ = jh.d.f(controller.m2()).Q();
                        s.k(fVarQ);
                        return fVarQ;
                    }
                    if (i59 != 2) {
                        if (i59 != 3) {
                            throw new AssertionError(i59);
                        }
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) w0Var.f4505c.get();
                        wmj.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return new c90.c(controller2.m2());
                    }
                    jVar = new vmj.k(new xmj.h(new xmj.d((c90.c) w0Var.e.get()), (gej.a) bVar6.K.get()), new xmj.f(new xmj.d((c90.c) w0Var.e.get())), new nij.b(bVar6.f4153r));
                }
                return jVar;
            case 11:
                int i66 = this.f587b;
                if (i66 == 0) {
                    a1 a1Var = (a1) this.f588c;
                    return new wgj.f(a1Var.f4112b, (cli.n) a1Var.f4113c.get());
                }
                if (i66 == 1) {
                    return new wgj.g(new ygj.a());
                }
                throw new AssertionError(i66);
            case 12:
                int i74 = this.f587b;
                if (i74 == 0) {
                    a1 a1Var2 = (a1) this.f588c;
                    return new wgj.f(a1Var2.f4112b, (cli.n) a1Var2.f4113c.get());
                }
                if (i74 == 1) {
                    return new wgj.g(new ygj.a());
                }
                throw new AssertionError(i74);
            case 13:
                f1 f1Var = (f1) this.f588c;
                int i92 = this.f587b;
                if (i92 == 0) {
                    return new mhj.b((cli.n) f1Var.f4241c.get());
                }
                if (i92 == 1) {
                    return new mhj.c(f1Var.f4240b);
                }
                throw new AssertionError(i92);
            case 14:
                f1 f1Var2 = (f1) this.f588c;
                int i96 = this.f587b;
                if (i96 == 0) {
                    return new mhj.b((cli.n) f1Var2.f4241c.get());
                }
                if (i96 == 1) {
                    return new mhj.c(f1Var2.f4240b);
                }
                throw new AssertionError(i96);
            case 15:
                f1 f1Var3 = (f1) this.f588c;
                int i99 = this.f587b;
                if (i99 == 0) {
                    return new mhj.b((cli.n) f1Var3.f4241c.get());
                }
                if (i99 == 1) {
                    return new mhj.c(f1Var3.f4240b);
                }
                throw new AssertionError(i99);
            case 16:
                f1 f1Var4 = (f1) this.f588c;
                int i100 = this.f587b;
                if (i100 == 0) {
                    return new mhj.b((cli.n) f1Var4.f4241c.get());
                }
                if (i100 == 1) {
                    return new mhj.c(f1Var4.f4240b);
                }
                throw new AssertionError(i100);
            case 17:
                n1 n1Var = (n1) this.f588c;
                int i101 = this.f587b;
                if (i101 == 0) {
                    return new lij.e((cli.n) n1Var.d.get(), n1Var.f4358b);
                }
                if (i101 == 1) {
                    return new lij.f(new nij.h((gej.a) n1Var.f4359c.K.get()));
                }
                throw new AssertionError(i101);
            case 18:
                n1 n1Var2 = (n1) this.f588c;
                int i102 = this.f587b;
                if (i102 == 0) {
                    return new lij.e((cli.n) n1Var2.d.get(), n1Var2.f4358b);
                }
                if (i102 == 1) {
                    return new lij.f(new nij.h((gej.a) n1Var2.f4359c.K.get()));
                }
                throw new AssertionError(i102);
            case 19:
                t1 t1Var = (t1) this.f588c;
                EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData = t1Var.f4451b;
                int i103 = this.f587b;
                if (i103 == 0) {
                    return new tkj.g((cli.n) t1Var.f4452c.get(), esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData);
                }
                if (i103 == 1) {
                    return new tkj.i(esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData);
                }
                throw new AssertionError(i103);
            case 20:
                t1 t1Var2 = (t1) this.f588c;
                EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData2 = t1Var2.f4451b;
                int i104 = this.f587b;
                if (i104 == 0) {
                    return new tkj.g((cli.n) t1Var2.f4452c.get(), esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData2);
                }
                if (i104 == 1) {
                    return new tkj.i(esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData2);
                }
                throw new AssertionError(i104);
            case 21:
                v1 v1Var = (v1) this.f588c;
                int i105 = this.f587b;
                if (i105 == 0) {
                    return new tjj.i((cli.n) v1Var.f4495c.get());
                }
                if (i105 == 1) {
                    return new tjj.k(v1Var.f4494b, new ugc.a(afj.b.b()));
                }
                throw new AssertionError(i105);
            case 22:
                b2 b2Var = (b2) this.f588c;
                int i106 = this.f587b;
                if (i106 == 0) {
                    return new akj.e((cli.n) b2Var.f4177c.get());
                }
                if (i106 == 1) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.b(b2Var.f4176b);
                }
                throw new AssertionError(i106);
            case 23:
                l2 l2Var = (l2) this.f588c;
                EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData = l2Var.f4331b;
                int i107 = this.f587b;
                if (i107 == 0) {
                    return new jmj.b((cli.n) l2Var.f4332c.get(), esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData);
                }
                if (i107 == 1) {
                    return new jmj.c(esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData);
                }
                throw new AssertionError(i107);
            case 24:
                int i108 = this.f587b;
                if (i108 == 0) {
                    return new nmj.c((cli.n) ((n2) this.f588c).f4361b.get());
                }
                if (i108 == 1) {
                    return new nmj.d();
                }
                throw new AssertionError(i108);
            case 25:
                v1 v1Var2 = (v1) this.f588c;
                int i109 = this.f587b;
                if (i109 == 0) {
                    return new tjj.i((cli.n) v1Var2.f4495c.get());
                }
                if (i109 == 1) {
                    return new tjj.k(v1Var2.f4494b, new ugc.a(afj.b.b()));
                }
                throw new AssertionError(i109);
            case 26:
                b2 b2Var2 = (b2) this.f588c;
                int i110 = this.f587b;
                if (i110 == 0) {
                    return new akj.e((cli.n) b2Var2.f4177c.get());
                }
                if (i110 == 1) {
                    return new com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.b(b2Var2.f4176b);
                }
                throw new AssertionError(i110);
            case 27:
                int i111 = this.f587b;
                if (i111 == 0) {
                    return new nmj.c((cli.n) ((n2) this.f588c).f4361b.get());
                }
                if (i111 == 1) {
                    return new nmj.d();
                }
                throw new AssertionError(i111);
            case 28:
                v1 v1Var3 = (v1) this.f588c;
                int i112 = this.f587b;
                if (i112 == 0) {
                    return new tjj.i((cli.n) v1Var3.f4495c.get());
                }
                if (i112 == 1) {
                    return new tjj.k(v1Var3.f4494b, new ugc.a(afj.b.b()));
                }
                throw new AssertionError(i112);
            default:
                v1 v1Var4 = (v1) this.f588c;
                int i113 = this.f587b;
                if (i113 == 0) {
                    return new tjj.i((cli.n) v1Var4.f4495c.get());
                }
                if (i113 == 1) {
                    return new tjj.k(v1Var4.f4494b, new ugc.a(afj.b.b()));
                }
                throw new AssertionError(i113);
        }
    }
}
