package dw3;

import android.content.Context;
import android.telecom.TelecomManager;
import androidx.room.migration.Migration;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_personalisation.generation.impl.network.CustomisationImageGenerationService;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$InputData;
import com.revolut.feature.extension_auth.impl.data.ExtensionAuthService;
import com.revolut.feature.notification_centre.impl.data.database.InboxDatabase;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.InboxService;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import h80.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class f6 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f118746c;

    public /* synthetic */ f6(Object obj2, int i, int i2) {
        this.f118744a = i2;
        this.f118746c = obj2;
        this.f118745b = i;
    }

    private final Object a() {
        ehe.c cVar = (ehe.c) this.f118746c;
        int i = this.f118745b;
        switch (i) {
            case 0:
                wxl.a aVar = (wxl.a) cVar.f125966a.f293101g.get();
                vc.s.j(aVar);
                CoroutineScope coroutineScopeA = cVar.f125968b.a();
                vc.s.j(coroutineScopeA);
                return new qge.b(aVar, coroutineScopeA);
            case 1:
                pfe.e subAccountSerializer = (pfe.e) ((c6e.a) cVar.f).f21786p.get();
                vc.s.j(subAccountSerializer);
                pfe.e linkedAccountSerializer = (pfe.e) ((xf6.q1) cVar.f125977g).f305005l.get();
                vc.s.j(linkedAccountSerializer);
                pfe.e creditAccountSerializer = (pfe.e) ((t15.d) cVar.f125978h).L.get();
                vc.s.j(creditAccountSerializer);
                pfe.e youthAccountSerializer = (pfe.e) ((k78.b) cVar.i).Z.get();
                vc.s.j(youthAccountSerializer);
                pfe.e teenAccountSerializer = (pfe.e) ((eqe.a) cVar.f125980j).f128454m.get();
                vc.s.j(teenAccountSerializer);
                aob.b savingsAccountSerializer = new aob.b();
                jge.p.Companion.getClass();
                Intrinsics.checkNotNullParameter(subAccountSerializer, "subAccountSerializer");
                Intrinsics.checkNotNullParameter(linkedAccountSerializer, "linkedAccountSerializer");
                Intrinsics.checkNotNullParameter(creditAccountSerializer, "creditAccountSerializer");
                Intrinsics.checkNotNullParameter(youthAccountSerializer, "youthAccountSerializer");
                Intrinsics.checkNotNullParameter(teenAccountSerializer, "teenAccountSerializer");
                Intrinsics.checkNotNullParameter(savingsAccountSerializer, "savingsAccountSerializer");
                return zhm.r0.k(new Pair(ProductId.SUBACCOUNT, subAccountSerializer), new Pair(ProductId.LINKED, linkedAccountSerializer), new Pair(ProductId.CREDIT, creditAccountSerializer), new Pair(ProductId.YOUTH, youthAccountSerializer), new Pair(ProductId.TEEN, teenAccountSerializer), new Pair(ProductId.SAVINGS, savingsAccountSerializer));
            case 2:
                ihe.a productSpaceOrder = new ihe.a();
                pfe.h totalWealthSpacesDataSource = (pfe.h) cVar.u0.get();
                pfe.h restrictedSpacesDataSource = (pfe.h) cVar.f125995v0.get();
                pfe.h favouritesSpacesDataSource = (pfe.h) cVar.f125997w0.get();
                pfe.h personalSpacesDataSource = (pfe.h) cVar.f125999x0.get();
                pfe.h jointSpacesDataSource = (pfe.h) ((q38.b) cVar.f125984n).I.get();
                vc.s.j(jointSpacesDataSource);
                pfe.h proSpacesDataSource = (pfe.h) ((yha.a) cVar.o).f313903y.get();
                vc.s.j(proSpacesDataSource);
                pfe.h youthSpacesDataSource = (pfe.h) ((k78.b) cVar.i).f181852a0.get();
                vc.s.j(youthSpacesDataSource);
                pfe.h teenSpacesDataSource = (pfe.h) ((eqe.a) cVar.f125980j).f128455n.get();
                vc.s.j(teenSpacesDataSource);
                pfe.h linkedSpacesDataSource = (pfe.h) cVar.y0.get();
                pfe.h creditHubSpacesDataSource = (pfe.h) cVar.z0.get();
                Intrinsics.checkNotNullParameter(productSpaceOrder, "productSpaceOrder");
                Intrinsics.checkNotNullParameter(totalWealthSpacesDataSource, "totalWealthSpacesDataSource");
                Intrinsics.checkNotNullParameter(restrictedSpacesDataSource, "restrictedSpacesDataSource");
                Intrinsics.checkNotNullParameter(favouritesSpacesDataSource, "favouritesSpacesDataSource");
                Intrinsics.checkNotNullParameter(personalSpacesDataSource, "personalSpacesDataSource");
                Intrinsics.checkNotNullParameter(jointSpacesDataSource, "jointSpacesDataSource");
                Intrinsics.checkNotNullParameter(proSpacesDataSource, "proSpacesDataSource");
                Intrinsics.checkNotNullParameter(youthSpacesDataSource, "youthSpacesDataSource");
                Intrinsics.checkNotNullParameter(teenSpacesDataSource, "teenSpacesDataSource");
                Intrinsics.checkNotNullParameter(linkedSpacesDataSource, "linkedSpacesDataSource");
                Intrinsics.checkNotNullParameter(creditHubSpacesDataSource, "creditHubSpacesDataSource");
                Map valuesByKey = zhm.r0.k(new Pair(pie.a.TOTAL_WEALTH, totalWealthSpacesDataSource), new Pair(pie.a.RESTRICTED, restrictedSpacesDataSource), new Pair(pie.a.FAVOURITES, favouritesSpacesDataSource), new Pair(pie.a.PERSONAL, personalSpacesDataSource), new Pair(pie.a.JOINT, jointSpacesDataSource), new Pair(pie.a.PRO, proSpacesDataSource), new Pair(pie.a.YOUTH, youthSpacesDataSource), new Pair(pie.a.TEEN, teenSpacesDataSource), new Pair(pie.a.LINKED, linkedSpacesDataSource), new Pair(pie.a.CREDIT_HUB, creditHubSpacesDataSource));
                Intrinsics.checkNotNullParameter(valuesByKey, "valuesByKey");
                List<Map.Entry> listP0 = zhm.d0.P0(valuesByKey.entrySet(), new fad.i(productSpaceOrder, 26));
                int iB = zhm.q0.b(zhm.w.t(listP0, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Map.Entry entry : listP0) {
                    linkedHashMap.put((pie.a) entry.getKey(), entry.getValue());
                }
                return linkedHashMap;
            case 3:
                return new lge.k(null, ProductSpaceIdentifier.TotalWealth.f89753c, zhm.u.c(com.revolut.feature.tab.accounts.models.spaces.i.f89765c));
            case 4:
                return new lge.k(lge.m.a(pie.a.RESTRICTED), ProductSpaceIdentifier.Restricted.f89751c, zhm.u.c(com.revolut.feature.tab.accounts.models.spaces.g.f89763c));
            case 5:
                return new lge.k(lge.m.a(pie.a.FAVOURITES), ProductSpaceIdentifier.Favourites.f89744c, zhm.u.c(com.revolut.feature.tab.accounts.models.spaces.b.f89758c));
            case 6:
                return new lge.k(lge.m.a(pie.a.PERSONAL), ProductSpaceIdentifier.Personal.f89749c, zhm.v.k(pie.g.e, pie.i.e, pie.j.e, pie.h.e));
            case 7:
                return new lge.k(lge.m.a(pie.a.LINKED), ProductSpaceIdentifier.Linked.f89748c, zhm.u.c(pie.f.e));
            case 8:
                return new lge.k(null, ProductSpaceIdentifier.CreditHub.f89743c, zhm.u.c(com.revolut.feature.tab.accounts.models.spaces.a.f89757c));
            case 9:
                pfe.g gVar = (pfe.g) ((yy5.b) cVar.f125993t).E.get();
                vc.s.j(gVar);
                return gVar;
            case 10:
                pfe.g gVar2 = (pfe.g) ((c89.a) cVar.u).f.get();
                vc.s.j(gVar2);
                return gVar2;
            case 11:
                pfe.g gVar3 = (pfe.g) ((k78.b) cVar.i).Y.get();
                vc.s.j(gVar3);
                return gVar3;
            case 12:
                pfe.g gVar4 = (pfe.g) ((eqe.a) cVar.f125980j).f128453l.get();
                vc.s.j(gVar4);
                return gVar4;
            case 13:
                pfe.g gVar5 = (pfe.g) ((c6e.a) cVar.f).f21785n.get();
                vc.s.j(gVar5);
                return gVar5;
            case 14:
                pfe.g gVar6 = (pfe.g) ((fob.a) cVar.k).O.get();
                vc.s.j(gVar6);
                return gVar6;
            case 15:
                pfe.g gVar7 = (pfe.g) ((t15.d) cVar.f125978h).H.get();
                vc.s.j(gVar7);
                return gVar7;
            case 16:
                pfe.g gVar8 = (pfe.g) ((t15.d) cVar.f125978h).J.get();
                vc.s.j(gVar8);
                return gVar8;
            case 17:
                pfe.g gVar9 = (pfe.g) ((xf6.q1) cVar.f125977g).f305004j.get();
                vc.s.j(gVar9);
                return gVar9;
            case 18:
                pfe.g gVar10 = (pfe.g) ((yha.a) cVar.o).f313901w.get();
                vc.s.j(gVar10);
                return gVar10;
            case 19:
                pfe.g gVar11 = (pfe.g) ((q38.b) cVar.f125984n).C.get();
                vc.s.j(gVar11);
                return gVar11;
            case 20:
                pfe.g gVar12 = (pfe.g) ((q38.b) cVar.f125984n).D.get();
                vc.s.j(gVar12);
                return gVar12;
            case 21:
                pfe.b bVar = (pfe.b) ((yy5.b) cVar.f125993t).D.get();
                vc.s.j(bVar);
                return bVar;
            case 22:
                pfe.b bVar2 = (pfe.b) ((c89.a) cVar.u).d.get();
                vc.s.j(bVar2);
                return bVar2;
            case 23:
                pfe.b bVar3 = (pfe.b) ((k78.b) cVar.i).U.get();
                vc.s.j(bVar3);
                return bVar3;
            case 24:
                pfe.b bVar4 = (pfe.b) ((eqe.a) cVar.f125980j).f128452j.get();
                vc.s.j(bVar4);
                return bVar4;
            case 25:
                pfe.b bVar5 = (pfe.b) ((c6e.a) cVar.f).f21783l.get();
                vc.s.j(bVar5);
                return bVar5;
            case 26:
                pfe.b bVar6 = (pfe.b) ((fob.a) cVar.k).J.get();
                vc.s.j(bVar6);
                return bVar6;
            case 27:
                pfe.b bVar7 = (pfe.b) ((t15.d) cVar.f125978h).I.get();
                vc.s.j(bVar7);
                return bVar7;
            case 28:
                pfe.b bVar8 = (pfe.b) ((t15.d) cVar.f125978h).K.get();
                vc.s.j(bVar8);
                return bVar8;
            case 29:
                pfe.b bVar9 = (pfe.b) ((xf6.q1) cVar.f125977g).k.get();
                vc.s.j(bVar9);
                return bVar9;
            case 30:
                pfe.b bVar10 = (pfe.b) ((yha.a) cVar.o).f313899s.get();
                vc.s.j(bVar10);
                return bVar10;
            case 31:
                pfe.b bVar11 = (pfe.b) ((q38.b) cVar.f125984n).f241881y.get();
                vc.s.j(bVar11);
                return bVar11;
            case 32:
                pfe.b bVar12 = (pfe.b) ((q38.b) cVar.f125984n).E.get();
                vc.s.j(bVar12);
                return bVar12;
            case 33:
                return ((yy5.b) cVar.f125993t).f317833m.d();
            case 34:
                xfe.j jVar = (xfe.j) ((yha.a) cVar.o).f313902x.get();
                vc.s.j(jVar);
                return jVar;
            case 35:
                xfe.j jVar2 = (xfe.j) ((q38.b) cVar.f125984n).G.get();
                vc.s.j(jVar2);
                return jVar2;
            case 36:
                xfe.j jVar3 = (xfe.j) ((k78.b) cVar.i).V.get();
                vc.s.j(jVar3);
                return jVar3;
            case 37:
                xfe.j jVar4 = (xfe.j) ((c6e.a) cVar.f).o.get();
                vc.s.j(jVar4);
                return jVar4;
            case 38:
                xfe.j jVar5 = (xfe.j) ((fob.a) cVar.k).K.get();
                vc.s.j(jVar5);
                return jVar5;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        emi.a aVar = (emi.a) this.f118746c;
        ee0.a aVar2 = aVar.d;
        xdj.a aVar3 = aVar.f127661a;
        int i = this.f118745b;
        if (i != 0) {
            if (i == 1) {
                xli.b bVar = (xli.b) aVar3.f304489q.get();
                vc.s.j(bVar);
                return new dmi.a(bVar);
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            xe0.f fVarF = aVar2.f();
            vc.s.j(fVarF);
            je0.d dVarD = aVar2.d();
            vc.s.j(dVarD);
            uli.c cVarA = aVar3.f304485l.a();
            vc.s.j(cVarA);
            return new cmi.z(fVarF, dVarD, new fmi.b(new vdj.b(cVarA)));
        }
        j51.a aVar4 = (j51.a) aVar3.f;
        asi.d dVarC = aVar4.c();
        vc.s.j(dVarC);
        tul.b bVar2 = new tul.b(dVarC);
        r10.d dVarA = aVar3.a();
        wx8.a aVarA = aVar3.f304482g.a();
        vc.s.j(aVarA);
        wli.v vVar = (wli.v) aVar3.f304487n.get();
        bmi.a aVar5 = aVar3.f304483h;
        uli.g gVar = (uli.g) aVar5.f16835a.get();
        vc.s.j(gVar);
        udj.f fVar = new udj.f(dVarA, aVarA, vVar, gVar);
        onh.b bVarB = aVar3.i.b();
        asi.d dVarC2 = aVar4.c();
        vc.s.j(dVarC2);
        fwj.p pVarA = aVar3.f304484j.a();
        vc.s.j(pVarA);
        udj.d dVar = new udj.d(bVarB, dVarC2, pVarA);
        wli.v vVar2 = (wli.v) aVar3.f304487n.get();
        uli.g gVar2 = (uli.g) aVar5.f16835a.get();
        vc.s.j(gVar2);
        g8b.a aVar6 = (g8b.a) aVar3.f304480b;
        sri.m mVarD = aVar6.d();
        vc.s.j(mVarD);
        udj.l lVar = new udj.l(vVar2, gVar2, mVarD);
        a16.a aVar7 = aVar3.k;
        kf0.c cVar = aVar7.f547a;
        th0.a aVar8 = aVar7.f548b;
        b16.c cVar2 = new b16.c(cVar.f183264b, new ki0.c(t2d.c.A(aVar8.f271230a), aVar8.f271231b));
        b16.m mVar = new b16.m(aVar8.h());
        wri.b bVar3 = new wri.b();
        sri.m mVarD2 = aVar6.d();
        vc.s.j(mVarD2);
        xdj.b bVar4 = xdj.c.Companion;
        bVar4.getClass();
        String str = ibb.c.f160140a.f83420a;
        vc.s.k(str);
        hf8.b bVar5 = new hf8.b(bVar2, fVar, dVar, lVar, cVar2, new udj.k(mVar, bVar3, mVarD2, str));
        ami.l lVar2 = (ami.l) aVar3.f304488p.get();
        c51.c cVar3 = aVar3.f304479a;
        wli.d dVar2 = (wli.d) cVar3.f21325g.get();
        vc.s.j(dVar2);
        o7.d dVar3 = new o7.d(dVar2);
        uli.b bVarA = cVar3.a();
        bVar4.getClass();
        x2l.a aVar9 = new x2l.a(4, false);
        udj.m mVar2 = new udj.m();
        uli.e eVar = new uli.e();
        vdj.c cVar4 = new vdj.c();
        wri.b bVar6 = new wri.b();
        sri.m mVarD3 = ((g8b.a) aVar3.f304480b).d();
        vc.s.j(mVarD3);
        ami.f fVar2 = new ami.f(lVar2, dVar3, bVarA, aVar9, mVar2, eVar, cVar4, bVar6, mVarD3);
        gte.a aVarB = aVar.f127662b.b();
        vc.s.j(aVarB);
        r10.d dVarA2 = aVar3.a();
        wli.v vVar3 = (wli.v) aVar3.f304487n.get();
        vc.s.j(vVar3);
        uli.c cVarA2 = aVar3.f304485l.a();
        vc.s.j(cVarA2);
        fmi.b bVar7 = new fmi.b(new vdj.b(cVarA2));
        cmi.z zVar = (cmi.z) aVar.f127665h.get();
        CoroutineScope coroutineScopeA = aVar.e.a();
        vc.s.j(coroutineScopeA);
        cmi.u uVar = new cmi.u(zVar, coroutineScopeA);
        dmi.a aVar10 = (dmi.a) aVar.f.get();
        onh.b bVarB2 = aVar3.i.b();
        asi.d dVarC3 = ((j51.a) aVar3.f).c();
        vc.s.j(dVarC3);
        fwj.p pVarA2 = aVar3.f304484j.a();
        vc.s.j(pVarA2);
        return new cmi.m(bVar5, fVar2, aVarB, dVarA2, vVar3, bVar7, uVar, aVar10, new udj.p(bVarB2, dVarC3, pVarA2));
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        Object dVar2;
        Object aVar;
        int i = this.f118744a;
        int i2 = this.f118745b;
        Object obj2 = this.f118746c;
        switch (i) {
            case 0:
                if (i2 == 0) {
                    return new ti4.k((cli.n) ((g6) obj2).f118825a.get());
                }
                if (i2 == 1) {
                    return new ti4.l();
                }
                throw new AssertionError(i2);
            case 1:
                q6 q6Var = (q6) obj2;
                SingleSelectorInputDetailsScreenContract$InputData singleSelectorInputDetailsScreenContract$InputData = q6Var.f119597a;
                if (i2 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) q6Var.f119598b.get(), (c84.b) q6Var.d.get(), singleSelectorInputDetailsScreenContract$InputData);
                }
                if (i2 == 1) {
                    return new c84.b();
                }
                if (i2 == 2) {
                    return new ai4.l((cli.n) q6Var.f119600g.get(), singleSelectorInputDetailsScreenContract$InputData);
                }
                if (i2 == 3) {
                    return new ai4.n();
                }
                throw new AssertionError(i2);
            case 2:
                o8 o8Var = (o8) obj2;
                if (i2 == 0) {
                    return new jd4.d((jki.p) o8Var.f119469b.get());
                }
                if (i2 == 1) {
                    return new anl.j(o8Var.f119468a);
                }
                throw new AssertionError(i2);
            case 3:
                dx2.b bVar = (dx2.b) obj2;
                da3.j jVar = bVar.f120535b;
                if (i2 == 0) {
                    return new ifm.b();
                }
                if (i2 == 1) {
                    return new iri.j();
                }
                if (i2 == 2) {
                    return new cx2.g();
                }
                if (i2 == 3) {
                    return new ln.c();
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return new cx2.f((ln.a) bVar.f120538h.get());
                    }
                    throw new AssertionError(i2);
                }
                cx2.d dVar3 = (cx2.d) bVar.f120537g.get();
                l93.f fVarJ = jVar.j();
                vc.s.j(fVarJ);
                ha3.d dVarE = jVar.e();
                vc.s.j(dVarE);
                fk3.b bVarB = bVar.f120536c.b();
                vc.s.j(bVarB);
                return new cx2.e(dVar3, fVarJ, dVarE, bVarB);
            case 4:
                if (i2 == 0) {
                    dz2.b bVar2 = (dz2.b) obj2;
                    return new com.revolut.feature.card_management.impl.cardagreements.flow.a(bVar2.f121218a, (ez2.d) bVar2.d.get());
                }
                if (i2 == 1) {
                    return new ez2.d();
                }
                throw new AssertionError(i2);
            case 5:
                e39.a aVar2 = (e39.a) obj2;
                switch (i2) {
                    case 0:
                        return new f39.c(ImmutableSet.of((a39.a) aVar2.v.get(), (a39.a) aVar2.f122228w.get(), (a39.a) aVar2.f122229x.get(), (a39.a) aVar2.f122230y.get(), (a39.a) aVar2.z.get(), (a39.a) aVar2.A.get(), (a39.a) aVar2.B.get(), (a39.a) aVar2.C.get(), (a39.a) aVar2.D.get(), (a39.a) aVar2.E.get(), (a39.a) aVar2.F.get(), (a39.a) aVar2.G.get(), (a39.a) aVar2.H.get(), (a39.a) aVar2.I.get(), (a39.a) aVar2.J.get(), (a39.a) aVar2.K.get(), (a39.a) aVar2.L.get(), (a39.a) aVar2.M.get(), (a39.a) aVar2.N.get(), (a39.a) aVar2.O.get(), (a39.a) aVar2.P.get(), (a39.a) aVar2.Q.get(), (a39.a) aVar2.R.get(), (a39.a) aVar2.S.get(), (a39.a) aVar2.T.get(), (a39.a) aVar2.U.get(), (a39.a) aVar2.V.get(), (a39.a) aVar2.W.get(), (a39.a) aVar2.X.get(), (a39.a) aVar2.Y.get(), (a39.a) aVar2.Z.get(), (a39.a) aVar2.f122213a0.get()));
                    case 1:
                        e39.e.Companion.getClass();
                        return new e39.d();
                    case 2:
                        e39.e.Companion.getClass();
                        return new e39.c();
                    case 3:
                        a39.a aVar3 = (a39.a) aVar2.f122212a.d.get();
                        vc.s.j(aVar3);
                        return aVar3;
                    case 4:
                        a39.a aVar4 = (a39.a) aVar2.f122212a.e.get();
                        vc.s.j(aVar4);
                        return aVar4;
                    case 5:
                        a39.a aVar5 = (a39.a) aVar2.f122214b.e.get();
                        vc.s.j(aVar5);
                        return aVar5;
                    case 6:
                        a39.a aVar6 = (a39.a) aVar2.f122216c.f234432c.get();
                        vc.s.j(aVar6);
                        return aVar6;
                    case 7:
                        a39.a aVar7 = (a39.a) aVar2.f122216c.d.get();
                        vc.s.j(aVar7);
                        return aVar7;
                    case 8:
                        a39.a aVar8 = (a39.a) aVar2.d.f109744b.get();
                        vc.s.j(aVar8);
                        return aVar8;
                    case 9:
                        a39.a aVar9 = (a39.a) aVar2.e.e.get();
                        vc.s.j(aVar9);
                        return aVar9;
                    case 10:
                        a39.a aVar10 = (a39.a) aVar2.f.e.get();
                        vc.s.j(aVar10);
                        return aVar10;
                    case 11:
                        a39.a aVar11 = (a39.a) aVar2.f122217g.f249831b.get();
                        vc.s.j(aVar11);
                        return aVar11;
                    case 12:
                        a39.a aVar12 = (a39.a) aVar2.f122218h.d.get();
                        vc.s.j(aVar12);
                        return aVar12;
                    case 13:
                        a39.a aVar13 = (a39.a) aVar2.i.e.get();
                        vc.s.j(aVar13);
                        return aVar13;
                    case 14:
                        a39.a aVar14 = (a39.a) aVar2.i.f4459g.get();
                        vc.s.j(aVar14);
                        return aVar14;
                    case 15:
                        a39.a aVar15 = (a39.a) aVar2.f122219j.f155988b.get();
                        vc.s.j(aVar15);
                        return aVar15;
                    case 16:
                        a39.a aVar16 = (a39.a) aVar2.k.f326223b.get();
                        vc.s.j(aVar16);
                        return aVar16;
                    case 17:
                        a39.a aVar17 = (a39.a) aVar2.f122220l.f267481c.get();
                        vc.s.j(aVar17);
                        return aVar17;
                    case 18:
                        a39.a aVar18 = (a39.a) aVar2.k.f326224c.get();
                        vc.s.j(aVar18);
                        return aVar18;
                    case 19:
                        a39.a aVar19 = (a39.a) aVar2.f122221m.f173138b.get();
                        vc.s.j(aVar19);
                        return aVar19;
                    case 20:
                        a39.a aVar20 = (a39.a) aVar2.f122222n.e.get();
                        vc.s.j(aVar20);
                        return aVar20;
                    case 21:
                        a39.a aVar21 = (a39.a) aVar2.o.f190093b.get();
                        vc.s.j(aVar21);
                        return aVar21;
                    case 22:
                        a39.a aVar22 = (a39.a) aVar2.f122223p.f189554c.get();
                        vc.s.j(aVar22);
                        return aVar22;
                    case 23:
                        a39.a aVar23 = (a39.a) aVar2.f122224q.f12643b.get();
                        vc.s.j(aVar23);
                        return aVar23;
                    case 24:
                        a39.a aVar24 = (a39.a) aVar2.i.i.get();
                        vc.s.j(aVar24);
                        return aVar24;
                    case 25:
                        a39.a aVar25 = (a39.a) aVar2.f122225r.f233735b.get();
                        vc.s.j(aVar25);
                        return aVar25;
                    case 26:
                        a39.a aVar26 = (a39.a) aVar2.f122226s.e.get();
                        vc.s.j(aVar26);
                        return aVar26;
                    case 27:
                        a39.a aVar27 = (a39.a) aVar2.f122226s.f.get();
                        vc.s.j(aVar27);
                        return aVar27;
                    case 28:
                        a39.a aVar28 = (a39.a) aVar2.f122227t.d.get();
                        vc.s.j(aVar28);
                        return aVar28;
                    case 29:
                        a39.a aVar29 = (a39.a) aVar2.f122227t.f.get();
                        vc.s.j(aVar29);
                        return aVar29;
                    case 30:
                        a39.a aVar30 = (a39.a) aVar2.f122227t.f113864h.get();
                        vc.s.j(aVar30);
                        return aVar30;
                    case 31:
                        a39.a aVar31 = (a39.a) aVar2.f122227t.f113865j.get();
                        vc.s.j(aVar31);
                        return aVar31;
                    case 32:
                        a39.a aVar32 = (a39.a) aVar2.u.f132076b.get();
                        vc.s.j(aVar32);
                        return aVar32;
                    default:
                        throw new AssertionError(i2);
                }
            case 6:
                e48.c cVar = (e48.c) obj2;
                ika.f fVar = cVar.f122413c;
                if (i2 == 0) {
                    return new l48.e(cVar.f122411a.c(), (k38.a) cVar.f122415h.get(), cVar.d.b());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                l61.a aVarB = cVar.f122412b.b();
                vc.s.j(aVarB);
                zja.a aVarA = ((ika.b) fVar).a();
                vc.s.j(aVarA);
                return new com.revolut.feature.joint.impl.domain.a(aVarB, aVarA, ((ika.b) fVar).b());
            case 7:
                e48.k kVar = (e48.k) obj2;
                if (i2 == 0) {
                    return new g58.j((jki.p) kVar.f122451b.get(), kVar.f122450a);
                }
                if (i2 == 1) {
                    return new g58.k();
                }
                throw new AssertionError(i2);
            case 8:
                e51.a aVar33 = (e51.a) obj2;
                if (i2 == 0) {
                    d4m.a aVarA2 = e4m.b.a(aVar33.f122706g);
                    d4m.a aVarA3 = e4m.b.a(aVar33.f122707h);
                    CoroutineScope coroutineScopeA = aVar33.f122705c.a();
                    vc.s.j(coroutineScopeA);
                    return new mwl.e(aVarA2, aVarA3, coroutineScopeA, e4m.b.a(aVar33.i), e4m.b.a(aVar33.f122708j), e4m.b.a(aVar33.k));
                }
                if (i2 == 1) {
                    io.c cVarD = aVar33.f122703a.d();
                    vc.s.j(cVarD);
                    return cVarD;
                }
                if (i2 == 2) {
                    dl0.a aVar34 = (dl0.a) aVar33.f122704b.f127229c.get();
                    vc.s.j(aVar34);
                    return aVar34;
                }
                if (i2 == 3) {
                    fwj.p pVarA = aVar33.d.a();
                    vc.s.j(pVarA);
                    return pVarA;
                }
                if (i2 == 4) {
                    return aVar33.e.e();
                }
                if (i2 != 5) {
                    throw new AssertionError(i2);
                }
                xjl.n nVar = (xjl.n) ((ljl.q0) aVar33.f).f196079t0.get();
                vc.s.j(nVar);
                return nVar;
            case 9:
                e53.g gVar = (e53.g) obj2;
                nj0.a aVar35 = gVar.f122722a;
                ee0.a aVar36 = gVar.f122724c;
                if (i2 == 0) {
                    return new f53.b((h53.a) gVar.f122726h.get());
                }
                if (i2 == 1) {
                    CustomisationImageGenerationService customisationImageGenerationService = (CustomisationImageGenerationService) gVar.e.get();
                    tl0.a aVarC = gVar.f122723b.c();
                    wj0.a aVarI = ((nj0.d) aVar35).i();
                    vc.s.j(aVarI);
                    return new h53.c(customisationImageGenerationService, aVarC, aVarI, (ne0.j) gVar.f.get(), (ue0.c) gVar.f122725g.get());
                }
                if (i2 == 2) {
                    ik0.b retrofitFactory = ((nj0.d) aVar35).m();
                    vc.s.j(retrofitFactory);
                    x13.h.Companion.getClass();
                    x13.f networkConfiguration = new x13.f();
                    e53.d.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                    Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
                    Object objCreate = ik0.b.a(retrofitFactory, null, null, null, null, 29).create(CustomisationImageGenerationService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    CustomisationImageGenerationService customisationImageGenerationService2 = (CustomisationImageGenerationService) objCreate;
                    vc.s.k(customisationImageGenerationService2);
                    return customisationImageGenerationService2;
                }
                if (i2 == 3) {
                    e53.b.Companion.getClass();
                    return new ne0.d();
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                je0.d mapper = aVar36.b();
                vc.s.j(mapper);
                yk0.a databaseSecurityProvider = gVar.d.b();
                vc.s.j(databaseSecurityProvider);
                xe0.f storageFactory = aVar36.f();
                vc.s.j(storageFactory);
                e53.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSecurityProvider, "customisation_image_generation", mapper, 0, null, 56);
            case 10:
                if (i2 == 0) {
                    return new i53.a();
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                z70.a contextProvider = ((e53.h) obj2).f122727a.f();
                vc.s.j(contextProvider);
                e53.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                return new c90.c(contextProvider.getContext());
            case 11:
                e5f.a aVar37 = (e5f.a) obj2;
                h9h.a aVar38 = aVar37.f122818c;
                if (i2 == 0) {
                    dVar = new d5f.d(aVar37.f122817b.e(), aVar38.f());
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new d5f.c();
                        }
                        throw new AssertionError(i2);
                    }
                    dVar = new d5f.a(aVar38.s());
                }
                return dVar;
            case 12:
                e79.a aVar39 = (e79.a) obj2;
                ite.a aVar40 = aVar39.e;
                l70.e eVar = aVar39.d;
                c21.e eVar2 = aVar39.f123105c;
                if (i2 == 0) {
                    b79.c cVar2 = (b79.c) aVar39.f123108j.get();
                    q06.d dVarA = aVar39.f.a();
                    vc.s.j(dVarA);
                    gte.a aVarB2 = aVar40.b();
                    vc.s.j(aVarB2);
                    dVar2 = new y69.d(cVar2, dVarA, aVarB2);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            InboxDatabase db8 = (InboxDatabase) aVar39.f123106g.get();
                            e79.g.Companion.getClass();
                            Intrinsics.checkNotNullParameter(db8, "db");
                            u69.d dVarG = db8.g();
                            vc.s.k(dVarG);
                            return dVarG;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new AssertionError(i2);
                            }
                            e79.i.Companion.getClass();
                            return new ne0.d();
                        }
                        Context context = aVar39.f123103a;
                        yk0.a databaseSessionProvider = aVar39.f123104b.b();
                        vc.s.j(databaseSessionProvider);
                        de0.a databaseEncryptionMigratorFactory = ((c21.b) eVar2).b();
                        e79.g.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                        InboxDatabase inboxDatabase = (InboxDatabase) InboxDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{new w69.a(), new w69.b(), new w69.c(), new w69.d()}, databaseEncryptionMigratorFactory);
                        vc.s.k(inboxDatabase);
                        return inboxDatabase;
                    }
                    u69.d dVar4 = (u69.d) aVar39.f123107h.get();
                    InboxService inboxService = (InboxService) v0.a.f((c21.b) eVar2, "retrofit", InboxService.class, "create(...)");
                    vc.s.k(inboxService);
                    f80.a aVarX = eVar.x();
                    vc.s.j(aVarX);
                    uvl.c cVar3 = new uvl.c(aVarX);
                    ne0.j jVar2 = (ne0.j) aVar39.i.get();
                    gte.a aVarB3 = aVar40.b();
                    vc.s.j(aVarB3);
                    l80.e eVarH = eVar.h();
                    vc.s.j(eVarH);
                    dVar2 = new b79.m(dVar4, inboxService, cVar3, jVar2, aVarB3, eVarH);
                }
                return dVar2;
            case 13:
                if (i2 == 0) {
                    return new n79.c((cli.n) ((e79.d) obj2).f123129a.get());
                }
                if (i2 == 1) {
                    return new n79.d();
                }
                throw new AssertionError(i2);
            case 14:
                e81.a aVar41 = (e81.a) obj2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    e81.c.Companion.getClass();
                    return hlm.d.a();
                }
                h81.b bVarA = aVar41.a();
                j81.a aVar42 = new j81.a();
                b80.c cVarP = aVar41.f123555b.p();
                vc.s.j(cVarP);
                r10.f fVar2 = new r10.f(bVarA, aVar42, cVarP);
                j81.a aVar43 = new j81.a();
                s4l.a suppressedExceptionsPlugin = new s4l.a();
                r4l.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(suppressedExceptionsPlugin, "suppressedExceptionsPlugin");
                List listC = zhm.u.c(suppressedExceptionsPlugin);
                vc.s.k(listC);
                return new g81.e(fVar2, aVar43, listC);
            case 15:
                e9i.e eVar3 = (e9i.e) obj2;
                if (i2 == 0) {
                    return new ifm.b();
                }
                if (i2 == 1) {
                    return new iri.j();
                }
                if (i2 == 2) {
                    return new g9i.u();
                }
                if (i2 == 3) {
                    return new com.revolut.feature_pdf_view.ui.b(((nj0.d) eVar3.f124021b).j(), (g9i.n) eVar3.f124023g.get(), (ifm.b) eVar3.e.get());
                }
                throw new AssertionError(i2);
            case 16:
                if (i2 == 0) {
                    ea2.b bVar3 = (ea2.b) obj2;
                    return new oa2.m(bVar3.f124054a, (cli.n) bVar3.f124055b.get());
                }
                if (i2 == 1) {
                    return new oa2.l();
                }
                throw new AssertionError(i2);
            case 17:
                ea2.d dVar5 = (ea2.d) obj2;
                if (i2 == 0) {
                    return new eb2.k((cli.n) dVar5.f124061b.get());
                }
                if (i2 == 1) {
                    return new eb2.j(dVar5.f124060a);
                }
                throw new AssertionError(i2);
            case 18:
                ea2.h hVar = (ea2.h) obj2;
                l70.e eVar4 = hVar.d;
                if (i2 == 0) {
                    return new da2.b();
                }
                if (i2 == 1) {
                    Context context2 = hVar.f124073c;
                    ha2.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    return sri.o.c(context2, null, null, 14);
                }
                if (i2 == 2) {
                    f6 provider = hVar.f124081q;
                    ha2.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    return new ha2.a(provider);
                }
                if (i2 == 3) {
                    uy1.o oVar = (uy1.o) ((lz1.m) hVar.f124071a).X.get();
                    vc.s.j(oVar);
                    return new ga2.g(oVar, ((c21.b) hVar.f124072b).a(), new ia2.a(), new x2k.e());
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                s70.a aVarM = eVar4.m();
                vc.s.j(aVarM);
                y80.a aVarR = eVar4.r();
                vc.s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 19:
                if (i2 == 0) {
                    return new see.g((cli.n) ((ede.c) obj2).f125000a.get());
                }
                if (i2 == 1) {
                    return new see.h();
                }
                throw new AssertionError(i2);
            case 20:
                ee6.b bVar4 = (ee6.b) obj2;
                ee0.a aVar44 = bVar4.f125080c;
                ljl.q1 q1Var = bVar4.f125079b;
                switch (i2) {
                    case 0:
                        return new fe6.a((be6.e) bVar4.f125084l.get());
                    case 1:
                        return new be6.j((ExtensionAuthService) bVar4.f125083j.get(), ((ljl.q0) q1Var).a(), (ue0.c) bVar4.k.get(), fe0.c.a());
                    case 2:
                        ExtensionAuthService extensionAuthService = (ExtensionAuthService) v0.a.f((c21.b) bVar4.f125078a, "retrofit", ExtensionAuthService.class, "create(...)");
                        vc.s.k(extensionAuthService);
                        return extensionAuthService;
                    case 3:
                        je0.d mapper2 = aVar44.b();
                        vc.s.j(mapper2);
                        yk0.a databaseSessionProvider2 = bVar4.d.b();
                        vc.s.j(databaseSessionProvider2);
                        xe0.f storageFactory2 = aVar44.f();
                        vc.s.j(storageFactory2);
                        ce6.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider2, "extension_auth", mapper2, 0, null, 56);
                    case 4:
                        return new f88.f((yd6.d) bVar4.f125086n.get());
                    case 5:
                        vil.f fVar3 = (vil.f) ((ljl.q0) q1Var).f196070n0.get();
                        vc.s.j(fVar3);
                        fe6.a aVar45 = (fe6.a) bVar4.f125085m.get();
                        q06.d dVarA2 = bVar4.f.a();
                        vc.s.j(dVarA2);
                        return new ae6.c(fVar3, aVar45, dVarA2);
                    case 6:
                        return new de6.c();
                    default:
                        throw new AssertionError(i2);
                }
            case 21:
                ee6.e eVar5 = (ee6.e) obj2;
                if (i2 == 0) {
                    return new ifm.b();
                }
                if (i2 == 1) {
                    return new iri.j();
                }
                if (i2 == 2) {
                    return new ge6.w();
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                fe6.a aVar46 = (fe6.a) ((ee6.b) eVar5.f125101b).f125085m.get();
                vc.s.j(aVar46);
                ge6.c cVar4 = (ge6.c) eVar5.i.get();
                jvh.a aVarA4 = eVar5.f125102c.a();
                vc.s.j(aVarA4);
                return new ge6.l(aVar46, cVar4, aVarA4);
            case 22:
                ee7.a aVar47 = (ee7.a) obj2;
                switch (i2) {
                    case 0:
                        l80.e eVarH2 = aVar47.f125111a.h();
                        vc.s.j(eVarH2);
                        return new com.revolut.feature.in_app_calls.b(eVarH2);
                    case 1:
                        z70.a aVarF = aVar47.f125111a.f();
                        vc.s.j(aVarF);
                        return new com.revolut.feature.in_app_calls.a(aVarF, (pe7.f) aVar47.i.get(), aVar47.f125116j);
                    case 2:
                        z70.a aVarF2 = aVar47.f125111a.f();
                        vc.s.j(aVarF2);
                        xg0.a aVarA5 = aVar47.f125112b.a();
                        vc.s.j(aVarA5);
                        th0.j.a();
                        return new ee7.g(aVarF2, aVarA5, aVar47.f125113c);
                    case 3:
                        z70.a aVarF3 = aVar47.f125111a.f();
                        vc.s.j(aVarF3);
                        xg0.a aVarA6 = aVar47.f125112b.a();
                        vc.s.j(aVarA6);
                        return new be7.j(aVarF3, aVarA6, th0.i.a());
                    case 4:
                        return new be7.e();
                    case 5:
                        z70.a aVarF4 = aVar47.f125111a.f();
                        vc.s.j(aVarF4);
                        xg0.a aVarA7 = aVar47.f125112b.a();
                        vc.s.j(aVarA7);
                        return new be7.t(aVarF4, aVarA7, (ee7.g) aVar47.i.get(), aVar47.f125113c);
                    case 6:
                        return new de7.c();
                    case 7:
                        z70.a contextProvider2 = aVar47.f125111a.f();
                        vc.s.j(contextProvider2);
                        Intrinsics.checkNotNullParameter(contextProvider2, "contextProvider");
                        e.a lifecycle = h80.e.f149935b;
                        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                        Intrinsics.checkNotNullParameter(contextProvider2, "contextProvider");
                        return new oo0.k(lifecycle, contextProvider2, 2);
                    case 8:
                        return new fe7.b();
                    case 9:
                        Context context3 = aVar47.f;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Object systemService = context3.getSystemService("telecom");
                        Intrinsics.i(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
                        return (TelecomManager) systemService;
                    default:
                        throw new AssertionError(i2);
                }
            case 23:
                return a();
            case 24:
                ehh.a aVar48 = (ehh.a) obj2;
                a31.a aVar49 = aVar48.e;
                a31.a aVar50 = aVar48.f126193b;
                a31.a aVar51 = aVar48.f126192a;
                if (i2 == 0) {
                    return new anb.c0(aVar51, aVar50, aVar48.f126194c, aVar48.d, 8);
                }
                if (i2 == 1) {
                    return new ajf.d(aVar49, aVar51, aVar48.f, aVar50, aVar48.f126195g, 6);
                }
                if (i2 == 2) {
                    return new anb.c0(aVar49, aVar51, aVar48.f126196h, aVar50, 24);
                }
                throw new AssertionError(i2);
            case 25:
                ejg.c cVar5 = (ejg.c) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.trusted_merchants.impl.ui.kompot.dialog.b((cli.n) cVar5.f126893b.get(), cVar5.f126892a);
                }
                if (i2 == 1) {
                    return new ljg.g();
                }
                throw new AssertionError(i2);
            case 26:
                el9.a aVar52 = (el9.a) obj2;
                a31.a aVar53 = aVar52.f127276b;
                if (i2 == 0) {
                    return new afj.e4(aVar52.f127275a, aVar53, aVar52.f127277c, aVar52.d, aVar52.e, aVar52.f127278g);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new fl9.g(aVar53);
                    }
                    throw new AssertionError(i2);
                }
                fl9.c cVar6 = (fl9.c) ((fl9.g) aVar52.f.get()).b();
                vc.s.k(cVar6);
                return cVar6;
            case 27:
                elg.e eVar6 = (elg.e) obj2;
                if (i2 == 0) {
                    return new dlg.a((sri.m) eVar6.d.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Context context4 = eVar6.f127455a;
                elg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context4, "context");
                return sri.o.c(context4, null, null, 14);
            case 28:
                return b();
            default:
                eqe.a aVar54 = (eqe.a) obj2;
                usg.a aVar55 = aVar54.f128447a;
                ite.a aVar56 = aVar54.i;
                if (i2 == 0) {
                    aVar = new hqe.a(aVar55.a(), aVar54.b());
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            hqe.o oVarB = aVar54.b();
                            gte.a aVarB4 = aVar56.b();
                            vc.s.j(aVarB4);
                            return new hqe.p(oVarB, aVarB4);
                        }
                        if (i2 == 3) {
                            return new cqe.a();
                        }
                        if (i2 != 4) {
                            throw new AssertionError(i2);
                        }
                        xqe.b bVarA2 = aVar54.f128448b.a();
                        vc.s.j(bVarA2);
                        gte.a aVarB5 = aVar56.b();
                        vc.s.j(aVarB5);
                        return new jqe.b(bVarA2, aVarB5);
                    }
                    oqk.l lVarB = aVar54.f128450g.b();
                    vc.s.j(lVarB);
                    aVar = new hqe.i(lVarB, aVar54.d.b(), aVar55.a(), aVar54.f128451h.f());
                }
                return aVar;
        }
    }
}
