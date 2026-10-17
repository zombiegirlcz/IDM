package ryc;

import aii.o;
import android.app.Activity;
import android.content.Context;
import android.os.HandlerThread;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.WorkManager;
import aw.j0;
import ble.q1;
import bof.r;
import cc7.l;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreenContract$InputData;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreenContract$InputData;
import com.revolut.feature.rfi_tool.api.RfiToolFlowInputData;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreenContract$InputData;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import cu8.r0;
import czc.e0;
import f60.t;
import f60.u;
import f60.v;
import f60.w;
import f60.x;
import f60.y;
import f60.z;
import h30.q;
import java.time.Clock;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kxa.j;
import lx1.i;
import mle.b0;
import o4a.h;
import om4.d0;
import rp0.l0;
import rp0.m;
import rp0.p0;
import rp0.z1;
import s3a.k;
import s3a.n;
import t80.e;
import tjh.h0;
import tjh.i0;
import va.g;
import vc.s;
import xx9.p;
import zhm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f258325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f258326c;
    public final Object d;

    public /* synthetic */ d(Object obj2, Object obj3, int i, int i2) {
        this.f258324a = i2;
        this.f258326c = obj2;
        this.d = obj3;
        this.f258325b = i;
    }

    private final Object a() {
        k kVar = (k) this.f258326c;
        n nVar = (n) this.d;
        int i = this.f258325b;
        switch (i) {
            case 0:
                return j.j((j60.a) nVar.f259566h.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) nVar.f.get(), (m) nVar.f259565g.get());
            case 2:
                return new m();
            case 3:
                return xb1.a.C((j60.a) nVar.f259567j.get());
            case 4:
                return xb1.a.e((com.revolut.kompot.navigable.a) nVar.f.get(), new j60.e());
            case 5:
                fd6.a aVar = (fd6.a) nVar.f259569m.get();
                g.t(aVar);
                return aVar;
            case 6:
                return g.s(((zc6.a) kVar.f259551w).d(), (xc6.a) nVar.f259568l.get());
            case 7:
                return r6.b.k((zc6.a) kVar.f259551w, "factory");
            case 8:
                return f0k.d.p((e60.a) nVar.f259575t.get());
            case 9:
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) nVar.f.get();
                g60.a aVarA = v.a((com.revolut.kompot.navigable.a) nVar.f.get());
                Activity activityA = t.a((com.revolut.kompot.navigable.a) nVar.f.get());
                t80.g gVar = (t80.g) nVar.o.get();
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) nVar.f.get();
                y.a(aVar3);
                d4m.a aVarA2 = e4m.b.a((d) nVar.G);
                nli.a aVar4 = new nli.a((t80.c) nVar.f259571p.get(), t.a((com.revolut.kompot.navigable.a) nVar.f.get()));
                t80.g gVar2 = (t80.g) nVar.o.get();
                zk0.b bVarL = nVar.d.f259532g.l();
                s.j(bVarL);
                return v1.c.q(aVar2, new t80.v(aVarA, activityA, gVar, aVar3, aVarA2, aVar4, new oli.c(gVar2, bVarL, new nli.a((t80.c) nVar.f259571p.get(), t.a((com.revolut.kompot.navigable.a) nVar.f.get())), v.a((com.revolut.kompot.navigable.a) nVar.f.get()), nVar.y()), new oli.g(u.a(t.a((com.revolut.kompot.navigable.a) nVar.f.get())), v1.c.e((com.revolut.kompot.navigable.a) nVar.f.get()), new ami.n(e4m.b.a((d) nVar.H), 1), e4m.b.a((d) nVar.G), (t80.g) nVar.o.get(), new nli.a((t80.c) nVar.f259571p.get(), t.a((com.revolut.kompot.navigable.a) nVar.f.get())), new i90.b(), nVar.c(), nVar.y()), nVar.y()), x.a(), (m) nVar.f259572q.get(), (e60.t) nVar.f259574s.get());
            case 10:
                f80.a aVarX = kVar.f259532g.x();
                s.j(aVarX);
                return new t80.x(aVarX, new i90.b());
            case 11:
                com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) nVar.f.get();
                y.a(aVar5);
                return pli.c.a(new ks0.n(aVar5));
            case 12:
                return e5a.e.a();
            case 13:
                return t96.a.a();
            case 14:
                return z.a();
            case 15:
                o oVar = (o) nVar.f259573r.get();
                y80.a aVarR = kVar.f259532g.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, nVar.c(), Optional.empty());
            case 16:
                cnh.f extension = nVar.b();
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                return extension;
            case 17:
                return xb1.a.D((sb7.b) nVar.f259576w.get());
            case 18:
                xb7.b bVarA = kVar.f259555y.a();
                s.j(bVarA);
                return xb1.a.i(bVarA, (j60.a) nVar.f259567j.get());
            case 19:
                l extension2 = new l((j60.a) nVar.f259567j.get(), (sb7.b) nVar.f259576w.get());
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return extension2;
            case 20:
                return g.u((xc6.a) nVar.f259568l.get());
            case 21:
                e60.t tVar = (e60.t) nVar.f259574s.get();
                w.a(tVar);
                return tVar;
            case 22:
                mkd.g view = nVar.f259563b;
                rkd.m factory = kVar.z.a();
                s.j(factory);
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(view);
            case 23:
                q factory2 = ((h30.n) kVar.A).s();
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new j40.f((l30.b) factory2.f148941b, (os2.g) factory2.f148942c, (j30.c) factory2.d, (df0.b) factory2.e);
            case 24:
                ChatTransferScreenContract$InputData chatTransferScreenContract$InputData = nVar.f259564c;
                k kVar2 = nVar.d;
                xmg.a aVar6 = kVar2.f;
                ox9.a aVar7 = kVar2.f259535j;
                ang.f fVarE = aVar6.e();
                p pVarB = aVar7.b();
                s.j(pVarB);
                tx9.f fVarC = aVar7.c();
                s.j(fVarC);
                jei.b bVarA2 = kVar2.B.a();
                l80.e eVarH = kVar2.f259532g.h();
                s.j(eVarH);
                cl3.a aVarD = kVar2.f259525a.d();
                s.j(aVarD);
                q qVar = new q(fVarE, pVarB, fVarC, bVarA2, eVarH, aVarD);
                jhf.a aVar8 = kVar.C;
                l70.e eVar = kVar.f259532g;
                vl3.n nVar2 = kVar.f259525a;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar8).c();
                s.j(aVarC);
                pn3.a aVar9 = (pn3.a) kVar.f259547s0.get();
                r0 r0VarA = kVar2.D.a();
                fx9.a aVarA3 = kVar2.f259535j.a();
                s.j(aVarA3);
                x2k.e eVar2 = new x2k.e();
                y8k.b bVarA3 = kVar2.f259548t.a();
                rq9.a aVarA4 = kVar2.d.a();
                s.j(aVarA4);
                oy1.b bVarB = kVar2.E.b();
                un9.a aVarD2 = kVar2.f259537l.d();
                s.j(aVarD2);
                p38.a aVarA5 = kVar2.F.a();
                s.j(aVarA5);
                lo5.p pVarB2 = ((yo5.w) kVar2.e).b();
                s.j(pVarB2);
                h3a.l lVar = new h3a.l(r0VarA, aVarA3, eVar2, bVarA3, aVarA4, bVarB, aVarD2, aVarA5, pVarB2);
                sb7.b bVar = (sb7.b) nVar.f259576w.get();
                jei.b bVarA4 = kVar.B.a();
                e4a.b bVar2 = (e4a.b) kVar.u0.get();
                g4a.b bVar3 = new g4a.b((e4a.b) kVar2.u0.get());
                g9e.a aVarC2 = kVar2.H.c();
                s.j(aVarC2);
                i4a.d dVar = new i4a.d(aVarC2);
                cl3.a aVarD3 = nVar2.d();
                s.j(aVarD3);
                r0 r0VarA2 = kVar.D.a();
                md0.b bVarA5 = kVar.I.a();
                s.j(bVarA5);
                h3a.p pVar = new h3a.p();
                h3a.n nVar3 = new h3a.n();
                gte.a aVarB = kVar.o.b();
                s.j(aVarB);
                i5a.b bVarD = kVar.d();
                g48.r0 r0VarC = kVar.F.c();
                t3a.f fVar = (t3a.f) kVar.f259550v0.get();
                d4m.a aVarA6 = e4m.b.a(kVar.f259552w0);
                z1 z1Var = (z1) nVar.D.get();
                mkd.d dVar2 = (mkd.d) nVar.B.get();
                wsg.n nVarB = kVar.M.b();
                bn2.p pVarC = kVar.N.c();
                ej9.c cVar = new ej9.c((ue0.c) kVar2.f259545r0.get(), 3);
                com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) nVar.f.get();
                y80.a aVarR2 = eVar.r();
                s.j(aVarR2);
                s70.a aVarM = eVar.m();
                s.j(aVarM);
                f5a.e eVar3 = new f5a.e(new lld.p(), new f5a.b());
                cnh.f fVarB = nVar.b();
                utk.f fVarJ = kVar.O.f136167c.j();
                h5a.d dVar3 = new h5a.d();
                j40.a aVar11 = (j40.a) nVar.C.get();
                d3a.b bVar4 = (d3a.b) kVar2.f259534h0.get();
                h hVar = (h) kVar2.f259554x0.get();
                gqa.b bVarE = ((jqa.p) kVar2.f259529c).e();
                s.j(bVarE);
                bu9.a aVarA7 = ((ut9.a) kVar2.P).a();
                s.j(aVarA7);
                ga6.a aVarC3 = kVar2.f259533h.c();
                s.j(aVarC3);
                fnc.s sVarB = kVar2.Q.b();
                uw1.e eVarJ = ((lz1.m) kVar2.f259539n).j();
                s.j(eVarJ);
                fp1.f fVarC2 = ((up1.e) kVar2.R).c();
                s.j(fVarC2);
                gte.a aVarB2 = kVar2.o.b();
                s.j(aVarB2);
                cw9.d dVarA = kVar2.S.a();
                v67.b bVarA6 = kVar2.T.a();
                s.j(bVarA6);
                er1.b bVarA7 = ((ir1.b) kVar2.U).a();
                s.j(bVarA7);
                lal.a aVar12 = new lal.a(bVar4, hVar, new o4a.d(new h3a.a(new h3a.t(bVarE, aVarA7, aVarC3, sVarB, eVarJ, fVarC2, aVarB2, dVarA, bVarA6, bVarA7))), ((oq8.a) kVar2.V).a());
                cw9.d dVarA2 = kVar.S.a();
                h5a.e eVar4 = new h5a.e();
                cli.n nVar4 = (cli.n) nVar.E.get();
                q8b.a aVar13 = kVar2.X;
                pqi.a aVar14 = kVar2.f259538m;
                n8b.a aVarA8 = aVar13.a();
                s.j(aVarA8);
                b5a.b bVar5 = new b5a.b(aVarA8, aVar14.a(), aVar14.g());
                tbk.c cVar2 = (tbk.c) kVar.f259542p.A.get();
                s.j(cVar2);
                r10.q qVarD = kVar.f.d();
                i4b.f fVarB2 = ((zc6.a) kVar.f259551w).b();
                dl3.a aVar15 = (dl3.a) nVar2.z.get();
                s.j(aVar15);
                wl3.u uVarF = nVar2.f();
                t2j.a aVar16 = kVar.f259527b;
                h3j.y yVar = new h3j.y();
                d3j.b bVarE2 = ((b3j.p) aVar16).e();
                lra.d dVarB = ((jqa.p) kVar.f259529c).b();
                s.j(dVarB);
                return new com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f(chatTransferScreenContract$InputData, qVar, aVarC, aVar9, lVar, bVar, bVarA4, bVar2, bVar3, dVar, aVarD3, r0VarA2, bVarA5, pVar, nVar3, aVarB, bVarD, r0VarC, fVar, aVarA6, z1Var, dVar2, nVarB, pVarC, cVar, aVar10, aVarR2, aVarM, eVar3, fVarB, fVarJ, dVar3, aVar11, aVar12, dVarA2, eVar4, nVar4, bVar5, cVar2, qVarD, fVarB2, aVar15, uVarF, yVar, bVarE2, dVarB);
            case 25:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.f.get();
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new z1(controller.m2());
            case 26:
                g5a.v vVar = new g5a.v();
                k kVar3 = nVar.d;
                m3j.n nVarI = ((b3j.p) kVar3.f259527b).i();
                aqa.c cVarC = ((jqa.p) kVar3.f259529c).c();
                s.j(cVarC);
                io5.b bVarA8 = ((yo5.w) kVar3.e).a();
                s.j(bVarA8);
                dl3.f fVarC3 = kVar3.f259525a.c();
                s.j(fVarC3);
                nq9.b bVarB2 = kVar3.W.b();
                s.j(bVarB2);
                e3a.b bVar6 = (e3a.b) kVar3.f259536k0.get();
                gte.a aVarB3 = kVar3.o.b();
                s.j(aVarB3);
                g5a.s sVar = new g5a.s(aVarB3);
                fa6.a aVarD4 = kVar3.f259533h.d();
                s.j(aVarD4);
                i iVarD = ((ey1.e) kVar3.i).d();
                s.j(iVarD);
                tn9.a aVarC4 = kVar3.f259537l.c();
                s.j(aVarC4);
                g5a.u uVar = new g5a.u(nVarI, cVarC, bVarA8, fVarC3, bVarB2, bVar6, sVar, aVarD4, iVarD, aVarC4);
                g5a.v vVar2 = new g5a.v();
                n8b.a aVarA9 = kVar3.X.a();
                s.j(aVarA9);
                h5a.b bVar7 = new h5a.b(uVar, vVar2, new b5a.d(aVarA9));
                g5a.e eVar5 = new g5a.e();
                ChatTransferScreenContract$InputData chatTransferScreenContract$InputData2 = nVar.f259564c;
                return new r(vVar, bVar7, new r10.t(eVar5, new g5a.d(chatTransferScreenContract$InputData2), new r10.w(chatTransferScreenContract$InputData2)), ((zc6.a) kVar.f259551w).c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        k kVar = (k) this.f258326c;
        n nVar = (n) this.d;
        int i = this.f258325b;
        switch (i) {
            case 0:
                return j.j((j60.a) nVar.f259566h.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) nVar.f.get(), (m) nVar.f259565g.get());
            case 2:
                return new m();
            case 3:
                return xb1.a.C((j60.a) nVar.f259567j.get());
            case 4:
                return xb1.a.e((com.revolut.kompot.navigable.a) nVar.f.get(), new j60.e());
            case 5:
                fd6.a aVar = (fd6.a) nVar.f259569m.get();
                g.t(aVar);
                return aVar;
            case 6:
                return g.s(((zc6.a) kVar.f259551w).d(), (xc6.a) nVar.f259568l.get());
            case 7:
                return r6.b.k((zc6.a) kVar.f259551w, "factory");
            case 8:
                return f0k.d.p((e60.a) nVar.f259575t.get());
            case 9:
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) nVar.f.get();
                g60.a aVarA = v.a((com.revolut.kompot.navigable.a) nVar.f.get());
                Activity activityA = t.a((com.revolut.kompot.navigable.a) nVar.f.get());
                t80.g gVar = (t80.g) nVar.o.get();
                com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) nVar.f.get();
                y.a(aVar3);
                d4m.a aVarA2 = e4m.b.a((d) nVar.G);
                nli.a aVar4 = new nli.a((t80.c) nVar.f259571p.get(), t.a((com.revolut.kompot.navigable.a) nVar.f.get()));
                t80.g gVar2 = (t80.g) nVar.o.get();
                zk0.b bVarL = nVar.d.f259532g.l();
                s.j(bVarL);
                return v1.c.q(aVar2, new t80.v(aVarA, activityA, gVar, aVar3, aVarA2, aVar4, new oli.c(gVar2, bVarL, new nli.a((t80.c) nVar.f259571p.get(), t.a((com.revolut.kompot.navigable.a) nVar.f.get())), v.a((com.revolut.kompot.navigable.a) nVar.f.get()), nVar.y()), new oli.g(u.a(t.a((com.revolut.kompot.navigable.a) nVar.f.get())), v1.c.e((com.revolut.kompot.navigable.a) nVar.f.get()), new ami.n(e4m.b.a((d) nVar.H), 1), e4m.b.a((d) nVar.G), (t80.g) nVar.o.get(), new nli.a((t80.c) nVar.f259571p.get(), t.a((com.revolut.kompot.navigable.a) nVar.f.get())), new i90.b(), nVar.c(), nVar.y()), nVar.y()), x.a(), (m) nVar.f259572q.get(), (e60.t) nVar.f259574s.get());
            case 10:
                f80.a aVarX = kVar.f259532g.x();
                s.j(aVarX);
                return new t80.x(aVarX, new i90.b());
            case 11:
                com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) nVar.f.get();
                y.a(aVar5);
                return pli.c.a(new ks0.n(aVar5));
            case 12:
                return e5a.e.a();
            case 13:
                return t96.a.a();
            case 14:
                return z.a();
            case 15:
                o oVar = (o) nVar.f259573r.get();
                y80.a aVarR = kVar.f259532g.r();
                s.j(aVarR);
                return new e60.y(oVar, aVarR, nVar.c(), Optional.empty());
            case 16:
                cnh.f extension = nVar.b();
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                return extension;
            case 17:
                return xb1.a.D((sb7.b) nVar.f259576w.get());
            case 18:
                xb7.b bVarA = kVar.f259555y.a();
                s.j(bVarA);
                return xb1.a.i(bVarA, (j60.a) nVar.f259567j.get());
            case 19:
                l extension2 = new l((j60.a) nVar.f259567j.get(), (sb7.b) nVar.f259576w.get());
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return extension2;
            case 20:
                return g.u((xc6.a) nVar.f259568l.get());
            case 21:
                e60.t tVar = (e60.t) nVar.f259574s.get();
                w.a(tVar);
                return tVar;
            case 22:
                mkd.g view = nVar.f259563b;
                rkd.m factory = kVar.z.a();
                s.j(factory);
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(view);
            case 23:
                q factory2 = ((h30.n) kVar.A).s();
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new j40.f((l30.b) factory2.f148941b, (os2.g) factory2.f148942c, (j30.c) factory2.d, (df0.b) factory2.e);
            case 24:
                ChatTransferScreenContract$InputData chatTransferScreenContract$InputData = nVar.f259564c;
                k kVar2 = nVar.d;
                xmg.a aVar6 = kVar2.f;
                ox9.a aVar7 = kVar2.f259535j;
                ang.f fVarE = aVar6.e();
                p pVarB = aVar7.b();
                s.j(pVarB);
                tx9.f fVarC = aVar7.c();
                s.j(fVarC);
                jei.b bVarA2 = kVar2.B.a();
                l80.e eVarH = kVar2.f259532g.h();
                s.j(eVarH);
                cl3.a aVarD = kVar2.f259525a.d();
                s.j(aVarD);
                q qVar = new q(fVarE, pVarB, fVarC, bVarA2, eVarH, aVarD);
                jhf.a aVar8 = kVar.C;
                l70.e eVar = kVar.f259532g;
                vl3.n nVar2 = kVar.f259525a;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar8).c();
                s.j(aVarC);
                pn3.a aVar9 = (pn3.a) kVar.f259547s0.get();
                r0 r0VarA = kVar2.D.a();
                fx9.a aVarA3 = kVar2.f259535j.a();
                s.j(aVarA3);
                x2k.e eVar2 = new x2k.e();
                y8k.b bVarA3 = kVar2.f259548t.a();
                rq9.a aVarA4 = kVar2.d.a();
                s.j(aVarA4);
                oy1.b bVarB = kVar2.E.b();
                un9.a aVarD2 = kVar2.f259537l.d();
                s.j(aVarD2);
                p38.a aVarA5 = kVar2.F.a();
                s.j(aVarA5);
                lo5.p pVarB2 = ((yo5.w) kVar2.e).b();
                s.j(pVarB2);
                h3a.l lVar = new h3a.l(r0VarA, aVarA3, eVar2, bVarA3, aVarA4, bVarB, aVarD2, aVarA5, pVarB2);
                sb7.b bVar = (sb7.b) nVar.f259576w.get();
                jei.b bVarA4 = kVar.B.a();
                e4a.b bVar2 = (e4a.b) kVar.u0.get();
                g4a.b bVar3 = new g4a.b((e4a.b) kVar2.u0.get());
                g9e.a aVarC2 = kVar2.H.c();
                s.j(aVarC2);
                i4a.d dVar = new i4a.d(aVarC2);
                cl3.a aVarD3 = nVar2.d();
                s.j(aVarD3);
                r0 r0VarA2 = kVar.D.a();
                md0.b bVarA5 = kVar.I.a();
                s.j(bVarA5);
                h3a.p pVar = new h3a.p();
                h3a.n nVar3 = new h3a.n();
                gte.a aVarB = kVar.o.b();
                s.j(aVarB);
                i5a.b bVarD = kVar.d();
                g48.r0 r0VarC = kVar.F.c();
                t3a.f fVar = (t3a.f) kVar.f259550v0.get();
                d4m.a aVarA6 = e4m.b.a(kVar.f259552w0);
                z1 z1Var = (z1) nVar.D.get();
                mkd.d dVar2 = (mkd.d) nVar.B.get();
                wsg.n nVarB = kVar.M.b();
                bn2.p pVarC = kVar.N.c();
                ej9.c cVar = new ej9.c((ue0.c) kVar2.f259545r0.get(), 3);
                com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) nVar.f.get();
                y80.a aVarR2 = eVar.r();
                s.j(aVarR2);
                s70.a aVarM = eVar.m();
                s.j(aVarM);
                rkd.g gVar3 = kVar2.z;
                f5a.e eVar3 = new f5a.e(new lld.p(), new f5a.b());
                cnh.f fVarB = nVar.b();
                utk.f fVarJ = kVar.O.f136167c.j();
                h5a.d dVar3 = new h5a.d();
                j40.a aVar11 = (j40.a) nVar.C.get();
                d3a.b bVar4 = (d3a.b) kVar2.f259534h0.get();
                h hVar = (h) kVar2.f259554x0.get();
                gqa.b bVarE = ((jqa.p) kVar2.f259529c).e();
                s.j(bVarE);
                bu9.a aVarA7 = ((ut9.a) kVar2.P).a();
                s.j(aVarA7);
                ga6.a aVarC3 = kVar2.f259533h.c();
                s.j(aVarC3);
                fnc.s sVarB = kVar2.Q.b();
                uw1.e eVarJ = ((lz1.m) kVar2.f259539n).j();
                s.j(eVarJ);
                fp1.f fVarC2 = ((up1.e) kVar2.R).c();
                s.j(fVarC2);
                gte.a aVarB2 = kVar2.o.b();
                s.j(aVarB2);
                cw9.d dVarA = kVar2.S.a();
                v67.b bVarA6 = kVar2.T.a();
                s.j(bVarA6);
                er1.b bVarA7 = ((ir1.b) kVar2.U).a();
                s.j(bVarA7);
                lal.a aVar12 = new lal.a(bVar4, hVar, new o4a.d(new h3a.a(new h3a.t(bVarE, aVarA7, aVarC3, sVarB, eVarJ, fVarC2, aVarB2, dVarA, bVarA6, bVarA7))), ((oq8.a) kVar2.V).a());
                cw9.d dVarA2 = kVar.S.a();
                h5a.e eVar4 = new h5a.e();
                cli.n nVar4 = (cli.n) nVar.E.get();
                q8b.a aVar13 = kVar2.X;
                pqi.a aVar14 = kVar2.f259538m;
                n8b.a aVarA8 = aVar13.a();
                s.j(aVarA8);
                b5a.b bVar5 = new b5a.b(aVarA8, aVar14.a(), aVar14.g());
                tbk.c cVar2 = (tbk.c) kVar.f259542p.A.get();
                s.j(cVar2);
                r10.q qVarD = kVar.f.d();
                i4b.f fVarB2 = ((zc6.a) kVar.f259551w).b();
                dl3.a aVar15 = (dl3.a) nVar2.z.get();
                s.j(aVar15);
                wl3.u uVarF = nVar2.f();
                t2j.a aVar16 = kVar.f259527b;
                h3j.y yVar = new h3j.y();
                d3j.b bVarE2 = ((b3j.p) aVar16).e();
                lra.d dVarB = ((jqa.p) kVar.f259529c).b();
                s.j(dVarB);
                return new com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f(chatTransferScreenContract$InputData, qVar, aVarC, aVar9, lVar, bVar, bVarA4, bVar2, bVar3, dVar, aVarD3, r0VarA2, bVarA5, pVar, nVar3, aVarB, bVarD, r0VarC, fVar, aVarA6, z1Var, dVar2, nVarB, pVarC, cVar, aVar10, aVarR2, aVarM, eVar3, fVarB, fVarJ, dVar3, aVar11, aVar12, dVarA2, eVar4, nVar4, bVar5, cVar2, qVarD, fVarB2, aVar15, uVarF, yVar, bVarE2, dVarB);
            case 25:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.f.get();
                e5a.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new z1(controller.m2());
            case 26:
                g5a.v vVar = new g5a.v();
                k kVar3 = nVar.d;
                m3j.n nVarI = ((b3j.p) kVar3.f259527b).i();
                aqa.c cVarC = ((jqa.p) kVar3.f259529c).c();
                s.j(cVarC);
                io5.b bVarA8 = ((yo5.w) kVar3.e).a();
                s.j(bVarA8);
                dl3.f fVarC3 = kVar3.f259525a.c();
                s.j(fVarC3);
                nq9.b bVarB2 = kVar3.W.b();
                s.j(bVarB2);
                e3a.b bVar6 = (e3a.b) kVar3.f259536k0.get();
                gte.a aVarB3 = kVar3.o.b();
                s.j(aVarB3);
                g5a.s sVar = new g5a.s(aVarB3);
                fa6.a aVarD4 = kVar3.f259533h.d();
                s.j(aVarD4);
                i iVarD = ((ey1.e) kVar3.i).d();
                s.j(iVarD);
                tn9.a aVarC4 = kVar3.f259537l.c();
                s.j(aVarC4);
                g5a.u uVar = new g5a.u(nVarI, cVarC, bVarA8, fVarC3, bVarB2, bVar6, sVar, aVarD4, iVarD, aVarC4);
                g5a.v vVar2 = new g5a.v();
                n8b.a aVarA9 = kVar3.X.a();
                s.j(aVarA9);
                h5a.b bVar7 = new h5a.b(uVar, vVar2, new b5a.d(aVarA9));
                g5a.e eVar5 = new g5a.e();
                ChatTransferScreenContract$InputData chatTransferScreenContract$InputData2 = nVar.f259564c;
                return new r(vVar, bVar7, new r10.t(eVar5, new g5a.d(chatTransferScreenContract$InputData2), new r10.w(chatTransferScreenContract$InputData2)), ((zc6.a) kVar.f259551w).c());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        sc9.b bVar = (sc9.b) this.f258326c;
        sc9.a aVar = (sc9.a) this.d;
        int i = this.f258325b;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(aVar.f261663a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f261663a);
                t70.g gVarO = bVar.f261680b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) aVar.f.get(), gsi.c.a(aVar.f261663a));
            case 3:
                return new rpi.b(bq.i.b(aVar.f261663a));
            case 4:
                return new rpi.h(bq.i.b(aVar.f261663a));
            case 5:
                return new iri.g((iri.j) bVar.f261682g.get(), (iri.m) bVar.f261683h.get(), bq.i.f(aVar.f261663a), bq.i.l(aVar.f261663a));
            case 6:
                return new iri.l((iri.m) bVar.f261683h.get(), bq.i.f(aVar.f261663a), (iri.d) aVar.f261668j.get());
            case 7:
                return new iri.d(bq.i.f(aVar.f261663a));
            case 8:
                return new opi.b(bq.i.f(aVar.f261663a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) aVar.f261665c.i.get()), bq.i.l(aVar.f261663a));
            case 10:
                return new aqi.d(bq.i.b(aVar.f261663a), new y80.b());
            case 11:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f261684j.get(), bVar.a());
            case 12:
                um.c cVar = (um.c) bVar.k.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                sc9.b bVar2 = aVar.f261665c;
                hn.h hVar = (hn.h) bVar2.f261685l.get();
                t70.g gVarO2 = bVar2.f261680b.o();
                s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.b());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f261672p)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.a());
            case 13:
                return bq.i.t(aVar.f261663a);
            case 14:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f261674r.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f261666g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.f261686m.get(), bVar.a());
            case 15:
                return new zm.a();
            case 16:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.f261665c.b());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f261685l.get(), (npi.f) aVar.e.get());
            case 17:
                return new gn.c((lpi.e) aVar.u.get(), (sm.e) bVar.o.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.a());
            case 18:
                return new lpi.b(bq.i.i(aVar.f261663a), bq.i.j(aVar.f261663a));
            case 19:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f261688p.get(), bVar.a());
            case 20:
                sc9.b bVar3 = aVar.f261665c;
                xoi.d dVar = aVar.f261663a;
                da3.j jVar = bVar3.f261681c;
                l93.f fVarJ = jVar.j();
                s.j(fVarJ);
                ha3.f fVarD = jVar.d();
                s.j(fVarD);
                rc9.c cVar2 = new rc9.c(new ja3.f(bq.i.i(dVar), gmf.b.h(dVar), fVarD, fVarJ, bq.i.j(dVar)), (tpi.j) aVar.f261666g.get(), bq.i.l(dVar), bq.i.e(dVar), aVar.f261664b, t2d.c.c(bVar.d.f271230a));
                kli.a.p(cVar2, bq.i.d(dVar));
                return cVar2;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        sg8.b bVar = (sg8.b) this.d;
        int i = this.f258325b;
        if (i == 0) {
            return new com.revolut.feature.junior_graduation.impl.ui.flow.identification.a(bVar.f262603a, ((sg8.c) this.f258326c).a(), (c90.c) bVar.e.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        ViewController controller = bVar.f262604b;
        ah8.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new c90.c(controller.m2());
    }

    private final Object e() {
        sg8.c cVar = (sg8.c) this.f258326c;
        l70.e eVar = cVar.f262609g;
        sg8.d dVar = (sg8.d) this.d;
        lg8.a aVar = dVar.f262620a;
        int i = this.f258325b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            z70.a aVarF = eVar.f();
            s.j(aVarF);
            return new ih8.k(aVar, aVarF);
        }
        cli.n nVar = (cli.n) dVar.f262621b.get();
        d0 d0VarC = cVar.c();
        z80.b bVarS = eVar.s();
        s.j(bVarS);
        return new ih8.i(nVar, d0VarC, aVar, bVarS);
    }

    private final Object f() {
        sg8.c cVar = (sg8.c) this.f258326c;
        sg8.e eVar = (sg8.e) this.d;
        JuniorIdentificationScreenContract$InputData juniorIdentificationScreenContract$InputData = eVar.f262623a;
        int i = this.f258325b;
        if (i == 0) {
            return new com.revolut.feature.junior_graduation.impl.ui.screen.identification.a((cli.n) eVar.f262624b.get(), juniorIdentificationScreenContract$InputData, cVar.b(), cVar.c(), new kye.e(s2l.c.n(((nj0.d) cVar.f262607b).f())), new gh8.a(), new jh8.a());
        }
        if (i == 1) {
            return new gh8.o(juniorIdentificationScreenContract$InputData);
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        sg8.c cVar = (sg8.c) this.f258326c;
        sg8.f fVar = (sg8.f) this.d;
        int i = this.f258325b;
        if (i == 0) {
            return j.l((j60.a) fVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) fVar.f262627b.get(), (m) fVar.f262628c.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            ch8.a juniorMigrationAssetListItemProvider = new ch8.a();
            ch8.c juniorMigrationAssetNavBarConfigProvider = new ch8.c();
            Intrinsics.checkNotNullParameter(juniorMigrationAssetListItemProvider, "juniorMigrationAssetListItemProvider");
            Intrinsics.checkNotNullParameter(juniorMigrationAssetNavBarConfigProvider, "juniorMigrationAssetNavBarConfigProvider");
            return new bh8.v();
        }
        jki.p pVar = (jki.p) fVar.f.get();
        JuniorMigrationAssetDetailsScreenContract$InputData juniorMigrationAssetDetailsScreenContract$InputData = fVar.f262626a;
        rul.e eVarB = cVar.b();
        yg8.e eVar = new yg8.e();
        yg8.c cVarA = cVar.a();
        mt8.d dVarB = cVar.f262611j.b();
        s.j(dVarB);
        return new bh8.u(pVar, juniorMigrationAssetDetailsScreenContract$InputData, eVarB, eVar, cVarA, dVarB, (j60.a) fVar.d.get(), cVar.k.a(), new kye.e(s2l.c.n(((nj0.d) cVar.f262607b).f())), new dh8.a());
    }

    private final Object h() {
        nng.e eVar = (nng.e) this.d;
        l70.e eVar2 = ((sja.a) this.f258326c).f263695h;
        int i = this.f258325b;
        if (i == 0) {
            return new sng.i(eVar.f217642b, (cli.n) eVar.d.get());
        }
        if (i == 1) {
            l80.e eVarH = eVar2.h();
            s.j(eVarH);
            return new sng.j(eVarH, (ung.b) eVar.f217643c.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        l80.e eVarH2 = eVar2.h();
        s.j(eVarH2);
        return new ung.c(eVarH2);
    }

    private final Object i() {
        sja.b bVar = (sja.b) this.d;
        sja.a aVar = (sja.a) this.f258326c;
        int i = this.f258325b;
        if (i == 0) {
            sja.a aVar2 = bVar.f263701a;
            v60.e eVarA = aVar2.f263692b.a();
            s.j(eVarA);
            sf0.h hVarB = aVar2.f263693c.b();
            s.j(hVarB);
            return new vja.d(new kvh.h(hVarB, eVarA), aVar.d.a());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        oja.a aVar3 = (oja.a) aVar.o.get();
        com.revolut.feature.product.onboarding.flow.b bVar2 = new com.revolut.feature.product.onboarding.flow.b();
        vja.b bVar3 = (vja.b) bVar.f263703c.get();
        til.m mVarA = aVar.e.a();
        s.j(mVarA);
        pbi.e eVar = (pbi.e) aVar.f.f223655h.get();
        s.j(eVar);
        return new com.revolut.feature.product.onboarding.flow.a(aVar3, bVar2, bVar3, mVarA, eVar);
    }

    private final Object j() {
        skc.b bVar = (skc.b) this.f258326c;
        skc.c cVar = (skc.c) this.d;
        int i = this.f258325b;
        if (i != 0) {
            if (i == 1) {
                return new tkc.b();
            }
            throw new AssertionError(i);
        }
        RfiToolFlowInputData rfiToolFlowInputData = cVar.f263812a;
        qkc.a aVar = (qkc.a) bVar.f263811h.get();
        ra0.h hVarA = bVar.f263809c.a();
        s.j(hVarA);
        return new com.revolut.feature.rfi_tool.impl.navigation.b(rfiToolFlowInputData, aVar, hVarA, (tkc.a) cVar.f263813b.get());
    }

    private final Object k() {
        ske.c cVar = (ske.c) this.f258326c;
        ske.b bVar = (ske.b) this.d;
        int i = this.f258325b;
        switch (i) {
            case 0:
                dlc.e extensions = (dlc.e) bVar.f263848j.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f115727a;
            case 1:
                hmc.h factory = (hmc.h) cVar.f263873m.v.get();
                s.j(factory);
                j60.a bottomExpandableDialogControllerExtension = (j60.a) bVar.f263846g.get();
                dlc.d delegatesProvider = (dlc.d) bVar.i.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
                return factory.a(delegatesProvider, bottomExpandableDialogControllerExtension);
            case 2:
                return h30.l.p((com.revolut.kompot.navigable.a) bVar.e.get(), (m) bVar.f.get());
            case 3:
                return new m();
            case 4:
                InvestSettingsScreen screen = (InvestSettingsScreen) bVar.f263847h.get();
                Intrinsics.checkNotNullParameter(screen, "screen");
                s.k(screen);
                return screen;
            case 5:
                BaseScreen screen2 = bVar.f263843a;
                ole.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return (InvestSettingsScreen) screen2;
            case 6:
                return j.l((j60.a) bVar.f263846g.get());
            case 7:
                return s2l.c.k((r60.b) bVar.f263851n.get());
            case 8:
                return com.revolut.data.database.models.openbanking.d.w((com.revolut.kompot.navigable.a) bVar.e.get(), (p0) bVar.f263850m.get());
            case 9:
                return new p0();
            case 10:
                i5b.b componentsProvider = (i5b.b) cVar.f263874n.D.get();
                s.j(componentsProvider);
                kdh.b view = bVar.f263844b;
                h2b.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(componentsProvider, "componentsProvider");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(view, "view");
                return new i5b.h(view, componentsProvider.f158796a);
            case 11:
                shh.g factory2 = (shh.g) cVar.o.f135236g.get();
                s.j(factory2);
                kge.d screen3 = bVar.f263845c;
                chh.b controllerModel = (chh.b) bVar.f263853q.get();
                dhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(screen3, "screen");
                Intrinsics.checkNotNullParameter(controllerModel, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(screen3, "screen");
                Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                return new shh.c(screen3, controllerModel);
            case 12:
                shh.g factory3 = (shh.g) cVar.o.f135236g.get();
                s.j(factory3);
                dhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return new shh.f(factory3.f263481b);
            case 13:
                uih.a extension = (uih.a) bVar.f263855s.get();
                ole.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                s.k(extension);
                return extension;
            case 14:
                wlh.c factory4 = (wlh.c) ((mkh.s) cVar.f263877p).p0.get();
                s.j(factory4);
                r60.b promptViewControllerExtension = (r60.b) bVar.f263851n.get();
                j60.a expandableDialogActionDispatcher = (j60.a) bVar.f263846g.get();
                ole.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
                Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
                Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
                Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
                return new wlh.k(factory4.f298479a, promptViewControllerExtension, factory4.d, factory4.f298480b, factory4.f298483h, factory4.i, expandableDialogActionDispatcher, factory4.f298484j, factory4.k, factory4.f298485l, factory4.f298487n, factory4.o);
            case 15:
                dlc.e extensions2 = (dlc.e) bVar.f263848j.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f115728b;
            case 16:
                gte.a aVarB = cVar.f263878q.b();
                s.j(aVarB);
                ael.b bVar2 = (ael.b) cVar.f263879r.f321543b0.get();
                s.j(bVar2);
                return new nle.e(aVarB, bVar2, new nle.g());
            case 17:
                gte.a aVarB2 = cVar.f263878q.b();
                s.j(aVarB2);
                toa.a aVarA = cVar.f263880s.a();
                s.j(aVarA);
                return new ple.c(aVarB2, aVarA);
            case 18:
                return new qle.c(cVar.f263881t.a());
            case 19:
                i5b.b componentsProvider2 = (i5b.b) cVar.f263874n.D.get();
                s.j(componentsProvider2);
                h2b.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(componentsProvider2, "componentsProvider");
                return componentsProvider2.f158796a;
            case 20:
                jki.p pVar = (jki.p) bVar.F.get();
                InvestSettingsScreenContract$InputData investSettingsScreenContract$InputData = bVar.d;
                h9h.a aVar = cVar.i;
                h9h.a aVar2 = cVar.i;
                x8h.k kVarD = aVar.d();
                nle.a aVar3 = (nle.a) bVar.v.get();
                ple.a aVar4 = (ple.a) bVar.f263857w.get();
                qle.a aVar5 = (qle.a) bVar.f263858x.get();
                uih.a aVar6 = (uih.a) bVar.f263855s.get();
                chh.b bVar3 = (chh.b) bVar.f263853q.get();
                tzg.m mVarT = aVar2.t();
                s.j(mVarT);
                return new mle.z(pVar, investSettingsScreenContract$InputData, kVarD, aVar3, aVar4, aVar5, aVar6, bVar3, mVarT, aVar2.f(), (dlc.g) bVar.G.get(), (h2b.d) bVar.f263859y.get());
            case 21:
                return new b0((qle.b) bVar.z.get(), new ple.d(), (nle.b) bVar.A.get(), (uih.b) bVar.B.get(), (dlc.f) bVar.C.get(), (i5b.k) bVar.D.get(), (chh.e) bVar.E.get());
            case 22:
                return new qle.d();
            case 23:
                return new nle.f();
            case 24:
                wlh.c factory5 = (wlh.c) ((mkh.s) cVar.f263877p).p0.get();
                s.j(factory5);
                ole.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new wlh.f(factory5.f298481c, factory5.e, factory5.f, factory5.f298482g, factory5.f298486m);
            case 25:
                hmc.h factory6 = (hmc.h) cVar.f263873m.v.get();
                s.j(factory6);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                dlc.f fVar = factory6.f;
                s.k(fVar);
                return fVar;
            case 26:
                i5b.b componentsProvider3 = (i5b.b) cVar.f263874n.D.get();
                s.j(componentsProvider3);
                h2b.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(componentsProvider3, "componentsProvider");
                return componentsProvider3.f158797b;
            case 27:
                shh.g factory7 = (shh.g) cVar.o.f135236g.get();
                s.j(factory7);
                dhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                return new shh.i(factory7.f263480a, factory7.f263482c);
            case 28:
                hmc.h factory8 = (hmc.h) cVar.f263873m.v.get();
                s.j(factory8);
                Intrinsics.checkNotNullParameter(factory8, "factory");
                dlc.g gVar = factory8.e;
                s.k(gVar);
                return gVar;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        ske.c cVar = (ske.c) this.f258326c;
        ske.d dVar = (ske.d) this.d;
        int i = this.f258325b;
        switch (i) {
            case 0:
                d28.g gVar = dVar.f263885a;
                d28.f modelExtensionHolder = (d28.f) dVar.f263911w.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
                Set set = modelExtensionHolder.f110783b;
                s.k(set);
                return set;
            case 1:
                d28.g gVar2 = dVar.f263885a;
                ash.j widgetsView = dVar.f263887b;
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar.f263906s.get();
                ks0.n factory = new ks0.n(((p28.b) cVar.u).C, 21);
                he2.b dialogHostFinder = ehe.n.r();
                hsh.h widgetsExpandableDialogExtensionFactory = new hsh.h();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                Intrinsics.checkNotNullParameter(widgetsExpandableDialogExtensionFactory, "widgetsExpandableDialogExtensionFactory");
                kdh.b factory2 = new kdh.b(dialogHostFinder, widgetsExpandableDialogExtensionFactory, factory);
                d28.a swipeActionEventHandler = (d28.a) dVar.v.get();
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(swipeActionEventHandler, "swipeActionEventHandler");
                Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(swipeActionEventHandler, "swipeActionEventHandler");
                k39.b bVar = new k39.b(sri.o.c(controller.m2(), null, null, 14), 1);
                j60.c bottomDialogExtension = new j60.c(controller, new m(), (he2.b) factory2.f182899b);
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                nsh.p pVar = new nsh.p(bottomDialogExtension);
                ks0.n nVar = (ks0.n) factory2.f182900c;
                swipeActionEventHandler.getClass();
                p28.b investFeedWidgetApi = (p28.b) nVar.f189085b;
                p28.c cVar2 = new p28.c(investFeedWidgetApi, new p28.h(), bVar, pVar, pVar, swipeActionEventHandler);
                hsh.b widgetsApi = investFeedWidgetApi.f232104a;
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(24);
                builderBuilderWithExpectedSize.put("AnalyticsMedium", cVar2.f);
                builderBuilderWithExpectedSize.put("PopularFirstBuysDynamic", cVar2.f232138g);
                builderBuilderWithExpectedSize.put("CommoditiesMedium", cVar2.f232139h);
                builderBuilderWithExpectedSize.put("MostTradedDynamic", cVar2.i);
                builderBuilderWithExpectedSize.put("SymbolStandalone", cVar2.f232140j);
                builderBuilderWithExpectedSize.put("SymbolSmall", cVar2.k);
                builderBuilderWithExpectedSize.put("TopMoversDynamic", cVar2.f232141l);
                builderBuilderWithExpectedSize.put("WatchlistMedium", cVar2.f232142m);
                builderBuilderWithExpectedSize.put("WatchlistLarge", cVar2.f232143n);
                builderBuilderWithExpectedSize.put("WatchlistSymbol", cVar2.o);
                builderBuilderWithExpectedSize.put("WatchlistItems", cVar2.f232144p);
                builderBuilderWithExpectedSize.put("PopularFirstBuysCfdsDynamic", cVar2.f232145q);
                builderBuilderWithExpectedSize.put("CfdsPnLDriversDynamic", cVar2.f232146r);
                builderBuilderWithExpectedSize.put("RecommendedBuysDynamic", cVar2.f232147s);
                builderBuilderWithExpectedSize.put("PopularStocksDynamic", cVar2.f232148t);
                builderBuilderWithExpectedSize.put("PopularETFsDynamic", cVar2.u);
                builderBuilderWithExpectedSize.put("PopularCFDsDynamic", cVar2.v);
                builderBuilderWithExpectedSize.put("PopularBondsDynamic", cVar2.f232149w);
                builderBuilderWithExpectedSize.put("CollectionsDynamic", cVar2.f232150x);
                builderBuilderWithExpectedSize.put("CorporateEventsDynamic", cVar2.f232151y);
                builderBuilderWithExpectedSize.put("NewsDynamic", cVar2.z);
                builderBuilderWithExpectedSize.put("ProductsDynamic", cVar2.A);
                builderBuilderWithExpectedSize.put("TransactionsDynamic", cVar2.B);
                builderBuilderWithExpectedSize.put("WealthAutomationsDynamic", cVar2.C);
                ImmutableMap eventHandlers = builderBuilderWithExpectedSize.build();
                Intrinsics.checkNotNullParameter(widgetsApi, "widgetsApi");
                Intrinsics.checkNotNullParameter(investFeedWidgetApi, "investFeedWidgetApi");
                Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
                Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                nsh.o oVarJ = widgetsApi.a().J(widgetsView, investFeedWidgetApi, eventHandlers, investFeedWidgetApi.j());
                Set setB = y0.b(bottomDialogExtension);
                yji.n[] elements = {oVarJ, pVar};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new d28.f(oVarJ, setB, kotlin.collections.d.y0(elements));
            case 2:
                o5d.a swipeAssetTradeActionsExtension = (o5d.a) dVar.u.get();
                fle.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
                return new fle.d(swipeAssetTradeActionsExtension);
            case 3:
                return n57.a.u((o5d.c) dVar.f263908t.get());
            case 4:
                return n57.a.w(cVar.v.a(), dVar.f263889c);
            case 5:
                i0 factory3 = (i0) ((mkh.s) cVar.f263877p).T0.get();
                s.j(factory3);
                bih.l view = dVar.d;
                bih.a controllerModelExtension = (bih.a) dVar.E.get();
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                return new aah.g(view, controllerModelExtension);
            case 6:
                vhh.a aVar = cVar.f263877p;
                ske.a aVar2 = cVar.A;
                i0 factory4 = (i0) ((mkh.s) aVar).T0.get();
                s.j(factory4);
                w4f.b portfolioControllerExtension = (w4f.b) dVar.f263915y.get();
                dlc.a roboPortfoliosDetailsProvider = (dlc.a) dVar.z.get();
                ot5.a commodityAccountDetailsControllerExtension = (ot5.a) dVar.A.get();
                a5b.g marginAccountControllerExtension = (a5b.g) dVar.B.get();
                nlh.b wealthTradeCommandProvider = cVar.f.a();
                s.j(wealthTradeCommandProvider);
                clc.b roboOnboardingEntryCommandFactory = cVar.z.a();
                s.j(roboOnboardingEntryCommandFactory);
                l0 popupMenuDialogDisplayer = (l0) dVar.C.get();
                zhh.a cfdAccountActionsProvider = (zhh.a) aVar2.f.get();
                s.j(cfdAccountActionsProvider);
                zhh.a giaAccountActionsProvider = (zhh.a) aVar2.f263841c.get();
                s.j(giaAccountActionsProvider);
                zhh.a taaAccountActionsProvider = (zhh.a) aVar2.d.get();
                s.j(taaAccountActionsProvider);
                zhh.a roboAccountActionsProvider = (zhh.a) aVar2.e.get();
                s.j(roboAccountActionsProvider);
                xjh.b wealthActionsHandler = (xjh.b) dVar.D.get();
                ybl.k tradingAccountsInteractor = cVar.f263867g.d();
                s.j(tradingAccountsInteractor);
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(portfolioControllerExtension, "portfolioControllerExtension");
                Intrinsics.checkNotNullParameter(roboPortfoliosDetailsProvider, "roboPortfoliosDetailsProvider");
                Intrinsics.checkNotNullParameter(commodityAccountDetailsControllerExtension, "commodityAccountDetailsControllerExtension");
                Intrinsics.checkNotNullParameter(marginAccountControllerExtension, "marginAccountControllerExtension");
                Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
                Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                Intrinsics.checkNotNullParameter(cfdAccountActionsProvider, "cfdAccountActionsProvider");
                Intrinsics.checkNotNullParameter(giaAccountActionsProvider, "giaAccountActionsProvider");
                Intrinsics.checkNotNullParameter(taaAccountActionsProvider, "taaAccountActionsProvider");
                Intrinsics.checkNotNullParameter(roboAccountActionsProvider, "roboAccountActionsProvider");
                Intrinsics.checkNotNullParameter(wealthActionsHandler, "wealthActionsHandler");
                Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
                Intrinsics.checkNotNullParameter(portfolioControllerExtension, "portfolioControllerExtension");
                Intrinsics.checkNotNullParameter(roboPortfoliosDetailsProvider, "roboPortfoliosDetailsProvider");
                Intrinsics.checkNotNullParameter(commodityAccountDetailsControllerExtension, "commodityAccountDetailsControllerExtension");
                Intrinsics.checkNotNullParameter(marginAccountControllerExtension, "marginAccountControllerExtension");
                Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
                Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
                Intrinsics.checkNotNullParameter(cfdAccountActionsProvider, "cfdAccountActionsProvider");
                Intrinsics.checkNotNullParameter(giaAccountActionsProvider, "giaAccountActionsProvider");
                Intrinsics.checkNotNullParameter(taaAccountActionsProvider, "taaAccountActionsProvider");
                Intrinsics.checkNotNullParameter(roboAccountActionsProvider, "roboAccountActionsProvider");
                Intrinsics.checkNotNullParameter(wealthActionsHandler, "wealthActionsHandler");
                Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
                return new h0(portfolioControllerExtension, roboPortfoliosDetailsProvider, commodityAccountDetailsControllerExtension, marginAccountControllerExtension, factory4.f271744a, factory4.f271745b, factory4.f271746c, factory4.d, factory4.f271747g, factory4.f271748h, wealthTradeCommandProvider, factory4.f, roboOnboardingEntryCommandFactory, popupMenuDialogDisplayer, factory4.i, cfdAccountActionsProvider, giaAccountActionsProvider, taaAccountActionsProvider, roboAccountActionsProvider, wealthActionsHandler, tradingAccountsInteractor, factory4.f271749j, factory4.k, factory4.f271750l, factory4.f271751m, factory4.f271752n, new AnimationRequest(false));
            case 7:
                zdl.c cVar3 = cVar.f263882w.f21176a;
                ybl.d portfolioInteractor = cVar3.h();
                s.j(portfolioInteractor);
                ael.t portfolioBalanceInteractor = cVar3.f();
                s.j(portfolioBalanceInteractor);
                Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
                Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
                nd.o factory5 = new nd.o();
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new w4f.b(portfolioInteractor, portfolioBalanceInteractor);
            case 8:
                dmc.r rVar = cVar.f263873m;
                qmc.d dVarG = rVar.g();
                gte.a aVarB = rVar.d.b();
                s.j(aVarB);
                h9h.a aVar3 = rVar.f116028b;
                x8h.k kVarD = aVar3.d();
                toh.d dVarF = aVar3.F();
                qy5.a factory6 = new qy5.a(dVarG, aVarB, kVarD, dVarF);
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return new imc.b(dVarG, aVarB, kVarD, dVarF);
            case 9:
                ku5.g gVar3 = cVar.f263883x;
                ou5.b portfolioBalanceInteractor2 = gVar3.b();
                mu5.f cryptoInvestmentsInteractor = gVar3.d();
                wsg.n walletInteractor = gVar3.i.b();
                tj3.a commodityFeatureEnabledInteractor = gVar3.k.a();
                s.j(commodityFeatureEnabledInteractor);
                ppk.f ratesInteractor = gVar3.f189683h.a();
                mre.c termsNavigationFactory = gVar3.f189685l.b();
                s.j(termsNavigationFactory);
                lal.a commodityPositionsInteractor = gVar3.c();
                wt5.a cryptoInvestmentsCalculations = new wt5.a();
                Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
                r39.a commodityPositionsSorterInteractor = new r39.a();
                Intrinsics.checkNotNullParameter(portfolioBalanceInteractor2, "portfolioBalanceInteractor");
                Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
                Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
                Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
                Intrinsics.checkNotNullParameter(commodityPositionsInteractor, "commodityPositionsInteractor");
                Intrinsics.checkNotNullParameter(commodityPositionsSorterInteractor, "commodityPositionsSorterInteractor");
                nd.l factory7 = new nd.l();
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                return new qu5.b(portfolioBalanceInteractor2, commodityPositionsInteractor, commodityPositionsSorterInteractor, cryptoInvestmentsInteractor, walletInteractor, commodityFeatureEnabledInteractor, ratesInteractor, termsNavigationFactory);
            case 10:
                m2b.e eVar = cVar.f263884y;
                ybl.d dVarH = eVar.f201801a.h();
                s.j(dVarH);
                p2b.j jVar = (p2b.j) eVar.o.get();
                kge.d dVarA = eVar.a();
                p2b.f fVar = new p2b.f();
                f2b.b bVar2 = (f2b.b) eVar.f201810p.get();
                by5.a factory8 = new by5.a(dVarH, jVar, dVarA, fVar, bVar2);
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return new a5b.g(dVarH, jVar, dVarA, fVar, bVar2);
            case 11:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) dVar.f263906s.get();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new l0(controller2.m2());
            case 12:
                xjh.a factory9 = (xjh.a) ((mkh.s) cVar.f263877p).f206430w0.get();
                s.j(factory9);
                iih.a wealthActionTransferDestinationProvider = (iih.a) cVar.A.f263842g.get();
                s.j(wealthActionTransferDestinationProvider);
                ale.f investSettingsActionHandler = new ale.f();
                ale.l investTransferInvestmentsActionHandler = new ale.l();
                ske.c cVar4 = dVar.f263904r;
                oih.j jVarE = ((mkh.s) cVar4.f263877p).e();
                s.j(jVarE);
                ybl.k kVarD2 = cVar4.f263867g.d();
                s.j(kVarD2);
                ale.h investStartOnboardingActionHandler = new ale.h(jVarE, kVarD2);
                ske.c cVar5 = dVar.f263904r;
                ybl.k kVarD3 = cVar5.f263867g.d();
                s.j(kVarD3);
                oih.k kVar = (oih.k) ((mkh.s) cVar5.f263877p).R0.get();
                s.j(kVar);
                ale.j investTeenJisaStartOnboardingActionHandler = new ale.j(kVarD3, kVar);
                ale.c investHoldingsInformationActionHandler = new ale.c();
                ale.k investTradingAddOnActionHandler = new ale.k();
                ale.d investInviteFriendsActionHandler = new ale.d();
                gte.a featureToggleInteractor = cVar.f263878q.b();
                s.j(featureToggleInteractor);
                fle.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                Intrinsics.checkNotNullParameter(wealthActionTransferDestinationProvider, "wealthActionTransferDestinationProvider");
                Intrinsics.checkNotNullParameter(investSettingsActionHandler, "investSettingsActionHandler");
                Intrinsics.checkNotNullParameter(investTransferInvestmentsActionHandler, "investTransferInvestmentsActionHandler");
                Intrinsics.checkNotNullParameter(investStartOnboardingActionHandler, "investStartOnboardingActionHandler");
                Intrinsics.checkNotNullParameter(investTeenJisaStartOnboardingActionHandler, "investTeenJisaStartOnboardingActionHandler");
                Intrinsics.checkNotNullParameter(investHoldingsInformationActionHandler, "investHoldingsInformationActionHandler");
                Intrinsics.checkNotNullParameter(investTradingAddOnActionHandler, "investTradingAddOnActionHandler");
                Intrinsics.checkNotNullParameter(investInviteFriendsActionHandler, "investInviteFriendsActionHandler");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                hih.d[] elements2 = {investSettingsActionHandler, investTransferInvestmentsActionHandler, investHoldingsInformationActionHandler, investTradingAddOnActionHandler, investStartOnboardingActionHandler, investTeenJisaStartOnboardingActionHandler, investInviteFriendsActionHandler};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return factory9.a(wealthActionTransferDestinationProvider, kotlin.collections.d.y0(elements2), ((jte.d) featureToggleInteractor).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? q0.c(new Pair(ilc.a.GB, y0.b(hih.a.ROBO))) : zhm.r0.g());
            case 13:
                return xb1.a.C((j60.a) dVar.G.get());
            case 14:
                return xb1.a.e((com.revolut.kompot.navigable.a) dVar.f263906s.get(), new j60.e());
            case 15:
                return efk.j.d((dtl.a) dVar.J.get());
            case 16:
                return efk.j.q(cVar.B.a(), dVar.e, (dtl.b) dVar.I.get());
            case 17:
                return efk.j.r(cVar.B.a());
            case 18:
                r10.q factory10 = dVar.b();
                cle.i viewDelegate = (cle.i) dVar.N.get();
                dle.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory10, "factory");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                return new c84.w(viewDelegate);
            case 19:
                r10.q factory11 = dVar.b();
                cle.h view2 = dVar.f;
                cle.f router = (cle.f) dVar.M.get();
                cle.a presentationModel = (cle.a) dVar.L.get();
                dle.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory11, "factory");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                return new cle.n(view2, router, presentationModel);
            case 20:
                r10.q factory12 = dVar.b();
                cle.a presentationModel2 = (cle.a) dVar.L.get();
                dle.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory12, "factory");
                Intrinsics.checkNotNullParameter(presentationModel2, "presentationModel");
                Intrinsics.checkNotNullParameter(presentationModel2, "presentationModel");
                return new cle.j(presentationModel2, (q06.l) factory12.f250850c, (f80.a) factory12.d);
            case 21:
                r10.q factory13 = dVar.b();
                dle.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory13, "factory");
                return new cle.a((uke.b) factory13.f250849b);
            case 22:
                Object extension = (r60.b) dVar.Q.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar2 = (yji.d) extension;
                s.k(dVar2);
                return dVar2;
            case 23:
                com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) dVar.f263906s.get();
                p0 displayer = (p0) dVar.P.get();
                j60.e dialogHostFinder2 = new j60.e();
                Intrinsics.checkNotNullParameter(controller3, "controller");
                Intrinsics.checkNotNullParameter(displayer, "displayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder2, "dialogHostFinder");
                return new r60.d(controller3, displayer, dialogHostFinder2);
            case 24:
                return new p0();
            case 25:
                v0l.a factory14 = (v0l.a) ((kyk.v) cVar.F).O.get();
                s.j(factory14);
                sxk.c view3 = dVar.f263892g;
                sxk.a router2 = (sxk.a) dVar.S.get();
                sxk.b mapper = (sxk.b) dVar.T.get();
                txk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory14, "factory");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(router2, "router");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(router2, "router");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return new c84.w(new v0l.e(view3, router2));
            case 26:
                v0l.a factory15 = (v0l.a) ((kyk.v) cVar.F).O.get();
                s.j(factory15);
                txk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory15, "factory");
                return new w0l.a(factory15.f284925a);
            case 27:
                v0l.a factory16 = (v0l.a) ((kyk.v) cVar.F).O.get();
                s.j(factory16);
                txk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory16, "factory");
                return new v0l.b();
            case 28:
                xih.d factory17 = (xih.d) ((mkh.s) cVar.f263877p).f206418n0.get();
                s.j(factory17);
                whh.k view4 = dVar.f263893h;
                whh.h controllerModelExtension2 = (whh.h) dVar.W.get();
                xhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory17, "factory");
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension2, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension2, "controllerModelExtension");
                return new vzh.d(view4, controllerModelExtension2);
            case 29:
                xih.d factory18 = (xih.d) ((mkh.s) cVar.f263877p).f206418n0.get();
                s.j(factory18);
                whh.g isaActionHandler = (whh.g) dVar.V.get();
                xhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory18, "factory");
                Intrinsics.checkNotNullParameter(isaActionHandler, "isaAccountClosureWidgetActionHandler");
                Intrinsics.checkNotNullParameter(isaActionHandler, "isaActionHandler");
                return new xih.c(factory18.f306407b, factory18.d, factory18.f306408c, isaActionHandler);
            case 30:
                xih.d factory19 = (xih.d) ((mkh.s) cVar.f263877p).f206418n0.get();
                s.j(factory19);
                xhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory19, "factory");
                return new yih.a(factory19.f306408c);
            case 31:
                fih.a extensions = (fih.a) dVar.Z.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f135421a;
            case 32:
                gjh.f factory20 = (gjh.f) dVar.Y.get();
                fih.b view5 = dVar.i;
                l0 popupMenuDialogDisplayer2 = (l0) dVar.C.get();
                Intrinsics.checkNotNullParameter(factory20, "factory");
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer2, "popupMenuDialogDisplayer");
                factory20.getClass();
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer2, "popupMenuDialogDisplayer");
                gjh.e eVar2 = new gjh.e(factory20.f144299a, factory20.d, popupMenuDialogDisplayer2, factory20.f144301c);
                return new fih.a(new gjh.d(view5, eVar2), eVar2);
            case 33:
                djh.c factory21 = (djh.c) ((mkh.s) cVar.f263877p).Z0.get();
                s.j(factory21);
                Intrinsics.checkNotNullParameter(factory21, "factory");
                gjh.f fVar2 = factory21.f115390a;
                s.k(fVar2);
                return fVar2;
            case 34:
                gih.a extensions2 = (gih.a) dVar.c0.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f144216a;
            case 35:
                hjh.c factory22 = (hjh.c) dVar.f263888b0.get();
                gih.b view6 = dVar.f263895j;
                Intrinsics.checkNotNullParameter(factory22, "factory");
                Intrinsics.checkNotNullParameter(view6, "view");
                factory22.getClass();
                Intrinsics.checkNotNullParameter(view6, "view");
                f88.f fVar3 = new f88.f(factory22.f152820a);
                return new gih.a(new hjh.b(view6, fVar3), fVar3);
            case 36:
                djh.c factory23 = (djh.c) ((mkh.s) cVar.f263877p).Z0.get();
                s.j(factory23);
                Intrinsics.checkNotNullParameter(factory23, "factory");
                hjh.c cVar6 = factory23.f115391b;
                s.k(cVar6);
                return cVar6;
            case 37:
                return kii.e.j((u8h.b) cVar.G, "factory");
            case 38:
                return c21.l.j(cVar.f263884y.i(), (b2b.f) dVar.B.get());
            case 39:
                return n57.a.t((o5d.c) dVar.f263908t.get());
            case 40:
                fsl.t tVarA = cVar.H.a();
                s.j(tVarA);
                return fp8.c.p(tVarA, dVar.f263898m, (fsl.i) dVar.f263894h0.get());
            case 41:
                fsl.t tVarA2 = cVar.H.a();
                s.j(tVarA2);
                tzg.m mVarT = ((mkh.s) cVar.f263877p).d.t();
                s.j(mVarT);
                return fp8.c.q(tVarA2, new olh.b(mVarT));
            case 42:
                return ige.d.m(cVar.I.b(), (htl.g) dVar.j0.get(), (htl.d) dVar.f263896k0.get());
            case 43:
                return ige.d.n(cVar.I.b());
            case 44:
                trl.a aVar4 = cVar.J;
                xvl.g factory24 = new xvl.g();
                sdf.c screen = dVar.f263899n;
                sdf.b controllerModelExtension3 = (sdf.b) dVar.m0.get();
                tdf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory24, "factory");
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intrinsics.checkNotNullParameter(controllerModelExtension3, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intrinsics.checkNotNullParameter(controllerModelExtension3, "controllerModelExtension");
                return new xvl.e(screen, controllerModelExtension3);
            case 45:
                trl.a aVar5 = cVar.J;
                xvl.g factory25 = new xvl.g();
                tdf.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory25, "factory");
                return new xvl.f();
            case 46:
                return new rle.g(dVar.o, (rle.b) dVar.f263901o0.get());
            case 47:
                return new rle.h();
            case 48:
                xjh.b actionsHandler = (xjh.b) dVar.D.get();
                fle.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
                return actionsHandler.f306529a;
            case 49:
                d28.g gVar4 = dVar.f263885a;
                d28.f modelExtensionHolder2 = (d28.f) dVar.f263911w.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder2, "modelExtensionHolder");
                Set set2 = modelExtensionHolder2.f110784c;
                s.k(set2);
                return set2;
            case 50:
                return xb1.a.D((sb7.b) dVar.f263907s0.get());
            case 51:
                xb7.b bVarA = cVar.K.a();
                s.j(bVarA);
                return xb1.a.i(bVarA, (j60.a) dVar.G.get());
            case 52:
                l extension2 = new l((j60.a) dVar.G.get(), (sb7.b) dVar.f263907s0.get());
                Intrinsics.checkNotNullParameter(extension2, "extension");
                return extension2;
            case 53:
                return efk.j.e((dtl.b) dVar.I.get());
            case 54:
                fih.a extensions3 = (fih.a) dVar.Z.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f135422b;
            case 55:
                gih.a extensions4 = (gih.a) dVar.c0.get();
                Intrinsics.checkNotNullParameter(extensions4, "extensions");
                return extensions4.f144217b;
            case 56:
                return n57.a.v((o5d.c) dVar.f263908t.get());
            case 57:
                return n57.a.g((o5d.c) dVar.f263908t.get());
            case 58:
                return new ile.c();
            case 59:
                return j40.h.a(((h30.n) cVar.d).s());
            case 60:
                ubf.b factory26 = (ubf.b) cVar.L.M.get();
                s.j(factory26);
                ncf.a screen2 = dVar.f263902p;
                gle.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory26, "factory");
                Intrinsics.checkNotNullParameter(screen2, "screen");
                ubf.d dVar3 = (ubf.d) factory26.f278854a.f265379c;
                return new icf.b(screen2, (mbf.c) dVar3.I.get(), (xbf.g) dVar3.K.get());
            case 61:
                mkd.g view7 = dVar.f263903q;
                rkd.m factory27 = cVar.M.a();
                s.j(factory27);
                gle.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(factory27, "factory");
                return factory27.a(view7);
            case 62:
                w51.a aVarB2 = cVar.N.b();
                s.j(aVarB2);
                return new lle.b(aVarB2, cVar.M.c());
            case 63:
                ske.c cVar7 = dVar.f263904r;
                ske.c cVar8 = dVar.f263904r;
                ske.a aVar6 = cVar7.A;
                h9h.a aVar7 = cVar7.i;
                zhh.a aVar8 = (zhh.a) aVar6.f263841c.get();
                s.j(aVar8);
                zhh.a aVar9 = (zhh.a) aVar6.d.get();
                s.j(aVar9);
                zhh.a aVar10 = (zhh.a) aVar6.e.get();
                s.j(aVar10);
                zhh.a aVar11 = (zhh.a) aVar6.f.get();
                s.j(aVar11);
                gte.a aVarB3 = cVar7.f263878q.b();
                s.j(aVarB3);
                wbf.a aVar12 = (wbf.a) cVar7.L.G.get();
                s.j(aVar12);
                ybl.l lVarF = aVar7.f();
                CoroutineScope coroutineScope = (CoroutineScope) cVar7.i0.get();
                ybl.k kVarD4 = cVar7.f263867g.d();
                s.j(kVarD4);
                tzg.m mVarT2 = aVar7.t();
                s.j(mVarT2);
                zke.g gVar5 = new zke.g(aVar8, aVar9, aVar10, aVar11, aVarB3, aVar12, lVarF, coroutineScope, kVarD4, mVarT2);
                xjh.b bVar3 = (xjh.b) dVar.D.get();
                obb.a aVar13 = cVar.O;
                h9h.a aVar14 = cVar.i;
                kbb.c cVarA = aVar13.a();
                wif.a aVarA = cVar.P.a();
                tzg.m mVarT3 = aVar14.t();
                s.j(mVarT3);
                ybl.l lVarF2 = aVar14.f();
                tzg.l lVar = (tzg.l) aVar14.u0.get();
                s.j(lVar);
                bn2.p pVarC = cVar.Q.c();
                nwg.a factory28 = ((ewg.h) cVar.R).a();
                ske.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory28, "factory");
                kwg.l lVarA = factory28.a(gwg.a.TRADING);
                hih.e eVar3 = (hih.e) ((mkh.s) cVar8.f263877p).f206432x0.get();
                s.j(eVar3);
                q1 q1Var = new q1();
                itb.c cVarB = cVar8.O.b();
                s.j(cVarB);
                jle.a aVar15 = (jle.a) dVar.F0.get();
                kla.a aVarA2 = cVar8.S.a();
                whh.i iVar = (whh.i) dVar.G0.get();
                bih.c cVar9 = (bih.c) dVar.H0.get();
                hjh.f fVar4 = (hjh.f) dVar.I0.get();
                gjh.g gVar6 = (gjh.g) dVar.J0.get();
                fsl.k kVar2 = (fsl.k) dVar.K0.get();
                cle.g gVar7 = (cle.g) dVar.L0.get();
                sxk.b bVar4 = (sxk.b) dVar.T.get();
                nbh.a instrumentImageProvider = new nbh.a();
                Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                com.revolut.feature.tab.invest.impl.ui.home.g gVar8 = new com.revolut.feature.tab.invest.impl.ui.home.g(eVar3, q1Var, cVarB, aVar15, aVarA2, iVar, cVar9, fVar4, gVar6, kVar2, gVar7, bVar4, new xvl.i(), new rle.i(), (d1h.h) dVar.M0.get(), new t5d.d());
                mbf.a aVar16 = (mbf.a) cVar.L.Q.get();
                s.j(aVar16);
                a87.c cVar10 = new a87.c(((y77.i) cVar.T).f311406a.f(), 0);
                h9h.a aVar17 = cVar8.i;
                tzg.m mVarT4 = aVar17.t();
                s.j(mVarT4);
                tzg.l lVar2 = (tzg.l) aVar17.u0.get();
                s.j(lVar2);
                xke.e eVar4 = new xke.e(mVarT4, lVar2);
                x8h.p0 p0Var = new x8h.p0((WorkManager) aVar14.i0.get());
                utk.f fVarJ = cVar.U.f136167c.j();
                ble.c cVar11 = (ble.c) cVar.p0.get();
                j40.a aVar18 = (j40.a) dVar.B0.get();
                q28.a aVar19 = (q28.a) ((p28.b) cVar.u).B0.get();
                s.j(aVar19);
                r10.q qVarD = cVar.V.d();
                r10.d dVarE = ((zc6.a) cVar.W).e();
                ybl.k kVarD5 = cVar.f263867g.d();
                s.j(kVarD5);
                bih.a aVar20 = (bih.a) dVar.E.get();
                whh.h hVar = (whh.h) dVar.W.get();
                sb7.b bVar5 = (sb7.b) dVar.f263907s0.get();
                fsl.m mVarB = cVar.H.b();
                s.j(mVarB);
                cle.f fVar5 = (cle.f) dVar.M.get();
                gte.a aVarB4 = cVar.f263878q.b();
                s.j(aVarB4);
                sxk.a aVar21 = (sxk.a) dVar.S.get();
                x8h.k kVarD6 = aVar14.d();
                mkd.d dVar4 = (mkd.d) dVar.D0.get();
                eih.a aVar22 = (eih.a) dVar.N0.get();
                ash.e eVar5 = (ash.e) dVar.O0.get();
                ble.b bVar6 = (ble.b) cVar.q0.get();
                tul.b bVar7 = new tul.b((vrl.o) cVar.J.X.get());
                h9h.a aVar23 = cVar8.i;
                tzg.m mVarT5 = aVar23.t();
                s.j(mVarT5);
                gte.a aVarB5 = cVar8.f263878q.b();
                s.j(aVarB5);
                rle.j jVar2 = new rle.j(mVarT5, aVarB5, aVar23.f());
                ybl.k kVarD7 = cVar8.f263867g.d();
                s.j(kVarD7);
                ang.f fVarE = cVar8.V.e();
                ybl.d dVarH2 = cVar8.f263879r.h();
                s.j(dVarH2);
                hle.a aVar24 = new hle.a(kVarD7, fVarE, dVarH2);
                d1h.e eVar6 = (d1h.e) dVar.f263891e0.get();
                o5d.a aVar25 = (o5d.a) dVar.u.get();
                t5d.f fVar6 = new t5d.f();
                ile.a aVar26 = (ile.a) dVar.A0.get();
                fk3.a aVarA3 = cVar.Y.a();
                s.j(aVarA3);
                y2f.a aVarB6 = cVar.f263882w.b();
                s.j(aVarB6);
                return new com.revolut.feature.tab.invest.impl.ui.home.f(gVar5, bVar3, cVarA, aVarA, mVarT3, lVarF2, lVar, pVarC, lVarA, gVar8, aVar16, cVar10, eVar4, p0Var, fVarJ, cVar11, aVar18, aVar19, qVarD, dVarE, kVarD5, aVar20, hVar, bVar5, mVarB, fVar5, aVarB4, aVar21, kVarD6, dVar4, aVar22, eVar5, bVar6, bVar7, jVar2, aVar24, eVar6, aVar25, fVar6, aVar26, aVarA3, aVarB6, cVar.Z.b());
            case 64:
                kla.a productIntroToggleResolver = cVar.S.a();
                Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
                return new jle.d();
            case 65:
                xih.d factory29 = (xih.d) ((mkh.s) cVar.f263877p).f206418n0.get();
                s.j(factory29);
                xhh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory29, "factory");
                return new xih.g(factory29.f306406a);
            case 66:
                i0 factory30 = (i0) ((mkh.s) cVar.f263877p).T0.get();
                s.j(factory30);
                cih.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory30, "factory");
                return factory30.e;
            case 67:
                hjh.c factory31 = (hjh.c) dVar.f263888b0.get();
                Intrinsics.checkNotNullParameter(factory31, "factory");
                hjh.f fVar7 = factory31.f152821b;
                s.k(fVar7);
                return fVar7;
            case 68:
                gjh.f factory32 = (gjh.f) dVar.Y.get();
                Intrinsics.checkNotNullParameter(factory32, "factory");
                gjh.g gVar9 = factory32.f144300b;
                s.k(gVar9);
                return gVar9;
            case 69:
                fsl.t tVarA3 = cVar.H.a();
                s.j(tVarA3);
                return fp8.c.r(tVarA3, cVar.I.a());
            case 70:
                r10.q factory33 = dVar.b();
                dle.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory33, "factory");
                return new cle.k();
            case 71:
                return kii.e.k((u8h.b) cVar.G);
            case 72:
                djh.c factory34 = (djh.c) ((mkh.s) cVar.f263877p).Z0.get();
                s.j(factory34);
                Intrinsics.checkNotNullParameter(factory34, "factory");
                eih.a aVar27 = factory34.f115392c;
                s.k(aVar27);
                return aVar27;
            case 73:
                d28.g gVar10 = dVar.f263885a;
                d28.f modelExtensionHolder3 = (d28.f) dVar.f263911w.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder3, "modelExtensionHolder");
                return modelExtensionHolder3.f110782a;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        sm1.c cVar = (sm1.c) this.d;
        sm1.d dVar = (sm1.d) this.f258326c;
        npf.a aVar = dVar.f264314j;
        l70.e eVar = dVar.i;
        int i = this.f258325b;
        if (i == 0) {
            in1.h hVar = cVar.f264306a;
            w80.b bVarJ = eVar.j();
            s.j(bVarJ);
            zof.f fVarD = aVar.d();
            s.j(fVarD);
            sm1.d dVar2 = cVar.f264307b;
            vo9.a aVarB = ((ut9.a) dVar2.f).b();
            s.j(aVarB);
            gte.a aVarB2 = dVar2.f264312g.b();
            s.j(aVarB2);
            return new in1.s(hVar, bVarJ, fVarD, new gn1.b(aVarB, aVarB2, dVar2.f264313h.b()), new l2j.a(), (cli.n) cVar.e.get());
        }
        if (i == 1) {
            yof.d dVar3 = (yof.d) cVar.d.get();
            u80.o oVar = new u80.o();
            w80.b bVarJ2 = eVar.j();
            s.j(bVarJ2);
            l80.e eVarH = eVar.h();
            s.j(eVarH);
            return new in1.m(dVar3, oVar, bVarJ2, eVarH);
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            ldd.a factory = new ldd.a();
            jn1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return new ldd.b();
        }
        ppf.a factory2 = aVar.b();
        s.j(factory2);
        ldd.b delegate = (ldd.b) cVar.f264308c.get();
        jn1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory2, "factory");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return ppf.a.a(delegate);
    }

    private final Object n() {
        int i = this.f258325b;
        if (i == 0) {
            return new tm1.h((en1.a) ((sm1.d) this.f258326c).f264316m.get(), (cli.n) ((sm1.f) this.d).f264322a.get());
        }
        if (i == 1) {
            return new tm1.g();
        }
        throw new AssertionError(i);
    }

    private final Object o() {
        sm1.d dVar = (sm1.d) this.f258326c;
        ava.a aVar = dVar.d;
        sm1.j jVar = (sm1.j) this.d;
        sm1.d dVar2 = jVar.f264333b;
        int i = this.f258325b;
        if (i == 0) {
            return j.k((j60.a) jVar.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) jVar.f264334c.get(), (m) jVar.d.get());
        }
        if (i == 2) {
            return new m();
        }
        if (i != 3) {
            if (i == 4) {
                return new mn1.s();
            }
            throw new AssertionError(i);
        }
        mn1.i iVar = jVar.f264332a;
        wo1.b bVarB = ((up1.e) dVar.f264311c).b();
        s.j(bVarB);
        xua.a aVarA = aVar.a();
        s.j(aVarA);
        wj0.a aVarI = ((nj0.d) dVar.f264309a).i();
        s.j(aVarI);
        sf0.h hVarB = dVar2.e.b();
        s.j(hVarB);
        mn1.r rVar = new mn1.r(hVarB);
        dva.a aVar2 = (dva.a) aVar.f9975s.get();
        s.j(aVar2);
        vo9.a aVarB = ((ut9.a) dVar2.f).b();
        s.j(aVarB);
        gte.a aVarB2 = dVar2.f264312g.b();
        s.j(aVarB2);
        return new mn1.b0(iVar, bVarB, aVarA, aVarI, rVar, aVar2, new gn1.b(aVarB, aVarB2, dVar2.f264313h.b()), new l2j.a(), (cli.n) jVar.f264335g.get());
    }

    private final Object p() {
        sm1.d dVar = (sm1.d) this.f258326c;
        int i = this.f258325b;
        if (i != 0) {
            if (i == 1) {
                return new wm1.f();
            }
            throw new AssertionError(i);
        }
        xua.a aVarA = dVar.d.a();
        s.j(aVarA);
        return new wm1.h(aVarA, (nm1.c) dVar.o.get(), (qm1.h) dVar.f264318p.get(), (cli.n) ((sm1.l) this.d).f264339a.get());
    }

    private final Object q() {
        int i = this.f258325b;
        if (i == 0) {
            return new yrh.d((jki.p) ((srh.e) this.d).f265225a.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        xjl.s webSignInUiFactory = (xjl.s) ((srh.b) this.f258326c).f265216a.f216604c.get();
        s.j(webSignInUiFactory);
        Intrinsics.checkNotNullParameter(webSignInUiFactory, "webSignInUiFactory");
        return new yrh.f();
    }

    private final Object r() {
        xv.c cVar;
        sw.c cVar2 = (sw.c) this.f258326c;
        sw.d dVar = (sw.d) this.d;
        int i = this.f258325b;
        switch (i) {
            case 0:
                d4m.a delegate = e4m.b.a(dVar.C);
                d4m.a e2eTestDelegate = e4m.b.a(dVar.D);
                boolean zBooleanValue = dVar.f266055h.booleanValue();
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                Intrinsics.checkNotNullParameter(e2eTestDelegate, "e2eTestDelegate");
                nd.o delegateFactory = new nd.o();
                pw.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
                od0.a aVar = od0.a.f224253a;
                if (od0.a.i() || zBooleanValue) {
                    Object obj2 = e2eTestDelegate.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    cVar = (xv.c) obj2;
                } else {
                    Object obj3 = delegate.get();
                    Intrinsics.h(obj3);
                    cVar = (xv.c) obj3;
                }
                s.k(cVar);
                return cVar;
            case 1:
                LifecycleOwner lifecycleOwner = dVar.f266051a;
                sw.c cVar3 = dVar.i;
                aw.l lVar = (aw.l) dVar.f266056j.get();
                yw.h hVar = dVar.f266052b;
                bw.n nVar = (bw.n) dVar.f266059n.get();
                j0 j0Var = (j0) dVar.f266061q.get();
                aw.w wVar = (aw.w) dVar.f266062r.get();
                ax.a aVar2 = (ax.a) dVar.f266060p.get();
                ww.b bVar = (ww.b) dVar.f266064t.get();
                d4m.a aVarA = e4m.b.a(dVar.f266066x);
                d4m.a aVarA2 = e4m.b.a(dVar.f266065w);
                d4m.a aVarA3 = e4m.b.a(dVar.z);
                d4m.a aVarA4 = e4m.b.a(dVar.f266067y);
                gw.d0 d0Var = new gw.d0((aw.u) dVar.f266058m.get(), (bw.t) cVar3.f266048g.get(), new fn2.c((bw.t) cVar3.f266048g.get()), dVar.b(), (Clock) dVar.A.get(), dVar.e);
                aw.l lVar2 = (aw.l) dVar.f266056j.get();
                LifecycleOwner lifecycleOwner2 = dVar.f266051a;
                aw.u uVar = (aw.u) dVar.f266058m.get();
                mp.p pVarA = dVar.a();
                Clock clock = (Clock) dVar.A.get();
                yv.b.Companion.getClass();
                elm.g gVar = skm.p0.f264002b;
                s.k(gVar);
                return new aw.k(lifecycleOwner, lVar, hVar, nVar, j0Var, wVar, aVar2, bVar, aVarA, aVarA2, aVarA3, aVarA4, d0Var, new gw.u(lVar2, lifecycleOwner2, uVar, pVarA, clock, gVar, new fn2.c((bw.t) cVar3.f266048g.get()), dVar.b(), dVar.f), new gw.e(dVar.a(), (Clock) dVar.A.get(), (qw.a) cVar3.f266049h.get(), new fn2.c((bw.t) cVar3.f266048g.get()), dVar.b(), new hw.a(), (bw.t) cVar3.f266048g.get(), dVar.f266054g), new bw.i((aw.u) dVar.f266058m.get(), new a5h.g((dw.j) dVar.B.get(), (Executor) dVar.f266057l.get(), (bw.f) dVar.k.get(), dVar.f266051a), new bw.g()), new bw.c(dVar.f266052b, new bw.g()));
            case 2:
                return new aw.l(cVar2.f266045a);
            case 3:
                return new bw.n((xv.d) dVar.f266058m.get(), (Executor) dVar.f266057l.get(), dVar.f266052b, (qw.a) cVar2.f266049h.get(), new bw.h(), new bw.e());
            case 4:
                yw.h settings = dVar.f266052b;
                Intrinsics.checkNotNullParameter(settings, "settings");
                s.k(settings);
                return new aw.u(settings, (bw.f) dVar.k.get(), (Executor) dVar.f266057l.get());
            case 5:
                return new bw.q((qw.a) cVar2.f266049h.get(), (nw.a) cVar2.f266050j.get(), dVar.f266052b);
            case 6:
                yv.b.Companion.getClass();
                Executor executorHighPriorityExecutor = CameraXExecutors.highPriorityExecutor();
                Intrinsics.checkNotNullExpressionValue(executorHighPriorityExecutor, "highPriorityExecutor(...)");
                s.k(executorHighPriorityExecutor);
                return executorHighPriorityExecutor;
            case 7:
                Context context = cVar2.f266045a;
                yw.h hVar2 = dVar.f266052b;
                sw.c cVar4 = dVar.i;
                return new j0(context, hVar2, dVar.f266051a, new bw.g(), new zq.a((zw.g) dVar.o.get(), (vw.p) cVar4.k.get()), new jpc.e(new kl.b0((ax.a) dVar.f266060p.get()), new jw.e(cVar4.f266045a), new kw.a()));
            case 8:
                Context context2 = cVar2.f266045a;
                zw.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new zw.g(context2, new zw.f(), new zw.c());
            case 9:
                return new ax.a(cVar2.f266045a);
            case 10:
                return new aw.w(dVar.f266053c);
            case 11:
                return new ww.b((pw.c) dVar.f266063s.get());
            case 12:
                pw.e.Companion.getClass();
                return new pw.c();
            case 13:
                dw.b surfaceProcessor = (dw.b) dVar.f266065w.get();
                Intrinsics.checkNotNullParameter(surfaceProcessor, "surfaceProcessor");
                return new dw.l(1, surfaceProcessor.f118164b.d, surfaceProcessor, new a70.a(surfaceProcessor, 1));
            case 14:
                HandlerThread glThread = (HandlerThread) dVar.u.get();
                dw.j renderer = (dw.j) dVar.v.get();
                yv.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(glThread, "glThread");
                Intrinsics.checkNotNullParameter(renderer, "renderer");
                return new dw.b(glThread, renderer);
            case 15:
                yv.b.Companion.getClass();
                return new HandlerThread("REVOLUT_OPENGL_THREAD");
            case 16:
                Context context3 = cVar2.f266045a;
                yv.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context3, "context");
                return new dw.j(context3);
            case 17:
                return new dw.v((dw.u) dVar.f266067y.get());
            case 18:
                dw.s renderer2 = new dw.s(dVar.i.f266045a, new fw.b());
                yv.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(renderer2, "renderer");
                return new dw.u(renderer2);
            case 19:
                yv.b.Companion.getClass();
                Clock clockSystemUTC = Clock.systemUTC();
                Intrinsics.checkNotNullExpressionValue(clockSystemUTC, "systemUTC(...)");
                s.k(clockSystemUTC);
                return clockSystemUTC;
            case 20:
                dw.j impl = (dw.j) dVar.v.get();
                yv.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                s.k(impl);
                return impl;
            case 21:
                return new aw.r(dVar.f266051a, (aw.l) dVar.f266056j.get(), dVar.f266052b, (bw.n) dVar.f266059n.get(), (j0) dVar.f266061q.get(), (aw.u) dVar.f266058m.get(), (aw.w) dVar.f266062r.get(), (ax.a) dVar.f266060p.get(), (ww.b) dVar.f266064t.get(), (vw.p) cVar2.k.get());
            case 22:
                ww.b cameraPerformanceTracker = (ww.b) dVar.f266064t.get();
                pw.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(cameraPerformanceTracker, "cameraPerformanceTracker");
                s.k(cameraPerformanceTracker);
                return cameraPerformanceTracker;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object cVar2;
        Object iVar;
        switch (this.f258324a) {
            case 0:
                b bVar = (b) this.f258326c;
                jt0.b bVar2 = (jt0.b) this.d;
                int i = this.f258325b;
                if (i != 0) {
                    if (i == 1) {
                        return new e0();
                    }
                    throw new AssertionError(i);
                }
                czc.l0 l0Var = new czc.l0((pyc.h) bVar.f258304t.get(), (czc.b) ((e4m.e) bVar2.f178266c).get(), (pyc.f) bVar.f258302r.get());
                kli.a.p(l0Var, bq.i.d(((c) bVar2.f178265b).f258307a));
                return l0Var;
            case 1:
                s2j.e eVar = (s2j.e) this.f258326c;
                s2j.d dVar = (s2j.d) this.d;
                int i2 = this.f258325b;
                switch (i2) {
                    case 0:
                        dVar.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(dVar.f259368a));
                    case 1:
                        Context contextI = bq.i.i(dVar.f259368a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar.f259368a);
                        t70.g gVarO = eVar.f259377a.o();
                        s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) dVar.f.get(), gsi.c.a(dVar.f259368a));
                    case 3:
                        return new rpi.b(bq.i.b(dVar.f259368a));
                    case 4:
                        return new rpi.h(bq.i.b(dVar.f259368a));
                    case 5:
                        return new k3l.d(bq.i.b(dVar.f259368a));
                    case 6:
                        cVar = new iri.g((iri.j) eVar.f259384m.get(), new iri.b(), bq.i.f(dVar.f259368a), bq.i.l(dVar.f259368a));
                        break;
                    case 7:
                        return new iri.l(new iri.b(), bq.i.f(dVar.f259368a), (iri.d) dVar.k.get());
                    case 8:
                        return new iri.d(bq.i.f(dVar.f259368a));
                    case 9:
                        return kpi.f.a();
                    case 10:
                        sri.m navigator = bq.i.l(dVar.f259368a);
                        wsg.n walletInteractor = eVar.f259378b.b();
                        tpi.j progressView = (tpi.j) dVar.f259371g.get();
                        f9b.f errorView = (f9b.f) dVar.f259376n.get();
                        s2j.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(navigator, "navigator");
                        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                        Intrinsics.checkNotNullParameter(progressView, "progressView");
                        Intrinsics.checkNotNullParameter(errorView, "errorView");
                        return new ada.b(navigator);
                    case 11:
                        return bq.i.t(dVar.f259368a);
                    default:
                        throw new AssertionError(i2);
                }
                return cVar;
            case 2:
                int i3 = this.f258325b;
                if (i3 == 0) {
                    return new p4a.j(((k) this.f258326c).O.f136165a.i(), (jki.p) ((s3a.b) this.d).f259484a.get());
                }
                if (i3 == 1) {
                    return new p4a.k();
                }
                throw new AssertionError(i3);
            case 3:
                k kVar = (k) this.f258326c;
                s3a.c cVar3 = (s3a.c) this.d;
                int i5 = this.f258325b;
                switch (i5) {
                    case 0:
                        fd6.a aVar = (fd6.a) cVar3.d.get();
                        g.t(aVar);
                        return aVar;
                    case 1:
                        return g.s(((zc6.a) kVar.f259551w).d(), (xc6.a) cVar3.f259488c.get());
                    case 2:
                        return r6.b.k((zc6.a) kVar.f259551w, "factory");
                    case 3:
                        return f0k.d.p((e60.a) cVar3.o.get());
                    case 4:
                        com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) cVar3.f259489g.get();
                        g60.a aVarA = v.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get());
                        Activity activityA = t.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get());
                        t80.g gVar = (t80.g) cVar3.f259490h.get();
                        com.revolut.kompot.navigable.a aVar3 = (com.revolut.kompot.navigable.a) cVar3.f259489g.get();
                        y.a(aVar3);
                        d4m.a aVarA2 = e4m.b.a(cVar3.i);
                        nli.a aVar4 = new nli.a((t80.c) cVar3.f259491j.get(), t.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get()));
                        t80.g gVar2 = (t80.g) cVar3.f259490h.get();
                        zk0.b bVarL = cVar3.f259487b.f259532g.l();
                        s.j(bVarL);
                        return v1.c.q(aVar2, new t80.v(aVarA, activityA, gVar, aVar3, aVarA2, aVar4, new oli.c(gVar2, bVarL, new nli.a((t80.c) cVar3.f259491j.get(), t.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get())), v.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get()), cVar3.c()), new oli.g(u.a(t.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get())), v1.c.e((com.revolut.kompot.navigable.a) cVar3.f259489g.get()), new ami.n(e4m.b.a(cVar3.k), 1), e4m.b.a(cVar3.i), (t80.g) cVar3.f259490h.get(), new nli.a((t80.c) cVar3.f259491j.get(), t.a((com.revolut.kompot.navigable.a) cVar3.f259489g.get())), new i90.b(), cVar3.b(), cVar3.c()), cVar3.c()), x.a(), (m) cVar3.f259492l.get(), (e60.t) cVar3.f259494n.get());
                    case 5:
                        f80.a aVarX = kVar.f259532g.x();
                        s.j(aVarX);
                        return new t80.x(aVarX, new i90.b());
                    case 6:
                        com.revolut.kompot.navigable.a aVar5 = (com.revolut.kompot.navigable.a) cVar3.f259489g.get();
                        y.a(aVar5);
                        return pli.c.a(new ks0.n(aVar5));
                    case 7:
                        ll9.b payWithPhotoExtensionFactory = ((fl9.a) kVar.Z).a();
                        m4a.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(payWithPhotoExtensionFactory, "payWithPhotoExtensionFactory");
                        return new t80.c(new e.a("pay_with_photo"), 20971520L);
                    case 8:
                        return t96.a.a();
                    case 9:
                        return z.a();
                    case 10:
                        o oVar = (o) cVar3.f259493m.get();
                        y80.a aVarR = kVar.f259532g.r();
                        s.j(aVarR);
                        return new e60.y(oVar, aVarR, cVar3.b(), Optional.empty());
                    case 11:
                        Object extension = (t4a.a) cVar3.f259496q.get();
                        m4a.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        s.k(nVar);
                        return nVar;
                    case 12:
                        hr6.l lVarL = cVar3.f259487b.f259526a0.l();
                        s.j(lVarL);
                        i3a.b bVar3 = new i3a.b(lVarL);
                        k kVar2 = cVar3.f259487b;
                        uo9.a aVar6 = (uo9.a) ((ut9.a) kVar2.P).f283044p.get();
                        s.j(aVar6);
                        gr6.s sVar = (gr6.s) kVar2.f259526a0.y0.get();
                        s.j(sVar);
                        return new t4a.c(bVar3, new u4a.d(aVar6, sVar, kVar2.f.e()), new t4a.d());
                    case 13:
                        return g.u((xc6.a) cVar3.f259488c.get());
                    case 14:
                        al9.a extension2 = (al9.a) cVar3.f259499t.get();
                        m4a.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        s.k(extension2);
                        return extension2;
                    case 15:
                        ll9.b payWithPhotoExtensionFactory2 = ((fl9.a) kVar.Z).a();
                        e60.a mediaPickerControllerExtension = (e60.a) cVar3.o.get();
                        m4a.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(payWithPhotoExtensionFactory2, "payWithPhotoExtensionFactory");
                        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
                        return payWithPhotoExtensionFactory2.a(mediaPickerControllerExtension);
                    case 16:
                        e60.t tVar = (e60.t) cVar3.f259494n.get();
                        w.a(tVar);
                        return tVar;
                    case 17:
                        n3a.a aVar7 = (n3a.a) kVar.y0.get();
                        k kVar3 = cVar3.f259487b;
                        NewTransferScreenContract$InputData newTransferScreenContract$InputData = cVar3.f259486a;
                        k kVar4 = cVar3.f259487b;
                        r0 r0VarA = kVar3.D.a();
                        fx9.a aVarA3 = kVar3.f259535j.a();
                        s.j(aVarA3);
                        x2k.e eVar2 = new x2k.e();
                        y8k.b bVarA = kVar3.f259548t.a();
                        rq9.a aVarA4 = kVar3.d.a();
                        s.j(aVarA4);
                        oy1.b bVarB = kVar3.E.b();
                        un9.a aVarD = kVar3.f259537l.d();
                        s.j(aVarD);
                        p38.a aVarA5 = kVar3.F.a();
                        s.j(aVarA5);
                        lo5.p pVarB = ((yo5.w) kVar3.e).b();
                        s.j(pVarB);
                        h3a.l lVar = new h3a.l(r0VarA, aVarA3, eVar2, bVarA, aVarA4, bVarB, aVarD, aVarA5, pVarB);
                        h3a.t tVarJ = cVar3.j();
                        g3k.a aVar8 = (g3k.a) kVar4.f259528b0.f232493x.get();
                        s.j(aVar8);
                        o4a.c cVar4 = new o4a.c(tVarJ, aVar8, kVar4.f.e());
                        rq9.a aVarA6 = kVar4.d.a();
                        s.j(aVarA6);
                        lo5.p pVarB2 = ((yo5.w) kVar4.e).b();
                        s.j(pVarB2);
                        oy1.b bVarB2 = kVar4.E.b();
                        wp1.c cVar5 = (wp1.c) ((up1.e) kVar4.R).o.get();
                        s.j(cVar5);
                        com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b bVar4 = new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b(aVarA6, pVarB2, bVarB2, cVar5);
                        h3a.p pVar = new h3a.p();
                        lal.a aVar9 = new lal.a((d3a.b) kVar4.f259534h0.get(), (h) kVar4.f259554x0.get(), new o4a.d(new h3a.a(cVar3.j())), ((oq8.a) kVar4.V).a());
                        h3a.n nVar2 = new h3a.n();
                        oy1.b bVarB3 = kVar.E.b();
                        yn3.d dVarA = kVar.c0.a();
                        ang.f fVarE = kVar.f.e();
                        t4a.a aVar10 = (t4a.a) cVar3.f259496q.get();
                        i4b.f fVarB = ((zc6.a) kVar.f259551w).b();
                        al9.a aVar11 = (al9.a) cVar3.f259499t.get();
                        l3a.b bVar5 = (l3a.b) kVar4.A0.get();
                        com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a aVar12 = new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a();
                        n4a.f fVar = new n4a.f();
                        n4a.e eVar3 = new n4a.e(new n4a.b());
                        zjh.j jVarC = ((zc6.a) kVar4.f259551w).c();
                        fl9.a aVar13 = (fl9.a) kVar4.Z;
                        gte.a aVarB = aVar13.e.b();
                        s.j(aVarB);
                        return new k4a.u(aVar7, lVar, cVar4, bVar4, pVar, aVar9, newTransferScreenContract$InputData, nVar2, bVarB3, dVarA, fVarE, aVar10, fVarB, aVar11, new k4a.x(newTransferScreenContract$InputData, bVar5, aVar12, fVar, eVar3, jVarC, new fn2.c(new dl9.c(new zq.a(aVarB, aVar13.f.a())))));
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                int i6 = this.f258325b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new x3a.m();
                    }
                    throw new AssertionError(i6);
                }
                t3a.f fVar2 = (t3a.f) ((k) this.f258326c).f259550v0.get();
                s3a.e eVar4 = (s3a.e) this.d;
                return new x3a.l(fVar2, eVar4.f259504a, (cli.n) eVar4.f259505b.get());
            case 5:
                k kVar5 = (k) this.f258326c;
                int i21 = this.f258325b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new z3a.l();
                    }
                    throw new AssertionError(i21);
                }
                y80.a aVarR2 = kVar5.f259532g.r();
                s.j(aVarR2);
                cl3.a aVarD2 = kVar5.f259525a.d();
                s.j(aVarD2);
                s3a.f fVar3 = (s3a.f) this.d;
                return new com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a(aVarR2, aVarD2, fVar3.f259507a, (cli.n) fVar3.f259508b.get());
            case 6:
                s3a.g gVar3 = (s3a.g) this.d;
                k kVar6 = gVar3.f259511b;
                k kVar7 = (k) this.f258326c;
                l70.e eVar5 = kVar7.f259532g;
                zc6.b bVar6 = kVar7.f259551w;
                int i22 = this.f258325b;
                switch (i22) {
                    case 0:
                        fd6.a aVar14 = (fd6.a) gVar3.d.get();
                        g.t(aVar14);
                        return aVar14;
                    case 1:
                        return g.s(((zc6.a) bVar6).d(), (xc6.a) gVar3.f259512c.get());
                    case 2:
                        return r6.b.k((zc6.a) bVar6, "factory");
                    case 3:
                        return g.u((xc6.a) gVar3.f259512c.get());
                    case 4:
                        return j40.h.a(((h30.n) kVar7.A).s());
                    case 5:
                        PaymentsIntroScreenContract$InputData paymentsIntroScreenContract$InputData = gVar3.f259510a;
                        cli.n nVar3 = (cli.n) gVar3.f259514h.get();
                        i5a.b bVarD = kVar7.d();
                        h3a.n nVar4 = new h3a.n();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) kVar6.C).c();
                        s.j(aVarC);
                        h5a.j jVar = new h5a.j(aVarC);
                        c9e.c cVarB = kVar7.H.b();
                        s.j(cVarB);
                        h3a.p pVar2 = new h3a.p();
                        wsg.n nVarB = kVar7.M.b();
                        bn2.p pVarC = kVar7.N.c();
                        h5a.d dVar2 = new h5a.d();
                        g3a.d dVar3 = (g3a.d) kVar7.m0.get();
                        cl3.a aVarD3 = kVar7.f259525a.d();
                        s.j(aVarD3);
                        y80.a aVarR3 = eVar5.r();
                        s.j(aVarR3);
                        com.revolut.kompot.navigable.a aVar15 = (com.revolut.kompot.navigable.a) gVar3.i.get();
                        s70.a aVarM = eVar5.m();
                        s.j(aVarM);
                        pn3.a aVar16 = (pn3.a) kVar7.f259547s0.get();
                        utk.f fVarJ = kVar7.O.f136167c.j();
                        j40.a aVar17 = (j40.a) gVar3.f259513g.get();
                        q8b.a aVar18 = kVar6.X;
                        pqi.a aVar19 = kVar6.f259538m;
                        n8b.a aVarA7 = aVar18.a();
                        s.j(aVarA7);
                        return new com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e(paymentsIntroScreenContract$InputData, nVar3, bVarD, nVar4, jVar, cVarB, pVar2, nVarB, pVarC, dVar2, dVar3, aVarD3, aVarR3, aVar15, aVarM, aVar16, fVarJ, aVar17, new b5a.b(aVarA7, aVar19.a(), aVar19.g()), kVar7.S.a(), kVar7.f.d(), ((zc6.a) bVar6).b());
                    case 6:
                        m3j.n nVarI = ((b3j.p) kVar6.f259527b).i();
                        aqa.c cVarC = ((jqa.p) kVar6.f259529c).c();
                        s.j(cVarC);
                        io5.b bVarA2 = ((yo5.w) kVar6.e).a();
                        s.j(bVarA2);
                        dl3.f fVarC = kVar6.f259525a.c();
                        s.j(fVarC);
                        nq9.b bVarB4 = kVar6.W.b();
                        s.j(bVarB4);
                        e3a.b bVar7 = (e3a.b) kVar6.f259536k0.get();
                        gte.a aVarB2 = kVar6.o.b();
                        s.j(aVarB2);
                        g5a.s sVar2 = new g5a.s(aVarB2);
                        fa6.a aVarD4 = kVar6.f259533h.d();
                        s.j(aVarD4);
                        i iVarD = ((ey1.e) kVar6.i).d();
                        s.j(iVarD);
                        tn9.a aVarC2 = kVar6.f259537l.c();
                        s.j(aVarC2);
                        g5a.u uVar = new g5a.u(nVarI, cVarC, bVarA2, fVarC, bVarB4, bVar7, sVar2, aVarD4, iVarD, aVarC2);
                        n8b.a aVarA8 = kVar6.X.a();
                        s.j(aVarA8);
                        k7i.i iVar2 = new k7i.i(uVar, new b5a.d(aVarA8));
                        kla.a aVarA9 = kVar6.Y.a();
                        n8b.a aVarA10 = kVar6.X.a();
                        s.j(aVarA10);
                        return new r(iVar2, new l5a.d(aVarA9, new kpj.f(aVarA10)), ((zc6.a) bVar6).c());
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                k kVar8 = (k) this.f258326c;
                s3a.h hVar = (s3a.h) this.d;
                k kVar9 = hVar.f259517b;
                int i32 = this.f258325b;
                if (i32 == 0) {
                    Object extension3 = (t4a.a) hVar.f259518c.get();
                    r4a.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    yji.n nVar5 = (yji.n) extension3;
                    s.k(nVar5);
                    return nVar5;
                }
                if (i32 == 1) {
                    hr6.l lVarL2 = kVar9.f259526a0.l();
                    s.j(lVarL2);
                    i3a.b bVar8 = new i3a.b(lVarL2);
                    uo9.a aVar20 = (uo9.a) ((ut9.a) kVar9.P).f283044p.get();
                    s.j(aVar20);
                    gr6.s sVar3 = (gr6.s) kVar9.f259526a0.y0.get();
                    s.j(sVar3);
                    return new t4a.c(bVar8, new u4a.d(aVar20, sVar3, kVar9.f.e()), new t4a.d());
                }
                if (i32 == 2) {
                    ry9.d extension4 = (ry9.d) hVar.e.get();
                    r4a.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    s.k(extension4);
                    return extension4;
                }
                if (i32 == 3) {
                    vy9.g factory = kVar8.f259530d0.b();
                    s.j(factory);
                    r4a.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return factory.a();
                }
                if (i32 != 4) {
                    throw new AssertionError(i32);
                }
                au9.b bVar9 = (au9.b) ((ut9.a) kVar8.P).o.get();
                s.j(bVar9);
                rq9.a aVarA11 = kVar9.d.a();
                s.j(aVarA11);
                lo5.p pVarB3 = ((yo5.w) kVar9.e).b();
                s.j(pVarB3);
                oy1.b bVarB5 = kVar9.E.b();
                wp1.c cVar6 = (wp1.c) ((up1.e) kVar9.R).o.get();
                s.j(cVar6);
                com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b bVar10 = new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b(aVarA11, pVarB3, bVarB5, cVar6);
                r0 r0VarA2 = kVar9.D.a();
                fx9.a aVarA12 = kVar9.f259535j.a();
                s.j(aVarA12);
                x2k.e eVar6 = new x2k.e();
                y8k.b bVarA3 = kVar9.f259548t.a();
                rq9.a aVarA13 = kVar9.d.a();
                s.j(aVarA13);
                oy1.b bVarB6 = kVar9.E.b();
                un9.a aVarD5 = kVar9.f259537l.d();
                s.j(aVarD5);
                p38.a aVarA14 = kVar9.F.a();
                s.j(aVarA14);
                lo5.p pVarB4 = ((yo5.w) kVar9.e).b();
                s.j(pVarB4);
                h3a.l lVar2 = new h3a.l(r0VarA2, aVarA12, eVar6, bVarA3, aVarA13, bVarB6, aVarD5, aVarA14, pVarB4);
                n3a.a aVar21 = (n3a.a) kVar8.y0.get();
                d3a.b bVar11 = (d3a.b) kVar9.f259534h0.get();
                p pVarB5 = kVar9.f259535j.b();
                s.j(pVarB5);
                t3a.g gVar4 = new t3a.g(pVarB5);
                ang.f fVarE2 = kVar9.f.e();
                z80.b bVarS = kVar9.f259532g.s();
                s.j(bVarS);
                jul.o oVar2 = new jul.o(fVarE2, bVarS);
                vq8.a aVarA15 = ((oq8.a) kVar9.V).a();
                g3k.a aVar22 = (g3k.a) kVar9.f259528b0.f232493x.get();
                s.j(aVar22);
                gte.a aVarB3 = kVar9.o.b();
                s.j(aVarB3);
                t4a.g gVar5 = new t4a.g(bVar11, gVar4, oVar2, aVarA15, aVar22, aVarB3);
                h3a.p pVar3 = new h3a.p();
                PaymentsSearchScreenContract$InputData paymentsSearchScreenContract$InputData = hVar.f259516a;
                h3a.n nVar6 = new h3a.n();
                h3a.a aVar23 = new h3a.a(hVar.c());
                t4a.a aVar24 = (t4a.a) hVar.f259518c.get();
                h3a.t tVarC = hVar.c();
                p2k.u uVar2 = kVar9.f259528b0;
                xmg.a aVar25 = kVar9.f;
                g3k.a aVar26 = (g3k.a) uVar2.f232493x.get();
                s.j(aVar26);
                rul.e eVar7 = new rul.e(new o4a.c(tVarC, aVar26, aVar25.e()), aVar25.e());
                ry9.d dVar4 = (ry9.d) hVar.e.get();
                j3a.b bVarB7 = hVar.b();
                dl3.f fVarC2 = kVar9.f259525a.c();
                s.j(fVarC2);
                s4a.a aVar27 = new s4a.a(fVarC2);
                l3a.b bVar12 = (l3a.b) kVar9.A0.get();
                j3a.f fVar4 = new j3a.f();
                t4a.j jVar2 = new t4a.j(hVar.b(), new n4a.e(new n4a.b()));
                ty9.b bVarC = kVar9.f259530d0.c();
                s.j(bVarC);
                return new com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a(bVar9, bVar10, lVar2, aVar21, gVar5, pVar3, paymentsSearchScreenContract$InputData, nVar6, aVar23, aVar24, eVar7, dVar4, new fu6.t(bVarB7, aVar27, bVar12, fVar4, jVar2, bVarC));
            case 8:
                s3a.l lVar3 = (s3a.l) this.d;
                k kVar10 = lVar3.f259557b;
                k kVar11 = (k) this.f258326c;
                ry1.e eVar8 = kVar11.E;
                jr9.b bVar13 = kVar11.d;
                int i33 = this.f258325b;
                if (i33 == 0) {
                    Object extension5 = (x4a.d) lVar3.f259558c.get();
                    w4a.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    yji.n nVar7 = (yji.n) extension5;
                    s.k(nVar7);
                    return nVar7;
                }
                if (i33 == 1) {
                    RecipientSelectionInputData recipientSelectionInputData = lVar3.f259556a;
                    r0 r0VarA3 = kVar11.D.a();
                    x2k.e eVar9 = new x2k.e();
                    y8k.b bVarA4 = kVar10.f259548t.a();
                    hj8.a aVarA16 = ((rb8.a) kVar10.f259531e0).e.a();
                    s.j(aVarA16);
                    x4a.c cVar7 = new x4a.c(bVarA4, new xb8.a(aVarA16));
                    rq9.a aVarA17 = bVar13.a();
                    s.j(aVarA17);
                    oy1.b bVarB8 = eVar8.b();
                    hfe.a aVar28 = (hfe.a) kVar11.f0.f204993c.get();
                    s.j(aVar28);
                    un9.a aVarD6 = kVar11.f259537l.d();
                    s.j(aVarD6);
                    return new x4a.h(recipientSelectionInputData, r0VarA3, eVar9, cVar7, aVarA17, bVarB8, aVar28, aVarD6);
                }
                if (i33 != 2) {
                    if (i33 != 3) {
                        throw new AssertionError(i33);
                    }
                    com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a aVar29 = new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a();
                    m3j.n nVarI2 = ((b3j.p) kVar10.f259527b).i();
                    aqa.c cVarC2 = ((jqa.p) kVar10.f259529c).c();
                    s.j(cVarC2);
                    dl3.f fVarC3 = kVar10.f259525a.c();
                    s.j(fVarC3);
                    nq9.b bVarB9 = kVar10.W.b();
                    s.j(bVarB9);
                    i iVarD2 = ((ey1.e) kVar10.i).d();
                    s.j(iVarD2);
                    tn9.a aVarC3 = kVar10.f259537l.c();
                    s.j(aVarC3);
                    return new v4a.o(new j3a.b(aVar29, new j3a.c(nVarI2, cVarC2, fVarC3, bVarB9, iVarD2, aVarC3), new j3a.d()), (l3a.b) kVar11.A0.get(), new j3a.f(), new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a());
                }
                au9.b bVar14 = (au9.b) ((ut9.a) kVar11.P).o.get();
                s.j(bVar14);
                d3j.b bVarE = ((b3j.p) kVar10.f259527b).e();
                lra.d dVarB = ((jqa.p) kVar10.f259529c).b();
                s.j(dVarB);
                toh.d dVar5 = new toh.d(bVarE, dVarB);
                RecipientSelectionInputData recipientSelectionInputData2 = lVar3.f259556a;
                h3a.o oVar3 = new h3a.o();
                d3a.b bVar15 = (d3a.b) kVar10.f259534h0.get();
                p pVarB6 = kVar10.f259535j.b();
                s.j(pVarB6);
                z4a.d dVar6 = new z4a.d(recipientSelectionInputData2, oVar3, bVar15, new t3a.g(pVarB6), kVar10.f.e());
                x4a.d dVar7 = (x4a.d) lVar3.f259558c.get();
                r0 r0VarA4 = kVar10.D.a();
                fx9.a aVarA18 = kVar10.f259535j.a();
                s.j(aVarA18);
                x2k.e eVar10 = new x2k.e();
                y8k.b bVarA5 = kVar10.f259548t.a();
                rq9.a aVarA19 = kVar10.d.a();
                s.j(aVarA19);
                oy1.b bVarB10 = kVar10.E.b();
                un9.a aVarD7 = kVar10.f259537l.d();
                s.j(aVarD7);
                p38.a aVarA20 = kVar10.F.a();
                s.j(aVarA20);
                lo5.p pVarB7 = ((yo5.w) kVar10.e).b();
                s.j(pVarB7);
                h3a.l lVar4 = new h3a.l(r0VarA4, aVarA18, eVar10, bVarA5, aVarA19, bVarB10, aVarD7, aVarA20, pVarB7);
                l3j.a aVar30 = (l3j.a) ((b3j.p) kVar11.f259527b).f12070j.get();
                s.j(aVar30);
                ora.a aVar31 = (ora.a) ((jqa.p) kVar11.f259529c).z.get();
                s.j(aVar31);
                lo5.p pVarB8 = ((yo5.w) kVar11.e).b();
                s.j(pVarB8);
                com.revolut.feature.payments.groups.api.navigation.a aVar32 = (com.revolut.feature.payments.groups.api.navigation.a) bVar13.N.get();
                s.j(aVar32);
                return new v4a.m(bVar14, dVar5, dVar6, dVar7, lVar4, aVar30, aVar31, pVarB8, aVar32, (n3a.a) kVar11.y0.get(), lVar3.d(), new h3a.a(lVar3.d()), eVar8.b(), kVar11.F.c(), lVar3.f259556a, (jki.p) lVar3.e.get());
            case 9:
                return a();
            case 10:
                return b();
            case 11:
                return c();
            case 12:
                sf1.n nVar8 = (sf1.n) this.f258326c;
                zc6.b bVar16 = nVar8.f262279c;
                sf1.p pVar4 = (sf1.p) this.d;
                sf1.n nVar9 = pVar4.f262299c;
                int i43 = this.f258325b;
                switch (i43) {
                    case 0:
                        return trl.f.j((t60.b) pVar4.d.get());
                    case 1:
                        return trl.f.s(pVar4.f262297a);
                    case 2:
                        fd6.a aVar33 = (fd6.a) pVar4.f262300g.get();
                        g.t(aVar33);
                        return aVar33;
                    case 3:
                        return g.s(((zc6.a) bVar16).d(), (xc6.a) pVar4.f.get());
                    case 4:
                        return r6.b.k((zc6.a) bVar16, "factory");
                    case 5:
                        return g.u((xc6.a) pVar4.f.get());
                    case 6:
                        return new yf1.y(new yf1.s(new bg1.a((Map) nVar9.K.get()), new dnk.l(nVar9.C.g(), 3), ((zc6.a) nVar9.f262279c).c()), pVar4.f262298b, (yf1.b0) pVar4.f262302j.get(), (tf1.q) nVar8.N.get(), (tf1.o) nVar8.O.get(), new yf1.c((tf1.o) nVar9.O.get()), (tf1.t) pVar4.k.get(), ((zc6.a) bVar16).b(), nVar8.E.e());
                    case 7:
                        return new yf1.b0();
                    case 8:
                        return sf1.d.a();
                    default:
                        throw new AssertionError(i43);
                }
            case 13:
                sg8.c cVar8 = (sg8.c) this.f258326c;
                sg8.a aVar34 = (sg8.a) this.d;
                int i59 = this.f258325b;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new eh8.m();
                    }
                    throw new AssertionError(i59);
                }
                sg8.c cVar9 = aVar34.f262600a;
                wsg.b bVarA6 = cVar9.f262612l.a();
                ppg.b bVarB11 = ((wpg.l) cVar9.f262613m).b();
                s.j(bVarB11);
                return new eh8.k(new tg8.c(bVarA6, bVarB11), cVar8.b(), cVar8.f262614n.e(), (cli.n) aVar34.f262601b.get());
            case 14:
                return d();
            case 15:
                return e();
            case 16:
                return f();
            case 17:
                return g();
            case 18:
                return h();
            case 19:
                return i();
            case 20:
                return j();
            case 21:
                return k();
            case 22:
                return l();
            case 23:
                return m();
            case 24:
                return n();
            case 25:
                return o();
            case 26:
                return p();
            case 27:
                return q();
            case 28:
                return r();
            default:
                sy2.b bVar17 = (sy2.b) this.f258326c;
                sy2.a aVar35 = (sy2.a) this.d;
                int i66 = this.f258325b;
                switch (i66) {
                    case 0:
                        g63.e cardScannerDelegate = (g63.e) aVar35.f.get();
                        ky2.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cardScannerDelegate, "cardScannerDelegate");
                        s.k(cardScannerDelegate);
                        return cardScannerDelegate;
                    case 1:
                        e63.a aVarA21 = bVar17.f266592a.a();
                        s.j(aVarA21);
                        return ky2.c.a(aVarA21, (w53.b) aVar35.e.get(), (ifm.b) bVar17.i.get());
                    case 2:
                        Activity activity = bq.i.b(aVar35.f266575a);
                        e63.a factory2 = bVar17.f266592a.a();
                        s.j(factory2);
                        ky2.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return e63.a.a(activity);
                    case 3:
                        return kpi.f.a();
                    case 4:
                        Context contextI2 = bq.i.i(aVar35.f266575a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(aVar35.f266575a);
                        t70.g gVarO2 = bVar17.f266593b.o();
                        s.j(gVarO2);
                        cVar2 = new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                        return cVar2;
                    case 5:
                        iVar = new tpi.i((rpi.c) aVar35.f266580j.get(), gsi.c.a(aVar35.f266575a));
                        return iVar;
                    case 6:
                        iVar = new rpi.b(bq.i.b(aVar35.f266575a));
                        return iVar;
                    case 7:
                        iVar = new rpi.h(bq.i.b(aVar35.f266575a));
                        return iVar;
                    case 8:
                        cVar2 = new iri.g((iri.j) bVar17.f266597j.get(), (iri.m) bVar17.k.get(), bq.i.f(aVar35.f266575a), bq.i.l(aVar35.f266575a));
                        return cVar2;
                    case 9:
                        cVar2 = new iri.l((iri.m) bVar17.k.get(), bq.i.f(aVar35.f266575a), (iri.d) aVar35.f266583n.get());
                        return cVar2;
                    case 10:
                        iVar = new iri.d(bq.i.f(aVar35.f266575a));
                        return iVar;
                    case 11:
                        iVar = new opi.b(bq.i.f(aVar35.f266575a));
                        return iVar;
                    case 12:
                        iVar = new aqi.d(bq.i.b(aVar35.f266575a), new y80.b());
                        return iVar;
                    case 13:
                        iVar = new en.c(ImmutableSet.of((ln.d) aVar35.d.f266598l.get()), bq.i.l(aVar35.f266575a));
                        return iVar;
                    case 14:
                        iVar = new xpi.c(aVar35.f266576b, bq.i.b(aVar35.f266575a));
                        return iVar;
                    case 15:
                        ypi.h hVar2 = aVar35.f266577c;
                        fsi.g gVar6 = aVar35.f266575a;
                        iVar = new ypi.e(hVar2, bq.i.b(gVar6), bq.i.o(gVar6), bq.i.g(gVar6));
                        return iVar;
                    case 16:
                        iVar = new k3l.d(bq.i.b(aVar35.f266575a));
                        return iVar;
                    case 17:
                        jy2.j jVar3 = (jy2.j) bVar17.f266599m.get();
                        jy2.h hVar3 = (jy2.h) bVar17.f266602q.get();
                        z53.b bVar18 = (z53.b) aVar35.v.get();
                        xpi.g gVar7 = (xpi.g) aVar35.f266587s.get();
                        ypi.i iVar3 = (ypi.i) aVar35.f266588t.get();
                        tpi.j jVar4 = (tpi.j) aVar35.k.get();
                        f9b.f fVar5 = (f9b.f) aVar35.f266589w.get();
                        jy2.e eVar11 = (jy2.e) aVar35.f266590x.get();
                        k3l.b bVar19 = (k3l.b) aVar35.u.get();
                        opi.d dVar8 = (opi.d) aVar35.f266584p.get();
                        rpi.j jVar5 = (rpi.j) aVar35.f266581l.get();
                        gte.a aVarB4 = bVar17.f266595g.b();
                        s.j(aVarB4);
                        ly2.l lVar5 = new ly2.l(jVar3, hVar3, bVar18, gVar7, iVar3, jVar4, fVar5, eVar11, bVar19, dVar8, jVar5, aVarB4);
                        kli.a.p(lVar5, bq.i.d(aVar35.f266575a));
                        return lVar5;
                    case 18:
                        g63.e cardScannerDelegate2 = (g63.e) aVar35.f.get();
                        ky2.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cardScannerDelegate2, "cardScannerDelegate");
                        s.k(cardScannerDelegate2);
                        return cardScannerDelegate2;
                    case 19:
                        return bq.i.t(aVar35.f266575a);
                    case 20:
                        gte.a aVarB5 = bVar17.f266595g.b();
                        s.j(aVarB5);
                        m93.d dVarF = bVar17.d.f();
                        s.j(dVarF);
                        return new ly2.a(aVarB5, dVarF);
                    default:
                        throw new AssertionError(i66);
                }
        }
    }
}
