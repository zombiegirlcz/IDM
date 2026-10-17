package com.revolut.data.network.models.recurringpayment.mapper;

import com.revolut.data.network.models.recurringpayment.RecurringPaymentCreditorDto;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentDebtorDto;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentIdentificationDto;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentMethodDetailsDto;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentMethodMandateDto;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import fva.c;
import fva.d;
import fva.f;
import fva.h;
import fva.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMethodMandateDto;", "Lfva/i;", "toDomain", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMethodMandateDto;)Lfva/i;", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMethodDetailsDto;", "Lfva/h;", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMethodDetailsDto;)Lfva/h;", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentCreditorDto;", "Lfva/c;", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentCreditorDto;)Lfva/c;", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentDebtorDto;", "Lfva/d;", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentDebtorDto;)Lfva/d;", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentIdentificationDto;", "Lfva/f;", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentIdentificationDto;)Lfva/f;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentMethodDetailsDtoMapperKt {
    @NotNull
    public static final i toDomain(@NotNull RecurringPaymentMethodMandateDto recurringPaymentMethodMandateDto) {
        Intrinsics.checkNotNullParameter(recurringPaymentMethodMandateDto, "<this>");
        RecurringPaymentMethodDetailsDto paymentMethodDetails = recurringPaymentMethodMandateDto.getPaymentMethodDetails();
        return new i(paymentMethodDetails != null ? toDomain(paymentMethodDetails) : null);
    }

    @NotNull
    public static final h toDomain(@NotNull RecurringPaymentMethodDetailsDto recurringPaymentMethodDetailsDto) {
        Intrinsics.checkNotNullParameter(recurringPaymentMethodDetailsDto, "<this>");
        RecurringPaymentCreditorDto creditor = recurringPaymentMethodDetailsDto.getCreditor();
        c domain = creditor != null ? toDomain(creditor) : null;
        RecurringPaymentDebtorDto debtor = recurringPaymentMethodDetailsDto.getDebtor();
        d domain2 = debtor != null ? toDomain(debtor) : null;
        String documentDescription = recurringPaymentMethodDetailsDto.getDocumentDescription();
        String documentNumber = recurringPaymentMethodDetailsDto.getDocumentNumber();
        List<String> additionalInformation = recurringPaymentMethodDetailsDto.getAdditionalInformation();
        if (additionalInformation == null) {
            additionalInformation = f0.f322471a;
        }
        return new h(domain, domain2, documentDescription, documentNumber, additionalInformation);
    }

    private static final c toDomain(RecurringPaymentCreditorDto recurringPaymentCreditorDto) {
        String name = recurringPaymentCreditorDto.getName();
        String institutionName = recurringPaymentCreditorDto.getInstitutionName();
        RecurringPaymentIdentificationDto identification = recurringPaymentCreditorDto.getIdentification();
        return new c(name, identification != null ? toDomain(identification) : null, institutionName, recurringPaymentCreditorDto.getServiceProviderLogo());
    }

    private static final d toDomain(RecurringPaymentDebtorDto recurringPaymentDebtorDto) {
        String name = recurringPaymentDebtorDto.getName();
        RecurringPaymentIdentificationDto identification = recurringPaymentDebtorDto.getIdentification();
        return new d(name, identification != null ? toDomain(identification) : null);
    }

    private static final f toDomain(RecurringPaymentIdentificationDto recurringPaymentIdentificationDto) {
        String type = recurringPaymentIdentificationDto.getType();
        BeneficiaryIdentificationType beneficiaryIdentificationType = null;
        if (type != null) {
            BeneficiaryIdentificationType[] beneficiaryIdentificationTypeArrValues = BeneficiaryIdentificationType.values();
            int length = beneficiaryIdentificationTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                BeneficiaryIdentificationType beneficiaryIdentificationType2 = beneficiaryIdentificationTypeArrValues[i];
                if (a0.z(beneficiaryIdentificationType2.name(), type, true)) {
                    beneficiaryIdentificationType = beneficiaryIdentificationType2;
                    break;
                }
                i++;
            }
        }
        return new f(beneficiaryIdentificationType, recurringPaymentIdentificationDto.getValue());
    }
}
