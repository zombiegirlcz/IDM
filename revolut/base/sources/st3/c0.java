package st3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\u0004R$\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006&"}, d2 = {"Lst3/c0;", "Lst3/u;", "", "toString", "()Ljava/lang/String;", "Lst3/b0;", "a", "Lst3/b0;", "d", "()Lst3/b0;", "header", "b", "Ljava/lang/String;", "f", "title", "c", "description", "", "Lst3/p;", "Ljava/util/List;", "()Ljava/util/List;", "contentItems", "Lst3/d;", "e", "Lst3/d;", "()Lst3/d;", "footer", "Lst3/c;", "Lst3/c;", "W", "()Lst3/c;", "primaryButton", "g", "T", "secondaryButton", "Lst3/b;", "h", "links", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    private final b0 header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("contentItems")
    private final List<p> contentItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("footer")
    private final d footer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("primaryButton")
    private final c primaryButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondaryButton")
    private final c secondaryButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("links")
    private final List<b> links;

    @Override // st3.u
    /* JADX INFO: renamed from: T, reason: from getter */
    public final c getSecondaryButton() {
        return this.secondaryButton;
    }

    @Override // st3.u
    /* JADX INFO: renamed from: W, reason: from getter */
    public final c getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getContentItems() {
        return this.contentItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getLinks() {
        return this.links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.header, c0Var.header) && Intrinsics.f(this.title, c0Var.title) && Intrinsics.f(this.description, c0Var.description) && Intrinsics.f(this.contentItems, c0Var.contentItems) && Intrinsics.f(this.footer, c0Var.footer) && Intrinsics.f(this.primaryButton, c0Var.primaryButton) && Intrinsics.f(this.secondaryButton, c0Var.secondaryButton) && Intrinsics.f(this.links, c0Var.links);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        b0 b0Var = this.header;
        int iC = p.a.c((b0Var == null ? 0 : b0Var.hashCode()) * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<p> list = this.contentItems;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        d dVar = this.footer;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.primaryButton;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.secondaryButton;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        List<b> list2 = this.links;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }
}
