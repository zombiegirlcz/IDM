package jt6;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u0000 Z2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0019\u0010+R\u001c\u00104\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b\u0014\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b5\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b0\u0010BR\u001c\u0010G\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010E\u001a\u0004\b%\u0010FR\u001c\u0010K\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010I\u001a\u0004\b8\u0010JR\u001c\u0010N\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\u001a\u001a\u0004\bM\u0010\u001bR\u001c\u0010O\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b@\u0010\u001bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001c\u0010S\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u001a\u001a\u0004\bP\u0010\u001bR\u001c\u0010V\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010\u001a\u001a\u0004\bU\u0010\u001bR\u001c\u0010W\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010\u001a\u001a\u0004\bL\u0010\u001bR\u001c\u0010X\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u001a\u001a\u0004\bR\u0010\u001bR\u001c\u0010Y\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\bT\u0010\u001b¨\u0006["}, d2 = {"Ljt6/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "id", "", "b", "J", "d", "()J", "createdAt", "c", "C", "updatedAt", "w", "status", "e", "channel", "f", "captureMode", "Ljo3/a;", "g", "Ljo3/a;", "()Ljo3/a;", "amount", "h", "r", "merchantOrderExternalReference", "i", "j", "description", "u", "readableIdentifier", "k", "customerNote", "", "Ljt6/c;", "l", "Ljava/util/List;", "()Ljava/util/List;", "customers", "Ljt6/b;", "customFields", "Ljt6/l;", "n", "Ljt6/l;", "t", "()Ljt6/l;", "primaryPayment", "o", "q", "locationId", "p", "createdByUserId", "Ljt6/n;", "Ljt6/n;", "()Ljt6/n;", "createdByUser", "initiationPageId", "Ljt6/g;", "s", "Ljt6/g;", "()Ljt6/g;", "initiationPage", "Ljt6/d;", "Ljt6/d;", "()Ljt6/d;", "device", "Ljt6/h;", "Ljt6/h;", "()Ljt6/h;", "invoice", "v", "B", "tipAmount", "outstandingAmount", "x", "discountTotalAmount", "y", "subTotalAmount", "z", "A", "taxTotalAmount", "serviceChargeAmount", "surchargeAmount", "surchargeTaxAmount", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("serviceChargeAmount")
    private final jo3.a serviceChargeAmount;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("surchargeAmount")
    private final jo3.a surchargeAmount;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("surchargeTaxAmount")
    private final jo3.a surchargeTaxAmount;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("status")
    private final String status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("channel")
    private final String channel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("captureMode")
    private final String captureMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantOrderExtRef")
    private final String merchantOrderExternalReference;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("readableIdentifier")
    @NotNull
    private final String readableIdentifier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("customerNote")
    private final String customerNote;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("customers")
    private final List<c> customers;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("customFields")
    private final List<b> customFields;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryPayment")
    private final l primaryPayment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("locationId")
    private final String locationId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdByUserId")
    private final String createdByUserId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdByUser")
    private final n createdByUser;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("initiationPageId")
    private final String initiationPageId;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("initiationPage")
    private final g initiationPage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("device")
    private final d device;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("invoice")
    private final h invoice;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("tipAmount")
    private final jo3.a tipAmount;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingAmount")
    private final jo3.a outstandingAmount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("discountTotalAmount")
    private final jo3.a discountTotalAmount;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("subTotalAmount")
    private final jo3.a subTotalAmount;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("taxTotalAmount")
    private final jo3.a taxTotalAmount;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final jo3.a getTaxTotalAmount() {
        return this.taxTotalAmount;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final jo3.a getTipAmount() {
        return this.tipAmount;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n getCreatedByUser() {
        return this.createdByUser;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && this.createdAt == eVar.createdAt && this.updatedAt == eVar.updatedAt && Intrinsics.f(this.status, eVar.status) && Intrinsics.f(this.channel, eVar.channel) && Intrinsics.f(this.captureMode, eVar.captureMode) && Intrinsics.f(this.amount, eVar.amount) && Intrinsics.f(this.merchantOrderExternalReference, eVar.merchantOrderExternalReference) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.readableIdentifier, eVar.readableIdentifier) && Intrinsics.f(this.customerNote, eVar.customerNote) && Intrinsics.f(this.customers, eVar.customers) && Intrinsics.f(this.customFields, eVar.customFields) && Intrinsics.f(this.primaryPayment, eVar.primaryPayment) && Intrinsics.f(this.locationId, eVar.locationId) && Intrinsics.f(this.createdByUserId, eVar.createdByUserId) && Intrinsics.f(this.createdByUser, eVar.createdByUser) && Intrinsics.f(this.initiationPageId, eVar.initiationPageId) && Intrinsics.f(this.initiationPage, eVar.initiationPage) && Intrinsics.f(this.device, eVar.device) && Intrinsics.f(this.invoice, eVar.invoice) && Intrinsics.f(this.tipAmount, eVar.tipAmount) && Intrinsics.f(this.outstandingAmount, eVar.outstandingAmount) && Intrinsics.f(this.discountTotalAmount, eVar.discountTotalAmount) && Intrinsics.f(this.subTotalAmount, eVar.subTotalAmount) && Intrinsics.f(this.taxTotalAmount, eVar.taxTotalAmount) && Intrinsics.f(this.serviceChargeAmount, eVar.serviceChargeAmount) && Intrinsics.f(this.surchargeAmount, eVar.surchargeAmount) && Intrinsics.f(this.surchargeTaxAmount, eVar.surchargeTaxAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getCustomFields() {
        return this.customFields;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCustomerNote() {
        return this.customerNote;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(this.id.hashCode() * 31, 31, this.createdAt), 31, this.updatedAt);
        String str = this.status;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.captureMode;
        int iJ = v7.j(this.amount, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.merchantOrderExternalReference;
        int iHashCode3 = (iJ + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iC2 = p.a.c((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.readableIdentifier);
        String str6 = this.customerNote;
        int iHashCode4 = (iC2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<c> list = this.customers;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.customFields;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        l lVar = this.primaryPayment;
        int iHashCode7 = (iHashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str7 = this.locationId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.createdByUserId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        n nVar = this.createdByUser;
        int iHashCode10 = (iHashCode9 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str9 = this.initiationPageId;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        g gVar = this.initiationPage;
        int iHashCode12 = (iHashCode11 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        d dVar = this.device;
        int iHashCode13 = (iHashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h hVar = this.invoice;
        int iHashCode14 = (iHashCode13 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        jo3.a aVar = this.tipAmount;
        int iHashCode15 = (iHashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.outstandingAmount;
        int iHashCode16 = (iHashCode15 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.discountTotalAmount;
        int iHashCode17 = (iHashCode16 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.subTotalAmount;
        int iHashCode18 = (iHashCode17 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        jo3.a aVar5 = this.taxTotalAmount;
        int iHashCode19 = (iHashCode18 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        jo3.a aVar6 = this.serviceChargeAmount;
        int iHashCode20 = (iHashCode19 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        jo3.a aVar7 = this.surchargeAmount;
        int iHashCode21 = (iHashCode20 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        jo3.a aVar8 = this.surchargeTaxAmount;
        return iHashCode21 + (aVar8 != null ? aVar8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getCustomers() {
        return this.customers;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final d getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getDiscountTotalAmount() {
        return this.discountTotalAmount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final g getInitiationPage() {
        return this.initiationPage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInitiationPageId() {
        return this.initiationPageId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final h getInvoice() {
        return this.invoice;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getMerchantOrderExternalReference() {
        return this.merchantOrderExternalReference;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getOutstandingAmount() {
        return this.outstandingAmount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final l getPrimaryPayment() {
        return this.primaryPayment;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getReadableIdentifier() {
        return this.readableIdentifier;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final jo3.a getServiceChargeAmount() {
        return this.serviceChargeAmount;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final jo3.a getSubTotalAmount() {
        return this.subTotalAmount;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final jo3.a getSurchargeAmount() {
        return this.surchargeAmount;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final jo3.a getSurchargeTaxAmount() {
        return this.surchargeTaxAmount;
    }
}
