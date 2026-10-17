package nk7;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.apm.breb.impl.data.network.qr.BrebQrService;
import com.revolut.feature.apm.core.impl.topup_requests.network.ApmTopupRequestsService;
import com.revolut.feature.credit.card.impl.network.CreditCardMsiService;
import com.revolut.feature.credit.post_termination_plan.impl.database.PostTerminationPlanDatabase;
import com.revolut.feature.credit.post_termination_plan.impl.network.PostTerminationPlanService;
import com.revolut.feature.retail.junior.vaults.impl.services.WithdrawalPermissionService;
import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import com.revolut.feature.shared.network_authentication.impl.network.TokenService;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreenContract$InputData;
import com.revolut.network.RetailCoreNetworkConfiguration;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import cu8.r0;
import dp4.k0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import om4.g3;
import om4.h3;
import retrofit2.Retrofit;
import rv1.z;
import ulm.a1;
import ulm.b1;
import xsf.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f216674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f216675c;

    public /* synthetic */ e(Object obj2, int i, int i2) {
        this.f216673a = i2;
        this.f216675c = obj2;
        this.f216674b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object aVar2;
        Object h3Var;
        Object eVar;
        Object iVar;
        Object hVar;
        Object aVar3;
        Object tVar;
        Object fVar;
        Object bVar;
        Object aVar4;
        Object dVar;
        switch (this.f216673a) {
            case 0:
                f fVar2 = (f) this.f216675c;
                int i = this.f216674b;
                if (i == 0) {
                    return new tk7.h((jki.p) fVar2.f216678c.get(), fVar2.f216676a);
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                thf.g gVarE = fVar2.f216677b.f216717c.e();
                vc.s.j(gVarE);
                return new tk7.i(new ik7.j(gVarE));
            case 1:
                g gVar = (g) this.f216675c;
                int i2 = this.f216674b;
                if (i2 == 0) {
                    return new com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.b((jki.p) gVar.f216680b.get(), gVar.f216679a);
                }
                if (i2 == 1) {
                    return new zk7.g();
                }
                throw new AssertionError(i2);
            case 2:
                j jVar = (j) this.f216675c;
                int i3 = this.f216674b;
                if (i3 == 0) {
                    aVar = new com.revolut.feature.insurance.impl.ui.cfac.claim.a(jVar.f216687a, (mj7.b) jVar.e.get());
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new AssertionError(i3);
                        }
                        tj7.a.Companion.getClass();
                        return new ne0.d();
                    }
                    aVar = new mj7.b((ne0.j) jVar.d.get());
                }
                return aVar;
            case 3:
                r rVar = (r) this.f216675c;
                int i5 = this.f216674b;
                if (i5 == 0) {
                    aVar2 = new com.revolut.feature.insurance.impl.ui.cfac.a(rVar.f216720a);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new AssertionError(i5);
                        }
                        b.Companion.getClass();
                        return new ne0.d();
                    }
                    aVar2 = new mj7.b((ne0.j) rVar.e.get());
                }
                return aVar2;
            case 4:
                int i6 = this.f216674b;
                if (i6 == 0) {
                    return new ak7.h((jki.p) ((t) this.f216675c).f216726a.get());
                }
                if (i6 == 1) {
                    return new ak7.i();
                }
                throw new AssertionError(i6);
            case 5:
                nl5.d dVar2 = (nl5.d) this.f216675c;
                int i21 = this.f216674b;
                if (i21 == 0) {
                    return kxa.j.l((j60.a) dVar2.d.get());
                }
                if (i21 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) dVar2.f217009b.get(), (rp0.m) dVar2.f217010c.get());
                }
                if (i21 == 2) {
                    return new rp0.m();
                }
                if (i21 == 3) {
                    return new vl5.h((jki.p) dVar2.f.get(), dVar2.f217008a);
                }
                if (i21 == 4) {
                    return new vl5.i();
                }
                throw new AssertionError(i21);
            case 6:
                nm4.f fVar3 = (nm4.f) this.f216675c;
                c21.e eVar2 = fVar3.f217168a;
                ee0.a aVar5 = fVar3.f217169b;
                int i22 = this.f216674b;
                switch (i22) {
                    case 0:
                        k0 k0Var = (k0) fVar3.i.get();
                        om4.k0 k0VarQ = fVar3.d.q();
                        vc.s.j(k0VarQ);
                        h3Var = new h3(k0Var, k0VarQ);
                        break;
                    case 1:
                        CreditCardMsiService creditCardMsiService = (CreditCardMsiService) fVar3.f217171g.get();
                        ne0.d hashMapCache = new ne0.d();
                        Intrinsics.checkNotNullParameter(hashMapCache, "hashMapCache");
                        xx4.d dVar3 = new xx4.d(hashMapCache);
                        ue0.c storage = (ue0.c) fVar3.f217172h.get();
                        Intrinsics.checkNotNullParameter(storage, "storage");
                        h3Var = new k0(creditCardMsiService, dVar3, new xx4.e(storage));
                        break;
                    case 2:
                        CreditCardMsiService creditCardMsiService2 = (CreditCardMsiService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) fVar3.f.get(), "retrofit", CreditCardMsiService.class, "create(...)");
                        vc.s.k(creditCardMsiService2);
                        return creditCardMsiService2;
                    case 3:
                        Retrofit retrofitJ = ((c21.b) eVar2).j();
                        vc.s.j(retrofitJ);
                        kg.o oVar = (kg.o) fVar3.e.get();
                        return j6.a.B(p.a.x(retrofitJ, "retrofit", oVar, "gson"), oVar, "build(...)");
                    case 4:
                        kg.o gson = ((c21.b) eVar2).h();
                        vc.s.j(gson);
                        nm4.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        return cn4.a.a(gson);
                    case 5:
                        le0.b gsonObjectMapperFactory = aVar5.c();
                        vc.s.j(gsonObjectMapperFactory);
                        kg.o baseGson = fe0.c.a();
                        yk0.a databaseSessionProvider = fVar3.f217170c.b();
                        vc.s.j(databaseSessionProvider);
                        xe0.f storageFactory = aVar5.f();
                        vc.s.j(storageFactory);
                        nm4.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.f(storageFactory, databaseSessionProvider, "credit_card_msi", gsonObjectMapperFactory.a(cn4.a.a(baseGson)), 1, f0.f322471a, 32);
                    case 6:
                        return new g3(new xn.c());
                    default:
                        throw new AssertionError(i22);
                }
                return h3Var;
            case 7:
                nmg.a aVar6 = (nmg.a) this.f216675c;
                a31.a aVar7 = aVar6.i;
                a31.a aVar8 = aVar6.f217360g;
                a31.a aVar9 = aVar6.d;
                int i32 = this.f216674b;
                if (i32 == 0) {
                    eVar = new kmg.e(aVar6.f217357a, aVar6.f217358b, aVar6.f217359c, aVar9, aVar6.e, aVar6.f, aVar8, aVar6.f217361h, aVar7);
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new AssertionError(i32);
                        }
                        kmg.a aVar10 = (kmg.a) ((kmg.e) aVar6.f217364m.get()).b();
                        vc.s.k(aVar10);
                        return aVar10;
                    }
                    eVar = new kmg.j(aVar6.f217362j, aVar9, aVar8, aVar6.f217365n, aVar6.k, aVar7, aVar6.f217363l);
                }
                return eVar;
            case 8:
                nmi.a aVar11 = (nmi.a) this.f216675c;
                int i33 = this.f216674b;
                if (i33 == 0) {
                    return new kmi.j((pmi.g) aVar11.f217366a.get(), (omi.c) aVar11.f217367b.get());
                }
                if (i33 == 1) {
                    nmi.c.Companion.getClass();
                    return new pmi.g(new qmi.a(), new pmi.a());
                }
                if (i33 == 2) {
                    nmi.c.Companion.getClass();
                    return new omi.d(0);
                }
                if (i33 == 3) {
                    return new kmi.c();
                }
                throw new AssertionError(i33);
            case 9:
                nng.i iVar2 = (nng.i) this.f216675c;
                nng.p pVar = (nng.p) iVar2.f217656g;
                NameControllerDescriptor$InputData nameControllerDescriptor$InputData = iVar2.f217654b;
                int i43 = this.f216674b;
                if (i43 == 0) {
                    cli.n nVar = (cli.n) iVar2.e.get();
                    zzl.b bVar2 = (zzl.b) iVar2.f217655c.get();
                    gte.a aVarB = pVar.d.b();
                    vc.s.j(aVarB);
                    iVar = new zng.i(nameControllerDescriptor$InputData, nVar, new r10.v(bVar2, agk.b.o(aVarB, nameControllerDescriptor$InputData)));
                } else {
                    if (i43 != 1) {
                        if (i43 == 2) {
                            return aog.e.a();
                        }
                        if (i43 == 3) {
                            return aog.f.a();
                        }
                        throw new AssertionError(i43);
                    }
                    cog.c cVar = new cog.c((zzl.b) iVar2.f217655c.get(), (f0m.a) iVar2.d.get());
                    cog.g gVar2 = new cog.g();
                    gte.a aVarB2 = pVar.d.b();
                    vc.s.j(aVarB2);
                    iVar = new zng.l(new cog.a(cVar, gVar2, agk.b.o(aVarB2, nameControllerDescriptor$InputData)));
                }
                return iVar;
            case 10:
                npf.a aVar12 = (npf.a) this.f216675c;
                int i59 = this.f216674b;
                switch (i59) {
                    case 0:
                        return new ppf.a();
                    case 1:
                        return new ppf.d();
                    case 2:
                        return new bqf.e();
                    case 3:
                        gte.a aVarB3 = aVar12.f218200a.b();
                        vc.s.j(aVarB3);
                        hVar = new qpf.h(aVarB3);
                        break;
                    case 4:
                        wj5.b bVar3 = (wj5.b) ((ak5.i) aVar12.f218201b).f5700r.get();
                        vc.s.j(bVar3);
                        hVar = new wpf.c(bVar3);
                        break;
                    case 5:
                        return new wpf.a();
                    case 6:
                        return new aqf.b();
                    default:
                        throw new AssertionError(i59);
                }
                return hVar;
            case 11:
                nsf.b bVar4 = (nsf.b) this.f216675c;
                ite.a aVar13 = bVar4.d;
                djf.c cVar2 = bVar4.e;
                int i66 = this.f216674b;
                switch (i66) {
                    case 0:
                        return new hsf.b();
                    case 1:
                        return new tsf.a(new kye.e(bVar4.d()));
                    case 2:
                        lsf.d dVar4 = new lsf.d((ne0.j) bVar4.f218803p.get(), bVar4.d());
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar4.f218796c).c();
                        vc.s.j(aVarC);
                        return new tsf.e(dVar4, aVarC);
                    case 3:
                        return new ne0.d();
                    case 4:
                        gte.a aVarB4 = aVar13.b();
                        vc.s.j(aVarB4);
                        usf.g gVar3 = new usf.g((csf.b) bVar4.f218804q.get());
                        whf.b bVarA = cVar2.a();
                        vc.s.j(bVarA);
                        thf.b bVar5 = (thf.b) cVar2.L.get();
                        vc.s.j(bVar5);
                        thf.d dVarD = cVar2.d();
                        vc.s.j(dVarD);
                        thf.m mVarG = cVar2.g();
                        vc.s.j(mVarG);
                        return new usf.d(aVarB4, gVar3, bVarA, bVar5, dVarD, mVarG);
                    case 5:
                        gte.a aVarB5 = aVar13.b();
                        vc.s.j(aVarB5);
                        return new hsf.a(aVarB5);
                    case 6:
                        Context context = bVar4.f218800l;
                        nsf.w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return new f01.c(context);
                    default:
                        throw new AssertionError(i66);
                }
            case 12:
                nsf.j jVar2 = (nsf.j) this.f216675c;
                int i74 = this.f216674b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new d0(new xsf.a());
                    }
                    throw new AssertionError(i74);
                }
                cli.n nVar2 = (cli.n) jVar2.d.get();
                TransferReasonsAdditionalInfoScreenContract$InputData transferReasonsAdditionalInfoScreenContract$InputData = jVar2.f218827b;
                qd0.b bVarN = jVar2.f218828c.k.n();
                vc.s.j(bVarN);
                return new com.revolut.feature.transfer_reasons.impl.ui.additional_info.a(nVar2, transferReasonsAdditionalInfoScreenContract$InputData, new g2e.t(bVarN));
            case 13:
                nsf.l lVar = (nsf.l) this.f216675c;
                int i92 = this.f216674b;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new dtf.k();
                    }
                    throw new AssertionError(i92);
                }
                cli.n nVar3 = (cli.n) lVar.d.get();
                TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData = lVar.f218833b;
                qd0.b bVarN2 = lVar.f218834c.k.n();
                vc.s.j(bVarN2);
                return new dtf.i(nVar3, transferReasonsAmountAllocationScreenContract$InputData, new g2e.t(bVarN2));
            case 14:
                nsf.j jVar3 = (nsf.j) this.f216675c;
                int i96 = this.f216674b;
                if (i96 != 0) {
                    if (i96 == 1) {
                        return new d0(new xsf.a());
                    }
                    throw new AssertionError(i96);
                }
                cli.n nVar4 = (cli.n) jVar3.d.get();
                TransferReasonsAdditionalInfoScreenContract$InputData transferReasonsAdditionalInfoScreenContract$InputData2 = jVar3.f218827b;
                qd0.b bVarN3 = jVar3.f218828c.k.n();
                vc.s.j(bVarN3);
                return new com.revolut.feature.transfer_reasons.impl.ui.additional_info.a(nVar4, transferReasonsAdditionalInfoScreenContract$InputData2, new g2e.t(bVarN3));
            case 15:
                nsf.l lVar2 = (nsf.l) this.f216675c;
                int i99 = this.f216674b;
                if (i99 != 0) {
                    if (i99 == 1) {
                        return new dtf.k();
                    }
                    throw new AssertionError(i99);
                }
                cli.n nVar5 = (cli.n) lVar2.d.get();
                TransferReasonsAmountAllocationScreenContract$InputData transferReasonsAmountAllocationScreenContract$InputData2 = lVar2.f218833b;
                qd0.b bVarN4 = lVar2.f218834c.k.n();
                vc.s.j(bVarN4);
                return new dtf.i(nVar5, transferReasonsAmountAllocationScreenContract$InputData2, new g2e.t(bVarN4));
            case 16:
                nsf.n nVar6 = (nsf.n) this.f216675c;
                int i100 = this.f216674b;
                if (i100 == 0) {
                    return new zsf.g((cli.n) nVar6.f218840c.get(), nVar6.f218839b);
                }
                if (i100 == 1) {
                    return new zsf.h();
                }
                throw new AssertionError(i100);
            case 17:
                nsf.n nVar7 = (nsf.n) this.f216675c;
                int i101 = this.f216674b;
                if (i101 == 0) {
                    return new zsf.g((cli.n) nVar7.f218840c.get(), nVar7.f218839b);
                }
                if (i101 == 1) {
                    return new zsf.h();
                }
                throw new AssertionError(i101);
            case 18:
                nv.a aVar14 = (nv.a) this.f216675c;
                n0m.a aVar15 = aVar14.f219334b;
                int i102 = this.f216674b;
                if (i102 == 0) {
                    aVar3 = new rv.a(aVar14.a());
                } else {
                    if (i102 == 1) {
                        c10.d dVarA = aVar15.a();
                        vc.s.j(dVarA);
                        return dVarA;
                    }
                    if (i102 == 2) {
                        a0.d.B(aVar15.f211062c.get());
                        vc.s.j(null);
                        throw null;
                    }
                    if (i102 != 3) {
                        if (i102 == 4) {
                            return new rv.c();
                        }
                        if (i102 == 5) {
                            return new rv.b();
                        }
                        throw new AssertionError(i102);
                    }
                    aVar3 = new rv.d(aVar14.a());
                }
                return aVar3;
            case 19:
                nv1.g gVar4 = (nv1.g) this.f216675c;
                int i103 = this.f216674b;
                switch (i103) {
                    case 0:
                        fx1.a aVarF = ((lz1.m) gVar4.f219396a).f();
                        vc.s.j(aVarF);
                        pre.c cVarA = gVar4.f219397b.a();
                        vc.s.j(cVarA);
                        tVar = new rv1.t(aVarF, cVarA);
                        break;
                    case 1:
                        return new com.revolut.feature.apm.breb.impl.a();
                    case 2:
                        vw1.b bVar6 = (vw1.b) gVar4.u.get();
                        fv1.e eVar3 = (fv1.e) gVar4.f219410w.get();
                        wj0.a aVarI = ((nj0.d) gVar4.f).i();
                        vc.s.j(aVarI);
                        tVar = new rv1.r(bVar6, eVar3, aVarI);
                        break;
                    case 3:
                        uy1.b factory = ((lz1.m) gVar4.f219396a).b();
                        vc.s.j(factory);
                        nv1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        zz1.h.Companion.getClass();
                        return factory.a(zz1.h.f);
                    case 4:
                        tVar = new fv1.e((ue0.c) gVar4.v.get());
                        break;
                    case 5:
                        gv1.a aVar16 = gVar4.f219398c;
                        ee0.a aVar17 = gVar4.d;
                        je0.d mapper = aVar17.b();
                        vc.s.j(mapper);
                        yk0.a databaseSessionProvider2 = gVar4.e.b();
                        vc.s.j(databaseSessionProvider2);
                        xe0.f storageFactory2 = aVar17.f();
                        vc.s.j(storageFactory2);
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider2, "breb", mapper, 0, null, 56);
                    case 6:
                        return new cv1.a();
                    case 7:
                        jv1.a aVar18 = gVar4.k;
                        BrebQrService qrService = (BrebQrService) a0.d.f((nj0.d) gVar4.f, "retrofit", BrebQrService.class, "create(...)");
                        vc.s.k(qrService);
                        ne0.d memoryCache = new ne0.d();
                        Intrinsics.checkNotNullParameter(qrService, "qrService");
                        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
                        r10.r rVar2 = new r10.r();
                        rVar2.f250851a = qrService;
                        rVar2.f250852b = memoryCache;
                        Continuation continuation = null;
                        rVar2.f250853c = new x4l.c(new frk.a(rVar2, continuation, 2), new fs2.k(rVar2, 11), new fv1.a(rVar2, 0), new e31.i(2, 12, continuation), new eci.a(3, 7, continuation));
                        tVar = new rv1.v(rVar2, (fv1.e) gVar4.f219410w.get(), gVar4.f219401j.d());
                        break;
                    case 8:
                        s70.a aVarM = gVar4.f219401j.m();
                        vc.s.j(aVarM);
                        y80.a aVarR = gVar4.f219401j.r();
                        vc.s.j(aVarR);
                        tVar = new pn3.b(aVarM, aVarR);
                        break;
                    case 9:
                        bv1.a aVar19 = (bv1.a) gVar4.f219409t.get();
                        hy1.s sVar = (hy1.s) ((ey1.e) gVar4.f219404n).J.get();
                        vc.s.j(sVar);
                        fl3.a aVarE = gVar4.f219405p.e();
                        vc.s.j(aVarE);
                        tVar = new sw1.b(aVar19, sVar, aVarE, new z((rv1.v) gVar4.z.get()));
                        break;
                    case 10:
                        nv1.d.Companion.getClass();
                        return new dv1.f(new zzl.c());
                    default:
                        throw new AssertionError(i103);
                }
                return tVar;
            case 20:
                nv1.n nVar8 = (nv1.n) this.f216675c;
                int i104 = this.f216674b;
                if (i104 == 0) {
                    return new cw1.d((cli.n) nVar8.f219431b.get(), nVar8.f219430a);
                }
                if (i104 == 1) {
                    return new cw1.e();
                }
                throw new AssertionError(i104);
            case 21:
                nv1.q qVar = (nv1.q) this.f216675c;
                int i105 = this.f216674b;
                if (i105 == 0) {
                    return new mw1.j(qVar.f219439a, (cli.n) qVar.f219441c.get());
                }
                if (i105 != 1) {
                    throw new AssertionError(i105);
                }
                z80.b bVarS = qVar.f219440b.f219401j.s();
                vc.s.j(bVarS);
                return new mw1.l(new sv1.a(bVarS));
            case 22:
                nyj.g gVar5 = (nyj.g) this.f216675c;
                f09.g gVar6 = gVar5.f220912g;
                int i106 = this.f216674b;
                if (i106 == 0) {
                    myj.e eVar4 = (myj.e) gVar5.i.get();
                    ang.f fVarE = gVar5.f220910b.e();
                    gte.a aVarB6 = gVar5.f220911c.b();
                    vc.s.j(aVarB6);
                    return new myj.g(eVar4, fVarE, aVarB6);
                }
                if (i106 == 1) {
                    xoj.a aVarA = gVar5.f220909a.a();
                    vc.s.j(aVarA);
                    return new myj.e(aVarA);
                }
                if (i106 == 2) {
                    r0 r0VarA = gVar5.d.a();
                    xh5.a aVarA2 = gVar5.e.a();
                    vc.s.j(aVarA2);
                    return new qyj.c(r0VarA, aVarA2);
                }
                if (i106 != 3) {
                    throw new AssertionError(i106);
                }
                wli.x xVarD = ((s41.a) gVar5.f).d();
                g09.i iVarA = ((f09.b) gVar6).a();
                vc.s.j(iVarA);
                g09.e eVar5 = (g09.e) ((f09.b) gVar6).f131039q.get();
                vc.s.j(eVar5);
                return new syj.g(xVarD, iVarA, eVar5);
            case 23:
                nz1.a aVar20 = (nz1.a) this.f216675c;
                int i107 = this.f216674b;
                if (i107 == 0) {
                    wz1.f fVar4 = (wz1.f) aVar20.f220931g.get();
                    wz1.c cVar3 = new wz1.c((gx1.e) aVar20.f220932h.get());
                    gx1.e eVar6 = (gx1.e) aVar20.f220932h.get();
                    uw1.c cVarD = ((lz1.m) aVar20.f220930c).d();
                    vc.s.j(cVarD);
                    return new wz1.k(fVar4, cVar3, eVar6, cVarD, aVar20.d.a());
                }
                if (i107 == 1) {
                    Retrofit retrofit = ((nj0.d) aVar20.f220928a).f();
                    xz1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                    Object objCreate = retrofit.create(ApmTopupRequestsService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    ApmTopupRequestsService apmTopupRequestsService = (ApmTopupRequestsService) objCreate;
                    vc.s.k(apmTopupRequestsService);
                    sf0.h hVarB = aVar20.f220929b.b();
                    vc.s.j(hVarB);
                    fVar = new wz1.f(apmTopupRequestsService, hVarB, (ne0.j) aVar20.f.get());
                } else {
                    if (i107 == 2) {
                        return new ne0.d();
                    }
                    if (i107 == 3) {
                        return new wz1.a();
                    }
                    if (i107 != 4) {
                        if (i107 != 5) {
                            throw new AssertionError(i107);
                        }
                        Context context2 = aVar20.e;
                        xz1.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return sri.o.c(context2, null, null, 14);
                    }
                    fVar = new kz1.j((sri.m) aVar20.f220933j.get());
                }
                return fVar;
            case 24:
                o6d.f fVar5 = (o6d.f) this.f216675c;
                int i108 = this.f216674b;
                if (i108 != 0) {
                    if (i108 == 1) {
                        return new l6d.c();
                    }
                    throw new AssertionError(i108);
                }
                qd0.b bVarN5 = fVar5.f222560a.n();
                vc.s.j(bVarN5);
                uh1.a aVar21 = (uh1.a) ((yh1.e) fVar5.f222561b).f.get();
                vc.s.j(aVar21);
                return new l6d.a(bVarN5, aVar21);
            case 25:
                o6d.h hVar2 = (o6d.h) this.f216675c;
                PaymentLinkPreviewScreenProvider$InputData paymentLinkPreviewScreenProvider$InputData = hVar2.f222566a;
                int i109 = this.f216674b;
                if (i109 == 0) {
                    return new q6d.d((jki.p) hVar2.f222567b.get(), paymentLinkPreviewScreenProvider$InputData);
                }
                if (i109 == 1) {
                    return new q6d.f(paymentLinkPreviewScreenProvider$InputData);
                }
                throw new AssertionError(i109);
            case 26:
                oa5.b bVar7 = (oa5.b) this.f216675c;
                c21.e eVar7 = bVar7.f223528a;
                int i110 = this.f216674b;
                switch (i110) {
                    case 0:
                        ua5.c cVar4 = (ua5.c) bVar7.o.get();
                        sa5.c cVar5 = new sa5.c();
                        wsg.n nVarB = bVar7.d.b();
                        wj0.a aVarI2 = ((nj0.d) bVar7.e).i();
                        vc.s.j(aVarI2);
                        bVar = new ra5.b(cVar4, cVar5, nVarB, aVarI2);
                        break;
                    case 1:
                        PostTerminationPlanService postTerminationPlanService = (PostTerminationPlanService) bVar7.f223534l.get();
                        ne0.d hashMapCache2 = new ne0.d();
                        pa5.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(hashMapCache2, "hashMapCache");
                        bVar = new ua5.e(postTerminationPlanService, new xx4.d(hashMapCache2), (la5.a) bVar7.f223536n.get());
                        break;
                    case 2:
                        PostTerminationPlanService postTerminationPlanService2 = (PostTerminationPlanService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar7.k.get(), "retrofit", PostTerminationPlanService.class, "create(...)");
                        vc.s.k(postTerminationPlanService2);
                        return postTerminationPlanService2;
                    case 3:
                        Retrofit retrofit3 = ((c21.b) eVar7).j();
                        vc.s.j(retrofit3);
                        Json json = (Json) bVar7.f223533j.get();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Intrinsics.checkNotNullParameter(json, "json");
                        Retrofit.Builder builderNewBuilder = retrofit3.newBuilder();
                        builderNewBuilder.converterFactories().clear();
                        b1.Companion.getClass();
                        Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(ek.b.a(json, a1.a("application/json"))).build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        vc.s.k(retrofitBuild);
                        return retrofitBuild;
                    case 4:
                        Json baseJson = fe0.d.a();
                        pa5.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                        return ue0.e.b(baseJson, new p5a.m(20));
                    case 5:
                        PostTerminationPlanDatabase database = (PostTerminationPlanDatabase) bVar7.f223535m.get();
                        pa5.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(database, "database");
                        la5.a aVarG = database.g();
                        vc.s.k(aVarG);
                        return aVarG;
                    case 6:
                        Context context3 = bVar7.f223529b;
                        yk0.a databaseSessionProvider3 = bVar7.f223530c.b();
                        vc.s.j(databaseSessionProvider3);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) eVar7).b();
                        pa5.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        PostTerminationPlanDatabase.Companion aVar22 = PostTerminationPlanDatabase.INSTANCE;
                        aVar22.getClass();
                        PostTerminationPlanDatabase postTerminationPlanDatabase = (PostTerminationPlanDatabase) aVar22.a(context3, databaseSessionProvider3, new Migration[0], databaseEncryptionMigratorFactory);
                        vc.s.k(postTerminationPlanDatabase);
                        return postTerminationPlanDatabase;
                    default:
                        throw new AssertionError(i110);
                }
                return bVar;
            case 27:
                oab.a aVar23 = (oab.a) this.f216675c;
                ee0.a aVar24 = aVar23.f223559a;
                int i111 = this.f216674b;
                if (i111 == 0) {
                    return new ne0.d();
                }
                if (i111 == 1) {
                    je0.d mapper2 = aVar24.b();
                    vc.s.j(mapper2);
                    yk0.a databaseSessionProvider4 = aVar23.f223560b.b();
                    vc.s.j(databaseSessionProvider4);
                    xe0.f storageFactory3 = aVar24.f();
                    vc.s.j(storageFactory3);
                    oab.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper2, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                    return xe0.f.f(storageFactory3, databaseSessionProvider4, "withdrawal_permissions", mapper2, 1, null, 48);
                }
                if (i111 == 2) {
                    aVar4 = new pab.a((rab.a) aVar23.f223563h.get());
                } else {
                    if (i111 != 3) {
                        if (i111 != 4) {
                            throw new AssertionError(i111);
                        }
                        ik0.b retrofitFactory = ((nj0.d) aVar23.f223561c).m();
                        vc.s.j(retrofitFactory);
                        mab.a networkConfiguration = aVar23.d;
                        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
                        Object objCreate2 = ik0.b.a(retrofitFactory, null, networkConfiguration.getHostUrl(), null, null, 29).create(WithdrawalPermissionService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        WithdrawalPermissionService withdrawalPermissionService = (WithdrawalPermissionService) objCreate2;
                        vc.s.k(withdrawalPermissionService);
                        return withdrawalPermissionService;
                    }
                    aVar4 = new rab.f((WithdrawalPermissionService) aVar23.f223562g.get(), (ne0.j) aVar23.e.get(), (ue0.c) aVar23.f.get());
                }
                return aVar4;
            case 28:
                oad.a aVar25 = (oad.a) this.f216675c;
                jm0.a aVar26 = aVar25.f223578b;
                mp.o networkAuthenticationDependenciesProvider = aVar25.f223579c;
                an0.c cVar6 = aVar25.f223577a;
                int i112 = this.f216674b;
                switch (i112) {
                    case 0:
                        oj0.b.Companion.getClass();
                        vi0.b bVar8 = com.revolut.core.model.account.a.f51415a;
                        vc.s.k(bVar8);
                        return bVar8;
                    case 1:
                        cn0.h hVar3 = (cn0.h) cVar6.f6526l.get();
                        vc.s.j(hVar3);
                        return new jj0.g(hVar3, (ij0.c) aVar25.i.get());
                    case 2:
                        ij0.a networkConfiguration2 = (ij0.a) aVar25.f223581h.get();
                        x60.a accountRegionProvider = aVar25.d.a();
                        vc.s.j(accountRegionProvider);
                        oad.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(networkConfiguration2, "networkConfiguration");
                        Intrinsics.checkNotNullParameter(accountRegionProvider, "accountRegionProvider");
                        dVar = new ij0.d(networkConfiguration2.getBaseUrl(), networkConfiguration2.getRevolutHosts(), accountRegionProvider);
                        break;
                    case 3:
                        oad.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(networkAuthenticationDependenciesProvider, "networkAuthenticationDependenciesProvider");
                        RetailCoreNetworkConfiguration retailCoreNetworkConfiguration = RetailCoreNetworkConfiguration.INSTANCE;
                        vc.s.k(retailCoreNetworkConfiguration);
                        return retailCoreNetworkConfiguration;
                    case 4:
                        dVar = new jj0.c(new sf0.b((sf0.h) aVar25.e.f214796g.get()), (jj0.e) aVar25.f223584m.get(), new yf.c(aVar26.c()));
                        break;
                    case 5:
                        zm0.c cVarJ = cVar6.j();
                        vc.s.j(cVarJ);
                        zm0.b bVarI = cVar6.i();
                        vc.s.j(bVarI);
                        dVar = new jj0.e(cVarJ, bVarI, new rad.a(e4m.b.a(aVar25.k), e4m.b.a(aVar25.f223583l)), new yf.c(aVar26.c()));
                        break;
                    case 6:
                        mp.p pVar2 = networkAuthenticationDependenciesProvider.f207707a;
                        oad.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(networkAuthenticationDependenciesProvider, "networkAuthenticationDependenciesProvider");
                        Retrofit retrofitA = ik0.b.a(((nj0.d) pVar2.j()).m(), xj0.i.a(((nj0.d) pVar2.j()).l(), null, false, false, null, null, null, 255), null, null, null, 30);
                        vc.s.k(retrofitA);
                        return retrofitA;
                    case 7:
                        Retrofit retrofit4 = (Retrofit) aVar25.k.get();
                        oad.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(TokenService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        TokenService tokenService = (TokenService) objCreate3;
                        vc.s.k(tokenService);
                        return tokenService;
                    default:
                        throw new AssertionError(i112);
                }
                return dVar;
            default:
                oae.b bVar9 = (oae.b) this.f216675c;
                ava.a aVar27 = bVar9.d;
                int i113 = this.f216674b;
                if (i113 == 0) {
                    return new ifm.b();
                }
                if (i113 == 1) {
                    return new iri.j();
                }
                if (i113 == 2) {
                    return new pae.g();
                }
                if (i113 == 3) {
                    return new pae.h();
                }
                if (i113 != 4) {
                    throw new AssertionError(i113);
                }
                wsg.n nVarB2 = bVar9.f223612c.b();
                xua.a aVarA3 = aVar27.a();
                vc.s.j(aVarA3);
                pae.b bVar10 = (pae.b) bVar9.f223615j.get();
                pae.b bVar11 = (pae.b) bVar9.f223615j.get();
                djf.c cVar7 = bVar9.f223611b;
                thf.m mVarG2 = cVar7.g();
                vc.s.j(mVarG2);
                kgm.i iVar3 = new kgm.i(bVar11, mVarG2);
                whf.b bVarA2 = cVar7.a();
                vc.s.j(bVarA2);
                nae.d dVar5 = new nae.d(nVarB2, aVarA3, bVar10, iVar3, bVarA2);
                xua.a aVarA4 = aVar27.a();
                vc.s.j(aVarA4);
                pae.b bVar12 = (pae.b) bVar9.f223615j.get();
                l80.e eVarH = bVar9.f223610a.h();
                vc.s.j(eVarH);
                return new pae.e(dVar5, aVarA4, bVar12, eVarH);
        }
    }
}
