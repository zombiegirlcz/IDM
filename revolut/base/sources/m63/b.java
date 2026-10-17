package m63;

import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f202986a;

    public b(AnimationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f202986a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f202986a, ((b) obj2).f202986a);
    }

    public final int hashCode() {
        return this.f202986a.hashCode();
    }
}
