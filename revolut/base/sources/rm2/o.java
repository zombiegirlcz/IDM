package rm2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundKey f255195a;

    public o(BackgroundKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f255195a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f255195a, ((o) obj2).f255195a);
    }

    public final int hashCode() {
        return this.f255195a.hashCode();
    }
}
