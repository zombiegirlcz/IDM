package bjk;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0013\u000b\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, d2 = {"Lbjk/g2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "suggestedPlanId", "", "Lbjk/g2$d;", "b", "Ljava/util/List;", "()Ljava/util/List;", "plans", "Lbjk/g2$b;", "Lbjk/g2$b;", "()Lbjk/g2$b;", "navigation", "d", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestedPlanId")
    private final String suggestedPlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("plans")
    @NotNull
    private final List<d> plans;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("navigation")
    private final b navigation;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Lbjk/g2$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "style", "b", "action", "c", "label", "e", "url", "icon", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        private final String style;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final String action;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("url")
        private final String url;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        public a(String str, String action, String label, String str2, String str3) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(label, "label");
            this.style = str;
            this.action = action;
            this.label = label;
            this.url = str2;
            this.icon = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return Intrinsics.f(this.style, aVar.style) && Intrinsics.f(this.action, aVar.action) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.url, aVar.url) && Intrinsics.f(this.icon, aVar.icon);
        }

        public final int hashCode() {
            String str = this.style;
            int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.action), 31, this.label);
            String str2 = this.url;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.icon;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lbjk/g2$b;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/g2$c;", "a", "Lbjk/g2$c;", "()Lbjk/g2$c;", "forward", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("forward")
        private final c forward;

        public b(c cVar) {
            this.forward = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getForward() {
            return this.forward;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.forward, ((b) obj2).forward);
        }

        public final int hashCode() {
            c cVar = this.forward;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lbjk/g2$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "c", "label", "action", "d", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final String action;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("url")
        private final String url;

        public c(String str, String str2, String action, String str3) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.icon = str;
            this.label = str2;
            this.action = action;
            this.url = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.icon, cVar.icon) && Intrinsics.f(this.label, cVar.label) && Intrinsics.f(this.action, cVar.action) && Intrinsics.f(this.url, cVar.url);
        }

        public final int hashCode() {
            String str = this.icon;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.label;
            int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.action);
            String str3 = this.url;
            return iC + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u001b<\t=>?@ABCDE\f\r\u0010\u0017\n'6\u001cF\u0005G\u0007\u001f\u0012HIJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0005\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b\t\u0010-R\"\u00104\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00100\u0012\u0004\b2\u00103\u001a\u0004\b\f\u00101R\"\u00107\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b\u0010\u0010$R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b6\u0010:¨\u0006J"}, d2 = {"Lbjk/g2$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "m", "title", "c", "e", "dashboardTitle", "Lbjk/g2$d$q;", "d", "Lbjk/g2$d$q;", "f", "()Lbjk/g2$d$q;", "header", "Lbjk/g2$d$v;", "Lbjk/g2$d$v;", "k", "()Lbjk/g2$d$v;", "style", "Lbjk/g2$d$s;", "Lbjk/g2$d$s;", "j", "()Lbjk/g2$d$s;", "specialBanner", "g", "highlightedBenefits", "", "Lbjk/g2$d$c;", "Ljava/util/List;", "()Ljava/util/List;", "benefitCategories", "Lbjk/g2$d$u;", "i", "Lbjk/g2$d$u;", "()Lbjk/g2$d$u;", "perks", "Lbjk/g2$d$h;", "Lbjk/g2$d$h;", "()Lbjk/g2$d$h;", "billingOptions", "Lbjk/g2$d$n;", "Lbjk/g2$d$n;", "()Lbjk/g2$d$n;", "getButtons$annotations", "()V", "buttons", "Lbjk/g2$a;", "l", "buttonsOrdered", "Lbjk/e2;", "Lbjk/e2;", "()Lbjk/e2;", "terms", "q", "x", "a0", "t", "p", "z", "v", "s", "r", "w", "u", "n", "o", "y", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("dashboardTitle")
        private final String dashboardTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("header")
        private final q header;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("style")
        private final v style;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("specialBanner")
        private final s specialBanner;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("highlightedBenefits")
        private final s highlightedBenefits;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("benefitCategories")
        private final List<c> benefitCategories;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("perks")
        private final u perks;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("billingOptions")
        private final h billingOptions;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("buttons")
        private final n buttons;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonsOrdered")
        private final List<a> buttonsOrdered;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("terms")
        private final e2 terms;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Lbjk/g2$d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "iconUrl", "Lbjk/g2$d$d;", "c", "Lbjk/g2$d$d;", "()Lbjk/g2$d$d;", "descriptionOptions", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "available", "Lbjk/g2$d$k;", "Lbjk/g2$d$k;", "()Lbjk/g2$d$k;", "bottomSheet", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("iconUrl")
            private final String iconUrl;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("descriptionOptions")
            private final C0106d descriptionOptions;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("available")
            private final Boolean available;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("bottomSheet")
            private final k bottomSheet;

            public a(String title, String str, C0106d c0106d, Boolean bool, k kVar) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.iconUrl = str;
                this.descriptionOptions = c0106d;
                this.available = bool;
                this.bottomSheet = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Boolean getAvailable() {
                return this.available;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final k getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C0106d getDescriptionOptions() {
                return this.descriptionOptions;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.iconUrl, aVar.iconUrl) && Intrinsics.f(this.descriptionOptions, aVar.descriptionOptions) && Intrinsics.f(this.available, aVar.available) && Intrinsics.f(this.bottomSheet, aVar.bottomSheet);
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.iconUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                C0106d c0106d = this.descriptionOptions;
                int iHashCode3 = (iHashCode2 + (c0106d == null ? 0 : c0106d.hashCode())) * 31;
                Boolean bool = this.available;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                k kVar = this.bottomSheet;
                return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lbjk/g2$d$a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "action", "Lbjk/g2$d$t;", "c", "Lbjk/g2$d$t;", "()Lbjk/g2$d$t;", "payload", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("action")
            private final String action;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("payload")
            private final t payload;

            public a0(String icon, String str, t tVar) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
                this.action = str;
                this.payload = tVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final t getPayload() {
                return this.payload;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a0)) {
                    return false;
                }
                a0 a0Var = (a0) obj2;
                return Intrinsics.f(this.icon, a0Var.icon) && Intrinsics.f(this.action, a0Var.action) && Intrinsics.f(this.payload, a0Var.payload);
            }

            public final int hashCode() {
                int iHashCode = this.icon.hashCode() * 31;
                String str = this.action;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                t tVar = this.payload;
                return iHashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/g2$d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "icon", "b", "text", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final String icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            public b(String str, String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.icon = str;
                this.text = text;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.icon, bVar.icon) && Intrinsics.f(this.text, bVar.text);
            }

            public final int hashCode() {
                String str = this.icon;
                return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbjk/g2$d$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "title", "icon", "", "Lbjk/g2$d$e;", "Ljava/util/List;", "()Ljava/util/List;", "benefits", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final String icon;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("benefits")
            @NotNull
            private final List<e> benefits;

            public c(String str, String title, String str2, ArrayList benefits) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                this.id = str;
                this.title = title;
                this.icon = str2;
                this.benefits = benefits;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getBenefits() {
                return this.benefits;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.icon, cVar.icon) && Intrinsics.f(this.benefits, cVar.benefits);
            }

            public final int hashCode() {
                String str = this.id;
                int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
                String str2 = this.icon;
                return this.benefits.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
            }
        }

        /* JADX INFO: renamed from: bjk.g2$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lbjk/g2$d$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "text", "b", "c", "placeholder", "icon", "Lbjk/d2;", "Lbjk/d2;", "()Lbjk/d2;", "asset", "e", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0106d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            private final String placeholder;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final String icon;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("asset")
            private final d2 asset;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("url")
            private final String url;

            public C0106d(String str, String str2, String str3, d2 d2Var, String str4) {
                this.text = str;
                this.placeholder = str2;
                this.icon = str3;
                this.asset = d2Var;
                this.url = str4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d2 getAsset() {
                return this.asset;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0106d)) {
                    return false;
                }
                C0106d c0106d = (C0106d) obj2;
                return Intrinsics.f(this.text, c0106d.text) && Intrinsics.f(this.placeholder, c0106d.placeholder) && Intrinsics.f(this.icon, c0106d.icon) && Intrinsics.f(this.asset, c0106d.asset) && Intrinsics.f(this.url, c0106d.url);
            }

            public final int hashCode() {
                String str = this.text;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.placeholder;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                d2 d2Var = this.asset;
                int iHashCode4 = (iHashCode3 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
                String str4 = this.url;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lbjk/g2$d$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "d", "iconUrl", "Lbjk/g2$d$d;", "c", "Lbjk/g2$d$d;", "()Lbjk/g2$d$d;", "descriptionOptions", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "available", "e", "subtitle", "Lbjk/g2$d$k;", "Lbjk/g2$d$k;", "()Lbjk/g2$d$k;", "bottomSheet", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("iconUrl")
            private final String iconUrl;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("descriptionOptions")
            private final C0106d descriptionOptions;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("available")
            private final Boolean available;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("subtitle")
            private final String subtitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("bottomSheet")
            private final k bottomSheet;

            public e(String title, String str, C0106d c0106d, Boolean bool, String str2, k kVar) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.iconUrl = str;
                this.descriptionOptions = c0106d;
                this.available = bool;
                this.subtitle = str2;
                this.bottomSheet = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Boolean getAvailable() {
                return this.available;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final k getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C0106d getDescriptionOptions() {
                return this.descriptionOptions;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.iconUrl, eVar.iconUrl) && Intrinsics.f(this.descriptionOptions, eVar.descriptionOptions) && Intrinsics.f(this.available, eVar.available) && Intrinsics.f(this.subtitle, eVar.subtitle) && Intrinsics.f(this.bottomSheet, eVar.bottomSheet);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.iconUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                C0106d c0106d = this.descriptionOptions;
                int iHashCode3 = (iHashCode2 + (c0106d == null ? 0 : c0106d.hashCode())) * 31;
                Boolean bool = this.available;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.subtitle;
                int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                k kVar = this.bottomSheet;
                return iHashCode5 + (kVar != null ? kVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbjk/g2$d$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "Lbjk/g2$d$b;", "b", "Lbjk/g2$d$b;", "()Lbjk/g2$d$b;", "badge", "Lbjk/g2$d$x;", "Lbjk/g2$d$x;", "()Lbjk/g2$d$x;", "subtitle", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("badge")
            private final b badge;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("subtitle")
            private final x subtitle;

            public f(String str, b bVar, x xVar) {
                this.title = str;
                this.badge = bVar;
                this.subtitle = xVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getBadge() {
                return this.badge;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final x getSubtitle() {
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
                if (!(obj2 instanceof f)) {
                    return false;
                }
                f fVar = (f) obj2;
                return Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.badge, fVar.badge) && Intrinsics.f(this.subtitle, fVar.subtitle);
            }

            public final int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                b bVar = this.badge;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                x xVar = this.subtitle;
                return iHashCode2 + (xVar != null ? xVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0005\u0010 R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\u0019\u0010)¨\u0006+"}, d2 = {"Lbjk/g2$d$g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "period", "Ljo3/a;", "b", "Ljo3/a;", "d", "()Ljo3/a;", "fee", "Lbjk/g2$d$o;", "c", "Lbjk/g2$d$o;", "()Lbjk/g2$d$o;", "charge", "Lbjk/g2$d$f;", "Lbjk/g2$d$f;", "()Lbjk/g2$d$f;", "content", "Lbjk/e2;", "e", "Lbjk/e2;", "h", "()Lbjk/e2;", "terms", "Lbjk/g2$a;", "Lbjk/g2$a;", "()Lbjk/g2$a;", "action", "", "g", "Z", "()Z", "recommended", "Lbjk/k3;", "Lbjk/k3;", "()Lbjk/k3;", "offer", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("period")
            @NotNull
            private final String period;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("fee")
            private final jo3.a fee;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("charge")
            private final o charge;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("content")
            @NotNull
            private final f content;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("terms")
            @NotNull
            private final e2 terms;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("action")
            private final a action;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("recommended")
            private final boolean recommended;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @lg.b("offer")
            private final k3 offer;

            public g(String period, jo3.a aVar, o oVar, f content, e2 terms, a aVar2, boolean z, k3 k3Var) {
                Intrinsics.checkNotNullParameter(period, "period");
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(terms, "terms");
                this.period = period;
                this.fee = aVar;
                this.charge = oVar;
                this.content = content;
                this.terms = terms;
                this.action = aVar2;
                this.recommended = z;
                this.offer = k3Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final o getCharge() {
                return this.charge;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final f getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final jo3.a getFee() {
                return this.fee;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final k3 getOffer() {
                return this.offer;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof g)) {
                    return false;
                }
                g gVar = (g) obj2;
                return Intrinsics.f(this.period, gVar.period) && Intrinsics.f(this.fee, gVar.fee) && Intrinsics.f(this.charge, gVar.charge) && Intrinsics.f(this.content, gVar.content) && Intrinsics.f(this.terms, gVar.terms) && Intrinsics.f(this.action, gVar.action) && this.recommended == gVar.recommended && Intrinsics.f(this.offer, gVar.offer);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getPeriod() {
                return this.period;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getRecommended() {
                return this.recommended;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final e2 getTerms() {
                return this.terms;
            }

            public final int hashCode() {
                int iHashCode = this.period.hashCode() * 31;
                jo3.a aVar = this.fee;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                o oVar = this.charge;
                int iHashCode3 = (this.terms.hashCode() + ((this.content.hashCode() + ((iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31)) * 31;
                a aVar2 = this.action;
                int iC = j6.a.c((iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.recommended);
                k3 k3Var = this.offer;
                return iC + (k3Var != null ? k3Var.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbjk/g2$d$h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "subtitle", "d", "upgradeType", "", "Lbjk/g2$d$g;", "Ljava/util/List;", "()Ljava/util/List;", "options", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("subtitle")
            private final String subtitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("upgradeType")
            @NotNull
            private final String upgradeType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("options")
            @NotNull
            private final List<g> options;

            public h(String str, String str2, String upgradeType, ArrayList options) {
                Intrinsics.checkNotNullParameter(upgradeType, "upgradeType");
                Intrinsics.checkNotNullParameter(options, "options");
                this.title = str;
                this.subtitle = str2;
                this.upgradeType = upgradeType;
                this.options = options;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getOptions() {
                return this.options;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getUpgradeType() {
                return this.upgradeType;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof h)) {
                    return false;
                }
                h hVar = (h) obj2;
                return Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.subtitle, hVar.subtitle) && Intrinsics.f(this.upgradeType, hVar.upgradeType) && Intrinsics.f(this.options, hVar.options);
            }

            public final int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return this.options.hashCode() + p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.upgradeType);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/g2$d$i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class i {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("url")
            private final String url;

            public i(String type, String str) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.url = str;
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
                if (!(obj2 instanceof i)) {
                    return false;
                }
                i iVar = (i) obj2;
                return Intrinsics.f(this.type, iVar.type) && Intrinsics.f(this.url, iVar.url);
            }

            public final int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.url;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/g2$d$j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "text", "b", "url", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class j {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("url")
            @NotNull
            private final String url;

            public j(String text, String url2) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(url2, "url");
                this.text = text;
                this.url = url2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof j)) {
                    return false;
                }
                j jVar = (j) obj2;
                return Intrinsics.f(this.text, jVar.text) && Intrinsics.f(this.url, jVar.url);
            }

            public final int hashCode() {
                return this.url.hashCode() + (this.text.hashCode() * 31);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lbjk/g2$d$k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "logoUrl", "b", "e", "title", "c", "description", "", "Lbjk/g2$d$m;", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lbjk/g2$d$l;", "Lbjk/g2$d$l;", "()Lbjk/g2$d$l;", "footer", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class k {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("logoUrl")
            private final String logoUrl;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            private final String description;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("items")
            private final List<m> items;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("footer")
            private final l footer;

            public k(String str, String title, String str2, ArrayList arrayList, l lVar) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.logoUrl = str;
                this.title = title;
                this.description = str2;
                this.items = arrayList;
                this.footer = lVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final l getFooter() {
                return this.footer;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final List getItems() {
                return this.items;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getLogoUrl() {
                return this.logoUrl;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return Intrinsics.f(this.logoUrl, kVar.logoUrl) && Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.description, kVar.description) && Intrinsics.f(this.items, kVar.items) && Intrinsics.f(this.footer, kVar.footer);
            }

            public final int hashCode() {
                String str = this.logoUrl;
                int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
                String str2 = this.description;
                int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<m> list = this.items;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                l lVar = this.footer;
                return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lbjk/g2$d$l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "", "Lbjk/g2$d$j;", "Ljava/util/List;", "()Ljava/util/List;", "descriptors", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class l {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("descriptors")
            private final List<j> descriptors;

            public l(String str, ArrayList arrayList) {
                this.text = str;
                this.descriptors = arrayList;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getDescriptors() {
                return this.descriptors;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof l)) {
                    return false;
                }
                l lVar = (l) obj2;
                return Intrinsics.f(this.text, lVar.text) && Intrinsics.f(this.descriptors, lVar.descriptors);
            }

            public final int hashCode() {
                String str = this.text;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<j> list = this.descriptors;
                return iHashCode + (list != null ? list.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lbjk/g2$d$m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "type", "b", "c", "icon", "e", "title", "d", "description", "text", "Lbjk/g2$d$i;", "Lbjk/g2$d$i;", "()Lbjk/g2$d$i;", "asset", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class m {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final String icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            private final String title;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("description")
            private final String description;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("text")
            private final String text;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("asset")
            private final i asset;

            public m(String type, String str, String str2, String str3, String str4, i iVar) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.icon = str;
                this.title = str2;
                this.description = str3;
                this.text = str4;
                this.asset = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final i getAsset() {
                return this.asset;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof m)) {
                    return false;
                }
                m mVar = (m) obj2;
                return Intrinsics.f(this.type, mVar.type) && Intrinsics.f(this.icon, mVar.icon) && Intrinsics.f(this.title, mVar.title) && Intrinsics.f(this.description, mVar.description) && Intrinsics.f(this.text, mVar.text) && Intrinsics.f(this.asset, mVar.asset);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.icon;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.title;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.description;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.text;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                i iVar = this.asset;
                return iHashCode5 + (iVar != null ? iVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lbjk/g2$d$n;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/g2$a;", "a", "Lbjk/g2$a;", "()Lbjk/g2$a;", "primary", "b", "secondary", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class n {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("primary")
            private final a primary;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("secondary")
            private final a secondary;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getPrimary() {
                return this.primary;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final a getSecondary() {
                return this.secondary;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof n)) {
                    return false;
                }
                n nVar = (n) obj2;
                return Intrinsics.f(this.primary, nVar.primary) && Intrinsics.f(this.secondary, nVar.secondary);
            }

            public final int hashCode() {
                a aVar = this.primary;
                int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
                a aVar2 = this.secondary;
                return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbjk/g2$d$o;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "total", "b", "fee", "", "Lbjk/g2$d$y;", "Ljava/util/List;", "()Ljava/util/List;", "taxes", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class o {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("total")
            @NotNull
            private final jo3.a total;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("fee")
            @NotNull
            private final jo3.a fee;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("taxes")
            private final List<y> taxes;

            public o(jo3.a total, jo3.a fee2, ArrayList arrayList) {
                Intrinsics.checkNotNullParameter(total, "total");
                Intrinsics.checkNotNullParameter(fee2, "fee");
                this.total = total;
                this.fee = fee2;
                this.taxes = arrayList;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jo3.a getFee() {
                return this.fee;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getTaxes() {
                return this.taxes;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jo3.a getTotal() {
                return this.total;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof o)) {
                    return false;
                }
                o oVar = (o) obj2;
                return Intrinsics.f(this.total, oVar.total) && Intrinsics.f(this.fee, oVar.fee) && Intrinsics.f(this.taxes, oVar.taxes);
            }

            public final int hashCode() {
                int iJ = v7.j(this.fee, this.total.hashCode() * 31, 31);
                List<y> list = this.taxes;
                return iJ + (list == null ? 0 : list.hashCode());
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lbjk/g2$d$p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "text", "Lbjk/g2$d$a0;", "b", "Lbjk/g2$d$a0;", "()Lbjk/g2$d$a0;", "tooltip", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class p {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("tooltip")
            private final a0 tooltip;

            public p(String text, a0 a0Var) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.tooltip = a0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final a0 getTooltip() {
                return this.tooltip;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof p)) {
                    return false;
                }
                p pVar = (p) obj2;
                return Intrinsics.f(this.text, pVar.text) && Intrinsics.f(this.tooltip, pVar.tooltip);
            }

            public final int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                a0 a0Var = this.tooltip;
                return iHashCode + (a0Var == null ? 0 : a0Var.hashCode());
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0005\u0010\u001f¨\u0006!"}, d2 = {"Lbjk/g2$d$q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "Lbjk/g2$d$b;", "b", "Lbjk/g2$d$b;", "()Lbjk/g2$d$b;", "badge", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "badges", "Lbjk/g2$d$x;", "d", "Lbjk/g2$d$x;", "e", "()Lbjk/g2$d$x;", "subtitle", "Lbjk/g2$d$p;", "Lbjk/g2$d$p;", "()Lbjk/g2$d$p;", "description", "Lbjk/d2;", "Lbjk/d2;", "()Lbjk/d2;", "asset", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("badge")
            private final b badge;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("badges")
            private final List<b> badges;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("subtitle")
            private final x subtitle;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("description")
            private final p description;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("asset")
            private final d2 asset;

            public q(String title, ArrayList arrayList, x xVar, p pVar, d2 d2Var) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.badge = null;
                this.badges = arrayList;
                this.subtitle = xVar;
                this.description = pVar;
                this.asset = d2Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d2 getAsset() {
                return this.asset;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b getBadge() {
                return this.badge;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final List getBadges() {
                return this.badges;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final p getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final x getSubtitle() {
                return this.subtitle;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof q)) {
                    return false;
                }
                q qVar = (q) obj2;
                return Intrinsics.f(this.title, qVar.title) && Intrinsics.f(this.badge, qVar.badge) && Intrinsics.f(this.badges, qVar.badges) && Intrinsics.f(this.subtitle, qVar.subtitle) && Intrinsics.f(this.description, qVar.description) && Intrinsics.f(this.asset, qVar.asset);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                b bVar = this.badge;
                int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                List<b> list = this.badges;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                x xVar = this.subtitle;
                int iHashCode4 = (iHashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
                p pVar = this.description;
                int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
                d2 d2Var = this.asset;
                return iHashCode5 + (d2Var != null ? d2Var.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lbjk/g2$d$r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "icon", "subtitle", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class r {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("subtitle")
            private final String subtitle;

            public r(String title, String icon, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.title = title;
                this.icon = icon;
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
                if (!(obj2 instanceof r)) {
                    return false;
                }
                r rVar = (r) obj2;
                return Intrinsics.f(this.title, rVar.title) && Intrinsics.f(this.icon, rVar.icon) && Intrinsics.f(this.subtitle, rVar.subtitle);
            }

            public final int hashCode() {
                int iC = p.a.c(this.title.hashCode() * 31, 31, this.icon);
                String str = this.subtitle;
                return iC + (str == null ? 0 : str.hashCode());
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lbjk/g2$d$s;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/g2$d$r;", "a", "Lbjk/g2$d$r;", "c", "()Lbjk/g2$d$r;", "spotlightBenefit", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "benefits", "Lbjk/g2$d$w;", "Lbjk/g2$d$w;", "e", "()Lbjk/g2$d$w;", "subscriptionsBenefit", "d", "Ljava/lang/String;", "style", "Lbjk/g2$a;", "Lbjk/g2$a;", "()Lbjk/g2$a;", "button", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class s {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("spotlightBenefit")
            private final r spotlightBenefit;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("benefits")
            @NotNull
            private final List<r> benefits;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("subscriptionsBenefit")
            private final w subscriptionsBenefit;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("style")
            private final String style;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("button")
            private final a button;

            public s(r rVar, ArrayList benefits, w wVar, String str, a aVar) {
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                this.spotlightBenefit = rVar;
                this.benefits = benefits;
                this.subscriptionsBenefit = wVar;
                this.style = str;
                this.button = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getBenefits() {
                return this.benefits;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final a getButton() {
                return this.button;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final r getSpotlightBenefit() {
                return this.spotlightBenefit;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final w getSubscriptionsBenefit() {
                return this.subscriptionsBenefit;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof s)) {
                    return false;
                }
                s sVar = (s) obj2;
                return Intrinsics.f(this.spotlightBenefit, sVar.spotlightBenefit) && Intrinsics.f(this.benefits, sVar.benefits) && Intrinsics.f(this.subscriptionsBenefit, sVar.subscriptionsBenefit) && Intrinsics.f(this.style, sVar.style) && Intrinsics.f(this.button, sVar.button);
            }

            public final int hashCode() {
                r rVar = this.spotlightBenefit;
                int iD = p.a.d((rVar == null ? 0 : rVar.hashCode()) * 31, 31, this.benefits);
                w wVar = this.subscriptionsBenefit;
                int iHashCode = (iD + (wVar == null ? 0 : wVar.hashCode())) * 31;
                String str = this.style;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                a aVar = this.button;
                return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\t\u0010\u001a¨\u0006\u001c"}, d2 = {"Lbjk/g2$d$t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "icon", "b", "f", "title", "c", "description", "", "Lbjk/g2$d$t$a;", "Ljava/util/List;", "()Ljava/util/List;", "actions", "Lbjk/e2;", "e", "Lbjk/e2;", "()Lbjk/e2;", "terms", "Lbjk/g2$d$t$b;", "Lbjk/g2$d$t$b;", "()Lbjk/g2$d$t$b;", "background", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class t {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("actions")
            private final List<a> actions;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("terms")
            private final e2 terms;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("background")
            private final b background;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/g2$d$t$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "action", "b", "label", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("action")
                @NotNull
                private final String action;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                public a(String action, String label) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.checkNotNullParameter(label, "label");
                    this.action = action;
                    this.label = label;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAction() {
                    return this.action;
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
                    return Intrinsics.f(this.action, aVar.action) && Intrinsics.f(this.label, aVar.label);
                }

                public final int hashCode() {
                    return this.label.hashCode() + (this.action.hashCode() * 31);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/g2$d$t$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "code", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("type")
                private final String type;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("code")
                private final String code;

                public b(String str, String str2) {
                    this.type = str;
                    this.code = str2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getCode() {
                    return this.code;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
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
                    return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.code, bVar.code);
                }

                public final int hashCode() {
                    String str = this.type;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.code;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }
            }

            public t(String icon, String title, String description, ArrayList arrayList, e2 e2Var, b bVar) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.icon = icon;
                this.title = title;
                this.description = description;
                this.actions = arrayList;
                this.terms = e2Var;
                this.background = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getActions() {
                return this.actions;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b getBackground() {
                return this.background;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final e2 getTerms() {
                return this.terms;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof t)) {
                    return false;
                }
                t tVar = (t) obj2;
                return Intrinsics.f(this.icon, tVar.icon) && Intrinsics.f(this.title, tVar.title) && Intrinsics.f(this.description, tVar.description) && Intrinsics.f(this.actions, tVar.actions) && Intrinsics.f(this.terms, tVar.terms) && Intrinsics.f(this.background, tVar.background);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(this.icon.hashCode() * 31, 31, this.title), 31, this.description);
                List<a> list = this.actions;
                int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
                e2 e2Var = this.terms;
                int iHashCode2 = (iHashCode + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
                b bVar = this.background;
                return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lbjk/g2$d$u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "icon", "", "Lbjk/g2$d$a;", "Ljava/util/List;", "()Ljava/util/List;", "apps", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class u {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("apps")
            @NotNull
            private final List<a> apps;

            public u(String title, String icon, ArrayList apps) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(apps, "apps");
                this.title = title;
                this.icon = icon;
                this.apps = apps;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getApps() {
                return this.apps;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIcon() {
                return this.icon;
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
                return Intrinsics.f(this.title, uVar.title) && Intrinsics.f(this.icon, uVar.icon) && Intrinsics.f(this.apps, uVar.apps);
            }

            public final int hashCode() {
                return this.apps.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.icon);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbjk/g2$d$v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "backgroundCode", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class v {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("backgroundCode")
            @NotNull
            private final String backgroundCode;

            public v(String backgroundCode) {
                Intrinsics.checkNotNullParameter(backgroundCode, "backgroundCode");
                this.backgroundCode = backgroundCode;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getBackgroundCode() {
                return this.backgroundCode;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof v) && Intrinsics.f(this.backgroundCode, ((v) obj2).backgroundCode);
            }

            public final int hashCode() {
                return this.backgroundCode.hashCode();
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbjk/g2$d$w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "icon", "", "Ljava/util/List;", "()Ljava/util/List;", "iconsListUrls", "", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "totalSubscriptions", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class w {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("iconsListUrls")
            private final List<String> iconsListUrls;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("totalSubscriptions")
            private final Integer totalSubscriptions;

            public w(List list, String title, String icon, Integer num) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.title = title;
                this.icon = icon;
                this.iconsListUrls = list;
                this.totalSubscriptions = num;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final List getIconsListUrls() {
                return this.iconsListUrls;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Integer getTotalSubscriptions() {
                return this.totalSubscriptions;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof w)) {
                    return false;
                }
                w wVar = (w) obj2;
                return Intrinsics.f(this.title, wVar.title) && Intrinsics.f(this.icon, wVar.icon) && Intrinsics.f(this.iconsListUrls, wVar.iconsListUrls) && Intrinsics.f(this.totalSubscriptions, wVar.totalSubscriptions);
            }

            public final int hashCode() {
                int iC = p.a.c(this.title.hashCode() * 31, 31, this.icon);
                List<String> list = this.iconsListUrls;
                int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.totalSubscriptions;
                return iHashCode + (num != null ? num.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbjk/g2$d$x;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/g2$d$z;", "a", "Lbjk/g2$d$z;", "()Lbjk/g2$d$z;", "primary", "b", "secondary", "Lbjk/g2$d$a0;", "c", "Lbjk/g2$d$a0;", "()Lbjk/g2$d$a0;", "tooltip", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class x {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("primary")
            private final z primary;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("secondary")
            private final z secondary;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("tooltip")
            private final a0 tooltip;

            public x(z zVar, z zVar2, a0 a0Var) {
                this.primary = zVar;
                this.secondary = zVar2;
                this.tooltip = a0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final z getPrimary() {
                return this.primary;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final z getSecondary() {
                return this.secondary;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final a0 getTooltip() {
                return this.tooltip;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof x)) {
                    return false;
                }
                x xVar = (x) obj2;
                return Intrinsics.f(this.primary, xVar.primary) && Intrinsics.f(this.secondary, xVar.secondary) && Intrinsics.f(this.tooltip, xVar.tooltip);
            }

            public final int hashCode() {
                z zVar = this.primary;
                int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
                z zVar2 = this.secondary;
                int iHashCode2 = (iHashCode + (zVar2 == null ? 0 : zVar2.hashCode())) * 31;
                a0 a0Var = this.tooltip;
                return iHashCode2 + (a0Var != null ? a0Var.hashCode() : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lbjk/g2$d$y;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "value", "Ljava/lang/String;", "type", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class y {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final jo3.a value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public y(jo3.a value, String type) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                this.value = value;
                this.type = type;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final jo3.a getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof y)) {
                    return false;
                }
                y yVar = (y) obj2;
                return Intrinsics.f(this.value, yVar.value) && Intrinsics.f(this.type, yVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + (this.value.hashCode() * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lbjk/g2$d$z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "style", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class z {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            private final String style;

            public z(String text, String str) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.style = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof z)) {
                    return false;
                }
                z zVar = (z) obj2;
                return Intrinsics.f(this.text, zVar.text) && Intrinsics.f(this.style, zVar.style);
            }

            public final int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.style;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }
        }

        public d(String id10, String title, String str, q qVar, v vVar, s sVar, s sVar2, ArrayList arrayList, u uVar, h hVar, List list, e2 e2Var) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id10;
            this.title = title;
            this.dashboardTitle = str;
            this.header = qVar;
            this.style = vVar;
            this.specialBanner = sVar;
            this.highlightedBenefits = sVar2;
            this.benefitCategories = arrayList;
            this.perks = uVar;
            this.billingOptions = hVar;
            this.buttons = null;
            this.buttonsOrdered = list;
            this.terms = e2Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getBenefitCategories() {
            return this.benefitCategories;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getBillingOptions() {
            return this.billingOptions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n getButtons() {
            return this.buttons;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getButtonsOrdered() {
            return this.buttonsOrdered;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDashboardTitle() {
            return this.dashboardTitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.dashboardTitle, dVar.dashboardTitle) && Intrinsics.f(this.header, dVar.header) && Intrinsics.f(this.style, dVar.style) && Intrinsics.f(this.specialBanner, dVar.specialBanner) && Intrinsics.f(this.highlightedBenefits, dVar.highlightedBenefits) && Intrinsics.f(this.benefitCategories, dVar.benefitCategories) && Intrinsics.f(this.perks, dVar.perks) && Intrinsics.f(this.billingOptions, dVar.billingOptions) && Intrinsics.f(this.buttons, dVar.buttons) && Intrinsics.f(this.buttonsOrdered, dVar.buttonsOrdered) && Intrinsics.f(this.terms, dVar.terms);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final q getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final s getHighlightedBenefits() {
            return this.highlightedBenefits;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.dashboardTitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            q qVar = this.header;
            int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
            v vVar = this.style;
            int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
            s sVar = this.specialBanner;
            int iHashCode4 = (iHashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31;
            s sVar2 = this.highlightedBenefits;
            int iHashCode5 = (iHashCode4 + (sVar2 == null ? 0 : sVar2.hashCode())) * 31;
            List<c> list = this.benefitCategories;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            u uVar = this.perks;
            int iHashCode7 = (iHashCode6 + (uVar == null ? 0 : uVar.hashCode())) * 31;
            h hVar = this.billingOptions;
            int iHashCode8 = (iHashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            n nVar = this.buttons;
            int iHashCode9 = (iHashCode8 + (nVar == null ? 0 : nVar.hashCode())) * 31;
            List<a> list2 = this.buttonsOrdered;
            int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
            e2 e2Var = this.terms;
            return iHashCode10 + (e2Var != null ? e2Var.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final u getPerks() {
            return this.perks;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final s getSpecialBanner() {
            return this.specialBanner;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final v getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final e2 getTerms() {
            return this.terms;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    public g2(String str, ArrayList plans, b bVar) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.suggestedPlanId = str;
        this.plans = plans;
        this.navigation = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPlans() {
        return this.plans;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSuggestedPlanId() {
        return this.suggestedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.suggestedPlanId, g2Var.suggestedPlanId) && Intrinsics.f(this.plans, g2Var.plans) && Intrinsics.f(this.navigation, g2Var.navigation);
    }

    public final int hashCode() {
        String str = this.suggestedPlanId;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.plans);
        b bVar = this.navigation;
        return iD + (bVar != null ? bVar.hashCode() : 0);
    }
}
