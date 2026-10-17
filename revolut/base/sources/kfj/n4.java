package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkfj/n4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "Lkfj/e0;", "b", "Lkfj/e0;", "()Lkfj/e0;", "subtitle", "", "Ljava/util/List;", "()Ljava/util/List;", "criteria", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final e0 subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("criteria")
    @NotNull
    private final List<e0> criteria;

    public n4(String title, e0 subtitle, ArrayList criteria) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.title = title;
        this.subtitle = subtitle;
        this.criteria = criteria;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCriteria() {
        return this.criteria;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.title, n4Var.title) && Intrinsics.f(this.subtitle, n4Var.subtitle) && Intrinsics.f(this.criteria, n4Var.criteria);
    }

    public final int hashCode() {
        return this.criteria.hashCode() + ((this.subtitle.hashCode() + (this.title.hashCode() * 31)) * 31);
    }
}
