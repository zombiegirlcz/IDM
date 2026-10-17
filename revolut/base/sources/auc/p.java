package auc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lauc/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "c", "subtitle", "", "Lauc/p$b;", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lauc/p$a;", "Lauc/p$a;", "()Lauc/p$a;", "button", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<b> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("button")
    private final a button;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lauc/p$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "deeplink", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        public a(String title, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.deeplink, aVar.deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lauc/p$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "icon", "b", "c", "title", "subtitle", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        @NotNull
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        public b(String icon, String title, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
            this.subtitle = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIcon() {
            return this.icon;
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
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle);
        }

        public final int hashCode() {
            int iC = p.a.c(this.icon.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    public p(String title, String str, ArrayList items, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subtitle = str;
        this.items = items;
        this.button = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.title, pVar.title) && Intrinsics.f(this.subtitle, pVar.subtitle) && Intrinsics.f(this.items, pVar.items) && Intrinsics.f(this.button, pVar.button);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        a aVar = this.button;
        return iD + (aVar != null ? aVar.hashCode() : 0);
    }
}
