package com.revolut.data.network.models.beneficiary;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b'\b\u0080\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010%J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010%J\u0012\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b:\u0010;J\u001e\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010%J\u0012\u0010A\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010%J¬\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010G\u001a\u00020FHÖ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u00162\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bL\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bO\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\bP\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010M\u001a\u0004\bQ\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bR\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bS\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\bT\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bU\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bV\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bW\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b[\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\b\\\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\b]\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u00106R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\b`\u0010%R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010a\u001a\u0004\bb\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bd\u0010;R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\bf\u0010=R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010g\u001a\u0004\bh\u0010?R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010M\u001a\u0004\bi\u0010%R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010j\u001a\u0004\bk\u0010BR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010M\u001a\u0004\bl\u0010%¨\u0006m"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BeneficiaryEmbeddedDto;", "", "", "id", "rootId", "ownerId", "name", "firstName", "lastName", "companyName", "email", "phone", "externalRef", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;", "type", "Lno3/b;", "address", "currency", "bankCountry", "Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;", "paymentType", "country", "", "externalAccount", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;", "state", "", "accountFields", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;", "extraFields", "bankLogo", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "identification", "counterpartyDetailsGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;Lno3/b;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;Ljava/util/Map;Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;", "component12", "()Lno3/b;", "component13", "component14", "component15", "()Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;", "component16", "component17", "()Ljava/lang/Boolean;", "component18", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;", "component19", "()Ljava/util/Map;", "component20", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;", "component21", "component22", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;Lno3/b;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;Ljava/util/Map;Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;Ljava/lang/String;Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;Ljava/lang/String;)Lcom/revolut/data/network/models/beneficiary/BeneficiaryEmbeddedDto;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "getRootId", "getOwnerId", "getName", "getFirstName", "getLastName", "getCompanyName", "getEmail", "getPhone", "getExternalRef", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryTypeDto;", "getType", "Lno3/b;", "getAddress", "getCurrency", "getBankCountry", "Lcom/revolut/data/network/models/beneficiary/PaymentTypeDto;", "getPaymentType", "getCountry", "Ljava/lang/Boolean;", "getExternalAccount", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryStateDto;", "getState", "Ljava/util/Map;", "getAccountFields", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryExtraFieldsEmbeddedDto;", "getExtraFields", "getBankLogo", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationDto;", "getIdentification", "getCounterpartyDetailsGroup", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryEmbeddedDto {

    @b("account")
    private final Map<String, String> accountFields;

    @b("address")
    private final no3.b address;

    @b("bankCountry")
    private final String bankCountry;

    @b("logo")
    private final String bankLogo;

    @b("companyName")
    private final String companyName;

    @b("counterpartyDetailsGroup")
    private final String counterpartyDetailsGroup;

    @b("country")
    @NotNull
    private final String country;

    @b("currency")
    private final String currency;

    @b("email")
    private final String email;

    @b("externalAccount")
    private final Boolean externalAccount;

    @b("externalRef")
    private final String externalRef;

    @b("extraFields")
    private final BeneficiaryExtraFieldsEmbeddedDto extraFields;

    @b("firstName")
    private final String firstName;

    @b("id")
    @NotNull
    private final String id;

    @b("identification")
    private final BeneficiaryIdentificationDto identification;

    @b("lastName")
    private final String lastName;

    @b("name")
    private final String name;

    @b("ownerId")
    private final String ownerId;

    @b("paymentType")
    private final PaymentTypeDto paymentType;

    @b("phone")
    private final String phone;

    @b("rootId")
    private final String rootId;

    @b("state")
    private final BeneficiaryStateDto state;

    @b("beneficiaryType")
    private final BeneficiaryTypeDto type;

    public BeneficiaryEmbeddedDto(@NotNull String id10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, BeneficiaryTypeDto beneficiaryTypeDto, no3.b bVar, String str10, String str11, PaymentTypeDto paymentTypeDto, @NotNull String country, Boolean bool, BeneficiaryStateDto beneficiaryStateDto, Map<String, String> map, BeneficiaryExtraFieldsEmbeddedDto beneficiaryExtraFieldsEmbeddedDto, String str12, BeneficiaryIdentificationDto beneficiaryIdentificationDto, String str13) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        this.id = id10;
        this.rootId = str;
        this.ownerId = str2;
        this.name = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.companyName = str6;
        this.email = str7;
        this.phone = str8;
        this.externalRef = str9;
        this.type = beneficiaryTypeDto;
        this.address = bVar;
        this.currency = str10;
        this.bankCountry = str11;
        this.paymentType = paymentTypeDto;
        this.country = country;
        this.externalAccount = bool;
        this.state = beneficiaryStateDto;
        this.accountFields = map;
        this.extraFields = beneficiaryExtraFieldsEmbeddedDto;
        this.bankLogo = str12;
        this.identification = beneficiaryIdentificationDto;
        this.counterpartyDetailsGroup = str13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryEmbeddedDto copy$default(BeneficiaryEmbeddedDto beneficiaryEmbeddedDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BeneficiaryTypeDto beneficiaryTypeDto, no3.b bVar, String str11, String str12, PaymentTypeDto paymentTypeDto, String str13, Boolean bool, BeneficiaryStateDto beneficiaryStateDto, Map map, BeneficiaryExtraFieldsEmbeddedDto beneficiaryExtraFieldsEmbeddedDto, String str14, BeneficiaryIdentificationDto beneficiaryIdentificationDto, String str15, int i, Object obj2) {
        String str16;
        BeneficiaryIdentificationDto beneficiaryIdentificationDto2;
        String str17 = (i & 1) != 0 ? beneficiaryEmbeddedDto.id : str;
        String str18 = (i & 2) != 0 ? beneficiaryEmbeddedDto.rootId : str2;
        String str19 = (i & 4) != 0 ? beneficiaryEmbeddedDto.ownerId : str3;
        String str20 = (i & 8) != 0 ? beneficiaryEmbeddedDto.name : str4;
        String str21 = (i & 16) != 0 ? beneficiaryEmbeddedDto.firstName : str5;
        String str22 = (i & 32) != 0 ? beneficiaryEmbeddedDto.lastName : str6;
        String str23 = (i & 64) != 0 ? beneficiaryEmbeddedDto.companyName : str7;
        String str24 = (i & 128) != 0 ? beneficiaryEmbeddedDto.email : str8;
        String str25 = (i & 256) != 0 ? beneficiaryEmbeddedDto.phone : str9;
        String str26 = (i & 512) != 0 ? beneficiaryEmbeddedDto.externalRef : str10;
        BeneficiaryTypeDto beneficiaryTypeDto2 = (i & 1024) != 0 ? beneficiaryEmbeddedDto.type : beneficiaryTypeDto;
        no3.b bVar2 = (i & 2048) != 0 ? beneficiaryEmbeddedDto.address : bVar;
        String str27 = (i & 4096) != 0 ? beneficiaryEmbeddedDto.currency : str11;
        String str28 = (i & 8192) != 0 ? beneficiaryEmbeddedDto.bankCountry : str12;
        String str29 = str17;
        PaymentTypeDto paymentTypeDto2 = (i & 16384) != 0 ? beneficiaryEmbeddedDto.paymentType : paymentTypeDto;
        String str30 = (i & 32768) != 0 ? beneficiaryEmbeddedDto.country : str13;
        Boolean bool2 = (i & 65536) != 0 ? beneficiaryEmbeddedDto.externalAccount : bool;
        BeneficiaryStateDto beneficiaryStateDto2 = (i & 131072) != 0 ? beneficiaryEmbeddedDto.state : beneficiaryStateDto;
        Map map2 = (i & 262144) != 0 ? beneficiaryEmbeddedDto.accountFields : map;
        BeneficiaryExtraFieldsEmbeddedDto beneficiaryExtraFieldsEmbeddedDto2 = (i & 524288) != 0 ? beneficiaryEmbeddedDto.extraFields : beneficiaryExtraFieldsEmbeddedDto;
        String str31 = (i & PKIFailureInfo.badCertTemplate) != 0 ? beneficiaryEmbeddedDto.bankLogo : str14;
        BeneficiaryIdentificationDto beneficiaryIdentificationDto3 = (i & PKIFailureInfo.badSenderNonce) != 0 ? beneficiaryEmbeddedDto.identification : beneficiaryIdentificationDto;
        if ((i & 4194304) != 0) {
            beneficiaryIdentificationDto2 = beneficiaryIdentificationDto3;
            str16 = beneficiaryEmbeddedDto.counterpartyDetailsGroup;
        } else {
            str16 = str15;
            beneficiaryIdentificationDto2 = beneficiaryIdentificationDto3;
        }
        return beneficiaryEmbeddedDto.copy(str29, str18, str19, str20, str21, str22, str23, str24, str25, str26, beneficiaryTypeDto2, bVar2, str27, str28, paymentTypeDto2, str30, bool2, beneficiaryStateDto2, map2, beneficiaryExtraFieldsEmbeddedDto2, str31, beneficiaryIdentificationDto2, str16);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExternalRef() {
        return this.externalRef;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BeneficiaryTypeDto getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final no3.b getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final PaymentTypeDto getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getExternalAccount() {
        return this.externalAccount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BeneficiaryStateDto getState() {
        return this.state;
    }

    public final Map<String, String> component19() {
        return this.accountFields;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRootId() {
        return this.rootId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BeneficiaryExtraFieldsEmbeddedDto getExtraFields() {
        return this.extraFields;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BeneficiaryIdentificationDto getIdentification() {
        return this.identification;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
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
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final BeneficiaryEmbeddedDto copy(@NotNull String id10, String rootId, String ownerId, String name, String firstName, String lastName, String companyName, String email, String phone, String externalRef, BeneficiaryTypeDto type, no3.b address, String currency, String bankCountry, PaymentTypeDto paymentType, @NotNull String country, Boolean externalAccount, BeneficiaryStateDto state, Map<String, String> accountFields, BeneficiaryExtraFieldsEmbeddedDto extraFields, String bankLogo, BeneficiaryIdentificationDto identification, String counterpartyDetailsGroup) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        return new BeneficiaryEmbeddedDto(id10, rootId, ownerId, name, firstName, lastName, companyName, email, phone, externalRef, type, address, currency, bankCountry, paymentType, country, externalAccount, state, accountFields, extraFields, bankLogo, identification, counterpartyDetailsGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryEmbeddedDto)) {
            return false;
        }
        BeneficiaryEmbeddedDto beneficiaryEmbeddedDto = (BeneficiaryEmbeddedDto) other;
        return Intrinsics.f(this.id, beneficiaryEmbeddedDto.id) && Intrinsics.f(this.rootId, beneficiaryEmbeddedDto.rootId) && Intrinsics.f(this.ownerId, beneficiaryEmbeddedDto.ownerId) && Intrinsics.f(this.name, beneficiaryEmbeddedDto.name) && Intrinsics.f(this.firstName, beneficiaryEmbeddedDto.firstName) && Intrinsics.f(this.lastName, beneficiaryEmbeddedDto.lastName) && Intrinsics.f(this.companyName, beneficiaryEmbeddedDto.companyName) && Intrinsics.f(this.email, beneficiaryEmbeddedDto.email) && Intrinsics.f(this.phone, beneficiaryEmbeddedDto.phone) && Intrinsics.f(this.externalRef, beneficiaryEmbeddedDto.externalRef) && this.type == beneficiaryEmbeddedDto.type && Intrinsics.f(this.address, beneficiaryEmbeddedDto.address) && Intrinsics.f(this.currency, beneficiaryEmbeddedDto.currency) && Intrinsics.f(this.bankCountry, beneficiaryEmbeddedDto.bankCountry) && this.paymentType == beneficiaryEmbeddedDto.paymentType && Intrinsics.f(this.country, beneficiaryEmbeddedDto.country) && Intrinsics.f(this.externalAccount, beneficiaryEmbeddedDto.externalAccount) && this.state == beneficiaryEmbeddedDto.state && Intrinsics.f(this.accountFields, beneficiaryEmbeddedDto.accountFields) && Intrinsics.f(this.extraFields, beneficiaryEmbeddedDto.extraFields) && Intrinsics.f(this.bankLogo, beneficiaryEmbeddedDto.bankLogo) && Intrinsics.f(this.identification, beneficiaryEmbeddedDto.identification) && Intrinsics.f(this.counterpartyDetailsGroup, beneficiaryEmbeddedDto.counterpartyDetailsGroup);
    }

    public final Map<String, String> getAccountFields() {
        return this.accountFields;
    }

    public final no3.b getAddress() {
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

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
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

    public final BeneficiaryExtraFieldsEmbeddedDto getExtraFields() {
        return this.extraFields;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final BeneficiaryIdentificationDto getIdentification() {
        return this.identification;
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

    public final PaymentTypeDto getPaymentType() {
        return this.paymentType;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getRootId() {
        return this.rootId;
    }

    public final BeneficiaryStateDto getState() {
        return this.state;
    }

    public final BeneficiaryTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.rootId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ownerId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.companyName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.phone;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.externalRef;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BeneficiaryTypeDto beneficiaryTypeDto = this.type;
        int iHashCode11 = (iHashCode10 + (beneficiaryTypeDto == null ? 0 : beneficiaryTypeDto.hashCode())) * 31;
        no3.b bVar = this.address;
        int iHashCode12 = (iHashCode11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str10 = this.currency;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.bankCountry;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        PaymentTypeDto paymentTypeDto = this.paymentType;
        int iC = a.c((iHashCode14 + (paymentTypeDto == null ? 0 : paymentTypeDto.hashCode())) * 31, 31, this.country);
        Boolean bool = this.externalAccount;
        int iHashCode15 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        BeneficiaryStateDto beneficiaryStateDto = this.state;
        int iHashCode16 = (iHashCode15 + (beneficiaryStateDto == null ? 0 : beneficiaryStateDto.hashCode())) * 31;
        Map<String, String> map = this.accountFields;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        BeneficiaryExtraFieldsEmbeddedDto beneficiaryExtraFieldsEmbeddedDto = this.extraFields;
        int iHashCode18 = (iHashCode17 + (beneficiaryExtraFieldsEmbeddedDto == null ? 0 : beneficiaryExtraFieldsEmbeddedDto.hashCode())) * 31;
        String str12 = this.bankLogo;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BeneficiaryIdentificationDto beneficiaryIdentificationDto = this.identification;
        int iHashCode20 = (iHashCode19 + (beneficiaryIdentificationDto == null ? 0 : beneficiaryIdentificationDto.hashCode())) * 31;
        String str13 = this.counterpartyDetailsGroup;
        return iHashCode20 + (str13 != null ? str13.hashCode() : 0);
    }

    public /* synthetic */ BeneficiaryEmbeddedDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BeneficiaryTypeDto beneficiaryTypeDto, no3.b bVar, String str11, String str12, PaymentTypeDto paymentTypeDto, String str13, Boolean bool, BeneficiaryStateDto beneficiaryStateDto, Map map, BeneficiaryExtraFieldsEmbeddedDto beneficiaryExtraFieldsEmbeddedDto, String str14, BeneficiaryIdentificationDto beneficiaryIdentificationDto, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : beneficiaryTypeDto, (i & 2048) != 0 ? null : bVar, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : paymentTypeDto, str13, (65536 & i) != 0 ? null : bool, (131072 & i) != 0 ? null : beneficiaryStateDto, (262144 & i) != 0 ? null : map, (524288 & i) != 0 ? null : beneficiaryExtraFieldsEmbeddedDto, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : beneficiaryIdentificationDto, (i & 4194304) != 0 ? null : str15);
    }
}
