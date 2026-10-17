package faa;

import com.revolut.feature.pix.api.model.PixKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f133269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixKey f133270b;

    public c(PixKey migratedKey, PixKey pixKey) {
        Intrinsics.checkNotNullParameter(migratedKey, "migratedKey");
        this.f133269a = migratedKey;
        this.f133270b = pixKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f133269a, cVar.f133269a) && Intrinsics.f(this.f133270b, cVar.f133270b);
    }

    public final int hashCode() {
        int iHashCode = this.f133269a.hashCode() * 31;
        PixKey pixKey = this.f133270b;
        return iHashCode + (pixKey == null ? 0 : pixKey.hashCode());
    }
}
