package ljk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ljk.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0006\u001b\t\u0005\u000e\u0014\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\t\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\u0018\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R \u0010*\u001a\b\u0012\u0004\u0012\u00020'0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011¨\u0006+"}, d2 = {"Lljk/m$b;", "Lljk/m;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "i", "title", "", "Lljk/m$b$f;", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "titleContent", "Lljk/m$b$c;", "d", "Lljk/m$b$c;", "()Lljk/m$b$c;", "description", "e", "h", "subtitle", "f", "deeplink", "Lljk/m$b$b;", "g", "Lljk/m$b$b;", "()Lljk/m$b$b;", "background", "style", "Lljk/m$b$e;", "Lljk/m$b$e;", "()Lljk/m$b$e;", "headerAction", "Lljk/m$b$a;", "menuActions", "k", "actionPanel", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends m {

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
        private final C1113b background;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        private final String style;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("headerAction")
        private final e headerAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("menuActions")
        @NotNull
        private final List<a> menuActions;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("actionPanel")
        @NotNull
        private final List<a> actionPanel;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0013"}, d2 = {"Lljk/m$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "Lljk/m$b$a$a;", "b", "Lljk/m$b$a$a;", "c", "()Lljk/m$b$a$a;", "icon", "e", "label", "deeplink", "animation", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final C1112a icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            private final String label;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("deeplink")
            @NotNull
            private final String deeplink;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("animation")
            private final String animation;

            /* JADX INFO: renamed from: ljk.m$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lljk/m$b$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "url", "b", "assetName", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "dot", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1112a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("url")
                private final String url;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("assetName")
                private final String assetName;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("dot")
                private final Boolean dot;

                public C1112a(String str, String str2, Boolean bool) {
                    this.url = str;
                    this.assetName = str2;
                    this.dot = bool;
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
                public final String getUrl() {
                    return this.url;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1112a)) {
                        return false;
                    }
                    C1112a c1112a = (C1112a) obj2;
                    return Intrinsics.f(this.url, c1112a.url) && Intrinsics.f(this.assetName, c1112a.assetName) && Intrinsics.f(this.dot, c1112a.dot);
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

            public a(String str, C1112a c1112a, String str2, String deeplink, String str3) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.id = str;
                this.icon = c1112a;
                this.label = str2;
                this.deeplink = deeplink;
                this.animation = str3;
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
            public final C1112a getIcon() {
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
                C1112a c1112a = this.icon;
                int iHashCode2 = (iHashCode + (c1112a == null ? 0 : c1112a.hashCode())) * 31;
                String str2 = this.label;
                int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.deeplink);
                String str3 = this.animation;
                return iC + (str3 != null ? str3.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: ljk.m$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lljk/m$b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "code", "c", "d", "urlLight", "urlDark", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1113b {

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

            public C1113b(String str, String str2, String str3, String str4) {
                this.type = str;
                this.code = str2;
                this.urlLight = str3;
                this.urlDark = str4;
            }

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
                if (!(obj2 instanceof C1113b)) {
                    return false;
                }
                C1113b c1113b = (C1113b) obj2;
                return Intrinsics.f(this.type, c1113b.type) && Intrinsics.f(this.code, c1113b.code) && Intrinsics.f(this.urlLight, c1113b.urlLight) && Intrinsics.f(this.urlDark, c1113b.urlDark);
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

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"Lljk/m$b$c;", "", "", "toString", "()Ljava/lang/String;", "Lljk/d$r;", "a", "Lljk/d$r;", "b", "()Lljk/d$r;", "icon", "Ljava/lang/String;", "c", "primary", "d", "primaryColor", "e", "secondary", "f", "secondaryColor", "g", "trailingIcon", "Lljk/m$b$d;", "Lljk/m$b$d;", "()Lljk/m$b$d;", "action", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final d.r icon;

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
            private final d.r trailingIcon;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("action")
            private final d action;

            public c(d.r rVar, String str, String str2, String str3, String str4, d.r rVar2, d dVar) {
                this.icon = rVar;
                this.primary = str;
                this.primaryColor = str2;
                this.secondary = str3;
                this.secondaryColor = str4;
                this.trailingIcon = rVar2;
                this.action = dVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d.r getIcon() {
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
            public final d.r getTrailingIcon() {
                return this.trailingIcon;
            }

            public final int hashCode() {
                d.r rVar = this.icon;
                int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
                String str = this.primary;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.primaryColor;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.secondary;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.secondaryColor;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                d.r rVar2 = this.trailingIcon;
                int iHashCode6 = (iHashCode5 + (rVar2 == null ? 0 : rVar2.hashCode())) * 31;
                d dVar = this.action;
                return iHashCode6 + (dVar != null ? dVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lljk/m$b$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            public d(String str) {
                this.deeplink = str;
            }

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

            /* JADX INFO: renamed from: ljk.m$b$e$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lljk/m$b$e$b;", "Lljk/m$b$e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "c", "label", "Lljk/d$r;", "Lljk/d$r;", "()Lljk/d$r;", "icon", "d", "deeplink", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1114b extends e {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @lg.b("icon")
                private final d.r icon;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                @lg.b("deeplink")
                private final String deeplink;

                public C1114b(String label, String str, d.r rVar) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    this.type = "BADGE";
                    this.label = label;
                    this.icon = rVar;
                    this.deeplink = str;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final d.r getIcon() {
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
                    if (!(obj2 instanceof C1114b)) {
                        return false;
                    }
                    C1114b c1114b = (C1114b) obj2;
                    return Intrinsics.f(this.type, c1114b.type) && Intrinsics.f(this.label, c1114b.label) && Intrinsics.f(this.icon, c1114b.icon) && Intrinsics.f(this.deeplink, c1114b.deeplink);
                }

                public final int hashCode() {
                    String str = this.type;
                    int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.label);
                    d.r rVar = this.icon;
                    int iHashCode = (iC + (rVar == null ? 0 : rVar.hashCode())) * 31;
                    String str2 = this.deeplink;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }
            }

            private e() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lljk/m$b$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "text", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            private final String text;

            public f(String type, String str) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.text = str;
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

        public b(String title, ArrayList arrayList, c cVar, String str, String str2, C1113b c1113b, String str3, e.C1114b c1114b, ArrayList menuActions, ArrayList actionPanel) {
            Intrinsics.checkNotNullParameter("HEADER", "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(menuActions, "menuActions");
            Intrinsics.checkNotNullParameter(actionPanel, "actionPanel");
            this.type = "HEADER";
            this.title = title;
            this.titleContent = arrayList;
            this.description = cVar;
            this.subtitle = str;
            this.deeplink = str2;
            this.background = c1113b;
            this.style = str3;
            this.headerAction = c1114b;
            this.menuActions = menuActions;
            this.actionPanel = actionPanel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getActionPanel() {
            return this.actionPanel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1113b getBackground() {
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
            C1113b c1113b = this.background;
            int iHashCode5 = (iHashCode4 + (c1113b == null ? 0 : c1113b.hashCode())) * 31;
            String str3 = this.style;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            e eVar = this.headerAction;
            return this.actionPanel.hashCode() + p.a.d((iHashCode6 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.menuActions);
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

    private m() {
    }
}
