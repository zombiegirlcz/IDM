package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f308937a;

    public o(y configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f308937a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f308937a, ((o) obj2).f308937a);
    }

    public final int hashCode() {
        return this.f308937a.hashCode();
    }
}
