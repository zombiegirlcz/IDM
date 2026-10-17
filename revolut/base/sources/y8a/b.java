package y8a;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f311642a;

    public b(PixKey alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f311642a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f311642a, ((b) obj2).f311642a);
    }

    public final int hashCode() {
        return this.f311642a.hashCode();
    }
}
