package mva;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import az0.w1;
import com.revolut.feature.abexperiments.impl.network.SkywalkerService;
import com.revolut.feature.crypto.spare.change.impl.data.service.CryptoSpareChangeService;
import com.revolut.feature.cryptocommodity_invest.impl.network.CryptoStatsService;
import com.revolut.feature.devicemanagement.impl.data.service.DeviceManagementService;
import com.revolut.feature.kyc.core.impl.docs.KycDocsService;
import com.revolut.feature.kyc.core.impl.kyc.UserKycService;
import com.revolut.feature_retail_user_declarations.purpose.service.PurposeOfAccountService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingLifecycleService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingReceiverService;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingSenderService;
import com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase;
import com.revolut.retail.feature.ratedetails.impl.network.RatesPlotApiService;
import com.revolut.retail.feature.ratedetails.impl.network.RatesService;
import com.revolut.retail.feature.ratedetails.impl.network.alert.RatesAlertsService;
import dw3.c1;
import ecm.q;
import ffk.t;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ljl.q0;
import o5k.i;
import oai.i0;
import ove.r0;
import ove.s0;
import ove.t0;
import p7c.w0;
import qgk.k3;
import qve.a0;
import retrofit2.Retrofit;
import ru9.b0;
import ru9.c0;
import ru9.d0;
import ru9.e0;
import ru9.f0;
import ru9.h0;
import ru9.j;
import ru9.j0;
import ru9.k;
import ru9.k0;
import ru9.l;
import ru9.l0;
import ru9.m;
import ru9.o;
import ru9.r;
import ru9.u;
import ru9.w;
import ru9.x;
import ru9.z;
import ry5.p;
import vc.s;
import vpk.v;
import wsg.n;
import wu9.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f209195c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f209193a = i2;
        this.f209195c = obj2;
        this.f209194b = i;
    }

    private final Object a() {
        nu9.a aVar = (nu9.a) this.f209195c;
        int i = this.f209194b;
        switch (i) {
            case 0:
                return new mu9.a();
            case 1:
                lv9.d dVarD = aVar.f219232a.d();
                s.j(dVarD);
                return new h(dVarD, aVar.f219233b.e());
            case 2:
                fk3.a aVarA = aVar.f219234c.a();
                s.j(aVarA);
                return new xu9.a(aVarA);
            case 3:
                ru9.e eVar = new ru9.e((c90.c) aVar.f219242q.get(), new wu9.a(), new m(), new ugc.a(nu9.a.c()), new ru9.b());
                ru9.h hVar = new ru9.h(new wu9.a(), new ru9.b(), new m(), new ugc.a(nu9.a.c()));
                ru9.f fVar = new ru9.f(new ru9.b(), new m(), new ugc.a(nu9.a.c()));
                e0 e0Var = new e0(new wu9.a(), new ru9.b(), new m(), aVar.b(), new kdh.b(new ru9.b(), new h0(), new f0(new ru9.b(), new h0()), (k0) aVar.f219243r.get()), new h0(), ((n2a.a) aVar.f219235g).a());
                u uVar = new u(new m(), new ru9.b(), new x(), new z(nu9.a.c()), new w(), new r());
                m mVar = new m();
                ru9.b bVar = new ru9.b();
                tu9.h hVar2 = new tu9.h(nu9.a.c());
                ite.a aVar2 = aVar.f219236h;
                gte.a aVarB = aVar2.b();
                s.j(aVarB);
                tu9.c cVar = new tu9.c(mVar, bVar, hVar2, new tu9.f(aVarB), new r(), ((k3) aVar.i).b());
                wu9.a aVar3 = new wu9.a();
                ru9.b bVar2 = new ru9.b();
                b0 b0Var = new b0(new ru9.b());
                c0 c0Var = new c0(new ru9.b(), new m(), new wu9.a(), aVar.b());
                d0 d0Var = new d0();
                gte.a aVarB2 = aVar2.b();
                s.j(aVarB2);
                j jVar = new j(uVar, cVar, aVar3, bVar2, b0Var, c0Var, new k(d0Var, aVarB2));
                j0 j0Var = new j0(new wu9.a(), new ru9.b(), aVar.b(), new m(), new h0());
                wu9.a aVar4 = new wu9.a();
                return new l0(eVar, hVar, fVar, e0Var, jVar, j0Var, new l(new ru9.b(), new m(), aVar4, aVar.b()));
            case 4:
                ContextThemeWrapper context = aVar.d.f();
                nu9.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new c90.c(context);
            case 5:
                return new k0();
            case 6:
                return new o();
            case 7:
                return new zu9.c();
            case 8:
                return new ju9.a();
            case 9:
                cl3.a aVarD = aVar.f219237j.d();
                s.j(aVarD);
                return new qu9.a(aVarD, aVar.f219233b.e(), new qu9.c());
            case 10:
                ang.f fVarE = aVar.f219233b.e();
                gte.a aVarB3 = aVar.f219236h.b();
                s.j(aVarB3);
                return new ou9.c(fVarE, aVarB3);
            case 11:
                return new zu9.b();
            case 12:
                opa.c cVar2 = aVar.k;
                pqi.a aVar5 = aVar.d;
                b90.a aVarA2 = cVar2.a();
                s.j(aVarA2);
                pu9.b bVar3 = (pu9.b) aVar.B.get();
                ContextThemeWrapper context2 = aVar5.f();
                f01.c uiKitResources = aVar5.g();
                s70.a intentProvider = aVar.e.m();
                s.j(intentProvider);
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
                jpf.a aVar6 = new jpf.a();
                aVar6.f177267a = context2;
                aVar6.f177268b = uiKitResources;
                aVar6.f177269c = intentProvider;
                ang.f fVarE2 = aVar.f219233b.e();
                ov9.a aVar7 = aVar.f219232a;
                cv9.a aVar8 = (cv9.a) aVar7.f229995p.get();
                s.j(aVar8);
                qv9.a aVar9 = (qv9.a) aVar7.f229992l.get();
                s.j(aVar9);
                u0a.a aVar10 = new u0a.a(aVar8, aVar9);
                pu9.e eVar2 = (pu9.e) aVar.C.get();
                u0a.a aVar11 = new u0a.a(new uu9.f(aVar5.f(), (c90.c) aVar.f219242q.get()), new yf.c((cl3.a) aVar.f219237j.f290239w.get()));
                uu9.h hVar3 = new uu9.h(aVar5.f(), (c90.c) aVar.f219242q.get());
                lfm.c cVarB = ((g8b.a) aVar.f219239m).b();
                s.j(cVarB);
                return new uu9.c(aVarA2, bVar3, aVar6, fVarE2, aVar10, eVar2, aVar11, hVar3, cVarB);
            case 13:
                return new pu9.b((ku9.d) aVar.z.get(), (ku9.a) aVar.A.get());
            case 14:
                return new ku9.d(aVar.f219238l, new uu9.f(aVar.d.f(), (c90.c) aVar.f219242q.get()));
            case 15:
                return new ku9.a();
            case 16:
                return new pu9.e((ku9.d) aVar.z.get());
            case 17:
                lv9.d dVarD2 = aVar.f219232a.d();
                s.j(dVarD2);
                ang.f fVarE3 = aVar.f219233b.e();
                lv9.a aVar12 = (lv9.a) aVar.f219232a.z.get();
                s.j(aVar12);
                return new wu9.c(dVarD2, fVarE3, aVar12);
            case 18:
                return new pu9.d();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        o6k.a aVar = (o6k.a) this.f209195c;
        a31.a aVar2 = aVar.f222630s;
        a31.a aVar3 = aVar.f222628q;
        a31.a aVar4 = aVar.o;
        a31.a aVar5 = aVar.f222624l;
        a31.a aVar6 = aVar.f222622h;
        a31.a aVar7 = aVar.d;
        int i = this.f209194b;
        if (i == 0) {
            return new s6k.c(aVar.f222618a, aVar.f222619b, aVar.f222620c, aVar7, aVar.e, aVar.f, aVar.f222621g, aVar6, aVar.i, aVar.f222623j, aVar.k, aVar5, aVar.f222625m, aVar.f222626n, aVar4, aVar.f222627p, aVar3, aVar.f222629r, aVar2, aVar.f222631t);
        }
        if (i == 1) {
            return t2d.c.g(aVar.u, aVar.v, aVar.f222632w, aVar7, aVar6, aVar.B, aVar5, aVar.f222633x, aVar4, aVar.f222634y, aVar.z, aVar3, aVar2);
        }
        if (i == 2) {
            return i.D((s6k.c) aVar.A.get());
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        o81.a aVar = (o81.a) this.f209195c;
        ee0.a aVar2 = aVar.f222896b;
        int i = this.f209194b;
        if (i == 0) {
            return new m81.a((q81.a) aVar.f222898g.get());
        }
        if (i == 1) {
            SkywalkerService skywalkerService = (SkywalkerService) aVar.e.get();
            ue0.c cVar = (ue0.c) aVar.f.get();
            b80.c cVarP = aVar.f222897c.p();
            s.j(cVarP);
            zm0.c cVarJ = aVar.d.j();
            s.j(cVarJ);
            return new q81.d(skywalkerService, cVar, cVarP, cVarJ);
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            je0.d objectMapper = aVar2.d();
            s.j(objectMapper);
            xe0.f storageFactory = aVar2.f();
            s.j(storageFactory);
            o81.g.Companion.getClass();
            Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.e(storageFactory, "skywalker.pref", objectMapper, 12);
        }
        o81.b bVar = (o81.b) aVar.f222895a;
        o81.d dVar = bVar.f222900a;
        nj0.d dVar2 = (nj0.d) bVar.f222901b;
        ik0.b bVarM = dVar2.m();
        s.j(bVarM);
        Retrofit retrofit = o81.e.a(dVar, bVarM, dVar2.d());
        o81.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(SkywalkerService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SkywalkerService skywalkerService2 = (SkywalkerService) objCreate;
        s.k(skywalkerService2);
        return skywalkerService2;
    }

    private final Object d() {
        oai.a aVar = (oai.a) this.f209195c;
        xmg.a aVar2 = aVar.d;
        jk3.c cVar = aVar.f223652b;
        int i = this.f209194b;
        if (i == 0) {
            n8b.b bVarB = aVar.f223651a.b();
            s.j(bVarB);
            fk3.a aVarA = cVar.a();
            s.j(aVarA);
            return new pbi.g(bVarB, aVarA);
        }
        if (i == 1) {
            zi1.a aVar3 = (zi1.a) aVar.f223653c.f126712m.get();
            s.j(aVar3);
            return new pbi.b(aVar3);
        }
        if (i == 2) {
            return new pbi.e(aVar2.e());
        }
        if (i == 3) {
            return new pbi.i(aVar2.e(), aVar.e.b());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        fk3.a aVarA2 = cVar.a();
        s.j(aVarA2);
        return new pbi.c(aVarA2);
    }

    private final Object e() {
        i0 i0Var = (i0) this.f209195c;
        int i = this.f209194b;
        switch (i) {
            case 0:
                dha.c cVarI = i0Var.f223699a.i();
                s.j(cVarI);
                return new aci.h(cVarI, (eci.b) i0Var.f223712t.get(), new bci.b());
            case 1:
                return new eci.b((PurposeOfAccountService) i0Var.f223711s.get(), new bci.c());
            case 2:
                Retrofit retrofitI = ((c21.b) i0Var.f223700b).i();
                s.j(retrofitI);
                return i.w(retrofitI);
            case 3:
                return new bci.d();
            case 4:
                return new dci.b(i0Var.f223701c, (ty0.c) i0Var.f223713w.get());
            case 5:
                return i.j(i0Var.f223701c);
            case 6:
                return new xai.a();
            case 7:
                return i.A(i0Var.f223701c);
            case 8:
                l80.e eVarH = i0Var.f223703h.h();
                s.j(eVarH);
                return new vai.c(eVarH);
            case 9:
                ang.f fVarE = i0Var.e.e();
                sf0.h hVarB = i0Var.o.b();
                s.j(hVarB);
                vai.c cVar = (vai.c) i0Var.A.get();
                gte.a aVarB = i0Var.d.b();
                s.j(aVarB);
                return new pai.e(fVarE, hVarB, cVar, aVarB);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        obk.a aVar = (obk.a) this.f209195c;
        int i = this.f209194b;
        switch (i) {
            case 0:
                return new tbk.h((wbk.j) aVar.f223978m.get());
            case 1:
                return new wbk.j((PlanGiftingSenderService) aVar.f223977l.get());
            case 2:
                return obk.d.l(aVar.f223971a, ((nj0.d) aVar.f223972b).f());
            case 3:
                wbk.f fVar = (wbk.f) aVar.f223981q.get();
                a5h.g gVarB = aVar.e.b();
                t tVarF = aVar.f.f();
                s.j(tVarF);
                return new tbk.g(fVar, gVarB, tVarF);
            case 4:
                return new wbk.h((PlanGiftingReceiverService) aVar.o.get(), obk.h.a(), (ue0.c) aVar.f223980p.get());
            case 5:
                return i.v(aVar.f223971a, ((nj0.d) aVar.f223972b).f());
            case 6:
                je0.d dVarB = aVar.f223973c.b();
                s.j(dVarB);
                yk0.a aVarB = aVar.d.b();
                s.j(aVarB);
                xe0.f fVarF = aVar.f223973c.f();
                s.j(fVarF);
                return obk.d.m(dVarB, fVarF, aVarB);
            case 7:
                return new tbk.e((wbk.e) aVar.f223984t.get());
            case 8:
                return new wbk.e((PlanGiftingLifecycleService) aVar.f223983s.get());
            case 9:
                return i.u(aVar.f223971a, ((nj0.d) aVar.f223972b).f());
            case 10:
                return new tbk.b(aVar.f223974g.a());
            case 11:
                return i.t(aVar.f223971a, ((nj0.d) aVar.f223972b).f());
            case 12:
                return new tbk.d((wbk.d) aVar.f223987y.get());
            case 13:
                return new wbk.d((ue0.c) aVar.f223986x.get());
            case 14:
                je0.d dVarB2 = aVar.f223973c.b();
                s.j(dVarB2);
                yk0.a aVarB2 = aVar.d.b();
                s.j(aVarB2);
                xe0.f fVarF2 = aVar.f223973c.f();
                s.j(fVarF2);
                return obk.d.k(dVarB2, fVarF2, aVarB2);
            case 15:
                l80.e eVarH = aVar.f223975h.h();
                s.j(eVarH);
                return new tbk.c(eVarH, new zjh.i(((c21.b) aVar.i).c()));
            case 16:
                return new ubk.a(((ika.b) aVar.f223976j).b());
            case 17:
                return new qbk.b();
            case 18:
                return new qbk.c();
            case 19:
                sri.m mVarD = ((g8b.a) aVar.k).d();
                s.j(mVarD);
                return new nbk.c(mVarD, (tbk.b) aVar.v.get(), (lbk.a) aVar.B.get());
            case 20:
                return new mbk.b((tbk.b) aVar.v.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        Object dVar2;
        Object mVar;
        int i = this.f209193a;
        int i2 = 5;
        int i3 = 8;
        int i5 = 3;
        int i6 = 2;
        int i21 = this.f209194b;
        Object obj2 = this.f209195c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                ei5.d dVar3 = bVar.d;
                if (i21 == 0) {
                    n nVarB = bVar.f209196a.b();
                    xua.a aVarA = bVar.f209197b.a();
                    s.j(aVarA);
                    l80.e eVarH = bVar.f209198c.h();
                    s.j(eVarH);
                    xh5.a aVarA2 = dVar3.a();
                    s.j(aVarA2);
                    dVar = new pva.d(nVarB, aVarA, eVarH, aVarA2);
                } else {
                    if (i21 == 1) {
                        xoj.a aVarA3 = bVar.e.a();
                        s.j(aVarA3);
                        return new jva.a(aVarA3);
                    }
                    if (i21 != 2) {
                        if (i21 == 3) {
                            return ms1.g.p(bVar.f209199g);
                        }
                        throw new AssertionError(i21);
                    }
                    iva.a aVar = (iva.a) bVar.f209200h.get();
                    sri.m mVar2 = (sri.m) bVar.f209201j.get();
                    ai5.b bVarB = dVar3.b();
                    s.j(bVarB);
                    dVar = new lva.c(aVar, mVar2, bVarB);
                }
                return dVar;
            case 1:
                mve.b bVar2 = (mve.b) obj2;
                switch (i21) {
                    case 0:
                        return new t0(bVar2.f209220a, bVar2.f209222b, bVar2.f209224c, bVar2.d, bVar2.e, bVar2.f, bVar2.f209227g, bVar2.f209228h, bVar2.i, bVar2.f209230j, bVar2.k, bVar2.f209232l, bVar2.f209233m, bVar2.f209234n, bVar2.o, bVar2.f209237p, bVar2.f209238q, bVar2.f209239r, bVar2.f209241s, bVar2.f209243t, bVar2.u, bVar2.v, bVar2.f209246w, bVar2.f209248x, bVar2.f209250y, bVar2.z, bVar2.A, bVar2.B, bVar2.C, bVar2.D, bVar2.E, bVar2.F, bVar2.G, bVar2.H);
                    case 1:
                        return qlc.b.c(bVar2.I, bVar2.J, bVar2.i, bVar2.f209241s, bVar2.A, bVar2.K, bVar2.f209222b, bVar2.f209238q, bVar2.u, bVar2.f209233m, bVar2.f209232l, bVar2.L, bVar2.f, bVar2.G, bVar2.M, bVar2.N, bVar2.O, bVar2.z, bVar2.P, bVar2.f209250y, bVar2.e, bVar2.f209248x, bVar2.Q, bVar2.R, bVar2.S, bVar2.T, bVar2.f209227g, bVar2.f209228h, bVar2.f209234n, bVar2.U, bVar2.V, bVar2.W, bVar2.X, bVar2.Y, bVar2.Z, bVar2.f209221a0, bVar2.f209223b0, bVar2.v, bVar2.H, bVar2.y0, bVar2.A0, bVar2.B0, bVar2.D0, bVar2.c0, bVar2.F0, bVar2.d, bVar2.f209224c, bVar2.g0, bVar2.f209229h0, bVar2.f209246w);
                    case 2:
                        return ms1.g.z((pve.b) bVar2.f209249x0.get());
                    case 3:
                        return pve.c.a();
                    case 4:
                        return ms1.g.A((r0) bVar2.z0.get());
                    case 5:
                        return s0.a();
                    case 6:
                        return ms1.g.B((t0) bVar2.f209247w0.get());
                    case 7:
                        return ms1.g.x((ove.i0) bVar2.C0.get());
                    case 8:
                        return olc.c.f(bVar2.f209232l);
                    case 9:
                        return ms1.g.C((a0) bVar2.E0.get());
                    case 10:
                        return qlc.b.e(bVar2.f209220a, bVar2.u, bVar2.k, bVar2.f209232l, bVar2.L, bVar2.G, bVar2.v, bVar2.z, bVar2.f209248x, bVar2.e, bVar2.R, bVar2.f209224c, bVar2.f209228h, bVar2.d, bVar2.f, bVar2.B0, bVar2.f209234n, bVar2.f209225d0, bVar2.f209226e0, bVar2.f209246w, bVar2.f0);
                    case 11:
                        return olc.c.d(bVar2.f209220a, bVar2.i0, bVar2.j0, bVar2.f209231k0, bVar2.o, bVar2.f209238q, bVar2.f209233m, bVar2.f209232l, bVar2.z, bVar2.P, bVar2.e, bVar2.f209248x, bVar2.Q, bVar2.R, bVar2.l0, bVar2.f209228h, bVar2.m0, bVar2.f209235n0, bVar2.f209239r, bVar2.f209236o0, bVar2.Z, bVar2.B0, bVar2.d, bVar2.f209224c, bVar2.F0, bVar2.f209246w, bVar2.p0, bVar2.q0, bVar2.f209240r0, bVar2.f209242s0, bVar2.f209244t0, bVar2.u0, bVar2.f209245v0);
                    default:
                        throw new AssertionError(i21);
                }
            case 2:
                mw5.l lVar = (mw5.l) obj2;
                switch (i21) {
                    case 0:
                        sri.m mVar3 = (sri.m) lVar.f209389y.get();
                        ai5.b bVarB2 = lVar.f209374b.b();
                        s.j(bVarB2);
                        return new lw5.b(mVar3, bVarB2, lVar.a());
                    case 1:
                        return ms1.g.q(lVar.f209373a);
                    case 2:
                        return new ne0.d();
                    case 3:
                        je0.d dVarB = lVar.e.b();
                        s.j(dVarB);
                        yk0.a aVarB = lVar.f.b();
                        s.j(aVarB);
                        xe0.f fVarF = lVar.e.f();
                        s.j(fVarF);
                        return ms1.g.j(dVarB, fVarF, aVarB);
                    case 4:
                        ppk.f fVarA = lVar.f209376g.a();
                        xv5.c cVarA = lVar.f209377h.a();
                        s.j(cVarA);
                        return new nw5.a(fVarA, cVarA, lVar.i.b(), lVar.f209378j.E());
                    case 5:
                        return new nw5.j((tw5.e) lVar.G.get());
                    case 6:
                        return new tw5.e((CryptoStatsService) lVar.F.get(), (ne0.j) lVar.A.get(), (ue0.c) lVar.B.get());
                    case 7:
                        return ms1.g.i((Retrofit) lVar.E.get());
                    case 8:
                        Retrofit retrofitI = ((c21.b) lVar.k).i();
                        s.j(retrofitI);
                        return ms1.g.k((kg.o) lVar.D.get(), retrofitI);
                    case 9:
                        kg.o oVarH = ((c21.b) lVar.k).h();
                        s.j(oVarH);
                        return oVarH;
                    case 10:
                        return new p();
                    default:
                        throw new AssertionError(i21);
                }
            case 3:
                myj.a aVar2 = (myj.a) obj2;
                a31.a aVar3 = aVar2.f210533b;
                q qVar = aVar2.f210532a;
                a31.a aVar4 = aVar2.f210536h;
                if (i21 == 0) {
                    return new ei5.a(qVar, aVar3, aVar2.f210534c, aVar2.d, aVar2.e, aVar2.f, aVar2.f210535g, aVar4, aVar2.i, aVar2.f210537j, aVar2.k, aVar2.f210538l, 4);
                }
                if (i21 == 1) {
                    return nga.c.d(aVar4, aVar2.f210539m, aVar2.f210540n, aVar2.o, aVar3, aVar2.f210541p, aVar2.f210542q, aVar2.f210543r, qVar);
                }
                if (i21 == 2) {
                    return nga.c.f(aVar4);
                }
                throw new AssertionError(i21);
            case 4:
                n06.a aVar5 = (n06.a) obj2;
                ee0.a aVar6 = aVar5.f210873a;
                if (i21 == 0) {
                    return new nd.o((ue0.c) aVar5.f210875c.get());
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new m06.a();
                    }
                    throw new AssertionError(i21);
                }
                je0.d dVarB2 = aVar6.b();
                s.j(dVarB2);
                yk0.a aVarB2 = aVar5.f210874b.b();
                s.j(aVarB2);
                xe0.f fVarF2 = aVar6.f();
                s.j(fVarF2);
                return ms1.g.l(dVarB2, fVarF2, aVarB2);
            case 5:
                n7c.a aVar7 = (n7c.a) obj2;
                q qVar2 = aVar7.f213050a;
                a31.a aVar8 = aVar7.f;
                a31.a aVar9 = aVar7.f213060q;
                a31.a aVar10 = aVar7.o;
                a31.a aVar11 = aVar7.f213052c;
                if (i21 == 0) {
                    dVar2 = new ms1.d(qVar2, aVar7.f213051b, aVar11, aVar7.d, aVar7.e, aVar8, aVar7.f213053g, aVar7.f213054h, aVar7.i, aVar7.f213055j, aVar7.k, aVar7.f213056l, aVar7.f213057m, aVar7.f213058n, aVar10, aVar7.E, aVar7.f213061r, aVar7.f213062s, aVar7.f213063t, aVar7.u, aVar7.v, aVar7.f213064w, aVar7.f213065x, aVar7.f213066y, aVar7.z, aVar7.A, aVar7.B, aVar7.C);
                } else {
                    if (i21 == 1) {
                        p7c.s0 s0Var = (p7c.s0) ((w0) aVar7.D.get()).b();
                        s.k(s0Var);
                        return s0Var;
                    }
                    if (i21 != 2) {
                        if (i21 == 3) {
                            return new bwj.b(aVar11, aVar8, aVar10, i3);
                        }
                        if (i21 == 4) {
                            return oyj.c.b(aVar9);
                        }
                        throw new AssertionError(i21);
                    }
                    dVar2 = new w0(aVar11, aVar10, aVar7.f213059p, aVar9, qVar2);
                }
                return dVar2;
            case 6:
                n86.d dVar4 = (n86.d) obj2;
                ee0.a aVar12 = dVar4.f213233c;
                if (i21 == 0) {
                    b80.c cVarP = dVar4.f213231a.p();
                    s.j(cVarP);
                    return new k86.f(cVarP, (DeviceManagementService) dVar4.i.get(), new j86.a(), new ne0.d(), (ue0.c) dVar4.f213236j.get());
                }
                if (i21 == 1) {
                    Retrofit retrofitI2 = ((c21.b) dVar4.f213232b).i();
                    s.j(retrofitI2);
                    return n57.a.D(retrofitI2);
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                je0.d dVarB3 = aVar12.b();
                s.j(dVarB3);
                yk0.a aVarB3 = dVar4.d.b();
                s.j(aVarB3);
                xe0.f fVarF3 = aVar12.f();
                s.j(fVarF3);
                return n57.a.f(dVarB3, fVarF3, aVarB3);
            case 7:
                na6.a aVar13 = (na6.a) obj2;
                a31.a aVar14 = aVar13.C;
                if (i21 == 0) {
                    return new b7e.d(aVar13.f213799a, aVar13.f213800b, aVar13.f213801c, aVar13.d, aVar13.e, aVar13.f, aVar13.f213802g, aVar13.f213803h, aVar13.i, aVar13.f213804j, aVar13.k, aVar13.f213805l, aVar13.f213806m, aVar13.f213807n, aVar13.o, aVar13.f213808p, aVar13.f213809q, aVar13.f213810r, aVar13.f213811s, aVar13.f213812t, aVar13.u, aVar13.v, aVar13.f213813w, aVar13.f213814x, aVar13.f213815y, aVar13.z, aVar13.A, aVar13.B, aVar13.I, aVar13.D, aVar13.E, aVar13.F, aVar13.G);
                }
                if (i21 == 1) {
                    return n57.a.C((pa6.w) aVar13.H.get());
                }
                if (i21 == 2) {
                    return p7h.b.g(aVar14);
                }
                if (i21 == 3) {
                    return p7h.b.d(aVar13.I, aVar14);
                }
                if (i21 == 4) {
                    return p7h.b.a(aVar13.I);
                }
                throw new AssertionError(i21);
            case 8:
                nai.a aVar15 = (nai.a) obj2;
                a31.a aVar16 = aVar15.f;
                a31.a aVar17 = aVar15.f213910j;
                a31.a aVar18 = aVar15.f213909h;
                if (i21 == 0) {
                    return new cf7.m(aVar15.f213905a, aVar15.f213906b, aVar15.f213907c, aVar15.d, aVar15.e, aVar16, aVar15.f213908g, aVar18, aVar15.i, aVar17, aVar15.k, aVar15.f213911l, aVar15.f213912m, aVar15.f213913n, aVar15.o, aVar15.f213914p, aVar15.f213915q, 2);
                }
                if (i21 == 1) {
                    return new dm5.a(aVar18, aVar17, aVar16, aVar15.f213916r, aVar15.f213917s, 10);
                }
                throw new AssertionError(i21);
            case 9:
                ned.e eVar = (ned.e) obj2;
                if (i21 == 0) {
                    return new oed.b((oed.a) eVar.f214448j.get());
                }
                if (i21 == 1) {
                    return new oed.a();
                }
                if (i21 == 2) {
                    return new sfd.h((sfd.c) eVar.f214449l.get());
                }
                if (i21 == 3) {
                    return new sfd.d();
                }
                if (i21 == 4) {
                    return new sfd.b();
                }
                throw new AssertionError(i21);
            case 10:
                nej.a aVar19 = (nej.a) obj2;
                switch (i21) {
                    case 0:
                        return new oej.b((qej.c) aVar19.d.get(), (qej.f) aVar19.e.get());
                    case 1:
                        return new qej.c(aVar19.f214550a, new rej.f(), new rej.a());
                    case 2:
                        return new qej.g();
                    case 3:
                        return new oej.c((qej.e) aVar19.f214553g.get(), (qej.c) aVar19.d.get());
                    case 4:
                        Context context = aVar19.f214550a;
                        return new qej.e(context, new rej.f(), new sej.a(), new rej.e(context));
                    case 5:
                        return new kej.f((kej.h) aVar19.k.get(), (kej.i) aVar19.f214557m.get(), (oej.a) aVar19.f.get());
                    case 6:
                        return new kej.h(aVar19.f214550a, (kej.g) aVar19.i.get(), (lej.a) aVar19.f214555j.get());
                    case 7:
                        return nej.d.a();
                    case 8:
                        return new lej.a();
                    case 9:
                        return new kej.i(aVar19.f214550a, (kej.g) aVar19.i.get(), (lej.c) aVar19.f214556l.get());
                    case 10:
                        return new lej.b();
                    case 11:
                        je0.d dVarB4 = aVar19.f214551b.b();
                        s.j(dVarB4);
                        yk0.a aVarB4 = aVar19.f214552c.b();
                        s.j(aVarB4);
                        xe0.f fVarF4 = aVar19.f214551b.f();
                        s.j(fVarF4);
                        return n57.a.h(dVarB4, fVarF4, aVarB4);
                    default:
                        throw new AssertionError(i21);
                }
            case 11:
                nf0.a aVar20 = (nf0.a) obj2;
                switch (i21) {
                    case 0:
                        return new rf0.a((qf0.c) aVar20.f214794b.get(), (qf0.e) aVar20.d.get());
                    case 1:
                        return new qf0.c();
                    case 2:
                        return new qf0.e((ActivityManager) aVar20.f214795c.get(), new xk0.a(), new pl0.a());
                    case 3:
                        return obk.d.b(aVar20.f214793a);
                    case 4:
                        return new sf0.h((kg.o) aVar20.f.get());
                    case 5:
                        of0.b.Companion.getClass();
                        return new kg.o();
                    case 6:
                        return new sf0.e((kg.o) aVar20.f.get());
                    default:
                        throw new AssertionError(i21);
                }
            case 12:
                nia.a aVar21 = (nia.a) obj2;
                l70.e eVar2 = aVar21.f215665c;
                us6.q qVar3 = aVar21.f215663a;
                if (i21 == 0) {
                    return new qia.a();
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new lia.f(qVar3.c(), new lia.c());
                    }
                    if (i21 != 3) {
                        throw new AssertionError(i21);
                    }
                    ct6.u uVar = (ct6.u) qVar3.f282694n1.get();
                    s.j(uVar);
                    return new tia.b(uVar);
                }
                lia.d dVar5 = (lia.d) aVar21.d.get();
                n nVarB2 = aVar21.f215664b.b();
                l80.e eVarH2 = eVar2.h();
                s.j(eVarH2);
                sia.a aVar22 = new sia.a(eVarH2);
                l80.e eVarH3 = eVar2.h();
                s.j(eVarH3);
                return new oia.a(dVar5, nVarB2, aVar22, new fuk.a(eVarH3, new lia.c()));
            case 13:
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new xjl.s();
                    }
                    throw new AssertionError(i21);
                }
                xjl.r rVar = (xjl.r) ((q0) ((njl.a) obj2).f216602a).f196071o0.get();
                s.j(rVar);
                return rVar;
            case 14:
                nl5.e eVar3 = (nl5.e) obj2;
                switch (i21) {
                    case 0:
                        e4m.e eVar4 = eVar3.f217019m;
                        ei5.d dVar6 = eVar3.f217014c;
                        sri.m mVar4 = (sri.m) eVar4.get();
                        i4b.f fVarA2 = eVar3.a();
                        xh5.a aVarA4 = dVar6.a();
                        s.j(aVarA4);
                        ai5.b bVarB3 = dVar6.b();
                        s.j(bVarB3);
                        return new ml5.c(mVar4, fVarA2, aVarA4, bVarB3);
                    case 1:
                        z70.a aVarF = eVar3.f217012a.f();
                        s.j(aVarF);
                        return nga.c.p(aVarF);
                    case 2:
                        return new ml5.d();
                    case 3:
                        return new ne0.d();
                    case 4:
                        je0.d dVarB5 = eVar3.d.b();
                        s.j(dVarB5);
                        yk0.a aVarB5 = eVar3.e.b();
                        s.j(aVarB5);
                        xe0.f fVarF5 = eVar3.d.f();
                        s.j(fVarF5);
                        return pl1.d.q(dVarB5, fVarF5, aVarB5);
                    case 5:
                        return new tl5.b();
                    case 6:
                        return new ul5.g();
                    case 7:
                        return new tl5.a();
                    case 8:
                        rl5.c cVar = (rl5.c) eVar3.f217026w.get();
                        xvh.c cVarA2 = ((a6d.e) eVar3.f217016h).a();
                        s.j(cVarA2);
                        return new sl5.f(cVar, cVarA2, (ol5.c) eVar3.f217028y.get());
                    case 9:
                        return new rl5.c((CryptoSpareChangeService) eVar3.u.get(), (ql5.a) eVar3.v.get());
                    case 10:
                        kl5.a aVar23 = eVar3.f;
                        Retrofit retrofitI3 = ((c21.b) eVar3.f217015g).i();
                        s.j(retrofitI3);
                        return ka1.c.C(aVar23, retrofitI3);
                    case 11:
                        return new ql5.a();
                    case 12:
                        ul5.g gVar = (ul5.g) eVar3.f217024s.get();
                        sl5.h hVar = (sl5.h) eVar3.f217027x.get();
                        xvh.c cVarA3 = ((a6d.e) eVar3.f217016h).a();
                        s.j(cVarA3);
                        return new ol5.c(gVar, hVar, cVarA3, (ne0.j) eVar3.f217021p.get(), (ue0.c) eVar3.f217022q.get());
                    case 13:
                        return new sl5.h(eVar3.i.b());
                    default:
                        throw new AssertionError(i21);
                }
            case 15:
                nm2.e eVar5 = (nm2.e) obj2;
                nj0.a aVar24 = eVar5.f217158c;
                Context context2 = eVar5.f217157b;
                if (i21 == 0) {
                    bn2.p pVarB = eVar5.f217156a.b();
                    s.j(pVarB);
                    return new bn2.r(pVarB, (w1) eVar5.e.get(), (qz0.j) eVar5.f.get(), context2);
                }
                if (i21 == 1) {
                    return nga.c.x(context2, ((nj0.d) aVar24).h());
                }
                if (i21 == 2) {
                    return nga.c.v(context2, ((nj0.d) aVar24).h());
                }
                throw new AssertionError(i21);
            case 16:
                nn0.c cVar2 = (nn0.c) obj2;
                if (i21 == 0) {
                    return new pn0.b((pn0.c) cVar2.f217432b.get());
                }
                if (i21 == 1) {
                    return new pn0.c(cVar2.f217431a);
                }
                throw new AssertionError(i21);
            case 17:
                nng.p pVar = (nng.p) obj2;
                if (i21 == 0) {
                    f01.a aVar25 = (f01.a) pVar.k.get();
                    df0.b bVarA = pVar.f217674b.a();
                    s.j(bVarA);
                    return new tog.a(aVar25, bVarA);
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new kng.a();
                    }
                    throw new AssertionError(i21);
                }
                z70.a aVarF2 = pVar.f217673a.f();
                s.j(aVarF2);
                return olc.c.z(aVarF2);
            case 18:
                npa.b bVar3 = (npa.b) obj2;
                a31.a aVar26 = bVar3.f218176c;
                a31.a aVar27 = bVar3.f218175b;
                if (i21 == 0) {
                    return new dm5.a(bVar3.f218174a, aVar27, aVar26, bVar3.d, bVar3.e, 11);
                }
                if (i21 == 1) {
                    return new c06.a(aVar27, aVar26, i3);
                }
                throw new AssertionError(i21);
            case 19:
                npk.a aVar28 = (npk.a) obj2;
                switch (i21) {
                    case 0:
                        return new v((RatesService) aVar28.f218239l.get(), (fpk.e) aVar28.f218241n.get(), (fpk.c) aVar28.o.get(), aVar28.e.a());
                    case 1:
                        RatesService ratesService = (RatesService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar28.k.get(), "retrofit", RatesService.class, "create(...)");
                        s.k(ratesService);
                        return ratesService;
                    case 2:
                        Retrofit retrofit = ((nj0.d) aVar28.f218234b).f();
                        kg.o gson = fe0.c.a();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
                    case 3:
                        RatesRoomDatabase db8 = (RatesRoomDatabase) aVar28.f218240m.get();
                        npk.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db8, "db");
                        fpk.e eVarI = db8.i();
                        s.k(eVarI);
                        return eVarI;
                    case 4:
                        Context context3 = aVar28.d;
                        npk.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        RoomDatabase.Builder builderFallbackToDestructiveMigration = Room.databaseBuilder(context3, RatesRoomDatabase.class, "rates_database").fallbackToDestructiveMigration();
                        RatesRoomDatabase.INSTANCE.getClass();
                        RatesRoomDatabase ratesRoomDatabase = (RatesRoomDatabase) builderFallbackToDestructiveMigration.addMigrations((Migration[]) Arrays.copyOf(new Migration[]{hpk.a.f154569c, hpk.b.f154570c, new hpk.c(), new hpk.d(), hpk.e.f154571c, hpk.f.f154572c, hpk.g.f154573c, hpk.h.f154574c, hpk.i.f154575c}, 9)).build();
                        s.k(ratesRoomDatabase);
                        return ratesRoomDatabase;
                    case 5:
                        RatesRoomDatabase db10 = (RatesRoomDatabase) aVar28.f218240m.get();
                        npk.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db10, "db");
                        fpk.c cVarG = db10.g();
                        s.k(cVarG);
                        return cVarG;
                    case 6:
                        e4m.e eVar6 = aVar28.f218243q;
                        l70.e eVar7 = aVar28.f218236g;
                        RatesPlotApiService ratesPlotApiService = (RatesPlotApiService) eVar6.get();
                        apk.a aVarA5 = aVar28.e.a();
                        ipk.b bVar4 = (ipk.b) aVar28.f218244r.get();
                        jpk.c cVar3 = (jpk.c) aVar28.f218245s.get();
                        ne0.d dVarA = npk.n.a();
                        b80.c cVarP2 = eVar7.p();
                        s.j(cVarP2);
                        CoroutineScope coroutineScopeA = aVar28.f218237h.a();
                        s.j(coroutineScopeA);
                        l80.e eVarH4 = eVar7.h();
                        s.j(eVarH4);
                        qe0.s sVar = (qe0.s) aVar28.u.get();
                        gte.a aVarB6 = aVar28.f218238j.b();
                        s.j(aVarB6);
                        return new vpk.p(ratesPlotApiService, aVarA5, bVar4, cVar3, dVarA, cVarP2, coroutineScopeA, eVarH4, sVar, aVarB6);
                    case 7:
                        RatesPlotApiService ratesPlotApiService2 = (RatesPlotApiService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) aVar28.k.get(), "retrofit", RatesPlotApiService.class, "create(...)");
                        s.k(ratesPlotApiService2);
                        return ratesPlotApiService2;
                    case 8:
                        RatesRoomDatabase db11 = (RatesRoomDatabase) aVar28.f218240m.get();
                        npk.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db11, "db");
                        ipk.b bVarJ = db11.j();
                        s.k(bVarJ);
                        return bVarJ;
                    case 9:
                        RatesRoomDatabase db12 = (RatesRoomDatabase) aVar28.f218240m.get();
                        npk.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(db12, "db");
                        jpk.c cVarH = db12.h();
                        s.k(cVarH);
                        return cVarH;
                    case 10:
                        ze0.a aVarA6 = aVar28.f218235c.a();
                        s.j(aVarA6);
                        return nga.c.k(aVarA6, (ue0.c) aVar28.f218246t.get());
                    case 11:
                        je0.d dVarD = aVar28.f218235c.d();
                        s.j(dVarD);
                        yk0.a aVarB7 = aVar28.i.b();
                        s.j(aVarB7);
                        xe0.f fVarF6 = aVar28.f218235c.f();
                        s.j(fVarF6);
                        return nga.c.j(dVarD, fVarF6, aVarB7);
                    case 12:
                        gpk.c cVarQ = nga.c.q((RatesRoomDatabase) aVar28.f218240m.get());
                        RatesAlertsService ratesAlertsService = (RatesAlertsService) aVar28.f218247w.get();
                        ne0.d dVarA2 = npk.n.a();
                        b80.c cVarP3 = aVar28.f218236g.p();
                        s.j(cVarP3);
                        return new uvl.c(cVarQ, ratesAlertsService, dVarA2, cVarP3);
                    case 13:
                        return nga.c.r((Retrofit) aVar28.k.get());
                    default:
                        throw new AssertionError(i21);
                }
            case 20:
                nq3.c cVar4 = (nq3.c) obj2;
                uq3.b bVar5 = cVar4.f218358c;
                dw3.e eVar8 = cVar4.f218357b;
                if (i21 == 0) {
                    sri.m mVar5 = (sri.m) cVar4.f218361j.get();
                    rz3.c cVarG2 = ((c1) eVar8).g();
                    s.j(cVarG2);
                    xq3.t tVar = (xq3.t) bVar5.F.get();
                    s.j(tVar);
                    xq3.j jVarH = bVar5.h();
                    s.j(jVarH);
                    up3.b bVarI = bVar5.i();
                    s.j(bVarI);
                    al4.q qVarA = cVar4.d.a();
                    s.j(qVarA);
                    xq3.d dVar7 = (xq3.d) bVar5.M.get();
                    s.j(dVar7);
                    hz3.c cVarB = ((c1) eVar8).b();
                    gte.a aVarB8 = cVar4.e.b();
                    s.j(aVarB8);
                    mVar = new oq3.m(mVar5, cVarG2, tVar, jVarH, bVarI, qVarA, dVar7, cVarB, aVarB8);
                } else {
                    if (i21 == 1) {
                        return nga.c.o(cVar4.f218356a);
                    }
                    if (i21 != 2) {
                        if (i21 != 3) {
                            throw new AssertionError(i21);
                        }
                        sri.m mVar6 = (sri.m) cVar4.f218361j.get();
                        q89.e eVarA = cVar4.f218359g.a();
                        s.j(eVarA);
                        lfa.b bVarA2 = cVar4.f218360h.a();
                        t tVarF = cVar4.i.f();
                        s.j(tVarF);
                        return new oq3.o(mVar6, eVarA, bVarA2, tVarF);
                    }
                    sri.m mVar7 = (sri.m) cVar4.f218361j.get();
                    rz3.c cVarG3 = ((c1) eVar8).g();
                    s.j(cVarG3);
                    mw3.a aVar29 = (mw3.a) ((c1) eVar8).m1.get();
                    s.j(aVar29);
                    mw3.d dVar8 = (mw3.d) ((c1) eVar8).f118461o1.get();
                    s.j(dVar8);
                    vie.h hVarA = cVar4.f.a();
                    s.j(hVarA);
                    mVar = new oq3.c(mVar7, cVarG3, aVar29, dVar8, hVarA);
                }
                return mVar;
            case 21:
                nq8.a aVar30 = (nq8.a) obj2;
                a31.a aVar31 = aVar30.f218381c;
                a31.a aVar32 = aVar30.d;
                a31.a aVar33 = aVar30.f218384j;
                if (i21 == 0) {
                    return new oq8.g(aVar30.f218379a, aVar30.f218380b, aVar31, aVar32, aVar30.e, aVar30.f, aVar30.f218382g, aVar30.f218383h, aVar30.i, aVar33, aVar30.k);
                }
                if (i21 == 1) {
                    return olc.c.e(aVar33, aVar32, aVar30.f218385l, aVar30.f218386m, aVar30.f218387n, aVar30.o, aVar30.f218388p, aVar30.f218389q, aVar31, aVar30.f218390r, aVar30.f218391s, aVar30.u);
                }
                if (i21 == 2) {
                    return nga.c.z((oq8.g) aVar30.f218392t.get());
                }
                throw new AssertionError(i21);
            case 22:
                nt8.a aVar34 = (nt8.a) obj2;
                switch (i21) {
                    case 0:
                        qt8.e eVar9 = (qt8.e) aVar34.k.get();
                        mt8.a aVar35 = (mt8.a) aVar34.f218986l.get();
                        jvh.a aVarA7 = aVar34.e.a();
                        s.j(aVarA7);
                        return new qt8.d(eVar9, aVar35, aVarA7, (qt8.o) aVar34.f218987m.get());
                    case 1:
                        UserKycService userKycService = (UserKycService) aVar34.f218984h.get();
                        ue0.c cVar5 = (ue0.c) aVar34.i.get();
                        m31.a aVar36 = (m31.a) aVar34.f218981b.o.get();
                        s.j(aVar36);
                        return new qt8.l(userKycService, cVar5, aVar36, (ne0.j) aVar34.f218985j.get());
                    case 2:
                        Retrofit retrofit3 = ((nj0.d) aVar34.f218980a).f();
                        nt8.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate = retrofit3.create(UserKycService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        UserKycService userKycService2 = (UserKycService) objCreate;
                        s.k(userKycService2);
                        return userKycService2;
                    case 3:
                        je0.d mapper = aVar34.f218981b.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = aVar34.f218982c.b();
                        s.j(databaseSessionProvider);
                        xe0.f fVarF7 = aVar34.f218981b.f();
                        s.j(fVarF7);
                        nt8.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        return xe0.f.f(fVarF7, databaseSessionProvider, "kyc", mapper, 3, zhm.v.k(v0.a.c(fVarF7, "storageFactory", 1, 2), new exa.a(i6, i5, i2)), 32);
                    case 4:
                        return new ne0.d();
                    case 5:
                        gte.a aVarB9 = aVar34.d.b();
                        s.j(aVarB9);
                        return new pt8.a(aVarB9);
                    case 6:
                        UserKycService userKycService3 = (UserKycService) aVar34.f218984h.get();
                        m31.c cVarG4 = aVar34.f218981b.g();
                        s.j(cVarG4);
                        oy8.b bVar6 = (oy8.b) aVar34.f.f250249h.get();
                        s.j(bVar6);
                        return new qt8.o(userKycService3, cVarG4, bVar6);
                    case 7:
                        return new ot8.a((ot8.c) aVar34.f218989p.get());
                    case 8:
                        KycDocsService kycDocsService = (KycDocsService) aVar34.o.get();
                        ne0.j jVar = (ne0.j) aVar34.f218985j.get();
                        b80.c cVarP4 = aVar34.f218983g.p();
                        s.j(cVarP4);
                        return new ot8.c(kycDocsService, jVar, cVarP4);
                    case 9:
                        return nga.c.n(((nj0.d) aVar34.f218980a).f());
                    default:
                        throw new AssertionError(i21);
                }
            case 23:
                return a();
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                return d();
            case 27:
                return e();
            case 28:
                return f();
            default:
                oe5.c cVar6 = (oe5.c) obj2;
                ei5.d dVar9 = cVar6.f224538b;
                if (i21 == 0) {
                    sri.m mVar8 = (sri.m) cVar6.i.get();
                    xh5.a aVarA8 = dVar9.a();
                    s.j(aVarA8);
                    ai5.b bVarB4 = dVar9.b();
                    s.j(bVarB4);
                    return new ne5.c(mVar8, aVarA8, bVarB4);
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        return new pe5.a();
                    }
                    throw new AssertionError(i21);
                }
                z70.a aVarF3 = cVar6.f224537a.f();
                s.j(aVarF3);
                return obk.d.h(aVarF3);
        }
    }
}
