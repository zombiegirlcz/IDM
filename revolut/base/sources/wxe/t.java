package wxe;

import com.revolut.feature.topup_screen.api.model.StoredMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoredMethod f300919a;

    public t(StoredMethod storedMethod) {
        Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
        this.f300919a = storedMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f300919a, ((t) obj2).f300919a);
    }

    public final int hashCode() {
        return this.f300919a.hashCode();
    }
}
