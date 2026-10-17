package fcc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\t\u000e\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0005\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006#"}, d2 = {"Lfcc/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "d", "logo", "", "Lfcc/c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "categories", "h", "website", "Lfcc/e$b;", "Lfcc/e$b;", "f", "()Lfcc/e$b;", "reward", "Lfcc/e$c;", "Lfcc/e$c;", "g", "()Lfcc/e$c;", "shoppingOffer", "Lfcc/e$a;", "Lfcc/e$a;", "()Lfcc/e$a;", "badge", "instructionsId", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    @NotNull
    private final String logo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final List<fcc.c> categories;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("website")
    private final String website;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("reward")
    private final b reward;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("shoppingOffer")
    private final c shoppingOffer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("badge")
    private final a badge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("instructionsId")
    private final String instructionsId;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lfcc/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "text", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.text, aVar.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.type.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lfcc/e$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "()D", "revPointsMultiplier", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("revPointsMultiplier")
        private final double revPointsMultiplier;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getRevPointsMultiplier() {
            return this.revPointsMultiplier;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Double.compare(this.revPointsMultiplier, ((b) obj2).revPointsMultiplier) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.revPointsMultiplier);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lfcc/e$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "brandId", "b", "campaignId", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("brandId")
        @NotNull
        private final String brandId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("campaignId")
        @NotNull
        private final String campaignId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBrandId() {
            return this.brandId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCampaignId() {
            return this.campaignId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.brandId, cVar.brandId) && Intrinsics.f(this.campaignId, cVar.campaignId);
        }

        public final int hashCode() {
            return this.campaignId.hashCode() + (this.brandId.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstructionsId() {
        return this.instructionsId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.name, eVar.name) && Intrinsics.f(this.logo, eVar.logo) && Intrinsics.f(this.categories, eVar.categories) && Intrinsics.f(this.website, eVar.website) && Intrinsics.f(this.reward, eVar.reward) && Intrinsics.f(this.shoppingOffer, eVar.shoppingOffer) && Intrinsics.f(this.badge, eVar.badge) && Intrinsics.f(this.instructionsId, eVar.instructionsId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getShoppingOffer() {
        return this.shoppingOffer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWebsite() {
        return this.website;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.name.hashCode() * 31, 31, this.logo), 31, this.categories);
        String str = this.website;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.reward;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.shoppingOffer;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.badge;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.instructionsId;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
