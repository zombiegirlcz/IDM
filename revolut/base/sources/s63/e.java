package s63;

import com.revolut.core.ui_kit.models.AnimationRequest;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f260114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f260115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnimationRequest f260116c;

    public e(f0 card, int i) {
        AnimationRequest animationRequest = new AnimationRequest(false);
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(animationRequest, "animationRequest");
        this.f260114a = card;
        this.f260115b = i;
        this.f260116c = animationRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f260114a, eVar.f260114a) && this.f260115b == eVar.f260115b && Intrinsics.f(this.f260116c, eVar.f260116c);
    }

    public final int hashCode() {
        return this.f260116c.hashCode() + j6.a.b(this.f260115b, this.f260114a.hashCode() * 31, 31);
    }
}
