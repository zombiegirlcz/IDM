package jkh;

import c84.t;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationScreenContract$InputData;
import g48.r0;
import java.util.List;
import jck.y;
import jwf.n;
import ke7.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kqh.u;
import mqd.o;
import n87.q;
import om4.m4;
import om4.s3;
import oph.m;
import qgf.p;
import qna.s;
import tdc.r;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f175174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Continuation continuation, oki.h hVar, boolean z) {
        super(2, continuation);
        this.u = i;
        this.v = z;
        this.f175174w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((l) this.f175174w, continuation, 0);
                gVar.v = ((Boolean) obj2).booleanValue();
                return gVar;
            case 1:
                g gVar2 = new g((n) this.f175174w, continuation, 1);
                gVar2.v = ((Boolean) obj2).booleanValue();
                return gVar2;
            case 2:
                g gVar3 = new g((k2a.d) this.f175174w, continuation, 2);
                gVar3.v = ((Boolean) obj2).booleanValue();
                return gVar3;
            case 3:
                g gVar4 = new g((com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) this.f175174w, continuation, 3);
                gVar4.v = ((Boolean) obj2).booleanValue();
                return gVar4;
            case 4:
                g gVar5 = new g((w) this.f175174w, continuation, 4);
                gVar5.v = ((Boolean) obj2).booleanValue();
                return gVar5;
            case 5:
                g gVar6 = new g((u) this.f175174w, continuation, 5);
                gVar6.v = ((Boolean) obj2).booleanValue();
                return gVar6;
            case 6:
                g gVar7 = new g((com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) this.f175174w, continuation, 6);
                gVar7.v = ((Boolean) obj2).booleanValue();
                return gVar7;
            case 7:
                g gVar8 = new g((lph.d) this.f175174w, continuation, 7);
                gVar8.v = ((Boolean) obj2).booleanValue();
                return gVar8;
            case 8:
                g gVar9 = new g((mb7.k) this.f175174w, continuation, 8);
                gVar9.v = ((Boolean) obj2).booleanValue();
                return gVar9;
            case 9:
                g gVar10 = new g((com.revolut.retail.feature.pod_nominees.impl.edit.c) this.f175174w, continuation, 9);
                gVar10.v = ((Boolean) obj2).booleanValue();
                return gVar10;
            case 10:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) this.f175174w, this.v, continuation);
            case 11:
                g gVar11 = new g((o) this.f175174w, continuation, 11);
                gVar11.v = ((Boolean) obj2).booleanValue();
                return gVar11;
            case 12:
                g gVar12 = new g((q) this.f175174w, continuation, 12);
                gVar12.v = ((Boolean) obj2).booleanValue();
                return gVar12;
            case 13:
                g gVar13 = new g((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f175174w, continuation, 13);
                gVar13.v = ((Boolean) obj2).booleanValue();
                return gVar13;
            case 14:
                g gVar14 = new g((nsl.i) this.f175174w, continuation, 14);
                gVar14.v = ((Boolean) obj2).booleanValue();
                return gVar14;
            case 15:
                g gVar15 = new g(continuation, (o95.e) this.f175174w, 15);
                gVar15.v = ((Boolean) obj2).booleanValue();
                return gVar15;
            case 16:
                g gVar16 = new g((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f175174w, continuation, 16);
                gVar16.v = ((Boolean) obj2).booleanValue();
                return gVar16;
            case 17:
                g gVar17 = new g((om4.f) this.f175174w, continuation, 17);
                gVar17.v = ((Boolean) obj2).booleanValue();
                return gVar17;
            case 18:
                g gVar18 = new g(continuation, (om4.l) this.f175174w, 18);
                gVar18.v = ((Boolean) obj2).booleanValue();
                return gVar18;
            case 19:
                g gVar19 = new g(continuation, (s3) this.f175174w, 19);
                gVar19.v = ((Boolean) obj2).booleanValue();
                return gVar19;
            case 20:
                g gVar20 = new g((m4) this.f175174w, continuation, 20);
                gVar20.v = ((Boolean) obj2).booleanValue();
                return gVar20;
            case 21:
                g gVar21 = new g((m) this.f175174w, continuation, 21);
                gVar21.v = ((Boolean) obj2).booleanValue();
                return gVar21;
            case 22:
                g gVar22 = new g(continuation, (osd.e) this.f175174w, 22);
                gVar22.v = ((Boolean) obj2).booleanValue();
                return gVar22;
            case 23:
                g gVar23 = new g((osl.i) this.f175174w, continuation, 23);
                gVar23.v = ((Boolean) obj2).booleanValue();
                return gVar23;
            case 24:
                g gVar24 = new g((com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) this.f175174w, continuation, 24);
                gVar24.v = ((Boolean) obj2).booleanValue();
                return gVar24;
            case 25:
                return new g(25, continuation, (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f175174w, this.v);
            case 26:
                g gVar25 = new g((com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) this.f175174w, continuation, 26);
                gVar25.v = ((Boolean) obj2).booleanValue();
                return gVar25;
            case 27:
                return new g(27, continuation, (qc2.n) this.f175174w, this.v);
            case 28:
                g gVar26 = new g((com.revolut.feature.transaction_list.impl.ui.list.flow.a) this.f175174w, continuation, 28);
                gVar26.v = ((Boolean) obj2).booleanValue();
                return gVar26;
            default:
                g gVar27 = new g((s) this.f175174w, continuation, 29);
                gVar27.v = ((Boolean) obj2).booleanValue();
                return gVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((g) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                return ((g) create(bool2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                return ((g) create(bool3, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                return ((g) create(bool4, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                return ((g) create(bool5, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                Boolean bool6 = (Boolean) obj2;
                bool6.booleanValue();
                return ((g) create(bool6, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                Boolean bool7 = (Boolean) obj2;
                bool7.booleanValue();
                return ((g) create(bool7, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                Boolean bool8 = (Boolean) obj2;
                bool8.booleanValue();
                return ((g) create(bool8, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                Boolean bool9 = (Boolean) obj2;
                bool9.booleanValue();
                return ((g) create(bool9, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                Boolean bool10 = (Boolean) obj2;
                bool10.booleanValue();
                return ((g) create(bool10, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                Boolean bool11 = (Boolean) obj2;
                bool11.booleanValue();
                return ((g) create(bool11, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                Boolean bool12 = (Boolean) obj2;
                bool12.booleanValue();
                return ((g) create(bool12, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                Boolean bool13 = (Boolean) obj2;
                bool13.booleanValue();
                return ((g) create(bool13, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                Boolean bool14 = (Boolean) obj2;
                bool14.booleanValue();
                return ((g) create(bool14, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                Boolean bool15 = (Boolean) obj2;
                bool15.booleanValue();
                return ((g) create(bool15, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                Boolean bool16 = (Boolean) obj2;
                bool16.booleanValue();
                return ((g) create(bool16, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                Boolean bool17 = (Boolean) obj2;
                bool17.booleanValue();
                return ((g) create(bool17, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                Boolean bool18 = (Boolean) obj2;
                bool18.booleanValue();
                return ((g) create(bool18, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                Boolean bool19 = (Boolean) obj2;
                bool19.booleanValue();
                return ((g) create(bool19, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                Boolean bool20 = (Boolean) obj2;
                bool20.booleanValue();
                return ((g) create(bool20, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                Boolean bool21 = (Boolean) obj2;
                bool21.booleanValue();
                return ((g) create(bool21, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                Boolean bool22 = (Boolean) obj2;
                bool22.booleanValue();
                return ((g) create(bool22, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                Boolean bool23 = (Boolean) obj2;
                bool23.booleanValue();
                return ((g) create(bool23, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                Boolean bool24 = (Boolean) obj2;
                bool24.booleanValue();
                return ((g) create(bool24, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                Boolean bool25 = (Boolean) obj2;
                bool25.booleanValue();
                return ((g) create(bool25, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                Boolean bool26 = (Boolean) obj2;
                bool26.booleanValue();
                return ((g) create(bool26, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                Boolean bool27 = (Boolean) obj2;
                bool27.booleanValue();
                return ((g) create(bool27, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow v1Var;
        int i = this.u;
        int i2 = 5;
        int i3 = 11;
        int i5 = 3;
        int i6 = 20;
        int i21 = 6;
        int i22 = 4;
        int i32 = 1;
        int i33 = 24;
        int i43 = 0;
        w4l.h hVar = w4l.h.f294642c;
        int i59 = 14;
        Continuation continuation = null;
        Object obj3 = this.f175174w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) obj3;
                lVar.H2(lVar.f175183r, new y(z, i32));
                break;
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) obj3).x2(new y(z3, i2));
                break;
            case 2:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(j2a.h.class, KTypeProjection.INSTANCE, List.class, ((k2a.d) obj3).f180449b, com.google.android.gms.internal.mlkit_vision_face.a.r("PERSONALISATIONS_KEY_", z4));
                if (list != null) {
                }
                break;
            case 3:
                boolean z6 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar5 = (com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) obj3;
                aVar5.H2(aVar5.f93611w, new y(z6, i59));
                break;
            case 4:
                boolean z11 = this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) obj3;
                wVar.H2(wVar.f183046x, new y(z11, 17));
                break;
            case 5:
                boolean z12 = this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) obj3;
                uVar.H2(uVar.f188428t, new y(z12, 19));
                break;
            case 6:
                boolean z29 = this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a aVar9 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.a) obj3;
                aVar9.H2(aVar9.f84630y, new y(z29, i33));
                break;
            case 7:
                boolean z31 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lph.d dVar = (lph.d) obj3;
                dVar.H2(dVar.f199131s, new lph.c(z31, i43));
                break;
            case 8:
                boolean z41 = this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mb7.k kVar = (mb7.k) obj3;
                kVar.H2(kVar.f204179p, new lph.c(z41, i2));
                break;
            case 9:
                boolean z49 = this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pod_nominees.impl.edit.c cVar = (com.revolut.retail.feature.pod_nominees.impl.edit.c) obj3;
                cVar.H2(cVar.f102602t, new lph.c(z49, 7));
                break;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) obj3, this.v, null, null, 6);
                break;
            case 11:
                boolean z54 = this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z54) {
                    r0 r0Var = ((o) obj3).f207989c;
                    Flow flowJ = r0Var.j(null, hVar);
                    n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                }
                break;
            case 12:
                boolean z74 = this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) obj3;
                qVar.H2(qVar.f213267s, new lph.c(z74, i59));
                break;
            case 13:
                boolean z83 = this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) obj3;
                fVar.H2(fVar.g0, new lph.c(z83, i6));
                break;
            case 14:
                boolean z89 = this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nsl.i iVar = (nsl.i) obj3;
                iVar.X2(iVar.f218922t, new lph.c(z89, 23));
                break;
            case 15:
                o95.e eVar = (o95.e) obj3;
                boolean z96 = this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z96) {
                }
                break;
            case 16:
                boolean z100 = this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) obj3).z;
                rVar.X2(rVar.f269966p, new rk.b(z100, i59));
                break;
            case 17:
                boolean z101 = this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z101) {
                }
                break;
            case 18:
                om4.l lVar2 = (om4.l) obj3;
                boolean z102 = this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z102) {
                }
                break;
            case 19:
                s3 s3Var = (s3) obj3;
                boolean z103 = this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z103) {
                }
                break;
            case 20:
                boolean z104 = this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z104) {
                }
                break;
            case 21:
                boolean z105 = this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) obj3;
                mVar.H2(mVar.f227675s, new ocb.u(z105, i22));
                break;
            case 22:
                osd.e eVar2 = (osd.e) obj3;
                boolean z106 = this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z106) {
                }
                break;
            case 23:
                boolean z107 = this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                osl.i iVar2 = (osl.i) obj3;
                iVar2.X2(iVar2.f229374s, new ocb.u(z107, i21));
                break;
            case 24:
                boolean z108 = this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) obj3;
                bVar.H2(bVar.f101081e0, new ocb.u(z108, 12));
                break;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (this.v) {
                    com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar29 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) obj3;
                    aVar29.H2(aVar29.u, new q09.a(i33));
                }
                break;
            case 26:
                boolean z109 = this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b) obj3;
                cli.y yVar = bVar2.B;
                bVar2.H2(yVar, new ocb.u(z109, 16));
                Address address = (Address) ((q23.q) ((j2) yVar.f22677a).getValue()).f241511a.getContent();
                if (address == null) {
                    q13.d dVar2 = bVar2.f65148p;
                    CardDeliveryAddressVerificationScreenContract$InputData cardDeliveryAddressVerificationScreenContract$InputData = bVar2.o;
                    String str = cardDeliveryAddressVerificationScreenContract$InputData.f65140b ? cardDeliveryAddressVerificationScreenContract$InputData.f65143h : null;
                    if (z109) {
                        v1Var = nim.a.v(new vkm.y(new olf.e((Flow) dVar2.f241340b.e.getValue(), 22), new pc2.d(i5, i22, continuation)), new q09.a(i59));
                    } else {
                        dVar2.getClass();
                        v1Var = new v1(new prl.k(i3, dVar2, str, continuation));
                    }
                }
                break;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (this.v) {
                    qc2.n nVar = (qc2.n) obj3;
                    nVar.H2(nVar.f244533x, new qb5.a(i6));
                }
                break;
            case 28:
                boolean z110 = this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.flow.a aVar33 = (com.revolut.feature.transaction_list.impl.ui.list.flow.a) obj3;
                aVar33.H2(aVar33.u, new p(aVar33, z110, i32));
                break;
            default:
                boolean z111 = this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) obj3;
                sVar.H2(sVar.f247932x, new ocb.u(z111, i33));
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f175174w = bVar;
        this.v = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f175174w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.u = i;
        this.f175174w = obj2;
    }
}
