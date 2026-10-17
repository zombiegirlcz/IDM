package z92;

import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MBWaySdkError f320305a;

    public h(MBWaySdkError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f320305a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f320305a, ((h) obj2).f320305a);
    }

    public final int hashCode() {
        return this.f320305a.hashCode();
    }
}
