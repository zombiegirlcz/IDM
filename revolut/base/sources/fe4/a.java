package fe4;

import kotlin.jvm.internal.Intrinsics;
import wy3.q;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f134434a;

    public a(q configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f134434a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f134434a, ((a) obj2).f134434a);
    }

    public final int hashCode() {
        return this.f134434a.hashCode();
    }
}
