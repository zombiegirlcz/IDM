package ljk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lljk/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        public a(String label, String deeplink) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.label = label;
            this.deeplink = deeplink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.deeplink, aVar.deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode() + (this.label.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u001b"}, d2 = {"Lljk/d$a0;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "getType", "type", "c", "f", "title", "d", "description", "Lljk/d$r;", "Lljk/d$r;", "()Lljk/d$r;", "icon", "Lljk/d$d;", "Lljk/d$d;", "()Lljk/d$d;", "badge", "g", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a0 extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("icon")
        private final r icon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("badge")
        private final C1108d badge;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        public a0(String str, String str2, String str3, r rVar, C1108d c1108d, String str4) {
            Intrinsics.checkNotNullParameter("TILE", "type");
            this.id = str;
            this.type = "TILE";
            this.title = str2;
            this.description = str3;
            this.icon = rVar;
            this.badge = c1108d;
            this.deeplink = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1108d getBadge() {
            return this.badge;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final r getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj2;
            return Intrinsics.f(this.id, a0Var.id) && Intrinsics.f(this.type, a0Var.type) && Intrinsics.f(this.title, a0Var.title) && Intrinsics.f(this.description, a0Var.description) && Intrinsics.f(this.icon, a0Var.icon) && Intrinsics.f(this.badge, a0Var.badge) && Intrinsics.f(this.deeplink, a0Var.deeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            r rVar = this.icon;
            int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            C1108d c1108d = this.badge;
            int iHashCode4 = (iHashCode3 + (c1108d == null ? 0 : c1108d.hashCode())) * 31;
            String str4 = this.deeplink;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lljk/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        @NotNull
        private final String url;

        public b(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.url = url2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.url, ((b) obj2).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lljk/d$b0;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "getType", "type", "", "Lljk/d$b0$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "steps", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b0 extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("steps")
        @NotNull
        private final List<a> steps;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lljk/d$b0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "description", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            public a(String title, String description) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.title = title;
                this.description = description;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description);
            }

            public final int hashCode() {
                return this.description.hashCode() + (this.title.hashCode() * 31);
            }
        }

        public b0(String id10, ArrayList steps) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter("TIMELINE", "type");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.id = id10;
            this.type = "TIMELINE";
            this.steps = steps;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getSteps() {
            return this.steps;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj2;
            return Intrinsics.f(this.id, b0Var.id) && Intrinsics.f(this.type, b0Var.type) && Intrinsics.f(this.steps, b0Var.steps);
        }

        public final int hashCode() {
            return this.steps.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.type);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001b"}, d2 = {"Lljk/d$c;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "c", "f", "title", "d", "e", "subtitle", "Lljk/d$r;", "Lljk/d$r;", "()Lljk/d$r;", "icon", "Lljk/d$a;", "Lljk/d$a;", "()Lljk/d$a;", "primaryButton", "g", "secondaryButton", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("icon")
        private final r icon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("primaryButton")
        private final a primaryButton;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondaryButton")
        private final a secondaryButton;

        public c(String str, String str2, String str3, r rVar, a aVar, a aVar2) {
            Intrinsics.checkNotNullParameter("ACTION_WIDGET", "type");
            this.id = str;
            this.type = "ACTION_WIDGET";
            this.title = str2;
            this.subtitle = str3;
            this.icon = rVar;
            this.primaryButton = aVar;
            this.secondaryButton = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final r getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a getSecondaryButton() {
            return this.secondaryButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.subtitle, cVar.subtitle) && Intrinsics.f(this.icon, cVar.icon) && Intrinsics.f(this.primaryButton, cVar.primaryButton) && Intrinsics.f(this.secondaryButton, cVar.secondaryButton);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            r rVar = this.icon;
            int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            a aVar = this.primaryButton;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.secondaryButton;
            return iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lljk/d$c0;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "getType", "type", "", "Lljk/d$c0$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c0 extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<a> items;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lljk/d$c0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "text", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            public a(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.text, ((a) obj2).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }
        }

        public c0(String id10, ArrayList items) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter("UNORDERED_LIST", "type");
            Intrinsics.checkNotNullParameter(items, "items");
            this.id = id10;
            this.type = "UNORDERED_LIST";
            this.items = items;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj2;
            return Intrinsics.f(this.id, c0Var.id) && Intrinsics.f(this.type, c0Var.type) && Intrinsics.f(this.items, c0Var.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.type);
        }
    }

    /* JADX INFO: renamed from: ljk.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lljk/d$d;", "", "", "toString", "()Ljava/lang/String;", "Lljk/d$r;", "a", "Lljk/d$r;", "b", "()Lljk/d$r;", "icon", "Ljava/lang/String;", "color", "c", "text", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1108d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final r icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("color")
        private final String color;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        private final String text;

        public C1108d(String str, String str2, r rVar) {
            this.icon = rVar;
            this.color = str;
            this.text = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1108d)) {
                return false;
            }
            C1108d c1108d = (C1108d) obj2;
            return Intrinsics.f(this.icon, c1108d.icon) && Intrinsics.f(this.color, c1108d.color) && Intrinsics.f(this.text, c1108d.text);
        }

        public final int hashCode() {
            r rVar = this.icon;
            int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
            String str = this.color;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lljk/d$e;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        public e() {
            Intrinsics.checkNotNullParameter("BANNER", "type");
            this.type = "BANNER";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.type, ((e) obj2).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Lljk/d$f;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "getType", "type", "c", "f", "title", "description", "Lljk/d$s;", "e", "Lljk/d$s;", "()Lljk/d$s;", "image", "Lljk/d$r;", "Lljk/d$r;", "()Lljk/d$r;", "icon", "g", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("image")
        private final s image;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("icon")
        private final r icon;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        public f(String str, String str2, String str3, s sVar, r rVar, String str4) {
            Intrinsics.checkNotNullParameter("CARD", "type");
            this.id = str;
            this.type = "CARD";
            this.title = str2;
            this.description = str3;
            this.image = sVar;
            this.icon = rVar;
            this.deeplink = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final r getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final s getImage() {
            return this.image;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.image, fVar.image) && Intrinsics.f(this.icon, fVar.icon) && Intrinsics.f(this.deeplink, fVar.deeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            s sVar = this.image;
            int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            r rVar = this.icon;
            int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            String str4 = this.deeplink;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\f\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\t\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0005\u0010)R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b'\u0010\u0016¨\u0006."}, d2 = {"Lljk/d$g;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "getType", "type", "c", "h", "title", "d", "i", "titleColor", "", "Lljk/d$j;", "e", "Ljava/util/List;", "()Ljava/util/List;", "description", "Lljk/d$g$b;", "f", "Lljk/d$g$b;", "()Lljk/d$g$b;", "icon", "Lljk/d$d;", "Lljk/d$d;", "()Lljk/d$d;", "badge", "Lljk/d$a;", "Lljk/d$a;", "()Lljk/d$a;", "actionButton", "deeplink", "Lljk/d$g$a;", "j", "Lljk/d$g$a;", "()Lljk/d$g$a;", "accessory", "Lljk/d$g$c;", "k", "titleParams", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("titleColor")
        private final String titleColor;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final List<j> description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("icon")
        private final b icon;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("badge")
        private final C1108d badge;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("actionButton")
        private final a actionButton;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("accessory")
        private final a accessory;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("titleParams")
        private final List<c> titleParams;

        public static abstract class a {

            @NotNull
            public static final b Companion = new b();

            /* JADX INFO: renamed from: ljk.d$g$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\r"}, d2 = {"Lljk/d$g$a$a;", "Lljk/d$g$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "label", "c", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1109a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                @NotNull
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("deeplink")
                @NotNull
                private final String deeplink;

                public C1109a(String label, String deeplink) {
                    Intrinsics.checkNotNullParameter("BUTTON", "type");
                    Intrinsics.checkNotNullParameter(label, "label");
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    this.type = "BUTTON";
                    this.label = label;
                    this.deeplink = deeplink;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1109a)) {
                        return false;
                    }
                    C1109a c1109a = (C1109a) obj2;
                    return Intrinsics.f(this.type, c1109a.type) && Intrinsics.f(this.label, c1109a.label) && Intrinsics.f(this.deeplink, c1109a.deeplink);
                }

                public final int hashCode() {
                    return this.deeplink.hashCode() + p.a.c(this.type.hashCode() * 31, 31, this.label);
                }
            }

            public static final class b {
                private b() {
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lljk/d$g$a$c;", "Lljk/d$g$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "Lljk/d$g$a$d;", "b", "Lljk/d$g$a$d;", "()Lljk/d$g$a$d;", "icon", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class c extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                @NotNull
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("icon")
                private final C1110d icon;

                public c(C1110d c1110d) {
                    Intrinsics.checkNotNullParameter("ICON", "type");
                    this.type = "ICON";
                    this.icon = c1110d;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final C1110d getIcon() {
                    return this.icon;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj2;
                    return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.icon, cVar.icon);
                }

                public final int hashCode() {
                    int iHashCode = this.type.hashCode() * 31;
                    C1110d c1110d = this.icon;
                    return iHashCode + (c1110d == null ? 0 : c1110d.hashCode());
                }
            }

            /* JADX INFO: renamed from: ljk.d$g$a$d, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\r"}, d2 = {"Lljk/d$g$a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "url", "c", "assetName", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1110d {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                private final String type = null;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("url")
                private final String url;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("assetName")
                private final String assetName;

                public C1110d(String str, String str2) {
                    this.url = str;
                    this.assetName = str2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAssetName() {
                    return this.assetName;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1110d)) {
                        return false;
                    }
                    C1110d c1110d = (C1110d) obj2;
                    return Intrinsics.f(this.type, c1110d.type) && Intrinsics.f(this.url, c1110d.url) && Intrinsics.f(this.assetName, c1110d.assetName);
                }

                public final int hashCode() {
                    String str = this.type;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.url;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.assetName;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\r"}, d2 = {"Lljk/d$g$a$e;", "Lljk/d$g$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "label", "c", "background", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class e extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                @NotNull
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                private final String label;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("background")
                private final String background;

                public e(String str, String str2) {
                    Intrinsics.checkNotNullParameter("TAG", "type");
                    this.type = "TAG";
                    this.label = str;
                    this.background = str2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getBackground() {
                    return this.background;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj2;
                    return Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.label, eVar.label) && Intrinsics.f(this.background, eVar.background);
                }

                public final int hashCode() {
                    int iHashCode = this.type.hashCode() * 31;
                    String str = this.label;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.background;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\r"}, d2 = {"Lljk/d$g$a$f;", "Lljk/d$g$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "primaryText", "c", "secondaryText", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class f extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                @NotNull
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("primaryText")
                private final String primaryText;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("secondaryText")
                private final String secondaryText;

                public f(String str, String str2) {
                    Intrinsics.checkNotNullParameter("TEXT", "type");
                    this.type = "TEXT";
                    this.primaryText = str;
                    this.secondaryText = str2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getPrimaryText() {
                    return this.primaryText;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getSecondaryText() {
                    return this.secondaryText;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj2;
                    return Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.primaryText, fVar.primaryText) && Intrinsics.f(this.secondaryText, fVar.secondaryText);
                }

                public final int hashCode() {
                    int iHashCode = this.type.hashCode() * 31;
                    String str = this.primaryText;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.secondaryText;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }
            }

            private a() {
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0018"}, d2 = {"Lljk/d$g$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "type", "b", "f", "url", "c", "assetName", "", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "progress", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "dot", "progressType", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("url")
            private final String url;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("assetName")
            private final String assetName;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("progress")
            private final Integer progress;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("dot")
            private final Boolean dot;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("progressType")
            private final String progressType;

            public b(String str, String str2, String str3, Integer num, Boolean bool, String str4) {
                this.type = str;
                this.url = str2;
                this.assetName = str3;
                this.progress = num;
                this.dot = bool;
                this.progressType = str4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAssetName() {
                return this.assetName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Boolean getDot() {
                return this.dot;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Integer getProgress() {
                return this.progress;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getProgressType() {
                return this.progressType;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.url, bVar.url) && Intrinsics.f(this.assetName, bVar.assetName) && Intrinsics.f(this.progress, bVar.progress) && Intrinsics.f(this.dot, bVar.dot) && Intrinsics.f(this.progressType, bVar.progressType);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final int hashCode() {
                String str = this.type;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.url;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.assetName;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.progress;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool = this.dot;
                int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str4 = this.progressType;
                return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lljk/d$g$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "color", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("color")
            private final String color;

            public c(String text, String str) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.color = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.text, cVar.text) && Intrinsics.f(this.color, cVar.color);
            }

            public final int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.color;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }
        }

        public g(String str, String str2, String str3, ArrayList description, b bVar, C1108d c1108d, a aVar, String str4, a aVar2, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter("CELL_BANNER", "type");
            Intrinsics.checkNotNullParameter(description, "description");
            this.id = str;
            this.type = "CELL_BANNER";
            this.title = str2;
            this.titleColor = str3;
            this.description = description;
            this.icon = bVar;
            this.badge = c1108d;
            this.actionButton = aVar;
            this.deeplink = str4;
            this.accessory = aVar2;
            this.titleParams = arrayList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAccessory() {
            return this.accessory;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getActionButton() {
            return this.actionButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C1108d getBadge() {
            return this.badge;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final List getDescription() {
            return this.description;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.titleColor, gVar.titleColor) && Intrinsics.f(this.description, gVar.description) && Intrinsics.f(this.icon, gVar.icon) && Intrinsics.f(this.badge, gVar.badge) && Intrinsics.f(this.actionButton, gVar.actionButton) && Intrinsics.f(this.deeplink, gVar.deeplink) && Intrinsics.f(this.accessory, gVar.accessory) && Intrinsics.f(this.titleParams, gVar.titleParams);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.titleColor;
            int iD = p.a.d((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.description);
            b bVar = this.icon;
            int iHashCode2 = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
            C1108d c1108d = this.badge;
            int iHashCode3 = (iHashCode2 + (c1108d == null ? 0 : c1108d.hashCode())) * 31;
            a aVar = this.actionButton;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str4 = this.deeplink;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            a aVar2 = this.accessory;
            int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            List<c> list = this.titleParams;
            return iHashCode6 + (list != null ? list.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final List getTitleParams() {
            return this.titleParams;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lljk/d$h;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "c", "title", "Lljk/d$i;", "d", "Lljk/d$i;", "()Lljk/d$i;", "description", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("descriptionOptions")
        private final i description;

        public h(String str, String title, i iVar) {
            Intrinsics.checkNotNullParameter("CELL_TUPLE", "type");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = str;
            this.type = "CELL_TUPLE";
            this.title = title;
            this.description = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.type, hVar.type) && Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.description, hVar.description);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.title);
            i iVar = this.description;
            return iC + (iVar != null ? iVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lljk/d$i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "iconAssetName", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String iconAssetName;

        public i(String str, String str2) {
            this.text = str;
            this.iconAssetName = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIconAssetName() {
            return this.iconAssetName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.text, iVar.text) && Intrinsics.f(this.iconAssetName, iVar.iconAssetName);
        }

        public final int hashCode() {
            String str = this.text;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconAssetName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lljk/d$j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "Lljk/d$b;", "Lljk/d$b;", "()Lljk/d$b;", "action", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        private final b action;

        public j(String text, b bVar) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.text, jVar.text) && Intrinsics.f(this.action, jVar.action);
        }

        public final int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            b bVar = this.action;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lljk/d$k;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "getType", "type", "c", "title", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<d> items;

        public k(String str, String str2, ArrayList items) {
            Intrinsics.checkNotNullParameter("EXPANSION_AREA", "type");
            Intrinsics.checkNotNullParameter(items, "items");
            this.id = str;
            this.type = "EXPANSION_AREA";
            this.title = str2;
            this.items = items;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.type, kVar.type) && Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.items, kVar.items);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            return this.items.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\""}, d2 = {"Lljk/d$l;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "getType", "type", "c", "h", "title", "d", "g", "subtitle", "description", "Lljk/d$r;", "f", "Lljk/d$r;", "()Lljk/d$r;", "icon", "Lljk/d$d;", "Lljk/d$d;", "()Lljk/d$d;", "badge", "Lljk/d$l$a;", "Lljk/d$l$a;", "()Lljk/d$l$a;", "primaryButton", "i", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("icon")
        private final r icon;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("badge")
        private final C1108d badge;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("primaryButton")
        private final a primaryButton;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lljk/d$l$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "label", "Lljk/d$r;", "Lljk/d$r;", "()Lljk/d$r;", "icon", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            @NotNull
            private final String label;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final r icon;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("deeplink")
            @NotNull
            private final String deeplink;

            public a(String str, String label, r rVar, String deeplink) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.id = str;
                this.label = label;
                this.icon = rVar;
                this.deeplink = deeplink;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final r getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.deeplink, aVar.deeplink);
            }

            public final int hashCode() {
                String str = this.id;
                int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.label);
                r rVar = this.icon;
                return this.deeplink.hashCode() + ((iC + (rVar != null ? rVar.hashCode() : 0)) * 31);
            }
        }

        public l(String str, String str2, String str3, String str4, r rVar, C1108d c1108d, a aVar, String str5) {
            Intrinsics.checkNotNullParameter("FEATURED_ACTION_WIDGET", "type");
            this.id = str;
            this.type = "FEATURED_ACTION_WIDGET";
            this.title = str2;
            this.subtitle = str3;
            this.description = str4;
            this.icon = rVar;
            this.badge = c1108d;
            this.primaryButton = aVar;
            this.deeplink = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1108d getBadge() {
            return this.badge;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final r getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof l)) {
                return false;
            }
            l lVar = (l) obj2;
            return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.type, lVar.type) && Intrinsics.f(this.title, lVar.title) && Intrinsics.f(this.subtitle, lVar.subtitle) && Intrinsics.f(this.description, lVar.description) && Intrinsics.f(this.icon, lVar.icon) && Intrinsics.f(this.badge, lVar.badge) && Intrinsics.f(this.primaryButton, lVar.primaryButton) && Intrinsics.f(this.deeplink, lVar.deeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.description;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            r rVar = this.icon;
            int iHashCode4 = (iHashCode3 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            C1108d c1108d = this.badge;
            int iHashCode5 = (iHashCode4 + (c1108d == null ? 0 : c1108d.hashCode())) * 31;
            a aVar = this.primaryButton;
            int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.deeplink;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lljk/d$m;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "", "Lljk/d$j;", "c", "Ljava/util/List;", "()Ljava/util/List;", "description", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final List<j> description;

        public m(String str, ArrayList description) {
            Intrinsics.checkNotNullParameter("FOOTER", "type");
            Intrinsics.checkNotNullParameter(description, "description");
            this.id = str;
            this.type = "FOOTER";
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof m)) {
                return false;
            }
            m mVar = (m) obj2;
            return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.type, mVar.type) && Intrinsics.f(this.description, mVar.description);
        }

        public final int hashCode() {
            String str = this.id;
            return this.description.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lljk/d$n;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "c", "d", "title", "", "Lljk/d$n$a;", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lljk/d$a;", "e", "Lljk/d$a;", "()Lljk/d$a;", "action", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<a> items;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("action")
        private final a action;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0016"}, d2 = {"Lljk/d$n$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "e", "title", "Lljk/d$r;", "c", "Lljk/d$r;", "()Lljk/d$r;", "icon", "Lljk/d$d;", "Lljk/d$d;", "()Lljk/d$d;", "badge", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final r icon;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("badge")
            private final C1108d badge;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            public a(String str, String str2, r rVar, C1108d c1108d, String str3) {
                this.id = str;
                this.title = str2;
                this.icon = rVar;
                this.badge = c1108d;
                this.deeplink = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C1108d getBadge() {
                return this.badge;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final r getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.badge, aVar.badge) && Intrinsics.f(this.deeplink, aVar.deeplink);
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.title;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                r rVar = this.icon;
                int iHashCode3 = (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
                C1108d c1108d = this.badge;
                int iHashCode4 = (iHashCode3 + (c1108d == null ? 0 : c1108d.hashCode())) * 31;
                String str3 = this.deeplink;
                return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
            }
        }

        public n(String str, String str2, ArrayList items, a aVar) {
            Intrinsics.checkNotNullParameter("GRID", "type");
            Intrinsics.checkNotNullParameter(items, "items");
            this.id = str;
            this.type = "GRID";
            this.title = str2;
            this.items = items;
            this.action = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof n)) {
                return false;
            }
            n nVar = (n) obj2;
            return Intrinsics.f(this.id, nVar.id) && Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.title, nVar.title) && Intrinsics.f(this.items, nVar.items) && Intrinsics.f(this.action, nVar.action);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iD = p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items);
            a aVar = this.action;
            return iD + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lljk/d$o;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "e", "title", "c", "description", "Lljk/d$s;", "d", "Lljk/d$s;", "()Lljk/d$s;", "image", "deeplink", "Lljk/d$o$a;", "f", "Lljk/d$o$a;", "()Lljk/d$o$a;", "action", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("image")
        private final s image;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("action")
        private final a action;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lljk/d$o$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "label", "Lljk/d$r;", "b", "Lljk/d$r;", "()Lljk/d$r;", "icon", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            private final String label;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final r icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            public a(String str, String str2, r rVar) {
                this.label = str;
                this.icon = rVar;
                this.deeplink = str2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final r getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.deeplink, aVar.deeplink);
            }

            public final int hashCode() {
                String str = this.label;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                r rVar = this.icon;
                int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
                String str2 = this.deeplink;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }
        }

        public o(String str, String str2, s sVar, String str3, a aVar) {
            Intrinsics.checkNotNullParameter("HERO_CARD", "type");
            this.type = "HERO_CARD";
            this.title = str;
            this.description = str2;
            this.image = sVar;
            this.deeplink = str3;
            this.action = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof o)) {
                return false;
            }
            o oVar = (o) obj2;
            return Intrinsics.f(this.type, oVar.type) && Intrinsics.f(this.title, oVar.title) && Intrinsics.f(this.description, oVar.description) && Intrinsics.f(this.image, oVar.image) && Intrinsics.f(this.deeplink, oVar.deeplink) && Intrinsics.f(this.action, oVar.action);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            s sVar = this.image;
            int iHashCode4 = (iHashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            String str3 = this.deeplink;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            a aVar = this.action;
            return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lljk/d$p;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "", "Lljk/d$p$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttons")
        private final List<a> buttons;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lljk/d$p$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "c", "label", "deeplink", "d", "style", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            private final String label;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("style")
            private final String style;

            public a(String str, String str2, String str3, String str4) {
                this.id = str;
                this.label = str2;
                this.deeplink = str3;
                this.style = str4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.deeplink, aVar.deeplink) && Intrinsics.f(this.style, aVar.style);
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.label;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.deeplink;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.style;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        public p(String str, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter("HORIZONTAL_BUTTONS", "type");
            this.id = str;
            this.type = "HORIZONTAL_BUTTONS";
            this.buttons = arrayList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getButtons() {
            return this.buttons;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof p)) {
                return false;
            }
            p pVar = (p) obj2;
            return Intrinsics.f(this.id, pVar.id) && Intrinsics.f(this.type, pVar.type) && Intrinsics.f(this.buttons, pVar.buttons);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            List<a> list = this.buttons;
            return iC + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001c¨\u0006\u001e"}, d2 = {"Lljk/d$q;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "getType", "type", "c", "f", "title", "Lljk/d$r;", "Lljk/d$r;", "()Lljk/d$r;", "icon", "e", "style", "Lljk/d$a;", "Lljk/d$a;", "()Lljk/d$a;", "action", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "content", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class q extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("icon")
        private final r icon;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("style")
        private final String style;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("action")
        private final a action;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        private final List<d> content;

        public q(String str, String str2, r rVar, String str3, a aVar, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter("HORIZONTAL_SCROLLER", "type");
            this.id = str;
            this.type = "HORIZONTAL_SCROLLER";
            this.title = str2;
            this.icon = rVar;
            this.style = str3;
            this.action = aVar;
            this.content = arrayList;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final r getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof q)) {
                return false;
            }
            q qVar = (q) obj2;
            return Intrinsics.f(this.id, qVar.id) && Intrinsics.f(this.type, qVar.type) && Intrinsics.f(this.title, qVar.title) && Intrinsics.f(this.icon, qVar.icon) && Intrinsics.f(this.style, qVar.style) && Intrinsics.f(this.action, qVar.action) && Intrinsics.f(this.content, qVar.content);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            r rVar = this.icon;
            int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
            String str3 = this.style;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            a aVar = this.action;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            List<d> list = this.content;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lljk/d$r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "url", "b", "assetName", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "progress", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetName")
        private final String assetName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("progress")
        private final Integer progress;

        public r(String str, Integer num, String str2) {
            this.url = str;
            this.assetName = str2;
            this.progress = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAssetName() {
            return this.assetName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof r)) {
                return false;
            }
            r rVar = (r) obj2;
            return Intrinsics.f(this.url, rVar.url) && Intrinsics.f(this.assetName, rVar.assetName) && Intrinsics.f(this.progress, rVar.progress);
        }

        public final int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.assetName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.progress;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lljk/d$s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        private final String url;

        public s(String str) {
            this.url = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof s) && Intrinsics.f(this.url, ((s) obj2).url);
        }

        public final int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006 "}, d2 = {"Lljk/d$t;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "getType", "type", "f", "title", "d", "e", "subtitle", "Lljk/d$s;", "Lljk/d$s;", "()Lljk/d$s;", "image", "Lljk/d$d;", "Lljk/d$d;", "()Lljk/d$d;", "badge", "", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isLocked", "h", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class t extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("image")
        private final s image;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("badge")
        private final C1108d badge;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("isLocked")
        private final Boolean isLocked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        public t(String str, String str2, String str3, s sVar, C1108d c1108d, Boolean bool, String str4) {
            Intrinsics.checkNotNullParameter("LARGE_CARD", "type");
            this.id = str;
            this.type = "LARGE_CARD";
            this.title = str2;
            this.subtitle = str3;
            this.image = sVar;
            this.badge = c1108d;
            this.isLocked = bool;
            this.deeplink = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1108d getBadge() {
            return this.badge;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof t)) {
                return false;
            }
            t tVar = (t) obj2;
            return Intrinsics.f(this.id, tVar.id) && Intrinsics.f(this.type, tVar.type) && Intrinsics.f(this.title, tVar.title) && Intrinsics.f(this.subtitle, tVar.subtitle) && Intrinsics.f(this.image, tVar.image) && Intrinsics.f(this.badge, tVar.badge) && Intrinsics.f(this.isLocked, tVar.isLocked) && Intrinsics.f(this.deeplink, tVar.deeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Boolean getIsLocked() {
            return this.isLocked;
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            String str2 = this.title;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            s sVar = this.image;
            int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            C1108d c1108d = this.badge;
            int iHashCode4 = (iHashCode3 + (c1108d == null ? 0 : c1108d.hashCode())) * 31;
            Boolean bool = this.isLocked;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.deeplink;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0005\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lljk/d$u;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "c", "title", "Lljk/d$u$a;", "Lljk/d$u$a;", "()Lljk/d$u$a;", "action", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class u extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        private final a action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<d> items;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lljk/d$u$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "c", "label", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            private final String label;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            public a(String str, String str2, String str3) {
                this.id = str;
                this.label = str2;
                this.deeplink = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.deeplink, aVar.deeplink);
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.label;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.deeplink;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }
        }

        public u(String str, a aVar, ArrayList items) {
            Intrinsics.checkNotNullParameter("LIST", "type");
            Intrinsics.checkNotNullParameter(items, "items");
            this.type = "LIST";
            this.title = str;
            this.action = aVar;
            this.items = items;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof u)) {
                return false;
            }
            u uVar = (u) obj2;
            return Intrinsics.f(this.type, uVar.type) && Intrinsics.f(this.title, uVar.title) && Intrinsics.f(this.action, uVar.action) && Intrinsics.f(this.items, uVar.items);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.action;
            return this.items.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lljk/d$v;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "Lljk/d$v$a;", "c", "Lljk/d$v$a;", "()Lljk/d$v$a;", "asset", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class v extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("asset")
        private final a asset;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lljk/d$v$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("url")
            private final String url;

            public a(String str, String str2) {
                this.type = str;
                this.url = str2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.url, aVar.url);
            }

            public final int hashCode() {
                String str = this.type;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.url;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }
        }

        public v(String str, a aVar) {
            Intrinsics.checkNotNullParameter("MEDIA", "type");
            this.id = str;
            this.type = "MEDIA";
            this.asset = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAsset() {
            return this.asset;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof v)) {
                return false;
            }
            v vVar = (v) obj2;
            return Intrinsics.f(this.id, vVar.id) && Intrinsics.f(this.type, vVar.type) && Intrinsics.f(this.asset, vVar.asset);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
            a aVar = this.asset;
            return iC + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lljk/d$w;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "", "Lljk/d$w$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pages", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class w extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pages")
        @NotNull
        private final List<a> pages;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lljk/d$w$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "title", "", "Lljk/d;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("items")
            @NotNull
            private final List<d> items;

            public a(String str, String title, ArrayList items) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                this.id = str;
                this.title = title;
                this.items = items;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getItems() {
                return this.items;
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
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.items, aVar.items);
            }

            public final int hashCode() {
                String str = this.id;
                return this.items.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
            }
        }

        public w(ArrayList pages) {
            Intrinsics.checkNotNullParameter("PAGER", "type");
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.type = "PAGER";
            this.pages = pages;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getPages() {
            return this.pages;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof w)) {
                return false;
            }
            w wVar = (w) obj2;
            return Intrinsics.f(this.type, wVar.type) && Intrinsics.f(this.pages, wVar.pages);
        }

        public final int hashCode() {
            return this.pages.hashCode() + (this.type.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lljk/d$x;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "getType", "type", "", "Lljk/d$j;", "c", "Ljava/util/List;", "()Ljava/util/List;", "text", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class x extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final List<j> text;

        public x(String str, ArrayList text) {
            Intrinsics.checkNotNullParameter("PLAIN_TEXT", "type");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = str;
            this.type = "PLAIN_TEXT";
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof x)) {
                return false;
            }
            x xVar = (x) obj2;
            return Intrinsics.f(this.id, xVar.id) && Intrinsics.f(this.type, xVar.type) && Intrinsics.f(this.text, xVar.text);
        }

        public final int hashCode() {
            String str = this.id;
            return this.text.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lljk/d$y;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "c", "label", "d", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class y extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        public y(String str, String label, String str2) {
            Intrinsics.checkNotNullParameter("BUTTON_PRIMARY", "type");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = str;
            this.type = "BUTTON_PRIMARY";
            this.label = label;
            this.deeplink = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof y)) {
                return false;
            }
            y yVar = (y) obj2;
            return Intrinsics.f(this.id, yVar.id) && Intrinsics.f(this.type, yVar.type) && Intrinsics.f(this.label, yVar.label) && Intrinsics.f(this.deeplink, yVar.deeplink);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.label);
            String str2 = this.deeplink;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lljk/d$z;", "Lljk/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "getType", "type", "c", "label", "d", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class z extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        public z(String str, String label, String str2) {
            Intrinsics.checkNotNullParameter("BUTTON_SECONDARY", "type");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = str;
            this.type = "BUTTON_SECONDARY";
            this.label = label;
            this.deeplink = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof z)) {
                return false;
            }
            z zVar = (z) obj2;
            return Intrinsics.f(this.id, zVar.id) && Intrinsics.f(this.type, zVar.type) && Intrinsics.f(this.label, zVar.label) && Intrinsics.f(this.deeplink, zVar.deeplink);
        }

        public final int hashCode() {
            String str = this.id;
            int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.label);
            String str2 = this.deeplink;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }
    }

    private d() {
    }
}
