package dl1;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115691a;

    public b(List supportedQRs) {
        Intrinsics.checkNotNullParameter(supportedQRs, "supportedQRs");
        this.f115691a = supportedQRs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115691a, ((b) obj2).f115691a);
    }

    public final int hashCode() {
        return this.f115691a.hashCode();
    }
}
