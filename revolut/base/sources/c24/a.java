package c24;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import nx4.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\b\u0006\u0012\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0013"}, d2 = {"Lc24/a;", "", "", "toString", "()Ljava/lang/String;", "Lc24/a$d;", "a", "Lc24/a$d;", "b", "()Lc24/a$d;", "selectSolicitor", "", "Lc24/d;", "Ljava/util/Map;", "()Ljava/util/Map;", "actions", "d", "c", "e", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectSolicitor")
    @NotNull
    private final d selectSolicitor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("actions")
    @NotNull
    private final Map<String, c24.d> actions;

    /* JADX INFO: renamed from: c24.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lc24/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "buttonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0133a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0133a)) {
                return false;
            }
            C0133a c0133a = (C0133a) obj2;
            return Intrinsics.f(this.title, c0133a.title) && Intrinsics.f(this.buttonTitle, c0133a.buttonTitle);
        }

        public final int hashCode() {
            return this.buttonTitle.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0014"}, d2 = {"Lc24/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "f", "secondDescription", "c", "d", "nameLabel", "emailLabel", "e", "contactNameLabel", "phoneNumberLabel", "buttonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondDescription")
        @NotNull
        private final String secondDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("nameLabel")
        @NotNull
        private final String nameLabel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("emailLabel")
        @NotNull
        private final String emailLabel;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("contactNameLabel")
        @NotNull
        private final String contactNameLabel;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("phoneNumberLabel")
        @NotNull
        private final String phoneNumberLabel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getContactNameLabel() {
            return this.contactNameLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEmailLabel() {
            return this.emailLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNameLabel() {
            return this.nameLabel;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPhoneNumberLabel() {
            return this.phoneNumberLabel;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.secondDescription, bVar.secondDescription) && Intrinsics.f(this.nameLabel, bVar.nameLabel) && Intrinsics.f(this.emailLabel, bVar.emailLabel) && Intrinsics.f(this.contactNameLabel, bVar.contactNameLabel) && Intrinsics.f(this.phoneNumberLabel, bVar.phoneNumberLabel) && Intrinsics.f(this.buttonTitle, bVar.buttonTitle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSecondDescription() {
            return this.secondDescription;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.buttonTitle.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.secondDescription), 31, this.nameLabel), 31, this.emailLabel), 31, this.contactNameLabel), 31, this.phoneNumberLabel);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\f\u0010\u0004R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u0005\u0010\u001a¨\u0006\u001c"}, d2 = {"Lc24/a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "g", "title", "c", "d", "description", "avatarUrl", "", "Lnx4/m0;", "Ljava/util/List;", "f", "()Ljava/util/List;", "items", "buttonTitle", "", "Lc24/h;", "Ljava/util/Map;", "()Ljava/util/Map;", "actions", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("avatarUrl")
        @NotNull
        private final String avatarUrl;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<m0> items;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("actions")
        @NotNull
        private final Map<String, h> actions;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Map getActions() {
            return this.actions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.avatarUrl, cVar.avatarUrl) && Intrinsics.f(this.items, cVar.items) && Intrinsics.f(this.buttonTitle, cVar.buttonTitle) && Intrinsics.f(this.actions, cVar.actions);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.actions.hashCode() + p.a.c(p.a.d(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.avatarUrl), 31, this.items), 31, this.buttonTitle);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0013"}, d2 = {"Lc24/a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "secondDescription", "", "Lc24/a$d$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "secondDescriptionLinks", "Lnx4/m0;", "items", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondDescription")
        @NotNull
        private final String secondDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondDescriptionLinks")
        @NotNull
        private final List<C0134a> secondDescriptionLinks;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<m0> items;

        /* JADX INFO: renamed from: c24.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lc24/a$d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "linkId", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0134a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("linkId")
            @NotNull
            private final String linkId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("action")
            @NotNull
            private final n action;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final n getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getLinkId() {
                return this.linkId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0134a)) {
                    return false;
                }
                C0134a c0134a = (C0134a) obj2;
                return Intrinsics.f(this.linkId, c0134a.linkId) && Intrinsics.f(this.action, c0134a.action);
            }

            public final int hashCode() {
                return this.action.hashCode() + (this.linkId.hashCode() * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSecondDescription() {
            return this.secondDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getSecondDescriptionLinks() {
            return this.secondDescriptionLinks;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.secondDescription, dVar.secondDescription) && Intrinsics.f(this.secondDescriptionLinks, dVar.secondDescriptionLinks) && Intrinsics.f(this.items, dVar.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + p.a.d(p.a.c(this.title.hashCode() * 31, 31, this.secondDescription), 31, this.secondDescriptionLinks);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lc24/a$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "description", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

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
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.description, eVar.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getSelectSolicitor() {
        return this.selectSolicitor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.selectSolicitor, aVar.selectSolicitor) && Intrinsics.f(this.actions, aVar.actions);
    }

    public final int hashCode() {
        return this.actions.hashCode() + (this.selectSolicitor.hashCode() * 31);
    }
}
