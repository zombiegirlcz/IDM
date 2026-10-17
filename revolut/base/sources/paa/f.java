package paa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f234462a;

    public f(PixKey pixKey) {
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        this.f234462a = pixKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f234462a, ((f) obj2).f234462a);
    }

    public final int hashCode() {
        return this.f234462a.hashCode();
    }
}
