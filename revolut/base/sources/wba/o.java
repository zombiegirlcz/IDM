package wba;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrCodeDecodeData f296086a;

    public o(PixQrCodeDecodeData updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        this.f296086a = updated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f296086a, ((o) obj2).f296086a);
    }

    public final int hashCode() {
        return this.f296086a.hashCode();
    }
}
