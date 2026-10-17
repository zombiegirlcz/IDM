package hcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lhcl/j2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "tab", "b", "d", "title", "body", "", "Lhcl/m2;", "Ljava/util/List;", "()Ljava/util/List;", "ranges", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tab")
    @NotNull
    private final String tab;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("body")
    @NotNull
    private final String body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ranges")
    @NotNull
    private final List<m2> ranges;

    public j2(String tab2, String title, String body, ArrayList ranges) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        this.tab = tab2;
        this.title = title;
        this.body = body;
        this.ranges = ranges;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRanges() {
        return this.ranges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTab() {
        return this.tab;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.tab, j2Var.tab) && Intrinsics.f(this.title, j2Var.title) && Intrinsics.f(this.body, j2Var.body) && Intrinsics.f(this.ranges, j2Var.ranges);
    }

    public final int hashCode() {
        return this.ranges.hashCode() + p.a.c(p.a.c(this.tab.hashCode() * 31, 31, this.title), 31, this.body);
    }
}
