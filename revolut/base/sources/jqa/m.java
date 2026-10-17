package jqa;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.NotificationManagerCompat;
import androidx.room.migration.Migration;
import com.appsflyer.AppsFlyerLib;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.acquiring.card_reader.data.impl.data.network.CardReaderService;
import com.revolut.feature.backend_driven_limits.impl.v2.network.RestrictionsService;
import com.revolut.feature.categorisation.impl.network.TransactionsCategorisationService;
import com.revolut.feature.crypto_investments.impl.data.database.CryptoInvestmentsDatabase;
import com.revolut.feature.crypto_investments.impl.data.network.CryptoPositionsService;
import com.revolut.feature.crypto_investments.impl.data.network.CryptoTaxService;
import com.revolut.feature.payinstore.impl.data.service.PayInStoreService;
import com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsSuggestionsService;
import com.revolut.feature.push_to_card.impl.data.network.PushToCardAddCardService;
import com.revolut.feature.push_to_card.impl.storage.PushToCardService;
import com.revolut.feature.push_to_card.impl.storage.database.PushToCardDatabase;
import com.revolut.feature.remote_stories.impl.network.RemoteStoryService;
import com.revolut.feature.selfserve.sot.impl.services.SotService;
import com.revolut.feature.separate_favourites.item_data.impl.alerts.universal.network.UniversalAlertsService;
import com.revolut.feature.trading.transfer.investments.impl.data.database.TransferInvestmentsDatabase;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferOutCreateService;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferOutFlowService;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferService;
import com.revolut.retail.feature.pod_nominees.impl.data.database.PodNomineesDatabase;
import com.revolut.retail.feature.pod_nominees.impl.data.network.PodNomineesService;
import com.revolut.retail.feature.trading_onboarding.impl.data.database.TradingOnboardingDatabase;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.OnboardingService;
import com.revolut.retail.feature.trading_onboarding.impl.data.network.SpouseConsentService;
import cr9.c0;
import cr9.e;
import cr9.f0;
import cr9.h0;
import cr9.i;
import cr9.l;
import cr9.x;
import cr9.y;
import java.util.ArrayList;
import jyk.e0;
import jyk.k0;
import jyk.l0;
import kl.c0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l3d.h0;
import l3d.j0;
import lp.l9;
import lu7.m0;
import ma1.b0;
import n4d.r0;
import no.j2;
import retrofit2.Retrofit;
import skm.p0;
import tnb.g0;
import zxb.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class m implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f177611c;

    public /* synthetic */ m(Object obj2, int i, int i2) {
        this.f177609a = i2;
        this.f177611c = obj2;
        this.f177610b = i;
    }

    private final Object a() {
        k2d.e eVar = (k2d.e) this.f177611c;
        int i = this.f177610b;
        if (i == 0) {
            m4d.a aVar = eVar.f180477a;
            b4d.i iVar = new b4d.i((b4d.b) aVar.k.get(), (UniversalAlertsService) aVar.f202707n.get(), (ne0.j) aVar.o.get(), (ue0.c) aVar.f202708p.get(), (b4d.j) aVar.f202709q.get());
            ImmutableSet immutableSetA = ((a2d.j) eVar.f180478b).a();
            vc.s.j(immutableSetA);
            return new l2d.n(iVar, immutableSetA);
        }
        if (i != 1) {
            if (i == 2) {
                return new nd.p(eVar.d);
            }
            throw new AssertionError(i);
        }
        a2d.c cVar = eVar.f180479c;
        ImmutableSet immutableSetOf = ImmutableSet.of((v3d.a) cVar.f734a.get(), (v3d.a) cVar.f735b.get(), (v3d.a) cVar.f736c.get(), (v3d.a) cVar.d.get());
        vc.s.j(immutableSetOf);
        return new p2d.b(immutableSetOf);
    }

    private final Object b() {
        k3d.a aVar = (k3d.a) this.f177611c;
        bpj.a aVar2 = aVar.f180687c;
        k3d.b bVar = aVar.f180686b;
        int i = this.f177610b;
        switch (i) {
            case 0:
                m3d.j jVarA = aVar.f180685a.a();
                vc.s.j(jVarA);
                q3d.g gVar = (q3d.g) aVar.i.get();
                xoj.a aVarA = aVar2.a();
                vc.s.j(aVarA);
                y2d.c cVar = aVar.d;
                ifd.h hVarB = cVar.b();
                vc.s.j(hVarB);
                n3d.a aVarA2 = cVar.a();
                vc.s.j(aVarA2);
                return new q3d.h(jVarA, gVar, aVarA, new q3d.e(hVarB, new q3d.k(aVarA2)), (v1d.j) aVar.f180690j.get());
            case 1:
                h0 h0VarB = bVar.b();
                vc.s.j(h0VarB);
                l3d.r rVarA = bVar.a();
                vc.s.j(rVarA);
                return new q3d.g(h0VarB, rVarA);
            case 2:
                return new q3d.a();
            case 3:
                sri.m mVar = (sri.m) aVar.f180691l.get();
                xoj.a aVarA3 = aVar2.a();
                vc.s.j(aVarA3);
                return new j3d.c(mVar, aVarA3);
            case 4:
                return qw7.u.v(aVar.f);
            case 5:
                xoj.a aVarA4 = aVar2.a();
                vc.s.j(aVarA4);
                return new s3d.l(aVarA4, new ihd.w(), aVar.f180688g.a());
            case 6:
                ish.a0 a0VarC = aVar.f180689h.c();
                vc.s.j(a0VarC);
                h0 h0VarB2 = bVar.b();
                vc.s.j(h0VarB2);
                l3d.r rVarA2 = bVar.a();
                vc.s.j(rVarA2);
                return new s3d.m(a0VarC, h0VarB2, rVarA2);
            case 7:
                return g3d.c.a();
            case 8:
                return g3d.d.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        k3d.b bVar = (k3d.b) this.f177611c;
        y1d.b bVar2 = bVar.f180697b;
        m4d.a aVar = bVar.f180696a;
        int i = this.f177610b;
        if (i == 0) {
            r0 r0VarA = aVar.a();
            u3d.c cVar = (u3d.c) ((a2d.j) bVar2).i0.get();
            vc.s.j(cVar);
            j0 j0Var = new j0(cVar, aVar.a());
            m3d.i iVarA = bVar.f180698c.a();
            vc.s.j(iVarA);
            ifd.h hVarB = bVar.d.b();
            vc.s.j(hVarB);
            return new h0(r0VarA, j0Var, iVarA, hVarB, (f01.a) bVar.f.get());
        }
        if (i == 1) {
            return jr9.h.z(bVar.e.f());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        a4d.a aVar2 = (a4d.a) aVar.f202714x.get();
        vc.s.j(aVar2);
        a4d.a aVar3 = (a4d.a) aVar.f202714x.get();
        vc.s.j(aVar3);
        a2d.j jVar = (a2d.j) bVar2;
        ImmutableSet immutableSetA = jVar.a();
        vc.s.j(immutableSetA);
        c0 c0Var = new c0(immutableSetA);
        l3d.c cVar2 = new l3d.c();
        a4d.a aVar4 = (a4d.a) aVar.f202714x.get();
        vc.s.j(aVar4);
        ImmutableSet immutableSetA2 = jVar.a();
        vc.s.j(immutableSetA2);
        return new l3d.r(aVar2, new jul.o(aVar3, new jid.z(c0Var, cVar2, new kgm.i(aVar4, new kpj.f(3, immutableSetA2)))));
    }

    private final Object d() {
        ka1.l lVar = (ka1.l) this.f177611c;
        int i = this.f177610b;
        switch (i) {
            case 0:
                return new ma1.k((sa1.d) lVar.f182380q.get());
            case 1:
                return ka1.c.g(lVar.f182370a, lVar.f182371b.c(), (ma1.j) lVar.i.get(), (ma1.f) lVar.f182378n.get(), (oa1.d) lVar.o.get(), e4m.b.a(lVar.f182379p));
            case 2:
                return new ma1.j(lVar.f182370a, new sa1.a());
            case 3:
                ma1.e eVar = (ma1.e) lVar.f182377m.get();
                w70.a aVar = lVar.f182372c.f192433b;
                vc.s.j(aVar);
                return new ma1.g(eVar, aVar);
            case 4:
                Context context = lVar.f182370a;
                BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) lVar.k.get();
                LocationManager locationManager = (LocationManager) lVar.f182376l.get();
                y80.a aVarR = lVar.f182372c.r();
                vc.s.j(aVarR);
                return new ma1.e(context, bluetoothAdapter, locationManager, aVarR);
            case 5:
                return ka1.b.a((BluetoothManager) lVar.f182375j.get());
            case 6:
                return ka1.b.b(lVar.f182370a);
            case 7:
                return ka1.c.m(lVar.f182370a);
            case 8:
                return ka1.i.a();
            case 9:
                return ka1.f.a();
            case 10:
                return new ma1.y((sa1.d) lVar.f182380q.get());
            case 11:
                return new ma1.t((sa1.d) lVar.f182380q.get(), (ma1.e) lVar.f182377m.get(), (ca1.a) lVar.v.get());
            case 12:
                return new ha1.f((ne0.j) lVar.u.get(), (ue0.c) lVar.f182383t.get());
            case 13:
                an0.c cVar = lVar.d;
                ee0.a aVar2 = lVar.e;
                yk0.a aVarB = cVar.b();
                vc.s.j(aVarB);
                je0.d dVarB = aVar2.b();
                vc.s.j(dVarB);
                xe0.f fVarF = aVar2.f();
                vc.s.j(fVarF);
                return ka1.c.B(dVarB, fVarF, aVarB);
            case 14:
                return new ne0.d();
            case 15:
                return new ma1.u((ha1.n) lVar.A.get(), (ha1.v) lVar.B.get());
            case 16:
                return ka1.c.t((CardReaderService) lVar.f182385x.get(), (ca1.a) lVar.v.get(), (ia1.c) lVar.f182386y.get(), (ia1.b) lVar.z.get(), fe0.c.a());
            case 17:
                Retrofit retrofit = (Retrofit) lVar.f.f266764h.get();
                vc.s.j(retrofit);
                return ka1.c.h(retrofit);
            case 18:
                return new ia1.c();
            case 19:
                return new ia1.b(lVar.f182371b.c());
            case 20:
                return new ha1.v((sa1.d) lVar.f182380q.get(), lVar.f182371b.c());
            case 21:
                return new b0((ha1.v) lVar.B.get(), (na1.h) lVar.D.get(), (na1.h) lVar.E.get(), (na1.h) lVar.F.get(), (na1.h) lVar.G.get(), (na1.h) lVar.H.get(), (na1.h) lVar.I.get(), (na1.h) lVar.J.get());
            case 22:
                ha1.n nVar = (ha1.n) lVar.A.get();
                ha1.v vVar = (ha1.v) lVar.B.get();
                return new na1.q((ca1.a) lVar.v.get(), (da1.d) lVar.f182384w.get(), nVar, vVar);
            case 23:
                ha1.n nVar2 = (ha1.n) lVar.A.get();
                return new na1.g((ca1.a) lVar.v.get(), (da1.d) lVar.f182384w.get(), nVar2, (ha1.v) lVar.B.get());
            case 24:
                return new na1.m((ha1.n) lVar.A.get(), (ha1.v) lVar.B.get(), 0);
            case 25:
                return new na1.m((ha1.n) lVar.A.get(), (ha1.v) lVar.B.get(), 1);
            case 26:
                return new na1.j((ha1.n) lVar.A.get(), (ha1.v) lVar.B.get(), (ca1.a) lVar.v.get(), 0);
            case 27:
                return new na1.j((ha1.n) lVar.A.get(), (ha1.v) lVar.B.get(), (ca1.a) lVar.v.get(), 1);
            case 28:
                return new na1.j((ha1.n) lVar.A.get(), (ha1.v) lVar.B.get(), (ca1.a) lVar.v.get(), 2);
            case 29:
                sa1.u uVar = (sa1.u) lVar.L.get();
                da1.d dVar = (da1.d) lVar.f182384w.get();
                ha1.o oVar = (ha1.o) lVar.N.get();
                ca1.a aVar3 = (ca1.a) lVar.v.get();
                sa1.c cVar2 = (sa1.c) lVar.O.get();
                nd1.j jVar = (nd1.j) lVar.f182373g.f.get();
                vc.s.j(jVar);
                return new ma1.x(uVar, dVar, oVar, aVar3, cVar2, jVar);
            case 30:
                return new sa1.v();
            case 31:
                CardReaderService cardReaderService = (CardReaderService) lVar.f182385x.get();
                tl0.a aVarC = lVar.f182371b.c();
                ia1.d dVar2 = (ia1.d) lVar.M.get();
                bd1.a aVarA = lVar.f182373g.a();
                vc.s.j(aVarA);
                return ka1.c.u(cardReaderService, aVarC, dVar2, aVarA, fe0.c.a());
            case 32:
                return new ia1.d(lVar.f182371b.c());
            case 33:
                return new sa1.c((ha1.v) lVar.B.get());
            case 34:
                return new ma1.q((ha1.v) lVar.B.get(), (ca1.a) lVar.v.get(), (na1.h) lVar.J.get());
            case 35:
                return new ma1.d((sa1.d) lVar.f182380q.get());
            case 36:
                return new ma1.o((ma1.d) lVar.R.get(), (da1.d) lVar.f182384w.get(), (ca1.a) lVar.v.get());
            case 37:
                return ka1.c.f((ma1.i) lVar.W.get());
            case 38:
                return new ma1.i((ha1.c) lVar.U.get(), (ca1.a) lVar.v.get(), (oa1.b) lVar.V.get(), (oa1.d) lVar.o.get());
            case 39:
                return new ha1.c((CardReaderService) lVar.f182385x.get(), (oa1.c) lVar.T.get());
            case 40:
                return new oa1.c();
            case 41:
                return new oa1.b(lVar.f182370a, lVar.f182374h.a(), (ma1.k) lVar.f182381r.get());
            case 42:
                return ka1.c.e(lVar.f182370a);
            case 43:
                ue0.c cVar3 = (ue0.c) lVar.f182383t.get();
                return ka1.c.i((ma1.k) lVar.f182381r.get(), (ne0.j) lVar.u.get(), (oa1.a) lVar.X.get(), cVar3);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        ke3.e eVar = (ke3.e) this.f177611c;
        jhf.a aVar = eVar.f182969a;
        c21.e eVar2 = eVar.d;
        usg.a aVar2 = eVar.f182970b;
        ee0.a aVar3 = eVar.f182971c;
        int i = this.f177610b;
        switch (i) {
            case 0:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar).c();
                vc.s.j(aVarC);
                wsg.n nVarB = aVar2.b();
                bjf.a aVar4 = (bjf.a) aVar;
                com.revolut.domain.interactors.transactions.a aVarC2 = aVar4.c();
                vc.s.j(aVarC2);
                pe0.q qVar = (pe0.q) aVar3.f125057q.get();
                vc.s.j(qVar);
                TransactionsCategorisationService transactionsCategorisationService = (TransactionsCategorisationService) eVar.f182982t.get();
                com.revolut.domain.interactors.transactions.a aVarC3 = aVar4.c();
                vc.s.j(aVarC3);
                mhf.j jVarE = aVar4.e();
                vc.s.j(jVarE);
                k7i.i iVar = new k7i.i(aVarC2, qVar, new pe3.c(transactionsCategorisationService, aVarC3, jVarE));
                g31.h hVar = (g31.h) ((c21.b) eVar2).W.get();
                vc.s.j(hVar);
                return new le3.b0(aVarC, nVarB, iVar, hVar);
            case 1:
                Retrofit retrofitI = ((c21.b) eVar2).i();
                vc.s.j(retrofitI);
                return ka1.c.w(retrofitI);
            case 2:
                return new le3.i(aVar2.a(), eVar.k.a());
            case 3:
                l5i.q qVarB = eVar.b();
                l80.e eVarH = eVar.o.h();
                vc.s.j(eVarH);
                ue0.c cVar = (ue0.c) eVar.f182983w.get();
                ge3.a aVar5 = (ge3.a) eVar.f182984x.get();
                djb.q qVarC = eVar.f182976m.c();
                vc.s.j(qVarC);
                return new le3.w(qVarB, eVarH, cVar, aVar5, new le3.x(qVarC));
            case 4:
                je0.d dVarD = aVar3.d();
                vc.s.j(dVarD);
                xe0.f fVarF = aVar3.f();
                vc.s.j(fVarF);
                return ka1.c.x(dVarD, fVarF);
            case 5:
                wsg.n nVarB2 = aVar2.b();
                g6e.d dVarB = eVar.f182978p.b();
                vc.s.j(dVarB);
                al4.n nVarS = eVar.f182979q.s();
                vc.s.j(nVarS);
                return new le3.f(nVarB2, dVarB, nVarS, eVar.f182980r.d());
            case 6:
                je0.d dVarB2 = aVar3.b();
                vc.s.j(dVarB2);
                yk0.a aVarB = eVar.f182981s.b();
                vc.s.j(aVarB);
                xe0.f fVarF2 = aVar3.f();
                vc.s.j(fVarF2);
                return ke3.b.a(dVarB2, aVarB, fVarF2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        kek.c cVar = (kek.c) this.f177611c;
        int i = this.f177610b;
        switch (i) {
            case 0:
                return new rek.a();
            case 1:
                return new hek.b((sri.m) cVar.o.get(), (lek.a) cVar.f183121p.get());
            case 2:
                return ka1.c.n(cVar.f183112a);
            case 3:
                return new lek.a(cVar.f183113b.e());
            case 4:
                bek.g gVar = (bek.g) cVar.v.get();
                ang.f fVarE = cVar.f183113b.e();
                hp9.c cVarA = cVar.i.a();
                vc.s.j(cVarA);
                wek.b bVar = new wek.b(cVarA);
                jvh.a aVarA = cVar.f183117j.a();
                vc.s.j(aVarA);
                return new lek.m(gVar, fVarE, bVar, aVarA, new qek.b());
            case 5:
                return new bek.g((PodNomineesService) cVar.f183123r.get(), (cek.c) cVar.f183125t.get(), (ne0.j) cVar.u.get());
            case 6:
                return db5.e.v(((nj0.d) cVar.f).f());
            case 7:
                return dek.f.a((PodNomineesDatabase) cVar.f183124s.get());
            case 8:
                Context context = cVar.f183112a;
                yk0.a aVarB = cVar.f183115g.b();
                vc.s.j(aVarB);
                de0.a aVarA2 = ((cl0.a) cVar.f183116h).a();
                vc.s.j(aVarA2);
                return dek.e.a(context, aVarB, aVarA2);
            case 9:
                return dek.c.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        kff.a aVar = (kff.a) this.f177611c;
        int i = this.f177610b;
        if (i != 0) {
            if (i == 1) {
                return new iff.a();
            }
            throw new AssertionError(i);
        }
        iff.a aVar2 = (iff.a) aVar.f183357c.get();
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar.f183355a).c();
        vc.s.j(aVarC);
        return new iff.d(aVar2, aVarC, aVar.f183356b.b());
    }

    private final Object h() {
        kj1.a aVar = (kj1.a) this.f177611c;
        ej1.a aVar2 = aVar.f184281b;
        int i = this.f177610b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            zi1.d dVarA = aVar2.a();
            vc.s.j(dVarA);
            sf0.h hVarB = aVar.d.b();
            vc.s.j(hVarB);
            v60.e eVarA = aVar.e.a();
            vc.s.j(eVarA);
            return new mj1.b(dVarA, hVarB, eVarA);
        }
        fk3.a aVarA = aVar.f184280a.a();
        vc.s.j(aVarA);
        zi1.d dVarA2 = aVar2.a();
        vc.s.j(dVarA2);
        n8b.a aVarA2 = aVar.f184282c.a();
        vc.s.j(aVarA2);
        zi1.a aVar3 = (zi1.a) aVar2.f126712m.get();
        vc.s.j(aVar3);
        return new lj1.a(aVarA, dVarA2, aVarA2, aVar3);
    }

    private final Object i() {
        kl2.a aVar = (kl2.a) this.f177611c;
        ee0.a aVar2 = aVar.f185263b;
        int i = this.f177610b;
        switch (i) {
            case 0:
                emg.a aVarB = aVar.f185262a.b();
                vc.s.j(aVarB);
                return new ll2.a(aVarB);
            case 1:
                return new ne0.d();
            case 2:
                je0.d dVar = (je0.d) aVar.f185268l.get();
                yk0.a aVarB2 = aVar.f185264c.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = aVar2.f();
                vc.s.j(fVarF);
                return ka1.c.y(dVar, aVarB2, fVarF);
            case 3:
                kg.o oVar = (kg.o) aVar.k.get();
                le0.b bVarC = aVar2.c();
                vc.s.j(bVarC);
                return ka1.c.q(oVar, bVarC);
            case 4:
                return ka1.c.k(fe0.c.a());
            case 5:
                rl2.d dVar2 = (rl2.d) aVar.f185271p.get();
                gte.a aVarB3 = aVar.e.b();
                vc.s.j(aVarB3);
                return new nl2.c(dVar2, aVarB3);
            case 6:
                return new rl2.d((pl2.a) aVar.f185270n.get(), (ne0.j) aVar.f185267j.get(), (ue0.c) aVar.f185269m.get(), (RestrictionsService) aVar.o.get());
            case 7:
                return new pl2.a();
            case 8:
                return obk.d.o(((nj0.d) aVar.d).f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        kn9.a aVar = (kn9.a) this.f177611c;
        int i = this.f177610b;
        if (i == 0) {
            gte.a aVarB = aVar.f186033a.b();
            vc.s.j(aVarB);
            return new jn9.a(aVarB, ka1.c.o(aVar.f186034b));
        }
        if (i == 1) {
            return new ln9.c((nn9.a) aVar.f186039l.get());
        }
        if (i == 2) {
            PayInStoreService payInStoreService = (PayInStoreService) aVar.f186038j.get();
            b6c.a aVar2 = (b6c.a) aVar.f.S.get();
            vc.s.j(aVar2);
            return new gn9.d(payInStoreService, aVar2, (ne0.j) aVar.k.get());
        }
        if (i == 3) {
            return ka1.c.v(aVar.d, ((nj0.d) aVar.e).f());
        }
        if (i == 4) {
            return new ne0.d();
        }
        throw new AssertionError(i);
    }

    private final Object k() {
        kr9.l lVar = (kr9.l) this.f177611c;
        pqi.a aVar = lVar.e;
        jr9.b bVar = lVar.f188757b;
        int i = this.f177610b;
        if (i == 0) {
            sri.m mVar = (sri.m) lVar.G.get();
            rq9.a aVarA = bVar.a();
            vc.s.j(aVarA);
            mq9.f fVarC = bVar.c();
            vc.s.j(fVarC);
            return new ir9.c(mVar, aVarA, fVarC);
        }
        if (i == 1) {
            return ka1.c.p(lVar.f188756a);
        }
        if (i == 2) {
            sri.m mVar2 = (sri.m) lVar.G.get();
            rq9.a aVarA2 = bVar.a();
            vc.s.j(aVarA2);
            return new ir9.e(mVar2, aVarA2);
        }
        if (i == 3) {
            sri.m mVar3 = (sri.m) lVar.G.get();
            rq9.a aVarA3 = bVar.a();
            vc.s.j(aVarA3);
            return new ir9.g(mVar3, aVarA3);
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        q06.d dVarA = lVar.f188758c.a();
        vc.s.j(dVarA);
        b90.a aVarA4 = lVar.d.a();
        vc.s.j(aVarA4);
        ContextThemeWrapper contextThemeWrapperF = aVar.f();
        yf.c cVar = new yf.c((cl3.a) lVar.f.f290239w.get());
        lfm.c cVarB = ((g8b.a) lVar.f188759g).b();
        vc.s.j(cVarB);
        f01.c cVarG = aVar.g();
        s70.a aVarM = lVar.f188760h.m();
        vc.s.j(aVarM);
        return new as9.b(dVarA, aVarA4, contextThemeWrapperF, cVar, cVarB, cVarG, aVarM);
    }

    private final Object l() {
        ku5.g gVar = (ku5.g) this.f177611c;
        int i = this.f177610b;
        switch (i) {
            case 0:
                CryptoPositionsService cryptoPositionsService = (CryptoPositionsService) gVar.f189694x.get();
                g0 g0Var = new g0(new ne0.d());
                zt5.a aVar = (zt5.a) gVar.z.get();
                b80.c cVarP = gVar.f.p();
                vc.s.j(cVarP);
                return new hu5.d(cryptoPositionsService, g0Var, aVar, cVarP);
            case 1:
                return fp8.c.f(gVar.f189679a, (Retrofit) gVar.f189693w.get());
            case 2:
                return fp8.c.n(gVar.f189679a, ((nj0.d) gVar.f189680b).f(), (kg.o) gVar.v.get());
            case 3:
                fu5.a aVar2 = gVar.f189679a;
                kg.o oVarH = ((c21.b) gVar.f189681c).h();
                vc.s.j(oVarH);
                return fp8.c.m(aVar2, oVarH);
            case 4:
                return agk.b.i((CryptoInvestmentsDatabase) gVar.f189695y.get());
            case 5:
                Context context = gVar.d;
                yk0.a aVarB = gVar.e.b();
                vc.s.j(aVarB);
                return agk.b.j(context, aVarB, ((c21.b) gVar.f189681c).b());
            case 6:
                return new hu5.e((CryptoTaxService) gVar.B.get(), gVar.f189689q.c());
            case 7:
                return fp8.c.g(gVar.f189679a, (Retrofit) gVar.f189693w.get());
            case 8:
                e4m.e eVar = gVar.D;
                ei5.d dVar = gVar.f189690r;
                sri.m mVar = (sri.m) eVar.get();
                xh5.a aVarA = dVar.a();
                vc.s.j(aVarA);
                usc.a aVar3 = new usc.a(aVarA);
                ai5.b bVarB = dVar.b();
                vc.s.j(bVarB);
                return new pu5.d(mVar, aVar3, bVarB);
            case 9:
                return ku5.d.a(gVar.d);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        kva.a aVar = (kva.a) this.f177611c;
        a31.a aVar2 = aVar.f190049b;
        a31.a aVar3 = aVar.f190052h;
        ecm.q qVar = aVar.f190048a;
        int i = this.f177610b;
        if (i == 0) {
            return new a96.i(qVar, aVar2, aVar.f190050c, aVar.d, aVar.e, aVar.f, aVar.f190051g, 6);
        }
        if (i == 1) {
            return ms1.g.f(aVar3, aVar2, qVar);
        }
        if (i == 2) {
            return ms1.g.e(aVar.i, aVar3, aVar.f190053j, qVar);
        }
        throw new AssertionError(i);
    }

    private final Object n() {
        kvb.f fVar = (kvb.f) this.f177611c;
        int i = this.f177610b;
        if (i == 0) {
            return new ak5.b(fVar.f190081a, fVar.f190082b, fVar.f190083c, fVar.d, fVar.e, fVar.f, fVar.f190084g, fVar.f190085h, fVar.i, fVar.f190086j, fVar.k, fVar.f190087l, fVar.f190088m, fVar.f190089n, 2);
        }
        if (i == 1) {
            return new a7d.a(fVar.o, 26);
        }
        throw new AssertionError(i);
    }

    private final Object o() {
        kyk.v vVar = (kyk.v) this.f177611c;
        int i = this.f177610b;
        switch (i) {
            case 0:
                gyk.a aVar = vVar.f190980a;
                nj0.d dVar = (nj0.d) vVar.f190982b;
                ik0.b bVarM = dVar.m();
                vc.s.j(bVarM);
                OnboardingService onboardingServiceA = gyk.b.a(aVar, bVarM, dVar.d());
                zk0.b bVarL = vVar.f190984c.l();
                vc.s.j(bVarL);
                return new hyk.c(onboardingServiceA, bVarL);
            case 1:
                gyk.a aVar2 = vVar.f190980a;
                nj0.d dVar2 = (nj0.d) vVar.f190982b;
                ik0.b bVarM2 = dVar2.m();
                vc.s.j(bVarM2);
                return new hyk.l(gyk.b.a(aVar2, bVarM2, dVar2.d()), (ne0.j) vVar.C.get(), (yxk.a) vVar.E.get());
            case 2:
                return new ne0.d();
            case 3:
                return y0.u((TradingOnboardingDatabase) vVar.D.get());
            case 4:
                Context context = vVar.d;
                yk0.a aVarB = vVar.e.b();
                vc.s.j(aVarB);
                de0.a aVarA = ((cl0.a) vVar.f).a();
                vc.s.j(aVarA);
                return y0.g(context, aVarB, aVarA);
            case 5:
                return new hyk.a(gsi.d.g(vVar.f190980a, (Retrofit) vVar.H.get()), (t90.g) vVar.I.get());
            case 6:
                return l9.i((kg.o) vVar.G.get(), ((nj0.d) vVar.f190982b).f());
            case 7:
                ee0.a aVar3 = vVar.f190987g;
                return l9.f(fe0.c.a(), new s90.a());
            case 8:
                vVar.getClass();
                return new t90.g(new e84.e(new v90.h(), new v90.e(new u90.x()), new v90.e(kyk.v.f()), new v90.c(), new v90.e(new u90.a0()), new v90.d(vVar.c(), new t90.a(), kyk.v.f(), new u90.c0(new u90.y())), new v90.i(vVar.c()), new v90.g(new t90.a(), new u90.y(), new u90.a0(), kyk.v.f()), new v90.b(vVar.c(), new t90.a(), kyk.v.f())));
            case 9:
                return new v0l.a((v0l.d) vVar.N.get());
            case 10:
                return new v0l.d((lyk.a) vVar.M.get());
            case 11:
                return new lyk.a((hyk.h) vVar.L.get());
            case 12:
                ne0.j jVar = (ne0.j) vVar.C.get();
                SpouseConsentService spouseConsentServiceV = gsi.d.v(vVar.f190980a, ((nj0.d) vVar.f190982b).f());
                ue0.c cVar = (ue0.c) vVar.K.get();
                b80.c cVarP = vVar.f190984c.p();
                vc.s.j(cVarP);
                return new hyk.h(jVar, spouseConsentServiceV, cVar, cVarP);
            case 13:
                je0.d dVarB = vVar.f190987g.b();
                vc.s.j(dVarB);
                yk0.a aVarB2 = vVar.e.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = vVar.f190987g.f();
                vc.s.j(fVarF);
                return dw3.l.x(dVarB, aVarB2, fVarF);
            case 14:
                return new wxk.f(((ika.b) vVar.i).b(), vVar.f190989j.c(), new w38.t(), vVar.k.f());
            case 15:
                return new wxk.g(((ika.b) vVar.i).b());
            case 16:
                return new xqj.a(vVar.d, (TradingOnboardingDatabase) vVar.D.get());
            case 17:
                return new jyk.i((sri.m) vVar.S.get());
            case 18:
                return jr9.h.q(vVar.d);
            case 19:
                sri.m mVarD = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD);
                return new jyk.h0(mVarD);
            case 20:
                sri.m mVarD2 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD2);
                ybl.k kVarD = vVar.f190991m.d();
                vc.s.j(kVarD);
                clc.b bVarA = vVar.f190992n.a();
                vc.s.j(bVarA);
                return new jyk.y(mVarD2, kVarD, bVarA);
            case 21:
                sri.m mVarD3 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD3);
                return new e0(mVarD3);
            case 22:
                sri.m mVarD4 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD4);
                return new jyk.j0(mVarD4, (hyk.c) vVar.B.get());
            case 23:
                sri.m mVarD5 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD5);
                return new jyk.v(mVarD5);
            case 24:
                sri.m mVarD6 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD6);
                ybl.k kVarD2 = vVar.f190991m.d();
                vc.s.j(kVarD2);
                return new jyk.u(mVarD6, kVarD2);
            case 25:
                sri.m mVarD7 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD7);
                gte.a aVarB3 = vVar.o.b();
                vc.s.j(aVarB3);
                return new l0(mVarD7, new dkf.a(aVarB3, 2));
            case 26:
                sri.m mVarD8 = ((g8b.a) vVar.f190990l).d();
                vc.s.j(mVarD8);
                return new k0(mVarD8);
            case 27:
                xoj.a aVarA2 = vVar.f190993p.a();
                vc.s.j(aVarA2);
                return new jyk.c0(aVarA2, vVar.f190994q.a(), vVar.d(), (sri.m) vVar.S.get());
            case 28:
                sri.m mVar = (sri.m) vVar.S.get();
                c1l.e eVarA = vVar.f190994q.a();
                usc.a aVar4 = new usc.a((e8h.j) vVar.k.f150278s0.get());
                gte.a aVarB4 = vVar.o.b();
                vc.s.j(aVarB4);
                return new jyk.g(mVar, eVarA, aVar4, aVarB4);
            case 29:
                bpj.a aVar5 = vVar.f190993p;
                zdl.f fVar = vVar.f190991m;
                xoj.a aVarA3 = aVar5.a();
                vc.s.j(aVarA3);
                nxk.a aVar6 = (nxk.a) vVar.Q.get();
                ba8.f fVarB = vVar.f190995r.b();
                ybl.k kVarD3 = fVar.d();
                vc.s.j(kVarD3);
                sri.m mVar2 = (sri.m) vVar.S.get();
                d1l.b bVarD = vVar.d();
                ybl.k kVarD4 = fVar.d();
                vc.s.j(kVarD4);
                return new jyk.r(aVarA3, aVar6, fVarB, kVarD3, mVar2, new d1l.g(bVarD, kVarD4), vVar.f190994q.a(), fVar.e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        l41.a aVar = (l41.a) this.f177611c;
        int i = this.f177610b;
        if (i == 0) {
            i41.c cVar = (i41.c) aVar.f192032c.get();
            j2 j2VarH = aVar.f192031b.h();
            vc.s.j(j2VarH);
            return new j41.a(cVar, j2VarH);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        z70.c globalSettingsProvider = new z70.c(aVar.f192030a.f192431a);
        Intrinsics.checkNotNullParameter(globalSettingsProvider, "globalSettingsProvider");
        l41.b bVar = l41.b.f;
        return new i41.c(globalSettingsProvider);
    }

    private final Object q() {
        l70.e eVar = (l70.e) this.f177611c;
        int i = this.f177610b;
        switch (i) {
            case 0:
                return new l80.f();
            case 1:
                return new l80.g();
            case 2:
                return new s80.b(eVar.f192431a);
            case 3:
                return new b70.e(eVar.f192431a);
            case 4:
                return new x80.a(eVar.f192431a);
            case 5:
                return new i70.a(eVar.f192431a);
            case 6:
                return new y80.a(eVar.f192431a, eVar.f192433b);
            case 7:
                return new l80.h();
            case 8:
                return new z80.b(eVar.f192431a, (qd0.b) eVar.k.get(), (g90.a) eVar.f192446r.get(), (yem.h) eVar.f192447s.get());
            case 9:
                return new g90.a((TelephonyManager) eVar.f192445q.get());
            case 10:
                Context context = eVar.f192431a;
                l70.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService("phone");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                return (TelephonyManager) systemService;
            case 11:
                return l70.h.v(eVar.f192431a);
            case 12:
                return new z70.b(eVar.f192431a);
            case 13:
                return new k70.a();
            case 14:
                return new f70.a();
            case 15:
                return new n80.f(eVar.f192431a);
            case 16:
                return new b80.c((ConnectivityManager) eVar.f192451y.get());
            case 17:
                Context context2 = eVar.f192431a;
                l70.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                Object systemService2 = context2.getSystemService("connectivity");
                Intrinsics.i(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return (ConnectivityManager) systemService2;
            case 18:
                return new r70.e((Vibrator) eVar.A.get(), kxa.j.g(eVar.f192431a), new n80.b());
            case 19:
                return kxa.j.z(eVar.f192431a);
            case 20:
                return new c70.a((ClipboardManager) eVar.C.get(), new c70.b((z70.a) eVar.u.get(), 0));
            case 21:
                return kxa.j.h(eVar.f192431a);
            case 22:
                return new d80.h((SensorManager) eVar.E.get());
            case 23:
                Context context3 = eVar.f192431a;
                l70.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context3, "context");
                Object systemService3 = context3.getSystemService("sensor");
                Intrinsics.i(systemService3, "null cannot be cast to non-null type android.hardware.SensorManager");
                return (SensorManager) systemService3;
            case 24:
                return new h70.a(eVar.f192431a);
            case 25:
                l70.g gVar = eVar.f192435c;
                Context context4 = eVar.f192431a;
                qd0.b languageProvider = (qd0.b) eVar.k.get();
                Intrinsics.checkNotNullParameter(context4, "context");
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return new f80.b(context4, languageProvider);
            case 26:
                l70.g gVar2 = eVar.f192435c;
                g80.a aVar = new g80.a();
                l70.h.d(gVar2, aVar);
                return aVar;
            case 27:
                l70.g gVar3 = eVar.f192435c;
                f90.b formatter = new f90.b((qd0.b) eVar.k.get());
                Intrinsics.checkNotNullParameter(formatter, "formatter");
                return formatter;
            case 28:
                l70.g gVar4 = eVar.f192435c;
                l80.c cVar = new l80.c((t70.g) eVar.P.get(), (qd0.b) eVar.k.get(), (f90.b) eVar.J.get(), (l80.e) eVar.i.get());
                kxa.j.b(gVar4, cVar);
                return cVar;
            case 29:
                return new t70.m((t70.h) eVar.M.get(), (f90.a) eVar.N.get(), new t70.n(), new t70.f(), eVar.e, (t70.t) eVar.O.get());
            case 30:
                return l70.h.s(eVar.f192431a, (t70.i) eVar.L.get());
            case 31:
                return new t70.j(eVar.d, (t70.q) eVar.K.get());
            case 32:
                return l70.k.a();
            case 33:
                return new f90.a();
            case 34:
                return l70.l.a();
            case 35:
                return kxa.j.d(eVar.f192435c, eVar.f192431a);
            case 36:
                return kxa.j.a(eVar.f192435c, eVar.f192431a);
            case 37:
                return new t70.b((t70.h) eVar.M.get(), eVar.e);
            case 38:
                return new t1(eVar.f192431a);
            case 39:
                return new n80.c(eVar.f192431a);
            case 40:
                Context context5 = eVar.f192431a;
                w70.a androidVersion = eVar.f192433b;
                l70.q.Companion.getClass();
                Intrinsics.checkNotNullParameter(context5, "context");
                Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
                NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context5);
                Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(...)");
                return new b90.e(notificationManagerCompatFrom, androidVersion);
            case 41:
                return l70.h.u(eVar.f192435c, eVar.f192431a);
            case 42:
                l70.g gVar5 = eVar.f192435c;
                toh.d dVar = new toh.d((qd0.b) eVar.k.get());
                kxa.j.c(gVar5, dVar);
                return dVar;
            case 43:
                return new a80.h(eVar.f192431a, (l80.e) eVar.i.get(), new i90.b(), eVar.f192438g);
            case 44:
                return l70.h.p((qd0.b) eVar.k.get());
            case 45:
                return l70.h.o((qd0.b) eVar.k.get());
            case 46:
                return l70.h.w((qd0.b) eVar.k.get());
            case 47:
                return new r80.c((zk0.b) eVar.V.get());
            case 48:
                return new c80.a();
            case 49:
                Context context6 = eVar.f192431a;
                return new r10.t(context6, new dcl.q(context6));
            case 50:
                return new v70.c(new v70.b(eVar.f192431a, eVar.f192439h.f183264b));
            case 51:
                return new c90.a(eVar.f192431a);
            case 52:
                return new y70.a(eVar.f192431a);
            case 53:
                return new s70.b((x80.a) eVar.f192442m.get(), new n80.b());
            case 54:
                return new q70.c(eVar.f192431a);
            case 55:
                return new j70.c(new g8.d(eVar.f192431a, new g70.a()));
            case 56:
                return l70.t.a();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object pVar;
        Object jVar;
        Object tVar;
        int i = this.f177609a;
        int i2 = 4;
        int i3 = this.f177610b;
        Object obj2 = this.f177611c;
        switch (i) {
            case 0:
                n nVar = (n) obj2;
                a31.a aVar = nVar.f177624s;
                a31.a aVar2 = nVar.f177623r;
                a31.a aVar3 = nVar.f177622q;
                a31.a aVar4 = nVar.f177621p;
                a31.a aVar5 = nVar.o;
                a31.a aVar6 = nVar.f177620n;
                a31.a aVar7 = nVar.k;
                a31.a aVar8 = nVar.f177619m;
                a31.a aVar9 = nVar.f177616h;
                a31.a aVar10 = nVar.f177615g;
                a31.a aVar11 = nVar.d;
                if (i3 == 0) {
                    return new t(nVar.f177612a, nVar.f177613b, nVar.f177614c, aVar11, nVar.e, nVar.f, aVar10, aVar9, nVar.i, nVar.f177617j, aVar7, nVar.U, nVar.f177625t, nVar.u, aVar4, nVar.v, nVar.f177626w, nVar.f177627x, nVar.f177628y, aVar2, nVar.z, nVar.A, nVar.B, aVar, nVar.C, nVar.D, aVar5, nVar.E, nVar.F, nVar.G, nVar.H, nVar.I, nVar.J, nVar.K, aVar6, nVar.L, nVar.M, nVar.N, nVar.O, nVar.P, nVar.Q, aVar8, nVar.R, aVar3, nVar.S);
                }
                if (i3 == 1) {
                    return jge.r.D((u) nVar.T.get());
                }
                if (i3 == 2) {
                    return new u(aVar11, aVar10, nVar.f177618l, aVar9, aVar8, aVar7, aVar6, aVar5, aVar4, aVar3, aVar2, aVar);
                }
                throw new AssertionError(i3);
            case 1:
                p pVar2 = (p) obj2;
                switch (i3) {
                    case 0:
                        xra.h hVar = (xra.h) pVar2.f177647r.get();
                        gqa.b bVar = (gqa.b) pVar2.f177648s.get();
                        ik0.b bVarM = ((nj0.d) pVar2.f177636a).m();
                        vc.s.j(bVarM);
                        Retrofit retrofit = y.a(v.a(jge.r.m(new hqa.c(fe0.d.a(), 0))), bVarM);
                        x.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(PushToCardAddCardService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        PushToCardAddCardService pushToCardAddCardService = (PushToCardAddCardService) objCreate;
                        vc.s.k(pushToCardAddCardService);
                        return new lra.d(hVar, bVar, new ecm.q(pushToCardAddCardService, new p96.a(new mra.a())), pVar2.f177640h.a());
                    case 1:
                        PushToCardService pushToCardService = (PushToCardService) pVar2.f177641j.get();
                        qra.a aVar12 = (qra.a) pVar2.f177642l.get();
                        xra.j jVar2 = (xra.j) pVar2.f177645p.get();
                        xra.k kVar = (xra.k) pVar2.f177646q.get();
                        mra.f fVar = new mra.f();
                        mra.h hVar2 = new mra.h();
                        ne0.j jVar3 = (ne0.j) pVar2.o.get();
                        kg.o oVarA = fe0.c.a();
                        sf0.h hVarB = pVar2.f.b();
                        vc.s.j(hVarB);
                        ze0.a aVarA = pVar2.e.a();
                        vc.s.j(aVarA);
                        return new xra.h(pushToCardService, aVar12, jVar2, kVar, fVar, hVar2, jVar3, oVarA, hVarB, aVarA);
                    case 2:
                        Retrofit retrofit3 = ((nj0.d) pVar2.f177636a).f();
                        wra.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate2 = retrofit3.create(PushToCardService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        PushToCardService pushToCardService2 = (PushToCardService) objCreate2;
                        vc.s.k(pushToCardService2);
                        return pushToCardService2;
                    case 3:
                        PushToCardDatabase db8 = (PushToCardDatabase) pVar2.k.get();
                        rra.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        qra.a aVarG = db8.g();
                        vc.s.k(aVarG);
                        return aVarG;
                    case 4:
                        Context context = pVar2.f177637b;
                        yk0.a databaseSessionProvider = pVar2.f177638c.b();
                        vc.s.j(databaseSessionProvider);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) pVar2.d).b();
                        rra.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        PushToCardDatabase.Companion aVar13 = PushToCardDatabase.INSTANCE;
                        aVar13.getClass();
                        PushToCardDatabase pushToCardDatabase = (PushToCardDatabase) aVar13.a(context, databaseSessionProvider, new Migration[]{vra.a.f291542c, vra.b.f291543c, vra.c.f291544c}, databaseEncryptionMigratorFactory);
                        vc.s.k(pushToCardDatabase);
                        return pushToCardDatabase;
                    case 5:
                        return new xra.j((qra.f) pVar2.f177643m.get(), (ura.a) pVar2.f177644n.get(), (ne0.j) pVar2.o.get());
                    case 6:
                        PushToCardDatabase db10 = (PushToCardDatabase) pVar2.k.get();
                        rra.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db10, "db");
                        qra.f fVarH = db10.h();
                        vc.s.k(fVarH);
                        return fVarH;
                    case 7:
                        return new ura.a();
                    case 8:
                        wra.b.Companion.getClass();
                        return new ne0.d();
                    case 9:
                        return new xra.k();
                    case 10:
                        return new gqa.b(pVar2.f177639g.a());
                    case 11:
                        ay9.b bVar2 = (ay9.b) pVar2.i.i.get();
                        vc.s.j(bVar2);
                        return new lra.a(bVar2);
                    case 12:
                        return new mra.i((aqa.a) pVar2.v.get());
                    case 13:
                        return new mra.b();
                    case 14:
                        return new mra.j();
                    case 15:
                        return new nra.b();
                    case 16:
                        return ora.d.a();
                    default:
                        throw new AssertionError(i3);
                }
            case 2:
                q qVar = (q) obj2;
                a31.a aVar14 = qVar.f177655c;
                if (i3 == 0) {
                    return new bfc.c(qVar.f177653a, qVar.f177654b, aVar14, qVar.d, qVar.e, qVar.f, qVar.f177656g, qVar.f177657h, qVar.i, 3);
                }
                if (i3 == 1) {
                    return new deh.c(aVar14, qVar.f177658j, qVar.k, qVar.f177659l, qVar.f177660m, qVar.f177661n, qVar.o, qVar.f177662p, qVar.f177663q, 5);
                }
                throw new AssertionError(i3);
            case 3:
                jr9.b bVar3 = (jr9.b) obj2;
                switch (i3) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        Context context2 = bVar3.f177953a;
                        yk0.a databaseSessionProvider2 = bVar3.f177954b.b();
                        vc.s.j(databaseSessionProvider2);
                        de0.a databaseEncryptionMigratorFactory2 = ((c21.b) bVar3.f177955c).b();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory2, "databaseEncryptionMigratorFactory");
                        PaymentsGroupsDatabase.Companion aVar15 = PaymentsGroupsDatabase.INSTANCE;
                        aVar15.getClass();
                        PaymentsGroupsDatabase paymentsGroupsDatabase = (PaymentsGroupsDatabase) aVar15.a(context2, databaseSessionProvider2, new Migration[]{zq9.k.f324427c, zq9.n.f324430c, zq9.o.f324431c, zq9.p.f324432c, zq9.q.f324433c, zq9.r.f324434c, zq9.s.f324435c, zq9.t.f324436c, zq9.u.f324437c, zq9.a.f324417c, zq9.b.f324418c, zq9.c.f324419c, zq9.d.f324420c, zq9.e.f324421c, zq9.f.f324422c, zq9.g.f324423c, zq9.h.f324424c, zq9.i.f324425c, zq9.j.f324426c, zq9.l.f324428c, zq9.m.f324429c}, databaseEncryptionMigratorFactory2);
                        vc.s.k(paymentsGroupsDatabase);
                        return paymentsGroupsDatabase;
                    case 2:
                        je0.d dVar = (je0.d) bVar3.f177962p.get();
                        yk0.a aVarB = bVar3.f177954b.b();
                        vc.s.j(aVarB);
                        xe0.f fVarF = bVar3.d.f();
                        vc.s.j(fVarF);
                        return jr9.h.y(dVar, aVarB, fVarF);
                    case 3:
                        le0.b bVarC = bVar3.d.c();
                        vc.s.j(bVarC);
                        return jr9.h.r((kg.o) bVar3.o.get(), bVarC);
                    case 4:
                        kg.o oVarH = ((c21.b) bVar3.f177955c).h();
                        vc.s.j(oVarH);
                        return jr9.h.k(oVarH);
                    case 5:
                        pVar = new lr9.p(bVar3.e(), (yq9.h) bVar3.u.get(), (yq9.l) bVar3.v.get(), (yq9.b) bVar3.f177967w.get(), (yq9.e) bVar3.f177968x.get(), (yq9.o) bVar3.f177969y.get(), (lr9.r) bVar3.z.get(), bVar3.f());
                        return pVar;
                    case 6:
                        Retrofit retrofit4 = (Retrofit) bVar3.f177965s.get();
                        jr9.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(PaymentsGroupsService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        PaymentsGroupsService paymentsGroupsService = (PaymentsGroupsService) objCreate3;
                        vc.s.k(paymentsGroupsService);
                        return paymentsGroupsService;
                    case 7:
                        Retrofit retrofit5 = ((c21.b) bVar3.f177955c).i();
                        vc.s.j(retrofit5);
                        kg.o gson = (kg.o) bVar3.f177964r.get();
                        jr9.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        return j6.a.B(retrofit5.newBuilder(), gson, "build(...)");
                    case 8:
                        kg.o gson2 = ((c21.b) bVar3.f177955c).h();
                        vc.s.j(gson2);
                        jr9.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gson2, "gson");
                        kg.p pVar3 = new kg.p(gson2);
                        he0.m mVar = new he0.m("type", cr9.i.class, false, true);
                        mVar.c(i.a.class, "OWE");
                        mVar.c(i.b.class, "OWED");
                        mVar.c(i.c.class, "SETTLED_UP");
                        Intrinsics.checkNotNullExpressionValue(mVar, "registerSubtype(...)");
                        ArrayList arrayList = pVar3.e;
                        arrayList.add(mVar);
                        he0.m mVarB = he0.m.b(cr9.y.class, "state");
                        mVarB.c(y.a.class, "ACTIVE");
                        mVarB.c(y.b.class, "PENDING");
                        mVarB.c(y.c.class, "FALLBACK_SUBTYPE_LABEL");
                        Intrinsics.checkNotNullExpressionValue(mVarB, "registerFallbackSubtype(...)");
                        arrayList.add(mVarB);
                        he0.m mVarB2 = he0.m.b(cr9.x.class, "type");
                        mVarB2.c(x.a.class, "CODE");
                        mVarB2.c(x.c.class, "PHONE");
                        mVarB2.c(x.b.class, "EMAIL");
                        Intrinsics.checkNotNullExpressionValue(mVarB2, "registerSubtype(...)");
                        arrayList.add(mVarB2);
                        he0.m mVar2 = new he0.m("type", cr9.l.class, false, true);
                        mVar2.c(l.c.class, "FALLBACK_SUBTYPE_LABEL");
                        mVar2.c(l.b.class, "TRANSACTION");
                        mVar2.c(l.a.class, "MANUAL");
                        Intrinsics.checkNotNullExpressionValue(mVar2, "registerSubtype(...)");
                        arrayList.add(mVar2);
                        he0.m mVarB3 = he0.m.b(cr9.c0.class, "state");
                        mVarB3.c(c0.a.class, "COMPLETED");
                        mVarB3.c(c0.b.class, "DELETED");
                        mVarB3.c(c0.c.class, "PENDING");
                        Intrinsics.checkNotNullExpressionValue(mVarB3, "registerSubtype(...)");
                        arrayList.add(mVarB3);
                        he0.m mVarB4 = he0.m.b(cr9.e.class, "type");
                        mVarB4.c(e.b.class, "TRANSACTION");
                        mVarB4.c(e.a.class, "MANUAL");
                        Intrinsics.checkNotNullExpressionValue(mVarB4, "registerSubtype(...)");
                        arrayList.add(mVarB4);
                        he0.m mVarB5 = he0.m.b(f0.class, "type");
                        mVarB5.c(f0.b.class, "TRANSACTION");
                        mVarB5.c(f0.a.class, "MANUAL");
                        Intrinsics.checkNotNullExpressionValue(mVarB5, "registerSubtype(...)");
                        arrayList.add(mVarB5);
                        he0.m mVarB6 = he0.m.b(cr9.h0.class, "type");
                        mVarB6.c(h0.b.class, "PREDEFINED");
                        mVarB6.c(h0.a.class, "CUSTOM");
                        Intrinsics.checkNotNullExpressionValue(mVarB6, "registerSubtype(...)");
                        arrayList.add(mVarB6);
                        kg.o oVarB = pVar3.b();
                        Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                        return oVarB;
                    case 9:
                        PaymentsGroupsDatabase database = (PaymentsGroupsDatabase) bVar3.f177961n.get();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        yq9.h hVarI = database.i();
                        vc.s.k(hVarI);
                        return hVarI;
                    case 10:
                        PaymentsGroupsDatabase database2 = (PaymentsGroupsDatabase) bVar3.f177961n.get();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database2, "database");
                        yq9.l lVarK = database2.k();
                        vc.s.k(lVarK);
                        return lVarK;
                    case 11:
                        PaymentsGroupsDatabase database3 = (PaymentsGroupsDatabase) bVar3.f177961n.get();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database3, "database");
                        yq9.b bVarG = database3.g();
                        vc.s.k(bVarG);
                        return bVarG;
                    case 12:
                        PaymentsGroupsDatabase database4 = (PaymentsGroupsDatabase) bVar3.f177961n.get();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database4, "database");
                        yq9.e eVarH = database4.h();
                        vc.s.k(eVarH);
                        return eVarH;
                    case 13:
                        PaymentsGroupsDatabase database5 = (PaymentsGroupsDatabase) bVar3.f177961n.get();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database5, "database");
                        yq9.o oVarL = database5.l();
                        vc.s.k(oVarL);
                        return oVarL;
                    case 14:
                        ue0.c storage = (ue0.c) bVar3.f177963q.get();
                        jr9.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        return new lr9.r(storage);
                    case 15:
                        lr9.e eVarE = bVar3.e();
                        er9.f fVar2 = (er9.f) bVar3.E.get();
                        mv9.k kVar2 = (mv9.k) bVar3.f177956g.f230002y.get();
                        vc.s.j(kVar2);
                        jVar = new lr9.j(eVarE, fVar2, kVar2, (yq9.l) bVar3.v.get(), (yq9.b) bVar3.f177967w.get(), (yq9.o) bVar3.f177969y.get(), (lr9.r) bVar3.z.get(), bVar3.f(), bVar3.f177957h.e());
                        return jVar;
                    case 16:
                        e4m.e eVar = bVar3.u;
                        l70.e eVar2 = bVar3.f;
                        yq9.h hVar3 = (yq9.h) eVar.get();
                        yq9.l lVar = (yq9.l) bVar3.v.get();
                        yq9.b bVar4 = (yq9.b) bVar3.f177967w.get();
                        yq9.e eVar3 = (yq9.e) bVar3.f177968x.get();
                        yq9.o oVar = (yq9.o) bVar3.f177969y.get();
                        yq9.i iVar = (yq9.i) bVar3.B.get();
                        PaymentsGroupsService paymentsGroupsService2 = (PaymentsGroupsService) bVar3.f177966t.get();
                        ne0.j jVar4 = (ne0.j) bVar3.f177960m.get();
                        qz0.j jVar5 = (qz0.j) bVar3.C.get();
                        w01.e eVar4 = (w01.e) bVar3.D.get();
                        r80.c cVar = (r80.c) eVar2.Z.get();
                        vc.s.j(cVar);
                        r10.f fVarF2 = bVar3.f();
                        ue0.c cVar2 = (ue0.c) bVar3.f177963q.get();
                        l80.e eVarH2 = eVar2.h();
                        vc.s.j(eVarH2);
                        ze0.a aVarA2 = bVar3.d.a();
                        vc.s.j(aVarA2);
                        l80.e eVarH3 = eVar2.h();
                        vc.s.j(eVarH3);
                        pVar = new er9.x(hVar3, lVar, bVar4, eVar3, oVar, iVar, paymentsGroupsService2, jVar4, jVar5, eVar4, cVar, fVarF2, cVar2, eVarH2, aVarA2, eVarH3);
                        return pVar;
                    case 17:
                        PaymentsGroupsDatabase database6 = (PaymentsGroupsDatabase) bVar3.f177961n.get();
                        jr9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database6, "database");
                        yq9.i iVarJ = database6.j();
                        vc.s.k(iVarJ);
                        return iVarJ;
                    case 18:
                        Context context3 = bVar3.f177953a;
                        jr9.i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        pVar = new qz0.n(context3, null, null);
                        return pVar;
                    case 19:
                        Context context4 = bVar3.f177953a;
                        zk0.b fileSystemRepository = bVar3.f.l();
                        vc.s.j(fileSystemRepository);
                        jr9.i.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context4, "context");
                        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
                        jVar = new w01.e(context4, fileSystemRepository);
                        return jVar;
                    case 20:
                        er9.f fVar3 = (er9.f) bVar3.E.get();
                        gte.a aVarB2 = bVar3.i.b();
                        vc.s.j(aVarB2);
                        return new mr9.a(fVar3, aVarB2);
                    case 21:
                        l70.e eVar5 = bVar3.f;
                        i90.b bVar5 = new i90.b();
                        l80.e eVarH4 = bVar3.f.h();
                        vc.s.j(eVarH4);
                        return new mr9.d(bVar5, eVarH4, (er9.e) bVar3.H.get());
                    case 22:
                        return new er9.e((ue0.c) bVar3.f177963q.get(), (PaymentsGroupsService) bVar3.f177966t.get(), (yq9.l) bVar3.v.get(), bVar3.f());
                    case 23:
                        er9.b0 b0Var = (er9.b0) bVar3.K.get();
                        cl3.a aVarD = bVar3.e.d();
                        vc.s.j(aVarD);
                        return new he2.b(b0Var, aVarD);
                    case 24:
                        PaymentsGroupsSuggestionsService paymentsGroupsSuggestionsService = (PaymentsGroupsSuggestionsService) bVar3.J.get();
                        ne0.j jVar6 = (ne0.j) bVar3.f177960m.get();
                        l80.e eVarH5 = bVar3.f.h();
                        vc.s.j(eVarH5);
                        return new er9.b0(paymentsGroupsSuggestionsService, jVar6, eVarH5);
                    case 25:
                        return jr9.h.v((Retrofit) bVar3.f177965s.get());
                    case 26:
                        mq9.f fVar4 = (mq9.f) bVar3.G.get();
                        mr9.d dVar2 = (mr9.d) bVar3.I.get();
                        wsg.n nVarB = bVar3.f177958j.b();
                        k61.a aVarE = bVar3.k.e();
                        vc.s.j(aVarE);
                        return new rr9.d(fVar4, dVar2, nVarB, aVarE);
                    case 27:
                        return new or9.a((mq9.f) bVar3.G.get());
                    case 28:
                        return new nd.p((mq9.f) bVar3.G.get());
                    case 29:
                        return jr9.l.a();
                    case 30:
                        return jr9.k.a();
                    case 31:
                        return new zr9.b();
                    case 32:
                        return new uq9.a(bVar3.f177959l.a());
                    case 33:
                        return new zr9.a((mq9.f) bVar3.G.get(), bVar3.f177957h.e());
                    default:
                        throw new AssertionError(i3);
                }
            case 4:
                ju7.a aVar16 = (ju7.a) obj2;
                a31.a aVar17 = aVar16.f178636n;
                a31.a aVar18 = aVar16.e;
                a31.a aVar19 = aVar16.d;
                ecm.q qVar2 = aVar16.f178628a;
                if (i3 == 0) {
                    return new da3.c(qVar2, aVar16.f178629b, aVar16.f178630c, aVar19, aVar18, aVar16.f, aVar16.f178631g, aVar16.f178632h, aVar16.i, aVar16.f178633j, aVar16.k, aVar16.f178634l, aVar16.f178635m, aVar17, aVar16.o, 1);
                }
                if (i3 == 1) {
                    return m0.a(aVar19, aVar18, aVar17, qVar2);
                }
                throw new AssertionError(i3);
            case 5:
                jxd.h hVar4 = (jxd.h) obj2;
                if (i3 == 0) {
                    return new cxj.c(hVar4.f179156a, hVar4.f179157b, i2);
                }
                if (i3 == 1) {
                    return new afh.f(hVar4.f179158c, hVar4.d, hVar4.e, hVar4.f, hVar4.f179159g, hVar4.f179160h, hVar4.i, hVar4.f179161j, 1);
                }
                throw new AssertionError(i3);
            case 6:
                jyc.h hVar5 = (jyc.h) obj2;
                if (i3 == 0) {
                    SotService sotService = (SotService) hVar5.i.get();
                    ne0.j jVar7 = (ne0.j) hVar5.f179387j.get();
                    myc.a aVar20 = new myc.a();
                    m31.c cVarG = hVar5.f179383b.f179133a.g();
                    vc.s.j(cVarG);
                    return new oyc.c(sotService, jVar7, aVar20, new nd.k(cVarG));
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new ne0.d();
                    }
                    throw new AssertionError(i3);
                }
                Retrofit retrofitI = ((c21.b) hVar5.f179382a).i();
                vc.s.j(retrofitI);
                return jr9.h.C(retrofitI);
            case 7:
                jz1.a aVar21 = (jz1.a) obj2;
                a31.a aVar22 = aVar21.d;
                ecm.q qVar3 = aVar21.f179563a;
                if (i3 == 0) {
                    return new lz1.d(aVar21.f179564b, aVar21.f179565c, aVar22, aVar21.e, aVar21.f, aVar21.f179566g, aVar21.f179567h, aVar21.i, aVar21.f179568j, aVar21.k, aVar21.f179569l, aVar21.f179570m, aVar21.f179571n, aVar21.o, qVar3);
                }
                if (i3 == 1) {
                    return new cxj.c(qVar3, aVar22, 5);
                }
                if (i3 == 2) {
                    return nga.c.e(aVar21.f179572p, aVar22, aVar21.f179573q, qVar3, aVar21.f179577w);
                }
                if (i3 == 3) {
                    return jr9.h.B((lz1.d) aVar21.u.get());
                }
                if (i3 == 4) {
                    return m0.b(aVar21.f179574r, aVar21.f179575s, aVar21.f179576t, qVar3);
                }
                throw new AssertionError(i3);
            case 8:
                jza.b bVar6 = (jza.b) obj2;
                ee0.a aVar23 = bVar6.f179689c;
                hza.a storiesOptimisationsExperimentProvider = bVar6.e;
                l70.e eVar6 = bVar6.f179688b;
                switch (i3) {
                    case 0:
                        return new kza.a((pza.a) bVar6.f179695n.get(), ((w3e.a) bVar6.f).a(), bVar6.f179690g.a());
                    case 1:
                        RemoteStoryService remoteStoryService = (RemoteStoryService) bVar6.f179692j.get();
                        b80.c cVarP = eVar6.p();
                        vc.s.j(cVarP);
                        return new pza.g(remoteStoryService, cVarP, (ue0.c) bVar6.k.get(), (pza.l) bVar6.f179694m.get());
                    case 2:
                        Retrofit retrofit6 = ((nj0.d) bVar6.f179687a).f();
                        jza.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit6, "retrofit");
                        Object objCreate4 = retrofit6.create(RemoteStoryService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                        RemoteStoryService remoteStoryService2 = (RemoteStoryService) objCreate4;
                        vc.s.k(remoteStoryService2);
                        return remoteStoryService2;
                    case 3:
                        je0.d mapper = aVar23.b();
                        vc.s.j(mapper);
                        yk0.a databaseSessionProvider3 = bVar6.d.b();
                        vc.s.j(databaseSessionProvider3);
                        xe0.f storageFactory = aVar23.f();
                        vc.s.j(storageFactory);
                        jza.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider3, "remote_stories", mapper, 0, null, 56);
                    case 4:
                        RemoteStoryService remoteStoryService3 = (RemoteStoryService) bVar6.f179692j.get();
                        b80.c cVarP2 = eVar6.p();
                        vc.s.j(cVarP2);
                        return new pza.l(remoteStoryService3, cVarP2, (ue0.c) bVar6.k.get(), (ne0.j) bVar6.f179693l.get(), storiesOptimisationsExperimentProvider);
                    case 5:
                        return new ne0.d();
                    case 6:
                        kza.a remoteStoriesInteractor = (kza.a) bVar6.o.get();
                        kza.b remoteStoriesLoadingInteractor = (kza.b) bVar6.f179696p.get();
                        c90.c cVarA = ((p41.b) bVar6.f179691h).a();
                        vc.s.j(cVarA);
                        qza.o mapper2 = new qza.o(cVarA);
                        lx0.j videoPreloader = kqi.b.a(bVar6.i);
                        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
                        Intrinsics.checkNotNullParameter(remoteStoriesLoadingInteractor, "remoteStoriesLoadingInteractor");
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
                        Intrinsics.checkNotNullParameter(storiesOptimisationsExperimentProvider, "storiesOptimisationsExperimentProvider");
                        return new kza.d();
                    case 7:
                        pza.a aVar24 = (pza.a) bVar6.f179695n.get();
                        qd0.b bVarN = eVar6.n();
                        vc.s.j(bVarN);
                        return new kza.b(aVar24, bVarN);
                    default:
                        throw new AssertionError(i3);
                }
            case 9:
                k1b.c cVar3 = (k1b.c) obj2;
                switch (i3) {
                    case 0:
                        Context context5 = cVar3.f180190a;
                        AppsFlyerLib appsFlyerLib = (AppsFlyerLib) cVar3.i.get();
                        m mVar3 = cVar3.f180195j;
                        f80.a aVarX = cVar3.f180192c.x();
                        vc.s.j(aVarX);
                        return new l1b.g(context5, appsFlyerLib, mVar3, new n1b.c(aVarX, cVar3.a()), (CoroutineScope) cVar3.f180196l.get(), cVar3.f.e(), (l1b.l) cVar3.o.get());
                    case 1:
                        k1b.b.Companion.getClass();
                        AppsFlyerLib appsFlyerLib2 = AppsFlyerLib.getInstance();
                        Intrinsics.checkNotNullExpressionValue(appsFlyerLib2, "getInstance(...)");
                        vc.s.k(appsFlyerLib2);
                        return appsFlyerLib2;
                    case 2:
                        return ((s41.a) cVar3.f180191b).d();
                    case 3:
                        return new l1b.d(cVar3.d.c());
                    case 4:
                        k1b.b.Companion.getClass();
                        return rd0.e.a(p0.f264002b);
                    case 5:
                        return new l1b.l((ue0.c) cVar3.f180197m.get(), (n80.e) cVar3.f180198n.get(), cVar3.f180190a);
                    case 6:
                        je0.d mapper3 = cVar3.f180193g.b();
                        vc.s.j(mapper3);
                        xe0.f storageFactory2 = cVar3.f180193g.f();
                        vc.s.j(storageFactory2);
                        k1b.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.e(storageFactory2, "feature_retail_appsflyer", mapper3, 12);
                    case 7:
                        return jr9.h.u(cVar3.f180190a);
                    case 8:
                        return new i1b.e((i1b.f) cVar3.f180200q.get());
                    case 9:
                        return new i1b.f(cVar3.f180190a, (AppsFlyerLib) cVar3.i.get(), (h1b.b) cVar3.f180199p.get(), new bm0.a(), (CoroutineScope) cVar3.f180196l.get(), (l1b.l) cVar3.o.get());
                    case 10:
                        l1b.d dVar3 = (l1b.d) cVar3.k.get();
                        f80.a aVarX2 = cVar3.f180192c.x();
                        vc.s.j(aVarX2);
                        uli.f fVar5 = (uli.f) cVar3.e.f16836b.get();
                        vc.s.j(fVar5);
                        return new l1b.i(dVar3, aVarX2, fVar5);
                    case 11:
                        l1b.i iVarA = cVar3.a();
                        lg0.b bVar7 = (lg0.b) cVar3.f180195j.get();
                        l1b.l lVar2 = (l1b.l) cVar3.o.get();
                        sri.m mVarD = ((g8b.a) cVar3.f180194h).d();
                        vc.s.j(mVarD);
                        return new l1b.c(iVarA, bVar7, lVar2, mVarD);
                    default:
                        throw new AssertionError(i3);
                }
            case 10:
                k2d.d dVar4 = (k2d.d) obj2;
                bpj.a aVar25 = dVar4.f180469b;
                k2d.e eVar7 = dVar4.f180468a;
                switch (i3) {
                    case 0:
                        r2d.s sVar = (r2d.s) dVar4.f180471g.get();
                        efd.a aVarA3 = eVar7.a();
                        vc.s.j(aVarA3);
                        xoj.a aVarA4 = aVar25.a();
                        vc.s.j(aVarA4);
                        tVar = new r2d.t(sVar, aVarA3, aVarA4);
                        break;
                    case 1:
                        ffd.a aVarB3 = eVar7.b();
                        vc.s.j(aVarB3);
                        return new r2d.k(aVarB3);
                    case 2:
                        return new j2d.a((sri.m) dVar4.i.get());
                    case 3:
                        return t2d.c.w(dVar4.f180470c);
                    case 4:
                        efd.a aVarA5 = eVar7.a();
                        vc.s.j(aVarA5);
                        lfm.c cVarB = ((g8b.a) dVar4.d).b();
                        vc.s.j(cVarB);
                        xoj.a aVarA6 = aVar25.a();
                        vc.s.j(aVarA6);
                        q06.d dVarA = dVar4.e.a();
                        vc.s.j(dVarA);
                        tVar = new j2d.e(aVarA5, cVarB, aVarA6, dVarA);
                        break;
                    case 5:
                        r2d.p pVar4 = (r2d.p) dVar4.f180474l.get();
                        xoj.a aVarA7 = aVar25.a();
                        vc.s.j(aVarA7);
                        r2d.s sVar2 = (r2d.s) dVar4.f180471g.get();
                        efd.a aVarA8 = eVar7.a();
                        vc.s.j(aVarA8);
                        tVar = new n2d.h(pVar4, aVarA7, sVar2, aVarA8, new n2d.i());
                        break;
                    case 6:
                        efd.a aVarA9 = eVar7.a();
                        vc.s.j(aVarA9);
                        return new r2d.p(aVarA9);
                    case 7:
                        return new r2d.h();
                    case 8:
                        ish.a0 a0VarC = dVar4.f.c();
                        vc.s.j(a0VarC);
                        return new r2d.g(a0VarC);
                    default:
                        throw new AssertionError(i3);
                }
                return tVar;
            case 11:
                return a();
            case 12:
                return b();
            case 13:
                return c();
            case 14:
                return d();
            case 15:
                kd1.a aVar26 = (kd1.a) obj2;
                ecm.q qVar4 = aVar26.f182774a;
                if (i3 == 0) {
                    return new ckg.e(aVar26.f182775b, aVar26.f182776c, aVar26.d, qVar4, aVar26.f);
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new ld1.a0(qVar4);
                    }
                    throw new AssertionError(i3);
                }
                ld1.a aVar27 = (ld1.a) ((ld1.a0) aVar26.e.get()).b();
                vc.s.k(aVar27);
                return aVar27;
            case 16:
                return e();
            case 17:
                return f();
            case 18:
                return g();
            case 19:
                return h();
            case 20:
                return i();
            case 21:
                return j();
            case 22:
                return k();
            case 23:
                return l();
            case 24:
                return m();
            case 25:
                return n();
            case 26:
                return o();
            case 27:
                return p();
            case 28:
                return q();
            default:
                l9f.k kVar3 = (l9f.k) obj2;
                switch (i3) {
                    case 0:
                        return new o9f.i((h9f.b) kVar3.A.get(), (n9f.a) kVar3.B.get());
                    case 1:
                        return new h9f.b((TransferOutFlowService) kVar3.f193196w.get(), (TransferOutCreateService) kVar3.f193198y.get(), (t90.g) kVar3.z.get());
                    case 2:
                        f9f.a aVar28 = kVar3.f193184c;
                        Retrofit retrofitI2 = ((c21.b) kVar3.d).i();
                        vc.s.j(retrofitI2);
                        return f9f.b.x(aVar28, retrofitI2);
                    case 3:
                        return f0k.d.z(kVar3.f193184c, (Retrofit) kVar3.f193197x.get());
                    case 4:
                        f9f.a aVar29 = kVar3.f193184c;
                        ik0.b bVarM2 = ((nj0.d) kVar3.e).m();
                        vc.s.j(bVarM2);
                        return f0k.d.h(aVar29, bVarM2, fe0.d.a());
                    case 5:
                        kVar3.getClass();
                        return new t90.g(new e84.e(new v90.h(), new v90.e(new u90.x()), new v90.e(l9f.k.d()), new v90.c(), new v90.e(new u90.a0()), new v90.d(kVar3.c(), new t90.a(), l9f.k.d(), new u90.c0(new u90.y())), new v90.i(kVar3.c()), new v90.g(new t90.a(), new u90.y(), new u90.a0(), l9f.k.d()), new v90.b(kVar3.c(), new t90.a(), l9f.k.d())));
                    case 6:
                        return new n9f.a();
                    case 7:
                        return new o9f.g((h9f.d) kVar3.G.get());
                    case 8:
                        return new h9f.d(e4m.b.a(kVar3.D), (ne0.j) kVar3.E.get(), e4m.b.a(kVar3.F));
                    case 9:
                        return f9f.b.y(kVar3.f193184c, (Retrofit) kVar3.f193197x.get());
                    case 10:
                        return new ne0.d();
                    case 11:
                        je0.d dVarD = kVar3.f.d();
                        vc.s.j(dVarD);
                        yk0.a aVarB4 = kVar3.f193186h.b();
                        vc.s.j(aVarB4);
                        xe0.f fVarF3 = kVar3.f.f();
                        vc.s.j(fVarF3);
                        return agk.b.v(dVarD, fVarF3, aVarB4);
                    case 12:
                        return new o9f.c((h9f.e) kVar3.O.get(), (o9f.g) kVar3.H.get());
                    case 13:
                        return new h9f.e((x4l.c) kVar3.K.get(), (x4l.c) kVar3.N.get(), (TransferService) kVar3.I.get());
                    case 14:
                        return cwi.u.m(kVar3.i, new c9f.b(e4m.b.a(kVar3.I), e4m.b.a(kVar3.E), e4m.b.a(kVar3.J)));
                    case 15:
                        return f9f.b.z(kVar3.f193184c, (Retrofit) kVar3.f193197x.get());
                    case 16:
                        an0.c cVar4 = kVar3.f193186h;
                        ee0.a aVar30 = kVar3.f;
                        yk0.a aVarB5 = cVar4.b();
                        vc.s.j(aVarB5);
                        je0.d dVarD2 = aVar30.d();
                        vc.s.j(dVarD2);
                        xe0.f fVarF4 = aVar30.f();
                        vc.s.j(fVarF4);
                        return hy1.g.t(dVarD2, fVarF4, aVarB5);
                    case 17:
                        return cwi.u.v(kVar3.i, new c9f.f(e4m.b.a(kVar3.I), e4m.b.a(kVar3.E), e4m.b.a(kVar3.M)));
                    case 18:
                        return xhi.f.z((TransferInvestmentsDatabase) kVar3.L.get());
                    case 19:
                        Context context6 = kVar3.f193187j;
                        yk0.a aVarB6 = kVar3.f193186h.b();
                        vc.s.j(aVarB6);
                        return xhi.f.h(context6, aVarB6, ((c21.b) kVar3.d).b());
                    case 20:
                        return new q9f.c();
                    case 21:
                        sri.m mVarD2 = ((g8b.a) kVar3.k).d();
                        vc.s.j(mVarD2);
                        return new q9f.b(mVarD2);
                    case 22:
                        sri.m mVarD3 = ((g8b.a) kVar3.k).d();
                        vc.s.j(mVarD3);
                        return new q9f.d(mVarD3);
                    case 23:
                        return new mfg.a(kVar3.f193187j, (TransferInvestmentsDatabase) kVar3.L.get());
                    default:
                        throw new AssertionError(i3);
                }
        }
    }
}
