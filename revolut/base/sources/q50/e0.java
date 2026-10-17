package q50;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f242219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f242220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242221c;

    public /* synthetic */ e0(int i, Instant instant, float f, String str) {
        if (7 != (i & 7)) {
            j1.f(c0.f242207a.getDescriptor(), i, 7);
            throw null;
        }
        this.f242219a = instant;
        this.f242220b = f;
        this.f242221c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f242219a, e0Var.f242219a) && Float.compare(this.f242220b, e0Var.f242220b) == 0 && Intrinsics.f(this.f242221c, e0Var.f242221c);
    }

    public final int hashCode() {
        return this.f242221c.hashCode() + m72.b.b(this.f242220b, this.f242219a.hashCode() * 31, 31);
    }
}
