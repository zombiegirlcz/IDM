package i72;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.apm.multibanco.impl.data.database.MultibancoDatabase;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoCardService;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoPendingPaymentService;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoService;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoWithdrawalService;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.data.network.UpiQrCodeService;
import com.revolut.feature.apm.upi.impl.data.network.UpiService;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.provider.UpiAliasDialogProvider;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.shared.signin.impl.data.SigninService;
import com.revolut.shared.feature.rates.impl.database.SharedRatesRoomDatabase;
import com.revolut.shared.feature.rates.impl.network.RatesService;
import grl.k9;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;
import skm.p0;
import ulm.a1;
import ulm.b1;
import y7a.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f159108c;

    public /* synthetic */ j(Object obj2, int i, int i2) {
        this.f159106a = i2;
        this.f159108c = obj2;
        this.f159107b = i;
    }

    private final Object a() {
        iw2.b bVar = (iw2.b) this.f159108c;
        int i = this.f159107b;
        switch (i) {
            case 0:
                hri.b bVar2 = bVar.f168918a;
                return new ifm.b();
            case 1:
                hri.b bVar3 = bVar.f168918a;
                return new iri.j();
            case 2:
                return new ew2.v();
            case 3:
                return new cn.e();
            case 4:
                return new um.c();
            case 5:
                bVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 6:
                return new ln.c();
            case 7:
                return new ym.d();
            case 8:
                return new mm.d();
            case 9:
                return new g3l.g();
            case 10:
                return new sm.e();
            case 11:
                return new om.c();
            case 12:
                ew2.f fVar = (ew2.f) bVar.f168928q.get();
                l93.b bVarG = bVar.d.g();
                vc.s.j(bVarG);
                eli.j jVarA = bVar.e.a();
                ang.f fVarE = bVar.f.e();
                fk3.a aVarA = bVar.f168921g.a();
                vc.s.j(aVarA);
                ecm.q qVarA = bVar.f168922h.a();
                al4.b bVarN = bVar.i.n();
                vc.s.j(bVarN);
                return new ew2.k(fVar, bVarG, jVarA, fVarE, aVarA, qVarA, bVarN, (ifm.b) bVar.o.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        iwb.s sVar = (iwb.s) this.f159108c;
        int i = this.f159107b;
        if (i == 0) {
            return new c1g.v((svb.a) sVar.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        gte.a aVarB = sVar.f169075a.b();
        vc.s.j(aVarB);
        eub.a aVarA = sVar.f169076b.a();
        vc.s.j(aVarA);
        return new jwb.c(aVarA, aVarB, sVar.f169077c.a());
    }

    private final Object c() {
        iwb.t tVar = (iwb.t) this.f159108c;
        int i = this.f159107b;
        if (i == 0) {
            return new exb.a();
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        jwb.e eVarB = tVar.f169078a.b();
        vc.s.j(eVarB);
        l80.e eVarH = tVar.f169079b.h();
        vc.s.j(eVarH);
        return new fxb.h(eVarB, eVarH);
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object dVar;
        Object cVar;
        int i = this.f159106a;
        int i2 = this.f159107b;
        Object obj2 = this.f159108c;
        switch (i) {
            case 0:
                k kVar = (k) obj2;
                if (i2 == 0) {
                    return new g72.h();
                }
                if (i2 == 1) {
                    sri.m mVar = (sri.m) kVar.f.get();
                    uw1.c cVarD = ((lz1.m) kVar.f159110b).d();
                    vc.s.j(cVarD);
                    return new h72.c(mVar, cVarD);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                Context context = kVar.f159111c;
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 1:
                l lVar = (l) obj2;
                switch (i2) {
                    case 0:
                        return new a72.h((MultibancoService) lVar.e.get());
                    case 1:
                        Retrofit retrofit = ((nj0.d) lVar.f159113a).f();
                        h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(MultibancoService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        MultibancoService multibancoService = (MultibancoService) objCreate;
                        vc.s.k(multibancoService);
                        return multibancoService;
                    case 2:
                        return new a72.d((MultibancoCardService) lVar.f159116g.get());
                    case 3:
                        Retrofit retrofit3 = ((nj0.d) lVar.f159113a).f();
                        h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate2 = retrofit3.create(MultibancoCardService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        MultibancoCardService multibancoCardService = (MultibancoCardService) objCreate2;
                        vc.s.k(multibancoCardService);
                        return multibancoCardService;
                    case 4:
                        return new a72.f((MultibancoPendingPaymentService) lVar.i.get());
                    case 5:
                        Retrofit retrofit4 = ((nj0.d) lVar.f159113a).f();
                        h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(MultibancoPendingPaymentService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        MultibancoPendingPaymentService multibancoPendingPaymentService = (MultibancoPendingPaymentService) objCreate3;
                        vc.s.k(multibancoPendingPaymentService);
                        return multibancoPendingPaymentService;
                    case 6:
                        MultibancoWithdrawalService multibancoWithdrawalService = (MultibancoWithdrawalService) lVar.k.get();
                        c72.d dVar2 = (c72.d) lVar.f159120m.get();
                        ne0.j jVar = (ne0.j) lVar.f159121n.get();
                        l80.e eVarH = lVar.f159115c.h();
                        vc.s.j(eVarH);
                        CoroutineScope coroutineScopeA = lVar.d.a();
                        vc.s.j(coroutineScopeA);
                        return new a72.m(multibancoWithdrawalService, dVar2, jVar, eVarH, coroutineScopeA);
                    case 7:
                        Retrofit retrofit5 = ((nj0.d) lVar.f159113a).f();
                        h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Object objCreate4 = retrofit5.create(MultibancoWithdrawalService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                        MultibancoWithdrawalService multibancoWithdrawalService2 = (MultibancoWithdrawalService) objCreate4;
                        vc.s.k(multibancoWithdrawalService2);
                        return multibancoWithdrawalService2;
                    case 8:
                        MultibancoDatabase database = (MultibancoDatabase) lVar.f159119l.get();
                        e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        c72.d dVarG = database.g();
                        vc.s.k(dVarG);
                        return dVarG;
                    case 9:
                        Context context2 = lVar.f159114b;
                        e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        MultibancoDatabase multibancoDatabase = (MultibancoDatabase) Room.databaseBuilder(context2, MultibancoDatabase.class, "temp_apm_multibanco_db").fallbackToDestructiveMigration().build();
                        vc.s.k(multibancoDatabase);
                        return multibancoDatabase;
                    case 10:
                        e.Companion.getClass();
                        return new ne0.d();
                    case 11:
                        return new ahl.a(lVar.f159114b, (MultibancoDatabase) lVar.f159119l.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                m mVar2 = (m) obj2;
                switch (i2) {
                    case 0:
                        return new g72.a();
                    case 1:
                        kz9.a aVarA = mVar2.d.a();
                        vc.s.j(aVarA);
                        v62.a aVar2 = (v62.a) mVar2.e.e.get();
                        vc.s.j(aVar2);
                        return new p72.h(aVarA, aVar2);
                    case 2:
                        hy1.y yVar = (hy1.y) ((ey1.e) mVar2.f).L.get();
                        vc.s.j(yVar);
                        om4.d0 d0Var = new om4.d0((c12.f) mVar2.C.get());
                        v62.a aVar3 = (v62.a) mVar2.e.e.get();
                        vc.s.j(aVar3);
                        return new p72.n(yVar, d0Var, aVar3);
                    case 3:
                        x92.m mVar3 = new x92.m();
                        th0.a aVar4 = mVar2.f159126g;
                        Context context3 = mVar2.f159127h;
                        xg0.a aVarA2 = aVar4.a();
                        vc.s.j(aVarA2);
                        x92.j jVar2 = new x92.j(mVar3, new tb4.t(aVarA2, context3));
                        xg0.a aVarA3 = mVar2.f159126g.a();
                        vc.s.j(aVarA3);
                        tb4.t tVar = new tb4.t(aVarA3, context3);
                        l72.e eVar = (l72.e) mVar2.E.get();
                        ang.f fVarE = mVar2.f159128j.e();
                        z80.b bVarS = mVar2.k.s();
                        vc.s.j(bVarS);
                        return new m72.k(jVar2, tVar, eVar, fVarE, bVarS, context3, (CoroutineScope) mVar2.F.get());
                    case 4:
                        a72.h hVar = (a72.h) mVar2.i.f.get();
                        vc.s.j(hVar);
                        return new l72.e(hVar);
                    case 5:
                        n72.b.Companion.getClass();
                        return rd0.e.a(p0.f264002b);
                    case 6:
                        a72.f fVar = (a72.f) mVar2.i.f159118j.get();
                        vc.s.j(fVar);
                        return new l72.f(fVar);
                    case 7:
                        return new p72.g((l72.e) mVar2.E.get(), mVar2.a(), (l72.f) mVar2.H.get(), (l72.c) mVar2.I.get(), (m72.a) mVar2.G.get());
                    case 8:
                        a72.h hVar2 = (a72.h) mVar2.i.f.get();
                        vc.s.j(hVar2);
                        a72.a aVar5 = (a72.a) mVar2.i.f159117h.get();
                        vc.s.j(aVar5);
                        l93.f fVarJ = mVar2.f159130m.j();
                        vc.s.j(fVarJ);
                        return new l72.d(hVar2, aVar5, fVarJ);
                    case 9:
                        a72.i iVar = (a72.i) mVar2.i.o.get();
                        vc.s.j(iVar);
                        return new l72.i(iVar);
                    case 10:
                        s70.a aVarM = mVar2.k.m();
                        vc.s.j(aVarM);
                        y80.a aVarR = mVar2.k.r();
                        vc.s.j(aVarR);
                        return new pn3.b(aVarM, aVarR);
                    case 11:
                        h12.h hVarF = mVar2.f159132p.f();
                        vc.s.j(hVarF);
                        whf.b bVarA = mVar2.f159134r.a();
                        vc.s.j(bVarA);
                        return new p72.q(hVarF, new q72.a(bVarA));
                    default:
                        throw new AssertionError(i2);
                }
            case 3:
                n nVar = (n) obj2;
                if (i2 == 0) {
                    return new t72.m(nVar.f159140a, (l72.b) nVar.f159143g.get(), new y72.a(), new t72.n());
                }
                if (i2 == 1) {
                    da3.j jVar3 = nVar.f159141b.f159130m;
                    l93.f fVarJ2 = jVar3.j();
                    vc.s.j(fVarJ2);
                    ha3.f fVarD = jVar3.d();
                    vc.s.j(fVarD);
                    return new l72.b(new ja3.f((Context) nVar.d.get(), (c90.c) nVar.f.get(), fVarD, fVarJ2, (yy0.f) nVar.e.get()));
                }
                if (i2 == 2) {
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.f159142c.get();
                    u72.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    Activity activityM2 = controller.m2();
                    vc.s.k(activityM2);
                    return activityM2;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) nVar.f159142c.get();
                    u72.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    return new c90.c(controller2.m2());
                }
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) nVar.f159142c.get();
                u72.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                yy0.f fVarQ = jh.d.f(controller3.m2()).Q();
                vc.s.k(fVarQ);
                return fVarQ;
            case 4:
                y yVar2 = (y) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new j82.t();
                    }
                    throw new AssertionError(i2);
                }
                PendingPaymentConfirmationScreenContract$InputData pendingPaymentConfirmationScreenContract$InputData = yVar2.f159178a;
                m mVar4 = yVar2.f159179b;
                return new j82.s(pendingPaymentConfirmationScreenContract$InputData, new zq.a((m72.a) mVar4.G.get(), (l72.f) mVar4.H.get()), (cli.n) yVar2.f159180c.get());
            case 5:
                if (i2 == 0) {
                    return new m82.f((cli.n) ((z) obj2).f159181a.get());
                }
                if (i2 == 1) {
                    return new m82.g();
                }
                throw new AssertionError(i2);
            case 6:
                d0 d0Var2 = (d0) obj2;
                a31.a aVar6 = d0Var2.f159072c;
                a31.a aVar7 = d0Var2.f159085x;
                a31.a aVar8 = d0Var2.f159078n;
                a31.a aVar9 = d0Var2.f;
                a31.a aVar10 = d0Var2.d;
                ecm.q qVar = d0Var2.f159070a;
                if (i2 == 0) {
                    return new a(qVar, d0Var2.f159071b, aVar6, d0Var2.F);
                }
                if (i2 == 1) {
                    l lVar2 = (l) ((f) d0Var2.E.get()).b();
                    vc.s.k(lVar2);
                    return lVar2;
                }
                if (i2 == 2) {
                    return new f(aVar10, d0Var2.e, aVar9, qVar);
                }
                if (i2 == 3) {
                    return new i(qVar, d0Var2.f159073g, aVar10, d0Var2.f159074h, d0Var2.i, aVar9, d0Var2.f159075j, d0Var2.k, aVar6, d0Var2.f159076l, d0Var2.H, d0Var2.F, d0Var2.f159077m, aVar8, d0Var2.o, d0Var2.f159079p, d0Var2.f159080q, d0Var2.f159081r, d0Var2.f159082s, d0Var2.f159083t, d0Var2.u, d0Var2.v, d0Var2.f159084w, aVar7, d0Var2.f159086y, d0Var2.z, d0Var2.A, d0Var2.B, d0Var2.C, d0Var2.D);
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new emi.g(qVar, aVar10, aVar9, aVar8, aVar7, 2);
                    }
                    throw new AssertionError(i2);
                }
                k kVar2 = (k) ((a) d0Var2.G.get()).b();
                vc.s.k(kVar2);
                return kVar2;
            case 7:
                i9e.r rVar = (i9e.r) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.b((cli.n) rVar.f159740b.get(), rVar.f159739a);
                }
                if (i2 == 1) {
                    return new com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.c();
                }
                throw new AssertionError(i2);
            case 8:
                i9e.x xVar = (i9e.x) obj2;
                if (i2 == 0) {
                    return new p9e.g((jki.p) xVar.f159756b.get(), xVar.f159755a);
                }
                if (i2 == 1) {
                    return new p9e.h();
                }
                throw new AssertionError(i2);
            case 9:
                i9l.a aVar11 = (i9l.a) obj2;
                if (i2 == 0) {
                    m9l.f fVar2 = (m9l.f) aVar11.i.get();
                    fk3.a aVarA4 = aVar11.d.f218268a.a();
                    vc.s.j(aVarA4);
                    return new k9l.a(fVar2, new npk.o(aVarA4));
                }
                if (i2 == 1) {
                    return new m9l.f((RatesService) aVar11.f.get(), (f9l.b) aVar11.f159891h.get());
                }
                if (i2 == 2) {
                    Retrofit retrofit6 = (Retrofit) aVar11.e.get();
                    i9l.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                    Object objCreate5 = retrofit6.create(RatesService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                    RatesService ratesService = (RatesService) objCreate5;
                    vc.s.k(ratesService);
                    return ratesService;
                }
                if (i2 == 3) {
                    Retrofit retrofit7 = ((nj0.d) aVar11.f159887a).f();
                    kg.o gson = fe0.c.a();
                    d9l.a networkConfiguration = aVar11.f159888b;
                    i9l.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit7, "retrofit");
                    Intrinsics.checkNotNullParameter(gson, "gson");
                    Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
                    return j6.a.B(retrofit7.newBuilder().baseUrl(networkConfiguration.getHostUrl()), gson, "build(...)");
                }
                if (i2 == 4) {
                    SharedRatesRoomDatabase db8 = (SharedRatesRoomDatabase) aVar11.f159890g.get();
                    i9l.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(db8, "db");
                    f9l.b bVarG = db8.g();
                    vc.s.k(bVarG);
                    return bVarG;
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                Context context4 = aVar11.f159889c;
                i9l.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context4, "context");
                RoomDatabase.Builder builderFallbackToDestructiveMigration = Room.databaseBuilder(context4, SharedRatesRoomDatabase.class, "shared_rates_database").fallbackToDestructiveMigration(true);
                SharedRatesRoomDatabase.INSTANCE.getClass();
                SharedRatesRoomDatabase sharedRatesRoomDatabase = (SharedRatesRoomDatabase) builderFallbackToDestructiveMigration.addMigrations((Migration[]) Arrays.copyOf(new Migration[]{f9l.a.f132989c}, 1)).build();
                vc.s.k(sharedRatesRoomDatabase);
                return sharedRatesRoomDatabase;
            case 10:
                idd.a aVar12 = (idd.a) obj2;
                if (i2 == 0) {
                    SigninService signinService = (SigninService) aVar12.d.get();
                    sf0.h hVarB = aVar12.f160471c.b();
                    vc.s.j(hVarB);
                    return new edd.d(signinService, hVarB, fe0.c.a());
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new hdd.a();
                    }
                    throw new AssertionError(i2);
                }
                ik0.b retrofitFactory = ((nj0.d) aVar12.f160469a).m();
                vc.s.j(retrofitFactory);
                ddd.a signinNetworkConfiguration = aVar12.f160470b;
                idd.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(signinNetworkConfiguration, "signinNetworkConfiguration");
                Object objCreate6 = ik0.b.a(retrofitFactory, null, signinNetworkConfiguration.getHostUrl(), null, null, 29).create(SigninService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate6, "create(...)");
                SigninService signinService2 = (SigninService) objCreate6;
                vc.s.k(signinService2);
                return signinService2;
            case 11:
                if (i2 == 0) {
                    if2.b bVar = (if2.b) obj2;
                    return new qg2.f(bVar.f160839a, (cli.n) bVar.f160840b.get());
                }
                if (i2 == 1) {
                    return new qg2.g();
                }
                throw new AssertionError(i2);
            case 12:
                if2.f fVar3 = (if2.f) obj2;
                switch (i2) {
                    case 0:
                        af2.h hVar3 = new af2.h();
                        fVar3.getClass();
                        return new af2.g(hVar3, ImmutableSet.of(new hf2.a()));
                    case 1:
                        uw1.c cVarD2 = ((lz1.m) fVar3.f160852b).d();
                        vc.s.j(cVarD2);
                        return new af2.b(cVarD2, new af2.h());
                    case 2:
                        if2.r rVar2 = fVar3.f160853c;
                        Json baseJson = fe0.d.a();
                        ik0.b retrofitFactory2 = ((nj0.d) fVar3.e).m();
                        vc.s.j(retrofitFactory2);
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                        Retrofit.Builder builderNewBuilder = ik0.b.a(retrofitFactory2, null, null, null, null, 31).newBuilder();
                        List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
                        listConverterFactories.clear();
                        b1.Companion.getClass();
                        listConverterFactories.add(ek.b.a(baseJson, a1.a("application/json")));
                        Retrofit retrofitBuild = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        Object objCreate7 = retrofitBuild.create(UpiQrCodeService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate7, "create(...)");
                        UpiQrCodeService upiQrCodeService = (UpiQrCodeService) objCreate7;
                        vc.s.k(upiQrCodeService);
                        return upiQrCodeService;
                    case 3:
                        an0.c cVar2 = fVar3.f;
                        ee0.a aVar13 = fVar3.d;
                        yk0.a databaseSessionProvider = cVar2.b();
                        vc.s.j(databaseSessionProvider);
                        je0.d objectMapper = aVar13.d();
                        vc.s.j(objectMapper);
                        xe0.f storageFactory = aVar13.f();
                        vc.s.j(storageFactory);
                        if2.t.Companion.getClass();
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "apm_storage_upi", objectMapper, 1, null, 48);
                    case 4:
                        return new ne0.d();
                    case 5:
                        Context context5 = fVar3.f160855h;
                        uw1.c cVarD3 = ((lz1.m) fVar3.f160852b).d();
                        vc.s.j(cVarD3);
                        return new ah2.e(new ah2.d(context5, cVarD3, fVar3.i.b(), fVar3.f160856j.b(), (zzl.b) fVar3.C.get()));
                    case 6:
                        if2.v.Companion.getClass();
                        return new zzl.c();
                    case 7:
                        Context context6 = fVar3.f160855h;
                        uw1.c cVarD4 = ((lz1.m) fVar3.f160852b).d();
                        vc.s.j(cVarD4);
                        return new ah2.d(context6, cVarD4, fVar3.i.b(), fVar3.f160856j.b(), (zzl.b) fVar3.C.get());
                    case 8:
                        j provider = fVar3.F;
                        kf2.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return new kf2.c(provider);
                    case 9:
                        return new jf2.i(fVar3.b(), new UpiAliasDialogProvider());
                    case 10:
                        return new yg2.a();
                    case 11:
                        sri.m mVar5 = (sri.m) fVar3.I.get();
                        uw1.c cVarD5 = ((lz1.m) fVar3.f160852b).d();
                        vc.s.j(cVarD5);
                        return new af2.f(mVar5, cVarD5, fVar3.c());
                    case 12:
                        Context context7 = fVar3.f160855h;
                        if2.v.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context7, "context");
                        return sri.o.c(context7, null, null, 14);
                    case 13:
                        zja.a aVarA5 = ((ika.b) fVar3.f160860p).a();
                        vc.s.j(aVarA5);
                        return new zf2.c(aVarA5);
                    case 14:
                        if2.r rVar3 = fVar3.f160853c;
                        UpiService upiService = (UpiService) a0.d.f((nj0.d) fVar3.e, "retrofit", UpiService.class, "create(...)");
                        vc.s.k(upiService);
                        return upiService;
                    default:
                        throw new AssertionError(i2);
                }
            case 13:
                if2.j jVar4 = (if2.j) obj2;
                if2.f fVar4 = jVar4.f160876b;
                if (i2 == 0) {
                    return kxa.j.k((j60.a) jVar4.e.get());
                }
                if (i2 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) jVar4.f160877c.get(), (rp0.m) jVar4.d.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                yof.k kVarG = fVar4.f160862r.g();
                vc.s.j(kVarG);
                tf2.i iVar2 = new tf2.i(kVarG);
                UpiIntentPaymentReviewScreenContract$InputData upiIntentPaymentReviewScreenContract$InputData = jVar4.f160875a;
                wsg.n nVarB = fVar4.i.b();
                bf2.c cVar3 = new bf2.c((UpiService) fVar4.L.get(), ((nj0.d) fVar4.e).i);
                vz1.g gVarH = ((lz1.m) fVar4.f160852b).h();
                vc.s.j(gVarH);
                return new tf2.m(iVar2, new uvl.c(upiIntentPaymentReviewScreenContract$InputData, nVarB, cVar3, gVarH));
            case 14:
                h30.q qVar2 = (h30.q) obj2;
                vxc.i iVar3 = (vxc.i) qVar2.f148941b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new jf3.d();
                    }
                    throw new AssertionError(i2);
                }
                j widgetState = (j) qVar2.e;
                bal.a repository = ((vxc.b) iVar3).b();
                vc.s.j(repository);
                use.d ticketsInteractor = ((sse.b) qVar2.f148942c).b();
                vc.s.j(ticketsInteractor);
                jf3.b chargebackInfoProvider = new jf3.b();
                q06.l deeplinkRouter = ((u06.c) qVar2.d).a();
                vc.s.j(deeplinkRouter);
                vxc.b bVar2 = (vxc.b) iVar3;
                z9l.f listItemProvider = (z9l.f) bVar2.f293055s.get();
                vc.s.j(listItemProvider);
                z9l.a buttonMapper = (z9l.a) bVar2.o.get();
                vc.s.j(buttonMapper);
                z9l.k transactionCellSectionMapper = (z9l.k) bVar2.f293052p.get();
                vc.s.j(transactionCellSectionMapper);
                z9l.e entityConfigStatusDialogUiMapper = (z9l.e) bVar2.v.get();
                vc.s.j(entityConfigStatusDialogUiMapper);
                Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
                Intrinsics.checkNotNullParameter(transactionCellSectionMapper, "transactionCellSectionMapper");
                Intrinsics.checkNotNullParameter(entityConfigStatusDialogUiMapper, "entityConfigStatusDialogUiMapper");
                jf3.a chargebackDialogMapper = new jf3.a();
                Intrinsics.checkNotNullParameter(listItemProvider, "listItemProvider");
                Intrinsics.checkNotNullParameter(chargebackDialogMapper, "chargebackDialogMapper");
                jf3.c mapper = new jf3.c();
                Intrinsics.checkNotNullParameter(widgetState, "widgetState");
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
                Intrinsics.checkNotNullParameter(chargebackInfoProvider, "chargebackInfoProvider");
                Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new he2.b(18);
            case 15:
                ihh.a aVar14 = (ihh.a) obj2;
                switch (i2) {
                    case 0:
                        return new jhh.a((m1h.g) aVar14.f.get(), (m1h.d) aVar14.f161411g.get(), (m1h.e) aVar14.f161412h.get(), 0);
                    case 1:
                        return new jhh.b();
                    case 2:
                        aah.i factory = ((u8h.b) aVar14.d).d();
                        vc.s.j(factory);
                        hhh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return new jhh.c(factory.b());
                    case 3:
                        z0h.a aVarB = ((u8h.b) aVar14.d).b();
                        vc.s.j(aVarB);
                        return new jhh.d(aVarB);
                    case 4:
                        return new apc.d((m1h.q) aVar14.f161413j.get(), (m1h.o) aVar14.k.get(), (m1h.l) aVar14.f161414l.get());
                    case 5:
                        return new lhh.e(aVar14.h());
                    case 6:
                        return new lhh.d();
                    case 7:
                        ybl.k kVarD = aVar14.f161408a.d();
                        vc.s.j(kVarD);
                        return new lhh.b(kVarD);
                    case 8:
                        hhh.b.Companion.getClass();
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
                    case 9:
                        ybl.k kVarD2 = aVar14.f161408a.d();
                        vc.s.j(kVarD2);
                        return new ghh.g(kVarD2);
                    case 10:
                        ybl.k kVarD3 = aVar14.f161408a.d();
                        vc.s.j(kVarD3);
                        z98.c cVar4 = (z98.c) aVar14.e.f303605j.get();
                        vc.s.j(cVar4);
                        return new ghh.i(kVarD3, cVar4);
                    case 11:
                        hhh.b.Companion.getClass();
                        return Boolean.TRUE;
                    default:
                        throw new AssertionError(i2);
                }
            case 16:
                ijf.a aVar15 = (ijf.a) obj2;
                l70.e eVar2 = aVar15.f;
                djf.c cVar5 = aVar15.f161779a;
                if (i2 == 0) {
                    return new xmf.b((dtc.i) aVar15.f161782g.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                thf.m textResourcesMapper = cVar5.g();
                vc.s.j(textResourcesMapper);
                thf.c categoryResourcesMapper = cVar5.c();
                vc.s.j(categoryResourcesMapper);
                n8b.a countryInteractor = aVar15.f161780b.a();
                vc.s.j(countryInteractor);
                nhf.a unitedWalletInteractor = aVar15.f161781c.a();
                vc.s.j(unitedWalletInteractor);
                l93.f revolutCardsInteractor = aVar15.d.j();
                vc.s.j(revolutCardsInteractor);
                wif.a userFeaturesChecker = aVar15.e.a();
                t70.b currenciesLocalization = eVar2.g();
                vc.s.j(currenciesLocalization);
                z70.a contextProvider = eVar2.f();
                vc.s.j(contextProvider);
                ijf.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(textResourcesMapper, "textResourcesMapper");
                Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
                Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
                Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                return new dtc.i(textResourcesMapper, categoryResourcesMapper, countryInteractor, unitedWalletInteractor, revolutCardsInteractor, userFeaturesChecker, currenciesLocalization, contextProvider.getContext());
            case 17:
                il8.k kVar3 = (il8.k) obj2;
                l70.e eVar3 = kVar3.f162164a;
                if (i2 == 0) {
                    return new ll8.b();
                }
                if (i2 == 1) {
                    s70.a aVarM2 = eVar3.m();
                    vc.s.j(aVarM2);
                    return new ll8.a(aVarM2, kVar3.f162165b.g());
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                s70.a aVarM3 = eVar3.m();
                vc.s.j(aVarM3);
                y80.a aVarR2 = eVar3.r();
                vc.s.j(aVarR2);
                return new pn3.b(aVarM3, aVarR2);
            case 18:
                in3.e eVar4 = (in3.e) obj2;
                ee0.a aVar16 = eVar4.f162620a;
                if (i2 == 0) {
                    in3.d.Companion.getClass();
                    return new mn3.a();
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                je0.d mapper2 = aVar16.b();
                vc.s.j(mapper2);
                yk0.a databaseSessionProvider2 = eVar4.f162621b.b();
                vc.s.j(databaseSessionProvider2);
                xe0.f storageFactory2 = aVar16.f();
                vc.s.j(storageFactory2);
                in3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider2, "feature_contacts_chooser", mapper2, 0, null, 56);
            case 19:
                aj3.j jVar5 = (aj3.j) obj2;
                PickerScreenContract$InputData pickerScreenContract$InputData = jVar5.f5394b;
                if (i2 == 0) {
                    return new f0(ImmutableMap.of("TaxResidencyPickerScreenInteractor", (a8a.d) ((ine.n) jVar5.f).f162878g.get()), pickerScreenContract$InputData, (jki.p) jVar5.d.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, jVar5.f5395c);
                }
                throw new AssertionError(i2);
            case 20:
                aj3.j jVar6 = (aj3.j) obj2;
                PickerScreenContract$InputData pickerScreenContract$InputData2 = jVar6.f5394b;
                if (i2 == 0) {
                    return new f0(ImmutableMap.of("TaxResidencyPickerScreenInteractor", (a8a.d) ((ine.m) jVar6.f).e.get()), pickerScreenContract$InputData2, (jki.p) jVar6.d.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData2, jVar6.f5395c);
                }
                throw new AssertionError(i2);
            case 21:
                ioh.a aVar17 = (ioh.a) obj2;
                a31.a aVar18 = aVar17.i;
                a31.a aVar19 = aVar17.f163330c;
                ecm.q qVar3 = aVar17.f163328a;
                if (i2 == 0) {
                    return new af5.f(qVar3, aVar17.f163329b, aVar19, aVar17.d, aVar17.e, aVar17.f, aVar17.f163331g, aVar17.f163332h, aVar18, aVar17.f163333j, 4);
                }
                if (i2 == 1) {
                    return new bo9.d(qVar3, aVar19, aVar17.k, aVar17.f163334l, aVar17.f163335m, aVar18, 7);
                }
                throw new AssertionError(i2);
            case 22:
                ir1.c cVar6 = (ir1.c) obj2;
                if (i2 == 0) {
                    return new mr1.h((cli.n) cVar6.f167958b.get(), cVar6.f167957a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                nr1.d formFieldsValidator = new nr1.d();
                Intrinsics.checkNotNullParameter(formFieldsValidator, "formFieldsValidator");
                return new mr1.j();
            case 23:
                ir1.g gVar = (ir1.g) obj2;
                a31.a aVar20 = gVar.f167976g;
                a31.a aVar21 = gVar.f;
                a31.a aVar22 = gVar.e;
                a31.a aVar23 = gVar.d;
                a31.a aVar24 = gVar.f167975c;
                a31.a aVar25 = gVar.f167974b;
                ecm.q qVar4 = gVar.f167973a;
                if (i2 == 0) {
                    return new a0b.g(qVar4, aVar25, aVar24, aVar23, aVar22, aVar21, aVar20, 4);
                }
                if (i2 == 1) {
                    return new bo9.g(qVar4, aVar25, aVar24, aVar23, aVar22, gVar.f167977h, aVar21, aVar20, 1);
                }
                throw new AssertionError(i2);
            case 24:
                iti.c cVar7 = (iti.c) obj2;
                ecm.q qVar5 = cVar7.f168396a;
                a31.a aVar26 = cVar7.f168400h;
                a31.a aVar27 = cVar7.f;
                if (i2 == 0) {
                    aVar = new kti.a(cVar7.f168397b, cVar7.f168398c, cVar7.d, cVar7.e, aVar27, cVar7.f168399g, aVar26, qVar5);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            kti.g gVar2 = (kti.g) ((kti.a) cVar7.f168409t.get()).b();
                            vc.s.k(gVar2);
                            return gVar2;
                        }
                        if (i2 == 3) {
                            dVar = new a51.d(cVar7.u, 12);
                        } else {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    return new a7d.a(aVar26, 25);
                                }
                                throw new AssertionError(i2);
                            }
                            dVar = new b6b.f(aVar27, cVar7.u, 3);
                        }
                        return dVar;
                    }
                    aVar = new hc2.e(qVar5, cVar7.u, cVar7.i, aVar27, cVar7.f168401j, cVar7.k, cVar7.f168402l, cVar7.f168403m, cVar7.f168404n, cVar7.o, cVar7.f168405p, cVar7.f168406q, cVar7.f168407r, cVar7.f168408s);
                }
                return aVar;
            case 25:
                return a();
            case 26:
                iwb.j jVar7 = (iwb.j) obj2;
                if (i2 == 0) {
                    return new zwb.e((cli.n) jVar7.f169037b.get(), jVar7.f169036a);
                }
                if (i2 == 1) {
                    return new zwb.f();
                }
                throw new AssertionError(i2);
            case 27:
                return b();
            case 28:
                return c();
            default:
                iwh.c cVar8 = (iwh.c) obj2;
                l70.e eVar5 = cVar8.e;
                da3.j jVar8 = cVar8.f169089a;
                if (i2 == 0) {
                    l93.f fVarJ3 = jVar8.j();
                    vc.s.j(fVarJ3);
                    ha3.f fVarD2 = jVar8.d();
                    vc.s.j(fVarD2);
                    ang.f fVarE2 = cVar8.f169090b.e();
                    fk3.a aVarA6 = cVar8.f169091c.a();
                    vc.s.j(aVarA6);
                    cVar = new gwh.c(fVarJ3, fVarD2, fVarE2, aVarA6);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z70.a contextProvider2 = eVar5.f();
                            vc.s.j(contextProvider2);
                            iwh.b.Companion.getClass();
                            Intrinsics.checkNotNullParameter(contextProvider2, "contextProvider");
                            return new c90.c(contextProvider2.getContext());
                        }
                        if (i2 != 3) {
                            throw new AssertionError(i2);
                        }
                        z70.a contextProvider3 = eVar5.f();
                        vc.s.j(contextProvider3);
                        iwh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(contextProvider3, "contextProvider");
                        return new c90.c(contextProvider3.getContext());
                    }
                    l93.f fVarJ4 = jVar8.j();
                    vc.s.j(fVarJ4);
                    cVar = new gwh.b(fVarJ4);
                }
                return cVar;
        }
    }
}
