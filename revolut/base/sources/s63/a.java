package s63;

import com.revolut.core.ui_kit.models.AnimationRequest;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f260103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimationRequest f260104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260105c;

    public a(f0 previousCard, int i) {
        AnimationRequest animationRequest = new AnimationRequest(false);
        boolean z = (i & 4) != 0;
        Intrinsics.checkNotNullParameter(previousCard, "previousCard");
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        this.f260103a = previousCard;
        this.f260104b = animationRequest;
        this.f260105c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f260103a, aVar.f260103a) && Intrinsics.f(this.f260104b, aVar.f260104b) && this.f260105c == aVar.f260105c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260105c) + ((this.f260104b.hashCode() + (this.f260103a.hashCode() * 31)) * 31);
    }
}
