package y04;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.e1;
import nx4.k0;
import nx4.m0;
import nx4.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u000f\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u0010"}, d2 = {"Ly04/a;", "", "", "toString", "()Ljava/lang/String;", "Ly04/a$c;", "a", "Ly04/a$c;", "b", "()Ly04/a$c;", "sources", "Ly04/a$a;", "Ly04/a$a;", "()Ly04/a$a;", "details", "c", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sources")
    @NotNull
    private final c sources;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final C1726a details;

    /* JADX INFO: renamed from: y04.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Ly04/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "title", "b", "d", "descriptionTemplate", "c", "descriptionAmountExceededTemplate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "depositAmount", "e", "f", "sourcesTitle", "", "Ly04/a$b;", "Ljava/util/List;", "()Ljava/util/List;", "sources", "buttonTitle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1726a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("descriptionTemplate")
        @NotNull
        private final String descriptionTemplate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("descriptionAmountExceededTemplate")
        @NotNull
        private final String descriptionAmountExceededTemplate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("depositAmount")
        @NotNull
        private final jo3.a depositAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("sourcesTitle")
        @NotNull
        private final String sourcesTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("sources")
        @NotNull
        private final List<b> sources;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("buttonTitle")
        @NotNull
        private final String buttonTitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getDepositAmount() {
            return this.depositAmount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescriptionAmountExceededTemplate() {
            return this.descriptionAmountExceededTemplate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDescriptionTemplate() {
            return this.descriptionTemplate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final List getSources() {
            return this.sources;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1726a)) {
                return false;
            }
            C1726a c1726a = (C1726a) obj2;
            return Intrinsics.f(this.title, c1726a.title) && Intrinsics.f(this.descriptionTemplate, c1726a.descriptionTemplate) && Intrinsics.f(this.descriptionAmountExceededTemplate, c1726a.descriptionAmountExceededTemplate) && Intrinsics.f(this.depositAmount, c1726a.depositAmount) && Intrinsics.f(this.sourcesTitle, c1726a.sourcesTitle) && Intrinsics.f(this.sources, c1726a.sources) && Intrinsics.f(this.buttonTitle, c1726a.buttonTitle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSourcesTitle() {
            return this.sourcesTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.buttonTitle.hashCode() + p.a.d(p.a.c(v7.j(this.depositAmount, p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.descriptionTemplate), 31, this.descriptionAmountExceededTemplate), 31), 31, this.sourcesTitle), 31, this.sources);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Ly04/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "d", "title", "Lnx4/k0;", "c", "Lnx4/k0;", "()Lnx4/k0;", "image", "progressColor", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("image")
        @NotNull
        private final k0 image;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("progressColor")
        @NotNull
        private final String progressColor;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k0 getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProgressColor() {
            return this.progressColor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.image, bVar.image) && Intrinsics.f(this.progressColor, bVar.progressColor);
        }

        public final int hashCode() {
            return this.progressColor.hashCode() + ((this.image.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.title)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly04/a$c;", "", "", "toString", "()Ljava/lang/String;", "Lnx4/e1;", "a", "Lnx4/e1;", "b", "()Lnx4/e1;", "header", "", "Lnx4/m0;", "Ljava/util/List;", "c", "()Ljava/util/List;", "items", "Lnx4/q;", "Lnx4/q;", "()Lnx4/q;", "actionFooter", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("header")
        @NotNull
        private final e1 header;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final List<m0> items;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("actionFooter")
        @NotNull
        private final q actionFooter;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q getActionFooter() {
            return this.actionFooter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e1 getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.header, cVar.header) && Intrinsics.f(this.items, cVar.items) && Intrinsics.f(this.actionFooter, cVar.actionFooter);
        }

        public final int hashCode() {
            return this.actionFooter.hashCode() + p.a.d(this.header.hashCode() * 31, 31, this.items);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1726a getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getSources() {
        return this.sources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.sources, aVar.sources) && Intrinsics.f(this.details, aVar.details);
    }

    public final int hashCode() {
        int iHashCode = this.sources.hashCode() * 31;
        C1726a c1726a = this.details;
        return iHashCode + (c1726a == null ? 0 : c1726a.hashCode());
    }
}
