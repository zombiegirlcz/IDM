package z8l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010%\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u0013\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b)\u0010\u0004R\"\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b$\u00100R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b\t\u00104¨\u00066"}, d2 = {"Lz8l/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "c", "channel", "p", "state", "", "d", "J", "()J", "amount", "e", "f", "currency", "q", "updatedDate", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiryDate", "Lz8l/g;", "h", "Lz8l/g;", "k", "()Lz8l/g;", "payer", "n", "requester", "j", "creator", "comment", "l", "gifUrl", "m", "receiveUrl", "o", "splitBillId", "registeredIdentityId", "", "Ljava/util/List;", "()Ljava/util/List;", "modifiableFields", "Lz8l/b;", "Lz8l/b;", "()Lz8l/b;", "attributes", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("channel")
    @NotNull
    private final String channel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryDate")
    private final Long expiryDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("payer")
    private final g payer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("requester")
    private final g requester;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("creator")
    @NotNull
    private final g creator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("gif")
    private final String gifUrl;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("url")
    private final String receiveUrl;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("splitBillId")
    private final String splitBillId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("registeredIdentityId")
    private final String registeredIdentityId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("modifiableFields")
    private final List<String> modifiableFields;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("attributes")
    private final b attributes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getCreator() {
        return this.creator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.channel, iVar.channel) && Intrinsics.f(this.state, iVar.state) && this.amount == iVar.amount && Intrinsics.f(this.currency, iVar.currency) && this.updatedDate == iVar.updatedDate && Intrinsics.f(this.expiryDate, iVar.expiryDate) && Intrinsics.f(this.payer, iVar.payer) && Intrinsics.f(this.requester, iVar.requester) && Intrinsics.f(this.creator, iVar.creator) && Intrinsics.f(this.comment, iVar.comment) && Intrinsics.f(this.gifUrl, iVar.gifUrl) && Intrinsics.f(this.receiveUrl, iVar.receiveUrl) && Intrinsics.f(this.splitBillId, iVar.splitBillId) && Intrinsics.f(this.registeredIdentityId, iVar.registeredIdentityId) && Intrinsics.f(this.modifiableFields, iVar.modifiableFields) && Intrinsics.f(this.attributes, iVar.attributes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getGifUrl() {
        return this.gifUrl;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.channel);
        String str = this.state;
        int iC2 = a0.d.c(p.a.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.amount), 31, this.currency), 31, this.updatedDate);
        Long l2 = this.expiryDate;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        g gVar = this.payer;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.requester;
        int iHashCode3 = (this.creator.hashCode() + ((iHashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31)) * 31;
        String str2 = this.comment;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gifUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiveUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.splitBillId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.registeredIdentityId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.modifiableFields;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.attributes;
        return iHashCode9 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getModifiableFields() {
        return this.modifiableFields;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final g getPayer() {
        return this.payer;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getReceiveUrl() {
        return this.receiveUrl;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final g getRequester() {
        return this.requester;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSplitBillId() {
        return this.splitBillId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }
}
