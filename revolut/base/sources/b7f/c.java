package b7f;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f13035a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f13035a, ((c) obj2).f13035a);
    }

    public final int hashCode() {
        return this.f13035a.hashCode();
    }

    public c(Data riskMetrics) {
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        this.f13035a = riskMetrics;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
