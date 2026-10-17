package k02;

import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\t\u0013\r\u000f\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0005\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b1\u00102R\u001c\u00105\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b4\u00102R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b6\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b<\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b>\u0010\u0004R\u001c\u0010D\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b\u001e\u0010CR\u001c\u0010G\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\bH\u0010\u0004R\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bJ\u0010\u0004R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\bL\u0010\u0004R\u001c\u0010Q\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\b8\u0010PR\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\u0004R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bW\u0010\u0004R\u001c\u0010\\\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010Z\u001a\u0004\b)\u0010[R\u001c\u0010]\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010O\u001a\u0004\bR\u0010PR\u001c\u0010_\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\bT\u0010\u0004R\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b^\u0010\u0004R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b$\u0010\u0004R\"\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010\u001f\u001a\u0004\bb\u0010 R\u001c\u0010e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010g\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\bf\u0010\u0004R\u001c\u0010i\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010O\u001a\u0004\bh\u0010PR\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bd\u0010\u0004R\u001c\u0010k\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bE\u0010\u0004R\u001c\u0010n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bA\u0010\u0004¨\u0006o"}, d2 = {"Lk02/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "x", "mandateId", "b", "r", "initiationFlow", "Lk02/c$a;", "c", "Lk02/c$a;", "e", "()Lk02/c$a;", "consumer", "Lk02/c$b;", "d", "Lk02/c$b;", "g", "()Lk02/c$b;", "creditor", "Lk02/c$d;", "Lk02/c$d;", "i", "()Lk02/c$d;", "debtor", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "additionalInformation", "m", "documentDescription", "h", "n", "documentNumber", "l", "description", "j", "I", "shortDescription", "k", "B", "pocketId", "Ljo3/a;", "Ljo3/a;", "p", "()Ljo3/a;", "firstAmount", "u", "lastAmount", "E", "purpose", "o", "amountType", "q", "firstTransactionDate", "w", "lastTransactionDate", "F", "reference", "", "s", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "countPerPeriod", "t", "C", "pointInTime", "A", "paymentNotAllowedBefore", "v", "lastStateChangedBy", "J", "transferArrangement", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "expirationExtendedAutomatically", "y", "debtorName", "z", "M", "ultimateDebtorName", "L", "ultimateCreditorName", "Lk02/c$c;", "Lk02/c$c;", "()Lk02/c$c;", "debtorAlias", "notifyAboutLimit", "D", "otp", "pseEmail", "cus", "G", "referenceNumber", "H", "backToMerchantUrl", "getIntegrationType", "integrationType", "K", "trustable", "returnUrl", "consentPayload", "invoiceUrl", "N", "invoiceNumber", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("ultimateCreditorName")
    private final String ultimateCreditorName;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("debtorAlias")
    private final C1024c debtorAlias;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("notifyAboutLimit")
    private final Boolean notifyAboutLimit;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("otp")
    private final String otp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("pseEmail")
    private final String pseEmail;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("cus")
    private final String cus;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("referenceNumber")
    private final List<String> referenceNumber;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("backToMerchantUrl")
    private final String backToMerchantUrl;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("integrationType")
    private final String integrationType;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("trustable")
    private final Boolean trustable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("returnUrl")
    private final String returnUrl;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("consentPayload")
    private final String consentPayload;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("invoiceUrl")
    private final String invoiceUrl;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("invoiceNumber")
    private final String invoiceNumber;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mandateId")
    private final String mandateId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("initiationFlow")
    private final String initiationFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("consumer")
    private final a consumer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("creditor")
    private final b creditor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("debtor")
    private final d debtor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("additionalInformation")
    private final List<String> additionalInformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentDescription")
    private final String documentDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentNumber")
    private final String documentNumber;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("shortDescription")
    private final String shortDescription;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstAmount")
    private final jo3.a firstAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastAmount")
    private final jo3.a lastAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("purpose")
    private final String purpose;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("amountType")
    private final String amountType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstTransactionDate")
    private final String firstTransactionDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastTransactionDate")
    private final String lastTransactionDate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("reference")
    private final String reference;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("countPerPeriod")
    private final Integer countPerPeriod;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointInTime")
    private final Integer pointInTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("paymentNotAllowedBefore")
    private final String paymentNotAllowedBefore;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("lastStateChangedBy")
    private final String lastStateChangedBy;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferArrangement")
    private final String transferArrangement;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationExtendedAutomatically")
    private final Boolean expirationExtendedAutomatically;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtorName")
    private final String debtorName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("ultimateDebtorName")
    private final String ultimateDebtorName;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lk02/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.id, ((a) obj2).id);
        }

        public final int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lk02/c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "Lk02/c$e;", "b", "Lk02/c$e;", "()Lk02/c$e;", "identification", "institutionName", "d", "serviceProviderLogo", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("identification")
        private final e identification;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("institutionName")
        private final String institutionName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("serviceProviderLogo")
        private final String serviceProviderLogo;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getIdentification() {
            return this.identification;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getServiceProviderLogo() {
            return this.serviceProviderLogo;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.identification, bVar.identification) && Intrinsics.f(this.institutionName, bVar.institutionName) && Intrinsics.f(this.serviceProviderLogo, bVar.serviceProviderLogo);
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            e eVar = this.identification;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            String str = this.institutionName;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.serviceProviderLogo;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: k02.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lk02/c$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "value", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1024c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1024c)) {
                return false;
            }
            C1024c c1024c = (C1024c) obj2;
            return Intrinsics.f(this.type, c1024c.type) && Intrinsics.f(this.value, c1024c.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lk02/c$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "Lk02/c$e;", "Lk02/c$e;", "()Lk02/c$e;", "identification", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("identification")
        private final e identification;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getIdentification() {
            return this.identification;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.identification, dVar.identification);
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            e eVar = this.identification;
            return iHashCode + (eVar != null ? eVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lk02/c$e;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "a", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "type", "b", "Ljava/lang/String;", "value", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final BeneficiaryIdentificationTypeDto type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BeneficiaryIdentificationTypeDto getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return this.type == eVar.type && Intrinsics.f(this.value, eVar.value);
        }

        public final int hashCode() {
            BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto = this.type;
            int iHashCode = (beneficiaryIdentificationTypeDto == null ? 0 : beneficiaryIdentificationTypeDto.hashCode()) * 31;
            String str = this.value;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getPaymentNotAllowedBefore() {
        return this.paymentNotAllowedBefore;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Integer getPointInTime() {
        return this.pointInTime;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getPseEmail() {
        return this.pseEmail;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final List getReferenceNumber() {
        return this.referenceNumber;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTransferArrangement() {
        return this.transferArrangement;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Boolean getTrustable() {
        return this.trustable;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getUltimateCreditorName() {
        return this.ultimateCreditorName;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getUltimateDebtorName() {
        return this.ultimateDebtorName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAmountType() {
        return this.amountType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBackToMerchantUrl() {
        return this.backToMerchantUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getConsentPayload() {
        return this.consentPayload;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getConsumer() {
        return this.consumer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.mandateId, cVar.mandateId) && Intrinsics.f(this.initiationFlow, cVar.initiationFlow) && Intrinsics.f(this.consumer, cVar.consumer) && Intrinsics.f(this.creditor, cVar.creditor) && Intrinsics.f(this.debtor, cVar.debtor) && Intrinsics.f(this.additionalInformation, cVar.additionalInformation) && Intrinsics.f(this.documentDescription, cVar.documentDescription) && Intrinsics.f(this.documentNumber, cVar.documentNumber) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.shortDescription, cVar.shortDescription) && Intrinsics.f(this.pocketId, cVar.pocketId) && Intrinsics.f(this.firstAmount, cVar.firstAmount) && Intrinsics.f(this.lastAmount, cVar.lastAmount) && Intrinsics.f(this.purpose, cVar.purpose) && Intrinsics.f(this.amountType, cVar.amountType) && Intrinsics.f(this.firstTransactionDate, cVar.firstTransactionDate) && Intrinsics.f(this.lastTransactionDate, cVar.lastTransactionDate) && Intrinsics.f(this.reference, cVar.reference) && Intrinsics.f(this.countPerPeriod, cVar.countPerPeriod) && Intrinsics.f(this.pointInTime, cVar.pointInTime) && Intrinsics.f(this.paymentNotAllowedBefore, cVar.paymentNotAllowedBefore) && Intrinsics.f(this.lastStateChangedBy, cVar.lastStateChangedBy) && Intrinsics.f(this.transferArrangement, cVar.transferArrangement) && Intrinsics.f(this.expirationExtendedAutomatically, cVar.expirationExtendedAutomatically) && Intrinsics.f(this.debtorName, cVar.debtorName) && Intrinsics.f(this.ultimateDebtorName, cVar.ultimateDebtorName) && Intrinsics.f(this.ultimateCreditorName, cVar.ultimateCreditorName) && Intrinsics.f(this.debtorAlias, cVar.debtorAlias) && Intrinsics.f(this.notifyAboutLimit, cVar.notifyAboutLimit) && Intrinsics.f(this.otp, cVar.otp) && Intrinsics.f(this.pseEmail, cVar.pseEmail) && Intrinsics.f(this.cus, cVar.cus) && Intrinsics.f(this.referenceNumber, cVar.referenceNumber) && Intrinsics.f(this.backToMerchantUrl, cVar.backToMerchantUrl) && Intrinsics.f(this.integrationType, cVar.integrationType) && Intrinsics.f(this.trustable, cVar.trustable) && Intrinsics.f(this.returnUrl, cVar.returnUrl) && Intrinsics.f(this.consentPayload, cVar.consentPayload) && Intrinsics.f(this.invoiceUrl, cVar.invoiceUrl) && Intrinsics.f(this.invoiceNumber, cVar.invoiceNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getCountPerPeriod() {
        return this.countPerPeriod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCus() {
        return this.cus;
    }

    public final int hashCode() {
        String str = this.mandateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.initiationFlow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.consumer;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.creditor;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.debtor;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<String> list = this.additionalInformation;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.documentDescription;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.documentNumber;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shortDescription;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pocketId;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        jo3.a aVar2 = this.firstAmount;
        int iHashCode12 = (iHashCode11 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.lastAmount;
        int iHashCode13 = (iHashCode12 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str8 = this.purpose;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.amountType;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.firstTransactionDate;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastTransactionDate;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.reference;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.countPerPeriod;
        int iHashCode19 = (iHashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pointInTime;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.paymentNotAllowedBefore;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastStateChangedBy;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.transferArrangement;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.expirationExtendedAutomatically;
        int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str16 = this.debtorName;
        int iHashCode25 = (iHashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.ultimateDebtorName;
        int iHashCode26 = (iHashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.ultimateCreditorName;
        int iHashCode27 = (iHashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        C1024c c1024c = this.debtorAlias;
        int iHashCode28 = (iHashCode27 + (c1024c == null ? 0 : c1024c.hashCode())) * 31;
        Boolean bool2 = this.notifyAboutLimit;
        int iHashCode29 = (iHashCode28 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str19 = this.otp;
        int iHashCode30 = (iHashCode29 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.pseEmail;
        int iHashCode31 = (iHashCode30 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.cus;
        int iHashCode32 = (iHashCode31 + (str21 == null ? 0 : str21.hashCode())) * 31;
        List<String> list2 = this.referenceNumber;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str22 = this.backToMerchantUrl;
        int iHashCode34 = (iHashCode33 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.integrationType;
        int iHashCode35 = (iHashCode34 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool3 = this.trustable;
        int iHashCode36 = (iHashCode35 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str24 = this.returnUrl;
        int iHashCode37 = (iHashCode36 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.consentPayload;
        int iHashCode38 = (iHashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.invoiceUrl;
        int iHashCode39 = (iHashCode38 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.invoiceNumber;
        return iHashCode39 + (str27 != null ? str27.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getDebtor() {
        return this.debtor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C1024c getDebtorAlias() {
        return this.debtorAlias;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getDebtorName() {
        return this.debtorName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getExpirationExtendedAutomatically() {
        return this.expirationExtendedAutomatically;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.a getFirstAmount() {
        return this.firstAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getFirstTransactionDate() {
        return this.firstTransactionDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getInitiationFlow() {
        return this.initiationFlow;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getLastAmount() {
        return this.lastAmount;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getLastStateChangedBy() {
        return this.lastStateChangedBy;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getMandateId() {
        return this.mandateId;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getNotifyAboutLimit() {
        return this.notifyAboutLimit;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getOtp() {
        return this.otp;
    }
}
