package st3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006#"}, d2 = {"Lst3/a;", "Lst3/u;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "description", "c", "e", "secondDescription", "Lst3/s;", "d", "Lst3/s;", "()Lst3/s;", "link", "", "Lnx4/m0;", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lst3/c;", "Lst3/c;", "W", "()Lst3/c;", "primaryButton", "g", "T", "secondaryButton", "Lst3/b;", "h", "links", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("secondDescription")
    private final String secondDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("link")
    private final s link;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

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
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSecondDescription() {
        return this.secondDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.secondDescription, aVar.secondDescription) && Intrinsics.f(this.link, aVar.link) && Intrinsics.f(this.items, aVar.items) && Intrinsics.f(this.primaryButton, aVar.primaryButton) && Intrinsics.f(this.secondaryButton, aVar.secondaryButton) && Intrinsics.f(this.links, aVar.links);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s sVar = this.link;
        int iD = p.a.d((iHashCode3 + (sVar == null ? 0 : sVar.hashCode())) * 31, 31, this.items);
        c cVar = this.primaryButton;
        int iHashCode4 = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.secondaryButton;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        List<b> list = this.links;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }
}
