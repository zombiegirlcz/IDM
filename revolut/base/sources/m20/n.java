package m20;

import i20.b0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import v30.c0;
import v30.s0;
import v30.u0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u0004R\u001a\u00104\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0010\u00103R\u001a\u00106\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b5\u00103R\u001c\u00108\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b\u0016\u00103R\u001c\u00109\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b\u001b\u00103R\u001c\u0010>\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010@\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b?\u0010=R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\b:\u0010CR\u001c\u0010H\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\b%\u0010GR\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010J\u001a\u0004\b7\u0010KR\u001c\u0010P\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010N\u001a\u0004\b\u000b\u0010OR\u001c\u0010T\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010R\u001a\u0004\b-\u0010SR\u001c\u0010X\u001a\u0004\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010V\u001a\u0004\b1\u0010WR\u001c\u0010Z\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0007\u001a\u0004\b\u001f\u0010\t¨\u0006["}, d2 = {"Lm20/n;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "i", "()Ljava/util/UUID;", "id", "b", "Ljava/lang/String;", "p", "title", "Lv30/s0;", "c", "Lv30/s0;", "n", "()Lv30/s0;", "state", "", "d", "I", "q", "()I", "unread", "e", "h", "firstUnreadMessageId", "Li20/b0;", "f", "Li20/b0;", "l", "()Li20/b0;", "lastMessage", "", "g", "Z", "s", "()Z", "isBot", "t", "isCloseable", "assigned", "j", "getLanguage", "language", "Lorg/joda/time/Instant;", "k", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "createdAt", "r", "updatedAt", "m", "dismissedAt", "dismissedCallTileAt", "o", "Ljava/lang/Boolean;", "u", "()Ljava/lang/Boolean;", "isDismissed", "v", "isReadOnly", "Lv30/u0;", "Lv30/u0;", "()Lv30/u0;", "ticketType", "Lv30/c0;", "Lv30/c0;", "()Lv30/c0;", "feedType", "Lm20/i;", "Lm20/i;", "()Lm20/i;", "rating", "Lm20/l;", "Lm20/l;", "()Lm20/l;", "category", "Lf20/a;", "Lf20/a;", "()Lf20/a;", "lastCall", "Lf20/b;", "Lf20/b;", "()Lf20/b;", "lastCallRequest", "w", "feedId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final s0 state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unread")
    private final int unread;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("firstUnreadMessageId")
    private final UUID firstUnreadMessageId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lastMessage")
    private final b0 lastMessage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("bot")
    private final boolean isBot;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("closeable")
    private final boolean isCloseable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("assigned")
    private final UUID assigned;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("language")
    @NotNull
    private final String language;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("createdAt")
    @NotNull
    private final Instant createdAt;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedAt")
    @NotNull
    private final Instant updatedAt;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientDismissedAt")
    private final Instant dismissedAt;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientDismissedCallTileAt")
    private final Instant dismissedCallTileAt;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("isDismissed")
    private final Boolean isDismissed;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("readOnly")
    private final Boolean isReadOnly;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketType")
    private final u0 ticketType;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedType")
    private final c0 feedType;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("rating")
    private final i rating;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    private final l category;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("lastCall")
    private final f20.a lastCall;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("lastCallRequest")
    private final f20.b lastCallRequest;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getAssigned() {
        return this.assigned;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getDismissedAt() {
        return this.dismissedAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getDismissedCallTileAt() {
        return this.dismissedCallTileAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.id, nVar.id) && Intrinsics.f(this.title, nVar.title) && this.state == nVar.state && this.unread == nVar.unread && Intrinsics.f(this.firstUnreadMessageId, nVar.firstUnreadMessageId) && Intrinsics.f(this.lastMessage, nVar.lastMessage) && this.isBot == nVar.isBot && this.isCloseable == nVar.isCloseable && Intrinsics.f(this.assigned, nVar.assigned) && Intrinsics.f(this.language, nVar.language) && Intrinsics.f(this.createdAt, nVar.createdAt) && Intrinsics.f(this.updatedAt, nVar.updatedAt) && Intrinsics.f(this.dismissedAt, nVar.dismissedAt) && Intrinsics.f(this.dismissedCallTileAt, nVar.dismissedCallTileAt) && Intrinsics.f(this.isDismissed, nVar.isDismissed) && Intrinsics.f(this.isReadOnly, nVar.isReadOnly) && this.ticketType == nVar.ticketType && this.feedType == nVar.feedType && Intrinsics.f(this.rating, nVar.rating) && Intrinsics.f(this.category, nVar.category) && Intrinsics.f(this.lastCall, nVar.lastCall) && Intrinsics.f(this.lastCallRequest, nVar.lastCallRequest) && Intrinsics.f(this.feedId, nVar.feedId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final UUID getFeedId() {
        return this.feedId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c0 getFeedType() {
        return this.feedType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final UUID getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iB = j6.a.b(this.unread, (this.state.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        UUID uuid = this.firstUnreadMessageId;
        int iHashCode2 = (iB + (uuid == null ? 0 : uuid.hashCode())) * 31;
        b0 b0Var = this.lastMessage;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31, 31, this.isBot), 31, this.isCloseable);
        UUID uuid2 = this.assigned;
        int iG = t61.a.g(this.updatedAt, t61.a.g(this.createdAt, p.a.c((iC + (uuid2 == null ? 0 : uuid2.hashCode())) * 31, 31, this.language), 31), 31);
        Instant instant = this.dismissedAt;
        int iHashCode3 = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.dismissedCallTileAt;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Boolean bool = this.isDismissed;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReadOnly;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        u0 u0Var = this.ticketType;
        int iHashCode7 = (iHashCode6 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        c0 c0Var = this.feedType;
        int iHashCode8 = (iHashCode7 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        i iVar = this.rating;
        int iHashCode9 = (iHashCode8 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.category;
        int iHashCode10 = (iHashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        f20.a aVar = this.lastCall;
        int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f20.b bVar = this.lastCallRequest;
        int iHashCode12 = (iHashCode11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        UUID uuid3 = this.feedId;
        return iHashCode12 + (uuid3 != null ? uuid3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f20.a getLastCall() {
        return this.lastCall;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f20.b getLastCallRequest() {
        return this.lastCallRequest;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b0 getLastMessage() {
        return this.lastMessage;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final i getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final s0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final u0 getTicketType() {
        return this.ticketType;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getUnread() {
        return this.unread;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsBot() {
        return this.isBot;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsCloseable() {
        return this.isCloseable;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getIsDismissed() {
        return this.isDismissed;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getIsReadOnly() {
        return this.isReadOnly;
    }
}
