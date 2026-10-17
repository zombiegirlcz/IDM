package l29;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import m1c.p1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ll29/a;", "", "", "toString", "()Ljava/lang/String;", "Ll29/a$a;", "a", "Ll29/a$a;", "()Ll29/a$a;", "info", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("info")
    private final C1088a info;

    /* JADX INFO: renamed from: l29.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll29/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "subtitle", "", "Ll29/a$a$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "items", "cta", "Lm1c/p1;", "Lm1c/p1;", "()Lm1c/p1;", "disclaimer", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1088a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("subtitle")
        @NotNull
        private final String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @b("items")
        @NotNull
        private final List<C1089a> items;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @b("cta")
        @NotNull
        private final String cta;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @b("disclaimer")
        private final p1 disclaimer;

        /* JADX INFO: renamed from: l29.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Ll29/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "title", "Lm1c/p1;", "c", "Lm1c/p1;", "()Lm1c/p1;", "subtitle", "icon", "feature_lifestyle_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1089a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @b("subtitle")
            @NotNull
            private final p1 subtitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @b("icon")
            @NotNull
            private final String icon;

            public C1089a(String id10, String title, p1 subtitle, String icon) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.id = id10;
                this.title = title;
                this.subtitle = subtitle;
                this.icon = icon;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final p1 getSubtitle() {
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
                if (!(obj2 instanceof C1089a)) {
                    return false;
                }
                C1089a c1089a = (C1089a) obj2;
                return Intrinsics.f(this.id, c1089a.id) && Intrinsics.f(this.title, c1089a.title) && Intrinsics.f(this.subtitle, c1089a.subtitle) && Intrinsics.f(this.icon, c1089a.icon);
            }

            public final int hashCode() {
                return this.icon.hashCode() + ((this.subtitle.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.title)) * 31);
            }
        }

        public C1088a(String title, String subtitle, ArrayList items, String cta2, p1 p1Var) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(cta2, "cta");
            this.title = title;
            this.subtitle = subtitle;
            this.items = items;
            this.cta = cta2;
            this.disclaimer = p1Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final p1 getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getItems() {
            return this.items;
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
            if (!(obj2 instanceof C1088a)) {
                return false;
            }
            C1088a c1088a = (C1088a) obj2;
            return Intrinsics.f(this.title, c1088a.title) && Intrinsics.f(this.subtitle, c1088a.subtitle) && Intrinsics.f(this.items, c1088a.items) && Intrinsics.f(this.cta, c1088a.cta) && Intrinsics.f(this.disclaimer, c1088a.disclaimer);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.d(p.a.c(this.title.hashCode() * 31, 31, this.subtitle), 31, this.items), 31, this.cta);
            p1 p1Var = this.disclaimer;
            return iC + (p1Var == null ? 0 : p1Var.hashCode());
        }
    }

    public a(C1088a c1088a) {
        this.info = c1088a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1088a getInfo() {
        return this.info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.info, ((a) obj2).info);
    }

    public final int hashCode() {
        C1088a c1088a = this.info;
        if (c1088a == null) {
            return 0;
        }
        return c1088a.hashCode();
    }
}
