package w8a;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f295627a;

    public d(PixKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f295627a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f295627a, ((d) obj2).f295627a);
    }

    public final int hashCode() {
        return this.f295627a.hashCode();
    }
}
