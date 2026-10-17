package qk1;

import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final APMPMError f246948a;

    public i(APMPMError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f246948a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f246948a, ((i) obj2).f246948a);
    }

    public final int hashCode() {
        return this.f246948a.hashCode();
    }
}
