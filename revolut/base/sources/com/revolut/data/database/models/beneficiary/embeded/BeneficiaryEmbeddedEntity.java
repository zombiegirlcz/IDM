package com.revolut.data.database.models.beneficiary.embeded;

import com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import p.a;
import so3.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b+\b\u0080\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010*J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010*J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010*J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010*J\u0012\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010*J\u0012\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010*J\u0012\u0010B\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u001e\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\"0!HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u0010*JÖ\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u00182\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010V\u001a\u0004\bX\u0010*R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bY\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bZ\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\b[\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\b\\\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\b]\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\b^\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\b_\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\b`\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\ba\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010b\u001a\u0004\bc\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010d\u001a\u0004\be\u00108R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010V\u001a\u0004\bf\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bg\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bh\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010i\u001a\u0004\bj\u0010=R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bk\u0010*R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010l\u001a\u0004\bm\u0010@R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\bn\u0010*R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010o\u001a\u0004\bp\u0010CR(\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010q\u001a\u0004\br\u0010ER\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010s\u001a\u0004\bt\u0010GR \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010u\u001a\u0004\bv\u0010IR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010w\u001a\u0004\bx\u0010KR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010V\u001a\u0004\by\u0010*¨\u0006z"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "", "", "id", "rootId", "ownerId", "name", "firstName", "lastName", "companyName", "fullName", "email", "phone", "externalRef", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "type", "Lso3/c;", "address", "currency", "bankCountry", "bankLogo", "Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "paymentType", "country", "", "externalAccount", "label", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "state", "", "accountFields", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "extraFields", "", "Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;", "settings", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "identification", "counterpartyDetailsGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;Lso3/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;Ljava/util/Map;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;Ljava/util/List;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "component13", "()Lso3/c;", "component14", "component15", "component16", "component17", "()Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "component18", "component19", "()Ljava/lang/Boolean;", "component20", "component21", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "component22", "()Ljava/util/Map;", "component23", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "component24", "()Ljava/util/List;", "component25", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;Lso3/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;Ljava/util/Map;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;Ljava/util/List;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;Ljava/lang/String;)Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryEmbeddedEntity;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "getRootId", "getOwnerId", "getName", "getFirstName", "getLastName", "getCompanyName", "getFullName", "getEmail", "getPhone", "getExternalRef", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "getType", "Lso3/c;", "getAddress", "getCurrency", "getBankCountry", "getBankLogo", "Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "getPaymentType", "getCountry", "Ljava/lang/Boolean;", "getExternalAccount", "getLabel", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "getState", "Ljava/util/Map;", "getAccountFields", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "getExtraFields", "Ljava/util/List;", "getSettings", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "getIdentification", "getCounterpartyDetailsGroup", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryEmbeddedEntity {

    @b("accountFields")
    private final Map<String, String> accountFields;

    @b("address")
    private final c address;

    @b("bankCountry")
    private final String bankCountry;

    @b("bankLogo")
    private final String bankLogo;

    @b("companyName")
    private final String companyName;

    @b("counterpartyDetailsGroup")
    private final String counterpartyDetailsGroup;

    @b("country")
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
    private final BeneficiaryExtraFieldsEmbeddedEntity extraFields;

    @b("firstName")
    private final String firstName;

    @b("fullName")
    private final String fullName;

    @b("id")
    @NotNull
    private final String id;

    @b("identification")
    private final BeneficiaryIdentificationEmbeddedEntity identification;

    @b("label")
    private final String label;

    @b("lastName")
    private final String lastName;

    @b("name")
    private final String name;

    @b("ownerId")
    private final String ownerId;

    @b("paymentType")
    private final PaymentTypeEmbeddedEntity paymentType;

    @b("phone")
    private final String phone;

    @b("rootId")
    private final String rootId;

    @b("settings")
    @NotNull
    private final List<PaymentsSettingEmbeddedEntity> settings;

    @b("state")
    private final BeneficiaryStateEmbeddedEntity state;

    @b("type")
    private final BeneficiaryTypeEmbeddedEntity type;

    public BeneficiaryEmbeddedEntity(@NotNull String id10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity, c cVar, String str11, String str12, String str13, PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity, String str14, Boolean bool, String str15, BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity, Map<String, String> map, BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, @NotNull List<PaymentsSettingEmbeddedEntity> settings, BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity, String str16) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.id = id10;
        this.rootId = str;
        this.ownerId = str2;
        this.name = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.companyName = str6;
        this.fullName = str7;
        this.email = str8;
        this.phone = str9;
        this.externalRef = str10;
        this.type = beneficiaryTypeEmbeddedEntity;
        this.address = cVar;
        this.currency = str11;
        this.bankCountry = str12;
        this.bankLogo = str13;
        this.paymentType = paymentTypeEmbeddedEntity;
        this.country = str14;
        this.externalAccount = bool;
        this.label = str15;
        this.state = beneficiaryStateEmbeddedEntity;
        this.accountFields = map;
        this.extraFields = beneficiaryExtraFieldsEmbeddedEntity;
        this.settings = settings;
        this.identification = beneficiaryIdentificationEmbeddedEntity;
        this.counterpartyDetailsGroup = str16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryEmbeddedEntity copy$default(BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity, c cVar, String str12, String str13, String str14, PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity, String str15, Boolean bool, String str16, BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity, Map map, BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, List list, BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity, String str17, int i, Object obj2) {
        String str18;
        BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity2;
        String str19 = (i & 1) != 0 ? beneficiaryEmbeddedEntity.id : str;
        String str20 = (i & 2) != 0 ? beneficiaryEmbeddedEntity.rootId : str2;
        String str21 = (i & 4) != 0 ? beneficiaryEmbeddedEntity.ownerId : str3;
        String str22 = (i & 8) != 0 ? beneficiaryEmbeddedEntity.name : str4;
        String str23 = (i & 16) != 0 ? beneficiaryEmbeddedEntity.firstName : str5;
        String str24 = (i & 32) != 0 ? beneficiaryEmbeddedEntity.lastName : str6;
        String str25 = (i & 64) != 0 ? beneficiaryEmbeddedEntity.companyName : str7;
        String str26 = (i & 128) != 0 ? beneficiaryEmbeddedEntity.fullName : str8;
        String str27 = (i & 256) != 0 ? beneficiaryEmbeddedEntity.email : str9;
        String str28 = (i & 512) != 0 ? beneficiaryEmbeddedEntity.phone : str10;
        String str29 = (i & 1024) != 0 ? beneficiaryEmbeddedEntity.externalRef : str11;
        BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity2 = (i & 2048) != 0 ? beneficiaryEmbeddedEntity.type : beneficiaryTypeEmbeddedEntity;
        c cVar2 = (i & 4096) != 0 ? beneficiaryEmbeddedEntity.address : cVar;
        String str30 = (i & 8192) != 0 ? beneficiaryEmbeddedEntity.currency : str12;
        String str31 = str19;
        String str32 = (i & 16384) != 0 ? beneficiaryEmbeddedEntity.bankCountry : str13;
        String str33 = (i & 32768) != 0 ? beneficiaryEmbeddedEntity.bankLogo : str14;
        PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity2 = (i & 65536) != 0 ? beneficiaryEmbeddedEntity.paymentType : paymentTypeEmbeddedEntity;
        String str34 = (i & 131072) != 0 ? beneficiaryEmbeddedEntity.country : str15;
        Boolean bool2 = (i & 262144) != 0 ? beneficiaryEmbeddedEntity.externalAccount : bool;
        String str35 = (i & 524288) != 0 ? beneficiaryEmbeddedEntity.label : str16;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? beneficiaryEmbeddedEntity.state : beneficiaryStateEmbeddedEntity;
        Map map2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? beneficiaryEmbeddedEntity.accountFields : map;
        BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity2 = (i & 4194304) != 0 ? beneficiaryEmbeddedEntity.extraFields : beneficiaryExtraFieldsEmbeddedEntity;
        List list2 = (i & 8388608) != 0 ? beneficiaryEmbeddedEntity.settings : list;
        BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity3 = (i & 16777216) != 0 ? beneficiaryEmbeddedEntity.identification : beneficiaryIdentificationEmbeddedEntity;
        if ((i & 33554432) != 0) {
            beneficiaryIdentificationEmbeddedEntity2 = beneficiaryIdentificationEmbeddedEntity3;
            str18 = beneficiaryEmbeddedEntity.counterpartyDetailsGroup;
        } else {
            str18 = str17;
            beneficiaryIdentificationEmbeddedEntity2 = beneficiaryIdentificationEmbeddedEntity3;
        }
        return beneficiaryEmbeddedEntity.copy(str31, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, beneficiaryTypeEmbeddedEntity2, cVar2, str30, str32, str33, paymentTypeEmbeddedEntity2, str34, bool2, str35, beneficiaryStateEmbeddedEntity2, map2, beneficiaryExtraFieldsEmbeddedEntity2, list2, beneficiaryIdentificationEmbeddedEntity2, str18);
    }

    @NotNull
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
    public final BeneficiaryTypeEmbeddedEntity getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final c getAddress() {
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
    public final PaymentTypeEmbeddedEntity getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getExternalAccount() {
        return this.externalAccount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRootId() {
        return this.rootId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BeneficiaryStateEmbeddedEntity getState() {
        return this.state;
    }

    public final Map<String, String> component22() {
        return this.accountFields;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final BeneficiaryExtraFieldsEmbeddedEntity getExtraFields() {
        return this.extraFields;
    }

    @NotNull
    public final List<PaymentsSettingEmbeddedEntity> component24() {
        return this.settings;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final BeneficiaryIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
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
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final BeneficiaryEmbeddedEntity copy(@NotNull String id10, String rootId, String ownerId, String name, String firstName, String lastName, String companyName, String fullName, String email, String phone, String externalRef, BeneficiaryTypeEmbeddedEntity type, c address, String currency, String bankCountry, String bankLogo, PaymentTypeEmbeddedEntity paymentType, String country, Boolean externalAccount, String label, BeneficiaryStateEmbeddedEntity state, Map<String, String> accountFields, BeneficiaryExtraFieldsEmbeddedEntity extraFields, @NotNull List<PaymentsSettingEmbeddedEntity> settings, BeneficiaryIdentificationEmbeddedEntity identification, String counterpartyDetailsGroup) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new BeneficiaryEmbeddedEntity(id10, rootId, ownerId, name, firstName, lastName, companyName, fullName, email, phone, externalRef, type, address, currency, bankCountry, bankLogo, paymentType, country, externalAccount, label, state, accountFields, extraFields, settings, identification, counterpartyDetailsGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryEmbeddedEntity)) {
            return false;
        }
        BeneficiaryEmbeddedEntity beneficiaryEmbeddedEntity = (BeneficiaryEmbeddedEntity) other;
        return Intrinsics.f(this.id, beneficiaryEmbeddedEntity.id) && Intrinsics.f(this.rootId, beneficiaryEmbeddedEntity.rootId) && Intrinsics.f(this.ownerId, beneficiaryEmbeddedEntity.ownerId) && Intrinsics.f(this.name, beneficiaryEmbeddedEntity.name) && Intrinsics.f(this.firstName, beneficiaryEmbeddedEntity.firstName) && Intrinsics.f(this.lastName, beneficiaryEmbeddedEntity.lastName) && Intrinsics.f(this.companyName, beneficiaryEmbeddedEntity.companyName) && Intrinsics.f(this.fullName, beneficiaryEmbeddedEntity.fullName) && Intrinsics.f(this.email, beneficiaryEmbeddedEntity.email) && Intrinsics.f(this.phone, beneficiaryEmbeddedEntity.phone) && Intrinsics.f(this.externalRef, beneficiaryEmbeddedEntity.externalRef) && this.type == beneficiaryEmbeddedEntity.type && Intrinsics.f(this.address, beneficiaryEmbeddedEntity.address) && Intrinsics.f(this.currency, beneficiaryEmbeddedEntity.currency) && Intrinsics.f(this.bankCountry, beneficiaryEmbeddedEntity.bankCountry) && Intrinsics.f(this.bankLogo, beneficiaryEmbeddedEntity.bankLogo) && this.paymentType == beneficiaryEmbeddedEntity.paymentType && Intrinsics.f(this.country, beneficiaryEmbeddedEntity.country) && Intrinsics.f(this.externalAccount, beneficiaryEmbeddedEntity.externalAccount) && Intrinsics.f(this.label, beneficiaryEmbeddedEntity.label) && this.state == beneficiaryEmbeddedEntity.state && Intrinsics.f(this.accountFields, beneficiaryEmbeddedEntity.accountFields) && Intrinsics.f(this.extraFields, beneficiaryEmbeddedEntity.extraFields) && Intrinsics.f(this.settings, beneficiaryEmbeddedEntity.settings) && Intrinsics.f(this.identification, beneficiaryEmbeddedEntity.identification) && Intrinsics.f(this.counterpartyDetailsGroup, beneficiaryEmbeddedEntity.counterpartyDetailsGroup);
    }

    public final Map<String, String> getAccountFields() {
        return this.accountFields;
    }

    public final c getAddress() {
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

    public final BeneficiaryExtraFieldsEmbeddedEntity getExtraFields() {
        return this.extraFields;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final BeneficiaryIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
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

    public final PaymentTypeEmbeddedEntity getPaymentType() {
        return this.paymentType;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getRootId() {
        return this.rootId;
    }

    @NotNull
    public final List<PaymentsSettingEmbeddedEntity> getSettings() {
        return this.settings;
    }

    public final BeneficiaryStateEmbeddedEntity getState() {
        return this.state;
    }

    public final BeneficiaryTypeEmbeddedEntity getType() {
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
        String str7 = this.fullName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.email;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phone;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.externalRef;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity = this.type;
        int iHashCode12 = (iHashCode11 + (beneficiaryTypeEmbeddedEntity == null ? 0 : beneficiaryTypeEmbeddedEntity.hashCode())) * 31;
        c cVar = this.address;
        int iHashCode13 = (iHashCode12 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str11 = this.currency;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bankCountry;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.bankLogo;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity = this.paymentType;
        int iHashCode17 = (iHashCode16 + (paymentTypeEmbeddedEntity == null ? 0 : paymentTypeEmbeddedEntity.hashCode())) * 31;
        String str14 = this.country;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.externalAccount;
        int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.label;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity = this.state;
        int iHashCode21 = (iHashCode20 + (beneficiaryStateEmbeddedEntity == null ? 0 : beneficiaryStateEmbeddedEntity.hashCode())) * 31;
        Map<String, String> map = this.accountFields;
        int iHashCode22 = (iHashCode21 + (map == null ? 0 : map.hashCode())) * 31;
        BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity = this.extraFields;
        int iD = a.d((iHashCode22 + (beneficiaryExtraFieldsEmbeddedEntity == null ? 0 : beneficiaryExtraFieldsEmbeddedEntity.hashCode())) * 31, 31, this.settings);
        BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity = this.identification;
        int iHashCode23 = (iD + (beneficiaryIdentificationEmbeddedEntity == null ? 0 : beneficiaryIdentificationEmbeddedEntity.hashCode())) * 31;
        String str16 = this.counterpartyDetailsGroup;
        return iHashCode23 + (str16 != null ? str16.hashCode() : 0);
    }

    public /* synthetic */ BeneficiaryEmbeddedEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity, c cVar, String str12, String str13, String str14, PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity, String str15, Boolean bool, String str16, BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity, Map map, BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, List list, BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : str8, str9, str10, str11, beneficiaryTypeEmbeddedEntity, cVar, str12, str13, str14, paymentTypeEmbeddedEntity, str15, bool, str16, beneficiaryStateEmbeddedEntity, map, beneficiaryExtraFieldsEmbeddedEntity, list, beneficiaryIdentificationEmbeddedEntity, str17);
    }
}
