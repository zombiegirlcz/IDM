package rae;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.bills.bpay.api.navigation.BPayEditRecurringDestination;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.contacts.api.navigation.ContactFlowConfiguration;
import com.revolut.feature.contacts.api.navigation.ContactFlowFeatureConfig;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subaccount.api.SubaccountEditRecurringTransferDestination;
import com.revolut.feature.subscriptions.api.SubscriptionsApi$Toggles;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionHistoryDestination;
import com.revolut.feature.subscriptions.impl.history.flow.SubscriptionsHistoryFlowContract$Configuration;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsContract$Configuration;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.vaults.api.navigation.VaultsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import d2k.g;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import mae.h;
import nae.j;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import qua.a0;
import qua.p;
import qua.s;
import qua.u;
import r4k.x;
import tof.j6;
import ufm.i;
import zh9.u0;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements z8e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f252819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f252820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f252821c;
    public final c9e.c d;
    public final y8k.b e;
    public final x2k.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f252822g;

    public d(h recurringPaymentsMapper, ppg.b vaultInteractor, l80.e dateProvider, c9e.c subscriptionDetailsNaviProvider, y8k.b peerToPeerFeatureConfigProvider, x2k.e bankTransferNaviCommandProvider, un9.a paymentCounterpartyNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentsMapper, "recurringPaymentsMapper");
        Intrinsics.checkNotNullParameter(vaultInteractor, "vaultInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(subscriptionDetailsNaviProvider, "subscriptionDetailsNaviProvider");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(bankTransferNaviCommandProvider, "bankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyNavigationProvider, "paymentCounterpartyNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f252819a = recurringPaymentsMapper;
        this.f252820b = vaultInteractor;
        this.f252821c = dateProvider;
        this.d = subscriptionDetailsNaviProvider;
        this.e = peerToPeerFeatureConfigProvider;
        this.f = bankTransferNaviCommandProvider;
        this.f252822g = featureToggleInteractor;
    }

    public final FeatureCommand b(p recurringPayment, PaymentCounterpartyInfo paymentCounterpartyInfo) {
        Intrinsics.checkNotNullParameter(recurringPayment, "subscription");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "paymentCounterpartyInfo");
        int i = eo9.a.f127873a[paymentCounterpartyInfo.f79061b.ordinal()];
        if (i == 1) {
            return u0.f(new BPayEditRecurringDestination(pn1.a.UPDATE_SCHEDULED, paymentCounterpartyInfo, recurringPayment));
        }
        if (i == 2) {
            throw new IllegalStateException("editing recurring flow is not supported for tapi billers");
        }
        if (i == 3) {
            Intrinsics.checkNotNullParameter("An operation is not implemented: AEH-9356", "message");
            throw new NotImplementedError("An operation is not implemented: AEH-9356");
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter("An operation is not implemented: AEH-8179", "message");
        throw new NotImplementedError("An operation is not implemented: AEH-8179");
    }

    public final FeatureCommand c(l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return new FeatureCommand(new ContactFlowFeatureConfig(new ContactFlowConfiguration(contact, null)));
    }

    public final FeatureCommand d(f5j.a beneficiary, AccountId accountId) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new BankBeneficiaryDetailsDestination(beneficiary, beneficiary.f132329a, accountId), false, (Integer) null, 67108864, 45));
    }

    public final FeatureCommand e(String subaccountId) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        return jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(subaccountId, ExtendedSubaccountType.Personal.INSTANCE), ProductId.SUBACCOUNT), null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ufm.b f(p subscription, f5j.a beneficiary, AccountId accountId) {
        BankTransferInputReference structured;
        TransferFlowType jointAccountFlow;
        jli.c cVarK;
        TransferScheduleEndsOn date;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        List list = subscription.R;
        ibd.e eVar = subscription.f249314a;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (ue0.e.n(list)) {
            String str = subscription.f249325m;
            structured = str != null ? new BankTransferInputReference.SimpleNote(str) : null;
        } else {
            List<a0> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (a0 a0Var : list2) {
                arrayList.add(new j6(a0Var.f249282a, a0Var.f249283b, a0Var.f249284c, a0Var.d));
            }
            structured = new BankTransferInputReference.Structured(arrayList);
        }
        if (accountId instanceof AccountId.Personal) {
            jointAccountFlow = TransferFlowType.Default.f92257b;
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            jointAccountFlow = new TransferFlowType.JointAccountFlow((AccountId.Joint) accountId, null);
        }
        dj0.d dVarF = u.f(subscription);
        s sVar = subscription.f249315a0;
        TransferMoneyPocket transferMoneyPocket = new TransferMoneyPocket(dVarF, sVar != null ? e6k.c.b(sVar, subscription.f249322h, accountId) : new SourceAccount.Pocket(subscription.W, objArr == true ? 1 : 0, accountId, 2));
        long millis = u.e(subscription, ((f) this.f252821c).g()).getMillis();
        Period period = eVar.f160151b;
        if (period == null || (cVarK = jli.e.k(period)) == null) {
            cVarK = jli.c.PERIOD_SELECTION_NONE;
        }
        RecurringPaymentEndCriteria recurringPaymentEndCriteria = eVar.i;
        if (recurringPaymentEndCriteria instanceof RecurringPaymentEndCriteria.Date) {
            date = new TransferScheduleEndsOn.Date(ebm.a.P(((RecurringPaymentEndCriteria.Date) recurringPaymentEndCriteria).f86442a));
        } else {
            if (recurringPaymentEndCriteria != null) {
                throw new NoWhenBranchMatchedException();
            }
            date = TransferScheduleEndsOn.Never.f104289a;
        }
        ufm.b bVarM = d0.m(g.b(this.f, beneficiary, jointAccountFlow, null, structured, transferMoneyPocket, new TransferScheduleData(millis, cVarK, date), m1l.a.SCHEDULE_REQUIRED, subscription, new FlowExtras(new FinishCommand(num, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 7)), subscription.S, subscription.T, 4612));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final FeatureCommand g(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        String str = subscription.f249318c;
        if (str == null) {
            str = "";
        }
        return u0.f(new JuniorAllowanceDestination(str, subscription.f249314a.f160150a, new JuniorAllowanceLaunchMode.AsNaviCommand(new JuniorAllowanceLaunchMode.AsNaviCommand.NaviCommandMode.Default(null)), null));
    }

    public final FeatureCommand h(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        ibd.e eVar = subscription.f249314a;
        LocalDate localDate = eVar.e;
        Period period = eVar.f160151b;
        TransferScheduleData transferScheduleData = null;
        jli.c cVarK = period != null ? jli.e.k(period) : null;
        String str = subscription.f249318c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = subscription.i;
        boolean z = localDate == null || cVarK == null;
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            transferScheduleData = new TransferScheduleData(jli.b.b(localDate), cVarK, 4);
        }
        return new FeatureCommand(new VaultsFeatureConfig.EditRecurringTransfer(str2, str3, transferScheduleData, subscription.f249323j, 8));
    }

    public final FeatureCommand i(AccountId accountId, String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        i63.a aVar = i63.a.DETAILS;
        boolean z = false;
        CardScreenAction.Select select = new CardScreenAction.Select(cardId, 6, z, z);
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        return new FeatureCommand(new CardsScreenFeatureConfig(aVar, joint != null ? joint.f51413b : null, null, accountId, select, 4));
    }

    public final FeatureCommand j(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        ibd.e eVar = subscription.f249314a;
        LocalDate localDate = eVar.e;
        Period period = eVar.f160151b;
        TransferScheduleData transferScheduleData = null;
        jli.c cVarK = period != null ? jli.e.k(period) : null;
        String str = subscription.f249318c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        boolean z = localDate == null || cVarK == null;
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            transferScheduleData = new TransferScheduleData(jli.b.b(localDate), cVarK, 4);
        }
        return u0.f(new SubaccountEditRecurringTransferDestination(str2, subscription.i, transferScheduleData, subscription.f249323j, false, null));
    }

    public final NaviCommand k(p subscription, f01.a uiKitResources, t70.b currenciesLocalization, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f252819a.getClass();
        String strA = h.a(subscription, uiKitResources, currenciesLocalization);
        ibd.e eVar = subscription.f249314a;
        String lowerCase = strA.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strO = kotlin.text.a0.o(lowerCase);
        xi0.a aVar = xi0.b.Companion;
        String str = subscription.i;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        if (((jte.d) this.f252822g).c(SubscriptionsApi$Toggles.SubscriptionHistoryKompotMigration.f89133c)) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SubscriptionHistoryDestination(eVar.f160150a, strO, bVarA, z), false, (Integer) null, 0, 61));
        }
        eae.d.Companion.getClass();
        return new ActivityNavigateCommand(eae.a.f124216b, new SubscriptionsHistoryFlowContract$Configuration(eVar.f160150a, strO, bVarA, z), null, null, 0, null, null, null, null, false, 1020);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FeatureCommand l(l contact, p recurringPayment) {
        jli.c cVarK;
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(recurringPayment, "subscription");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Period period = recurringPayment.f249314a.f160151b;
        if (period == null || (cVarK = jli.e.k(period)) == null) {
            cVarK = jli.c.PERIOD_SELECTION_NONE;
        }
        TransferScheduleData transferScheduleData = new TransferScheduleData(u.e(recurringPayment, ((f) this.e.f311670a).g()).getMillis(), cVarK, 4);
        PeerToPeerTransferInputData.Companion aVar = PeerToPeerTransferInputData.INSTANCE;
        PeerToPeerRecipient peerToPeerRecipient = new PeerToPeerRecipient(contact);
        hrf.f fVar = hrf.f.OUTGOING;
        TransferFlowType.Default r4 = TransferFlowType.Default.f92257b;
        m1l.a aVar2 = m1l.a.SCHEDULE_REQUIRED;
        dj0.d dVarF = u.f(recurringPayment);
        s sVar = recurringPayment.f249315a0;
        return new FeatureCommand(new PeerToPeerTransferBridgeFeatureConfig(PeerToPeerTransferInputData.Companion.a(aVar, peerToPeerRecipient, fVar, r4, new TransferMoneyPocket(dVarF, sVar != null ? e6k.c.b(sVar, recurringPayment.f249322h, AccountId.Personal.f51414a) : new SourceAccount.Pocket(recurringPayment.W, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 6)), transferScheduleData, aVar2, false, recurringPayment.I, recurringPayment.f249325m, recurringPayment, new FlowExtras(new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7)), null, null, null, null, 127296)));
    }

    public final i m(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        String str = subscription.f249318c;
        if (str == null) {
            str = "";
        }
        d0 d0VarFirstOrError = zi0.c.J(((ypg.p) this.f252820b).i(str)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        i iVar = new i(zi0.c.s(d0VarFirstOrError), new r83.d(21, new x(this, subscription, 14)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ActivityNavigateCommand n(AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        j.Companion.getClass();
        return new ActivityNavigateCommand(nae.f.f213868b, new MarkRecurringTransactionsContract$Configuration(accountId, str), null, null, 0, null, null, null, null, false, 1020);
    }
}
