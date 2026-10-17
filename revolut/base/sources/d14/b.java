package d14;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.s1;
import org.jetbrains.annotations.NotNull;
import st3.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\b\u0013\u0010\"\b\u0006\f\u001d\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\f\u0010\u001f¨\u0006#"}, d2 = {"Ld14/b;", "", "", "toString", "()Ljava/lang/String;", "Ld14/b$d;", "a", "Ld14/b$d;", "c", "()Ld14/b$d;", "evidenceHolderSelection", "Lst3/u;", "b", "Lst3/u;", "()Lst3/u;", "coApplicantConfirmation", "e", "jointApplicantsConfirmation", "Ld14/b$e;", "d", "Ld14/b$e;", "()Ld14/b$e;", "evidenceTypeSelection", "Ld14/b$h;", "Ld14/b$h;", "g", "()Ld14/b$h;", "summary", "Ld14/b$g;", "f", "Ld14/b$g;", "()Ld14/b$g;", "mainApplicantStatusPopup", "coApplicantStatusPopup", "h", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("evidenceHolderSelection")
    private final d evidenceHolderSelection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("coApplicantConfirmation")
    private final u coApplicantConfirmation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("jointApplicantsConfirmation")
    private final u jointApplicantsConfirmation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("evidenceTypeSelection")
    @NotNull
    private final e evidenceTypeSelection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("summary")
    @NotNull
    private final h summary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("mainApplicantStatusPopup")
    @NotNull
    private final g mainApplicantStatusPopup;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("coApplicantStatusPopup")
    private final g coApplicantStatusPopup;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Ld14/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "cantFindBankCellTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cantFindBankCellTitle")
        @NotNull
        private final String cantFindBankCellTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCantFindBankCellTitle() {
            return this.cantFindBankCellTitle;
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
            return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.cantFindBankCellTitle, aVar.cantFindBankCellTitle);
        }

        public final int hashCode() {
            return this.cantFindBankCellTitle.hashCode() + (this.title.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: d14.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Ld14/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "description", "c", "closeButtonTitle", "manualUploadButtonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0652b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("closeButtonTitle")
        @NotNull
        private final String closeButtonTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("manualUploadButtonTitle")
        @NotNull
        private final String manualUploadButtonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCloseButtonTitle() {
            return this.closeButtonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getManualUploadButtonTitle() {
            return this.manualUploadButtonTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0652b)) {
                return false;
            }
            C0652b c0652b = (C0652b) obj2;
            return Intrinsics.f(this.title, c0652b.title) && Intrinsics.f(this.description, c0652b.description) && Intrinsics.f(this.closeButtonTitle, c0652b.closeButtonTitle) && Intrinsics.f(this.manualUploadButtonTitle, c0652b.manualUploadButtonTitle);
        }

        public final int hashCode() {
            return this.manualUploadButtonTitle.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.closeButtonTitle);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"Ld14/b$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "description", "c", "buttonTitle", "d", "disclaimer", "", "Ld14/b$c$a;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("disclaimer")
        @NotNull
        private final String disclaimer;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<a> items;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Ld14/b$c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "icon", "c", "title", "description", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

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

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
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
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description);
            }

            public final int hashCode() {
                return this.description.hashCode() + p.a.c(this.icon.hashCode() * 31, 31, this.title);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.buttonTitle, cVar.buttonTitle) && Intrinsics.f(this.disclaimer, cVar.disclaimer) && Intrinsics.f(this.items, cVar.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + p.a.c(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.buttonTitle), 31, this.disclaimer);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Ld14/b$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "description", "", "Ld14/b$d$a;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<a> items;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Ld14/b$d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "description", "d", "type", "icon", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.icon, aVar.icon);
            }

            public final int hashCode() {
                return this.icon.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.type);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
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
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.description, dVar.description) && Intrinsics.f(this.items, dVar.items);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            return this.items.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\t\u0005\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0018"}, d2 = {"Ld14/b$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "description", "Ld14/b$e$b;", "c", "Ld14/b$e$b;", "d", "()Ld14/b$e$b;", "secondDescription", "disclaimer", "", "Ld14/b$e$a;", "Ljava/util/List;", "()Ljava/util/List;", "items", "d14/f", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondDescription")
        private final C0653b secondDescription;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("disclaimer")
        private final String disclaimer;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<a> items;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Ld14/b$e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "description", "c", "icon", "Ld14/f;", "Ld14/f;", "()Ld14/f;", "action", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("action")
            private final d14.f action;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d14.f getAction() {
                return this.action;
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.action, aVar.action);
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.icon);
                d14.f fVar = this.action;
                return iC + (fVar == null ? 0 : fVar.hashCode());
            }
        }

        /* JADX INFO: renamed from: d14.b$e$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Ld14/b$e$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "info", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0653b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("info")
            @NotNull
            private final s1 info;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final s1 getInfo() {
                return this.info;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0653b)) {
                    return false;
                }
                C0653b c0653b = (C0653b) obj2;
                return Intrinsics.f(this.text, c0653b.text) && Intrinsics.f(this.info, c0653b.info);
            }

            public final int hashCode() {
                return this.info.hashCode() + (this.text.hashCode() * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C0653b getSecondDescription() {
            return this.secondDescription;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.description, eVar.description) && Intrinsics.f(this.secondDescription, eVar.secondDescription) && Intrinsics.f(this.disclaimer, eVar.disclaimer) && Intrinsics.f(this.items, eVar.items);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C0653b c0653b = this.secondDescription;
            int iHashCode3 = (iHashCode2 + (c0653b == null ? 0 : c0653b.hashCode())) * 31;
            String str2 = this.disclaimer;
            return this.items.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Ld14/b$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "description", "c", "search", "buttonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("search")
        @NotNull
        private final String search;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSearch() {
            return this.search;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.search, fVar.search) && Intrinsics.f(this.buttonTitle, fVar.buttonTitle);
        }

        public final int hashCode() {
            return this.buttonTitle.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.search);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Ld14/b$g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "status", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("status")
        @NotNull
        private final String status;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.status, gVar.status);
        }

        public final int hashCode() {
            return this.status.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u000b\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e¨\u0006 "}, d2 = {"Ld14/b$h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "title", "b", "description", "c", "jointApplicantsDescription", "", "Ld14/b$h$c;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "sections", "e", "primaryButtonTitle", "f", "secondaryButtonTitle", "Ld14/b$h$a;", "Ld14/b$h$a;", "()Ld14/b$h$a;", "emptyState", "Ld14/b$h$b;", "Ld14/b$h$b;", "()Ld14/b$h$b;", "revokeRevolutConfirmation", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("jointApplicantsDescription")
        private final String jointApplicantsDescription;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("sections")
        @NotNull
        private final List<c> sections;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("primaryButtonTitle")
        @NotNull
        private final String primaryButtonTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("secondaryButtonTitle")
        @NotNull
        private final String secondaryButtonTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("emptyState")
        @NotNull
        private final a emptyState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("revokeRevolutConfirmation")
        private final C0654b revokeRevolutConfirmation;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Ld14/b$h$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "icon", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.icon, aVar.icon);
            }

            public final int hashCode() {
                return this.icon.hashCode() + (this.title.hashCode() * 31);
            }
        }

        /* JADX INFO: renamed from: d14.b$h$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Ld14/b$h$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "c", "description", "backButtonTitle", "confirmButtonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0654b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("backButtonTitle")
            @NotNull
            private final String backButtonTitle;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("confirmButtonTitle")
            @NotNull
            private final String confirmButtonTitle;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getBackButtonTitle() {
                return this.backButtonTitle;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getConfirmButtonTitle() {
                return this.confirmButtonTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0654b)) {
                    return false;
                }
                C0654b c0654b = (C0654b) obj2;
                return Intrinsics.f(this.title, c0654b.title) && Intrinsics.f(this.description, c0654b.description) && Intrinsics.f(this.backButtonTitle, c0654b.backButtonTitle) && Intrinsics.f(this.confirmButtonTitle, c0654b.confirmButtonTitle);
            }

            public final int hashCode() {
                return this.confirmButtonTitle.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.backButtonTitle);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Ld14/b$h$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "title", "b", "type", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.type, cVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + (this.title.hashCode() * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getEmptyState() {
            return this.emptyState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getJointApplicantsDescription() {
            return this.jointApplicantsDescription;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPrimaryButtonTitle() {
            return this.primaryButtonTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C0654b getRevokeRevolutConfirmation() {
            return this.revokeRevolutConfirmation;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.description, hVar.description) && Intrinsics.f(this.jointApplicantsDescription, hVar.jointApplicantsDescription) && Intrinsics.f(this.sections, hVar.sections) && Intrinsics.f(this.primaryButtonTitle, hVar.primaryButtonTitle) && Intrinsics.f(this.secondaryButtonTitle, hVar.secondaryButtonTitle) && Intrinsics.f(this.emptyState, hVar.emptyState) && Intrinsics.f(this.revokeRevolutConfirmation, hVar.revokeRevolutConfirmation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSecondaryButtonTitle() {
            return this.secondaryButtonTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final List getSections() {
            return this.sections;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iC = p.a.c(this.title.hashCode() * 31, 31, this.description);
            String str = this.jointApplicantsDescription;
            int iHashCode = (this.emptyState.hashCode() + p.a.c(p.a.c(p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.sections), 31, this.primaryButtonTitle), 31, this.secondaryButtonTitle)) * 31;
            C0654b c0654b = this.revokeRevolutConfirmation;
            return iHashCode + (c0654b != null ? c0654b.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u getCoApplicantConfirmation() {
        return this.coApplicantConfirmation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getCoApplicantStatusPopup() {
        return this.coApplicantStatusPopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getEvidenceHolderSelection() {
        return this.evidenceHolderSelection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getEvidenceTypeSelection() {
        return this.evidenceTypeSelection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u getJointApplicantsConfirmation() {
        return this.jointApplicantsConfirmation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.evidenceHolderSelection, bVar.evidenceHolderSelection) && Intrinsics.f(this.coApplicantConfirmation, bVar.coApplicantConfirmation) && Intrinsics.f(this.jointApplicantsConfirmation, bVar.jointApplicantsConfirmation) && Intrinsics.f(this.evidenceTypeSelection, bVar.evidenceTypeSelection) && Intrinsics.f(this.summary, bVar.summary) && Intrinsics.f(this.mainApplicantStatusPopup, bVar.mainApplicantStatusPopup) && Intrinsics.f(this.coApplicantStatusPopup, bVar.coApplicantStatusPopup);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g getMainApplicantStatusPopup() {
        return this.mainApplicantStatusPopup;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h getSummary() {
        return this.summary;
    }

    public final int hashCode() {
        d dVar = this.evidenceHolderSelection;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        u uVar = this.coApplicantConfirmation;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        u uVar2 = this.jointApplicantsConfirmation;
        int iHashCode3 = (this.mainApplicantStatusPopup.hashCode() + ((this.summary.hashCode() + ((this.evidenceTypeSelection.hashCode() + ((iHashCode2 + (uVar2 == null ? 0 : uVar2.hashCode())) * 31)) * 31)) * 31)) * 31;
        g gVar = this.coApplicantStatusPopup;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }
}
