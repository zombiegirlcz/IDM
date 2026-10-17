package q64;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242484a;

    public l() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f242484a, ((l) obj2).f242484a);
    }

    public final int hashCode() {
        return this.f242484a.hashCode();
    }

    public l(Data configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f242484a = configuration;
    }

    public /* synthetic */ l(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
