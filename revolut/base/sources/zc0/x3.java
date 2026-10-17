package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowFile f321157b;

    public x3(String itemId, BackendFlowFile file) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f321156a = itemId;
        this.f321157b = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return Intrinsics.f(this.f321156a, x3Var.f321156a) && this.f321157b.equals(x3Var.f321157b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321156a;
    }

    public final int hashCode() {
        return this.f321157b.hashCode() + (this.f321156a.hashCode() * 31);
    }
}
