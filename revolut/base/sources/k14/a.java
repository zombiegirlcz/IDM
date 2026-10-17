package k14;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\r\u0011\u000b\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0016"}, d2 = {"Lk14/a;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "ableToSkipLinkingProcess", "Lk14/a$c;", "b", "Lk14/a$c;", "d", "()Lk14/a$c;", "introScreen", "Lk14/a$d;", "c", "Lk14/a$d;", "()Lk14/a$d;", "bankSelectionScreen", "accountsScreen", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ableToSkipLinkingProcess")
    private final boolean ableToSkipLinkingProcess;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("introScreen")
    @NotNull
    private final c introScreen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankSelectionScreen")
    private final d bankSelectionScreen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accountsScreen")
    private final d accountsScreen;

    /* JADX INFO: renamed from: k14.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000f"}, d2 = {"Lk14/a$a;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTitle", "title", "b", "description", "c", "primaryButtonTitle", "d", "secondaryButtonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1027a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("primaryButtonTitle")
        @NotNull
        private final String primaryButtonTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("secondaryButtonTitle")
        @NotNull
        private final String secondaryButtonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPrimaryButtonTitle() {
            return this.primaryButtonTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSecondaryButtonTitle() {
            return this.secondaryButtonTitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1027a)) {
                return false;
            }
            C1027a c1027a = (C1027a) obj2;
            return Intrinsics.f(this.title, c1027a.title) && Intrinsics.f(this.description, c1027a.description) && Intrinsics.f(this.primaryButtonTitle, c1027a.primaryButtonTitle) && Intrinsics.f(this.secondaryButtonTitle, c1027a.secondaryButtonTitle);
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.secondaryButtonTitle.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.primaryButtonTitle);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Lk14/a$b;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLabel", "label", "b", "getTitle", "title", "c", "description", "d", "buttonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("buttonTitle")
        private final String buttonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.buttonTitle, bVar.buttonTitle);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u000f\u0010\u001b¨\u0006\u001d"}, d2 = {"Lk14/a$c;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTitle", "title", "b", "description", "c", "footer", "d", "image", "e", "buttonTitle", "f", "h", "secondaryButtonTitle", "Lk14/a$a;", "g", "Lk14/a$a;", "()Lk14/a$a;", "secondaryButtonActionPopup", "Lk14/a$b;", "Lk14/a$b;", "()Lk14/a$b;", "infoPopup", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("footer")
        private final String footer;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("image")
        @NotNull
        private final String image;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("secondaryButtonTitle")
        private final String secondaryButtonTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("secondaryButtonActionPopup")
        private final C1027a secondaryButtonActionPopup;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("infoPopup")
        private final b infoPopup;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFooter() {
            return this.footer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getInfoPopup() {
            return this.infoPopup;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.description, cVar.description) && Intrinsics.f(this.footer, cVar.footer) && Intrinsics.f(this.image, cVar.image) && Intrinsics.f(this.buttonTitle, cVar.buttonTitle) && Intrinsics.f(this.secondaryButtonTitle, cVar.secondaryButtonTitle) && Intrinsics.f(this.secondaryButtonActionPopup, cVar.secondaryButtonActionPopup) && Intrinsics.f(this.infoPopup, cVar.infoPopup);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C1027a getSecondaryButtonActionPopup() {
            return this.secondaryButtonActionPopup;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSecondaryButtonTitle() {
            return this.secondaryButtonTitle;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.footer;
            int iC = p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.image), 31, this.buttonTitle);
            String str3 = this.secondaryButtonTitle;
            int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            C1027a c1027a = this.secondaryButtonActionPopup;
            int iHashCode4 = (iHashCode3 + (c1027a == null ? 0 : c1027a.hashCode())) * 31;
            b bVar = this.infoPopup;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lk14/a$d;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTitle", "title", "b", "subtitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        @NotNull
        private final String subtitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.subtitle, dVar.subtitle);
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAbleToSkipLinkingProcess() {
        return this.ableToSkipLinkingProcess;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getAccountsScreen() {
        return this.accountsScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getBankSelectionScreen() {
        return this.bankSelectionScreen;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getIntroScreen() {
        return this.introScreen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.ableToSkipLinkingProcess == aVar.ableToSkipLinkingProcess && Intrinsics.f(this.introScreen, aVar.introScreen) && Intrinsics.f(this.bankSelectionScreen, aVar.bankSelectionScreen) && Intrinsics.f(this.accountsScreen, aVar.accountsScreen);
    }

    public final int hashCode() {
        int iHashCode = (this.introScreen.hashCode() + (Boolean.hashCode(this.ableToSkipLinkingProcess) * 31)) * 31;
        d dVar = this.bankSelectionScreen;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.accountsScreen;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
