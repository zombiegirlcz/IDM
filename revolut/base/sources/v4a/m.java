package v4a;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$InputData;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsCreateNavigationFlow$Step;
import com.revolut.feature.payments.groups.impl.ui_new.flow.create.PaymentsGroupsCreateFlow;
import com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.AdditionalConfig$StraightToCardTransferDisabled;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientController;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardAddCardFeatureConfig;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.feature.us_send_checks.api.SendChecksFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import g48.r0;
import h3a.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lo5.p;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends jki.g implements f {

    @NotNull
    public static final j Companion = new j();
    public final h3a.a A;
    public final oy1.b B;
    public final r0 C;
    public final RecipientSelectionInputData D;
    public final e E;
    public final cji.d F;
    public final cji.d G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final au9.b f286010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final toh.d f286011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z4a.d f286012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x4a.d f286013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h3a.l f286014t;
    public final l3j.a u;
    public final ora.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f286015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.feature.payments.groups.api.navigation.a f286016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n3a.a f286017y;
    public final t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(au9.b paymentsPreferences, toh.d interactor, z4a.d dataProvider, x4a.d transferExtension, h3a.l itemNavigationCommandFactory, l3j.a beneficiaryResultObservable, ora.a pushToCardResultObservable, p cryptoNavigationFactory, com.revolut.feature.payments.groups.api.navigation.a groupBillsNavigationScreenProvider, n3a.a contactsPermissionsController, t transferFeaturesProvider, h3a.a availableFiltersProvider, oy1.b apmNavigationProvider, r0 jointAccountsInteractor, RecipientSelectionInputData inputData, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(paymentsPreferences, "paymentsPreferences");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(itemNavigationCommandFactory, "itemNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(beneficiaryResultObservable, "beneficiaryResultObservable");
        Intrinsics.checkNotNullParameter(pushToCardResultObservable, "pushToCardResultObservable");
        Intrinsics.checkNotNullParameter(cryptoNavigationFactory, "cryptoNavigationFactory");
        Intrinsics.checkNotNullParameter(groupBillsNavigationScreenProvider, "groupBillsNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(transferFeaturesProvider, "transferFeaturesProvider");
        Intrinsics.checkNotNullParameter(availableFiltersProvider, "availableFiltersProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f286010p = paymentsPreferences;
        this.f286011q = interactor;
        this.f286012r = dataProvider;
        this.f286013s = transferExtension;
        this.f286014t = itemNavigationCommandFactory;
        this.u = beneficiaryResultObservable;
        this.v = pushToCardResultObservable;
        this.f286015w = cryptoNavigationFactory;
        this.f286016x = groupBillsNavigationScreenProvider;
        this.f286017y = contactsPermissionsController;
        this.z = transferFeaturesProvider;
        this.A = availableFiltersProvider;
        this.B = apmNavigationProvider;
        this.C = jointAccountsInteractor;
        this.D = inputData;
        Data data = new Data(null, null, false, 7, null);
        WhoToTransferFilter whoToTransferFilter = inputData.d.size() == 1 ? (WhoToTransferFilter) d0.a0(inputData.d) : null;
        boolean z = inputData.f80016b;
        m3a.c.Companion.getClass();
        this.E = new e("", data, whoToTransferFilter, null, z, true, true, m3a.c.f202309p);
        this.F = new cji.d("");
        od0.i.Companion.getClass();
        this.G = new cji.d(od0.i.f224256b);
    }

    public static WhoToTransferActionItem B2(WhoToTransferFilter whoToTransferFilter) {
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Device.f80002a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Revolut.f80005a)) {
            return WhoToTransferActionItem.AddContact.f80060a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmAani.f79985a)) {
            return WhoToTransferActionItem.ApmAani.f80067a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBizum.f79986a)) {
            return WhoToTransferActionItem.ApmBizum.f80071a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBlik.f79987a)) {
            return WhoToTransferActionItem.ApmBlik.f80072a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBreb.f79988a)) {
            return WhoToTransferActionItem.ApmBreb.f80073a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmIris.f79989a)) {
            return WhoToTransferActionItem.ApmIris.f80074a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmMultibanco.f79990a)) {
            return WhoToTransferActionItem.ApmMultibanco.f80075a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPayId.f79991a)) {
            return WhoToTransferActionItem.ApmPayId.f80077a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPix.f79992a)) {
            return WhoToTransferActionItem.ApmPix.f80078a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmQvik.f79993a)) {
            return WhoToTransferActionItem.ApmQvik.f80080a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmSpin.f79994a)) {
            return WhoToTransferActionItem.ApmSpin.f80082a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmUpi.f79995a)) {
            return WhoToTransferActionItem.ApmUpi.f80083a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmWero.f79996a)) {
            return WhoToTransferActionItem.ApmWero.f80084a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Billers.f79997a)) {
            return WhoToTransferActionItem.ApmBillsBpay.f80068a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Accounts.f79984a)) {
            return WhoToTransferActionItem.AddBankRecipient.f80057a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Cards.f79998a)) {
            return WhoToTransferActionItem.AddCardRecipient.f80058a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.CryptoWallets.f80001a)) {
            return WhoToTransferActionItem.AddNewCryptoAddress.f80063a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Groups.f80003a)) {
            return WhoToTransferActionItem.CreateGroup.f80090a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Checks.f80000a)) {
            return WhoToTransferActionItem.AddCheckRecipient.f80059a;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Charities.f79999a) || (whoToTransferFilter instanceof WhoToTransferFilter.MobileWallet)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String C2(WhoToTransferActionItem whoToTransferActionItem) {
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) {
            return j6.a.l(((WhoToTransferActionItem.AddNewRecipient) whoToTransferActionItem).f80064a.size(), "AddNewRecipient(actionItemsCount=", ")");
        }
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor) {
            return p.a.p("FavoritePaymentVendor(paymentVendorId=", ((WhoToTransferActionItem.FavoritePaymentVendor) whoToTransferActionItem).f80091a.f64079a, ")");
        }
        String strM = o0.f186429a.b(whoToTransferActionItem.getClass()).m();
        return strM == null ? "UnknownWhoToTransferActionItem" : strM;
    }

    public static String D2(Object obj2) {
        if (obj2 instanceof WhoToTransferActionItem) {
            return C2((WhoToTransferActionItem) obj2);
        }
        if (obj2 == null) {
            return "null";
        }
        String strM = o0.f186429a.b(obj2.getClass()).m();
        return strM == null ? "UnknownType" : strM;
    }

    public static final WhoToTransferActionItem y2(m mVar, WhoToTransferFilter whoToTransferFilter, Set set) {
        if (!mVar.D.f80017c) {
            return null;
        }
        if (whoToTransferFilter != null && x4a.i.a(whoToTransferFilter)) {
            return B2(whoToTransferFilter);
        }
        if (set == null) {
            set = h0.f322473a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (x4a.i.a((WhoToTransferFilter) obj2)) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return B2((WhoToTransferFilter) d0.b0(arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            WhoToTransferActionItem whoToTransferActionItemB2 = B2((WhoToTransferFilter) it8.next());
            if (whoToTransferActionItemB2 != null) {
                arrayList2.add(whoToTransferActionItemB2);
            }
        }
        return new WhoToTransferActionItem.AddNewRecipient(arrayList2);
    }

    public final void A2(WhoToTransferActionItem whoToTransferActionItem) {
        BeneficiaryCreationDestination beneficiaryCreationDestination;
        BeneficiaryCreationKompotInputData.CreationConfiguration mobileWallet;
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) {
            f2(new AddRecipientController(new AddRecipientContract$InputData(((WhoToTransferActionItem.AddNewRecipient) whoToTransferActionItem).f80064a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new h(this, 3));
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.PermissionContact.f80098a)) {
            ((n3a.b) this.f286017y).b(this, new h(this, 2));
            return;
        }
        u2j.b bVar = null;
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.BankRecipient.f80085a) || Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.AddBankRecipient.f80057a)) {
            RecipientSelectionInputData recipientSelectionInputData = this.D;
            RecipientCountryCurrencyConfig recipientCountryCurrencyConfig = recipientSelectionInputData.f;
            String str = recipientCountryCurrencyConfig != null ? recipientCountryCurrencyConfig.d : null;
            BeneficiaryRouteType.BANK bank = BeneficiaryRouteType.BANK.f99587a;
            Object mobileWallet2 = (str == null || str.length() == 0) ? bank : new BeneficiaryRouteType.MobileWallet(str);
            BeneficiaryCreationKompotFinishMode.LegacyResult legacyResult = BeneficiaryCreationKompotFinishMode.LegacyResult.f86049a;
            if (recipientCountryCurrencyConfig != null) {
                wi0.b bVar2 = recipientCountryCurrencyConfig.f79981a;
                xi0.b bVar3 = recipientCountryCurrencyConfig.f79982b;
                if (mobileWallet2.equals(bank)) {
                    wi0.b.Companion.getClass();
                    if (Intrinsics.f(bVar2, wi0.b.A)) {
                        xi0.b.Companion.getClass();
                        xi0.b bVar4 = xi0.b.D;
                        if (Intrinsics.f(bVar3, bVar4)) {
                            bVar = Intrinsics.f(recipientCountryCurrencyConfig.f79983c, bVar4) ? u2j.b.SELF : u2j.b.OTHER;
                        }
                    }
                    mobileWallet = new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar2, bVar3, bVar, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)));
                } else {
                    if (!(mobileWallet2 instanceof BeneficiaryRouteType.MobileWallet)) {
                        if (!(mobileWallet2 instanceof BeneficiaryRouteType.PaymentVendorType)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("PaymentVendorType is not supported when creating a bank recipient");
                    }
                    mobileWallet = new BeneficiaryCreationKompotInputData.CreationConfiguration.MobileWallet(bVar2, bVar3, (BeneficiaryRouteType.MobileWallet) mobileWallet2, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)));
                }
                beneficiaryCreationDestination = new BeneficiaryCreationDestination(legacyResult, mobileWallet);
            } else {
                aim.o oVar = new aim.o();
                oVar.add(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.BENEFICIARY));
                if (recipientSelectionInputData.f80019h.contains(AdditionalConfig$StraightToCardTransferDisabled.f80010a)) {
                    oVar.add(BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.StraightToCardTransferDisabled.f99631a);
                }
                Unit unit = Unit.f186387a;
                beneficiaryCreationDestination = new BeneficiaryCreationDestination(legacyResult, new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, null, null, null, null, y0.a(oVar), 60));
            }
            C1(beneficiaryCreationDestination);
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.AddCardRecipient.f80058a) || Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.CardRecipient.f80086a)) {
            C1(new BridgeDestination(new FeatureCommand(new PushToCardAddCardFeatureConfig(ypa.a.RESULT))));
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.AddContact.f80060a)) {
            f2(e1(new el3.a(new AddContactInputData(new AddContactInputData.InputMode.Full(0), el3.b.FINISH, R$drawable.uikit_icn_24_back_button_arrow))), ModalDestination.Style.POPUP.f98311a, new h(this, 4));
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.AddNewCryptoAddress.f80063a) || Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.NewCryptoAddress.f80095a)) {
            lo5.n nVar = p.Companion;
            ((fp5.f) this.f286015w).getClass();
            C1(new CryptoAddBeneficiaryDestination(new CryptoAddBeneficiaryInput.NewBeneficiary((xi0.b) null, (wk5.a) null, (String) null, (Integer) 0, 8)));
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.CreateGroup.f80090a) || Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.Group.f80093a)) {
            PaymentsGroupsCreateNavigationFlow$InputData inputData = new PaymentsGroupsCreateNavigationFlow$InputData(f0.f322471a, PaymentsGroupsCreateNavigationFlow$Step.AddMembers.f79295a, rq9.c.RESULT);
            ((zr9.b) this.f286016x).getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            PaymentsGroupsCreateFlow paymentsGroupsCreateFlow = new PaymentsGroupsCreateFlow(inputData);
            h hVar = new h(this, 1);
            Intrinsics.checkNotNullParameter(hVar, "<set-?>");
            paymentsGroupsCreateFlow.J = hVar;
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.AddCheckRecipient.f80059a) || Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.CheckRecipient.f80089a)) {
            C1(new BridgeDestination(new FeatureCommand(SendChecksFeatureConfig.AddRecipient.f94583g)));
            return;
        }
        boolean zF = Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.ApmPayId.f80077a);
        oy1.b bVar5 = this.B;
        if (zF) {
            C1(bVar5.c(ApmPayId.f61819c));
            return;
        }
        if (Intrinsics.f(whoToTransferActionItem, WhoToTransferActionItem.ApmUpi.f80083a)) {
            C1(bVar5.c(ApmUpi.f61828c));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Item is not supported: ", C2(whoToTransferActionItem)));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fb  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4a.m.I1():void");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.E;
    }

    public final void z2(jq9.t tVar) {
        l2(new v06.i(this, tVar, null, 7), new yi5.b(26));
    }
}
