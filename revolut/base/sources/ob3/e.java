package ob3;

import kotlin.jvm.internal.Intrinsics;
import ns9.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wkm.l;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final db3.b f223870l;

    public e(db3.b barcodeScannedPushInterceptor) {
        Intrinsics.checkNotNullParameter(barcodeScannedPushInterceptor, "barcodeScannedPushInterceptor");
        this.f223870l = barcodeScannedPushInterceptor;
    }

    @Override // ob3.b
    public final l Z2() {
        return q.Q(((f) this.f223870l).f223871a, new h(null, this, 19));
    }
}
