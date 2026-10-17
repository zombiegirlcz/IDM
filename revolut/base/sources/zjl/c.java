package zjl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f322877a;

    public /* synthetic */ c(int i, Instant instant) {
        if (1 == (i & 1)) {
            this.f322877a = instant;
        } else {
            j1.f(a.f322876a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f322877a, ((c) obj2).f322877a);
    }

    public final int hashCode() {
        return this.f322877a.hashCode();
    }

    public c(Instant lastAccess) {
        Intrinsics.checkNotNullParameter(lastAccess, "lastAccess");
        this.f322877a = lastAccess;
    }
}
