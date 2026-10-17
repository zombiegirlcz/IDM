package ve4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f288113a;

    public e(Data configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f288113a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f288113a, ((e) obj2).f288113a);
    }

    public final int hashCode() {
        return this.f288113a.hashCode();
    }
}
