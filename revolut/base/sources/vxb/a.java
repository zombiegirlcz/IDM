package vxb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.m1;
import m1c.p1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0006\u001a\f\u000e\b\u0006\u0011J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0004R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001f"}, d2 = {"Lvxb/a;", "", "", "toString", "()Ljava/lang/String;", "Lm1c/p1;", "a", "Lm1c/p1;", "f", "()Lm1c/p1;", "subtitle", "Lvxb/a$e;", "b", "Lvxb/a$e;", "d", "()Lvxb/a$e;", "progress", "c", "Ljava/lang/String;", "contentSectionTitle", "", "Lvxb/a$b;", "Ljava/util/List;", "()Ljava/util/List;", "contentItems", "Lvxb/a$c;", "e", "Lvxb/a$c;", "()Lvxb/a$c;", "primaryCta", "secondaryCta", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final p1 subtitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("progress")
    private final e progress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contentSectionTitle")
    @NotNull
    private final String contentSectionTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("contentItems")
    @NotNull
    private final List<b> contentItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("primaryCta")
    private final c primaryCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("secondaryCta")
    private final c secondaryCta;

    /* JADX INFO: renamed from: vxb.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lvxb/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "deeplink", "analyticsRef", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1622a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("analyticsRef")
        private final String analyticsRef;

        public C1622a(String deeplink, String str) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
            this.analyticsRef = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAnalyticsRef() {
            return this.analyticsRef;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1622a)) {
                return false;
            }
            C1622a c1622a = (C1622a) obj2;
            return Intrinsics.f(this.deeplink, c1622a.deeplink) && Intrinsics.f(this.analyticsRef, c1622a.analyticsRef);
        }

        public final int hashCode() {
            int iHashCode = this.deeplink.hashCode() * 31;
            String str = this.analyticsRef;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0006\u0010\u0018¨\u0006\u001a"}, d2 = {"Lvxb/a$b;", "", "", "toString", "()Ljava/lang/String;", "Lvxb/a$d;", "a", "Lvxb/a$d;", "b", "()Lvxb/a$d;", "marker", "Ljava/lang/String;", "e", "title", "c", "subtitle", "", "Lvxb/a$f;", "d", "Ljava/util/List;", "()Ljava/util/List;", "tags", "Lvxb/a$a;", "Lvxb/a$a;", "()Lvxb/a$a;", "action", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("marker")
        private final d marker;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("tags")
        private final List<f> tags;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final C1622a action;

        public b(d dVar, String title, String str, ArrayList arrayList, C1622a action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.marker = dVar;
            this.title = title;
            this.subtitle = str;
            this.tags = arrayList;
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1622a getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getMarker() {
            return this.marker;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getTags() {
            return this.tags;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return Intrinsics.f(this.marker, bVar.marker) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.tags, bVar.tags) && Intrinsics.f(this.action, bVar.action);
        }

        public final int hashCode() {
            d dVar = this.marker;
            int iC = p.a.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            List<f> list = this.tags;
            return this.action.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lvxb/a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "deeplink", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        private final String deeplink;

        public c(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.deeplink = str;
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
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.deeplink, cVar.deeplink);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.deeplink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lvxb/a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "iconCode", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "value", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("iconCode")
        private final String iconCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final Integer value;

        public d(String type, Integer num, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.iconCode = str;
            this.value = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIconCode() {
            return this.iconCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.type, dVar.type) && Intrinsics.f(this.iconCode, dVar.iconCode) && Intrinsics.f(this.value, dVar.value);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.iconCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.value;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvxb/a$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "Lm1c/m1;", "Lm1c/m1;", "c", "()Lm1c/m1;", "value", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "fraction", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final m1 value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fraction")
        private final Double fraction;

        public e(String label, m1 value, Double d) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
            this.fraction = d;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getFraction() {
            return this.fraction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m1 getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.label, eVar.label) && Intrinsics.f(this.value, eVar.value) && Intrinsics.f(this.fraction, eVar.fraction);
        }

        public final int hashCode() {
            int iHashCode = (this.value.hashCode() + (this.label.hashCode() * 31)) * 31;
            Double d = this.fraction;
            return iHashCode + (d == null ? 0 : d.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lvxb/a$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "iconCode", "b", "text", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("iconCode")
        private final String iconCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("text")
        @NotNull
        private final String text;

        public f(String str, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.iconCode = str;
            this.text = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIconCode() {
            return this.iconCode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.iconCode, fVar.iconCode) && Intrinsics.f(this.text, fVar.text);
        }

        public final int hashCode() {
            String str = this.iconCode;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }
    }

    public a(p1 p1Var, e eVar, String contentSectionTitle, ArrayList contentItems, c cVar, c cVar2) {
        Intrinsics.checkNotNullParameter(contentSectionTitle, "contentSectionTitle");
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        this.subtitle = p1Var;
        this.progress = eVar;
        this.contentSectionTitle = contentSectionTitle;
        this.contentItems = contentItems;
        this.primaryCta = cVar;
        this.secondaryCta = cVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getContentItems() {
        return this.contentItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContentSectionTitle() {
        return this.contentSectionTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getSecondaryCta() {
        return this.secondaryCta;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.progress, aVar.progress) && Intrinsics.f(this.contentSectionTitle, aVar.contentSectionTitle) && Intrinsics.f(this.contentItems, aVar.contentItems) && Intrinsics.f(this.primaryCta, aVar.primaryCta) && Intrinsics.f(this.secondaryCta, aVar.secondaryCta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p1 getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        p1 p1Var = this.subtitle;
        int iHashCode = (p1Var == null ? 0 : p1Var.hashCode()) * 31;
        e eVar = this.progress;
        int iD = p.a.d(p.a.c((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.contentSectionTitle), 31, this.contentItems);
        c cVar = this.primaryCta;
        int iHashCode2 = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.secondaryCta;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
