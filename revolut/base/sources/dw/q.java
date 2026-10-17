package dw;

import com.revolut.camerakit.core.settings.WatermarkConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WatermarkConfig f118208b;

    public q(String nonce, WatermarkConfig config) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f118207a = nonce;
        this.f118208b = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f118207a, qVar.f118207a) && Intrinsics.f(this.f118208b, qVar.f118208b);
    }

    public final int hashCode() {
        return this.f118208b.hashCode() + (this.f118207a.hashCode() * 31);
    }
}
