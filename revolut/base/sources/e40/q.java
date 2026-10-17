package e40;

import com.revolut.chat.domain.model.call.Call;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f122362a;

    public q(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f122362a = call;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f122362a, ((q) obj2).f122362a);
    }

    public final int hashCode() {
        return this.f122362a.hashCode();
    }
}
