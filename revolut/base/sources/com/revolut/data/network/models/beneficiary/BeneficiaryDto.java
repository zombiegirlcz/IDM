package com.revolut.data.network.models.beneficiary;

import com.revolut.data.network.models.address.AddressModel;
import com.revolut.data.network.models.payments.PaymentsSettingDto;
import j6.a;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\bJ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0016\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\u0017\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eHÆ\u0003J\t\u0010f\u001a\u00020\u0016HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\"HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0002\u0010MJ\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jî\u0002\u0010l\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010mJ\u0013\u0010n\u001a\u00020\u00162\b\u0010o\u001a\u0004\u0018\u00010pHÖ\u0003J\t\u0010q\u001a\u00020rHÖ\u0001J\t\u0010s\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u001f\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u001a\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0018\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010*¨\u0006t"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;", "Ljava/io/Serializable;", "id", "", "rootId", "ownerId", "name", "firstName", "lastName", "fullName", "companyName", "email", "phone", "externalRef", "type", "address", "Lcom/revolut/data/network/models/address/AddressModel;", "currency", "bankCountry", "bankLogo", "paymentType", "externalAccount", "", "state", "extraFields", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "settings", "", "Lcom/revolut/data/network/models/payments/PaymentsSettingDto;", "accountFields", "", "deprecated", "label", "identification", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "institutionName", "createdDate", "", "counterpartyDetailsGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/address/AddressModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRootId", "getOwnerId", "getName", "getFirstName", "getLastName", "getFullName", "getCompanyName", "getEmail", "getPhone", "getExternalRef", "getType", "getAddress", "()Lcom/revolut/data/network/models/address/AddressModel;", "getCurrency", "getBankCountry", "getBankLogo", "getPaymentType", "getExternalAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "getExtraFields", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;", "getSettings", "()Ljava/util/List;", "getAccountFields", "()Ljava/util/Map;", "getDeprecated", "()Z", "getLabel", "getIdentification", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "getInstitutionName", "getCreatedDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCounterpartyDetailsGroup", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/address/AddressModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsDto;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryDto;", "equals", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryDto implements Serializable {

    @b("account")
    private final Map<String, String> accountFields;

    @b("address")
    private final AddressModel address;

    @b("bankCountry")
    private final String bankCountry;

    @b("logo")
    private final String bankLogo;

    @b("companyName")
    private final String companyName;

    @b("counterpartyDetailsGroup")
    private final String counterpartyDetailsGroup;

    @b("createdDate")
    private final Long createdDate;

    @b("currency")
    private final String currency;

    @b("deprecated")
    private final boolean deprecated;

    @b("email")
    private final String email;

    @b("externalAccount")
    private final Boolean externalAccount;

    @b("externalRef")
    private final String externalRef;

    @b("extraFields")
    private final BeneficiaryExtraFieldsDto extraFields;

    @b("firstName")
    private final String firstName;

    @b("fullName")
    private final String fullName;

    @b("id")
    private final String id;

    @b("identification")
    private final BeneficiaryIdentificationDto identification;

    @b("institutionName")
    private final String institutionName;

    @b("displayName")
    private final String label;

    @b("lastName")
    private final String lastName;

    @b("name")
    private final String name;

    @b("ownerId")
    private final String ownerId;

    @b("paymentType")
    private final String paymentType;

    @b("phone")
    private final String phone;

    @b("rootBeneficiaryId")
    private final String rootId;

    @b("settings")
    private final List<PaymentsSettingDto> settings;

    @b("state")
    private final String state;

    @b("type")
    private final String type;

    public BeneficiaryDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 268435455, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryDto copy$default(BeneficiaryDto beneficiaryDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AddressModel addressModel, String str13, String str14, String str15, String str16, Boolean bool, String str17, BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto, List list, Map map, boolean z, String str18, BeneficiaryIdentificationDto beneficiaryIdentificationDto, String str19, Long l2, String str20, int i, Object obj2) {
        String str21;
        Long l3;
        String str22 = (i & 1) != 0 ? beneficiaryDto.id : str;
        String str23 = (i & 2) != 0 ? beneficiaryDto.rootId : str2;
        String str24 = (i & 4) != 0 ? beneficiaryDto.ownerId : str3;
        String str25 = (i & 8) != 0 ? beneficiaryDto.name : str4;
        String str26 = (i & 16) != 0 ? beneficiaryDto.firstName : str5;
        String str27 = (i & 32) != 0 ? beneficiaryDto.lastName : str6;
        String str28 = (i & 64) != 0 ? beneficiaryDto.fullName : str7;
        String str29 = (i & 128) != 0 ? beneficiaryDto.companyName : str8;
        String str30 = (i & 256) != 0 ? beneficiaryDto.email : str9;
        String str31 = (i & 512) != 0 ? beneficiaryDto.phone : str10;
        String str32 = (i & 1024) != 0 ? beneficiaryDto.externalRef : str11;
        String str33 = (i & 2048) != 0 ? beneficiaryDto.type : str12;
        AddressModel addressModel2 = (i & 4096) != 0 ? beneficiaryDto.address : addressModel;
        String str34 = (i & 8192) != 0 ? beneficiaryDto.currency : str13;
        String str35 = str22;
        String str36 = (i & 16384) != 0 ? beneficiaryDto.bankCountry : str14;
        String str37 = (i & 32768) != 0 ? beneficiaryDto.bankLogo : str15;
        String str38 = (i & 65536) != 0 ? beneficiaryDto.paymentType : str16;
        Boolean bool2 = (i & 131072) != 0 ? beneficiaryDto.externalAccount : bool;
        String str39 = (i & 262144) != 0 ? beneficiaryDto.state : str17;
        BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto2 = (i & 524288) != 0 ? beneficiaryDto.extraFields : beneficiaryExtraFieldsDto;
        List list2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? beneficiaryDto.settings : list;
        Map map2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? beneficiaryDto.accountFields : map;
        boolean z3 = (i & 4194304) != 0 ? beneficiaryDto.deprecated : z;
        String str40 = (i & 8388608) != 0 ? beneficiaryDto.label : str18;
        BeneficiaryIdentificationDto beneficiaryIdentificationDto2 = (i & 16777216) != 0 ? beneficiaryDto.identification : beneficiaryIdentificationDto;
        String str41 = (i & 33554432) != 0 ? beneficiaryDto.institutionName : str19;
        Long l4 = (i & 67108864) != 0 ? beneficiaryDto.createdDate : l2;
        if ((i & 134217728) != 0) {
            l3 = l4;
            str21 = beneficiaryDto.counterpartyDetailsGroup;
        } else {
            str21 = str20;
            l3 = l4;
        }
        return beneficiaryDto.copy(str35, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, addressModel2, str34, str36, str37, str38, bool2, str39, beneficiaryExtraFieldsDto2, list2, map2, z3, str40, beneficiaryIdentificationDto2, str41, l3, str21);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExternalRef() {
        return this.externalRef;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final AddressModel getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getExternalAccount() {
        return this.externalAccount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRootId() {
        return this.rootId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BeneficiaryExtraFieldsDto getExtraFields() {
        return this.extraFields;
    }

    public final List<PaymentsSettingDto> component21() {
        return this.settings;
    }

    public final Map<String, String> component22() {
        return this.accountFields;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getDeprecated() {
        return this.deprecated;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BeneficiaryIdentificationDto getIdentification() {
        return this.identification;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getCounterpartyDetailsGroup() {
        return this.counterpartyDetailsGroup;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final BeneficiaryDto copy(String id10, String rootId, String ownerId, String name, String firstName, String lastName, String fullName, String companyName, String email, String phone, String externalRef, String type, AddressModel address, String currency, String bankCountry, String bankLogo, String paymentType, Boolean externalAccount, String state, BeneficiaryExtraFieldsDto extraFields, List<PaymentsSettingDto> settings, Map<String, String> accountFields, boolean deprecated, String label, BeneficiaryIdentificationDto identification, String institutionName, Long createdDate, String counterpartyDetailsGroup) {
        return new BeneficiaryDto(id10, rootId, ownerId, name, firstName, lastName, fullName, companyName, email, phone, externalRef, type, address, currency, bankCountry, bankLogo, paymentType, externalAccount, state, extraFields, settings, accountFields, deprecated, label, identification, institutionName, createdDate, counterpartyDetailsGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryDto)) {
            return false;
        }
        BeneficiaryDto beneficiaryDto = (BeneficiaryDto) other;
        return Intrinsics.f(this.id, beneficiaryDto.id) && Intrinsics.f(this.rootId, beneficiaryDto.rootId) && Intrinsics.f(this.ownerId, beneficiaryDto.ownerId) && Intrinsics.f(this.name, beneficiaryDto.name) && Intrinsics.f(this.firstName, beneficiaryDto.firstName) && Intrinsics.f(this.lastName, beneficiaryDto.lastName) && Intrinsics.f(this.fullName, beneficiaryDto.fullName) && Intrinsics.f(this.companyName, beneficiaryDto.companyName) && Intrinsics.f(this.email, beneficiaryDto.email) && Intrinsics.f(this.phone, beneficiaryDto.phone) && Intrinsics.f(this.externalRef, beneficiaryDto.externalRef) && Intrinsics.f(this.type, beneficiaryDto.type) && Intrinsics.f(this.address, beneficiaryDto.address) && Intrinsics.f(this.currency, beneficiaryDto.currency) && Intrinsics.f(this.bankCountry, beneficiaryDto.bankCountry) && Intrinsics.f(this.bankLogo, beneficiaryDto.bankLogo) && Intrinsics.f(this.paymentType, beneficiaryDto.paymentType) && Intrinsics.f(this.externalAccount, beneficiaryDto.externalAccount) && Intrinsics.f(this.state, beneficiaryDto.state) && Intrinsics.f(this.extraFields, beneficiaryDto.extraFields) && Intrinsics.f(this.settings, beneficiaryDto.settings) && Intrinsics.f(this.accountFields, beneficiaryDto.accountFields) && this.deprecated == beneficiaryDto.deprecated && Intrinsics.f(this.label, beneficiaryDto.label) && Intrinsics.f(this.identification, beneficiaryDto.identification) && Intrinsics.f(this.institutionName, beneficiaryDto.institutionName) && Intrinsics.f(this.createdDate, beneficiaryDto.createdDate) && Intrinsics.f(this.counterpartyDetailsGroup, beneficiaryDto.counterpartyDetailsGroup);
    }

    public final Map<String, String> getAccountFields() {
        return this.accountFields;
    }

    public final AddressModel getAddress() {
        return this.address;
    }

    public final String getBankCountry() {
        return this.bankCountry;
    }

    public final String getBankLogo() {
        return this.bankLogo;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getCounterpartyDetailsGroup() {
        return this.counterpartyDetailsGroup;
    }

    public final Long getCreatedDate() {
        return this.createdDate;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getDeprecated() {
        return this.deprecated;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getExternalAccount() {
        return this.externalAccount;
    }

    public final String getExternalRef() {
        return this.externalRef;
    }

    public final BeneficiaryExtraFieldsDto getExtraFields() {
        return this.extraFields;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getId() {
        return this.id;
    }

    public final BeneficiaryIdentificationDto getIdentification() {
        return this.identification;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getRootId() {
        return this.rootId;
    }

    public final List<PaymentsSettingDto> getSettings() {
        return this.settings;
    }

    public final String getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rootId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fullName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.companyName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.email;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phone;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.externalRef;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.type;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        AddressModel addressModel = this.address;
        int iHashCode13 = (iHashCode12 + (addressModel == null ? 0 : addressModel.hashCode())) * 31;
        String str13 = this.currency;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.bankCountry;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.bankLogo;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.paymentType;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.externalAccount;
        int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str17 = this.state;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto = this.extraFields;
        int iHashCode20 = (iHashCode19 + (beneficiaryExtraFieldsDto == null ? 0 : beneficiaryExtraFieldsDto.hashCode())) * 31;
        List<PaymentsSettingDto> list = this.settings;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.accountFields;
        int iC = a.c((iHashCode21 + (map == null ? 0 : map.hashCode())) * 31, 31, this.deprecated);
        String str18 = this.label;
        int iHashCode22 = (iC + (str18 == null ? 0 : str18.hashCode())) * 31;
        BeneficiaryIdentificationDto beneficiaryIdentificationDto = this.identification;
        int iHashCode23 = (iHashCode22 + (beneficiaryIdentificationDto == null ? 0 : beneficiaryIdentificationDto.hashCode())) * 31;
        String str19 = this.institutionName;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Long l2 = this.createdDate;
        int iHashCode25 = (iHashCode24 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str20 = this.counterpartyDetailsGroup;
        return iHashCode25 + (str20 != null ? str20.hashCode() : 0);
    }

    public BeneficiaryDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AddressModel addressModel, String str13, String str14, String str15, String str16, Boolean bool, String str17, BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto, List<PaymentsSettingDto> list, Map<String, String> map, boolean z, String str18, BeneficiaryIdentificationDto beneficiaryIdentificationDto, String str19, Long l2, String str20) {
        this.id = str;
        this.rootId = str2;
        this.ownerId = str3;
        this.name = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.fullName = str7;
        this.companyName = str8;
        this.email = str9;
        this.phone = str10;
        this.externalRef = str11;
        this.type = str12;
        this.address = addressModel;
        this.currency = str13;
        this.bankCountry = str14;
        this.bankLogo = str15;
        this.paymentType = str16;
        this.externalAccount = bool;
        this.state = str17;
        this.extraFields = beneficiaryExtraFieldsDto;
        this.settings = list;
        this.accountFields = map;
        this.deprecated = z;
        this.label = str18;
        this.identification = beneficiaryIdentificationDto;
        this.institutionName = str19;
        this.createdDate = l2;
        this.counterpartyDetailsGroup = str20;
    }

    public /* synthetic */ BeneficiaryDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AddressModel addressModel, String str13, String str14, String str15, String str16, Boolean bool, String str17, BeneficiaryExtraFieldsDto beneficiaryExtraFieldsDto, List list, Map map, boolean z, String str18, BeneficiaryIdentificationDto beneficiaryIdentificationDto, String str19, Long l2, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : addressModel, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : bool, (i & 262144) != 0 ? null : str17, (i & 524288) != 0 ? null : beneficiaryExtraFieldsDto, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : list, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : map, (i & 4194304) != 0 ? false : z, (i & 8388608) != 0 ? null : str18, (i & 16777216) != 0 ? null : beneficiaryIdentificationDto, (i & 33554432) != 0 ? null : str19, (i & 67108864) != 0 ? null : l2, (i & 134217728) != 0 ? null : str20);
    }
}
