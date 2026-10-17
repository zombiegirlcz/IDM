package kaa;

import aii.m;
import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixKey f182452b;

    public a(PixKey pixKey) {
        Intrinsics.checkNotNullParameter(pixKey, "pixKey");
        this.f182452b = pixKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f182452b, ((a) obj2).f182452b);
    }

    public final int hashCode() {
        return this.f182452b.hashCode();
    }
}
