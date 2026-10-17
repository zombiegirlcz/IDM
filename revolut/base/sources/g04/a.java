package g04;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lg04/a;", "", "", "toString", "()Ljava/lang/String;", "Lg04/a$b;", "a", "Lg04/a$b;", "b", "()Lg04/a$b;", "selectContactScreen", "Lg04/a$a;", "Lg04/a$a;", "()Lg04/a$a;", "requestConsentScreen", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectContactScreen")
    private final b selectContactScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestConsentScreen")
    @NotNull
    private final C0809a requestConsentScreen;

    /* JADX INFO: renamed from: g04.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0010\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Lg04/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "", "Lg04/a$a$c;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "sections", "c", "buttonTitle", "Lg04/a$a$a;", "Lg04/a$a$a;", "()Lg04/a$a$a;", "coApplicantApplicationInProgressErrorPopup", "Lg04/a$a$b;", "Lg04/a$a$b;", "()Lg04/a$a$b;", "coBorrowerDetails", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0809a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("sections")
        @NotNull
        private final List<c> sections;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("coApplicantApplicationInProgressErrorPopup")
        @NotNull
        private final C0810a coApplicantApplicationInProgressErrorPopup;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("coBorrowerDetails")
        private final b coBorrowerDetails;

        /* JADX INFO: renamed from: g04.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lg04/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "description", "Lg04/a$a$a$a;", "c", "Lg04/a$a$a$a;", "()Lg04/a$a$a$a;", "primaryButton", "secondaryButton", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0810a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("primaryButton")
            @NotNull
            private final C0811a primaryButton;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("secondaryButton")
            private final C0811a secondaryButton;

            /* JADX INFO: renamed from: g04.a$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lg04/a$a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "action", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0811a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("title")
                @NotNull
                private final String title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("action")
                @NotNull
                private final String action;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getAction() {
                    return this.action;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0811a)) {
                        return false;
                    }
                    C0811a c0811a = (C0811a) obj2;
                    return Intrinsics.f(this.title, c0811a.title) && Intrinsics.f(this.action, c0811a.action);
                }

                public final int hashCode() {
                    return this.action.hashCode() + (this.title.hashCode() * 31);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C0811a getPrimaryButton() {
                return this.primaryButton;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C0811a getSecondaryButton() {
                return this.secondaryButton;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0810a)) {
                    return false;
                }
                C0810a c0810a = (C0810a) obj2;
                return Intrinsics.f(this.title, c0810a.title) && Intrinsics.f(this.description, c0810a.description) && Intrinsics.f(this.primaryButton, c0810a.primaryButton) && Intrinsics.f(this.secondaryButton, c0810a.secondaryButton);
            }

            public final int hashCode() {
                int iHashCode = (this.primaryButton.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.description)) * 31;
                C0811a c0811a = this.secondaryButton;
                return iHashCode + (c0811a == null ? 0 : c0811a.hashCode());
            }
        }

        /* JADX INFO: renamed from: g04.a$a$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lg04/a$a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "fullName", "b", "phoneNumber", "c", "userId", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("fullName")
            @NotNull
            private final String fullName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("phoneNumber")
            @NotNull
            private final String phoneNumber;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("userId")
            @NotNull
            private final String userId;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getFullName() {
                return this.fullName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getUserId() {
                return this.userId;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.fullName, bVar.fullName) && Intrinsics.f(this.phoneNumber, bVar.phoneNumber) && Intrinsics.f(this.userId, bVar.userId);
            }

            public final int hashCode() {
                return this.userId.hashCode() + p.a.c(this.fullName.hashCode() * 31, 31, this.phoneNumber);
            }
        }

        /* JADX INFO: renamed from: g04.a$a$c */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lg04/a$a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "", "Lg04/a$a$c$a;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("items")
            @NotNull
            private final List<C0812a> items;

            /* JADX INFO: renamed from: g04.a$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lg04/a$a$c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "description", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0812a {

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
                    if (!(obj2 instanceof C0812a)) {
                        return false;
                    }
                    C0812a c0812a = (C0812a) obj2;
                    return Intrinsics.f(this.title, c0812a.title) && Intrinsics.f(this.description, c0812a.description);
                }

                public final int hashCode() {
                    return this.description.hashCode() + (this.title.hashCode() * 31);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getItems() {
                return this.items;
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
                return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.items, cVar.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C0810a getCoApplicantApplicationInProgressErrorPopup() {
            return this.coApplicantApplicationInProgressErrorPopup;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getCoBorrowerDetails() {
            return this.coBorrowerDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getSections() {
            return this.sections;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0809a)) {
                return false;
            }
            C0809a c0809a = (C0809a) obj2;
            return Intrinsics.f(this.title, c0809a.title) && Intrinsics.f(this.sections, c0809a.sections) && Intrinsics.f(this.buttonTitle, c0809a.buttonTitle) && Intrinsics.f(this.coApplicantApplicationInProgressErrorPopup, c0809a.coApplicantApplicationInProgressErrorPopup) && Intrinsics.f(this.coBorrowerDetails, c0809a.coBorrowerDetails);
        }

        public final int hashCode() {
            int iHashCode = (this.coApplicantApplicationInProgressErrorPopup.hashCode() + p.a.c(p.a.d(this.title.hashCode() * 31, 31, this.sections), 31, this.buttonTitle)) * 31;
            b bVar = this.coBorrowerDetails;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lg04/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "title", "b", "c", "description", "h", "searchPlaceholder", "d", "e", "emptyResultTitle", "emptyResultSubtitle", "f", "g", "noResultsDisclaimer", "availableContacts", "buttonTitle", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "inviteFlowEnabled", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("searchPlaceholder")
        @NotNull
        private final String searchPlaceholder;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("emptyResultTitle")
        @NotNull
        private final String emptyResultTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("emptyResultSubtitle")
        @NotNull
        private final String emptyResultSubtitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("noResultsDisclaimer")
        @NotNull
        private final String noResultsDisclaimer;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("availableContacts")
        @NotNull
        private final String availableContacts;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("inviteFlowEnabled")
        private final Boolean inviteFlowEnabled;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAvailableContacts() {
            return this.availableContacts;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEmptyResultSubtitle() {
            return this.emptyResultSubtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getEmptyResultTitle() {
            return this.emptyResultTitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.searchPlaceholder, bVar.searchPlaceholder) && Intrinsics.f(this.emptyResultTitle, bVar.emptyResultTitle) && Intrinsics.f(this.emptyResultSubtitle, bVar.emptyResultSubtitle) && Intrinsics.f(this.noResultsDisclaimer, bVar.noResultsDisclaimer) && Intrinsics.f(this.availableContacts, bVar.availableContacts) && Intrinsics.f(this.buttonTitle, bVar.buttonTitle) && Intrinsics.f(this.inviteFlowEnabled, bVar.inviteFlowEnabled);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Boolean getInviteFlowEnabled() {
            return this.inviteFlowEnabled;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getNoResultsDisclaimer() {
            return this.noResultsDisclaimer;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSearchPlaceholder() {
            return this.searchPlaceholder;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.searchPlaceholder), 31, this.emptyResultTitle), 31, this.emptyResultSubtitle), 31, this.noResultsDisclaimer), 31, this.availableContacts), 31, this.buttonTitle);
            Boolean bool = this.inviteFlowEnabled;
            return iC + (bool != null ? bool.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0809a getRequestConsentScreen() {
        return this.requestConsentScreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getSelectContactScreen() {
        return this.selectContactScreen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.selectContactScreen, aVar.selectContactScreen) && Intrinsics.f(this.requestConsentScreen, aVar.requestConsentScreen);
    }

    public final int hashCode() {
        b bVar = this.selectContactScreen;
        return this.requestConsentScreen.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
