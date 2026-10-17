package ebg;

import abm.h;
import android.app.Activity;
import android.hardware.Camera;
import android.os.Parcelable;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.domain.models.openbanking.PaymentConsentType;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import eg2.u;
import elf.a1;
import elf.s1;
import elf.y0;
import eq8.e0;
import eq8.f0;
import et6.v;
import ha3.x;
import io.fotoapparat.exception.camera.CameraException;
import ip0.jp;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.j0;
import nii.u1;
import om4.x2;
import sa6.t;
import te0.w;
import v6l.b1;
import vkm.z1;
import ya6.z;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f124347w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f124347w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((p) this.f124347w, continuation, 0);
            case 1:
                return new o((qam.e) this.f124347w, continuation, 1);
            case 2:
                return new o((ec1.c) this.f124347w, continuation, 2);
            case 3:
                return new o((ec6.m) this.f124347w, continuation, 3);
            case 4:
                return new o((eck.j) this.f124347w, continuation, 4);
            case 5:
                return new o((u) this.f124347w, continuation, 5);
            case 6:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) this.f124347w, continuation, 6);
            case 7:
                return new o((eh1.i) this.f124347w, continuation, 7);
            case 8:
                return new o((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.f124347w, continuation, 8);
            case 9:
                return new o((com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) this.f124347w, continuation, 9);
            case 10:
                return new o((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f124347w, continuation, 10);
            case 11:
                return new o((ejd.k) this.f124347w, continuation, 11);
            case 12:
                return new o((com.revolut.feature.atm.impl.ui.redesign.details.a) this.f124347w, continuation, 12);
            case 13:
                return new o((ek7.p) this.f124347w, continuation, 13);
            case 14:
                return new o((ekf.j) this.f124347w, continuation, 14);
            case 15:
                return new o((ekf.m) this.f124347w, continuation, 15);
            case 16:
                return new o((a1) this.f124347w, continuation, 16);
            case 17:
                return new o((s1) this.f124347w, continuation, 17);
            case 18:
                return new o((elk.f) this.f124347w, continuation, 18);
            case 19:
                return new o((com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c) this.f124347w, continuation, 19);
            case 20:
                return new o((eol.l) this.f124347w, continuation, 20);
            case 21:
                return new o((epg.u) this.f124347w, continuation, 21);
            case 22:
                return new o((eq1.f) this.f124347w, continuation, 22);
            case 23:
                return new o((com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) this.f124347w, continuation, 23);
            case 24:
                return new o((f0) this.f124347w, continuation, 24);
            case 25:
                return new o((com.revolut.feature.salary_switch.impl.ui.flow.a) this.f124347w, continuation, 25);
            case 26:
                return new o((v) this.f124347w, continuation, 26);
            case 27:
                return new o((com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) this.f124347w, continuation, 27);
            case 28:
                return new o((ew6.g) this.f124347w, continuation, 28);
            default:
                return new o((ew8.e) this.f124347w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws InterruptedException {
        Object objY;
        Object objW;
        Object objA;
        Object objB;
        Object objB2;
        Object objP;
        Object objA2;
        int i = this.u;
        int i2 = 18;
        int i3 = 11;
        int i5 = 6;
        int i6 = 5;
        int i21 = 4;
        int i22 = 9;
        int i32 = 2;
        boolean z = false;
        Continuation continuation = null;
        Object obj3 = this.f124347w;
        int i33 = 1;
        switch (i) {
            case 0:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    p pVar = (p) obj3;
                    ayf.n nVar = pVar.f124348p;
                    List list = pVar.u;
                    this.v = 1;
                    Object objA3 = nim.a.a(nVar.f11174a.d.g(new hxf.c(list, 7), false), this);
                    if (objA3 != obj4) {
                        objA3 = Unit.f186387a;
                    }
                    if (objA3 != obj4) {
                        objA3 = Unit.f186387a;
                    }
                    if (objA3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objY = ((qam.e) obj3).f244071h.y(this);
                    if (objY != obj5) {
                    }
                    return obj5;
                }
                if (i59 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objY = obj2;
                qam.b bVar = (qam.b) objY;
                bVar.f244056a.getClass();
                nd.k.k();
                Camera camera = bVar.f244059g;
                if (camera == null) {
                    Intrinsics.r("camera");
                    throw null;
                }
                jp jpVar = bVar.f244061j;
                if (jpVar == null) {
                    Intrinsics.r("imageOrientation");
                    throw null;
                }
                final int i66 = jpVar.f164899a;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference();
                camera.takePicture(null, null, null, new Camera.PictureCallback() { // from class: qam.c
                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] data, Camera camera2) {
                        AtomicReference photoReference = atomicReference;
                        Intrinsics.checkNotNullParameter(photoReference, "$photoReference");
                        CountDownLatch latch = countDownLatch;
                        Intrinsics.checkNotNullParameter(latch, "$latch");
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        photoReference.set(new h(data, i66));
                        latch.countDown();
                    }
                });
                countDownLatch.await();
                Object obj6 = atomicReference.get();
                Intrinsics.checkNotNullExpressionValue(obj6, "photoReference.get()");
                obj5 = (abm.h) obj6;
                try {
                    bVar.c();
                    break;
                } catch (CameraException unused) {
                }
                return obj5;
            case 2:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVarB = rd0.e.b(((ec1.c) obj3).f124409m.d);
                    d4f.m mVar = new d4f.m(i32, i22, continuation);
                    this.v = 1;
                    if (vkm.q.y(dVarB, mVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    ya6.q qVar = ((t) ((ec6.m) obj3).f124455p.f112804a).f261345a;
                    ya6.p pVar2 = ya6.q.Companion;
                    pfm.r rVarG0 = w.g0(((z) qVar).f311992j.g(6, false));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                eck.j jVar = (eck.j) obj3;
                eck.i iVar = new eck.i(jVar, continuation, i33);
                this.v = 1;
                Object objB3 = pu7.a.B(jVar.k, "enable_birthday_sharing", iVar, this);
                return objB3 == aVar3 ? aVar3 : objB3;
            case 5:
                u uVar = (u) obj3;
                y yVar = uVar.u;
                twg.c cVar = uVar.f125540p;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objW = cVar.w(this);
                    if (objW == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objA = obj2;
                        uVar.H2(yVar, new e87.e((eg2.o) objA, 24));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objW = obj2;
                }
                uVar.H2(yVar, new e87.e((eg2.h) objW, 23));
                this.v = 2;
                objA = cVar.A(this);
                if (objA == aVar4) {
                    return aVar4;
                }
                uVar.H2(yVar, new e87.e((eg2.o) objA, 24));
                return Unit.f186387a;
            case 6:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a aVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) obj3;
                    a54.g gVar = new a54.g(aVar6, continuation, i2);
                    this.v = 1;
                    if (aVar6.p2(this, gVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (eh1.i.I2((eh1.i) obj3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar9 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) obj3;
                a54.g gVar2 = new a54.g(aVar9, continuation, 19);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar9.k, "reload", gVar2, this);
                return objB4 == aVar8 ? aVar8 : objB4;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b) obj3;
                    com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.a aVar11 = new com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar11) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) obj3;
                OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = dVar.o;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarA = ((mg6.c) dVar.f72538w).a(openBankingAuthPaymentScreenContract$InputData.f72529a);
                    this.v = 1;
                    objB = nim.a.b(nVarA, this);
                    if (objB == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                x61.f fVar = (x61.f) objB;
                a7j.g gVar3 = dVar.v;
                PaymentConsentType consentType = openBankingAuthPaymentScreenContract$InputData.f72530b.f60385a;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(consentType, "consentType");
                si6.d dVar2 = (si6.d) gVar3.f1921a.get(consentType);
                if (fVar == null || dVar2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Data required for payment was null clientName=", fVar != null ? fVar.f303016a : null, ", paymentConsentDelegateClass=", dVar2 != null ? dVar2.getClass().getSimpleName() : null));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    dVar.C2(new ej6.n(null));
                } else {
                    dVar.H2(dVar.D, new eed.j(fVar, dVar2, 12));
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ejd.k kVar = (ejd.k) obj3;
                ejd.h hVar = new ejd.h(kVar, null);
                this.v = 1;
                Object objP2 = kVar.p2(this, hVar);
                return objP2 == aVar13 ? aVar13 : objP2;
            case 12:
                com.revolut.feature.atm.impl.ui.redesign.details.a aVar14 = (com.revolut.feature.atm.impl.ui.redesign.details.a) obj3;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = ((ty1.b) aVar14.f63166r).a();
                    this.v = 1;
                    objB2 = nim.a.b(iVarA, this);
                    if (objB2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                Boolean bool = (Boolean) objB2;
                List listH = ((b1) ((x) aVar14.f63167s).f.f319829a).h();
                if (listH != null) {
                    List list2 = listH;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (((h93.f0) it8.next()).C()) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                aVar14.H2(aVar14.E, new a6j.a(bool, z, i2));
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ek7.p pVar3 = (ek7.p) obj3;
                ek7.o oVar = new ek7.o(pVar3, null);
                this.v = 1;
                Object objB5 = pu7.a.B(pVar3.k, "submit_claim", oVar, this);
                return objB5 == aVar16 ? aVar16 : objB5;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ekf.j jVar2 = (ekf.j) obj3;
                ekf.h hVar2 = new ekf.h(jVar2, continuation, i33);
                this.v = 1;
                Object objB6 = pu7.a.B(jVar2.e, "CLICK_TASK_ID", hVar2, this);
                return objB6 == aVar17 ? aVar17 : objB6;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ekf.m mVar2 = (ekf.m) obj3;
                ekf.k kVar2 = new ekf.k(mVar2, continuation, i33);
                this.v = 1;
                Object objB7 = pu7.a.B(mVar2.e, "CLICK_TASK_ID", kVar2, this);
                return objB7 == aVar18 ? aVar18 : objB7;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a1 a1Var = (a1) obj3;
                y0 y0Var = new y0(a1Var, continuation, i33);
                this.v = 1;
                Object objB8 = pu7.a.B(a1Var.e, "CLICK_TASK_ID", y0Var, this);
                return objB8 == aVar19 ? aVar19 : objB8;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s1 s1Var = (s1) obj3;
                e94.g gVar4 = new e94.g(s1Var, continuation, i21);
                this.v = 1;
                Object objB9 = pu7.a.B(s1Var.e, "RECEIPTS_PICKER_TASK_ID", gVar4, this);
                return objB9 == aVar20 ? aVar20 : objB9;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((elk.f) obj3).f127524q;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c cVar2 = (com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c) obj3;
                    com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.b bVar3 = new com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.b(cVar2, null);
                    this.v = 1;
                    if (cVar2.p2(this, bVar3) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                eol.l lVar = (eol.l) obj3;
                eg4.b bVar4 = new eg4.b(lVar, continuation, i3);
                this.v = 1;
                Object objB10 = pu7.a.B(lVar.k, "create_passkey", bVar4, this);
                return objB10 == aVar23 ? aVar23 : objB10;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                epg.u uVar2 = (epg.u) obj3;
                epg.q qVar2 = new epg.q(uVar2, continuation, i32);
                this.v = 1;
                Object objB11 = pu7.a.B(uVar2.k, "update_username", qVar2, this);
                return objB11 == aVar24 ? aVar24 : objB11;
            case 22:
                eq1.f fVar2 = (eq1.f) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    al6.c cVar3 = new al6.c(i22);
                    ack.n nVar2 = new ack.n(i3);
                    e94.g gVar5 = new e94.g(fVar2, continuation, i6);
                    this.v = 1;
                    objP = n14.k.P(fVar2.X(), null, cVar3, nVar2, gVar5, this);
                    if (objP == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i116 != 1) {
                        if (i116 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar = (nii.e) objP;
                if (eVar instanceof nii.c) {
                    fVar2.B2();
                } else {
                    if (!(eVar instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list3 = (List) ((nii.d) eVar).f216133a;
                    if (list3.isEmpty()) {
                        this.v = 2;
                        if (eq1.f.I2(fVar2, this) == aVar25) {
                            return aVar25;
                        }
                    } else {
                        fVar2.C2(new eq1.b(list3));
                    }
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar3 = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d) obj3;
                    com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.c cVar4 = new com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.c(dVar3, null);
                    this.v = 1;
                    if (dVar3.p2(this, cVar4) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                f0 f0Var = (f0) obj3;
                e0 e0Var = new e0(f0Var, continuation, i33);
                this.v = 1;
                Object objB12 = pu7.a.B(f0Var.k, "refreshTasks", e0Var, this);
                return objB12 == aVar27 ? aVar27 : objB12;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.salary_switch.impl.ui.flow.a aVar29 = (com.revolut.feature.salary_switch.impl.ui.flow.a) obj3;
                    e94.g gVar6 = new e94.g(aVar29, continuation, i5);
                    this.v = 1;
                    if (aVar29.p2(this, gVar6) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (v.a((v) obj3, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar3 = ((com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) obj3).f69563p;
                    this.v = 1;
                    if (((x2) nVar3).H(this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                ew6.g gVar7 = (ew6.g) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    e94.g gVar8 = new e94.g(gVar7, continuation, i22);
                    this.v = 1;
                    if (gVar7.p2(this, gVar8) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(gVar7, gVar7.X1(new nii.y0("STATUS_DIALOG_ID_SUCCESS", new j0((Clause) new TextLocalisedClause(R$string.freelancer_sale_invoice_add_tax_result_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), z, i21)), null, null, new ev7.b(gVar7, continuation, i6), 3);
            default:
                ew8.e eVar2 = (ew8.e) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    pd7.n nVar4 = (pd7.n) eVar2.f130110p.get();
                    ew8.b bVar5 = ew8.b.f130108a;
                    if (nVar4 == null) {
                        eVar2.C2(bVar5);
                        return Unit.f186387a;
                    }
                    WeakReference weakReference = eVar2.f130112r;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    if (activity == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unable to get current activity to launch sdk");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        eVar2.C2(bVar5);
                        return Unit.f186387a;
                    }
                    String str = eVar2.o.f77782a;
                    this.v = 1;
                    objA2 = nVar4.a(activity, str, this);
                    if (objA2 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                eVar2.C2(new ew8.c((pd7.m) objA2));
                return Unit.f186387a;
        }
    }
}
