package u07;

import android.app.Application;
import android.content.Context;
import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.ui.impl.ui.new_contact.select_account.ApmSelectAccountController;
import com.revolut.feature.apm.payid.impl.screen.send.contacts.ContactsScreen;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsController;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_locked_transactions.StakingLockedTransactionsDialogController;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import com.revolut.feature.esim.instructions.ui.screen.instructions.EsimInstructionsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.FreelancerTaxSettingsScreen;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelector;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreen;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginController;
import com.revolut.feature.revolut_x_balances.impl.breakdown.RevXOrdersBreakdownScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.verification_disclaimer.TravelHotelsReviewVerificationDisclaimerScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import u87.q;
import ua2.t;
import ud3.e0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((FreelancerTaxSettingsScreen) this.v, continuation, 0);
            case 1:
                return new b((u1l.b) this.v, continuation, 1);
            case 2:
                return new b((u1l.g) this.v, continuation, 2);
            case 3:
                return new b((Context) this.v, continuation, 3);
            case 4:
                return new b((ApmSelectAccountController) this.v, continuation, 4);
            case 5:
                return new b((TransferPersonalisationGallerySelector) this.v, continuation, 5);
            case 6:
                return new b((CeFiToDeFiAssetPickerScreen) this.v, continuation, 6);
            case 7:
                return new b((CfdMaintenanceMarginController) this.v, continuation, 7);
            case 8:
                return new b((RevXOrdersBreakdownScreen) this.v, continuation, 8);
            case 9:
                return new b((LoanDocumentsController) this.v, continuation, 9);
            case 10:
                return new b((u6b.l) this.v, continuation, 10);
            case 11:
                return new b((MarginStatusInfoScreen) this.v, continuation, 11);
            case 12:
                return new b((u70.c) this.v, continuation, 12);
            case 13:
                return new b((q) this.v, continuation, 13);
            case 14:
                return new b((FaqSomethingElseScreen) this.v, continuation, 14);
            case 15:
                return new b((OverdraftDetailsScreen) this.v, continuation, 15);
            case 16:
                return new b((PixAutomaticoPaymentDetailsScreen) this.v, continuation, 16);
            case 17:
                return new b((ContactsScreen) this.v, continuation, 17);
            case 18:
                return new b((t) this.v, continuation, 18);
            case 19:
                return new b((TravelHotelsHomeFlow) this.v, continuation, 19);
            case 20:
                return new b((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) this.v, continuation, 20);
            case 21:
                return new b((uai.i) this.v, continuation, 21);
            case 22:
                return new b((PixQrCodeMoneyBreakdownScreen) this.v, continuation, 22);
            case 23:
                return new b((StakingLockedTransactionsDialogController) this.v, continuation, 23);
            case 24:
                return new b((ucd.b) this.v, continuation, 24);
            case 25:
                return new b((SpinDeregisterPromptScreen) this.v, continuation, 25);
            case 26:
                return new b((YourCashbackHomeScreen) this.v, continuation, 26);
            case 27:
                return new b((e0) this.v, continuation, 27);
            case 28:
                return new b((EsimInstructionsScreen) this.v, continuation, 28);
            default:
                return new b((TravelHotelsReviewVerificationDisclaimerScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v76, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = false;
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) ((FreelancerTaxSettingsScreen) this.v).P.getValue()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                q1l.a aVar3 = (q1l.a) j6.a.k(q1l.a.class, ((u1l.b) this.v).f276434b, "KEY_TRAVEL_STATUS_OVERVIEW");
                if (aVar3 != null) {
                    return yoj.b.B(aVar3);
                }
                return null;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                p1l.c cVar = (p1l.c) ((u1l.g) this.v).f276441b.T2("KEY_TRAVEL_STATUS_PRODUCT_ARTICLE", p1l.c.class);
                if (cVar != null) {
                    return cVar.f231975a;
                }
                return null;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                new m2m.b((Context) this.v).b();
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u22.e eVar = (u22.e) ((u22.a) ((ApmSelectAccountController) this.v).S.getValue());
                ApmContact apmContact = ((u22.b) ((j2) eVar.o.f22677a).getValue()).f276541b;
                if (apmContact == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                eVar.C2(new u22.c(apmContact));
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u2a.g gVar = (u2a.g) ((TransferPersonalisationGallerySelector) this.v).R.getValue();
                String str = gVar.o.f79966a.d;
                if (str != null) {
                    gVar.C2(new g2a.c(str));
                } else {
                    r6.b.r("Cannot remove personalisation without selected personalisation id");
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) ((CeFiToDeFiAssetPickerScreen) this.v).e3()).B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u3b.g) ((u3b.e) ((CfdMaintenanceMarginController) this.v).N.getValue())).B2();
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u4c.e) ((RevXOrdersBreakdownScreen) this.v).N.getValue()).B2();
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u65.i) ((u65.g) ((LoanDocumentsController) this.v).O.getValue())).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u6b.l lVar = (u6b.l) this.v;
                lVar.H2(lVar.f277539r, new rk.b(z, 22));
                lVar.C2(u6b.g.f277531a);
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u6h.g) ((MarginStatusInfoScreen) this.v).P.getValue()).B2();
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u70.c cVar2 = (u70.c) this.v;
                if (!cVar2.o) {
                    synchronized (cVar2) {
                        if (!cVar2.o) {
                            cVar2.o = true;
                            try {
                                cVar2.f.b("device_id", (String) cVar2.f277703h.invoke());
                                cVar2.f277705l.getClass();
                                String processName = Application.getProcessName();
                                if (processName != null) {
                                    cVar2.f.b("process_name", processName);
                                }
                            } catch (Exception unused) {
                                cVar2.o = false;
                            }
                        }
                        Unit unit = Unit.f186387a;
                        break;
                    }
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                vii.c cVar3 = ((q) this.v).f278141w;
                Unit unit2 = Unit.f186387a;
                cVar3.b(unit2);
                return unit2;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u8d.g) ((u8d.e) ((FaqSomethingElseScreen) this.v).c0.getValue())).u2();
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((OverdraftDetailsScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.pix.impl.flow.automatico.screens.details.a) ((PixAutomaticoPaymentDetailsScreen) this.v).d()).B2();
                return Unit.f186387a;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((t) ((ContactsScreen) this.v).R2()).I2(ua2.m.f278527a);
                return Unit.f186387a;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t tVar = (t) this.v;
                o71.a aVar21 = tVar.f278533p;
                BeneficiarySpecialPurpose specialPurpose = BeneficiarySpecialPurpose.PAYID_ALIAS;
                r21.h hVar = (r21.h) aVar21;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(specialPurpose, "specialPurpose");
                hVar.e.g(specialPurpose, false);
                tVar.H2(tVar.f278535r, new u8c.c(14));
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) ((TravelHotelsHomeFlow) this.v).e3()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) this.v;
                return yji.l.a1(cVar4, vkm.q.g(cVar4.f93737s.f133334a.f142174a), null, null, new u83.f(cVar4, continuation, 3), 3);
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uai.i) this.v).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uba.g) ((PixQrCodeMoneyBreakdownScreen) this.v).N.getValue()).C2(uba.d.f278795a);
                return Unit.f186387a;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((uc5.g) ((uc5.c) ((StakingLockedTransactionsDialogController) this.v).U.getValue())).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(scd.c.class, KTypeProjection.INSTANCE, List.class, ((ucd.b) this.v).f279031c, "SAVING_ACCOUNT_REQUESTS_KEY");
                if (list != null) {
                    return yoj.b.J(list);
                }
                return null;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SpinDeregisterPromptScreen) this.v).d().C2(ud2.f.f279075a);
                return Unit.f186387a;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((YourCashbackHomeScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0 e0Var = (e0) this.v;
                e0Var.x2(new rk.b(((nyb.b) e0Var.B).f(), 24));
                return Unit.f186387a;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ud6.h) ((EsimInstructionsScreen) this.v).R2()).C2(sd6.a.f261827a);
                return Unit.f186387a;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TravelHotelsReviewVerificationDisclaimerScreen) this.v).m2().onBackPressed();
                return Unit.f186387a;
        }
    }
}
