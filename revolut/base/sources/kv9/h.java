package kv9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006*"}, d2 = {"Lkv9/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lkv9/k;", "b", "Lkv9/k;", "g", "()Lkv9/k;", "sender", "Lkv9/i;", "Lkv9/i;", "e", "()Lkv9/i;", "recipient", "d", "media", "", "J", "()J", "createdDate", "f", "j", "updatedDate", "Lkv9/j;", "Lkv9/j;", "i", "()Lkv9/j;", "type", "h", "state", "getTransactionId", "transactionId", "Lkv9/s;", "Lkv9/s;", "()Lkv9/s;", "relatedEntityDto", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sender")
    @NotNull
    private final k sender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final i recipient;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("media")
    private final String media;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final j type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("relatedEntity")
    private final s relatedEntityDto;

    public h(String id10, k sender, i recipient, String str, long j2, long j3, j jVar, String state, String str2, s sVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.sender = sender;
        this.recipient = recipient;
        this.media = str;
        this.createdDate = j2;
        this.updatedDate = j3;
        this.type = jVar;
        this.state = state;
        this.transactionId = str2;
        this.relatedEntityDto = sVar;
    }

    public static h a(h hVar, String str) {
        String id10 = hVar.id;
        k sender = hVar.sender;
        i recipient = hVar.recipient;
        long j2 = hVar.createdDate;
        long j3 = hVar.updatedDate;
        j jVar = hVar.type;
        String state = hVar.state;
        String str2 = hVar.transactionId;
        s sVar = hVar.relatedEntityDto;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(state, "state");
        return new h(id10, sender, recipient, str, j2, j3, jVar, state, str2, sVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMedia() {
        return this.media;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getRecipient() {
        return this.recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.sender, hVar.sender) && Intrinsics.f(this.recipient, hVar.recipient) && Intrinsics.f(this.media, hVar.media) && this.createdDate == hVar.createdDate && this.updatedDate == hVar.updatedDate && this.type == hVar.type && Intrinsics.f(this.state, hVar.state) && Intrinsics.f(this.transactionId, hVar.transactionId) && Intrinsics.f(this.relatedEntityDto, hVar.relatedEntityDto);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s getRelatedEntityDto() {
        return this.relatedEntityDto;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = (this.recipient.hashCode() + ((this.sender.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.media;
        int iC = a0.d.c(a0.d.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdDate), 31, this.updatedDate);
        j jVar = this.type;
        int iC2 = p.a.c((iC + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.state);
        String str2 = this.transactionId;
        int iHashCode2 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s sVar = this.relatedEntityDto;
        return iHashCode2 + (sVar != null ? sVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }
}
