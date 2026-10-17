package af4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f3864a;

    public h(Data configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f3864a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f3864a, ((h) obj2).f3864a);
    }

    public final int hashCode() {
        return this.f3864a.hashCode();
    }
}
