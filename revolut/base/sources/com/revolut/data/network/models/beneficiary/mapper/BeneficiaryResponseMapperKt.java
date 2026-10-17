package com.revolut.data.network.models.beneficiary.mapper;

import a0.d;
import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import com.revolut.data.network.models.address.AddressModel;
import com.revolut.data.network.models.address.mapper.LegacyAddressMapperKt;
import com.revolut.data.network.models.beneficiary.BankBeneficiaryParamsNetworkModel;
import com.revolut.data.network.models.beneficiary.BankFieldChoiceDto;
import com.revolut.data.network.models.beneficiary.BankFieldDefinitionDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryConfirmationDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryConfirmationResponseDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryDetailsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryEmbeddedDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryExtraAccountFieldsNetworkModel;
import com.revolut.data.network.models.beneficiary.BeneficiaryExtraFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryExtraFieldsEmbeddedDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryGroupDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryMissingExtraFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryPdaDto;
import com.revolut.data.network.models.beneficiary.BeneficiarySearchListDto;
import com.revolut.data.network.models.beneficiary.BeneficiarySearchListSourceDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryStateDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryTypeDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryValidationResultDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryVerificationDto;
import com.revolut.data.network.models.beneficiary.PaymentTypeDto;
import com.revolut.data.network.models.beneficiary.RouteDetailsDto;
import com.revolut.data.network.models.beneficiary.SupportedCountryDto;
import com.revolut.domain.models.beneficiary.BankBeneficiaryParams$IdentityType;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.domain.models.beneficiary.BankFieldFormat;
import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.domain.models.beneficiary.BeneficiaryDetails;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.domain.models.beneficiary.BeneficiarySearchList;
import com.revolut.domain.models.beneficiary.BeneficiarySearchListSource;
import com.revolut.domain.models.beneficiary.BeneficiaryVerification;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentification;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import f5j.a;
import f5j.e;
import f5j.r;
import f5j.t;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import n61.h;
import n61.i;
import n61.k;
import n61.n;
import n61.o;
import n61.p;
import n61.q;
import n61.s;
import no3.b;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012\u001a\u0013\u0010\u0002\u001a\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0002\u0010\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0002\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u0002\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u0002\u0010\u001e\u001a\u0013\u0010\u0002\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b\u0002\u0010!\u001a\u0013\u0010\u0002\u001a\u00020#*\u00020\"H\u0000¢\u0006\u0004\b\u0002\u0010$\u001a\u0013\u0010\u0002\u001a\u00020&*\u00020%H\u0000¢\u0006\u0004\b\u0002\u0010'\u001a\u0013\u0010\u0002\u001a\u00020)*\u00020(H\u0000¢\u0006\u0004\b\u0002\u0010*\u001a\u0013\u0010\u001a\u001a\u00020,*\u00020+H\u0000¢\u0006\u0004\b\u001a\u0010-\u001a\u0013\u0010\u001a\u001a\u00020/*\u00020.H\u0000¢\u0006\u0004\b\u001a\u00100\u001a\u0013\u0010\u001a\u001a\u000202*\u000201H\u0000¢\u0006\u0004\b\u001a\u00103\u001a\u0013\u0010\u0002\u001a\u000205*\u000204H\u0000¢\u0006\u0004\b\u0002\u00106\u001a\u0013\u00107\u001a\u000204*\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a\u0013\u0010\u0002\u001a\u00020:*\u000209H\u0000¢\u0006\u0004\b\u0002\u0010;\u001a\u0013\u0010\u0002\u001a\u00020=*\u00020<H\u0000¢\u0006\u0004\b\u0002\u0010>\u001a\u0013\u0010\u0002\u001a\u00020@*\u00020?H\u0002¢\u0006\u0004\b\u0002\u0010A\u001a\u0013\u0010\u0002\u001a\u00020C*\u00020BH\u0000¢\u0006\u0004\b\u0002\u0010D\u001a\u0013\u0010\u0002\u001a\u00020F*\u00020EH\u0002¢\u0006\u0004\b\u0002\u0010G\u001a\u0013\u0010\u0002\u001a\u00020I*\u00020HH\u0000¢\u0006\u0004\b\u0002\u0010J\u001a\u0013\u0010M\u001a\u00020L*\u00020KH\u0002¢\u0006\u0004\bM\u0010N\u001a\u0013\u0010\u001a\u001a\u00020K*\u00020OH\u0002¢\u0006\u0004\b\u001a\u0010P\u001a\u0013\u0010\u001a\u001a\u00020K*\u00020QH\u0000¢\u0006\u0004\b\u001a\u0010R¨\u0006S"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryEmbeddedDto;", "Lf5j/a;", "toDomain", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryEmbeddedDto;)Lf5j/a;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;)Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;)Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;", "Lf5j/b;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;)Lf5j/b;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;", "Lf5j/r;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;)Lf5j/r;", "Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;", "Lf5j/t;", "(Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;)Lf5j/t;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;", "Lf5j/e;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;)Lf5j/e;", "Lcom/revolut/data/network/models/beneficiary/SupportedCountryDto;", "Ln61/s;", "(Lcom/revolut/data/network/models/beneficiary/SupportedCountryDto;)Ln61/s;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "toNetworkModel", "(Lf5j/b;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;", "Lcom/revolut/domain/models/beneficiary/BankFieldDefinition;", "(Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;)Lcom/revolut/domain/models/beneficiary/BankFieldDefinition;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryFieldsDto;", "Ln61/i;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryFieldsDto;)Ln61/i;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryValidationResultDto;", "Ln61/p;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryValidationResultDto;)Ln61/p;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;", "Lcom/revolut/domain/models/beneficiary/ConfirmationResult;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationDto;)Lcom/revolut/domain/models/beneficiary/ConfirmationResult;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryMissingExtraFieldsDto;", "Ln61/n;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryMissingExtraFieldsDto;)Ln61/n;", "Ln61/b;", "Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryParamsNetworkModel;", "(Ln61/b;)Lcom/revolut/data/network/models/beneficiary/BankBeneficiaryParamsNetworkModel;", "Ln61/h;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraAccountFieldsNetworkModel;", "(Ln61/h;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraAccountFieldsNetworkModel;", "Lcom/revolut/domain/models/beneficiary/BeneficiaryVerification;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryVerificationDto;", "(Lcom/revolut/domain/models/beneficiary/BeneficiaryVerification;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryVerificationDto;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryGroupDto;", "Ln61/k;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryGroupDto;)Ln61/k;", "toNetwork", "(Ln61/k;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryGroupDto;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryPdaDto;", "Ln61/o;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryPdaDto;)Ln61/o;", "Lcom/revolut/data/network/models/beneficiary/RouteDetailsDto;", "Lcom/revolut/domain/models/beneficiary/BeneficiaryRouteDetails;", "(Lcom/revolut/data/network/models/beneficiary/RouteDetailsDto;)Lcom/revolut/domain/models/beneficiary/BeneficiaryRouteDetails;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;", "Lcom/revolut/domain/models/beneficiary/BeneficiaryDetails;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryDetailsDto;)Lcom/revolut/domain/models/beneficiary/BeneficiaryDetails;", "Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListDto;", "Lcom/revolut/domain/models/beneficiary/BeneficiarySearchList;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListDto;)Lcom/revolut/domain/models/beneficiary/BeneficiarySearchList;", "Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListSourceDto;", "Lcom/revolut/domain/models/beneficiary/BeneficiarySearchListSource;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiarySearchListSourceDto;)Lcom/revolut/domain/models/beneficiary/BeneficiarySearchListSource;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationResponseDto;", "Ln61/q;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryConfirmationResponseDto;)Ln61/q;", "", "", "isSuccessStatus", "(Ljava/lang/String;)Z", "Lcom/revolut/domain/models/beneficiary/BankBeneficiaryParams$IdentityType;", "(Lcom/revolut/domain/models/beneficiary/BankBeneficiaryParams$IdentityType;)Ljava/lang/String;", "Lcom/revolut/domain/models/beneficiary/BankInformationCopFlow;", "(Lcom/revolut/domain/models/beneficiary/BankInformationCopFlow;)Ljava/lang/String;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryResponseMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[BeneficiaryIdentificationTypeDto.values().length];
            try {
                iArr[BeneficiaryIdentificationTypeDto.BR_CPF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryIdentificationTypeDto.BR_CNPJ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BeneficiaryTypeDto.values().length];
            try {
                iArr2[BeneficiaryTypeDto.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BeneficiaryTypeDto.SWIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BeneficiaryTypeDto.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BeneficiaryTypeDto.US.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BeneficiaryTypeDto.IBAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BeneficiaryTypeDto.CHEQUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BeneficiaryTypeDto.PIX_ALIAS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BeneficiaryTypeDto.BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BeneficiaryTypeDto.PAYID_ALIAS.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BeneficiaryTypeDto.SPIN_ALIAS.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentTypeDto.values().length];
            try {
                iArr3[PaymentTypeDto.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PaymentTypeDto.PRIORITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BeneficiaryStateDto.values().length];
            try {
                iArr4[BeneficiaryStateDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[BeneficiaryStateDto.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BankBeneficiaryParams$IdentityType.values().length];
            try {
                iArr5[BankBeneficiaryParams$IdentityType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[BankBeneficiaryParams$IdentityType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[BankInformationCopFlow.values().length];
            try {
                iArr6[BankInformationCopFlow.TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[BankInformationCopFlow.BENEFICIARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[BankInformationCopFlow.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    private static final boolean isSuccessStatus(String str) {
        return a0.z(str, "SUCCESS", true);
    }

    @NotNull
    public static final a toDomain(@NotNull BeneficiaryEmbeddedDto beneficiaryEmbeddedDto) {
        Intrinsics.checkNotNullParameter(beneficiaryEmbeddedDto, "<this>");
        String id10 = beneficiaryEmbeddedDto.getId();
        String rootId = beneficiaryEmbeddedDto.getRootId();
        String ownerId = beneficiaryEmbeddedDto.getOwnerId();
        String name = beneficiaryEmbeddedDto.getName();
        String firstName = beneficiaryEmbeddedDto.getFirstName();
        String lastName = beneficiaryEmbeddedDto.getLastName();
        String companyName = beneficiaryEmbeddedDto.getCompanyName();
        String email = beneficiaryEmbeddedDto.getEmail();
        String phone = beneficiaryEmbeddedDto.getPhone();
        String externalRef = beneficiaryEmbeddedDto.getExternalRef();
        BeneficiaryTypeDto type = beneficiaryEmbeddedDto.getType();
        r domain = type != null ? toDomain(type) : null;
        b address = beneficiaryEmbeddedDto.getAddress();
        Address addressA = address != null ? oo3.a.a(address) : null;
        String currency = beneficiaryEmbeddedDto.getCurrency();
        String bankCountry = beneficiaryEmbeddedDto.getBankCountry();
        PaymentTypeDto paymentType = beneficiaryEmbeddedDto.getPaymentType();
        t domain2 = paymentType != null ? toDomain(paymentType) : null;
        String country = beneficiaryEmbeddedDto.getCountry();
        Boolean externalAccount = beneficiaryEmbeddedDto.getExternalAccount();
        BeneficiaryStateDto state = beneficiaryEmbeddedDto.getState();
        e domain3 = state != null ? toDomain(state) : null;
        Map<String, String> accountFields = beneficiaryEmbeddedDto.getAccountFields();
        BeneficiaryExtraFieldsEmbeddedDto extraFields = beneficiaryEmbeddedDto.getExtraFields();
        f5j.b domain4 = extraFields != null ? toDomain(extraFields) : null;
        String bankLogo = beneficiaryEmbeddedDto.getBankLogo();
        BeneficiaryIdentificationDto identification = beneficiaryEmbeddedDto.getIdentification();
        return new a(id10, rootId, ownerId, name, firstName, lastName, (String) null, companyName, email, phone, externalRef, domain, addressA, currency, bankCountry, bankLogo, domain2, country, externalAccount, domain3, (Map) accountFields, domain4, (List) null, false, 0, 0L, (String) null, identification != null ? BeneficiaryEntityMapperKt.toDomain(identification) : null, (Instant) null, beneficiaryEmbeddedDto.getCounterpartyDetailsGroup(), 935329856);
    }

    @NotNull
    public static final BeneficiaryGroupDto toNetwork(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String str = kVar.f212689a;
        ArrayList arrayList = kVar.f212690b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(BeneficiaryEntityMapperKt.toDto((a) it8.next()));
        }
        return new BeneficiaryGroupDto(str, arrayList2);
    }

    @NotNull
    public static final BankBeneficiaryParamsNetworkModel toNetworkModel(@NotNull n61.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        BankBeneficiaryParams$IdentityType bankBeneficiaryParams$IdentityType = bVar.f212668a;
        String networkModel = bankBeneficiaryParams$IdentityType != null ? toNetworkModel(bankBeneficiaryParams$IdentityType) : null;
        String str = bVar.f212669b;
        String str2 = bVar.f212670c;
        String str3 = bVar.d;
        String str4 = bVar.e;
        String str5 = bVar.f;
        String str6 = bVar.f212673j;
        Map map = bVar.f212671g;
        Address address = bVar.i;
        AddressModel networkModel2 = address != null ? LegacyAddressMapperKt.toNetworkModel(address) : null;
        String str7 = bVar.f212672h;
        BeneficiaryVerification beneficiaryVerification = bVar.k;
        return new BankBeneficiaryParamsNetworkModel(networkModel, str, str2, str3, null, null, str4, str5, str6, map, str7, networkModel2, null, beneficiaryVerification != null ? toNetworkModel(beneficiaryVerification) : null, bVar.f212674l, bVar.f212675m);
    }

    @NotNull
    public static final BeneficiaryExtraFieldsDto toNetworkModel(@NotNull f5j.b bVar) {
        int i;
        String strH;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f132347b;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (Throwable th10) {
                gom.e.f145194a.e(th10);
                i = 0;
            }
            strH = i == 0 ? null : d.h(i, "-01-01");
        } else {
            strH = null;
        }
        String str2 = bVar.f132346a;
        String str3 = bVar.d;
        String str4 = bVar.f132348c;
        Address address = bVar.e;
        return new BeneficiaryExtraFieldsDto(str2, strH, str4, str3, address != null ? LegacyAddressMapperKt.toNetworkModel(address) : null);
    }

    @NotNull
    public static final BeneficiaryIdentificationType toDomain(@NotNull BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationTypeDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[beneficiaryIdentificationTypeDto.ordinal()];
        if (i == 1) {
            return BeneficiaryIdentificationType.BR_CPF;
        }
        if (i == 2) {
            return BeneficiaryIdentificationType.BR_CNPJ;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BeneficiaryIdentification toDomain(@NotNull BeneficiaryIdentificationDto beneficiaryIdentificationDto) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationDto, "<this>");
        BeneficiaryIdentificationTypeDto type = beneficiaryIdentificationDto.getType();
        if (type == null) {
            return null;
        }
        BeneficiaryIdentificationType domain = BeneficiaryEntityMapperKt.toDomain(type);
        String value = beneficiaryIdentificationDto.getValue();
        if (value == null) {
            value = "";
        }
        return new BeneficiaryIdentification(domain, value);
    }

    @NotNull
    public static final f5j.b toDomain(@NotNull BeneficiaryExtraFieldsEmbeddedDto beneficiaryExtraFieldsEmbeddedDto) {
        Intrinsics.checkNotNullParameter(beneficiaryExtraFieldsEmbeddedDto, "<this>");
        return new f5j.b(beneficiaryExtraFieldsEmbeddedDto.getLegalName(), beneficiaryExtraFieldsEmbeddedDto.getDob(), beneficiaryExtraFieldsEmbeddedDto.getReason(), beneficiaryExtraFieldsEmbeddedDto.getCompanyDo(), null);
    }

    @NotNull
    public static final BeneficiaryExtraAccountFieldsNetworkModel toNetworkModel(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        throw null;
    }

    @NotNull
    public static final BeneficiaryVerificationDto toNetworkModel(@NotNull BeneficiaryVerification beneficiaryVerification) {
        Intrinsics.checkNotNullParameter(beneficiaryVerification, "<this>");
        return new BeneficiaryVerificationDto(beneficiaryVerification.f60299a, beneficiaryVerification.f60300b);
    }

    private static final String toNetworkModel(BankBeneficiaryParams$IdentityType bankBeneficiaryParams$IdentityType) {
        int i = WhenMappings.$EnumSwitchMapping$4[bankBeneficiaryParams$IdentityType.ordinal()];
        if (i == 1) {
            return "INDIVIDUAL";
        }
        if (i == 2) {
            return "BUSINESS";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final r toDomain(@NotNull BeneficiaryTypeDto beneficiaryTypeDto) {
        Intrinsics.checkNotNullParameter(beneficiaryTypeDto, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[beneficiaryTypeDto.ordinal()]) {
            case 1:
                return r.LOCAL;
            case 2:
                return r.SWIFT;
            case 3:
                return r.UK;
            case 4:
                return r.US;
            case 5:
                return r.IBAN;
            case 6:
                return r.CHEQUE;
            case 7:
                return r.PIX_ALIAS;
            case 8:
                return r.BR;
            case 9:
                return r.PAYID_ALIAS;
            case 10:
                return r.SPIN_ALIAS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final String toNetworkModel(@NotNull BankInformationCopFlow bankInformationCopFlow) {
        Intrinsics.checkNotNullParameter(bankInformationCopFlow, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$5[bankInformationCopFlow.ordinal()];
        if (i == 1) {
            return "TRANSFER";
        }
        if (i == 2) {
            return "BENEFICIARY";
        }
        if (i == 3) {
            return "SKIP";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final t toDomain(@NotNull PaymentTypeDto paymentTypeDto) {
        Intrinsics.checkNotNullParameter(paymentTypeDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[paymentTypeDto.ordinal()];
        if (i == 1) {
            return t.REGULAR;
        }
        if (i == 2) {
            return t.PRIORITY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final e toDomain(@NotNull BeneficiaryStateDto beneficiaryStateDto) {
        Intrinsics.checkNotNullParameter(beneficiaryStateDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[beneficiaryStateDto.ordinal()];
        if (i == 1) {
            return e.ACTIVE;
        }
        if (i == 2) {
            return e.DELETED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final s toDomain(@NotNull SupportedCountryDto supportedCountryDto) {
        Intrinsics.checkNotNullParameter(supportedCountryDto, "<this>");
        return new s(supportedCountryDto.getCode(), supportedCountryDto.getName());
    }

    @NotNull
    public static final BankFieldDefinition toDomain(@NotNull BankFieldDefinitionDto bankFieldDefinitionDto) {
        BankFieldFormat bankFieldFormat;
        String str;
        BankFieldChoiceDto bankFieldChoiceDto;
        Intrinsics.checkNotNullParameter(bankFieldDefinitionDto, "<this>");
        String type = bankFieldDefinitionDto.getType();
        String regex = bankFieldDefinitionDto.getRegex();
        BankFieldFormat.Companion companion = BankFieldFormat.INSTANCE;
        String format = bankFieldDefinitionDto.getFormat();
        companion.getClass();
        ArrayList arrayList = null;
        if (format != null) {
            BankFieldFormat[] bankFieldFormatArrValues = BankFieldFormat.values();
            int length = bankFieldFormatArrValues.length;
            for (int i = 0; i < length; i++) {
                bankFieldFormat = bankFieldFormatArrValues[i];
                if (format.equalsIgnoreCase(bankFieldFormat.name())) {
                    break;
                }
            }
            bankFieldFormat = null;
        } else {
            bankFieldFormat = null;
        }
        if (bankFieldFormat == null) {
            bankFieldFormat = BankFieldFormat.NONE;
        }
        String inputMask = bankFieldDefinitionDto.getInputMask();
        boolean numeric = bankFieldDefinitionDto.getNumeric();
        String proposedValue = bankFieldDefinitionDto.getProposedValue();
        if (proposedValue != null) {
            str = proposedValue;
        } else {
            List<BankFieldChoiceDto> choices = bankFieldDefinitionDto.getChoices();
            if (choices == null || (bankFieldChoiceDto = choices.get(0)) == null) {
                str = null;
            } else {
                proposedValue = bankFieldChoiceDto.getValue();
                str = proposedValue;
            }
        }
        List<BankFieldChoiceDto> choices2 = bankFieldDefinitionDto.getChoices();
        if (choices2 != null) {
            List<BankFieldChoiceDto> list = choices2;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((BankFieldChoiceDto) it8.next()).getValue());
            }
        }
        Boolean optional = bankFieldDefinitionDto.getOptional();
        Boolean editable = bankFieldDefinitionDto.getEditable();
        return new BankFieldDefinition(type, regex, bankFieldFormat, numeric, str, inputMask, arrayList, optional, editable != null ? editable.booleanValue() : true);
    }

    @NotNull
    public static final i toDomain(@NotNull BeneficiaryFieldsDto beneficiaryFieldsDto) {
        Intrinsics.checkNotNullParameter(beneficiaryFieldsDto, "<this>");
        List<BankFieldDefinitionDto> fields = beneficiaryFieldsDto.getFields();
        ArrayList arrayList = new ArrayList(w.t(fields, 10));
        Iterator<T> it8 = fields.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDomain((BankFieldDefinitionDto) it8.next()));
        }
        f5j.s sVar = t.Companion;
        String paymentType = beneficiaryFieldsDto.getPaymentType();
        sVar.getClass();
        return new i(arrayList, f5j.s.a(paymentType), beneficiaryFieldsDto.getAddressOptional());
    }

    @NotNull
    public static final p toDomain(@NotNull BeneficiaryValidationResultDto beneficiaryValidationResultDto) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(beneficiaryValidationResultDto, "<this>");
        boolean zIsSuccessStatus = isSuccessStatus(beneficiaryValidationResultDto.getStatus());
        List<BankFieldDefinitionDto> accountFields = beneficiaryValidationResultDto.getAccountFields();
        if (accountFields != null) {
            List<BankFieldDefinitionDto> list = accountFields;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDomain((BankFieldDefinitionDto) it8.next()));
            }
        } else {
            arrayList = null;
        }
        BeneficiaryConfirmationDto confirmation = beneficiaryValidationResultDto.getConfirmation();
        ConfirmationResult domain = confirmation != null ? toDomain(confirmation) : null;
        Boolean boolIsRevolutBeneficiary = beneficiaryValidationResultDto.isRevolutBeneficiary();
        return new p(zIsSuccessStatus, arrayList, domain, boolIsRevolutBeneficiary != null ? boolIsRevolutBeneficiary.booleanValue() : false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.domain.models.beneficiary.ConfirmationResult toDomain(@org.jetbrains.annotations.NotNull com.revolut.data.network.models.beneficiary.BeneficiaryConfirmationDto r9) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt.toDomain(com.revolut.data.network.models.beneficiary.BeneficiaryConfirmationDto):com.revolut.domain.models.beneficiary.ConfirmationResult");
    }

    @NotNull
    public static final n toDomain(@NotNull BeneficiaryMissingExtraFieldsDto beneficiaryMissingExtraFieldsDto) {
        Intrinsics.checkNotNullParameter(beneficiaryMissingExtraFieldsDto, "<this>");
        return new n(beneficiaryMissingExtraFieldsDto.getAddress(), beneficiaryMissingExtraFieldsDto.getDob(), beneficiaryMissingExtraFieldsDto.getLegalName(), beneficiaryMissingExtraFieldsDto.getCompanyDo(), beneficiaryMissingExtraFieldsDto.getReason());
    }

    @NotNull
    public static final k toDomain(@NotNull BeneficiaryGroupDto beneficiaryGroupDto) {
        Intrinsics.checkNotNullParameter(beneficiaryGroupDto, "<this>");
        String name = beneficiaryGroupDto.getName();
        List<BeneficiaryDto> beneficiaries = beneficiaryGroupDto.getBeneficiaries();
        ArrayList arrayList = new ArrayList(w.t(beneficiaries, 10));
        Iterator<T> it8 = beneficiaries.iterator();
        while (it8.hasNext()) {
            arrayList.add(BeneficiaryEntityMapperKt.toDomain$default((BeneficiaryDto) it8.next(), 0, 0L, null, 7, null));
        }
        return new k(name, arrayList);
    }

    @NotNull
    public static final o toDomain(@NotNull BeneficiaryPdaDto beneficiaryPdaDto) {
        Intrinsics.checkNotNullParameter(beneficiaryPdaDto, "<this>");
        return new o(beneficiaryPdaDto.getDesignatedAccountAllowed(), beneficiaryPdaDto.isCurrentDesignatedAccount());
    }

    @NotNull
    public static final BeneficiaryRouteDetails toDomain(@NotNull RouteDetailsDto routeDetailsDto) {
        Intrinsics.checkNotNullParameter(routeDetailsDto, "<this>");
        BeneficiaryDetails domain = toDomain(routeDetailsDto.getBeneficiaryDetailsDto());
        boolean z = routeDetailsDto.getDefault();
        f5j.s sVar = t.Companion;
        String paymentType = routeDetailsDto.getPaymentType();
        sVar.getClass();
        return new BeneficiaryRouteDetails(domain, z, f5j.s.a(paymentType), routeDetailsDto.getEstimatedArrival(), routeDetailsDto.getIntermediaryFeesApply(), routeDetailsDto.getCreditorFeesApply(), routeDetailsDto.getUpperAmountLimit());
    }

    private static final BeneficiaryDetails toDomain(BeneficiaryDetailsDto beneficiaryDetailsDto) {
        List<BankFieldDefinitionDto> fields = beneficiaryDetailsDto.getFields();
        ArrayList arrayList = new ArrayList(w.t(fields, 10));
        Iterator<T> it8 = fields.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDomain((BankFieldDefinitionDto) it8.next()));
        }
        return new BeneficiaryDetails(beneficiaryDetailsDto.getType(), beneficiaryDetailsDto.getLocalisedTypeValue(), beneficiaryDetailsDto.getLocalisedShortenedTypeValue(), arrayList, beneficiaryDetailsDto.getRequirements().getAddressRequired());
    }

    @NotNull
    public static final BeneficiarySearchList toDomain(@NotNull BeneficiarySearchListDto beneficiarySearchListDto) {
        Intrinsics.checkNotNullParameter(beneficiarySearchListDto, "<this>");
        List<BeneficiarySearchListSourceDto> dataSource = beneficiarySearchListDto.getDataSource();
        ArrayList arrayList = new ArrayList(w.t(dataSource, 10));
        Iterator<T> it8 = dataSource.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDomain((BeneficiarySearchListSourceDto) it8.next()));
        }
        Map<String, String> dataMapping = beneficiarySearchListDto.getDataMapping();
        if (dataMapping == null) {
            dataMapping = r0.g();
        }
        return new BeneficiarySearchList(arrayList, dataMapping);
    }

    private static final BeneficiarySearchListSource toDomain(BeneficiarySearchListSourceDto beneficiarySearchListSourceDto) {
        String name = beneficiarySearchListSourceDto.getName();
        if (name == null) {
            name = "";
        }
        String description = beneficiarySearchListSourceDto.getDescription();
        String logoUrl = beneficiarySearchListSourceDto.getLogoUrl();
        Map<String, String> values = beneficiarySearchListSourceDto.getValues();
        if (values == null) {
            values = r0.g();
        }
        return new BeneficiarySearchListSource(name, description, logoUrl, values);
    }

    @NotNull
    public static final q toDomain(@NotNull BeneficiaryConfirmationResponseDto beneficiaryConfirmationResponseDto) {
        Intrinsics.checkNotNullParameter(beneficiaryConfirmationResponseDto, "<this>");
        if (isSuccessStatus(beneficiaryConfirmationResponseDto.getStatus())) {
            BeneficiaryConfirmationDto confirmation = beneficiaryConfirmationResponseDto.getConfirmation();
            return new n61.r(confirmation != null ? toDomain(confirmation) : null);
        }
        return q.a.f212701a;
    }
}
