package ba0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowUploadResult f13874b;

    public h(String itemId, BackendFlowUploadResult uploadResult) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(uploadResult, "uploadResult");
        this.f13873a = itemId;
        this.f13874b = uploadResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f13873a, hVar.f13873a) && Intrinsics.f(this.f13874b, hVar.f13874b);
    }

    public final int hashCode() {
        return this.f13874b.hashCode() + (this.f13873a.hashCode() * 31);
    }
}
