package s1k;

import aii.q;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.feature.apm.core.ui.impl.ui.qr.pager.QrFlow;
import com.revolut.feature.apm.payid.impl.screen.createpayid.otp.OtpScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.external_bank_sign_in.KontomatikExternalBankSignInController;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreen;
import com.revolut.feature.devicemanagement.impl.ui.details.DeviceDetailsController;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreen;
import com.revolut.feature.retail.cfd.impl.screens.whatarecfds.WhatAreCfdsController;
import com.revolut.feature.retail.global_accounts.impl.management.ui.CountryProfilesManagementScreen;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.search.RevolutPayMerchantsSearchController;
import com.revolut.feature.shared.help_centre.impl.faq.screens.quick_help.card.HelpWithCardScreen;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.ManagedPortfoliosTopHoldingsController;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreen;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreen;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import s2g.w;
import s8d.l;
import s9b.p;
import sbb.r;
import sdl.x0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
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
                return new b((PaymentOptionsScreen) this.v, continuation, 0);
            case 1:
                return new b((TravelExperiencesOptionsV2Screen) this.v, continuation, 1);
            case 2:
                return new b((com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) this.v, continuation, 2);
            case 3:
                return new b((QrFlow) this.v, continuation, 3);
            case 4:
                return new b((com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a) this.v, continuation, 4);
            case 5:
                return new b((WhatAreCfdsController) this.v, continuation, 5);
            case 6:
                return new b((s4e.i) this.v, continuation, 6);
            case 7:
                return new b((CollectionScreen) this.v, continuation, 7);
            case 8:
                return new b((com.revolut.feature.credit.loan.impl.ui.autopay.flow.a) this.v, continuation, 8);
            case 9:
                return new b((MarginStatusScreen) this.v, continuation, 9);
            case 10:
                return new b((com.revolut.feature.apm.multibanco.impl.ui.enrollment.d) this.v, continuation, 10);
            case 11:
                return new b((ConstructorCreditPromptController) this.v, continuation, 11);
            case 12:
                return new b((s76.b) this.v, continuation, 12);
            case 13:
                return new b((PickerController) this.v, continuation, 13);
            case 14:
                return new b((LoanToggleBackupCardScreen) this.v, continuation, 14);
            case 15:
                return new b((DeviceDetailsController) this.v, continuation, 15);
            case 16:
                return new b((HelpWithCardScreen) this.v, continuation, 16);
            case 17:
                return new b((ManagedPortfoliosTopHoldingsController) this.v, continuation, 17);
            case 18:
                return new b((CountryProfilesManagementScreen) this.v, continuation, 18);
            case 19:
                return new b((OtpScreen) this.v, continuation, 19);
            case 20:
                return new b((sai.k) this.v, continuation, 20);
            case 21:
                return new b((PixQrCodeChangeAmountScreen) this.v, continuation, 21);
            case 22:
                return new b((r) this.v, continuation, 22);
            case 23:
                return new b((KontomatikExternalBankSignInController) this.v, continuation, 23);
            case 24:
                return new b((RevolutPayMerchantsSearchController) this.v, continuation, 24);
            case 25:
                return new b((scl.g) this.v, continuation, 25);
            case 26:
                return new b((CashbackTransactionsScreen) this.v, continuation, 26);
            case 27:
                return new b((TravelHotelsPropertyGuestsReviewsScreen) this.v, continuation, 27);
            case 28:
                return new b((SaleScreen) this.v, continuation, 28);
            default:
                return new b((se1.i) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BigDecimal bigDecimal;
        oj1.a aVar;
        oj1.a aVar2;
        int i = this.u;
        Continuation continuation = null;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PaymentOptionsScreen) obj3).m2().onBackPressed();
                break;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((w) ((TravelExperiencesOptionsV2Screen) obj3).T2()).u2();
                break;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.D2(((com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) obj3).f102009r);
                break;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((QrFlow) obj3).m2().onBackPressed();
                break;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a) obj3).C2(g12.h.f139522a);
                break;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((s4b.g) ((s4b.c) ((WhatAreCfdsController) obj3).R.getValue())).C2(q.f5292a);
                break;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s4e.i iVar = (s4e.i) obj3;
                break;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((CollectionScreen) obj3).d().B2();
                break;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.loan.impl.ui.autopay.flow.a) obj3).I2();
                break;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.a) ((s6h.f) ((MarginStatusScreen) obj3).S.getValue())).B2();
                break;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.apm.multibanco.impl.ui.enrollment.d) obj3).I2();
                break;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) ((ConstructorCreditPromptController) obj3).e3()).J2(s74.i.f260513a);
                break;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n76.c cVar = (n76.c) j6.a.k(n76.c.class, ((s76.b) obj3).f260525c, "DERIVATIVES_BALANCE_STORAGE_KEY");
                if (cVar != null) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    xi0.a aVar16 = xi0.b.Companion;
                    String str = cVar.f213002a;
                    aVar16.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    String str2 = cVar.f213003b;
                    BigDecimal bigDecimal2 = new BigDecimal(cVar.f213004c);
                    BigDecimal bigDecimal3 = new BigDecimal(cVar.d);
                    BigDecimal bigDecimal4 = new BigDecimal(cVar.e);
                    BigDecimal bigDecimal5 = new BigDecimal(cVar.f);
                    BigDecimal bigDecimal6 = new BigDecimal(cVar.f213005g);
                    BigDecimal bigDecimal7 = new BigDecimal(cVar.f213006h);
                    BigDecimal bigDecimal8 = new BigDecimal(cVar.i);
                    BigDecimal bigDecimal9 = new BigDecimal(cVar.f213007j);
                    BigDecimal bigDecimal10 = new BigDecimal(cVar.k);
                    BigDecimal bigDecimal11 = new BigDecimal(cVar.f213008l);
                    BigDecimal bigDecimal12 = new BigDecimal(cVar.f213009m);
                    String str3 = cVar.f213010n;
                    BigDecimal bigDecimal13 = str3 != null ? new BigDecimal(str3) : null;
                    String str4 = cVar.o;
                    if (str4 != null) {
                        oj1.a[] aVarArrValues = oj1.a.values();
                        int length = aVarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                oj1.a aVar17 = aVarArrValues[i2];
                                int i3 = i2;
                                bigDecimal = bigDecimal12;
                                if (a0.z(aVar17.name(), str4, true)) {
                                    aVar2 = aVar17;
                                } else {
                                    i2 = i3 + 1;
                                    bigDecimal12 = bigDecimal;
                                }
                            } else {
                                bigDecimal = bigDecimal12;
                                aVar2 = null;
                            }
                        }
                        aVar = aVar2;
                    } else {
                        bigDecimal = bigDecimal12;
                        aVar = null;
                    }
                }
                break;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((PickerController) obj3).m2().onBackPressed();
                break;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LoanToggleBackupCardScreen) obj3).m2().onBackPressed();
                break;
            case 15:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((DeviceDetailsController) obj3).m2().onBackPressed();
                break;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) ((HelpWithCardScreen) obj3).f86295d0.getValue()).u2();
                break;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((s8f.g) ((ManagedPortfoliosTopHoldingsController) obj3).L.getValue()).B2();
                break;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((p) ((s9b.h) ((CountryProfilesManagementScreen) obj3).Q.getValue())).B2();
                break;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((sa2.r) ((sa2.g) ((OtpScreen) obj3).N.getValue())).J2(sa2.j.f261276a);
                break;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((sai.k) obj3).C2(sai.g.f261413a);
                break;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                sba.h hVar = (sba.h) ((PixQrCodeChangeAmountScreen) obj3).P.getValue();
                hVar.C2(new sba.e(((sba.d) ((j2) hVar.f261525p.f22677a).getValue()).f261519b));
                break;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) obj3;
                rVar.T2(new s64.a(rVar, continuation, 13), new yi5.b(27));
                break;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((sc4.c) ((KontomatikExternalBankSignInController) obj3).Q.getValue()).I2();
                break;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((RevolutPayMerchantsSearchController) obj3).m2().onBackPressed();
                break;
            case 25:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                x0 x0Var = (x0) j6.a.k(x0.class, ((scl.g) obj3).f261768b, "TradingAccounts-availableTradingAccounts");
                if (x0Var != null) {
                }
                break;
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((CashbackTransactionsScreen) obj3).m2().onBackPressed();
                break;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a) ((TravelHotelsPropertyGuestsReviewsScreen) obj3).e3()).B2();
                break;
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) ((se1.i) ((SaleScreen) obj3).Z2()).f262091r;
                gVar.getClass();
                gVar.l2(new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.e(gVar, null), new yi5.b(26));
                break;
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                se1.i.y2((se1.i) obj3);
                break;
        }
        return Unit.f186387a;
    }
}
