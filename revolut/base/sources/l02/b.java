package l02;

import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import com.revolut.feature.apm.core.models.payments_authorisations.Identification;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import dj0.d;
import k02.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final Identification a(c.e eVar) {
        BeneficiaryIdentificationType beneficiaryIdentificationType;
        BeneficiaryIdentificationTypeDto type = eVar.getType();
        if (type != null) {
            int i = a.f191144c[type.ordinal()];
            if (i == 1) {
                beneficiaryIdentificationType = BeneficiaryIdentificationType.BR_CPF;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                beneficiaryIdentificationType = BeneficiaryIdentificationType.BR_CNPJ;
            }
        } else {
            beneficiaryIdentificationType = null;
        }
        return new Identification(beneficiaryIdentificationType, eVar.getValue());
    }

    public static final PaymentMethodDetails.Creditor b(c.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String name = bVar.getName();
        if (name == null) {
            name = "";
        }
        c.e identification = bVar.getIdentification();
        Identification identificationA = identification != null ? a(identification) : null;
        String institutionName = bVar.getInstitutionName();
        return new PaymentMethodDetails.Creditor(name, identificationA, institutionName != null ? institutionName : "", bVar.getServiceProviderLogo());
    }

    public static final String c(d dVar) {
        if (dVar == null) {
            return "null";
        }
        return "amountMinor=" + dVar.f115082a + ", currencyCode=" + dVar.f115083b.f306286a;
    }

    public static final String d(c.b bVar) {
        if (bVar == null) {
            return "null";
        }
        String name = bVar.getName();
        c.e identification = bVar.getIdentification();
        BeneficiaryIdentificationTypeDto type = identification != null ? identification.getType() : null;
        c.e identification2 = bVar.getIdentification();
        String value = identification2 != null ? identification2.getValue() : null;
        String institutionName = bVar.getInstitutionName();
        String serviceProviderLogo = bVar.getServiceProviderLogo();
        StringBuilder sb6 = new StringBuilder("name=");
        sb6.append(name);
        sb6.append(", identificationType=");
        sb6.append(type);
        sb6.append(", identificationValue=");
        j6.a.D(sb6, value, ", institutionName=", institutionName, ", serviceProviderLogo=");
        sb6.append(serviceProviderLogo);
        return sb6.toString();
    }
}
