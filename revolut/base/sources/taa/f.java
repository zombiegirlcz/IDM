package taa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f269297a;

    public f(PixKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f269297a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f269297a, ((f) obj2).f269297a);
    }

    public final int hashCode() {
        return this.f269297a.hashCode();
    }
}
