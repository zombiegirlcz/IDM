package ob0;

import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropDownItem f223820a;

    public f(DropDownItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f223820a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f223820a, ((f) obj2).f223820a);
    }

    public final int hashCode() {
        return this.f223820a.hashCode();
    }
}
