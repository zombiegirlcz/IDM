package m20;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010/\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001c\u00108\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010;\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.¨\u0006<"}, d2 = {"Lm20/q;", "", "", "toString", "()Ljava/lang/String;", "Lm20/m;", "a", "Lm20/m;", "getContext", "()Lm20/m;", "context", "b", "Ljava/lang/String;", "getTitleKey", "titleKey", "", "c", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "d", "getFaqPath", "faqPath", "e", "getLocalisedFaqPath", "localisedFaqPath", "Lm20/e;", "f", "Lm20/e;", "getEntryPoint", "()Lm20/e;", "entryPoint", "g", "getChatSource", "chatSource", "", "h", "Ljava/lang/Boolean;", "getSingleFeed", "()Ljava/lang/Boolean;", "singleFeed", "Ljava/util/UUID;", "i", "Ljava/util/UUID;", "getFeedId", "()Ljava/util/UUID;", "feedId", "j", "getMessageReplyToId", "messageReplyToId", "Lm20/p;", "k", "Lm20/p;", "getFirstMessage", "()Lm20/p;", "firstMessage", "l", "getMessageCorrelationId", "messageCorrelationId", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("context")
    private final m context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("titleKey")
    private final String titleKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("faqPath")
    private final List<String> faqPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("localisedFaqPath")
    private final List<String> localisedFaqPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("entryPoint")
    private final e entryPoint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    private final String chatSource;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("singleFeed")
    private final Boolean singleFeed;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("feedId")
    private final UUID feedId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("replyToMessageId")
    private final UUID messageReplyToId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("payload")
    private final p firstMessage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("messageCorrelationId")
    private final UUID messageCorrelationId;

    public q(m mVar, String str, List list, ArrayList arrayList, ArrayList arrayList2, e eVar, String str2, Boolean bool, UUID uuid, UUID uuid2, p pVar, UUID uuid3) {
        this.context = mVar;
        this.titleKey = str;
        this.tags = list;
        this.faqPath = arrayList;
        this.localisedFaqPath = arrayList2;
        this.entryPoint = eVar;
        this.chatSource = str2;
        this.singleFeed = bool;
        this.feedId = uuid;
        this.messageReplyToId = uuid2;
        this.firstMessage = pVar;
        this.messageCorrelationId = uuid3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.context, qVar.context) && Intrinsics.f(this.titleKey, qVar.titleKey) && Intrinsics.f(this.tags, qVar.tags) && Intrinsics.f(this.faqPath, qVar.faqPath) && Intrinsics.f(this.localisedFaqPath, qVar.localisedFaqPath) && Intrinsics.f(this.entryPoint, qVar.entryPoint) && Intrinsics.f(this.chatSource, qVar.chatSource) && Intrinsics.f(this.singleFeed, qVar.singleFeed) && Intrinsics.f(this.feedId, qVar.feedId) && Intrinsics.f(this.messageReplyToId, qVar.messageReplyToId) && Intrinsics.f(this.firstMessage, qVar.firstMessage) && Intrinsics.f(this.messageCorrelationId, qVar.messageCorrelationId);
    }

    public final int hashCode() {
        m mVar = this.context;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        String str = this.titleKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.faqPath;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.localisedFaqPath;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        e eVar = this.entryPoint;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str2 = this.chatSource;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.singleFeed;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        UUID uuid = this.feedId;
        int iHashCode9 = (iHashCode8 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.messageReplyToId;
        int iHashCode10 = (iHashCode9 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        p pVar = this.firstMessage;
        int iHashCode11 = (iHashCode10 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        UUID uuid3 = this.messageCorrelationId;
        return iHashCode11 + (uuid3 != null ? uuid3.hashCode() : 0);
    }
}
