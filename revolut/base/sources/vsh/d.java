package vsh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291791a;

    public d(List entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f291791a = entries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f291791a, ((d) obj2).f291791a);
    }

    public final int hashCode() {
        return this.f291791a.hashCode();
    }
}
