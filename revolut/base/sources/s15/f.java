package s15;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f259085a;

    public f(Data configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f259085a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f259085a, ((f) obj2).f259085a);
    }

    public final int hashCode() {
        return this.f259085a.hashCode();
    }
}
