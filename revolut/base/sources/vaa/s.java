package vaa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f287213a;

    public s(PixKey pixKey) {
        this.f287213a = pixKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f287213a, ((s) obj2).f287213a);
    }

    public final int hashCode() {
        PixKey pixKey = this.f287213a;
        if (pixKey == null) {
            return 0;
        }
        return pixKey.hashCode();
    }
}
