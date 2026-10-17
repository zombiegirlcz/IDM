package i65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z45.a f158864a;

    public h(z45.a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f158864a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f158864a == ((h) obj2).f158864a;
    }

    public final int hashCode() {
        return this.f158864a.hashCode();
    }
}
