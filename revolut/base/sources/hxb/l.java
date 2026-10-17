package hxb;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b \u0010+R\u001c\u00100\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b\u0016\u0010/R\u001c\u00104\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b\u0010\u00103R\u001a\u00108\u001a\u0002058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b\f\u00107R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b9\u0010=¨\u0006?"}, d2 = {"Lhxb/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "id", "b", "r", "title", "c", "p", "subtitle", "Lm1c/o1;", "d", "Lm1c/o1;", "j", "()Lm1c/o1;", "description", "Lhxb/l$a;", "e", "Lhxb/l$a;", "m", "()Lhxb/l$a;", "progress", "f", "k", "iconUrl", "g", "ctaText", "h", "ctaTextPreview", "i", "deeplink", "o", "state", "n", "reward", "campaignId", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "daysLeft", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "completionDate", "Lhxb/l$b;", "Lhxb/l$b;", "()Lhxb/l$b;", "claimDetails", "", "Z", "()Z", "canBeClaimed", "q", "activationAction", "", "Ljava/util/List;", "()Ljava/util/List;", "tags", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final o1 description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("progress")
    @NotNull
    private final a progress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("iconUrl")
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ctaText")
    @NotNull
    private final String ctaText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ctaTextPreview")
    private final String ctaTextPreview;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deeplink")
    private final String deeplink;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("reward")
    @NotNull
    private final String reward;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignId")
    @NotNull
    private final String campaignId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("daysLeft")
    private final Integer daysLeft;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("completionDate")
    private final Long completionDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("claimDetails")
    private final b claimDetails;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("canBeClaimed")
    private final boolean canBeClaimed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationAction")
    private final String activationAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    private final List<String> tags;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lhxb/l$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "", "I", "()I", "completedSteps", "c", "totalSteps", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("completedSteps")
        private final int completedSteps;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalSteps")
        private final int totalSteps;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCompletedSteps() {
            return this.completedSteps;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalSteps() {
            return this.totalSteps;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.text, aVar.text) && this.completedSteps == aVar.completedSteps && this.totalSteps == aVar.totalSteps;
        }

        public final int hashCode() {
            return Integer.hashCode(this.totalSteps) + j6.a.b(this.completedSteps, this.text.hashCode() * 31, 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lhxb/l$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "daysLeft", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "claimBy", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("daysLeft")
        private final int daysLeft;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("claimBy")
        @NotNull
        private final LocalDate claimBy;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getClaimBy() {
            return this.claimBy;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDaysLeft() {
            return this.daysLeft;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.daysLeft == bVar.daysLeft && Intrinsics.f(this.claimBy, bVar.claimBy);
        }

        public final int hashCode() {
            return this.claimBy.hashCode() + (Integer.hashCode(this.daysLeft) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationAction() {
        return this.activationAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanBeClaimed() {
        return this.canBeClaimed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getClaimDetails() {
        return this.claimDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getCompletionDate() {
        return this.completionDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.title, lVar.title) && Intrinsics.f(this.subtitle, lVar.subtitle) && Intrinsics.f(this.description, lVar.description) && Intrinsics.f(this.progress, lVar.progress) && Intrinsics.f(this.iconUrl, lVar.iconUrl) && Intrinsics.f(this.ctaText, lVar.ctaText) && Intrinsics.f(this.ctaTextPreview, lVar.ctaTextPreview) && Intrinsics.f(this.deeplink, lVar.deeplink) && Intrinsics.f(this.state, lVar.state) && Intrinsics.f(this.reward, lVar.reward) && Intrinsics.f(this.campaignId, lVar.campaignId) && Intrinsics.f(this.daysLeft, lVar.daysLeft) && Intrinsics.f(this.completionDate, lVar.completionDate) && Intrinsics.f(this.claimDetails, lVar.claimDetails) && this.canBeClaimed == lVar.canBeClaimed && Intrinsics.f(this.activationAction, lVar.activationAction) && Intrinsics.f(this.tags, lVar.tags);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCtaTextPreview() {
        return this.ctaTextPreview;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getDaysLeft() {
        return this.daysLeft;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.progress.hashCode() + ((this.description.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31)) * 31, 31, this.iconUrl), 31, this.ctaText);
        String str = this.ctaTextPreview;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deeplink;
        int iC2 = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.state), 31, this.reward), 31, this.campaignId);
        Integer num = this.daysLeft;
        int iHashCode2 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.completionDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        b bVar = this.claimDetails;
        int iC3 = j6.a.c((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.canBeClaimed);
        String str3 = this.activationAction;
        int iHashCode4 = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.tags;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final o1 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
