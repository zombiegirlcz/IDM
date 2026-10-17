package oxd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f230773a;

    public g(Data methods) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f230773a = methods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f230773a, ((g) obj2).f230773a);
    }

    public final int hashCode() {
        return this.f230773a.hashCode();
    }
}
