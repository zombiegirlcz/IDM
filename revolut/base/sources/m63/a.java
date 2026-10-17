package m63;

import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f202985a;

    public a(AnimationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f202985a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f202985a, ((a) obj2).f202985a);
    }

    public final int hashCode() {
        return this.f202985a.hashCode();
    }
}
