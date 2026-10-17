package lb0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowUploadResult f193566b;

    public v(String itemId, BackendFlowUploadResult uploadResult) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(uploadResult, "uploadResult");
        this.f193565a = itemId;
        this.f193566b = uploadResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f193565a, vVar.f193565a) && Intrinsics.f(this.f193566b, vVar.f193566b);
    }

    @Override // lb0.w
    public final String getItemId() {
        return this.f193565a;
    }

    public final int hashCode() {
        return this.f193566b.hashCode() + (this.f193565a.hashCode() * 31);
    }
}
