package k91;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\t\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lk91/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "e", "subtitle", "c", "backgroundImageUrl", "", "Lk91/b$a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "steps", "productOffer", "progress", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundImageUrl")
    @NotNull
    private final String backgroundImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<a> steps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("productOffer")
    @NotNull
    private final List<a> productOffer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("progressTracking")
    @NotNull
    private final List<a> progress;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lk91/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "subtitle", "logo", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("logo")
        private final String logo;

        public a(String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.logo = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.logo, aVar.logo);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logo;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public b(String title, String subtitle, String backgroundImageUrl, ArrayList steps, ArrayList productOffer, ArrayList progress) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(productOffer, "productOffer");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.title = title;
        this.subtitle = subtitle;
        this.backgroundImageUrl = backgroundImageUrl;
        this.steps = steps;
        this.productOffer = productOffer;
        this.progress = progress;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getProductOffer() {
        return this.productOffer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.backgroundImageUrl, bVar.backgroundImageUrl) && Intrinsics.f(this.steps, bVar.steps) && Intrinsics.f(this.productOffer, bVar.productOffer) && Intrinsics.f(this.progress, bVar.progress);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.progress.hashCode() + p.a.d(p.a.d(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.backgroundImageUrl), 31, this.steps), 31, this.productOffer);
    }
}
