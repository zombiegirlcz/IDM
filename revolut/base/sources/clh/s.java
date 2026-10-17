package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f25009a;

    public s(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f25009a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f25009a, ((s) obj2).f25009a);
    }

    public final int hashCode() {
        return this.f25009a.hashCode();
    }
}
