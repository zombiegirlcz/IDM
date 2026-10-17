package bjk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0015"}, d2 = {"Lbjk/j0;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/k0;", "a", "Lbjk/k0;", "()Lbjk/k0;", "avatar", "b", "Ljava/lang/String;", "d", "title", "c", "description", "", "Lbjk/p0;", "Ljava/util/List;", "()Ljava/util/List;", "detailsItems", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("avatar")
    private final k0 avatar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("detailsItems")
    @NotNull
    private final List<p0> detailsItems;

    public j0(k0 k0Var, String title, String str, ArrayList detailsItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(detailsItems, "detailsItems");
        this.avatar = k0Var;
        this.title = title;
        this.description = str;
        this.detailsItems = detailsItems;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k0 getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDetailsItems() {
        return this.detailsItems;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.avatar, j0Var.avatar) && Intrinsics.f(this.title, j0Var.title) && Intrinsics.f(this.description, j0Var.description) && Intrinsics.f(this.detailsItems, j0Var.detailsItems);
    }

    public final int hashCode() {
        k0 k0Var = this.avatar;
        int iC = p.a.c((k0Var == null ? 0 : k0Var.hashCode()) * 31, 31, this.title);
        String str = this.description;
        return this.detailsItems.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }
}
