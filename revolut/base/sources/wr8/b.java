package wr8;

import a0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000e\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010$\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b\u001e\u0010#R\u001a\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b\u001a\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b\u0016\u0010(¨\u0006*"}, d2 = {"Lwr8/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "j", "transactionId", "d", "l", "transactionWalletId", "k", "transactionPocketId", "f", "i", "state", "", "g", "J", "()J", "createdDate", "h", "comment", "gif", "Lwr8/a;", "Lwr8/a;", "()Lwr8/a;", "sender", "recipient", "Lwr8/c;", "Lwr8/c;", "()Lwr8/c;", "reason", "feature_junior_transfer_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    @NotNull
    private final String transactionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transactionWalletId")
    @NotNull
    private final String transactionWalletId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("transactionPocketId")
    @NotNull
    private final String transactionPocketId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("gif")
    private final String gif;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("sender")
    @NotNull
    private final a sender;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final a recipient;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final c reason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.transactionId, bVar.transactionId) && Intrinsics.f(this.transactionWalletId, bVar.transactionWalletId) && Intrinsics.f(this.transactionPocketId, bVar.transactionPocketId) && Intrinsics.f(this.state, bVar.state) && this.createdDate == bVar.createdDate && Intrinsics.f(this.comment, bVar.comment) && Intrinsics.f(this.gif, bVar.gif) && Intrinsics.f(this.sender, bVar.sender) && Intrinsics.f(this.recipient, bVar.recipient) && Intrinsics.f(this.reason, bVar.reason);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getRecipient() {
        return this.recipient;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getSender() {
        return this.sender;
    }

    public final int hashCode() {
        int iC = d.c(p.a.c(p.a.c(p.a.c(p.a.c(v7.j(this.amount, this.id.hashCode() * 31, 31), 31, this.transactionId), 31, this.transactionWalletId), 31, this.transactionPocketId), 31, this.state), 31, this.createdDate);
        String str = this.comment;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gif;
        int iHashCode2 = (this.recipient.hashCode() + ((this.sender.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        c cVar = this.reason;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTransactionPocketId() {
        return this.transactionPocketId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTransactionWalletId() {
        return this.transactionWalletId;
    }
}
