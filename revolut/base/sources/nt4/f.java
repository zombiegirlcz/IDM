package nt4;

import ael.e1;
import blj.t;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_confirmation.InternalData;
import com.revolut.feature.product.onboarding.data.ProductOnboardingService;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import gim.i;
import ha3.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nel.n;
import ntf.r;
import nv7.l;
import ny4.k;
import nyb.e0;
import o83.m;
import o92.h;
import obg.q;
import oc9.b0;
import oc9.v;
import ocb.x;
import ohb.j;
import skm.p0;
import te8.z;
import v6l.b1;
import vkm.j2;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f218964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f218964w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((g) this.f218964w, continuation, 0);
            case 1:
                return new f((r) this.f218964w, continuation, 1);
            case 2:
                return new f((nti.a) this.f218964w, continuation, 2);
            case 3:
                return new f((l) this.f218964w, continuation, 3);
            case 4:
                return new f((com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) this.f218964w, continuation, 4);
            case 5:
                return new f((com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) this.f218964w, continuation, 5);
            case 6:
                return new f((com.revolut.feature.referrals.impl.personalized_tracking.a) this.f218964w, continuation, 6);
            case 7:
                return new f((k) this.f218964w, continuation, 7);
            case 8:
                return new f((e0) this.f218964w, continuation, 8);
            case 9:
                return new f((com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) this.f218964w, continuation, 9);
            case 10:
                return new f((com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f218964w, continuation, 10);
            case 11:
                return new f((o48.i) this.f218964w, continuation, 11);
            case 12:
                return new f((o75.i) this.f218964w, continuation, 12);
            case 13:
                return new f((m) this.f218964w, continuation, 13);
            case 14:
                return new f((h) this.f218964w, continuation, 14);
            case 15:
                return new f((oa4.e) this.f218964w, continuation, 15);
            case 16:
                return new f((oc4.k) this.f218964w, continuation, 16);
            case 17:
                return new f((b0) this.f218964w, continuation, 17);
            case 18:
                return new f((x) this.f218964w, continuation, 18);
            case 19:
                return new f((og4.d) this.f218964w, continuation, 19);
            case 20:
                return new f((j) this.f218964w, continuation, 20);
            case 21:
                return new f((ohd.a) this.f218964w, continuation, 21);
            case 22:
                return new f((com.revolut.feature.apm.wero.impl.ui.registration.a) this.f218964w, continuation, 22);
            case 23:
                return new f((oj2.i) this.f218964w, continuation, 23);
            case 24:
                return new f((oja.a) this.f218964w, continuation, 24);
            case 25:
                return new f((ojd.g) this.f218964w, continuation, 25);
            case 26:
                return new f((ol6.c) this.f218964w, continuation, 26);
            case 27:
                return new f((AccountsNavBarContentView) this.f218964w, continuation, 27);
            case 28:
                return new f((om8.c) this.f218964w, continuation, 28);
            default:
                return new f((omg.c) this.f218964w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar = (g) this.f218964w;
                mtd.e eVar = new mtd.e(gVar, null, 14);
                this.v = 1;
                Object objB = pu7.a.B(gVar.k, "Reload limit history", eVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    r rVar = (r) this.f218964w;
                    nrd.g gVar2 = new nrd.g(rVar, 4);
                    mtd.e eVar2 = new mtd.e(rVar, null, 16);
                    this.v = 1;
                    if (gj7.b.V(gVar2, eVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                nti.a aVar4 = (nti.a) this.f218964w;
                this.v = 1;
                FeatureCommand featureCommandA = aVar4.a();
                return featureCommandA == aVar3 ? aVar3 : featureCommandA;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    l lVar = (l) this.f218964w;
                    mu7.c cVar = lVar.f219555r;
                    String str = lVar.o.f76103a;
                    this.v = 1;
                    if (cVar.b(this, str, false) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar7 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) this.f218964w;
                    nk9.l lVar2 = new nk9.l(9, null, aVar7);
                    this.v = 1;
                    if (aVar7.p2(this, lVar2) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar8 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) this.f218964w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    ufm.i iVarE = ((ael.k) aVar8.f103970q).e(aVar8.o.f103962a);
                    this.v = 1;
                    obj2 = nim.a.b(iVarE, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar8.H2(aVar8.u, new e1((n) obj2, 9));
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.referrals.impl.personalized_tracking.a aVar11 = (com.revolut.feature.referrals.impl.personalized_tracking.a) this.f218964w;
                jmc.e eVar3 = new jmc.e(aVar11, null, 9);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar11.k, "RELOAD_CONTENT", eVar3, this);
                return objB2 == aVar10 ? aVar10 : objB2;
            case 7:
                k kVar = (k) this.f218964w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = k.y2(kVar, this);
                    if (obj2 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar.x2(new nrd.g((InternalData) obj2, 28));
                return Unit.f186387a;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    qxb.c cVar2 = ((e0) this.f218964w).f220783c;
                    this.v = 1;
                    x4l.c cVar3 = cVar2.d;
                    Object obj3 = Unit.f186387a;
                    Object objE = cVar3.e(obj3, this);
                    if (objE == aVar13) {
                        obj3 = objE;
                    }
                    if (obj3 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    com.revolut.feature.card_management.impl.cardlimit.screens.overview.a aVar15 = (com.revolut.feature.card_management.impl.cardlimit.screens.overview.a) this.f218964w;
                    l93.f fVar = aVar15.f64830p;
                    String cardId = aVar15.o.f64828a;
                    ha3.x xVar = (ha3.x) fVar;
                    xVar.getClass();
                    Intrinsics.checkNotNullParameter(cardId, "cardId");
                    pfm.h hVarN = pd.b.n(p0.f264003c, new s(xVar, cardId, null, 4));
                    this.v = 1;
                    if (nim.a.a(hVarN, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f218964w;
                com.revolut.feature.freelancer.impl.ui.sales.refund.screen.a aVar17 = new com.revolut.feature.freelancer.impl.ui.sales.refund.screen.a(bVar, null);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar.k, "refund_freelancer_sale", aVar17, this);
                return objB3 == aVar16 ? aVar16 : objB3;
            case 11:
                o48.i iVar = (o48.i) this.f218964w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    d0 d0VarF = iVar.f222172p.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar.x2(new a2f.j((do3.n) obj2, 16));
                return Unit.f186387a;
            case 12:
                o75.i iVar2 = (o75.i) this.f218964w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    mtd.e eVar4 = new mtd.e(iVar2, null, 18);
                    this.v = 1;
                    if (iVar2.p2(this, eVar4) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar2.u2();
                return Unit.f186387a;
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar = (m) this.f218964w;
                o83.j jVar = new o83.j(mVar, null);
                this.v = 1;
                Object objP2 = mVar.p2(this, jVar);
                return objP2 == aVar20 ? aVar20 : objP2;
            case 14:
                h hVar = (h) this.f218964w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    mtd.e eVar5 = new mtd.e(hVar, null, 19);
                    this.v = 1;
                    obj2 = u0.b0(hVar.X(), "EnrollmentLabelScreenContract_CTA_BUTTON_TAG", eVar5, this);
                    if (obj2 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                hVar.C2(new o92.f((ViaVerdeEnrollment) obj2));
                return Unit.f186387a;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    oa4.e eVar6 = (oa4.e) this.f218964w;
                    oa4.d dVar = new oa4.d(eVar6, null);
                    this.v = 1;
                    if (eVar6.p2(this, dVar) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                oc4.k kVar2 = (oc4.k) this.f218964w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    kVar2.H2(kVar2.f224100q, new q(3));
                    oc4.i iVar3 = kVar2.f224099p;
                    this.v = 1;
                    obj2 = iVar3.d(this);
                    if (obj2 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                kVar2.I2(new Data((mu3.b) obj2, null, false, 6, null));
                return Unit.f186387a;
            case 17:
                b0 b0Var = (b0) this.f218964w;
                y yVar = b0Var.f224137t;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    mtd.e eVar7 = new mtd.e(b0Var, null, 21);
                    this.v = 1;
                    if (b0Var.p2(this, eVar7) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                Iterable iterable = (List) ((v) ((j2) yVar.f22677a).getValue()).f224159b.getContent();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (((v) ((j2) yVar.f22677a).getValue()).d.contains(((Terms) obj4).f)) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayListE0 = zhm.d0.E0(arrayList, (List) zi0.c.I(((v) ((j2) yVar.f22677a).getValue()).f224158a));
                ArrayList arrayList2 = new ArrayList(w.t(arrayListE0, 10));
                Iterator it8 = arrayListE0.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((Terms) it8.next()).f90355a);
                }
                b0Var.C2(new oc9.w(arrayList2));
                return Unit.f186387a;
            case 18:
                x xVar2 = (x) this.f218964w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    l93.f fVar2 = xVar2.f224200t;
                    this.v = 1;
                    obj2 = ((b1) ((ha3.x) fVar2).f.f319829a).k(this);
                    if (obj2 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                xVar2.x2(new lph.c(((Boolean) obj2).booleanValue(), 27));
                return Unit.f186387a;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                og4.d dVar2 = (og4.d) this.f218964w;
                mh1.d dVar3 = new mh1.d(27, null, dVar2);
                this.v = 1;
                Object objP22 = dVar2.p2(this, dVar3);
                return objP22 == aVar26 ? aVar26 : objP22;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    j jVar2 = (j) this.f218964w;
                    mtd.e eVar8 = new mtd.e(jVar2, null, 23);
                    this.v = 1;
                    if (u0.b0(jVar2.X(), "BUTTON_TAG_GENERATE_EMAIL", eVar8, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    ohd.a aVar29 = (ohd.a) this.f218964w;
                    dte.b bVar2 = aVar29.f225349m;
                    aVar29.f225350n.getClass();
                    w2d.a.a();
                    this.v = 1;
                    if (bVar2.b3("WATCHLIST_TIPS_HOST_ID", this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.apm.wero.impl.ui.registration.a aVar30 = (com.revolut.feature.apm.wero.impl.ui.registration.a) this.f218964w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    ku1.v vVar = new ku1.v(21);
                    oi2.i iVar4 = new oi2.i(aVar30, null, 0);
                    this.v = 1;
                    obj2 = n14.k.Q(aVar30, null, null, vVar, iVar4, this, 2);
                    if (obj2 == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.e eVar9 = (nii.e) obj2;
                if (eVar9 instanceof nii.d) {
                    aVar30.C2(oi2.e.f225416a);
                } else {
                    if (!(eVar9 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar30.C2(oi2.d.f225415a);
                }
                return Unit.f186387a;
            case 23:
                oj2.i iVar5 = (oj2.i) this.f218964w;
                ArticleWebViewScreenContract$InputData articleWebViewScreenContract$InputData = iVar5.o;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    y69.a aVar33 = iVar5.f225719p;
                    String articleId = articleWebViewScreenContract$InputData.f63115a;
                    String str2 = (String) articleWebViewScreenContract$InputData.f63116b.get("message_id");
                    String str3 = (String) articleWebViewScreenContract$InputData.f63116b.get("campaign_id");
                    aVar33.getClass();
                    Intrinsics.checkNotNullParameter(articleId, "articleId");
                    b79.b bVar3 = aVar33.f311230a;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(articleId, "articleId");
                    pfm.a aVarE = te0.w.g0(bVar3.f12938a.markArticleAsOpened(articleId, new a79.a((str2 == null && str3 == null) ? null : new a79.c(articleId, str2, str3)))).e(((b79.m) ((y69.d) aVar33.f311231b).f311235a).b());
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    ProductOnboardingService productOnboardingService = ((oja.a) this.f218964w).f225751a;
                    this.v = 1;
                    obj2 = productOnboardingService.getProductActivationWorkflow("ACCOUNT", "multi_currency", this);
                    if (obj2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((qja.l) obj2).getParams().getWorkflowId();
            case 25:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ojd.g gVar3 = (ojd.g) this.f218964w;
                ojd.e eVar10 = new ojd.e(gVar3, null);
                this.v = 1;
                Object objP23 = gVar3.p2(this, eVar10);
                return objP23 == aVar35 ? aVar35 : objP23;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    ol6.c cVar4 = (ol6.c) this.f218964w;
                    com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade.a aVar37 = new com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade.a(cVar4, null);
                    this.v = 1;
                    if (cVar4.p2(this, aVar37) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                AccountsNavBarContentView accountsNavBarContentView = (AccountsNavBarContentView) this.f218964w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    wjg.a uiPersonalisationInteractor = accountsNavBarContentView.getUiPersonalisationInteractor();
                    Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "<this>");
                    Flow flowQ = vkm.q.q(new q87.q(((ekg.g) uiPersonalisationInteractor).c(), 16));
                    t tVar = new t(accountsNavBarContentView, 17);
                    this.v = 1;
                    if (flowQ.collect(tVar, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    pfm.a aVarV = ue0.e.v(z.c(((om8.c) this.f218964w).f226774a));
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    omg.c cVar5 = (omg.c) this.f218964w;
                    this.v = 1;
                    if (omg.c.a(cVar5, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
