package q0l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f241301a;

    public b(a promptType) {
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        this.f241301a = promptType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f241301a == ((b) obj2).f241301a;
    }

    public final int hashCode() {
        return this.f241301a.hashCode();
    }
}
