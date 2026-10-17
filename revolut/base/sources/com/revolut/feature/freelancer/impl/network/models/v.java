package com.revolut.feature.freelancer.impl.network.models;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001c\u0010.\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b-\u0010%R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\"\u00107\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010:\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b9\u00106R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b/\u0010=R\"\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b'\u00106R\"\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b3\u00106R\u001a\u0010F\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010D\u001a\u0004\b\u000f\u0010ER\u001a\u0010H\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bG\u0010ER\u001a\u0010I\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\b\u0015\u0010ER \u0010J\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\b\u0005\u00106¨\u0006K"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "s", "state", "c", "f", "description", "d", "channel", "e", "channelGroup", "w", "type", "g", "o", "paymentLink", "Lcom/revolut/feature/freelancer/impl/network/models/u;", "Lcom/revolut/feature/freelancer/impl/network/models/u;", "()Lcom/revolut/feature/freelancer/impl/network/models/u;", "customer", "Lcom/revolut/feature/freelancer/impl/network/models/f0;", "i", "Lcom/revolut/feature/freelancer/impl/network/models/f0;", "j", "()Lcom/revolut/feature/freelancer/impl/network/models/f0;", "invoice", "Ljo3/a;", "Ljo3/a;", "m", "()Ljo3/a;", "money", "k", "t", "subTotalAmount", "l", "u", "taxTotalAmount", "v", "tipAmount", "n", "merchantOrderExternalReference", "initiationPageId", "", "p", "Ljava/util/List;", "q", "()Ljava/util/List;", "relatedOrders", "Lcom/revolut/feature/freelancer/impl/network/models/h0;", "r", "relatedTransactions", "Lcom/revolut/feature/freelancer/impl/network/models/i0;", "Lcom/revolut/feature/freelancer/impl/network/models/i0;", "()Lcom/revolut/feature/freelancer/impl/network/models/i0;", "originalOrderDetails", "Lzc1/c;", "lineItems", "Lcom/revolut/feature/freelancer/impl/network/models/g0;", "payments", "", "J", "()J", "createdAt", "x", "updatedAt", "expiresAt", "allowedPaymentMethods", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("channel")
    private final String channel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("channelGroup")
    private final String channelGroup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("orderType")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentLink")
    private final String paymentLink;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("customer")
    private final u customer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("invoice")
    private final f0 invoice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a money;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("subTotalAmount")
    private final jo3.a subTotalAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxTotalAmount")
    private final jo3.a taxTotalAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("tip")
    private final jo3.a tipAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantOrderExtRef")
    private final String merchantOrderExternalReference;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("initiationPageId")
    private final String initiationPageId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("relatedOrders")
    private final List<v> relatedOrders;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("relatedTransactions")
    private final List<h0> relatedTransactions;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalOrderDetails")
    private final i0 originalOrderDetails;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("lineItems")
    private final List<zc1.c> lineItems;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("payments")
    private final List<g0> payments;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdAt;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedAt;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final long expiresAt;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowedPaymentMethods")
    @NotNull
    private final List<String> allowedPaymentMethods;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllowedPaymentMethods() {
        return this.allowedPaymentMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getChannelGroup() {
        return this.channelGroup;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u getCustomer() {
        return this.customer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.id, vVar.id) && Intrinsics.f(this.state, vVar.state) && Intrinsics.f(this.description, vVar.description) && Intrinsics.f(this.channel, vVar.channel) && Intrinsics.f(this.channelGroup, vVar.channelGroup) && Intrinsics.f(this.type, vVar.type) && Intrinsics.f(this.paymentLink, vVar.paymentLink) && Intrinsics.f(this.customer, vVar.customer) && Intrinsics.f(this.invoice, vVar.invoice) && Intrinsics.f(this.money, vVar.money) && Intrinsics.f(this.subTotalAmount, vVar.subTotalAmount) && Intrinsics.f(this.taxTotalAmount, vVar.taxTotalAmount) && Intrinsics.f(this.tipAmount, vVar.tipAmount) && Intrinsics.f(this.merchantOrderExternalReference, vVar.merchantOrderExternalReference) && Intrinsics.f(this.initiationPageId, vVar.initiationPageId) && Intrinsics.f(this.relatedOrders, vVar.relatedOrders) && Intrinsics.f(this.relatedTransactions, vVar.relatedTransactions) && Intrinsics.f(this.originalOrderDetails, vVar.originalOrderDetails) && Intrinsics.f(this.lineItems, vVar.lineItems) && Intrinsics.f(this.payments, vVar.payments) && this.createdAt == vVar.createdAt && this.updatedAt == vVar.updatedAt && this.expiresAt == vVar.expiresAt && Intrinsics.f(this.allowedPaymentMethods, vVar.allowedPaymentMethods);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.state);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelGroup;
        int iC2 = p.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.type);
        String str4 = this.paymentLink;
        int iHashCode3 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        u uVar = this.customer;
        int iHashCode4 = (iHashCode3 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        f0 f0Var = this.invoice;
        int iJ = v7.j(this.money, (iHashCode4 + (f0Var == null ? 0 : f0Var.hashCode())) * 31, 31);
        jo3.a aVar = this.subTotalAmount;
        int iHashCode5 = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.taxTotalAmount;
        int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.tipAmount;
        int iHashCode7 = (iHashCode6 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str5 = this.merchantOrderExternalReference;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.initiationPageId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<v> list = this.relatedOrders;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<h0> list2 = this.relatedTransactions;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        i0 i0Var = this.originalOrderDetails;
        int iHashCode12 = (iHashCode11 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        List<zc1.c> list3 = this.lineItems;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<g0> list4 = this.payments;
        return this.allowedPaymentMethods.hashCode() + a0.d.c(a0.d.c(a0.d.c((iHashCode13 + (list4 != null ? list4.hashCode() : 0)) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.expiresAt);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getInitiationPageId() {
        return this.initiationPageId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f0 getInvoice() {
        return this.invoice;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getLineItems() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getMerchantOrderExternalReference() {
        return this.merchantOrderExternalReference;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final jo3.a getMoney() {
        return this.money;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final i0 getOriginalOrderDetails() {
        return this.originalOrderDetails;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPaymentLink() {
        return this.paymentLink;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getRelatedOrders() {
        return this.relatedOrders;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final List getRelatedTransactions() {
        return this.relatedTransactions;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.a getSubTotalAmount() {
        return this.subTotalAmount;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getTaxTotalAmount() {
        return this.taxTotalAmount;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final jo3.a getTipAmount() {
        return this.tipAmount;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}
