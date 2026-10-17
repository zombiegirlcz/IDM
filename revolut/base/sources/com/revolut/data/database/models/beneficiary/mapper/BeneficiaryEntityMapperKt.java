package com.revolut.data.database.models.beneficiary.mapper;

import com.revolut.data.database.models.beneficiary.BeneficiaryEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryExtraFieldsEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryIdentificationEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryIdentificationTypeEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryStateEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryTypeEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.PaymentTypeEmbeddedEntity;
import com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity;
import com.revolut.data.database.models.payments.mapper.PaymentSettingEmbeddedEntityMapperKt;
import com.revolut.data.network.models.address.AddressModel;
import com.revolut.data.network.models.address.mapper.LegacyAddressMapperKt;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryExtraFieldsDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryLabelDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.data.network.models.payments.PaymentsSettingDto;
import com.revolut.data.network.models.payments.mappers.PaymentsSettingMapperKt;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentification;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import f5j.a;
import f5j.b;
import f5j.d;
import f5j.e;
import f5j.r;
import f5j.s;
import f5j.t;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import so3.c;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u0013\u0010\u0013\u001a\u00020\u0007*\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0016\u001a\u0013\u0010\u0013\u001a\u00020\n*\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0017\u001a\u0013\u0010\u0013\u001a\u00020\r*\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0018\u001a\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0019\u001a\u0013\u0010\u0013\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u0013\u0010\u001c\u001a\u0013\u0010\u0002\u001a\u00020\u001a*\u00020\u001bH\u0000¢\u0006\u0004\b\u0002\u0010\u001d\u001a\u0013\u0010\u0002\u001a\u00020\u001a*\u00020\u001eH\u0000¢\u0006\u0004\b\u0002\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u001e*\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\"H\u0000¢\u0006\u0004\b\u0002\u0010#\u001a\u0013\u0010$\u001a\u00020\"*\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010 \u001a\u00020&*\u00020\u0001H\u0000¢\u0006\u0004\b \u0010'\u001a\u0013\u0010)\u001a\u00020(*\u00020\u0001H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010 \u001a\u00020+*\u00020\u0005H\u0000¢\u0006\u0004\b \u0010,\u001a\u0013\u0010 \u001a\u00020-*\u00020\bH\u0000¢\u0006\u0004\b \u0010.\u001a3\u0010\u0002\u001a\u00020\u0001*\u00020&2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u0002012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0000¢\u0006\u0004\b\u0002\u00105\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0005*\u00020+H\u0000¢\u0006\u0004\b\u0002\u00106\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020-H\u0000¢\u0006\u0004\b\u0002\u00107¨\u00068"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "Lf5j/a;", "toDomain", "(Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;)Lf5j/a;", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;", "(Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;)Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationTypeEmbeddedEntity;", "Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;", "(Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationTypeEmbeddedEntity;)Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "Lf5j/r;", "(Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;)Lf5j/r;", "Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "Lf5j/t;", "(Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;)Lf5j/t;", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "Lf5j/e;", "(Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;)Lf5j/e;", "toEmbeddedEntity", "(Lf5j/a;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "(Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "(Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationTypeEmbeddedEntity;", "(Lf5j/r;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "(Lf5j/t;)Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "(Lf5j/e;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "Lf5j/b;", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "(Lf5j/b;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "(Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;)Lf5j/b;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;)Lf5j/b;", "toDto", "(Lf5j/b;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;", "(Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;)Lf5j/a;", "toEntity", "(Lf5j/a;)Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;", "(Lf5j/a;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryLabelDto;", "toLabelDto", "(Lf5j/a;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryLabelDto;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "(Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "(Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "", "transactionsCount", "", "timestamp", "", "label", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;IJLjava/lang/String;)Lf5j/a;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;)Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentification;", "(Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;)Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryEntityMapperKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[BeneficiaryIdentificationTypeEmbeddedEntity.values().length];
            try {
                iArr[BeneficiaryIdentificationTypeEmbeddedEntity.BR_CPF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryIdentificationTypeEmbeddedEntity.BR_CNPJ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BeneficiaryTypeEmbeddedEntity.values().length];
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.SWIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.US.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.IBAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.MOBILE_WALLET.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.CHEQUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.PIX_ALIAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.BR.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.PAYID_ALIAS.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.SPIN_ALIAS.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.BREB_ALIAS.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BeneficiaryTypeEmbeddedEntity.CO_ACH.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentTypeEmbeddedEntity.values().length];
            try {
                iArr3[PaymentTypeEmbeddedEntity.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[PaymentTypeEmbeddedEntity.PRIORITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BeneficiaryStateEmbeddedEntity.values().length];
            try {
                iArr4[BeneficiaryStateEmbeddedEntity.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[BeneficiaryStateEmbeddedEntity.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BeneficiaryIdentificationType.values().length];
            try {
                iArr5[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[r.values().length];
            try {
                iArr6[r.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[r.SWIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[r.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[r.US.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[r.IBAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[r.MOBILE_WALLET.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[r.CHEQUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[r.PIX_ALIAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[r.BR.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[r.PAYID_ALIAS.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[r.SPIN_ALIAS.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr6[r.BREB_ALIAS.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr6[r.CO_ACH.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[t.values().length];
            try {
                iArr7[t.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[t.PRIORITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[e.values().length];
            try {
                iArr8[e.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[e.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[BeneficiaryIdentificationTypeDto.values().length];
            try {
                iArr9[BeneficiaryIdentificationTypeDto.BR_CPF.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr9[BeneficiaryIdentificationTypeDto.BR_CNPJ.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$8 = iArr9;
        }
    }

    @NotNull
    public static final a toDomain(@NotNull BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryEmbeddedEntity, "<this>");
        String id10 = beneficiaryEmbeddedEntity.getId();
        String rootId = beneficiaryEmbeddedEntity.getRootId();
        String ownerId = beneficiaryEmbeddedEntity.getOwnerId();
        String name = beneficiaryEmbeddedEntity.getName();
        String firstName = beneficiaryEmbeddedEntity.getFirstName();
        String lastName = beneficiaryEmbeddedEntity.getLastName();
        String companyName = beneficiaryEmbeddedEntity.getCompanyName();
        String fullName = beneficiaryEmbeddedEntity.getFullName();
        String email = beneficiaryEmbeddedEntity.getEmail();
        String phone = beneficiaryEmbeddedEntity.getPhone();
        String externalRef = beneficiaryEmbeddedEntity.getExternalRef();
        BeneficiaryTypeEmbeddedEntity type = beneficiaryEmbeddedEntity.getType();
        r domain = type != null ? toDomain(type) : null;
        c address = beneficiaryEmbeddedEntity.getAddress();
        Address addressA = address != null ? to3.a.a(address) : null;
        String currency = beneficiaryEmbeddedEntity.getCurrency();
        String bankCountry = beneficiaryEmbeddedEntity.getBankCountry();
        String bankLogo = beneficiaryEmbeddedEntity.getBankLogo();
        PaymentTypeEmbeddedEntity paymentType = beneficiaryEmbeddedEntity.getPaymentType();
        t domain2 = paymentType != null ? toDomain(paymentType) : null;
        String country = beneficiaryEmbeddedEntity.getCountry();
        Boolean externalAccount = beneficiaryEmbeddedEntity.getExternalAccount();
        BeneficiaryStateEmbeddedEntity state = beneficiaryEmbeddedEntity.getState();
        e domain3 = state != null ? toDomain(state) : null;
        Map<String, String> accountFields = beneficiaryEmbeddedEntity.getAccountFields();
        BeneficiaryExtraFieldsEmbeddedEntity extraFields = beneficiaryEmbeddedEntity.getExtraFields();
        b domain4 = extraFields != null ? toDomain(extraFields) : null;
        List<iy9.b> domain5 = PaymentSettingEmbeddedEntityMapperKt.toDomain(beneficiaryEmbeddedEntity.getSettings());
        String label = beneficiaryEmbeddedEntity.getLabel();
        BeneficiaryIdentificationEmbeddedEntity identification = beneficiaryEmbeddedEntity.getIdentification();
        return new a(id10, rootId, ownerId, name, firstName, lastName, fullName, companyName, email, phone, externalRef, domain, addressA, currency, bankCountry, bankLogo, domain2, country, externalAccount, domain3, (Map) accountFields, domain4, (List) domain5, false, 0, 0L, label, identification != null ? toDomain(identification) : null, (Instant) null, beneficiaryEmbeddedEntity.getCounterpartyDetailsGroup(), 864026624);
    }

    public static /* synthetic */ a toDomain$default(BeneficiaryDto beneficiaryDto, int i, long j2, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        return toDomain(beneficiaryDto, i, j2, str);
    }

    @NotNull
    public static final BeneficiaryDto toDto(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f132329a;
        String str2 = aVar.f132331c;
        String str3 = aVar.d;
        String str4 = aVar.e;
        String str5 = aVar.f;
        String str6 = aVar.f132333h;
        String str7 = aVar.f132332g;
        String str8 = aVar.i;
        String str9 = aVar.f132334j;
        String str10 = aVar.k;
        r rVar = aVar.f132335l;
        String strName = rVar != null ? rVar.name() : null;
        Address address = aVar.f132336m;
        AddressModel networkModel = address != null ? LegacyAddressMapperKt.toNetworkModel(address) : null;
        b bVar = aVar.v;
        BeneficiaryExtraFieldsDto dto = bVar != null ? toDto(bVar) : null;
        List<PaymentsSettingDto> dto2 = PaymentsSettingMapperKt.toDto((List<iy9.b>) aVar.f132343w);
        String str11 = aVar.f132337n;
        String str12 = aVar.o;
        String str13 = aVar.f132338p;
        t tVar = aVar.f132339q;
        String strName2 = tVar != null ? tVar.name() : null;
        Boolean bool = aVar.f132341s;
        e eVar = aVar.f132342t;
        String strName3 = eVar != null ? eVar.name() : null;
        Map map = aVar.u;
        boolean z = aVar.f132344x;
        String str14 = aVar.A;
        BeneficiaryIdentification beneficiaryIdentification = aVar.B;
        BeneficiaryIdentificationDto dto3 = beneficiaryIdentification != null ? toDto(beneficiaryIdentification) : null;
        Instant instant = aVar.D;
        return new BeneficiaryDto(str, null, str2, str3, str4, str5, str7, str6, str8, str9, str10, strName, networkModel, str11, str12, str13, strName2, bool, strName3, dto, dto2, map, z, str14, dto3, null, instant != null ? Long.valueOf(instant.toEpochMilli()) : null, aVar.E, 33554434, null);
    }

    @NotNull
    public static final BeneficiaryEmbeddedEntity toEmbeddedEntity(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f132329a;
        String str2 = aVar.f132330b;
        String str3 = aVar.f132331c;
        String str4 = aVar.d;
        String str5 = aVar.e;
        String str6 = aVar.f;
        String str7 = aVar.f132333h;
        String str8 = aVar.f132332g;
        String str9 = aVar.i;
        String str10 = aVar.f132334j;
        String str11 = aVar.k;
        r rVar = aVar.f132335l;
        BeneficiaryTypeEmbeddedEntity embeddedEntity = rVar != null ? toEmbeddedEntity(rVar) : null;
        Address address = aVar.f132336m;
        c cVarB = address != null ? to3.a.b(address) : null;
        String str12 = aVar.f132337n;
        String str13 = aVar.o;
        String str14 = aVar.f132338p;
        t tVar = aVar.f132339q;
        PaymentTypeEmbeddedEntity embeddedEntity2 = tVar != null ? toEmbeddedEntity(tVar) : null;
        String str15 = aVar.f132340r;
        Boolean bool = aVar.f132341s;
        e eVar = aVar.f132342t;
        BeneficiaryStateEmbeddedEntity embeddedEntity3 = eVar != null ? toEmbeddedEntity(eVar) : null;
        Map map = aVar.u;
        b bVar = aVar.v;
        BeneficiaryExtraFieldsEmbeddedEntity embeddedEntity4 = bVar != null ? toEmbeddedEntity(bVar) : null;
        List<PaymentsSettingEmbeddedEntity> embeddedEntity5 = PaymentSettingEmbeddedEntityMapperKt.toEmbeddedEntity((List<iy9.b>) aVar.f132343w);
        String str16 = aVar.A;
        BeneficiaryIdentification beneficiaryIdentification = aVar.B;
        return new BeneficiaryEmbeddedEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, embeddedEntity, cVarB, str12, str13, str14, embeddedEntity2, str15, bool, str16, embeddedEntity3, map, embeddedEntity4, embeddedEntity5, beneficiaryIdentification != null ? toEmbeddedEntity(beneficiaryIdentification) : null, aVar.E);
    }

    @NotNull
    public static final BeneficiaryEntity toEntity(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f132329a;
        String str2 = aVar.f132330b;
        String str3 = aVar.f132331c;
        String str4 = aVar.d;
        String str5 = aVar.e;
        String str6 = aVar.f;
        String str7 = aVar.f132333h;
        String str8 = aVar.f132332g;
        String str9 = aVar.i;
        String str10 = aVar.f132334j;
        String str11 = aVar.k;
        r rVar = aVar.f132335l;
        BeneficiaryTypeEmbeddedEntity embeddedEntity = rVar != null ? toEmbeddedEntity(rVar) : null;
        Address address = aVar.f132336m;
        c cVarB = address != null ? to3.a.b(address) : null;
        b bVar = aVar.v;
        BeneficiaryExtraFieldsEmbeddedEntity embeddedEntity2 = bVar != null ? toEmbeddedEntity(bVar) : null;
        List<PaymentsSettingEmbeddedEntity> embeddedEntity3 = PaymentSettingEmbeddedEntityMapperKt.toEmbeddedEntity((List<iy9.b>) aVar.f132343w);
        String str12 = aVar.f132337n;
        BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity = embeddedEntity;
        String str13 = aVar.o;
        String str14 = aVar.f132338p;
        t tVar = aVar.f132339q;
        PaymentTypeEmbeddedEntity embeddedEntity4 = tVar != null ? toEmbeddedEntity(tVar) : null;
        String str15 = aVar.f132340r;
        Boolean bool = aVar.f132341s;
        e eVar = aVar.f132342t;
        BeneficiaryStateEmbeddedEntity embeddedEntity5 = eVar != null ? toEmbeddedEntity(eVar) : null;
        Map map = aVar.u;
        boolean z = aVar.f132344x;
        int i = aVar.f132345y;
        long j2 = aVar.z;
        String str16 = aVar.A;
        BeneficiaryIdentification beneficiaryIdentification = aVar.B;
        BeneficiaryIdentificationEmbeddedEntity embeddedEntity6 = beneficiaryIdentification != null ? toEmbeddedEntity(beneficiaryIdentification) : null;
        Instant instant = aVar.D;
        return new BeneficiaryEntity(str, str2, str3, str4, str5, str6, str7, str8, beneficiaryTypeEmbeddedEntity, str13, str14, embeddedEntity4, embeddedEntity2, embeddedEntity3, map, str11, bool, embeddedEntity5, cVarB, str9, str10, z, str15, str12, i, j2, str16, embeddedEntity6, instant != null ? Long.valueOf(instant.toEpochMilli()) : null, aVar.E);
    }

    @NotNull
    public static final BeneficiaryLabelDto toLabelDto(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new BeneficiaryLabelDto(aVar.A);
    }

    public static final BeneficiaryIdentification toDomain(@NotNull BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationEmbeddedEntity, "<this>");
        if (beneficiaryIdentificationEmbeddedEntity.getType() == null) {
            return null;
        }
        BeneficiaryIdentificationType domain = toDomain(beneficiaryIdentificationEmbeddedEntity.getType());
        String value = beneficiaryIdentificationEmbeddedEntity.getValue();
        if (value == null) {
            value = "";
        }
        return new BeneficiaryIdentification(domain, value);
    }

    @NotNull
    public static final BeneficiaryIdentificationType toDomain(@NotNull BeneficiaryIdentificationTypeEmbeddedEntity beneficiaryIdentificationTypeEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationTypeEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[beneficiaryIdentificationTypeEmbeddedEntity.ordinal()];
        if (i == 1) {
            return BeneficiaryIdentificationType.BR_CPF;
        }
        if (i == 2) {
            return BeneficiaryIdentificationType.BR_CNPJ;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final BeneficiaryIdentificationEmbeddedEntity toEmbeddedEntity(@NotNull BeneficiaryIdentification beneficiaryIdentification) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentification, "<this>");
        return new BeneficiaryIdentificationEmbeddedEntity(toEmbeddedEntity(beneficiaryIdentification.f99773a), beneficiaryIdentification.f99774b);
    }

    @NotNull
    public static final BeneficiaryExtraFieldsDto toDto(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new BeneficiaryExtraFieldsDto(bVar.f132346a, bVar.f132347b, bVar.f132348c, bVar.d, null, 16, null);
    }

    @NotNull
    public static final r toDomain(@NotNull BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryTypeEmbeddedEntity, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[beneficiaryTypeEmbeddedEntity.ordinal()]) {
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
                return r.MOBILE_WALLET;
            case 7:
                return r.CHEQUE;
            case 8:
                return r.PIX_ALIAS;
            case 9:
                return r.BR;
            case 10:
                return r.PAYID_ALIAS;
            case 11:
                return r.SPIN_ALIAS;
            case 12:
                return r.BREB_ALIAS;
            case 13:
                return r.CO_ACH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final BeneficiaryIdentificationTypeEmbeddedEntity toEmbeddedEntity(@NotNull BeneficiaryIdentificationType beneficiaryIdentificationType) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[beneficiaryIdentificationType.ordinal()];
        if (i == 1) {
            return BeneficiaryIdentificationTypeEmbeddedEntity.BR_CPF;
        }
        if (i == 2) {
            return BeneficiaryIdentificationTypeEmbeddedEntity.BR_CNPJ;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final BeneficiaryIdentificationDto toDto(@NotNull BeneficiaryIdentification beneficiaryIdentification) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentification, "<this>");
        return new BeneficiaryIdentificationDto(toDto(beneficiaryIdentification.f99773a), beneficiaryIdentification.f99774b);
    }

    @NotNull
    public static final BeneficiaryTypeEmbeddedEntity toEmbeddedEntity(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$5[rVar.ordinal()]) {
            case 1:
                return BeneficiaryTypeEmbeddedEntity.LOCAL;
            case 2:
                return BeneficiaryTypeEmbeddedEntity.SWIFT;
            case 3:
                return BeneficiaryTypeEmbeddedEntity.UK;
            case 4:
                return BeneficiaryTypeEmbeddedEntity.US;
            case 5:
                return BeneficiaryTypeEmbeddedEntity.IBAN;
            case 6:
                return BeneficiaryTypeEmbeddedEntity.MOBILE_WALLET;
            case 7:
                return BeneficiaryTypeEmbeddedEntity.CHEQUE;
            case 8:
                return BeneficiaryTypeEmbeddedEntity.PIX_ALIAS;
            case 9:
                return BeneficiaryTypeEmbeddedEntity.BR;
            case 10:
                return BeneficiaryTypeEmbeddedEntity.PAYID_ALIAS;
            case 11:
                return BeneficiaryTypeEmbeddedEntity.SPIN_ALIAS;
            case 12:
                return BeneficiaryTypeEmbeddedEntity.BREB_ALIAS;
            case 13:
                return BeneficiaryTypeEmbeddedEntity.CO_ACH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final BeneficiaryIdentificationTypeDto toDto(@NotNull BeneficiaryIdentificationType beneficiaryIdentificationType) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[beneficiaryIdentificationType.ordinal()];
        if (i == 1) {
            return BeneficiaryIdentificationTypeDto.BR_CPF;
        }
        if (i == 2) {
            return BeneficiaryIdentificationTypeDto.BR_CNPJ;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final t toDomain(@NotNull PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(paymentTypeEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[paymentTypeEmbeddedEntity.ordinal()];
        if (i == 1) {
            return t.REGULAR;
        }
        if (i == 2) {
            return t.PRIORITY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final e toDomain(@NotNull BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryStateEmbeddedEntity, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[beneficiaryStateEmbeddedEntity.ordinal()];
        if (i == 1) {
            return e.ACTIVE;
        }
        if (i == 2) {
            return e.DELETED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final PaymentTypeEmbeddedEntity toEmbeddedEntity(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$6[tVar.ordinal()];
        if (i == 1) {
            return PaymentTypeEmbeddedEntity.REGULAR;
        }
        if (i == 2) {
            return PaymentTypeEmbeddedEntity.PRIORITY;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final b toDomain(@NotNull BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryExtraFieldsEmbeddedEntity, "<this>");
        return new b(beneficiaryExtraFieldsEmbeddedEntity.getLegalName(), beneficiaryExtraFieldsEmbeddedEntity.getDob(), beneficiaryExtraFieldsEmbeddedEntity.getReason(), beneficiaryExtraFieldsEmbeddedEntity.getCompanyDo(), null);
    }

    @NotNull
    public static final b toDomain(@NotNull BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto) {
        Intrinsics.checkNotNullParameter(beneficiaryExtraFieldsDto, "<this>");
        return new b(beneficiaryExtraFieldsDto.getLegalName(), beneficiaryExtraFieldsDto.getDob(), beneficiaryExtraFieldsDto.getReason(), beneficiaryExtraFieldsDto.getCompanyDo(), null);
    }

    @NotNull
    public static final BeneficiaryStateEmbeddedEntity toEmbeddedEntity(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$7[eVar.ordinal()];
        if (i == 1) {
            return BeneficiaryStateEmbeddedEntity.ACTIVE;
        }
        if (i == 2) {
            return BeneficiaryStateEmbeddedEntity.DELETED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final BeneficiaryExtraFieldsEmbeddedEntity toEmbeddedEntity(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new BeneficiaryExtraFieldsEmbeddedEntity(bVar.f132346a, bVar.f132347b, bVar.f132348c, bVar.d);
    }

    @NotNull
    public static final a toDomain(@NotNull BeneficiaryEntity beneficiaryEntity) {
        Intrinsics.checkNotNullParameter(beneficiaryEntity, "<this>");
        String id10 = beneficiaryEntity.getId();
        String rootId = beneficiaryEntity.getRootId();
        String ownerId = beneficiaryEntity.getOwnerId();
        String name = beneficiaryEntity.getName();
        String firstName = beneficiaryEntity.getFirstName();
        String lastName = beneficiaryEntity.getLastName();
        String companyName = beneficiaryEntity.getCompanyName();
        String fullName = beneficiaryEntity.getFullName();
        String email = beneficiaryEntity.getEmail();
        String phone = beneficiaryEntity.getPhone();
        String externalRef = beneficiaryEntity.getExternalRef();
        BeneficiaryTypeEmbeddedEntity type = beneficiaryEntity.getType();
        r domain = type != null ? toDomain(type) : null;
        c address = beneficiaryEntity.getAddress();
        Address addressA = address != null ? to3.a.a(address) : null;
        BeneficiaryExtraFieldsEmbeddedEntity extraFields = beneficiaryEntity.getExtraFields();
        b domain2 = extraFields != null ? toDomain(extraFields) : null;
        String currency = beneficiaryEntity.getCurrency();
        String bankCountry = beneficiaryEntity.getBankCountry();
        String bankLogo = beneficiaryEntity.getBankLogo();
        PaymentTypeEmbeddedEntity paymentType = beneficiaryEntity.getPaymentType();
        t domain3 = paymentType != null ? toDomain(paymentType) : null;
        String country = beneficiaryEntity.getCountry();
        Boolean externalAccount = beneficiaryEntity.getExternalAccount();
        BeneficiaryStateEmbeddedEntity state = beneficiaryEntity.getState();
        e domain4 = state != null ? toDomain(state) : null;
        Map<String, String> accountFields = beneficiaryEntity.getAccountFields();
        boolean deprecated = beneficiaryEntity.getDeprecated();
        int transactionsCount = beneficiaryEntity.getTransactionsCount();
        long timestamp = beneficiaryEntity.getTimestamp();
        String label = beneficiaryEntity.getLabel();
        BeneficiaryIdentificationEmbeddedEntity identification = beneficiaryEntity.getIdentification();
        BeneficiaryIdentification domain5 = identification != null ? toDomain(identification) : null;
        Long createdDate = beneficiaryEntity.getCreatedDate();
        return new a(id10, rootId, ownerId, name, firstName, lastName, fullName, companyName, email, phone, externalRef, domain, addressA, currency, bankCountry, bankLogo, domain3, country, externalAccount, domain4, accountFields, domain2, (List) null, deprecated, transactionsCount, timestamp, label, domain5, createdDate != null ? Instant.ofEpochMilli(createdDate.longValue()) : null, beneficiaryEntity.getCounterpartyDetailsGroup(), 272629760);
    }

    @NotNull
    public static final a toDomain(@NotNull BeneficiaryDto beneficiaryDto, int i, long j2, String str) {
        String str2;
        r rVar;
        List domain;
        String str3;
        String str4;
        String str5;
        e eVar;
        r rVar2;
        Intrinsics.checkNotNullParameter(beneficiaryDto, "<this>");
        String id10 = beneficiaryDto.getId();
        if (id10 != null) {
            String rootId = beneficiaryDto.getRootId();
            String ownerId = beneficiaryDto.getOwnerId();
            String name = beneficiaryDto.getName();
            String firstName = beneficiaryDto.getFirstName();
            String lastName = beneficiaryDto.getLastName();
            String companyName = beneficiaryDto.getCompanyName();
            String fullName = beneficiaryDto.getFullName();
            String email = beneficiaryDto.getEmail();
            String phone = beneficiaryDto.getPhone();
            String externalRef = beneficiaryDto.getExternalRef();
            String type = beneficiaryDto.getType();
            if (type != null) {
                r[] rVarArrValues = r.values();
                int length = rVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        str2 = id10;
                        rVar2 = null;
                        break;
                    }
                    rVar2 = rVarArrValues[i2];
                    str2 = id10;
                    if (a0.z(rVar2.name(), type, true)) {
                        break;
                    }
                    i2++;
                    id10 = str2;
                }
                rVar = rVar2;
            } else {
                str2 = id10;
                rVar = null;
            }
            AddressModel address = beneficiaryDto.getAddress();
            Address domain2 = address != null ? LegacyAddressMapperKt.toDomain(address) : null;
            BeneficiaryExtraFieldsDto extraFields = beneficiaryDto.getExtraFields();
            b domain3 = extraFields != null ? toDomain(extraFields) : null;
            List<PaymentsSettingDto> settings = beneficiaryDto.getSettings();
            if (settings == null || (domain = PaymentsSettingMapperKt.toDomain(settings)) == null) {
                domain = f0.f322471a;
            }
            List list = domain;
            String currency = beneficiaryDto.getCurrency();
            String bankCountry = beneficiaryDto.getBankCountry();
            String bankLogo = beneficiaryDto.getBankLogo();
            s sVar = t.Companion;
            String paymentType = beneficiaryDto.getPaymentType();
            sVar.getClass();
            t tVarA = s.a(paymentType);
            AddressModel address2 = beneficiaryDto.getAddress();
            String country = address2 != null ? address2.getCountry() : null;
            Boolean externalAccount = beneficiaryDto.getExternalAccount();
            d dVar = e.Companion;
            String state = beneficiaryDto.getState();
            dVar.getClass();
            if (state != null) {
                e[] eVarArrValues = e.values();
                str3 = country;
                int length2 = eVarArrValues.length;
                int i3 = 0;
                while (i3 < length2) {
                    eVar = eVarArrValues[i3];
                    int i5 = i3;
                    Locale ROOT = Locale.ROOT;
                    int i6 = length2;
                    str4 = rootId;
                    str5 = ownerId;
                    String strR = p.a.r(ROOT, "ROOT", state, ROOT, "toLowerCase(...)");
                    String str6 = state;
                    String strName = eVar.name();
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = strName.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.f(strR, lowerCase)) {
                        break;
                    }
                    i3 = i5 + 1;
                    length2 = i6;
                    rootId = str4;
                    ownerId = str5;
                    state = str6;
                }
            } else {
                str3 = country;
            }
            str4 = rootId;
            str5 = ownerId;
            eVar = null;
            Map<String, String> accountFields = beneficiaryDto.getAccountFields();
            String str7 = str2;
            String str8 = str3;
            boolean deprecated = beneficiaryDto.getDeprecated();
            BeneficiaryIdentificationDto identification = beneficiaryDto.getIdentification();
            BeneficiaryIdentification domain4 = identification != null ? BeneficiaryResponseMapperKt.toDomain(identification) : null;
            String institutionName = beneficiaryDto.getInstitutionName();
            Long createdDate = beneficiaryDto.getCreatedDate();
            return new a(str7, str4, str5, name, firstName, lastName, fullName, companyName, email, phone, externalRef, rVar, domain2, currency, bankCountry, bankLogo, tVarA, str8, externalAccount, eVar, accountFields, domain3, list, deprecated, i, j2, str, domain4, institutionName, createdDate != null ? Instant.ofEpochMilli(createdDate.longValue()) : null, beneficiaryDto.getCounterpartyDetailsGroup());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final BeneficiaryIdentification toDomain(@NotNull BeneficiaryIdentificationDto beneficiaryIdentificationDto) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationDto, "<this>");
        BeneficiaryIdentificationTypeDto type = beneficiaryIdentificationDto.getType();
        if (type == null) {
            return null;
        }
        BeneficiaryIdentificationType domain = BeneficiaryResponseMapperKt.toDomain(type);
        String value = beneficiaryIdentificationDto.getValue();
        if (value == null) {
            value = "";
        }
        return new BeneficiaryIdentification(domain, value);
    }

    @NotNull
    public static final BeneficiaryIdentificationType toDomain(@NotNull BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto) {
        Intrinsics.checkNotNullParameter(beneficiaryIdentificationTypeDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$8[beneficiaryIdentificationTypeDto.ordinal()];
        if (i == 1) {
            return BeneficiaryIdentificationType.BR_CPF;
        }
        if (i == 2) {
            return BeneficiaryIdentificationType.BR_CNPJ;
        }
        throw new NoWhenBranchMatchedException();
    }
}
