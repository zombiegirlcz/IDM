package wi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f297865a;

    public c(g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f297865a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f297865a, ((c) obj2).f297865a);
    }

    public final int hashCode() {
        return this.f297865a.hashCode();
    }
}
