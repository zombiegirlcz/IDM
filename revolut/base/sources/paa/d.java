package paa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f234460a;

    public d(PixKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f234460a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f234460a, ((d) obj2).f234460a);
    }

    public final int hashCode() {
        return this.f234460a.hashCode();
    }
}
