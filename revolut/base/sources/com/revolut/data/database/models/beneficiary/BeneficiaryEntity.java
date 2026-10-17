package com.revolut.data.database.models.beneficiary;

import a0.d;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryExtraFieldsEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryIdentificationEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryStateEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.BeneficiaryTypeEmbeddedEntity;
import com.revolut.data.database.models.beneficiary.embeded.PaymentTypeEmbeddedEntity;
import com.revolut.data.database.models.payments.PaymentsSettingEmbeddedEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import so3.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\be\b\u0081\b\u0018\u00002\u00020\u0001BÃ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020\u0019\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010&\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00100J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u00100J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00100J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00100J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u00100J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00100J\u0012\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00100J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00100J\u0012\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u001e\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00100J\u0012\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00100J\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00100J\u0010\u0010M\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00100J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00100J\u0010\u0010Q\u001a\u00020$HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020&HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00100J\u0012\u0010V\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u00100J\u0080\u0003\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010!\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020$HÖ\u0001¢\u0006\u0004\b]\u0010RJ\u001a\u0010_\u001a\u00020\u00192\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\ba\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010b\u001a\u0004\bc\u00100R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010b\u001a\u0004\bd\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010b\u001a\u0004\be\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010b\u001a\u0004\bf\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010b\u001a\u0004\bg\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010b\u001a\u0004\bh\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010b\u001a\u0004\bi\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010b\u001a\u0004\bj\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010k\u001a\u0004\bl\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010b\u001a\u0004\bm\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010b\u001a\u0004\bn\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\bp\u0010=R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010q\u001a\u0004\br\u0010?R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010s\u001a\u0004\bt\u0010AR(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010u\u001a\u0004\bv\u0010CR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bw\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010x\u001a\u0004\by\u0010FR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010z\u001a\u0004\b{\u0010HR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010|\u001a\u0004\b}\u0010JR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010b\u001a\u0004\b~\u00100R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010b\u001a\u0004\b\u007f\u00100R\u001c\u0010!\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010NR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\"\u0010b\u001a\u0005\b\u0082\u0001\u00100R\u001d\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b#\u0010b\u001a\u0005\b\u0083\u0001\u00100R\u001c\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010RR\u001c\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010TR\u001d\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b(\u0010b\u001a\u0005\b\u0088\u0001\u00100R\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010WR\u001e\u0010+\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010YR\u001d\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b,\u0010b\u001a\u0005\b\u008d\u0001\u00100¨\u0006\u008e\u0001"}, d2 = {"Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;", "", "", "id", "rootId", "ownerId", "name", "firstName", "lastName", "companyName", "fullName", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "type", "bankCountry", "bankLogo", "Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "paymentType", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "extraFields", "", "Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;", "settings", "", "accountFields", "externalRef", "", "externalAccount", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "state", "Lso3/c;", "address", "email", "phone", "deprecated", "country", "currency", "", "transactionsCount", "", "timestamp", "label", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "identification", "createdDate", "counterpartyDetailsGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;Lso3/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "component10", "component11", "component12", "()Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "component13", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "component14", "()Ljava/util/List;", "component15", "()Ljava/util/Map;", "component16", "component17", "()Ljava/lang/Boolean;", "component18", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "component19", "()Lso3/c;", "component20", "component21", "component22", "()Z", "component23", "component24", "component25", "()I", "component26", "()J", "component27", "component28", "()Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "component29", "()Ljava/lang/Long;", "component30", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;Lso3/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;Ljava/lang/Long;Ljava/lang/String;)Lcom/revolut/data/database/models/beneficiary/BeneficiaryEntity;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "getRootId", "getOwnerId", "getName", "getFirstName", "getLastName", "getCompanyName", "getFullName", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryTypeEmbeddedEntity;", "getType", "getBankCountry", "getBankLogo", "Lcom/revolut/data/database/models/beneficiary/embeded/PaymentTypeEmbeddedEntity;", "getPaymentType", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryExtraFieldsEmbeddedEntity;", "getExtraFields", "Ljava/util/List;", "getSettings", "Ljava/util/Map;", "getAccountFields", "getExternalRef", "Ljava/lang/Boolean;", "getExternalAccount", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryStateEmbeddedEntity;", "getState", "Lso3/c;", "getAddress", "getEmail", "getPhone", "Z", "getDeprecated", "getCountry", "getCurrency", "I", "getTransactionsCount", "J", "getTimestamp", "getLabel", "Lcom/revolut/data/database/models/beneficiary/embeded/BeneficiaryIdentificationEmbeddedEntity;", "getIdentification", "Ljava/lang/Long;", "getCreatedDate", "getCounterpartyDetailsGroup", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BeneficiaryEntity {
    private final Map<String, String> accountFields;
    private final c address;
    private final String bankCountry;
    private final String bankLogo;
    private final String companyName;
    private final String counterpartyDetailsGroup;
    private final String country;
    private final Long createdDate;
    private final String currency;
    private final boolean deprecated;
    private final String email;
    private final Boolean externalAccount;
    private final String externalRef;
    private final BeneficiaryExtraFieldsEmbeddedEntity extraFields;
    private final String firstName;
    private final String fullName;

    @NotNull
    private final String id;
    private final BeneficiaryIdentificationEmbeddedEntity identification;
    private final String label;
    private final String lastName;
    private final String name;
    private final String ownerId;
    private final PaymentTypeEmbeddedEntity paymentType;
    private final String phone;
    private final String rootId;

    @NotNull
    private final List<PaymentsSettingEmbeddedEntity> settings;
    private final BeneficiaryStateEmbeddedEntity state;
    private final long timestamp;
    private final int transactionsCount;
    private final BeneficiaryTypeEmbeddedEntity type;

    public BeneficiaryEntity(@NotNull String id10, String str, String str2, String str3, String str4, String str5, String str6, String str7, BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity, String str8, String str9, PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity, BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, @NotNull List<PaymentsSettingEmbeddedEntity> settings, Map<String, String> map, String str10, Boolean bool, BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity, c cVar, String str11, String str12, boolean z, String str13, String str14, int i, long j2, String str15, BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity, Long l2, String str16) {
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
        this.type = beneficiaryTypeEmbeddedEntity;
        this.bankCountry = str8;
        this.bankLogo = str9;
        this.paymentType = paymentTypeEmbeddedEntity;
        this.extraFields = beneficiaryExtraFieldsEmbeddedEntity;
        this.settings = settings;
        this.accountFields = map;
        this.externalRef = str10;
        this.externalAccount = bool;
        this.state = beneficiaryStateEmbeddedEntity;
        this.address = cVar;
        this.email = str11;
        this.phone = str12;
        this.deprecated = z;
        this.country = str13;
        this.currency = str14;
        this.transactionsCount = i;
        this.timestamp = j2;
        this.label = str15;
        this.identification = beneficiaryIdentificationEmbeddedEntity;
        this.createdDate = l2;
        this.counterpartyDetailsGroup = str16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryEntity copy$default(BeneficiaryEntity beneficiaryEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity, String str9, String str10, PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity, BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, List list, Map map, String str11, Boolean bool, BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity, c cVar, String str12, String str13, boolean z, String str14, String str15, int i, long j2, String str16, BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity, Long l2, String str17, int i2, Object obj2) {
        String str18;
        Long l3;
        String str19;
        Boolean bool2;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity2;
        c cVar2;
        String str20;
        String str21;
        boolean z3;
        String str22;
        String str23;
        Map map2;
        int i3;
        long j3;
        String str24;
        BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity2;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity2;
        String str32;
        String str33;
        PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity2;
        BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity2;
        List list2;
        String str34;
        BeneficiaryEntity beneficiaryEntity2;
        String str35 = (i2 & 1) != 0 ? beneficiaryEntity.id : str;
        String str36 = (i2 & 2) != 0 ? beneficiaryEntity.rootId : str2;
        String str37 = (i2 & 4) != 0 ? beneficiaryEntity.ownerId : str3;
        String str38 = (i2 & 8) != 0 ? beneficiaryEntity.name : str4;
        String str39 = (i2 & 16) != 0 ? beneficiaryEntity.firstName : str5;
        String str40 = (i2 & 32) != 0 ? beneficiaryEntity.lastName : str6;
        String str41 = (i2 & 64) != 0 ? beneficiaryEntity.companyName : str7;
        String str42 = (i2 & 128) != 0 ? beneficiaryEntity.fullName : str8;
        BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity3 = (i2 & 256) != 0 ? beneficiaryEntity.type : beneficiaryTypeEmbeddedEntity;
        String str43 = (i2 & 512) != 0 ? beneficiaryEntity.bankCountry : str9;
        String str44 = (i2 & 1024) != 0 ? beneficiaryEntity.bankLogo : str10;
        PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity3 = (i2 & 2048) != 0 ? beneficiaryEntity.paymentType : paymentTypeEmbeddedEntity;
        BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity3 = (i2 & 4096) != 0 ? beneficiaryEntity.extraFields : beneficiaryExtraFieldsEmbeddedEntity;
        List list3 = (i2 & 8192) != 0 ? beneficiaryEntity.settings : list;
        String str45 = str35;
        Map map3 = (i2 & 16384) != 0 ? beneficiaryEntity.accountFields : map;
        String str46 = (i2 & 32768) != 0 ? beneficiaryEntity.externalRef : str11;
        Boolean bool3 = (i2 & 65536) != 0 ? beneficiaryEntity.externalAccount : bool;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity3 = (i2 & 131072) != 0 ? beneficiaryEntity.state : beneficiaryStateEmbeddedEntity;
        c cVar3 = (i2 & 262144) != 0 ? beneficiaryEntity.address : cVar;
        String str47 = (i2 & 524288) != 0 ? beneficiaryEntity.email : str12;
        String str48 = (i2 & PKIFailureInfo.badCertTemplate) != 0 ? beneficiaryEntity.phone : str13;
        boolean z4 = (i2 & PKIFailureInfo.badSenderNonce) != 0 ? beneficiaryEntity.deprecated : z;
        String str49 = (i2 & 4194304) != 0 ? beneficiaryEntity.country : str14;
        String str50 = (i2 & 8388608) != 0 ? beneficiaryEntity.currency : str15;
        int i5 = (i2 & 16777216) != 0 ? beneficiaryEntity.transactionsCount : i;
        Map map4 = map3;
        long j5 = (i2 & 33554432) != 0 ? beneficiaryEntity.timestamp : j2;
        String str51 = (i2 & 67108864) != 0 ? beneficiaryEntity.label : str16;
        BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity3 = (i2 & 134217728) != 0 ? beneficiaryEntity.identification : beneficiaryIdentificationEmbeddedEntity;
        String str52 = str51;
        Long l4 = (i2 & 268435456) != 0 ? beneficiaryEntity.createdDate : l2;
        if ((i2 & PKIFailureInfo.duplicateCertReq) != 0) {
            l3 = l4;
            str18 = beneficiaryEntity.counterpartyDetailsGroup;
            str19 = str46;
            bool2 = bool3;
            beneficiaryStateEmbeddedEntity2 = beneficiaryStateEmbeddedEntity3;
            cVar2 = cVar3;
            str20 = str47;
            str21 = str48;
            z3 = z4;
            str22 = str49;
            str23 = str50;
            i3 = i5;
            j3 = j5;
            str24 = str52;
            beneficiaryIdentificationEmbeddedEntity2 = beneficiaryIdentificationEmbeddedEntity3;
            str25 = str36;
            str26 = str37;
            str27 = str38;
            str28 = str39;
            str29 = str40;
            str30 = str41;
            str31 = str42;
            beneficiaryTypeEmbeddedEntity2 = beneficiaryTypeEmbeddedEntity3;
            str33 = str44;
            paymentTypeEmbeddedEntity2 = paymentTypeEmbeddedEntity3;
            beneficiaryExtraFieldsEmbeddedEntity2 = beneficiaryExtraFieldsEmbeddedEntity3;
            list2 = list3;
            str34 = str45;
            map2 = map4;
            beneficiaryEntity2 = beneficiaryEntity;
            str32 = str43;
        } else {
            str18 = str17;
            l3 = l4;
            str19 = str46;
            bool2 = bool3;
            beneficiaryStateEmbeddedEntity2 = beneficiaryStateEmbeddedEntity3;
            cVar2 = cVar3;
            str20 = str47;
            str21 = str48;
            z3 = z4;
            str22 = str49;
            str23 = str50;
            map2 = map4;
            i3 = i5;
            j3 = j5;
            str24 = str52;
            beneficiaryIdentificationEmbeddedEntity2 = beneficiaryIdentificationEmbeddedEntity3;
            str25 = str36;
            str26 = str37;
            str27 = str38;
            str28 = str39;
            str29 = str40;
            str30 = str41;
            str31 = str42;
            beneficiaryTypeEmbeddedEntity2 = beneficiaryTypeEmbeddedEntity3;
            str32 = str43;
            str33 = str44;
            paymentTypeEmbeddedEntity2 = paymentTypeEmbeddedEntity3;
            beneficiaryExtraFieldsEmbeddedEntity2 = beneficiaryExtraFieldsEmbeddedEntity3;
            list2 = list3;
            str34 = str45;
            beneficiaryEntity2 = beneficiaryEntity;
        }
        return beneficiaryEntity2.copy(str34, str25, str26, str27, str28, str29, str30, str31, beneficiaryTypeEmbeddedEntity2, str32, str33, paymentTypeEmbeddedEntity2, beneficiaryExtraFieldsEmbeddedEntity2, list2, map2, str19, bool2, beneficiaryStateEmbeddedEntity2, cVar2, str20, str21, z3, str22, str23, i3, j3, str24, beneficiaryIdentificationEmbeddedEntity2, l3, str18);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBankCountry() {
        return this.bankCountry;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PaymentTypeEmbeddedEntity getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BeneficiaryExtraFieldsEmbeddedEntity getExtraFields() {
        return this.extraFields;
    }

    @NotNull
    public final List<PaymentsSettingEmbeddedEntity> component14() {
        return this.settings;
    }

    public final Map<String, String> component15() {
        return this.accountFields;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getExternalRef() {
        return this.externalRef;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getExternalAccount() {
        return this.externalAccount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BeneficiaryStateEmbeddedEntity getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final c getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRootId() {
        return this.rootId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getDeprecated() {
        return this.deprecated;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getTransactionsCount() {
        return this.transactionsCount;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final BeneficiaryIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getCounterpartyDetailsGroup() {
        return this.counterpartyDetailsGroup;
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
    public final BeneficiaryTypeEmbeddedEntity getType() {
        return this.type;
    }

    @NotNull
    public final BeneficiaryEntity copy(@NotNull String id10, String rootId, String ownerId, String name, String firstName, String lastName, String companyName, String fullName, BeneficiaryTypeEmbeddedEntity type, String bankCountry, String bankLogo, PaymentTypeEmbeddedEntity paymentType, BeneficiaryExtraFieldsEmbeddedEntity extraFields, @NotNull List<PaymentsSettingEmbeddedEntity> settings, Map<String, String> accountFields, String externalRef, Boolean externalAccount, BeneficiaryStateEmbeddedEntity state, c address, String email, String phone, boolean deprecated, String country, String currency, int transactionsCount, long timestamp, String label, BeneficiaryIdentificationEmbeddedEntity identification, Long createdDate, String counterpartyDetailsGroup) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new BeneficiaryEntity(id10, rootId, ownerId, name, firstName, lastName, companyName, fullName, type, bankCountry, bankLogo, paymentType, extraFields, settings, accountFields, externalRef, externalAccount, state, address, email, phone, deprecated, country, currency, transactionsCount, timestamp, label, identification, createdDate, counterpartyDetailsGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryEntity)) {
            return false;
        }
        BeneficiaryEntity beneficiaryEntity = (BeneficiaryEntity) other;
        return Intrinsics.f(this.id, beneficiaryEntity.id) && Intrinsics.f(this.rootId, beneficiaryEntity.rootId) && Intrinsics.f(this.ownerId, beneficiaryEntity.ownerId) && Intrinsics.f(this.name, beneficiaryEntity.name) && Intrinsics.f(this.firstName, beneficiaryEntity.firstName) && Intrinsics.f(this.lastName, beneficiaryEntity.lastName) && Intrinsics.f(this.companyName, beneficiaryEntity.companyName) && Intrinsics.f(this.fullName, beneficiaryEntity.fullName) && this.type == beneficiaryEntity.type && Intrinsics.f(this.bankCountry, beneficiaryEntity.bankCountry) && Intrinsics.f(this.bankLogo, beneficiaryEntity.bankLogo) && this.paymentType == beneficiaryEntity.paymentType && Intrinsics.f(this.extraFields, beneficiaryEntity.extraFields) && Intrinsics.f(this.settings, beneficiaryEntity.settings) && Intrinsics.f(this.accountFields, beneficiaryEntity.accountFields) && Intrinsics.f(this.externalRef, beneficiaryEntity.externalRef) && Intrinsics.f(this.externalAccount, beneficiaryEntity.externalAccount) && this.state == beneficiaryEntity.state && Intrinsics.f(this.address, beneficiaryEntity.address) && Intrinsics.f(this.email, beneficiaryEntity.email) && Intrinsics.f(this.phone, beneficiaryEntity.phone) && this.deprecated == beneficiaryEntity.deprecated && Intrinsics.f(this.country, beneficiaryEntity.country) && Intrinsics.f(this.currency, beneficiaryEntity.currency) && this.transactionsCount == beneficiaryEntity.transactionsCount && this.timestamp == beneficiaryEntity.timestamp && Intrinsics.f(this.label, beneficiaryEntity.label) && Intrinsics.f(this.identification, beneficiaryEntity.identification) && Intrinsics.f(this.createdDate, beneficiaryEntity.createdDate) && Intrinsics.f(this.counterpartyDetailsGroup, beneficiaryEntity.counterpartyDetailsGroup);
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getTransactionsCount() {
        return this.transactionsCount;
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
        BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity = this.type;
        int iHashCode9 = (iHashCode8 + (beneficiaryTypeEmbeddedEntity == null ? 0 : beneficiaryTypeEmbeddedEntity.hashCode())) * 31;
        String str8 = this.bankCountry;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bankLogo;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity = this.paymentType;
        int iHashCode12 = (iHashCode11 + (paymentTypeEmbeddedEntity == null ? 0 : paymentTypeEmbeddedEntity.hashCode())) * 31;
        BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity = this.extraFields;
        int iD = p.a.d((iHashCode12 + (beneficiaryExtraFieldsEmbeddedEntity == null ? 0 : beneficiaryExtraFieldsEmbeddedEntity.hashCode())) * 31, 31, this.settings);
        Map<String, String> map = this.accountFields;
        int iHashCode13 = (iD + (map == null ? 0 : map.hashCode())) * 31;
        String str10 = this.externalRef;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.externalAccount;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity = this.state;
        int iHashCode16 = (iHashCode15 + (beneficiaryStateEmbeddedEntity == null ? 0 : beneficiaryStateEmbeddedEntity.hashCode())) * 31;
        c cVar = this.address;
        int iHashCode17 = (iHashCode16 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str11 = this.email;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phone;
        int iC = j6.a.c((iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.deprecated);
        String str13 = this.country;
        int iHashCode19 = (iC + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.currency;
        int iC2 = d.c(j6.a.b(this.transactionsCount, (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31, 31), 31, this.timestamp);
        String str15 = this.label;
        int iHashCode20 = (iC2 + (str15 == null ? 0 : str15.hashCode())) * 31;
        BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity = this.identification;
        int iHashCode21 = (iHashCode20 + (beneficiaryIdentificationEmbeddedEntity == null ? 0 : beneficiaryIdentificationEmbeddedEntity.hashCode())) * 31;
        Long l2 = this.createdDate;
        int iHashCode22 = (iHashCode21 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str16 = this.counterpartyDetailsGroup;
        return iHashCode22 + (str16 != null ? str16.hashCode() : 0);
    }

    public /* synthetic */ BeneficiaryEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BeneficiaryTypeEmbeddedEntity beneficiaryTypeEmbeddedEntity, String str9, String str10, PaymentTypeEmbeddedEntity paymentTypeEmbeddedEntity, BeneficiaryExtraFieldsEmbeddedEntity beneficiaryExtraFieldsEmbeddedEntity, List list, Map map, String str11, Boolean bool, BeneficiaryStateEmbeddedEntity beneficiaryStateEmbeddedEntity, c cVar, String str12, String str13, boolean z, String str14, String str15, int i, long j2, String str16, BeneficiaryIdentificationEmbeddedEntity beneficiaryIdentificationEmbeddedEntity, Long l2, String str17, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i2 & 128) != 0 ? null : str8, beneficiaryTypeEmbeddedEntity, str9, str10, paymentTypeEmbeddedEntity, beneficiaryExtraFieldsEmbeddedEntity, list, map, str11, bool, beneficiaryStateEmbeddedEntity, cVar, str12, str13, z, str14, str15, (16777216 & i2) != 0 ? 0 : i, (33554432 & i2) != 0 ? 0L : j2, str16, beneficiaryIdentificationEmbeddedEntity, (i2 & 268435456) != 0 ? null : l2, str17);
    }
}
