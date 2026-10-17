package d3i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import androidx.core.graphics.drawable.DrawableKt;
import com.github.devnied.emvnfccard.model.EmvCard;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.qvik.impl.data.QvikPayService;
import com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanDetails;
import com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanParams;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.OpenFinanceFlowContract$Step;
import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumbers;
import d6j.l0;
import d6j.n0;
import d9.e1;
import db.f0;
import db.i0;
import dcl.m0;
import dk9.a0;
import ft3.h1;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import nfj.a1;
import nfj.m1;
import rfm.h0;
import rp0.k1;
import rp0.y0;
import skm.e0;
import skm.k0;
import vkm.j2;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f111168x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111167w = obj2;
        this.f111168x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((m) this.f111168x, continuation, 0);
                gVar.f111167w = obj2;
                return gVar;
            case 1:
                return new g((d44.a) this.f111167w, (h1) this.f111168x, continuation, 1);
            case 2:
                return new g((d63.c) this.f111167w, (Tag) this.f111168x, continuation, 2);
            case 3:
                return new g((n0) this.f111167w, (String) this.f111168x, continuation, 3);
            case 4:
                g gVar2 = new g((d73.l) this.f111168x, continuation, 4);
                gVar2.f111167w = obj2;
                return gVar2;
            case 5:
                g gVar3 = new g((d73.u) this.f111168x, continuation, 5);
                gVar3.f111167w = obj2;
                return gVar3;
            case 6:
                return new g((d7d.n) this.f111167w, (ShotDialogDisplayer$Configuration) this.f111168x, continuation, 6);
            case 7:
                return new g((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f111167w, (pdf.c) this.f111168x, continuation, 7);
            case 8:
                return new g((d9a.d) this.f111167w, (AliasRegistrationType) this.f111168x, continuation, 8);
            case 9:
                return new g((i0) this.f111167w, (ra.a) this.f111168x, continuation, 9);
            case 10:
                return new g((i0) this.f111167w, (String) this.f111168x, continuation, 10);
            case 11:
                return new g((db9.d) this.f111167w, (Terms) this.f111168x, continuation, 11);
            case 12:
                return new g((dba.i) this.f111167w, (f5j.a) this.f111168x, continuation, 12);
            case 13:
                return new g((dba.i) this.f111167w, (String) this.f111168x, continuation, 13);
            case 14:
                return new g((dc0.f) this.f111167w, (String) this.f111168x, continuation, 14);
            case 15:
                return new g((o7.b) this.f111167w, (String) this.f111168x, continuation, 15);
            case 16:
                return new g((dca.r) this.f111167w, (QrCodeImage) this.f111168x, continuation, 16);
            case 17:
                g gVar4 = new g((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f111168x, continuation, 17);
                gVar4.f111167w = obj2;
                return gVar4;
            case 18:
                return new g((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f111167w, (ty0.a) this.f111168x, continuation, 18);
            case 19:
                g gVar5 = new g((dee.z) this.f111168x, continuation, 19);
                gVar5.f111167w = obj2;
                return gVar5;
            case 20:
                return new g(this.f111167w, (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) this.f111168x, continuation, 20);
            case 21:
                return new g((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c) this.f111167w, (afi.a) this.f111168x, continuation, 21);
            case 22:
                return new g((dfj.u) this.f111167w, (String) this.f111168x, continuation, 22);
            case 23:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a) this.f111167w, (bg4.u) this.f111168x, continuation, 23);
            case 24:
                return new g((di5.e) this.f111167w, (jf0.c) this.f111168x, continuation, 24);
            case 25:
                return new g((com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) this.f111167w, (OpenFinanceFlowContract$Step) this.f111168x, continuation, 25);
            case 26:
                return new g((a0) this.f111167w, (String) this.f111168x, continuation, 26);
            case 27:
                return new g((a0) this.f111167w, (bi9.f) this.f111168x, continuation, 27);
            case 28:
                return new g((dkj.l) this.f111167w, (dkj.g) this.f111168x, continuation, 28);
            default:
                return new g((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f111167w, (dlk.t) this.f111168x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Integer] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object questionnaire;
        Object objI;
        Instant instant;
        ZonedDateTime zonedDateTimeAtZone;
        Object objZ2;
        f5j.a beneficiary;
        Object next;
        Object objScanQr;
        Object objJ;
        Object objA;
        Object objI2;
        int i = this.u;
        wkm.s sVar = wkm.s.f298328a;
        int i2 = 28;
        int i3 = 5;
        int i5 = 20;
        int i6 = 3;
        int i21 = 0;
        int i22 = 2;
        Long lValueOf = null;
        QvikQrScanDetails.Transfer transfer = null;
        Object obj3 = this.f111168x;
        boolean z = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z6 = true;
        boolean z11 = true;
        switch (i) {
            case 0:
                m mVar = (m) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) this.f111167w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    Job[] jobArr = {e0.C(coroutineScope, null, null, new f(mVar, num, i21), 3), e0.C(coroutineScope, null, null, new f(mVar, num, z ? 1 : 0), 3), e0.C(coroutineScope, null, null, new f(mVar, num, i22), 3), e0.C(coroutineScope, null, null, new f(mVar, num, i6), 3)};
                    this.f111167w = null;
                    this.v = 1;
                    if (e0.A(jobArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                d44.a aVar2 = (d44.a) this.f111167w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar2.f111225a;
                    String str = ((h1) obj3).f137835a;
                    this.v = 1;
                    questionnaire = creditPluginsService.getQuestionnaire(str, this);
                    if (questionnaire == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    questionnaire = obj2;
                }
                return aVar2.f111226b.a((q90.i) questionnaire);
            case 2:
                d63.c cVar = (d63.c) this.f111167w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    h0 h0VarD = cVar.f111443l.d((Tag) obj3);
                    this.v = 1;
                    objI = nim.a.i(h0VarD, this);
                    if (objI == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI = obj2;
                }
                EmvCard emvCard = (EmvCard) objI;
                if (emvCard == null) {
                    return Unit.f186387a;
                }
                CardStateEnum state = emvCard.getState();
                int i59 = state == null ? -1 : d63.b.f111442a[state.ordinal()];
                if (i59 == -1) {
                    cVar.f111445n.k(g63.b.f140838a);
                } else if (i59 == 1) {
                    z1 z1Var = cVar.f111445n;
                    Intrinsics.checkNotNullParameter(emvCard, "<this>");
                    Date expireDate = emvCard.getExpireDate();
                    LocalDate localDate = (expireDate == null || (instant = expireDate.toInstant()) == null || (zonedDateTimeAtZone = instant.atZone(ZoneId.systemDefault())) == null) ? null : zonedDateTimeAtZone.toLocalDate();
                    String cardNumber = emvCard.getCardNumber();
                    Intrinsics.checkNotNullExpressionValue(cardNumber, "getCardNumber(...)");
                    z1Var.k(new g63.c(e1.e(cardNumber, localDate != null ? Integer.valueOf(localDate.getMonthValue()) : null, localDate != null ? Integer.valueOf(localDate.getYear()) : 0)));
                } else if (i59 != 2) {
                    if (i59 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f111445n.k(g63.b.f140838a);
                } else {
                    cVar.f111445n.k(g63.a.f140837a);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n0 n0Var = (n0) this.f111167w;
                l0 l0Var = new l0((String) obj3, n0Var, null);
                this.v = 1;
                Object objB = pu7.a.B(n0Var.k, "onMenuItemClicked", l0Var, this);
                return objB == aVar5 ? aVar5 : objB;
            case 4:
                ProducerScope producerScope = (ProducerScope) this.f111167w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    ahe.i iVarT = ((ha3.x) ((d73.l) obj3).f111790a).f.t();
                    d73.k kVar = new d73.k(producerScope, num, i21);
                    this.f111167w = null;
                    this.v = 1;
                    Object objCollect = iVarT.collect(new akg.m(sVar, kVar, i3), this);
                    if (objCollect != aVar6) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar6) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                ProducerScope producerScope2 = (ProducerScope) this.f111167w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    ahe.i iVarT2 = ((ha3.x) ((d73.u) obj3).f111805c).f.t();
                    d73.k kVar2 = new d73.k(producerScope2, num, z3 ? 1 : 0);
                    this.f111167w = null;
                    this.v = 1;
                    Object objCollect2 = iVarT2.collect(new akg.m(sVar, kVar2, i3), this);
                    if (objCollect2 != aVar7) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar7) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(1000L, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((k1) ((d7d.n) this.f111167w).f111931r).c();
                ShotDialogDisplayer$Configuration configuration = (ShotDialogDisplayer$Configuration) obj3;
                y0 reason = y0.TIMEOUT;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(reason, "reason");
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f111167w;
                    k kVar3 = new k(gVar, (pdf.c) obj3, i5);
                    this.v = 1;
                    if (gVar.P2(this, kVar3) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                d9a.d dVar = (d9a.d) this.f111167w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objZ2 = dVar.f112358p.Z2((AliasRegistrationType) obj3, this);
                    if (objZ2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objZ2 = obj2;
                }
                dVar.C2((AliasRegistrationResult) objZ2);
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    i0 i0Var = (i0) this.f111167w;
                    com.feature.user.details.impl.ui.details.b bVar = new com.feature.user.details.impl.ui.details.b((ra.a) obj3, i0Var, null);
                    this.v = 1;
                    if (i0Var.p2(this, bVar) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                i0 i0Var2 = (i0) this.f111167w;
                f0 f0Var = new f0(i0Var2, (String) obj3, num, z4 ? 1 : 0);
                this.v = 1;
                Object objB2 = pu7.a.B(i0Var2.k, "onPhotoSelected", f0Var, this);
                return objB2 == aVar12 ? aVar12 : objB2;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = pre.c.b(((db9.d) this.f111167w).f112689b, ((Terms) obj3).f90355a);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    dba.i iVar = (dba.i) this.f111167w;
                    c64.d dVar2 = new c64.d(iVar, (f5j.a) obj3, num, i2);
                    this.v = 1;
                    if (u0.b0(iVar.X(), "CONFIRM_BENEFICIARY_REMOVE_BUTTON_ID", dVar2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                dba.i iVar2 = (dba.i) this.f111167w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    dba.g gVar2 = (dba.g) ((dba.e) ((j2) iVar2.f112703s.f22677a).getValue()).f112695a.getContent();
                    if (gVar2 != null) {
                        String str2 = (String) obj3;
                        Iterator it8 = gVar2.f112697a.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((f5j.a) next).f132329a, str2)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        beneficiary = (f5j.a) next;
                    } else {
                        beneficiary = null;
                    }
                    if (beneficiary == null) {
                        return null;
                    }
                    j60.a aVar16 = iVar2.f112701q;
                    fba.a aVar17 = iVar2.f112702r;
                    aVar17.getClass();
                    Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                    RowDelegate.Model modelC = aVar17.f133531a.c(beneficiary, true);
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_BENEFICIARY_REMOVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58731l, null, new TextLocalisedClause(R$string.pix_trusted_list_cell_sheet_action_remove, null, null, 14), false, "CONFIRM_BENEFICIARY_REMOVE_BUTTON_ID", null, beneficiary, null, 680);
                    int i106 = R$attr.uikit_dp0;
                    int i107 = R$attr.uikit_dp16;
                    yp0.b.p(model, i106, R$attr.uikit_dp24, i107, i107);
                    efm.b bVarG = aVar16.G(new rp0.y(zhm.u.c(model), new rp0.t(modelC.f53230c, modelC.f, null, 28), null, null, null, null, 1020));
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                dc0.f fVar = (dc0.f) this.f111167w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    String str3 = (String) obj3;
                    fVar.getClass();
                    a97.i observePage = new a97.i(2, fVar, dc0.f.class, "observePage", "observePage(Lcom/revolut/core/backend_flow/impl/ui/transactions/paging/TransactionsSelectionPageParams;Lcom/revolut/rxdata/dod/LoadingStrategy;)Lkotlinx/coroutines/flow/Flow;", 0, 10);
                    yb0.h hVar = fVar.f112783r;
                    if (hVar == null) {
                        throw new IllegalArgumentException("PagedDataStorage should be initialized first");
                    }
                    a76.c getPagedData = new a76.c(0, hVar, yb0.h.class, "getPagedData", "getPagedData()Lcom/revolut/core/pagination/PagedData;", 0, 9);
                    yb0.h hVar2 = fVar.f112783r;
                    if (hVar2 == null) {
                        throw new IllegalArgumentException("PagedDataStorage should be initialized first");
                    }
                    cn7.c storePagedData = new cn7.c(1, hVar2, yb0.h.class, "storePagedData", "storePagedData(Lcom/revolut/core/pagination/PagedData;)V", 0, 25);
                    Set set = fVar.o;
                    lk0.f initialParams = (str3.length() != 0 || set.isEmpty()) ? new cc0.b(str3, ((l80.f) fVar.f112779m).b().toEpochMilli()) : new cc0.a(set);
                    k downPageParams = new k(fVar, str3, 29);
                    fVar.f112780n.getClass();
                    wfm.j singleThreadScheduler = yk0.d.a();
                    Intrinsics.checkNotNullParameter(observePage, "observePage");
                    Intrinsics.checkNotNullParameter(getPagedData, "getPagedData");
                    Intrinsics.checkNotNullParameter(storePagedData, "storePagedData");
                    Intrinsics.checkNotNullParameter(initialParams, "initialParams");
                    Intrinsics.checkNotNullParameter(downPageParams, "downPageParams");
                    ya0.c upPageParams = ya0.c.f311885a;
                    Intrinsics.checkNotNullParameter(upPageParams, "upPageParams");
                    Intrinsics.checkNotNullParameter(singleThreadScheduler, "singleThreadScheduler");
                    c1g.f0 f0Var2 = new c1g.f0(new y8a.g(observePage), new y99.c(getPagedData), new g2f.b(i3, storePagedData), initialParams, downPageParams, upPageParams, singleThreadScheduler);
                    z1 z1Var2 = fVar.f112781p;
                    this.v = 1;
                    Object objA2 = nim.a.a(f0Var2.b(rd0.e.c(z1Var2, kotlin.coroutines.g.f186406a)), this);
                    Object obj4 = objA2;
                    if (objA2 != aVar18) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    QvikPayService qvikPayService = (QvikPayService) ((o7.b) this.f111167w).f222639b;
                    ec2.c cVar2 = new ec2.c((String) obj3);
                    this.v = 1;
                    objScanQr = qvikPayService.scanQr(cVar2, this);
                    if (objScanQr == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objScanQr = obj2;
                }
                ec2.b bVar2 = (ec2.b) objScanQr;
                String url2 = (String) obj3;
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                Intrinsics.checkNotNullParameter(url2, "url");
                if (!(bVar2 instanceof ec2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ec2.a aVar20 = (ec2.a) bVar2;
                iy1.h hVarI = qx1.b.i(aVar20.getRecipient());
                if (hVarI != null) {
                    QvikContact qvikContactA = QvikContact.a(mx1.k.b(hVarI, null), null, null, null, url2, 767);
                    ec2.d details = aVar20.getDetails();
                    Intrinsics.checkNotNullParameter(details, "<this>");
                    jo3.a amount = details.getAmount();
                    dj0.d dVarO = amount != null ? mo3.a.o(amount) : null;
                    Boolean amountModifiable = details.getAmountModifiable();
                    boolean zBooleanValue = amountModifiable != null ? amountModifiable.booleanValue() : true;
                    String reference = details.getReference();
                    Boolean referenceModifiable = details.getReferenceModifiable();
                    transfer = new QvikQrScanDetails.Transfer(qvikContactA, new QvikQrScanParams(dVarO, zBooleanValue, reference, referenceModifiable != null ? referenceModifiable.booleanValue() : true, details.getPaymentDate(), details.getCallbackUrl()), url2);
                }
                if (transfer != null) {
                    return transfer;
                }
                throw new IllegalStateException("Scan error");
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    dca.r rVar = (dca.r) this.f111167w;
                    Context context = rVar.f112844t;
                    this.v = 1;
                    objJ = ofm.q.J(rVar.f112843s, (QrCodeImage) obj3, context, 1000, 1000, this);
                    if (objJ == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                return do3.q.H(DrawableKt.toBitmap$default((Drawable) objJ, 0, 0, null, 7, null));
            case 17:
                rp0.y yVar = (rp0.y) this.f111167w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarG2 = ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) obj3).f89271y.G(yVar);
                    this.f111167w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG2, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = ((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f111167w).f89268t;
                String str4 = ((ty0.a) obj3).f275445a;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str4, null, null, this, 6);
                return objX1 == aVar23 ? aVar23 : objX1;
            case 19:
                FlowCollector flowCollector = (FlowCollector) this.f111167w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    dee.z zVar = (dee.z) obj3;
                    sde.e eVar = zVar.f113429p;
                    TransferArrivalRequest transferArrivalRequest = zVar.o.f89407b;
                    this.f111167w = flowCollector;
                    this.v = 1;
                    objA = eVar.a(transferArrivalRequest, this);
                    if (objA == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                Data data = new Data((TransferArrivalContent) objA, null, false, 6, null);
                this.f111167w = null;
                this.v = 2;
                if (flowCollector.emit(data, this) == aVar24) {
                    return aVar24;
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    Object obj5 = this.f111167w;
                    if (obj5 instanceof CartItem) {
                        nd1.n nVar = ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) obj3).o;
                        this.v = 1;
                        id1.p pVar = nVar.f214305a;
                        pVar.f160409c.remove((CartItem) obj5);
                        pVar.a();
                        if (Unit.f186387a == aVar25) {
                            return aVar25;
                        }
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c cVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.c) this.f111167w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    rfm.f0 f0VarE = cVar3.f94073p.e((afi.a) obj3);
                    this.v = 1;
                    if (nim.a.b(f0VarE, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar3.B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    a1 a1Var = ((dfj.u) this.f111167w).f114115b;
                    this.v = 1;
                    Object objD = ((m1) a1Var).f214991h.d(new nfj.e1((String) obj3), true, this);
                    if (objD != aVar27) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a aVar29 = (com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.a) this.f111167w;
                    dg4.c cVar4 = new dg4.c(aVar29, (bg4.u) obj3, num, i21);
                    this.v = 1;
                    if (aVar29.p2(this, cVar4) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objG = di5.e.g((di5.e) this.f111167w, (jf0.c) obj3, this);
                return objG == aVar30 ? aVar30 : objG;
            case 25:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                chf.a aVar32 = new chf.a((com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) this.f111167w, (OpenFinanceFlowContract$Step) obj3, num, 12);
                this.v = 1;
                Object objG2 = e0.G(aVar32, this);
                return objG2 == aVar31 ? aVar31 : objG2;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a0 a0Var = (a0) this.f111167w;
                dg4.c cVar5 = new dg4.c(a0Var, (String) obj3, num, i22);
                this.v = 1;
                Object objB3 = pu7.a.B(a0Var.k, "consume_plan_update_notification", cVar5, this);
                return objB3 == aVar33 ? aVar33 : objB3;
            case 27:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a0 a0Var2 = (a0) this.f111167w;
                dk9.z zVar2 = new dk9.z(a0Var2, (bi9.f) obj3, num, z6 ? 1 : 0);
                this.v = 1;
                Object objB4 = pu7.a.B(a0Var2.k, "repay", zVar2, this);
                return objB4 == aVar34 ? aVar34 : objB4;
            case 28:
                dkj.l lVar = (dkj.l) this.f111167w;
                cli.y yVar2 = lVar.f115579r;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                try {
                    if (i122 == 0) {
                        yhm.o.b(obj2);
                        lVar.H2(yVar2, new dg3.d(i5));
                        this.v = 1;
                        objI2 = dkj.l.I2(lVar, (dkj.g) obj3, this);
                        if (objI2 == aVar35) {
                            return aVar35;
                        }
                    } else {
                        if (i122 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objI2 = obj2;
                    }
                    EsimFeaturedPhoneNumbers esimFeaturedPhoneNumbers = (EsimFeaturedPhoneNumbers) objI2;
                    if (esimFeaturedPhoneNumbers.f100260a) {
                        Long l2 = ((dkj.g) ((j2) yVar2.f22677a).getValue()).f115570b;
                        lValueOf = Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) esimFeaturedPhoneNumbers.f100261b.size()));
                    }
                    lVar.H2(yVar2, new m0(esimFeaturedPhoneNumbers, lValueOf, i5));
                    return Unit.f186387a;
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimMobilePlanFeaturedNumberSelectionScreenModel", "Failed to load featured phone numbers", e, h0Var);
                    lVar.H2(yVar2, new d22.f(z11 ? 1 : 0, e));
                    throw e;
                }
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) this.f111167w;
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.b bVar3 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.b(eVar2, (dlk.t) obj3, null);
                    this.v = 1;
                    if (eVar2.p2(this, bVar3) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111168x = obj2;
    }
}
