package ta1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f269085a;

    public g(e error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f269085a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f269085a == ((g) obj2).f269085a;
    }

    public final int hashCode() {
        return this.f269085a.hashCode();
    }
}
