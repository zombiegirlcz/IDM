package r5a;

import android.content.Context;
import b3j.p;
import bt6.f0;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_order_new.impl.delivery.api.repository.network.DeliveryService;
import com.revolut.feature.card_order_new.impl.pricing.api.network.PricingService;
import com.revolut.feature.card_reader.tips.impl.data.network.CardReaderTipsService;
import com.revolut.feature.crypto.config.impl.network.CryptoConfigService;
import com.revolut.feature.junior_core.impl.services.JuniorAccountService;
import com.revolut.feature.junior_graduation.impl.service.JuniorGraduationService;
import com.revolut.feature.referrals.promo.impl.invitation.data.db.model.ReferralsInvitationDatabase;
import com.revolut.feature.referrals.promo.impl.invitation.service.ReferralsInvitationService;
import com.revolut.feature.revpro.lite_pos.impl.data.network.CatalogueService;
import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;
import com.revolut.feature.slot_manager.impl.database.SlotManagerDatabase;
import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import com.revolut.retail.feature_widgets.impl.network.WidgetService;
import cu8.r0;
import e4m.e;
import ffk.t;
import gf8.g;
import gf8.l;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import jul.o;
import k4a.v;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lra.d;
import mq9.f;
import ne0.j;
import om4.d0;
import pa6.m;
import q4a.q;
import qgk.k3;
import qw7.u;
import qza.b0;
import retrofit2.Retrofit;
import ru9.k0;
import s3a.k;
import s3a.y;
import sgm.e3;
import t3a.h;
import te8.a0;
import te8.c0;
import te8.r;
import te8.z;
import ufg.p0;
import us6.w3;
import vc.s;
import vl3.n;
import wli.x;
import yo5.w;
import z0g.f1;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f251551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f251552c;

    public /* synthetic */ b(Object obj2, int i, int i2) {
        this.f251550a = i2;
        this.f251552c = obj2;
        this.f251551b = i;
    }

    private final Object a() {
        k kVar = (k) this.f251552c;
        int i = this.f251551b;
        switch (i) {
            case 0:
                n nVar = kVar.f259525a;
                m mVar = kVar.f259533h;
                xmg.a aVar = kVar.f;
                t2j.a aVar2 = kVar.f259527b;
                cl3.a aVarD = nVar.d();
                s.j(aVarD);
                d3j.b bVarE = ((p) aVar2).e();
                d dVarB = ((jqa.p) kVar.f259529c).b();
                s.j(dVarB);
                f fVarC = kVar.d.c();
                s.j(fVarC);
                ap5.b bVarE2 = ((w) kVar.e).e();
                s.j(bVarE2);
                cl3.a aVarD2 = kVar.f259525a.d();
                s.j(aVarD2);
                i iVar = new i(aVarD2, aVar.e());
                ang.f fVarE = aVar.e();
                z80.b bVarS = kVar.f259532g.s();
                s.j(bVarS);
                o oVar = new o(fVarE, bVarS);
                aa6.c cVarB = mVar.b();
                s.j(cVarB);
                a31.a aVarA = mVar.f234384a.a();
                lx1.d dVarB2 = ((ey1.e) kVar.i).b();
                s.j(dVarB2);
                xx9.p pVarB = kVar.f259535j.b();
                s.j(pVarB);
                h3a.o oVar2 = new h3a.o();
                hj8.a aVarA2 = kVar.k.a();
                s.j(aVarA2);
                d0 d0Var = new d0(aVarA2);
                co9.b bVarB = kVar.f259537l.b();
                s.j(bVarB);
                d3j.b bVarE3 = ((p) aVar2).e();
                sz5.f fVarF = kVar.f();
                uw1.c cVarD = ((lz1.m) kVar.f259539n).d();
                s.j(cVarD);
                gte.a aVarB = kVar.o.b();
                s.j(aVarB);
                return new u3a.n(aVarD, bVarE, dVarB, fVarC, bVarE2, iVar, oVar, cVarB, aVarA, dVarB2, pVarB, oVar2, d0Var, bVarB, new u3a.c(bVarE3, fVarF, cVarD, aVarB), kVar.f());
            case 1:
                e3 e3Var = new e3((cl3.a) kVar.f259525a.f290239w.get());
                xx9.p pVarB2 = kVar.f259535j.b();
                s.j(pVarB2);
                return new h(e3Var, pVarB2);
            case 2:
                return y.a();
            case 3:
                tbk.c cVar = (tbk.c) kVar.f259542p.A.get();
                s.j(cVar);
                yik.h hVarB = ((k3) kVar.f259543q).b();
                k0 k0Var = (k0) kVar.f259544r.f219243r.get();
                s.j(k0Var);
                return new g5a.a(new g5a.c(cVar, hVarB, k0Var));
            case 4:
                return new v();
            case 5:
                return new q();
            case 6:
                return s3a.v.a();
            case 7:
                return new r3a.a((v) kVar.l0.get());
            case 8:
                return new v3a.c((sri.m) kVar.p0.get());
            case 9:
                return s2l.c.o(kVar.f259546s);
            case 10:
                je0.d dVarB3 = kVar.u.b();
                s.j(dVarB3);
                yk0.a aVarB2 = kVar.v.b();
                s.j(aVarB2);
                xe0.f fVarF2 = kVar.u.f();
                s.j(fVarF2);
                return s2l.c.t(dVarB3, aVarB2, fVarF2);
            case 11:
                s70.a aVarM = kVar.f259532g.m();
                s.j(aVarM);
                y80.a aVarR = kVar.f259532g.r();
                s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 12:
                return new e4a.b((d4a.b) kVar.f259549t0.get());
            case 13:
                mk0.a aVarA3 = kVar.G.a();
                s.j(aVarA3);
                return new d4a.b(aVarA3, new b4a.a());
            case 14:
                cl3.a aVarD3 = kVar.f259525a.d();
                s.j(aVarD3);
                ang.f fVarE2 = kVar.f.e();
                mk0.a aVarA4 = kVar.G.a();
                s.j(aVarA4);
                sl3.q qVar = (sl3.q) kVar.f259525a.v.get();
                s.j(qVar);
                return new t3a.f(aVarD3, fVarE2, aVarA4, qVar);
            case 15:
                return ((s41.a) kVar.L).d();
            case 16:
                return new o4a.h(new ne0.d());
            case 17:
                s70.a aVarM2 = kVar.f259532g.m();
                s.j(aVarM2);
                y80.a aVarR2 = kVar.f259532g.r();
                s.j(aVarR2);
                return new n3a.b(aVarM2, aVarR2);
            case 18:
                k3a.a aVar3 = (k3a.a) kVar.z0.get();
                m3j.n nVarI = ((p) kVar.f259527b).i();
                aqa.c cVarC = ((jqa.p) kVar.f259529c).c();
                s.j(cVarC);
                dl3.f fVarC2 = kVar.f259525a.c();
                s.j(fVarC2);
                nq9.b bVarB2 = kVar.W.b();
                s.j(bVarB2);
                io5.b bVarA = ((w) kVar.e).a();
                s.j(bVarA);
                fa6.a aVarD4 = kVar.f259533h.d();
                s.j(aVarD4);
                lx1.i iVarD = ((ey1.e) kVar.i).d();
                s.j(iVarD);
                tn9.a aVarC = kVar.f259537l.c();
                s.j(aVarC);
                return new l3a.i(aVar3, nVarI, cVarC, fVarC2, bVarB2, bVarA, aVarD4, iVarD, aVarC, new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a());
            case 19:
                m3j.n nVarI2 = ((p) kVar.f259527b).i();
                aqa.c cVarC2 = ((jqa.p) kVar.f259529c).c();
                s.j(cVarC2);
                dl3.f fVarC3 = kVar.f259525a.c();
                s.j(fVarC3);
                nq9.b bVarB3 = kVar.W.b();
                s.j(bVarB3);
                io5.b bVarA2 = ((w) kVar.e).a();
                s.j(bVarA2);
                fa6.a aVarD5 = kVar.f259533h.d();
                s.j(aVarD5);
                lx1.i iVarD2 = ((ey1.e) kVar.i).d();
                s.j(iVarD2);
                tn9.a aVarC2 = kVar.f259537l.c();
                s.j(aVarC2);
                return new k3a.c(cVarC2, fVarC3, aVarD5, bVarA2, iVarD2, nVarI2, bVarB3, aVarC2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        s3a.p pVar = (s3a.p) this.f251552c;
        a31.a aVar = pVar.H;
        a31.a aVar2 = pVar.f259608x;
        a31.a aVar3 = pVar.U;
        a31.a aVar4 = pVar.W;
        a31.a aVar5 = pVar.N;
        a31.a aVar6 = pVar.f259607w;
        a31.a aVar7 = pVar.K;
        a31.a aVar8 = pVar.J;
        a31.a aVar9 = pVar.I;
        a31.a aVar10 = pVar.G;
        a31.a aVar11 = pVar.E;
        a31.a aVar12 = pVar.A;
        a31.a aVar13 = pVar.z;
        a31.a aVar14 = pVar.f259605t;
        a31.a aVar15 = pVar.u;
        a31.a aVar16 = pVar.f259595m;
        a31.a aVar17 = pVar.i;
        a31.a aVar18 = pVar.f259594l;
        a31.a aVar19 = pVar.f;
        a31.a aVar20 = pVar.d;
        ecm.q qVar = pVar.f259582a;
        a31.a aVar21 = pVar.D;
        int i = this.f251551b;
        if (i == 0) {
            return new s3a.s(qVar, pVar.f259584b, pVar.f259586c, aVar20, pVar.e, aVar19, pVar.f259589g, pVar.f259590h, aVar17, pVar.f259592j, pVar.k, aVar18, aVar16, pVar.f259596n, pVar.o, pVar.f259599p, pVar.f259600q, pVar.f259601r, pVar.f259603s, aVar14, aVar15, pVar.v, aVar6, aVar2, pVar.f259609y, aVar13, aVar12, pVar.B, pVar.C, aVar21, aVar11, pVar.F, aVar10, aVar, aVar9, aVar8, aVar7, pVar.L, pVar.M, aVar5, pVar.O, pVar.P, pVar.Q, pVar.R, pVar.S, pVar.T, aVar3, pVar.V, aVar4, pVar.X, pVar.Y, pVar.Z, pVar.f259583a0, pVar.f259585b0, pVar.c0, pVar.f259587d0, pVar.f259588e0, pVar.f0, pVar.g0);
        }
        if (i == 1) {
            return new fy9.c(qVar, aVar2, aVar21, aVar, pVar.f259591h0, 12);
        }
        if (i == 2) {
            return u.d(qVar, aVar3, pVar.i0, pVar.f259602r0);
        }
        if (i == 3) {
            return s2l.c.z((s3a.s) pVar.p0.get());
        }
        if (i == 4) {
            return nga.c.i(aVar20, aVar19, pVar.j0, aVar18, aVar17, pVar.f259593k0, aVar16, aVar15, aVar14, aVar13, aVar12, aVar21, aVar11, aVar10, pVar.l0, aVar9, aVar8, pVar.m0, aVar7, aVar6, aVar5, pVar.f259602r0, pVar.f259597n0, pVar.f259598o0, aVar4);
        }
        throw new AssertionError(i);
    }

    private final Object c() {
        s7l.a aVar = (s7l.a) this.f251552c;
        ee0.a aVar2 = aVar.f260866b;
        loj.a aVar3 = aVar.f260865a;
        int i = this.f251551b;
        if (i == 0) {
            ImmutableSet immutableSetOf = ImmutableSet.of((q7l.b) aVar3.f197458g.get(), (q7l.b) aVar3.f197459h.get(), (q7l.b) aVar3.i.get(), (q7l.b) aVar3.f197460j.get(), (q7l.b) aVar3.k.get(), (q7l.b) aVar3.f197461l.get(), (q7l.b) aVar3.f197462m.get());
            s.j(immutableSetOf);
            q7l.b bVar = (q7l.b) aVar3.f.get();
            s.j(bVar);
            v7l.e eVar = (v7l.e) aVar.f.get();
            moj.b bVar2 = (moj.b) aVar3.f197463n.get();
            s.j(bVar2);
            return new u7l.c(immutableSetOf, bVar, eVar, bVar2);
        }
        if (i == 1) {
            return new v7l.e((j) aVar.e.get(), (ue0.c) aVar.d.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        je0.d dVarB = aVar2.b();
        s.j(dVarB);
        yk0.a aVarB = aVar.f260867c.b();
        s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        s.j(fVarF);
        return s2l.c.l(dVarB, fVarF, aVarB);
    }

    private final Object d() {
        se8.a aVar = (se8.a) this.f251552c;
        int i = this.f251551b;
        switch (i) {
            case 0:
                return new te8.e(aVar.f262144a.e(), (ff8.a) aVar.f262154q.get());
            case 1:
                return new ff8.d((JuniorAccountService) aVar.f262152n.get(), (j) aVar.o.get(), (ue0.c) aVar.f262153p.get());
            case 2:
                se8.b bVar = aVar.f262145b;
                JuniorAccountService juniorAccountService = (JuniorAccountService) a0.d.f((nj0.d) aVar.f262146c, "retrofit", JuniorAccountService.class, "create(...)");
                s.k(juniorAccountService);
                return juniorAccountService;
            case 3:
                return new ne0.d();
            case 4:
                je0.d mapper = aVar.d.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = aVar.e.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar.d.f();
                s.j(storageFactory);
                se8.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                int i2 = 16;
                int i3 = 1;
                return xe0.f.f(storageFactory, databaseSessionProvider, "junior_core", mapper, 17, zhm.v.k(new gf8.f(), new g(), new gf8.h(), new gf8.i(), new gf8.j(), new gf8.k(), new l(), new gf8.m(), new gf8.n(), new gf8.a(), new gf8.b(), new gf8.c(), new gf8.d(), new gf8.e(), new ei7.a(15, i2, i3), new ei7.a(i2, 17, i3)), 32);
            case 5:
                t tVarF = aVar.f.f();
                s.j(tVarF);
                return new z(tVarF, aVar.f262144a.e(), (ff8.j) aVar.f262156s.get());
            case 6:
                return new ff8.o((JuniorAccountService) aVar.f262152n.get(), (j) aVar.o.get(), (ue0.c) aVar.f262153p.get());
            case 7:
                return new te8.v((z) aVar.f262157t.get());
            case 8:
                return new r((z) aVar.f262157t.get());
            case 9:
                return new ff8.i((JuniorAccountService) aVar.f262152n.get(), (j) aVar.o.get(), (ue0.c) aVar.f262153p.get(), (f01.a) aVar.f262158w.get());
            case 10:
                se8.e eVar = aVar.f262147g;
                z70.a aVarF = aVar.f262148h.f();
                s.j(aVarF);
                return s2l.c.w(eVar, aVarF);
            case 11:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar.f262149j).c();
                s.j(aVarC);
                return new a0(aVarC, aVar.k.b());
            case 12:
                return new c0((z) aVar.f262157t.get());
            case 13:
                return new te8.d0(aVar.k.b());
            case 14:
                return new ue8.d();
            case 15:
                l80.e eVarH = aVar.f262148h.h();
                s.j(eVarH);
                return new if8.a(eVarH);
            case 16:
                return new re8.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        sfg.b bVar = (sfg.b) this.f251552c;
        a31.a aVar = bVar.f262467n;
        int i = this.f251551b;
        if (i == 0) {
            return p0.e(bVar.f262460b, bVar.f262461c, bVar.d, bVar.e, bVar.f, bVar.f262462g, bVar.f262463h, bVar.i, bVar.f262464j, bVar.k, bVar.f262465l, bVar.f262466m, aVar, bVar.o, bVar.f262468p, bVar.f262469q, bVar.f262470r, bVar.f262471s, bVar.f262472t, bVar.u, bVar.v, bVar.f262473w, bVar.f262474x, bVar.f262475y, bVar.z, bVar.A, bVar.f262459a);
        }
        if (i == 1) {
            return p0.c(aVar);
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        sg8.c cVar = (sg8.c) this.f251552c;
        ee0.a aVar = cVar.d;
        int i = this.f251551b;
        if (i == 0) {
            return new pg8.b(ImmutableSet.of(new qg8.a()));
        }
        if (i == 1) {
            JuniorGraduationService juniorGraduationServiceI = sg8.j.i(((nj0.d) cVar.f262607b).f());
            sf0.h hVarB = cVar.f262608c.b();
            s.j(hVarB);
            return new xg8.j(juniorGraduationServiceI, hVarB, (j) cVar.f262616q.get(), (ue0.c) cVar.f262617r.get(), (kg.o) cVar.f262618s.get());
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            if (i == 4) {
                return sg8.i.a();
            }
            throw new AssertionError(i);
        }
        je0.d dVarB = aVar.b();
        s.j(dVarB);
        yk0.a aVarB = cVar.e.b();
        s.j(aVarB);
        xe0.f fVarF = aVar.f();
        s.j(fVarF);
        return sg8.j.j(dVarB, fVarF, aVarB);
    }

    private final Object g() {
        shi.b bVar = (shi.b) this.f251552c;
        ee0.a aVar = bVar.f263490c;
        int i = this.f251551b;
        if (i == 0) {
            phi.a dependency = bVar.f263488a;
            CoroutineScope scope = (CoroutineScope) bVar.d.get();
            ue0.c storage = (ue0.c) bVar.e.get();
            fd0.d cache = (fd0.d) bVar.f.get();
            shi.h.Companion.getClass();
            Intrinsics.checkNotNullParameter(dependency, "dependency");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(cache, "cache");
            return new yii.c(scope, new yii.e(j6.a.q("1030151101_", ((yoi.b) dependency).a()), storage), cache);
        }
        if (i == 1) {
            shi.h.Companion.getClass();
            return rd0.e.a(skm.p0.f264003c);
        }
        if (i != 2) {
            if (i == 3) {
                shi.h.Companion.getClass();
                return new fd0.d(16);
            }
            if (i == 4) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        yk0.a databaseSessionProvider = bVar.f263489b.b();
        s.j(databaseSessionProvider);
        ke0.d parcelableObjectMapperFactory = (ke0.d) aVar.e.get();
        s.j(parcelableObjectMapperFactory);
        ke0.b compositeBinaryObjectMapperFactory = (ke0.b) aVar.f.get();
        s.j(compositeBinaryObjectMapperFactory);
        ke0.f primitiveBinaryObjectMapperFactory = (ke0.f) aVar.f125050g.get();
        s.j(primitiveBinaryObjectMapperFactory);
        xe0.f storageFactory = aVar.f();
        s.j(storageFactory);
        shi.h.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(parcelableObjectMapperFactory, "parcelableObjectMapperFactory");
        Intrinsics.checkNotNullParameter(compositeBinaryObjectMapperFactory, "compositeBinaryObjectMapperFactory");
        Intrinsics.checkNotNullParameter(primitiveBinaryObjectMapperFactory, "primitiveBinaryObjectMapperFactory");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        List mappers = zhm.v.k(new ke0.c(), new ke0.e());
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        return xe0.f.a(storageFactory, databaseSessionProvider, "KOMPOT_DOMAIN_STATE_STORAGE", new ke0.a(mappers));
    }

    private final Object h() {
        ske.a aVar = (ske.a) this.f251552c;
        h9h.a aVar2 = aVar.f263839a;
        int i = this.f251551b;
        if (i == 0) {
            ybl.l lVarF = aVar2.f();
            tzg.h hVarJ = aVar2.j();
            s.j(hVarJ);
            return new zke.c(lVarF, hVarJ);
        }
        if (i == 1) {
            tzg.h hVarJ2 = aVar2.j();
            s.j(hVarJ2);
            return new zke.d(hVarJ2);
        }
        if (i == 2) {
            tzg.h hVarJ3 = aVar2.j();
            s.j(hVarJ3);
            return new zke.b(hVarJ3);
        }
        if (i != 3) {
            if (i == 4) {
                return new ale.b(aVar.f263840b.a());
            }
            throw new AssertionError(i);
        }
        ale.f fVar = new ale.f();
        tzg.h hVarJ4 = aVar2.j();
        s.j(hVarJ4);
        return new zke.a(fVar, hVarJ4);
    }

    @Override // phm.a
    public final Object get() {
        Object jVar;
        Object hVar;
        Object dVar;
        Object aVar;
        Object dVar2;
        Object aVar2;
        Object e3Var;
        switch (this.f251550a) {
            case 0:
                c cVar = (c) this.f251552c;
                int i = this.f251551b;
                if (i != 0) {
                    if (i == 1) {
                        return new r3a.b();
                    }
                    throw new AssertionError(i);
                }
                c9e.c cVarB = cVar.f251553a.b();
                s.j(cVarB);
                p7k.b bVar = new p7k.b();
                y8k.c cVarB2 = cVar.f251554b.b();
                kz9.a aVarA = cVar.f251555c.a();
                s.j(aVarA);
                return new v3a.b(cVarB, bVar, cVarB2, aVarA);
            case 1:
                r6e.o oVar = (r6e.o) this.f251552c;
                r6e.a0 a0Var = oVar.f251773c;
                int i2 = this.f251551b;
                if (i2 == 0) {
                    sri.m mVarD = ((g8b.a) oVar.f251771a).d();
                    s.j(mVarD);
                    g6e.g gVar = (g6e.g) oVar.L.get();
                    g6e.d dVarB = a0Var.b();
                    s.j(dVarB);
                    ang.f fVarE = oVar.f.e();
                    gte.a aVarB = oVar.f251774g.b();
                    s.j(aVarB);
                    jVar = new v6e.j(mVarD, gVar, dVarB, fVarE, aVarB);
                } else {
                    if (i2 == 1) {
                        r0 r0VarA = oVar.f251772b.a();
                        g6e.d dVarB2 = a0Var.b();
                        s.j(dVarB2);
                        g48.r0 r0VarC = oVar.d.c();
                        o38.a aVarC = oVar.e.c();
                        s.j(aVarC);
                        return new v6e.r(r0VarA, dVarB2, r0VarC, aVarC, new v8i.c(), new w38.t());
                    }
                    if (i2 == 2) {
                        return new v6e.a();
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new AssertionError(i2);
                        }
                        mae.p pVarE = oVar.f251787y.e();
                        s.j(pVarE);
                        f01.c cVarG = oVar.f251785w.g();
                        t70.b bVarG = oVar.o.g();
                        s.j(bVarG);
                        return u.g(pVarE, cVarG, bVarG);
                    }
                    iva.a aVarA2 = oVar.f251786x.a();
                    s.j(aVarA2);
                    v6e.s sVar = new v6e.s(aVarA2);
                    g6e.d dVarB3 = a0Var.b();
                    s.j(dVarB3);
                    jVar = new e7e.b(sVar, dVarB3);
                }
                return jVar;
            case 2:
                r79.a aVar3 = (r79.a) this.f251552c;
                int i3 = this.f251551b;
                if (i3 == 0) {
                    return s2l.c.c(aVar3.f252050b, aVar3.f252049a);
                }
                if (i3 == 1) {
                    return t2d.c.f(u.B(aVar3.d));
                }
                if (i3 == 2) {
                    return u.A((s79.c) aVar3.f252051c.get());
                }
                throw new AssertionError(i3);
            case 3:
                r8h.c cVar2 = (r8h.c) this.f251552c;
                a31.a aVar4 = cVar2.e;
                int i5 = this.f251551b;
                if (i5 == 0) {
                    return new u8h.d(cVar2.f252433a, cVar2.f252434b, cVar2.f252435c, cVar2.d, aVar4, cVar2.f, cVar2.f252436g, cVar2.f252437h, cVar2.i);
                }
                if (i5 == 1) {
                    return p7h.b.b(aVar4, cVar2.f252438j, cVar2.f252439l);
                }
                if (i5 == 2) {
                    return u.D((u8h.d) cVar2.k.get());
                }
                throw new AssertionError(i5);
            case 4:
                r8h.d dVar3 = (r8h.d) this.f251552c;
                int i6 = this.f251551b;
                switch (i6) {
                    case 0:
                        hVar = new h9h.h(dVar3.f252443b, dVar3.f252444c, dVar3.d, dVar3.e, dVar3.f, dVar3.f252445g, dVar3.f252446h, dVar3.i, dVar3.f252447j, dVar3.k, dVar3.f252448l, dVar3.f252449m, dVar3.f252450n, dVar3.o, dVar3.f252451p, dVar3.f252452q, dVar3.f252453r, dVar3.f252454s, dVar3.f252455t, dVar3.u, dVar3.v, dVar3.f252456w, dVar3.f252457x, dVar3.f252458y, dVar3.z, dVar3.A, dVar3.B, dVar3.f252441a);
                        break;
                    case 1:
                        return new yah.b(dVar3.f252441a, dVar3.Q);
                    case 2:
                        h9h.a aVar5 = (h9h.a) ((h9h.h) dVar3.P.get()).b();
                        s.k(aVar5);
                        return aVar5;
                    case 3:
                        hVar = new ibh.c(dVar3.S, dVar3.Q, dVar3.i);
                        break;
                    case 4:
                        yah.a aVar6 = (yah.a) ((yah.b) dVar3.R.get()).b();
                        s.k(aVar6);
                        return aVar6;
                    case 5:
                        return p7h.b.c(dVar3.C, dVar3.Q);
                    case 6:
                        return new jza.c(dVar3.Q, 1);
                    case 7:
                        return f1.c(dVar3.f252444c, dVar3.D, dVar3.E, dVar3.f252447j, dVar3.Q, dVar3.F, dVar3.S, dVar3.W, dVar3.G, dVar3.H, dVar3.I, dVar3.J, dVar3.K, dVar3.f252450n, dVar3.f252458y, dVar3.z, dVar3.C, dVar3.d, dVar3.L, dVar3.M, dVar3.f252456w, dVar3.i);
                    case 8:
                        return u.z((ibh.c) dVar3.T.get());
                    case 9:
                        return w40.c.c(dVar3.i, dVar3.Q);
                    case 10:
                        return trl.f.a(dVar3.f252447j, dVar3.f252457x, dVar3.Q);
                    case 11:
                        return xhi.f.b(dVar3.Q, dVar3.N, dVar3.O, dVar3.f252447j, dVar3.f252457x);
                    default:
                        throw new AssertionError(i6);
                }
                return hVar;
            case 5:
                r9j.a aVar7 = (r9j.a) this.f251552c;
                mwh.a aVar8 = aVar7.f252735b;
                l70.e eVar = aVar7.f252734a;
                int i21 = this.f251551b;
                if (i21 == 0) {
                    u9j.a aVar9 = (u9j.a) aVar7.d.get();
                    nwh.b bVarA = aVar8.a();
                    u80.t tVarU = eVar.u();
                    s.j(tVarU);
                    l80.e eVarH = eVar.h();
                    s.j(eVarH);
                    return new u9j.e(aVar9, bVarA, tVarU, eVarH, (s9j.a) aVar7.e.get());
                }
                if (i21 == 1) {
                    u9j.g gVar2 = (u9j.g) aVar7.f252736c.get();
                    l80.e eVarH2 = eVar.h();
                    s.j(eVarH2);
                    return new u9j.d(gVar2, eVarH2);
                }
                if (i21 != 2) {
                    if (i21 == 3) {
                        return new s9j.b(aVar8.a());
                    }
                    throw new AssertionError(i21);
                }
                l80.e eVarH3 = eVar.h();
                s.j(eVarH3);
                return new u9j.i(eVarH3);
            case 6:
                rb8.a aVar10 = (rb8.a) this.f251552c;
                ee0.a aVar11 = aVar10.f252974a;
                int i22 = this.f251551b;
                if (i22 == 0) {
                    ue0.c cVar3 = (ue0.c) aVar10.f252982n.get();
                    j jVar2 = (j) aVar10.o.get();
                    rb8.f fVar = aVar10.f252976c;
                    nj0.d dVar4 = (nj0.d) aVar10.d;
                    ik0.b bVarM = dVar4.m();
                    s.j(bVarM);
                    return new zb8.b(cVar3, jVar2, rb8.g.a(fVar, bVarM, dVar4.d()));
                }
                if (i22 != 1) {
                    if (i22 == 2) {
                        return new ne0.d();
                    }
                    if (i22 == 3) {
                        return new sb8.a();
                    }
                    if (i22 == 4) {
                        return new ob8.a((sb8.a) aVar10.f252984q.get(), new yb8.a());
                    }
                    throw new AssertionError(i22);
                }
                je0.d dVarD = aVar11.d();
                s.j(dVarD);
                yk0.a aVarB2 = aVar10.f252975b.b();
                s.j(aVarB2);
                xe0.f fVarF = aVar11.f();
                s.j(fVarF);
                return u.f(dVarD, fVarF, aVarB2);
            case 7:
                rd5.c cVar4 = (rd5.c) this.f251552c;
                c21.e eVar2 = cVar4.f253342a;
                ee0.a aVar12 = cVar4.f253343b;
                int i32 = this.f251551b;
                switch (i32) {
                    case 0:
                        return new sd5.c((wd5.d) cVar4.i.get());
                    case 1:
                        return new wd5.d((CryptoConfigService) cVar4.f.get(), (j) cVar4.f253345g.get(), (ue0.c) cVar4.f253346h.get());
                    case 2:
                        Retrofit retrofit = (Retrofit) cVar4.e.get();
                        rd5.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(CryptoConfigService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        CryptoConfigService cryptoConfigService = (CryptoConfigService) objCreate;
                        s.k(cryptoConfigService);
                        return cryptoConfigService;
                    case 3:
                        Retrofit retrofit3 = ((c21.b) eVar2).i();
                        s.j(retrofit3);
                        kg.o gson = (kg.o) cVar4.d.get();
                        rd5.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        return j6.a.B(retrofit3.newBuilder(), gson, "build(...)");
                    case 4:
                        kg.o oVarH = ((c21.b) eVar2).h();
                        s.j(oVarH);
                        return oVarH;
                    case 5:
                        return new ne0.d();
                    case 6:
                        je0.d mapper = aVar12.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = cVar4.f253344c.b();
                        s.j(databaseSessionProvider);
                        xe0.f storageFactory = aVar12.f();
                        s.j(storageFactory);
                        rd5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        int i33 = 2;
                        int i43 = 3;
                        int i59 = 4;
                        int i66 = 5;
                        return xe0.f.f(storageFactory, databaseSessionProvider, "feature_crypto_config", mapper, 6, zhm.v.k(new exa.a(1, i33, 6), new exa.a(i33, i43, 6), new exa.a(i43, i59, 6), new exa.a(i59, i66, 6), new exa.a(i66, 6, 6)), 32);
                    case 7:
                        return new sd5.b((sd5.c) cVar4.f253347j.get());
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                rda.a aVar13 = (rda.a) this.f251552c;
                a31.a aVar14 = aVar13.E;
                a31.a aVar15 = aVar13.D;
                a31.a aVar16 = aVar13.o;
                a31.a aVar17 = aVar13.f253382n;
                a31.a aVar18 = aVar13.v;
                a31.a aVar19 = aVar13.f253381m;
                a31.a aVar20 = aVar13.f253385r;
                a31.a aVar21 = aVar13.f253380l;
                a31.a aVar22 = aVar13.f253377g;
                a31.a aVar23 = aVar13.e;
                ecm.q qVar = aVar13.f253374a;
                int i74 = this.f251551b;
                if (i74 == 0) {
                    return obk.d.a(qVar, aVar13.f253375b, aVar13.f253376c, aVar13.d, aVar23, aVar13.f, aVar22, aVar13.f253378h, aVar13.i, aVar13.f253379j, aVar13.k, aVar21, aVar19, aVar17, aVar16, aVar13.f253383p, aVar13.f253384q, aVar20, aVar13.f253386s, aVar13.f253387t, aVar13.u, aVar18, aVar13.f253388w, aVar13.f253389x, aVar13.f253390y, aVar13.z, aVar13.R, aVar13.F, aVar14, aVar13.G, aVar13.H, aVar13.I, aVar13.J, aVar13.K, aVar15, aVar13.L, aVar13.M, aVar13.N, aVar13.O, aVar13.P);
                }
                if (i74 == 1) {
                    return u.C((oda.u) aVar13.Q.get());
                }
                if (i74 == 2) {
                    return new oda.u(aVar13.A, aVar23, aVar22, aVar21, aVar13.B, aVar20, aVar13.C, aVar19, aVar18, aVar17, aVar16, aVar15, aVar14, qVar);
                }
                throw new AssertionError(i74);
            case 9:
                rfc.a aVar24 = (rfc.a) this.f251552c;
                vs6.a aVar25 = aVar24.f253754c;
                int i92 = this.f251551b;
                if (i92 == 0) {
                    jf1.a aVarA3 = aVar24.f253752a.a();
                    s.j(aVarA3);
                    return new sfc.f(aVarA3);
                }
                if (i92 == 1) {
                    return new CatalogueDataProviderImpl((CatalogueService) aVar24.f253755g.get());
                }
                if (i92 == 2) {
                    Retrofit retrofitI = ((c21.b) aVar24.f253753b).i();
                    s.j(retrofitI);
                    return u.h(retrofitI);
                }
                if (i92 != 3) {
                    throw new AssertionError(i92);
                }
                gr6.a aVarA4 = aVar25.a();
                s.j(aVarA4);
                et6.h hVar2 = (et6.h) aVar25.f291729t.get();
                s.j(hVar2);
                gr6.m mVarB = aVar25.b();
                s.j(mVarB);
                gr6.i iVarA = aVar24.d.a();
                s.j(iVarA);
                return new sfc.e(aVarA4, hVar2, mVarB, iVarA, aVar24.e.b());
            case 10:
                int i96 = this.f251551b;
                if (i96 == 0) {
                    return rg0.c.a();
                }
                if (i96 == 1) {
                    return new og0.a((CoroutineScope) ((rg0.e) this.f251552c).f253996a.get());
                }
                throw new AssertionError(i96);
            case 11:
                rhi.a aVar26 = (rhi.a) this.f251552c;
                int i99 = this.f251551b;
                if (i99 == 0) {
                    dVar = new shi.d(aVar26.f254484c, aVar26.f254482a, aVar26.f254483b);
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new AssertionError(i99);
                        }
                        shi.a aVar27 = (shi.a) ((shi.d) aVar26.o.get()).b();
                        s.k(aVar27);
                        return aVar27;
                    }
                    dVar = new db5.a(aVar26.d, aVar26.e, aVar26.f, 10);
                }
                return dVar;
            case 12:
                rk0.c cVar5 = (rk0.c) this.f251552c;
                ee0.a aVar28 = cVar5.f254714c;
                int i100 = this.f251551b;
                if (i100 == 0) {
                    d4m.a aVarA5 = e4m.b.a(cVar5.f);
                    ue0.c cVar6 = (ue0.c) cVar5.f254715g.get();
                    j jVar3 = (j) cVar5.f254716h.get();
                    CoroutineScope coroutineScopeA = cVar5.d.a();
                    s.j(coroutineScopeA);
                    l80.e eVarH4 = cVar5.e.h();
                    s.j(eVarH4);
                    return new mk0.o(aVarA5, cVar6, jVar3, coroutineScopeA, eVarH4);
                }
                if (i100 == 1) {
                    Retrofit retrofitA = ((ml0.c) cVar5.f254712a).a();
                    s.j(retrofitA);
                    return rga.l.u(retrofitA);
                }
                if (i100 != 2) {
                    if (i100 != 3) {
                        throw new AssertionError(i100);
                    }
                    rk0.b.Companion.getClass();
                    return new ne0.d();
                }
                yk0.a databaseSessionProvider2 = cVar5.f254713b.b();
                s.j(databaseSessionProvider2);
                je0.d mapper2 = aVar28.d();
                s.j(mapper2);
                xe0.f storageFactory2 = aVar28.f();
                s.j(storageFactory2);
                rk0.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider2, "core_personalisation_storage", mapper2, 1, null, 48);
            case 13:
                rkd.g gVar3 = (rkd.g) this.f251552c;
                int i101 = this.f251551b;
                switch (i101) {
                    case 0:
                        e eVar3 = gVar3.o;
                        wqb.a aVar29 = gVar3.f254800a;
                        SlotManagerService slotManagerService = (SlotManagerService) eVar3.get();
                        ald.h hVar3 = (ald.h) gVar3.f254811r.get();
                        j jVar4 = (j) gVar3.f254812s.get();
                        ue0.c cVar7 = (ue0.c) gVar3.f254813t.get();
                        aVar29.c();
                        yqb.b bVarJ = aVar29.j();
                        yqb.a aVarI = aVar29.i();
                        Optional optionalH = aVar29.h();
                        s.j(optionalH);
                        ze0.a aVarA6 = gVar3.f254801b.a();
                        s.j(aVarA6);
                        return new ald.r(slotManagerService, hVar3, jVar4, cVar7, bVarJ, aVarI, optionalH, aVarA6);
                    case 1:
                        aVar = new ykd.a((SlotManagerService) gVar3.f254807m.get(), (SlotManagerService) gVar3.f254808n.get(), gVar3.f254800a.a());
                        break;
                    case 2:
                        return rga.l.s(gVar3.f254800a.g(), fe0.d.a());
                    case 3:
                        return rga.l.t(gVar3.f254800a.e(), fe0.d.a());
                    case 4:
                        SlotManagerService slotManagerService2 = (SlotManagerService) gVar3.o.get();
                        okd.b bVar2 = (okd.b) gVar3.f254810q.get();
                        b80.c cVarP = gVar3.f.p();
                        s.j(cVarP);
                        gVar3.f254800a.c();
                        CoroutineScope coroutineScopeA2 = gVar3.f254803g.a();
                        s.j(coroutineScopeA2);
                        aVar = new ald.h(slotManagerService2, bVar2, cVarP, coroutineScopeA2);
                        break;
                    case 5:
                        SlotManagerDatabase database = (SlotManagerDatabase) gVar3.f254809p.get();
                        rkd.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        okd.b bVarG2 = database.g();
                        s.k(bVarG2);
                        return bVarG2;
                    case 6:
                        Context context = gVar3.f254802c;
                        yk0.a databaseSessionProvider3 = gVar3.d.b();
                        s.j(databaseSessionProvider3);
                        de0.a databaseEncryptionMigratorFactory = ((cl0.a) gVar3.e).a();
                        s.j(databaseEncryptionMigratorFactory);
                        rkd.l.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        SlotManagerDatabase.Companion aVar30 = SlotManagerDatabase.INSTANCE;
                        aVar30.getClass();
                        SlotManagerDatabase slotManagerDatabase = (SlotManagerDatabase) aVar30.a(context, databaseSessionProvider3, SlotManagerDatabase.f, databaseEncryptionMigratorFactory);
                        s.k(slotManagerDatabase);
                        return slotManagerDatabase;
                    case 7:
                        return new ne0.d();
                    case 8:
                        je0.d dVarD2 = gVar3.f254801b.d();
                        s.j(dVarD2);
                        yk0.a aVarB3 = gVar3.d.b();
                        s.j(aVarB3);
                        xe0.f fVarF2 = gVar3.f254801b.f();
                        s.j(fVarF2);
                        return rga.l.v(dVarD2, fVarF2, aVarB3);
                    case 9:
                        SlotManagerService slotManagerService3 = (SlotManagerService) gVar3.o.get();
                        j jVar5 = (j) gVar3.f254812s.get();
                        ue0.c cVar8 = (ue0.c) gVar3.v.get();
                        gVar3.f254800a.c();
                        aVar = new ald.a(slotManagerService3, jVar5, cVar8);
                        break;
                    case 10:
                        je0.d dVarD3 = gVar3.f254801b.d();
                        s.j(dVarD3);
                        yk0.a aVarB4 = gVar3.d.b();
                        s.j(aVarB4);
                        xe0.f fVarF3 = gVar3.f254801b.f();
                        s.j(fVarF3);
                        return rga.l.n(dVarD3, fVarF3, aVarB4);
                    case 11:
                        return new skd.j();
                    case 12:
                        return new xkd.a();
                    case 13:
                        return rga.l.o((rkd.c) gVar3.E.get(), (rkd.d) gVar3.F.get());
                    case 14:
                        return new rkd.c(this);
                    case 15:
                        aVar = new fld.d(gVar3.f254800a.d());
                        break;
                    case 16:
                        return rga.l.y(gVar3.f254802c);
                    case 17:
                        l80.e eVarH5 = gVar3.f.h();
                        s.j(eVarH5);
                        aVar = new com.revolut.feature.slot_manager.impl.ui.screen.checklist.b(eVarH5);
                        break;
                    case 18:
                        dp6.a aVarB5 = gVar3.i.b();
                        s.j(aVarB5);
                        twg.c cVarB3 = gVar3.b();
                        x xVarD = ((s41.a) gVar3.f254804h).d();
                        CoroutineScope coroutineScopeA3 = gVar3.f254803g.a();
                        s.j(coroutineScopeA3);
                        aVar = new bld.m(aVarB5, cVarB3, xVarD, coroutineScopeA3);
                        break;
                    case 19:
                        dp6.a aVarB6 = gVar3.i.b();
                        s.j(aVarB6);
                        aVar = new jld.k(aVarB6, gVar3.c());
                        break;
                    case 20:
                        return new rkd.d(this);
                    case 21:
                        return rga.l.p((rkd.c) gVar3.E.get(), (rkd.e) gVar3.H.get());
                    case 22:
                        return new rkd.e(this);
                    case 23:
                        aVar = new kld.a((rkd.f) gVar3.J.get());
                        break;
                    case 24:
                        return new rkd.f(this);
                    case 25:
                        skd.j jVar6 = (skd.j) gVar3.f254815x.get();
                        asi.d dVarC = ((j51.a) gVar3.k).c();
                        s.j(dVarC);
                        aVar = new zkd.b(jVar6, dVarC);
                        break;
                    case 26:
                        return new rld.a();
                    case 27:
                        return rga.l.x(gVar3.f254802c);
                    default:
                        throw new AssertionError(i101);
                }
                return aVar;
            case 14:
                rxa.a aVar31 = (rxa.a) this.f251552c;
                int i102 = this.f251551b;
                switch (i102) {
                    case 0:
                        xxa.a aVar32 = (xxa.a) aVar31.f258098p.get();
                        vxa.d dVar5 = (vxa.d) aVar31.f258099q.get();
                        vxa.e eVar4 = (vxa.e) aVar31.f258100r.get();
                        toa.a aVarA7 = aVar31.i.a();
                        s.j(aVarA7);
                        fk3.a aVarA8 = aVar31.f258094j.a();
                        s.j(aVarA8);
                        vxa.a aVar33 = new vxa.a(aVarA8);
                        vxa.b bVar3 = (vxa.b) aVar31.f258101s.get();
                        vxa.c cVar9 = (vxa.c) aVar31.f258102t.get();
                        xoj.a aVarA9 = aVar31.k.a();
                        s.j(aVarA9);
                        return new uxa.b(aVar32, dVar5, eVar4, aVarA7, aVar33, bVar3, cVar9, aVarA9);
                    case 1:
                        dVar2 = new xxa.d((ReferralsInvitationService) aVar31.f258095l.get(), (sxa.d) aVar31.f258097n.get(), (ue0.c) aVar31.o.get());
                        break;
                    case 2:
                        return trl.f.D(((nj0.d) aVar31.f258089a).f());
                    case 3:
                        return trl.f.t((ReferralsInvitationDatabase) aVar31.f258096m.get());
                    case 4:
                        Context context2 = aVar31.f258090b;
                        yk0.a aVarB7 = aVar31.f258091c.b();
                        s.j(aVarB7);
                        return trl.f.l(context2, aVarB7, ((c21.b) aVar31.d).b());
                    case 5:
                        je0.d dVarB4 = aVar31.e.b();
                        s.j(dVarB4);
                        yk0.a aVarB8 = aVar31.f258091c.b();
                        s.j(aVarB8);
                        xe0.f fVarF4 = aVar31.e.f();
                        s.j(fVarF4);
                        return trl.f.u(dVarB4, fVarF4, aVarB8);
                    case 6:
                        t2j.a aVar34 = aVar31.f;
                        c3j.c cVar10 = new c3j.c();
                        cl3.a aVarD = aVar31.f258092g.d();
                        s.j(aVarD);
                        dVar2 = new vxa.d(cVar10, aVarD, ((p) aVar31.f).e());
                        break;
                    case 7:
                        dVar2 = new vxa.e(aVar31.f258093h.e());
                        break;
                    case 8:
                        dVar2 = new vxa.b((xxa.a) aVar31.f258098p.get());
                        break;
                    case 9:
                        return new vxa.c();
                    case 10:
                        return new ne0.d();
                    default:
                        throw new AssertionError(i102);
                }
                return dVar2;
            case 15:
                rz5.a aVar35 = (rz5.a) this.f251552c;
                a31.a aVar36 = aVar35.f258510a;
                int i103 = this.f251551b;
                if (i103 == 0) {
                    return new bwj.b(aVar36, aVar35.f258511b, aVar35.f258512c, 10);
                }
                if (i103 == 1) {
                    return sg8.j.a(aVar36, aVar35.d, aVar35.e);
                }
                throw new AssertionError(i103);
            case 16:
                rza.b bVar4 = (rza.b) this.f251552c;
                int i104 = this.f251551b;
                switch (i104) {
                    case 0:
                        hri.b bVar5 = bVar4.f258543a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar6 = bVar4.f258543a;
                        return new iri.j();
                    case 2:
                        return new d4e.b();
                    case 3:
                        return new um.c();
                    case 4:
                        return new b0();
                    case 5:
                        return new cn.e();
                    case 6:
                        bVar4.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 7:
                        return new ln.c();
                    case 8:
                        return new ym.d();
                    case 9:
                        return new mm.d();
                    case 10:
                        return new sm.e();
                    case 11:
                        return new om.c();
                    case 12:
                        return new s3l.f();
                    case 13:
                        ifm.b bVar7 = (ifm.b) bVar4.i.get();
                        qza.g gVar4 = (qza.g) bVar4.f258550m.get();
                        x xVarD2 = ((s41.a) bVar4.f258545c).d();
                        qza.c cVar11 = (qza.c) bVar4.v.get();
                        kza.a aVar37 = (kza.a) ((jza.b) bVar4.d).o.get();
                        s.j(aVar37);
                        return new com.revolut.feature.remote_stories.impl.ui.b(bVar7, gVar4, xVarD2, cVar11, aVar37);
                    case 14:
                        jza.f fVar2 = bVar4.d;
                        l70.e eVar5 = bVar4.f258544b;
                        kza.b bVar8 = (kza.b) ((jza.b) fVar2).f179696p.get();
                        s.j(bVar8);
                        kza.a aVar38 = (kza.a) ((jza.b) bVar4.d).o.get();
                        s.j(aVar38);
                        qza.g gVar5 = (qza.g) bVar4.f258550m.get();
                        ln.a aVar39 = (ln.a) bVar4.f258552p.get();
                        c90.c cVarA = ((p41.b) bVar4.e).a();
                        s.j(cVarA);
                        qza.o oVar2 = new qza.o(cVarA);
                        f80.a aVarX = eVar5.x();
                        s.j(aVarX);
                        qza.d0 d0Var = new qza.d0(aVarX);
                        f80.a aVarX2 = eVar5.x();
                        s.j(aVarX2);
                        return new com.revolut.feature.remote_stories.impl.ui.a(bVar8, aVar38, gVar5, aVar39, oVar2, d0Var, aVarX2, new com.google.firebase.messaging.t((cn.e) bVar4.f258551n.get(), (ym.d) bVar4.f258553q.get(), (um.c) bVar4.f258549l.get(), (ifm.b) bVar4.i.get()));
                    case 15:
                        return new qza.a0((ln.a) bVar4.f258552p.get());
                    default:
                        throw new AssertionError(i104);
                }
            case 17:
                s13.d dVar6 = (s13.d) this.f251552c;
                ee0.a aVar40 = dVar6.f259057a;
                nj0.a aVar41 = dVar6.d;
                int i105 = this.f251551b;
                switch (i105) {
                    case 0:
                        je0.d mapper3 = aVar40.b();
                        s.j(mapper3);
                        yk0.a databaseSecurityProvider = dVar6.f259058b.b();
                        s.j(databaseSecurityProvider);
                        xe0.f storageFactory3 = aVar40.f();
                        s.j(storageFactory3);
                        s13.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, databaseSecurityProvider, "cards_delivery", mapper3, 0, null, 56);
                    case 1:
                        return new u13.g((DeliveryService) dVar6.f259061h.get(), new ne0.d(), (ue0.c) dVar6.f259060g.get());
                    case 2:
                        DeliveryService deliveryService = (DeliveryService) a0.d.f((nj0.d) aVar41, "retrofit", DeliveryService.class, "create(...)");
                        s.k(deliveryService);
                        return deliveryService;
                    case 3:
                        return new s33.e((PricingService) dVar6.f259062j.get(), new ne0.d());
                    case 4:
                        return rga.l.k(dVar6.f259059c, ((nj0.d) aVar41).f());
                    case 5:
                        j6l.b bVarD = dVar6.e.e.d();
                        s.j(bVarD);
                        return new t13.a(bVarD);
                    case 6:
                        return new o13.c((u13.g) dVar6.i.get());
                    default:
                        throw new AssertionError(i105);
                }
            case 18:
                s2l.a aVar42 = (s2l.a) this.f251552c;
                ite.a aVar43 = aVar42.f259390c;
                int i106 = this.f251551b;
                if (i106 == 0) {
                    WidgetService widgetServiceX = s2l.c.x(aVar42.f259388a, ((nj0.d) aVar42.f259389b).f());
                    gte.a aVarB9 = aVar43.b();
                    s.j(aVarB9);
                    return new q2l.c(widgetServiceX, aVarB9);
                }
                if (i106 != 1) {
                    throw new AssertionError(i106);
                }
                gte.a aVarB10 = aVar43.b();
                s.j(aVarB10);
                return new q2l.a(aVarB10);
            case 19:
                return a();
            case 20:
                return b();
            case 21:
                s53.c cVar12 = (s53.c) this.f251552c;
                ee0.a aVar44 = cVar12.f259911a;
                int i107 = this.f251551b;
                if (i107 == 0) {
                    je0.d dVarB5 = aVar44.b();
                    s.j(dVarB5);
                    xe0.f fVarF5 = aVar44.f();
                    s.j(fVarF5);
                    return s2l.c.s(dVarB5, fVarF5);
                }
                if (i107 == 1) {
                    aVar2 = new t53.a((xz5.a) cVar12.f.get());
                } else {
                    if (i107 != 2) {
                        if (i107 == 3) {
                            Retrofit retrofitI2 = ((c21.b) cVar12.f259912b).i();
                            s.j(retrofitI2);
                            return s2l.c.u(retrofitI2);
                        }
                        if (i107 == 4) {
                            return new ne0.d();
                        }
                        if (i107 == 5) {
                            return new t53.b();
                        }
                        throw new AssertionError(i107);
                    }
                    aVar2 = new q53.c((CardReaderTipsService) cVar12.d.get(), (j) cVar12.e.get(), (ue0.c) cVar12.f259913c.get());
                }
                return aVar2;
            case 22:
                return c();
            case 23:
                return d();
            case 24:
                sfg.a aVar45 = (sfg.a) this.f251552c;
                a31.a aVar46 = aVar45.f262456a;
                int i108 = this.f251551b;
                if (i108 == 0) {
                    return new c06.a(aVar46, aVar45.f262457b, 16);
                }
                if (i108 == 1) {
                    return p0.d(aVar46, aVar45.f262458c);
                }
                throw new AssertionError(i108);
            case 25:
                return e();
            case 26:
                return f();
            case 27:
                return g();
            case 28:
                return h();
            default:
                ss6.c cVar13 = (ss6.c) this.f251552c;
                int i109 = this.f251551b;
                switch (i109) {
                    case 0:
                        return new ws6.b(cVar13.f265322a, cVar13.f265324b, cVar13.f265326c, cVar13.d);
                    case 1:
                        e3Var = new us6.e3(cVar13.e, cVar13.f, cVar13.f265329g, cVar13.f265330h, cVar13.i, cVar13.f265332j, cVar13.k, cVar13.f265334l, cVar13.f265335m, cVar13.f265336n, cVar13.o, cVar13.X, cVar13.Y, cVar13.f265323a0, cVar13.c0, cVar13.f265328e0, cVar13.A, cVar13.B, cVar13.C, cVar13.D, cVar13.E, cVar13.F, cVar13.G, cVar13.H, cVar13.I, cVar13.J, cVar13.f265338q, cVar13.K, cVar13.L, cVar13.f265339r, cVar13.M, cVar13.f265342w, cVar13.N, cVar13.f265322a, cVar13.f265343x, cVar13.f265344y, cVar13.O, cVar13.z, cVar13.f265340s, cVar13.P, cVar13.Q);
                        break;
                    case 2:
                        vs6.a aVar47 = (vs6.a) ((vs6.b) cVar13.W.get()).b();
                        s.k(aVar47);
                        return aVar47;
                    case 3:
                        e3Var = new vs6.b(cVar13.k, cVar13.f265336n, cVar13.f265337p, cVar13.f265338q, cVar13.f265339r, cVar13.f265340s);
                        break;
                    case 4:
                        ws6.a aVar48 = (ws6.a) ((ws6.b) cVar13.V.get()).b();
                        s.k(aVar48);
                        return aVar48;
                    case 5:
                        xs6.b bVar9 = (xs6.b) ((xs6.c) cVar13.Z.get()).b();
                        s.k(bVar9);
                        return bVar9;
                    case 6:
                        e3Var = new xs6.c(cVar13.f265336n);
                        break;
                    case 7:
                        return sg8.j.w((at6.b) cVar13.f265325b0.get());
                    case 8:
                        return agk.b.c(cVar13.k, cVar13.f265336n, cVar13.f265339r);
                    case 9:
                        return sg8.j.x((f0) cVar13.f265327d0.get());
                    case 10:
                        return bjf.f.c(cVar13.e, cVar13.f265341t, cVar13.f265332j, cVar13.k, cVar13.f265334l, cVar13.f265335m, cVar13.f265336n, cVar13.X, cVar13.Y, cVar13.f265338q, cVar13.u, cVar13.f265339r, cVar13.v, cVar13.f265342w, cVar13.f265343x, cVar13.f265344y, cVar13.z, cVar13.f265340s);
                    case 11:
                        return w3.a(cVar13.J, cVar13.g0);
                    case 12:
                        return sg8.j.v((us6.e3) cVar13.f0.get());
                    case 13:
                        return p0.f(cVar13.g0, cVar13.f265323a0);
                    case 14:
                        return yf6.b.a(cVar13.R, cVar13.f265336n, cVar13.g0, cVar13.f265323a0);
                    case 15:
                        e3Var = new awj.b(cVar13.f265336n, 25);
                        break;
                    case 16:
                        return p0.a(cVar13.g0, cVar13.H, cVar13.J, cVar13.S, cVar13.f265344y);
                    case 17:
                        return p0.b(cVar13.e, cVar13.f265341t, cVar13.T, cVar13.f265332j, cVar13.g0, cVar13.f265323a0, cVar13.f265328e0, cVar13.U, cVar13.D, cVar13.f265344y, cVar13.f265340s);
                    default:
                        throw new AssertionError(i109);
                }
                return e3Var;
        }
    }
}
