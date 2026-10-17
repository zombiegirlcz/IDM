package bjk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u001b\t\u0005\u000e\u0014\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\t\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\u0018\u0010%R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011¨\u0006+"}, d2 = {"Lbjk/y0$b;", "Lbjk/y0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "i", "title", "", "Lbjk/y0$b$f;", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "titleContent", "Lbjk/y0$b$c;", "d", "Lbjk/y0$b$c;", "()Lbjk/y0$b$c;", "description", "e", "h", "subtitle", "f", "deeplink", "Lbjk/y0$b$b;", "g", "Lbjk/y0$b$b;", "()Lbjk/y0$b$b;", "background", "style", "Lbjk/y0$b$e;", "Lbjk/y0$b$e;", "()Lbjk/y0$b$e;", "headerAction", "Lbjk/y0$b$a;", "menuActions", "k", "actionPanel", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("titleContent")
        private final List<f> titleContent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        private final c description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("background")
        private final C0109b background;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        private final String style;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("headerAction")
        private final e headerAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("menuActions")
        private final List<a> menuActions;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("actionPanel")
        private final List<a> actionPanel;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0013"}, d2 = {"Lbjk/y0$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "Lbjk/y0$b$a$a;", "b", "Lbjk/y0$b$a$a;", "c", "()Lbjk/y0$b$a$a;", "icon", "e", "label", "deeplink", "animation", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final C0108a icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            private final String label;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("animation")
            private final String animation;

            /* JADX INFO: renamed from: bjk.y0$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lbjk/y0$b$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "url", "b", "assetName", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "dot", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0108a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("url")
                private final String url;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("assetName")
                private final String assetName;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("dot")
                private final Boolean dot;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAssetName() {
                    return this.assetName;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Boolean getDot() {
                    return this.dot;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0108a)) {
                        return false;
                    }
                    C0108a c0108a = (C0108a) obj2;
                    return Intrinsics.f(this.url, c0108a.url) && Intrinsics.f(this.assetName, c0108a.assetName) && Intrinsics.f(this.dot, c0108a.dot);
                }

                public final int hashCode() {
                    String str = this.url;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.assetName;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Boolean bool = this.dot;
                    return iHashCode2 + (bool != null ? bool.hashCode() : 0);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAnimation() {
                return this.animation;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C0108a getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.deeplink, aVar.deeplink) && Intrinsics.f(this.animation, aVar.animation);
            }

            public final int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                C0108a c0108a = this.icon;
                int iHashCode2 = (iHashCode + (c0108a == null ? 0 : c0108a.hashCode())) * 31;
                String str2 = this.label;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.deeplink;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.animation;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: bjk.y0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lbjk/y0$b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "code", "c", "d", "urlLight", "urlDark", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0109b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("code")
            private final String code;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("urlLight")
            private final String urlLight;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("urlDark")
            private final String urlDark;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getUrlDark() {
                return this.urlDark;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getUrlLight() {
                return this.urlLight;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0109b)) {
                    return false;
                }
                C0109b c0109b = (C0109b) obj2;
                return Intrinsics.f(this.type, c0109b.type) && Intrinsics.f(this.code, c0109b.code) && Intrinsics.f(this.urlLight, c0109b.urlLight) && Intrinsics.f(this.urlDark, c0109b.urlDark);
            }

            public final int hashCode() {
                String str = this.type;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.code;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.urlLight;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.urlDark;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"Lbjk/y0$b$c;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/h;", "a", "Lbjk/h;", "b", "()Lbjk/h;", "icon", "Ljava/lang/String;", "c", "primary", "d", "primaryColor", "e", "secondary", "f", "secondaryColor", "g", "trailingIcon", "Lbjk/y0$b$d;", "Lbjk/y0$b$d;", "()Lbjk/y0$b$d;", "action", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final h icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("primary")
            private final String primary;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("primaryColor")
            private final String primaryColor;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("secondary")
            private final String secondary;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("secondaryColor")
            private final String secondaryColor;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("trailingIcon")
            private final h trailingIcon;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("action")
            private final d action;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final h getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getPrimary() {
                return this.primary;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getPrimaryColor() {
                return this.primaryColor;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getSecondary() {
                return this.secondary;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.icon, cVar.icon) && Intrinsics.f(this.primary, cVar.primary) && Intrinsics.f(this.primaryColor, cVar.primaryColor) && Intrinsics.f(this.secondary, cVar.secondary) && Intrinsics.f(this.secondaryColor, cVar.secondaryColor) && Intrinsics.f(this.trailingIcon, cVar.trailingIcon) && Intrinsics.f(this.action, cVar.action);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getSecondaryColor() {
                return this.secondaryColor;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final h getTrailingIcon() {
                return this.trailingIcon;
            }

            public final int hashCode() {
                h hVar = this.icon;
                int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
                String str = this.primary;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.primaryColor;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.secondary;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.secondaryColor;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                h hVar2 = this.trailingIcon;
                int iHashCode6 = (iHashCode5 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
                d dVar = this.action;
                return iHashCode6 + (dVar != null ? dVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbjk/y0$b$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.deeplink, ((d) obj2).deeplink);
            }

            public final int hashCode() {
                String str = this.deeplink;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }
        }

        public static abstract class e {

            @NotNull
            public static final a Companion = new a();

            public static final class a {
                private a() {
                }
            }

            /* JADX INFO: renamed from: bjk.y0$b$e$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbjk/y0$b$e$b;", "Lbjk/y0$b$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "c", "label", "Lbjk/h;", "Lbjk/h;", "()Lbjk/h;", "icon", "d", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0110b extends e {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("icon")
                private final h icon;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                @lg.b("deeplink")
                private final String deeplink;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final h getIcon() {
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
                    if (!(obj2 instanceof C0110b)) {
                        return false;
                    }
                    C0110b c0110b = (C0110b) obj2;
                    return Intrinsics.f(this.type, c0110b.type) && Intrinsics.f(this.label, c0110b.label) && Intrinsics.f(this.icon, c0110b.icon) && Intrinsics.f(this.deeplink, c0110b.deeplink);
                }

                public final int hashCode() {
                    String str = this.type;
                    int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.label);
                    h hVar = this.icon;
                    int iHashCode = (iC + (hVar == null ? 0 : hVar.hashCode())) * 31;
                    String str2 = this.deeplink;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }
            }

            private e() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/y0$b$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "text", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
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
                if (!(obj2 instanceof f)) {
                    return false;
                }
                f fVar = (f) obj2;
                return Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.text, fVar.text);
            }

            public final int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.text;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getActionPanel() {
            return this.actionPanel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C0109b getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final e getHeaderAction() {
            return this.headerAction;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.titleContent, bVar.titleContent) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.deeplink, bVar.deeplink) && Intrinsics.f(this.background, bVar.background) && Intrinsics.f(this.style, bVar.style) && Intrinsics.f(this.headerAction, bVar.headerAction) && Intrinsics.f(this.menuActions, bVar.menuActions) && Intrinsics.f(this.actionPanel, bVar.actionPanel);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final List getMenuActions() {
            return this.menuActions;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int hashCode() {
            int iC = p.a.c(this.type.hashCode() * 31, 31, this.title);
            List<f> list = this.titleContent;
            int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
            c cVar = this.description;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deeplink;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C0109b c0109b = this.background;
            int iHashCode5 = (iHashCode4 + (c0109b == null ? 0 : c0109b.hashCode())) * 31;
            String str3 = this.style;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            e eVar = this.headerAction;
            int iHashCode7 = (iHashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            List<a> list2 = this.menuActions;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<a> list3 = this.actionPanel;
            return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final List getTitleContent() {
            return this.titleContent;
        }
    }

    private y0() {
    }
}
