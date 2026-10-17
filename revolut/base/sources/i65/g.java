package i65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z45.a f158863a;

    public g(z45.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f158863a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f158863a == ((g) obj2).f158863a;
    }

    public final int hashCode() {
        return this.f158863a.hashCode();
    }
}
