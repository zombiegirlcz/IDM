package of3;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableSet;
import com.revolut.chat_core.R$drawable;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.backgroundpicker.impl.network.BackgroundPickerService;
import com.revolut.feature.chat.impl.network.ChatRelatedService;
import com.revolut.feature.pay_later.impl.database.PayLaterDatabase;
import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import com.revolut.feature.pay_later.impl.ui.help.PayLaterGetHelpDialogFactory;
import com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase;
import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.MessagingEncryptionService;
import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService;
import com.revolut.feature.payments.recents.impl.data.PaymentsRecentDatabase;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayDeferredPaymentsService;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayJoinApiService;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import com.revolut.feature.transaction.troubleshooter.impl.network.TransactionTroubleshooterService;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.PaymentVendorsService;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance.data.network.RemittanceService;
import cu8.r0;
import e7c.c0;
import ecm.q;
import ej9.f0;
import er9.x;
import h6i.q0;
import i31.l;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jqa.p;
import k7c.d0;
import k7c.j0;
import k7c.m0;
import k7c.p0;
import k7c.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ljl.q1;
import mv9.k;
import oi9.y;
import p2k.b0;
import p2k.c0;
import p2k.e0;
import p2k.g0;
import p7c.a1;
import p7c.f1;
import p7c.i1;
import p7c.s0;
import p7c.u0;
import pa6.m;
import qgk.i3;
import qgk.k3;
import qgk.l3;
import qgk.m3;
import qgk.n3;
import qgk.q3;
import qgk.t3;
import ql7.e2;
import ql7.h2;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sl3.u;
import vc.s;
import vl3.n;
import vx9.o;
import vx9.t;
import vx9.z;
import xx9.r;
import yhm.m;
import yo5.w;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f224685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f224686c;

    public /* synthetic */ e(Object obj2, int i, int i2) {
        this.f224684a = i2;
        this.f224686c = obj2;
        this.f224685b = i;
    }

    private final Object a() {
        ox9.a aVar = (ox9.a) this.f224686c;
        int i = 3;
        int i2 = this.f224685b;
        switch (i2) {
            case 0:
                e4m.e eVar = aVar.I;
                bw9.a aVar2 = aVar.o;
                n nVar = aVar.f230714q;
                m41.c cVar = aVar.f230713p;
                tv9.a aVar3 = aVar.f230712n;
                jr9.b bVar = aVar.f230708h;
                ov9.a aVar4 = aVar.f230707g;
                xmg.a aVar5 = aVar.f;
                tx9.f timestampManager = (tx9.f) eVar.get();
                hx9.c cVarD = aVar.d();
                ang.f fVarE = aVar5.e();
                k kVar = (k) aVar4.f230002y.get();
                s.j(kVar);
                wif.a aVar6 = new wif.a(new px9.c(kVar, aVar5.e()));
                lr9.j jVar = (lr9.j) bVar.F.get();
                s.j(jVar);
                y45.g gVar = new y45.g(new q(jVar));
                wx9.d dVarE = aVar.e();
                vv9.c cVarC = ((s6k.b) aVar3).c();
                s.j(cVarC);
                ufm.g gVar2 = new ufm.g(cVarC, aVar2.a());
                k61.a aVarE = cVar.e();
                s.j(aVarE);
                wx9.a aVar7 = new wx9.a(aVarE);
                fl3.a aVarE2 = nVar.e();
                s.j(aVarE2);
                r fullLoader = new r(cVarD, fVarE, aVar6, gVar, dVarE, gVar2, aVar7, new qm.e(aVarE2));
                hx9.c cVarD2 = aVar.d();
                ang.f fVarE2 = aVar5.e();
                k kVar2 = (k) aVar4.f230002y.get();
                s.j(kVar2);
                wif.a aVar8 = new wif.a(new px9.c(kVar2, aVar5.e()));
                lr9.j jVar2 = (lr9.j) bVar.F.get();
                s.j(jVar2);
                y45.g gVar3 = new y45.g(new q(jVar2));
                wx9.d dVarE2 = aVar.e();
                vv9.c cVarC2 = ((s6k.b) aVar3).c();
                s.j(cVarC2);
                ufm.g gVar4 = new ufm.g(cVarC2, aVar2.a());
                k61.a aVarE3 = cVar.e();
                s.j(aVarE3);
                wx9.a aVar9 = new wx9.a(aVarE3);
                fl3.a aVarE4 = nVar.e();
                s.j(aVarE4);
                xx9.s partialLoader = new xx9.s(cVarD2, fVarE2, aVar8, gVar3, dVarE2, gVar4, aVar9, new qm.e(aVarE4));
                y80.a permissionProvider = aVar.f230706c.r();
                s.j(permissionProvider);
                asi.d sessionInteractor = ((j51.a) aVar.f230715r).c();
                s.j(sessionInteractor);
                a31.a syncManager = new a31.a(ImmutableSet.of((t) aVar.J.get(), (t) aVar.K.get(), (t) aVar.L.get(), (t) aVar.M.get(), (t) aVar.N.get(), (t) aVar.O.get(), (t) aVar.P.get(), (t) aVar.Q.get(), (t) aVar.R.get(), (t) aVar.S.get()));
                kx9.a aVar10 = (kx9.a) aVar.G.get();
                lr9.j jVar3 = (lr9.j) bVar.F.get();
                s.j(jVar3);
                q qVar = new q(jVar3);
                k kVar3 = (k) aVar4.f230002y.get();
                s.j(kVar3);
                px9.c cVar2 = new px9.c(kVar3, aVar5.e());
                s6k.b bVar2 = (s6k.b) aVar3;
                vv9.c cVarC3 = bVar2.c();
                s.j(cVarC3);
                bjf.a aVar11 = (bjf.a) aVar.i;
                com.revolut.domain.interactors.transactions.a aVarC = aVar11.c();
                s.j(aVarC);
                k61.a aVarE5 = cVar.e();
                s.j(aVarE5);
                fl3.a aVarE6 = nVar.e();
                s.j(aVarE6);
                u uVarG = nVar.g();
                yf.c cVarI = nVar.i();
                c21.b bVar3 = (c21.b) aVar.f230716s;
                o71.a aVarA = bVar3.a();
                ap5.b bVarE = ((w) aVar.u).e();
                s.j(bVarE);
                bu9.a aVarA2 = ((ut9.a) aVar.v).a();
                s.j(aVarA2);
                m mVar = aVar.f230717t;
                aa6.c cVarB = mVar.b();
                s.j(cVarB);
                ga6.a aVarC2 = mVar.c();
                s.j(aVarC2);
                lra.d dVarB = ((p) aVar.f230718w).b();
                s.j(dVarB);
                mq9.f fVarC = bVar.c();
                s.j(fVarC);
                fy1.r rVar = (fy1.r) ((ey1.e) aVar.f230720y).B.get();
                s.j(rVar);
                gte.a aVarB = aVar.e.b();
                s.j(aVarB);
                mj8.b bVar4 = aVar.f230719x;
                hj8.a aVarA3 = bVar4.a();
                s.j(aVarA3);
                xx9.b bVar5 = new xx9.b();
                co9.b bVarB = aVar.z.b();
                s.j(bVarB);
                u0a.a recentPaymentRecipientCacheDelegate = new u0a.a(new xx9.m(aVar10, qVar, cVar2, cVarC3, aVarC, aVarE5, aVarE6, uVarG, cVarI, aVarA, bVarE, aVarA2, cVarB, aVarC2, dVarB, fVarC, rVar, aVarB, aVarA3, bVar5, bVarB, nVar.f()));
                hj8.a juniorProfileInteractor = bVar4.a();
                s.j(juniorProfileInteractor);
                vv9.c moneyRequestInteractor = bVar2.c();
                s.j(moneyRequestInteractor);
                mq9.f groupsInteractor = bVar.c();
                s.j(groupsInteractor);
                y71.c transfersRepository = (y71.c) bVar3.f20585w.get();
                s.j(transfersRepository);
                k messagesRepository = (k) aVar4.f230002y.get();
                s.j(messagesRepository);
                x71.e transactionsRepository = (x71.e) aVar11.f15626n0.get();
                s.j(transactionsRepository);
                Intrinsics.checkNotNullParameter(timestampManager, "timestampManager");
                Intrinsics.checkNotNullParameter(fullLoader, "fullLoader");
                Intrinsics.checkNotNullParameter(partialLoader, "partialLoader");
                Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
                Intrinsics.checkNotNullParameter(sessionInteractor, "sessionInteractor");
                Intrinsics.checkNotNullParameter(syncManager, "syncManager");
                Intrinsics.checkNotNullParameter(recentPaymentRecipientCacheDelegate, "recentPaymentRecipientCacheDelegate");
                Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
                Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
                Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
                Intrinsics.checkNotNullParameter(transfersRepository, "transfersRepository");
                Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
                Intrinsics.checkNotNullParameter(transactionsRepository, "transactionsRepository");
                fc.g gVar5 = new fc.g();
                gVar5.f133579a = timestampManager;
                gVar5.f133580b = fullLoader;
                gVar5.f133581c = partialLoader;
                gVar5.d = permissionProvider;
                gVar5.e = sessionInteractor;
                gVar5.f = syncManager;
                gVar5.f133582g = recentPaymentRecipientCacheDelegate;
                gVar5.f133583h = juniorProfileInteractor;
                ihm.f fVarD = ((u6k.h) moneyRequestInteractor).f277624a.f171819c.d();
                mr9.a aVar12 = (mr9.a) groupsInteractor;
                ((yq9.c) ((x) aVar12.f208082a).f128598c).getClass();
                ihm.f fVar = ((l) transfersRepository).f158088h;
                ((gv9.j) messagesRepository.f209188b).getClass();
                efm.r.mergeArray(fVarD, yq9.a.f315992b, fVar, gv9.b.f147092b, ((xif.s) transactionsRepository).f306382j).flatMapCompletable(new xx9.d(16, new xx9.n(gVar5, i))).v();
                aVar12.f208084c.doOnNext(new xx9.d(17, new xx9.n(gVar5, 4))).subscribe();
                gVar5.i = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(1), new ThreadPoolExecutor.DiscardOldestPolicy());
                return new xx9.p(gVar5);
            case 1:
                return new tx9.f(new tx9.e((ue0.c) aVar.E.get()), (yx9.a) aVar.H.get());
            case 2:
                je0.d mapper = aVar.f230704a.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = aVar.f230705b.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.f230704a.f();
                s.j(storageFactory);
                y80.a permissionProvider2 = aVar.f230706c.r();
                s.j(permissionProvider2);
                ox9.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(permissionProvider2, "permissionProvider");
                return xe0.f.f(storageFactory, databaseSessionProvider, "payments_recents", mapper, 5, v.k(new zx9.a(), new zx9.b(permissionProvider2), new zx9.c(), new zx9.d()), 32);
            case 3:
                kx9.a aVar13 = (kx9.a) aVar.G.get();
                l80.e eVarH = aVar.f230706c.h();
                s.j(eVarH);
                return new yx9.a(aVar13, eVarH);
            case 4:
                PaymentsRecentDatabase db8 = (PaymentsRecentDatabase) aVar.F.get();
                lx9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(db8, "db");
                kx9.a aVarG = db8.g();
                s.k(aVarG);
                return aVarG;
            case 5:
                Context context = aVar.d;
                lx9.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                RoomDatabase.Builder builderFallbackToDestructiveMigration = Room.databaseBuilder(context, PaymentsRecentDatabase.class, "payments_recent_db").fallbackToDestructiveMigration();
                PaymentsRecentDatabase.INSTANCE.getClass();
                PaymentsRecentDatabase paymentsRecentDatabase = (PaymentsRecentDatabase) builderFallbackToDestructiveMigration.addMigrations((Migration[]) Arrays.copyOf(new Migration[]{mx9.a.f210231c, mx9.b.f210232c, mx9.c.f210233c}, 3)).build();
                s.k(paymentsRecentDatabase);
                return paymentsRecentDatabase;
            case 6:
                o71.a aVarA4 = ((c21.b) aVar.f230716s).a();
                kx9.a aVar14 = (kx9.a) aVar.G.get();
                gte.a aVarB2 = aVar.e.b();
                s.j(aVarB2);
                return new vx9.g(aVarA4, aVar14, aVarB2);
            case 7:
                aa6.c cVarB2 = aVar.f230717t.b();
                s.j(cVarB2);
                ga6.a aVarC3 = aVar.f230717t.c();
                s.j(aVarC3);
                return new vx9.g(cVarB2, aVarC3, (kx9.a) aVar.G.get());
            case 8:
                ap5.b bVarE2 = ((w) aVar.u).e();
                s.j(bVarE2);
                bu9.a aVarA5 = ((ut9.a) aVar.v).a();
                s.j(aVarA5);
                return new vx9.g(bVarE2, aVarA5, (kx9.a) aVar.G.get());
            case 9:
                mq9.f fVarC2 = aVar.f230708h.c();
                s.j(fVarC2);
                return new vx9.c(fVarC2, (tx9.f) aVar.I.get(), (kx9.a) aVar.G.get(), aVar.f.e(), aVar.o.a());
            case 10:
                fl3.a aVarE7 = aVar.f230714q.e();
                s.j(aVarE7);
                return new o(aVarE7, (tx9.f) aVar.I.get(), (kx9.a) aVar.G.get(), aVar.f.e(), new vx9.p());
            case 11:
                lra.d dVarB2 = ((p) aVar.f230718w).b();
                s.j(dVarB2);
                return new vx9.s(dVarB2, (kx9.a) aVar.G.get());
            case 12:
                fl3.a aVarE8 = aVar.f230714q.e();
                s.j(aVarE8);
                u uVarG2 = aVar.f230714q.g();
                tx9.f fVar2 = (tx9.f) aVar.I.get();
                kx9.a aVar15 = (kx9.a) aVar.G.get();
                hj8.a aVarA6 = aVar.f230719x.a();
                s.j(aVarA6);
                return new z(aVarE8, uVarG2, fVar2, aVar15, aVarA6, aVar.f.e());
            case 13:
                fl3.a aVarE9 = aVar.f230714q.e();
                s.j(aVarE9);
                return new vx9.g(aVarE9, aVar.f230714q.i(), (kx9.a) aVar.G.get());
            case 14:
                lx1.b bVar6 = aVar.f230720y;
                uw1.b bVar7 = aVar.f230711m;
                lx1.d dVarB3 = ((ey1.e) bVar6).b();
                s.j(dVarB3);
                uw1.e eVarJ = ((lz1.m) bVar7).j();
                s.j(eVarJ);
                uw1.c cVarD3 = ((lz1.m) bVar7).d();
                s.j(cVarD3);
                return new vx9.c(dVarB3, eVarJ, cVarD3, (kx9.a) aVar.G.get(), new ufm.d((kx9.a) aVar.G.get(), (tx9.f) aVar.I.get(), aVar.f.e()));
            case 15:
                kx9.a aVar16 = (kx9.a) aVar.G.get();
                co9.a aVarA7 = aVar.z.a();
                s.j(aVarA7);
                return new vx9.i(aVar16, aVarA7, new ufm.d((kx9.a) aVar.G.get(), (tx9.f) aVar.I.get(), aVar.f.e()));
            case 16:
                dl3.f fVarC3 = aVar.f230714q.c();
                s.j(fVarC3);
                m3j.n nVarI = ((b3j.p) aVar.A).i();
                aqa.c cVarC4 = ((p) aVar.f230718w).c();
                s.j(cVarC4);
                nq9.b bVarB2 = aVar.B.b();
                s.j(bVarB2);
                io5.b bVarA = ((w) aVar.u).a();
                s.j(bVarA);
                fa6.a aVarD = aVar.f230717t.d();
                s.j(aVarD);
                lx1.i iVarD = ((ey1.e) aVar.f230720y).d();
                s.j(iVarD);
                tn9.a aVarC4 = aVar.z.c();
                s.j(aVarC4);
                return new qx9.a(cVarC4, fVarC3, aVarD, bVarA, iVarD, nVarI, bVarB2, aVarC4);
            case 17:
                dl3.f fVarC4 = aVar.f230714q.c();
                s.j(fVarC4);
                m3j.n nVarI2 = ((b3j.p) aVar.A).i();
                aqa.c cVarC5 = ((p) aVar.f230718w).c();
                s.j(cVarC5);
                nq9.b bVarB3 = aVar.B.b();
                s.j(bVarB3);
                io5.b bVarA2 = ((w) aVar.u).a();
                s.j(bVarA2);
                fa6.a aVarD2 = aVar.f230717t.d();
                s.j(aVarD2);
                lx1.i iVarD2 = ((ey1.e) aVar.f230720y).d();
                s.j(iVarD2);
                tn9.a aVarC5 = aVar.z.c();
                s.j(aVarC5);
                return new qx9.b(cVarC5, fVarC4, aVarD2, bVarA2, iVarD2, nVarI2, bVarB3, aVarC5);
            case 18:
                r0 r0VarA = aVar.C.a();
                rq9.a aVarA8 = aVar.f230708h.a();
                s.j(aVarA8);
                kz9.a aVarA9 = aVar.D.a();
                s.j(aVarA9);
                return new rx9.c(r0VarA, aVarA8, aVarA9);
            case 19:
                xx9.p pVar = (xx9.p) aVar.T.get();
                asi.d dVarC = ((j51.a) aVar.f230715r).c();
                s.j(dVarC);
                return new sx9.a(pVar, dVarC);
            case 20:
                return new px9.d((yx9.a) aVar.H.get());
            default:
                throw new AssertionError(i2);
        }
    }

    private final Object b() {
        oxc.a aVar = (oxc.a) this.f224686c;
        int i = this.f224685b;
        if (i == 0) {
            return new c06.a(aVar.f230764a, aVar.f230765b, 10);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        return qw7.u.c(aVar.d, aVar.e, aVar.f, aVar.f230767g, aVar.f230766c);
    }

    private final Object c() {
        oz9.c cVar = (oz9.c) this.f224686c;
        ov9.a aVar = cVar.f231128a;
        xmg.a aVar2 = cVar.e;
        e48.a aVar3 = cVar.f;
        ee0.a aVar4 = cVar.o;
        ite.a aVar5 = cVar.f231133j;
        int i = this.f224685b;
        switch (i) {
            case 0:
                k kVar = (k) aVar.f230002y.get();
                s.j(kVar);
                iz9.c cVar2 = (iz9.c) cVar.S.get();
                iz9.a aVar6 = (iz9.a) cVar.T.get();
                iz9.b bVar = (iz9.b) cVar.U.get();
                cv9.a aVar7 = (cv9.a) aVar.f229995p.get();
                s.j(aVar7);
                return new qz9.r(kVar, cVar2, aVar6, bVar, aVar7, new qz9.a(), cVar.b());
            case 1:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.f231129b).c();
                s.j(aVarC);
                wsg.n nVarB = cVar.f231130c.b();
                wif.a aVarA = cVar.d.a();
                ang.f fVarE = aVar2.e();
                g48.r0 r0VarC = aVar3.c();
                gte.a aVarB = ((b3j.p) cVar.f231131g).e.b();
                s.j(aVarB);
                z2j.f fVar = new z2j.f(aVarB);
                q0 q0VarA = cVar.a();
                kbb.c cVarC = cVar.c();
                gte.a aVarB2 = aVar5.b();
                s.j(aVarB2);
                return new qz9.n(aVarC, nVarB, aVarA, fVarE, r0VarC, fVar, q0VarA, cVarC, aVarB2, new rz9.a(), cVar.b());
            case 2:
                ax1.a aVarE = ((lz1.m) cVar.f231134l).e();
                s.j(aVarE);
                vv9.c cVarC2 = ((s6k.b) cVar.f231135m).c();
                s.j(cVarC2);
                return new qz9.d(aVarE, cVarC2, aVar3.c(), aVar2.e(), cVar.a(), cVar.b());
            case 3:
                k61.a aVarE2 = cVar.f231136n.e();
                s.j(aVarE2);
                return new qz9.e(aVarE2, cVar.a(), cVar.b());
            case 4:
                return new qz9.g((ue0.c) cVar.W.get());
            case 5:
                je0.d dVarB = aVar4.b();
                s.j(dVarB);
                yk0.a aVarB3 = cVar.f231137p.b();
                s.j(aVarB3);
                xe0.f fVarF = aVar4.f();
                s.j(fVarF);
                return oyj.c.A(dVarB, aVarB3, fVarF);
            case 6:
                y8k.e eVar = new y8k.e();
                gte.a aVarB4 = aVar5.b();
                s.j(aVarB4);
                return new uz9.b(eVar, aVarB4);
            case 7:
                return cVar.u.c();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.f224685b;
        if (i != 0) {
            if (i == 1) {
                return new pz9.b();
            }
            throw new AssertionError(i);
        }
        oz9.i iVar = (oz9.i) this.f224686c;
        return new oz9.j(iVar.f231201b, iVar.f231202c, iVar.d, iVar.e, iVar.f, iVar.f231203g, iVar.f231204h, iVar.i, iVar.f231205j, iVar.k, iVar.f231206l, iVar.f231207m, iVar.f231208n, iVar.o, iVar.f231209p, iVar.f231210q, iVar.f231211r, iVar.f231212s, iVar.f231213t, iVar.u, iVar.v, iVar.f231214w, iVar.f231215x, iVar.f231216y, iVar.z, iVar.A, iVar.B, iVar.C, iVar.D, iVar.E, iVar.F, iVar.G, iVar.H, iVar.I, iVar.J, iVar.K, iVar.L, iVar.M, iVar.N, iVar.O, iVar.P, iVar.Q, iVar.R, iVar.S, iVar.T, iVar.U, iVar.f231200a);
    }

    private final Object e() {
        p2k.q qVar = (p2k.q) this.f224686c;
        a31.a aVar = qVar.f232449x;
        a31.a aVar2 = qVar.e;
        a31.a aVar3 = qVar.f232426a;
        a31.a aVar4 = qVar.z;
        a31.a aVar5 = qVar.v;
        a31.a aVar6 = qVar.f232450y;
        a31.a aVar7 = qVar.f232432e0;
        a31.a aVar8 = qVar.E;
        a31.a aVar9 = qVar.f232447t;
        a31.a aVar10 = qVar.f232444q;
        a31.a aVar11 = qVar.f232430c;
        a31.a aVar12 = qVar.k;
        a31.a aVar13 = qVar.f232440n;
        a31.a aVar14 = qVar.o;
        a31.a aVar15 = qVar.f232439m;
        a31.a aVar16 = qVar.f232438l;
        a31.a aVar17 = qVar.f232445r;
        a31.a aVar18 = qVar.i;
        a31.a aVar19 = qVar.f232436j;
        a31.a aVar20 = qVar.d;
        a31.a aVar21 = qVar.f232434h;
        a31.a aVar22 = qVar.f232443p;
        int i = this.f224685b;
        if (i == 0) {
            return new c0(aVar3, qVar.f232428b, aVar11, aVar20, aVar2, qVar.f, qVar.f232433g);
        }
        if (i == 1) {
            return new mjl.p(aVar20, aVar21, aVar18, aVar19, aVar12, qVar.m0, aVar16, aVar15, aVar13, aVar14, aVar22, aVar10, aVar17, qVar.f232446s, aVar9);
        }
        if (i == 2) {
            return oyj.c.C((c0) qVar.l0.get());
        }
        if (i == 3) {
            return new e39.b(aVar20, aVar21, aVar18, aVar19, aVar12, qVar.m0, aVar16, aVar15, aVar13, aVar14, aVar22, aVar10, aVar17, aVar9, qVar.u, aVar5, qVar.f232448w, aVar, aVar6, aVar4, aVar11);
        }
        if (i == 4) {
            return new e0(qVar.A, aVar19, qVar.B, qVar.C, qVar.D, aVar18, aVar8, aVar6, aVar5, qVar.F, qVar.G, qVar.H, aVar4, aVar22, qVar.I, qVar.J, aVar17, aVar21, qVar.K, aVar3, aVar2, aVar16, qVar.L, qVar.M, aVar15, qVar.N, aVar14, qVar.O, qVar.P, aVar, qVar.Q, qVar.f232433g, qVar.R, aVar13, qVar.S, aVar20, qVar.T, aVar12, qVar.U, qVar.V, qVar.W, qVar.X, qVar.Y, qVar.Z, qVar.f232428b, aVar11, qVar.f232427a0, aVar10, qVar.u, qVar.f232429b0, qVar.c0, qVar.f232431d0, aVar7, qVar.f0, qVar.f, qVar.g0, qVar.f232435h0, aVar9, qVar.i0, qVar.j0, qVar.f232448w, qVar.f232437k0);
        }
        if (i == 5) {
            return new anb.c0(aVar8, aVar22, aVar7, aVar21, 22);
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        p2k.u uVar = (p2k.u) this.f224686c;
        int i = this.f224685b;
        switch (i) {
            case 0:
                return new g3k.d((i3k.e) uVar.f232489r.get(), uVar.f.e());
            case 1:
                RemittanceService remittanceService = (RemittanceService) uVar.i.get();
                ne0.j jVar = (ne0.j) uVar.f232483j.get();
                ne0.j jVar2 = (ne0.j) uVar.f232484l.get();
                ne0.j jVar3 = (ne0.j) uVar.f232485m.get();
                ne0.j jVar4 = (ne0.j) uVar.f232486n.get();
                ue0.c cVar = (ue0.c) uVar.f232488q.get();
                rga.c cVarB = uVar.e.b();
                s.j(cVarB);
                return new i3k.m(remittanceService, jVar, jVar2, jVar3, jVar4, cVar, cVarB);
            case 2:
                return f0k.d.s(uVar.f232478a, ((nj0.d) uVar.f232479b).f());
            case 3:
                return f3k.d.a();
            case 4:
                return new ne0.d();
            case 5:
                yk0.a aVarB = uVar.f232480c.b();
                s.j(aVarB);
                je0.d dVar = (je0.d) uVar.f232487p.get();
                xe0.f fVarF = uVar.d.f();
                s.j(fVarF);
                return f0k.d.t(dVar, fVarF, aVarB);
            case 6:
                kg.o oVar = (kg.o) uVar.o.get();
                le0.b bVarC = uVar.d.c();
                s.j(bVarC);
                return f0k.d.j(oVar, bVarC);
            case 7:
                ee0.a aVar = uVar.d;
                return f0k.d.i(fe0.c.a());
            case 8:
                return new g3k.a((i3k.c) uVar.f232492w.get());
            case 9:
                return new i3k.c((PaymentVendorsService) uVar.f232491t.get(), (ue0.c) uVar.u.get(), (ne0.j) uVar.v.get());
            case 10:
                return f0k.d.q(uVar.f232478a, ((nj0.d) uVar.f232479b).f());
            case 11:
                yk0.a aVarB2 = uVar.f232480c.b();
                s.j(aVarB2);
                je0.d dVar2 = (je0.d) uVar.f232487p.get();
                xe0.f fVarF2 = uVar.d.f();
                s.j(fVarF2);
                return f0k.d.r(dVar2, fVarF2, aVarB2);
            case 12:
                i3k.e eVar = (i3k.e) uVar.f232489r.get();
                ffk.t tVarF = uVar.f232481g.f();
                s.j(tVarF);
                return new h2k.l(eVar, tVarF, ((k3) uVar.f232482h).b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        b0 b0Var = (b0) this.f224686c;
        a31.a aVar = b0Var.e;
        a31.a aVar2 = b0Var.f232278h;
        a31.a aVar3 = b0Var.f;
        a31.a aVar4 = b0Var.d;
        q qVar = b0Var.f232274a;
        int i = this.f224685b;
        if (i == 0) {
            return new g0(b0Var.f232275b, b0Var.f232276c, aVar4, aVar, aVar3, b0Var.f232277g, aVar2, qVar);
        }
        if (i != 1) {
            if (i == 2) {
                return oyj.c.D((g0) b0Var.Q.get());
            }
            throw new AssertionError(i);
        }
        return new oda.v(b0Var.i, b0Var.f232279j, aVar4, b0Var.k, b0Var.f232280l, b0Var.f232281m, b0Var.f232282n, b0Var.o, b0Var.f232283p, b0Var.f232284q, b0Var.f232285r, b0Var.f232286s, b0Var.f232287t, b0Var.u, b0Var.v, aVar3, b0Var.f232288w, b0Var.f232289x, b0Var.f232290y, b0Var.z, b0Var.A, b0Var.B, aVar2, b0Var.C, aVar, b0Var.D, b0Var.E, b0Var.F, b0Var.G, b0Var.H, b0Var.I, b0Var.J, b0Var.K, b0Var.L, b0Var.M, b0Var.N, b0Var.O, b0Var.P, qVar, b0Var.R);
    }

    private final Object h() {
        p59.a aVar = (p59.a) this.f224686c;
        int i = this.f224685b;
        switch (i) {
            case 0:
                return new q59.c(aVar.a(), new ne0.d());
            case 1:
                xj2.e eVar = aVar.f233036c;
                return new o59.a(new zj2.a());
            case 2:
                xoj.a aVarA = aVar.d.a();
                s.j(aVarA);
                return new o59.b(aVarA);
            case 3:
                xoj.a aVarA2 = aVar.d.a();
                s.j(aVarA2);
                return new o59.d(aVarA2);
            case 4:
                return new o59.j(aVar.e.a());
            case 5:
                return new o59.g();
            case 6:
                p8g.c cVarB = aVar.f.b();
                s.j(cVarB);
                return new o59.k(cVarB, aVar.f.a());
            case 7:
                return new o59.f();
            case 8:
                return new o59.h();
            case 9:
                xoj.a aVarA3 = aVar.d.a();
                s.j(aVarA3);
                return new o59.i(aVarA3);
            case 10:
                hyf.a aVarA4 = aVar.f233037g.a();
                s.j(aVarA4);
                return new o59.c(aVarA4, aVar.f233037g.b());
            case 11:
                vfg.g gVar = (vfg.g) aVar.f233038h.f279774c.get();
                s.j(gVar);
                ifg.a aVar2 = (ifg.a) aVar.f233038h.d.get();
                s.j(aVar2);
                return new o59.e(gVar, aVar2);
            case 12:
                return n59.b.a();
            case 13:
                return new m59.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        p7c.r rVar = (p7c.r) this.f224686c;
        int i = this.f224685b;
        switch (i) {
            case 0:
                b90.a aVarA = rVar.f233668a.a();
                s.j(aVarA);
                q06.d dVarA = rVar.f233670b.a();
                s.j(dVarA);
                return new c8c.a(aVarA, dVarA);
            case 1:
                return new f8c.a((q7c.q) rVar.L.get(), (f8c.b) rVar.M.get());
            case 2:
                e4m.e eVar = rVar.J;
                xmg.a aVar = rVar.f;
                p0 p0Var = (p0) eVar.get();
                ang.f fVarE = aVar.e();
                l61.a aVarB = aVar.b();
                s.j(aVarB);
                return new q7c.q(p0Var, fVarE, aVarB, (k7c.b) rVar.K.get());
            case 3:
                return new p0((RevolutPayService) rVar.H.get(), (ne0.j) rVar.I.get());
            case 4:
                f1 f1Var = rVar.f233672c;
                RevolutPayService revolutPayService = (RevolutPayService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) rVar.G.get(), "retrofit", RevolutPayService.class, "create(...)");
                s.k(revolutPayService);
                return revolutPayService;
            case 5:
                f1 f1Var2 = rVar.f233672c;
                Retrofit retrofitF = ((nj0.d) rVar.d).f();
                kg.o oVar = (kg.o) rVar.F.get();
                Retrofit.Builder builderX = p.a.x(retrofitF, "retrofit", oVar, "gson");
                List<Converter.Factory> listConverterFactories = builderX.converterFactories();
                Intrinsics.checkNotNullExpressionValue(listConverterFactories, "converterFactories(...)");
                GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(oVar);
                ListIterator<Converter.Factory> listIterator = listConverterFactories.listIterator();
                while (listIterator.hasNext()) {
                    Converter.Factory next = listIterator.next();
                    if (next instanceof GsonConverterFactory) {
                        next = gsonConverterFactoryCreate;
                    }
                    listIterator.set(next);
                }
                Retrofit retrofitBuild = builderX.build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 6:
                f1 f1Var3 = rVar.f233672c;
                kg.o gson = ((c21.b) rVar.e).h();
                s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                Intrinsics.checkNotNullParameter(gson, "gson");
                kg.p pVar = new kg.p(gson);
                pVar.c(new f7c.a(), e7c.z.class);
                pVar.c(new f7c.b(), c0.b.class);
                kg.o oVarB = pVar.b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 7:
                return new ne0.d();
            case 8:
                return new k7c.b((RevolutPayService) rVar.H.get(), (ne0.j) rVar.I.get());
            case 9:
                return new f8c.c();
            case 10:
                return new e8c.a((d0) rVar.N.get());
            case 11:
                return new d0((ne0.j) rVar.I.get());
            case 12:
                y7c.b bVar = (y7c.b) rVar.P.get();
                k7c.g0 g0Var = (k7c.g0) rVar.R.get();
                zcc.b bVar2 = new zcc.b();
                CoroutineScope coroutineScopeA = rVar.f233678j.a();
                s.j(coroutineScopeA);
                return new q7c.j(bVar, g0Var, bVar2, coroutineScopeA);
            case 13:
                RevolutPayService revolutPayService2 = (RevolutPayService) rVar.H.get();
                ne0.j jVar = (ne0.j) rVar.I.get();
                b80.c cVarP = rVar.f233675g.p();
                s.j(cVarP);
                sf0.h hVarB = rVar.f233676h.b();
                s.j(hVarB);
                return new k7c.z(revolutPayService2, jVar, cVarP, new d7c.b(hVarB));
            case 14:
                e4m.e eVar2 = rVar.H;
                l70.e eVar3 = rVar.f233675g;
                RevolutPayService revolutPayService3 = (RevolutPayService) eVar2.get();
                d7c.d dVar = new d7c.d();
                b80.c cVarP2 = eVar3.p();
                s.j(cVarP2);
                sf0.h hVarB2 = rVar.f233676h.b();
                s.j(hVarB2);
                adc.c cVar = new adc.c(hVarB2);
                l80.e eVarH = eVar3.h();
                s.j(eVarH);
                return new k7c.g0(revolutPayService3, dVar, cVarP2, cVar, new ycc.b(eVarH, (c90.c) rVar.Q.get()));
            case 15:
                return oyj.c.B(rVar.i);
            case 16:
                return new q7c.s((y0) rVar.U.get(), rVar.f.e());
            case 17:
                return new y0((RevolutPayService) rVar.H.get(), (ne0.j) rVar.I.get(), (ue0.c) rVar.T.get());
            case 18:
                xe0.f fVarF = rVar.k.f();
                s.j(fVarF);
                yk0.a aVarB2 = rVar.f233680l.b();
                s.j(aVarB2);
                je0.d dVarB = rVar.k.b();
                s.j(dVarB);
                return oyj.c.y(dVarB, fVarF, aVarB2);
            case 19:
                return new q7c.m((j0) rVar.W.get());
            case 20:
                RevolutPayService revolutPayService4 = (RevolutPayService) rVar.H.get();
                CoroutineScope coroutineScopeA2 = rVar.f233678j.a();
                s.j(coroutineScopeA2);
                return new j0(revolutPayService4, coroutineScopeA2);
            case 21:
                e4m.e eVar4 = rVar.S;
                q1 q1Var = rVar.o;
                b6c.a aVar2 = (b6c.a) eVar4.get();
                q7c.g gVarE = rVar.e();
                nkl.b bVarI = ((ljl.q0) q1Var).i();
                xjl.i iVar = (xjl.i) ((ljl.q0) q1Var).Z.get();
                s.j(iVar);
                return new o8c.a(aVar2, gVarE, bVarI, iVar, new rdc.b());
            case 22:
                y7c.a aVar3 = (y7c.a) rVar.f233674e0.get();
                c7b.a aVar4 = new c7b.a(rVar.f233685p.g(), 3);
                l80.e eVarH2 = rVar.f233675g.h();
                s.j(eVarH2);
                return new q7c.d(aVar3, aVar4, eVarH2);
            case 23:
                return new k7c.h((RevolutPayDeferredPaymentsService) rVar.f233671b0.get(), (ne0.j) rVar.c0.get(), (ue0.c) rVar.f233673d0.get());
            case 24:
                return oyj.c.x(((nj0.d) rVar.d).f());
            case 25:
                return i1.a();
            case 26:
                je0.d dVarB2 = rVar.k.b();
                s.j(dVarB2);
                yk0.a aVarB3 = rVar.f233680l.b();
                s.j(aVarB3);
                xe0.f fVarF2 = rVar.k.f();
                s.j(fVarF2);
                return oyj.c.q(dVarB2, fVarF2, aVarB3);
            case 27:
                return new q7c.b();
            case 28:
                q06.d dVarA2 = rVar.f233670b.a();
                s.j(dVarA2);
                return new b7c.c(dVarA2, rVar.f());
            case 29:
                return new o7c.f(oyj.c.s(rVar.i));
            case 30:
                return new o7c.e(oyj.c.s(rVar.i), (j6c.b) rVar.f233677h0.get());
            case 31:
                return new o7c.a(oyj.c.s(rVar.i));
            case 32:
                return new o7c.k((k7c.g0) rVar.R.get(), (d0) rVar.N.get(), oyj.c.s(rVar.i), (f9c.a) rVar.l0.get());
            case 33:
                f80.a aVarX = rVar.f233675g.x();
                s.j(aVarX);
                return new f9c.a(aVarX);
            case 34:
                return new o7c.m(oyj.c.s(rVar.i), rVar.e());
            case 35:
                sri.m mVarS = oyj.c.s(rVar.i);
                f80.a aVarX2 = rVar.f233675g.x();
                s.j(aVarX2);
                return new o7c.c(mVarS, new cdc.f(aVarX2));
            case 36:
                return new b7c.a();
            case 37:
                return new q7c.c((k7c.c) rVar.q0.get());
            case 38:
                return new k7c.c();
            case 39:
                return new k7c.b0((RevolutPayService) rVar.H.get(), (ne0.j) rVar.I.get());
            case 40:
                RevolutPayService revolutPayService5 = (RevolutPayService) rVar.H.get();
                ne0.j jVar2 = (ne0.j) rVar.I.get();
                b80.c cVarP3 = rVar.f233675g.p();
                s.j(cVarP3);
                return new k7c.k(revolutPayService5, jVar2, cVarP3);
            case 41:
                rVar.getClass();
                return new q7c.l(new bdc.b((ue0.c) rVar.f233673d0.get()), rVar.B.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        s0 s0Var = (s0) this.f224686c;
        ila.b bVar = s0Var.f233702b;
        ee0.a aVar = s0Var.f233703c;
        int i = this.f224685b;
        if (i == 0) {
            return new m9c.a();
        }
        if (i == 1) {
            zja.a aVarA = ((ika.b) s0Var.f233701a).a();
            s.j(aVarA);
            return new q7c.p(aVarA, new pak.h(bVar.a()));
        }
        if (i == 2) {
            return new d9c.d(new pak.h(bVar.a()));
        }
        if (i == 3) {
            return new ydc.d();
        }
        if (i == 4) {
            return new if0.a(ImmutableSet.of((od0.e) s0Var.f233706j.get()));
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        je0.d dVarB = aVar.b();
        s.j(dVarB);
        yk0.a aVarB = s0Var.d.b();
        s.j(aVarB);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        return oyj.c.v(dVarB, fVarF, aVarB);
    }

    private final Object k() {
        u0 u0Var = (u0) this.f224686c;
        ee0.a aVar = u0Var.f233727a;
        int i = this.f224685b;
        if (i == 0) {
            return new m0((ue0.c) u0Var.d.get(), (RevolutPayJoinApiService) u0Var.e.get());
        }
        if (i == 1) {
            je0.d mapper = aVar.b();
            s.j(mapper);
            yk0.a databaseSecurityProvider = u0Var.f233728b.b();
            s.j(databaseSecurityProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            a1.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.f(storageFactory, databaseSecurityProvider, "revolut_pay_join", mapper, 0, null, 56);
        }
        if (i != 2) {
            if (i == 3) {
                return new o7c.g((m0) u0Var.f.get());
            }
            throw new AssertionError(i);
        }
        Retrofit retrofit = ((nj0.d) u0Var.f233729c).f();
        a1.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(RevolutPayJoinApiService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RevolutPayJoinApiService revolutPayJoinApiService = (RevolutPayJoinApiService) objCreate;
        s.k(revolutPayJoinApiService);
        return revolutPayJoinApiService;
    }

    @Override // phm.a
    public final Object get() {
        Object t3Var;
        Object gVar;
        Object e0Var;
        Object rVar;
        Object realService;
        Object objA;
        Object fVar;
        int i = this.f224684a;
        int i2 = this.f224685b;
        Object obj2 = this.f224686c;
        switch (i) {
            case 0:
                f fVar2 = (f) obj2;
                switch (i2) {
                    case 0:
                        gte.a aVarB = fVar2.f224687a.b();
                        s.j(aVarB);
                        return new rf3.d(aVarB);
                    case 1:
                        return new nf3.a();
                    case 2:
                        ffk.t tVarF = fVar2.f224688b.f();
                        s.j(tVarF);
                        return new rf3.e(tVarF);
                    case 3:
                        ij0.a aVar = ((nj0.d) fVar2.f224689c).f216295c;
                        j30.c cVar = (j30.c) fVar2.f224695n.get();
                        gi0.a aVar2 = new gi0.a();
                        kf3.a aVar3 = fVar2.d;
                        rf3.i iVar = (rf3.i) fVar2.f224697q.get();
                        qf.b factory = new qf.b(aVar, cVar, aVar2, aVar3, iVar);
                        pf3.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        String MODEL = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        String RELEASE = Build.VERSION.RELEASE;
                        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                        String str = (String) aVar.getVersionName().invoke();
                        iVar.getClass();
                        boolean logEnabled = aVar.getLogEnabled();
                        String sslHostPattern = aVar.getSslHostPattern();
                        List sslPins = aVar.getSslPins();
                        int i3 = R$string.chat_title_chatbot;
                        ResourceImage resourceImage = new ResourceImage(R$drawable.ic_rita, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 56, 56, 31), (Clause) null, 190);
                        int i5 = R$string.chat_support_suggestions_title_dev;
                        cVar.getClass();
                        return new p10.b(str, logEnabled, sslHostPattern, sslPins, Integer.valueOf(i3), resourceImage, Integer.valueOf(i5), Integer.valueOf(R$string.suggestions_subtitle_faq_topics_hint), new lm.d(13), gh0.d.GOOGLE.a());
                    case 4:
                        return new rf3.i();
                    case 5:
                        z70.a aVarF = fVar2.e.f();
                        s.j(aVarF);
                        return new rf3.g(aVarF);
                    case 6:
                        an0.c cVar2 = fVar2.f;
                        xmg.a aVar4 = fVar2.f224691h;
                        zm0.c cVarJ = cVar2.j();
                        s.j(cVarJ);
                        rf3.h hVar = (rf3.h) fVar2.f224701w.get();
                        rf3.i iVar2 = (rf3.i) fVar2.f224697q.get();
                        ang.f fVarE = aVar4.e();
                        ing.b bVarA = aVar4.a();
                        s.j(bVarA);
                        z80.b bVarS = fVar2.e.s();
                        s.j(bVarS);
                        return new rf3.l(cVarJ, hVar, iVar2, fVarE, bVarA, bVarS);
                    case 7:
                        return new rf3.h((tf3.a) fVar2.v.get());
                    case 8:
                        return new tf3.a((ChatRelatedService) fVar2.f224700t.get(), (ne0.j) fVar2.u.get());
                    case 9:
                        Retrofit retrofit = ((c21.b) fVar2.f224690g).i();
                        s.j(retrofit);
                        pf3.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(ChatRelatedService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        ChatRelatedService chatRelatedService = (ChatRelatedService) objCreate;
                        s.k(chatRelatedService);
                        return chatRelatedService;
                    case 10:
                        return new ne0.d();
                    case 11:
                        zm0.c cVarJ2 = fVar2.f.j();
                        s.j(cVarJ2);
                        return new tf3.b(cVarJ2);
                    case 12:
                        f01.c uiKitResources = fVar2.f224692j.g();
                        pf3.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        return uiKitResources;
                    case 13:
                        ffk.t tVarF2 = fVar2.f224688b.f();
                        s.j(tVarF2);
                        return new rf3.j(tVarF2, (j30.c) fVar2.f224695n.get());
                    case 14:
                        zc6.b bVar = fVar2.f224693l;
                        zc6.b bVar2 = fVar2.f224693l;
                        return new qf3.b(((zc6.a) bVar).b(), ((zc6.a) bVar2).c(), ((zc6.a) bVar2).d());
                    case 15:
                        return new rf3.b();
                    default:
                        throw new AssertionError(i2);
                }
            case 1:
                g gVar2 = (g) obj2;
                if (i2 == 0) {
                    return new a2d.n(gVar2.f224704a, gVar2.f224705b, gVar2.f224706c, gVar2.d, gVar2.e, gVar2.f, gVar2.f224707g, gVar2.f224708h, gVar2.i, gVar2.f224709j, gVar2.k, gVar2.f224710l, gVar2.f224711m, gVar2.f224712n, gVar2.o);
                }
                if (i2 == 1) {
                    return new ap3.b(gVar2.f224713p, gVar2.f224714q, gVar2.f224715r, gVar2.f224716s, gVar2.f224717t, gVar2.u, gVar2.v, 6);
                }
                throw new AssertionError(i2);
            case 2:
                off.a aVar5 = (off.a) obj2;
                ee0.a aVar6 = aVar5.f224806b;
                if (i2 == 0) {
                    return new pff.a((tff.d) aVar5.f224813n.get());
                }
                if (i2 == 1) {
                    return new tff.d((TransactionTroubleshooterService) aVar5.f224810j.get(), (uff.b) aVar5.k.get(), (ne0.j) aVar5.f224811l.get(), (ue0.c) aVar5.f224812m.get());
                }
                if (i2 == 2) {
                    return obk.d.D(((nj0.d) aVar5.f224805a).f());
                }
                if (i2 == 3) {
                    return new uff.b();
                }
                if (i2 == 4) {
                    return off.g.a();
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                je0.d dVarB = aVar6.b();
                s.j(dVarB);
                yk0.a aVarB2 = aVar5.f224807c.b();
                s.j(aVarB2);
                xe0.f fVarF = aVar6.f();
                s.j(fVarF);
                return obk.d.w(dVarB, fVarF, aVarB2);
            case 3:
                ogk.a aVar7 = (ogk.a) obj2;
                switch (i2) {
                    case 0:
                        t3Var = new t3(aVar7.f225163a, aVar7.f225165b, aVar7.f225167c, aVar7.d, aVar7.e, aVar7.f, aVar7.f225170g, aVar7.f225171h, aVar7.i, aVar7.f225173j, aVar7.k, aVar7.f225175l, aVar7.f225176m, aVar7.f225177n, aVar7.o, aVar7.f225180p, aVar7.f225174k0, aVar7.f225182r, aVar7.f225184s, aVar7.f225186t, aVar7.u, aVar7.v, aVar7.f225188w, aVar7.f225189x, aVar7.f225190y, aVar7.z, aVar7.A, aVar7.B, aVar7.C);
                        break;
                    case 1:
                        ufk.a aVar8 = (ufk.a) ((n3) aVar7.j0.get()).b();
                        s.k(aVar8);
                        return aVar8;
                    case 2:
                        t3Var = new n3(aVar7.f225181q);
                        break;
                    case 3:
                        t3Var = new l3(aVar7.f225163a, aVar7.f225167c, aVar7.D, aVar7.E, aVar7.f225182r, aVar7.m0, aVar7.f225179o0, aVar7.q0, aVar7.f225174k0, aVar7.M, aVar7.v, aVar7.f225189x, aVar7.f225186t, aVar7.N, aVar7.O, aVar7.k, aVar7.P, aVar7.f225184s, aVar7.Q, aVar7.R, aVar7.f225177n, aVar7.f225175l, aVar7.f225181q, aVar7.S, aVar7.I, aVar7.f225165b, aVar7.T, aVar7.K, aVar7.U, aVar7.V, aVar7.f225170g, aVar7.W, aVar7.X, aVar7.i, aVar7.Y, aVar7.Z, aVar7.G, aVar7.H, aVar7.f225164a0, aVar7.f225190y, aVar7.f225166b0, aVar7.c0, aVar7.f225168d0, aVar7.f225169e0, aVar7.z, aVar7.e, aVar7.f0, aVar7.g0, aVar7.f225172h0, aVar7.i0);
                        break;
                    case 4:
                        i3 i3Var = (i3) ((t3) aVar7.l0.get()).b();
                        s.k(i3Var);
                        return i3Var;
                    case 5:
                        return obk.d.A((q3) aVar7.f225178n0.get());
                    case 6:
                        return qgh.c.e(aVar7.d, aVar7.e, aVar7.f225182r, aVar7.F);
                    case 7:
                        return obk.d.z((m3) aVar7.p0.get());
                    case 8:
                        return qgh.c.d(aVar7.f225163a, aVar7.f225182r, aVar7.m0, aVar7.G, aVar7.H, aVar7.d, aVar7.I, aVar7.f225167c, aVar7.J, aVar7.z, aVar7.f225175l, aVar7.k, aVar7.K, aVar7.f225189x, aVar7.L);
                    case 9:
                        return qgh.c.b(aVar7.f225182r, aVar7.f225186t, aVar7.k);
                    case 10:
                        return qgh.c.a(aVar7.f225189x, aVar7.f225163a);
                    default:
                        throw new AssertionError(i2);
                }
                return t3Var;
            case 4:
                oi9.f fVar3 = (oi9.f) obj2;
                switch (i2) {
                    case 0:
                        ci9.b bVar3 = (ci9.b) fVar3.A.get();
                        wsg.n nVarB = fVar3.f.b();
                        ci9.a aVar9 = (ci9.a) fVar3.D.get();
                        l93.f fVarJ = fVar3.f225503h.j();
                        s.j(fVarJ);
                        mt8.d dVarB2 = fVar3.i.b();
                        s.j(dVarB2);
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) fVar3.f225504j).c();
                        s.j(aVarC);
                        whf.b bVarA2 = fVar3.k.a();
                        s.j(bVarA2);
                        fy2.d dVar = fVar3.f225505l;
                        l93.f fVarJ2 = dVar.f138882a.j();
                        s.j(fVarJ2);
                        r10.a aVar10 = new r10.a(fVarJ2, dVar.a());
                        ti9.i iVarA = fVar3.f225499a.a();
                        s.j(iVarA);
                        gVar = new ti9.g(bVar3, nVarB, aVar9, fVarJ, dVarB2, aVarC, bVarA2, aVar10, iVarA);
                        return gVar;
                    case 1:
                        e0Var = new ej9.e0((PayLaterApiService) fVar3.f225515y.get(), new ne0.d(), (ue0.c) fVar3.z.get(), new zjh.j(((nj0.d) fVar3.e).f216295c), new qh4.m((kg.o) fVar3.f225513w.get(), 1));
                        return e0Var;
                    case 2:
                        return obk.d.c((Retrofit) fVar3.f225514x.get());
                    case 3:
                        Retrofit retrofitJ = ((c21.b) fVar3.f225500b).j();
                        s.j(retrofitJ);
                        return obk.d.f((kg.o) fVar3.f225513w.get(), retrofitJ);
                    case 4:
                        kg.o oVarH = ((c21.b) fVar3.f225500b).h();
                        s.j(oVarH);
                        return obk.d.g(oVarH);
                    case 5:
                        ee0.a aVar11 = fVar3.f225501c;
                        ee0.a aVar12 = fVar3.f225501c;
                        kg.o oVarA = fe0.c.a();
                        le0.b bVarC = aVar12.c();
                        s.j(bVarC);
                        yk0.a aVarB3 = fVar3.d.b();
                        s.j(aVarB3);
                        xe0.f fVarF2 = aVar12.f();
                        s.j(fVarF2);
                        return obk.d.i(oVarA, bVarC, fVarF2, aVarB3);
                    case 6:
                        return new ej9.p((PayLaterApiService) fVar3.f225515y.get(), (gi9.c) fVar3.C.get(), new ne0.d());
                    case 7:
                        return obk.d.j((PayLaterDatabase) fVar3.B.get());
                    case 8:
                        Context context = fVar3.f225502g;
                        yk0.a aVarB4 = fVar3.d.b();
                        s.j(aVarB4);
                        return obk.d.e(context, aVarB4, ((c21.b) fVar3.f225500b).b());
                    case 9:
                        xh9.a aVar13 = (xh9.a) fVar3.E.get();
                        com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) fVar3.f225504j).c();
                        s.j(aVarC2);
                        return new ti9.j(aVar13, aVarC2);
                    case 10:
                        e4m.e eVar = fVar3.E;
                        jm4.r rVar2 = fVar3.f225508p;
                        l70.e eVar2 = fVar3.o;
                        xh9.a aVar14 = (xh9.a) eVar.get();
                        l80.e eVarH = eVar2.h();
                        s.j(eVarH);
                        ui9.t tVar = new ui9.t(aVar14, eVarH);
                        ue0.c cVar3 = (ue0.c) fVar3.z.get();
                        l80.e eVarH2 = eVar2.h();
                        s.j(eVarH2);
                        ej9.c cVar4 = new ej9.c(cVar3, eVarH2);
                        xh9.a aVar15 = (xh9.a) fVar3.E.get();
                        al4.p pVarI = rVar2.i();
                        y45.h hVarG = fVar3.f225509q.g();
                        xq3.j jVarG = fVar3.f225510r.g();
                        s.j(jVarG);
                        gVar = new ui9.z(tVar, cVar4, aVar15, pVarI, hVarG, new ui9.l(jVarG, rVar2.c(), fVar3.f225511s.e()));
                        return gVar;
                    case 11:
                        xh9.a aVar16 = (xh9.a) fVar3.E.get();
                        qi9.d dVarO = fVar3.o();
                        vi9.e0 e0VarQ = fVar3.q();
                        vi9.d dVar2 = new vi9.d();
                        vi9.f fVar4 = new vi9.f();
                        ui9.z zVar = (ui9.z) fVar3.G.get();
                        PayLaterGetHelpDialogFactory payLaterGetHelpDialogFactory = new PayLaterGetHelpDialogFactory();
                        gte.a aVarB5 = fVar3.f225512t.b();
                        s.j(aVarB5);
                        e0Var = new ij9.a(aVar16, dVarO, e0VarQ, dVar2, fVar4, zVar, payLaterGetHelpDialogFactory, aVarB5, fVar3.f225511s.e());
                        return e0Var;
                    case 12:
                        return new ik9.b();
                    case 13:
                        PayLaterApiService payLaterApiService = (PayLaterApiService) fVar3.f225515y.get();
                        ne0.d dVar3 = new ne0.d();
                        ue0.c cVar5 = (ue0.c) fVar3.z.get();
                        wj0.a aVarI = ((nj0.d) fVar3.e).i();
                        s.j(aVarI);
                        return new f0(payLaterApiService, dVar3, cVar5, aVarI);
                    default:
                        throw new AssertionError(i2);
                }
            case 5:
                y yVar = (y) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ti9.i(yVar.f225584a.b());
                    }
                    throw new AssertionError(i2);
                }
                ti9.i iVar3 = (ti9.i) yVar.d.get();
                xoj.a aVarA = yVar.f225585b.a();
                s.j(aVarA);
                xq3.j jVarG2 = yVar.f225586c.g();
                s.j(jVarG2);
                return new ti9.h(iVar3, aVarA, jVarG2);
            case 6:
                ol7.a aVar17 = (ol7.a) obj2;
                a31.a aVar18 = aVar17.d;
                q qVar = aVar17.f226342a;
                if (i2 == 0) {
                    return qgh.c.c(qVar, aVar17.f226343b, aVar17.f226344c, aVar18, aVar17.e, aVar17.f, aVar17.f226345g, aVar17.f226346h, aVar17.i, aVar17.f226347j, aVar17.k, aVar17.f226351p, aVar17.f226353r);
                }
                if (i2 == 1) {
                    return obk.d.x((e2) aVar17.o.get());
                }
                if (i2 == 2) {
                    return qgh.c.f(aVar17.f226348l, aVar17.f226349m);
                }
                if (i2 == 3) {
                    return obk.d.y((h2) aVar17.f226352q.get());
                }
                if (i2 == 4) {
                    return new h2(qVar, aVar18, aVar17.f226351p, aVar17.f226350n);
                }
                throw new AssertionError(i2);
            case 7:
                om2.e eVar3 = (om2.e) obj2;
                rk0.c cVar6 = eVar3.f226500a;
                nj0.a aVar19 = eVar3.f226501b;
                ee0.a aVar20 = eVar3.f226502c;
                if (i2 == 0) {
                    return new bn2.p((km2.k) eVar3.f226504h.get(), (km2.i) eVar3.k.get(), eVar3.e.b(), eVar3.a(), new lm2.a());
                }
                if (i2 == 1) {
                    mk0.a aVarA2 = cVar6.a();
                    s.j(aVarA2);
                    mk0.a aVar21 = (mk0.a) cVar6.i.get();
                    s.j(aVar21);
                    rVar = new km2.r(aVarA2, aVar21);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            return new ne0.d();
                        }
                        if (i2 != 4) {
                            throw new AssertionError(i2);
                        }
                        je0.d mapper = aVar20.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = eVar3.d.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = aVar20.f();
                        s.j(storageFactory);
                        om2.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "chosen_backgrounds", mapper, 0, null, 56);
                    }
                    Retrofit retrofit3 = ((nj0.d) aVar19).f();
                    om2.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                    Object objCreate2 = retrofit3.create(BackgroundPickerService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                    BackgroundPickerService backgroundPickerService = (BackgroundPickerService) objCreate2;
                    s.k(backgroundPickerService);
                    ij0.a aVar22 = ((nj0.d) aVar19).f216295c;
                    km2.u uVarA = om2.c.a();
                    ne0.j jVar = (ne0.j) eVar3.i.get();
                    ue0.c cVar7 = (ue0.c) eVar3.f226505j.get();
                    kg.o oVarA2 = fe0.c.a();
                    om2.d.a();
                    rVar = new km2.i(backgroundPickerService, aVar22, uVarA, jVar, cVar7, oVarA2);
                }
                return rVar;
            case 8:
                opa.b bVar4 = (opa.b) obj2;
                if (i2 == 0) {
                    return new rpa.b();
                }
                if (i2 == 1) {
                    return new rpa.a();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                q06.d dVarA = bVar4.f227543a.a();
                s.j(dVarA);
                f80.a aVarX = bVar4.f227544b.x();
                s.j(aVarX);
                return new upa.a(dVarA, aVarX);
            case 9:
                opa.c cVar8 = (opa.c) obj2;
                wzl.a aVar23 = cVar8.d;
                l70.e eVar4 = cVar8.f227546a;
                pqi.a aVar24 = cVar8.f227547b;
                if (i2 == 0) {
                    return new qpa.b();
                }
                if (i2 == 1) {
                    return new qpa.a((tpa.a) cVar8.f.get());
                }
                if (i2 == 2) {
                    z70.a aVarF2 = eVar4.f();
                    s.j(aVarF2);
                    return new tpa.a(aVarF2);
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                f01.c cVarG = aVar24.g();
                ContextThemeWrapper contextThemeWrapperF = aVar24.f();
                v06.g gVar3 = (v06.g) cVar8.f227548c.i.get();
                s.j(gVar3);
                s70.a aVarM = eVar4.m();
                s.j(aVarM);
                kpa.a aVar25 = (kpa.a) aVar23.d.get();
                s.j(aVar25);
                Set set = (Set) aVar23.e.get();
                s.j(set);
                return new ppa.b(cVarG, contextThemeWrapperF, gVar3, aVarM, aVar25, set, new yzl.a());
            case 10:
                oq8.a aVar26 = (oq8.a) obj2;
                ee0.a aVar27 = aVar26.f227758c;
                if (i2 == 0) {
                    ue0.c cVar9 = (ue0.c) aVar26.f227763m.get();
                    ne0.j jVar2 = (ne0.j) aVar26.f227764n.get();
                    oq8.h hVar2 = aVar26.e;
                    nj0.d dVar4 = (nj0.d) aVar26.f;
                    ik0.b bVarM = dVar4.m();
                    s.j(bVarM);
                    return new wq8.c(cVar9, jVar2, olc.c.l(hVar2, oq8.i.a(hVar2, bVarM, dVar4.d())));
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new ne0.d();
                    }
                    if (i2 == 3) {
                        return new pq8.a();
                    }
                    throw new AssertionError(i2);
                }
                je0.d dVarD = aVar27.d();
                s.j(dVarD);
                yk0.a aVarB6 = aVar26.d.b();
                s.j(aVarB6);
                xe0.f fVarF3 = aVar27.f();
                s.j(fVarF3);
                return olc.c.v(dVarD, aVarB6, fVarF3);
            case 11:
                ork.a aVar28 = (ork.a) obj2;
                a31.a aVar29 = aVar28.f229020g;
                a31.a aVar30 = aVar28.f229018b;
                q qVar2 = aVar28.f229017a;
                if (i2 == 0) {
                    return pl1.d.e(aVar30, aVar28.f229019c, aVar28.d, aVar28.e, aVar28.f, aVar29, qVar2);
                }
                if (i2 == 1) {
                    return pl1.d.d(aVar28.f229021h, aVar28.i, aVar28.f229022j, aVar30, aVar28.k, aVar28.f229023l, aVar28.f229024m, aVar28.f229025n, aVar28.o, aVar28.f229026p, aVar28.f229027q, aVar28.f229028r, aVar28.f229029s, aVar28.f229030t, aVar28.u, aVar28.v, aVar28.f229031w, aVar28.f229032x, aVar28.f229033y, aVar28.z, aVar28.A, aVar28.B, aVar28.C, aVar28.D, aVar28.E, aVar28.F, aVar28.G, aVar28.H, aVar28.I, aVar28.J, aVar28.K, aVar28.L, aVar28.M, aVar28.N, aVar29, aVar28.O, aVar28.P, aVar28.Q, qVar2, aVar28.T);
                }
                if (i2 == 2) {
                    return olc.c.D((prk.m0) aVar28.S.get());
                }
                throw new AssertionError(i2);
            case 12:
                osb.a aVar31 = (osb.a) obj2;
                if (i2 == 0) {
                    return new eli.l();
                }
                if (i2 == 1) {
                    sf0.h hVarB = aVar31.f229302a.b();
                    s.j(hVarB);
                    return new msb.j(hVarB);
                }
                if (i2 == 2) {
                    rpa.b pushInterceptor = aVar31.f229304c.a();
                    s.j(pushInterceptor);
                    osb.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(pushInterceptor, "pushInterceptor");
                    return new msb.g(pushInterceptor, TimeUnit.SECONDS.toMillis(5L));
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                ujg.a aVar32 = (ujg.a) aVar31.f229306h.get();
                ji0.a aVarG = aVar31.f229305g.g();
                s.j(aVarG);
                lfm.c cVarB = ((g8b.a) aVar31.d).b();
                s.j(cVarB);
                return new eli.p(aVar32, aVarG, cVarB);
            case 13:
                ou2.d dVar5 = (ou2.d) obj2;
                if (i2 == 0) {
                    return new qu2.a();
                }
                if (i2 == 1) {
                    return new ru2.a((sri.m) dVar5.e.get());
                }
                if (i2 == 2) {
                    return olc.c.o(dVar5.f229773a);
                }
                throw new AssertionError(i2);
            case 14:
                ov9.a aVar33 = (ov9.a) obj2;
                switch (i2) {
                    case 0:
                        return new pv9.d((pv9.f) aVar33.o.get(), (qv9.a) aVar33.f229992l.get(), aVar33.c());
                    case 1:
                        realService = new pv9.f((ue0.c) aVar33.f229991j.get(), (rv9.a) aVar33.k.get(), (qv9.c) aVar33.f229993m.get(), aVar33.c(), (MessagingEncryptionService) aVar33.f229994n.get(), new qv9.b());
                        break;
                    case 2:
                        je0.d dVarB3 = aVar33.f229986a.b();
                        s.j(dVarB3);
                        yk0.a aVarB7 = aVar33.f229987b.b();
                        s.j(aVarB7);
                        xe0.f fVarF4 = aVar33.f229986a.f();
                        s.j(fVarF4);
                        return olc.c.n(dVarB3, fVarF4, aVarB7);
                    case 3:
                        return new rv9.a();
                    case 4:
                        realService = new qv9.d();
                        qv9.e uiTestService = new qv9.e(new qv9.d(), aVar33.c());
                        ov9.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(realService, "realService");
                        Intrinsics.checkNotNullParameter(uiTestService, "uiTestService");
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            objA = Class.forName("androidx.test.runner.AndroidJUnitRunner");
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = yhm.o.a(th10);
                        }
                        if (objA instanceof yhm.n) {
                            objA = null;
                        }
                        if (objA != null) {
                            return uiTestService;
                        }
                        break;
                    case 5:
                        return new qv9.a(aVar33.f229988c.c());
                    case 6:
                        ov9.h hVar3 = aVar33.d;
                        MessagingEncryptionService messagingEncryptionService = (MessagingEncryptionService) a0.d.f((nj0.d) aVar33.e, "retrofit", MessagingEncryptionService.class, "create(...)");
                        s.k(messagingEncryptionService);
                        return messagingEncryptionService;
                    case 7:
                        jv9.b bVarB = aVar33.b();
                        gv9.c cVar10 = (gv9.c) aVar33.f229998s.get();
                        pv9.k kVar = (pv9.k) aVar33.f229999t.get();
                        sv9.a aVar34 = (sv9.a) aVar33.u.get();
                        kdh.b bVar5 = new kdh.b((nv9.b) aVar33.f230000w.get(), aVar33.i.e(), aVar33.a());
                        mv9.b bVar6 = (mv9.b) aVar33.f230001x.get();
                        mv9.a aVar35 = new mv9.a();
                        iv9.k kVarA = aVar33.a();
                        gte.a aVarB8 = aVar33.f.b();
                        s.j(aVarB8);
                        realService = new k(bVarB, cVar10, kVar, aVar34, bVar5, bVar6, aVar35, kVarA, new kpj.f(new kgm.i(aVarB8)));
                        break;
                    case 8:
                        ov9.h hVar4 = aVar33.d;
                        SocialPaymentsService socialPaymentsService = (SocialPaymentsService) a0.d.f((nj0.d) aVar33.e, "retrofit", SocialPaymentsService.class, "create(...)");
                        s.k(socialPaymentsService);
                        return socialPaymentsService;
                    case 9:
                        SocialPaymentsDatabase database = (SocialPaymentsDatabase) aVar33.f229997r.get();
                        ov9.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        gv9.c cVarG2 = database.g();
                        s.k(cVarG2);
                        return cVarG2;
                    case 10:
                        Context context2 = aVar33.f229989g;
                        yk0.a databaseSessionProvider2 = aVar33.f229987b.b();
                        s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) aVar33.f229990h).a();
                        s.j(databaseEncryptionMigratorFactory);
                        ov9.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        SocialPaymentsDatabase.Companion companion3 = SocialPaymentsDatabase.INSTANCE;
                        companion3.getClass();
                        SocialPaymentsDatabase socialPaymentsDatabase = (SocialPaymentsDatabase) companion3.a(context2, databaseSessionProvider2, new Migration[]{hv9.a.f155788c, hv9.b.f155789c, hv9.c.f155790c}, databaseEncryptionMigratorFactory);
                        s.k(socialPaymentsDatabase);
                        return socialPaymentsDatabase;
                    case 11:
                        return new sv9.c(aVar33.i.e(), (cv9.a) aVar33.f229995p.get(), (gv9.c) aVar33.f229998s.get(), (qv9.a) aVar33.f229992l.get(), aVar33.a());
                    case 12:
                        return new sv9.a((cv9.a) aVar33.f229995p.get(), (gv9.c) aVar33.f229998s.get(), (qv9.a) aVar33.f229992l.get(), aVar33.i.e());
                    case 13:
                        return new nv9.b((gv9.k) aVar33.v.get(), aVar33.b(), aVar33.a());
                    case 14:
                        return olc.c.q((SocialPaymentsDatabase) aVar33.f229997r.get());
                    case 15:
                        return new mv9.b();
                    case 16:
                        return new lv9.d((nv9.b) aVar33.f230000w.get(), aVar33.i.e(), (lv9.a) aVar33.z.get());
                    case 17:
                        return new lv9.a((ue0.c) aVar33.f229991j.get());
                    case 18:
                        realService = new pv9.i((MessagingEncryptionService) aVar33.f229994n.get(), aVar33.c(), aVar33.i.e(), (cv9.a) aVar33.f229995p.get(), (qv9.a) aVar33.f229992l.get());
                        break;
                    case 19:
                        je0.d dVarB4 = aVar33.f229986a.b();
                        s.j(dVarB4);
                        yk0.a aVarB9 = aVar33.f229987b.b();
                        s.j(aVarB9);
                        xe0.f fVarF5 = aVar33.f229986a.f();
                        s.j(fVarF5);
                        return olc.c.i(dVarB4, fVarF5, aVarB9);
                    default:
                        throw new AssertionError(i2);
                }
                return realService;
            case 15:
                ow7.a aVar36 = (ow7.a) obj2;
                a31.a aVar37 = aVar36.f230321h;
                a31.a aVar38 = aVar36.f;
                a31.a aVar39 = aVar36.f230319c;
                a31.a aVar40 = aVar36.f230318b;
                q qVar3 = aVar36.f230317a;
                if (i2 == 0) {
                    fVar = new ede.f(qVar3, aVar40, aVar39, aVar36.d, aVar36.e, aVar38, aVar36.f230320g, aVar37, aVar36.i, aVar36.f230322j, aVar36.k, 1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return qlc.b.b(aVar36.o);
                        }
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return qw7.u.a(aVar36.o);
                            }
                            throw new AssertionError(i2);
                        }
                        qw7.c cVar11 = (qw7.c) ((qw7.l) aVar36.f230325n.get()).b();
                        s.k(cVar11);
                        return cVar11;
                    }
                    fVar = new qw7.l(aVar40, aVar39, aVar38, aVar37, aVar36.f230323l, qVar3);
                }
                return fVar;
            case 16:
                if (i2 == 0) {
                    return new fw9.b();
                }
                if (i2 == 1) {
                    return new qw9.e(((ow9.a) obj2).f230329b.e());
                }
                throw new AssertionError(i2);
            case 17:
                ow9.k kVar2 = (ow9.k) obj2;
                a31.a aVar41 = kVar2.f230411s;
                a31.a aVar42 = kVar2.i;
                q qVar4 = kVar2.f230399a;
                if (i2 == 0) {
                    return new ow9.m(kVar2.f230400b, kVar2.f230401c, kVar2.d, kVar2.e, kVar2.f, kVar2.f230402g, kVar2.f230403h, aVar42, kVar2.f230404j, kVar2.k, kVar2.f230405l, kVar2.f230406m, kVar2.f230407n, kVar2.o, kVar2.f230408p, kVar2.f230409q, kVar2.f230410r, aVar41, kVar2.f230412t, kVar2.u, kVar2.v, kVar2.f230414x, kVar2.f230415y, kVar2.z, qVar4, kVar2.f230413w);
                }
                if (i2 == 1) {
                    return new db5.a(qVar4, aVar42, aVar41, 8);
                }
                throw new AssertionError(i2);
            case 18:
                return a();
            case 19:
                return b();
            case 20:
                return c();
            case 21:
                return d();
            case 22:
                return e();
            case 23:
                return f();
            case 24:
                return g();
            case 25:
                return h();
            case 26:
                return i();
            case 27:
                return j();
            case 28:
                return k();
            default:
                p7k.a aVar43 = (p7k.a) obj2;
                a31.a aVar44 = aVar43.f233773b;
                a31.a aVar45 = aVar43.f233776h;
                a31.a aVar46 = aVar43.d;
                a31.a aVar47 = aVar43.i;
                a31.a aVar48 = aVar43.f233775g;
                a31.a aVar49 = aVar43.f;
                a31.a aVar50 = aVar43.f233774c;
                q qVar5 = aVar43.f233772a;
                if (i2 == 0) {
                    return new q7k.m(aVar44, aVar50, aVar46, aVar43.e, aVar49, aVar48, aVar45, aVar47, qVar5);
                }
                if (i2 == 1) {
                    return pl1.d.g(qVar5, aVar50, aVar49, aVar48, aVar43.f233777j, aVar47, aVar43.k, aVar43.f233778l, aVar46, aVar43.f233779m, aVar43.f233780n, aVar43.o, aVar43.f233781p, aVar43.f233782q, aVar43.f233783r, aVar43.f233784s, aVar43.f233785t, aVar43.u, aVar43.v, aVar43.f233786w, aVar45, aVar43.f233787x, aVar43.f233788y, aVar43.z, aVar43.A, aVar43.B, aVar43.C, aVar43.O, aVar43.D, aVar43.E, aVar43.F, aVar43.G, aVar44, aVar43.H, aVar43.I, aVar43.J, aVar43.K, aVar43.L, aVar43.M);
                }
                if (i2 == 2) {
                    return p7h.b.y((q7k.m) aVar43.N.get());
                }
                throw new AssertionError(i2);
        }
    }
}
