package tx0;

import com.revolut.core.ui_kit.models.AnimationRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f275164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f275165b;

    public j(AnimationRequest animationRequest, Set highlightedActionsIds) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        Intrinsics.checkNotNullParameter(highlightedActionsIds, "highlightedActionsIds");
        this.f275164a = animationRequest;
        this.f275165b = highlightedActionsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f275164a, jVar.f275164a) && Intrinsics.f(this.f275165b, jVar.f275165b);
    }

    public final int hashCode() {
        return this.f275165b.hashCode() + (this.f275164a.hashCode() * 31);
    }
}
