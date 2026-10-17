package mok;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\f\t\u000e\u0017\u0005\u0012J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006#"}, d2 = {"Lmok/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "title", "b", "g", "subtitle", "c", "backgroundImageUrl", "d", "backgroundVideoUrl", "", "Lmok/c$b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "buttonsOrdered", "Lmok/c$d;", "f", "Lmok/c$d;", "()Lmok/c$d;", "footer", "Lmok/c$a;", "Lmok/c$a;", "()Lmok/c$a;", "bottomSheet", "Lmok/c$e;", "Lmok/c$e;", "()Lmok/c$e;", "productIntro", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundImageUrl")
    private final String backgroundImageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("backgroundVideoUrl")
    private final String backgroundVideoUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("buttonsOrdered")
    private final List<b> buttonsOrdered;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("footer")
    private final d footer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("bottomsheet")
    private final a bottomSheet;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("productIntro")
    private final e productIntro;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lmok/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "subtitle", "c", "icon", "", "Lmok/c$a$b;", "Ljava/util/List;", "()Ljava/util/List;", "sectionsOrdered", "Lmok/c$a$a;", "buttonsOrdered", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("sectionsOrdered")
        private final List<b> sectionsOrdered;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("buttonsOrdered")
        private final List<C1169a> buttonsOrdered;

        /* JADX INFO: renamed from: mok.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lmok/c$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "deeplink", "Lmok/c$c;", "c", "Lmok/c$c;", "()Lmok/c$c;", "style", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1169a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            @NotNull
            private final String label;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("deeplink")
            private final String deeplink;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            @NotNull
            private final EnumC1171c style;

            public C1169a(String label, String str, EnumC1171c style) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(style, "style");
                this.label = label;
                this.deeplink = str;
                this.style = style;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final EnumC1171c getStyle() {
                return this.style;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1169a)) {
                    return false;
                }
                C1169a c1169a = (C1169a) obj2;
                return Intrinsics.f(this.label, c1169a.label) && Intrinsics.f(this.deeplink, c1169a.deeplink) && this.style == c1169a.style;
            }

            public final int hashCode() {
                int iHashCode = this.label.hashCode() * 31;
                String str = this.deeplink;
                return this.style.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lmok/c$a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "text", "Lmok/c$a$b$a;", "Lmok/c$a$b$a;", "()Lmok/c$a$b$a;", "actionLabel", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("actionLabel")
            private final C1170a actionLabel;

            /* JADX INFO: renamed from: mok.c$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lmok/c$a$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "deeplink", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1170a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("deeplink")
                private final String deeplink;

                public C1170a(String label, String str) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    this.label = label;
                    this.deeplink = str;
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
                    if (!(obj2 instanceof C1170a)) {
                        return false;
                    }
                    C1170a c1170a = (C1170a) obj2;
                    return Intrinsics.f(this.label, c1170a.label) && Intrinsics.f(this.deeplink, c1170a.deeplink);
                }

                public final int hashCode() {
                    int iHashCode = this.label.hashCode() * 31;
                    String str = this.deeplink;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }
            }

            public b(String title, String text, C1170a c1170a) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(text, "text");
                this.title = title;
                this.text = text;
                this.actionLabel = c1170a;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C1170a getActionLabel() {
                return this.actionLabel;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
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
                return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.text, bVar.text) && Intrinsics.f(this.actionLabel, bVar.actionLabel);
            }

            public final int hashCode() {
                int iC = p.a.c(this.title.hashCode() * 31, 31, this.text);
                C1170a c1170a = this.actionLabel;
                return iC + (c1170a == null ? 0 : c1170a.hashCode());
            }
        }

        public a() {
            this(null, null, null, null, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getButtonsOrdered() {
            return this.buttonsOrdered;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getSectionsOrdered() {
            return this.sectionsOrdered;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
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
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.sectionsOrdered, aVar.sectionsOrdered) && Intrinsics.f(this.buttonsOrdered, aVar.buttonsOrdered);
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.icon;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<b> list = this.sectionsOrdered;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            List<C1169a> list2 = this.buttonsOrdered;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }

        public a(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
            this.title = str;
            this.subtitle = str2;
            this.icon = str3;
            this.sectionsOrdered = arrayList;
            this.buttonsOrdered = arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmok/c$b;", "", "", "toString", "()Ljava/lang/String;", "Lmok/c$b$a;", "a", "Lmok/c$b$a;", "()Lmok/c$b$a;", "action", "b", "Ljava/lang/String;", "label", "Lmok/c$c;", "c", "Lmok/c$c;", "()Lmok/c$c;", "style", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final a action;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        @NotNull
        private final EnumC1171c style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmok/c$b$a;", "", "OPEN_PLAN_INTRO", "SHOW_BOTTOMSHEET", "ACCEPT", "UNKNOWN", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;

            @lg.b("ACCEPT")
            public static final a ACCEPT;

            @lg.b("OPEN_PLAN_INTRO")
            public static final a OPEN_PLAN_INTRO;

            @lg.b("SHOW_BOTTOMSHEET")
            public static final a SHOW_BOTTOMSHEET;

            @he0.b
            public static final a UNKNOWN;

            static {
                a aVar = new a("OPEN_PLAN_INTRO", 0);
                OPEN_PLAN_INTRO = aVar;
                a aVar2 = new a("SHOW_BOTTOMSHEET", 1);
                SHOW_BOTTOMSHEET = aVar2;
                a aVar3 = new a("ACCEPT", 2);
                ACCEPT = aVar3;
                a aVar4 = new a("UNKNOWN", 3);
                UNKNOWN = aVar4;
                a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
                $VALUES = aVarArr;
                $ENTRIES = s.n(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public b(a action, String label, EnumC1171c style) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(style, "style");
            this.action = action;
            this.label = label;
            this.style = style;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC1171c getStyle() {
            return this.style;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.action == bVar.action && Intrinsics.f(this.label, bVar.label) && this.style == bVar.style;
        }

        public final int hashCode() {
            return this.style.hashCode() + p.a.c(this.action.hashCode() * 31, 31, this.label);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: mok.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lmok/c$c;", "", "PRIMARY", "SECONDARY", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC1171c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1171c[] $VALUES;

        @lg.b("PRIMARY")
        public static final EnumC1171c PRIMARY;

        @lg.b("SECONDARY")
        @he0.b
        public static final EnumC1171c SECONDARY;

        static {
            EnumC1171c enumC1171c = new EnumC1171c("PRIMARY", 0);
            PRIMARY = enumC1171c;
            EnumC1171c enumC1171c2 = new EnumC1171c("SECONDARY", 1);
            SECONDARY = enumC1171c2;
            EnumC1171c[] enumC1171cArr = {enumC1171c, enumC1171c2};
            $VALUES = enumC1171cArr;
            $ENTRIES = s.n(enumC1171cArr);
        }

        public static EnumC1171c valueOf(String str) {
            return (EnumC1171c) Enum.valueOf(EnumC1171c.class, str);
        }

        public static EnumC1171c[] values() {
            return (EnumC1171c[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lmok/c$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "Lmok/c$f;", "Lmok/c$f;", "()Lmok/c$f;", "terms", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("terms")
        private final f terms;

        public d() {
            this(null, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getTerms() {
            return this.terms;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.text, dVar.text) && Intrinsics.f(this.terms, dVar.terms);
        }

        public final int hashCode() {
            String str = this.text;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            f fVar = this.terms;
            return iHashCode + (fVar != null ? fVar.hashCode() : 0);
        }

        public d(String str, f fVar) {
            this.text = str;
            this.terms = fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lmok/c$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "style", "", "Lmok/c$e$a;", "Ljava/util/List;", "()Ljava/util/List;", "steps", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("style")
        @NotNull
        private final String style;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("steps")
        @NotNull
        private final List<a> steps;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmok/c$e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "type", "c", "d", "title", "subtitle", "f", "videoUrl", "Lmok/c$e$a$a;", "Lmok/c$e$a$a;", "()Lmok/c$e$a$a;", "badge", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
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
            @lg.b("subtitle")
            @NotNull
            private final String subtitle;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("videoUrl")
            @NotNull
            private final String videoUrl;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("badge")
            private final C1172a badge;

            /* JADX INFO: renamed from: mok.c$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lmok/c$e$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "icon", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1172a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("icon")
                @NotNull
                private final String icon;

                public C1172a(String label, String icon) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.label = label;
                    this.icon = icon;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1172a)) {
                        return false;
                    }
                    C1172a c1172a = (C1172a) obj2;
                    return Intrinsics.f(this.label, c1172a.label) && Intrinsics.f(this.icon, c1172a.icon);
                }

                public final int hashCode() {
                    return this.icon.hashCode() + (this.label.hashCode() * 31);
                }
            }

            public a(String id10, String type, String title, String subtitle, String videoUrl, C1172a c1172a) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                this.id = id10;
                this.type = type;
                this.title = title;
                this.subtitle = subtitle;
                this.videoUrl = videoUrl;
                this.badge = c1172a;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C1172a getBadge() {
                return this.badge;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.videoUrl, aVar.videoUrl) && Intrinsics.f(this.badge, aVar.badge);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getVideoUrl() {
                return this.videoUrl;
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.title), 31, this.subtitle), 31, this.videoUrl);
                C1172a c1172a = this.badge;
                return iC + (c1172a == null ? 0 : c1172a.hashCode());
            }
        }

        public e(String style, ArrayList steps) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.style = style;
            this.steps = steps;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getSteps() {
            return this.steps;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.style, eVar.style) && Intrinsics.f(this.steps, eVar.steps);
        }

        public final int hashCode() {
            return this.steps.hashCode() + (this.style.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lmok/c$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "label", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        @NotNull
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        public f(String url2, String label) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(label, "label");
            this.url = url2;
            this.label = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.url, fVar.url) && Intrinsics.f(this.label, fVar.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + (this.url.hashCode() * 31);
        }
    }

    public c(String title, String subtitle, String str, String str2, ArrayList arrayList, d dVar, a aVar, e eVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.backgroundImageUrl = str;
        this.backgroundVideoUrl = str2;
        this.buttonsOrdered = arrayList;
        this.footer = dVar;
        this.bottomSheet = aVar;
        this.productIntro = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getButtonsOrdered() {
        return this.buttonsOrdered;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getFooter() {
        return this.footer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.subtitle, cVar.subtitle) && Intrinsics.f(this.backgroundImageUrl, cVar.backgroundImageUrl) && Intrinsics.f(this.backgroundVideoUrl, cVar.backgroundVideoUrl) && Intrinsics.f(this.buttonsOrdered, cVar.buttonsOrdered) && Intrinsics.f(this.footer, cVar.footer) && Intrinsics.f(this.bottomSheet, cVar.bottomSheet) && Intrinsics.f(this.productIntro, cVar.productIntro);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getProductIntro() {
        return this.productIntro;
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
        int iC = p.a.c(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.backgroundImageUrl;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundVideoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<b> list = this.buttonsOrdered;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        d dVar = this.footer;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.bottomSheet;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.productIntro;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }
}
