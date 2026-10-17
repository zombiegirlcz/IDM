package g14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lg14/c$a;", "Lg14/c;", "", "toString", "()Ljava/lang/String;", "Lg14/e;", "a", "Lg14/e;", "()Lg14/e;", "content", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("popup")
        @NotNull
        private final e content;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getContent() {
            return this.content;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.content, ((a) obj2).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000f"}, d2 = {"Lg14/c$b;", "Lg14/c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "url", "Lg14/c$b$a;", "b", "Lg14/c$b$a;", "()Lg14/c$b$a;", "continuePopup", "successPopupTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        @NotNull
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("continuePopup")
        private final a continuePopup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("successPopupTitle")
        @NotNull
        private final String successPopupTitle;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lg14/c$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "b", "description", "c", "primaryButtonTitle", "secondaryButtonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.primaryButtonTitle, aVar.primaryButtonTitle) && Intrinsics.f(this.secondaryButtonTitle, aVar.secondaryButtonTitle);
            }

            public final int hashCode() {
                return this.secondaryButtonTitle.hashCode() + p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.primaryButtonTitle);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getContinuePopup() {
            return this.continuePopup;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSuccessPopupTitle() {
            return this.successPopupTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.url, bVar.url) && Intrinsics.f(this.continuePopup, bVar.continuePopup) && Intrinsics.f(this.successPopupTitle, bVar.successPopupTitle);
        }

        public final int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            a aVar = this.continuePopup;
            return this.successPopupTitle.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }
    }

    private c() {
    }
}
