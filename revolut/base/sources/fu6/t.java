package fu6;

import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ru6.a0;
import ru6.w;
import ru6.y;
import ru6.z;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138106a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f138107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f138108c;
    public final Object d;
    public final Object e;
    public final Object f;

    public t(j3a.b transferCommonMapper, s4a.a paymentsSearchItemMapper, l3a.b recipientsSectionMapper, j3a.f searchFilterItemsMapper, t4a.j paymentsSearchGridItemsMapper, ty9.b sendFromClipboardItemProvider) {
        Intrinsics.checkNotNullParameter(transferCommonMapper, "transferCommonMapper");
        Intrinsics.checkNotNullParameter(paymentsSearchItemMapper, "paymentsSearchItemMapper");
        Intrinsics.checkNotNullParameter(recipientsSectionMapper, "recipientsSectionMapper");
        Intrinsics.checkNotNullParameter(searchFilterItemsMapper, "searchFilterItemsMapper");
        Intrinsics.checkNotNullParameter(paymentsSearchGridItemsMapper, "paymentsSearchGridItemsMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        this.f138107b = transferCommonMapper;
        this.f138108c = paymentsSearchItemMapper;
        this.d = recipientsSectionMapper;
        this.e = paymentsSearchGridItemsMapper;
        this.f = sendFromClipboardItemProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r38) {
        /*
            Method dump skipped, instruction units count: 2882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fu6.t.c(cli.j):cli.o");
    }

    public t(ConfirmationOfPayeeScreenContract$InputData inputData, g6d.a copEligibilityChecker, h6d.b copAuDialogConfigMapper, h6d.i copUaeDialogConfigMapper, h6d.e copGenericRegionDialogConfigMapper, h6d.g copNzDialogConfigMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copEligibilityChecker, "copEligibilityChecker");
        Intrinsics.checkNotNullParameter(copAuDialogConfigMapper, "copAuDialogConfigMapper");
        Intrinsics.checkNotNullParameter(copUaeDialogConfigMapper, "copUaeDialogConfigMapper");
        Intrinsics.checkNotNullParameter(copGenericRegionDialogConfigMapper, "copGenericRegionDialogConfigMapper");
        Intrinsics.checkNotNullParameter(copNzDialogConfigMapper, "copNzDialogConfigMapper");
        this.f138107b = inputData;
        this.f138108c = copAuDialogConfigMapper;
        this.d = copUaeDialogConfigMapper;
        this.e = copGenericRegionDialogConfigMapper;
        this.f = copNzDialogConfigMapper;
    }

    public t(EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData inputData, rlj.a phoneNumberItemMapper, rlj.f serviceProviderPickerItemMapper, rlj.b contractTypePickerItemMapper, rlj.c dateOfPortabilityItemMapper, rlj.d phoneNumberTypeMapper, zkj.c additionalRequiredInformationInputFieldMapper, alj.a dynamicFormAttributesValidator, wnj.a descriptorApplier, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberItemMapper, "phoneNumberItemMapper");
        Intrinsics.checkNotNullParameter(serviceProviderPickerItemMapper, "serviceProviderPickerItemMapper");
        Intrinsics.checkNotNullParameter(contractTypePickerItemMapper, "contractTypePickerItemMapper");
        Intrinsics.checkNotNullParameter(dateOfPortabilityItemMapper, "dateOfPortabilityItemMapper");
        Intrinsics.checkNotNullParameter(phoneNumberTypeMapper, "phoneNumberTypeMapper");
        Intrinsics.checkNotNullParameter(additionalRequiredInformationInputFieldMapper, "additionalRequiredInformationInputFieldMapper");
        Intrinsics.checkNotNullParameter(dynamicFormAttributesValidator, "dynamicFormAttributesValidator");
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.f138107b = inputData;
        this.f138108c = phoneNumberItemMapper;
        this.d = additionalRequiredInformationInputFieldMapper;
        this.e = descriptorApplier;
        this.f = giftRecipientNameResolver;
    }

    public t(PlanBenefitsScreenContract$InputData inputData, dnk.a benefitCategoriesMapper, dnk.m perksMapper, dok.e backgroundMapper, com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a analyticsContextFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(benefitCategoriesMapper, "benefitCategoriesMapper");
        Intrinsics.checkNotNullParameter(perksMapper, "perksMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(analyticsContextFactory, "analyticsContextFactory");
        this.f138107b = inputData;
        this.f138108c = benefitCategoriesMapper;
        this.d = perksMapper;
        this.e = backgroundMapper;
        this.f = analyticsContextFactory;
    }

    public t(qu6.b acquiringOrderMapper, hu6.a actionsMapper, ru6.e channelMapper, ru6.k customerMapper, ru6.h customerNoteMapper, ru6.f customFieldsMapper, ru6.l descriptionMapper, ru6.n externalReferenceMapper, ru6.m equivalentAmountMapper, ru6.p lineItemsMapper, w paymentsMapper, y statusMapper, z totalMapper, a0 transactionIdMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderMapper, "acquiringOrderMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(channelMapper, "channelMapper");
        Intrinsics.checkNotNullParameter(customerMapper, "customerMapper");
        Intrinsics.checkNotNullParameter(customerNoteMapper, "customerNoteMapper");
        Intrinsics.checkNotNullParameter(customFieldsMapper, "customFieldsMapper");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        Intrinsics.checkNotNullParameter(externalReferenceMapper, "externalReferenceMapper");
        Intrinsics.checkNotNullParameter(equivalentAmountMapper, "equivalentAmountMapper");
        Intrinsics.checkNotNullParameter(lineItemsMapper, "lineItemsMapper");
        Intrinsics.checkNotNullParameter(paymentsMapper, "paymentsMapper");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        Intrinsics.checkNotNullParameter(totalMapper, "totalMapper");
        Intrinsics.checkNotNullParameter(transactionIdMapper, "transactionIdMapper");
        this.f138107b = actionsMapper;
        this.f138108c = channelMapper;
        this.d = customerMapper;
        this.e = lineItemsMapper;
        this.f = paymentsMapper;
    }
}
