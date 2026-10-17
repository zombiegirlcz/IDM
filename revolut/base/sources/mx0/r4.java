package mx0;

import com.revolut.core.ui_kit.models.AnimationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f209975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimationRequest f209976b;

    public r4(int i, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        this.f209975a = i;
        this.f209976b = animationRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return this.f209975a == r4Var.f209975a && Intrinsics.f(this.f209976b, r4Var.f209976b);
    }

    public final int hashCode() {
        return this.f209976b.hashCode() + (Integer.hashCode(this.f209975a) * 31);
    }
}
