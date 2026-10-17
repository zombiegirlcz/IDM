package mjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.g f206045a;

    public c(kel.b holding) {
        Intrinsics.checkNotNullParameter(holding, "holding");
        this.f206045a = holding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f206045a, ((c) obj2).f206045a);
    }

    public final int hashCode() {
        return this.f206045a.hashCode();
    }
}
