package m63;

import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimationRequest f202987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f202988b;

    public c(AnimationRequest request, e previousModel) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(previousModel, "previousModel");
        this.f202987a = request;
        this.f202988b = previousModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f202987a, cVar.f202987a) && Intrinsics.f(this.f202988b, cVar.f202988b);
    }

    public final int hashCode() {
        return this.f202988b.hashCode() + (this.f202987a.hashCode() * 31);
    }
}
