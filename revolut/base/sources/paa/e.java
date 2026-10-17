package paa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f234461a;

    public e(PixKey pixKey) {
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        this.f234461a = pixKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234461a, ((e) obj2).f234461a);
    }

    public final int hashCode() {
        return this.f234461a.hashCode();
    }
}
