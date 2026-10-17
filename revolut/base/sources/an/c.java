package an;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cqi.f f6502a;

    public c(cqi.f configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f6502a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f6502a, ((c) obj2).f6502a);
    }

    public final int hashCode() {
        return this.f6502a.hashCode();
    }
}
