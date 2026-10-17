package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lhcl/l2;", "", "", "toString", "()Ljava/lang/String;", "Lhcl/r2;", "a", "Lhcl/r2;", "b", "()Lhcl/r2;", "title", "body", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final r2 title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("body")
    @NotNull
    private final r2 body;

    public l2(r2 title, r2 body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.title = title;
        this.body = body;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r2 getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r2 getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.title, l2Var.title) && Intrinsics.f(this.body, l2Var.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + (this.title.hashCode() * 31);
    }
}
