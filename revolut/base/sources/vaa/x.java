package vaa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f287218a;

    public x(PixKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f287218a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f287218a, ((x) obj2).f287218a);
    }

    public final int hashCode() {
        return this.f287218a.hashCode();
    }
}
