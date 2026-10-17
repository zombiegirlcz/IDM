package tx0;

import com.revolut.core.ui_kit.models.AnimationRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f275145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f275146b;

    public h(AnimationRequest animationRequest, Set highlightedActionsIds) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        Intrinsics.checkNotNullParameter(highlightedActionsIds, "highlightedActionsIds");
        this.f275145a = animationRequest;
        this.f275146b = highlightedActionsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f275145a, hVar.f275145a) && Intrinsics.f(this.f275146b, hVar.f275146b);
    }

    public final int hashCode() {
        return this.f275146b.hashCode() + (this.f275145a.hashCode() * 31);
    }
}
