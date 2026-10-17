package gbh;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f142260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f142261b;

    public /* synthetic */ c(int i, Instant instant, Instant instant2) {
        if (3 != (i & 3)) {
            j1.f(a.f142259a.getDescriptor(), i, 3);
            throw null;
        }
        this.f142260a = instant;
        this.f142261b = instant2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f142260a, cVar.f142260a) && Intrinsics.f(this.f142261b, cVar.f142261b);
    }

    public final int hashCode() {
        return this.f142261b.hashCode() + (this.f142260a.hashCode() * 31);
    }

    public c(Instant to6, Instant from) {
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(from, "from");
        this.f142260a = to6;
        this.f142261b = from;
    }
}
