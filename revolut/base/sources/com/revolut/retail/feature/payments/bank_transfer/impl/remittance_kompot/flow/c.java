package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow;

import bsf.i;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationDescriptor;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreen;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.feature.transfer.core.impl.ui.additional_information.AdditionalInformationScreen;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentsCountrySelector$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlow;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.youTransactor.uCube.rpc.Constants;
import dki.g;
import f2k.e;
import f5j.l;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o9k.j0;
import qpf.h;
import s8k.k;
import w38.v;
import w3k.d;
import w3k.j;
import zhm.d0;
import zhm.r0;
import zhm.y0;
import zhm.z0;
import zof.f;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends g implements w3k.a {
    public final e A;
    public final z3k.a B;
    public final i C;
    public final j D;
    public final y3k.b E;
    public final j0 F;
    public final aqf.b G;
    public final RemittanceFlowContract$Step H;
    public final RemittanceFlowContract$State I;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RemittanceInputData f102045t;
    public final d u;
    public final r3a.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x2k.a f102046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final nra.b f102047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b3a.a f102048y;
    public final f z;

    public c(RemittanceInputData inputData, d flowInteractor, r3a.b transferNavigationScreenProvider, x2k.a bankTransferNavigationScreenProvider, nra.b cardTransferNavigationScreenProvider, b3a.a chatTransferNavigationProvider, f transferFeatureScreensProvider, e countryChooserInteractor, z3k.a beneficiaryCreationKompotCreationgConfigProvider, i transferReasonLauncherExtension, j reasonCheckInputMapper, y3k.b reviewInternalInputDataProvider, j0 peerToPeerTransferExecutionExtension, aqf.b transferExecutionLoadingController) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(transferNavigationScreenProvider, "transferNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(bankTransferNavigationScreenProvider, "bankTransferNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(cardTransferNavigationScreenProvider, "cardTransferNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(countryChooserInteractor, "countryChooserInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryCreationKompotCreationgConfigProvider, "beneficiaryCreationKompotCreationgConfigProvider");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        Intrinsics.checkNotNullParameter(reasonCheckInputMapper, "reasonCheckInputMapper");
        Intrinsics.checkNotNullParameter(reviewInternalInputDataProvider, "reviewInternalInputDataProvider");
        Intrinsics.checkNotNullParameter(peerToPeerTransferExecutionExtension, "peerToPeerTransferExecutionExtension");
        Intrinsics.checkNotNullParameter(transferExecutionLoadingController, "transferExecutionLoadingController");
        this.f102045t = inputData;
        this.u = flowInteractor;
        this.v = transferNavigationScreenProvider;
        this.f102046w = bankTransferNavigationScreenProvider;
        this.f102047x = cardTransferNavigationScreenProvider;
        this.f102048y = chatTransferNavigationProvider;
        this.z = transferFeatureScreensProvider;
        this.A = countryChooserInteractor;
        this.B = beneficiaryCreationKompotCreationgConfigProvider;
        this.C = transferReasonLauncherExtension;
        this.D = reasonCheckInputMapper;
        this.E = reviewInternalInputDataProvider;
        this.F = peerToPeerTransferExecutionExtension;
        this.G = transferExecutionLoadingController;
        RemittancePaymentsCountryData remittancePaymentsCountryData = inputData.f101976c;
        this.H = remittancePaymentsCountryData != null ? new RemittanceFlowContract$Step.Amount(new RemittanceAmountScreenContract$InputData.NewTransfer(remittancePaymentsCountryData, inputData.f101974a, inputData.f101975b, m1l.a.SCHEDULE_ENABLED, new TransferScheduleData(0L, (jli.c) null, 7))) : RemittanceFlowContract$Step.Destination.f102037a;
        this.I = new RemittanceFlowContract$State(inputData.f101976c, null, null, null);
    }

    public final RecipientCountryCurrencyConfig O2(RemittanceTransferData remittanceTransferData) {
        String str;
        wi0.b bVar = S2().f101977a;
        xi0.b bVar2 = remittanceTransferData.f102050b;
        xi0.b bVar3 = remittanceTransferData.f102051c;
        RemittanceRouteId remittanceRouteId = remittanceTransferData.f102054j;
        Intrinsics.checkNotNullParameter(remittanceRouteId, "<this>");
        if ((remittanceRouteId instanceof RemittanceRouteId.UNKNOWN) || (remittanceRouteId instanceof RemittanceRouteId.BANK) || (remittanceRouteId instanceof RemittanceRouteId.CARD) || (remittanceRouteId instanceof RemittanceRouteId.Internal)) {
            str = null;
        } else {
            if (!(remittanceRouteId instanceof RemittanceRouteId.MobileWallet)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((RemittanceRouteId.MobileWallet) remittanceRouteId).f101917b;
        }
        return new RecipientCountryCurrencyConfig(str, bVar, bVar2, bVar3);
    }

    public final void P2(f5j.a aVar, boolean z) {
        krf.b bVar = ((RemittanceFlowContract$State) A2().f98429a).f102033c;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        E2(new RemittanceFlowContract$Step.AdditionalInfo(bVar, aVar), false, z ? TransitionAnimation.SLIDE_START_TO_END.f98396a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false);
    }

    public final void Q2(boolean z) {
        RemittancePaymentsCountryData remittancePaymentsCountryDataS2 = S2();
        RemittanceTransferData remittanceTransferData = ((RemittanceFlowContract$State) A2().f98429a).f102032b;
        RemittanceInputData remittanceInputData = this.f102045t;
        E2(new RemittanceFlowContract$Step.Amount(remittanceTransferData == null ? new RemittanceAmountScreenContract$InputData.NewTransfer(remittancePaymentsCountryDataS2, remittanceInputData.f101974a, remittanceInputData.f101975b, m1l.a.SCHEDULE_ENABLED, new TransferScheduleData(0L, (jli.c) null, 7)) : new RemittanceAmountScreenContract$InputData.WithTransferData(remittancePaymentsCountryDataS2, remittanceInputData.f101974a, remittanceTransferData)), false, z ? TransitionAnimation.SLIDE_START_TO_END.f98396a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false);
    }

    public final void R2(boolean z) {
        l2(new a(z, this, null), new yi5.b(26));
    }

    public final RemittancePaymentsCountryData S2() {
        RemittancePaymentsCountryData remittancePaymentsCountryData = ((RemittanceFlowContract$State) A2().f98429a).f102031a;
        if (remittancePaymentsCountryData != null) {
            return remittancePaymentsCountryData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final RemittanceTransferData T2() {
        RemittanceTransferData remittanceTransferData = ((RemittanceFlowContract$State) A2().f98429a).f102032b;
        if (remittanceTransferData != null) {
            return remittanceTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final ViewController U2(String str) {
        RemittancePaymentsCountryData remittancePaymentsCountryDataS2 = S2();
        RemittanceTransferData remittanceTransferDataT2 = T2();
        wi0.b country = remittancePaymentsCountryDataS2.f101977a;
        xi0.b currency = remittanceTransferDataT2.f102050b;
        wi0.b.Companion.getClass();
        if (Intrinsics.f(country, wi0.b.A)) {
            xi0.a aVar = xi0.b.Companion;
            aVar.getClass();
            xi0.b bVar = xi0.b.D;
            if (Intrinsics.f(currency, bVar)) {
                xi0.b bVar2 = remittanceTransferDataT2.f102051c;
                aVar.getClass();
                if (Intrinsics.f(bVar2, bVar)) {
                    u2j.a aVar2 = u2j.b.Companion;
                } else {
                    u2j.a aVar3 = u2j.b.Companion;
                }
            }
        }
        this.B.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        ViewController viewControllerE1 = e1(new com.revolut.retail.feature.beneficiary.api.navigation.a(str != null ? new BeneficiaryCreationKompotInputData.CreationConfiguration.MobileWallet(country, currency, new BeneficiaryRouteType.MobileWallet(str), y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(l.INTERNATIONAL_BENEFICIARY))) : new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(country, currency, null, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(l.INTERNATIONAL_BENEFICIARY)))));
        w3k.e block = new w3k.e(this, 6);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        Collection collectionValues;
        Set setB;
        RemittanceFlowContract$Step step = (RemittanceFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        int i = 0;
        if (step instanceof RemittanceFlowContract$Step.Destination) {
            ViewController viewControllerE1 = e1(new d2k.j(new PaymentsCountrySelector$InputData(new TextLocalisedClause(R$string.remittance_select_destination_header, null, null, 14)), this.A));
            w3k.e block = new w3k.e(this, i);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        int i2 = 1;
        if (step instanceof RemittanceFlowContract$Step.Amount) {
            RemittanceAmountScreen remittanceAmountScreen = new RemittanceAmountScreen(((RemittanceFlowContract$Step.Amount) step).f102036a);
            w3k.e eVar = new w3k.e(this, i2);
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            remittanceAmountScreen.H = eVar;
            return remittanceAmountScreen;
        }
        int i3 = 3;
        int i5 = 2;
        if (step instanceof RemittanceFlowContract$Step.Recipient) {
            RemittanceTransferData transferData = T2();
            d dVar = this.u;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            RemittanceRouteId remittanceRouteId = transferData.f102054j;
            if ((remittanceRouteId instanceof RemittanceRouteId.BANK) || (remittanceRouteId instanceof RemittanceRouteId.MobileWallet)) {
                setB = y0.b(WhoToTransferFilter.Accounts.f79984a);
            } else if (remittanceRouteId instanceof RemittanceRouteId.CARD) {
                setB = y0.b(WhoToTransferFilter.Cards.f79998a);
            } else {
                if (!(remittanceRouteId instanceof RemittanceRouteId.Internal)) {
                    if (remittanceRouteId instanceof RemittanceRouteId.UNKNOWN) {
                        throw new IllegalStateException("UNKNOWN route selected for Recipient Selection");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                LocalDateTime now = ((l80.f) dVar.f294419c).f();
                Intrinsics.checkNotNullParameter(now, "now");
                setB = z0.i(WhoToTransferFilter.Revolut.f80005a, n1l.b.d(transferData.i, now) ? null : WhoToTransferFilter.Device.f80002a);
            }
            RecipientSelectionInputData inputData = new RecipientSelectionInputData(null, false, true, setB, null, O2(transferData), null, null, Constants.TAG_FIRMWARE_VERSION);
            this.v.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            RecipientSelectionScreen recipientSelectionScreen = new RecipientSelectionScreen(inputData);
            w3k.e eVar2 = new w3k.e(this, i3);
            Intrinsics.checkNotNullParameter(eVar2, "<set-?>");
            recipientSelectionScreen.H = eVar2;
            return recipientSelectionScreen;
        }
        int i6 = 4;
        int i21 = 5;
        if (step instanceof RemittanceFlowContract$Step.New) {
            RemittanceRouteId remittanceRouteId2 = T2().f102054j;
            if (remittanceRouteId2 instanceof RemittanceRouteId.BANK) {
                return U2(null);
            }
            if (remittanceRouteId2 instanceof RemittanceRouteId.CARD) {
                ViewController viewControllerE12 = e1(new CardOwnerCreationDescriptor(0));
                w3k.e block2 = new w3k.e(this, i21);
                Intrinsics.checkNotNullParameter(block2, "block");
                viewControllerE12.H = block2;
                return viewControllerE12;
            }
            if (remittanceRouteId2 instanceof RemittanceRouteId.MobileWallet) {
                return U2(((RemittanceRouteId.MobileWallet) remittanceRouteId2).f101917b);
            }
            if (remittanceRouteId2 instanceof RemittanceRouteId.Internal) {
                ViewController viewControllerE13 = e1(new el3.a(new AddContactInputData(new AddContactInputData.InputMode.Full(0), el3.b.FINISH, R$drawable.uikit_icn_24_back_button_arrow)));
                w3k.e block3 = new w3k.e(this, i6);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE13.H = block3;
                return viewControllerE13;
            }
            if (!(remittanceRouteId2 instanceof RemittanceRouteId.UNKNOWN)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Incorrect " + remittanceRouteId2 + " selected for New Recipient");
        }
        if (step instanceof RemittanceFlowContract$Step.AdditionalInfo) {
            RemittanceFlowContract$Step.AdditionalInfo additionalInfo = (RemittanceFlowContract$Step.AdditionalInfo) step;
            krf.b bVar = additionalInfo.f102034a;
            String str = bVar.f188858a;
            String str2 = bVar.f188859b;
            Map map = ((RemittanceFlowContract$State) A2().f98429a).d;
            if (map != null && (collectionValues = map.values()) != null) {
                obj = (String) d0.c0(collectionValues);
            }
            AdditionalInformationInputData inputData2 = new AdditionalInformationInputData(str, str2, (String) obj, (AdditionalInformationInput) null, 24);
            ((h) this.z).getClass();
            Intrinsics.checkNotNullParameter(inputData2, "inputData");
            AdditionalInformationScreen additionalInformationScreen = new AdditionalInformationScreen(inputData2);
            v vVar = new v(this, additionalInfo, i6);
            Intrinsics.checkNotNullParameter(vVar, "<set-?>");
            additionalInformationScreen.H = vVar;
            return additionalInformationScreen;
        }
        if (!(step instanceof RemittanceFlowContract$Step.ReviewBank)) {
            if (!(step instanceof RemittanceFlowContract$Step.ReviewCard)) {
                if (!(step instanceof RemittanceFlowContract$Step.ReviewInternal)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = e1(new k(((RemittanceFlowContract$Step.ReviewInternal) step).f102042a));
                w3k.e block4 = new w3k.e(this, i5);
                Intrinsics.checkNotNullParameter(block4, "block");
                viewControllerE14.H = block4;
                return viewControllerE14;
            }
            CardOwner recipient = ((RemittanceFlowContract$Step.ReviewCard) step).f102041a;
            RemittanceTransferData remittanceTransferDataT2 = T2();
            PushToCardTransferData transferData2 = new PushToCardTransferData(recipient.f81490a, remittanceTransferDataT2.f102049a, remittanceTransferDataT2.f102050b, remittanceTransferDataT2.f102051c, remittanceTransferDataT2.d, remittanceTransferDataT2.e, com.revolut.retail.feature.payments.bank_transfer.api.navigation.b.a(remittanceTransferDataT2.f), remittanceTransferDataT2.f102052g);
            this.f102047x.getClass();
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(transferData2, "transferData");
            PushToCardTransferReviewScreen pushToCardTransferReviewScreen = new PushToCardTransferReviewScreen(new PushToCardTransferReviewScreenContract$InputData(recipient, transferData2, 12));
            v block5 = new v(this, recipient, i3);
            Intrinsics.checkNotNullParameter(block5, "block");
            pushToCardTransferReviewScreen.H = block5;
            return pushToCardTransferReviewScreen;
        }
        f5j.a recipient2 = ((RemittanceFlowContract$Step.ReviewBank) step).f102040a;
        RemittanceTransferData remittanceTransferDataT22 = T2();
        Map map2 = ((RemittanceFlowContract$State) A2().f98429a).d;
        TransferFlowType.Default flowType = TransferFlowType.Default.f92257b;
        BankTransferEntryPoint entryPoint = BankTransferEntryPoint.REMITTANCE;
        long j2 = remittanceTransferDataT22.f102049a;
        xi0.b bVar2 = remittanceTransferDataT22.f102050b;
        xi0.b bVar3 = remittanceTransferDataT22.f102051c;
        FundingSource fundingSource = remittanceTransferDataT22.d;
        AccountId accountId = remittanceTransferDataT22.e;
        TransferNote transferNote = remittanceTransferDataT22.f;
        Map mapG = map2;
        rtf.c cVar = remittanceTransferDataT22.f102052g;
        if (mapG == null) {
            mapG = r0.g();
        }
        BankTransferData transferData3 = new BankTransferData(j2, bVar2, bVar3, fundingSource, accountId, transferNote, cVar, remittanceTransferDataT22.f102053h, remittanceTransferDataT22.i, null, remittanceTransferDataT22.k, remittanceTransferDataT22.f102056m, mapG, null, null, null, remittanceTransferDataT22.f102054j, null, 909312);
        this.f102046w.getClass();
        Intrinsics.checkNotNullParameter(recipient2, "recipient");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(transferData3, "transferData");
        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow = new BankTransferNavigatingEntryFlow(new BankTransferFlowInputData.ReviewOnly(recipient2, entryPoint, null, transferData3, 56));
        v block6 = new v(this, recipient2, 5);
        Intrinsics.checkNotNullParameter(block6, "block");
        bankTransferNavigatingEntryFlow.H = block6;
        return bankTransferNavigatingEntryFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.I;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.H;
    }
}
