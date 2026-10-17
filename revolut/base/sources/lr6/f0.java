package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f199402a;

    public f0(c cardProcessors) {
        Intrinsics.checkNotNullParameter(cardProcessors, "cardProcessors");
        this.f199402a = cardProcessors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && this.f199402a == ((f0) obj2).f199402a;
    }

    public final int hashCode() {
        return this.f199402a.hashCode();
    }
}
