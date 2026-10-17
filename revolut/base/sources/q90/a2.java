package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lq90/a2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "Lq90/z1;", "Lq90/z1;", "()Lq90/z1;", "details", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final z1 details;

    public a2(String title, z1 details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.title = title;
        this.details = details;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z1 getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.title, a2Var.title) && Intrinsics.f(this.details, a2Var.details);
    }

    public final int hashCode() {
        return this.details.hashCode() + (this.title.hashCode() * 31);
    }
}
