package ljk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0014"}, d2 = {"Lljk/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "title", "", "Lljk/d;", "Ljava/util/List;", "()Ljava/util/List;", "content", "Lljk/d;", "()Lljk/d;", "footer", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final List<d> content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("footer")
    private final d footer;

    public p(String id10, String str, ArrayList content, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id10;
        this.title = str;
        this.content = content;
        this.footer = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.id, pVar.id) && Intrinsics.f(this.title, pVar.title) && Intrinsics.f(this.content, pVar.content) && Intrinsics.f(this.footer, pVar.footer);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.content);
        d dVar = this.footer;
        return iD + (dVar != null ? dVar.hashCode() : 0);
    }
}
