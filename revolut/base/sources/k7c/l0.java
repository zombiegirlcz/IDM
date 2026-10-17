package k7c;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.onfido.workflow.internal.ui.WorkflowLoadingFragment;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayJoinApiService;
import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.PendingCashbackDetails;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.TransferReviewSubmitScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import e7c.c0;
import elf.r1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import om4.x2;
import tof.q6;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f181977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f181977w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0((m0) this.f181977w, continuation, 0);
            case 1:
                return new l0((p0) this.f181977w, continuation, 1);
            case 2:
                return new l0((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b) this.f181977w, continuation, 2);
            case 3:
                return new l0((com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b) this.f181977w, continuation, 3);
            case 4:
                return new l0((k9e.i) this.f181977w, continuation, 4);
            case 5:
                return new l0((com.revolut.core.backend_flow.impl.flow.permission.b) this.f181977w, continuation, 5);
            case 6:
                return new l0((kae.i) this.f181977w, continuation, 6);
            case 7:
                return new l0((TransferReviewSubmitScreen) this.f181977w, continuation, 7);
            case 8:
                return new l0((kaf.g) this.f181977w, continuation, 8);
            case 9:
                return new l0((com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.f181977w, continuation, 9);
            case 10:
                return new l0((kc9.m) this.f181977w, continuation, 10);
            case 11:
                return new l0((ke7.w) this.f181977w, continuation, 11);
            case 12:
                return new l0((com.revolut.feature.passcode.ui.biometric_passcode_verification.b) this.f181977w, continuation, 12);
            case 13:
                return new l0((kea.c) this.f181977w, continuation, 13);
            case 14:
                return new l0((com.revolut.feature.checkout.impl.resume.flow.a) this.f181977w, continuation, 14);
            case 15:
                return new l0((kie.g) this.f181977w, continuation, 15);
            case 16:
                return new l0((com.revolut.feature.product.lifecycle.flow.a) this.f181977w, continuation, 16);
            case 17:
                return new l0((kjk.o) this.f181977w, continuation, 17);
            case 18:
                return new l0((WorkflowLoadingFragment) this.f181977w, continuation, 18);
            case 19:
                return new l0((klf.h0) this.f181977w, continuation, 19);
            case 20:
                return new l0((kll.a) this.f181977w, continuation, 20);
            case 21:
                return new l0((kmc.s) this.f181977w, continuation, 21);
            case 22:
                return new l0((ko7.l) this.f181977w, continuation, 22);
            case 23:
                return new l0((kp7.w) this.f181977w, continuation, 23);
            case 24:
                return new l0((kpb.l) this.f181977w, continuation, 24);
            case 25:
                return new l0((ks9.a) this.f181977w, continuation, 25);
            case 26:
                return new l0((ksk.g) this.f181977w, continuation, 26);
            case 27:
                return new l0((kv0.c) this.f181977w, continuation, 27);
            case 28:
                return new l0((kv2.k) this.f181977w, continuation, 28);
            default:
                return new l0((com.revolut.feature.credit.card.impl.ui.statement.details.flow.a) this.f181977w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object cashbackV2;
        Parcelable paymentTransactionThreshold;
        Object objV;
        Object objZ;
        Object objI2;
        Object objB;
        yte.n nVar;
        Object objX;
        Object objC;
        Object objB2;
        Object objC2;
        int i = this.u;
        int i2 = 6;
        int i3 = 5;
        int i5 = 24;
        int i6 = 15;
        int i21 = 0;
        int i22 = 10;
        int i32 = 2;
        ?? aVar = 0;
        aVar = 0;
        aVar = 0;
        Object obj3 = this.f181977w;
        int i33 = 1;
        switch (i) {
            case 0:
                m0 m0Var = (m0) obj3;
                RevolutPayJoinApiService revolutPayJoinApiService = m0Var.f181981b;
                ue0.c cVar = m0Var.f181980a;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    l7c.a aVar3 = (l7c.a) cVar.T2("CASHBACK_ENROLLMENT_CAMPAIGN_IDENTIFIER_KEY", wim.z.d(kotlin.jvm.internal.o0.b(l7c.a.class)));
                    if (aVar3 != null) {
                        Intrinsics.checkNotNullParameter(aVar3, "<this>");
                        if (aVar3.getOrderToken() != null) {
                            aVar = new u9c.b(aVar3.getOrderToken());
                        } else if (aVar3.getMerchantPublicKey() != null && aVar3.getCurrency() != null) {
                            aVar = new u9c.a(aVar3.getMerchantPublicKey(), aVar3.getCurrency());
                        }
                    }
                    if (aVar instanceof u9c.b) {
                        e7c.l lVar = new e7c.l(((u9c.b) aVar).f278450a);
                        this.v = 1;
                        if (revolutPayJoinApiService.enrollOrderCashback(lVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (aVar instanceof u9c.a) {
                        u9c.a aVar4 = (u9c.a) aVar;
                        e7c.k kVar = new e7c.k(aVar4.f278448a, aVar4.f278449b);
                        this.v = 2;
                        if (revolutPayJoinApiService.enrollMerchantCashback(kVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i43 != 1 && i43 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(cVar.I0("CASHBACK_ENROLLMENT_CAMPAIGN_IDENTIFIER_KEY"));
            case 1:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    RevolutPayService revolutPayService = ((p0) obj3).f181987a;
                    this.v = 1;
                    cashbackV2 = revolutPayService.getCashbackV2(this);
                    if (cashbackV2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    cashbackV2 = obj2;
                }
                e7c.c0 c0Var = (e7c.c0) cashbackV2;
                Intrinsics.checkNotNullParameter(c0Var, "<this>");
                c0.a aVarA = c0Var.getDetails();
                if (aVarA == null) {
                    return PendingCashbackDetails.Empty.f84455a;
                }
                dj0.d dVarO = mo3.a.o(aVarA.getTotalAmount());
                String strB = aVarA.getMerchantDescriptor();
                String strA = aVarA.getMerchantCountry();
                com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a aVarA2 = d7c.i.a(aVarA.getStatus());
                List<c0.b> listA = aVarA.getRequirements().getGroups();
                ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                for (c0.b bVar : listA) {
                    if (bVar instanceof c0.b.C0718b) {
                        c0.b.C0718b c0718b = (c0.b.C0718b) bVar;
                        com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a aVarA3 = d7c.i.a(c0718b.getStatus());
                        jo3.a aVarA4 = c0718b.getCashbackAmount();
                        paymentTransactionThreshold = new PendingCashbackDetails.Data.Requirement.Kyc(aVarA3, aVarA4 != null ? mo3.a.o(aVarA4) : null);
                    } else {
                        if (!(bVar instanceof c0.b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0.b.c cVar2 = (c0.b.c) bVar;
                        jo3.a aVarB = cVar2.getCashbackAmount();
                        dj0.d dVarO2 = aVarB != null ? mo3.a.o(aVarB) : null;
                        com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a aVarA5 = d7c.i.a(cVar2.getStatus());
                        long jC = cVar2.getMinTimesCompletion();
                        jo3.a aVarD = cVar2.getMinTransactionThreshold();
                        paymentTransactionThreshold = new PendingCashbackDetails.Data.Requirement.PaymentTransactionThreshold(aVarA5, dVarO2, jC, aVarD != null ? mo3.a.o(aVarD) : null, cVar2.getBoundToMerchant());
                    }
                    arrayList.add(paymentTransactionThreshold);
                }
                return new PendingCashbackDetails.Data(dVarO, strB, strA, aVarA2, arrayList);
            case 2:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b bVar2 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b) obj3;
                    com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.a aVar7 = new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar7) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b.O2((com.revolut.feature.junior.card_request.impl.ui.flow.request_review.b) obj3, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k9e.i iVar = (k9e.i) obj3;
                iyi.j jVar = new iyi.j(iVar, aVar, 17);
                this.v = 1;
                Object objB3 = pu7.a.B(iVar.k, "block_subscription", jVar, this);
                return objB3 == aVar9 ? aVar9 : objB3;
            case 5:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.core.backend_flow.impl.flow.permission.b bVar3 = (com.revolut.core.backend_flow.impl.flow.permission.b) obj3;
                    com.revolut.core.backend_flow.impl.flow.permission.a aVar11 = new com.revolut.core.backend_flow.impl.flow.permission.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar11) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    kae.i iVar2 = (kae.i) obj3;
                    kae.h hVar = new kae.h(iVar2, null);
                    this.v = 1;
                    if (iVar2.p2(this, hVar) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    kaf.g gVar = (kaf.g) ((TransferReviewSubmitScreen) obj3).R.getValue();
                    this.v = 1;
                    gVar.getClass();
                    Object objB4 = pu7.a.B(gVar.k, "TransferReviewSubmitScreenModel_submit", new jmc.e(gVar, aVar, i32), this);
                    Object obj4 = objB4;
                    if (objB4 != aVar13) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                kaf.g gVar2 = (kaf.g) obj3;
                cli.y yVar = gVar2.f182490r;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                try {
                    if (i101 == 0) {
                        yhm.o.b(obj2);
                        gVar2.H2(yVar, new k9h.d(9));
                        this.v = 1;
                        try {
                            try {
                                objV = n14.k.V(gVar2, null, null, new iuf.y(gVar2, i2), new iyi.j(gVar2, aVar, 19), this, 3);
                                if (objV == aVar14) {
                                    return aVar14;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                gVar2.H2(yVar, new k9h.d(i22));
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    } else {
                        if (i101 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objV = obj2;
                    }
                    if (((nii.h) objV) instanceof nii.g) {
                        gVar2.C2(kaf.c.f182483a);
                        break;
                    }
                    gVar2.H2(yVar, new k9h.d(i22));
                    return Unit.f186387a;
                } catch (Throwable th12) {
                    th = th12;
                }
                break;
            case 9:
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar15 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    wa7.m mVar = aVar15.f74678p;
                    this.v = 1;
                    a01.e eVar = new a01.e(mVar.d, aVar, i6);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, eVar, this);
                    Object obj5 = objJ;
                    if (objJ != aVar16) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 != aVar16) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar15.o.getClass();
                return aVar15.X1(new nii.y0(null, new nii.g0(new TextLocalisedClause(R$string.hidden_accounts_dialog_unhide_secret_accounts_toast_success, null, null, 14), null, null, null, null, null, null, null, false, null, false, null, 16382), false, 5));
            case 10:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((kc9.m) obj3).J2(this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                ke7.w wVar = (ke7.w) obj3;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVarB = rd0.e.b(((com.revolut.feature.in_app_calls.b) wVar.f183042r).f74794b);
                    this.v = 1;
                    objZ = vkm.q.z(dVarB, this);
                    if (objZ == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objZ = obj2;
                }
                InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) objZ;
                if (inAppCallStateWithData == null) {
                    return Unit.f186387a;
                }
                UUID uuid = inAppCallStateWithData.f74786b;
                if (wVar.v.f14697a.contains(uuid)) {
                    wVar.B2();
                    return Unit.f186387a;
                }
                n30.y yVar2 = wVar.f183043s;
                UUID uuid2 = inAppCallStateWithData.d;
                rf3.g gVar3 = (rf3.g) yVar2;
                gVar3.getClass();
                Uri.Builder builderAppendPath = new Uri.Builder().scheme("revolut").authority("app").appendPath("chat");
                if (uuid != null) {
                    builderAppendPath.appendQueryParameter("ticketId", uuid.toString());
                }
                if (uuid2 != null) {
                    builderAppendPath.appendQueryParameter("feedId", uuid2.toString());
                }
                Intent intent = new Intent("android.intent.action.VIEW", builderAppendPath.build()).setPackage(gVar3.f253681a.getContext().getPackageName());
                Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
                wVar.C1(new ExternalDestination.ByIntent(intent, null));
                return Unit.f186387a;
            case 12:
                com.revolut.feature.passcode.ui.biometric_passcode_verification.b bVar4 = (com.revolut.feature.passcode.ui.biometric_passcode_verification.b) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objI2 = com.revolut.feature.passcode.ui.biometric_passcode_verification.b.I2(bVar4, this);
                    if (objI2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                if (((Boolean) objI2).booleanValue()) {
                    bVar4.f78642r.e3(true, true);
                } else {
                    bVar4.J2();
                }
                return Unit.f186387a;
            case 13:
                kea.c cVar3 = (kea.c) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarA = ((ang.b) cVar3.o).a();
                    this.v = 1;
                    objB = nim.a.b(d0VarA, this);
                    if (objB == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                if (l71.f.i((l71.d) objB)) {
                    AccountId accountId = cVar3.f183060l.f80846b;
                    if (accountId instanceof AccountId.Personal) {
                        nVar = yte.n.CURRENT;
                    } else {
                        if (!(accountId instanceof AccountId.Joint)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar = yte.n.JOINT;
                    }
                    yji.n.j2(cVar3, vkm.q.Q(vkm.q.q((MutableSharedFlow) cVar3.f183063p.getValue()), new k25.o(aVar, cVar3, nVar, i33)), null, new kae.d(cVar3, aVar, i2), 3);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.checkout.impl.resume.flow.a aVar22 = (com.revolut.feature.checkout.impl.resume.flow.a) obj3;
                    iyi.j jVar2 = new iyi.j(aVar22, aVar, 22);
                    this.v = 1;
                    if (aVar22.p2(this, jVar2) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kie.g gVar4 = (kie.g) obj3;
                up4.h hVar2 = new up4.h(i3);
                kie.f fVar = new kie.f(gVar4, null);
                this.v = 1;
                Object objR = n14.k.R(gVar4, null, hVar2, fVar, this, 3);
                return objR == aVar23 ? aVar23 : objR;
            case 16:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.product.lifecycle.flow.a aVar25 = (com.revolut.feature.product.lifecycle.flow.a) obj3;
                    iyi.j jVar3 = new iyi.j(aVar25, aVar, 23);
                    this.v = 1;
                    if (aVar25.p2(this, jVar3) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kjk.o oVar = (kjk.o) obj3;
                iyi.j jVar4 = new iyi.j(oVar, aVar, i5);
                this.v = 1;
                Object objB5 = kjk.o.b(oVar, jVar4, this);
                return objB5 == aVar26 ? aVar26 : objB5;
            case 18:
                WorkflowLoadingFragment workflowLoadingFragment = (WorkflowLoadingFragment) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = ((kl.e0) workflowLoadingFragment.c0.getValue()).f185176r;
                    r1 r1Var = new r1(workflowLoadingFragment, i32);
                    this.v = 1;
                    if (j2Var.collect(r1Var, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                throw new KotlinNothingValueException();
            case 19:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    klf.h0 h0Var = (klf.h0) obj3;
                    com.revolut.domain.interactors.transactions.a aVar29 = h0Var.f185491c;
                    String str = h0Var.f185494j;
                    q6 q6VarK = qk.d.k(h0Var.f185490b);
                    this.v = 1;
                    if (((mjf.b0) aVar29).n(str, q6VarK, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    akl.z zVar = ((kll.a) obj3).f185651m;
                    this.v = 1;
                    x4l.c cVar4 = zVar.e;
                    Object obj6 = Unit.f186387a;
                    Object objD = cVar4.d(obj6, false, this);
                    if (objD == aVar30) {
                        obj6 = objD;
                    }
                    if (obj6 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                kmc.s sVar = (kmc.s) obj3;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(sVar.f185779t.a(), null, new kmc.f(sVar, i33), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i114 != 1) {
                        if (i114 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                ilc.a aVar32 = (ilc.a) objX;
                kmc.l lVar2 = kmc.s.Companion;
                if (aVar32 == ilc.a.GB && ((Boolean) sVar.f185781x.getValue()).booleanValue()) {
                    k49.f fVar2 = new k49.f(sVar, aVar32, aVar, i6);
                    this.v = 2;
                    if (sVar.p2(this, fVar2) == aVar31) {
                        return aVar31;
                    }
                } else {
                    OnboardingFlowContract$Step onboardingFlowContract$Step = (kmc.o.f185771b[aVar32.ordinal()] != 1 || ((Boolean) sVar.f185780w.getValue()).booleanValue()) ? OnboardingFlowContract$Step.TEMPLATES : OnboardingFlowContract$Step.PROJECTIONS;
                    sVar.H2(sVar.f185782y, new k79.b(aVar32, new kmc.m(onboardingFlowContract$Step, null), i5));
                    oki.h.t2(sVar, sVar.z, onboardingFlowContract$Step, true, null, false, 12);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    ko7.l lVar3 = (ko7.l) obj3;
                    Data data = ((ko7.d) lVar3.t2()).f186252a;
                    this.v = 1;
                    if (lVar3.z2(data, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                kp7.w wVar2 = (kp7.w) obj3;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    wVar2.L2(vl7.a.c(null, null));
                    efm.r rVarJ = zi0.c.J(((pfk.p0) wVar2.f188202n).k.f(Unit.f186387a, true));
                    this.v = 1;
                    objC = nim.a.c(rVarJ, this);
                    if (objC == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i116 != 1) {
                        if (i116 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        wVar2.getClass();
                        wVar2.A2(zh9.u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, zhm.v.l(wVar2.f188203p), null, null, false, xfa.b.CAR_INSURANCE, 189)));
                        wVar2.t2();
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objC = obj2;
                }
                if (((hha.a0) ((Data) objC).getContent()) == hha.a0.ASSIGNED_SUCCESSFULLY) {
                    rfm.f0 f0VarE = ((pfk.p0) wVar2.f188202n).e();
                    this.v = 2;
                    if (nim.a.b(f0VarE, this) == aVar34) {
                        return aVar34;
                    }
                }
                wVar2.getClass();
                wVar2.A2(zh9.u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, zhm.v.l(wVar2.f188203p), null, null, false, xfa.b.CAR_INSURANCE, 189)));
                wVar2.t2();
                return Unit.f186387a;
            case 24:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kpb.l lVar4 = (kpb.l) obj3;
                kpb.k kVar2 = new kpb.k(lVar4, aVar, i33);
                this.v = 1;
                Object objB6 = pu7.a.B(lVar4.k, "onCtaClick", kVar2, this);
                return objB6 == aVar35 ? aVar35 : objB6;
            case 25:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    ks9.a aVar37 = (ks9.a) obj3;
                    efm.b bVarG2 = aVar37.f189314l.G(((ou9.c) aVar37.f189315m).b());
                    this.v = 1;
                    if (nim.a.a(bVarG2, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                ksk.g gVar5 = (ksk.g) obj3;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((ael.k) gVar5.f189478n).e(gVar5.f189476l.f189475a);
                    this.v = 1;
                    objB2 = nim.a.b(iVarE, this);
                    if (objB2 == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                nel.n nVar2 = (nel.n) objB2;
                if (io3.h.i(nVar2.f214597c)) {
                    yji.n.l2(gVar5, vkm.q.Q(gVar5.o.a(), new k25.o(aVar, gVar5, nVar2, 8)), null, null, 7);
                    return Unit.f186387a;
                }
                hx7.e.n(new IllegalArgumentException(j6.a.q("AboutIssuer widget was called with not Bond instrument. Instrument ref: ", nVar2.f214596b)));
                return Unit.f186387a;
            case 27:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (kv0.c.a((kv0.c) obj3, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                kv2.k kVar3 = (kv2.k) obj3;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarG = m70.a.g(((e0f.z) kVar3.f189946p).c(kVar3.o.f189939a, w4l.h.f294642c), null, new ku1.f0(i22), 1);
                    this.v = 1;
                    objC2 = nim.a.c(rVarG, this);
                    if (objC2 == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC2 = obj2;
                }
                kVar3.H2(kVar3.f189947q, new kv2.j((t61.g) objC2, i21));
                return Unit.f186387a;
            default:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.statement.details.flow.a aVar42 = (com.revolut.feature.credit.card.impl.ui.statement.details.flow.a) obj3;
                    al4.n nVar3 = aVar42.f69688p;
                    CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = aVar42.o;
                    String str2 = creditCardStatementDetailsFlowContract$InputData.f69674a;
                    LocalDate localDate = creditCardStatementDetailsFlowContract$InputData.f69675b;
                    this.v = 1;
                    if (((x2) nVar3).J(str2, localDate, this) == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
