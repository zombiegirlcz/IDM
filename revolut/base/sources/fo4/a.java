package fo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0015"}, d2 = {"Lfo4/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "e", "logoUrl", "c", "backgroundImageUrl", "Lfo4/a$a;", "d", "Lfo4/a$a;", "()Lfo4/a$a;", "badge", "deeplink", "analyticsRef", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoUrl")
    @NotNull
    private final String logoUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundImageUrl")
    @NotNull
    private final String backgroundImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("badge")
    @NotNull
    private final C0799a badge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("deeplink")
    @NotNull
    private final String deeplink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("analyticsRef")
    private final String analyticsRef;

    /* JADX INFO: renamed from: fo4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lfo4/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "text", "b", "type", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0799a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        public C0799a(String text, String type) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.text = text;
            this.type = type;
        }

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
            if (!(obj2 instanceof C0799a)) {
                return false;
            }
            C0799a c0799a = (C0799a) obj2;
            return Intrinsics.f(this.text, c0799a.text) && Intrinsics.f(this.type, c0799a.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + (this.text.hashCode() * 31);
        }
    }

    public a(String title, String logoUrl, String backgroundImageUrl, C0799a badge, String deeplink, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.title = title;
        this.logoUrl = logoUrl;
        this.backgroundImageUrl = backgroundImageUrl;
        this.badge = badge;
        this.deeplink = deeplink;
        this.analyticsRef = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsRef() {
        return this.analyticsRef;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C0799a getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.logoUrl, aVar.logoUrl) && Intrinsics.f(this.backgroundImageUrl, aVar.backgroundImageUrl) && Intrinsics.f(this.badge, aVar.badge) && Intrinsics.f(this.deeplink, aVar.deeplink) && Intrinsics.f(this.analyticsRef, aVar.analyticsRef);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c((this.badge.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.logoUrl), 31, this.backgroundImageUrl)) * 31, 31, this.deeplink);
        String str = this.analyticsRef;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
