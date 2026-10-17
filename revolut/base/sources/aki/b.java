package aki;

import com.revolut.kompot.navigable.ControllerKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerKey f5959a;

    public b(ControllerKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f5959a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f5959a, ((b) obj2).f5959a);
    }

    public final int hashCode() {
        return this.f5959a.f98378a.hashCode();
    }
}
