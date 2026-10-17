package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnx4/b2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "d", "header", "c", "f", "title", "g", "titleExtra", "description", "footer", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "footerAction", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    @NotNull
    private final String header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("titleExtra")
    @NotNull
    private final String titleExtra;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("footer")
    @NotNull
    private final String footer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("footerAction")
    private final n footerAction;

    public b2(String id10, String header, String title, String titleExtra, String str, String footer, n nVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleExtra, "titleExtra");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.id = id10;
        this.header = header;
        this.title = title;
        this.titleExtra = titleExtra;
        this.description = str;
        this.footer = footer;
        this.footerAction = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getFooterAction() {
        return this.footerAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.id, b2Var.id) && Intrinsics.f(this.header, b2Var.header) && Intrinsics.f(this.title, b2Var.title) && Intrinsics.f(this.titleExtra, b2Var.titleExtra) && Intrinsics.f(this.description, b2Var.description) && Intrinsics.f(this.footer, b2Var.footer) && Intrinsics.f(this.footerAction, b2Var.footerAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitleExtra() {
        return this.titleExtra;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.header), 31, this.title), 31, this.titleExtra);
        String str = this.description;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.footer);
        n nVar = this.footerAction;
        return iC2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
