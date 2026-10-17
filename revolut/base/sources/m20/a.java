package m20;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\u001d\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b\u0013\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u00102R\u001c\u00104\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u001f\u00102R\u001c\u0010:\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010<\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b;\u00109R\u001c\u0010=\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b6\u00102R\"\u0010B\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\b\u0018\u0010AR\u001c\u0010F\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\b\u0006\u0010ER\u001c\u0010J\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\b*\u0010I¨\u0006K"}, d2 = {"Lm20/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "i", "()Ljava/util/UUID;", "id", "b", "Ljava/lang/String;", "j", "name", "c", "m", "shortName", "", "d", "Z", "s", "()Z", "isBot", "e", "avatarUrl", "f", "o", "title", "g", "email", "h", "bio", "Lorg/joda/time/Instant;", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "firstMessage", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "chats", "", "k", "Ljava/lang/Float;", "l", "()Ljava/lang/Float;", "rating", "Lorg/joda/time/Period;", "Lorg/joda/time/Period;", "p", "()Lorg/joda/time/Period;", "totalResolution", "firstResponse", "", "n", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "wowReviews", "q", "totalReviews", "tenure", "", "Lm20/a$a;", "Ljava/util/List;", "()Ljava/util/List;", "compliments", "Lv30/c;", "Lv30/c;", "()Lv30/c;", "agentOnlineSessionState", "Lm20/b;", "Lm20/b;", "()Lm20/b;", "presenceState", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final UUID id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("shortName")
    private final String shortName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("chatbot")
    private final boolean isBot;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b(alternate = {"avatarUrl"}, value = "avatar_url")
    private final String avatarUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("bio")
    private final String bio;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("first_message")
    private final Instant firstMessage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("chats")
    private final Long chats;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("rating")
    private final Float rating;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("total_resolution")
    private final Period totalResolution;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("first_response")
    private final Period firstResponse;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("wow_reviews")
    private final Integer wowReviews;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("total_reviews")
    private final Integer totalReviews;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("tenure")
    private final Period tenure;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("compliments")
    private final List<C1144a> compliments;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("agentOnlineSessionState")
    private final v30.c agentOnlineSessionState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("presenceState")
    private final b presenceState;

    /* JADX INFO: renamed from: m20.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lm20/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "label", "b", "c", "iconUrl", "assetUrl", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "count", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "top", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1144a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon_url")
        @NotNull
        private final String iconUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("asset_url")
        private final String assetUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("count")
        private final Integer count;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("top")
        private final Boolean top;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAssetUrl() {
            return this.assetUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getTop() {
            return this.top;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1144a)) {
                return false;
            }
            C1144a c1144a = (C1144a) obj2;
            return Intrinsics.f(this.label, c1144a.label) && Intrinsics.f(this.iconUrl, c1144a.iconUrl) && Intrinsics.f(this.assetUrl, c1144a.assetUrl) && Intrinsics.f(this.count, c1144a.count) && Intrinsics.f(this.top, c1144a.top);
        }

        public final int hashCode() {
            int iC = p.a.c(this.label.hashCode() * 31, 31, this.iconUrl);
            String str = this.assetUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.count;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.top;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v30.c getAgentOnlineSessionState() {
        return this.agentOnlineSessionState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getChats() {
        return this.chats;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getCompliments() {
        return this.compliments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.shortName, aVar.shortName) && this.isBot == aVar.isBot && Intrinsics.f(this.avatarUrl, aVar.avatarUrl) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.email, aVar.email) && Intrinsics.f(this.bio, aVar.bio) && Intrinsics.f(this.firstMessage, aVar.firstMessage) && Intrinsics.f(this.chats, aVar.chats) && Intrinsics.f(this.rating, aVar.rating) && Intrinsics.f(this.totalResolution, aVar.totalResolution) && Intrinsics.f(this.firstResponse, aVar.firstResponse) && Intrinsics.f(this.wowReviews, aVar.wowReviews) && Intrinsics.f(this.totalReviews, aVar.totalReviews) && Intrinsics.f(this.tenure, aVar.tenure) && Intrinsics.f(this.compliments, aVar.compliments) && this.agentOnlineSessionState == aVar.agentOnlineSessionState && Intrinsics.f(this.presenceState, aVar.presenceState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Instant getFirstMessage() {
        return this.firstMessage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Period getFirstResponse() {
        return this.firstResponse;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.shortName;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBot);
        String str2 = this.avatarUrl;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bio;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Instant instant = this.firstMessage;
        int iHashCode5 = (iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
        Long l2 = this.chats;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.rating;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Period period = this.totalResolution;
        int iHashCode8 = (iHashCode7 + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.firstResponse;
        int iHashCode9 = (iHashCode8 + (period2 == null ? 0 : period2.hashCode())) * 31;
        Integer num = this.wowReviews;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalReviews;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Period period3 = this.tenure;
        int iHashCode12 = (iHashCode11 + (period3 == null ? 0 : period3.hashCode())) * 31;
        List<C1144a> list = this.compliments;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        v30.c cVar = this.agentOnlineSessionState;
        int iHashCode14 = (iHashCode13 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.presenceState;
        return iHashCode14 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getPresenceState() {
        return this.presenceState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Float getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Period getTenure() {
        return this.tenure;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Period getTotalResolution() {
        return this.totalResolution;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getTotalReviews() {
        return this.totalReviews;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getWowReviews() {
        return this.wowReviews;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsBot() {
        return this.isBot;
    }
}
