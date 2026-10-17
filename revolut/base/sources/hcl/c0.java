package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u000b\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\u0016\u0010&¨\u0006("}, d2 = {"Lhcl/c0;", "", "", "toString", "()Ljava/lang/String;", "Lnel/g;", "a", "Lnel/g;", "()Lnel/g;", "distributionPolicy", "", "b", "Z", "g", "()Z", "hedged", "Lhcl/c0$a;", "c", "Lhcl/c0$a;", "()Lhcl/c0$a;", "fundHouseId", "Ljel/s0;", "d", "Ljel/s0;", "e", "()Ljel/s0;", "fundRegion", "Ljel/w0;", "Ljel/w0;", "f", "()Ljel/w0;", "fundStrategy", "Ljel/w;", "Ljel/w;", "()Ljel/w;", "fundClass", "Lhcl/c0$b;", "Lhcl/c0$b;", "()Lhcl/c0$b;", "fundMetadata", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("distributionPolicy")
    @NotNull
    private final nel.g distributionPolicy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hedged")
    private final boolean hedged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundHouseId")
    @NotNull
    private final a fundHouseId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("region")
    private final jel.s0 fundRegion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("strategy")
    private final jel.w0 fundStrategy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fundClass")
    private final jel.w fundClass;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundMetadata")
    private final b fundMetadata;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lhcl/c0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "origin", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("origin")
        @NotNull
        private final String origin;

        public a(String value, String origin) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.value = value;
            this.origin = origin;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOrigin() {
            return this.origin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.origin, aVar.origin);
        }

        public final int hashCode() {
            return this.origin.hashCode() + (this.value.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lhcl/c0$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "", "b", "Z", "c", "()Z", "exclusive", "backgroundImageUrl", "animationVideoUrl", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("exclusive")
        private final boolean exclusive;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("backgroundImageURL")
        private final String backgroundImageUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("animationVideoURL")
        private final String animationVideoUrl;

        public b(String title, String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.exclusive = z;
            this.backgroundImageUrl = str;
            this.animationVideoUrl = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnimationVideoUrl() {
            return this.animationVideoUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getExclusive() {
            return this.exclusive;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.title, bVar.title) && this.exclusive == bVar.exclusive && Intrinsics.f(this.backgroundImageUrl, bVar.backgroundImageUrl) && Intrinsics.f(this.animationVideoUrl, bVar.animationVideoUrl);
        }

        public final int hashCode() {
            int iC = j6.a.c(this.title.hashCode() * 31, 31, this.exclusive);
            String str = this.backgroundImageUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.animationVideoUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public c0(nel.g distributionPolicy, boolean z, a fundHouseId, jel.s0 s0Var, jel.w0 w0Var, jel.w wVar, b bVar) {
        Intrinsics.checkNotNullParameter(distributionPolicy, "distributionPolicy");
        Intrinsics.checkNotNullParameter(fundHouseId, "fundHouseId");
        this.distributionPolicy = distributionPolicy;
        this.hedged = z;
        this.fundHouseId = fundHouseId;
        this.fundRegion = s0Var;
        this.fundStrategy = w0Var;
        this.fundClass = wVar;
        this.fundMetadata = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final nel.g getDistributionPolicy() {
        return this.distributionPolicy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jel.w getFundClass() {
        return this.fundClass;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getFundHouseId() {
        return this.fundHouseId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getFundMetadata() {
        return this.fundMetadata;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jel.s0 getFundRegion() {
        return this.fundRegion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.distributionPolicy == c0Var.distributionPolicy && this.hedged == c0Var.hedged && Intrinsics.f(this.fundHouseId, c0Var.fundHouseId) && this.fundRegion == c0Var.fundRegion && this.fundStrategy == c0Var.fundStrategy && this.fundClass == c0Var.fundClass && Intrinsics.f(this.fundMetadata, c0Var.fundMetadata);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jel.w0 getFundStrategy() {
        return this.fundStrategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHedged() {
        return this.hedged;
    }

    public final int hashCode() {
        int iHashCode = (this.fundHouseId.hashCode() + j6.a.c(this.distributionPolicy.hashCode() * 31, 31, this.hedged)) * 31;
        jel.s0 s0Var = this.fundRegion;
        int iHashCode2 = (iHashCode + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        jel.w0 w0Var = this.fundStrategy;
        int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        jel.w wVar = this.fundClass;
        int iHashCode4 = (iHashCode3 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        b bVar = this.fundMetadata;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }
}
